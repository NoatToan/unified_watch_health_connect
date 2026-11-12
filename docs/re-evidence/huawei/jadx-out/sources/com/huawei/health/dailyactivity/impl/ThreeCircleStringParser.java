package com.huawei.health.dailyactivity.impl;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.TradeMode;
import defpackage.pjn;
import defpackage.qhl;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatPrecisionException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.californium.elements.util.JceNames;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes27.dex */
public class ThreeCircleStringParser {
    private static final String BRAZIL = "BR";
    private static final String DEFAULT_LANGUAGE = "en";
    private static final String ENCODING = "UTF-8";
    private static final String LANGUAGE_LOCAL_LINK = "-r";
    private static final String MYANMAR = "my";
    private static final String PARAM_KEY = "params";
    private static final String RELEASE_TAG = "R_3CircStrParser";
    private static final String RULE_KEY = "rules";
    private static final String SECURE_ALGORITHM = "SHA1PRNG";
    private static final String SPECIAL_CATEGORY = "Zero";
    private static final String SPECIAL_PARAM = "remainActiveDay";
    private static final String SPECIAL_PROMPT = "ActiveWeek";
    private static final String STRING_KEY = "str";
    private static final String STRING_NAME_KEY = "string";
    private static final String TAG = "ThreeCircleStringParser";
    private static final String UK = "GB";
    private static final String XML_SUFFIX = ".xml";
    private static final String ZH_HANS = "zh-Hans";
    private static final String ZH_HANT = "zh-Hant";
    private static final String ZH_LANGUAGE = "zh";
    private String mJsonPath;
    private String mStringDir;
    private static final Map<String, String> LOCALE_LANGUAGE_MAP = new LinkedHashMap<String, String>() { // from class: com.huawei.health.dailyactivity.impl.ThreeCircleStringParser.4
        {
            put("my-Qaag", "my-rZG");
            put("my-ZG", "my-rZG");
            put("zh-Hant-CN", "zh-rTW");
            put("zh-Hant-TW", "zh-rTW");
            put("zh-Hant-HK", "zh-rHK");
            put("zh-Hant-MO", "zh-rHK");
            put("zh-CN", "zh-rCN");
            put("zh-HK", "zh-rHK");
            put("zh-TW", "zh-rTW");
        }
    };
    private static final Map<String, List<String>> SPECIAL_LANGUAGE_TO_LOCALE = new LinkedHashMap<String, List<String>>() { // from class: com.huawei.health.dailyactivity.impl.ThreeCircleStringParser.1
        {
            put(ThreeCircleStringParser.SPANISH, new ArrayList(Arrays.asList("AR", "BO", "CL", "CO", "CR", "CU", "DO", JceNames.EC, "GT", "HN", "MX", "NI", TradeMode.PA, "PE", "PR", "PY", "SV", "UY", "VE", "US")));
        }
    };
    private static final String LATIN_AMERICAN = "es-rUS";
    private static final String SPANISH = "es";
    private static final String MYANMAR_U_CODE = "my-rMM";
    private static final String EU_PORTUGUESE = "pt-rPT";
    private static final String PORTUGUESE = "pt";
    private static final List<String> ALL_COUNTRY = new ArrayList(Arrays.asList("am", "ar", "az", "be", "bg", "bn", "bo", CmcdConfiguration.KEY_BUFFER_STARVATION, "ca", "cs", "da", "de", "el", "en-rGB", LATIN_AMERICAN, SPANISH, "et", "eu", "fa", "fi", "fr", "gl", "hi", "hr", "hu", "in", "it", "iw", "ja", "jv", "ka", "kk", "km", "ko", "lo", "lt", "lv", "mi", "mk", "mn", "ms", MYANMAR_U_CODE, "my-rZG", "nb", "ne", "nl", "pl", EU_PORTUGUESE, PORTUGUESE, "ro", "ru", "si", "sk", "sl", "sr", "sv", "sw", "th", "tl", "tr", "ug", "uk", Constants.URDU_LANG, "uz", "vi", "zh-rCN", "zh-rHK", "zh-rTW"));

    public ThreeCircleStringParser(String str, String str2) {
        this.mJsonPath = str;
        this.mStringDir = str2;
    }

