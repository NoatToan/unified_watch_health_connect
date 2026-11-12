package l32;

import android.view.View;
import java.util.List;
import k32.e;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f109689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f109690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k32.d f109691d;

    public /* synthetic */ a(e eVar, List list, k32.d dVar, int i14) {
        this.f109688a = i14;
        this.f109689b = eVar;
        this.f109690c = list;
        this.f109691d = dVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f109688a) {
            case 0:
                e eVar = this.f109689b;
                T t7 = eVar.f102677b;
                boolean zB = eVar.b();
                for (e eVar2 : this.f109690c) {
                    if (eVar.equals(eVar2)) {
                        eVar.c(!zB);
                    } else {
                        eVar2.c(false);
                    }
                }
                k32.d dVar = this.f109691d;
                if (zB) {
                    dVar.Z3(t7);
                } else {
                    dVar.C(t7);
                }
                break;
            default:
                e eVar3 = this.f109689b;
                T t14 = eVar3.f102677b;
                if (!eVar3.b()) {
                    for (e eVar4 : this.f109690c) {
                        eVar4.c(eVar3.equals(eVar4));
                    }
                }
                this.f109691d.C(t14);
                break;
        }
    }
}
