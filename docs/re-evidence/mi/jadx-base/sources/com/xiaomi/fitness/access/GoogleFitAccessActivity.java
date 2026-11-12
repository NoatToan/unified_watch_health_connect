package com.xiaomi.fitness.access;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mi.health.search.SearchContract;
import com.xiaomi.fitness.access.GoogleFitAccessActivity;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.access.util.ThirdPartyAccessExtKt;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.onetrack.c.q;
import defpackage.eni;
import defpackage.g50;
import defpackage.mzi;
import defpackage.of1;
import defpackage.yii;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Dispatchers;
import miuix.androidbasewidget.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/access/GoogleFitAccessActivity;", "Lcom/xiaomi/fitness/access/BaseThirdPartyAccessActivity;", "<init>", "()V", "thirdPartyNameStr", "", "getThirdPartyNameStr", "()Ljava/lang/String;", SearchContract.COLUMN_ICON_RESID, "", "getIconResId", "()I", q.f13858b, "getAppId", "setAppId", "(I)V", "isInBindStatusBound", "", "isInBindStatusNotBound", "getBindStatus", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showHealthConnectEntrance", "onAuthorize", "goToBrowserAuthPage", "onBind", "onUnbind", "onNewIntent", "intent", "Landroid/content/Intent;", "processEnterOperation", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoogleFitAccessActivity extends Hilt_GoogleFitAccessActivity {

    @NotNull
    public static final String TAG = "GoogleFitAccessActivity";
    private final int iconResId = eni.o;
    private int appId = 1;

    private final void goToBrowserAuthPage() {
        startActivity(new Intent("android.intent.action.VIEW", ThirdPartyAccessExtKt.buildIntentUriToGoogleFitLoginPage()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void processEnterOperation(Intent intent) {
        String stringExtra = intent.getStringExtra(ThirdPartAccessConstants.PARAM_AUTH_CODE);
        if (stringExtra == null || StringsKt__StringsKt.isBlank(stringExtra)) {
            ConstraintLayout noNetworkFallbackPage = ((g50) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(noNetworkFallbackPage, "noNetworkFallbackPage");
            ConstraintLayout networkContent = ((g50) getMBinding()).J;
            Intrinsics.checkNotNullExpressionValue(networkContent, "networkContent");
            NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetworkFallbackPage, networkContent, ((g50) getMBinding()).C, new Function0() { // from class: p2b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoogleFitAccessActivity.processEnterOperation$lambda$3(this.f29931a);
                }
            });
        } else {
            ((AccessViewModel) getMViewModel()).getAuthCodeLiveData().setValue(stringExtra);
        }
        Logger.i(TAG, "processOperation authCode=" + stringExtra + " authCode.isNullOrBlank()=" + (stringExtra == null || StringsKt__StringsKt.isBlank(stringExtra)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processEnterOperation$lambda$3(GoogleFitAccessActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBindStatus();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showHealthConnectEntrance() {
        TextView upperBtn = ((g50) getMBinding()).N;
        Intrinsics.checkNotNullExpressionValue(upperBtn, "upperBtn");
        ViewExtKt.gone(upperBtn);
        TextView bottomBtn = ((g50) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(bottomBtn, "bottomBtn");
        ViewExtKt.gone(bottomBtn);
        ProgressBar loadingRotateProgressBar = ((g50) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(loadingRotateProgressBar, "loadingRotateProgressBar");
        ViewExtKt.gone(loadingRotateProgressBar);
        ConstraintLayout constraintLayout = ((g50) getMBinding()).B;
        TextView textView = new TextView(this);
        textView.setText(getString(mzi.q0));
        textView.setTextColor(getColor(yii.f));
        textView.setTextSize(16.0f);
        textView.setGravity(17);
        textView.setBackground(of1.b(this, eni.e));
        textView.setOnClickListener(new View.OnClickListener() { // from class: o2b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GoogleFitAccessActivity.showHealthConnectEntrance$lambda$1$lambda$0(this.f28666a, view);
            }
        });
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(ExtUtilsKt.getDp(Double.valueOf(306.67d)), ExtUtilsKt.getDp(Double.valueOf(46.66d)));
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(textView, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHealthConnectEntrance$lambda$1$lambda$0(GoogleFitAccessActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScopeExtKt.scope(Dispatchers.getIO(), new GoogleFitAccessActivity$showHealthConnectEntrance$1$1$1(this$0, null));
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public int getAppId() {
        return this.appId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void getBindStatus() {
        ((AccessViewModel) getMViewModel()).getGoogleFitBindStatus();
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public int getIconResId() {
        return this.iconResId;
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    @NotNull
    public String getThirdPartyNameStr() {
        String string = getString(mzi.k0);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
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
        goToBrowserAuthPage();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void onBind() {
        ((AccessViewModel) getMViewModel()).bindGoogleFit();
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity, com.xiaomi.fitness.access.Hilt_BaseThirdPartyAccessActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.i(TAG, "onCreate");
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        processEnterOperation(intent);
        showHealthConnectEntrance();
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Logger.i(TAG, "onNewIntent");
        processEnterOperation(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void onUnbind() {
        ((AccessViewModel) getMViewModel()).unbindGoogleFit();
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void setAppId(int i) {
        this.appId = i;
    }
}
