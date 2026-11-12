package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco.utils.Constants;
import com.xiaomi.fitness.sport_eco.utils.MijiaHelper;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.SmartSceneWebViewActivity;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.a6l;
import defpackage.av6;
import defpackage.bg4;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.j5h;
import defpackage.na4;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.zri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/SmartSceneWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "doSmartScene", "Landroid/widget/Button;", "mac", "", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "isInstallMijia", "", "initView", "", "initGoButton", "showGoMijiaDialog", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmartSceneWebViewActivity extends WebViewActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String MAC_ADDRESS = "mac_address";

    @NotNull
    private static final String TAG = "SmartSceneWebViewActivity";

    @Nullable
    private EcoDeviceModel deviceModel;

    @Nullable
    private Button doSmartScene;
    private boolean isInstallMijia;

    @Nullable
    private String mac;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/SmartSceneWebViewActivity$Companion;", "", "<init>", "()V", "TAG", "", "MAC_ADDRESS", StatConstants.PARAM_START, "", "title", "showTitleBar", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    private final void initGoButton() {
        PageState.DefaultImpls.showLoading$default(this, e1j.W, false, 2, null);
        j5h j5hVar = new j5h() { // from class: v2n
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                SmartSceneWebViewActivity.initGoButton$lambda$1(v4hVar);
            }
        };
        Intrinsics.checkNotNull(j5hVar, "null cannot be cast to non-null type io.reactivex.ObservableOnSubscribe<kotlin.Boolean>");
        o4h o4hVarH = o4h.f(j5hVar).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: x2n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SmartSceneWebViewActivity.initGoButton$lambda$2(this.f38619a, ((Boolean) obj).booleanValue());
            }
        };
        bg4 bg4Var = new bg4() { // from class: y2n
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SmartSceneWebViewActivity.initGoButton$lambda$3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: z2n
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SmartSceneWebViewActivity.initGoButton$lambda$4(this.f40815a, (Throwable) obj);
            }
        };
        new na4().a(o4hVarH.O(bg4Var, new bg4() { // from class: a3n
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SmartSceneWebViewActivity.initGoButton$lambda$5(function2, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGoButton$lambda$1(v4h emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        emitter.onNext(Boolean.valueOf(MijiaHelper.INSTANCE.isInstallMijia()));
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initGoButton$lambda$2(SmartSceneWebViewActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isInstallMijia = z;
        this$0.hideLoading();
        Logger.i(TAG, "installMijia: " + z);
        Button button = this$0.doSmartScene;
        if (button != null) {
            button.setText(z ? e1j.Q1 : e1j.R1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGoButton$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initGoButton$lambda$4(SmartSceneWebViewActivity this$0, Throwable th) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Logger.i(TAG, "judge installMijia failed");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGoButton$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SmartSceneWebViewActivity this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showGoMijiaDialog();
    }

    private final void showGoMijiaDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c(Constant.DeviceCategory.MIJIA).setPositiveText(e1j.d).setNegativeText(e1j.c).setDialogTitle(this.isInstallMijia ? e1j.f4 : e1j.F).setDialogDescription(this.isInstallMijia ? e1j.e4 : e1j.S1).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.SmartSceneWebViewActivity.showGoMijiaDialog.1
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
        this.deviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        View viewInflate = LayoutInflater.from(this).inflate(fvi.E, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        showBottomView(viewInflate);
        this.doSmartScene = (Button) viewInflate.findViewById(zri.q);
        initGoButton();
        a6l.a(this.doSmartScene, new bg4() { // from class: b3n
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                SmartSceneWebViewActivity.initView$lambda$0(this.f3752a, obj);
            }
        });
    }
}
