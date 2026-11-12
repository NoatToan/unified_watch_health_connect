package i80;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import go1.g0;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Li80/h;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Li80/h$a;", "Li80/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Li80/g;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f92242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f92243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<f> f92244c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li80/h$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Li80/h;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f92245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f92246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f92247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f92248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f92249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f92250f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, View view2) {
            super(view2);
            view2.getClass();
            this.f92245a = view2;
            View viewFindViewById = view2.findViewById(R.id.name);
            viewFindViewById.getClass();
            this.f92246b = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.path);
            viewFindViewById2.getClass();
            this.f92247c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.lastModified);
            viewFindViewById3.getClass();
            this.f92248d = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.size);
            viewFindViewById4.getClass();
            this.f92249e = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.isPublic);
            viewFindViewById5.getClass();
            this.f92250f = (TextView) viewFindViewById5;
        }
    }

    public h(g gVar) {
        gVar.getClass();
        this.f92242a = gVar;
        this.f92244c = new ArrayList(0);
        this.f92243b = new g0(this, 18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f92244c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        f fVar = this.f92244c.get(i14);
        aVar.f92246b.setText(fVar.f92238b);
        aVar.f92247c.setText(fVar.f92239c);
        aVar.f92248d.setText(fVar.f92241e);
        aVar.f92249e.setText(fVar.f92240d);
        boolean z14 = fVar.f92237a;
        TextView textView = aVar.f92250f;
        if (z14) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
        View view2 = aVar.f92245a;
        view2.setTag(fVar);
        view2.setOnClickListener(this.f92243b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.glogger_file_item, viewGroup, false);
        viewE.getClass();
        return new a(this, viewE);
    }
}
