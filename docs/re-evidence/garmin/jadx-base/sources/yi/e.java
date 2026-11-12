package yi;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f197298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f197299c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ri.a f197301e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f197300d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f197297a = new j();

    @Deprecated
    public e(File file, long j8) {
        this.f197298b = file;
        this.f197299c = j8;
    }

    @Override // yi.a
    public final File a(ui.e eVar) throws Throwable {
        String strA = this.f197297a.a(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(eVar);
        }
        try {
            ri.a.e eVarK = c().k(strA);
            if (eVarK != null) {
                return eVarK.f152792a[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yi.a
    public final void b(ui.e eVar, wi.e eVar2) {
        c.a aVar;
        String strA = this.f197297a.a(eVar);
        c cVar = this.f197300d;
        synchronized (cVar) {
            aVar = (c.a) cVar.f197287a.get(strA);
            if (aVar == null) {
                c.b bVar = cVar.f197288b;
                synchronized (bVar.f197291a) {
                    aVar = (c.a) bVar.f197291a.poll();
                }
                if (aVar == null) {
                    aVar = new c.a();
                }
                cVar.f197287a.put(strA, aVar);
            }
            aVar.f197290b++;
        }
        aVar.f197289a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(eVar);
            }
            try {
                ri.a aVarC = c();
                if (aVarC.k(strA) == null) {
                    ri.a.c cVarF = aVarC.f(strA);
                    if (cVarF == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                    }
                    try {
                        if (eVar2.f185292a.b(eVar2.f185293b, cVarF.b(), eVar2.f185294c)) {
                            ri.a.a(ri.a.this, cVarF, true);
                            cVarF.f152782c = true;
                        }
                        if (!cVarF.f152782c) {
                            cVarF.a();
                        }
                    } catch (Throwable th3) {
                        if (!cVarF.f152782c) {
                            try {
                                cVarF.a();
                            } catch (IOException unused) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (IOException unused2) {
            }
            this.f197300d.a(strA);
        } catch (Throwable th4) {
            this.f197300d.a(strA);
            throw th4;
        }
    }

    public final synchronized ri.a c() {
        try {
            if (this.f197301e == null) {
                this.f197301e = ri.a.n(this.f197298b, this.f197299c);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f197301e;
    }

    @Override // yi.a
    public final synchronized void clear() {
        try {
            ri.a aVarC = c();
            aVarC.close();
            ri.c.a(aVarC.f152765a);
            synchronized (this) {
                this.f197301e = null;
            }
        } catch (IOException unused) {
            synchronized (this) {
                this.f197301e = null;
            }
        } catch (Throwable th3) {
            synchronized (this) {
                this.f197301e = null;
                throw th3;
            }
        }
    }
}
