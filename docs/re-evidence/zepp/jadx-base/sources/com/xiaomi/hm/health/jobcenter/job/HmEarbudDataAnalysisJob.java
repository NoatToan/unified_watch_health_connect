package com.xiaomi.hm.health.jobcenter.job;

import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.EarbudDateData;
import com.xiaomi.hm.health.databases.model.EarbudDateDataDao;
import com.xiaomi.hm.health.databases.model.ManualData;
import com.xiaomi.hm.health.databases.model.ManualDataDao;
import com.xiaomi.hm.health.dataprocess.DataAnalysis;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.UserInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.sport.OriginSportData;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.eventbus.EventDateDataAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventHWBandAnalysisJobFinished;
import com.xiaomi.hm.health.eventbus.EventRecentInfoAnalysisJobFinished;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.model.summery.DeviceDataSelectInfo;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xiaomi.hm.health.utils.Utils;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B!\b\u0016\u0012\u0006\u0010'\u001a\u00020\r\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+B!\b\u0016\u0012\u0006\u0010,\u001a\u00020\u0019\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b*\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010\u0017\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b\u001c\u0010%¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/jobcenter/job/HmEarbudDataAnalysisJob;", "Lcom/xiaomi/hm/health/jobcenter/manager/ThreadJobObject;", "Lorg/koin/core/component/KoinComponent;", "", "h", "", "time", "", "e", "score", "Lcom/xiaomi/hm/health/databases/model/ManualData;", "data", "f", "", "summary", "sn", "c", "oldSummary", "i", "Lcom/xiaomi/hm/health/databases/model/EarbudDateData;", "dateData", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "sportDay", "g", "run", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "Lcom/xiaomi/hm/health/dataprocess/DaySportData;", "mTodayDatas", GoogleApiAvailabilityLight.a, LogUtil.I, "mDataType", "", "Z", "isNetDataMerged", "mDeviceType", "Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "deviceSnService", "key", "dataType", "deviceType", "<init>", "(Ljava/lang/String;II)V", "todayDatas", "(Lcom/xiaomi/hm/health/dataprocess/DaySportData;II)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudDataAnalysisJob extends ThreadJobObject implements KoinComponent {

    @NotNull
    private static final String h = "HmEarbudDataAnalysisJob";
    private static final int i = 30;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DaySportData mTodayDatas;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int mDataType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isNetDataMerged;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int mDeviceType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSnService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Exception exc = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append(exc);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "set edit slp time when there was not a slp " + HmEarbudDataAnalysisJob.this.mTodayDatas.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ UserInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UserInfo userInfo) {
            super(0);
            this.b = userInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "setSummary : " + HmEarbudDataAnalysisJob.this.mTodayDatas.getSummary(this.b.goal);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sleep rest hr map : " + HmEarbudDataAnalysisJob.this.mTodayDatas.getSleepInfo().getNoRestHeartRateMap();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "time used " + (System.currentTimeMillis() - this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "算法分析 start ============== " + HmEarbudDataAnalysisJob.this.mTodayDatas.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "今天的ＤＳＤ无条件走算法分析" + HmEarbudDataAnalysisJob.this.mTodayDatas.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "没有数据，无法分析\u3000：\u3000" + HmEarbudDataAnalysisJob.this.mTodayDatas.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start : " + this.a + "," + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ UserInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(UserInfo userInfo) {
            super(0);
            this.b = userInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "all edit slp setSummary : " + HmEarbudDataAnalysisJob.this.mTodayDatas.getSummary(this.b.goal);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "merge db data :" + HmEarbudDataAnalysisJob.this.mTodayDatas.getSportDay();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startTime : " + this.a + "," + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "mDeviceType = " + HmEarbudDataAnalysisJob.this.mDeviceType + ";device id " + ((Object) this.b.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ ManualData b;
        public final /* synthetic */ UserInfo c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ManualData manualData, UserInfo userInfo) {
            super(0);
            this.b = manualData;
            this.c = userInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getUsrSum : " + HmEarbudDataAnalysisJob.this.mTodayDatas.getKey() + ";" + this.b.getSummary() + "," + HmEarbudDataAnalysisJob.this.mTodayDatas.getSummary(this.c.goal);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ ManualData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ManualData manualData) {
            super(0);
            this.a = manualData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save  : " + this.a.getSummary();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ EarbudDateData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(EarbudDateData earbudDateData) {
            super(0);
            this.a = earbudDateData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新前：：" + this.a.getSummary();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ EarbudDateData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(EarbudDateData earbudDateData) {
            super(0);
            this.a = earbudDateData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新后：：" + this.a.getSummary();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmEarbudDataAnalysisJob(@NotNull String str, int i2, int i3) {
        super(4);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceSnService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceSnService>() { // from class: com.xiaomi.hm.health.jobcenter.job.HmEarbudDataAnalysisJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceSnService invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceSnService.class), qualifier, objArr);
            }
        });
        this.mDataType = i2;
        this.mDeviceType = i3;
        this.mTodayDatas = new DaySportData(SportDay.fromString(str));
    }

    private final String c(String summary, String sn) {
        if (TextUtils.isEmpty(sn) || TextUtils.isEmpty(summary)) {
            return summary;
        }
        try {
            JSONObject jSONObject = new JSONObject(summary);
            jSONObject.put("sn", sn);
            return jSONObject.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.error$default("addDeviceSnInfo err", null, null, new a(e2), 6, null);
            return summary;
        }
    }

    private final DeviceSnService d() {
        return (DeviceSnService) this.deviceSnService.getValue();
    }

    private final int e(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        return calendar.get(9) == 0 ? (i2 * 60) + i3 : (i2 * 60) + i3 + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN;
    }

    private final void f(int score, ManualData data) {
        try {
            JSONObject jSONObject = new JSONObject(data.getSummary());
            if (score != jSONObject.optInt("ss")) {
                jSONObject.put("ss", score);
                data.setSummary(jSONObject.toString());
                data.setSynced(0);
                HMLog.debug(h, new p(data));
                HMDaoManager.getInstance().getManualDataDao().save(data);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void g(EarbudDateData dateData, SportDay sportDay, String summary) {
        String strI;
        if (dateData != null) {
            try {
                if (dateData.getData() != null && this.mDataType == 0 && !sportDay.isToday() && (strI = i(summary, dateData.getSummary())) != null) {
                    JSONObject jSONObject = new JSONObject(strI).getJSONObject("slp");
                    JSONObject jSONObject2 = new JSONObject(dateData.getSummary());
                    jSONObject2.put("slp", jSONObject);
                    HMLog.debug(h, new q(dateData));
                    dateData.setSummary(jSONObject2.toString());
                    HMLog.debug(h, new r(dateData));
                    HMDaoManager.getInstance().getEarbudDateDataDao().insertOrReplace(dateData);
                    HMDataCacheCenter.getInstance().getmBandUint().updateSummaryByDay(sportDay);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private final void h() {
        SportDay sportDay = this.mTodayDatas.getSportDay();
        ArrayList arrayList = new ArrayList();
        int i2 = 30;
        while (true) {
            int i3 = i2 - 1;
            HMSummery specifyDaySummary = HMDataCacheCenter.getInstance().getEarbudUnit().getSpecifyDaySummary(sportDay.addDay(-i2).getKey());
            if (specifyDaySummary != null) {
                arrayList.add(specifyDaySummary);
            } else {
                arrayList.add(new HMSummery());
            }
            if (1 > i3) {
                break;
            } else {
                i2 = i3;
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            if (size > 0) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (((HMSummery) arrayList.get(i4)).sleep == null || ((HMSummery) arrayList.get(i4)).sleep.sleepMinutes <= 0) {
                        iArr[i4] = 0;
                        iArr2[i4] = 0;
                    } else {
                        iArr[i4] = e(((HMSummery) arrayList.get(i4)).sleep.st);
                        iArr2[i4] = ((HMSummery) arrayList.get(i4)).sleep.sleepMinutes;
                    }
                    if (i5 >= size) {
                        break;
                    } else {
                        i4 = i5;
                    }
                }
            }
            DataAnalysis.setSleepResultOfLastThirtyDays(iArr, iArr2, size);
        }
    }

    private final String i(String summary, String oldSummary) {
        if (oldSummary != null && !TextUtils.isEmpty(oldSummary) && !TextUtils.isEmpty(summary)) {
            try {
                JSONObject jSONObject = new JSONObject(oldSummary);
                if (!jSONObject.has("slp")) {
                    return summary;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("slp");
                if (!jSONObject2.has("selected")) {
                    return summary;
                }
                JSONObject jSONObject3 = new JSONObject(summary);
                JSONObject jSONObject4 = jSONObject3.getJSONObject("slp");
                jSONObject4.put("selected", jSONObject2.optInt("selected", 0));
                jSONObject3.put("slp", jSONObject4);
                return jSONObject3.toString();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return summary;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x0448 A[Catch: Exception -> 0x0670, TryCatch #0 {Exception -> 0x0670, blocks: (B:3:0x0007, B:6:0x0069, B:59:0x02df, B:61:0x0307, B:62:0x0311, B:64:0x034a, B:66:0x0354, B:68:0x035e, B:72:0x0373, B:74:0x0379, B:71:0x036f, B:75:0x039b, B:108:0x04b2, B:112:0x04e4, B:114:0x04ea, B:116:0x0513, B:118:0x051d, B:120:0x052f, B:122:0x0555, B:124:0x0561, B:125:0x0585, B:127:0x0594, B:128:0x059d, B:130:0x05ad, B:131:0x05b5, B:139:0x05ee, B:141:0x0604, B:144:0x0622, B:146:0x0627, B:150:0x064c, B:152:0x0668, B:149:0x063d, B:143:0x0610, B:134:0x05c4, B:138:0x05e5, B:137:0x05e1, B:111:0x04e0, B:81:0x03ba, B:83:0x03e3, B:84:0x03e9, B:86:0x03ff, B:88:0x0414, B:94:0x0448, B:95:0x0453, B:99:0x0470, B:102:0x047c, B:104:0x04a2, B:107:0x04af, B:106:0x04a7, B:98:0x046c, B:91:0x0440, B:11:0x007d, B:15:0x00bf, B:17:0x00c5, B:19:0x00cf, B:21:0x00ef, B:23:0x012d, B:25:0x0174, B:24:0x0156, B:27:0x019e, B:26:0x018c, B:14:0x00bb, B:29:0x01ae, B:43:0x01cd, B:45:0x0201, B:47:0x020b, B:49:0x0215, B:51:0x0238, B:53:0x026a, B:55:0x02ad, B:54:0x0291, B:57:0x02cf, B:56:0x02bb, B:32:0x01ba, B:35:0x01c1, B:39:0x01c7, B:9:0x0077), top: B:157:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [T, java.lang.String] */
    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        byte[] data;
        boolean z;
        super.run();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HMLog.debug(h, new g());
            DaySportData daySportData = new DaySportData(this.mTodayDatas.getSportDay().getPreDay());
            DaySportData daySportData2 = new DaySportData(this.mTodayDatas.getSportDay().getNextDay());
            HmEarbudDateDataUtil hmEarbudDateDataUtil = HmEarbudDateDataUtil.INSTANCE;
            EarbudDateData specifyDayData = hmEarbudDateDataUtil.getSpecifyDayData(this.mTodayDatas.getKey());
            EarbudDateData specifyDayData2 = hmEarbudDateDataUtil.getSpecifyDayData(daySportData.getKey());
            EarbudDateData specifyDayData3 = hmEarbudDateDataUtil.getSpecifyDayData(daySportData2.getKey());
            UserInfo algoUserInfo = Utils.getAlgoUserInfo();
            if (this.mTodayDatas.getSportDay().isToday()) {
                HMLog.debug(h, new h());
            } else {
                if ((specifyDayData == null ? null : specifyDayData.getData()) == null) {
                    HMLog.debug(h, new i());
                    this.mTodayDatas.setDataStastus(3);
                    ManualData manualDataUnique = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(this.mTodayDatas.getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
                    if (TextUtils.isEmpty(manualDataUnique == null ? null : manualDataUnique.getSummary()) || !HMDataCacheCenter.getInstance().isActivEarbudDataSynced()) {
                        DaySportData daySportData3 = this.mTodayDatas;
                        daySportData3.setSleepInfo(new SleepInfo(daySportData3.getSportDay().getTimestamp()));
                    } else {
                        JSONObject jSONObject = new JSONObject(manualDataUnique.getSummary());
                        long jOptLong = jSONObject.optLong(UserDataStore.STATE);
                        long jOptLong2 = jSONObject.optLong("ed");
                        int iOptInt = jSONObject.optInt("sf");
                        if (Utils.isManualDataSlpValid(manualDataUnique.getSummary(), null)) {
                            long j2 = 1000;
                            int iE = e(jSONObject.optLong(UserDataStore.STATE) * j2);
                            int iE2 = e(jSONObject.optLong("ed") * j2);
                            HMLog.debug(h, new j(iE, iE2));
                            DataAnalysis.dataInit(algoUserInfo, daySportData, this.mTodayDatas, daySportData2);
                            DataAnalysis.setUserModifySleep(iE, iE2);
                            h();
                            DataAnalysis.dataProcess(this.mTodayDatas);
                            DataAnalysis.dataDestory();
                            if (this.mTodayDatas.getSleepInfo() == null) {
                                SleepInfo sleepInfo = new SleepInfo(this.mTodayDatas.getSportDay().getTimestamp());
                                this.mTodayDatas.setSleepInfo(sleepInfo);
                                sleepInfo.setUserEditIdx(jOptLong * j2, jOptLong2 * j2, this.mTodayDatas.getSportDay());
                                sleepInfo.setSleepFeeling(iOptInt);
                            } else {
                                this.mTodayDatas.getSleepInfo().setUserEditIdx(jOptLong * j2, jOptLong2 * j2, this.mTodayDatas.getSportDay());
                                this.mTodayDatas.getSleepInfo().setSleepFeeling(iOptInt);
                            }
                            f(this.mTodayDatas.getSleepInfo().getSleepScore(), manualDataUnique);
                            HMLog.debug(h, new k(algoUserInfo));
                        }
                    }
                    EventBus.getDefault().post(new EventDateDataAnalysisJobFinished(null, this.mTodayDatas));
                    return;
                }
                OriginSportData originSportDataJsonToSportData = OriginSportData.jsonToSportData(specifyDayData.getData());
                if (originSportDataJsonToSportData == null || (data = originSportDataJsonToSportData.getData()) == null) {
                    z = false;
                } else {
                    if (!(data.length == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    this.mTodayDatas.setDataStastus(3);
                    ManualData manualDataUnique2 = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(ManualDataDao.Properties.Date.eq(this.mTodayDatas.getKey()), ManualDataDao.Properties.Type.eq("sleep")).unique();
                    if (manualDataUnique2 == null || TextUtils.isEmpty(manualDataUnique2.getSummary()) || !HMDataCacheCenter.getInstance().isActivEarbudDataSynced()) {
                        this.mTodayDatas.setSleepInfo(new SleepInfo(this.mTodayDatas.getSportDay().getTimestamp()));
                    } else {
                        JSONObject jSONObject2 = new JSONObject(manualDataUnique2.getSummary());
                        long jOptLong3 = jSONObject2.optLong(UserDataStore.STATE);
                        long jOptLong4 = jSONObject2.optLong("ed");
                        int iOptInt2 = jSONObject2.optInt("sf");
                        if (Utils.isManualDataSlpValid(manualDataUnique2.getSummary(), specifyDayData.getSummary())) {
                            long j3 = 1000;
                            int iE3 = e(jSONObject2.optLong(UserDataStore.STATE) * j3);
                            int iE4 = e(jSONObject2.optLong("ed") * j3);
                            DataAnalysis.dataInit(algoUserInfo, daySportData, this.mTodayDatas, daySportData2);
                            DataAnalysis.setUserModifySleep(iE3, iE4);
                            h();
                            DataAnalysis.dataProcess(this.mTodayDatas);
                            DataAnalysis.dataDestory();
                            if (this.mTodayDatas.getSleepInfo() == null) {
                                SleepInfo sleepInfo2 = new SleepInfo(this.mTodayDatas.getSportDay().getTimestamp());
                                this.mTodayDatas.setSleepInfo(sleepInfo2);
                                sleepInfo2.setUserEditIdx(jOptLong3 * j3, jOptLong4 * j3, this.mTodayDatas.getSportDay());
                                sleepInfo2.setSleepFeeling(iOptInt2);
                            } else {
                                this.mTodayDatas.getSleepInfo().setUserEditIdx(jOptLong3 * j3, jOptLong4 * j3, this.mTodayDatas.getSportDay());
                                this.mTodayDatas.getSleepInfo().setSleepFeeling(iOptInt2);
                            }
                            f(this.mTodayDatas.getSleepInfo().getSleepScore(), manualDataUnique2);
                        }
                    }
                    EventBus.getDefault().post(new EventDateDataAnalysisJobFinished(null, this.mTodayDatas));
                    return;
                }
            }
            HMDataCacheCenter.getInstance().getEarbudUnit().parseDsdFromData(this.mTodayDatas, specifyDayData);
            HMDataCacheCenter.getInstance().getEarbudUnit().parseDsdFromData(daySportData, specifyDayData2);
            HMDataCacheCenter.getInstance().getEarbudUnit().parseDsdFromData(daySportData2, specifyDayData3);
            if (2 == this.mDataType) {
                HMLog.debug(h, new l());
                this.isNetDataMerged = true;
            }
            DataAnalysis.setDaySleepDetectionStatus(0);
            DataAnalysis.dataInit(algoUserInfo, daySportData, this.mTodayDatas, daySportData2);
            QueryBuilder<ManualData> queryBuilder = HMDaoManager.getInstance().getManualDataDao().queryBuilder();
            Property property = ManualDataDao.Properties.Date;
            WhereCondition whereConditionEq = property.eq(this.mTodayDatas.getKey());
            Property property2 = ManualDataDao.Properties.Type;
            ManualData manualDataUnique3 = queryBuilder.where(whereConditionEq, property2.eq("sleep")).unique();
            if (manualDataUnique3 != null && !TextUtils.isEmpty(manualDataUnique3.getSummary()) && HMDataCacheCenter.getInstance().isActivDataSynced()) {
                JSONObject jSONObject3 = new JSONObject(manualDataUnique3.getSummary());
                if (Utils.isManualDataSlpValid(manualDataUnique3.getSummary(), specifyDayData == null ? null : specifyDayData.getSummary())) {
                    long j4 = 1000;
                    int iE5 = e(jSONObject3.optLong(UserDataStore.STATE) * j4);
                    int iE6 = e(j4 * jSONObject3.optLong("ed"));
                    HMLog.debug(h, new m(iE5, iE6));
                    DataAnalysis.setUserModifySleep(iE5, iE6);
                }
            }
            DataAnalysis.dataProcess(this.mTodayDatas);
            DataAnalysis.dataDestory();
            this.mTodayDatas.setDataStastus(3);
            int i2 = this.mDataType;
            if (1 == i2 || 2 == i2) {
                EarbudDateDataDao earbudDateDataDao = HMDaoManager.getInstance().getEarbudDateDataDao();
                HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(this.mDeviceType);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = HMDeviceManager.getInstance().getBoundDeviceId(hMDeviceTypeFromValue);
                HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(hMDeviceTypeFromValue);
                if (hMDeviceTypeFromValue == HMDeviceType.VDevice) {
                    objectRef.element = EcgData.DEFAULT_DIGIT_VALUE;
                    boundDeviceSource = HMDeviceSource.VDEVICE;
                }
                HMLog.debug(h, new n(objectRef));
                EarbudDateData earbudDateDataLoad = earbudDateDataDao.load(this.mTodayDatas.getKey());
                if (earbudDateDataLoad == null) {
                    earbudDateDataLoad = new EarbudDateData();
                    earbudDateDataLoad.setSync(0);
                    Unit unit = Unit.INSTANCE;
                }
                earbudDateDataLoad.setDate(this.mTodayDatas.getKey());
                earbudDateDataLoad.setDeviceId((String) objectRef.element);
                earbudDateDataLoad.setType(Integer.valueOf(hMDeviceTypeFromValue.getValue()));
                Integer source = earbudDateDataLoad.getSource();
                HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
                int value = hMDeviceSource.getValue();
                if (source != null && source.intValue() == value) {
                    earbudDateDataLoad.setSource(Integer.valueOf(boundDeviceSource.getValue()));
                } else if (boundDeviceSource != hMDeviceSource) {
                    earbudDateDataLoad.setSource(Integer.valueOf(boundDeviceSource.getValue()));
                }
                earbudDateDataLoad.setData(OriginSportData.sportDataBytesToJson(this.mTodayDatas.getBinaryData(), (String) objectRef.element, boundDeviceSource.getValue()));
                String summary = specifyDayData == null ? null : specifyDayData.getSummary();
                String sn = d().getSn(hMDeviceTypeFromValue);
                if (sn == null) {
                    sn = "";
                }
                earbudDateDataLoad.setSummary(i(c(this.mTodayDatas.getSummary(algoUserInfo.goal), sn), summary));
                earbudDateDataLoad.setTimeZone(Integer.valueOf(ProfileUtils.getTimezoneKey(TimeZone.getDefault())));
                if (this.isNetDataMerged || 1 == this.mDataType) {
                    earbudDateDataLoad.setSync(0);
                }
                earbudDateDataDao.insertOrReplace(earbudDateDataLoad);
            } else {
                hmEarbudDateDataUtil = hmEarbudDateDataUtil;
            }
            ManualData manualDataUnique4 = HMDaoManager.getInstance().getManualDataDao().queryBuilder().where(property.eq(this.mTodayDatas.getKey()), property2.eq("sleep")).unique();
            if (!TextUtils.isEmpty(manualDataUnique4 == null ? null : manualDataUnique4.getSummary())) {
                HMLog.debug(h, new o(manualDataUnique4, algoUserInfo));
                JSONObject jSONObject4 = new JSONObject(manualDataUnique4.getSummary());
                long jOptLong5 = jSONObject4.optLong(UserDataStore.STATE);
                long jOptLong6 = jSONObject4.optLong("ed");
                int iOptInt3 = jSONObject4.optInt("sf");
                if (this.mTodayDatas.getSleepInfo() != null && HMDataCacheCenter.getInstance().isActivDataSynced()) {
                    if (Utils.isManualDataSlpValid(manualDataUnique4.getSummary(), this.mTodayDatas.getSummary(algoUserInfo.goal))) {
                        long j5 = 1000;
                        long j6 = jOptLong5 * j5;
                        long j7 = jOptLong6 * j5;
                        this.mTodayDatas.getSleepInfo().setUserEditIdx(j6, j7, this.mTodayDatas.getSportDay());
                        if (this.mTodayDatas.getSleepInfo().getNonRemCount() == 0 && this.mTodayDatas.getSleepInfo().getRemCount() == 0) {
                            HMLog.debug(h, new b());
                            this.mTodayDatas.getSleepInfo().setStartDate(new Date(j6));
                            this.mTodayDatas.getSleepInfo().setStopDate(new Date(j7));
                        }
                        f(this.mTodayDatas.getSleepInfo().getSleepScore(), manualDataUnique4);
                    }
                    if (iOptInt3 > 0) {
                        this.mTodayDatas.getSleepInfo().setSleepFeeling(iOptInt3);
                    }
                }
            }
            HMLog.info(h, new c(algoUserInfo));
            if (this.mTodayDatas.getSleepInfo() != null) {
                HMLog.info(h, new d());
            }
            HmEarbudDateDataUtil hmEarbudDateDataUtil2 = hmEarbudDateDataUtil;
            EarbudDateData specifyDayData4 = hmEarbudDateDataUtil2.getSpecifyDayData(this.mTodayDatas.getKey());
            if (specifyDayData4 != null) {
                String summary2 = specifyDayData4.getSummary();
                boolean zSummaryHasSleep = hmEarbudDateDataUtil2.summaryHasSleep(summary2, true);
                boolean zSummaryIsSelect = hmEarbudDateDataUtil2.summaryIsSelect(summary2);
                String key = this.mTodayDatas.getKey();
                Integer source2 = specifyDayData4.getSource();
                hmEarbudDateDataUtil2.replaceDeviceSelectInfo(new DeviceDataSelectInfo(key, source2 == null ? -1 : source2.intValue(), zSummaryHasSleep, zSummaryIsSelect), true);
                Unit unit2 = Unit.INSTANCE;
            }
            g(specifyDayData, this.mTodayDatas.getSportDay(), this.mTodayDatas.getSummary(algoUserInfo.goal));
            if (this.mDataType == 1 || this.mTodayDatas.getSportDay().isToday()) {
                EventBus.getDefault().post(new EventHWBandAnalysisJobFinished(this.mTodayDatas, this.mDataType, this.mDeviceType));
            }
            int i3 = this.mDataType;
            if (3 == i3) {
                EventBus.getDefault().post(new EventRecentInfoAnalysisJobFinished(this.mTodayDatas.getKey()));
            } else if (4 != i3) {
                EventBus.getDefault().post(new EventDateDataAnalysisJobFinished(null, this.mTodayDatas));
            }
            HMLog.debug(h, new e(jCurrentTimeMillis));
            if (HMDataCacheCenter.getInstance().getEarbudUnit().getSyncedStatusHelper().isSynced()) {
                AppNotification.newInstance().showSleepNotification();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.info("HmEarbudDataAnalysisJob error happen ************************* ", new f(e2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmEarbudDataAnalysisJob(@NotNull DaySportData daySportData, int i2, int i3) {
        super(4);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceSnService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceSnService>() { // from class: com.xiaomi.hm.health.jobcenter.job.HmEarbudDataAnalysisJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceSnService invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceSnService.class), qualifier, objArr);
            }
        });
        this.mDataType = i2;
        this.mDeviceType = i3;
        this.mTodayDatas = daySportData;
    }
}
