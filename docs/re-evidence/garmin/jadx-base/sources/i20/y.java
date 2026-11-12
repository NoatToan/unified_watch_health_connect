package i20;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import f20.c0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Li20/y;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Li20/r;", "viewModel", "<init>", "(Li20/r;)V", "b", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f87231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87232b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li20/y$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Li20/y;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f87233d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f87234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f87235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f87236c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.label_country_name);
            viewFindViewById.getClass();
            this.f87234a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.label_phone_prefix);
            viewFindViewById2.getClass();
            this.f87235b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.selected_check_mark);
            viewFindViewById3.getClass();
            this.f87236c = viewFindViewById3;
            view2.findViewById(R.id.row_container).setOnClickListener(new hx0.k(8, yVar, this));
        }
    }

    static {
        new a(null);
    }

    public y(r rVar) {
        rVar.getClass();
        this.f87231a = rVar;
        this.f87232b = rVar.f87189f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f87232b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return i14 == 0 ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        c0 c0Var = (c0) this.f87232b.get(i14);
        b bVar = f0Var instanceof b ? (b) f0Var : null;
        if (bVar != null) {
            bVar.f87234a.setText(c0Var.f68361b);
            bVar.f87235b.setText(c0Var.f68362c);
            bVar.f87236c.setVisibility(p005kotlin.jvm.internal.s.g(this.f87231a.f87190g, c0Var) ? 0 : 4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(this, n23.j.b(viewGroup, i14 == 0 ? R.layout.gcm4_country_prefix_header_list_item : R.layout.gcm4_country_prefix_list_item, viewGroup, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Li20/y$a;", "", "<init>", "()V", "", "POSITION_NO_SELECTION", "I", "VIEW_TYPE_HEADER", "VIEW_TYPE_REGULAR", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
