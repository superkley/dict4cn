/*  Copyright (c) 2010 Xiaoyun Zhu
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy  
 *  of this software and associated documentation files (the "Software"), to deal  
 *  in the Software without restriction, including without limitation the rights  
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
 *  copies of the Software, and to permit persons to whom the Software is  
 *  furnished to do so, subject to the following conditions:
 *  
 *  The above copyright notice and this permission notice shall be included in  
 *  all copies or substantial portions of the Software.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN  
 *  THE SOFTWARE.  
 */
package cn.kk.kkdict.types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import cn.kk.kkdict.utils.Helper;

// NOTICE: final version, do not change anything.
public enum Language implements KeyType<Language> {
  AA("aa", LanguageFamily.NONE),
  AAK("aak", LanguageFamily.NONE),
  AAO("aao", LanguageFamily.ARABIC),
  AB("ab", LanguageFamily.NONE),
  ABE("abe", LanguageFamily.NONE),
  ABH("abh", LanguageFamily.ARABIC),
  ABM("abm", LanguageFamily.NONE),
  ABQ("abq", LanguageFamily.NONE),
  ABS("abs", LanguageFamily.AUSTRONESIAN),
  ABV("abv", LanguageFamily.ARABIC),
  ACE("ace", LanguageFamily.NONE),
  ACH("ach", LanguageFamily.NONE),
  ACM("acm", LanguageFamily.ARABIC),
  ACU("acu", LanguageFamily.NONE),
  ACV("acv", LanguageFamily.NONE),
  ACW("acw", LanguageFamily.ARABIC),
  ACX("acx", LanguageFamily.ARABIC),
  ACY("acy", LanguageFamily.ARABIC),
  ADA("ada", LanguageFamily.NONE),
  ADE("ade", LanguageFamily.NONE),
  ADF("adf", LanguageFamily.ARABIC),
  ADJ("adj", LanguageFamily.NONE),
  ADT("adt", LanguageFamily.NONE),
  ADY("ady", LanguageFamily.NONE),
  AE("ae", LanguageFamily.NONE),
  AF("af", LanguageFamily.NONE),
  AGG("agg", LanguageFamily.NONE),
  AGJ("agj", LanguageFamily.NONE),
  AGT("agt", LanguageFamily.AUSTRONESIAN),
  AGV("agv", LanguageFamily.AUSTRONESIAN),
  AGX("agx", LanguageFamily.NONE),
  AGY("agy", LanguageFamily.AUSTRONESIAN),
  AGZ("agz", LanguageFamily.AUSTRONESIAN),
  AHH("ahh", LanguageFamily.NONE),
  AIB("aib", LanguageFamily.NONE),
  AII("aii", LanguageFamily.NONE),
  AIW("aiw", LanguageFamily.NONE),
  AJI("aji", LanguageFamily.NONE),
  AJP("ajp", LanguageFamily.ARABIC),
  AJT("ajt", LanguageFamily.ARABIC),
  AJU("aju", LanguageFamily.ARABIC),
  AK("ak", LanguageFamily.NONE),
  AKE("ake", LanguageFamily.NONE),
  AKK("akk", LanguageFamily.NONE),
  AKL("akl", LanguageFamily.AUSTRONESIAN),
  AKZ("akz", LanguageFamily.NONE),
  ALE("ale", LanguageFamily.NONE),
  ALI("ali", LanguageFamily.NONE),
  ALQ("alq", LanguageFamily.NONE),
  ALR("alr", LanguageFamily.NONE),
  ALS("als", LanguageFamily.NONE),
  ALU("alu", LanguageFamily.NONE),
  ALY("aly", LanguageFamily.NONE),
  AM("am", LanguageFamily.NONE),
  AMK("amk", LanguageFamily.NONE),
  AMN("amn", LanguageFamily.NONE),
  AN("an", LanguageFamily.NONE),
  AND("and", LanguageFamily.NONE),
  ANG("ang", LanguageFamily.NONE),
  ANI("ani", LanguageFamily.NONE),
  ANO("ano", LanguageFamily.NONE),
  AOA("aoa", LanguageFamily.NONE),
  APD("apd", LanguageFamily.ARABIC),
  APJ("apj", LanguageFamily.APACHE),
  APK("apk", LanguageFamily.APACHE),
  APL("apl", LanguageFamily.APACHE),
  APM("apm", LanguageFamily.APACHE),
  APW("apw", LanguageFamily.APACHE),
  APY("apy", LanguageFamily.NONE),
  AQC("aqc", LanguageFamily.NONE),
  AR("ar", LanguageFamily.ARABIC, 25),
  ARB("arb", LanguageFamily.ARABIC),
  ARC("arc", LanguageFamily.NONE),
  ARL("arl", LanguageFamily.NONE),
  ARN("arn", LanguageFamily.NONE),
  ARP("arp", LanguageFamily.NONE),
  ARQ("arq", LanguageFamily.ARABIC),
  ARS("ars", LanguageFamily.ARABIC),
  ARW("arw", LanguageFamily.NONE),
  ARY("ary", LanguageFamily.ARABIC),
  ARZ("arz", LanguageFamily.ARABIC),
  AS("as", LanguageFamily.NONE),
  ASE("ase", LanguageFamily.NONE),
  AST("ast", LanguageFamily.NONE),
  AUS_SYD("aus_syd", LanguageFamily.NONE),
  AUZ("auz", LanguageFamily.ARABIC),
  AV("av", LanguageFamily.NONE),
  AVL("avl", LanguageFamily.ARABIC),
  AWA("awa", LanguageFamily.NONE),
  AWK("awk", LanguageFamily.NONE),
  AWS("aws", LanguageFamily.AWYU),
  AWU("awu", LanguageFamily.AWYU),
  AWV("awv", LanguageFamily.AWYU),
  AWW("aww", LanguageFamily.AWYU),
  AWY("awy", LanguageFamily.AWYU),
  AY("ay", LanguageFamily.NONE),
  AYH("ayh", LanguageFamily.ARABIC),
  AYN("ayn", LanguageFamily.ARABIC),
  AYP("ayp", LanguageFamily.ARABIC),
  AZ("az", LanguageFamily.AZERI),
  AZG("azg", LanguageFamily.NONE),
  AZJ("azj", LanguageFamily.AZERI),
  AZR("azr", LanguageFamily.NONE),
  BA("ba", LanguageFamily.NONE),
  BAL("bal", LanguageFamily.NONE),
  BAN("ban", LanguageFamily.NONE),
  BAR("bar", LanguageFamily.NONE),
  BAT_SMG("bat_smg", LanguageFamily.NONE),
  BCL("bcl", LanguageFamily.NONE),
  BE("be", LanguageFamily.NONE),
  BEJ("bej", LanguageFamily.NONE),
  BEM("bem", LanguageFamily.NONE),
  BEW("bew", LanguageFamily.NONE),
  BE_X_OLD("be_x_old", LanguageFamily.NONE),
  BG("bg", LanguageFamily.NONE, 34),
  BH("bh", LanguageFamily.NONE),
  BHO("bho", LanguageFamily.NONE),
  BI("bi", LanguageFamily.NONE),
  BIK("bik", LanguageFamily.NONE),
  BJN("bjn", LanguageFamily.NONE),
  BLA("bla", LanguageFamily.NONE),
  BM("bm", LanguageFamily.NONE),
  BN("bn", LanguageFamily.NONE),
  BO("bo", LanguageFamily.NONE),
  BPY("bpy", LanguageFamily.NONE),
  BR("br", LanguageFamily.NONE),
  BS("bs", LanguageFamily.NONE),
  BUG("bug", LanguageFamily.NONE),
  BXR("bxr", LanguageFamily.NONE),
  CA("ca", LanguageFamily.NONE, 16),
  CAD("cad", LanguageFamily.NONE),
  CBK_ZAM("cbk_zam", LanguageFamily.NONE),
  CDO("cdo", LanguageFamily.CHINESE),
  CE("ce", LanguageFamily.NONE),
  CEB("ceb", LanguageFamily.NONE),
  CH("ch", LanguageFamily.NONE),
  CHC("chc", LanguageFamily.NONE),
  CHG("chg", LanguageFamily.NONE),
  CHH("chh", LanguageFamily.NONE),
  CHN("chn", LanguageFamily.NONE),
  CHO("cho", LanguageFamily.NONE),
  CHR("chr", LanguageFamily.NONE),
  CHY("chy", LanguageFamily.NONE),
  CIC("cic", LanguageFamily.NONE),
  CJY("cjy", LanguageFamily.CHINESE),
  CKB("ckb", LanguageFamily.NONE),
  CKC("ckc", LanguageFamily.CAKCHIQUEL),
  CKD("ckd", LanguageFamily.CAKCHIQUEL),
  CKE("cke", LanguageFamily.CAKCHIQUEL),
  CKF("ckf", LanguageFamily.CAKCHIQUEL),
  CKI("cki", LanguageFamily.CAKCHIQUEL),
  CKJ("ckj", LanguageFamily.CAKCHIQUEL),
  CKK("ckk", LanguageFamily.CAKCHIQUEL),
  CKU("cku", LanguageFamily.NONE),
  CLM("clm", LanguageFamily.SALISHAN),
  CMN("cmn", LanguageFamily.CHINESE),
  CO("co", LanguageFamily.NONE),
  COC("coc", LanguageFamily.NONE),
  COM("com", LanguageFamily.NONE),
  CPG("cpg", LanguageFamily.NONE),
  CPX("cpx", LanguageFamily.CHINESE),
  CR("cr", LanguageFamily.CREE),
  CRH("crh", LanguageFamily.NONE),
  CRJ("crj", LanguageFamily.CREE),
  CRK("crk", LanguageFamily.CREE),
  CRL("crl", LanguageFamily.CREE),
  CRM("crm", LanguageFamily.CREE),
  CS("cs", LanguageFamily.NONE, 19),
  CSB("csb", LanguageFamily.NONE),
  CSW("csw", LanguageFamily.CREE),
  CU("cu", LanguageFamily.NONE),
  CV("cv", LanguageFamily.NONE),
  CWD("cwd", LanguageFamily.CREE),
  CY("cy", LanguageFamily.NONE),
  CZH("czh", LanguageFamily.CHINESE),
  CZO("czo", LanguageFamily.CHINESE),
  DA("da", LanguageFamily.NONE, 26),
  DAK("dak", LanguageFamily.NONE),
  DAR("dar", LanguageFamily.NONE),
  DE("de", LanguageFamily.NONE, 3),
  DIN("din", LanguageFamily.NONE),
  DIQ("diq", LanguageFamily.NONE),
  DLM("dlm", LanguageFamily.NONE),
  DNG("dng", LanguageFamily.SINO_TIBETAN),
  DSB("dsb", LanguageFamily.NONE),
  DUA("dua", LanguageFamily.NONE),
  DUL("dul", LanguageFamily.NONE),
  DV("dv", LanguageFamily.NONE),
  DZ("dz", LanguageFamily.NONE),
  EE("ee", LanguageFamily.NONE),
  EFI("efi", LanguageFamily.NONE),
  EL("el", LanguageFamily.NONE),
  EML("eml", LanguageFamily.NONE),
  EMS("ems", LanguageFamily.NONE),
  EN("en", LanguageFamily.NONE, 2),
  ENM("enm", LanguageFamily.NONE),
  EO("eo", LanguageFamily.NONE, 27),
  ES("es", LanguageFamily.NONE, 9),
  ET("et", LanguageFamily.NONE),
  ETT("ett", LanguageFamily.NONE),
  EU("eu", LanguageFamily.NONE, 36),
  EVN("evn", LanguageFamily.NONE),
  EXT("ext", LanguageFamily.NONE),
  FA("fa", LanguageFamily.INDO_EUROPEAN, 24),
  FAN("fan", LanguageFamily.NONE),
  FF("ff", LanguageFamily.NONE),
  FFM("ffm", LanguageFamily.NIGER_CONGO),
  FI("fi", LanguageFamily.URALIC, 18),
  FIL("fil", LanguageFamily.AUSTRONESIAN),
  FIT("fit", LanguageFamily.URALIC),
  FIU_VRO("fiu_vro", LanguageFamily.NONE),
  FJ("fj", LanguageFamily.NONE),
  FKV("fkv", LanguageFamily.URALIC),
  FO("fo", LanguageFamily.INDO_EUROPEAN),
  FOS("fos", LanguageFamily.AUSTRONESIAN),
  FR("fr", LanguageFamily.INDO_EUROPEAN, 4),
  FRC("frc", LanguageFamily.INDO_EUROPEAN),
  FRK("frk", LanguageFamily.INDO_EUROPEAN),
  FRM("frm", LanguageFamily.INDO_EUROPEAN),
  FRO("fro", LanguageFamily.INDO_EUROPEAN),
  FRP("frp", LanguageFamily.INDO_EUROPEAN),
  FRR("frr", LanguageFamily.INDO_EUROPEAN),
  FRS("frs", LanguageFamily.INDO_EUROPEAN),
  FUB("fub", LanguageFamily.NIGER_CONGO),
  FUE("fue", LanguageFamily.NIGER_CONGO),
  FUH("fuh", LanguageFamily.NIGER_CONGO),
  FUI("fui", LanguageFamily.NIGER_CONGO),
  FUQ("fuq", LanguageFamily.NIGER_CONGO),
  FUR("fur", LanguageFamily.INDO_EUROPEAN),
  FUV("fuv", LanguageFamily.NIGER_CONGO),
  FY("fy", LanguageFamily.INDO_EUROPEAN),
  GA("ga", LanguageFamily.NONE),
  GAA("gaa", LanguageFamily.NONE),
  GAG("gag", LanguageFamily.TURKIC),
  GAN("gan", LanguageFamily.CHINESE),
  GAY("gay", LanguageFamily.NONE),
  GD("gd", LanguageFamily.NONE),
  GIL("gil", LanguageFamily.NONE),
  GL("gl", LanguageFamily.NONE),
  GLK("glk", LanguageFamily.NONE),
  GMH("gmh", LanguageFamily.NONE),
  GML("gml", LanguageFamily.NONE),
  GN("gn", LanguageFamily.NONE),
  GNI("gni", LanguageFamily.NONE),
  GOH("goh", LanguageFamily.NONE),
  GOT("got", LanguageFamily.NONE),
  GRC("grc", LanguageFamily.NONE),
  GSW("gsw", LanguageFamily.GERMAN),
  GU("gu", LanguageFamily.NONE),
  GUL("gul", LanguageFamily.NONE),
  GUN("gun", LanguageFamily.NONE),
  GV("gv", LanguageFamily.NONE),
  GWC("gwc", LanguageFamily.NONE),
  GWI("gwi", LanguageFamily.NONE),
  HA("ha", LanguageFamily.NONE),
  HAI("hai", LanguageFamily.NONE),
  HAK("hak", LanguageFamily.CHINESE),
  HAW("haw", LanguageFamily.NONE),
  HE("he", LanguageFamily.NONE, 33),
  HI("hi", LanguageFamily.NONE, 40),
  HIF("hif", LanguageFamily.NONE),
  HIT("hit", LanguageFamily.NONE),
  HLU("hlu", LanguageFamily.NONE),
  HMC("hmc", LanguageFamily.HMONG),
  HMD("hmd", LanguageFamily.HMONG),
  HME("hme", LanguageFamily.HMONG),
  HMF("hmf", LanguageFamily.HMONG),
  HMG("hmg", LanguageFamily.HMONG),
  HMH("hmh", LanguageFamily.HMONG),
  HMI("hmi", LanguageFamily.HMONG),
  HMJ("hmj", LanguageFamily.HMONG),
  HML("hml", LanguageFamily.HMONG),
  HMN("hmn", LanguageFamily.HMONG),
  HMP("hmp", LanguageFamily.HMONG),
  HMQ("hmq", LanguageFamily.HMONG),
  HMS("hms", LanguageFamily.HMONG),
  HMU("hmu", LanguageFamily.HMONG),
  HMV("hmv", LanguageFamily.HMONG),
  HMW("hmw", LanguageFamily.HMONG),
  HMY("hmy", LanguageFamily.HMONG),
  HMZ("hmz", LanguageFamily.HMONG),
  HO("ho", LanguageFamily.NONE),
  HR("hr", LanguageFamily.NONE, 39),
  HSB("hsb", LanguageFamily.NONE),
  HSN("hsn", LanguageFamily.CHINESE),
  HT("ht", LanguageFamily.NONE),
  HU("hu", LanguageFamily.NONE, 20),
  HY("hy", LanguageFamily.NONE),
  HZ("hz", LanguageFamily.NONE),
  IA("ia", LanguageFamily.NONE),
  ID("id", LanguageFamily.NONE, 21),
  IE("ie", LanguageFamily.NONE),
  IG("ig", LanguageFamily.NONE),
  II("ii", LanguageFamily.NONE),
  IK("ik", LanguageFamily.NONE),
  IKE("ike", LanguageFamily.INUKTITUT),
  IKT("ikt", LanguageFamily.INUKTITUT),
  ILO("ilo", LanguageFamily.NONE),
  INE_PRO("ine_pro", LanguageFamily.NONE),
  INH("inh", LanguageFamily.NONE),
  IO("io", LanguageFamily.NONE),
  IS("is", LanguageFamily.NONE),
  IT("it", LanguageFamily.NONE, 5),
  IU("iu", LanguageFamily.INUKTITUT),
  IW("iw", LanguageFamily.NONE),
  JA("ja", LanguageFamily.NONE, 6),
  JAM("jam", LanguageFamily.NONE),
  JBO("jbo", LanguageFamily.NONE),
  JV("jv", LanguageFamily.NONE),
  JYE("jye", LanguageFamily.ARABIC),
  KA("ka", LanguageFamily.NONE),
  KAA("kaa", LanguageFamily.NONE),
  KAB("kab", LanguageFamily.NONE),
  KBD("kbd", LanguageFamily.NONE),
  KCN("kcn", LanguageFamily.NONE),
  KFL("kfl", LanguageFamily.NONE),
  KG("kg", LanguageFamily.NONE),
  KI("ki", LanguageFamily.NONE),
  KJ("kj", LanguageFamily.NONE),
  KJU("kju", LanguageFamily.NONE),
  KK("kk", LanguageFamily.NONE, 35),
  KKY("kky", LanguageFamily.NONE),
  KL("kl", LanguageFamily.NONE),
  KM("km", LanguageFamily.NONE),
  KN("kn", LanguageFamily.NONE),
  KO("ko", LanguageFamily.NONE, 7),
  KOI("koi", LanguageFamily.NONE),
  KOK("kok", LanguageFamily.NONE),
  KPY("kpy", LanguageFamily.NONE),
  KR("kr", LanguageFamily.NONE),
  KRC("krc", LanguageFamily.NONE),
  KRI("kri", LanguageFamily.NONE),
  KRL("krl", LanguageFamily.NONE),
  KS("ks", LanguageFamily.NONE),
  KSH("ksh", LanguageFamily.NONE),
  KU("ku", LanguageFamily.NONE),
  KUD("kud", LanguageFamily.NONE),
  KV("kv", LanguageFamily.NONE),
  KW("kw", LanguageFamily.NONE),
  KY("ky", LanguageFamily.NONE),
  LA("la", LanguageFamily.NONE, 41),
  LAD("lad", LanguageFamily.NONE),
  LB("lb", LanguageFamily.NONE),
  LBE("lbe", LanguageFamily.NONE),
  LG("lg", LanguageFamily.NONE),
  LI("li", LanguageFamily.NONE),
  LIJ("lij", LanguageFamily.NONE),
  LIV("liv", LanguageFamily.NONE),
  LKT("lkt", LanguageFamily.NONE),
  LLD("lld", LanguageFamily.NONE),
  LMO("lmo", LanguageFamily.NONE),
  LN("ln", LanguageFamily.NONE),
  LO("lo", LanguageFamily.NONE),
  LSY("lsy", LanguageFamily.NONE),
  LT("lt", LanguageFamily.NONE, 29),
  LTC("ltc", LanguageFamily.CHINESE),
  LTG("ltg", LanguageFamily.NONE),
  LV("lv", LanguageFamily.NONE),
  LZH("lzh", LanguageFamily.CHINESE),
  MAD("mad", LanguageFamily.NONE),
  MAP_BMS("map_bms", LanguageFamily.NONE),
  MDF("mdf", LanguageFamily.NONE),
  MFE("mfe", LanguageFamily.NONE),
  MG("mg", LanguageFamily.NONE),
  MH("mh", LanguageFamily.NONE),
  MHR("mhr", LanguageFamily.NONE),
  MI("mi", LanguageFamily.NONE),
  MIN("min", LanguageFamily.NONE),
  MIQ("miq", LanguageFamily.NONE),
  MK("mk", LanguageFamily.NONE),
  ML("ml", LanguageFamily.NONE),
  MN("mn", LanguageFamily.NONE),
  MNC("mnc", LanguageFamily.NONE),
  MNP("mnp", LanguageFamily.CHINESE),
  MO("mo", LanguageFamily.NONE),
  MOH("moh", LanguageFamily.NONE),
  MR("mr", LanguageFamily.NONE),
  MRC("mrc", LanguageFamily.NONE),
  MRJ("mrj", LanguageFamily.NONE),
  MRV("mrv", LanguageFamily.NONE),
  MS("ms", LanguageFamily.NONE, 32),
  MSD("msd", LanguageFamily.NONE),
  MT("mt", LanguageFamily.NONE),
  MUS("mus", LanguageFamily.NONE),
  MWF("mwf", LanguageFamily.NONE),
  MWL("mwl", LanguageFamily.NONE),
  MWP("mwp", LanguageFamily.NONE),
  MY("my", LanguageFamily.NONE),
  MYP("myp", LanguageFamily.NONE),
  MYV("myv", LanguageFamily.NONE),
  MZN("mzn", LanguageFamily.NONE),
  NA("na", LanguageFamily.NONE),
  NAH("nah", LanguageFamily.NONE),
  NAN("nan", LanguageFamily.CHINESE),
  NAP("nap", LanguageFamily.NONE),
  NAQ("naq", LanguageFamily.NONE),
  NB("nb", LanguageFamily.NORSK_BOKMÅL),
  NDS("nds", LanguageFamily.NONE),
  NDS_NL("nds_nl", LanguageFamily.NONE),
  NE("ne", LanguageFamily.NONE),
  NEW("new", LanguageFamily.NONE),
  NG("ng", LanguageFamily.NONE),
  NJB("njb", LanguageFamily.NAGA),
  NJH("njh", LanguageFamily.NAGA),
  NJM("njm", LanguageFamily.NAGA),
  NJN("njn", LanguageFamily.NAGA),
  NJO("njo", LanguageFamily.NAGA),
  NL("nl", LanguageFamily.NONE, 12),
  NMN("nmn", LanguageFamily.NONE),
  NN("nn", LanguageFamily.NONE),
  NO("no", LanguageFamily.NONE, 17),
  NON("non", LanguageFamily.NONE),
  NOV("nov", LanguageFamily.NONE),
  NRM("nrm", LanguageFamily.NONE),
  NRN("nrn", LanguageFamily.NONE),
  NSO("nso", LanguageFamily.NONE),
  NV("nv", LanguageFamily.NONE),
  NY("ny", LanguageFamily.NONE),
  OC("oc", LanguageFamily.NONE),
  OCH("och", LanguageFamily.CHINESE),
  ODT("odt", LanguageFamily.NONE),
  OFS("ofs", LanguageFamily.FRIESISCH),
  OJ("oj", LanguageFamily.NONE),
  OM("om", LanguageFamily.NONE),
  OOD("ood", LanguageFamily.NONE),
  OR("or", LanguageFamily.NONE),
  OS("os", LanguageFamily.NONE),
  OSC("osc", LanguageFamily.NONE),
  OSX("osx", LanguageFamily.NONE),
  PA("pa", LanguageFamily.NONE),
  PAG("pag", LanguageFamily.NONE),
  PAM("pam", LanguageFamily.NONE),
  PAP("pap", LanguageFamily.NONE),
  PAU("pau", LanguageFamily.NONE),
  PCD("pcd", LanguageFamily.NONE),
  PDC("pdc", LanguageFamily.NONE),
  PFL("pfl", LanguageFamily.NONE),
  PHN("phn", LanguageFamily.NONE),
  PI("pi", LanguageFamily.NONE),
  PIH("pih", LanguageFamily.NONE),
  PJT("pjt", LanguageFamily.NONE),
  PL("pl", LanguageFamily.INDO_EUROPEAN, 10),
  PMS("pms", LanguageFamily.NONE),
  PNB("pnb", LanguageFamily.NONE),
  PNT("pnt", LanguageFamily.NONE),
  PRG("prg", LanguageFamily.NONE),
  PRO("pro", LanguageFamily.NONE),
  PRP("prp", LanguageFamily.NONE),
  PRS("prs", LanguageFamily.NONE),
  PS("ps", LanguageFamily.NONE),
  PT("pt", LanguageFamily.NONE, 11),
  QU("qu", LanguageFamily.QUECHUA),
  QUB("qub", LanguageFamily.QUECHUA),
  QUC("quc", LanguageFamily.QUICHÉ),
  QUD("qud", LanguageFamily.QUICHUA),
  QUF("quf", LanguageFamily.QUECHUA),
  QUG("qug", LanguageFamily.QUICHUA),
  QUH("quh", LanguageFamily.QUECHUA),
  QUJ("quj", LanguageFamily.QUICHÉ),
  QUK("quk", LanguageFamily.QUECHUA),
  QUL("qul", LanguageFamily.QUECHUA),
  QUP("qup", LanguageFamily.QUECHUA),
  QUR("qur", LanguageFamily.QUECHUA),
  QUS("qus", LanguageFamily.QUICHUA),
  QUT("qut", LanguageFamily.QUICHÉ),
  QUU("quu", LanguageFamily.QUICHÉ),
  QUW("quw", LanguageFamily.QUICHUA),
  QUX("qux", LanguageFamily.QUECHUA),
  QUY("quy", LanguageFamily.QUECHUA),
  QUZ("quz", LanguageFamily.QUECHUA),
  QVA("qva", LanguageFamily.QUECHUA),
  QVC("qvc", LanguageFamily.QUECHUA),
  QVE("qve", LanguageFamily.QUECHUA),
  QVH("qvh", LanguageFamily.QUECHUA),
  QVI("qvi", LanguageFamily.QUICHUA),
  QVJ("qvj", LanguageFamily.QUICHUA),
  QVL("qvl", LanguageFamily.QUECHUA),
  QVM("qvm", LanguageFamily.QUECHUA),
  QVN("qvn", LanguageFamily.QUECHUA),
  QVO("qvo", LanguageFamily.QUECHUA),
  QVP("qvp", LanguageFamily.QUECHUA),
  QVS("qvs", LanguageFamily.QUECHUA),
  QVW("qvw", LanguageFamily.QUECHUA),
  QVZ("qvz", LanguageFamily.QUICHUA),
  QWA("qwa", LanguageFamily.QUECHUA),
  QWC("qwc", LanguageFamily.QUECHUA),
  QWH("qwh", LanguageFamily.QUECHUA),
  QWS("qws", LanguageFamily.QUECHUA),
  QXA("qxa", LanguageFamily.QUECHUA),
  QXC("qxc", LanguageFamily.QUECHUA),
  QXH("qxh", LanguageFamily.QUECHUA),
  QXI("qxi", LanguageFamily.QUICHÉ),
  QXL("qxl", LanguageFamily.QUICHUA),
  QXN("qxn", LanguageFamily.QUECHUA),
  QXO("qxo", LanguageFamily.QUECHUA),
  QXP("qxp", LanguageFamily.QUECHUA),
  QXR("qxr", LanguageFamily.QUICHUA),
  QXT("qxt", LanguageFamily.QUECHUA),
  QXU("qxu", LanguageFamily.QUECHUA),
  QXW("qxw", LanguageFamily.QUECHUA),
  RAR("rar", LanguageFamily.NONE),
  RHG("rhg", LanguageFamily.NONE),
  RM("rm", LanguageFamily.NONE),
  RME("rme", LanguageFamily.NONE),
  RMN("rmn", LanguageFamily.NONE),
  RMY("rmy", LanguageFamily.NONE),
  RN("rn", LanguageFamily.NONE),
  RO("ro", LanguageFamily.NONE, 23),
  ROA_JER("roa_jer", LanguageFamily.NONE),
  ROA_RUP("roa_rup", LanguageFamily.NONE),
  ROA_TARA("roa_tara", LanguageFamily.NONE),
  RU("ru", LanguageFamily.NONE, 8),
  RUE("rue", LanguageFamily.NONE),
  RUO("ruo", LanguageFamily.NONE),
  RUP("rup", LanguageFamily.NONE),
  RUQ("ruq", LanguageFamily.NONE),
  RW("rw", LanguageFamily.NONE),
  RYU("ryu", LanguageFamily.NONE),
  SA("sa", LanguageFamily.NONE),
  SAH("sah", LanguageFamily.NONE),
  SAS("sas", LanguageFamily.NONE),
  SC("sc", LanguageFamily.NONE),
  SCN("scn", LanguageFamily.NONE),
  SCO("sco", LanguageFamily.NONE),
  SD("sd", LanguageFamily.NONE),
  SE("se", LanguageFamily.NONE),
  SEI("sei", LanguageFamily.NONE),
  SEM_AMM("sem_amm", LanguageFamily.NONE),
  SG("sg", LanguageFamily.NONE),
  SGA("sga", LanguageFamily.NONE),
  SH("sh", LanguageFamily.NONE),
  SHH("shh", LanguageFamily.NONE),
  SHU("shu", LanguageFamily.ARABIC),
  SI("si", LanguageFamily.NONE),
  SIA("sia", LanguageFamily.NONE),
  SIM("sim", LanguageFamily.NONE),
  SIMPLE("simple", LanguageFamily.NONE),
  SJD("sjd", LanguageFamily.NONE),
  SJE("sje", LanguageFamily.NONE),
  SJK("sjk", LanguageFamily.NONE),
  SJT("sjt", LanguageFamily.NONE),
  SJU("sju", LanguageFamily.NONE),
  SK("sk", LanguageFamily.NONE, 30),
  SL("sl", LanguageFamily.NONE, 31),
  SM("sm", LanguageFamily.NONE),
  SMA("sma", LanguageFamily.NONE),
  SMJ("smj", LanguageFamily.NONE),
  SMN("smn", LanguageFamily.NONE),
  SMS("sms", LanguageFamily.NONE),
  SN("sn", LanguageFamily.NONE),
  SO("so", LanguageFamily.NONE),
  SOG("sog", LanguageFamily.NONE),
  SQ("sq", LanguageFamily.NONE),
  SR("sr", LanguageFamily.NONE, 28),
  SRN("srn", LanguageFamily.NONE),
  SS("ss", LanguageFamily.NONE),
  ST("st", LanguageFamily.NONE),
  STQ("stq", LanguageFamily.NONE),
  SU("su", LanguageFamily.NONE),
  SUL("sul", LanguageFamily.NONE),
  SUX("sux", LanguageFamily.NONE),
  SV("sv", LanguageFamily.NONE, 13),
  SVA("sva", LanguageFamily.NONE),
  SW("sw", LanguageFamily.NONE),
  SYR("syr", LanguageFamily.NONE),
  SZL("szl", LanguageFamily.NONE),
  TA("ta", LanguageFamily.NONE),
  TAY("tay", LanguageFamily.NONE),
  TCS("tcs", LanguageFamily.NONE),
  TE("te", LanguageFamily.NONE),
  TET("tet", LanguageFamily.NONE),
  TFN("tfn", LanguageFamily.NONE),
  TG("tg", LanguageFamily.NONE),
  TH("th", LanguageFamily.NONE),
  TI("ti", LanguageFamily.NONE),
  TK("tk", LanguageFamily.NONE),
  TKL("tkl", LanguageFamily.NONE),
  TL("tl", LanguageFamily.AUSTRONESIAN),
  TLI("tli", LanguageFamily.NONE),
  TN("tn", LanguageFamily.NONE),
  TO("to", LanguageFamily.NONE),
  TOKI("toki", LanguageFamily.NONE),
  TPI("tpi", LanguageFamily.NONE),
  TPN("tpn", LanguageFamily.NONE),
  TR("tr", LanguageFamily.NONE, 22),
  TS("ts", LanguageFamily.NONE),
  TSG("tsg", LanguageFamily.NONE),
  TT("tt", LanguageFamily.NONE),
  TUM("tum", LanguageFamily.NONE),
  TVL("tvl", LanguageFamily.NONE),
  TW("tw", LanguageFamily.NONE),
  TXB("txb", LanguageFamily.NONE),
  TY("ty", LanguageFamily.NONE),
  UDM("udm", LanguageFamily.NONE),
  UG("ug", LanguageFamily.NONE),
  UK("uk", LanguageFamily.NONE, 14),
  UR("ur", LanguageFamily.NONE),
  UZ("uz", LanguageFamily.NONE),
  VAI("vai", LanguageFamily.NONE),
  VE("ve", LanguageFamily.NONE),
  VEC("vec", LanguageFamily.NONE),
  VEP("vep", LanguageFamily.NONE),
  VI("vi", LanguageFamily.AUSTRO_ASIATIC, 15),
  VLS("vls", LanguageFamily.NONE),
  VO("vo", LanguageFamily.NONE, 37),
  VRO("vro", LanguageFamily.NONE),
  WA("wa", LanguageFamily.NONE),
  WAM("wam", LanguageFamily.NONE),
  WAR("war", LanguageFamily.NONE, 38),
  WBP("wbp", LanguageFamily.NONE),
  WIM("wim", LanguageFamily.NONE),
  WO("wo", LanguageFamily.NONE),
  WUU("wuu", LanguageFamily.CHINESE),
  XAA("xaa", LanguageFamily.NONE),
  XAL("xal", LanguageFamily.NONE),
  XAQ("xaq", LanguageFamily.NONE),
  XCG("xcg", LanguageFamily.NONE),
  XDC("xdc", LanguageFamily.NONE),
  XFA("xfa", LanguageFamily.NONE),
  XH("xh", LanguageFamily.NONE),
  XLC("xlc", LanguageFamily.NONE),
  XLD("xld", LanguageFamily.NONE),
  XLE("xle", LanguageFamily.NONE),
  XMF("xmf", LanguageFamily.NONE),
  XMK("xmk", LanguageFamily.NONE),
  XNO("xno", LanguageFamily.NONE),
  XPG("xpg", LanguageFamily.NONE),
  XPI("xpi", LanguageFamily.NONE),
  XRN("xrn", LanguageFamily.NONE),
  XSS("xss", LanguageFamily.NONE),
  XTA("xta", LanguageFamily.NONE),
  XTO("xto", LanguageFamily.NONE),
  XUM("xum", LanguageFamily.NONE),
  XVO("xvo", LanguageFamily.NONE),
  YHD("yhd", LanguageFamily.ARABIC),
  YI("yi", LanguageFamily.NONE),
  YIJ("yij", LanguageFamily.NONE),
  YO("yo", LanguageFamily.NONE),
  YUE("yue", LanguageFamily.CHINESE),
  ZA("za", LanguageFamily.NONE),
  ZAA("zaa", LanguageFamily.ZAPOTEC),
  ZAB("zab", LanguageFamily.ZAPOTEC),
  ZAC("zac", LanguageFamily.ZAPOTEC),
  ZAD("zad", LanguageFamily.ZAPOTEC),
  ZAE("zae", LanguageFamily.ZAPOTEC),
  ZAF("zaf", LanguageFamily.ZAPOTEC),
  ZAI("zai", LanguageFamily.ZAPOTEC),
  ZAM("zam", LanguageFamily.ZAPOTEC),
  ZAO("zao", LanguageFamily.ZAPOTEC),
  ZAP("zap", LanguageFamily.ZAPOTEC),
  ZAQ("zaq", LanguageFamily.ZAPOTEC),
  ZAR("zar", LanguageFamily.ZAPOTEC),
  ZAS("zas", LanguageFamily.ZAPOTEC),
  ZAT("zat", LanguageFamily.ZAPOTEC),
  ZAV("zav", LanguageFamily.ZAPOTEC),
  ZAW("zaw", LanguageFamily.ZAPOTEC),
  ZAX("zax", LanguageFamily.ZAPOTEC),
  ZCA("zca", LanguageFamily.ZAPOTEC),
  ZEA("zea", LanguageFamily.NONE),
  ZH("zh", LanguageFamily.CHINESE, 1),
  ZH_CLASSICAL("zh_classical", LanguageFamily.CHINESE),
  ZH_MIN_NAN("zh_min_nan", LanguageFamily.CHINESE),
  ZH_YUE("zh_yue", LanguageFamily.CHINESE),
  ZKU("zku", LanguageFamily.NONE),
  ZOO("zoo", LanguageFamily.ZAPOTEC),
  ZPA("zpa", LanguageFamily.ZAPOTEC),
  ZPB("zpb", LanguageFamily.ZAPOTEC),
  ZPC("zpc", LanguageFamily.ZAPOTEC),
  ZPD("zpd", LanguageFamily.ZAPOTEC),
  ZPE("zpe", LanguageFamily.ZAPOTEC),
  ZPF("zpf", LanguageFamily.ZAPOTEC),
  ZPG("zpg", LanguageFamily.ZAPOTEC),
  ZPH("zph", LanguageFamily.ZAPOTEC),
  ZPI("zpi", LanguageFamily.ZAPOTEC),
  ZPJ("zpj", LanguageFamily.ZAPOTEC),
  ZPK("zpk", LanguageFamily.ZAPOTEC),
  ZPL("zpl", LanguageFamily.ZAPOTEC),
  ZPM("zpm", LanguageFamily.ZAPOTEC),
  ZPN("zpn", LanguageFamily.ZAPOTEC),
  ZPO("zpo", LanguageFamily.ZAPOTEC),
  ZPP("zpp", LanguageFamily.ZAPOTEC),
  ZPQ("zpq", LanguageFamily.ZAPOTEC),
  ZPR("zpr", LanguageFamily.ZAPOTEC),
  ZPS("zps", LanguageFamily.ZAPOTEC),
  ZPT("zpt", LanguageFamily.ZAPOTEC),
  ZPU("zpu", LanguageFamily.ZAPOTEC),
  ZPV("zpv", LanguageFamily.ZAPOTEC),
  ZPW("zpw", LanguageFamily.ZAPOTEC),
  ZPX("zpx", LanguageFamily.ZAPOTEC),
  ZPY("zpy", LanguageFamily.ZAPOTEC),
  ZPZ("zpz", LanguageFamily.ZAPOTEC),
  ZQE("zqe", LanguageFamily.ZAPOTEC),
  ZRO("zro", LanguageFamily.NONE),
  ZSR("zsr", LanguageFamily.ZAPOTEC),
  ZTE("zte", LanguageFamily.ZAPOTEC),
  ZTG("ztg", LanguageFamily.ZAPOTEC),
  ZTL("ztl", LanguageFamily.ZAPOTEC),
  ZTM("ztm", LanguageFamily.ZAPOTEC),
  ZTN("ztn", LanguageFamily.ZAPOTEC),
  ZTP("ztp", LanguageFamily.ZAPOTEC),
  ZTQ("ztq", LanguageFamily.ZAPOTEC),
  ZTS("zts", LanguageFamily.ZAPOTEC),
  ZTT("ztt", LanguageFamily.ZAPOTEC),
  ZTU("ztu", LanguageFamily.ZAPOTEC),
  ZTX("ztx", LanguageFamily.ZAPOTEC),
  ZTY("zty", LanguageFamily.ZAPOTEC),
  ZU("zu", LanguageFamily.NONE),
  ZUN("zun", LanguageFamily.NONE),
  ZWA("zwa", LanguageFamily.NONE),
  ZZA("zza", LanguageFamily.NONE), ;

