package com.xiaomi.fitness.rn.settings.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.rn.settings.util.RnUserLicenseUriDialog;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.u2j;
import defpackage.v0j;
import defpackage.wji;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0011\u001a\u00020\rJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/util/RnUserLicenseUriDialog;", "", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "deviceName", "", "agreementURL", "privacyURL", "privacyChangedContent", "agreeCallback", "Lkotlin/Function1;", "", "", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "TAG", "show", "getPolicyMessage", "", LifecycleConstantKt.TYPE_ACTIVITY, "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnUserLicenseUriDialog {

    @NotNull
    private final String TAG;

    @NotNull
    private final Function1<Boolean, Unit> agreeCallback;

    @Nullable
    private final String agreementURL;

    @NotNull
    private final String deviceName;

    @Nullable
    private final String privacyChangedContent;

    @NotNull
    private final String privacyURL;

    @NotNull
    private final WeakReference<Activity> weakActivity;

    /* JADX WARN: Multi-variable type inference failed */
    public RnUserLicenseUriDialog(@NotNull WeakReference<Activity> weakActivity, @NotNull String deviceName, @Nullable String str, @NotNull String privacyURL, @Nullable String str2, @NotNull Function1<? super Boolean, Unit> agreeCallback) {
        Intrinsics.checkNotNullParameter(weakActivity, "weakActivity");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(privacyURL, "privacyURL");
        Intrinsics.checkNotNullParameter(agreeCallback, "agreeCallback");
        this.weakActivity = weakActivity;
        this.deviceName = deviceName;
        this.agreementURL = str;
        this.privacyURL = privacyURL;
        this.privacyChangedContent = str2;
        this.agreeCallback = agreeCallback;
        this.TAG = "RnUserLicenseUriDialog";
    }

    @SuppressLint({"StringFormatMatches"})
    private final CharSequence getPolicyMessage(final Activity activity, String privacyChangedContent) {
        String string = (privacyChangedContent == null || privacyChangedContent.length() == 0) ? activity.getString(v0j.v, this.agreementURL, this.privacyURL) : activity.getString(v0j.x, this.agreementURL, this.privacyURL, privacyChangedContent);
        Intrinsics.checkNotNull(string);
        Spannable spannableA = LinkSpanHelper.a(activity, string, Integer.valueOf(wji.f38031a), new LinkSpanHelper.a() { // from class: nwk
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                RnUserLicenseUriDialog.getPolicyMessage$lambda$2(this.f28510a, activity, view, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(spannableA, "adaptLinkStyleAndAction(...)");
        return spannableA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPolicyMessage$lambda$2(RnUserLicenseUriDialog this$0, Activity activity, View view, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        int i = Intrinsics.areEqual(str, this$0.privacyURL) ? v0j.y : v0j.e;
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.starWebViewSupportPDFDownload$default(str, activity.getString(i), false, false, null, null, null, 124, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(RnUserLicenseUriDialog this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "showUserLicenseUriDialog, click agree btn");
        this$0.agreeCallback.invoke2(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(RnUserLicenseUriDialog this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.TAG, "showUserLicenseUriDialog, click cancel btn");
        this$0.agreeCallback.invoke2(Boolean.FALSE);
    }

    public final void show() {
        Activity activity = this.weakActivity.get();
        if (activity == null) {
            return;
        }
        c cVarB = new c.a(activity, u2j.f35312a).z(this.deviceName).m(getPolicyMessage(activity, this.privacyChangedContent)).u(v0j.f36349a, new DialogInterface.OnClickListener() { // from class: lwk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RnUserLicenseUriDialog.show$lambda$0(this.f25500a, dialogInterface, i);
            }
        }).o(v0j.d, new DialogInterface.OnClickListener() { // from class: mwk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RnUserLicenseUriDialog.show$lambda$1(this.f27295a, dialogInterface, i);
            }
        }).e(false).b();
        Intrinsics.checkNotNullExpressionValue(cVarB, "create(...)");
        cVarB.show();
        TextView textViewO = cVarB.o();
        if (textViewO != null) {
            textViewO.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
