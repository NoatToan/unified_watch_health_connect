package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class y6i extends u {
    public final RecyclerView c;
    public final androidx.core.view.a d;
    public final androidx.core.view.a e;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
            Preference preferenceL;
            y6i.this.d.onInitializeAccessibilityNodeInfo(view, m80Var);
            int childAdapterPosition = y6i.this.c.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = y6i.this.c.getAdapter();
            if ((adapter instanceof androidx.preference.a) && (preferenceL = ((androidx.preference.a) adapter).l(childAdapterPosition)) != null) {
                preferenceL.onInitializeAccessibilityNodeInfo(m80Var);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return y6i.this.d.performAccessibilityAction(view, i, bundle);
        }
    }

    public y6i(RecyclerView recyclerView) {
        super(recyclerView);
        this.d = super.a();
        this.e = new a();
        this.c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.u
    public androidx.core.view.a a() {
        return this.e;
    }
}
