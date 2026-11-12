package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.f f10685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f10687c;

    public t(s sVar, s.f fVar, int i14) {
        this.f10687c = sVar;
        this.f10685a = fVar;
        this.f10686b = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f10687c;
        RecyclerView recyclerView = sVar.f10650r;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        s.f fVar = this.f10685a;
        boolean z14 = fVar.f10679k;
        RecyclerView.f0 f0Var = fVar.f10673e;
        if (z14 || f0Var.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        RecyclerView.m itemAnimator = sVar.f10650r.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.k()) {
            ArrayList arrayList = sVar.f10648p;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (((s.f) arrayList.get(i14)).f10680l) {
                }
            }
            sVar.f10645m.o(this.f10686b, f0Var);
            return;
        }
        sVar.f10650r.post(this);
    }
}
