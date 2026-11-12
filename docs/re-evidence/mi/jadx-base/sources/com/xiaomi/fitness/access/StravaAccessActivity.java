package com.xiaomi.fitness.access;

import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mi.health.search.SearchContract;
import com.xiaomi.fitness.access.StravaAccessActivity;
import com.xiaomi.fitness.access.util.ThirdPartyAccessExtKt;
import com.xiaomi.fitness.baseui.common.NetworkFallbackExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.onetrack.c.q;
import defpackage.eni;
import defpackage.g50;
import defpackage.mzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/access/StravaAccessActivity;", "Lcom/xiaomi/fitness/access/BaseThirdPartyAccessActivity;", "<init>", "()V", "thirdPartyNameStr", "", "getThirdPartyNameStr", "()Ljava/lang/String;", SearchContract.COLUMN_ICON_RESID, "", "getIconResId", "()I", q.f13858b, "getAppId", "setAppId", "(I)V", "isInBindStatusBound", "", "isInBindStatusNotBound", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAuthorize", "onBind", "onUnbind", "getBindStatus", "onNewIntent", "intent", "Landroid/content/Intent;", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StravaAccessActivity extends Hilt_StravaAccessActivity {

    @NotNull
    public static final String TAG = "StravaAccessActivity";
    private int appId;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(StravaAccessActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBindStatus();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public int getAppId() {
        return this.appId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void getBindStatus() {
        ((AccessViewModel) getMViewModel()).checkBindStatus();
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public int getIconResId() {
        return eni.p;
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    @NotNull
    public String getThirdPartyNameStr() {
        String string = getString(mzi.m0);
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
        startActivity(new Intent("android.intent.action.VIEW", ThirdPartyAccessExtKt.buildIntentUriToStravaLoginPage()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void onBind() {
        ((AccessViewModel) getMViewModel()).bindStrava();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity, com.xiaomi.fitness.access.Hilt_BaseThirdPartyAccessActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout noNetworkFallbackPage = ((g50) getMBinding()).K;
        Intrinsics.checkNotNullExpressionValue(noNetworkFallbackPage, "noNetworkFallbackPage");
        ConstraintLayout networkContent = ((g50) getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(networkContent, "networkContent");
        NetworkFallbackExtKt.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetworkFallbackPage, networkContent, ((g50) getMBinding()).C, new Function0() { // from class: mio
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StravaAccessActivity.onCreate$lambda$0(this.f26222a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("extra_key_code");
        Logger.i(TAG, "bindStrava authCode=" + (stringExtra == null ? AbstractJsonLexerKt.NULL : stringExtra));
        if (stringExtra == null) {
            return;
        }
        ((AccessViewModel) getMViewModel()).getAuthCodeLiveData().setValue(stringExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void onUnbind() {
        ((AccessViewModel) getMViewModel()).unbindStrava();
    }

    @Override // com.xiaomi.fitness.access.BaseThirdPartyAccessActivity
    public void setAppId(int i) {
        this.appId = i;
    }
}
