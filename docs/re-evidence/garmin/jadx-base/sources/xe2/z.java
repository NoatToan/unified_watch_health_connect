package xe2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag;
import com.garmin.android.library.mobileauth.ui.MobileAuthTextView;
import java.util.Set;
import p005kotlin.Metadata;
import vg1.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxe2/z;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthBgBlurCapableFrag;", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z extends MobileAuthBgBlurCapableFrag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Button f190604a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xe2/z$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f190605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z f190606b;

        public a(View view2, z zVar) {
            this.f190605a = view2;
            this.f190606b = zVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view2 = this.f190605a;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            Set<Integer> setC1 = this.f190606b.getFragListener$mobile_auth_release().c1();
            if (setC1.size() >= 2) {
                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Set<Integer> set = setC1;
                marginLayoutParams.topMargin = ((Number) p13.h0.W(set, 0)).intValue();
                toolbar.setLayoutParams(marginLayoutParams);
                NestedScrollView nestedScrollView = (NestedScrollView) view2.findViewById(R.id.scrollable_content);
                ViewGroup.LayoutParams layoutParams2 = nestedScrollView.getLayoutParams();
                layoutParams2.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = ((Number) p13.h0.W(set, 1)).intValue();
                nestedScrollView.setLayoutParams(marginLayoutParams2);
            }
            return true;
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final Object constructToolbarTitle$mobile_auth_release(t13.d<? super String> dVar) {
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.mobileauth_create_acct_warning_screen, viewGroup, false);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final void onToolbarBackPressed$mobile_auth_release() {
        Button button = this.f190604a;
        if (button == null) {
            p005kotlin.jvm.internal.s.m("buttonNext");
            throw null;
        }
        if (button.getVisibility() == 4) {
            return;
        }
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        ((AuthenticationActivity) activity).onBackPressed();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        view2.getViewTreeObserver().addOnPreDrawListener(new a(view2, this));
        MobileAuthTextView mobileAuthTextView = (MobileAuthTextView) view2.findViewById(R.id.create_acct_warning_title);
        String string = getString(R.string.ssoCreateAccountWarningScreenTitle);
        string.getClass();
        if (d53.w.J(string)) {
            mobileAuthTextView.setVisibility(8);
        } else {
            mobileAuthTextView.setText(string);
            mobileAuthTextView.setVisibility(0);
        }
        String string2 = getString(R.string.ssoCreateAccountWarningScreenMessage);
        string2.getClass();
        if (d53.w.J(string2)) {
            string2 = "App must define 'R.string.ssoDefaultCreateAccountWarningMessage'";
        }
        ((MobileAuthTextView) view2.findViewById(R.id.create_acct_warning_message)).setText(string2);
        Button button = (Button) view2.findViewById(R.id.create_acct_warning_button_next);
        this.f190604a = button;
        if (button != null) {
            button.setOnClickListener(new z0(this, 19));
        } else {
            p005kotlin.jvm.internal.s.m("buttonNext");
            throw null;
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean shouldBlurBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177779t;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean useBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177778s;
    }
}
