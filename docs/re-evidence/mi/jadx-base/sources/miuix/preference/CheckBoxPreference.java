package miuix.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.alb;
import defpackage.g7i;
import miuix.view.HapticCompat;

/* JADX INFO: loaded from: classes3.dex */
public class CheckBoxPreference extends BaseCheckBoxPreference {
    public View f;

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // miuix.preference.BaseCheckBoxPreference, androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        this.f = g7iVar.itemView;
        View viewA = g7iVar.a(R.id.checkbox);
        if (!b() || viewA == null) {
            return;
        }
        viewA.setImportantForAccessibility(2);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    public void onClick() {
        super.onClick();
        View view = this.f;
        if (view != null) {
            HapticCompat.e(view, alb.A, alb.f);
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
