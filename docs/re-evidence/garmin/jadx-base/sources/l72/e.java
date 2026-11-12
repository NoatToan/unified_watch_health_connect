package l72;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf5/b1;", "", "Lf5/y0;", "measurables", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Ljava/util/List;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class e implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f110972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p007l6.z f110973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p007l6.p f110974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f110975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f110976e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p007l6.z f110977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f110978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f110979c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p007l6.z zVar, List list, Map map) {
            super(1);
            this.f110977a = zVar;
            this.f110978b = list;
            this.f110979c = map;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            List<? extends f5.y0> list = this.f110978b;
            Map<f5.y0, f5.v1> map = this.f110979c;
            this.f110977a.e(aVar, list, map);
            return Unit.INSTANCE;
        }
    }

    public e(p3.p1 p1Var, p007l6.z zVar, p007l6.p pVar, int i14, p3.p1 p1Var2) {
        this.f110972a = p1Var;
        this.f110973b = zVar;
        this.f110974c = pVar;
        this.f110975d = i14;
        this.f110976e = p1Var2;
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f110972a.getF182175a();
        long jF = this.f110973b.f(j8, b1Var.getF68910b(), this.f110974c, list, linkedHashMap, this.f110975d);
        this.f110976e.getF182175a();
        g6.m.a aVar = g6.m.f76012b;
        return f5.b1.h0(b1Var, (int) (jF >> 32), (int) (jF & 4294967295L), new a(this.f110973b, list, linkedHashMap));
    }
}
