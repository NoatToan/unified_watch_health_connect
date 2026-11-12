package xe2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag;
import com.garmin.android.library.mobileauth.ui.MobileAuthButton;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxe2/r;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthBgBlurCapableFrag;", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends MobileAuthBgBlurCapableFrag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f190537a = o13.m.b(new xa1.j(23));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xe2/r$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f190538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f190539b;

        public a(View view2, r rVar) {
            this.f190538a = view2;
            this.f190539b = rVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view2 = this.f190538a;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            Set<Integer> setC1 = this.f190539b.getFragListener$mobile_auth_release().c1();
            if (setC1.size() >= 2) {
                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Set<Integer> set = setC1;
                marginLayoutParams.topMargin = ((Number) p13.h0.W(set, 0)).intValue();
                toolbar.setLayoutParams(marginLayoutParams);
                MobileAuthButton mobileAuthButton = (MobileAuthButton) view2.findViewById(R.id.privacy_policy_button);
                ViewGroup.LayoutParams layoutParams2 = mobileAuthButton.getLayoutParams();
                layoutParams2.getClass();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = ((Number) p13.h0.W(set, 1)).intValue();
                mobileAuthButton.setLayoutParams(marginLayoutParams2);
            }
            return true;
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final Object constructToolbarTitle$mobile_auth_release(t13.d<? super CharSequence> dVar) {
        CharSequence text = getText(R.string.mobile_auth_privacy_consent_title);
        text.getClass();
        return text;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.mobileauth_china_privacy_consent, viewGroup, false);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final void onToolbarBackPressed$mobile_auth_release() {
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        ((AuthenticationActivity) activity).onBackPressed();
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        view2.getViewTreeObserver().addOnPreDrawListener(new a(view2, this));
        ((TextView) view2.findViewById(R.id.privacy_policy_message)).setText(getString(R.string.mobile_auth_privacy_consent_message, getString(R.string.ssoApplicationName), getString(R.string.mobile_auth_agree)));
        View viewFindViewById = view2.findViewById(R.id.agree_button);
        if (viewFindViewById != null) {
            final int i14 = 0;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f190528b;

                {
                    this.f190528b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i14) {
                        case 0:
                            r rVar = this.f190528b;
                            androidx.fragment.app.m activity = rVar.getActivity();
                            if (activity != null && rVar.isAdded() && !rVar.isRemoving() && !activity.isDestroyed() && !activity.isFinishing()) {
                                rVar.getFragListener$mobile_auth_release().y1();
                                break;
                            }
                            break;
                        case 1:
                            r rVar2 = this.f190528b;
                            androidx.fragment.app.m activity2 = rVar2.getActivity();
                            if (activity2 != null && rVar2.isAdded() && !rVar2.isRemoving() && !activity2.isDestroyed() && !activity2.isFinishing()) {
                                String string = activity2.getString(R.string.mobile_auth_quit_app_title);
                                String string2 = activity2.getString(R.string.mobile_auth_quit_app_message);
                                string2.getClass();
                                n0.a(activity2, string, string2, null, null, null, null, 120);
                                break;
                            }
                            break;
                        default:
                            r rVar3 = this.f190528b;
                            androidx.fragment.app.m activity3 = rVar3.getActivity();
                            if (activity3 != null && rVar3.isAdded() && !rVar3.isRemoving() && !activity3.isDestroyed() && !activity3.isFinishing()) {
                                ge1.b.T(o53.f0.w(rVar3), null, null, new q(rVar3, activity3, null), 3);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        View viewFindViewById2 = view2.findViewById(R.id.disagree_button);
        if (viewFindViewById2 != null) {
            final int i15 = 1;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f190528b;

                {
                    this.f190528b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i15) {
                        case 0:
                            r rVar = this.f190528b;
                            androidx.fragment.app.m activity = rVar.getActivity();
                            if (activity != null && rVar.isAdded() && !rVar.isRemoving() && !activity.isDestroyed() && !activity.isFinishing()) {
                                rVar.getFragListener$mobile_auth_release().y1();
                                break;
                            }
                            break;
                        case 1:
                            r rVar2 = this.f190528b;
                            androidx.fragment.app.m activity2 = rVar2.getActivity();
                            if (activity2 != null && rVar2.isAdded() && !rVar2.isRemoving() && !activity2.isDestroyed() && !activity2.isFinishing()) {
                                String string = activity2.getString(R.string.mobile_auth_quit_app_title);
                                String string2 = activity2.getString(R.string.mobile_auth_quit_app_message);
                                string2.getClass();
                                n0.a(activity2, string, string2, null, null, null, null, 120);
                                break;
                            }
                            break;
                        default:
                            r rVar3 = this.f190528b;
                            androidx.fragment.app.m activity3 = rVar3.getActivity();
                            if (activity3 != null && rVar3.isAdded() && !rVar3.isRemoving() && !activity3.isDestroyed() && !activity3.isFinishing()) {
                                ge1.b.T(o53.f0.w(rVar3), null, null, new q(rVar3, activity3, null), 3);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        View viewFindViewById3 = view2.findViewById(R.id.privacy_policy_button);
        if (viewFindViewById3 != null) {
            final int i16 = 2;
            viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: xe2.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f190528b;

                {
                    this.f190528b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i16) {
                        case 0:
                            r rVar = this.f190528b;
                            androidx.fragment.app.m activity = rVar.getActivity();
                            if (activity != null && rVar.isAdded() && !rVar.isRemoving() && !activity.isDestroyed() && !activity.isFinishing()) {
                                rVar.getFragListener$mobile_auth_release().y1();
                                break;
                            }
                            break;
                        case 1:
                            r rVar2 = this.f190528b;
                            androidx.fragment.app.m activity2 = rVar2.getActivity();
                            if (activity2 != null && rVar2.isAdded() && !rVar2.isRemoving() && !activity2.isDestroyed() && !activity2.isFinishing()) {
                                String string = activity2.getString(R.string.mobile_auth_quit_app_title);
                                String string2 = activity2.getString(R.string.mobile_auth_quit_app_message);
                                string2.getClass();
                                n0.a(activity2, string, string2, null, null, null, null, 120);
                                break;
                            }
                            break;
                        default:
                            r rVar3 = this.f190528b;
                            androidx.fragment.app.m activity3 = rVar3.getActivity();
                            if (activity3 != null && rVar3.isAdded() && !rVar3.isRemoving() && !activity3.isDestroyed() && !activity3.isFinishing()) {
                                ge1.b.T(o53.f0.w(rVar3), null, null, new q(rVar3, activity3, null), 3);
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean shouldBlurBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177777r;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean useBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177776q;
    }
}
