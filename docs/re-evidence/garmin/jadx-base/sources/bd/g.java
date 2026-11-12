package bd;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class g extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f17498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.core.view.a f17499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f17500c;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            g gVar = g.this;
            gVar.f17499b.onInitializeAccessibilityNodeInfo(view2, fVar);
            int childAdapterPosition = gVar.f17498a.getChildAdapterPosition(view2);
            RecyclerView.h adapter = gVar.f17498a.getAdapter();
            if (adapter instanceof androidx.preference.c) {
                ((androidx.preference.c) adapter).u(childAdapterPosition);
            }
        }

        @Override // androidx.core.view.a
        public final boolean performAccessibilityAction(View view2, int i14, Bundle bundle) {
            return g.this.f17499b.performAccessibilityAction(view2, i14, bundle);
        }
    }

    public g(RecyclerView recyclerView) {
        super(recyclerView);
        this.f17499b = super.getItemDelegate();
        this.f17500c = new a();
        this.f17498a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.f0
    public final androidx.core.view.a getItemDelegate() {
        return this.f17500c;
    }
}
