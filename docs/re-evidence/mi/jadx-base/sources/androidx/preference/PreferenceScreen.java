package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import defpackage.mii;
import defpackage.p5q;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean i;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, p5q.a(context, mii.h, R.attr.preferenceScreenStyle));
        this.i = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean o() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        b.InterfaceC0063b interfaceC0063bE;
        if (getIntent() != null || getFragment() != null || n() == 0 || (interfaceC0063bE = getPreferenceManager().e()) == null) {
            return;
        }
        interfaceC0063bE.onNavigateToScreen(this);
    }

    public boolean y() {
        return this.i;
    }
}
