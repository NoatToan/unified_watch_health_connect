package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import b7.j;
import bd.h;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a(R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle, context));
    }

    @Override // androidx.preference.Preference
    public final boolean B() {
        return !super.h();
    }

    @Override // androidx.preference.Preference
    public final boolean h() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void m(h hVar) {
        super.m(hVar);
        hVar.itemView.setAccessibilityHeading(true);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
    }

    public PreferenceCategory(Context context) {
        this(context, null);
    }
}
