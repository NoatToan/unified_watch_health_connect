package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.ChineseVoiceConstructor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class jeh {
    private static final Object f = new Object();
    private static jeh j;
    private long ab;
    private float ac;
    private long ad;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38474c;
    private int k;
    private int m;
    private int y;
    private float z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<Integer> f38472a = new CopyOnWriteArrayList<>();
    public ArrayList<Integer> d = new ArrayList<>(10);
    public int h = 0;
    public float i = 0.0f;
    public CopyOnWriteArrayList<Integer> e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList<Float> f38473b = new CopyOnWriteArrayList<>();
    private Thread o = new b();
    private Boolean[] ai = new Boolean[20];
    private boolean n = false;
    private boolean v = true;
    private boolean w = true;
    private boolean q = false;
    private int l = 0;
    private boolean s = false;
    private int aa = 1;
    private boolean p = true;
    private boolean t = true;
    private boolean x = false;
    private boolean u = false;
    private boolean r = false;
    private Context g = BaseApplication.getContext();

    /* JADX INFO: Access modifiers changed from: private */
    public int b(boolean z, boolean z2, int i) {
        if (z && z2) {
            return 20000;
        }
        if (i < 3) {
            return (i + 1) * 20000;
        }
        return i == 3 ? 60000 : 180000;
    }

    private boolean b(float f2) {
        return f2 > 0.0f && f2 <= 0.6f;
    }

    private jeh() {
        for (int i = 0; i < 20; i++) {
            this.ai[i] = false;
        }
    }

    public void b(int i) {
        this.m = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void a(int i) {
        this.k = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void e(float f2) {
        this.z = ((Float) lst.d(Float.valueOf(f2))).floatValue();
    }

    public void c(float f2) {
        this.ac = ((Float) lst.d(Float.valueOf(f2))).floatValue();
    }

    public void d(int i) {
        this.y = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void a(long j2) {
        this.ab = ((Long) lst.d(Long.valueOf(j2))).longValue();
    }

    public void d(float f2) {
        this.i = ((Float) lst.d(Float.valueOf(f2))).floatValue();
    }

    public void a(float f2) {
        this.f38473b.add(Float.valueOf(f2));
    }

    public void d(boolean z) {
        this.r = z;
    }

    public boolean j() {
        return this.r;
    }

    public static jeh e() {
        jeh jehVar;
        synchronized (f) {
            if (j == null) {
                j = new jeh();
            }
            jehVar = j;
        }
        return jehVar;
    }

    public void g() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: jeh.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(60000L);
                } catch (InterruptedException e) {
                    LogUtil.e("Track_VoiceGuideInMotionSport", e.getMessage());
                }
                if (jeh.this.d == null || jeh.this.d.size() <= 0) {
                    LogUtil.j("Track_VoiceGuideInMotionSport", "handleHeartRateOneMinuteCheck mSaveHeartOneMinuteRateArray.size() <= 0");
                    return;
                }
                boolean z = true;
                boolean z2 = true;
                for (Integer num : jeh.this.d) {
                    if (num.intValue() > ((double) jeh.this.y) * 0.55d) {
                        z = false;
                    }
                    if (num.intValue() > ((double) jeh.this.y) * 0.6d) {
                        z2 = false;
                    }
                }
                if (!jeh.this.w) {
                    LogUtil.j("Track_VoiceGuideInMotionSport", "handleHeartRateOneMinuteCheck no need play voice.");
                    jeh.this.d.clear();
                    return;
                }
                if (z) {
                    jem.a(new String[]{jeo.d().d("L210"), jeo.d().d("L202")});
                } else if (!z2) {
                    LogUtil.j("Track_VoiceGuideInMotionSport", "handleHeartRateOneMinuteCheck no warm up suggest.");
                } else {
                    jem.a(jeh.this.s());
                }
                jeh.this.d.clear();
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] s() {
        if (new SecureRandom().nextInt(2) == 0) {
            return new String[]{jeo.d().d("L202")};
        }
        return new String[]{jeo.d().d("L215"), jeo.d().d("L216")};
    }

    public void h() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: jeh.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(180000L);
                    while (jeh.this.v) {
                        if (!jeh.this.p) {
                            jeh jehVar = jeh.this;
                            if (jehVar.g(jehVar.f38474c)) {
                                jeh.this.p = true;
                                jeh jehVar2 = jeh.this;
                                jehVar2.d(null, jehVar2.f38474c, 0.0f, 0.0f, 29);
                                HashMap map = new HashMap(10);
                                map.put("click", 1);
                                map.put("type", 6);
                                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
                            }
                        }
                        Thread.sleep(1000L);
                    }
                } catch (InterruptedException e) {
                    LogUtil.e("Track_VoiceGuideInMotionSport", e.getMessage());
                }
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public void e(boolean z) {
        this.n = z;
        if (this.o != null) {
            this.f38472a.clear();
            this.e.clear();
            LogUtil.a("Track_VoiceGuideInMotionSport", "handleHeartRateOrPaceCheck ", Boolean.valueOf(this.o.isAlive()));
            if (this.o.isAlive()) {
                return;
            }
            this.o.start();
        }
    }

    public void d() {
        LogUtil.d("Track_VoiceGuideInMotionSport", "handleHeartRateCheck mSaveHeartRateArray = ", this.f38472a);
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = this.f38472a;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            LogUtil.j("Track_VoiceGuideInMotionSport", "heartRateCheckThread mSaveHeartRateArray.size() <= 0");
            return;
        }
        this.q = false;
        this.s = false;
        Iterator<Integer> it = this.f38472a.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() <= this.m) {
                this.q = true;
            }
        }
        if (!this.q) {
            this.p = false;
            CopyOnWriteArrayList<Integer> copyOnWriteArrayList2 = this.f38472a;
            d(new String[]{"L172", "L133"}, copyOnWriteArrayList2.get(copyOnWriteArrayList2.size() - 1).intValue(), this.k, this.m, 28);
            this.l++;
            HashMap map = new HashMap(10);
            map.put("click", 1);
            map.put("type", 6);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
        }
        Iterator<Integer> it2 = this.f38472a.iterator();
        while (it2.hasNext()) {
            if (it2.next().intValue() >= this.k) {
                this.s = true;
            }
        }
        if (!this.s) {
            this.p = false;
            CopyOnWriteArrayList<Integer> copyOnWriteArrayList3 = this.f38472a;
            d(new String[]{"L173", "L133"}, copyOnWriteArrayList3.get(copyOnWriteArrayList3.size() - 1).intValue(), this.k, this.m, 28);
            this.l++;
            HashMap map2 = new HashMap(10);
            map2.put("click", 1);
            map2.put("type", 6);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map2, 0);
        }
        LogUtil.d("Track_VoiceGuideInMotionSport", "handleHeartRateCheck mHeartRateCheckCount = ", Integer.valueOf(this.l));
        this.f38472a.clear();
    }

    public void k() {
        if (jem.a() == 264) {
            LogUtil.j("Track_VoiceGuideInMotionSport", "handlePaceInNormal no need execute");
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: jeh.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(180000L);
                    while (jeh.this.v) {
                        float fY = iwy.a(jeh.this.g).y();
                        if (fY > 1.0E-4f) {
                            jeh.this.h = (int) (TimeUnit.HOURS.toSeconds(1L) / fY);
                        }
                        if (!jeh.this.p) {
                            jeh jehVar = jeh.this;
                            if (jehVar.f(jehVar.h)) {
                                jeh.this.p = true;
                                jeh jehVar2 = jeh.this;
                                jehVar2.d(null, jehVar2.h, 0.0f, 0.0f, 29);
                                HashMap map = new HashMap(10);
                                map.put("click", 1);
                                map.put("type", 7);
                                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
                            }
                        }
                        Thread.sleep(1000L);
                    }
                } catch (InterruptedException e) {
                    LogUtil.e("Track_VoiceGuideInMotionSport", e.getMessage());
                }
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public void a() {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = this.e;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            LogUtil.j("Track_VoiceGuideInMotionSport", "paceCheckThread mSavePaceArray.size() <= 0");
            return;
        }
        this.q = false;
        this.s = false;
        Iterator<Integer> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().intValue() <= this.ac) {
                this.q = true;
            }
        }
        LogUtil.d("Track_VoiceGuideInMotionSport", "paceCheckThread mIsNeedHeartRateOrPaceHighCheckInit = ", Boolean.valueOf(this.q));
        b(this.q, "L173");
        Iterator<Integer> it2 = this.e.iterator();
        while (it2.hasNext()) {
            if (it2.next().intValue() >= this.z) {
                this.s = true;
            }
        }
        LogUtil.d("Track_VoiceGuideInMotionSport", "paceCheckThread mIsNeedHeartRateOrPaceLowCheckInit = ", Boolean.valueOf(this.s));
        b(this.s, "L172");
        LogUtil.d("Track_VoiceGuideInMotionSport", "paceCheckThread mHeartRateCheckCount = ", Integer.valueOf(this.l));
        this.e.clear();
    }

    private void b(boolean z, String str) {
        if (z) {
            LogUtil.a("Track_VoiceGuideInMotionSport", "higherOrLowerCheck targetRange = ", str);
            return;
        }
        this.p = false;
        String[] strArr = {str, "E209", "L134"};
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = this.e;
        d(strArr, copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).intValue() * 60, this.z, this.ac, 28);
        this.l++;
        HashMap map = new HashMap(10);
        map.put("click", 1);
        map.put("type", 7);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
    }

    class b extends Thread {
        public b() {
            super("Track_VoiceGuideInMotionSport");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (jeh.this.n && jem.d()) {
                    sleep(300000L);
                } else {
                    sleep(180000L);
                }
                while (jeh.this.v) {
                    jeh jehVar = jeh.this;
                    sleep(jehVar.b(jehVar.q, jeh.this.s, jeh.this.l));
                    if (iwy.a(jeh.this.g).o() == 1) {
                        if (jem.d()) {
                            jeh.this.d();
                        } else {
                            jeh.this.a();
                        }
                    }
                    if (jel.b().j() == 1) {
                        if (jem.d()) {
                            jeh.this.d();
                        } else {
                            jeh.this.c();
                        }
                    }
                }
            } catch (InterruptedException e) {
                LogUtil.e("Track_VoiceGuideInMotionSport", "MyThread interruptedException = ", e.getMessage());
            }
        }
    }

    public void e(int i, int i2) {
        String strI;
        if (i == 10) {
            LogUtil.j("Track_VoiceGuideInMotionSport", "handleTrainEffectCheck trainEffect is 10");
            return;
        }
        double d = i;
        int i3 = this.aa;
        if (d * 0.1d >= i3) {
            if (i2 == 0) {
                strI = e(i3);
            } else if (i2 != 1) {
                strI = "";
            } else {
                strI = i(i3);
            }
            if (strI.isEmpty()) {
                return;
            }
            jem.a(jeo.d().d(strI));
            this.aa++;
            HashMap map = new HashMap(10);
            map.put("click", 1);
            map.put("type", 9);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
        }
    }

    private String i(int i) {
        if (i == 1) {
            return "L267";
        }
        if (i == 2) {
            return "L268";
        }
        if (i == 3) {
            return "L269";
        }
        if (i == 4) {
            return "L270";
        }
        if (i == 5) {
            return "L271";
        }
        return "";
    }

    public static String e(int i) {
        if (i == 1) {
            return "L178";
        }
        if (i == 2) {
            return "L180";
        }
        if (i == 3) {
            return "L182";
        }
        if (i == 4) {
            return "L184";
        }
        if (i == 5) {
            return "L186";
        }
        return "";
    }

    public void c() {
        CopyOnWriteArrayList<Float> copyOnWriteArrayList = this.f38473b;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            LogUtil.j("Track_VoiceGuideInMotionSport", "speedCheckThread mSaveSpeedArray.size() <= 0");
            return;
        }
        this.q = false;
        this.s = false;
        Iterator<Float> it = this.f38473b.iterator();
        while (it.hasNext()) {
            if (it.next().floatValue() <= this.ac) {
                this.q = true;
            }
        }
        LogUtil.d("Track_VoiceGuideInMotionSport", "speedCheckThread mIsNeedHeartRateOrPaceHighCheckInit = ", Boolean.valueOf(this.q));
        if (!this.q) {
            this.p = false;
            d(new String[]{"L147"}, 0, this.z, this.ac, 31);
            this.l++;
            HashMap map = new HashMap(10);
            map.put("click", 1);
            map.put("type", 8);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
        }
        Iterator<Float> it2 = this.f38473b.iterator();
        while (it2.hasNext()) {
            if (it2.next().floatValue() >= this.z) {
                this.s = true;
            }
        }
        LogUtil.d("Track_VoiceGuideInMotionSport", "paceCheckThread mIsNeedHeartRateOrPaceLowCheckInit = ", Boolean.valueOf(this.s));
        if (!this.s) {
            this.p = false;
            d(new String[]{"L149"}, 0, this.z, this.ac, 31);
            this.l++;
            HashMap map2 = new HashMap(10);
            map2.put("click", 1);
            map2.put("type", 8);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map2, 0);
        }
        LogUtil.d("Track_VoiceGuideInMotionSport", "speedCheckThread mHeartRateCheckCount = ", Integer.valueOf(this.l));
        this.f38473b.clear();
    }

    public void i() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: jeh.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(600000L);
                } catch (InterruptedException e) {
                    LogUtil.e("Track_VoiceGuideInMotionSport", e.getMessage());
                }
                jeh.this.ad = 0L;
                while (jeh.this.t) {
                    try {
                        if (jeh.this.f38474c < jeh.this.m + 1) {
                            jeh.this.ad = 0L;
                        } else if (jeh.this.ad == 0) {
                            jeh.this.ad = System.currentTimeMillis();
                            LogUtil.d("Track_VoiceGuideInMotionSport", "handleEncourageReminder mStartTimestamp = ", Long.valueOf(jeh.this.ad));
                        }
                        if (jeh.this.n()) {
                            return;
                        } else {
                            Thread.sleep(500L);
                        }
                    } catch (InterruptedException e2) {
                        LogUtil.e("Track_VoiceGuideInMotionSport", e2.getMessage());
                    }
                }
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        if (this.ad != 0 && System.currentTimeMillis() - this.ad >= 60000) {
            float fY = iwy.a(this.g).y();
            int seconds = fY > 1.0E-4f ? (int) (TimeUnit.HOURS.toSeconds(1L) / fY) : 0;
            LogUtil.a("Track_VoiceGuideInMotionSport", "dealEncourageReminder currentPace ", Integer.valueOf(seconds));
            if (seconds > 0 && seconds / 60 <= 9) {
                jem.a(t());
                HashMap map = new HashMap(10);
                map.put("click", 1);
                map.put("type", 3);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
                return true;
            }
        }
        return false;
    }

    private String[] t() {
        String[] strArr = new SecureRandom().nextInt(2) == 0 ? new String[]{"L226", "L222", "L228"} : new String[]{"L226", "L224", "L223"};
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = jeo.d().d(strArr[i]);
        }
        return strArr;
    }

    private boolean q() {
        CopyOnWriteArrayList<njt> copyOnWriteArrayList = new CopyOnWriteArrayList();
        if (iwy.a(this.g).f() != null) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) iwy.a(this.g).f().clone();
        }
        if (!njy.e(copyOnWriteArrayList) && copyOnWriteArrayList.size() >= 12) {
            int size = copyOnWriteArrayList.size();
            float f2 = Float.MIN_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = 0.0f;
            for (njt njtVar : copyOnWriteArrayList) {
                if (njtVar != null) {
                    float fE = njtVar.e();
                    f4 += fE;
                    if (fE > f2) {
                        f2 = fE;
                    }
                    if (fE < f3) {
                        f3 = fE;
                    }
                }
            }
            LogUtil.d("Track_VoiceGuideInMotionSport", "isOneMinutePaceStable minSpeed = ", Float.valueOf(f3), " maxSpeed = ", Float.valueOf(f2));
            float f5 = size;
            float f6 = f4 / f5;
            float fPow = 0.0f;
            for (int i = 0; i < size; i++) {
                fPow += (float) Math.pow(((njt) copyOnWriteArrayList.get(i)).e() - f6, 2.0d);
            }
            if (f2 > 0.0f && f3 > 0.0f && f2 - f3 < 2.0f) {
                return true;
            }
            if (fPow > 0.0f && fPow / f5 < 2.0f) {
                return true;
            }
        }
        return false;
    }

    public void c(final int i) {
        if (iwy.a(this.g).y() < 8.0f) {
            return;
        }
        LogUtil.d("Track_VoiceGuideInMotionSport", "runningPostureCheckVoiceGuidance stepRate = ", Integer.valueOf(i));
        if (i <= 0) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: jeh.4
            @Override // java.lang.Runnable
            public void run() {
                jeh.this.h(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i) {
        boolean zQ = q();
        if (i >= 160) {
            b(zQ);
        } else if (zQ) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.add("L252");
            ChineseVoiceConstructor.b(arrayList, Integer.valueOf(i));
            arrayList.add("L253");
            jem.a(ChineseVoiceConstructor.c((List<String>) arrayList));
            this.ai[9] = true;
        }
        a(i, zQ);
    }

    private void b(boolean z) {
        CopyOnWriteArrayList<gzv> copyOnWriteArrayListB = iwy.a(this.g).b();
        Bundle bundleC = c(copyOnWriteArrayListB != null ? (CopyOnWriteArrayList) copyOnWriteArrayListB.clone() : null);
        int i = bundleC.getInt("avgGroundContactTime", 0);
        float f2 = bundleC.getFloat("groundHangTimeRate", 0.0f);
        if (z && i > 270 && f2 > 0.6f) {
            jem.a(jeo.d().d("L257"));
            this.ai[10] = true;
        }
        if (this.ai[10].booleanValue() && z && i > 0 && i <= 270 && b(f2)) {
            jem.a(jeo.d().d("L258"));
            this.ai[10] = false;
        }
        e(z, d(bundleC, i));
    }

    private boolean d(Bundle bundle, int i) {
        int i2 = bundle.getInt("avgGroundImpactAcceleration", 0);
        int i3 = bundle.getInt("avgSwingAngle", 0);
        int i4 = bundle.getInt("avgEversionExcursion", 0);
        return (i <= 270 && i2 > 6 && i2 < 20) && (i3 > 70 && i3 < 140 && i4 > 5 && i4 < 25);
    }

    private void a(int i, boolean z) {
        if (!this.ai[9].booleanValue() || i <= 170 || i >= 190 || !z) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("L254");
        arrayList.add("L255");
        ChineseVoiceConstructor.b(arrayList, Integer.valueOf(i));
        arrayList.add("L256");
        jem.a(ChineseVoiceConstructor.c((List<String>) arrayList));
        this.ai[9] = false;
    }

    private Bundle c(CopyOnWriteArrayList<gzv> copyOnWriteArrayList) {
        int i;
        int i2;
        int i3;
        int iRound;
        if (njy.e(copyOnWriteArrayList)) {
            return new Bundle();
        }
        int iE = 0;
        int i4 = 0;
        int iC = 0;
        int iA = 0;
        int iD = 0;
        int iJ = 0;
        int iB = 0;
        int i5 = 0;
        int iK = 0;
        for (gzv gzvVar : copyOnWriteArrayList) {
            if (gzvVar != null) {
                iE += gzvVar.e();
                i4 += gzvVar.i();
                iC += gzvVar.c();
                int iE2 = gzvVar.e() + gzvVar.i() + gzvVar.c();
                if (gzvVar.k() > 0) {
                    iK += gzvVar.k();
                    i5++;
                }
                iA += gzvVar.a() * iE2;
                iD += gzvVar.d() * iE2;
                iJ += gzvVar.j() * iE2;
                iB += gzvVar.b() * iE2;
            }
        }
        float f2 = iE + i4 + iC;
        if (f2 > 0.0f) {
            int iRound2 = Math.round(iA / f2);
            int iRound3 = Math.round(iD / f2);
            int iRound4 = Math.round(iJ / f2);
            iRound = Math.round(iB / f2);
            i = iRound2;
            i2 = iRound3;
            i3 = iRound4;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            iRound = 0;
        }
        return e(i5 > 0 ? (iK * 0.01f) / i5 : 0.0f, i, i2, i3, iRound);
    }

    private Bundle e(float f2, int i, int i2, int i3, int i4) {
        Bundle bundle = new Bundle();
        bundle.putFloat("groundHangTimeRate", f2);
        bundle.putInt("avgGroundContactTime", i);
        bundle.putInt("avgGroundImpactAcceleration", i2);
        bundle.putInt("avgSwingAngle", i3);
        bundle.putInt("avgEversionExcursion", i4);
        return bundle;
    }

    private void e(boolean z, boolean z2) {
        if (!(this.ai[11].booleanValue() && this.ai[12].booleanValue() && this.ai[13].booleanValue() && this.ai[14].booleanValue() && this.ai[15].booleanValue()) && z && z2) {
            float distance = iwy.a(this.g).getDistance() / 1000.0f;
            if (!this.ai[11].booleanValue()) {
                this.ai[11] = Boolean.valueOf(d(1.1f, distance));
            }
            if (!this.ai[12].booleanValue()) {
                this.ai[12] = Boolean.valueOf(d(3.1f, distance));
            }
            if (!this.ai[13].booleanValue()) {
                this.ai[13] = Boolean.valueOf(d(5.1f, distance));
            }
            if (!this.ai[14].booleanValue()) {
                this.ai[14] = Boolean.valueOf(d(8.1f, distance));
            }
            if (this.ai[15].booleanValue()) {
                return;
            }
            this.ai[15] = Boolean.valueOf(d(10.1f, distance));
        }
    }

    private boolean d(float f2, float f3) {
        String strD;
        if (f3 < f2) {
            return false;
        }
        int iNextInt = new SecureRandom().nextInt(4);
        if (iNextInt == 0) {
            strD = jeo.d().d("L259");
        } else if (iNextInt == 1) {
            strD = jeo.d().d("L260");
        } else if (iNextInt == 2) {
            strD = jeo.d().d("L261");
        } else {
            strD = jeo.d().d("L262");
        }
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        jem.a(strD);
        return true;
    }

    public void c(long j2) {
        b(Math.round(j2 / 1000.0d));
        e(j2);
    }

    private void b(long j2) {
        if (this.r) {
            if (j2 != 600) {
                if (j2 == 1200) {
                    jem.a(jeo.d().d("L238"));
                    return;
                } else {
                    if (j2 == 1800) {
                        jem.a(jeo.d().d("L239"));
                        return;
                    }
                    return;
                }
            }
            int iRound = Math.round(iwy.a(this.g).u());
            if (iRound <= 0) {
                LogUtil.j("Track_VoiceGuideInMotionSport", "dealFatReduction calorieValue <= 0");
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            arrayList.add("L234");
            arrayList.add("L235");
            ChineseVoiceConstructor.b(arrayList, Integer.valueOf(iRound));
            arrayList.add("L229");
            arrayList.add("L237");
            jem.a(ChineseVoiceConstructor.c((List<String>) arrayList));
        }
    }

    public void b() {
        m();
        o();
        l();
    }

    private void m() {
        if (this.ai[0].booleanValue() && this.ai[1].booleanValue()) {
            return;
        }
        long sportDuration = iwy.a(this.g).getSportDuration();
        if (!this.ai[0].booleanValue() && jei.b().h() > 0 && sportDuration > jei.b().h()) {
            jem.a(jeo.d().d("L241"));
            LogUtil.a("Track_VoiceGuideInMotionSport", " mVoiceHasPlayArray[1] = true");
            this.ai[0] = true;
        } else {
            if (this.ai[1].booleanValue() || jei.b().i() <= 3 || jei.b().e() <= 0 || sportDuration <= jei.b().e()) {
                return;
            }
            jem.a(jeo.d().d("L240"));
            LogUtil.a("Track_VoiceGuideInMotionSport", " mVoiceHasPlayArray[0] = true");
            this.ai[1] = true;
        }
    }

    private void o() {
        if (this.ai[2].booleanValue() && this.ai[3].booleanValue()) {
            return;
        }
        float distance = iwy.a(this.g).getDistance();
        LogUtil.d("Track_VoiceGuideInMotionSport", "dealRunDistanceAchievementImprove runDistance = ", Float.valueOf(distance));
        if (!this.ai[2].booleanValue() && jei.b().j() > 0 && distance > jei.b().j()) {
            jem.a(jeo.d().d("L246"));
            LogUtil.a("Track_VoiceGuideInMotionSport", " mVoiceHasPlayArray[3] = true");
            this.ai[2] = true;
        } else {
            if (this.ai[3].booleanValue() || jei.b().i() <= 3 || jei.b().d() <= 0 || distance <= jei.b().d()) {
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            arrayList.add("L242");
            arrayList.add("L243");
            ChineseVoiceConstructor.b(arrayList, Float.valueOf(iwy.a(this.g).g()));
            arrayList.add("L244");
            arrayList.add("L245");
            jem.a(ChineseVoiceConstructor.c((List<String>) arrayList));
            LogUtil.a("Track_VoiceGuideInMotionSport", " mVoiceHasPlayArray[2] = true");
            this.ai[3] = true;
        }
    }

    private void l() {
        if (this.ai[4].booleanValue() && this.ai[5].booleanValue() && this.ai[6].booleanValue() && this.ai[7].booleanValue() && this.ai[8].booleanValue()) {
            return;
        }
        float distance = iwy.a(this.g).getDistance() / 1000.0f;
        if (!this.ai[4].booleanValue()) {
            long jC = iwy.a(this.g).af().c((int) distance, 0);
            LogUtil.d("Track_VoiceGuideInMotionSport", "dealRunPaceAchievementImprove recentOneKiloMeterPace = ", Long.valueOf(jC));
            long j2 = jC / 1000;
            if (j2 > 150 && j2 < jei.b().g()) {
                jem.a(jeo.d().d("L247"));
                LogUtil.a("Track_VoiceGuideInMotionSport", " mVoiceHasPlayArray[4] = true");
                this.ai[4] = true;
            }
        }
        if (!this.ai[5].booleanValue()) {
            this.ai[5] = Boolean.valueOf(e(3, distance));
            return;
        }
        if (!this.ai[6].booleanValue()) {
            this.ai[6] = Boolean.valueOf(e(5, distance));
        } else if (!this.ai[7].booleanValue()) {
            this.ai[7] = Boolean.valueOf(e(8, distance));
        } else {
            if (this.ai[8].booleanValue()) {
                return;
            }
            this.ai[8] = Boolean.valueOf(e(10, distance));
        }
    }

    private boolean e(int i, float f2) {
        float f3 = i;
        if (f2 < f3 || f2 >= f3 + 0.5f) {
            return false;
        }
        float fX = iwy.a(this.g).x();
        LogUtil.d("Track_VoiceGuideInMotionSport", "dealFixedDistancePaceAchievementImprove averagePace = ", Float.valueOf(fX));
        if (jei.b().f() <= 0.0f || fX >= jei.b().f() || !r()) {
            return false;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add("L248");
        ChineseVoiceConstructor.b(arrayList, Integer.valueOf(i));
        arrayList.add("L244");
        arrayList.add("L249");
        arrayList.add("L250");
        jem.a(ChineseVoiceConstructor.c((List<String>) arrayList));
        LogUtil.a("Track_VoiceGuideInMotionSport", "dealFixedDistancePaceAchievementImprove voice play");
        return true;
    }

    private boolean r() {
        Iterator<Map.Entry<Integer, Float>> it = iwy.a(this.g).af().i().entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().floatValue() < 150.0f) {
                return false;
            }
        }
        return true;
    }

    private void e(long j2) {
        if (!this.u && b(j2, this.ab)) {
            b(false, this.ab);
            this.u = true;
        }
        if (this.x || !b(j2, this.ab / 2)) {
            return;
        }
        b(true, this.ab / 2);
        this.x = true;
    }

    private void b(final boolean z, final long j2) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: jeh.9
            @Override // java.lang.Runnable
            public void run() {
                String[] strArr;
                if (z) {
                    strArr = new String[]{"L162"};
                } else {
                    strArr = new String[]{"L164", "L217"};
                }
                jbc jbcVar = jel.b().j() == 1 ? new jbc(30, jeh.this.a(strArr, j2)) : null;
                if (iwy.a(jeh.this.g).o() == 1) {
                    jbcVar = new jbc(30, jeh.this.b(strArr, j2));
                }
                jem.a(jbcVar);
                HashMap map = new HashMap(10);
                map.put("click", 1);
                map.put("type", 10);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle a(String[] strArr, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("voiceType", "sportState");
        bundle.putStringArray("beforeSportFirstVoicePath", strArr);
        bundle.putFloat("distance", jel.b().a());
        bundle.putLong("duration", j2);
        bundle.putInt("calorie", jel.b().e());
        bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, jel.b().c());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle b(String[] strArr, long j2) {
        Bundle bundle = new Bundle();
        bundle.putString("voiceType", "sportState");
        bundle.putStringArray("beforeSportFirstVoicePath", strArr);
        bundle.putFloat("distance", iwy.a(this.g).g());
        bundle.putLong("duration", j2);
        bundle.putInt("calorie", (int) iwy.a(this.g).u());
        bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, iwy.a(this.g).e());
        return bundle;
    }

    private boolean b(long j2, long j3) {
        return Math.round(((double) j2) / 1000.0d) == Math.round(((double) j3) / 1000.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(int i) {
        int i2 = this.k;
        double d = i2;
        double d2 = this.m - i2;
        return i >= ((int) ((0.25d * d2) + d)) && i <= ((int) (d + (d2 * 0.75d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(int i) {
        float f2 = i / 60.0f;
        return f2 <= this.ac && f2 >= this.z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String[] strArr, int i, float f2, float f3, int i2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putString("voiceType", "sportSmartCoach");
            bundle.putStringArray("beforeSportFirstVoicePath", strArr);
            bundle.putFloat("sectionLower", f2);
            bundle.putFloat("sectionUpper", f3);
            bundle.putInt("sportDuration", i);
            jem.a(new jbc(i2, bundle));
        } catch (NumberFormatException e) {
            LogUtil.e("Track_VoiceGuideInMotionSport", "voiceConstructorPlay exception = ", e.getMessage());
        }
    }

    private static void p() {
        synchronized (f) {
            j = null;
        }
    }

    public void f() {
        this.f38472a.clear();
        this.d.clear();
        this.w = false;
        this.t = false;
        if (this.v) {
            this.v = false;
            this.o.interrupt();
            this.o = null;
        }
        p();
    }
}
