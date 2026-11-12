package com.huawei.ui.main.stories.discover.provider;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.marketing.datatype.RecommendResourceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.SleepTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.main.R;
import defpackage.lsl;
import defpackage.ltb;
import defpackage.njy;
import defpackage.nku;
import defpackage.qom;
import defpackage.qqk;
import defpackage.uag;
import defpackage.ucv;
import defpackage.uje;
import defpackage.uzo;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class MemberSleepCardReader extends MemberCardReader {
    private static final int[] i = {DicDataTypeUtil.DataType.SLEEP_SCORE.value(), DicDataTypeUtil.DataType.EFFECTIVE_SLEEP_DURATION.value(), DicDataTypeUtil.DataType.BED_TIME.value()};
    private boolean g;
    private String h;
    private Observer j;
    private SpannableString k;
    private List<SleepTotalData> n;

    public MemberSleepCardReader(Context context) {
        super(context);
        this.g = false;
        this.j = new b(this);
        e(Arrays.asList(3), this);
        ObserverManagerUtil.d(this.j, "MonthProblemRefresh");
        a("vipPageSleep");
        e(AnalyticsValue.VIP_INTRO_RECOMMEND_SLEEP_CARD.value());
        j("VIPCard_MemberSleepCardReader");
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void initCardReader(List<RecommendResourceInfo> list) {
        super.initCardReader(list);
        e(2);
    }

    static class b implements Observer {
        private WeakReference<MemberSleepCardReader> d;

        b(MemberSleepCardReader memberSleepCardReader) {
            this.d = new WeakReference<>(memberSleepCardReader);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            LogUtil.a("VIPCard_MemberSleepCardReader", "mMonthProblemObserver");
            MemberSleepCardReader memberSleepCardReader = this.d.get();
            if (memberSleepCardReader == null) {
                LogUtil.e("VIPCard_MemberSleepCardReader", "mMonthProblemObserver is null");
            } else if ("MonthProblemRefresh".equals(str)) {
                memberSleepCardReader.g = true;
            }
        }
    }

    private void s() {
        if (!k() && n() && !o()) {
            LogUtil.a("VIPCard_MemberSleepCardReader", "do not need to refresh card");
            return;
        }
        String str = c() + Constants.LINK + this.h;
        if (!b(str)) {
            LogUtil.j("VIPCard_MemberSleepCardReader", "no resources on cloud，try no data label");
            str = c() + "-addRecord";
            u();
        }
        LogUtil.a("VIPCard_MemberSleepCardReader", "constructRecommendCardBean");
        f(this.h);
        i(str);
        final RecommendResourceInfo recommendResourceInfoD = d(f());
        if (recommendResourceInfoD == null || recommendResourceInfoD.isInvalid()) {
            LogUtil.e("VIPCard_MemberSleepCardReader", "content is not complete");
            return;
        }
        int color = d().getColor(R.color.vip_tab_sleep_card_title_color);
        d(recommendResourceInfoD, Integer.valueOf(color), this.k, Integer.valueOf(d().getColor(R.color.vip_tab_sleep_card_button_color)), new qom() { // from class: com.huawei.ui.main.stories.discover.provider.MemberSleepCardReader.2
            @Override // defpackage.qom, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i2) {
                MemberSleepCardReader.this.c(i2, recommendResourceInfoD);
            }
        });
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void unRegisterListener() {
        LogUtil.a("VIPCard_MemberSleepCardReader", "unRegisterListener");
        super.unRegisterListener();
        super.p();
        ObserverManagerUtil.a(this.j, "MonthProblemRefresh");
        x();
    }

    private long e(int i2, long j, boolean z) {
        Date time;
        Calendar calendar = Calendar.getInstance();
        if (j == 0) {
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5) + i2, 0, 0, 0);
            time = calendar.getTime();
        } else {
            calendar.setTime(new Date(j));
            calendar.add(5, i2);
            time = calendar.getTime();
        }
        if (z) {
            return ltb.m(time);
        }
        return ltb.o(time);
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void queryLabel() {
        b(b() && c("sleep_dmp"));
        if (a() == 0) {
            if (o()) {
                u();
                e(2);
            } else {
                LogUtil.a("VIPCard_MemberSleepCardReader", "privacy status is not changed");
            }
            LogUtil.a("VIPCard_MemberSleepCardReader", "sleep card reader:no privacy");
            return;
        }
        if (!k() && m() && !o() && !this.g) {
            LogUtil.a("VIPCard_MemberSleepCardReader", "no need to label");
            return;
        }
        x();
        LogUtil.a("VIPCard_MemberSleepCardReader", "start search");
        w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        nku.e().a(e(-6, 0L, true), 3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 7, new a());
    }

    static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<MemberSleepCardReader> f26447c;

        d(MemberSleepCardReader memberSleepCardReader) {
            this.f26447c = new WeakReference<>(memberSleepCardReader);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        /* JADX WARN: Code duplicated, block: B:26:0x009a  */
        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            int iIntValue;
            LogUtil.a("VIPCard_MemberSleepCardReader", "queryMonthResult onResult, data: ", obj);
            MemberSleepCardReader memberSleepCardReader = this.f26447c.get();
            if (memberSleepCardReader == null) {
                LogUtil.e("VIPCard_MemberSleepCardReader", "memberSleepCardReader is null");
                return;
            }
            if (i != 0) {
                LogUtil.j("VIPCard_MemberSleepCardReader", "errorCode: ", Integer.valueOf(i));
            } else if (!(obj instanceof SparseArray)) {
                LogUtil.j("VIPCard_MemberSleepCardReader", "data is not SparseArray");
            } else {
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("VIPCard_MemberSleepCardReader", "map.size() <= 0");
                }
                LogUtil.a("VIPCard_MemberSleepCardReader", "queryMonthProcessResult success");
                Map<String, Object> mapC = uag.c((SparseArray<Object>) sparseArray, lsl.i(System.currentTimeMillis()), true);
                if (mapC.isEmpty()) {
                    LogUtil.j("VIPCard_MemberSleepCardReader", "resMap is null");
                } else {
                    if (mapC.get("monthlySleepProblem") instanceof Integer) {
                        iIntValue = ((Integer) mapC.get("monthlySleepProblem")).intValue();
                    } else {
                        LogUtil.j("VIPCard_MemberSleepCardReader", "resMap has no MONTHLY_SLEEP_PROBLEM");
                    }
                    if (iIntValue == -1) {
                        memberSleepCardReader.v();
                    } else {
                        memberSleepCardReader.c(iIntValue);
                        memberSleepCardReader.e(0);
                    }
                }
            }
            iIntValue = -1;
            if (iIntValue == -1) {
                memberSleepCardReader.v();
            } else {
                memberSleepCardReader.c(iIntValue);
                memberSleepCardReader.e(0);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("VIPCard_MemberSleepCardReader", "queryMonthProcessResult intentType ", Integer.valueOf(i), " errorCode ", Integer.valueOf(i2));
        }
    }

    private void w() {
        uag.c((HiDataReadResultListener) new d(this), lsl.i(System.currentTimeMillis()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        LogUtil.a("VIPCard_MemberSleepCardReader", "whenAfterEvaluation");
        this.h = "startPlan";
        a(b(i2), "[\\s\\S]*");
    }

    private String b(int i2) {
        LogUtil.a("VIPCard_MemberSleepCardReader", "getMonthStr:", Integer.valueOf(i2));
        if (i2 == 0) {
            return d().getString(R.string.IDS_sleep_no_problem);
        }
        if (i2 == 1) {
            return d().getString(R.string.IDS_sleep_lowquality_problem);
        }
        if (i2 == 2) {
            return d().getString(R.string.IDS_sleep_difficulty_fall_asleep);
        }
        if (i2 == 3) {
            return d().getString(R.string.IDS_sleep_insuf_sleep_duration);
        }
        if (i2 == 4) {
            return d().getString(R.string.IDS_sleep_irregular_sleep_schedule);
        }
        if (i2 == 5) {
            return d().getString(R.string.IDS_sleep_difficulty_sleep_maintain);
        }
        return "";
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void setDataChangeTrue() {
        super.setDataChangeTrue();
        this.g = true;
    }

    private void x() {
        LogUtil.a("VIPCard_MemberSleepCardReader", "resetParams");
        super.t();
        this.h = null;
        this.k = null;
        this.g = false;
        List<SleepTotalData> list = this.n;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("VIPCard_MemberSleepCardReader", "fliterScenario");
        if (njy.e(this.n)) {
            LogUtil.a("VIPCard_MemberSleepCardReader", "no data on sleep card");
            u();
            e(0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SleepTotalData sleepTotalData : this.n) {
            if (qqk.a(sleepTotalData.getDeivceCategory()) || sleepTotalData.getDeivceCategory() == Integer.parseInt("054", 16)) {
                LogUtil.a("VIPCard_MemberSleepCardReader", "phone or pillow sleep, but now no pillo online");
                arrayList.add(Long.valueOf(sleepTotalData.getSleepDayTime()));
            } else if (sleepTotalData.getDeivceCategory() == Integer.parseInt("001", 16)) {
                LogUtil.a("VIPCard_MemberSleepCardReader", "manual sleep, need to calculate score");
                int iIntValue = new BigDecimal((uje.e(sleepTotalData.getManualOnTime()) * 0.5f) + (uje.d(sleepTotalData.getManualBedTime() == 0 ? 0.0f : sleepTotalData.getManualOnTime() / sleepTotalData.getManualBedTime()) * 0.3f) + (uje.a(sleepTotalData.getManualFallTime()) * 0.2f)).intValue();
                sleepTotalData.setScore(iIntValue);
                sleepTotalData.setSleepLevel(ucv.j(iIntValue));
            } else {
                LogUtil.a("VIPCard_MemberSleepCardReader", "other sleep");
            }
        }
        if (njy.e(arrayList)) {
            e(0);
        } else {
            c(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2) {
        if (i2 != 0) {
            if (i2 == 2) {
                LogUtil.a("VIPCard_MemberSleepCardReader", "init resources already");
                if (TextUtils.isEmpty(this.h) || !l()) {
                    return;
                }
                LogUtil.a("VIPCard_MemberSleepCardReader", "notify listener");
                s();
                return;
            }
            LogUtil.a("VIPCard_MemberSleepCardReader", "other message,labelName ", this.h);
            return;
        }
        LogUtil.a("VIPCard_MemberSleepCardReader", "wear scentific sleep");
        if (!TextUtils.isEmpty(this.h) && this.h.equals("startPlan")) {
            LogUtil.a("VIPCard_MemberSleepCardReader", "month problem get");
        } else if (njy.b(this.n)) {
            q();
        } else {
            LogUtil.e("VIPCard_MemberSleepCardReader", "mSleepTotalDataList is empty");
        }
        if (l()) {
            LogUtil.a("VIPCard_MemberSleepCardReader", "notify listener");
            s();
        }
    }

    private void c(List<Long> list) {
        LogUtil.a("VIPCard_MemberSleepCardReader", "requestExtraSleep size:", list.toString());
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(uzo.d(it.next().longValue(), 1));
        }
        uzo.b(uzo.c(arrayList), new e(0, this));
    }

    private void e(SleepTotalData sleepTotalData, List<Integer> list) {
        if (d(sleepTotalData)) {
            list.add(Integer.valueOf(sleepTotalData.getManualFallTime()));
        } else if (sleepTotalData.getFallTime() == 0) {
            list.add(Integer.valueOf(sleepTotalData.getCommonFallTime()));
        } else {
            list.add(Integer.valueOf(sleepTotalData.getFallTime()));
        }
    }

    private void q() {
        LogUtil.a("VIPCard_MemberSleepCardReader", "calculateAvgToGetLabel");
        int size = this.n.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        ArrayList arrayList4 = new ArrayList(size);
        ArrayList arrayList5 = new ArrayList(size);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (SleepTotalData sleepTotalData : this.n) {
            if (sleepTotalData.getTotalSleepTime() != 0) {
                arrayList.add(Integer.valueOf(sleepTotalData.getTotalSleepTime()));
                e(sleepTotalData, arrayList4);
                if (sleepTotalData.getSleepLevel() != null) {
                    i2++;
                }
                if (d().getString(R.string.IDS_excellent).equals(sleepTotalData.getSleepLevel()) || d().getString(R.string.IDS_good).equals(sleepTotalData.getSleepLevel())) {
                    i3++;
                }
                if (d().getString(R.string.IDS_general).equals(sleepTotalData.getSleepLevel()) || d().getString(R.string.IDS_need_improving).equals(sleepTotalData.getSleepLevel())) {
                    i4++;
                }
                if (c(sleepTotalData)) {
                    arrayList2.add(Integer.valueOf(sleepTotalData.getDeepSleepTimePercent()));
                    arrayList3.add(Integer.valueOf(sleepTotalData.getShallowSleepTimePercent()));
                    LogUtil.a("VIPCard_MemberSleepCardReader", "this sleep scored ", Boolean.valueOf(sleepTotalData.getType() != 30 ? arrayList5.add(Integer.valueOf(sleepTotalData.getScore())) : false));
                }
            }
        }
        HashMap<String, Integer> map = new HashMap<>(9);
        map.put("shortSleepers", Integer.valueOf(d(arrayList)));
        map.put("inadequateDeepSleep", Integer.valueOf(d(arrayList2)));
        map.put("tooMuchLightSleep", Integer.valueOf(d(arrayList3)));
        map.put("sleepLate", Integer.valueOf(d(arrayList4)));
        map.put("sleepScore", Integer.valueOf(d(arrayList5)));
        map.put("sleepScores", Integer.valueOf(arrayList5.size()));
        map.put("sleepLevel", Integer.valueOf(i2));
        map.put("goodSleep", Integer.valueOf(i3));
        map.put("generalSleep", Integer.valueOf(i4));
        LogUtil.a("VIPCard_MemberSleepCardReader", "metric is ", map.entrySet().toString());
        e(map);
    }

    private boolean c(SleepTotalData sleepTotalData) {
        return sleepTotalData.getDeivceCategory() == Integer.parseInt("06D", 16) || sleepTotalData.getDeivceCategory() == Integer.parseInt("06E", 16);
    }

    private boolean d(SleepTotalData sleepTotalData) {
        return sleepTotalData.getDeivceCategory() == Integer.parseInt("001", 16);
    }

    private int d(List<Integer> list) {
        int iIntValue = 0;
        if (njy.e(list)) {
            return 0;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return Math.round(iIntValue / list.size());
    }

    private void e(HashMap<String, Integer> map) {
        if (map.get("shortSleepers").intValue() <= 360 && map.get("shortSleepers").intValue() != 0) {
            ad();
            return;
        }
        if (map.get("inadequateDeepSleep").intValue() != 0 && (map.get("inadequateDeepSleep").intValue() > 60 || map.get("inadequateDeepSleep").intValue() < 20)) {
            y();
            return;
        }
        if (map.get("sleepLate").intValue() >= 240) {
            ac();
            return;
        }
        if (map.get("tooMuchLightSleep").intValue() != 0 && map.get("tooMuchLightSleep").intValue() >= 55) {
            aa();
        } else if (njy.b(this.n)) {
            a(map);
        } else {
            u();
        }
    }

    private void ad() {
        LogUtil.a("VIPCard_MemberSleepCardReader", "whenShortSleepers");
        this.h = "shortSleepers";
        a(d().getResources().getString(R.string.IDS_member_sleep_recommend_new, d().getResources().getString(R.string.IDS_member_sleep_add_record, UnitUtil.e(6.0d, 1, 0), UnitUtil.e(10.0d, 1, 0))), null);
    }

    private void y() {
        LogUtil.a("VIPCard_MemberSleepCardReader", "whenInadequateDeepSleep");
        this.h = "inadequateDeepSleep";
        a(d().getResources().getString(R.string.IDS_member_sleep_inadequate_deep_sleep_new, UnitUtil.e(20.0d, 2, 0), UnitUtil.e(60.0d, 2, 0)), null);
    }

    private void ac() {
        LogUtil.a("VIPCard_MemberSleepCardReader", "whenSleepLate");
        this.h = "sleepLate";
        a(d().getResources().getString(R.string.IDS_member_sleep_sleep_late_new, UnitUtil.e(12.0d, 1, 0)), null);
    }

    private void aa() {
        LogUtil.a("VIPCard_MemberSleepCardReader", "whenTooMuchLightSleep");
        this.h = "tooMuchLightSleep";
        String string = d().getResources().getString(R.string.IDS_member_sleep_too_much_light_sleep_new, UnitUtil.e(55.0d, 2, 0));
        a(d().getResources().getString(R.string.IDS_member_sleep_recommend_new, string), string);
    }

    private void a(HashMap<String, Integer> map) {
        if ((map.get("sleepScores").intValue() >= map.get("sleepLevel").intValue() && map.get("sleepScore").intValue() > 80) || (map.get("sleepScores").intValue() < map.get("sleepLevel").intValue() && map.get("goodSleep").intValue() > map.get("generalSleep").intValue())) {
            LogUtil.a("VIPCard_MemberSleepCardReader", "whenGreatSleepPoints");
            this.h = "greatSleepPoints";
            this.k = null;
            return;
        }
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        String string;
        LogUtil.a("VIPCard_MemberSleepCardReader", "whenOtherSleep");
        this.h = "addRecord";
        try {
            string = d().getResources().getString(R.string.IDS_member_sleep_add_record, UnitUtil.e(6.0d, 1, 0), UnitUtil.e(10.0d, 1, 0));
        } catch (IllegalFormatConversionException unused) {
            ReleaseLogUtil.a("VIPCard_MemberSleepCardReader", "whenOtherSleep string format exception");
            string = "";
        }
        a(string, null);
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("VIPCard_MemberSleepCardReader", "str is empty");
        } else if (TextUtils.isEmpty(str2)) {
            this.k = UnitUtil.b(d(), "[\\d:\\-%]", str, R.style.member_card_sleep_subtitle_number, R.style.weight_management_goal_normal);
        } else {
            this.k = UnitUtil.b(d(), str2, str, R.style.member_card_sleep_subtitle_number, R.style.weight_management_goal_normal);
        }
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void setOrder(int i2) {
        super.setOrder(i2);
    }

    static class e implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MemberSleepCardReader> f26449b;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public e(int i, MemberSleepCardReader memberSleepCardReader) {
            this.f26448a = i;
            this.f26449b = new WeakReference<>(memberSleepCardReader);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            MemberSleepCardReader memberSleepCardReader = this.f26449b.get();
            if (memberSleepCardReader == null) {
                LogUtil.j("VIPCard_MemberSleepCardReader", "PhonePillowDataChangeListener activity is null");
                return;
            }
            LogUtil.a("VIPCard_MemberSleepCardReader", "new device summary respone!");
            List<SleepTotalData> list = memberSleepCardReader.n;
            if (list == null) {
                LogUtil.e("VIPCard_MemberSleepCardReader", "sleepTotalDatas is null");
                memberSleepCardReader.e(0);
                return;
            }
            if (!(obj instanceof SparseArray)) {
                LogUtil.e("VIPCard_MemberSleepCardReader", "data is not instanceof SparseArray");
                memberSleepCardReader.e(0);
                return;
            }
            if (njy.e(list)) {
                LogUtil.e("VIPCard_MemberSleepCardReader", "mWeakReference.get() is empty");
                memberSleepCardReader.e(0);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (SleepTotalData sleepTotalData : list) {
                if (qqk.a(sleepTotalData.getDeivceCategory()) || sleepTotalData.getDeivceCategory() == Integer.parseInt("054", 16)) {
                    arrayList.add(sleepTotalData);
                }
            }
            if (njy.e(arrayList)) {
                LogUtil.a("VIPCard_MemberSleepCardReader", "sleepTotalData is null");
                memberSleepCardReader.e(0);
                return;
            }
            if (this.f26448a == 0) {
                memberSleepCardReader.c(obj, arrayList);
            }
            if (this.f26448a == 1) {
                memberSleepCardReader.b(obj, arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj, List<SleepTotalData> list) {
        LogUtil.a("VIPCard_MemberSleepCardReader", "processQueryDeviceId");
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<SleepTotalData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getSleepDayTime()));
        }
        if (obj == null || !(obj instanceof SparseArray)) {
            return;
        }
        List list2 = (List) ((SparseArray) obj).get(22100);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i2 = 0;
        for (Object obj2 : list2) {
            if (obj2 instanceof HiHealthData) {
                LogUtil.a("VIPCard_MemberSleepCardReader", "construct phone sleep options with deviceId,phoneTimes=", arrayList.toString());
                Long l = (Long) arrayList.get(i2);
                long jLongValue = l.longValue();
                long jE = e(-1, jLongValue, true) * 1000;
                long jE2 = e(1, jLongValue, false) * 1000;
                LogUtil.a("VIPCard_MemberSleepCardReader", "yesterday=", Long.valueOf(jE), " today=", l, " tomorrow=", Long.valueOf(jE2));
                arrayList2.add(uzo.e(((HiHealthData) obj2).getString("device_uniquecode"), -1, jE, jE2, i));
            } else {
                LogUtil.a("VIPCard_MemberSleepCardReader", "obj is not instanceof HiHealthData");
            }
            i2++;
        }
        if (njy.b(arrayList2)) {
            uzo.b(uzo.c(arrayList2), new e(1, this));
        } else {
            e(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, List<SleepTotalData> list) {
        LogUtil.a("VIPCard_MemberSleepCardReader", "processQueryPhoneSleep");
        SparseArray sparseArray = (SparseArray) obj;
        for (SleepTotalData sleepTotalData : list) {
            long jE = ltb.e(new Date(sleepTotalData.getSleepDayTime())) * 1000;
            long j = ((jE / 1000) + k.b.m) * 1000;
            int iB = uzo.b(sparseArray, DicDataTypeUtil.DataType.SLEEP_SCORE.value(), jE, j);
            int iB2 = uzo.b(sparseArray, DicDataTypeUtil.DataType.EFFECTIVE_SLEEP_DURATION.value(), jE, j);
            long jD = uzo.d(sparseArray, DicDataTypeUtil.DataType.BED_TIME.value(), jE, j);
            String strC = uzo.c((SparseArray<Object>) sparseArray, DicDataTypeUtil.DataType.BED_TIME.value());
            sleepTotalData.setScore(iB);
            sleepTotalData.setSleepLevel(ucv.j(iB));
            sleepTotalData.setTotalSleepTime(iB2 / 60);
            sleepTotalData.setFallTime(qqk.b(jD, strC, 1));
        }
        LogUtil.a("VIPCard_MemberSleepCardReader", "after query phone sleep ", this.n.toString());
        e(0);
    }

    static class a implements IBaseResponseCallback {
        private WeakReference<MemberSleepCardReader> e;

        private a(MemberSleepCardReader memberSleepCardReader) {
            this.e = new WeakReference<>(memberSleepCardReader);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WeakReference<MemberSleepCardReader> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.j("VIPCard_MemberSleepCardReader", "CoreSleepDataCallback weakReference is null");
                return;
            }
            MemberSleepCardReader memberSleepCardReader = weakReference.get();
            if (memberSleepCardReader == null) {
                LogUtil.j("VIPCard_MemberSleepCardReader", "CoreSleepDataCallback memberSleepCardReader is null");
                return;
            }
            LogUtil.a("VIPCard_MemberSleepCardReader", "errorcode is ", Integer.valueOf(i), "sleep data is ", obj == null ? null : obj.toString());
            if (i == 0 && njy.b(obj, SleepTotalData.class)) {
                memberSleepCardReader.n = (List) obj;
                memberSleepCardReader.r();
            } else {
                LogUtil.j("VIPCard_MemberSleepCardReader", "this user do not have sleep data");
                memberSleepCardReader.u();
                memberSleepCardReader.e(2);
            }
        }
    }
}
