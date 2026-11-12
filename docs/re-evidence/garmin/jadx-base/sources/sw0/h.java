package sw0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsw0/h;", "Lsw0/a;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "a", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends sw0.a {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\tB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsw0/h$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lsw0/h$a$a;", "Lsw0/h;", "", "Lsw0/g;", "legends", "<init>", "(Lsw0/h;Ljava/util/List;)V", "a", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.h<C3040a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<g> f161079a;

        /* JADX INFO: renamed from: sw0.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsw0/h$a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lsw0/h$a;Landroid/view/View;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class C3040a extends RecyclerView.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f161080a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f161081b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextView f161082c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3040a(a aVar, View view2) {
                super(view2);
                view2.getClass();
                this.f161080a = view2.getContext();
                View viewFindViewById = view2.findViewById(R.id.legend_line_view);
                viewFindViewById.getClass();
                this.f161081b = viewFindViewById;
                View viewFindViewById2 = view2.findViewById(R.id.legend_line_text_view);
                viewFindViewById2.getClass();
                this.f161082c = (TextView) viewFindViewById2;
            }
        }

        public a(h hVar, List<g> list) {
            list.getClass();
            this.f161079a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f161079a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            Drawable drawableMutate;
            C3040a c3040a = (C3040a) f0Var;
            c3040a.getClass();
            g gVar = this.f161079a.get(i14);
            gVar.getClass();
            Integer num = gVar.f161077d;
            Context context = c3040a.f161080a;
            context.getClass();
            String strA = dh.b.A(context, gVar.f161074a);
            c3040a.f161082c.setText(strA);
            Integer num2 = gVar.f161075b;
            View view2 = c3040a.f161081b;
            if (num2 == null) {
                v22.e.j(view2);
                return;
            }
            Drawable drawableA = j.a.a(context, num2.intValue());
            if (drawableA == null || (drawableMutate = drawableA.mutate()) == null) {
                drawableMutate = null;
            } else {
                Integer num3 = gVar.f161076c;
                if (num3 != null) {
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(num3.intValue(), PorterDuff.Mode.SRC));
                }
            }
            view2.setBackground(drawableMutate);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = MathKt.c(c22.b.c(context, context.getResources().getDimension(R.dimen.icon_xsmall), 1.5f));
            Resources resources = context.getResources();
            Integer num4 = gVar.f161078e;
            layoutParams.height = MathKt.c(c22.b.c(context, resources.getDimension(num4 != null ? num4.intValue() : R.dimen.map_legend_thick_line_height), 1.5f));
            if (num != null) {
                View view3 = c3040a.itemView;
                view3.setContentDescription(view3.getContext().getString(num.intValue(), strA));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            return new C3040a(this, n23.j.b(viewGroup, R.layout.map_details_legend_line, viewGroup, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view2) {
        super(view2);
        view2.getClass();
    }

    @Override // sw0.a
    public final void d(k kVar) {
        kVar.getClass();
        if (!(kVar instanceof f)) {
            vb.h.s("Error! Bound a MapDetailsViewHolder with something other than MapDetailsLegendItem.");
            return;
        }
        View viewFindViewById = this.itemView.findViewById(R.id.legend_map_details_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new FlexboxLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new a(this, ((f) kVar).f161073a));
    }
}
