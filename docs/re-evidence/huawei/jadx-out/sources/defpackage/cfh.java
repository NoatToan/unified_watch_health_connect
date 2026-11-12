package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.healthmodel.bean.PlaceholderBean;
import com.huawei.health.healthmodel.bean.TextBean;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.IoUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes.dex */
public class cfh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f1532c = {"health_model_share.json", "health_model_smile.json", "health_model_benefits.json", "health_model_task_tips.json", "health_model_suggestions.json", "health_model_task_finish.json", "health_model_reticent_user_wake_up.json"};

    private static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int i = Calendar.getInstance().get(7);
        switch (i) {
            case 1:
            case 7:
                return "weekend".equals(str);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return "workday".equals(str);
            default:
                LogUtil.j("HL_SemanticUtils", "checkDateType default dayOfWeek ", Integer.valueOf(i));
                return false;
        }
    }

    private static boolean d(ArrayList<String> arrayList) {
        if (njy.e(arrayList)) {
            return true;
        }
        Date date = new Date();
        String strC = HiDateUtil.c(date, "yyyyMMdd HH:mm");
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HL_SemanticUtils", "checkTimeList formatDate ", strC);
            return true;
        }
        String[] strArrSplit = strC.split(" ");
        if (strArrSplit.length < 2) {
            LogUtil.j("HL_SemanticUtils", "checkTimeList splitArray ", strArrSplit);
            return true;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm", Locale.ENGLISH);
        String str = strArrSplit[0];
        for (int i = 0; i < arrayList.size(); i += 2) {
            try {
                Date date2 = simpleDateFormat.parse(str + " " + arrayList.get(i));
                Date date3 = simpleDateFormat.parse(str + " " + arrayList.get(i + 1));
                if (date2 != null && date3 != null && date.getTime() - date2.getTime() >= 0 && date3.getTime() - date.getTime() >= 0) {
                    return true;
                }
            } catch (ParseException e) {
                LogUtil.e("HL_SemanticUtils", "checkTimeList exception ", LogAnonymous.b(e));
            }
        }
        return false;
    }

    private static boolean c(bwe bweVar) {
        return (bweVar != null && e(bweVar.c()) && d(bweVar.h())) ? false : true;
    }

    private static void c(bwe bweVar, bwe bweVar2) {
        bweVar2.d(bweVar.f());
        bweVar2.c(bweVar.b());
        bweVar2.a(bweVar.d());
        bweVar2.e(bweVar.a());
        bweVar2.d(bweVar.c());
        bweVar2.a(bweVar.h());
        bweVar2.e(bweVar.g());
        bweVar2.d(bweVar.e());
    }

    private static bwe d(String str, int i) {
        ArrayList<bwe> arrayListB = b(ccl.d().e(str));
        if (njy.e(arrayListB)) {
            LogUtil.j("HL_SemanticUtils", "getInteractiveSemanticBean interactiveSemanticBeanList is empty type ", Integer.valueOf(i), " fileName ", str);
            return new bwe();
        }
        bwe bweVar = new bwe();
        for (bwe bweVar2 : arrayListB) {
            if (!c(bweVar2) && bweVar2.f() == i) {
                c(bweVar2, bweVar);
            }
        }
        return bweVar;
    }

    private static bwe a(String str, String str2) {
        ArrayList<bwe> arrayListB = b(ccl.d().e(str));
        if (njy.e(arrayListB)) {
            LogUtil.j("HL_SemanticUtils", "getInteractiveSemanticBean interactiveSemanticBeanList is empty scenario ", str2, " fileName ", str);
            return new bwe();
        }
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        bwe bweVar = new bwe();
        for (bwe bweVar2 : arrayListB) {
            if (!c(bweVar2)) {
                String strA = bweVar2.a();
                if (!zIsEmpty || TextUtils.isEmpty(strA)) {
                    if (zIsEmpty || str2.equals(strA)) {
                        c(bweVar2, bweVar);
                    }
                }
            }
        }
        return bweVar;
    }

    private static bwe a(String str, int i, int i2) {
        ArrayList<bwe> arrayListB = b(ccl.d().e(str));
        if (njy.e(arrayListB)) {
            LogUtil.j("HL_SemanticUtils", "getInteractiveSemanticBean interactiveSemanticBeanList is empty fileName ", str, " type ", Integer.valueOf(i), " challengeId ", Integer.valueOf(i2));
            return new bwe();
        }
        bwe bweVar = new bwe();
        for (bwe bweVar2 : arrayListB) {
            if (!c(bweVar2) && bweVar2.f() == i && bweVar2.b() == i2) {
                c(bweVar2, bweVar);
            }
        }
        return bweVar;
    }

    public static String[] a() {
        return (String[]) f1532c.clone();
    }

    public static SparseArray<ArrayList<TextBean>> d() {
        ArrayList<bwe> arrayListB = b(ccl.d().e("health_model_smile.json"));
        if (njy.e(arrayListB)) {
            LogUtil.j("HL_SemanticUtils", "getSmile interactiveSemanticBeanList is empty");
            return new SparseArray<>(16);
        }
        SparseArray<ArrayList<TextBean>> sparseArray = new SparseArray<>(16);
        for (bwe bweVar : arrayListB) {
            if (bweVar != null) {
                sparseArray.append(bweVar.f(), bweVar.e());
            }
        }
        return sparseArray;
    }

    public static bwe b() {
        ArrayList<bwe> arrayListB = b(ccl.d().e("health_model_share.json"));
        if (njy.e(arrayListB)) {
            LogUtil.j("HL_SemanticUtils", "getShare interactiveSemanticBeanList is empty");
            return new bwe();
        }
        bwe bweVar = new bwe();
        for (bwe bweVar2 : arrayListB) {
            if (!c(bweVar2)) {
                c(bweVar2, bweVar);
            }
        }
        return bweVar;
    }

    public static bwe d(int i) {
        return d("health_model_task_finish.json", i);
    }

    public static bwe a(String str) {
        return a("health_model_reticent_user_wake_up.json", str);
    }

    public static bwe c(String str, int i) {
        ArrayList<bwe> arrayListB = b(ccl.d().e("health_model_task_tips.json"));
        if (njy.e(arrayListB)) {
            LogUtil.j("HL_SemanticUtils", "getTaskTips interactiveSemanticBeanList is empty scenario ", str, " taskId ", Integer.valueOf(i));
            return new bwe();
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        bwe bweVar = new bwe();
        for (bwe bweVar2 : arrayListB) {
            if (!c(bweVar2) && bweVar2.f() == i) {
                String strA = bweVar2.a();
                if (!zIsEmpty || TextUtils.isEmpty(strA)) {
                    if (zIsEmpty || str.equals(strA)) {
                        c(bweVar2, bweVar);
                    }
                }
            }
        }
        return bweVar;
    }

    public static bwe c(int i, int i2) {
        return a("health_model_benefits.json", i, i2);
    }

    public static bwe e(int i, int i2) {
        return a("health_model_suggestions.json", i, i2);
    }

    private static ArrayList<bwe> b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_SemanticUtils", "parsingJsonForInteractive json ", str);
            return new ArrayList<>(16);
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("list");
            if (jSONArrayOptJSONArray == null) {
                LogUtil.j("HL_SemanticUtils", "parsingJsonForInteractive jsonArray is null");
                return new ArrayList<>(16);
            }
            ArrayList<bwe> arrayList = new ArrayList<>(16);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    bwe bweVar = new bwe();
                    bweVar.d(jSONObjectOptJSONObject.optInt("type"));
                    bweVar.c(jSONObjectOptJSONObject.optInt("challengeId"));
                    bweVar.e(jSONObjectOptJSONObject.optString(ParsedFieldTag.KAKA_TASK_SCENARIO));
                    bweVar.a(jSONObjectOptJSONObject.optString("module"));
                    bweVar.d(jSONObjectOptJSONObject.optString("dateType"));
                    bweVar.a(d(jSONObjectOptJSONObject, "timeList"));
                    bweVar.e(d(jSONObjectOptJSONObject, "variableList"));
                    bweVar.d(d(jSONObjectOptJSONObject));
                    arrayList.add(bweVar);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            LogUtil.e("HL_SemanticUtils", "parsingJsonForInteractive exception ", LogAnonymous.b(e));
            return new ArrayList<>(16);
        }
    }

    private static ArrayList<String> d(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new ArrayList<>(16);
        }
        ArrayList<String> arrayList = new ArrayList<>(16);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.optString(i));
        }
        return arrayList;
    }

    public static ArrayList<TextBean> d(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("HL_SemanticUtils", "parsingTextList jsonObject is empty");
            return new ArrayList<>(16);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("textList");
        if (jSONArrayOptJSONArray == null) {
            return new ArrayList<>(16);
        }
        ArrayList<TextBean> arrayList = new ArrayList<>(16);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                TextBean textBean = new TextBean();
                textBean.setText(jSONObjectOptJSONObject.optString("text"));
                textBean.setPlaceholderList(a(jSONObjectOptJSONObject));
                arrayList.add(textBean);
            }
        }
        return arrayList;
    }

    private static ArrayList<PlaceholderBean> a(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("HL_SemanticUtils", "parsingPlaceholder jsonObject is null");
            return new ArrayList<>(16);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("placeholderList");
        if (jSONArrayOptJSONArray == null) {
            return new ArrayList<>(16);
        }
        ArrayList<PlaceholderBean> arrayList = new ArrayList<>(16);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                PlaceholderBean placeholderBean = new PlaceholderBean();
                placeholderBean.setType(jSONObjectOptJSONObject.optString("type"));
                placeholderBean.setValue(jSONObjectOptJSONObject.optString("value"));
                placeholderBean.setResourcesId(jSONObjectOptJSONObject.optString("resourcesId"));
                arrayList.add(placeholderBean);
            }
        }
        return arrayList;
    }

    private static String e(String str, NodeList nodeList) {
        NamedNodeMap attributes;
        Node namedItem;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodeItem = nodeList.item(i);
            if (nodeItem != null && nodeItem.getNodeType() == 1 && (attributes = nodeItem.getAttributes()) != null && (namedItem = attributes.getNamedItem("name")) != null && str.equals(namedItem.getNodeValue())) {
                String textContent = nodeItem.getTextContent();
                if (!TextUtils.isEmpty(textContent)) {
                    return textContent;
                }
            }
        }
        return "";
    }

    private static String d(String str) {
        String str2;
        Context contextB = BaseApplication.b();
        Locale locale = Locale.getDefault();
        String strA = LanguageUtil.a(locale);
        String country = locale.getCountry();
        String str3 = str + "strings/strings";
        if (LanguageUtil.o(contextB)) {
            String str4 = str3 + Constants.LINK + strA + Constants.LINK;
            if (LanguageUtil.l(contextB)) {
                str2 = str4 + "CN";
            } else if ("HK".equals(country)) {
                str2 = str4 + country;
            } else {
                str2 = str4 + "TW";
            }
            return str2 + WatchFaceConstant.XML_SUFFIX;
        }
        if (LanguageUtil.j(contextB)) {
            return str3 + Constants.LINK + strA + "-ZG.xml";
        }
        String strC = CommonUtil.c(str3 + Constants.LINK + strA + WatchFaceConstant.XML_SUFFIX);
        String strC2 = CommonUtil.c(str3 + Constants.LINK + strA + Constants.LINK + country + WatchFaceConstant.XML_SUFFIX);
        if (!TextUtils.isEmpty(strC2) && new File(strC2).exists()) {
            return strC2;
        }
        if (!TextUtils.isEmpty(strC) && new File(strC).exists()) {
            return strC;
        }
        return str3 + WatchFaceConstant.XML_SUFFIX;
    }

    private static String b(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_SemanticUtils", "getString name is empty");
            return "";
        }
        if (cbg.f(str2)) {
            LogUtil.j("HL_SemanticUtils", "getString path ", str2);
            return "";
        }
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (ParserConfigurationException e) {
            LogUtil.e("HL_SemanticUtils", "getString exception ", LogAnonymous.b(e));
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
                if (documentBuilderNewDocumentBuilder == null) {
                    LogUtil.j("HL_SemanticUtils", "getString documentBuilder is null");
                    IoUtils.c(null);
                    return "";
                }
                fileInputStream = new FileInputStream(str2);
                try {
                    try {
                        Document document = documentBuilderNewDocumentBuilder.parse(fileInputStream);
                        if (document == null) {
                            LogUtil.j("HL_SemanticUtils", "getString document is null");
                            IoUtils.c(fileInputStream);
                            return "";
                        }
                        Element documentElement = document.getDocumentElement();
                        if (documentElement == null) {
                            LogUtil.j("HL_SemanticUtils", "getString element is null");
                            IoUtils.c(fileInputStream);
                            return "";
                        }
                        NodeList childNodes = documentElement.getChildNodes();
                        if (childNodes == null) {
                            LogUtil.j("HL_SemanticUtils", "getString nodeList is null");
                            IoUtils.c(fileInputStream);
                            return "";
                        }
                        String strE = e(str, childNodes);
                        IoUtils.c(fileInputStream);
                        return strE;
                    } catch (IOException | ParserConfigurationException | SAXException unused) {
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("HL_SemanticUtils", "getString exception");
                        IoUtils.c(fileInputStream2);
                        return "";
                    }
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStream);
                    throw th;
                }
            } catch (IOException | ParserConfigurationException | SAXException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static ArrayList<String> e(ArrayList<TextBean> arrayList, HashMap<String, String> map) {
        if (njy.e(arrayList)) {
            LogUtil.j("HL_SemanticUtils", "getStringList textBeans is empty");
            return new ArrayList<>(16);
        }
        ArrayList<String> arrayList2 = new ArrayList<>(16);
        for (TextBean textBean : arrayList) {
            if (textBean != null) {
                String strC = c(textBean.getText(), textBean.getPlaceholderList(), map);
                if (!TextUtils.isEmpty(strC)) {
                    arrayList2.add(strC);
                }
            }
        }
        return arrayList2;
    }

    public static String c(String str, ArrayList<PlaceholderBean> arrayList, HashMap<String, String> map) throws Throwable {
        String strB = b(str, CommonUtil.c(d(ccl.d().c())));
        if (TextUtils.isEmpty(strB) || njy.e(arrayList)) {
            return strB;
        }
        ArrayList arrayList2 = new ArrayList(16);
        for (PlaceholderBean placeholderBean : arrayList) {
            if (placeholderBean == null) {
                arrayList2.add("");
            } else {
                arrayList2.add(cea.e(placeholderBean.getType(), b(placeholderBean, map), placeholderBean.getResourcesId()));
            }
        }
        try {
            return String.format(strB, arrayList2.toArray(new Object[0]));
        } catch (MissingFormatArgumentException unused) {
            LogUtil.e("HL_SemanticUtils", "getText missingFormatArgumentException");
            return "";
        }
    }

    private static String b(PlaceholderBean placeholderBean, HashMap<String, String> map) {
        String value = placeholderBean.getValue();
        if (map == null || map.size() <= 0) {
            return value;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && key.equals(value)) {
                    return entry.getValue();
                }
            }
        }
        return value;
    }
}
