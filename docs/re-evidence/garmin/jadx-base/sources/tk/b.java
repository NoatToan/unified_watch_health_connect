package tk;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f165203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f165204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f165205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f165206d;

    public b(c cVar, g gVar, String str, int i14) {
        this.f165206d = cVar;
        this.f165203a = gVar;
        this.f165204b = str;
        this.f165205c = i14;
    }

    @Override // tk.h
    public final void T() {
        g gVar = this.f165203a;
        if (gVar != null) {
            gVar.b(this.f165204b + "Task cancelled.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [tk.g] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    @Override // tk.h
    public final void a(vk.b bVar) {
        ?? CopyOfRange;
        bVar.f99070r = null;
        jk.j.a aVar = bVar.f99063k;
        int i14 = this.f165205c;
        jk.e eVar = new jk.e(aVar, null, i14, 5000);
        bVar.t(new jk.m(bVar, eVar));
        jk.j.f fVar = eVar.I;
        jk.j.f fVar2 = jk.j.f.SUCCESS;
        ?? r14 = this.f165203a;
        if (fVar != fVar2) {
            if (r14 != 0) {
                r14.b(this.f165204b + fVar.toString());
                return;
            }
            return;
        }
        Objects.toString(fVar);
        byte[] bArr = bVar.f99070r;
        this.f165206d.getClass();
        if (i14 == 65533 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) {
            CopyOfRange = bArr;
            CopyOfRange = bArr;
            CopyOfRange = bArr;
            CopyOfRange = bArr;
            CopyOfRange = Arrays.copyOfRange(bArr, 3, bArr.length);
        }
        if (r14 != 0) {
            r14.a(CopyOfRange);
        }
    }

    @Override // tk.h
    public final void b(jk.j.i iVar) {
        g gVar = this.f165203a;
        if (gVar != null) {
            gVar.b(this.f165204b + iVar.toString());
        }
    }
}
