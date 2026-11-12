package defpackage;

import android.text.TextUtils;
import com.braintreepayments.api.PayPalPaymentIntent;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.health.healthmodel.bean.PictureBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginmgr.EzPluginType;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CommonUtil;
import health.compact.a.GrsDownloadPluginUrl;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class ccl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ccl f1464a;
    private static final String[] e = {"health_model_config", "health_model_semantic", "health_model_update_guide", "health_model_guide_img", "health_model_task_img"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f1465b = new byte[0];
    private final ThreadPoolManager j = ThreadPoolManager.c();
    private final pia d = new pia(EzPluginType.HEALTH_MODEL_TYPE, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1466c = Utils.o();

    private ccl() {
    }

    public static ccl d() {
        if (f1464a == null) {
            synchronized (f1465b) {
                if (f1464a == null) {
                    f1464a = new ccl();
                }
            }
        }
        return f1464a;
    }

    public void c(String str) {
        LogUtil.a("HL_DownloadUtils", "startDownload");
        if (cbg.ae()) {
            return;
        }
        if (cbg.aa()) {
            cbg.d(System.currentTimeMillis());
            b(str);
            return;
        }
        for (String str2 : e) {
            e(str2, false);
        }
    }

    private String f(String str) {
        return phs.d + "health_model_res" + File.separator + str + File.separator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(final String str) {
        if (HandlerExecutor.c()) {
            cbg.c(this.j, "HealthModelUpdateIndexFile", new Runnable() { // from class: cck
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1463c.b(str);
                }
            });
        } else {
            LogUtil.d("HL_DownloadUtils", "updateIndexFile url ", this.d.e(new GrsDownloadPluginUrl().getDownloadPluginUrl(null, true), (String) null));
            this.d.a(new a(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final String str2) {
        if (d(str)) {
            this.d.e(str, new PullListener() { // from class: cco
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    this.e.e(str, str2, pisVar, pitVar);
                }
            });
        }
    }

    /* synthetic */ void e(String str, String str2, pis pisVar, pit pitVar) {
        if (pitVar == null) {
            LogUtil.j("HL_DownloadUtils", "updatePluginInfo onPullingChange result is null");
            cbg.d(0L);
            return;
        }
        int iF = pitVar.f();
        if (iF != 1) {
            if (iF == 0) {
                return;
            }
            LogUtil.j("HL_DownloadUtils", "updatePluginInfo onPullingChange error uuid ", str, " status ", Integer.valueOf(iF));
            cbg.d(0L);
            a(str, iF);
            if ("health_model_config".equals(str)) {
                byn.a(false);
            }
            cbk.d(str2, str, iF);
            return;
        }
        phz phzVarA = this.d.a(str);
        if (phzVarA == null) {
            LogUtil.j("HL_DownloadUtils", "updatePluginInfo onPullingChange pluginInfo is null ", str);
            cbg.d(0L);
        } else {
            LogUtil.a("HL_DownloadUtils", "updatePluginInfo onPullingChange uuid ", str);
            ccy.c(str, phzVarA.g());
            e(str, true);
        }
        a(str, qrs.a("0"));
        cbk.d(str2, str, 1);
    }

    private boolean d(String str) {
        phz phzVarA = this.d.a(str);
        if (phzVarA == null) {
            LogUtil.j("HL_DownloadUtils", "pluginInfo is null ", str);
            return false;
        }
        String strG = ccy.g(str);
        return cbg.f(f(str)) || TextUtils.isEmpty(strG) || !strG.equals(phzVarA.g());
    }

    private void d(String str, boolean z) {
        if (z) {
            c(str, true);
        } else if (TextUtils.isEmpty(e(str))) {
            LogUtil.j("HL_DownloadUtils", "refreshSharedPreferenceValue value is empty scenario ", str);
            c(str, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    private void e(String str, boolean z) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_DownloadUtils", "initSharedPreferenceValue uuid is empty");
            return;
        }
        str.hashCode();
        switch (str) {
            case "health_model_semantic":
                b2 = 0;
                break;
            case "health_model_config":
                b2 = 1;
                break;
            case "health_model_update_guide":
                b2 = 2;
                break;
            case "health_model_guide_img":
                b2 = 3;
                break;
            case "health_model_task_img":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            for (String str2 : cfh.a()) {
                d(str2, z);
            }
            return;
        }
        if (b2 == 1) {
            if (z) {
                byn.a(true);
            }
            d("health_model_task_config.json", z);
        } else {
            if (b2 == 2) {
                d("1001", z);
                return;
            }
            if (b2 == 3) {
                d("1000", z);
                return;
            }
            if (b2 == 4) {
                d("1", z);
                d("2", z);
                d("80", z);
                d("100", z);
                return;
            }
            LogUtil.d("HL_DownloadUtils", "initSharedPreferenceValue uuid ", str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    private void a(String str, int i) {
        byte b2;
        OperationKey operationKey;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_DownloadUtils", "reportErrorCode uuid is empty");
            return;
        }
        switch (str) {
            case "health_model_semantic":
                b2 = 2;
                break;
            case "health_model_config":
                b2 = 0;
                break;
            case "health_model_config/challenge":
                b2 = 1;
                break;
            case "health_model_update_guide":
                b2 = 4;
                break;
            case "health_model_guide_img":
                b2 = 3;
                break;
            case "health_model_task_img":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1) {
            operationKey = OperationKey.HEALTH_APP_CONFIGURATION_FILES_DOWNLOAD_85070009;
        } else if (b2 == 2) {
            operationKey = OperationKey.HEALTH_APP_SEMANTIC_LIBRARY_DOWNLOAD_85070007;
        } else {
            operationKey = OperationKey.HEALTH_APP_PICTURE_DOWNLOAD_85070008;
        }
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(operationKey.value(), i);
    }

    public String c() {
        return f("health_model_semantic");
    }

    public String b() {
        return f("health_model_config/challenge");
    }

    private void c(final String str, final boolean z) {
        cbg.c(this.j, "HealthModelGetResources_" + str, new Runnable() { // from class: ccn
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f1471a.b(str, z);
            }
        });
    }

    /* synthetic */ void b(String str, boolean z) throws Throwable {
        String strI = i(str);
        if (TextUtils.isEmpty(strI)) {
            LogUtil.j("HL_DownloadUtils", "setSharedPreferenceValue directoryName is empty");
            return;
        }
        String strH = h(str);
        if (TextUtils.isEmpty(strH)) {
            LogUtil.j("HL_DownloadUtils", "setSharedPreferenceValue fileName is empty");
            return;
        }
        String str2 = f(strI) + strH;
        if (cbg.f(str2)) {
            LogUtil.j("HL_DownloadUtils", "setSharedPreferenceValue filePath is invalid file isRetry ", Boolean.valueOf(z), " scenario ", str, " filePath ", str2);
            if (z) {
                c("HL_DownloadUtils");
                return;
            }
            return;
        }
        String strQ = CommonUtil.q(str2);
        if (TextUtils.isEmpty(strQ)) {
            LogUtil.j("HL_DownloadUtils", "setSharedPreferenceValue json is empty isRetry ", Boolean.valueOf(z), " scenario ", str);
            if (z) {
                c("HL_DownloadUtils");
                return;
            }
            return;
        }
        ccy.c(g(str), strQ);
        LogUtil.a("HL_DownloadUtils", "setSharedPreferenceValue json ", strQ);
    }

    private String g(String str) {
        String strI = i(str);
        if (TextUtils.isEmpty(strI)) {
            LogUtil.j("HL_DownloadUtils", "getSharedPreferenceKey directoryName is empty");
            return "";
        }
        String strH = h(str);
        if (TextUtils.isEmpty(strH)) {
            LogUtil.j("HL_DownloadUtils", "getSharedPreferenceKey fileName is empty");
            return "";
        }
        return strI + Constants.LINK + strH + Constants.LINK + this.f1466c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    private String i(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_DownloadUtils", "getDirectoryName scenario is empty");
            return "";
        }
        str.hashCode();
        switch (str) {
            case "health_model_task_config.json":
                return "health_model_config";
            case "1":
            case "2":
            case "80":
            case "100":
                return "health_model_task_img";
            case "1000":
                return "health_model_guide_img";
            case "1001":
                return "health_model_update_guide";
            default:
                return "health_model_semantic";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    private String h(String str) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_DownloadUtils", "getImageFileName scenario is empty");
            return "";
        }
        str.hashCode();
        switch (str) {
            case "1":
                b2 = 0;
                break;
            case "2":
                b2 = 1;
                break;
            case "80":
                b2 = 2;
                break;
            case "100":
                b2 = 3;
                break;
            case "1000":
                b2 = 4;
                break;
            case "1001":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3) {
            return "task_image_config.json";
        }
        if (b2 != 4) {
            return b2 != 5 ? str : "update_config.json";
        }
        return "join_config.json";
    }

    private ArrayList<ImageBean> d(JSONArray jSONArray, String str, String str2) {
        boolean z = "1000".equals(str2) || "1001".equals(str2);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        ArrayList<ImageBean> arrayList = new ArrayList<>(16);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("imageScenario");
                if (z || zIsEmpty || str2.equals(strOptString)) {
                    ImageBean imageBean = new ImageBean();
                    imageBean.setVersionRange(jSONObjectOptJSONObject.optString("versionRange"));
                    imageBean.setVersionRangeBeta(jSONObjectOptJSONObject.optString("versionRangeBeta"));
                    imageBean.setId(qrs.a(jSONObjectOptJSONObject.optString("id")));
                    imageBean.setOrder(qrs.a(jSONObjectOptJSONObject.optString(PayPalPaymentIntent.ORDER)));
                    imageBean.setImageScenario(strOptString);
                    imageBean.setPictureList(d(jSONObjectOptJSONObject, str));
                    imageBean.setTextList(cfh.d(jSONObjectOptJSONObject));
                    arrayList.add(imageBean);
                }
            }
        }
        return arrayList;
    }

    private ArrayList<PictureBean> d(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pictureList");
        if (jSONArrayOptJSONArray == null) {
            LogUtil.j("HL_DownloadUtils", "getPictureBeanList jsonArray is null");
            return new ArrayList<>(16);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length <= 0) {
            LogUtil.j("HL_DownloadUtils", "getPictureBeanList length ", Integer.valueOf(length));
            return new ArrayList<>(16);
        }
        ArrayList<PictureBean> arrayList = new ArrayList<>(16);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString(ContentResource.FILE_NAME);
            if (!TextUtils.isEmpty(strOptString)) {
                PictureBean pictureBean = new PictureBean();
                pictureBean.setPath(str + strOptString);
                pictureBean.setSize(jSONObjectOptJSONObject.optLong("size"));
                pictureBean.setMode(jSONObjectOptJSONObject.optInt(Wpt.MODE));
                pictureBean.setScenario(jSONObjectOptJSONObject.optInt(ParsedFieldTag.KAKA_TASK_SCENARIO));
                arrayList.add(pictureBean);
            }
        }
        return arrayList;
    }

    public String e(String str) {
        String strG = g(str);
        if (TextUtils.isEmpty(strG)) {
            LogUtil.j("HL_DownloadUtils", "getSharedPreferenceValue key is empty");
            return "";
        }
        return CommonUtil.ac(ccy.g(strG));
    }

    public ArrayList<ImageBean> a(String str) {
        String strE = e(str);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HL_DownloadUtils", "getImageList value is empty");
            c(str, true);
            return new ArrayList<>(16);
        }
        ArrayList<ImageBean> arrayList = new ArrayList<>(16);
        try {
            arrayList = d(new JSONArray(strE), f(i(str)), str);
        } catch (JSONException e2) {
            LogUtil.e("HL_DownloadUtils", "setImageList exception ", LogAnonymous.b(e2));
        }
        if (njy.e(arrayList)) {
            LogUtil.j("HL_DownloadUtils", "getImageList imageBeanList is empty");
            c(str, true);
            return new ArrayList<>(16);
        }
        LogUtil.d("HL_DownloadUtils", "getImageList imageBeanList ", arrayList);
        return arrayList;
    }

    static class a implements PullListener {
        private final String d;
        private final WeakReference<ccl> e;

        private a(ccl cclVar, String str) {
            this.e = new WeakReference<>(cclVar);
            this.d = str;
        }

        @Override // com.huawei.pluginmgr.filedownload.PullListener
        public void onPullingChange(pis pisVar, pit pitVar) {
            ccl cclVar = this.e.get();
            if (cclVar == null || pitVar == null) {
                LogUtil.j("HL_DownloadUtils", "MyPullListener onPullingChange downloadUtils ", cclVar, " pullResult ", pitVar);
                return;
            }
            int iF = pitVar.f();
            if (iF != 1) {
                if (iF != 0) {
                    LogUtil.j("HL_DownloadUtils", "mUpdateIndexFileListener onPullingChange status ", Integer.valueOf(iF));
                    cbg.d(0L);
                    byn.a(false);
                    cbk.d(this.d, "health_model_index", iF);
                    return;
                }
                return;
            }
            cbk.d(this.d, "health_model_index", 1);
            if (!njy.e(cclVar.d.e())) {
                cclVar.d.e(pitVar.b());
                for (String str : ccl.e) {
                    cclVar.b(str, this.d);
                }
                return;
            }
            LogUtil.j("HL_DownloadUtils", "mUpdateIndexFileListener onPullingChange PluginIndexInfoList is empty");
            cbg.d(0L);
        }
    }
}
