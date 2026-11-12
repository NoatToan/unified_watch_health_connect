package com.garmin.android.apps.connectmobile.onboarding.education;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import hx0.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39715b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f39716a;

    public interface b {
        void x4(com.garmin.android.apps.connectmobile.onboarding.education.a.b bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f39716a = (b) context;
        } catch (ClassCastException unused) {
            g.u(context, " must implement OnEducationalFeatureComplete");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_onboarding_educational, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ((LottieAnimationView) view2.findViewById(R.id.education_lottie_view)).setAnimation(arguments.getInt("argImageRes"));
            ((TextView) view2.findViewById(R.id.education_title)).setText(arguments.getInt("argTitleRes"));
            ((TextView) view2.findViewById(R.id.education_description)).setText(arguments.getInt("argDescriptionRes"));
            if (arguments.getBoolean("argShowButton")) {
                View viewFindViewById = view2.findViewById(R.id.education_page_button);
                viewFindViewById.setVisibility(0);
                viewFindViewById.setOnClickListener(new k(25, this, arguments));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/education/c$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
