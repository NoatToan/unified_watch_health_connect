package com.xiaomi.fitness.sport_eco.view.interval;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.mi.health.course.ext.CourseExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingActivity;
import com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport_eco.view.sporting.JumpingActivity;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.av6;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.rv1;
import defpackage.wm0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingVM;", "Lwm0;", "", "initView", "()V", "startJumping", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "product", "showConnectDialog", "(Lcom/xiaomi/fitness/device/manager/bean/Product;)V", "initTab", "setFilterTab", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationFragment;", "mDurationIntervalTrainingFragment", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationFragment;", "getMDurationIntervalTrainingFragment", "()Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationFragment;", "setMDurationIntervalTrainingFragment", "(Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingDurationFragment;)V", "getMDurationIntervalTrainingFragment$annotations", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberFragment;", "mNumberIntervalTrainingFragment", "Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberFragment;", "getMNumberIntervalTrainingFragment", "()Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberFragment;", "setMNumberIntervalTrainingFragment", "(Lcom/xiaomi/fitness/sport_eco/view/interval/IntervalTrainingNumberFragment;)V", "getMNumberIntervalTrainingFragment$annotations", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IntervalTrainingActivity extends Hilt_IntervalTrainingActivity<IntervalTrainingVM, wm0> {
    public IntervalTrainingDurationFragment mDurationIntervalTrainingFragment;
    public IntervalTrainingNumberFragment mNumberIntervalTrainingFragment;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingActivity$onCreate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingActivity$onCreate$1", f = "IntervalTrainingActivity.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IntervalTrainingActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            IntervalTrainingActivity.access$getMBinding(IntervalTrainingActivity.this).B.setText(IntervalTrainingActivity.this.getString(e1j.o3));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ wm0 access$getMBinding(IntervalTrainingActivity intervalTrainingActivity) {
        return (wm0) intervalTrainingActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ IntervalTrainingVM access$getMViewModel(IntervalTrainingActivity intervalTrainingActivity) {
        return (IntervalTrainingVM) intervalTrainingActivity.getMViewModel();
    }

    public static /* synthetic */ void getMDurationIntervalTrainingFragment$annotations() {
    }

    public static /* synthetic */ void getMNumberIntervalTrainingFragment$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTab() {
        final IntervalTrainingVM intervalTrainingVM = (IntervalTrainingVM) getMViewModel();
        intervalTrainingVM.setTabList();
        int size = intervalTrainingVM.getMTabTitles().size();
        for (final int i = 0; i < size; i++) {
            FilterSortView.TabView tabViewK = ((wm0) getMBinding()).C.k(intervalTrainingVM.getMTabTitles().get(i));
            intervalTrainingVM.getTabViewMap().put(Integer.valueOf(i), tabViewK);
            tabViewK.setOnClickListener(new View.OnClickListener() { // from class: tfd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntervalTrainingActivity.initTab$lambda$7$lambda$6(intervalTrainingVM, i, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initTab$lambda$7$lambda$6(IntervalTrainingVM this_with, int i, IntervalTrainingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.setMPosition(i);
        if (i == 0) {
            ((wm0) this$0.getMBinding()).F.setCurrentItem(0);
        } else {
            if (i != 1) {
                return;
            }
            ((wm0) this$0.getMBinding()).F.setCurrentItem(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        wm0 wm0Var = (wm0) getMBinding();
        ArrayList arrayList = new ArrayList();
        arrayList.add(getMDurationIntervalTrainingFragment());
        arrayList.add(getMNumberIntervalTrainingFragment());
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        wm0Var.F.setAdapter(new IntervalTrainingPagerAdapter(supportFragmentManager, arrayList));
        wm0Var.F.addOnPageChangeListener(new ViewPager.i() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingActivity$initView$1$1
            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageSelected(int position) {
                IntervalTrainingActivity.access$getMViewModel(this.this$0).setMPosition(position);
                this.this$0.setFilterTab();
            }
        });
        initTab();
        setFilterTab();
        wm0Var.F.setCurrentItem(0);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String stringExtra = getIntent().getStringExtra(SportConstants.KEY_GYM_MODE_TYPE);
        T key_gym_local_sport_type = stringExtra;
        if (stringExtra == null) {
            key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        }
        objectRef.element = key_gym_local_sport_type;
        wm0Var.E.setOnClickListener(new View.OnClickListener() { // from class: vfd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntervalTrainingActivity.initView$lambda$4$lambda$3(objectRef, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$4$lambda$3(Ref.ObjectRef localSportType, final IntervalTrainingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(localSportType, "$localSportType");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ViewUtil.INSTANCE.isFastClick()) {
            return;
        }
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel((String) localSportType.element);
        if (localDeviceModel != null && localDeviceModel.isDeviceConnected()) {
            GymDeviceModel.INSTANCE.getBattery((String) localSportType.element, new Function1() { // from class: wfd
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return IntervalTrainingActivity.initView$lambda$4$lambda$3$lambda$2(this.f37917a, ((Integer) obj).intValue());
                }
            });
            return;
        }
        Product properProduct = CourseExtKt.getProperProduct((String) localSportType.element);
        if (properProduct == null) {
            ToastUtil.showShortToast(e1j.common_hint_unkonwn_error);
        } else {
            this$0.showConnectDialog(properProduct);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4$lambda$3$lambda$2(final IntervalTrainingActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == 0 || i == 1) {
            GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
            int i2 = e1j.C3;
            String string = this$0.getString(e1j.E3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            gymDeviceModel.showLowRemindDialog(this$0, i2, string, new Function0() { // from class: xfd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            });
        } else if (i != 2) {
            this$0.startJumping();
        } else {
            GymDeviceModel gymDeviceModel2 = GymDeviceModel.INSTANCE;
            int i3 = e1j.C3;
            String string2 = this$0.getString(e1j.D3);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            gymDeviceModel2.showLowRemindDialog(this$0, i3, string2, new Function0() { // from class: yfd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IntervalTrainingActivity.initView$lambda$4$lambda$3$lambda$2$lambda$1(this.f40131a);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$4$lambda$3$lambda$2$lambda$1(IntervalTrainingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startJumping();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setFilterTab() {
        FilterSortView.TabView tabView;
        IntervalTrainingVM intervalTrainingVM = (IntervalTrainingVM) getMViewModel();
        if (intervalTrainingVM.getMPosition() >= intervalTrainingVM.getTabViewMap().size() || (tabView = intervalTrainingVM.getTabViewMap().get(Integer.valueOf(intervalTrainingVM.getMPosition()))) == null) {
            return;
        }
        ((wm0) getMBinding()).C.setFilteredTab(tabView);
    }

    private final void showConnectDialog(final Product product) {
        new CommonDialog.c("connect").setDialogTitle(new DialogParams.DialogDescriptionString(getResources().getString(e1j.d3))).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getResources().getString(e1j.e3))).setPositiveText(e1j.s3).setNegativeText(e1j.common_cancel).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.interval.IntervalTrainingActivity.showConnectDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    DeviceManagerExtKt.launchToScanDevice(IntervalTrainingActivity.this, product, true);
                }
            }
        }).showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startJumping() {
        final Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", 14);
        bundle.putInt("DEVICE_TYPE", 1);
        ArrayList arrayList = new ArrayList();
        if (((wm0) getMBinding()).F.getCurrentItem() == 0) {
            arrayList.addAll(getMDurationIntervalTrainingFragment().getDurationData());
            IntervalTrainingVM.setSportRemind$default((IntervalTrainingVM) getMViewModel(), 1, 0, 0, 6, null);
        } else if (((wm0) getMBinding()).F.getCurrentItem() == 1) {
            arrayList.addAll(getMNumberIntervalTrainingFragment().getNumberData());
            IntervalTrainingVM.setSportRemind$default((IntervalTrainingVM) getMViewModel(), 6, 0, 0, 6, null);
        }
        bundle.putSerializable(SportConstants.INTERVAL_SPORT_TARGET_LIST, arrayList);
        bundle.putInt(SportConstants.TRAINING_MODE, 2);
        LaunchExtensionKt.startActivity(this, (Class<?>) JumpingActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: ufd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return IntervalTrainingActivity.startJumping$lambda$5(bundle, (Intent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startJumping$lambda$5(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.f18292k;
    }

    @NotNull
    public final IntervalTrainingDurationFragment getMDurationIntervalTrainingFragment() {
        IntervalTrainingDurationFragment intervalTrainingDurationFragment = this.mDurationIntervalTrainingFragment;
        if (intervalTrainingDurationFragment != null) {
            return intervalTrainingDurationFragment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDurationIntervalTrainingFragment");
        return null;
    }

    @NotNull
    public final IntervalTrainingNumberFragment getMNumberIntervalTrainingFragment() {
        IntervalTrainingNumberFragment intervalTrainingNumberFragment = this.mNumberIntervalTrainingFragment;
        if (intervalTrainingNumberFragment != null) {
            return intervalTrainingNumberFragment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mNumberIntervalTrainingFragment");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return rv1.f32936a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.view.interval.Hilt_IntervalTrainingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(e1j.n3);
        ((wm0) getMBinding()).E.setText(getResources().getString(e1j.P3));
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
        initView();
    }

    public final void setMDurationIntervalTrainingFragment(@NotNull IntervalTrainingDurationFragment intervalTrainingDurationFragment) {
        Intrinsics.checkNotNullParameter(intervalTrainingDurationFragment, "<set-?>");
        this.mDurationIntervalTrainingFragment = intervalTrainingDurationFragment;
    }

    public final void setMNumberIntervalTrainingFragment(@NotNull IntervalTrainingNumberFragment intervalTrainingNumberFragment) {
        Intrinsics.checkNotNullParameter(intervalTrainingNumberFragment, "<set-?>");
        this.mNumberIntervalTrainingFragment = intervalTrainingNumberFragment;
    }
}
