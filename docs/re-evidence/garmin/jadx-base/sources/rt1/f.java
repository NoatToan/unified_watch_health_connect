package rt1;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.w3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\tB\u001f\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lrt1/f;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lrt1/f$a;", "Lkotlin/Function1;", "Lww1/r;", "", "itemClickListener", "<init>", "(Le23/l;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<ww1.r, Unit> f154523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f154524b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrt1/f$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lrt1/f;Landroidx/compose/ui/platform/ComposeView;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f154525c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComposeView f154526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f154527b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, ComposeView composeView) {
            super(composeView);
            composeView.getClass();
            this.f154527b = fVar;
            this.f154526a = composeView;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(e23.l<? super ww1.r, Unit> lVar) {
        this.f154523a = lVar;
        this.f154524b = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f154524b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a aVar = (a) f0Var;
        aVar.getClass();
        if (i14 == -1) {
            return;
        }
        ww1.r rVar = (ww1.r) this.f154524b.get(i14);
        rVar.getClass();
        ComposeView composeView = aVar.f154526a;
        f fVar = aVar.f154527b;
        composeView.setViewCompositionStrategy(w3.c.f91623b);
        composeView.setContent(new z3.e(762633666, true, new e(aVar, rVar, fVar, 0)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        return new a(this, new ComposeView(context, null, 0, 6, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ f(e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : lVar);
    }
}
