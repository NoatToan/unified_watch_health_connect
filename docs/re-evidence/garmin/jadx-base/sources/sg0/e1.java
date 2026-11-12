package sg0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsg0/e1;", "Landroidx/lifecycle/u1;", "Lre0/o;", "repo", "Lpu/h;", "gcmCountryMinimumAge", "La22/i;", "userProfileRepo", "<init>", "(Lre0/o;Lpu/h;La22/i;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re0.o f159073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu.h f159074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a22.i f159075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f159076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f159077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z53.b f159078f;

    public e1(re0.o oVar, pu.h hVar, a22.i iVar) {
        oVar.getClass();
        hVar.getClass();
        iVar.getClass();
        this.f159073a = oVar;
        this.f159074b = hVar;
        this.f159075c = iVar;
        this.f159076d = q2.a(new z0(null, false, null, 7, null));
        this.f159077e = new LinkedHashMap();
        this.f159078f = z53.c.a();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0173  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [sg0.e1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a22.i] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0154 -> B:49:0x016d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01a8 -> B:55:0x01b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01da -> B:58:0x01dc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object x4(sg0.e1 r18, com.garmin.android.apps.connectmobile.v2.b r19, v13.c r20) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.e1.x4(sg0.e1, com.garmin.android.apps.connectmobile.v2$b, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y4(Long l14, v13.c cVar) {
        a1 a1Var;
        z53.b bVar;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f159028e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f159028e = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(this, cVar);
            }
        } else {
            a1Var = new a1(this, cVar);
        }
        Object obj = a1Var.f159026c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var.f159028e;
        if (i15 == 0) {
            o13.r.b(obj);
            a1Var.f159024a = l14;
            bVar = this.f159078f;
            a1Var.f159025b = bVar;
            a1Var.f159028e = 1;
            if (bVar.c(a1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z53.b bVar2 = a1Var.f159025b;
            Long l15 = a1Var.f159024a;
            o13.r.b(obj);
            bVar = bVar2;
            l14 = l15;
        }
        try {
            return this.f159077e.get(l14 != null ? new Integer((int) l14.longValue()) : null);
        } finally {
            bVar.e(null);
        }
    }

    public final void z4() {
        ge1.b.T(v1.a(this), null, null, new b1(this, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e1(re0.o oVar, pu.h hVar, a22.i iVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            a22.i.f537b.getClass();
            iVar = a22.i.a.a();
        }
        this(oVar, hVar, iVar);
    }
}
