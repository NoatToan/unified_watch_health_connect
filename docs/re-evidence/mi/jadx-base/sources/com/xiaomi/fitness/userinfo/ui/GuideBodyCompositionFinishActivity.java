package com.xiaomi.fitness.userinfo.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.userinfo.ui.GuideBodyCompositionFinishActivity;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.cjq;
import defpackage.nvi;
import defpackage.o1j;
import defpackage.sv1;
import defpackage.wc0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u000b*\u0001\u000f\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0006R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/userinfo/ui/GuideBodyCompositionFinishActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/userinfo/ui/UserGuideViewModel;", "Lcjq;", "", "updateToDevice", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "", "mIndex", "I", "com/xiaomi/fitness/userinfo/ui/GuideBodyCompositionFinishActivity$mGuideFinishBroadcastReceiver$1", "mGuideFinishBroadcastReceiver", "Lcom/xiaomi/fitness/userinfo/ui/GuideBodyCompositionFinishActivity$mGuideFinishBroadcastReceiver$1;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideBodyCompositionFinishActivity extends Hilt_GuideBodyCompositionFinishActivity<UserGuideViewModel, cjq> {

    @NotNull
    public static final String TAG = "GuideBodyCompositionFinish";

    @NotNull
    private final GuideBodyCompositionFinishActivity$mGuideFinishBroadcastReceiver$1 mGuideFinishBroadcastReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.userinfo.ui.GuideBodyCompositionFinishActivity$mGuideFinishBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.this$0.finish();
        }
    };
    private int mIndex;

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.ui.GuideBodyCompositionFinishActivity$updateToDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.ui.GuideBodyCompositionFinishActivity$updateToDevice$1", f = "GuideBodyCompositionFinishActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || !wearableDeviceModel.isDeviceConnected()) {
                Logger.i(GuideBodyCompositionFinishActivity.TAG, "device not connect");
                return Unit.INSTANCE;
            }
            UserProfile userProfile = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
            Logger.i(GuideBodyCompositionFinishActivity.TAG, "userProfile " + userProfile);
            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
                UserInfoConfigUtil.syncHuamiUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, userProfile, wearableDeviceModel, null, 4, null);
            } else {
                UserInfoConfigUtil.INSTANCE.syncUserInfoToSportDevice(userProfile, wearableDeviceModel, null, Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(GuideBodyCompositionFinishActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((UserGuideViewModel) this$0.getMViewModel()).onNext(new WeakReference<>(this$0), this$0.mIndex);
    }

    private final void updateToDevice() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return nvi.h;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return sv1.f34012a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideBodyCompositionFinishActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        wc0 miuiActionBar;
        super.onCreate(savedInstanceState);
        setTitle(o1j.W);
        int intExtra = getIntent().getIntExtra(GuidePageUtil.KEY_PAGE_INDEX, 0);
        this.mIndex = intExtra;
        if (intExtra == 0 && (miuiActionBar = getMiuiActionBar()) != null) {
            miuiActionBar.setDisplayHomeAsUpEnabled(false);
        }
        updateToDevice();
        ((cjq) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: o4b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideBodyCompositionFinishActivity.onCreate$lambda$0(this.f28726a, view);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(this.mGuideFinishBroadcastReceiver, new IntentFilter(UserInfoConfigUtil.ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY), 2);
        } else {
            registerReceiver(this.mGuideFinishBroadcastReceiver, new IntentFilter(UserInfoConfigUtil.ACTION_USER_INFO_GUIDE_FINISH_ACTIVITY));
        }
    }

    @Override // com.xiaomi.fitness.userinfo.ui.Hilt_GuideBodyCompositionFinishActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unregisterReceiver(this.mGuideFinishBroadcastReceiver);
        super.onDestroy();
    }
}
