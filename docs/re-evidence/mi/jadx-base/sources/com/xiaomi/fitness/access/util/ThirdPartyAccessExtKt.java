package com.xiaomi.fitness.access.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.access.SuuntoAccessActivity;
import com.xiaomi.fitness.access.util.ThirdPartyAccessExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.onetrack.c.q;
import defpackage.mzi;
import defpackage.nuf;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t\u001a\u0016\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t\u001a\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\t\u001a\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013\u001a'\u0010\u0014\u001a\u00020\u0007\"\b\b\u0000\u0010\u0015*\u00020\u0016*\u0002H\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0002\u0010\u0019\u001a\u0016\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"TAG", "", "buildIntentUriToGoogleFitLoginPage", "Landroid/net/Uri;", "buildIntentUriToStravaLoginPage", "buildIntentUriToSuuntoAuthPage", "showOperationToast", "", "toastType", "", "getAccessPageTitle", "isInBindStatusNotBound", "", q.f13858b, "getAccessPageDesText", "getAccessPageBtnText", "getRemovalConfirmationText", "goToMineTab", "context", "Landroid/content/Context;", "listenOnClickWithPressedEffect", "T", "Landroid/view/View;", "callback", "Lkotlin/Function0;", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "processSuuntoUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "access_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ThirdPartyAccessExtKt {

    @NotNull
    public static final String TAG = "ThirdPartyAccessExt";

    @NotNull
    public static final Uri buildIntentUriToGoogleFitLoginPage() {
        Uri uriBuild = Uri.parse(ThirdPartAccessConstants.GOOGLE_FIT_AUTHORIZATION_URL).buildUpon().appendQueryParameter("client_id", ThirdPartAccessConstants.GOOGLE_FIT_CLIENT_ID).appendQueryParameter(ThirdPartAccessConstants.KEY_RESPONSE_TYPE, "code").appendQueryParameter(ThirdPartAccessConstants.KEY_PROMPT, ThirdPartAccessConstants.GOOGLE_FIT_PROMPT).appendQueryParameter("scope", ThirdPartAccessConstants.GOOGLE_FIT_SCOPE).appendQueryParameter(ThirdPartAccessConstants.KEY_ACCESS_TYPE, ThirdPartAccessConstants.GOOGLE_FIT_ACCESS_TYPE).appendQueryParameter("redirect_uri", "https://region.hlth.io.mi.com/third-oauth/v3/callback").appendQueryParameter("state", ThirdPartAccessConstants.GOOGLE_FIT_STATE).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    @NotNull
    public static final Uri buildIntentUriToStravaLoginPage() {
        Uri uriBuild = Uri.parse(ThirdPartAccessConstants.AUTHORIZE_URL).buildUpon().appendQueryParameter("client_id", ThirdPartAccessConstants.CLIENT_ID).appendQueryParameter(ThirdPartAccessConstants.KEY_RESPONSE_TYPE, "code").appendQueryParameter("redirect_uri", ThirdPartAccessConstants.STRAVA_REDIRECT_URI).appendQueryParameter("approval_prompt", "force").appendQueryParameter("scope", ThirdPartAccessConstants.STRAVA_SCOPE).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    @NotNull
    public static final Uri buildIntentUriToSuuntoAuthPage() {
        Uri uriBuild = Uri.parse(ThirdPartAccessConstants.SUUNTO_AUTHORIZATION_URL).buildUpon().appendQueryParameter("client_id", ThirdPartAccessConstants.SUUNTO_CLIENT_ID).appendQueryParameter(ThirdPartAccessConstants.KEY_RESPONSE_TYPE, "code").appendQueryParameter("redirect_uri", ThirdPartAccessConstants.SUUNTO_REDIRECT_URI).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        return uriBuild;
    }

    @NotNull
    public static final String getAccessPageBtnText(boolean z) {
        return ResourceExtKt.getString(z ? mzi.Q : mzi.R);
    }

    @NotNull
    public static final String getAccessPageDesText(boolean z, int i) {
        int i2;
        if (z) {
            if (i == 0) {
                i2 = mzi.a0;
            } else if (i != 1) {
                i2 = i != 2 ? mzi.A0 : mzi.n0;
            } else {
                i2 = mzi.f27381k;
            }
        } else if (i == 0) {
            i2 = mzi.T;
        } else if (i != 1) {
            i2 = i != 2 ? mzi.A0 : mzi.n0;
        } else {
            i2 = mzi.S;
        }
        return ResourceExtKt.getString(i2);
    }

    @NotNull
    public static final String getAccessPageTitle(boolean z, int i) {
        int i2;
        if (z) {
            if (i == 0) {
                i2 = mzi.Y;
            } else if (i != 1) {
                i2 = i != 2 ? mzi.A0 : mzi.Z;
            } else {
                i2 = mzi.X;
            }
        } else if (i == 0) {
            i2 = mzi.P;
        } else if (i != 1) {
            i2 = i != 2 ? mzi.A0 : mzi.Z;
        } else {
            i2 = mzi.O;
        }
        return ResourceExtKt.getString(i2);
    }

    @NotNull
    public static final String getRemovalConfirmationText(int i) {
        int i2;
        if (i == 0) {
            i2 = mzi.M;
        } else if (i != 1) {
            i2 = i != 2 ? mzi.A0 : mzi.N;
        } else {
            i2 = mzi.h;
        }
        return ResourceExtKt.getString(i2);
    }

    public static final void goToMineTab(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_ME());
        MainExtKt.showMainActivity(context, null, bundle);
    }

    public static final <T extends View> void listenOnClickWithPressedEffect(@NotNull T t, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        nuf.f(t);
        ViewExtKt.clickWithTrigger$default(t, 0L, new Function1() { // from class: ibp
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ThirdPartyAccessExtKt.listenOnClickWithPressedEffect$lambda$0(callback, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenOnClickWithPressedEffect$lambda$0(Function0 callback, View it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke();
        return Unit.INSTANCE;
    }

    public static final void processSuuntoUri(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("path");
        Logger.i(TAG, "processSuuntoUri path=" + queryParameter);
        if (Intrinsics.areEqual(queryParameter, "suunto")) {
            String queryParameter2 = uri.getQueryParameter("code");
            Logger.i(TAG, "processSuuntoUri code=" + queryParameter2);
            Intent intent = new Intent();
            intent.putExtra("code", queryParameter2);
            intent.setClass(context, SuuntoAccessActivity.class);
            intent.setFlags(67108864);
            intent.addFlags(603979776);
            context.startActivity(intent);
        }
    }

    public static final void showOperationToast(int i) {
        int i2;
        if (i == 0) {
            i2 = mzi.V;
        } else if (i != 1) {
            i2 = i != 2 ? mzi.j0 : mzi.W;
        } else {
            i2 = mzi.U;
        }
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), i2);
    }
}
