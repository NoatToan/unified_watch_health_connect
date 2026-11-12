package n23;

/* JADX INFO: loaded from: classes3.dex */
public class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f122649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r4 f122650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a f122651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005kotlin.jvm.internal.r0 f122652d;

    public x(ClassLoader classLoader, r4 r4Var, e23.a aVar, p005kotlin.jvm.internal.r0 r0Var) {
        this.f122649a = classLoader;
        this.f122650b = r4Var;
        this.f122651c = aVar;
        this.f122652d = r0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        c33.z zVar = (c33.z) obj2;
        zVar.getClass();
        y yVar = this.f122651c == null ? null : new y(new z(this.f122652d), iIntValue);
        if (zVar.equals(c33.z.f24306c)) {
            k23.r.f102461c.getClass();
            return k23.r.f102462d;
        }
        c33.b0 b0Var = zVar.f24307a;
        k23.s sVarF = b0Var != null ? b0.f(b0Var) : null;
        c33.w wVar = zVar.f24308b;
        return new k23.r(sVarF, wVar != null ? b0.e(wVar, this.f122649a, this.f122650b, yVar) : null);
    }
}
