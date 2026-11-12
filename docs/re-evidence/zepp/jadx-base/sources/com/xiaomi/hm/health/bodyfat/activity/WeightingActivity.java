package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.arch.helper.Resource;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.WeightingActivity;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.event.BFDeviceWeightValueEvent;
import com.xiaomi.hm.health.bodyfat.event.EventFinishGuestPre;
import com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBodyFailureFragment;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBodyFragment;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureHeartRateFragment;
import com.xiaomi.hm.health.bodyfat.fragment.MeasurePressureFragment;
import com.xiaomi.hm.health.bodyfat.fragment.WeightingExceptionFragment;
import com.xiaomi.hm.health.bodyfat.fragment.WeightingFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil;
import com.xiaomi.hm.health.bodyfat.viewmodel.MainWeightingViewModel;
import com.xiaomi.hm.health.bodyfat.worker.UploadWeightInfoWorker;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.MeasureData;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007*\u0001\u001d\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0002H\u0014R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initData", "r", "", "state", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "z", "y", "B", "x", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", LogUtil.I, "mState", "", "Ljava/lang/String;", "mTag", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "weightAdvData", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "viewModel", "com/xiaomi/hm/health/bodyfat/activity/WeightingActivity$chooseUserListener$1", "Lcom/xiaomi/hm/health/bodyfat/activity/WeightingActivity$chooseUserListener$1;", "chooseUserListener", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightingActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private WeightAdvData weightAdvData;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int mState = 257;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "WeightingHan";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final WeightingActivity$chooseUserListener$1 chooseUserListener = new ChooseUserFragment.ChooseUserListener() { // from class: com.xiaomi.hm.health.bodyfat.activity.WeightingActivity$chooseUserListener$1
        @Override // com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment.ChooseUserListener
        public void chooseUser(@NotNull UserInfos userInfos) {
            this.a.q().getChooseUser().setValue(Resource.INSTANCE.success(userInfos));
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/WeightingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "data", "", WebConstant.QueryParam.LAUNCH, "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @Nullable WeightAdvData data) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(ParamKey.weightData, data);
            Intent intent = new Intent(context, (Class<?>) WeightingActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.activity.WeightingActivity$initFragment$5$1", f = "WeightingActivity.kt", i = {}, l = {125, 127}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.activity.WeightingActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.activity.WeightingActivity$initFragment$5$1$1", f = "WeightingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0780a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ WeightingActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0780a(WeightingActivity weightingActivity, Continuation<? super C0780a> continuation) {
                super(2, continuation);
                this.b = weightingActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0780a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0780a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.A(WeightingState.state_bodyfat_detail);
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightingActivity.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ScaleSettingUpdateUtil scaleSettingUpdateUtil = ScaleSettingUpdateUtil.INSTANCE;
            this.a = 1;
            obj = scaleSettingUpdateUtil.breakMeasure(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            HMLog.v("breakMeasure", String.valueOf(((Boolean) obj).booleanValue()), new Object[0]);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C0780a c0780a = new C0780a(WeightingActivity.this, null);
            this.a = 2;
            if (BuildersKt.withContext(main, c0780a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MainWeightingViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MainWeightingViewModel getA() {
            return (MainWeightingViewModel) ViewModelProviders.of(WeightingActivity.this).get(MainWeightingViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(int state) {
        if (state != this.mState) {
            this.mState = state;
            boolean booleanExtra = getIntent().getBooleanExtra("IS_GUEST", false);
            switch (state) {
                case 258:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_weighting_frame, new MeasureBodyFragment()).commit();
                    break;
                case 259:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_weighting_frame, MeasureBodyFailureFragment.INSTANCE.newInstance(booleanExtra)).commit();
                    break;
                case 260:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_weighting_frame, new MeasureHeartRateFragment()).commit();
                    break;
                case 261:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_weighting_frame, new MeasurePressureFragment()).commit();
                    break;
                case WeightingState.state_weight_overload /* 262 */:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_weighting_frame, WeightingExceptionFragment.INSTANCE.newInstance(144)).commit();
                    break;
                case WeightingState.state_low_power /* 263 */:
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_weighting_frame, WeightingExceptionFragment.INSTANCE.newInstance(145)).commit();
                    break;
                case WeightingState.state_weight_detail /* 264 */:
                    z();
                    break;
                case WeightingState.state_bodyfat_detail /* 265 */:
                    y();
                    break;
            }
        }
    }

    private final void B() {
        WorkManager.getInstance(this).enqueueUniqueWork(ParamKey.uploadWorker, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(UploadWeightInfoWorker.class).build());
    }

    private final void initData() {
        Bundle extras = getIntent().getExtras();
        WeightAdvData weightAdvData = extras == null ? null : (WeightAdvData) extras.getParcelable(ParamKey.weightData);
        HMLog.v(this.mTag, weightAdvData != null ? weightAdvData.toJsonString() : null, new Object[0]);
        if (weightAdvData != null) {
            q().onEventMainThread(new BFDeviceWeightValueEvent(weightAdvData));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainWeightingViewModel q() {
        return (MainWeightingViewModel) this.viewModel.getValue();
    }

    private final void r() {
        q().setGuest(getIntent().getBooleanExtra("IS_GUEST", false));
        getSupportFragmentManager().beginTransaction().add(R.id.main_weighting_frame, new WeightingFragment()).commit();
        q().getLowPower().observe(this, new Observer() { // from class: ut8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightingActivity.s(this.a, (Boolean) obj);
            }
        });
        q().getMatchUsers().observe(this, new Observer() { // from class: wt8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightingActivity.t(this.a, (List) obj);
            }
        });
        q().getChooseUser().observe(this, new Observer() { // from class: st8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightingActivity.u(this.a, (Resource) obj);
            }
        });
        q().getSwitchPage().observe(this, new Observer() { // from class: vt8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightingActivity.v(this.a, (Integer) obj);
            }
        });
        q().getSkipMeasure().observe(this, new Observer() { // from class: tt8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightingActivity.w(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(WeightingActivity weightingActivity, Boolean bool) {
        if (bool.booleanValue()) {
            weightingActivity.A(WeightingState.state_low_power);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(WeightingActivity weightingActivity, List list) {
        HMLog.v(weightingActivity.mTag, "匹配用户到" + list.size() + "个用户", new Object[0]);
        if (list.size() == 1) {
            weightingActivity.q().setChooseUser((UserInfos) CollectionsKt.first(list));
        } else {
            weightingActivity.x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(WeightingActivity weightingActivity, Resource resource) {
        MeasureData measureData;
        String str = weightingActivity.mTag;
        UserInfos userInfos = (UserInfos) resource.getData();
        int impedance = 0;
        HMLog.v(str, Intrinsics.stringPlus("匹配到用户", userInfos == null ? null : userInfos.getName()), new Object[0]);
        int boundWeightDeviceSourceValue = BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue();
        boolean z = true;
        if (boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT.getValue() || boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT_SCALE2.getValue()) {
            weightingActivity.q().saveWeightData(weightingActivity.weightAdvData);
            weightingActivity.z();
            return;
        }
        if (boundWeightDeviceSourceValue != HMDeviceSource.WEIGHT_BODYFAT.getValue() && boundWeightDeviceSourceValue != HMDeviceSource.WEIGHT_BFS.getValue()) {
            z = false;
        }
        if (z) {
            String str2 = weightingActivity.mTag;
            StringBuilder sb = new StringBuilder();
            sb.append("匹配到用户");
            UserInfos userInfos2 = (UserInfos) resource.getData();
            sb.append((Object) (userInfos2 != null ? userInfos2.getName() : null));
            sb.append("---体脂称保存数据");
            HMLog.v(str2, sb.toString(), new Object[0]);
            weightingActivity.q().saveWeightData(weightingActivity.weightAdvData);
            WeightAdvData weightAdvData = weightingActivity.weightAdvData;
            if (weightAdvData != null && (measureData = weightAdvData.getMeasureData()) != null) {
                impedance = measureData.getImpedance();
            }
            if (HMWeightUtils.isValidImpedance(impedance)) {
                weightingActivity.y();
            } else {
                weightingActivity.z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(WeightingActivity weightingActivity, Integer num) {
        weightingActivity.A(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(WeightingActivity weightingActivity, Boolean bool) {
        e.f(LifecycleOwnerKt.getLifecycleScope(weightingActivity), Dispatchers.getIO(), null, weightingActivity.new a(null), 2, null);
    }

    private final void x() {
        WeightAdvData weightAdvData = this.weightAdvData;
        if (weightAdvData == null) {
            return;
        }
        float valueKg = weightAdvData.getValueKg();
        long timestamp = weightAdvData.getTimestamp();
        MeasureData measureData = weightAdvData.getMeasureData();
        ChooseUserFragment chooseUserFragmentNewInstance = ChooseUserFragment.INSTANCE.newInstance(new ChooseUserFragment.WeightData(valueKg, timestamp, measureData == null ? 0 : measureData.getImpedance(), 0.0f, 0, false, 56, null), this.chooseUserListener);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(android.R.id.content, chooseUserFragmentNewInstance);
        fragmentTransactionBeginTransaction.commit();
    }

    private final void y() {
        UserInfos data;
        if (q().getChooseUser().getValue() == null) {
            HMLog.v(this.mTag, "匹配用户--------matchUsers", new Object[0]);
            this.weightAdvData = q().getWeightData().getValue();
            q().matchUsers(this.weightAdvData);
            return;
        }
        HMLog.v(this.mTag, "跳转身体指数页面", new Object[0]);
        Resource<UserInfos> value = q().getChooseUser().getValue();
        String userId = null;
        if (value != null && (data = value.getData()) != null) {
            userId = data.getUserId();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("IS_GUEST", false);
        EventBus.getDefault().post(new EventFinishGuestPre(booleanExtra));
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(userId)) {
            intent.putExtra(BFConstant.KEY_UID, userId);
        }
        if (booleanExtra) {
            intent.setClass(this, GuestBodyFatDetailActivity.class);
        } else {
            intent.setClass(this, BodyFatDetailActivity.class);
        }
        intent.putExtra("IS_GUEST", booleanExtra);
        intent.putExtra(BFConstant.IS_FROM_WEIGHTING, true);
        startActivity(intent);
        finish();
        B();
    }

    private final void z() {
        UserInfos data;
        if (q().getChooseUser().getValue() == null) {
            this.weightAdvData = q().getWeightData().getValue();
            q().matchUsers(this.weightAdvData);
            return;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("IS_GUEST", false);
        Resource<UserInfos> value = q().getChooseUser().getValue();
        String userId = null;
        if (value != null && (data = value.getData()) != null) {
            userId = data.getUserId();
        }
        startActivity(WeightDetailActivity.getIntentWithParams(this, userId, booleanExtra, true));
        finish();
        B();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE);
        setContentView(R.layout.activity_main_weighting);
        getWindow().addFlags(128);
        r();
        initData();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (q().getIsGuest()) {
            ScaleSettingUpdateUtil.INSTANCE.exitGuestMode();
        }
    }
}
