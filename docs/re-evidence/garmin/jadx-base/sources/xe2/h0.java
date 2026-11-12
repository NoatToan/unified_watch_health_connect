package xe2;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.garmin.android.library.mobileauth.ui.DeleteAccountActivity;
import com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u000bH\u0090@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010 \u001a\u00020\bH\u0010¢\u0006\u0004\b\u001f\u0010\u0003¨\u0006!"}, d2 = {"Lxe2/h0;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthAbstractWebFrag;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "constructURL$mobile_auth_release", "()Ljava/lang/String;", "constructURL", "", "onBackPressedHandled$mobile_auth_release", "()Z", "onBackPressedHandled", "Landroid/webkit/WebView;", "webView", "onBeforeLoadWebURL$mobile_auth_release", "(Landroid/webkit/WebView;)V", "onBeforeLoadWebURL", "constructToolbarTitle$mobile_auth_release", "(Lt13/d;)Ljava/lang/Object;", "constructToolbarTitle", "useBackgroundImage$mobile_auth_release", "useBackgroundImage", "shouldBlurBackgroundImage$mobile_auth_release", "shouldBlurBackgroundImage", "onToolbarBackPressed$mobile_auth_release", "onToolbarBackPressed", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 extends MobileAuthAbstractWebFrag {
    public static final int $stable = 8;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190486a;

        static {
            int[] iArr = new int[ve2.e.values().length];
            try {
                iArr[ve2.e.f177704d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.e.f177705e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f190486a = iArr;
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public Object constructToolbarTitle$mobile_auth_release(t13.d<? super String> dVar) {
        return getMobileAuthConfig$mobile_auth_release().f177785z;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public String constructURL$mobile_auth_release() {
        String str;
        int i14 = a.f190486a[getEnvironment().ordinal()];
        if (i14 != 1) {
            str = i14 != 2 ? "www.dev.garmin.com" : "www.garmin.cn";
        } else {
            str = "www.garmin.com";
        }
        String strReplace = hb2.h.b().replace('_', '-');
        strReplace.getClass();
        return v.e0.g("https://", str, "/", strReplace, "/account/datamanagement/deletedata/");
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public boolean onBackPressedHandled$mobile_auth_release() {
        return false;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag
    public void onBeforeLoadWebURL$mobile_auth_release(WebView webView) {
        webView.getClass();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public void onToolbarBackPressed$mobile_auth_release() {
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        ((DeleteAccountActivity) activity).W9(0);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthAbstractWebFrag, com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle savedInstanceState) {
        view2.getClass();
        super.onViewCreated(view2, savedInstanceState);
        getWebView().setBackgroundColor(-1);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public boolean shouldBlurBackgroundImage$mobile_auth_release() {
        return false;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public boolean useBackgroundImage$mobile_auth_release() {
        return false;
    }
}
