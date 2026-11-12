package te2;

import com.garmin.android.library.mobileauth.exception.CredentialExchangesExhaustedException;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/j;", "<anonymous>", "(Lo53/b0;)Lsc2/j;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GetOAuth1GCCredentials$execute$2", f = "GetOAuth1GCCredentials.kt", l = {85, 86, 97, 98}, m = "invokeSuspend")
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.j>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0 f163988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sc2.j f163989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f163991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(u0 u0Var, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f163991d = u0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c1(this.f163991d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.j> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ba A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:9:0x001a, B:68:0x00e0, B:15:0x0028, B:56:0x00b6, B:58:0x00ba, B:60:0x00c8, B:63:0x00d6, B:64:0x00d9, B:71:0x00ed, B:72:0x00f4, B:18:0x0031, B:42:0x0082, B:19:0x0035, B:30:0x0058, B:32:0x005c, B:34:0x006a, B:37:0x0078, B:38:0x007b, B:44:0x0088, B:46:0x008e, B:48:0x0094, B:51:0x009e, B:53:0x00a4, B:70:0x00e6, B:27:0x004e), top: B:75:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objX;
        sc2.j jVar;
        u0 u0Var;
        sc2.j jVar2;
        j2 j2VarB;
        Object objX2;
        sc2.j jVar3;
        u0 u0Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f163990c;
        u0 u0Var3 = this.f163991d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                sc2.j jVar4 = u0Var3.f164323i;
                if (jVar4 != null && sc2.j.b(jVar4)) {
                    u0Var3.f164316c.debug("execute: returning existing 'GC1' credential");
                    return jVar4;
                }
                this.f163990c = 1;
                obj = u0.d(u0Var3, this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    jVar = this.f163989b;
                    u0Var = this.f163988a;
                    o13.r.b(obj);
                    int i15 = u0.f164318q;
                    u0Var.getClass();
                    return jVar;
                }
                if (i14 == 3) {
                    o13.r.b(obj);
                    jVar2 = (sc2.j) obj;
                    if (jVar2 != null) {
                        this.f163988a = u0Var3;
                        this.f163989b = jVar2;
                        this.f163990c = 4;
                        int i16 = u0.f164318q;
                        j2VarB = u0Var3.b();
                        if (j2VarB != null || (objX2 = j2VarB.x(u0Var3.f164319e, new sc2.k(null, jVar2, 1, null), false, this)) != aVar) {
                        }
                        if (objX2 != aVar) {
                            jVar3 = jVar2;
                            u0Var2 = u0Var3;
                        }
                        return aVar;
                    }
                    throw new CredentialExchangesExhaustedException(u0Var3.f164322h);
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jVar3 = this.f163989b;
                u0Var2 = this.f163988a;
                o13.r.b(obj);
                int i17 = u0.f164318q;
                u0Var2.getClass();
                return jVar3;
            }
            o13.r.b(obj);
            sc2.j jVar5 = (sc2.j) obj;
            if (jVar5 == null) {
                if (u0Var3.f164320f == re2.b.c.DEFAULT) {
                    HashMap mapM = u0Var3.b() != null ? j2.m(u0Var3.f164319e) : null;
                    if (mapM == null || mapM.isEmpty()) {
                        u0Var3.f164316c.warn("execute: no other apps installed");
                    } else {
                        this.f163990c = 3;
                        x53.c cVar = o53.s0.f129406a;
                        obj = ge1.b.e0(x53.b.f189152a, new y0(u0Var3, mapM, null), this);
                        if (obj != aVar) {
                            jVar2 = (sc2.j) obj;
                            if (jVar2 != null) {
                                this.f163988a = u0Var3;
                                this.f163989b = jVar2;
                                this.f163990c = 4;
                                int i18 = u0.f164318q;
                                j2VarB = u0Var3.b();
                                objX2 = j2VarB != null ? Unit.INSTANCE : Unit.INSTANCE;
                                if (objX2 != aVar) {
                                    jVar3 = jVar2;
                                    u0Var2 = u0Var3;
                                    int i19 = u0.f164318q;
                                    u0Var2.getClass();
                                    return jVar3;
                                }
                            }
                        }
                    }
                }
                throw new CredentialExchangesExhaustedException(u0Var3.f164322h);
            }
            this.f163988a = u0Var3;
            this.f163989b = jVar5;
            this.f163990c = 2;
            int i24 = u0.f164318q;
            j2 j2VarB2 = u0Var3.b();
            if (j2VarB2 == null || (objX = j2VarB2.x(u0Var3.f164319e, new sc2.k(null, jVar5, 1, null), false, this)) != aVar) {
                objX = Unit.INSTANCE;
            }
            if (objX != aVar) {
                jVar = jVar5;
                u0Var = u0Var3;
                int i110 = u0.f164318q;
                u0Var.getClass();
                return jVar;
            }
            return aVar;
        } catch (Exception e4) {
            int i25 = u0.f164318q;
            u0Var3.getClass();
            throw e4;
        }
    }
}
