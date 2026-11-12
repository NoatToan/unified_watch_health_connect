package com.huawei.ui.main.stories.discover.provider;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.C;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.marketing.datatype.RecommendResourceInfo;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.up.model.UserInfomation;
import defpackage.njy;
import defpackage.qgm;
import defpackage.qom;
import defpackage.qqt;
import defpackage.wva;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes43.dex */
public class MemberSportsCardReader extends MemberCardReader {
    private int g;
    private final String[] h;
    private final int[] i;
    private boolean j;
    private RecommendResourceInfo k;
    private final HashMap<Integer, String> l;
    private SportDataType m;
    private long n;
    private int o;

    enum SportDataType {
        ADD_RECORD("addRecord"),
        INADEQUATE_EXERCISE("inadequateExercise"),
        NORMAL_EXERCISE("normalExercise"),
        ADEQUATE_EXERCISE("adequateExercise"),
        INADEQUATE_STEP("inadequateSteps"),
        ADEQUATE_STEP("adequateSteps");

        private String mTypeId;

        SportDataType(String str) {
            this.mTypeId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getTypeId() {
            return this.mTypeId;
        }
    }

    public MemberSportsCardReader(Context context) {
        super(context);
        this.l = new HashMap<Integer, String>(3) { // from class: com.huawei.ui.main.stories.discover.provider.MemberSportsCardReader.5
            {
                put(0, "Male");
                put(1, "Female");
                put(2, "None");
            }
        };
        this.i = new int[]{40002, 47101};
        this.h = new String[]{"stepUserValue", "durationUserValue"};
        this.g = 2;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(1);
        e(arrayList, this);
        a("vipPageFitness");
        e(AnalyticsValue.VIP_INTRO_RECOMMEND_FITNESS_CARD.value());
        j("VIPCard_MemberSportsCardReader");
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void initCardReader(List<RecommendResourceInfo> list) {
        super.initCardReader(list);
        q();
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void registerCardListener(MemberCardListener memberCardListener) {
        LogUtil.a("VIPCard_MemberSportsCardReader", "registerCardListener is start");
        super.registerCardListener(memberCardListener);
        q();
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void unRegisterListener() {
        LogUtil.a("VIPCard_MemberSportsCardReader", "unRegisterListener is start");
        super.p();
        super.unRegisterListener();
        t();
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void queryLabel() {
        b(j() && c("fintness_dmp"));
        if (a() == 0) {
            LogUtil.a("VIPCard_MemberSportsCardReader", "Sport card reader:no privacy");
            if (o()) {
                t();
                this.m = SportDataType.ADD_RECORD;
                this.g = 2;
                this.j = true;
                q();
                return;
            }
            LogUtil.a("VIPCard_MemberSportsCardReader", "privacy status is not changed");
            return;
        }
        if (!k() && this.j && wva.e(this.n, System.currentTimeMillis()) && !o()) {
            LogUtil.a("VIPCard_MemberSportsCardReader", "mIsQueryLabelEnd is finished");
        } else {
            t();
            d(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.discover.provider.MemberSportsCardReader.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("VIPCard_MemberSportsCardReader", " errorCode is ", Integer.valueOf(i), " objData is ", obj);
                    if (obj instanceof SportDataType) {
                        MemberSportsCardReader.this.m = (SportDataType) obj;
                    }
                    LogUtil.a("VIPCard_MemberSportsCardReader", "mSportsDataType type is ", MemberSportsCardReader.this.m);
                    UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
                    if (userInfo != null && userInfo.isGenderValid()) {
                        MemberSportsCardReader.this.g = userInfo.getGender();
                        LogUtil.a("VIPCard_MemberSportsCardReader", "Query gender type is ", Integer.valueOf(MemberSportsCardReader.this.g));
                    }
                    MemberSportsCardReader.this.n = System.currentTimeMillis();
                    MemberSportsCardReader.this.j = true;
                    MemberSportsCardReader.this.q();
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader, com.huawei.ui.main.stories.discover.provider.MemberBaseCardReader
    public void setOrder(int i) {
        super.setOrder(i);
    }

    @Override // com.huawei.ui.main.stories.discover.provider.MemberCardReader
    protected void e(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("VIPCard_MemberSportsCardReader", "changeData is null in sport checkChangeValid");
            return;
        }
        String changeDataInfos = hiHealthData.getChangeDataInfos();
        List arrayList = new ArrayList(16);
        if (!TextUtils.isEmpty(changeDataInfos)) {
            arrayList = (List) qqt.c(changeDataInfos, new TypeToken<List<c>>() { // from class: com.huawei.ui.main.stories.discover.provider.MemberSportsCardReader.3
            }.getType());
        }
        LogUtil.a("VIPCard_MemberSportsCardReader", "changeInfoBeanList is ", arrayList);
        if (njy.e(arrayList)) {
            LogUtil.j("VIPCard_MemberSportsCardReader", "Json change is error");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (c((c) it.next())) {
                setDataChangeTrue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (!l() || !this.j || (!o() && n())) {
            LogUtil.a("VIPCard_MemberSportsCardReader", "Do not need to buildSportsCardBean");
            return;
        }
        String str = this.m.getTypeId() + this.l.get(Integer.valueOf(this.g));
        String str2 = "vipPageFitness-" + str;
        if (!b(str2)) {
            LogUtil.j("VIPCard_MemberSportsCardReader", "no matched resources, use ADD_RECORD_NONE_ID");
            this.m = SportDataType.ADD_RECORD;
            str = "addRecordNone";
            str2 = "vipPageFitness-addRecordNone";
        }
        f(str);
        i(str2);
        RecommendResourceInfo recommendResourceInfoD = d(f());
        this.k = recommendResourceInfoD;
        if (recommendResourceInfoD == null || recommendResourceInfoD.isInvalid()) {
            LogUtil.e("VIPCard_MemberSportsCardReader", "content is not complete ", this.k);
            return;
        }
        RecommendResourceInfo recommendResourceInfo = this.k;
        int color = d().getColor(R.color.hw_show_color_red1);
        d(recommendResourceInfo, Integer.valueOf(color), a(d(), this.m), Integer.valueOf(d().getColor(R.color.hw_show_color_red1)), r());
    }

    private qom r() {
        return new qom() { // from class: com.huawei.ui.main.stories.discover.provider.MemberSportsCardReader.1
            @Override // defpackage.qom, com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                MemberSportsCardReader memberSportsCardReader = MemberSportsCardReader.this;
                memberSportsCardReader.c(i, memberSportsCardReader.k);
            }
        };
    }

    private void d(IBaseResponseCallback iBaseResponseCallback) {
        long jG = HiDateUtil.g(System.currentTimeMillis()) - 86400000;
        long jP = HiDateUtil.p(System.currentTimeMillis()) - 604800000;
        LogUtil.a("VIPCard_MemberSportsCardReader", "startTime ", Long.valueOf(jP), " endTime ", Long.valueOf(jG));
        CountDownLatch countDownLatch = new CountDownLatch(2);
        qgm.c("900200006", new b(countDownLatch));
        HiAggregateOption hiAggregateOptionC = c(new Pair<>(Long.valueOf(jP), Long.valueOf(jG)));
        HashMap map = new HashMap(1);
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(hiAggregateOptionC, new a(map, countDownLatch));
        try {
            if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                LogUtil.j("VIPCard_MemberSportsCardReader", "RequestData wait timeout");
                iBaseResponseCallback.a(-1, SportDataType.ADD_RECORD);
                return;
            }
        } catch (InterruptedException unused) {
            LogUtil.e("VIPCard_MemberSportsCardReader", "interrupted while waiting for requestData");
        }
        if (!map.containsKey(0) || map.get(0) == null) {
            iBaseResponseCallback.a(-1, SportDataType.ADD_RECORD);
        } else {
            iBaseResponseCallback.a(0, b((List<HiHealthData>) map.get(0), this.o));
        }
    }

    private SportDataType b(List<HiHealthData> list, int i) {
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                int i4 = hiHealthData.getInt("stepUserValue");
                int i5 = hiHealthData.getInt("durationUserValue");
                if (i5 > 0) {
                    i2++;
                }
                if (i4 > 0) {
                    i3++;
                }
                f += i5;
                f2 += i4;
            }
        }
        int iD = (int) UnitUtil.d(i2 == 0 ? 0.0d : f / i2, 0);
        int iD2 = (int) UnitUtil.d(i3 != 0 ? f2 / i3 : 0.0d, 0);
        LogUtil.a("VIPCard_MemberSportsCardReader", " averageIntensity is ", Integer.valueOf(iD), " averageStepValue is ", Integer.valueOf(iD2), " stepGoal is ", Integer.valueOf(i));
        return b(iD, iD2, i);
    }

    private SportDataType b(int i, int i2, int i3) {
        if (i != 0) {
            if (i < 30) {
                return SportDataType.INADEQUATE_EXERCISE;
            }
            if (i < 60) {
                return SportDataType.NORMAL_EXERCISE;
            }
            return SportDataType.ADEQUATE_EXERCISE;
        }
        if (i2 == 0) {
            return SportDataType.ADD_RECORD;
        }
        if (i3 == 0) {
            i3 = 10000;
        }
        if (i2 < i3) {
            return SportDataType.INADEQUATE_STEP;
        }
        return SportDataType.ADEQUATE_STEP;
    }

    private HiAggregateOption c(Pair<Long, Long> pair) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(((Long) pair.first).longValue());
        hiAggregateOption.setEndTime(((Long) pair.second).longValue());
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setType(this.i);
        hiAggregateOption.setConstantsKey(this.h);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        return hiAggregateOption;
    }

    private SpannableString a(Context context, SportDataType sportDataType) {
        String strE;
        String string = context.getString(R.string.IDS_member_sport_adequate);
        int iOrdinal = sportDataType.ordinal();
        if (iOrdinal != 0) {
            strE = null;
            if (iOrdinal == 1) {
                string = context.getString(R.string.IDS_member_sport_inadequate);
            } else if (iOrdinal == 4) {
                string = context.getString(R.string.IDS_member_sport_not_achieved);
            } else if (iOrdinal == 5) {
                string = context.getString(R.string.IDS_member_sport_achieved);
            }
        } else {
            strE = UnitUtil.e(30.0d, 1, 0);
            string = context.getResources().getQuantityString(R.plurals.IDS_member_no_data, 30, strE);
        }
        if (TextUtils.isEmpty(strE)) {
            strE = string;
        }
        return UnitUtil.b(context, strE, string, R.style.member_sports_card_data, R.style.weight_management_goal_normal);
    }

    private boolean c(c cVar) {
        if (cVar == null) {
            LogUtil.j("VIPCard_MemberSportsCardReader", "changeInfoBean is null");
            return false;
        }
        if (cVar.e != 40002 && cVar.e != 47101) {
            LogUtil.a("VIPCard_MemberSportsCardReader", "Data change type is unrequired");
            return false;
        }
        if (cVar.f26457a != 0) {
            return cVar.f26457a < HiDateUtil.p(System.currentTimeMillis());
        }
        LogUtil.a("VIPCard_MemberSportsCardReader", "Data change with no start time");
        return false;
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MemberSportsCardReader> f26456b;
        private final CountDownLatch d;

        private b(MemberSportsCardReader memberSportsCardReader, CountDownLatch countDownLatch) {
            this.f26456b = new WeakReference<>(memberSportsCardReader);
            this.d = countDownLatch;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("VIPCard_MemberSportsCardReader", "getFitnessGoal errorCodeGoal is ", Integer.valueOf(i));
            MemberSportsCardReader memberSportsCardReader = this.f26456b.get();
            if (memberSportsCardReader == null) {
                LogUtil.j("VIPCard_MemberSportsCardReader", "ReadGoalBaseResponseCallback memberSportsCardReader is null");
                this.d.countDown();
            } else {
                if (obj instanceof Integer) {
                    memberSportsCardReader.o = ((Integer) obj).intValue();
                }
                this.d.countDown();
            }
        }
    }

    static class a implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f26454a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<Integer, List<HiHealthData>> f26455c;

        private a(Map<Integer, List<HiHealthData>> map, CountDownLatch countDownLatch) {
            this.f26455c = map;
            this.f26454a = countDownLatch;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            LogUtil.a("VIPCard_MemberSportsCardReader", "aggregateHiHealthData errorCode is ", Integer.valueOf(i));
            if (!njy.b((Object) list, HiHealthData.class)) {
                LogUtil.e("VIPCard_MemberSportsCardReader", "HiHealthData not match");
            } else {
                this.f26455c.put(0, list);
            }
            this.f26454a.countDown();
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.a("VIPCard_MemberSportsCardReader", "typeSelectByRequestData onResultIntent");
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("start_time")
        long f26457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("device_uniquecode")
        String f26458b;

        @SerializedName("end_time")
        long d;

        @SerializedName("type")
        int e;

        private c() {
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("ChangeInfoBean{type=");
            stringBuffer.append(this.e);
            stringBuffer.append(", startTime = ").append(this.f26457a);
            stringBuffer.append(", endTime = ").append(this.d);
            stringBuffer.append(", deviceId = ").append(this.f26458b);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }
}
