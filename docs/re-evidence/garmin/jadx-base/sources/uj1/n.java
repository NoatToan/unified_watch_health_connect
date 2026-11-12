package uj1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\tB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Luj1/n;", "Landroidx/recyclerview/widget/x;", "Lsd2/f;", "Luj1/n$a;", "Lkotlin/Function1;", "", "onClick", "<init>", "(Le23/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends androidx.recyclerview.widget.x<sd2.f, a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<sd2.f, Unit> f171547b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luj1/n$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Luj1/n;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f171548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f171549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public sd2.f f171550c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.connect_iq_row_device_image);
            viewFindViewById.getClass();
            this.f171548a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.connect_iq_row_device_name);
            viewFindViewById2.getClass();
            this.f171549b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.connect_iq_device_row);
            viewFindViewById3.getClass();
            ((LinearLayout) viewFindViewById3).setOnClickListener(new u12.e(6, this, nVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(e23.l<? super sd2.f, Unit> lVar) {
        super(c.f171494a);
        lVar.getClass();
        this.f171547b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        sd2.f fVarR = r(i14);
        fVarR.getClass();
        sd2.f fVar = fVarR;
        aVar.f171550c = fVar;
        zb0.t.c(aVar.f171548a, fVar);
        TextView textView = aVar.f171549b;
        sd2.f fVar2 = aVar.f171550c;
        textView.setText(String.valueOf(fVar2 != null ? fVar2.getDisplayName() : null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, n23.j.b(viewGroup, R.layout.connect_iq_device_row, viewGroup, false));
    }
}
