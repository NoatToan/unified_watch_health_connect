package e63;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le63/y;", "T", "Le63/s;", "Le63/o;", "format", "", "withPlusSign", "<init>", "(Le63/o;Z)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o<T> f63279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<m<T>> f63281c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y<T> f63282a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(y<? super T> yVar) {
            super(1, kotlin.jvm.internal.s.a.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
            this.f63282a = yVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // e23.l
        public final Boolean invoke(Object obj) {
            boolean z14 = false;
            boolean z15 = false;
            for (m<T> mVar : this.f63282a.f63281c) {
                if (p005kotlin.jvm.internal.s.g(mVar.getF25051a().f63274a.get((Object) obj), Boolean.TRUE)) {
                    z15 = true;
                } else if (!mVar.b(obj)) {
                    return Boolean.valueOf(z14);
                }
            }
            z14 = z15;
            return Boolean.valueOf(z14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(o<? super T> oVar, boolean z14) {
        oVar.getClass();
        this.f63279a = oVar;
        this.f63280b = z14;
        q13.b bVarB = p13.w.b();
        lg.d.l(bVarB, oVar);
        q13.b bVarA = p13.w.a(bVarB);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = bVarA.listIterator(0);
        while (true) {
            q13.b.c cVar = (q13.b.c) listIterator;
            if (!cVar.hasNext()) {
                break;
            }
            m mVarB = ((l) cVar.next()).c().b();
            if (mVarB != null) {
                arrayList.add(mVarB);
            }
        }
        Set<m<T>> setG1 = h0.g1(arrayList);
        this.f63281c = setG1;
        if (setG1.isEmpty()) {
            vb.h.s("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    @Override // e63.o
    public final f63.e<T> a() {
        return new f63.g(this.f63279a.a(), new a(this), this.f63280b);
    }

    @Override // e63.o
    public final g63.o<T> b() {
        return zf.b.j(p13.x.k(new g63.o(p13.w.c(new g63.t(new dh1.a(this, 9), this.f63280b, "sign for " + this.f63281c)), j0.f134944a), this.f63279a.b()));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f63279a.equals(yVar.f63279a) && this.f63280b == yVar.f63280b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63280b) + (this.f63279a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.f63279a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
