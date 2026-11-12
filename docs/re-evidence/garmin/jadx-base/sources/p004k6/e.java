package p004k6;

import e23.l;
import f5.a1;
import f5.b1;
import f5.v1;
import f5.y0;
import f5.z0;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf5/b1;", "", "Lf5/y0;", "measurables", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Ljava/util/List;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class e implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f103028a = new e();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<v1> f103029a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends v1> list) {
            super(1);
            this.f103029a = list;
        }

        @Override // e23.l
        public final Unit invoke(v1.a aVar) {
            v1.a aVar2 = aVar;
            List<v1> list = this.f103029a;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                v1.a.B(aVar2, list.get(i14), 0, 0);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iL = 0;
        int iK = 0;
        for (int i14 = 0; i14 < size; i14++) {
            v1 v1VarQ = list.get(i14).Q(j8);
            iL = Math.max(iL, v1VarQ.f69144a);
            iK = Math.max(iK, v1VarQ.f69145b);
            arrayList.add(v1VarQ);
        }
        if (list.isEmpty()) {
            iL = g6.a.l(j8);
            iK = g6.a.k(j8);
        }
        return b1.h0(b1Var, iL, iK, new a(arrayList));
    }
}
