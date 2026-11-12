package com.xiaomi.hm.health.mainpage;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.privacy.PrivacyProvider;
import com.huami.privacy.plugin.CreatedActivityClassNames;
import com.huami.privacy.plugin.PrivacyPlugin;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.bodyfat.activity.BabyWeightActivity;
import com.xiaomi.hm.health.bodyfat.activity.BodyFatDetailActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightDetailActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightingActivity;
import com.xiaomi.hm.health.bodyfat.event.EventWeightChanged;
import com.xiaomi.hm.health.bodyfat.family.MemberInfoSetWeightActivity;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.model.WeightBoundState;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.HMDeviceWeightValueEvent;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0007J\b\u0010\u001a\u001a\u00020\u0004H\u0007J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010 R&\u0010&\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0016\u0010+\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/WeightManager;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/xiaomi/hm/health/device/event/HMDeviceWeightValueEvent;", "event", "", "b", "", "i", "", DbUtils.Const.Columns.Event.EVENT_ID, "value", z.j, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "h", "g", "f", "e", "activityClassName", GoogleApiAvailabilityLight.a, "c", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", ParamKey.weightData, "checkTime", "a", PointCategory.INIT, "release", "onEventMainThread", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/xiaomi/hm/health/bodyfat/model/WeightBoundState;", "Lcom/xiaomi/hm/health/bodyfat/model/WeightBoundState;", "boundState", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "isBoundList", "J", "checkBoundTimeStamp", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "weightAdvData", "mLastJumpToWeightingPageTime", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightManager implements LifecycleObserver {

    @NotNull
    private static final String g = "WeightManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppCompatActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private WeightBoundState boundState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Long> isBoundList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long checkBoundTimeStamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private WeightAdvData weightAdvData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long mLastJumpToWeightingPageTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String h = MemberInfoSetWeightActivity.class.getName();
    private static final String i = BabyWeightActivity.class.getName();
    private static final String j = MainTabActivity.class.getName();
    private static final String k = WeightDetailActivity.class.getName();
    private static final String l = BodyFatDetailActivity.class.getName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001e\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/WeightManager$Companion;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/xiaomi/hm/health/mainpage/WeightManager;", "create", "", "kotlin.jvm.PlatformType", "BABY_WEIGHTING_CLASS_NAME", "Ljava/lang/String;", "BODYFAT_DETAIL_CLASS_NAME", "MAINTAB_CLASS_NAME", "MEMBER_WEIGHTING_CLASS_NAME", "TAG", "WEIGHT_DETAIL_CLASS_NAME", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WeightManager create(@NotNull AppCompatActivity activity) {
            return new WeightManager(activity, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ WeightAdvData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeightAdvData weightAdvData) {
            super(0);
            this.a = weightAdvData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "check before time = " + this.a.getTimestamp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ WeightAdvData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WeightAdvData weightAdvData) {
            super(0);
            this.a = weightAdvData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "check after  time = " + this.a.getTimestamp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "checkBoundTimeStamp = " + WeightManager.this.checkBoundTimeStamp;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<WeightInfos> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.ObjectRef<WeightInfos> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "insert bound weightInfo = " + HMWeightUtils.toString(this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "第一次收到称重已稳定数据，设置称重session-- " + WeightManager.this.weightAdvData.getMeasureData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceWeightValueEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMDeviceWeightValueEvent hMDeviceWeightValueEvent) {
            super(0);
            this.a = hMDeviceWeightValueEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "称重session过期-- " + this.a.getWeightAdvData().getMeasureData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceWeightValueEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMDeviceWeightValueEvent hMDeviceWeightValueEvent) {
            super(0);
            this.a = hMDeviceWeightValueEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "上次称重未结束的数据，不进入测量页面-- " + this.a.getWeightAdvData().getMeasureData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceWeightValueEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HMDeviceWeightValueEvent hMDeviceWeightValueEvent) {
            super(0);
            this.a = hMDeviceWeightValueEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "与上次称重数据不一致，进入测量页面-- " + this.a.getWeightAdvData().getMeasureData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceWeightValueEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HMDeviceWeightValueEvent hMDeviceWeightValueEvent) {
            super(0);
            this.a = hMDeviceWeightValueEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "HMDeviceWeightValueEvent isBound " + this.a.isBoundValue() + ", data =  " + this.a.getWeightAdvData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceWeightValueEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HMDeviceWeightValueEvent hMDeviceWeightValueEvent) {
            super(0);
            this.a = hMDeviceWeightValueEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "该条数据是绑定体脂称时补发的数据 ： data = " + this.a.getWeightAdvData();
        }
    }

    private WeightManager(AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
        this.isBoundList = new ArrayList<>();
        appCompatActivity.getLifecycle().addObserver(this);
    }

    public /* synthetic */ WeightManager(AppCompatActivity appCompatActivity, DefaultConstructorMarker defaultConstructorMarker) {
        this(appCompatActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, com.xiaomi.hm.health.databases.model.WeightInfos] */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, com.xiaomi.hm.health.databases.model.WeightInfos] */
    private final void a(WeightAdvData weightData, boolean checkTime) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? weightInfos = new WeightInfos();
        objectRef.element = weightInfos;
        ((WeightInfos) weightInfos).setDevice_id(weightData.getDeviceId());
        ((WeightInfos) objectRef.element).setSync(0);
        if (checkTime) {
            HMLog.info(g, new a(weightData));
            weightData.checkTimestamp();
            HMLog.info(g, new b(weightData));
            this.checkBoundTimeStamp = weightData.getTimestamp();
        } else {
            HMLog.info(g, new c());
        }
        ((WeightInfos) objectRef.element).setTimestamp(Long.valueOf(this.checkBoundTimeStamp));
        ((WeightInfos) objectRef.element).setWeight(Float.valueOf(weightData.getValueKg()));
        ((WeightInfos) objectRef.element).setType(0);
        long j2 = Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid());
        ((WeightInfos) objectRef.element).setUserId(-1L);
        int sourceValue = weightData.getSourceValue();
        weightData.setTimestamp(this.checkBoundTimeStamp);
        if (HMDeviceConfig.hasBoundBfs()) {
            if (weightData.isImpedanceStable()) {
                objectRef.element = BodyParamsUtils.addBodyParams((WeightInfos) objectRef.element, weightData, j2);
            } else {
                int height = HMPersonInfo.getInstance().getUserInfo().getHeight();
                ((WeightInfos) objectRef.element).setBmi(Float.valueOf(HMWeightUtils.calcuBMI(height, ((WeightInfos) objectRef.element).getWeight().floatValue())));
                ((WeightInfos) objectRef.element).setHeight(Integer.valueOf(height));
            }
        }
        ((WeightInfos) objectRef.element).setSource(Integer.valueOf(sourceValue));
        HMLog.info(g, new d(objectRef));
        WeightInfoManager.getManager().addInfo((WeightInfos) objectRef.element);
        EventBus.getDefault().post(new EventWeightChanged(j2, 9));
    }

    private final void b(HMDeviceWeightValueEvent event) {
        if (HMWeightUtils.isAmazfitScale()) {
            WeightAdvData weightAdvData = this.weightAdvData;
            if (weightAdvData == null) {
                if (HMWeightUtils.isWeightStable(event.getWeightAdvData())) {
                    WeightAdvData weightAdvData2 = event.getWeightAdvData();
                    this.weightAdvData = weightAdvData2;
                    weightAdvData2.setTimestamp(System.currentTimeMillis());
                    HMLog.info(g, new e());
                }
            } else if (HMWeightUtils.isLastWeightDataSession(weightAdvData, event.getWeightAdvData())) {
                if (!HMWeightUtils.isWeightSessionIdOutOfDate(this.weightAdvData)) {
                    HMLog.info(g, new g(event));
                    return;
                }
                HMLog.info(g, new f(event));
            } else if (event.getWeightAdvData().getMeasureData() != null) {
                HMLog.info(g, new h(event));
            }
        }
        if (this.mLastJumpToWeightingPageTime == event.getWeightAdvData().getTimestamp() || d(this.activity, WeightingActivity.class.getName()) || !f(this.activity)) {
            return;
        }
        this.mLastJumpToWeightingPageTime = event.getWeightAdvData().getTimestamp();
        WeightingActivity.INSTANCE.launch(this.activity, event.getWeightAdvData());
        if (h(this.activity)) {
            j(i() ? "Weight_Scale" : "Weight_BodyFatScale", "Chart_Weight");
        } else if (g(this.activity)) {
            j(i() ? "Weight_Scale" : "Weight_BodyFatScale", "Chart_BodyFat");
        } else {
            j(i() ? "Weight_Scale" : "Weight_BodyFatScale", "Dashboard");
        }
    }

    private final String c(Context context) throws Exception {
        PrivacyProvider privacyProvider = PrivacyProvider.INSTANCE;
        if ("顶层Activity为特定页面时，才可进入称重界面".length() == 0) {
            throw new Exception("请填写此隐私信息的使用目的");
        }
        for (Object obj : privacyProvider.getPlugins()) {
            if (Intrinsics.areEqual(((PrivacyPlugin) obj).getClass(), CreatedActivityClassNames.class)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.privacy.plugin.CreatedActivityClassNames");
                return (String) CollectionsKt.firstOrNull((List) ((CreatedActivityClassNames) obj).getValue());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final boolean d(Context context, String activityClassName) {
        if (activityClassName == null) {
            return false;
        }
        if (!(activityClassName.length() > 0)) {
            activityClassName = null;
        }
        if (activityClassName == null) {
            return false;
        }
        return activityClassName.equals(c(context));
    }

    private final boolean e(Context context) throws Exception {
        String strC = c(context);
        return Intrinsics.areEqual(h, strC) || Intrinsics.areEqual(i, strC);
    }

    private final boolean f(Context context) throws Exception {
        String strC = c(context);
        return Intrinsics.areEqual(j, strC) || Intrinsics.areEqual(k, strC) || Intrinsics.areEqual(l, strC);
    }

    private final boolean g(Context context) {
        return Intrinsics.areEqual(l, c(context));
    }

    private final boolean h(Context context) {
        return Intrinsics.areEqual(k, c(context));
    }

    private final boolean i() {
        return HMDeviceManager.getInstance().hasBound(HMDeviceSource.WEIGHT);
    }

    private final void j(String eventId, String value) {
        Analytics.recordEvent(new CountEventBuilder(eventId).setValue(value));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void init() {
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public final void onEventMainThread(@NotNull HMDeviceWeightValueEvent event) {
        WeightInfos info;
        HMLog.debug(g, new i(event));
        long timestamp = event.getWeightAdvData().getTimestamp();
        if (event.isBoundValue()) {
            this.boundState = WeightBoundState.isBound;
            this.isBoundList.add(Long.valueOf(timestamp));
            a(event.getWeightAdvData(), true);
            return;
        }
        if (this.boundState == WeightBoundState.isBound && HMDeviceConfig.hasBoundBfs() && this.isBoundList.contains(Long.valueOf(timestamp))) {
            HMLog.info(g, new j(event));
            this.boundState = WeightBoundState.isNotBound;
            WeightAdvData weightAdvData = event.getWeightAdvData();
            if (weightAdvData.isImpedanceStable() && (info = WeightInfoManager.getManager().getInfo(this.checkBoundTimeStamp)) != null && info.getImpedance() == null) {
                a(weightAdvData, false);
                return;
            }
        }
        if (e(this.activity)) {
            return;
        }
        if (event.getWeightAdvData().isFinish()) {
            this.weightAdvData = null;
        } else {
            b(event);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }
}
