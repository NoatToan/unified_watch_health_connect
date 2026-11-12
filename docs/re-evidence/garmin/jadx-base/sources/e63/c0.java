package e63;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le63/c0;", "Target", "Le63/l;", "Le63/b0;", "field", "", "minDigits", "spacePadding", "<init>", "(Le63/b0;ILjava/lang/Integer;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c0<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0<Target> f63238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f63240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63241d;

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
    public c0(b0<? super Target> b0Var, int i14, Integer num) {
        b0Var.getClass();
        this.f63238a = b0Var;
        this.f63239b = i14;
        this.f63240c = num;
        int i15 = b0Var.f63235g;
        this.f63241d = i15;
        if (i14 < 0) {
            vb.h.x(e0.f(i14, "The minimum number of digits (", ") is negative"));
            throw null;
        }
        if (i15 < i14) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i15 + ") is less than the minimum number of digits (" + i14 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (num == null || num.intValue() > i14) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i14 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @Override // e63.l
    public final f63.e<Target> a() {
        f63.k kVar = new f63.k(new a(this.f63238a.f63229a), this.f63239b);
        Integer num = this.f63240c;
        return num != null ? new f63.i(kVar, num.intValue()) : kVar;
    }

    @Override // e63.l
    public final g63.o<Target> b() {
        Integer numValueOf = Integer.valueOf(this.f63239b);
        Integer numValueOf2 = Integer.valueOf(this.f63241d);
        b0<Target> b0Var = this.f63238a;
        return g63.n.a(numValueOf, numValueOf2, this.f63240c, b0Var.f63229a, b0Var.f63232d, false);
    }

    @Override // e63.l
    public final /* bridge */ /* synthetic */ n c() {
        return this.f63238a;
    }
}
