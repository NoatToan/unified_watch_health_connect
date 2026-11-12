package com.huawei.healthcloud.plugintrack.trackanimation.download;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.trackanimation.bgm.choosedownload.MusicInformation;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginmgr.EzPluginType;
import com.huawei.pluginmgr.filedownload.PullListener;
import defpackage.jaq;
import defpackage.jev;
import defpackage.njy;
import defpackage.phs;
import defpackage.phz;
import defpackage.pia;
import defpackage.pig;
import defpackage.pis;
import defpackage.pit;
import defpackage.piu;
import health.compact.a.CommonUtil;
import health.compact.a.GrsDownloadPluginUrl;
import health.compact.a.LogAnonymous;
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
public class DynamicTrackDownloadUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f10647a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile DynamicTrackDownloadUtils f10648c;
    private phz d;
    private DownloadResponseCallback e;
    private List<phz> h;
    private DownloadResponseCallback j;
    private String l;
    private pia m = new pia(EzPluginType.DYNAMIC_TRACK_RESOURCES_TYPE, null);
    private int i = 0;
    private boolean g = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PullListener f10649b = new PullListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.3
        @Override // com.huawei.pluginmgr.filedownload.PullListener
        public void onPullingChange(pis pisVar, pit pitVar) {
            if (pitVar == null) {
                LogUtil.e("Track_DynamicTrackDownloadUtils", "result is null");
                return;
            }
            int iF = pitVar.f();
            LogUtil.d("Track_DynamicTrackDownloadUtils", "download index file status=", Integer.valueOf(iF));
            if (iF != 1) {
                if (iF == 0) {
                    LogUtil.d("Track_DynamicTrackDownloadUtils", "download index file status in progress");
                    return;
                }
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), iF);
                LogUtil.j("Track_DynamicTrackDownloadUtils", "download index file status fail");
                DynamicTrackDownloadUtils dynamicTrackDownloadUtils = DynamicTrackDownloadUtils.this;
                dynamicTrackDownloadUtils.d(dynamicTrackDownloadUtils.j());
                return;
            }
            LogUtil.a("Track_DynamicTrackDownloadUtils", "onPullingChange download index file status is success");
            DynamicTrackDownloadUtils dynamicTrackDownloadUtils2 = DynamicTrackDownloadUtils.this;
            dynamicTrackDownloadUtils2.h = dynamicTrackDownloadUtils2.m.e();
            if (DynamicTrackDownloadUtils.this.h == null) {
                LogUtil.e("Track_DynamicTrackDownloadUtils", "mIndexInfo is null");
                return;
            }
            DynamicTrackDownloadUtils.this.m.e(pitVar.b());
            DynamicTrackDownloadUtils dynamicTrackDownloadUtils3 = DynamicTrackDownloadUtils.this;
            dynamicTrackDownloadUtils3.d = (phz) dynamicTrackDownloadUtils3.h.get(0);
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), 0);
            if (DynamicTrackDownloadUtils.this.g()) {
                if (!CommonUtil.ah(BaseApplication.getContext()) || !DynamicTrackDownloadUtils.this.g) {
                    DynamicTrackDownloadUtils.this.c();
                    return;
                }
                Message messageA = DynamicTrackDownloadUtils.this.a(103, 105);
                messageA.obj = Integer.valueOf(DynamicTrackDownloadUtils.this.d.b());
                DynamicTrackDownloadUtils.this.f.sendMessage(messageA);
            }
        }
    };
    private Handler f = new b(Looper.getMainLooper(), this);
    private jaq o = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));

    public interface DownloadResponseCallback {
        void onFail();

        void onMobile(int i);

        void onProgress(int i);

        void onStart();

        void onSuccess();
    }

    private DynamicTrackDownloadUtils() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.1
            @Override // java.lang.Runnable
            public void run() {
                DynamicTrackDownloadUtils dynamicTrackDownloadUtils = DynamicTrackDownloadUtils.this;
                dynamicTrackDownloadUtils.l = dynamicTrackDownloadUtils.o.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        DownloadResponseCallback downloadResponseCallback;
        DownloadResponseCallback downloadResponseCallback2;
        int iIntValue = this.i;
        if (message.obj instanceof Integer) {
            iIntValue = ((Integer) message.obj).intValue();
            this.i = iIntValue;
        }
        if (message.arg1 == 110 && (downloadResponseCallback2 = this.j) != null) {
            downloadResponseCallback2.onProgress(iIntValue);
        } else {
            if (message.arg1 != 105 || (downloadResponseCallback = this.e) == null) {
                return;
            }
            downloadResponseCallback.onProgress(iIntValue);
        }
    }

    public static DynamicTrackDownloadUtils b() {
        if (f10648c == null) {
            synchronized (f10647a) {
                if (f10648c == null) {
                    f10648c = new DynamicTrackDownloadUtils();
                }
            }
        }
        return f10648c;
    }

    public void c() {
        if (g()) {
            String strG = this.d.g();
            this.l = strG;
            this.o.h(strG);
            final String strA = this.d.a();
            this.f.sendMessage(a(102, 105));
            this.m.e(strA, new PullListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.4
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                    if (pitVar == null) {
                        LogUtil.j("Track_DynamicTrackDownloadUtils", "onPullingChange result is null.");
                        return;
                    }
                    int iF = pitVar.f();
                    if (iF == 1) {
                        DynamicTrackDownloadUtils.this.a(strA);
                        DynamicTrackDownloadUtils.this.f.sendMessage(DynamicTrackDownloadUtils.this.a(100, 105));
                        if (!DynamicTrackDownloadUtils.this.g) {
                            DynamicTrackDownloadUtils.this.f();
                        }
                        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), 0);
                        return;
                    }
                    if (iF != 0) {
                        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), iF);
                        DynamicTrackDownloadUtils.this.f.sendMessage(DynamicTrackDownloadUtils.this.a(101, 105));
                        return;
                    }
                    phz phzVarB = DynamicTrackDownloadUtils.this.b(strA);
                    if (!DynamicTrackDownloadUtils.this.g || phzVarB == null) {
                        return;
                    }
                    int iD = phzVarB.b() != 0 ? (pitVar.d() * 100) / phzVarB.b() : 0;
                    if (iD > 99) {
                        iD = 99;
                    }
                    Message messageA = DynamicTrackDownloadUtils.this.a(104, 105);
                    messageA.obj = Integer.valueOf(iD);
                    DynamicTrackDownloadUtils.this.f.sendMessage(messageA);
                }
            });
        }
    }

    public boolean g() {
        if (njy.e(this.h) || njy.e(this.m.e())) {
            return false;
        }
        List<phz> listE = this.m.e();
        this.h = listE;
        if (listE == null) {
            return false;
        }
        this.d = listE.get(0);
        return (!TextUtils.isEmpty(this.l) && this.l.equals(this.d.g()) && new File(jev.d()).exists()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message a(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = i2;
        messageObtain.what = i;
        return messageObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public phz b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_DynamicTrackDownloadUtils", "uuid is empty");
            return null;
        }
        List<phz> list = this.h;
        if (list != null) {
            for (phz phzVar : list) {
                if (str.equals(phzVar.a())) {
                    return phzVar;
                }
            }
        }
        return null;
    }

    public void b(String str, DownloadResponseCallback downloadResponseCallback) {
        phz next;
        this.j = downloadResponseCallback;
        if (CommonUtil.ah(BaseApplication.getContext())) {
            if (this.h == null) {
                LogUtil.e("Track_DynamicTrackDownloadUtils", "mIndexInfo is null, try get info from cache again");
                List<phz> listE = this.m.e();
                if (listE == null) {
                    listE = new ArrayList<>();
                }
                this.h = listE;
            }
            Iterator<phz> it = this.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next == null) {
                    LogUtil.e("Track_DynamicTrackDownloadUtils", "ezPluginIndexInfo is null");
                } else if (next.a().equals(str)) {
                    break;
                }
            }
            Message messageA = a(103, 110);
            messageA.obj = Integer.valueOf(next != null ? next.b() : 0);
            this.f.sendMessage(messageA);
            return;
        }
        e(str, downloadResponseCallback);
    }

    public void e(final String str, DownloadResponseCallback downloadResponseCallback) {
        this.j = downloadResponseCallback;
        LogUtil.d("Track_DynamicTrackDownloadUtils", "enter downloadZipFileOneByOne index:", str);
        this.f.sendMessage(a(102, 110));
        this.m.e(str, new PullListener() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.2
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                if (pitVar == null) {
                    LogUtil.j("Track_DynamicTrackDownloadUtils", "onPullingChange result is null");
                    return;
                }
                int iF = pitVar.f();
                if (iF == 1) {
                    DynamicTrackDownloadUtils.this.a(str);
                    DynamicTrackDownloadUtils.this.f.sendMessage(DynamicTrackDownloadUtils.this.a(100, 110));
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), 0);
                } else {
                    if (iF != 0) {
                        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_DYNAMIC_TRAJECTORY_MUSIC_DOWNLOAD_85070015.value(), iF);
                        DynamicTrackDownloadUtils.this.f.sendMessage(DynamicTrackDownloadUtils.this.a(101, 110));
                        return;
                    }
                    phz phzVarB = DynamicTrackDownloadUtils.this.b(str);
                    if (phzVarB != null) {
                        int iD = phzVarB.b() != 0 ? (pitVar.d() * 100) / phzVarB.b() : 0;
                        if (iD > 99) {
                            iD = 99;
                        }
                        Message messageA = DynamicTrackDownloadUtils.this.a(104, 110);
                        messageA.obj = Integer.valueOf(iD);
                        DynamicTrackDownloadUtils.this.f.sendMessage(messageA);
                    }
                }
            }
        });
    }

    public void c(DownloadResponseCallback downloadResponseCallback, boolean z) {
        this.g = z;
        this.e = downloadResponseCallback;
        a();
        i();
    }

    public static void d() {
        if (f10648c != null) {
            f10648c.e();
            f10648c = null;
        }
    }

    public void a() {
        LogUtil.a("Track_DynamicTrackDownloadUtils", "enter cancelDownloading");
        for (pis pisVar : piu.c().b()) {
            if (b(pisVar)) {
                pig.c().c(pisVar);
                d(j());
            }
        }
    }

    private boolean b(pis pisVar) {
        List<phz> listE = this.m.e();
        if (njy.e(listE)) {
            LogUtil.j("Track_DynamicTrackDownloadUtils", "isDynamicTrackTask allIndexInfo is empty");
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
    public void i() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils.5
                @Override // java.lang.Runnable
                public void run() {
                    DynamicTrackDownloadUtils.this.i();
                }
            });
            return;
        }
        LogUtil.d("Track_DynamicTrackDownloadUtils", "downloadIndexFile,queryStr:", this.m.e(new GrsDownloadPluginUrl().getDownloadPluginUrl(null, true), (String) null));
        this.m.a(this.f10649b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        LogUtil.a("Track_DynamicTrackDownloadUtils", "deleteTempFiles,isDeleted is:", Boolean.valueOf(Utils.e(new File(str))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Utils.d(c(str), h());
    }

    private String h() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(phs.d);
        sb.append("dynamic_track_music_resource");
        sb.append(File.separator);
        return sb.toString();
    }

    private String c(String str) {
        StringBuilder sb = new StringBuilder(16);
        sb.append(h());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String j() {
        return this.m.b().getIndexFileSavePath();
    }

    public String f() throws Throwable {
        List<String> listE = Utils.e(jev.a());
        Gson gson = new Gson();
        jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
        ArrayList arrayList = new ArrayList(listE.size());
        String strC = Utils.c(jev.c());
        if (TextUtils.isEmpty(strC)) {
            return strC;
        }
        try {
            JSONObject jSONObject = new JSONObject(strC);
            for (String str : listE) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    MusicInformation musicInformation = (MusicInformation) gson.fromJson(jSONArray.getJSONObject(i).toString(), MusicInformation.class);
                    musicInformation.setMusicBackgroundPath(jev.e(str));
                    if (musicInformation.getIsDefault()) {
                        musicInformation.setIsSelected(true);
                        musicInformation.setIsDownloaded(true);
                        StringBuilder sb = new StringBuilder(16);
                        sb.append(jev.e());
                        sb.append(str);
                        sb.append(".");
                        sb.append("aac");
                        musicInformation.setMusicResourcePath(sb.toString());
                        arrayList.add(0, musicInformation);
                        jaqVar.b(jev.a(musicInformation.getMusicName(), musicInformation.getIsDefault()));
                    } else {
                        arrayList.add(musicInformation);
                    }
                }
            }
        } catch (JSONException e) {
            LogUtil.e("Track_DynamicTrackDownloadUtils", "resolvePackageResource,", LogAnonymous.b(e));
        }
        arrayList.add(0, new MusicInformation());
        String json = new Gson().toJson(arrayList);
        jaqVar.e(json);
        return json;
    }

    public void e() {
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    static class b extends BaseHandler<DynamicTrackDownloadUtils> {
        public b(Looper looper, DynamicTrackDownloadUtils dynamicTrackDownloadUtils) {
            super(looper, dynamicTrackDownloadUtils);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(DynamicTrackDownloadUtils dynamicTrackDownloadUtils, Message message) {
            if (message == null) {
                LogUtil.j("Track_DynamicTrackDownloadUtils", "mHandler msg is null");
            } else {
                i(dynamicTrackDownloadUtils, message);
            }
        }

        private void i(DynamicTrackDownloadUtils dynamicTrackDownloadUtils, Message message) {
            switch (message.what) {
                case 100:
                    e(dynamicTrackDownloadUtils, message);
                    break;
                case 101:
                    b(dynamicTrackDownloadUtils, message);
                    break;
                case 102:
                    d(dynamicTrackDownloadUtils, message);
                    break;
                case 103:
                    c(dynamicTrackDownloadUtils, message);
                    break;
                case 104:
                    dynamicTrackDownloadUtils.d(message);
                    break;
            }
        }

        private void c(DynamicTrackDownloadUtils dynamicTrackDownloadUtils, Message message) {
            int iIntValue = message.obj instanceof Integer ? ((Integer) message.obj).intValue() : 0;
            if (message.arg1 != 110 || dynamicTrackDownloadUtils.j == null) {
                if (message.arg1 != 105 || dynamicTrackDownloadUtils.e == null) {
                    return;
                }
                dynamicTrackDownloadUtils.e.onMobile(iIntValue);
                return;
            }
            dynamicTrackDownloadUtils.j.onMobile(iIntValue);
        }

        private void e(DynamicTrackDownloadUtils dynamicTrackDownloadUtils, Message message) {
            if (message.arg1 != 110 || dynamicTrackDownloadUtils.j == null) {
                if (message.arg1 != 105 || dynamicTrackDownloadUtils.e == null) {
                    return;
                }
                dynamicTrackDownloadUtils.e.onSuccess();
                return;
            }
            dynamicTrackDownloadUtils.j.onSuccess();
        }

        private void b(DynamicTrackDownloadUtils dynamicTrackDownloadUtils, Message message) {
            if (message.arg1 != 110 || dynamicTrackDownloadUtils.j == null) {
                if (message.arg1 != 105 || dynamicTrackDownloadUtils.e == null) {
                    return;
                }
                dynamicTrackDownloadUtils.e.onFail();
                return;
            }
            dynamicTrackDownloadUtils.j.onFail();
        }

        private void d(DynamicTrackDownloadUtils dynamicTrackDownloadUtils, Message message) {
            if (message.arg1 != 110 || dynamicTrackDownloadUtils.j == null) {
                if (message.arg1 != 105 || dynamicTrackDownloadUtils.e == null) {
                    return;
                }
                dynamicTrackDownloadUtils.e.onStart();
                return;
            }
            dynamicTrackDownloadUtils.j.onStart();
        }
    }
}
