package uy1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import dz1.o;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\fB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Luy1/c;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Luy1/c$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "selectedItem", "", "Lez1/d;", "list", "<init>", "(Landroid/content/Context;ILjava/util/List;)V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f173396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<ez1.d> f173397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f173398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f173399e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy1/c$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Luy1/c;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexButton f173400a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.activity_view);
            viewFindViewById.getClass();
            this.f173400a = (GCMComplexButton) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, int i14, List<? extends ez1.d> list) {
        context.getClass();
        list.getClass();
        this.f173395a = context;
        this.f173396b = i14;
        this.f173397c = list;
        this.f173399e = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f173397c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        ez1.d dVar = this.f173397c.get(i14);
        GCMComplexButton gCMComplexButton = aVar.f173400a;
        gCMComplexButton.setButtonTopLabel(dVar.c(this.f173395a));
        int i15 = this.f173399e;
        if (i15 == i14 || (i15 == -1 && this.f173396b == dVar.w())) {
            gCMComplexButton.a(true);
        } else {
            gCMComplexButton.a(false);
        }
        aVar.itemView.setOnClickListener(new ty0.a(this, 5, aVar, dVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, j.b(viewGroup, R.layout.item_row, viewGroup, false));
    }
}
