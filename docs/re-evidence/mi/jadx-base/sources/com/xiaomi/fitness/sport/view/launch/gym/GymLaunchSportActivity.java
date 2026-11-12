package com.xiaomi.fitness.sport.view.launch.gym;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mi.health.course.export.data.CourseModel;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.sport.course.CourseMoreData;
import com.xiaomi.fitness.sport.extension.DeviceModelExtKt;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity;
import com.xiaomi.fitness.sport.view.launch.gym.data.CourseFirstPageData;
import com.xiaomi.fitness.sport.view.launch.gym.state.GymContext;
import com.xiaomi.fitness.sport.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ILockListener;
import com.xiaomi.fitness.sport_manager_export.listener.SportStateSyncCallback;
import com.xiaomi.fitness.sport_manager_export.utils.SportManagerExportPreference;
import defpackage.av6;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.gki;
import defpackage.wc0;
import defpackage.xri;
import defpackage.z7r;
import defpackage.zl0;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = SportRouterKt.GYM_LAUNCH)
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n*\u0001Q\b\u0007\u0018\u0000 d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001dB\u0007¢\u0006\u0004\bc\u0010\fJ\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\fJ'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010\fJ\u000f\u0010%\u001a\u00020\bH\u0014¢\u0006\u0004\b%\u0010\fJ\u000f\u0010&\u001a\u00020\bH\u0007¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010\fJ\u0019\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J)\u0010.\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b0\u0010+J\u0019\u00101\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b1\u0010+J\u001f\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\bH\u0014¢\u0006\u0004\b6\u0010\fR\u001b\u0010;\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010\u0013\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010JR\u0016\u0010K\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010GR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00108\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR(\u0010U\u001a\b\u0012\u0002\b\u0003\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010_¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/view/launch/gym/LaunchSportVM;", "Lzl0;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ILockListener;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Landroid/content/Intent;", "intent", "", "initData", "(Landroid/content/Intent;)V", "initTitle", "()V", "checkInfo", "getGymState", "refreshConnectState", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "", "title", "detail", "showLockDialog", "(Landroidx/fragment/app/FragmentActivity;II)V", "hideLockDialog", "registerLockScreenReceiver", "unregisterLockScreenReceiver", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "initView", "", "hasFocus", "onWindowFocusChanged", "(Z)V", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "setListener", LifecycleConstantKt.ON_DESTROY, "", "did", "onConnectStart", "(Ljava/lang/String;)V", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "isHasLock", "lockCode", "onLock", "(ZI)V", LifecycleConstantKt.ON_STOP, "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/fitness/sport/view/launch/gym/LaunchSportVM;", "viewModel", "Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportAdapter;", "adapter$delegate", "getAdapter", "()Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportAdapter;", "adapter", "productOrder", "I", "Lcom/xiaomi/fitness/sport/view/launch/gym/ControlHolder;", "controlHolder", "Lcom/xiaomi/fitness/sport/view/launch/gym/ControlHolder;", "isFront", "Z", "Landroid/widget/TextView;", "titleConnect", "Landroid/widget/TextView;", "isCheckOfflineData", "Lcom/xiaomi/fitness/sport/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver$delegate", "getLockScreenReceiver", "()Lcom/xiaomi/fitness/sport/view/lockscreen/entity/LockScreenReceiver;", "lockScreenReceiver", "com/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity$gymStateSyncCallback$1", "gymStateSyncCallback", "Lcom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity$gymStateSyncCallback$1;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "lockDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "getLockDialog", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "setLockDialog", "(Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;)V", "", "startMills", "J", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGymLaunchSportActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GymLaunchSportActivity.kt\ncom/xiaomi/fitness/sport/view/launch/gym/GymLaunchSportActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,382:1\n1#2:383\n*E\n"})
public final class GymLaunchSportActivity extends Hilt_GymLaunchSportActivity<LaunchSportVM, zl0> implements ILockListener, OnDeviceStatusListener {

