package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import b7.j;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean S0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, j.a(R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle, context));
        this.S0 = true;
    }

    @Override // androidx.preference.Preference
    public final void n() {
        b bVar;
        if (this.f10160m != null || this.f10161n != null || this.M0.size() == 0 || (bVar = this.f10148b.f17497j) == null) {
            return;
        }
        boolean zA = false;
        for (Fragment parentFragment = bVar; !zA && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof b.f) {
                zA = ((b.f) parentFragment).a();
            }
        }
        if (!zA && (bVar.getContext() instanceof b.f)) {
            zA = ((b.f) bVar.getContext()).a();
        }
        if (zA || !(bVar.getActivity() instanceof b.f)) {
            return;
        }
        ((b.f) bVar.getActivity()).a();
    }
}
