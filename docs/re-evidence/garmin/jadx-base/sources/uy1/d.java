package uy1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.components.ui.GCMComplexButton;
import dz1.n;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Luy1/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Luy1/d$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lgg0/f;", "selectedEventType", "", "activities", "<init>", "(Landroid/content/Context;Lgg0/f;Ljava/util/List;)V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gg0.f f173402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<gg0.f> f173403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f173404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f173405e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Luy1/d$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemVew", "<init>", "(Luy1/d;Landroid/view/View;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMComplexButton f173406a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.activity_view);
            viewFindViewById.getClass();
            this.f173406a = (GCMComplexButton) viewFindViewById;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, gg0.f fVar, List<? extends gg0.f> list) {
        context.getClass();
        list.getClass();
        this.f173401a = context;
        this.f173402b = fVar;
        this.f173403c = list;
        this.f173405e = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f173403c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        gg0.f fVar;
        a aVar = (a) f0Var;
        aVar.getClass();
        gg0.f fVar2 = this.f173403c.get(i14);
        GCMComplexButton gCMComplexButton = aVar.f173406a;
        gCMComplexButton.setButtonTopLabel(fVar2.b(this.f173401a));
        int i15 = this.f173405e;
        if (i15 == i14 || (i15 == -1 && (fVar = this.f173402b) != null && fVar.equals(fVar2))) {
            gCMComplexButton.a(true);
        } else {
            gCMComplexButton.a(false);
        }
        aVar.itemView.setOnClickListener(new ty0.a(this, 6, aVar, fVar2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(this, j.b(viewGroup, R.layout.item_row, viewGroup, false));
    }

    public /* synthetic */ d(Context context, gg0.f fVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : fVar, list);
    }
}
