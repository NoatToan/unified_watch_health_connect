package com.xiaomi.fitness.health.curse;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.calendar.CalendarActivity;
import com.xiaomi.fitness.common.extension.PageUtilExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseMainActivity;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.DayData;
import com.xiaomi.fitness.health.curse.view.CurseNoticeCardView;
import com.xiaomi.fitness.health.curse.view.CurseResetCardView;
import com.xiaomi.fitness.health.curse.view.CurseTempViewHolder;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import com.xiaomi.fitness.health.curse.vm.CurseMainVMKt;
import com.xiaomi.fitness.health.temperature.ui.TempTrendSupportDeviceFragment;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.PingAnHealthExtKt;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.a4i;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.dih;
import defpackage.eri;
import defpackage.iji;
import defpackage.ili;
import defpackage.jui;
import defpackage.ls9;
import defpackage.n2j;
import defpackage.ni4;
import defpackage.nwi;
import defpackage.o7h;
import defpackage.pnb;
import defpackage.pni;
import defpackage.pu9;
import defpackage.rbd;
import defpackage.wc0;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\bD\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0007J\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\u0005H\u0014¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\u0005H\u0014¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010\"\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\"\u0010\u0007J\r\u0010#\u001a\u00020\u0005¢\u0006\u0004\b#\u0010\u0007J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010:R\u001a\u0010B\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseMainActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "Lpnb;", "Lcom/xiaomi/fitness/health/curse/CurseManager$OnConfigChange;", "", "addSystemBarHeightPadding", "()V", "initTitleView", "initPredictNoticeCards", "showCalendar", "Landroid/widget/TextView;", "getSubTitleView", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "showPopupMenu", "(Landroid/view/View;)V", "refreshMargin", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "period", "setSymptom", "(Lcom/xiaomi/fitness/health/curse/data/DayData;)V", "Lorg/joda/time/LocalDate;", DialWidgetType.DATE, "setTitleDate", "(Lorg/joda/time/LocalDate;)V", "onDataChange", LifecycleConstantKt.ON_DESTROY, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_RESUME, "refreshPredictBanner", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lpu9;", "temperatureMonitor", "Lpu9;", "getTemperatureMonitor", "()Lpu9;", "setTemperatureMonitor", "(Lpu9;)V", "Lls9;", "heartRateMonitor", "Lls9;", "getHeartRateMonitor", "()Lls9;", "setHeartRateMonitor", "(Lls9;)V", "", "typeMonitor", "I", "getTypeMonitor", "()I", "setTypeMonitor", "(I)V", "", "hrNTempMonitorClose", "Z", "layoutId", "getLayoutId", "viewModelId", "getViewModelId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseMainActivity.kt\ncom/xiaomi/fitness/health/curse/CurseMainActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,360:1\n157#2,8:361\n*S KotlinDebug\n*F\n+ 1 CurseMainActivity.kt\ncom/xiaomi/fitness/health/curse/CurseMainActivity\n*L\n150#1:361,8\n*E\n"})
public final class CurseMainActivity extends Hilt_CurseMainActivity<CurseMainVM, pnb> implements CurseManager.OnConfigChange {

    @Nullable
    private ls9 heartRateMonitor;
    private boolean hrNTempMonitorClose;

