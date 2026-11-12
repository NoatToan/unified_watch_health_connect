package f5;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/b2;", "Lh5/e0$f;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b2 extends h5.e0.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b2 f68904b = new b2();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f68905a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Unit invoke(v1.a aVar) {
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v1 f68906a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1 v1Var) {
            super(1);
            this.f68906a = v1Var;
        }

        @Override // e23.l
        public final Unit invoke(v1.a aVar) {
            v1.a.E(aVar, this.f68906a, 0, 0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<v1> f68907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends v1> list) {
            super(1);
            this.f68907a = list;
        }

        @Override // e23.l
        public final Unit invoke(v1.a aVar) {
            v1.a aVar2 = aVar;
            List<v1> list = this.f68907a;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                v1.a.E(aVar2, list.get(i14), 0, 0);
            }
            return Unit.INSTANCE;
        }
    }

    private b2() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        int size = list.size();
        if (size == 0) {
            return b1.h0(b1Var, g6.a.l(j8), g6.a.k(j8), a.f68905a);
        }
        if (size == 1) {
            v1 v1VarQ = list.get(0).Q(j8);
            return b1.h0(b1Var, g6.b.g(v1VarQ.f69144a, j8), g6.b.f(v1VarQ.f69145b, j8), new b(v1VarQ));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            v1 v1VarQ2 = list.get(i14).Q(j8);
            iMax = Math.max(v1VarQ2.f69144a, iMax);
            iMax2 = Math.max(v1VarQ2.f69145b, iMax2);
            arrayList.add(v1VarQ2);
        }
        return b1.h0(b1Var, g6.b.g(iMax, j8), g6.b.f(iMax2, j8), new c(arrayList));
    }
}
