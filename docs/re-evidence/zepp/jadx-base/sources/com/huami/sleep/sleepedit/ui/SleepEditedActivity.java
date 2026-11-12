package com.huami.sleep.sleepedit.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.choice.ChoiceView;
import com.huami.mifit.analytics.Analytics;
import com.huami.sleep.R;
import com.huami.sleep.baseui.TimePickerFragment;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.IAppCacheData;
import com.huami.sleep.sleepedit.ui.SleepEditedActivity;
import com.huami.sleep.sleepedit.viewmodel.SleepEditViewModel;
import com.huami.sleep.sleepintrodetail.dto.SleepDetail;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.ui.smartplay.SetHuamiOSAlarmActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\u0018\u0000 Z2\u00020\u00012\u00020\u0002:\u0001ZB\u0007¢\u0006\u0004\bX\u0010YJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0003J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0003H\u0014J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00104R\u0016\u00108\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0016\u00109\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00107R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010<R\u0016\u0010?\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010(R\u0016\u0010B\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001d\u0010H\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010IR\u0016\u0010N\u001a\u00020K8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\u001c8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010IR\u0016\u0010T\u001a\u00020K8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010MR\u0018\u0010V\u001a\u0004\u0018\u00010\u001c8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010PR\u0016\u0010W\u001a\u00020\f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010I¨\u0006["}, d2 = {"Lcom/huami/sleep/sleepedit/ui/SleepEditedActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/sleep/baseui/TimePickerFragment$OnTimeSelectedListener;", "", "initData", "x", GoogleApiAvailabilityLight.b, "initView", "y", "H", com.google.android.exoplayer2.text.ttml.b.r, "o", "", Constants.ENABLED, "E", "w", DTransferConstants.SEARCH_KEY, "F", LogUtil.D, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onLeftClicked", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onRightOnClicked", "onBackPressed", "Ljava/util/Calendar;", "time", "onSelected", "Lcom/huami/sleep/baseui/TimePickerFragment;", "Lcom/huami/sleep/baseui/TimePickerFragment;", "mTimePicker", "", "", "[Ljava/lang/String;", "mTimes", "", "z", LogUtil.I, "mIndex", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "mCurrentSleepInfo", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "B", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "mSportDay", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "C", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "mPreSleepSummary", "mBackSleepSum", "Ljava/util/Calendar;", "mSleepTime", "mWakeUpTime", "Ljava/util/Date;", "G", "Ljava/util/Date;", "mInitSleepDate", "mInitWakeDate", "mSelectedType", "J", "Ljava/lang/String;", "mUserId", "Lcom/huami/sleep/sleepedit/viewmodel/SleepEditViewModel;", "K", "Lkotlin/Lazy;", SOAP.XMLNS, "()Lcom/huami/sleep/sleepedit/viewmodel/SleepEditViewModel;", "mViewModel", "()Z", "isHasPreNormalSleep", "", "t", "()J", "preSleepWakeUpTime", "u", "()Ljava/util/Calendar;", "preSleepWakeupCalendar", "isToday", "r", "backSleepInfoSleepTime", "v", "selectedTime", SetHuamiOSAlarmActivity.KEY_IS_CHANGE, "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepEditedActivity extends BaseTitleActivity implements TimePickerFragment.OnTimeSelectedListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String L = "index";

    @NotNull
    private static final String M = "sleep_data";

    @NotNull
    private static final String N = "user_id";
    private static final int O = 0;
    private static final int P = 1;

    @NotNull
    public static final String TAG = "SleepEditedActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private SleepInfo mCurrentSleepInfo;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private SportDay mSportDay;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private SleepAllInfo mPreSleepSummary;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private SleepAllInfo mBackSleepSum;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Calendar mSleepTime;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Calendar mWakeUpTime;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private Date mInitSleepDate;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private Date mInitWakeDate;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int mSelectedType;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private TimePickerFragment mTimePicker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int mIndex;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final String[] mTimes = new String[2];

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private String mUserId = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/sleepedit/ui/SleepEditedActivity$Companion;", "", "Landroid/app/Activity;", DbUtils.Const.Table.CONTEXT, "", "index", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "data", "", "userId", "requestCode", "", "lunch", "ARG_INDEX", "Ljava/lang/String;", "SLEEP_DATA", "SLEEP_USER_ID", "TAG", "TYPE_SLEEP", LogUtil.I, "TYPE_WAKEUP", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void lunch(@NotNull Activity context, int index, @Nullable SleepInfo data, @NotNull String userId, int requestCode) {
            Intent intent = new Intent(context, (Class<?>) SleepEditedActivity.class);
            intent.putExtra("index", index);
            intent.putExtra("sleep_data", data);
            intent.putExtra("user_id", userId);
            context.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return " this day sleep time : " + TimeUtils.debugTime(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "this day wakeup time : " + TimeUtils.debugTime(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "醒来时间不能晚于当前时间";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "醒来时间不能早于入睡时间";
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
            return " next day sleep time : " + TimeUtils.debugTime(SleepEditedActivity.this.r());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "此时间段已存在一个睡眠记录";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "醒来时间需晚于入睡时间";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.sleepedit.ui.SleepEditedActivity$initData$3", f = "SleepEditedActivity.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepEditedActivity.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SleepEditedActivity sleepEditedActivity;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepEditedActivity sleepEditedActivity2 = SleepEditedActivity.this;
                IAppCacheData appCacheSlpData = KoinExtKt.getAppCacheSlpData();
                String str = SleepEditedActivity.this.mUserId;
                SportDay sportDay = SleepEditedActivity.this.mSportDay;
                Objects.requireNonNull(sportDay);
                String key = sportDay.getPreDay().getKey();
                this.a = sleepEditedActivity2;
                this.b = 1;
                Object specifyDaySlpSummary = appCacheSlpData.getSpecifyDaySlpSummary(str, key, this);
                if (specifyDaySlpSummary == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepEditedActivity = sleepEditedActivity2;
                obj = specifyDaySlpSummary;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sleepEditedActivity = (SleepEditedActivity) this.a;
                ResultKt.throwOnFailure(obj);
            }
            sleepEditedActivity.mPreSleepSummary = (SleepAllInfo) obj;
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.sleepedit.ui.SleepEditedActivity$initData$4", f = "SleepEditedActivity.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepEditedActivity.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SleepEditedActivity sleepEditedActivity;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepEditedActivity sleepEditedActivity2 = SleepEditedActivity.this;
                IAppCacheData appCacheSlpData = KoinExtKt.getAppCacheSlpData();
                String str = SleepEditedActivity.this.mUserId;
                SportDay sportDay = SleepEditedActivity.this.mSportDay;
                Objects.requireNonNull(sportDay);
                String key = sportDay.getNextDay().getKey();
                this.a = sleepEditedActivity2;
                this.b = 1;
                Object specifyDaySlpSummary = appCacheSlpData.getSpecifyDaySlpSummary(str, key, this);
                if (specifyDaySlpSummary == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepEditedActivity = sleepEditedActivity2;
                obj = specifyDaySlpSummary;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sleepEditedActivity = (SleepEditedActivity) this.a;
                ResultKt.throwOnFailure(obj);
            }
            sleepEditedActivity.mBackSleepSum = (SleepAllInfo) obj;
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onBackPressed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "sleep time : " + TimeUtils.debugTime(SleepEditedActivity.this.v().getTimeInMillis());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Calendar calendar) {
            super(0);
            this.a = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "select time : " + TimeUtils.debugTime(this.a.getTimeInMillis());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            Calendar calendar = SleepEditedActivity.this.mSleepTime;
            Objects.requireNonNull(calendar);
            return "TYPE_SLEEP time : " + TimeUtils.debugTime(calendar.getTimeInMillis());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            Calendar calendar = SleepEditedActivity.this.mWakeUpTime;
            Objects.requireNonNull(calendar);
            return "TYPE_WAKEUP time : " + TimeUtils.debugTime(calendar.getTimeInMillis());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return String.valueOf(SleepEditedActivity.this.mCurrentSleepInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepEditedActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.sleepedit.ui.SleepEditedActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepEditViewModel>() { // from class: com.huami.sleep.sleepedit.ui.SleepEditedActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleepedit.viewmodel.SleepEditViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SleepEditViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepEditViewModel.class), function0, objArr);
            }
        });
    }

    private final boolean A() {
        Calendar calendar = this.mWakeUpTime;
        Objects.requireNonNull(calendar);
        if (Intrinsics.areEqual(calendar.getTime(), this.mInitWakeDate)) {
            Calendar calendar2 = this.mSleepTime;
            Objects.requireNonNull(calendar2);
            if (Intrinsics.areEqual(calendar2.getTime(), this.mInitSleepDate)) {
                return false;
            }
        }
        return true;
    }

    private final boolean B() {
        SleepDetail mainSleepDetail;
        SleepAllInfo sleepAllInfo = this.mPreSleepSummary;
        return (sleepAllInfo == null || (mainSleepDetail = sleepAllInfo.getMainSleepDetail()) == null || mainSleepDetail.getDeepDur() + mainSleepDetail.getLightDur() <= 0) ? false : true;
    }

    private final boolean C() {
        return TextUtils.equals(TimeShowUtilsKt.toDateString(SleepTimeUtil.INSTANCE.getTimeFromRegisterDay(this.mIndex, TimeMode.DAY)), new SportDay(Calendar.getInstance()).getKey());
    }

    private final void D() {
        SleepInfo sleepInfo = this.mCurrentSleepInfo;
        if (sleepInfo == null) {
            return;
        }
        if (sleepInfo.getStopDate() == null || sleepInfo.getStartDate() == null) {
            HMLog.info(TAG, new o());
            return;
        }
        SleepEditViewModel sleepEditViewModelS = s();
        String str = this.mUserId;
        Calendar calendar = this.mSleepTime;
        Objects.requireNonNull(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = this.mWakeUpTime;
        Objects.requireNonNull(calendar2);
        long timeInMillis2 = calendar2.getTimeInMillis();
        SportDay sportDay = this.mSportDay;
        Objects.requireNonNull(sportDay);
        sleepEditViewModelS.saveEditInfo(str, sleepInfo, timeInMillis, timeInMillis2, sportDay);
        KoinExtKt.sleepPostEvent().postEventEditSleep();
        setResult(-1);
        finish();
    }

    private final void E(boolean enabled) {
        getRightTitle().setEnabled(enabled);
        getRightTitle().setTextColor(ContextCompat.getColor(this, enabled ? R.color.s1 : R.color.s3));
    }

    private final void F() {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.cancel_save_tips)).setPositiveButton(getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: xz6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SleepEditedActivity.G(this.a, dialogInterface, i2);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(SleepEditedActivity sleepEditedActivity, DialogInterface dialogInterface, int i2) {
        sleepEditedActivity.setResult(0);
        sleepEditedActivity.finish();
    }

    private final void H() {
        String[] strArr = this.mTimes;
        Context applicationContext = getApplicationContext();
        Calendar calendar = this.mSleepTime;
        Objects.requireNonNull(calendar);
        strArr[0] = TimeUtils.formatDateTime_no_y(applicationContext, calendar.getTime(), false);
        String[] strArr2 = this.mTimes;
        Context applicationContext2 = getApplicationContext();
        Calendar calendar2 = this.mWakeUpTime;
        Objects.requireNonNull(calendar2);
        strArr2[1] = TimeUtils.formatDateTime_no_y(applicationContext2, calendar2.getTime(), false);
        ((ChoiceView) findViewById(R.id.select)).setValues(this.mTimes);
        p();
    }

    private final void initData() {
        Unit unit;
        Serializable serializableExtra = getIntent().getSerializableExtra("sleep_data");
        this.mCurrentSleepInfo = serializableExtra == null ? null : (SleepInfo) serializableExtra;
        this.mSportDay = s().getSportDayByIndex(this.mIndex);
        this.mSelectedType = 0;
        SleepInfo sleepInfo = this.mCurrentSleepInfo;
        if (sleepInfo == null) {
            unit = null;
        } else {
            if (sleepInfo.getStopDate().getTime() - sleepInfo.getStartDate().getTime() > 0) {
                this.mTimes[0] = TimeUtils.formatDateTime_no_y(getApplicationContext(), sleepInfo.getStartDate(), false);
                this.mTimes[1] = TimeUtils.formatDateTime_no_y(getApplicationContext(), sleepInfo.getStopDate(), false);
                Calendar calendar = Calendar.getInstance();
                calendar.clear();
                calendar.setTime(sleepInfo.getStartDate());
                Unit unit2 = Unit.INSTANCE;
                this.mSleepTime = calendar;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.clear();
                calendar2.setTime(sleepInfo.getStopDate());
                this.mWakeUpTime = calendar2;
            } else {
                x();
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            x();
        }
        Calendar calendar3 = this.mSleepTime;
        Objects.requireNonNull(calendar3);
        this.mInitSleepDate = calendar3.getTime();
        Calendar calendar4 = this.mWakeUpTime;
        Objects.requireNonNull(calendar4);
        this.mInitWakeDate = calendar4.getTime();
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new h(null), 2, null);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new i(null), 2, null);
        n();
    }

    private final void initView() {
        ChoiceView.Builder values = ChoiceView.Builder.with(this).setTitles(R.array.sleep_edit_array).setChoiceItem(0).setValues(this.mTimes);
        int i2 = R.id.select;
        ((ChoiceView) findViewById(i2)).setBuilder(values);
        ((ChoiceView) findViewById(i2)).setOnItemClickedListener(new AdapterView.OnItemClickListener() { // from class: yz6
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j2) {
                SleepEditedActivity.z(this.a, adapterView, view, i3, j2);
            }
        });
        y();
    }

    private final void n() {
        SleepInfo sleepInfo = this.mCurrentSleepInfo;
        if ((sleepInfo == null ? 0 : sleepInfo.getSleepCount()) > 0) {
            Analytics.event(this, "Edit_Sleep", "Data_True");
        } else {
            Analytics.event(this, "Edit_Sleep", "Data_False");
        }
    }

    private final void o() {
        Calendar calendar = this.mSleepTime;
        Objects.requireNonNull(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = this.mWakeUpTime;
        Objects.requireNonNull(calendar2);
        long timeInMillis2 = calendar2.getTimeInMillis();
        if (timeInMillis > t()) {
            if (timeInMillis >= timeInMillis2) {
                ((TextView) findViewById(R.id.time_tip)).setText(R.string.sleep_tip_time_clash);
                E(false);
                return;
            } else {
                ((TextView) findViewById(R.id.time_tip)).setText("");
                E(true);
                return;
            }
        }
        int i2 = R.id.time_tip;
        ((TextView) findViewById(i2)).setText(R.string.sleel_tip_has_sleep);
        E(false);
        if (w()) {
            ((TextView) findViewById(i2)).setText("");
            E(true);
        }
    }

    private final void p() {
        int i2 = this.mSelectedType;
        if (i2 == 0) {
            o();
            if (TextUtils.isEmpty(((TextView) findViewById(R.id.time_tip)).getText())) {
                q();
                return;
            }
            return;
        }
        if (i2 != 1) {
            return;
        }
        q();
        if (TextUtils.isEmpty(((TextView) findViewById(R.id.time_tip)).getText())) {
            o();
        }
    }

    private final void q() {
        Calendar calendar = this.mSleepTime;
        Objects.requireNonNull(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = this.mWakeUpTime;
        Objects.requireNonNull(calendar2);
        long timeInMillis2 = calendar2.getTimeInMillis();
        HMLog.debug(TAG, new a(timeInMillis));
        HMLog.debug(TAG, new b(timeInMillis2));
        if (C()) {
            if (timeInMillis2 >= Calendar.getInstance().getTimeInMillis()) {
                HMLog.debug(TAG, c.a);
                ((TextView) findViewById(R.id.time_tip)).setText(R.string.sleep_tip_time_clash3);
                E(false);
                return;
            } else if (timeInMillis2 > timeInMillis) {
                ((TextView) findViewById(R.id.time_tip)).setText("");
                E(true);
                return;
            } else {
                HMLog.debug(TAG, d.a);
                ((TextView) findViewById(R.id.time_tip)).setText(R.string.sleep_tip_time_clash2);
                E(false);
                return;
            }
        }
        HMLog.debug(TAG, new e());
        if (timeInMillis2 >= r()) {
            HMLog.debug(TAG, f.a);
            ((TextView) findViewById(R.id.time_tip)).setText(R.string.sleel_tip_has_sleep);
            E(false);
        } else if (timeInMillis2 > timeInMillis) {
            ((TextView) findViewById(R.id.time_tip)).setText("");
            E(true);
        } else {
            HMLog.debug(TAG, g.a);
            ((TextView) findViewById(R.id.time_tip)).setText(R.string.sleep_tip_time_clash2);
            E(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long r() {
        SleepDetail mainSleepDetail;
        long timestamp;
        SleepAllInfo sleepAllInfo = this.mBackSleepSum;
        Long lValueOf = null;
        if (sleepAllInfo != null && (mainSleepDetail = sleepAllInfo.getMainSleepDetail()) != null) {
            if (mainSleepDetail.getEndTime() - mainSleepDetail.getStartTime() > 0) {
                timestamp = mainSleepDetail.getStartTime();
            } else {
                SportDay sportDay = this.mSportDay;
                Objects.requireNonNull(sportDay);
                timestamp = sportDay.getNextDay().getTimestamp();
            }
            lValueOf = Long.valueOf(timestamp);
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        SportDay sportDay2 = this.mSportDay;
        Objects.requireNonNull(sportDay2);
        return sportDay2.getNextDay().getTimestamp();
    }

    private final SleepEditViewModel s() {
        return (SleepEditViewModel) this.mViewModel.getValue();
    }

    private final long t() {
        return u().getTimeInMillis();
    }

    private final Calendar u() {
        SleepDetail mainSleepDetail;
        SleepAllInfo sleepAllInfo = this.mPreSleepSummary;
        Calendar calendar = null;
        if (sleepAllInfo != null && (mainSleepDetail = sleepAllInfo.getMainSleepDetail()) != null) {
            if (mainSleepDetail.getEndTime() - mainSleepDetail.getStartTime() > 0) {
                calendar = Calendar.getInstance();
                calendar.clear();
                calendar.setTimeInMillis(mainSleepDetail.getEndTime());
            } else {
                SportDay sportDay = this.mSportDay;
                Objects.requireNonNull(sportDay);
                calendar = sportDay.getPreDay().getCalendar();
            }
        }
        if (calendar != null) {
            return calendar;
        }
        SportDay sportDay2 = this.mSportDay;
        Objects.requireNonNull(sportDay2);
        return sportDay2.getPreDay().getCalendar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Calendar v() {
        Calendar calendar = this.mSelectedType == 0 ? this.mSleepTime : this.mWakeUpTime;
        Objects.requireNonNull(calendar);
        return calendar;
    }

    private final boolean w() {
        Calendar calendarU = u();
        return calendarU.get(11) == 0 && calendarU.get(12) == 0 && !B();
    }

    private final void x() {
        Calendar calendar = Calendar.getInstance();
        this.mSleepTime = calendar;
        Objects.requireNonNull(calendar);
        calendar.clear();
        Calendar calendar2 = this.mSleepTime;
        Objects.requireNonNull(calendar2);
        SportDay sportDay = this.mSportDay;
        Objects.requireNonNull(sportDay);
        int i2 = sportDay.year;
        Objects.requireNonNull(sportDay);
        int i3 = sportDay.mon;
        Objects.requireNonNull(sportDay);
        calendar2.set(i2, i3, sportDay.day);
        Calendar calendar3 = Calendar.getInstance();
        this.mWakeUpTime = calendar3;
        Objects.requireNonNull(calendar3);
        calendar3.clear();
        Calendar calendar4 = this.mWakeUpTime;
        Objects.requireNonNull(calendar4);
        SportDay sportDay2 = this.mSportDay;
        Objects.requireNonNull(sportDay2);
        int i4 = sportDay2.year;
        Objects.requireNonNull(sportDay2);
        int i5 = sportDay2.mon;
        Objects.requireNonNull(sportDay2);
        calendar4.set(i4, i5, sportDay2.day);
        String[] strArr = this.mTimes;
        Context applicationContext = getApplicationContext();
        Calendar calendar5 = this.mSleepTime;
        Objects.requireNonNull(calendar5);
        strArr[0] = TimeUtils.formatDateTime_no_y(applicationContext, calendar5.getTime(), false);
        String[] strArr2 = this.mTimes;
        Context applicationContext2 = getApplicationContext();
        Calendar calendar6 = this.mWakeUpTime;
        Objects.requireNonNull(calendar6);
        strArr2[1] = TimeUtils.formatDateTime_no_y(applicationContext2, calendar6.getTime(), false);
    }

    @SuppressLint({"CommitTransaction"})
    private final void y() {
        Calendar calendar = this.mWakeUpTime;
        Objects.requireNonNull(calendar);
        int i2 = calendar.get(5);
        Calendar calendarU = u();
        Calendar calendar2 = this.mWakeUpTime;
        Objects.requireNonNull(calendar2);
        calendarU.add(5, (calendar2.get(6) - calendarU.get(6)) - 1);
        int i3 = calendarU.get(5);
        this.mTimePicker = new TimePickerFragment.Builder(this).setDay(i3, i2, i3).set24HourFormat(DateFormat.is24HourFormat(this)).setHour(0, 23, 0).setMinute(0, 59, 0).create(R.id.container, getSupportFragmentManager().beginTransaction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SleepEditedActivity sleepEditedActivity, AdapterView adapterView, View view, int i2, long j2) {
        Calendar calendarU = sleepEditedActivity.u();
        Calendar calendar = sleepEditedActivity.mWakeUpTime;
        Objects.requireNonNull(calendar);
        calendarU.add(5, (calendar.get(6) - calendarU.get(6)) - 1);
        int i3 = calendarU.get(5);
        Calendar calendar2 = sleepEditedActivity.mWakeUpTime;
        Objects.requireNonNull(calendar2);
        int i4 = calendar2.get(5);
        if (i2 == 0) {
            sleepEditedActivity.mSelectedType = 0;
            sleepEditedActivity.mTimePicker.updateDay(i3, i4, 0);
            TimePickerFragment timePickerFragment = sleepEditedActivity.mTimePicker;
            Calendar calendar3 = sleepEditedActivity.mSleepTime;
            Objects.requireNonNull(calendar3);
            timePickerFragment.update(calendar3);
            return;
        }
        if (i2 != 1) {
            return;
        }
        sleepEditedActivity.mSelectedType = 1;
        sleepEditedActivity.mTimePicker.updateDay(i4, i4, i4);
        TimePickerFragment timePickerFragment2 = sleepEditedActivity.mTimePicker;
        Calendar calendar4 = sleepEditedActivity.mWakeUpTime;
        Objects.requireNonNull(calendar4);
        timePickerFragment2.update(calendar4);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HMLog.debug(TAG, j.a);
        if (A()) {
            F();
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_edited);
        setStyle(BaseTitleActivity.STYLE.CANCEL_AND_SAVE, ContextCompat.getColor(this, R.color.s38), getString(R.string.sleep_edit_title), true);
        int i2 = R.color.s1;
        setBaseTitleColor(ContextCompat.getColor(this, i2), ContextCompat.getColor(this, i2), ContextCompat.getColor(this, i2));
        Intent intent = getIntent();
        if (intent != null) {
            this.mIndex = intent.getIntExtra("index", 0);
            String stringExtra = intent.getStringExtra("user_id");
            if (stringExtra == null) {
                stringExtra = KoinExtKt.getAccountInfo().getUserId();
            }
            this.mUserId = stringExtra;
        }
        initData();
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        if (A()) {
            F();
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.mTimePicker.update(v());
        p();
        HMLog.debug(TAG, new k());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightOnClicked(@NotNull View view) {
        if (A()) {
            D();
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.huami.sleep.baseui.TimePickerFragment.OnTimeSelectedListener
    public void onSelected(@NotNull Calendar time) {
        HMLog.debug(TAG, new l(time));
        int i2 = this.mSelectedType;
        if (i2 == 0) {
            Calendar calendar = this.mSleepTime;
            Objects.requireNonNull(calendar);
            calendar.setTime(time.getTime());
            HMLog.debug(TAG, new m());
        } else if (i2 == 1) {
            Calendar calendar2 = this.mWakeUpTime;
            Objects.requireNonNull(calendar2);
            calendar2.setTime(time.getTime());
            HMLog.debug(TAG, new n());
        }
        H();
    }
}
