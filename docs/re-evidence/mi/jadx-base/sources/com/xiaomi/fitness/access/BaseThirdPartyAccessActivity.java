package com.xiaomi.fitness.access;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import com.mi.health.search.SearchContract;
import com.xiaomi.fitness.access.BaseThirdPartyAccessActivity;
import com.xiaomi.fitness.access.util.ThirdPartyAccessExtKt;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.onetrack.c.q;
import defpackage.aui;
import defpackage.av6;
import defpackage.eni;
import defpackage.g50;
import defpackage.mzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.androidbasewidget.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\b'\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B\u0007¢\u0006\u0004\b/\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0006J5\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010'\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001c\u0010.\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010#\"\u0004\b-\u0010\u0019¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/access/BaseThirdPartyAccessActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/access/AccessViewModel;", "Lg50;", "", "authorizeIfNeed", "()V", "showRemovalConfirmationDialogAndUnbindIfNeed", "", "isInBindStatusBound", "()Z", "isInBindStatusNotBound", "onAuthorize", "onBind", "onUnbind", "getBindStatus", "showUpperBtn", "", "upperBtnTextResId", "Lkotlin/Function0;", "callback", "setUpperBtnClickCallbackIfNeed", "(ZILkotlin/jvm/functions/Function0;)V", "bindStatus", "onObserveBindStatusCallback", "(I)V", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "handleAllTextDisplay", "layoutId", "I", "getLayoutId", "()I", SearchContract.COLUMN_ICON_RESID, "getIconResId", "getViewModelId", "viewModelId", "", "getThirdPartyNameStr", "()Ljava/lang/String;", "thirdPartyNameStr", "getAppId", "setAppId", q.f13858b, "<init>", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class BaseThirdPartyAccessActivity extends Hilt_BaseThirdPartyAccessActivity<AccessViewModel, g50> {
    public static final int GOOGLE_FIT_ID = 1;
    public static final int STRAVA_APP_ID = 0;
    public static final int SUUNTO_ID = 2;

    @NotNull
    public static final String TAG = "BaseThirdPartyAccessActivity";
    private final int layoutId = aui.f3460k;
    private final int iconResId = eni.u;

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.BaseThirdPartyAccessActivity$showRemovalConfirmationDialogAndUnbindIfNeed$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/access/BaseThirdPartyAccessActivity$showRemovalConfirmationDialogAndUnbindIfNeed$1", "Lav6;", "", "dialogName", "Landroid/content/DialogInterface;", "dialog", "", "which", "", "onDialogClick", "(Ljava/lang/String;Landroid/content/DialogInterface;I)V", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends av6 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onDialogClick$lambda$0(BaseThirdPartyAccessActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.onUnbind();
            return Unit.INSTANCE;
        }

        @Override // defpackage.av6
        public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
            super.onDialogClick(dialogName, dialog, which);
            if (which == -1) {
                final BaseThirdPartyAccessActivity baseThirdPartyAccessActivity = BaseThirdPartyAccessActivity.this;
                NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: ve2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseThirdPartyAccessActivity.AnonymousClass1.onDialogClick$lambda$0(baseThirdPartyAccessActivity);
                    }
                });
            }
        }
    }

    private final void authorizeIfNeed() {
        onAuthorize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BaseThirdPartyAccessActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(num);
        this$0.handleAllTextDisplay(num.intValue());
        this$0.onObserveBindStatusCallback(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(final BaseThirdPartyAccessActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: ue2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseThirdPartyAccessActivity.onCreate$lambda$3$lambda$2(this.f35677a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$3$lambda$2(BaseThirdPartyAccessActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isInBindStatusBound()) {
            this$0.showRemovalConfirmationDialogAndUnbindIfNeed();
        } else if (this$0.isInBindStatusNotBound()) {
            this$0.authorizeIfNeed();
        } else {
            Logger.i(TAG, "bindStatus=" + ((AccessViewModel) this$0.getMViewModel()).getBindStatusLiveData().getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(BaseThirdPartyAccessActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressBar loadingRotateProgressBar = ((g50) this$0.getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(loadingRotateProgressBar, "loadingRotateProgressBar");
        Intrinsics.checkNotNull(bool);
        ViewExtKt.setVisible(loadingRotateProgressBar, bool.booleanValue());
        if (bool.booleanValue()) {
            ((g50) this$0.getMBinding()).A.setText("");
        } else {
            ((g50) this$0.getMBinding()).A.setText(ThirdPartyAccessExtKt.getAccessPageBtnText(this$0.isInBindStatusNotBound()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(BaseThirdPartyAccessActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null && str.length() != 0) {
            this$0.onBind();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setUpperBtnClickCallbackIfNeed$default(BaseThirdPartyAccessActivity baseThirdPartyAccessActivity, boolean z, int i, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUpperBtnClickCallbackIfNeed");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = mzi.y0;
        }
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        baseThirdPartyAccessActivity.setUpperBtnClickCallbackIfNeed(z, i, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpperBtnClickCallbackIfNeed$lambda$0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final void showRemovalConfirmationDialogAndUnbindIfNeed() {
        CommonDialog commonDialogCreate = new CommonDialog.c("removal_confirmation").setDialogTitle(mzi.R).setDialogDescriptionString(new DialogParams.DialogDescriptionString(ThirdPartyAccessExtKt.getRemovalConfirmationText(getAppId()))).setNegativeText(mzi.f27380b).setPositiveText(mzi.c).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new AnonymousClass1()), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    public abstract int getAppId();

    public abstract void getBindStatus();

    public int getIconResId() {
        return this.iconResId;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @NotNull
    public abstract String getThirdPartyNameStr();

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return aui.f3460k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void handleAllTextDisplay(int bindStatus) {
        boolean zIsInBindStatusNotBound = isInBindStatusNotBound();
        setTitle(ThirdPartyAccessExtKt.getAccessPageTitle(zIsInBindStatusNotBound, getAppId()));
        ((g50) getMBinding()).E.setText(ThirdPartyAccessExtKt.getAccessPageDesText(zIsInBindStatusNotBound, getAppId()));
    }

    public abstract boolean isInBindStatusBound();

    public abstract boolean isInBindStatusNotBound();

    public abstract void onAuthorize();

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        Logger.i(TAG, "onBackPressed isTaskRoot=" + isTaskRoot());
        if (isTaskRoot()) {
            ThirdPartyAccessExtKt.goToMineTab(this);
        }
    }

    public abstract void onBind();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.Hilt_BaseThirdPartyAccessActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getThirdPartyNameStr());
        ((g50) getMBinding()).G.setBackground(ResourceExtKt.getResourceDrawable(this, getIconResId()));
        ((AccessViewModel) getMViewModel()).getBindStatusLiveData().observe(this, new BaseThirdPartyAccessActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pe2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseThirdPartyAccessActivity.onCreate$lambda$1(this.f30309a, (Integer) obj);
            }
        }));
        setUpperBtnClickCallbackIfNeed$default(this, false, 0, null, 7, null);
        ThirdPartyAccessExtKt.listenOnClickWithPressedEffect(((g50) getMBinding()).A, new Function0() { // from class: qe2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseThirdPartyAccessActivity.onCreate$lambda$3(this.f31428a);
            }
        });
        ((AccessViewModel) getMViewModel()).isLoadingLiveData().observe(this, new BaseThirdPartyAccessActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: re2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseThirdPartyAccessActivity.onCreate$lambda$4(this.f32459a, (Boolean) obj);
            }
        }));
        ((AccessViewModel) getMViewModel()).getAuthCodeLiveData().observe(this, new BaseThirdPartyAccessActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: se2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseThirdPartyAccessActivity.onCreate$lambda$5(this.f33555a, (String) obj);
            }
        }));
    }

    public void onObserveBindStatusCallback(int bindStatus) {
    }

    public abstract void onUnbind();

    public abstract void setAppId(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public void setUpperBtnClickCallbackIfNeed(boolean showUpperBtn, int upperBtnTextResId, @Nullable final Function0<Unit> callback) {
        TextView upperBtn = ((g50) getMBinding()).N;
        Intrinsics.checkNotNullExpressionValue(upperBtn, "upperBtn");
        ViewExtKt.setVisible(upperBtn, showUpperBtn);
        if (showUpperBtn) {
            ((g50) getMBinding()).N.setText(upperBtnTextResId);
            ThirdPartyAccessExtKt.listenOnClickWithPressedEffect(((g50) getMBinding()).N, new Function0() { // from class: te2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseThirdPartyAccessActivity.setUpperBtnClickCallbackIfNeed$lambda$0(callback);
                }
            });
        }
    }
}
