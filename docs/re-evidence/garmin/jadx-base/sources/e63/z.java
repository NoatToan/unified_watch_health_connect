package e63;

import java.util.ArrayList;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le63/z;", "Target", "Le63/l;", "Le63/n;", "", "field", "minDigits", "maxDigits", "spacePadding", "outputPlusOnExceededWidth", "<init>", "(Le63/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<Target, Integer> f63283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f63284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f63285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f63286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f63287e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Target, Integer> {
        public a(Object obj) {
            super(1, obj, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // e23.l
        public final Integer invoke(Object obj) {
            return (Integer) ((b) this.receiver).b(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(n<? super Target, Integer> nVar, Integer num, Integer num2, Integer num3, Integer num4) {
        nVar.getClass();
        this.f63283a = nVar;
        this.f63284b = num;
        this.f63285c = num2;
        this.f63286d = num3;
        this.f63287e = num4;
        if (num != null && num.intValue() < 0) {
            vb.h.x(androidx.room.a0.i("The minimum number of digits (", num, ") is negative"));
            throw null;
        }
        if (num2 == null || num == null || num2.intValue() >= num.intValue()) {
            return;
        }
        o2.c.i(41, "The maximum number of digits (", num2, ") is less than the minimum number of digits (", num);
        throw null;
    }

    @Override // e63.l
    public final f63.e<Target> a() {
        a aVar = new a(this.f63283a.a());
        Integer num = this.f63284b;
        f63.h hVar = new f63.h(aVar, num != null ? num.intValue() : 0, this.f63287e);
        Integer num2 = this.f63286d;
        return num2 != null ? new f63.i(hVar, num2.intValue()) : hVar;
    }

    @Override // e63.l
    public final g63.o<Target> b() {
        n<Target, Integer> nVar = this.f63283a;
        b<Target, Integer> bVarA = nVar.a();
        String f63256b = nVar.getF63256b();
        bVarA.getClass();
        f63256b.getClass();
        Integer num = this.f63284b;
        Integer num2 = this.f63285c;
        Integer num3 = this.f63286d;
        ArrayList arrayListM = p13.x.m(g63.n.a(num, num2, num3, bVarA, f63256b, true));
        Integer num4 = this.f63287e;
        if (num4 != null) {
            arrayListM.add(g63.n.a(num, num4, num3, bVarA, f63256b, false));
            arrayListM.add(new g63.o(p13.x.k(new g63.q(Marker.ANY_NON_NULL_MARKER), new g63.g(p13.w.c(new g63.x(wr.g.m(1, num4), num2, bVarA, f63256b, false)))), j0.f134944a));
        } else {
            arrayListM.add(g63.n.a(num, num2, num3, bVarA, f63256b, false));
        }
        return new g63.o<>(j0.f134944a, arrayListM);
    }

    @Override // e63.l
    public final n<Target, Integer> c() {
        return this.f63283a;
    }
}
