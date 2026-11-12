package com.xiaomi.fitness.access;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.request.ImageRequest;
import com.mi.health.search.SearchContract;
import com.xiaomi.fitness.access.SuuntoAccessActivity;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.access.util.ThirdPartyAccessExtKt;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.onetrack.c.q;
import defpackage.eni;
import defpackage.g50;
import defpackage.mzi;
import defpackage.ni4;
import defpackage.yii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u0016H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/access/SuuntoAccessActivity;", "Lcom/xiaomi/fitness/access/BaseThirdPartyAccessActivity;", "<init>", "()V", "viewModelId", "", "getViewModelId", "()I", "thirdPartyNameStr", "", "getThirdPartyNameStr", "()Ljava/lang/String;", SearchContract.COLUMN_ICON_RESID, "getIconResId", "isInBindStatusBound", "", "isInBindStatusNotBound", q.f13858b, "getAppId", "setAppId", "(I)V", "onAuthorize", "", "onBind", "onUnbind", "getBindStatus", "onObserveBindStatusCallback", "bindStatus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "goToAuthorizeSuuntoInEmbeddedBrowser", "showSuuntoPartnerH5Page", "processEntryIntoPage", "showSuuntoSpecificLayout", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSuuntoAccessActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuuntoAccessActivity.kt\ncom/xiaomi/fitness/access/SuuntoAccessActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,139:1\n54#2,3:140\n24#2:143\n57#2,6:144\n63#2,2:151\n54#2,3:153\n24#2:156\n57#2,6:157\n63#2,2:164\n54#2,3:166\n24#2:169\n57#2,6:170\n63#2,2:177\n54#2,3:179\n24#2:182\n57#2,6:183\n63#2,2:190\n54#2,3:192\n24#2:195\n57#2,6:196\n63#2,2:203\n57#3:150\n57#3:163\n57#3:176\n57#3:189\n57#3:202\n*S KotlinDebug\n*F\n+ 1 SuuntoAccessActivity.kt\ncom/xiaomi/fitness/access/SuuntoAccessActivity\n*L\n132#1:140,3\n132#1:143\n132#1:144,6\n132#1:151,2\n133#1:153,3\n133#1:156\n133#1:157,6\n133#1:164,2\n134#1:166,3\n134#1:169\n134#1:170,6\n134#1:177,2\n135#1:179,3\n135#1:182\n135#1:183,6\n135#1:190,2\n136#1:192,3\n136#1:195\n136#1:196,6\n136#1:203,2\n132#1:150\n133#1:163\n134#1:176\n135#1:189\n136#1:202\n*E\n"})
public final class SuuntoAccessActivity extends Hilt_SuuntoAccessActivity {

    @NotNull
    public static final String TAG = "SuuntoAccessActivity";
    private final int iconResId = eni.q;
    private int appId = 2;

