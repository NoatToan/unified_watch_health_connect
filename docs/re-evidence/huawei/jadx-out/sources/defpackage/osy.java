package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.gltexture.impl.AchieveMedalCallBack;
import com.huawei.pluginachievement.gltexture.util.FileUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class osy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Context f44680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile osy f44681c;
    private int h;
    private otl o;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f44679a = new Object();
    private ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> d = new ConcurrentHashMap<>(0);
    private ArrayList<String> i = new ArrayList<>(8);
    private ArrayList<String> m = new ArrayList<>(8);
    private ArrayList<String> l = new ArrayList<>(8);
    private Map<String, Map<String, String>> n = new HashMap(0);
    private volatile boolean g = false;
    private AtomicInteger f = new AtomicInteger(0);
    private AtomicBoolean k = new AtomicBoolean(false);
    private ExecutorService j = Executors.newSingleThreadExecutor();

    private osy() {
    }

    public static osy d(Context context) {
        if (f44680b == null && context != null) {
            f44680b = context.getApplicationContext();
        }
        if (f44681c == null) {
            synchronized (osy.class) {
                if (f44681c == null) {
                    f44681c = new osy();
                }
            }
        }
        return f44681c;
    }

    public boolean d() {
        return this.o != null;
    }

    public void b(otl otlVar) {
        if (otlVar != null) {
            this.o = otlVar;
        }
    }

    public void a() {
        ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "enter DownMedalPngRes");
        String strE = osa.e(f44680b, "_medalPngStatusDownloadDoing");
        synchronized (f44679a) {
            if (!"doing".equals(strE)) {
                osa.b(f44680b, "_medalPngStatusDownloadDoing", "doing");
                if (f()) {
                    ReleaseLogUtil.e("PLGACHIEVE_AchieveMedalPngDownload", "DownMedals last time not finish,return!");
                    return;
                }
                j();
            }
        }
    }

    private boolean f() {
        int size = this.i.size();
        ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "Enter DownMedals haveDownMedalSize = ", Integer.valueOf(size), " mCacheCount ", Integer.valueOf(this.h));
        if (size == 0) {
            this.h = 0;
            return false;
        }
        if (size == this.h) {
            return false;
        }
        this.h = size;
        return true;
    }

    private void j() {
        ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "enter getData");
        final String strE = osa.e(f44680b, "_medalPngStatusDownload");
        final otl otlVarB = otl.b(BaseApplication.getContext());
        if (this.j.isShutdown()) {
            this.j = Executors.newSingleThreadExecutor();
        }
        this.j.execute(new Runnable() { // from class: osy.4
            @Override // java.lang.Runnable
            public void run() {
                List<osf> listD = otlVarB.d(9, new HashMap(2));
                ArrayList<String> arrayListL = otlVarB.l();
                if (listD == null) {
                    ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "getData data is null ");
                    osy.this.i();
                    return;
                }
                String strAcquireShareImageUrl = "";
                for (osf osfVar : listD) {
                    if (osfVar instanceof MedalConfigInfo) {
                        MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                        String strAcquireMedalID = medalConfigInfo.acquireMedalID();
                        if (osy.this.e(medalConfigInfo, arrayListL)) {
                            LogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "isOperationMedalOverTimeAndNotGain medalId=", strAcquireMedalID, " type=", medalConfigInfo.acquireMedalType(), " name=", medalConfigInfo.acquireMedalName(), " endTime=", oul.d(BaseApplication.getContext(), oxi.d(medalConfigInfo.acquireEndTime())));
                        } else {
                            if (!TextUtils.isEmpty(medalConfigInfo.acquireShareImageUrl())) {
                                strAcquireShareImageUrl = medalConfigInfo.acquireShareImageUrl();
                            }
                            osy.this.d(medalConfigInfo, strAcquireShareImageUrl);
                            String str = strE;
                            if (str == null || "".equals(str)) {
                                osy.this.c(medalConfigInfo);
                            }
                        }
                    }
                }
                osy.this.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(MedalConfigInfo medalConfigInfo, ArrayList<String> arrayList) {
        if (medalConfigInfo == null) {
            return false;
        }
        String strAcquireMedalID = medalConfigInfo.acquireMedalID();
        if (TextUtils.isEmpty(medalConfigInfo.acquireMedalType()) || TextUtils.isEmpty(strAcquireMedalID)) {
            return false;
        }
        return !pax.d(medalConfigInfo.acquireEndTime(), arrayList.contains(strAcquireMedalID) ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "enter startResDownload...");
        c(osa.e(f44680b, "_medalPngStatusDownload"));
        if (e()) {
            ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "allMedalTextureIsDownload success");
            i();
        } else {
            synchronized (this) {
                g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MedalConfigInfo medalConfigInfo, String str) {
        synchronized (f44679a) {
            HashMap map = new HashMap(5);
            map.put(ParsedFieldTag.GRAY_LIST_STYLE, medalConfigInfo.acquireGrayListStyle());
            map.put(ParsedFieldTag.LIGHT_LIST_STYLE, medalConfigInfo.acquireLightListStyle());
            map.put(ParsedFieldTag.GRAY_DETAIL_STYLE, medalConfigInfo.acquireGrayDetailStyle());
            map.put(ParsedFieldTag.LIGHT_DETAIL_STYLE, medalConfigInfo.acquireLightDetailStyle());
            if (TextUtils.isEmpty(medalConfigInfo.acquireShareImageUrl())) {
                map.put(ParsedFieldTag.SHARE_IMAGE_URL, str);
                ReleaseLogUtil.e("PLGACHIEVE_AchieveMedalPngDownload", "initUrlData shareUrl isEmpty! id ", medalConfigInfo.acquireMedalID());
            } else {
                map.put(ParsedFieldTag.SHARE_IMAGE_URL, medalConfigInfo.acquireShareImageUrl());
            }
            String strAcquireMedalID = medalConfigInfo.acquireMedalID();
            ArrayList<String> arrayList = this.l;
            if (arrayList != null) {
                arrayList.add(strAcquireMedalID);
            } else {
                ArrayList<String> arrayList2 = new ArrayList<>(2);
                this.l = arrayList2;
                arrayList2.add(strAcquireMedalID);
            }
            c(medalConfigInfo);
            LogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "enter initUrlData=", map.toString());
            this.n.put(strAcquireMedalID, map);
        }
    }

    private void e(String str) {
        if (str == null) {
            return;
        }
        String strC = osz.c(str, true);
        String strC2 = osz.c(str, false);
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strC2)) {
            return;
        }
        LogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "enter refreshStatus medalUrlType=", strC2, " fileName=", str);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.d.get(strC);
        if (concurrentHashMap != null) {
            if (concurrentHashMap.get(strC2) != null) {
                concurrentHashMap.put(strC2, 1);
            }
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(2);
            concurrentHashMap.put(strC2, 1);
        }
        this.d.put(strC, concurrentHashMap);
        d(str);
    }

    private void d(String str) {
        if (this.i.size() == this.m.size()) {
            ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "DownMedals finish.mHaveDownMedals.size = ", Integer.valueOf(this.i.size()), "needDownMedals total = ", Integer.valueOf(this.m.size()), " lastOne=", str);
            h();
            i();
            return;
        }
        if (this.m.size() < 100) {
            ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "DownMedals less ", str, " refresh size ", Integer.valueOf(this.i.size()));
            h();
        } else if (this.i.size() % 50 == 0 || this.i.size() <= 5) {
            ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "DownMedals large refresh sp", Integer.valueOf(this.i.size()));
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MedalConfigInfo medalConfigInfo) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>(5);
        concurrentHashMap.put(ParsedFieldTag.GRAY_LIST_STYLE, 0);
        concurrentHashMap.put(ParsedFieldTag.LIGHT_LIST_STYLE, 0);
        concurrentHashMap.put(ParsedFieldTag.GRAY_DETAIL_STYLE, 0);
        concurrentHashMap.put(ParsedFieldTag.LIGHT_DETAIL_STYLE, 0);
        concurrentHashMap.put(ParsedFieldTag.SHARE_IMAGE_URL, 0);
        this.d.put(medalConfigInfo.acquireMedalID(), concurrentHashMap);
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> concurrentHashMap = this.d;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        } else {
            this.d = new ConcurrentHashMap<>(8);
        }
        synchronized (f44679a) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (String str2 : this.l) {
                    JSONObject jSONObjectB = b(str2, jSONObject);
                    if (jSONObjectB != null) {
                        ConcurrentHashMap<String, Integer> concurrentHashMap2 = new ConcurrentHashMap<>(5);
                        concurrentHashMap2.put(ParsedFieldTag.GRAY_LIST_STYLE, Integer.valueOf(osz.c(ParsedFieldTag.GRAY_LIST_STYLE, jSONObjectB)));
                        concurrentHashMap2.put(ParsedFieldTag.LIGHT_LIST_STYLE, Integer.valueOf(osz.c(ParsedFieldTag.LIGHT_LIST_STYLE, jSONObjectB)));
                        concurrentHashMap2.put(ParsedFieldTag.GRAY_DETAIL_STYLE, Integer.valueOf(osz.c(ParsedFieldTag.GRAY_DETAIL_STYLE, jSONObjectB)));
                        concurrentHashMap2.put(ParsedFieldTag.LIGHT_DETAIL_STYLE, Integer.valueOf(osz.c(ParsedFieldTag.LIGHT_DETAIL_STYLE, jSONObjectB)));
                        concurrentHashMap2.put(ParsedFieldTag.SHARE_IMAGE_URL, Integer.valueOf(osz.c(ParsedFieldTag.SHARE_IMAGE_URL, jSONObjectB)));
                        this.d.put(str2, concurrentHashMap2);
                    }
                }
            } catch (JSONException unused) {
                ReleaseLogUtil.a("PLGACHIEVE_AchieveMedalPngDownload", "parseJsonData Exception");
            }
        }
    }

    private static JSONObject b(String str, JSONObject jSONObject) {
        if (jSONObject == null || str == null) {
            LogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "jsonObject is null");
            return null;
        }
        if (jSONObject.has(str)) {
            try {
                return jSONObject.getJSONObject(str);
            } catch (JSONException unused) {
                LogUtil.e("PLGACHIEVE_AchieveMedalPngDownload", "parseJsonObject Exception!!!");
            }
        }
        return null;
    }

    private void h() {
        if (this.k.compareAndSet(false, true)) {
            try {
                osa.b(f44680b, "_medalPngStatusDownload", new JSONObject(this.d).toString());
            } catch (ConcurrentModificationException unused) {
                ReleaseLogUtil.a("PLGACHIEVE_AchieveMedalPngDownload", "refreshSharePreference, ConcurrentModificationException.");
            }
            this.k.set(false);
        }
    }

    private boolean e() {
        LogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "enter allMedalTextureIsDownload");
        b();
        boolean z = true;
        for (Map.Entry<String, ConcurrentHashMap<String, Integer>> entry : this.d.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                if (entry2.getValue().intValue() == 0) {
                    this.m.add(entry.getKey() + entry2.getKey());
                    z = false;
                }
            }
        }
        ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "needDownMedals total:", Integer.valueOf(this.m.size()), " medals ", this.m.toString());
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(Map<String, Integer> map, String str) {
        return map == null || map.get(str) == null || map.get(str).intValue() != 1;
    }

    private void g() {
        ReleaseLogUtil.d("PLGACHIEVE_AchieveMedalPngDownload", "enter DownloadMedalPngRes");
        if (!this.n.isEmpty()) {
            Iterator<Map.Entry<String, Map<String, String>>> it = this.n.entrySet().iterator();
            String str = null;
            String str2 = null;
            while (it.hasNext()) {
                Map.Entry<String, Map<String, String>> next = it.next();
                Map<String, String> value = next.getValue();
                String key = next.getKey();
                ConcurrentHashMap<String, Integer> concurrentHashMap = this.d.get(key);
                if (!it.hasNext()) {
                    str = key;
                }
                Iterator<Map.Entry<String, String>> it2 = value.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, String> next2 = it2.next();
                    String key2 = next2.getKey();
                    if (!it2.hasNext()) {
                        str2 = key2;
                    }
                    b(next2, concurrentHashMap, key, str, str2);
                }
            }
            m();
            pbo.d(this.j);
            return;
        }
        i();
    }

    private void m() {
        this.g = false;
        final Timer timer = new Timer("PLGACHIEVE_AchieveMedalPngDownload");
        final int[] iArr = {0};
        timer.scheduleAtFixedRate(new TimerTask() { // from class: osy.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int[] iArr2 = iArr;
                iArr2[0] = iArr2[0] + 1;
                LogUtil.a("PLGACHIEVE_AchieveMedalPngDownload", "medalDownloadChecker: " + iArr[0]);
                if (osy.this.g || ((iArr[0] >= 6 && CommonUtil.x(BaseApplication.getContext())) || iArr[0] >= 180)) {
                    if (osy.this.j != null) {
                        LogUtil.a("PLGACHIEVE_AchieveMedalPngDownload", "shutdownNow executor");
                        osy.this.j.shutdownNow();
                    }
                    timer.cancel();
                    LogUtil.a("PLGACHIEVE_AchieveMedalPngDownload", "medalDownloadChecker finish.");
                }
            }
        }, 10000L, 10000L);
    }

    private void b(Map.Entry<String, String> entry, final Map<String, Integer> map, final String str, final String str2, final String str3) {
        final String key = entry.getKey();
        final String value = entry.getValue();
        if (this.j.isShutdown()) {
            this.j = Executors.newSingleThreadExecutor();
        }
        this.j.execute(new Runnable() { // from class: osy.3
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (osy.this.c(map, key)) {
                    FileUtil.e(osy.f44680b).b(value, pax.e(str), pax.e(str, key), new AchieveMedalCallBack() { // from class: osy.3.3
                        @Override // com.huawei.pluginachievement.gltexture.impl.AchieveMedalCallBack
                        public void onResponse(int i) {
                            osy.this.e(i, str, key, str2, str3);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str, String str2, String str3, String str4) {
        String str5 = str + str2 + i;
        synchronized (e) {
            this.i.add(str5);
        }
        if (i == 200) {
            e(pax.e(str, str2));
            this.f.set(0);
        } else {
            ReleaseLogUtil.e("PLGACHIEVE_AchieveMedalPngDownload", "DownMedals fail! ", str5);
            this.f.incrementAndGet();
        }
        if (!(str.equals(str3) && str2.equals(str4)) && this.f.get() < 6) {
            return;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalPngDownload", "DownMedals is end or failures reaches the upper limit. failCount = " + this.f.get());
        this.f.set(0);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        osa.b(f44680b, "_medalPngStatusDownloadDoing", "done");
        b();
        this.g = true;
    }

    private void b() {
        synchronized (e) {
            this.i.clear();
            this.m.clear();
        }
    }
}
