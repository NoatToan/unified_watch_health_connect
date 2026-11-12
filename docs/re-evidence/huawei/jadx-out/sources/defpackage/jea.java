package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.utils.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jea {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f38449c = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f38448b = new Object();
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f38447a = new Object();
    private boolean i = false;
    private boolean g = true;
    private b j = null;
    private String[] k = null;
    private boolean h = false;
    private boolean f = false;
    private IBaseResponseCallback n = new IBaseResponseCallback() { // from class: jea.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            Vo2maxDetail vo2maxDetail = obj instanceof Vo2maxDetail ? (Vo2maxDetail) obj : null;
            jea.this.l.a(jea.this.b(vo2maxDetail != null ? vo2maxDetail.getVo2maxValue() : 0));
            synchronized (jea.f38448b) {
                LogUtil.a("Track_PrimalAlgorithm", "configVo2max notifyAll()");
                jea.f38448b.notifyAll();
            }
        }
    };
    private jef l = new jef(true);

    public boolean g() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jP = HiDateUtil.p(jCurrentTimeMillis);
        long j = i;
        long jG = i == 0 ? HiDateUtil.g(jCurrentTimeMillis) : HiDateUtil.p(jCurrentTimeMillis);
        hiAggregateOption.setStartTime(jP - (j * 86400000));
        hiAggregateOption.setEndTime(jG);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(3);
        hiAggregateOption.setType(new int[]{46018});
        hiAggregateOption.setConstantsKey(new String[]{"restHeartRate"});
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: jea.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                int iRound;
                if (list != null) {
                    iRound = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        iRound = (int) (iRound + list.get(i4).getFloat("restHeartRate"));
                    }
                    if (list.size() > 0) {
                        iRound = Math.round((iRound * 1.0f) / list.size());
                    }
                } else {
                    LogUtil.a("Track_PrimalAlgorithm", "there is no average rest heart rate!");
                    iRound = 0;
                }
                jea.this.l.c(i, iRound);
                int i5 = i;
                if (i5 == 5) {
                    synchronized (jea.f38449c) {
                        LogUtil.a("Track_PrimalAlgorithm", "getRestHeartRateAverage notifyAll()");
                        jea.f38449c.notifyAll();
                    }
                    return;
                }
                if (i5 != 0) {
                    LogUtil.a("Track_PrimalAlgorithm", "getRestHeartRateAverage dayCount = ", Integer.valueOf(i5));
                } else {
                    jea.this.d(5);
                }
            }
        });
    }

    private void f(final int i, int i2) {
        this.l.b(i, i2, new IBaseResponseCallback() { // from class: jea.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (obj == null) {
                    LogUtil.a("Track_PrimalAlgorithm", "getSportRecordLastWeek no have sport record.");
                    jea.this.l.b(i, false);
                } else {
                    jea.this.l.b(i, true);
                    jea.this.l.b(jea.this.e((List<HiHealthData>) (njy.b(obj, HiHealthData.class) ? (List) obj : null)));
                }
                synchronized (jea.d) {
                    LogUtil.a("Track_PrimalAlgorithm", "getSportRecordLastWeek notifyAll()");
                    jea.d.notifyAll();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public char e(List<HiHealthData> list) {
        char c2;
        int iJ;
        Integer num;
        if (list == null || list.size() <= 0) {
            LogUtil.j("Track_PrimalAlgorithm", "getBeforeSportRecoverTime trackData is null.");
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
                if (!wearSportData.isEmpty() && wearSportData.containsKey("recovery_time") && (num = wearSportData.get("recovery_time")) != null && num.intValue() != 0) {
                    c2 = this.l.c(num.intValue(), next.getEndTime(), iJ);
                    break;
                }
            } catch (JsonSyntaxException e2) {
                LogUtil.j("Track_PrimalAlgorithm", "getBeforeSportRecoverTime trackMetaData is error", LogAnonymous.b(e2));
            }
        }
        if (c2 != 0) {
            return c2;
        }
        HiTrackMetaData hiTrackMetaData2 = (HiTrackMetaData) HiJsonUtil.d(list.get(0).getMetaData(), HiTrackMetaData.class);
        char c3 = jeb.c((int) hiTrackMetaData2.getAvgPace(), hiTrackMetaData2.getTotalDistance() / 1000);
        this.g = false;
        return c3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i) {
        int iB = jek.b(i, jek.d(this.l.b(), this.l.j()));
        return iB == 0 || iB == 1 || iB == 2;
    }

    private void b(int i, int i2) {
        this.l.b(i, i2, new IBaseResponseCallback() { // from class: jea.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (obj != null) {
                    List list = njy.b(obj, HiHealthData.class) ? (List) obj : null;
                    if (list == null) {
                        LogUtil.j("Track_PrimalAlgorithm", "getSportCountLastMonth trackData is null.");
                        return;
                    }
                    jea.this.l.c(list.size());
                } else {
                    LogUtil.a("Track_PrimalAlgorithm", "getSportCountLastMonth no have sport record.");
                }
                synchronized (jea.f38447a) {
                    LogUtil.a("Track_PrimalAlgorithm", "getSportCountLastMonth notifyAll()");
                    jea.f38447a.notifyAll();
                }
            }
        });
    }

    private void c(int i) {
        this.l.b(1, i, new IBaseResponseCallback() { // from class: jea.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (obj != null) {
                    List list = njy.b(obj, HiHealthData.class) ? (List) obj : null;
                    if (list == null) {
                        LogUtil.j("Track_PrimalAlgorithm", "configTodayMoreSecondSport list is null.");
                        return;
                    } else if (list.size() >= 1 && jeb.e((List<HiHealthData>) list)) {
                        if (jea.this.l.a() != 'A' && jea.this.l.a() != 'B') {
                            jea.this.l.b('D');
                        } else {
                            jea.this.l.b('C');
                        }
                    }
                } else {
                    LogUtil.a("Track_PrimalAlgorithm", "configTodayMoreSecondSport no have sport record.");
                }
                synchronized (jea.e) {
                    LogUtil.a("Track_PrimalAlgorithm", "configTodayMoreSecondSport notifyAll()");
                    jea.this.i = true;
                    jea.e.notifyAll();
                }
            }
        });
    }

    private void e(String[] strArr, int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        try {
            bundle.putString("voiceType", "sportSmartCoach");
            bundle.putStringArray("beforeSportFirstVoicePath", strArr);
            bundle.putFloat("sectionLower", i);
            bundle.putFloat("sectionUpper", i2);
            bundle.putInt("sportDuration", i3);
            jem.a(new jbc(26, bundle));
        } catch (NumberFormatException e2) {
            LogUtil.e("Track_PrimalAlgorithm", "voiceConstructorPlay exception = ", LogAnonymous.b(e2));
        }
    }

    public void c(String[] strArr) {
        String[] strArr2;
        if (strArr == null || strArr.length <= 0) {
            LogUtil.j("Track_PrimalAlgorithm", "beforeSportPrimalVoicePlay firstPathList is empty.");
            return;
        }
        LogUtil.a("Track_PrimalAlgorithm", "beforeSportPrimalVoicePlay", this.k, " ", Boolean.valueOf(this.h));
        int i = 0;
        if (this.h) {
            String[] strArr3 = this.k;
            if (strArr3 == null || strArr3.length <= 0) {
                LogUtil.j("Track_PrimalAlgorithm", "mIsSuggestedRest mPathIdList is empty.");
                return;
            }
            String[] strArr4 = new String[strArr.length + strArr3.length];
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                strArr4[i3] = strArr[i2];
                i2++;
                i3++;
            }
            String[] strArr5 = this.k;
            int length2 = strArr5.length;
            while (i < length2) {
                strArr4[i3] = jeo.d().d(strArr5[i]);
                i++;
                i3++;
            }
            jem.a(strArr4);
            return;
        }
        jem.a(strArr);
        b bVar = this.j;
        if (bVar == null || (strArr2 = this.k) == null) {
            LogUtil.j("Track_PrimalAlgorithm", "beforeSportPrimalVoicePlay mPathIdList is empty.");
            if (this.l.b(7)) {
                this.k = new String[]{"L138"};
                this.j = new b("fatLoss", true, String.valueOf(this.l.a()), 0);
            } else {
                this.k = new String[]{"L132", "L136"};
                this.j = new b("fatLoss", false, null, 0);
            }
            if (this.j.f38455a == 0 && this.j.e == 0 && this.j.f38456b == 0) {
                LogUtil.a("Track_PrimalAlgorithm", "enter defaultVoicePlayBeforeSport");
                i();
            } else {
                e(this.k, this.j.f38455a, this.j.f38456b, this.j.e);
            }
            d(this.j.f38455a, this.j.f38456b, ((long) this.j.e) * 60000);
            this.h = false;
            return;
        }
        e(strArr2, bVar.f38455a, this.j.f38456b, this.j.e);
    }

    public void a(int i) {
        d(0);
        jeh.e().d(this.l.c() >= 24);
        Object obj = f38449c;
        synchronized (obj) {
            try {
                obj.wait(5000L);
            } catch (InterruptedException e2) {
                LogUtil.e("Track_PrimalAlgorithm", "query last five day rest heart rate", LogAnonymous.b(e2));
            }
        }
        int iD = this.l.d(0) - this.l.d(5);
        if (iD >= 10) {
            this.k = new String[]{"L204"};
            this.h = true;
            return;
        }
        f(7, i);
        PluginSportTrackAdapter pluginSportTrackAdapterA = ive.c().a();
        if (pluginSportTrackAdapterA != null) {
            pluginSportTrackAdapterA.readLastVo2max(this.n);
        }
        int i2 = iD > 5 ? -5 : 0;
        this.l.e(i2);
        Object obj2 = d;
        synchronized (obj2) {
            try {
                obj2.wait(5000L);
            } catch (InterruptedException e3) {
                LogUtil.e("Track_PrimalAlgorithm", "query last week sport data", LogAnonymous.b(e3));
            }
        }
        if (this.l.b(7)) {
            c(i);
            e(i, i2);
        } else {
            c(i, i2);
        }
    }

    private void c(int i, int i2) {
        int i3;
        String str;
        Object obj = f38448b;
        synchronized (obj) {
            try {
                obj.wait(5000L);
            } catch (InterruptedException e2) {
                LogUtil.e("Track_PrimalAlgorithm", "query vo2max level ", LogAnonymous.b(e2));
            }
        }
        if (this.l.c() >= 25 && this.l.l()) {
            this.j = new b("fatLoss", false, null, i2);
            this.k = new String[]{"L132", "L136"};
            return;
        }
        b(30, i);
        Object obj2 = f38447a;
        synchronized (obj2) {
            try {
                obj2.wait(5000L);
            } catch (InterruptedException e3) {
                LogUtil.e("Track_PrimalAlgorithm", "query last one month sport data ", LogAnonymous.b(e3));
            }
        }
        try {
            String strD = jdv.d();
            i3 = !TextUtils.isEmpty(strD) ? Integer.parseInt(strD) : 4;
        } catch (NumberFormatException e4) {
            LogUtil.e("Track_PrimalAlgorithm", "dealLastWeekHaveNoSportData exception = ", LogAnonymous.b(e4));
        }
        if (this.l.g() >= i3) {
            str = "cardio";
        } else {
            str = "recovery";
        }
        this.j = new b(str, false, null, i2);
        this.k = new String[]{"L132", "L136"};
    }

    private void e(int i, int i2) {
        Object obj = f38448b;
        synchronized (obj) {
            try {
                obj.wait(5000L);
            } catch (InterruptedException e2) {
                LogUtil.e("Track_PrimalAlgorithm", "query vo2max level ", LogAnonymous.b(e2));
            }
        }
        if (!this.i) {
            Object obj2 = e;
            synchronized (obj2) {
                try {
                    obj2.wait(5000L);
                } catch (InterruptedException e3) {
                    LogUtil.e("Track_PrimalAlgorithm", "query today sport data ", LogAnonymous.b(e3));
                }
            }
        }
        LogUtil.a("Track_PrimalAlgorithm", "dealLastWeekHaveSportData recoverTime ", Character.valueOf(this.l.a()));
        if (this.l.a() == 'D') {
            this.k = new String[]{"L131"};
            this.h = true;
        } else if (this.l.c() >= 25 && this.l.l()) {
            LogUtil.a("Track_PrimalAlgorithm", "dealLastWeekHaveSportData dealFatLossHasHistory");
            e(i2);
        } else {
            d(i, i2);
        }
    }

    private void e(int i) {
        if (!this.g) {
            this.k = new String[]{"L138"};
        } else if (this.l.a() == 'A') {
            this.k = new String[]{"L140", "empty_500", "L138"};
        } else if (this.l.a() == 'B') {
            this.k = new String[]{"L138"};
        } else if (this.l.a() == 'C') {
            this.k = new String[]{"L137", "L135", "L136"};
        } else {
            this.k = new String[]{"L131"};
            this.h = true;
            return;
        }
        this.j = new b("fatLoss", true, String.valueOf(this.l.a()), i);
    }

    private void d(int i, int i2) {
        String str;
        if (!this.g) {
            this.k = new String[]{"L138"};
            str = "fatLoss";
        } else {
            if (this.l.a() == 'A') {
                a(i, i2);
                return;
            }
            if (this.l.a() == 'B') {
                this.k = new String[]{"L142", "L138"};
                str = "cardio";
            } else if (this.l.a() == 'C') {
                this.k = new String[]{"L137", "L135", "L136"};
                str = "recovery";
            } else {
                this.k = new String[]{"L131"};
                this.h = true;
                return;
            }
        }
        this.j = new b(str, true, String.valueOf(this.l.a()), i2);
    }

    private void a(int i, int i2) {
        int i3;
        String str;
        try {
            String strD = jdv.d();
            i3 = !TextUtils.isEmpty(strD) ? Integer.parseInt(strD) : 4;
        } catch (NumberFormatException e2) {
            LogUtil.e("Track_PrimalAlgorithm", "dealNoFatLossMinimumecoverTime exception = ", LogAnonymous.b(e2));
        }
        b(30, i);
        Object obj = f38447a;
        synchronized (obj) {
            try {
                obj.wait(5000L);
            } catch (InterruptedException e3) {
                LogUtil.e("Track_PrimalAlgorithm", "dealNoFatLossMinimumecoverTime exception = ", LogAnonymous.b(e3));
            }
            if (this.l.g() >= i3) {
                str = "cardio";
            } else {
                str = "fatLoss";
            }
            String str2 = str;
            this.k = new String[]{"L140", "L209", "L138"};
            this.j = new b(str2, true, String.valueOf(this.l.a()), i2);
        }
    }

    private void i() {
        b bVar = new b();
        this.j = bVar;
        e(this.k, bVar.f38455a, this.j.f38456b, this.j.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2, long j) {
        synchronized (this) {
            if (!this.f) {
                jeh.e().a(i);
                jeh.e().b(i2);
                jeh.e().a(j);
                this.f = true;
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f38456b;
        private int e;

        private b() {
            if (jea.this.k == null || jea.this.k.length <= 0) {
                jea.this.k = new String[]{"L138"};
            }
            int iB = b();
            int iD = d();
            this.f38455a = (int) (iB * 0.6f);
            this.f38456b = (int) (((iB - iD) * 0.75f) + iD);
            this.e = 30;
        }

        private b(String str, boolean z, String str2, int i) {
            int iB = b();
            int iD = d();
            try {
                String strE = jdv.e(true, str, false);
                if (!TextUtils.isEmpty(strE)) {
                    this.f38455a = (int) ((Float.parseFloat(strE) / 100.0f) * iB);
                }
                String strE2 = jdv.e(true, str, true);
                if (!TextUtils.isEmpty(strE2)) {
                    this.f38456b = (int) (((Float.parseFloat(strE2) / 100.0f) * (iB - iD)) + iD);
                }
                jeh.e().d(iB);
                boolean z2 = !z;
                String strB = jdv.b(z2, str, str2);
                int i2 = Integer.parseInt("".equals(strB) ? jdv.b(z2, "cardio", str2) : strB) + i;
                this.e = i2;
                jea.this.d(this.f38455a, this.f38456b, ((long) i2) * 60000);
            } catch (NumberFormatException e) {
                LogUtil.e("Track_PrimalAlgorithm", "PrimalParamData numberFormatException = ", LogAnonymous.b(e));
            }
        }

        private int b() {
            HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartZone_Config");
            int iJ = jea.this.l.j();
            if (userPreference != null) {
                try {
                    if (userPreference.getValue() != null) {
                        String[] strArrSplit = userPreference.getValue().split(",")[1].split("\\|");
                        if (strArrSplit.length >= 6) {
                            return Integer.parseInt(strArrSplit[5]);
                        }
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("Track_PrimalAlgorithm", "getMaxHeartRate numberFormatException = ", LogAnonymous.b(e));
                }
            }
            return 220 - iJ;
        }

        private int d() {
            try {
                String strA = jdv.a();
                int i = TextUtils.isEmpty(strA) ? 60 : Integer.parseInt(strA);
                HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_Rest_HeartRate");
                return userPreference != null ? Integer.parseInt(userPreference.getValue()) : i;
            } catch (NumberFormatException e) {
                LogUtil.e("Track_PrimalAlgorithm", "getHrrHeartRate() exception = ", LogAnonymous.b(e));
                return 60;
            }
        }
    }
}
