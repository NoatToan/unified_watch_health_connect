package com.xiaomi.fitness.sport.view.launch.gym.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.LifecycleOwnerKt;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.utils.Constants;
import com.xiaomi.fitness.sport.utils.MijiaHelper;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.view.launch.gym.setting.SmartSceneWebViewActivity;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.a6l;
import defpackage.av6;
import defpackage.bg4;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.xri;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/SmartSceneWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "doSmartScene", "Landroid/widget/Button;", "mac", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "isInstallMijia", "", "initView", "", LifecycleConstantKt.ON_RESUME, "initGoButton", "showGoMijiaDialog", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmartSceneWebViewActivity extends WebViewActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String MAC_ADDRESS = "mac_address";

    @NotNull
    private static final String TAG = "SmartSceneWebViewActivity";

    @Nullable
    private WearableDeviceModel deviceModel;

    @Nullable
    private Button doSmartScene;
    private boolean isInstallMijia;

    @Nullable
    private String mac;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/SmartSceneWebViewActivity$Companion;", "", "<init>", "()V", "TAG", "", "MAC_ADDRESS", StatConstants.PARAM_START, "", "title", "showTitleBar", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            companion.start(str, z);
        }

        public final void start(@Nullable String title, boolean showTitleBar) {
            String smartSceneUrl = Constants.INSTANCE.getSmartSceneUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null));
            Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) SmartSceneWebViewActivity.class);
            intent.putExtra(WebViewActivity.TITLE, title);
            intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, showTitleBar);
            intent.putExtra("URL", smartSceneUrl);
            intent.setFlags(268435456);
            ApplicationExtKt.getApplication().startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.view.launch.gym.setting.SmartSceneWebViewActivity$initGoButton$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.view.launch.gym.setting.SmartSceneWebViewActivity$initGoButton$1", f = "SmartSceneWebViewActivity.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SmartSceneWebViewActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    SmartSceneWebViewActivity$initGoButton$1$installMijia$1 smartSceneWebViewActivity$initGoButton$1$installMijia$1 = new SmartSceneWebViewActivity$initGoButton$1$installMijia$1(null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, smartSceneWebViewActivity$initGoButton$1$installMijia$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SmartSceneWebViewActivity.this.hideLoading();
                Logger.i(SmartSceneWebViewActivity.TAG, "installMijia: " + zBooleanValue);
                SmartSceneWebViewActivity.this.isInstallMijia = zBooleanValue;
                Button button = SmartSceneWebViewActivity.this.doSmartScene;
                if (button != null) {
                    button.setText(zBooleanValue ? c1j.E1 : c1j.F1);
                }
            } catch (Exception unused) {
                SmartSceneWebViewActivity.this.hideLoading();
                Logger.i(SmartSceneWebViewActivity.TAG, "judge installMijia failed");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void initGoButton() {
        PageState.DefaultImpls.showLoading$default(this, c1j.F0, false, 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SmartSceneWebViewActivity this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showGoMijiaDialog();
    }

    private final void showGoMijiaDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c(Constant.DeviceCategory.MIJIA).setPositiveText(c1j.h).setNegativeText(c1j.f).setDialogTitle(this.isInstallMijia ? c1j.A4 : c1j.d0).setDialogDescription(this.isInstallMijia ? c1j.z4 : c1j.G1).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.SmartSceneWebViewActivity.showGoMijiaDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (which == -1) {
                    MijiaHelper.INSTANCE.goMijia(SmartSceneWebViewActivity.this.deviceModel);
                }
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initView() {
        super.initView();
        this.deviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        View viewInflate = LayoutInflater.from(this).inflate(dvi.B0, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        showBottomView(viewInflate);
        Button button = (Button) viewInflate.findViewById(xri.K);
        this.doSmartScene = button;
        a6l.a(button, new bg4() { // from class: w2n
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SmartSceneWebViewActivity.initView$lambda$0(this.f37486a, obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initGoButton();
    }
}