    @NotNull
    public static final String TAG = "GymLaunchSportActivity";

    @Nullable
    private ControlHolder controlHolder;
    private boolean isCheckOfflineData;
    private boolean isFront;

    @Nullable
    private CommonDialog<?> lockDialog;
    private int productOrder;

    @Nullable
    private TextView title;

    @Nullable
    private TextView titleConnect;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dcb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GymLaunchSportActivity.viewModel_delegate$lambda$0(this.f15364a);
        }
    });

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ecb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GymLaunchSportActivity.adapter_delegate$lambda$1(this.f16482a);
        }
    });

    /* JADX INFO: renamed from: lockScreenReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lockScreenReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: fcb
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GymLaunchSportActivity.lockScreenReceiver_delegate$lambda$2();
        }
    });

    @NotNull
    private final GymLaunchSportActivity$gymStateSyncCallback$1 gymStateSyncCallback = new SportStateSyncCallback<z7r>() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity$gymStateSyncCallback$1
        @Override // com.xiaomi.fitness.sport_manager_export.listener.SportStateSyncCallback
        public void onError(int errorCode) {
            FitnessLogUtils.i(GymLaunchSportActivity.TAG, "GYM is not sport , code : " + errorCode);
        }

        @Override // com.xiaomi.fitness.sport_manager_export.listener.SportStateSyncCallback
        public void onResult(z7r result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.a()) {
                FitnessLogUtils.i(GymLaunchSportActivity.TAG, "GYM is sporting ");
                GymDeviceModel.INSTANCE.launchGym(this.this$0, true, false);
            }
        }
    };
    private long startMills = System.currentTimeMillis();

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymLaunchSportAdapter adapter_delegate$lambda$1(GymLaunchSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new GymLaunchSportAdapter(this$0);
    }

    private final void checkInfo() {
        GymContext.INSTANCE.checkLock(this);
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        gymDeviceModel.checkUpdate(this);
        gymDeviceModel.syncGymData();
        if (!SportPreference.INSTANCE.getGYM_REPORT_REMIND() || this.isCheckOfflineData) {
            return;
        }
        GymDeviceModel.checkGymOfflineReport$default(gymDeviceModel, this, false, null, 6, null);
        this.isCheckOfflineData = true;
    }

    private final GymLaunchSportAdapter getAdapter() {
        return (GymLaunchSportAdapter) this.adapter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getGymState() {
        final WeakReference weakReference = new WeakReference(this.gymStateSyncCallback);
        ((zl0) getMBinding()).getRoot().postDelayed(new Runnable() { // from class: ccb
            @Override // java.lang.Runnable
            public final void run() {
                GymLaunchSportActivity.getGymState$lambda$6(weakReference);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getGymState$lambda$6(WeakReference weak) {
        String did;
        Intrinsics.checkNotNullParameter(weak, "$weak");
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = gymDeviceModel.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel != null) {
            WearableDeviceModel wearableDeviceModelCurGymDeviceModel2 = gymDeviceModel.curGymDeviceModel();
            if (wearableDeviceModelCurGymDeviceModel2 == null || (did = wearableDeviceModelCurGymDeviceModel2.getDid()) == null) {
                did = "";
            }
            DeviceModelExtKt.syncDeviceSportStatus(wearableDeviceModelCurGymDeviceModel, did, (SportStateSyncCallback) weak.get());
        }
    }

    private final LockScreenReceiver getLockScreenReceiver() {
        return (LockScreenReceiver) this.lockScreenReceiver.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LaunchSportVM getViewModel() {
        return (LaunchSportVM) this.viewModel.getValue();
    }

    private final void hideLockDialog() {
        CommonDialog<?> commonDialog = this.lockDialog;
        if (commonDialog != null) {
            commonDialog.dismissAllowingStateLoss();
        }
    }

    private final void initData(Intent intent) {
        if (intent != null) {
            intent.getExtras();
        }
    }

    @SuppressLint({"ResourceAsColor"})
    private final void initTitle() {
        wc0 miuiActionBar;
        View viewInflate = LayoutInflater.from(this).inflate(dvi.C1, (ViewGroup) null);
        if (UIUtils.isNightMode(this) && (miuiActionBar = getMiuiActionBar()) != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, gki.f19084a)));
        }
        Intrinsics.checkNotNull(viewInflate);
        setCustomView(viewInflate, new ActionBar.LayoutParams(-1, -1));
        ((ImageView) viewInflate.findViewById(xri.v)).setOnClickListener(new View.OnClickListener() { // from class: bcb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GymLaunchSportActivity.initTitle$lambda$5(this.f4053a, view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(xri.r3);
        this.title = textView;
        if (textView != null) {
            textView.setText(getResources().getString(c1j.L1));
        }
        TextView textView2 = (TextView) viewInflate.findViewById(xri.X6);
        this.titleConnect = textView2;
        if (textView2 != null) {
            textView2.setText(getResources().getString(c1j.f1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitle$lambda$5(GymLaunchSportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LockScreenReceiver lockScreenReceiver_delegate$lambda$2() {
        return new LockScreenReceiver(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$3(GymLaunchSportActivity this$0, CourseFirstPageData courseFirstPageData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GymLaunchSportAdapter adapter = this$0.getAdapter();
        Intrinsics.checkNotNull(courseFirstPageData);
        adapter.setFirstPage(courseFirstPageData);
        MoreRecyclerView.setStatus$default(((zl0) this$0.getMBinding()).A, courseFirstPageData.getStatus(), false, 2, null);
        ((zl0) this$0.getMBinding()).A.showFooterDesc(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(GymLaunchSportActivity this$0, CourseMoreData courseMoreData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<CourseModel.CourseData> list = courseMoreData.getList();
        if (list != null && !list.isEmpty()) {
            this$0.getAdapter().addVideoData(courseMoreData.getList());
        }
        MoreRecyclerView.setStatus$default(((zl0) this$0.getMBinding()).A, courseMoreData.getStatus(), false, 2, null);
        return Unit.INSTANCE;
    }

    private final void refreshConnectState() {
        WearableDeviceInfo deviceInfo;
        WearableDeviceInfo deviceInfo2;
        WearableDeviceInfo deviceInfo3;
        GymDeviceModel gymDeviceModel = GymDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = gymDeviceModel.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || !wearableDeviceModelCurGymDeviceModel.getIsDeviceConnected()) {
            TextView textView = this.title;
            if (textView != null) {
                textView.setText(getResources().getString(c1j.L1));
            }
            TextView textView2 = this.titleConnect;
            if (textView2 != null) {
                textView2.setText(getResources().getString(c1j.f1));
            }
        } else {
            WearableDeviceModel wearableDeviceModelCurGymDeviceModel2 = gymDeviceModel.curGymDeviceModel();
            String string = null;
            FitnessLogUtils.i(TAG, "跑步机 name : " + ((wearableDeviceModelCurGymDeviceModel2 == null || (deviceInfo3 = wearableDeviceModelCurGymDeviceModel2.getDeviceInfo()) == null) ? null : deviceInfo3.getName()));
            SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).setLocalReceiveListener(this);
            checkInfo();
            TextView textView3 = this.title;
            if (textView3 != null) {
                WearableDeviceModel wearableDeviceModelCurGymDeviceModel3 = gymDeviceModel.curGymDeviceModel();
                String name = (wearableDeviceModelCurGymDeviceModel3 == null || (deviceInfo2 = wearableDeviceModelCurGymDeviceModel3.getDeviceInfo()) == null) ? null : deviceInfo2.getName();
                if (name == null || name.length() == 0) {
                    string = getResources().getString(c1j.L1);
                } else {
                    WearableDeviceModel wearableDeviceModelCurGymDeviceModel4 = gymDeviceModel.curGymDeviceModel();
                    if (wearableDeviceModelCurGymDeviceModel4 != null && (deviceInfo = wearableDeviceModelCurGymDeviceModel4.getDeviceInfo()) != null) {
                        string = deviceInfo.getName();
                    }
                }
                textView3.setText(string);
            }
            TextView textView4 = this.titleConnect;
            if (textView4 != null) {
                textView4.setText(getResources().getString(c1j.N0));
            }
        }
        ControlHolder controlHolder = this.controlHolder;
        if (controlHolder != null) {
            controlHolder.refreshConnectState();
        }
    }

    private final void registerLockScreenReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        registerReceiver(getLockScreenReceiver(), intentFilter);
        Logger.d(TAG, "lockScreenReceiver successfully registered!!!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$7(GymLaunchSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        GymDeviceModel.INSTANCE.preLaunchGym(this$0, true, true);
        return Unit.INSTANCE;
    }

    private final void showLockDialog(FragmentActivity activity, int title, int detail) {
        CommonDialog<?> commonDialog = this.lockDialog;
        if (commonDialog == null || !commonDialog.isShowing()) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("sport").setDialogTitle(title).setDialogDescription(detail).setPositiveText(c1j.B0).create();
            this.lockDialog = commonDialogCreate;
            if (commonDialogCreate != null) {
                commonDialogCreate.setCancelable(false);
            }
            CommonDialog<?> commonDialog2 = this.lockDialog;
            if (commonDialog2 != null) {
                commonDialog2.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity.showLockDialog.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        if (which != -1 || dialog == null) {
                            return;
                        }
                        dialog.dismiss();
                    }
                });
            }
            CommonDialog<?> commonDialog3 = this.lockDialog;
            if (commonDialog3 != null) {
                commonDialog3.showIfNeed(activity.getSupportFragmentManager());
            }
        }
    }

    private final void unregisterLockScreenReceiver() {
        LockScreenReceiver.INSTANCE.unregisterPhoneListener();
        unregisterReceiver(getLockScreenReceiver());
        Logger.d(TAG, "lockScreenReceiver successfully unregistered!!!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LaunchSportVM viewModel_delegate$lambda$0(GymLaunchSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (LaunchSportVM) new ViewModelProvider(this$0).get(LaunchSportVM.class);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.d;
    }

    @Nullable
    public final CommonDialog<?> getLockDialog() {
        return this.lockDialog;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initView() {
        initTitle();
        ((zl0) getMBinding()).A.showFooterDesc(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) this, 6, 1, false);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity.initView.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                int screenState = UIUtils.INSTANCE.getScreenState();
                return ((screenState == 0 || screenState == 1) && position > 3) ? 2 : 6;
            }
        });
        ((zl0) getMBinding()).A.setLayoutManager(gridLayoutManager);
        ((zl0) getMBinding()).A.setAdapter(getAdapter());
        ((zl0) getMBinding()).A.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.sport.view.launch.gym.GymLaunchSportActivity.initView.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                GymLaunchSportActivity.this.getViewModel().reqData();
            }
        });
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
        FitnessLogUtils.i(TAG, "did : " + did + " , onConnectFailure");
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        if (did == null) {
            did = "";
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
        if (wearableDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLocalDevice(wearableDeviceModel)) {
            return;
        }
        TextView textView = this.title;
        if (textView != null) {
            textView.setText(getResources().getString(c1j.L1));
        }
        TextView textView2 = this.titleConnect;
        if (textView2 != null) {
            textView2.setText(getResources().getString(c1j.f1));
        }
        ControlHolder controlHolder = this.controlHolder;
        if (controlHolder != null) {
            controlHolder.disconnect();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        FitnessLogUtils.i(TAG, "did : " + did + " ,onConnectSuccess");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did == null ? "" : did);
        FitnessLogUtils.i(TAG, "did : " + did + " ,device: " + wearableDeviceModel);
        if (wearableDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLocalDevice(wearableDeviceModel)) {
            return;
        }
        SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
        String model = wearableDeviceModel != null ? com.xiaomi.fitness.device.manager.DeviceModelExtKt.getModel(wearableDeviceModel) : null;
        Intrinsics.checkNotNull(model);
        sportManagerExportPreference.setKEY_GYM_LOCAL_SPORT_TYPE(model);
        TextView textView = this.title;
        if (textView != null) {
            String name = wearableDeviceModel.getDeviceInfo().getName();
            if (name.length() == 0) {
                name = getResources().getString(c1j.L1);
                Intrinsics.checkNotNullExpressionValue(name, "getString(...)");
            }
            textView.setText(name);
        }
        TextView textView2 = this.titleConnect;
        if (textView2 != null) {
            textView2.setText(getResources().getString(c1j.N0));
        }
        ControlHolder controlHolder = this.controlHolder;
        if (controlHolder != null) {
            controlHolder.connect();
        }
    }

    @Override // com.xiaomi.fitness.sport.view.launch.gym.Hilt_GymLaunchSportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarNormalTitleMode();
        initView();
        setListener();
        registerLockScreenReceiver();
        initData(getIntent());
        getViewModel().getFirstEmitter().observe(this, new GymLaunchSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gcb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymLaunchSportActivity.onCreate$lambda$3(this.f18829a, (CourseFirstPageData) obj);
            }
        }));
        getViewModel().getMoreEmitter().observe(this, new GymLaunchSportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hcb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GymLaunchSportActivity.onCreate$lambda$4(this.f19929a, (CourseMoreData) obj);
            }
        }));
        getViewModel().reqData();
        getGymState();
    }

    @Override // com.xiaomi.fitness.sport.view.launch.gym.Hilt_GymLaunchSportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this);
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).setLocalReceiveListener(null);
        unregisterLockScreenReceiver();
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        FitnessLogUtils.i(TAG, "did : " + did + " ,onDisconnect");
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        if (did == null) {
            did = "";
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
        if (wearableDeviceModel == null || !com.xiaomi.fitness.device.manager.DeviceModelExtKt.isLocalDevice(wearableDeviceModel)) {
            return;
        }
        TextView textView = this.title;
        if (textView != null) {
            textView.setText(getResources().getString(c1j.L1));
        }
        TextView textView2 = this.titleConnect;
        if (textView2 != null) {
            textView2.setText(getResources().getString(c1j.f1));
        }
        ControlHolder controlHolder = this.controlHolder;
        if (controlHolder != null) {
            controlHolder.disconnect();
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ILockListener
    public void onLock(boolean isHasLock, int lockCode) {
        if (!isHasLock) {
            hideLockDialog();
        } else if (lockCode == 0) {
            showLockDialog(this, c1j.w4, c1j.v4);
        } else {
            if (lockCode != 1) {
                return;
            }
            showLockDialog(this, c1j.A1, c1j.z1);
        }
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        initData(intent);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.isFront = false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.startMills = System.currentTimeMillis();
        this.isFront = true;
        refreshConnectState();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startMills) / ((long) 1000);
        Logger.d("CourseGym", "onStop: mijia_treadmill_home_page, " + jCurrentTimeMillis);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("c_pa_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("name", "mijia_treadmill_home_page"), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis)), TuplesKt.to("tip", "56.2.2.1.19564")));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (this.controlHolder == null) {
            ControlHolder controlHolder = getAdapter().getControlHolder();
            this.controlHolder = controlHolder;
            if (controlHolder != null) {
                controlHolder.setProductOrder(this.productOrder);
            }
            refreshConnectState();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void setListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).setLocalReceiveListener(this);
        getViewModel().addGymSportStartListener(new Function0() { // from class: acb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GymLaunchSportActivity.setListener$lambda$7(this.f875a);
            }
        });
    }

    public final void setLockDialog(@Nullable CommonDialog<?> commonDialog) {
        this.lockDialog = commonDialog;
    }
}
