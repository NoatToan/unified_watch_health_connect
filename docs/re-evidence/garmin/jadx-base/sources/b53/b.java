package b53;

import java.lang.annotation.Annotation;
import java.util.List;
import lc.u0;
import n23.w3;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb53/b;", "Lb53/a;", "Lt43/d;", "Lk23/p;", "lowerType", "Lb53/c;", "typeConstructor", "", "isMarkedNullable", "<init>", "(Lk23/p;Lb53/c;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends b53.a implements t43.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23.p f16112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f16113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16114d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16115a = new a();

        public a() {
            super(0, f.class, "javaTypeNotSupported", "javaTypeNotSupported()Ljava/lang/Void;", 1);
        }

        @Override // e23.a
        public final Object invoke() {
            throw new w3("javaType for captured types is not supported");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k23.p pVar, c cVar, boolean z14) {
        super(a.f16115a);
        cVar.getClass();
        this.f16112b = pVar;
        this.f16113c = cVar;
        this.f16114d = z14;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: C */
    public final boolean getF16160i() {
        return false;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: E */
    public final b53.a getF16133b() {
        return null;
    }

    @Override // b53.a
    public final b53.a F(boolean z14) {
        if (!z14) {
            return this;
        }
        u0.t(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }

    @Override // b53.a
    public final b53.a G(boolean z14) {
        return z14 == this.f16114d ? this : new b(this.f16112b, this.f16113c, z14);
    }

    @Override // b53.a
    /* JADX INFO: renamed from: H */
    public final b53.a getF16134c() {
        return null;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: c */
    public final k23.p getF16157f() {
        return null;
    }

    @Override // b53.a
    public final k23.d<?> e() {
        return null;
    }

    @Override // b53.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f16112b, bVar.f16112b) && p005kotlin.jvm.internal.s.g(this.f16113c, bVar.f16113c) && this.f16114d == bVar.f16114d;
    }

    @Override // k23.p
    /* JADX INFO: renamed from: g */
    public final k23.e getF105782a() {
        return null;
    }

    @Override // k23.b
    public final List<Annotation> getAnnotations() {
        return j0.f134944a;
    }

    @Override // k23.p
    public final List<k23.r> h() {
        return j0.f134944a;
    }

    @Override // b53.a
    public final int hashCode() {
        k23.p pVar = this.f16112b;
        return Boolean.hashCode(this.f16114d) + ((this.f16113c.hashCode() + ((pVar != null ? pVar.hashCode() : 0) * 31)) * 31);
    }

    @Override // k23.p
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF16114d() {
        return this.f16114d;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: j */
    public final boolean getF16158g() {
        return false;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: m */
    public final boolean getF16159h() {
        return false;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: t */
    public final boolean getF16135d() {
        return false;
    }

    @Override // b53.a
    public final String toString() {
        return this.f16113c.toString();
    }
}
