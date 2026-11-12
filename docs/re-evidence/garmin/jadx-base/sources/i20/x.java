package i20;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Li20/x;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Li20/r;", "viewModel", "<init>", "(Li20/r;)V", "a", "b", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f87226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<l20.d> f87227b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li20/x$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Li20/x;Landroid/view/View;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f87228c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f87229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f87230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x xVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.text_view_label_name);
            viewFindViewById.getClass();
            this.f87229a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.image_view_selected);
            viewFindViewById2.getClass();
            this.f87230b = viewFindViewById2;
            view2.findViewById(R.id.row_container).setOnClickListener(new hx0.k(7, xVar, this));
        }
    }

    static {
        new a(null);
    }

    public x(r rVar) {
        rVar.getClass();
        this.f87226a = rVar;
        this.f87227b = rVar.f87193j ? p13.u.i0(l20.p.values()) : p13.u.i0(l20.k.values());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f87227b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        l20.d dVar = this.f87227b.get(i14);
        b bVar = f0Var instanceof b ? (b) f0Var : null;
        if (bVar != null) {
            bVar.f87229a.setText(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c().getString(dVar.getF109041b()));
            v22.e.v(bVar.f87230b, dVar.equals(this.f87226a.f87184a));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new b(this, n23.j.b(viewGroup, R.layout.list_item_contact_method_label, viewGroup, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li20/x$a;", "", "<init>", "()V", "", "POSITION_NO_SELECTION", "I", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
