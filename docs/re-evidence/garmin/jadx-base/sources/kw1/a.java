package kw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import fg0.k;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkw1/a;", "", "Lzf0/d;", "eventRepo", "<init>", "(Lzf0/d;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf0.d f106951a;

    static {
        new C2062a(null);
        zf0.d.a aVar = zf0.d.f204343b;
    }

    public a(zf0.d dVar) {
        dVar.getClass();
        this.f106951a = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r8 == r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r8 == r11) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, Long l14, v13.c cVar) {
        b bVar;
        v2 v2Var;
        zf0.d dVar = aVar.f106951a;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f106956e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f106956e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar, cVar);
            }
        } else {
            bVar = new b(aVar, cVar);
        }
        Object objD = bVar.f106954c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f106956e;
        if (i15 == 0) {
            r.b(objD);
            if (str != null || l14 != null) {
                if (str != null) {
                    bVar.f106952a = str;
                    bVar.f106953b = l14;
                    bVar.f106956e = 1;
                    objD = dVar.f(str, bVar);
                } else if (l14 != null) {
                    long jLongValue = l14.longValue();
                    bVar.f106952a = str;
                    bVar.f106953b = l14;
                    bVar.f106956e = 2;
                    objD = dVar.d(jLongValue, bVar);
                }
                return aVar2;
            }
            return null;
        }
        if (i15 == 1) {
            l14 = bVar.f106953b;
            str = bVar.f106952a;
            r.b(objD);
            v2Var = (v2) objD;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l14 = bVar.f106953b;
            str = bVar.f106952a;
            r.b(objD);
            v2Var = (v2) objD;
        }
        if (v2Var instanceof v2.b) {
            return (k) ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar3 = (v2.a) v2Var;
        String str2 = "Error fetching triathlon event (uuid=" + str + " id=" + l14 + "). Response Code=" + aVar3.f47384b + ", Exception=" + aVar3.f47383a;
        i2.a aVar4 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar4.getClass();
        i2.a.f(a2Var, "GetTrainablePrimaryEventUseCase", str2);
        return null;
    }

    /* JADX INFO: renamed from: kw1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkw1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2062a {
        public /* synthetic */ C2062a(j jVar) {
            this();
        }

        private C2062a() {
        }
    }
}
