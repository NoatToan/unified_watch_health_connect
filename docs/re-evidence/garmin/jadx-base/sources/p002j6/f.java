package p002j6;

import e23.l;
import ge1.b;
import h4.r;
import n4.d;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B5\u0012,\u0010\u0007\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj6/f;", "Lh4/r$c;", "Lkotlin/Function1;", "Ln4/d;", "", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "Landroidx/compose/ui/viewinterop/OnRequesterReady;", "onRequesterReady", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends r.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l<? super l<? super d, Unit>, Unit> f97231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f97232b = new a();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/d;", "rect", "", "invoke", "(Ln4/d;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<d, Unit> {
        public a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(d dVar) {
            d dVar2 = dVar;
            f fVar = f.this;
            if (fVar.getIsAttached()) {
                b.T(fVar.getCoroutineScope(), null, null, new e(fVar, dVar2, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    public f(l<? super l<? super d, Unit>, Unit> lVar) {
        this.f97231a = lVar;
    }

    @Override // h4.r.c
    public final void onAttach() {
        this.f97231a.invoke(this.f97232b);
    }

    @Override // h4.r.c
    public final void onDetach() {
        this.f97231a.invoke(null);
    }
}
