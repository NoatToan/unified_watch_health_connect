package com.huawei.ui.main.stories.template;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.ResourceParseHelper;
import defpackage.lsy;
import defpackage.qqs;
import defpackage.qrs;
import defpackage.wpd;
import defpackage.wpk;
import defpackage.wpl;
import defpackage.wps;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.LanguageUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes19.dex */
public class ResourceParseHelper implements ResourceDownloadHelper.FileResult {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f28986b = new Handler(new Handler.Callback() { // from class: com.huawei.ui.main.stories.template.ResourceParseHelper.3
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (!(message.obj instanceof String)) {
                    return false;
                }
                String str = (String) message.obj;
                if (ResourceParseHelper.f28987c == null) {
                    return false;
                }
                ResourceParseHelper.f28987c.getTitleName(str);
                return false;
            }
            if (i == 2) {
                if (!(message.obj instanceof String)) {
                    return false;
                }
                String str2 = (String) message.obj;
                if (ResourceParseHelper.f28987c == null) {
                    return false;
                }
                ResourceParseHelper.f28987c.getDescription(str2);
                return false;
            }
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                LogUtil.j("ResourceParseHelper", "parse data error");
                if (ResourceParseHelper.f28987c == null) {
                    return false;
                }
                ResourceParseHelper.f28987c.showParseErrorAlert();
                return false;
            }
            if (!(message.obj instanceof String)) {
                return false;
            }
            String str3 = (String) message.obj;
            if (ResourceParseHelper.f28987c == null) {
                return false;
            }
            ResourceParseHelper.f28987c.getImagePath(str3);
            return false;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConfigInfoCallback f28987c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JsonResult f28988a;
    private HashMap<String, String> d;
    private wps e;
    private String h = "";

    public interface ConfigInfoCallback {
        void getDescription(String str);

        void getImagePath(String str);

        void getTitleName(String str);

        void showParseErrorAlert();
    }

    public interface JsonResult {
        void onFail();

        void onResult(wps wpsVar);
    }

