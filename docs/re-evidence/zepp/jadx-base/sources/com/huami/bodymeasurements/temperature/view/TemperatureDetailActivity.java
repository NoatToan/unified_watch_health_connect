package com.huami.bodymeasurements.temperature.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chenenyu.router.annotation.Route;
import com.huami.bodymeasurements.common.utils.GlobalTitleStyleKt;
import com.huami.bodymeasurements.detailframe.DetailBaseActivity;
import com.huami.bodymeasurements.detailframe.DetailHomeBaseFragment;
import com.huami.bodymeasurements.detailframe.event.EventTargetPage;
import com.huami.bodymeasurements.temperature.R;
import com.huami.bodymeasurements.temperature.model.TempConstantsKt;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.model.koin.data.TempUserInfo;
import com.huami.bodymeasurements.temperature.model.record.TempRecordUtils;
import com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity;
import com.huami.bodymeasurements.temperature.view.fragment.detailhome.TemperatureDayHomeFragment;
import com.huami.bodymeasurements.temperature.view.fragment.detailhome.TemperatureMonthHomeFragment;
import com.huami.bodymeasurements.temperature.view.fragment.detailhome.TemperatureWeekHomeFragment;
import com.huami.bodymeasurements.temperature.view.fragment.detailhome.TemperatureYearHomeFragment;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.bodymeasurements.temperature.viewmodel.detail.TempDetailViewModel;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Route({RouterHelper.BODY_TEMPERATURE_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00158F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010&\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+¨\u00062"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/TemperatureDetailActivity;", "Lcom/huami/bodymeasurements/detailframe/DetailBaseActivity;", "", "observeData", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/bodymeasurements/detailframe/DetailHomeBaseFragment;", "dayDetailFragment", "weekDetailFragment", "monthDetailFragment", "yearDetailFragment", "onStart", "onStop", "Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempDetailViewModel;", "y", "Lkotlin/Lazy;", "v", "()Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempDetailViewModel;", "viewModel", "", "z", "getUserId", "()Ljava/lang/String;", "userId", "Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "u", "()Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", "userInfo", "Ljava/util/Date;", "B", "Ljava/util/Date;", "todayDate", "C", "t", "()Ljava/util/Date;", "startDate", LogUtil.D, "endDate", "", "E", "J", "recordStartTime", "F", "recordEndTime", "<init>", "()V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureDetailActivity extends DetailBaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String G = "TemperatureDetailActivity";

    @NotNull
    private static final String H = "user_id";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfo;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Date todayDate;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy startDate;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Date endDate;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private long recordStartTime;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private long recordEndTime;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/TemperatureDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "", WebConstant.QueryParam.LAUNCH, "EXTRA_USER_ID", "Ljava/lang/String;", "TAG", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull String userId) {
            Intent intent = new Intent(context, (Class<?>) TemperatureDetailActivity.class);
            intent.putExtra("user_id", userId);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ TemperatureVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TemperatureVo temperatureVo) {
            super(0);
            this.a = temperatureVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("latestTemp:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/util/Date;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Date> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Date invoke() {
            TempUserInfo tempUserInfoU = TemperatureDetailActivity.this.u();
            Date registerDate = tempUserInfoU == null ? null : tempUserInfoU.getRegisterDate();
            return registerDate == null ? TemperatureDetailActivity.this.todayDate : registerDate;
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
            return TemperatureDetailActivity.this.getIntent().getStringExtra("user_id");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/koin/data/TempUserInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<TempUserInfo> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ TempUserInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TempUserInfo tempUserInfo) {
                super(0);
                this.a = tempUserInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("userInfo:", this.a);
            }
        }

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TempUserInfo invoke() {
            TempExternalApi tempExternalApi;
            TempUserInfo userInfo = (TemperatureDetailActivity.this.getUserId() == null || (tempExternalApi = ScopesKt.tempExternalApi(ComponentCallbackExtKt.getKoin(TemperatureDetailActivity.this))) == null) ? null : tempExternalApi.getUserInfo(TemperatureDetailActivity.this.getUserId());
            if (userInfo == null) {
                return null;
            }
            HMLog.info(TemperatureDetailActivity.G, new a(userInfo));
            return userInfo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureDetailActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TempDetailViewModel>() { // from class: com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bodymeasurements.temperature.viewmodel.detail.TempDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempDetailViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TempDetailViewModel.class), function0, objArr);
            }
        });
        this.userId = LazyKt__LazyJVMKt.lazy(new d());
        this.userInfo = LazyKt__LazyJVMKt.lazy(new e());
        Date date = new Date(System.currentTimeMillis());
        this.todayDate = date;
        this.startDate = LazyKt__LazyJVMKt.lazy(new c());
        this.endDate = date;
        this.recordStartTime = Calendar.getInstance().getTimeInMillis();
        this.recordEndTime = Calendar.getInstance().getTimeInMillis();
    }

    private final void observeData() {
        if (getUserId() == null) {
            HMLog.info(G, a.a);
            return;
        }
        TempDetailViewModel tempDetailViewModelV = v();
        tempDetailViewModelV.setUserId(getUserId());
        tempDetailViewModelV.getLatestTempLiveData().observe(this, new Observer() { // from class: ym7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureDetailActivity.x((TemperatureVo) obj);
            }
        });
    }

    private final Date t() {
        return (Date) this.startDate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TempUserInfo u() {
        return (TempUserInfo) this.userInfo.getValue();
    }

    private final TempDetailViewModel v() {
        return (TempDetailViewModel) this.viewModel.getValue();
    }

    private final void w() {
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, -1, getString(R.string.bm_temperature_name), true);
        GlobalTitleStyleKt.setupAccountTitleStyle(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(TemperatureVo temperatureVo) {
        HMLog.info(G, new b(temperatureVo));
        if (temperatureVo == null) {
            return;
        }
        EventBus.getDefault().post(new EventTargetPage(temperatureVo.getTimestamp(), null, 2, null));
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailBaseActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailBaseActivity
    @NotNull
    public DetailHomeBaseFragment dayDetailFragment() {
        return new TemperatureDayHomeFragment(t(), this.endDate);
    }

    @Nullable
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailBaseActivity
    @NotNull
    public DetailHomeBaseFragment monthDetailFragment() {
        return new TemperatureMonthHomeFragment(t(), this.endDate);
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailBaseActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w();
        observeData();
        TempRecordUtils.INSTANCE.recordCountEvent(TempConstantsKt.HEALTH_BODYTEM_V);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.recordStartTime = Calendar.getInstance().getTimeInMillis();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        this.recordEndTime = timeInMillis;
        TempRecordUtils.INSTANCE.recordDurationEvent(TempConstantsKt.HEALTH_BODYTEM_T, this.recordStartTime, timeInMillis);
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailBaseActivity
    @NotNull
    public DetailHomeBaseFragment weekDetailFragment() {
        return new TemperatureWeekHomeFragment(t(), this.endDate);
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailBaseActivity
    @NotNull
    public DetailHomeBaseFragment yearDetailFragment() {
        return new TemperatureYearHomeFragment(t(), this.endDate);
    }
}