    private final void goToAuthorizeSuuntoInEmbeddedBrowser() {
        startActivity(new Intent("android.intent.action.VIEW", ThirdPartyAccessExtKt.buildIntentUriToSuuntoAuthPage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onObserveBindStatusCallback$lambda$1(final SuuntoAccessActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NetworkFallbackExtKt.checkNetworkAndProcessIfAvailable(new Function0() { // from class: xqo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SuuntoAccessActivity.onObserveBindStatusCallback$lambda$1$lambda$0(this.f39372a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onObserveBindStatusCallback$lambda$1$lambda$0(SuuntoAccessActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSuuntoPartnerH5Page();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void processEntryIntoPage(Intent intent) {
        String stringExtra = intent.getStringExtra("code");
        Logger.i(TAG, "processEntryIntoPage authCode=" + stringExtra);
        if (stringExtra == null || StringsKt__StringsKt.isBlank(stringExtra)) {
            ConstraintLayout noNetworkFallbackPage = ((g50) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(noNetworkFallbackPage, "noNetworkFallbackPage");
            ConstraintLayout networkContent = ((g50) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(networkContent, "networkContent");
            NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed$default(noNetworkFallbackPage, networkContent, null, new Function0() { // from class: wqo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SuuntoAccessActivity.processEntryIntoPage$lambda$2(this.f38263a);
                }
            }, 4, null);
        } else {
            ((AccessViewModel) getMViewModel()).getAuthCodeLiveData().setValue(stringExtra);
        }
        Logger.i(TAG, "processOperation authCode=" + stringExtra + " authCode.isNullOrBlank()=" + (stringExtra == null || StringsKt__StringsKt.isBlank(stringExtra)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit processEntryIntoPage$lambda$2(SuuntoAccessActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((AccessViewModel) this$0.getMViewModel()).inquirySuuntoBindStatus();
        this$0.showSuuntoSpecificLayout();
        return Unit.INSTANCE;
    }

    private final void showSuuntoPartnerH5Page() {
        WebViewUtilKt.startWebView$default(ThirdPartAccessConstants.SUUNTO_PARTNERS_H5_URL, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSuuntoSpecificLayout() {
        ImageView icon = ((g50) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        ViewExtKt.gone(icon);
        DividerView divider = ((g50) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        ViewExtKt.gone(divider);
        View root = ((g50) getMBinding()).L.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtKt.visible(root);
        ImageView icSuunto = ((g50) getMBinding()).L.J;
        Intrinsics.checkNotNullExpressionValue(icSuunto, "icSuunto");
        Coil.imageLoader(icSuunto.getContext()).enqueue(new ImageRequest.Builder(icSuunto.getContext()).data(ThirdPartAccessConstants.URL_SUUNTO_ICON).target(icSuunto).build());
        ImageView bg1 = ((g50) getMBinding()).L.A;
        Intrinsics.checkNotNullExpressionValue(bg1, "bg1");
        Coil.imageLoader(bg1.getContext()).enqueue(new ImageRequest.Builder(bg1.getContext()).data(ThirdPartAccessConstants.URL_SUUNTO_PROMOTION_PAGE_BG_1).target(bg1).build());
        ImageView bg2 = ((g50) getMBinding()).L.B;
        Intrinsics.checkNotNullExpressionValue(bg2, "bg2");
        Coil.imageLoader(bg2.getContext()).enqueue(new ImageRequest.Builder(bg2.getContext()).data(ThirdPartAccessConstants.URL_SUUNTO_PROMOTION_PAGE_BG_2).target(bg2).build());
        ImageView bg3 = ((g50) getMBinding()).L.C;
        Intrinsics.checkNotNullExpressionValue(bg3, "bg3");
        Coil.imageLoader(bg3.getContext()).enqueue(new ImageRequest.Builder(bg3.getContext()).data(ThirdPartAccessConstants.URL_SUUNTO_PROMOTION_PAGE_BG_3).target(bg3).build());
        ImageView bg4 = ((g50) getMBinding()).L.D;
        Intrinsics.checkNotNullExpressionValue(bg4, "bg4");
        Coil.imageLoader(bg4.getContext()).enqueue(new ImageRequest.Builder(bg4.getContext()).data(ThirdPartAccessConstants.URL_SUUNTO_PROMOTION_PAGE_BG_4).target(bg4).build());
        AppCompatTextView suuntoTextIcon = ((g50) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(suuntoTextIcon, "suuntoTextIcon");
        ViewExtKt.visible(suuntoTextIcon);
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public int getAppId() {
        return this.appId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void getBindStatus() {
        ((AccessViewModel) getMViewModel()).inquirySuuntoBindStatus();
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public int getIconResId() {
        return this.iconResId;
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    @NotNull
    public String getThirdPartyNameStr() {
        String string = getString(mzi.b0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public boolean isInBindStatusBound() {
        Integer value = ((AccessViewModel) getMViewModel()).getBindStatusLiveData().getValue();
        return value != null && value.intValue() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public boolean isInBindStatusNotBound() {
        Integer value = ((AccessViewModel) getMViewModel()).getBindStatusLiveData().getValue();
        return value != null && value.intValue() == 0;
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void onAuthorize() {
        goToAuthorizeSuuntoInEmbeddedBrowser();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void onBind() {
        ((AccessViewModel) getMViewModel()).connectSuunto();
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity, com.xiaomi.fitness.access.Hilt_BaseThirdPartyAccessActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        processEntryIntoPage(intent);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Logger.i(TAG, "onNewIntent intent=" + intent);
        processEntryIntoPage(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void onObserveBindStatusCallback(int bindStatus) {
        super.onObserveBindStatusCallback(bindStatus);
        boolean z = false;
        boolean z2 = bindStatus == 1;
        ((g50) getMBinding()).A.setText(z2 ? mzi.R : mzi.Q);
        ((g50) getMBinding()).A.setBackgroundResource(z2 ? eni.t : eni.f16847r);
        ((g50) getMBinding()).A.setTextColor(ni4.c(this, z2 ? yii.e : yii.f));
        if (z2 && ConfigPreference.INSTANCE.getSHOW_SUUNTO_PARTNER_BTN()) {
            z = true;
        }
        setUpperBtnClickCallbackIfNeed(z, mzi.l0, new Function0() { // from class: vqo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SuuntoAccessActivity.onObserveBindStatusCallback$lambda$1(this.f37142a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void onUnbind() {
        ((AccessViewModel) getMViewModel()).disconnectSuunto();
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void setAppId(int i) {
        this.appId = i;
    }
}
