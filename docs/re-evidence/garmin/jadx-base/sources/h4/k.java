package h4;

import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh4/r$b;", "it", "", "invoke", "(Lh4/r$b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<r.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81568a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final Boolean invoke(r.b bVar) {
            return Boolean.valueOf(!(bVar instanceof j));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh4/r;", "acc", "Lh4/r$b;", "element", "invoke", "(Lh4/r;Lh4/r$b;)Lh4/r;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.p<r, r.b, r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.m f81569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p3.m mVar) {
            super(2);
            this.f81569a = mVar;
        }

        @Override // e23.p
        public final r invoke(r rVar, r.b bVar) {
            r rVar2 = rVar;
            r.b bVarB = bVar;
            if (bVarB instanceof j) {
                e23.q<r, p3.m, Integer, r> qVar = ((j) bVarB).f81567b;
                qVar.getClass();
                y0.e(3, qVar);
                r.a aVar = r.S;
                p3.m mVar = this.f81569a;
                bVarB = k.b(qVar.invoke(aVar, mVar, 0), mVar);
            }
            return rVar2.then(bVarB);
        }
    }

    public static final r a(r rVar, e23.l<? super m2, Unit> lVar, e23.q<? super r, ? super p3.m, ? super Integer, ? extends r> qVar) {
        return rVar.then(new j(lVar, qVar));
    }

    public static final r b(r rVar, p3.m mVar) {
        if (rVar.all(a.f81568a)) {
            return rVar;
        }
        mVar.L(1219399079);
        r rVar2 = (r) rVar.foldIn(r.S, new b(mVar));
        mVar.R();
        return rVar2;
    }

    public static final r c(r rVar, p3.m mVar) {
        mVar.C(439770924);
        r rVarB = b(rVar, mVar);
        mVar.f();
        return rVarB;
    }
}
