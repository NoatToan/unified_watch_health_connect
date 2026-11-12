package d83;

import c83.r;
import d13.n;
import d13.t;
import d13.u;
import java.lang.reflect.Type;
import q03.l;
import q03.q;

/* JADX INFO: loaded from: classes11.dex */
public final class f<R> implements c83.e<R, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f58400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f58401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f58403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f58404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f58405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f58406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f58407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f58408i;

    public f(Type type, q qVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        this.f58400a = type;
        this.f58401b = qVar;
        this.f58402c = z14;
        this.f58403d = z15;
        this.f58404e = z16;
        this.f58405f = z17;
        this.f58406g = z18;
        this.f58407h = z19;
        this.f58408i = z24;
    }

    @Override // c83.e
    /* JADX INFO: renamed from: a */
    public final Type getF122006a() {
        return this.f58400a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056 A[RETURN] */
    @Override // c83.e
    public final Object b(r rVar) {
        l aVar;
        q qVar;
        l bVar = this.f58402c ? new b(rVar) : new c(rVar);
        if (!this.f58403d) {
            if (this.f58404e) {
                aVar = new a(bVar);
            }
            qVar = this.f58401b;
            if (qVar != null) {
                bVar = bVar.g(qVar);
            }
            if (this.f58405f) {
                return bVar.h(q03.a.MISSING);
            }
            if (this.f58406g) {
                return new u(bVar, null);
            }
            if (this.f58407h) {
                return new t(bVar);
            }
            if (this.f58408i) {
                return new n(bVar);
            }
            return bVar;
        }
        aVar = new e(bVar);
        bVar = aVar;
        qVar = this.f58401b;
        if (qVar != null) {
            bVar = bVar.g(qVar);
        }
        if (this.f58405f) {
            return bVar.h(q03.a.MISSING);
        }
        if (this.f58406g) {
            return new u(bVar, null);
        }
        if (this.f58407h) {
            return new t(bVar);
        }
        if (this.f58408i) {
            return new n(bVar);
        }
        return bVar;
    }
}
