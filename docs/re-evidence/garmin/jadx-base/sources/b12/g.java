package b12;

import e23.l;
import f5.a1;
import f5.b1;
import f5.v1;
import f5.y0;
import f5.z0;
import g6.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p007l6.p;
import p007l6.z;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lf5/b1;", "", "Lf5/y0;", "measurables", "Lg6/a;", "constraints", "Lf5/a1;", "measure-3p2s80s", "(Lf5/b1;Ljava/util/List;J)Lf5/a1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class g implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f14403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f14404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f14405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f14407e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class a extends w implements l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f14408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f14409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f14410c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z zVar, List list, Map map) {
            super(1);
            this.f14408a = zVar;
            this.f14409b = list;
            this.f14410c = map;
        }

        @Override // e23.l
        public final Unit invoke(v1.a aVar) {
            List<? extends y0> list = this.f14409b;
            Map<y0, v1> map = this.f14410c;
            this.f14408a.e(aVar, list, map);
            return Unit.INSTANCE;
        }
    }

    public g(p1 p1Var, z zVar, p pVar, int i14, p1 p1Var2) {
        this.f14403a = p1Var;
        this.f14404b = zVar;
        this.f14405c = pVar;
        this.f14406d = i14;
        this.f14407e = p1Var2;
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f14403a.getF182175a();
        long jF = this.f14404b.f(j8, b1Var.getF68910b(), this.f14405c, list, linkedHashMap, this.f14406d);
        this.f14407e.getF182175a();
        m.a aVar = m.f76012b;
        return b1.h0(b1Var, (int) (jF >> 32), (int) (jF & 4294967295L), new a(this.f14404b, list, linkedHashMap));
    }
}