    public ResourceParseHelper() {
        HashMap<String, String> map = new HashMap<>();
        this.d = map;
        map.clear();
        this.d.put("StressCardConstructor", "1.0.0");
        this.d.put("SleepCardConstructor", "1.0.0");
        this.d.put("HeartRateConstructor", "1.0.0");
        this.d.put("BloodSugarCardConstructor", "1.0.0");
        this.d.put("BloodPressureCardConstructor", "1.0.0");
        this.d.put("WeightCardConstructor", "1.0.6");
        this.d.put("BloodOxygenCardConstructor", "1.0.0");
        this.d.put("BodyTemperatureCardConstructor", "1.0.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ResourceParseHelper", "getString name is empty");
            d();
            return;
        }
        String strC = CommonUtil.c(c(str2));
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("ResourceParseHelper", "getString path is empty");
        }
        FileInputStream fileInputStream2 = null;
        fileInputStream2 = null;
        fileInputStream2 = null;
        try {
            try {
                if (!new File(strC).exists()) {
                    LogUtil.j("ResourceParseHelper", "file is null");
                    d();
                    IoUtils.c(null);
                    return;
                }
                fileInputStream = strC != null ? new FileInputStream(strC) : null;
                try {
                    DocumentBuilder documentBuilderNewDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                    if (documentBuilderNewDocumentBuilder == null) {
                        LogUtil.j("ResourceParseHelper", "getString documentBuilder is null");
                    }
                    Document document = (documentBuilderNewDocumentBuilder == null || fileInputStream == null) ? null : documentBuilderNewDocumentBuilder.parse(fileInputStream);
                    if (document == null) {
                        LogUtil.j("ResourceParseHelper", "getString document is null");
                    }
                    Element documentElement = document != null ? document.getDocumentElement() : null;
                    if (documentElement == null) {
                        LogUtil.j("ResourceParseHelper", "getString element is null");
                    }
                    NodeList childNodes = documentElement != null ? documentElement.getChildNodes() : null;
                    if (childNodes == null) {
                        LogUtil.j("ResourceParseHelper", "getString nodeList is null");
                    } else {
                        a(str, childNodes);
                    }
                    IoUtils.c(fileInputStream);
                } catch (IOException e) {
                    e = e;
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("ResourceParseHelper", "getString exception", e);
                    IoUtils.c(fileInputStream2);
                } catch (ParserConfigurationException e2) {
                    e = e2;
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("ResourceParseHelper", "getString exception", e);
                    IoUtils.c(fileInputStream2);
                } catch (SAXException e3) {
                    e = e3;
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("ResourceParseHelper", "getString exception", e);
                    IoUtils.c(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStream);
                    throw th;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 0;
                f28986b.sendMessage(messageObtain);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (ParserConfigurationException e5) {
            e = e5;
        } catch (SAXException e6) {
            e = e6;
        }
    }

    private int b() {
        String str = TextUtils.isEmpty(this.h) ? "" : this.h;
        str.hashCode();
        switch (str) {
            case "BloodOxygenCardConstructor":
                return R.raw.bloodoxygen;
            case "StressCardConstructor":
                return R.raw.stress;
            case "SleepCardConstructor":
                return R.raw.sleep;
            case "BloodSugarCardConstructor":
                return R.raw.bloodsugar;
            case "HeartRateConstructor":
                return R.raw.heartrate;
            case "BloodPressureCardConstructor":
                return R.raw.bloodpressure;
            case "WeightCardConstructor":
                return R.raw.weight;
            case "BodyTemperatureCardConstructor":
                return R.raw.bodytemperature;
            default:
                return -1;
        }
    }

    public void e(String str, JsonResult jsonResult) {
        this.f28988a = jsonResult;
        this.h = str;
        Vector vector = new Vector();
        vector.add(str);
        new ResourceDownloadHelper().c(vector, this);
    }

    @Override // com.huawei.ui.main.stories.template.ResourceDownloadHelper.FileResult
    public void onFail(List<String> list) {
        String strE = wpk.e(this.h);
        if (strE != null && !TextUtils.isEmpty(strE) && !wpk.d(wpl.b(this.h))) {
            wpd.c().d(this.h, new Consumer() { // from class: com.huawei.ui.main.stories.template.ResourceParseHelper$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.d.e((wps) obj);
                }
            });
            return;
        }
        int iB = b();
        if (iB == -1) {
            JsonResult jsonResult = this.f28988a;
            if (jsonResult != null) {
                jsonResult.onFail();
                return;
            }
            return;
        }
        wpd.c().a(iB, new Consumer() { // from class: com.huawei.ui.main.stories.template.ResourceParseHelper$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.e.a((wps) obj);
            }
        });
    }

    /* synthetic */ void e(wps wpsVar) {
        this.e = wpsVar;
        JsonResult jsonResult = this.f28988a;
        if (jsonResult != null) {
            jsonResult.onResult(wpsVar);
        }
    }

    /* synthetic */ void a(wps wpsVar) {
        this.e = wpsVar;
        JsonResult jsonResult = this.f28988a;
        if (jsonResult != null) {
            jsonResult.onResult(wpsVar);
        }
    }

    @Override // com.huawei.ui.main.stories.template.ResourceDownloadHelper.FileResult
    public void onSuccess() {
        wpd.c().d(this.h, new Consumer() { // from class: com.huawei.ui.main.stories.template.ResourceParseHelper$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.e.d((wps) obj);
            }
        });
    }

    /* synthetic */ void d(wps wpsVar) {
        this.e = wpsVar;
        JsonResult jsonResult = this.f28988a;
        if (jsonResult != null) {
            jsonResult.onResult(wpsVar);
        }
    }

    public static void e(final String str, final String str2, ConfigInfoCallback configInfoCallback) {
        f28987c = configInfoCallback;
        lsy.a(new Runnable() { // from class: wpj
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                ResourceParseHelper.e(str, str2);
            }
        });
    }

    public static void b(final String str, final String str2, ConfigInfoCallback configInfoCallback) {
        f28987c = configInfoCallback;
        lsy.a(new Runnable() { // from class: wpm
            @Override // java.lang.Runnable
            public final void run() {
                ResourceParseHelper.d(str, str2);
            }
        });
    }

    public static void c(ConfigInfoCallback configInfoCallback) {
        f28987c = configInfoCallback;
    }

    public boolean b(String str) {
        long j;
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("ResourceParseHelper", "uuid=null ");
            return false;
        }
        String strE = wpk.e(str);
        String str2 = this.d.get(str);
        if (!TextUtils.isEmpty(strE)) {
            String strReplace = strE.replace(".", "");
            String strReplace2 = TextUtils.isEmpty(str2) ? "0" : str2.replace(".", "");
            long j2 = 0;
            try {
                j = Long.parseLong(strReplace);
                try {
                    j2 = Long.parseLong(strReplace2);
                } catch (NumberFormatException unused) {
                    LogUtil.e("ResourceParseHelper", "NumberFormatException: oldResourceVersion= ", strReplace, " presetResourceVersion=", strReplace2);
                }
            } catch (NumberFormatException unused2) {
                j = 0;
            }
            if (j >= j2) {
                return wpk.d(wpl.b(str));
            }
        }
        return true;
    }

    private static void d() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = "";
        f28986b.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ResourceParseHelper", "getString name is empty");
        }
        String strB = b(BaseApplication.getContext(), str, str2);
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = strB;
        f28986b.sendMessage(messageObtain);
    }

    private static String b(Context context, String str, String str2) {
        boolean zAf = qrs.af(context);
        boolean zE = qqs.e(context);
        if (!zAf && !zE) {
            return CommonUtil.c(wpl.b(str2) + "img/" + str + ".webp");
        }
        if (zAf && zE) {
            return CommonUtil.c(wpl.b(str2) + "img/" + str + "_tahidi_dark.webp");
        }
        if (zAf) {
            return CommonUtil.c(wpl.b(str2) + "img/" + str + "_tahidi.webp");
        }
        return CommonUtil.c(wpl.b(str2) + "img/" + str + "_dark.webp");
    }

    private static void a(String str, NodeList nodeList) {
        NamedNodeMap attributes;
        Node namedItem;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodeItem = nodeList.item(i);
            if (nodeItem != null && nodeItem.getNodeType() == 1 && (attributes = nodeItem.getAttributes()) != null && (namedItem = attributes.getNamedItem("name")) != null && str.equals(namedItem.getNodeValue())) {
                String textContent = nodeItem.getTextContent();
                Message messageObtain = Message.obtain();
                if (str.contains("IDS_name")) {
                    messageObtain.what = 1;
                }
                if (str.contains("IDS_desc")) {
                    messageObtain.what = 2;
                }
                messageObtain.obj = textContent;
                f28986b.sendMessage(messageObtain);
                return;
            }
        }
        Message messageObtain2 = Message.obtain();
        if (str.contains("IDS_name")) {
            messageObtain2.what = 1;
        }
        if (str.contains("IDS_desc")) {
            messageObtain2.what = 2;
        }
        messageObtain2.obj = "";
        f28986b.sendMessage(messageObtain2);
    }

    private static String c(String str) {
        String str2;
        Locale locale = Locale.getDefault();
        String strA = LanguageUtil.a(locale);
        String country = locale.getCountry();
        String strP = CommonUtil.p(strA);
        if (strP != null) {
            country = strP;
        }
        String str3 = wpl.b(str) + "lang/strings";
        String strC = CommonUtil.c(str3 + com.huawei.openalliance.ad.constant.Constants.LINK + strA + WatchFaceConstant.XML_SUFFIX);
        String strC2 = CommonUtil.c(str3 + com.huawei.openalliance.ad.constant.Constants.LINK + strA + com.huawei.openalliance.ad.constant.Constants.LINK + country + WatchFaceConstant.XML_SUFFIX);
        if (!TextUtils.isEmpty(strC2) && new File(strC2).exists()) {
            return strC2;
        }
        if (!TextUtils.isEmpty(strC) && new File(strC).exists()) {
            return strC;
        }
        Context context = BaseApplication.getContext();
        if (!LanguageUtil.o(context)) {
            return str3 + WatchFaceConstant.XML_SUFFIX;
        }
        String str4 = str3 + com.huawei.openalliance.ad.constant.Constants.LINK + strA + com.huawei.openalliance.ad.constant.Constants.LINK;
        if (LanguageUtil.l(context)) {
            str2 = str4 + "CN";
        } else {
            str2 = str4 + "TW";
        }
        return str2 + WatchFaceConstant.XML_SUFFIX;
    }

    public static void c() {
        if (f28987c != null) {
            f28987c = null;
        }
    }
}
