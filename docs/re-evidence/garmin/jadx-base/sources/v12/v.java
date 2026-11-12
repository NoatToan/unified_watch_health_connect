package v12;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.d3;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/v;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends Fragment {
    public v() {
        super(R.layout.gcm_fragment_privacy_update_past_activities);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        a7.e eVarRequireActivity = requireActivity();
        Parcelable parcelable = null;
        d3 d3Var = eVarRequireActivity instanceof d3 ? (d3) eVarRequireActivity : null;
        if (d3Var != null) {
            d3Var.updateActionBar(getString(R.string.lbl_update_past_activities), 2);
        }
        Bundle bundleRequireArguments = requireArguments();
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelable2 = bundleRequireArguments != null ? bundleRequireArguments.getParcelable("GCM_extra_screen_access_role") : null;
            parcelable = (hl.a) (parcelable2 instanceof hl.a ? parcelable2 : null);
        } else if (bundleRequireArguments != null) {
            parcelable = (Parcelable) bundleRequireArguments.getParcelable("GCM_extra_screen_access_role", hl.a.class);
        }
        Object obj = (hl.a) parcelable;
        if (obj == null) {
            obj = hl.a.c.f84256b;
        }
        boolean z14 = obj instanceof hl.a.b;
        TextView textView = (TextView) view2.findViewById(R.id.allPastActivitiesInfo);
        TextView textView2 = (TextView) view2.findViewById(R.id.customPastActivitiesInfo);
        if (p005kotlin.jvm.internal.s.g(obj, hl.a.c.f84256b)) {
            textView.setText(getString(R.string.privacy_all_past_activities_description));
            textView2.setText(getString(R.string.privacy_custom_past_activities_description));
        } else if (!z14) {
            u0.r();
            return;
        } else {
            textView.setText("_Update the privacy of all your past activities.");
            textView2.setText("_Choose unique privacy levels for different past activity types");
        }
        view2.findViewById(R.id.allPastActivities).setOnClickListener(new u12.e(13, this, obj));
        view2.findViewById(R.id.customPastActivities).setOnClickListener(new t61.m(this, 23));
    }
}
