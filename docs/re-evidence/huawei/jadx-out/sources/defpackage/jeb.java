package defpackage;

import android.os.Bundle;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.utils.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jeb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f38459c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f38458b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f38457a = new Object();
    private static final Object d = new Object();
    private boolean e = false;
    private c g = null;
    private String[] i = null;
    private boolean h = false;
    private boolean j = false;
    private jef f = new jef(false);

    public static char c(int i, int i2) {
        if (i2 < 3) {
            return 'A';
        }
        if (i2 < 4) {
            return i < 300 ? 'B' : 'A';
        }
        if (i2 < 5) {
            return i < 600 ? 'B' : 'A';
        }
        if (i2 < 6) {
            return i < 720 ? 'B' : 'A';
        }
        if (i2 < 7) {
            return i < 300 ? 'C' : 'B';
        }
        if (i2 < 10) {
            return i < 480 ? 'C' : 'B';
        }
        if (i2 == 10) {
            return i < 540 ? 'C' : 'B';
        }
        if (i2 < 15) {
            return 'B';
        }
        return (i2 >= 20 || i < 360) ? 'D' : 'C';
    }

    public boolean c() {
        return this.h;
    }

    private void b(final int i, int i2) {
        this.f.b(i, i2, new IBaseResponseCallback() { // from class: jeb.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (obj != null) {
                    jeb.this.f.b(i, true);
                    LogUtil.a("Track_NonPrimalAlgorithm", "configSportRecordLastWeek have sport record.");
                } else {
                    jeb.this.f.b(i, false);
                }
                synchronized (jeb.f38459c) {
                    LogUtil.a("Track_NonPrimalAlgorithm", "configSportRecordLastWeek notifyAll()");
                    jeb.f38459c.notifyAll();
                }
            }
        });
    }

    private void h(int i) {
        this.f.b(1, i, new IBaseResponseCallback() { // from class: jeb.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (njy.b(obj, HiHealthData.class)) {
                    List list = (List) obj;
                    jeb.this.f.d(jeb.this.b((List<HiHealthData>) list));
                    if (list.size() >= 1 && jeb.e((List<HiHealthData>) list)) {
                        if (jeb.this.f.a() == 'A' || jeb.this.f.a() == 'B') {
                            jeb.this.f.b('C');
                        } else {
                            jeb.this.f.b('D');
                        }
                    }
                } else {
                    LogUtil.a("Track_NonPrimalAlgorithm", "getTodaySportRecord no have sport record.");
                    jeb.this.f.d('A');
                }
                synchronized (jeb.f38458b) {
                    LogUtil.a("Track_NonPrimalAlgorithm", "getTodaySportRecord notifyAll()");
                    jeb.f38458b.notifyAll();
                }
            }
        });
    }

    private void g(int i) {
        long jU = lsl.u(System.currentTimeMillis());
        jef.e(jU, lsl.c(jU), i, new IBaseResponseCallback() { // from class: jeb.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (obj == null) {
                    LogUtil.a("Track_NonPrimalAlgorithm", "getYesterdaySportRecord no have sport record.");
                    jeb.this.f.e('A');
                } else {
                    jeb.this.f.e(jeb.this.b((List<HiHealthData>) (njy.b(obj, HiHealthData.class) ? (List) obj : null)));
                }
                synchronized (jeb.f38457a) {
                    LogUtil.a("Track_NonPrimalAlgorithm", "getYesterdaySportRecord notifyAll()");
                    jeb.this.e = true;
                    jeb.f38457a.notifyAll();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public char b(List<HiHealthData> list) {
        char c2;
        int iJ;
        Integer num;
        if (list == null || list.size() <= 0) {
            LogUtil.j("Track_NonPrimalAlgorithm", "getBeforeSportRecoverTime trackData is null.");
            return (char) 0;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                c2 = 0;
                break;
            }
            HiHealthData next = it.next();
            try {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(next.getMetaData(), HiTrackMetaData.class);
                Map<String, Integer> wearSportData = hiTrackMetaData.getWearSportData();
                Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
                if (extendTrackMap.isEmpty() || !extendTrackMap.containsKey("eteAlgoKey")) {
                    iJ = 0;
                } else {
                    String str = extendTrackMap.get("eteAlgoKey");
                    if (StringUtils.j(str)) {
                        iJ = CommonUtil.j(str);
                    } else {
                        iJ = 0;
                    }
                }
                if (wearSportData != null && wearSportData.containsKey("recovery_time") && (num = wearSportData.get("recovery_time")) != null) {
                    c2 = this.f.c(num.intValue(), next.getEndTime(), iJ);
                    break;
                }
            } catch (JsonSyntaxException unused) {
                LogUtil.j("Track_NonPrimalAlgorithm", "getBeforeSportRecoverTime trackMetaData is error");
            }
        }
        if (c2 != 0) {
            return c2;
        }
        HiTrackMetaData hiTrackMetaData2 = (HiTrackMetaData) HiJsonUtil.d(list.get(0).getMetaData(), HiTrackMetaData.class);
        return c((int) hiTrackMetaData2.getAvgPace(), hiTrackMetaData2.getTotalDistance() / 1000);
    }

    public static boolean e(List<HiHealthData> list) {
        if (list == null || list.size() <= 0) {
            LogUtil.j("Track_NonPrimalAlgorithm", "getBeforeSportRecoverTime trackData is null.");
            return false;
        }
        Iterator<HiHealthData> it = list.iterator();
        double d2 = 0.0d;
        int i = 0;
        int iIntValue = 0;
        while (it.hasNext()) {
            try {
                HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(it.next().getMetaData(), HiTrackMetaData.class);
                double totalDistance = ((double) hiTrackMetaData.getTotalDistance()) / 1000.0d;
                Map<String, Integer> wearSportData = hiTrackMetaData.getWearSportData();
                if (wearSportData != null && wearSportData.containsKey("etraining_effect") && wearSportData.get("etraining_effect") != null) {
                    iIntValue = wearSportData.get("etraining_effect").intValue();
                }
                if (iIntValue > i) {
                    i = iIntValue;
                }
                if (totalDistance > d2) {
                    d2 = totalDistance;
                }
            } catch (JsonSyntaxException unused) {
                LogUtil.j("Track_NonPrimalAlgorithm", "analyzeTrackSimplifyData trackMetaData is error");
            }
        }
        return i >= 2 || d2 >= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        jef.e(lsl.c(jCurrentTimeMillis, -6), jCurrentTimeMillis, i, new IBaseResponseCallback() { // from class: jeb.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (njy.b(obj, HiHealthData.class)) {
                    List list = (List) obj;
                    int size = list.size();
                    if (size > 4) {
                        size = 4;
                    }
                    float avgPace = 0.0f;
                    for (int i3 = 0; i3 < size; i3++) {
                        avgPace += ((HiTrackMetaData) HiJsonUtil.d(((HiHealthData) list.get(i3)).getMetaData(), HiTrackMetaData.class)).getAvgPace();
                    }
                    jeb.this.f.c((avgPace / size) / 60.0f);
                } else {
                    LogUtil.a("Track_NonPrimalAlgorithm", "getLast4TimesRecordAveragePace no have sport record.");
                }
                synchronized (jeb.d) {
                    LogUtil.a("Track_NonPrimalAlgorithm", "getLast4TimesRecordAveragePace notifyAll()");
                    jeb.d.notifyAll();
                }
            }
        });
    }

    private void c(String[] strArr, float f, float f2, int i) {
        Bundle bundle = new Bundle();
        try {
            bundle.putString("voiceType", "sportSmartCoach");
            bundle.putStringArray("beforeSportFirstVoicePath", strArr);
            bundle.putFloat("sectionLower", f);
            bundle.putFloat("sectionUpper", f2);
            bundle.putInt("sportDuration", i);
            jem.a(new jbc(27, bundle));
        } catch (NumberFormatException e) {
            LogUtil.e("Track_NonPrimalAlgorithm", "voiceConstructorPlay exception = ", LogAnonymous.b(e));
        }
    }

    public void c(int i, String[] strArr) {
        String[] strArr2;
        if (strArr == null || strArr.length <= 0) {
            LogUtil.j("Track_NonPrimalAlgorithm", "beforeSportNonPrimalVoicePlay firstPathList is empty.");
            return;
        }
        LogUtil.a("Track_NonPrimalAlgorithm", "beforeSportNonPrimalVoicePlay", this.i, " ", Boolean.valueOf(this.h));
        int i2 = 0;
        if (this.h) {
            String[] strArr3 = this.i;
            if (strArr3 == null || strArr3.length <= 0) {
                LogUtil.j("Track_NonPrimalAlgorithm", "mIsSuggestedRest mPathIdList is empty.");
                return;
            }
            String[] strArr4 = new String[strArr.length + strArr3.length];
            int length = strArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                strArr4[i4] = strArr[i3];
                i3++;
                i4++;
            }
            String[] strArr5 = this.i;
            int length2 = strArr5.length;
            while (i2 < length2) {
                strArr4[i4] = jeo.d().d(strArr5[i2]);
                i2++;
                i4++;
            }
            jem.a(strArr4);
            return;
        }
        jem.a(strArr);
        c cVar = this.g;
        if (cVar == null || (strArr2 = this.i) == null) {
            LogUtil.j("Track_NonPrimalAlgorithm", "beforeSportNonPrimalVoicePlay mPathIdList is empty.");
            if (this.f.b(7)) {
                a(i);
            } else {
                b(i);
            }
            c cVar2 = this.g;
            if (cVar2 == null) {
                LogUtil.a("Track_NonPrimalAlgorithm", "enter defaultVoicePlayBeforeSport");
                i(i);
            } else {
                c(this.i, cVar2.f38463a, this.g.f38465c, this.g.f38464b);
            }
            c(this.g.f38465c, this.g.f38463a, ((long) this.g.f38464b) * 60000);
            this.h = false;
            return;
        }
        c(strArr2, cVar.f38463a, this.g.f38465c, this.g.f38464b);
    }

    public void c(int i) {
        b(7, i);
        jeh.e().d(this.f.c() >= 24);
        Object obj = f38459c;
        synchronized (obj) {
            try {
                obj.wait(5000L);
            } catch (InterruptedException e) {
                LogUtil.e("Track_NonPrimalAlgorithm", "query last week sport data", LogAnonymous.b(e));
            }
        }
        if (this.f.b(7)) {
            h(i);
            g(i);
            d(i);
            return;
        }
        b(i);
    }

    private void b(int i) {
        if (this.f.c() >= 25) {
            this.g = new c(this.f.k(), this.f.j(), "fatLoss", false, null);
        } else {
            this.g = new c(this.f.k(), this.f.j(), "recovery", false, null);
        }
        if (i == 264) {
            this.i = new String[]{"L132", "L143"};
        } else {
            this.i = new String[]{"L132", "L134"};
        }
    }

    private void d(int i) {
        Object obj = f38458b;
        synchronized (obj) {
            try {
                obj.wait(5000L);
            } catch (InterruptedException e) {
                LogUtil.e("Track_NonPrimalAlgorithm", "query today sport data", LogAnonymous.b(e));
            }
        }
        if (!this.e) {
            Object obj2 = f38457a;
            synchronized (obj2) {
                try {
                    obj2.wait(5000L);
                } catch (InterruptedException e2) {
                    LogUtil.e("Track_NonPrimalAlgorithm", "query yesterday sport data", LogAnonymous.b(e2));
                }
            }
        }
        jef jefVar = this.f;
        jefVar.c((char) Math.max((int) jefVar.i(), (int) this.f.f()));
        LogUtil.a("Track_NonPrimalAlgorithm", "dealLastWeekHaveSportData recoverTime ", Character.valueOf(this.f.d()));
        if (this.f.d() == 'D') {
            this.i = new String[]{"L131"};
            this.h = true;
        } else {
            a(i);
        }
    }

    public void a(int i) {
        if (this.f.c() >= 25) {
            e(i);
        } else {
            f(i);
        }
    }

    private void e(int i) {
        this.g = new c(this.f.k(), this.f.j(), "fatLoss", true, String.valueOf(this.f.d()));
        if (this.f.d() == 'A') {
            if (i == 264) {
                this.i = new String[]{"L144", "L143"};
                return;
            } else {
                this.i = new String[]{"L139"};
                return;
            }
        }
        if (this.f.d() == 'B') {
            if (i == 264) {
                this.i = new String[]{"L144", "L143"};
                return;
            } else {
                this.i = new String[]{"L139"};
                return;
            }
        }
        if (this.f.d() != 'C') {
            LogUtil.a("Track_NonPrimalAlgorithm", "dealFatLossHaveSportData wrong branch.");
        } else if (i != 264) {
            this.i = new String[]{"L135", "L134"};
        } else {
            this.i = new String[]{"L135", "L143"};
        }
    }

    private void f(int i) {
        String str;
        if (this.f.d() == 'A' || this.f.d() == 'B') {
            str = "cardio";
        } else if (this.f.d() == 'C') {
            str = "recovery";
        } else {
            LogUtil.a("Track_NonPrimalAlgorithm", "dealFatLossHaveSportData wrong branch.");
            return;
        }
        this.g = new c(this.f.k(), this.f.j(), str, true, String.valueOf(this.f.d()));
        if (i == 264) {
            this.i = new String[]{"L144", "L143"};
        } else {
            this.i = new String[]{"L139"};
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a(float f) {
        int i = (int) (f * 60.0f);
        int i2 = i / 60;
        float f2 = i % 30 >= 15 ? (float) (((double) i2) + 0.5d) : i2;
        if (f2 < 5.0f) {
            f2 = 5.0f;
        }
        if (f2 > 8.5f) {
            return 8.5f;
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f, float f2, long j) {
        synchronized (this) {
            if (!this.j) {
                jeh.e().c(f);
                jeh.e().e(f2);
                jeh.e().a(j);
                this.j = true;
            }
        }
    }

    private void i(int i) {
        c cVar = new c(i);
        this.g = cVar;
        c(this.i, cVar.f38463a, this.g.f38465c, this.g.f38464b);
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f38463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f38465c;

        private c(jeb jebVar, int i) {
            if (i == 264) {
                jebVar.i = new String[]{"L144", "L143"};
                this.f38465c = 8.0f;
                this.f38463a = 5.0f;
                this.f38464b = 30;
                return;
            }
            jebVar.i = new String[]{"L139"};
            this.f38465c = 12.0f;
            this.f38463a = 6.0f;
            this.f38464b = 30;
        }

        private c(jeb jebVar, String str, int i, String str2, boolean z, String str3) {
            try {
                if (jem.a() == 264) {
                    this.f38465c = Float.parseFloat(jdv.e(str, i, str2, false));
                    this.f38463a = Float.parseFloat(jdv.e(str, i, str2, true));
                } else {
                    this.f38465c = Float.parseFloat(jdv.a(str, i, str2, z, false));
                    String strA = jdv.a(str, i, str2, z, true);
                    if (!"-1".equals(strA)) {
                        this.f38463a = Float.parseFloat(strA);
                    } else {
                        jebVar.j(jem.a());
                        synchronized (jeb.d) {
                            try {
                                jeb.d.wait(5000L);
                                float fH = jebVar.f.h();
                                this.f38463a = fH;
                                this.f38463a = jebVar.a(fH);
                            } catch (InterruptedException e) {
                                LogUtil.e("Track_NonPrimalAlgorithm", "NonPrimalParamData exception = ", LogAnonymous.b(e));
                            }
                        }
                    }
                    if (this.f38463a > this.f38465c) {
                        this.f38463a = Float.parseFloat(jdv.a(str, i, str2, !z, true));
                    }
                }
                boolean z2 = !z;
                String strB = jdv.b(z2, str2, str3);
                int i2 = Integer.parseInt("".equals(strB) ? jdv.b(z2, "cardio", str3) : strB);
                this.f38464b = i2;
                jebVar.c(this.f38465c, this.f38463a, ((long) i2) * 60000);
            } catch (NumberFormatException e2) {
                LogUtil.e("NonPrimalParamData", LogAnonymous.b(e2));
            }
        }
    }
}