  public static final String                 TYPE_ID = "语";

  private int                                id;

  private final String                       key;

  private final byte[]                       keyBytes;

  public final LanguageFamily                family;

  private static final Map<String, Language> KEYS_MAP;

  private static final Language[]            VALUES;
  static {
    List<Language> values = new ArrayList<>(Arrays.asList(Language.values()));
    Collections.sort(values, new KeyTypeComparator<Language>());
    VALUES = new Language[values.size()];
    KEYS_MAP = new TreeMap<>();
    int i = 0;
    for (Language c : values) {
      Language.KEYS_MAP.put(c.key, c);
      Language.VALUES[i++] = c;
      c.id = i + 1;
    }
  }

  public static final Language fromId(final int id) {
    return Language.VALUES[id - 1];
  }

  public static final Language fromKey(final String key) {
    return Language.KEYS_MAP.get(key.replace('-', '_'));
  }

  Language(final String key, final LanguageFamily family) {
    this(key, family, -1);
  }

  Language(final String key, final LanguageFamily family, final int id) {
    this.id = id;
    this.key = key;
    this.family = family;
    this.keyBytes = key.getBytes(Helper.CHARSET_UTF8);
  }

  public static void main(String[] args) {
    List<Language> lngs = Arrays.asList(Language.values());
    Collections.sort(lngs, new Comparator<Language>() {
      @Override
      public int compare(Language o1, Language o2) {
        return o1.id - o2.id;
      }
    });

    for (Language lng : lngs) {
      if (lng.id > 0) {
        System.out.println(lng.id + "=" + lng.key);
      }
    }

    for (Language lng : Language.VALUES) {
      System.out.println(lng.id + "=" + lng.key);
    }
  }

  @Override
  public int getId() {
    return this.id;
  }

  @Override
  public String getKey() {
    return this.key;
  }

  @Override
  public byte[] getKeyBytes() {
    return this.keyBytes;
  }

}