    @Nullable
    private pu9 temperatureMonitor;
    private int typeMonitor;
    private final int layoutId = jui.A2;
    private final int viewModelId = cv1.f14763a;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseMainActivity$initPredictNoticeCards$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseMainActivity$initPredictNoticeCards$7", f = "CurseMainActivity.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseMainActivity$initPredictNoticeCards$7$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpu9;", "tempMonitor", "Lls9;", "hrMonitor", "", "<anonymous>", "(Lpu9;Lls9;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseMainActivity$initPredictNoticeCards$7$1", f = "CurseMainActivity.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<pu9, ls9, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ CurseMainActivity this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.CurseMainActivity$initPredictNoticeCards$7$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.health.curse.CurseMainActivity$initPredictNoticeCards$7$1$1", f = "CurseMainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C05791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ ls9 $hrMonitor;
                final /* synthetic */ pu9 $tempMonitor;
                int label;
                final /* synthetic */ CurseMainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05791(pu9 pu9Var, ls9 ls9Var, CurseMainActivity curseMainActivity, Continuation<? super C05791> continuation) {
                    super(2, continuation);
                    this.$tempMonitor = pu9Var;
                    this.$hrMonitor = ls9Var;
                    this.this$0 = curseMainActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C05791(this.$tempMonitor, this.$hrMonitor, this.this$0, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    String string;
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z = !this.$tempMonitor.c;
                    boolean z2 = this.$hrMonitor.c == 1;
                    if (z && !z2) {
                        string = this.this$0.getString(c0j.dq);
                        this.this$0.setTypeMonitor(CurseMainVMKt.getTYPE_TEMP_MONITOR_OFF());
                    } else if (!z && z2) {
                        string = this.this$0.getString(c0j.Qp);
                        this.this$0.setTypeMonitor(CurseMainVMKt.getTYPE_HR_MONITOR_OFF());
                    } else if (z && z2) {
                        string = this.this$0.getString(c0j.cq);
                        this.this$0.setTypeMonitor(CurseMainVMKt.getTYPE_HRNTEMP_MONITOR_OFF());
                    } else {
                        string = "";
                    }
                    CurseMainActivity.access$getMBinding(this.this$0).H.setSubTitle(string);
                    this.this$0.hrNTempMonitorClose = !this.$tempMonitor.c || this.$hrMonitor.c == 1;
                    CurseNoticeCardView openHrAndTempMonitorView = CurseMainActivity.access$getMBinding(this.this$0).H;
                    Intrinsics.checkNotNullExpressionValue(openHrAndTempMonitorView, "openHrAndTempMonitorView");
                    ViewExtKt.setVisible(openHrAndTempMonitorView, !CurseManager.INSTANCE.getInstance().isAlgoPredictOff() && this.this$0.hrNTempMonitorClose);
                    this.this$0.setTemperatureMonitor(this.$tempMonitor);
                    this.this$0.setHeartRateMonitor(this.$hrMonitor);
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C05791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CurseMainActivity curseMainActivity, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = curseMainActivity;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(pu9 pu9Var, ls9 ls9Var, Continuation<? super Unit> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = pu9Var;
                anonymousClass1.L$1 = ls9Var;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    pu9 pu9Var = (pu9) this.L$0;
                    ls9 ls9Var = (ls9) this.L$1;
                    if (pu9Var != null && ls9Var != null) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C05791 c05791 = new C05791(pu9Var, ls9Var, this.this$0, null);
                        this.L$0 = null;
                        this.label = 1;
                        if (BuildersKt.withContext(main, c05791, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseMainActivity.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CurseMainVM curseMainVMAccess$getMViewModel = CurseMainActivity.access$getMViewModel(CurseMainActivity.this);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CurseMainActivity.this, null);
                this.label = 1;
                if (curseMainVMAccess$getMViewModel.getHrNTempMonitorSwitch(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ pnb access$getMBinding(CurseMainActivity curseMainActivity) {
        return (pnb) curseMainActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ CurseMainVM access$getMViewModel(CurseMainActivity curseMainActivity) {
        return (CurseMainVM) curseMainActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSystemBarHeightPadding() {
        c.H0(((pnb) getMBinding()).getRoot(), new o7h() { // from class: d85
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return CurseMainActivity.addSystemBarHeightPadding$lambda$6$lambda$5(this.f15206a, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat addSystemBarHeightPadding$lambda$6$lambda$5(CurseMainActivity this$0, View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.h() | WindowInsetsCompat.m.b());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        Logger.d(BaseBindingActivity.TAG, "addStatusBarHeightPadding statusBars top=" + rbdVarF.f32379b + " bottom=" + rbdVarF.d);
        int i = rbdVarF.f32379b;
        View root = ((pnb) this$0.getMBinding()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), i, root.getPaddingRight(), root.getPaddingBottom());
        return WindowInsetsCompat.f2098b;
    }

    private final TextView getSubTitleView() {
        wc0 miuiActionBar = getMiuiActionBar();
        return (TextView) (miuiActionBar != null ? miuiActionBar.getSubTitleView(0) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initPredictNoticeCards() {
        CurseResetCardView curseResetCardView = ((pnb) getMBinding()).I;
        String string = getString(c0j.Lp);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        curseResetCardView.setData(string, "");
        ((pnb) getMBinding()).J.setOnClickListener(new View.OnClickListener() { // from class: e85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseMainActivity.initPredictNoticeCards$lambda$9(this.f16377a, view);
            }
        });
        ((pnb) getMBinding()).I.setOnClickListener(new View.OnClickListener() { // from class: f85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewUtilKt.startWebView$default("https://watch.iot.mi.com/html/general/index.html?#/women_health", null, false, false, null, false, null, false, 254, null);
            }
        });
        ((CurseMainVM) getMViewModel()).checkSupportPredict().observe(this, new CurseMainActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: t75
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseMainActivity.initPredictNoticeCards$lambda$11(this.f34403a, (Boolean) obj);
            }
        }));
        ((pnb) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: u75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseMainActivity.initPredictNoticeCards$lambda$12(this.f35487a, view);
            }
        });
        ((pnb) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: v75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseMainActivity.initPredictNoticeCards$lambda$13(this.f36582a, view);
            }
        });
        ((pnb) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: w75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseMainActivity.initPredictNoticeCards$lambda$14(this.f37680a, view);
            }
        });
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass7(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initPredictNoticeCards$lambda$11(CurseMainActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            if (CurseManager.INSTANCE.getInstance().supportMenstrualPredict()) {
                CurseNoticeCardView intelligentPredictBindView = ((pnb) this$0.getMBinding()).E;
                Intrinsics.checkNotNullExpressionValue(intelligentPredictBindView, "intelligentPredictBindView");
                ExtUtilKt.gone(intelligentPredictBindView);
            } else {
                CurseNoticeCardView intelligentPredictBindView2 = ((pnb) this$0.getMBinding()).E;
                Intrinsics.checkNotNullExpressionValue(intelligentPredictBindView2, "intelligentPredictBindView");
                ViewExtKt.visible(intelligentPredictBindView2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPredictNoticeCards$lambda$12(CurseMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dih dihVarA = dih.a();
        if (dihVarA != null) {
            PageUtilExtKt.goCommonActivity(dihVarA, this$0, TempTrendSupportDeviceFragment.class, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initPredictNoticeCards$lambda$13(CurseMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((CurseMainVM) this$0.getMViewModel()).cursePredictOn();
        CurseNoticeCardView intelligentPredictSwitchView = ((pnb) this$0.getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(intelligentPredictSwitchView, "intelligentPredictSwitchView");
        ExtUtilKt.gone(intelligentPredictSwitchView);
        CurseNoticeCardView openHrAndTempMonitorView = ((pnb) this$0.getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(openHrAndTempMonitorView, "openHrAndTempMonitorView");
        ViewExtKt.setVisible(openHrAndTempMonitorView, this$0.hrNTempMonitorClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPredictNoticeCards$lambda$14(CurseMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            ToastUtil.showShortToast(c0j.f4801r);
        } else {
            ScopeExtKt.scope(Dispatchers.getIO(), new CurseMainActivity$initPredictNoticeCards$6$1(this$0, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPredictNoticeCards$lambda$9(CurseMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) CurseResetActivity.class);
        intent.putExtra(CurseResetActivity.EXTRA_FROM_RESET, true);
        this$0.startActivity(intent);
    }

    private final void initTitleView() {
        TextView subTitleView = getSubTitleView();
        if (subTitleView != null) {
            subTitleView.setTextAppearance(n2j.f27483a);
            subTitleView.setTextColor(ni4.c(getApplication(), iji.r3));
            subTitleView.setCompoundDrawablePadding(ExtUtilsKt.getDp(4));
            subTitleView.setCompoundDrawablesWithIntrinsicBounds(0, 0, pni.P1, 0);
            subTitleView.setOnClickListener(new View.OnClickListener() { // from class: b85
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CurseMainActivity.initTitleView$lambda$8$lambda$7(this.f3909a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleView$lambda$8$lambda$7(CurseMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showCalendar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1$lambda$0(CurseMainActivity this$0, ImageView this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.showPopupMenu(this_apply);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(CurseMainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) CurseKnownActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$3(CurseMainActivity this$0, HashMap map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("CurseActivity", "resumeMonthOb: " + map);
        this$0.refreshPredictBanner();
        ((pnb) this$0.getMBinding()).B.onResume();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(CurseMainActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("CurseActivity", "checkDevicesSupport: observe: " + bool);
        if (bool.booleanValue()) {
            new CommonDialog.c("curse device wear notice").setDialogTitle(c0j.Sp).setPositiveText(c0j.common_known).create().showIfNeed(this$0.getSupportFragmentManager());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void refreshMargin() {
        int dimen = (int) ResourceExtKt.getDimen(this, ili.g);
        ViewGroup.LayoutParams layoutParams = ((pnb) getMBinding()).A.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(dimen, marginLayoutParams.topMargin, dimen, marginLayoutParams.bottomMargin);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showCalendar() {
        Bundle bundle = new Bundle();
        bundle.putInt("position", 2);
        bundle.putSerializable("local_date", ((pnb) getMBinding()).C.getCurDate());
        bundle.putBoolean("from_activity", true);
        bundle.putBoolean("switch_day_week_month", false);
        Intent intent = new Intent(this, (Class<?>) CalendarActivity.class);
        intent.putExtras(bundle);
        startForActivityResult(intent, new Function2() { // from class: s75
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CurseMainActivity.showCalendar$lambda$15(this.f33365a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showCalendar$lambda$15(CurseMainActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("calendar_date") : null;
        LocalDate localDate = serializableExtra instanceof LocalDate ? (LocalDate) serializableExtra : null;
        if (i == -1 && localDate != null) {
            LocalDate curDate = ((pnb) this$0.getMBinding()).C.getCurDate();
            Intrinsics.checkNotNullExpressionValue(curDate, "getCurData(...)");
            if (TimeDateUtil.isSameMonth(curDate, localDate)) {
                return Unit.INSTANCE;
            }
            ((pnb) this$0.getMBinding()).C.switchMonth(localDate);
        }
        Logger.d("CurseActivity", "showCalendar: " + i + ", " + (intent != null ? intent.getSerializableExtra("calendar_date") : null));
        return Unit.INSTANCE;
    }

    private final void showPopupMenu(View view) {
        a4i a4iVar = new a4i(this, view);
        a4iVar.f(nwi.c);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: c85
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CurseMainActivity.showPopupMenu$lambda$16(this.f5039a, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$16(CurseMainActivity this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == eri.f2) {
            this$0.startActivity(new Intent(this$0, (Class<?>) CurseHistoryActivity.class));
            return true;
        }
        if (itemId != eri.g2) {
            return true;
        }
        this$0.startActivity(new Intent(this$0, (Class<?>) CurseSetActivity.class));
        return true;
    }

    @Nullable
    public final ls9 getHeartRateMonitor() {
        return this.heartRateMonitor;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Nullable
    public final pu9 getTemperatureMonitor() {
        return this.temperatureMonitor;
    }

    public final int getTypeMonitor() {
        return this.typeMonitor;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        refreshMargin();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseMainActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            Logger.i("CurseActivity", "onCreate: not login");
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
            finish();
            return;
        }
        if (!CurseExtKt.curseReady()) {
            Logger.i("CurseActivity", "onCreate: not ready");
            finish();
            return;
        }
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        getWindow().getDecorView().setBackgroundResource(iji.T2);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(0));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            final ImageView imageView = new ImageView(this);
            imageView.setImageResource(pni.x2);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: x75
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CurseMainActivity.onCreate$lambda$1$lambda$0(this.f38779a, imageView, view);
                }
            });
            miuiActionBar2.setEndView(imageView);
        }
        initTitleView();
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        setTitleDate(localDateNow);
        CurseTempViewHolder curseTempHolder = ((pnb) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(curseTempHolder, "curseTempHolder");
        CurseManager.Companion companion = CurseManager.INSTANCE;
        ViewExtKt.setVisible(curseTempHolder, companion.getInstance().supportMenstrualPredict());
        ((pnb) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: y75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseMainActivity.onCreate$lambda$2(this.f39882a, view);
            }
        });
        companion.getInstance().addDataObserver(this);
        HealthBannerCardSetView healthBannerCardSet = ((pnb) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(healthBannerCardSet, "healthBannerCardSet");
        PingAnHealthExtKt.bindOneBanner(healthBannerCardSet, 2);
        ((CurseMainVM) getMViewModel()).getResumeMonthOb().observe(this, new CurseMainActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z75
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseMainActivity.onCreate$lambda$3(this.f40974a, (HashMap) obj);
            }
        }));
        ((CurseMainVM) getMViewModel()).checkDevicesSupport().observe(this, new CurseMainActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a85
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseMainActivity.onCreate$lambda$4(this.f753a, (Boolean) obj);
            }
        }));
        initPredictNoticeCards();
        addSystemBarHeightPadding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.CurseManager.OnConfigChange
    public void onDataChange() {
        ((pnb) getMBinding()).C.onDataChange();
        ((pnb) getMBinding()).B.refreshData(null);
    }

    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseMainActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CurseManager.INSTANCE.getInstance().removeObserver(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797");
        Object[] objArr = new Object[6];
        objArr[0] = "name";
        objArr[1] = "women_health_detail_page";
        objArr[2] = "title";
        objArr[3] = "女性健康";
        objArr[4] = "data";
        objArr[5] = CurseManager.INSTANCE.getInstance().getLatestRecord() == null ? "0" : "1";
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((pnb) getMBinding()).B.onResume();
        CurseNoticeCardView intelligentPredictSwitchView = ((pnb) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(intelligentPredictSwitchView, "intelligentPredictSwitchView");
        CurseManager.Companion companion = CurseManager.INSTANCE;
        ViewExtKt.setVisible(intelligentPredictSwitchView, companion.getInstance().isAlgoPredictOff());
        CurseNoticeCardView openHrAndTempMonitorView = ((pnb) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(openHrAndTempMonitorView, "openHrAndTempMonitorView");
        ViewExtKt.setVisible(openHrAndTempMonitorView, !companion.getInstance().isAlgoPredictOff() && this.hrNTempMonitorClose);
        refreshPredictBanner();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshPredictBanner() {
        CurseManager.Companion companion = CurseManager.INSTANCE;
        if (companion.getInstance().getAlgoCurseManager().isAlgoNoData()) {
            CurseResetCardView resetView = ((pnb) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(resetView, "resetView");
            ExtUtilKt.gone(resetView);
            CurseResetCardView predictingView = ((pnb) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(predictingView, "predictingView");
            ViewExtKt.setVisible(predictingView, companion.getInstance().isAlgoPredictEnable());
            return;
        }
        CurseResetCardView resetView2 = ((pnb) getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(resetView2, "resetView");
        ViewExtKt.setVisible(resetView2, companion.getInstance().isAlgoPredictEnable());
        CurseResetCardView predictingView2 = ((pnb) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(predictingView2, "predictingView");
        ExtUtilKt.gone(predictingView2);
    }

    public final void setHeartRateMonitor(@Nullable ls9 ls9Var) {
        this.heartRateMonitor = ls9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSymptom(@NotNull DayData period) {
        Intrinsics.checkNotNullParameter(period, "period");
        ((pnb) getMBinding()).L.setSymptom(period);
    }

    public final void setTemperatureMonitor(@Nullable pu9 pu9Var) {
        this.temperatureMonitor = pu9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitleDate(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        String dateYYYYMMLocalFormat = TimeDateUtil.getDateYYYYMMLocalFormat(new LocalDate(date));
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setSubtitle(dateYYYYMMLocalFormat);
        }
        ((pnb) getMBinding()).B.refreshData(date);
    }

    public final void setTypeMonitor(int i) {
        this.typeMonitor = i;
    }
}
