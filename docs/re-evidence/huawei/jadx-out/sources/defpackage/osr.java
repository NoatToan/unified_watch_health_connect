package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.gltexture.impl.AchieveMedalCallBack;
import com.huawei.pluginachievement.gltexture.util.FileUtil;
import com.huawei.pluginachievement.manager.model.MedalBasic;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f44659c;
    private static volatile osr e;
    private otl j;
    private Map<String, Integer> f = Collections.synchronizedMap(new HashMap(2));
    private ArrayList<String> i = new ArrayList<>(0);
    private Map<String, String> g = new HashMap(0);
    private volatile boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicInteger f44660a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f44661b = Executors.newSingleThreadExecutor();

    private osr() {
    }

    public static osr e(Context context) {
        if (f44659c == null) {
            f44659c = context.getApplicationContext();
        }
        if (e == null) {
            synchronized (osr.class) {
                if (e == null) {
                    e = new osr();
                }
            }
        }
        return e;
    }

    public boolean b() {
        return this.j != null;
    }

    public void a(otl otlVar) {
        if (otlVar != null) {
            this.j = otlVar;
        }
    }

    public void e() {
        LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "enter downTextureRes");
        String strE = osa.e(f44659c, "_medalTextureDownload");
        if (TextUtils.isEmpty(osa.e(f44659c, "medalZipDelete")) && !TextUtils.isEmpty(strE)) {
            final FileUtil fileUtil = new FileUtil(f44659c);
            if (this.f44661b.isShutdown()) {
                this.f44661b = Executors.newSingleThreadExecutor();
            }
            this.f44661b.execute(new Runnable() { // from class: osr.4
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    try {
                        str = osr.f44659c.getFilesDir().getCanonicalPath() + File.separator + "achievemedal";
                    } catch (IOException unused) {
                        LogUtil.e("PLGACHIEVE_AchieveMedalDownload", "getCanonicalPath IOException");
                        str = null;
                    }
                    fileUtil.d(str);
                    osa.b(osr.f44659c, "medalZipDelete", "done");
                }
            });
        }
        if (1 != CommonUtil.o(f44659c)) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "getNetEnvironment is not WIFI");
            return;
        }
        if (!TextUtils.isEmpty(osa.e(f44659c, "clearMedalResCache"))) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "clearCache is done!");
        } else {
            if ("doing".equals(osa.e(f44659c, "_medalTextureStatusDownloadDoing"))) {
                return;
            }
            osa.b(f44659c, "_medalTextureStatusDownloadDoing", "doing");
            g();
        }
    }

    private void d() {
        LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "enter download");
        FileUtil fileUtil = new FileUtil(f44659c);
        ArrayList<String> arrayList = this.i;
        if (arrayList == null || arrayList.size() == 0) {
            f();
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "exit download");
            return;
        }
        int size = this.i.size();
        if (this.g != null) {
            osa.b(f44659c, "_medalTextureStatusDownloadDoing", "doing");
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "enter download file length= ", Integer.valueOf(size));
            String str = this.i.get(size - 1);
            for (String str2 : this.i) {
                e(str2, this.g.get(str2), str, fileUtil);
            }
            if (this.i.size() > 0) {
                j();
            }
            pbo.d(this.f44661b);
        }
    }

    private void j() {
        this.d = false;
        final Timer timer = new Timer("PLGACHIEVE_AchieveMedalDownload");
        final int[] iArr = {0};
        timer.scheduleAtFixedRate(new TimerTask() { // from class: osr.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int[] iArr2 = iArr;
                iArr2[0] = iArr2[0] + 1;
                LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "medalDownloadChecker: " + iArr[0]);
                if (osr.this.d || ((iArr[0] >= 6 && CommonUtil.x(BaseApplication.getContext())) || iArr[0] >= 180)) {
                    if (osr.this.f44661b != null) {
                        LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "shutdownNow executor");
                        osr.this.f44661b.shutdownNow();
                    }
                    timer.cancel();
                    LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "medalDownloadChecker finish.");
                }
            }
        }, 10000L, 10000L);
    }

    public void c(final String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "medalId is null");
            return;
        }
        if (1 != CommonUtil.o(f44659c)) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "getNetEnvironment is not WIFI");
            return;
        }
        if (TextUtils.isEmpty(osa.e(f44659c, "clearMedalResCache"))) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "clearCache is null!");
            return;
        }
        if (!"doing".equals(osa.e(f44659c, "_medalTextureStatusDownloadDoing"))) {
            osa.b(f44659c, "_medalTextureStatusDownloadDoing", "doing");
            final FileUtil fileUtil = new FileUtil(f44659c);
            final otl otlVarB = otl.b(BaseApplication.getContext());
            if (this.f44661b.isShutdown()) {
                this.f44661b = Executors.newSingleThreadExecutor();
            }
            this.f44661b.execute(new Runnable() { // from class: osr.1
                @Override // java.lang.Runnable
                public void run() {
                    HashMap map = new HashMap(2);
                    map.put("medalID", str);
                    osf osfVarB = otlVarB.b(7, map);
                    if (!(osfVarB instanceof MedalBasic)) {
                        osr.this.f();
                    } else {
                        osr.this.e(str, ((MedalBasic) osfVarB).acquireVeinUrl(), fileUtil);
                    }
                }
            });
            pbo.d(this.f44661b);
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "DOING_DOWNLOAD");
    }

    private void e(final String str, final String str2, final String str3, final FileUtil fileUtil) {
        if (this.f44661b.isShutdown()) {
            this.f44661b = Executors.newSingleThreadExecutor();
        }
        this.f44661b.execute(new Runnable() { // from class: osr.3
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (1 == CommonUtil.o(osr.f44659c)) {
                    if (osr.this.f.get(str) != null && ((Integer) osr.this.f.get(str)).intValue() != 0) {
                        if (str.equals(str3)) {
                            osa.b(osr.f44659c, "_medalTextureStatusDownloadDoing", "done");
                            osr.this.d = true;
                            return;
                        }
                        return;
                    }
                    fileUtil.d(str2, str, new AchieveMedalCallBack() { // from class: osr.3.5
                        @Override // com.huawei.pluginachievement.gltexture.impl.AchieveMedalCallBack
                        public void onResponse(int i) {
                            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "download resCode", Integer.valueOf(i), str);
                            if (i == 0) {
                                if (osr.this.f.get(str) != null) {
                                    LogUtil.d("PLGACHIEVE_AchieveMedalDownload", "medalName download success!");
                                    osr.this.b(str);
                                }
                            } else {
                                LogUtil.j("PLGACHIEVE_AchieveMedalDownload", "DownMedals fail! ", str);
                                osr.this.f44660a.incrementAndGet();
                            }
                            if (str.equals(str3) || osr.this.f44660a.get() >= 6) {
                                LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "download finish or failures reaches the upper limit. failCount = " + osr.this.f44660a.get());
                                osa.b(osr.f44659c, "_medalTextureStatusDownloadDoing", "done");
                                osr.this.d = true;
                            }
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, final String str2, final FileUtil fileUtil) {
        if (this.f44661b.isShutdown()) {
            this.f44661b = Executors.newSingleThreadExecutor();
        }
        try {
            this.f44661b.execute(new Runnable() { // from class: osr.5
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    if (1 == CommonUtil.o(osr.f44659c)) {
                        fileUtil.d(str2, str, new AchieveMedalCallBack() { // from class: osr.5.2
                            @Override // com.huawei.pluginachievement.gltexture.impl.AchieveMedalCallBack
                            public void onResponse(int i) {
                                LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "download resCode", Integer.valueOf(i), str);
                                if (i == 0) {
                                    if (osr.this.f.get(str) != null) {
                                        LogUtil.d("PLGACHIEVE_AchieveMedalDownload", "medalName download success!");
                                        osr.this.b(str);
                                    }
                                    osr.this.f44660a.set(0);
                                }
                                osa.b(osr.f44659c, "_medalTextureStatusDownloadDoing", "done");
                            }
                        });
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            LogUtil.e("PLGACHIEVE_AchieveMedalDownload", "downloadSingleByMedalId RejectedExecutionException.");
        }
    }

    private void g() {
        LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "enter getMedalData");
        final otl otlVarB = otl.b(BaseApplication.getContext());
        ArrayList<String> arrayList = this.i;
        if (arrayList != null && arrayList.size() != 0) {
            this.i.clear();
        }
        if (this.f44661b.isShutdown()) {
            this.f44661b = Executors.newSingleThreadExecutor();
        }
        this.f44661b.execute(new Runnable() { // from class: osr.7
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap(2);
                List<osf> listD = otlVarB.d(7, map);
                if (listD == null) {
                    LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "getData data is null ");
                    osr.this.f();
                    return;
                }
                int size = listD.size();
                if (size != 0 && size < 19) {
                    LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "get medal");
                    osa.b(osr.f44659c, "medalIsException", "done");
                    oun.d(osr.f44659c);
                    HashMap map2 = new HashMap(2);
                    map2.put("countryCode", LoginInit.getInstance(osr.f44659c).getAccountInfo(1010));
                    otlVarB.a(8, map2);
                }
                LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "getData data size is", Integer.valueOf(size));
                ArrayList arrayListA = osr.this.a(otlVarB.d(8, map), otlVarB.d(9, map));
                Iterator<osf> it = listD.iterator();
                while (it.hasNext()) {
                    osr.this.d((MedalBasic) it.next(), (ArrayList<String>) arrayListA);
                }
                osr.this.n();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        String strE = osa.e(f44659c, "_medalTextureDownload");
        if (TextUtils.isEmpty(strE)) {
            h();
        } else {
            d(strE);
            if (c()) {
                f();
                LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "allMedalTexture is Download!");
                return;
            }
        }
        synchronized (this) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<String> a(List<osf> list, List<osf> list2) {
        ArrayList<String> arrayList = new ArrayList<>(0);
        if (list == null || list2 == null) {
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "medalLocation or medalConfigInfoList is null");
            return arrayList;
        }
        for (osf osfVar : list) {
            if (osfVar instanceof MedalLocation) {
                MedalLocation medalLocation = (MedalLocation) osfVar;
                if (medalLocation.acquireGainedCount() > 0 && pax.h(medalLocation.acquireMedalID())) {
                    arrayList.add(medalLocation.acquireMedalID());
                }
            }
        }
        ArrayList<String> arrayListA = oss.a(list2, arrayList);
        for (osf osfVar2 : list2) {
            if (osfVar2 instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar2;
                String strAcquireMedalType = medalConfigInfo.acquireMedalType();
                String strAcquireMedalID = medalConfigInfo.acquireMedalID();
                if (!TextUtils.isEmpty(strAcquireMedalType) && !arrayList.contains(strAcquireMedalID)) {
                    if (pax.m(strAcquireMedalType)) {
                        if (pax.d(medalConfigInfo.acquireEndTime(), 0) && pax.h(strAcquireMedalID)) {
                            arrayList.add(medalConfigInfo.acquireMedalID());
                        }
                    } else if (!arrayListA.contains(strAcquireMedalID) || !pax.h(strAcquireMedalID)) {
                        LogUtil.j("PLGACHIEVE_AchieveMedalDownload", "3D download is not required -> " + strAcquireMedalID + " - " + medalConfigInfo.acquireMedalName());
                    } else {
                        arrayList.add(medalConfigInfo.acquireMedalID());
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MedalBasic medalBasic, ArrayList<String> arrayList) {
        String strAcquireMedalID = medalBasic.acquireMedalID();
        if (arrayList.contains(strAcquireMedalID)) {
            String strAcquireVeinUrl = medalBasic.acquireVeinUrl();
            ArrayList<String> arrayList2 = this.i;
            if (arrayList2 != null) {
                arrayList2.add(strAcquireMedalID);
            } else {
                ArrayList<String> arrayList3 = new ArrayList<>(2);
                this.i = arrayList3;
                arrayList3.add(strAcquireMedalID);
            }
            this.g.put(strAcquireMedalID, strAcquireVeinUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.f.put(str, 1);
        i();
    }

    private void h() {
        LogUtil.d("PLGACHIEVE_AchieveMedalDownload", "enter initTextureMap");
        ArrayList<String> arrayList = this.i;
        if (arrayList == null) {
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            this.f.put(it.next(), 0);
        }
    }

    private void d(String str) {
        LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "enter parseJsonData");
        if (str == null) {
            return;
        }
        Map<String, Integer> map = this.f;
        if (map != null) {
            map.clear();
        } else {
            this.f = new HashMap(2);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            LogUtil.a("PLGACHIEVE_AchieveMedalDownload", "medalIdList length is", Integer.valueOf(this.i.size()));
            for (String str2 : this.i) {
                this.f.put(str2, Integer.valueOf(osz.c(str2, jSONObject)));
            }
        } catch (JSONException unused) {
            LogUtil.e("PLGACHIEVE_AchieveMedalDownload", "parseJsonData Exception");
        }
    }

    private void i() {
        osa.b(f44659c, "_medalTextureDownload", new JSONObject(this.f).toString());
    }

    private boolean c() {
        LogUtil.d("PLGACHIEVE_AchieveMedalDownload", "enter allMedalTextureIsDownload  ", this.i.toString());
        for (String str : this.i) {
            if (this.f.get(str) == null || 1 != this.f.get(str).intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        osa.b(f44659c, "_medalTextureStatusDownloadDoing", "done");
    }
}
