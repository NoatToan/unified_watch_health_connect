package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.common.Constant;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.medal.model.TrackData;
import com.huawei.policy.MedalSyncPolicy;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class prd implements MedalSyncPolicy, AchieveDeviceApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile prd f45852c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f45853a;
    private int e;

    public static prd a() {
        if (f45852c == null) {
            synchronized (d) {
                if (f45852c == null) {
                    f45852c = new prd();
                }
            }
        }
        return f45852c;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void pingDevice(final String str) {
        lkr.b().pingComand(new PingCallback() { // from class: prd.2
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public void onPingResult(int i) {
                LogUtil.a("MedalSyncPolicyControl", "pingDevice pkg == ", str, " code = ", Integer.valueOf(i));
            }
        }, str);
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void syncInit() {
        LogUtil.a("MedalSyncPolicyControl", "syncInit HwSyncDeviceMgr = ");
        lkr.b();
        lku.a();
        if (Utils.o()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: prd.4
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    prd.this.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() throws Throwable {
        HashMap map = new HashMap(16);
        pax.a(map);
        String str = xjh.f53111c + File.separator;
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.e("MedalSyncPolicyControl", "mkdirResult is fail");
            return;
        }
        for (int i = 0; i < 19; i++) {
            if (map.size() > i) {
                int i2 = i + 1;
                e(str, i2, ((Integer) map.get(String.valueOf(i2))).intValue());
            }
        }
    }

    private void e(String str, int i, int i2) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpenRawResource = BaseApplication.b().getResources().openRawResource(i2);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource);
        File file = new File(str + i + "_lightListStyle.png");
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!file.createNewFile()) {
                    LogUtil.j("MedalSyncPolicyControl", "File ", file.getPath(), " already exists");
                    d(fileOutputStream2);
                } else {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        d(fileOutputStream);
                    } catch (FileNotFoundException unused) {
                        fileOutputStream2 = fileOutputStream;
                        LogUtil.e("MedalSyncPolicyControl", "saveImage FileNotFoundException");
                        d(fileOutputStream2);
                    } catch (IOException unused2) {
                        fileOutputStream2 = fileOutputStream;
                        LogUtil.e("MedalSyncPolicyControl", "saveImage IOException");
                        d(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        d(fileOutputStream);
                        a(inputStreamOpenRawResource);
                        bitmapDecodeStream.recycle();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        }
        a(inputStreamOpenRawResource);
        bitmapDecodeStream.recycle();
    }

    private static void d(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e("MedalSyncPolicyControl", "closeStream, IOException");
            }
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("MedalSyncPolicyControl", "closeInputStream IOException,closing failure");
            }
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void sendMessageToDevice(final int i) {
        LogUtil.a("MedalSyncPolicyControl", "sendMessageToDevice enter.");
        lkr.b().pingComand(new PingCallback() { // from class: prd.5
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public void onPingResult(int i2) {
                LogUtil.a("MedalSyncPolicyControl", "pingDevice pkg == ", "com.huawei.sport.workout", " code = ", Integer.valueOf(i2));
                if (i2 == 202) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: prd.5.4
                        @Override // java.lang.Runnable
                        public void run() {
                            prd.this.a(i, "");
                        }
                    }, 200L);
                }
            }
        }, "com.huawei.sport.workout");
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void sendMessageToDevice(int i, String str, String str2, BaseResponseCallback<Boolean> baseResponseCallback) {
        LogUtil.a("MedalSyncPolicyControl", "sendMessageToDevice enter.");
        boolean zC = lku.c(155);
        LogUtil.a("MedalSyncPolicyControl", "sendMessageToDevice isSupportSportDevice: ", Boolean.valueOf(zC));
        if (zC) {
            if (!new File(xjh.c(str)).exists()) {
                LogUtil.j("MedalSyncPolicyControl", "checkMedalPath medalId ", str, " isPngExists false!");
                baseResponseCallback.onResponse(0, false);
            } else {
                baseResponseCallback.onResponse(0, true);
                e(str);
            }
        } else {
            baseResponseCallback.onResponse(0, false);
        }
        if (str2.length() < 3 || pax.n(str2)) {
            d(i, str, "com.huawei.sport.workout");
        }
    }

    private void e(final String str) {
        lku.a().pingComand(new PingCallback() { // from class: prd.3
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public void onPingResult(int i) {
                LogUtil.a("MedalSyncPolicyControl", "pingMessageDevice pkg == ", "com.huawei.sport.dailytrack", " code = ", Integer.valueOf(i));
                if (i != 202) {
                    LogUtil.j("MedalSyncPolicyControl", "pingMessageDevice fail!");
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: prd.3.5
                    @Override // java.lang.Runnable
                    public void run() {
                        prd.this.a(5, str);
                    }
                }, 200L);
            }
        }, "com.huawei.sport.dailytrack");
    }

    private void d(final int i, final String str, final String str2) {
        lkr.b().pingComand(new PingCallback() { // from class: prd.8
            @Override // com.huawei.health.deviceconnect.callback.PingCallback
            public void onPingResult(int i2) {
                LogUtil.a("MedalSyncPolicyControl", "pingDevice pkg == ", str2, " code = ", Integer.valueOf(i2));
                if (i2 != 202) {
                    LogUtil.j("MedalSyncPolicyControl", "pingDevice fail!");
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: prd.8.4
                    @Override // java.lang.Runnable
                    public void run() {
                        prd.this.a(i, str);
                    }
                }, 200L);
            }
        }, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        LogUtil.j("MedalSyncPolicyControl", "startSync，action == ", Integer.valueOf(i));
        if (i == 2) {
            onLightMedalStart(new obb(b(), i, 1));
            return;
        }
        if (i == 3) {
            d(i);
        } else {
            if (i != 5) {
                return;
            }
            obb obbVar = new obb(b(), i, 1);
            obbVar.a(str);
            onLightMedalMessageListStart(obbVar);
        }
    }

    private String b() {
        String strReplaceAll = UUID.randomUUID().toString().replaceAll(Constants.LINK, "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            strReplaceAll = Constant.BROWSE_HUID;
        }
        return strReplaceAll.length() > 10 ? strReplaceAll.substring(0, 10) : strReplaceAll;
    }

    private void d(int i) {
        if (this.e == 0 || d()) {
            obb obbVar = new obb(b(), i, 1);
            LogUtil.a("MedalSyncPolicyControl", "Start Syncing..");
            this.e = 1;
            onSyncMedalsStart(obbVar);
            return;
        }
        LogUtil.j("MedalSyncPolicyControl", "Last Sync Task Is Not Finish!");
    }

    private boolean d() {
        if (this.f45853a == 0 || System.currentTimeMillis() - this.f45853a <= 30000) {
            return false;
        }
        LogUtil.j("MedalSyncPolicyControl", "Last Sync Task isSyncOutTime 0.5mins.");
        this.f45853a = 0L;
        return true;
    }

    @Override // com.huawei.policy.MedalSyncPolicy
    public void receiveFromDevice(int i, xiu xiuVar) {
        String str;
        int iA;
        LogUtil.a("MedalSyncPolicyControl", "receiveFromDevice errorCode ", Integer.valueOf(i));
        if (i != 530003) {
            return;
        }
        if (xiuVar == null || xiuVar.b() == null) {
            LogUtil.e("MedalSyncPolicyControl", "receiveFromDevice Message is null");
            return;
        }
        try {
            str = new String(xiuVar.b(), "UTF_8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("MedalSyncPolicyControl", "receiveFromDevice get message data error!");
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.a("MedalSyncPolicyControl", "receiveFromDevice Message == ", str);
        try {
            iA = osv.a("action", new JSONObject(str));
        } catch (JSONException e) {
            LogUtil.e("MedalSyncPolicyControl", "receiveFromDevice Exception:", e.getMessage());
            iA = 0;
        }
        LogUtil.a("MedalSyncPolicyControl", "receiveFromDevice action == ", Integer.valueOf(iA));
        if (iA == 1) {
            onLightMedalListStart((oaw) new Gson().fromJson(str, oaz.class));
            return;
        }
        if (iA == 2) {
            onLightMedalStart((oaw) new Gson().fromJson(str, oaz.class));
            return;
        }
        if (iA == 3) {
            onSyncMedalsStart((oaw) new Gson().fromJson(str, oaz.class));
        } else if (iA == 4) {
            onLaunchPageStart((oaw) new Gson().fromJson(str, oaz.class));
        } else {
            if (iA != 5) {
                return;
            }
            onLightMedalMessageListStart((oaw) new Gson().fromJson(str, obd.class));
        }
    }

    @Override // com.huawei.policy.MedalSyncPolicy
    public void onSyncMedalsStart(oaw oawVar) {
        ThreadPoolManager.c().execute(new qgi(oawVar));
    }

    @Override // com.huawei.policy.MedalSyncPolicy
    public void onLightMedalStart(oaw oawVar) {
        ThreadPoolManager.c().execute(new qge(oawVar));
    }

    @Override // com.huawei.policy.MedalSyncPolicy
    public void onLightMedalListStart(oaw oawVar) {
        if (oawVar == null) {
            LogUtil.j("MedalSyncPolicyControl", "basicMessage is null");
            return;
        }
        LogUtil.a("MedalSyncPolicyControl", "State ", Integer.valueOf(oawVar.c()), " mSyncStatus == ", Integer.valueOf(this.e));
        if (oawVar.c() == 1 && this.e == 1) {
            oawVar.e(401);
        }
        ThreadPoolManager.c().execute(new qgf(oawVar));
    }

    @Override // com.huawei.policy.MedalSyncPolicy
    public void onLightMedalMessageListStart(oaw oawVar) {
        ThreadPoolManager.c().execute(new qgh(oawVar));
    }

    @Override // com.huawei.policy.MedalSyncPolicy
    public void onLaunchPageStart(oaw oawVar) {
        ThreadPoolManager.c().execute(new qgd(oawVar));
    }

    public void a(int i) {
        this.e = i;
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void sendMessageToDeviceForPackage(final int i) {
        LogUtil.a("MedalSyncPolicyControl", "sendMessageToDeviceForPackage enter.");
        if (i == 1 || i == 2) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: prd.9
                @Override // java.lang.Runnable
                public void run() {
                    prd.this.b(i);
                }
            });
        } else {
            if (i != 3) {
                return;
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: prd.7
                @Override // java.lang.Runnable
                public void run() {
                    prd.this.e();
                }
            });
        }
    }

    @Override // com.huawei.health.baseapi.pluginachievement.baseapi.AchieveDeviceApi
    public void dealAchieveTrackData(ArrayList<TrackData> arrayList) {
        oay.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        List<osf> listD = otl.b(BaseApplication.b()).d(9, new HashMap(2));
        if (listD == null) {
            return;
        }
        LogUtil.a("MedalSyncPolicyControl", "medalConfigInfos size ", Integer.valueOf(listD.size()));
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (medalConfigInfo.acquireMedalType().length() < 3) {
                    String strAcquireMedalID = medalConfigInfo.acquireMedalID();
                    if (oun.d(strAcquireMedalID) <= 19) {
                        d(strAcquireMedalID);
                    }
                }
            }
        }
    }

    private void d(String str) {
        Task<ouq> taskObtainMedalInfo = axa.a().obtainMedalInfo(str);
        if (taskObtainMedalInfo == null) {
            LogUtil.j("MedalSyncPolicyControl", "startSyncMedalsForPackage getMedalConfig is null");
        } else {
            taskObtainMedalInfo.addOnSuccessListener(new OnSuccessListener<ouq>() { // from class: prd.6
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ouq ouqVar) {
                    LogUtil.a("MedalSyncPolicyControl", "startSyncMedalsForPackage zipPath == ", xjh.b(ouqVar, Constant.BROWSE_HUID));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (i == 1) {
            axa.a().obtainMedalGainStatus(null).addOnSuccessListener(new OnSuccessListener<ArrayList<our>>() { // from class: prd.1
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ArrayList<our> arrayList) {
                    if (njy.e(arrayList)) {
                        return;
                    }
                    LogUtil.a("MedalSyncPolicyControl", "lightlist zipPath dazhuang ", xjh.c(xjh.e, i, arrayList, Constant.BROWSE_HUID));
                }
            });
        } else {
            if (i != 2) {
                return;
            }
            axa.a().obtainCurrentMedalGainStatus(null).addOnSuccessListener(new OnSuccessListener<ArrayList<our>>() { // from class: prd.10
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ArrayList<our> arrayList) {
                    if (njy.e(arrayList)) {
                        return;
                    }
                    LogUtil.a("MedalSyncPolicyControl", "light zipPath dazhuang ", xjh.c(xjh.e, i, arrayList, Constant.BROWSE_HUID));
                }
            });
        }
    }
}
