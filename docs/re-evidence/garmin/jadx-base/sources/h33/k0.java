package h33;

import p13.u0;

/* JADX INFO: loaded from: classes3.dex */
public class k0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f81477a = new k0();

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        t23.b bVarB;
        String strB;
        t23.b bVar = (t23.b) obj;
        bVar.getClass();
        if (p005kotlin.reflect.jvm.internal.impl.builtins.d.A(bVar)) {
            p005kotlin.reflect.jvm.internal.impl.load.java.b bVar2 = p005kotlin.reflect.jvm.internal.impl.load.java.b.f105903m;
            p005kotlin.reflect.jvm.internal.impl.load.java.d.f105904a.getClass();
            kotlin.reflect.jvm.internal.impl.load.java.d.b bVar3 = null;
            if (p005kotlin.reflect.jvm.internal.impl.load.java.d.f105909f.contains(bVar.getName()) && (bVarB = f43.e.b(bVar, g.f81459a)) != null && (strB = q33.b0.b(bVarB)) != null) {
                if (p005kotlin.reflect.jvm.internal.impl.load.java.d.f105906c.contains(strB)) {
                    bVar3 = kotlin.reflect.jvm.internal.impl.load.java.d.b.ONE_COLLECTION_PARAMETER;
                } else {
                    bVar3 = ((kotlin.reflect.jvm.internal.impl.load.java.d.c) u0.c(strB, p005kotlin.reflect.jvm.internal.impl.load.java.d.f105908e)) == kotlin.reflect.jvm.internal.impl.load.java.d.c.f105925b ? kotlin.reflect.jvm.internal.impl.load.java.d.b.OBJECT_PARAMETER_GENERIC : kotlin.reflect.jvm.internal.impl.load.java.d.b.OBJECT_PARAMETER_NON_GENERIC;
                }
            }
            if (bVar3 != null) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }
}
