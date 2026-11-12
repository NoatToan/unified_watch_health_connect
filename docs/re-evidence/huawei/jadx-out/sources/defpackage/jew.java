package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginmgr.EzPluginType;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CommonUtil;
import health.compact.a.GrsDownloadPluginUrl;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class jew {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile jew f38508c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38510b;
    private phz e;
    private DynamicTrackDownloadUtils.DownloadResponseCallback j;
    private List<phz> k;
    private jaq l;
    private pia o = new pia(EzPluginType.DYNAMIC_TRACK_CUSTOM_MAP_RESOURCES_TYPE, null);
    private int f = 0;
    private boolean g = false;
    private int m = 0;
    private boolean i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PullListener f38509a = new PullListener() { // from class: jew.3
        @Override // com.huawei.pluginmgr.filedownload.PullListener
        public void onPullingChange(pis pisVar, pit pitVar) {
            if (pitVar == null) {
                LogUtil.e("Track_DynamicTrackMapDownloadUtils", "result is null");
                return;
            }
            int iF = pitVar.f();
            LogUtil.a("Track_DynamicTrackMapDownloadUtils", "download index file status=", Integer.valueOf(iF));
            if (iF != 1) {
                if (iF == 0) {
                    LogUtil.d("Track_DynamicTrackMapDownloadUtils", "download index file status in progress");
                    return;
                }
                LogUtil.j("Track_DynamicTrackMapDownloadUtils", "download index file status fail");
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), iF);
                jew jewVar = jew.this;
                jewVar.d(jewVar.j());
                return;
            }
            jew jewVar2 = jew.this;
            jewVar2.k = jewVar2.o.e();
            if (jew.this.k == null) {
                LogUtil.j("Track_DynamicTrackMapDownloadUtils", "mMapIndexInfo gis null");
                return;
            }
            jew.this.o.e(pitVar.b());
            jew jewVar3 = jew.this;
            jewVar3.e = (phz) jewVar3.k.get(0);
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), 0);
            if (jew.this.h()) {
                if (!CommonUtil.ah(BaseApplication.getContext()) || !jew.this.g) {
                    jew jewVar4 = jew.this;
                    jewVar4.a(jewVar4.m);
                } else {
                    Message messageB = jew.this.b(103, 105);
                    messageB.obj = Integer.valueOf(jew.this.e.b());
                    jew.this.h.sendMessage(messageB);
                }
            }
        }
    };
    private Handler h = new c(Looper.getMainLooper(), this);

    private jew() {
        jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
        this.l = jaqVar;
        String strP = jaqVar.p();
        this.f38510b = strP;
        LogUtil.a("Track_DynamicTrackMapDownloadUtils", " save Version = ", strP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        DynamicTrackDownloadUtils.DownloadResponseCallback downloadResponseCallback;
        int iIntValue = this.f;
        if (message.obj instanceof Integer) {
            iIntValue = ((Integer) message.obj).intValue();
            this.f = iIntValue;
        }
        if (message.arg1 != 105 || (downloadResponseCallback = this.j) == null) {
            return;
        }
        downloadResponseCallback.onProgress(iIntValue);
    }

    public static jew d() {
        if (f38508c == null) {
            synchronized (d) {
                if (f38508c == null) {
                    f38508c = new jew();
                }
            }
        }
        return f38508c;
    }

    public void a(final int i) {
        if (h()) {
            this.m = i;
            String strG = this.e.g();
            this.f38510b = strG;
            this.l.g(strG);
            final String strA = this.e.a();
            this.h.sendMessage(b(102, 105));
            this.o.e(strA, new PullListener() { // from class: jew.1
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                    if (pitVar == null) {
                        LogUtil.j("Track_DynamicTrackMapDownloadUtils", "onPullingChange result is null.");
                        return;
                    }
                    LogUtil.a("Track_DynamicTrackMapDownloadUtils", "result.fetchStatus()= ", Integer.valueOf(pitVar.f()));
                    int iF = pitVar.f();
                    if (iF == 1) {
                        jew.this.b(strA);
                        jew.this.h.sendMessage(jew.this.b(100, 105));
                        if (!jew.this.g) {
                            jew.this.c(jey.c(i), i);
                            jew.this.f();
                        }
                        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), 0);
                        return;
                    }
                    if (iF != 0) {
                        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), iF);
                        jew.this.h.sendMessage(jew.this.b(101, 105));
                        return;
                    }
                    phz phzVarC = jew.this.c(strA);
                    if (!jew.this.g || phzVarC == null) {
                        return;
                    }
                    int iD = phzVarC.b() != 0 ? (pitVar.d() * 100) / phzVarC.b() : 0;
                    if (iD > 99) {
                        iD = 99;
                    }
                    Message messageB = jew.this.b(104, 105);
                    messageB.obj = Integer.valueOf(iD);
                    jew.this.h.sendMessage(messageB);
                }
            });
        }
    }

    public boolean h() {
        if (njy.e(this.k) || njy.e(this.o.e())) {
            return false;
        }
        List<phz> listE = this.o.e();
        this.k = listE;
        if (listE == null) {
            return false;
        }
        this.e = listE.get(0);
        return (!TextUtils.isEmpty(this.f38510b) && this.f38510b.equals(this.e.g()) && new File(jey.b("gaode_map")).exists()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message b(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = i2;
        messageObtain.what = i;
        return messageObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public phz c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_DynamicTrackMapDownloadUtils", "uuid is empty");
            return null;
        }
        List<phz> list = this.k;
        if (list != null) {
            for (phz phzVar : list) {
                if (str.equals(phzVar.a())) {
                    return phzVar;
                }
            }
        }
        return null;
    }

    public void d(DynamicTrackDownloadUtils.DownloadResponseCallback downloadResponseCallback, boolean z) {
        this.g = z;
        this.j = downloadResponseCallback;
        c();
        g();
    }

    public static void e() {
        if (f38508c != null) {
            f38508c.a();
            f38508c = null;
        }
    }

    public void c() {
        LogUtil.a("Track_DynamicTrackMapDownloadUtils", "enter cancelDownloading map");
        for (pis pisVar : piu.c().b()) {
            if (b(pisVar)) {
                pig.c().c(pisVar);
                d(j());
            }
        }
    }

    private boolean b(pis pisVar) {
        List<phz> listE = this.o.e();
        if (njy.e(listE)) {
            LogUtil.j("Track_DynamicTrackMapDownloadUtils", "isDynamicTrackMapTask allIndexInfo is empty");
            return false;
        }
        Iterator<phz> it = listE.iterator();
        while (it.hasNext()) {
            if (pisVar.b().equals(it.next().a())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("Track_DynamicTrackMapDownloadUtils", "downloadIndexFile");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jew.2
                @Override // java.lang.Runnable
                public void run() {
                    jew.this.g();
                }
            });
            return;
        }
        LogUtil.d("Track_DynamicTrackMapDownloadUtils", "downloadIndexFile queryStr:", this.o.e(new GrsDownloadPluginUrl().getDownloadPluginUrl(null, true), (String) null));
        this.o.a(this.f38509a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        LogUtil.a("Track_DynamicTrackMapDownloadUtils", "deleteTempFiles,isDeleted is:", Boolean.valueOf(Utils.e(new File(str))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Utils.d(e(str), i());
    }

    private String i() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(phs.d);
        sb.append("dynamic_track_map_resource");
        sb.append(File.separator);
        return sb.toString();
    }

    private String e(String str) {
        StringBuilder sb = new StringBuilder(16);
        sb.append(i());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String j() {
        return this.o.b().getIndexFileSavePath();
    }

    public String c(String str, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        String strC = Utils.c(jey.d(this.f38510b, jey.a(str)));
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("Track_DynamicTrackMapDownloadUtils", "jsonString = null");
            return strC;
        }
        try {
            JSONObject jSONObject = new JSONObject(strC);
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("styleList");
                String string = jSONObject.getString("version");
                LogUtil.a("Track_DynamicTrackMapDownloadUtils", "Map Version ", string);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    jes jesVar = (jes) new Gson().fromJson(jSONArray.getJSONObject(i2).toString(), jes.class);
                    if (!TextUtils.isEmpty(jesVar.a())) {
                        arrayList.add(jesVar);
                    } else {
                        jesVar.c(jey.a(string, jesVar.k()));
                        jesVar.e(jey.b(string, jesVar.g(), "zh-rCN"));
                        jesVar.d(jey.e(string, str, jesVar.j(), i));
                        if ("gaode_map".equals(str)) {
                            jesVar.b(jey.a(string, str, jesVar.j()));
                        }
                        arrayList.add(jesVar);
                    }
                }
            } catch (JSONException unused) {
                LogUtil.j("Track_DynamicTrackMapDownloadUtils", "JSONException map");
            }
            String json = new Gson().toJson(arrayList);
            new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002)).e(json, i);
            return json;
        } catch (JSONException unused2) {
            LogUtil.j("Track_DynamicTrackMapDownloadUtils", " jsonObject fail ");
            return strC;
        }
    }

    public String f() throws Throwable {
        ArrayList arrayList = new ArrayList();
        String strC = Utils.c(jey.d(this.f38510b, jey.a("mark_config")));
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("Track_DynamicTrackMapDownloadUtils", "jsonString = null");
            return strC;
        }
        try {
            JSONObject jSONObject = new JSONObject(strC);
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("styleList");
                String string = jSONObject.getString("version");
                for (int i = 0; i < jSONArray.length(); i++) {
                    jeq jeqVar = (jeq) new Gson().fromJson(jSONArray.getJSONObject(i).toString(), jeq.class);
                    if (!TextUtils.isEmpty(jeqVar.c())) {
                        jeqVar.b(jey.a(string, jeqVar.e()));
                        arrayList.add(jeqVar);
                    } else {
                        jeqVar.b(jey.a(string, jeqVar.e()));
                        jeqVar.a(jey.a(string, jeqVar.j()));
                        jeqVar.d(jey.a(string, jeqVar.b()));
                        arrayList.add(jeqVar);
                    }
                }
            } catch (JSONException unused) {
                LogUtil.j("Track_DynamicTrackMapDownloadUtils", "JSONException mark");
            }
            String json = new Gson().toJson(arrayList);
            new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002)).c(json);
            return json;
        } catch (JSONException unused2) {
            LogUtil.j("Track_DynamicTrackMapDownloadUtils", "new jsonObject fail");
            return strC;
        }
    }

    public String a(String str) {
        String strB = pjn.b(null);
        String strC = CommonUtil.c(a(str, strB));
        if (strC == null) {
            LogUtil.e("Track_DynamicTrackMapDownloadUtils", "languagePath is null");
            return "en";
        }
        if (!new File(strC).exists()) {
            LogUtil.e("Track_DynamicTrackMapDownloadUtils", "language file is null");
            strB = "en";
        }
        LogUtil.a("Track_DynamicTrackMapDownloadUtils", "language ", strB);
        return strB;
    }

    public String a(String str, String str2) {
        String strSubstring = str.substring(str.length() - 11, str.length() - 5);
        if (strSubstring.equals(str2)) {
            return str;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str.replace(strSubstring, str2);
        }
        LogUtil.j("Track_DynamicTrackMapDownloadUtils", "mCurrentLanguage = null");
        return null;
    }

    public boolean b() {
        return this.i;
    }

    public void a(boolean z) {
        this.i = z;
    }

    public void a() {
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    static class c extends BaseHandler<jew> {
        public c(Looper looper, jew jewVar) {
            super(looper, jewVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(jew jewVar, Message message) {
            if (message == null) {
                LogUtil.e("Track_DynamicTrackMapDownloadUtils", "mHandler msg is null");
            }
            switch (message.what) {
                case 100:
                    if (message.arg1 == 105 && jewVar.j != null) {
                        jewVar.j.onSuccess();
                        break;
                    }
                    break;
                case 101:
                    if (message.arg1 == 105 && jewVar.j != null) {
                        jewVar.j.onFail();
                        break;
                    }
                    break;
                case 102:
                    if (message.arg1 == 105 && jewVar.j != null) {
                        jewVar.j.onStart();
                        break;
                    }
                    break;
                case 103:
                    int iIntValue = message.obj instanceof Integer ? ((Integer) message.obj).intValue() : 0;
                    if (message.arg1 == 105 && jewVar.j != null) {
                        jewVar.j.onMobile(iIntValue);
                        break;
                    }
                    break;
                case 104:
                    jewVar.e(message);
                    break;
            }
        }
    }
}
