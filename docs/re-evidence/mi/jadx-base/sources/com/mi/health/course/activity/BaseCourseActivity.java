package com.mi.health.course.activity;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mi.health.course.activity.BaseCourseActivity;
import com.mi.health.course.data.CourseSportState;
import com.mi.health.course.data.DeviceState;
import com.mi.health.course.export.data.CourseAllInfo;
import com.mi.health.course.export.data.CourseConfigModel;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.ext.CourseExtKt;
import com.mi.health.course.util.LogUtil;
import com.mi.health.course.vm.CourseBasePlayerVM;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.HrZone;
import com.xiaomi.fitness.baseui.dialog.DriftDialog;
import com.xiaomi.fitness.baseui.notch.NotchScreenManager;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.sport_manager_export.RemindExt;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.czi;
import defpackage.hu4;
import defpackage.lp5;
import defpackage.oqi;
import defpackage.sti;
import defpackage.wc0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\b\u0010H\u001a\u00020CH\u0002J\b\u0010I\u001a\u00020,H\u0016J\u0010\u0010J\u001a\u00020C2\u0006\u0010K\u001a\u00020\tH\u0014J\u0010\u0010L\u001a\u00020C2\u0006\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020C2\u0006\u0010M\u001a\u00020NH&J\u0010\u0010P\u001a\u00020C2\u0006\u0010M\u001a\u00020QH\u0002J\u0010\u0010`\u001a\u00020C2\u0006\u0010a\u001a\u00020\u000fH\u0004J\u0010\u0010b\u001a\u00020C2\u0006\u0010a\u001a\u00020\u000fH\u0004J\b\u0010c\u001a\u00020,H\u0016J\u0010\u0010d\u001a\u00020C2\u0006\u0010M\u001a\u00020QH\u0016J\u0006\u0010e\u001a\u00020CJ\u0006\u0010f\u001a\u00020CJ\u0016\u0010g\u001a\u00020S2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020iJ\u0006\u0010k\u001a\u00020CJ\b\u0010l\u001a\u00020CH&J\b\u0010m\u001a\u00020CH\u0014J\b\u0010n\u001a\u00020CH\u0014J\b\u0010o\u001a\u00020CH\u0014R\u001a\u0010\b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001a\u0010+\u001a\u00020,X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020,X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u000b\"\u0004\b>\u0010\rR\u001b\u0010?\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\u0019\u001a\u0004\b@\u0010\u0011R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010T\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010\u0019\u001a\u0004\bV\u0010WR\u001b\u0010Y\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010\u0019\u001a\u0004\bZ\u0010[R\u000e\u0010]\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006p²\u0006\u0012\u0010q\u001a\n s*\u0004\u0018\u00010r0rX\u008a\u0084\u0002²\u0006\u0012\u0010t\u001a\n s*\u0004\u0018\u00010r0rX\u008a\u0084\u0002"}, d2 = {"Lcom/mi/health/course/activity/BaseCourseActivity;", "VM", "Lcom/mi/health/course/vm/CourseBasePlayerVM;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "<init>", "()V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", DailyRecordKey.sportType, "", "getSportType", "()I", "setSportType", "(I)V", "hrZone", "Lcom/xiaomi/fitness/account/HrZone;", "getHrZone", "()Lcom/xiaomi/fitness/account/HrZone;", "hrZone$delegate", "Lkotlin/Lazy;", "hrWarnLimit", "getHrWarnLimit", "hrWarnLimit$delegate", "decoderView", "Landroid/view/View;", "getDecoderView", "()Landroid/view/View;", "decoderView$delegate", "deviceLinkage", "Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;", "getDeviceLinkage", "()Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;", "setDeviceLinkage", "(Lcom/mi/health/course/export/data/CourseConfigModel$DeviceLinkage;)V", "distance", "getDistance", "setDistance", "cmdEnable", "", "getCmdEnable", "()Z", "setCmdEnable", "(Z)V", "info", "Lcom/mi/health/course/export/data/CourseAllInfo;", "getInfo", "()Lcom/mi/health/course/export/data/CourseAllInfo;", "setInfo", "(Lcom/mi/health/course/export/data/CourseAllInfo;)V", "supportDeviceLink", "getSupportDeviceLink", "setSupportDeviceLink", "practiseSummary", "Lcom/mi/health/course/export/data/CourseModel$PracticedSummary;", "planId", "getPlanId", "setPlanId", "source", "getSource", "source$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "report", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "observer", "isSendCmd", "onSecondTick", "duration", "sportStateChange", "state", "Lcom/mi/health/course/data/CourseSportState;", "onSportStateChange", "onDeviceStatusChange", "Lcom/mi/health/course/data/DeviceState;", "disConnectDialog", "Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "disconnectRunnable", "Ljava/lang/Runnable;", "getDisconnectRunnable", "()Ljava/lang/Runnable;", "disconnectRunnable$delegate", "hrWarnDialog", "getHrWarnDialog", "()Lcom/xiaomi/fitness/baseui/dialog/DriftDialog;", "hrWarnDialog$delegate", "hrWarnRunnable", "hrWarnIn", "mCurrentHr", "checkHr", "hr", "checkHrWithZero", "abnormalHeartRate", "setDeviceStatus", "showStopDialog", "showTimeTooShortDialog", "showErrorDialog", "title", "", MiuiCursorConstants.CONTENT, "showPlanCourseTimeTooShortDialog", "finishCourse", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "course_chinaProductRelease", "curDeviceView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "sportDeviceView"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseCourseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCourseActivity.kt\ncom/mi/health/course/activity/BaseCourseActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
public abstract class BaseCourseActivity<VM extends CourseBasePlayerVM, VDB extends ViewDataBinding> extends BaseBindingActivity<VM, VDB> {

    @Nullable
    private CourseConfigModel.DeviceLinkage deviceLinkage;

    @Nullable
    private DriftDialog disConnectDialog;
    private int distance;
    private boolean hrWarnIn;
    protected CourseAllInfo info;
    private int mCurrentHr;
    private long planId;

    @Nullable
    private CourseModel.PracticedSummary practiseSummary;

    @Nullable
    private SportBasicReport report;
    private int sportType;
    private long startTime;
    private boolean supportDeviceLink;

    /* JADX INFO: renamed from: hrZone$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrZone = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: b62
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseCourseActivity.hrZone_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: hrWarnLimit$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrWarnLimit = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: c62
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseCourseActivity.hrWarnLimit_delegate$lambda$1(this.f4974a));
        }
    });

    /* JADX INFO: renamed from: decoderView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy decoderView = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: d62
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseCourseActivity.decoderView_delegate$lambda$2(this.f15123a);
        }
    });
    private boolean cmdEnable = true;

    /* JADX INFO: renamed from: source$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy source = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e62
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(BaseCourseActivity.source_delegate$lambda$3(this.f16301a));
        }
    });

    /* JADX INFO: renamed from: disconnectRunnable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy disconnectRunnable = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: f62
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseCourseActivity.disconnectRunnable_delegate$lambda$14(this.f17453a);
        }
    });

    /* JADX INFO: renamed from: hrWarnDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrWarnDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: g62
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseCourseActivity.hrWarnDialog_delegate$lambda$17(this.f18635a);
        }
    });

    @NotNull
    private final Runnable hrWarnRunnable = new Runnable() { // from class: h52
        @Override // java.lang.Runnable
        public final void run() {
            BaseCourseActivity.hrWarnRunnable$lambda$18(this.f19697a);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final View decoderView_delegate$lambda$2(BaseCourseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getWindow().getDecorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable disconnectRunnable_delegate$lambda$14(final BaseCourseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Runnable() { // from class: k52
            @Override // java.lang.Runnable
            public final void run() {
                BaseCourseActivity.disconnectRunnable_delegate$lambda$14$lambda$13(this.f23464a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void disconnectRunnable_delegate$lambda$14$lambda$13(BaseCourseActivity this$0) {
        DriftDialog driftDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isFinishing() || (driftDialog = this$0.disConnectDialog) == null) {
            return;
        }
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialog.show(supportFragmentManager);
    }

    private final View getDecoderView() {
        return (View) this.decoderView.getValue();
    }

    private final Runnable getDisconnectRunnable() {
        return (Runnable) this.disconnectRunnable.getValue();
    }

    private final DriftDialog getHrWarnDialog() {
        return (DriftDialog) this.hrWarnDialog.getValue();
    }

    private final int getHrWarnLimit() {
        return ((Number) this.hrWarnLimit.getValue()).intValue();
    }

    private final int getSource() {
        return ((Number) this.source.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DriftDialog hrWarnDialog_delegate$lambda$17(final BaseCourseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DriftDialog.Builder layoutRes = new DriftDialog.Builder().setLayoutRes(sti.course_layout_alert);
        UIUtils uIUtils = UIUtils.INSTANCE;
        Application application = this$0.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        return DriftDialog.Builder.setGravity$default(layoutRes.setWidth(uIUtils.dip2px(application, 187.0f)), 17, 0, 0, 6, null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: t52
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                BaseCourseActivity.hrWarnDialog_delegate$lambda$17$lambda$15(this.f34321a, dialogInterface);
            }
        }).setOnViewBind(new Function1() { // from class: u52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.hrWarnDialog_delegate$lambda$17$lambda$16(this.f35388a, (View) obj);
            }
        }).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hrWarnDialog_delegate$lambda$17$lambda$15(BaseCourseActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hrWarnIn = false;
        this$0.getWindow().getDecorView().removeCallbacks(this$0.hrWarnRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hrWarnDialog_delegate$lambda$17$lambda$16(BaseCourseActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.getInfo().getType() == 3) {
            ((TextView) it.findViewById(oqi.N0)).setText(this$0.getString(czi.course_hr_warning));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int hrWarnLimit_delegate$lambda$1(BaseCourseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getHrZone().getMaxHr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hrWarnRunnable$lambda$18(BaseCourseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.abnormalHeartRate()) {
            DriftDialog hrWarnDialog = this$0.getHrWarnDialog();
            FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            hrWarnDialog.show(supportFragmentManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrZone hrZone_delegate$lambda$0() {
        return new HrZone();
    }

    private final void observer() {
        getMViewModel().setOnDeviceStatus(new Function1() { // from class: v52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.observer$lambda$6(this.f36487a, (DeviceState) obj);
            }
        });
        getMViewModel().checkDeviceStatus();
        getMViewModel().setOnStateChange(new Function1() { // from class: w52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.observer$lambda$7(this.f37624a, (CourseSportState) obj);
            }
        });
        getMViewModel().setOnSecondTick(new Function1() { // from class: x52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.observer$lambda$8(this.f38708a, ((Long) obj).longValue());
            }
        });
        getMViewModel().getRecordEmitter().observe(this, new BaseCourseActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: y52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.observer$lambda$9(this.f39797a, (SportBasicReport) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observer$lambda$6(final BaseCourseActivity this$0, final DeviceState it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.runOnUiThread(new Runnable() { // from class: p52
            @Override // java.lang.Runnable
            public final void run() {
                BaseCourseActivity.observer$lambda$6$lambda$5(this.f30012a, it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$6$lambda$5(BaseCourseActivity this$0, DeviceState it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.onDeviceStatusChange(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observer$lambda$7(BaseCourseActivity this$0, CourseSportState it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.sportStateChange(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit observer$lambda$8(BaseCourseActivity this$0, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onSecondTick(j);
        if (this$0.supportDeviceLink && !this$0.isSendCmd()) {
            ((CourseBasePlayerVM) this$0.getMViewModel()).cmd(((CourseBasePlayerVM) this$0.getMViewModel()).getPlayer().getCurrentPosition());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observer$lambda$9(BaseCourseActivity this$0, SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        if (sportBasicReport != null) {
            this$0.report = sportBasicReport;
            Bundle bundle = new Bundle();
            int iA = lp5.a(sportBasicReport);
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putInt("sport_type", iA);
            SportRecordApi.DefaultImpls.goSportDetail$default(SportRecordApiKt.getSportRecordApi(), this$0, bundle, sportBasicReport, false, 8, null);
        }
        this$0.finish();
        return Unit.INSTANCE;
    }

    private final void onDeviceStatusChange(final DeviceState state) {
        setDeviceStatus(state);
        if (this.supportDeviceLink) {
            if (state.getSportConnect()) {
                DriftDialog driftDialog = this.disConnectDialog;
                if (driftDialog != null && driftDialog.isVisible()) {
                    driftDialog.dismiss();
                }
                this.disConnectDialog = null;
                getDecoderView().removeCallbacks(getDisconnectRunnable());
                return;
            }
            DriftDialog driftDialog2 = this.disConnectDialog;
            if (driftDialog2 == null || driftDialog2 == null || !driftDialog2.isVisible()) {
                getDecoderView().removeCallbacks(getDisconnectRunnable());
                this.disConnectDialog = new DriftDialog.Builder().setLayoutRes(sti.course_layout_dialog).addClickIds(oqi.C0, oqi.e1).setOnViewClick(new Function2() { // from class: z52
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BaseCourseActivity.onDeviceStatusChange$lambda$11(this.f40881a, (View) obj, (DriftDialog) obj2);
                    }
                }).setOnViewBind(new Function1() { // from class: a62
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BaseCourseActivity.onDeviceStatusChange$lambda$12(this.f671a, state, (View) obj);
                    }
                }).setCanceledOnTouchOutside(false).create();
                getDecoderView().postDelayed(getDisconnectRunnable(), 60000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceStatusChange$lambda$11(BaseCourseActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == oqi.C0) {
            dialog.dismiss();
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onDeviceStatusChange finishCourse");
            this$0.finishCourse();
        } else if (id == oqi.e1) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeviceStatusChange$lambda$12(BaseCourseActivity this$0, DeviceState state, View view) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(view, "view");
        hu4 hu4VarA0 = hu4.A0(view);
        TextView textView = hu4VarA0.E;
        String string2 = this$0.getString(czi.course_audio_dialog_disconnect_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{state.getSportName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        if (this$0.getInfo().getType() == 1) {
            String string3 = this$0.getString(czi.course_audio_dialog_disconnect_content);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            string = String.format(string3, Arrays.copyOf(new Object[]{state.getSportName()}, 1));
            Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        } else {
            string = Intrinsics.areEqual(state.getSportName(), "跑步机") ? this$0.getString(czi.course_audio_disconnect_content) : "";
            Intrinsics.checkNotNull(string);
        }
        hu4VarA0.A.setText(string);
        if (this$0.getInfo().getType() == 1) {
            hu4VarA0.B.setText(czi.course_dialog_finish);
            hu4VarA0.D.setText(czi.course_continue);
        } else {
            hu4VarA0.B.setText(this$0.getString(czi.course_got_it));
            TextView rightButton = hu4VarA0.D;
            Intrinsics.checkNotNullExpressionValue(rightButton, "rightButton");
            ViewExtKt.gone(rightButton);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView setDeviceStatus$lambda$19(BaseCourseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (TextView) this$0.findViewById(oqi.L);
    }

    private static final TextView setDeviceStatus$lambda$20(Lazy<? extends TextView> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView setDeviceStatus$lambda$21(BaseCourseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (TextView) this$0.findViewById(oqi.h1);
    }

    private static final TextView setDeviceStatus$lambda$22(Lazy<? extends TextView> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showErrorDialog$lambda$29(BaseCourseActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == oqi.e1) {
            dialog.dismiss();
            if (((CourseBasePlayerVM) this$0.getMViewModel()).isSportValid()) {
                LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "showErrorDialog finishCourse");
                this$0.finishCourse();
            } else {
                this$0.showTimeTooShortDialog();
            }
        } else if (id == oqi.C0) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showErrorDialog$lambda$30(String title, String content, View view) {
        Intrinsics.checkNotNullParameter(title, "$title");
        Intrinsics.checkNotNullParameter(content, "$content");
        Intrinsics.checkNotNullParameter(view, "view");
        hu4 hu4VarA0 = hu4.A0(view);
        hu4VarA0.E.setText(title);
        hu4VarA0.A.setText(content);
        hu4VarA0.D.setText(czi.course_dialog_finish);
        hu4VarA0.B.setText(czi.common_cancel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPlanCourseTimeTooShortDialog$lambda$31(BaseCourseActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == oqi.C0) {
            dialog.dismiss();
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "showTimeTooShortDialog finishCourse");
            this$0.finishCourse();
        } else if (id == oqi.e1) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showPlanCourseTimeTooShortDialog$lambda$32(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        hu4 hu4VarA0 = hu4.A0(view);
        hu4VarA0.E.setText(czi.g);
        hu4VarA0.A.setText(czi.f);
        hu4VarA0.B.setText(czi.course_dialog_finish);
        hu4VarA0.D.setText(czi.course_continue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showStopDialog$lambda$25(BaseCourseActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == oqi.C0) {
            dialog.dismiss();
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "showStopDialog finishCourse");
            this$0.finishCourse();
        } else if (id == oqi.e1) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showStopDialog$lambda$26(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        hu4 hu4VarA0 = hu4.A0(view);
        hu4VarA0.E.setText(czi.course_stop_title);
        hu4VarA0.A.setText(czi.course_stop_desc);
        hu4VarA0.B.setText(czi.course_dialog_finish);
        hu4VarA0.D.setText(czi.course_continue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTimeTooShortDialog$lambda$27(BaseCourseActivity this$0, View view, DriftDialog dialog) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        int id = view.getId();
        if (id == oqi.C0) {
            dialog.dismiss();
            LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "showTimeTooShortDialog finishCourse");
            this$0.finishCourse();
        } else if (id == oqi.e1) {
            dialog.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTimeTooShortDialog$lambda$28(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        hu4 hu4VarA0 = hu4.A0(view);
        hu4VarA0.E.setText(czi.course_stop);
        hu4VarA0.A.setText(czi.course_too_short);
        hu4VarA0.B.setText(czi.course_dialog_finish);
        hu4VarA0.D.setText(czi.course_continue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int source_delegate$lambda$3(BaseCourseActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = this$0.getIntent();
        if (intent != null) {
            return intent.getIntExtra("source", 0);
        }
        return 0;
    }

    private final void sportStateChange(CourseSportState state) {
        LogUtil logUtil = LogUtil.INSTANCE;
        logUtil.i(BaseBindingActivity.TAG, "sportStateChange: state = " + state);
        if (state instanceof CourseSportState.Start) {
            long startTime = getMViewModel().getStartTime();
            this.startTime = startTime;
            logUtil.d(BaseBindingActivity.TAG, "sportStateChange: start time = " + startTime);
        }
        onSportStateChange(state);
    }

    public boolean abnormalHeartRate() {
        return true;
    }

    public final void checkHr(int hr) {
        if (hr > 0) {
            this.mCurrentHr = hr;
        }
        if (hr > getHrWarnLimit()) {
            if (this.hrWarnIn) {
                return;
            }
            this.hrWarnIn = true;
            getWindow().getDecorView().postDelayed(this.hrWarnRunnable, 3000L);
            return;
        }
        if (this.hrWarnIn) {
            getWindow().getDecorView().removeCallbacks(this.hrWarnRunnable);
            if (getHrWarnDialog().isVisible()) {
                getHrWarnDialog().dismiss();
            }
            this.hrWarnIn = false;
        }
    }

    public final void checkHrWithZero(int hr) {
        if (hr > 0) {
            this.mCurrentHr = hr;
        }
        if (1 > hr || hr > getHrWarnLimit()) {
            if (this.hrWarnIn) {
                return;
            }
            this.hrWarnIn = true;
            getWindow().getDecorView().postDelayed(this.hrWarnRunnable, 3000L);
            return;
        }
        getWindow().getDecorView().removeCallbacks(this.hrWarnRunnable);
        if (getHrWarnDialog().isVisible()) {
            getHrWarnDialog().dismiss();
        }
        this.hrWarnIn = false;
    }

    public abstract void finishCourse();

    public final boolean getCmdEnable() {
        return this.cmdEnable;
    }

    @Nullable
    public final CourseConfigModel.DeviceLinkage getDeviceLinkage() {
        return this.deviceLinkage;
    }

    public final int getDistance() {
        return this.distance;
    }

    @NotNull
    public final HrZone getHrZone() {
        return (HrZone) this.hrZone.getValue();
    }

    @NotNull
    public final CourseAllInfo getInfo() {
        CourseAllInfo courseAllInfo = this.info;
        if (courseAllInfo != null) {
            return courseAllInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("info");
        return null;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getSupportDeviceLink() {
        return this.supportDeviceLink;
    }

    public boolean isSendCmd() {
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String model;
        super.onCreate(savedInstanceState);
        getWindow().setFlags(1024, 1024);
        DisplayUtil.hideBottomUIMenu(this);
        Intent intent = getIntent();
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("course_info") : null;
        CourseAllInfo courseAllInfo = serializableExtra instanceof CourseAllInfo ? (CourseAllInfo) serializableExtra : null;
        Intent intent2 = getIntent();
        String stringExtra = intent2 != null ? intent2.getStringExtra("course_device_model") : null;
        if (courseAllInfo == null || stringExtra == null) {
            finish();
            return;
        }
        setInfo(courseAllInfo);
        Intent intent3 = getIntent();
        this.planId = intent3 != null ? intent3.getLongExtra(BaseCourseActivityKt.KEY_TRAINING_PLAN_INFO, 0L) : 0L;
        Serializable serializableExtra2 = getIntent().getSerializableExtra("course_summary");
        this.practiseSummary = serializableExtra2 instanceof CourseModel.PracticedSummary ? (CourseModel.PracticedSummary) serializableExtra2 : null;
        NotchScreenManager.INSTANCE.getInstance().setDisplayInNotch(this);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.27.0.1.15202");
        Object[] objArr = new Object[20];
        objArr[0] = "name";
        objArr[1] = "Class_Start";
        objArr[2] = "asset_id";
        objArr[3] = String.valueOf(getInfo().getCourseId());
        objArr[4] = OneTrack.Param.ASSET_NAME;
        String name = getInfo().getName();
        if (name == null) {
            name = "";
        }
        objArr[5] = name;
        objArr[6] = "count";
        CourseModel.PracticedSummary practicedSummary = this.practiseSummary;
        objArr[7] = Integer.valueOf(practicedSummary != null ? practicedSummary.trainTimes : 0);
        objArr[8] = "type_str";
        objArr[9] = CourseExtKt.supportLink(getInfo().getDeviceLinkage()) ? "instrument" : "training";
        objArr[10] = "device_model";
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[11] = model;
        objArr[12] = "instrument_model";
        String localModelStr = getMViewModel().getLocalModelStr();
        if (localModelStr == null) {
            localModelStr = "";
        }
        objArr[13] = localModelStr;
        objArr[14] = "other_model";
        String otherDevice = getMViewModel().getOtherDevice();
        objArr[15] = otherDevice != null ? otherDevice : "";
        objArr[16] = "type_sku";
        CourseModel.CourseData basicInfo = getInfo().getBasicInfo();
        objArr[17] = Integer.valueOf((basicInfo != null ? basicInfo.pricingStatus : 0) + 1);
        objArr[18] = "source";
        objArr[19] = Integer.valueOf(getSource());
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        CourseModel.CourseData basicInfo2 = getInfo().getBasicInfo();
        this.sportType = basicInfo2 != null ? basicInfo2.sportType : 0;
        LogUtil.INSTANCE.i(BaseBindingActivity.TAG, "onCreate: courseId = " + getInfo().getCourseId() + "; sportType = " + this.sportType + "; courseType = " + getInfo().getType());
        if (getInfo().getCourseId() <= 0 || this.sportType <= 0) {
            ToastUtil.showShortToast(czi.common_hint_unkonwn_error);
            finish();
            return;
        }
        getMViewModel().initData(stringExtra, this.sportType, getInfo());
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.hide();
        }
        CourseConfigModel.DeviceLinkage deviceLinkage = getInfo().getDeviceLinkage();
        this.deviceLinkage = deviceLinkage;
        this.supportDeviceLink = CourseExtKt.supportLink(deviceLinkage);
        List<CourseConfigModel.DevCmd> cmdSet = CourseExtKt.getCmdSet(getInfo());
        if (cmdSet != null) {
            getMViewModel().setCmdSet(cmdSet);
        }
        observer();
        RemindExt.INSTANCE.setSupportRemind(false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        String model;
        Integer avgCadence;
        Integer avgPace;
        super.onDestroy();
        getDecoderView().removeCallbacks(this.hrWarnRunnable);
        getDecoderView().removeCallbacks(getDisconnectRunnable());
        if (this.info == null) {
            return;
        }
        String str = CourseExtKt.supportLink(getInfo().getDeviceLinkage()) ? "instrument" : "training";
        SportBasicReport sportBasicReport = this.report;
        int iIntValue = (sportBasicReport == null || (avgPace = SportReportComputeUtil.INSTANCE.getAvgPace(sportBasicReport)) == null) ? 0 : avgPace.intValue();
        SportBasicReport sportBasicReport2 = this.report;
        int iIntValue2 = (sportBasicReport2 == null || (avgCadence = SportReportComputeUtil.getAvgCadence(sportBasicReport2)) == null) ? 0 : avgCadence.intValue();
        Logger.i(BaseBindingActivity.TAG, "onDestroy: " + iIntValue + ", " + iIntValue2);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, "56.27.0.1.15201");
        Object[] objArr = new Object[34];
        objArr[0] = "name";
        objArr[1] = "Class_Report";
        objArr[2] = "asset_id";
        objArr[3] = String.valueOf(getInfo().getCourseId());
        objArr[4] = OneTrack.Param.ASSET_NAME;
        String name = getInfo().getName();
        if (name == null) {
            name = "";
        }
        objArr[5] = name;
        objArr[6] = BroadcastsKt.SILENT_PUSHING_PROGRESS;
        objArr[7] = Integer.valueOf(getMViewModel().getProgress());
        objArr[8] = "duration_min";
        TimeUnit timeUnit = TimeUnit.SECONDS;
        PhoneSportData mSportData = getMViewModel().getMSportData();
        objArr[9] = Long.valueOf(timeUnit.toMinutes(mSportData != null ? mSportData.deviceDuration : 0L));
        objArr[10] = "calorie";
        PhoneSportData mSportData2 = getMViewModel().getMSportData();
        objArr[11] = Integer.valueOf((int) ((mSportData2 != null ? mSportData2.calorie : 0.0f) / 1000));
        objArr[12] = "distance";
        PhoneSportData mSportData3 = getMViewModel().getMSportData();
        objArr[13] = Integer.valueOf(mSportData3 != null ? mSportData3.distance : 0);
        objArr[14] = "device_model";
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[15] = model;
        objArr[16] = "instrument_model";
        String localModelStr = getMViewModel().getLocalModelStr();
        if (localModelStr == null) {
            localModelStr = "";
        }
        objArr[17] = localModelStr;
        objArr[18] = "other_model";
        String otherDevice = getMViewModel().getOtherDevice();
        objArr[19] = otherDevice != null ? otherDevice : "";
        objArr[20] = "count";
        CourseModel.PracticedSummary practicedSummary = this.practiseSummary;
        objArr[21] = Integer.valueOf(practicedSummary != null ? practicedSummary.trainTimes : 0);
        objArr[22] = "type_str";
        objArr[23] = str;
        objArr[24] = "pace_avg";
        objArr[25] = Integer.valueOf(iIntValue);
        objArr[26] = "tempo_avg";
        objArr[27] = Integer.valueOf(iIntValue2);
        objArr[28] = "HR_finish";
        objArr[29] = Integer.valueOf(this.mCurrentHr);
        objArr[30] = "value_num";
        objArr[31] = Integer.valueOf(getMViewModel().getCmdCount());
        objArr[32] = "source";
        objArr[33] = Integer.valueOf(getSource());
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        RemindExt.INSTANCE.setSupportRemind(true);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
    }

    public void onSecondTick(long duration) {
    }

    public abstract void onSportStateChange(@NotNull CourseSportState state);

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getWindow().clearFlags(128);
    }

    public final void setCmdEnable(boolean z) {
        this.cmdEnable = z;
    }

    public final void setDeviceLinkage(@Nullable CourseConfigModel.DeviceLinkage deviceLinkage) {
        this.deviceLinkage = deviceLinkage;
    }

    public void setDeviceStatus(@NotNull DeviceState state) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(state, "state");
        LogUtil.INSTANCE.d(BaseBindingActivity.TAG, "setDeviceStatus:" + state);
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: i52
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCourseActivity.setDeviceStatus$lambda$19(this.f20793a);
            }
        });
        Lazy lazy2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: j52
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseCourseActivity.setDeviceStatus$lambda$21(this.f22424a);
            }
        });
        TextView deviceStatus$lambda$20 = setDeviceStatus$lambda$20(lazy);
        if (deviceStatus$lambda$20 != null) {
            if (state.getWearHas()) {
                ViewExtKt.visible(deviceStatus$lambda$20);
                if (state.getWearConnect()) {
                    String string = getString(czi.course_device_connect);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    str2 = String.format(string, Arrays.copyOf(new Object[]{state.getWearName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                } else {
                    String string2 = getString(czi.course_device_disconnect);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    str2 = String.format(string2, Arrays.copyOf(new Object[]{state.getWearName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                }
                deviceStatus$lambda$20.setText(str2);
            } else {
                ViewExtKt.gone(deviceStatus$lambda$20);
            }
        }
        TextView deviceStatus$lambda$22 = setDeviceStatus$lambda$22(lazy2);
        if (deviceStatus$lambda$22 != null) {
            if (!state.getSportHas()) {
                ViewExtKt.gone(deviceStatus$lambda$22);
                return;
            }
            ViewExtKt.visible(deviceStatus$lambda$22);
            if (state.getSportConnect()) {
                String string3 = getString(czi.course_device_connect);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                str = String.format(string3, Arrays.copyOf(new Object[]{state.getSportName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                String string4 = getString(czi.course_device_disconnect);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                str = String.format(string4, Arrays.copyOf(new Object[]{state.getSportName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            deviceStatus$lambda$22.setText(str);
        }
    }

    public final void setDistance(int i) {
        this.distance = i;
    }

    public final void setInfo(@NotNull CourseAllInfo courseAllInfo) {
        Intrinsics.checkNotNullParameter(courseAllInfo, "<set-?>");
        this.info = courseAllInfo;
    }

    public final void setPlanId(long j) {
        this.planId = j;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSupportDeviceLink(boolean z) {
        this.supportDeviceLink = z;
    }

    @NotNull
    public final DriftDialog showErrorDialog(@NotNull final String title, @NotNull final String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        return new DriftDialog.Builder().setLayoutRes(sti.course_layout_dialog).addClickIds(oqi.C0, oqi.e1).setOnViewClick(new Function2() { // from class: q52
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BaseCourseActivity.showErrorDialog$lambda$29(this.f31124a, (View) obj, (DriftDialog) obj2);
            }
        }).setOnViewBind(new Function1() { // from class: s52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.showErrorDialog$lambda$30(title, content, (View) obj);
            }
        }).setCanceledOnTouchOutside(false).create();
    }

    public final void showPlanCourseTimeTooShortDialog() {
        DriftDialog driftDialogCreate = new DriftDialog.Builder().setLayoutRes(sti.course_layout_dialog).addClickIds(oqi.C0, oqi.e1).setOnViewClick(new Function2() { // from class: l52
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BaseCourseActivity.showPlanCourseTimeTooShortDialog$lambda$31(this.f24674a, (View) obj, (DriftDialog) obj2);
            }
        }).setOnViewBind(new Function1() { // from class: m52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.showPlanCourseTimeTooShortDialog$lambda$32((View) obj);
            }
        }).setCanceledOnTouchOutside(false).create();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialogCreate.show(supportFragmentManager);
    }

    public final void showStopDialog() {
        DriftDialog driftDialogCreate = new DriftDialog.Builder().setLayoutRes(sti.course_layout_dialog).addClickIds(oqi.C0, oqi.e1).setOnViewClick(new Function2() { // from class: g52
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BaseCourseActivity.showStopDialog$lambda$25(this.f18609a, (View) obj, (DriftDialog) obj2);
            }
        }).setOnViewBind(new Function1() { // from class: r52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.showStopDialog$lambda$26((View) obj);
            }
        }).setCanceledOnTouchOutside(false).create();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialogCreate.show(supportFragmentManager);
    }

    public final void showTimeTooShortDialog() {
        DriftDialog driftDialogCreate = new DriftDialog.Builder().setLayoutRes(sti.course_layout_dialog).addClickIds(oqi.C0, oqi.e1).setOnViewClick(new Function2() { // from class: n52
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BaseCourseActivity.showTimeTooShortDialog$lambda$27(this.f27558a, (View) obj, (DriftDialog) obj2);
            }
        }).setOnViewBind(new Function1() { // from class: o52
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseCourseActivity.showTimeTooShortDialog$lambda$28((View) obj);
            }
        }).setCanceledOnTouchOutside(false).create();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        driftDialogCreate.show(supportFragmentManager);
    }
}