    private JSONObject parseJson(String str) throws Throwable {
        JSONObject jSONObject = null;
        if (!isFileExist(str)) {
            ReleaseLogUtil.e(RELEASE_TAG, "parseJson getFilePath empty: ", str);
            return null;
        }
        String strC = Utils.c(str);
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(RELEASE_TAG, "parseJson readJson empty");
            return null;
        }
        try {
            jSONObject = new JSONObject(strC);
        } catch (JSONException e) {
            ReleaseLogUtil.a(RELEASE_TAG, "parseJson JSONException: ", ExceptionUtils.c(e));
        }
        LogUtil.d(TAG, "leave parseJson: ", jSONObject);
        return jSONObject;
    }

    public qhl queryRules(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.e(RELEASE_TAG, "queryParams params empty");
            return null;
        }
        return parseJsonCreateBean(str, str2);
    }

    public String getPromptMessage(qhl qhlVar, Map<String, String> map, int i) throws Throwable {
        String strValueOf;
        if (qhlVar == null) {
            ReleaseLogUtil.a(RELEASE_TAG, "bean is null");
            return null;
        }
        String strA = qhlVar.a();
        String strD = qhlVar.d();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strD)) {
            ReleaseLogUtil.e(RELEASE_TAG, "getPromptMessage promptType or category empty");
            return null;
        }
        Map<String, List<String>> mapC = qhlVar.c();
        if (mapC == null || mapC.isEmpty()) {
            ReleaseLogUtil.e(RELEASE_TAG, "ruleSet null");
            return null;
        }
        Set<String> setKeySet = mapC.keySet();
        if (i >= 0) {
            ReleaseLogUtil.d(RELEASE_TAG, "getPromptMessage in order");
            if (i >= setKeySet.size()) {
                ReleaseLogUtil.d(RELEASE_TAG, "index out of bound");
                return null;
            }
            strValueOf = String.valueOf(setKeySet.toArray()[i]);
        } else {
            int randomIndex = getRandomIndex(setKeySet.size());
            ReleaseLogUtil.d(RELEASE_TAG, "getPromptMessage random randomIndex: ", Integer.valueOf(randomIndex));
            strValueOf = String.valueOf(setKeySet.toArray()[randomIndex]);
        }
        Map<String, String> mapLoadXmlStrings = loadXmlStrings(this.mStringDir);
        String str = mapLoadXmlStrings.get(strValueOf);
        List<String> list = mapC.get(strValueOf);
        if (SPECIAL_PROMPT.equals(strA) && SPECIAL_CATEGORY.equals(strD)) {
            String str2 = map.get(SPECIAL_PARAM);
            if (str2 == null) {
                ReleaseLogUtil.a(TAG, "ActiveWeek param is null");
                return null;
            }
            strValueOf = strValueOf + "_" + str2;
            str = mapLoadXmlStrings.get(strValueOf);
        }
        LogUtil.a(TAG, "strName: ", strValueOf, ",chosenStr: ", str, ",eachParams: ", list);
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(RELEASE_TAG, "params null or chosenStr null");
            return str;
        }
        if (map == null || map.isEmpty()) {
            ReleaseLogUtil.e(RELEASE_TAG, "get bean params null");
            return null;
        }
        String[] strArr = new String[list.size()];
        int i2 = 0;
        for (String str3 : list) {
            String str4 = map.get(str3);
            strArr[i2] = str4;
            LogUtil.a(TAG, "param: ", str3, " index: ", Integer.valueOf(i2), " sortedParams: ", str4);
            i2++;
        }
        try {
            return String.format(str, strArr);
        } catch (IllegalFormatPrecisionException e) {
            ReleaseLogUtil.a(TAG, "getPromptMessage exception:", LogAnonymous.b(e));
            return str;
        }
    }

    public String getPromptMessage(qhl qhlVar, Map<String, String> map) {
        return getPromptMessage(qhlVar, map, -1);
    }

    private qhl parseJsonCreateBean(String str, String str2) throws Throwable {
        JSONObject json = parseJson(this.mJsonPath);
        if (json == null) {
            ReleaseLogUtil.e(RELEASE_TAG, "ruleJson null");
            return null;
        }
        try {
            JSONObject jSONObject = json.getJSONObject(str).getJSONObject(str2);
            JSONArray jSONArray = jSONObject.getJSONArray(RULE_KEY);
            if (jSONArray.length() == 0) {
                ReleaseLogUtil.e(RELEASE_TAG, "rules is empty");
                return null;
            }
            Map<String, List<String>> rules = parseRules(jSONArray);
            List<String> listJsonArrayToList = jsonArrayToList(jSONObject.getJSONArray("params"));
            qhl qhlVar = new qhl();
            qhlVar.a(str);
            qhlVar.e(str2);
            qhlVar.a(rules);
            qhlVar.d(listJsonArrayToList);
            LogUtil.a(TAG, "ThreeCircleRulesBean: ", qhlVar);
            return qhlVar;
        } catch (JSONException e) {
            ReleaseLogUtil.a(RELEASE_TAG, "queryParams JSONException: ", ExceptionUtils.c(e));
            return null;
        }
    }

    private Map<String, List<String>> parseRules(JSONArray jSONArray) {
        int length = jSONArray.length();
        HashMap map = new HashMap(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                map.put(jSONObject.getString(STRING_KEY), jsonArrayToList(jSONObject.getJSONArray("params")));
            } catch (JSONException e) {
                ReleaseLogUtil.a(RELEASE_TAG, "get string JSONException: ", ExceptionUtils.c(e));
                return null;
            }
        }
        return map;
    }

    private List<String> jsonArrayToList(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException e) {
                ReleaseLogUtil.a(RELEASE_TAG, "jsonArrayToList JSONException: ", ExceptionUtils.c(e));
                return null;
            }
        }
        return arrayList;
    }

    private int getRandomIndex(int i) {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance(SECURE_ALGORITHM);
        } catch (NoSuchAlgorithmException unused) {
            secureRandom = new SecureRandom();
            ReleaseLogUtil.a(RELEASE_TAG, "NoSuchAlgorithmException");
        }
        if (i > 0) {
            return secureRandom.nextInt(i);
        }
        return 0;
    }

    private boolean isFileExist(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(RELEASE_TAG, "isFileExist filePath null");
            return false;
        }
        File file = new File(str);
        return file.exists() && !file.isDirectory();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    private Map<String, String> loadXmlStrings(String str) throws Throwable {
        HashMap map = new HashMap();
        String language = getLanguage();
        String str2 = str + File.separator + language + ".xml";
        if (!isFileExist(str2)) {
            ReleaseLogUtil.d(RELEASE_TAG, "first xml file not exists: ", str2);
            if (ALL_COUNTRY.contains(language)) {
                ReleaseLogUtil.e(RELEASE_TAG, "language valid, but file not exist!");
                return map;
            }
            str2 = str + File.separator + "en.xml";
            if (!isFileExist(str2)) {
                ReleaseLogUtil.a(RELEASE_TAG, "default xml file not exists");
                return map;
            }
        }
        ?? r6 = 0;
        String name = null;
        FileInputStream fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                FileInputStream fileInputStream4 = new FileInputStream(str2);
                try {
                    xmlPullParserNewPullParser.setInput(fileInputStream4, "UTF-8");
                    int eventType = xmlPullParserNewPullParser.getEventType();
                    while (eventType != 1) {
                        if (eventType == 2) {
                            name = xmlPullParserNewPullParser.getName();
                            if ("string".equals(name)) {
                                String attributeValue = xmlPullParserNewPullParser.getAttributeValue(0);
                                name = xmlPullParserNewPullParser.nextText();
                                map.put(attributeValue, name);
                            }
                        }
                        eventType = xmlPullParserNewPullParser.next();
                        name = name;
                    }
                    try {
                        fileInputStream4.close();
                        return map;
                    } catch (IOException e) {
                        ReleaseLogUtil.a(RELEASE_TAG, "InputStream close IOException: ", ExceptionUtils.c(e));
                        r6 = name;
                        return map;
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileInputStream = fileInputStream4;
                    ReleaseLogUtil.a(RELEASE_TAG, "FileNotFoundException: ", ExceptionUtils.c(e));
                    r6 = fileInputStream;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            r6 = fileInputStream;
                        } catch (IOException e3) {
                            ReleaseLogUtil.a(RELEASE_TAG, "InputStream close IOException: ", ExceptionUtils.c(e3));
                            r6 = fileInputStream;
                        }
                    }
                    return map;
                } catch (IOException e4) {
                    e = e4;
                    fileInputStream2 = fileInputStream4;
                    ReleaseLogUtil.a(RELEASE_TAG, "IOException: ", ExceptionUtils.c(e));
                    r6 = fileInputStream2;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                            r6 = fileInputStream2;
                        } catch (IOException e5) {
                            ReleaseLogUtil.a(RELEASE_TAG, "InputStream close IOException: ", ExceptionUtils.c(e5));
                            r6 = fileInputStream2;
                        }
                    }
                    return map;
                } catch (XmlPullParserException e6) {
                    e = e6;
                    fileInputStream3 = fileInputStream4;
                    ReleaseLogUtil.a(RELEASE_TAG, "XmlPullParserException: ", ExceptionUtils.c(e));
                    r6 = fileInputStream3;
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                            r6 = fileInputStream3;
                        } catch (IOException e7) {
                            ReleaseLogUtil.a(RELEASE_TAG, "InputStream close IOException: ", ExceptionUtils.c(e7));
                            r6 = fileInputStream3;
                        }
                    }
                    return map;
                } catch (Throwable th) {
                    th = th;
                    r6 = fileInputStream4;
                    if (r6 != 0) {
                        try {
                            r6.close();
                        } catch (IOException e8) {
                            ReleaseLogUtil.a(RELEASE_TAG, "InputStream close IOException: ", ExceptionUtils.c(e8));
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e9) {
            e = e9;
        } catch (IOException e10) {
            e = e10;
        } catch (XmlPullParserException e11) {
            e = e11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    private String getLanguage() {
        byte b2;
        String strU = CommonUtil.u();
        String strE = CommonUtil.e();
        String languageTag = Resources.getSystem().getConfiguration().locale.toLanguageTag();
        ReleaseLogUtil.d(RELEASE_TAG, "language: ", strU, ", country: ", strE, ", tag: ", languageTag);
        strU.hashCode();
        int iHashCode = strU.hashCode();
        if (iHashCode != 3241) {
            if (iHashCode != 3246) {
                if (iHashCode != 3325) {
                    if (iHashCode != 3355) {
                        if (iHashCode != 3500) {
                            if (iHashCode != 3588) {
                                if (iHashCode == 3886 && strU.equals("zh")) {
                                    b2 = 6;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strU.equals(PORTUGUESE)) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                        } else if (strU.equals(MYANMAR)) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (strU.equals("id")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (strU.equals("he")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strU.equals(SPANISH)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strU.equals("en")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                strU = !UK.equals(strE) ? "en" : strU + LANGUAGE_LOCAL_LINK + strE;
                break;
            case 1:
                strU = !SPECIAL_LANGUAGE_TO_LOCALE.get(SPANISH).contains(strE) ? SPANISH : LATIN_AMERICAN;
                break;
            case 2:
                strU = "iw";
                break;
            case 3:
                strU = "in";
                break;
            case 4:
                strU = getMyanmarLanguage(languageTag);
                break;
            case 5:
                strU = !BRAZIL.equals(strE) ? EU_PORTUGUESE : PORTUGUESE;
                break;
            case 6:
                strU = getCNLanguage();
                LogUtil.a(TAG, "resLanguage: ", strU);
                break;
            default:
                ReleaseLogUtil.d(RELEASE_TAG, "get language directly");
                break;
        }
        LogUtil.a(TAG, "localeLanguage: ", strU);
        return strU;
    }

    private String getCNLanguage() {
        String strB = pjn.b(null);
        LogUtil.a(TAG, "supportLanguageName: ", strB);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j(TAG, "supportLanguageName is null, leave getCNLanguage");
            return "zh-rCN";
        }
        return LOCALE_LANGUAGE_MAP.get(strB);
    }

    private String getMyanmarLanguage(String str) {
        if (str.length() < 4) {
            LogUtil.j(TAG, "languageTag size too short");
            return MYANMAR_U_CODE;
        }
        int iIndexOf = str.indexOf(45, 3);
        LogUtil.a(TAG, "languageTag: ", str, ", index: ", Integer.valueOf(iIndexOf));
        if (iIndexOf <= 0) {
            ReleaseLogUtil.e(RELEASE_TAG, "toLanguageTag indexOf error: ", Integer.valueOf(iIndexOf));
            return MYANMAR_U_CODE;
        }
        String str2 = LOCALE_LANGUAGE_MAP.get(str.substring(0, iIndexOf));
        return str2 == null ? MYANMAR_U_CODE : str2;
    }
}
