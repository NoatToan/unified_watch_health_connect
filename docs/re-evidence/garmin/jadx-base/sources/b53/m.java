package b53;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lb53/m;", "Lb53/a;", "lowerBound", "upperBound", "", "isRawType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lb53/a;Lb53/a;ZLe23/a;)V", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends b53.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f16132e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b53.a f16133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b53.a f16134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f16135d;

    private m(b53.a aVar, b53.a aVar2, boolean z14, e23.a<? extends Type> aVar3) {
        super(aVar3);
        this.f16133b = aVar;
        this.f16134c = aVar2;
        this.f16135d = z14;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: C */
    public final boolean getF16160i() {
        return false;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: E, reason: from getter */
    public final b53.a getF16133b() {
        return this.f16133b;
    }

    @Override // b53.a
    public final b53.a F(boolean z14) {
        b53.a aVarF = this.f16133b.F(z14);
        b53.a aVarF2 = this.f16134c.F(z14);
        f16132e.getClass();
        return a.a(aVarF, aVarF2, this.f16135d, null);
    }

    @Override // b53.a
    public final b53.a G(boolean z14) {
        b53.a aVarG = this.f16133b.G(z14);
        b53.a aVarG2 = this.f16134c.G(z14);
        f16132e.getClass();
        return a.a(aVarG, aVarG2, this.f16135d, null);
    }

    @Override // b53.a
    /* JADX INFO: renamed from: H, reason: from getter */
    public final b53.a getF16134c() {
        return this.f16134c;
    }

    @Override // b53.a
    /* JADX INFO: renamed from: c */
    public final k23.p getF16157f() {
        return null;
    }

    @Override // b53.a
    public final k23.d<?> e() {
        return this.f16133b.e();
    }

    @Override // k23.p
    /* JADX INFO: renamed from: g */
    public final k23.e getF105782a() {
        return this.f16133b.getF105782a();
    }

    @Override // k23.b
    public final List<Annotation> getAnnotations() {
        return this.f16133b.getAnnotations();
    }

    @Override // k23.p
    public final List<k23.r> h() {
        return this.f16133b.h();
    }

    @Override // k23.p
    /* JADX INFO: renamed from: i */
    public final boolean getF16155d() {
        return this.f16133b.getF16155d();
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
    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getF16135d() {
        return this.f16135d;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb53/m$a;", "", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b53.a a(b53.a aVar, b53.a aVar2, boolean z14, e23.a aVar3) {
            aVar.getClass();
            aVar2.getClass();
            return aVar.equals(aVar2) ? aVar : new m(aVar, aVar2, z14, aVar3, null);
        }

        private a() {
        }
    }

    public /* synthetic */ m(b53.a aVar, b53.a aVar2, boolean z14, e23.a aVar3, p005kotlin.jvm.internal.j jVar) {
        this(aVar, aVar2, z14, aVar3);
    }
}
