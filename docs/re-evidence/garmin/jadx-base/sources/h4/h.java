package h4;

import androidx.room.a0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh4/h;", "Lh4/r;", "outer", "inner", "<init>", "(Lh4/r;Lh4/r;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f81556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f81557b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lh4/r$b;", "element", "invoke", "(Ljava/lang/String;Lh4/r$b;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.p<String, r.b, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81558a = new a();

        public a() {
            super(2);
        }

        @Override // e23.p
        public final String invoke(String str, r.b bVar) {
            String str2 = str;
            r.b bVar2 = bVar;
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public h(r rVar, r rVar2) {
        this.f81556a = rVar;
        this.f81557b = rVar2;
    }

    @Override // h4.r
    public final boolean all(e23.l<? super r.b, Boolean> lVar) {
        return this.f81556a.all(lVar) && this.f81557b.all(lVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f81556a, hVar.f81556a) && p005kotlin.jvm.internal.s.g(this.f81557b, hVar.f81557b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h4.r
    public final <R> R foldIn(R r14, e23.p<? super R, ? super r.b, ? extends R> pVar) {
        return (R) this.f81557b.foldIn(this.f81556a.foldIn(r14, pVar), pVar);
    }

    public final int hashCode() {
        return (this.f81557b.hashCode() * 31) + this.f81556a.hashCode();
    }

    public final String toString() {
        return a0.m(new StringBuilder("["), (String) foldIn("", a.f81558a), ']');
    }
}
