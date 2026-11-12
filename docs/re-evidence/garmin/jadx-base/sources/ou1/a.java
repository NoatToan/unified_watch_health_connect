package ou1;

import o53.s0;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lou1/a;", "", "Lax1/b;", "atpRepo", "Lax1/i;", "basicTrainingPlanRepo", "Lzf0/d;", "eventRepo", "<init>", "(Lax1/b;Lax1/i;Lzf0/d;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax1.b f133989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax1.i f133990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zf0.d f133991c;

    static {
        new C2541a(null);
    }

    public a(ax1.b bVar, ax1.i iVar, zf0.d dVar) {
        bVar.getClass();
        iVar.getClass();
        dVar.getClass();
        this.f133989a = bVar;
        this.f133990b = iVar;
        this.f133991c = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f134007d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f134007d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f134005b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f134007d;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p2 p2Var = bVar.f134004a;
            o13.r.b(obj);
            return p2Var;
        }
        o13.r.b(obj);
        p2 p2VarA = q2.a(null);
        x53.c cVar2 = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        c cVar3 = new c(p2VarA, this, null);
        bVar.f134004a = p2VarA;
        bVar.f134007d = 1;
        return ge1.b.e0(bVar2, cVar3, bVar) == aVar ? aVar : p2VarA;
    }

    /* JADX INFO: renamed from: ou1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lou1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2541a {
        public /* synthetic */ C2541a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2541a() {
        }
    }
}
