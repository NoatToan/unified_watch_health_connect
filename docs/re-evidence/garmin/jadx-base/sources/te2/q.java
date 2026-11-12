package te2;

import com.garmin.android.library.mobileauth.exception.CredentialExchangesExhaustedException;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/o;", "<anonymous>", "(Lo53/b0;)Lsc2/o;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2ITOperation$execute$2", f = "AbstractOAuth2ITOperation.kt", l = {208, 214, 220}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.o>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f164244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f164246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f164246c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f164246c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.o> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        sc2.o oVar;
        HashMap mapM;
        s sVar;
        CredentialExchangesExhaustedException credentialExchangesExhaustedException;
        sc2.o oVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164245b;
        s sVar2 = this.f164246c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f164245b = 1;
            obj = s.d(sVar2, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                oVar = (sc2.o) obj;
                if (oVar != null) {
                    sVar2.getClass();
                    return oVar;
                }
                if (sVar2.b() != null && (mapM = j2.m(sVar2.f164285f)) != null) {
                    this.f164244a = sVar2;
                    this.f164245b = 3;
                    obj = s.e(sVar2, mapM, this);
                    if (obj != aVar) {
                        sVar = sVar2;
                    }
                    return aVar;
                }
                credentialExchangesExhaustedException = new CredentialExchangesExhaustedException(sVar2.f164286g.f177691b);
                if (sVar2.f164284e) {
                    throw credentialExchangesExhaustedException;
                }
                return null;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sVar = this.f164244a;
            o13.r.b(obj);
        }
        oVar2 = (sc2.o) obj;
        if (oVar2 != null) {
            sVar.getClass();
            return oVar2;
        }
        credentialExchangesExhaustedException = new CredentialExchangesExhaustedException(sVar2.f164286g.f177691b);
        if (sVar2.f164284e) {
            return null;
        }
        throw credentialExchangesExhaustedException;
        sc2.o oVar3 = (sc2.o) obj;
        if (oVar3 != null) {
            return oVar3;
        }
        sVar2.getClass();
        dd2.a aVar2 = sVar2.f164286g.f177695f;
        sc2.j jVar = aVar2 != null ? aVar2.f59204a : null;
        sc2.m mVar = aVar2 != null ? aVar2.f59206c : null;
        this.f164245b = 2;
        obj = s.f(sVar2, jVar, mVar, this);
        if (obj != aVar) {
            oVar = (sc2.o) obj;
            if (oVar != null) {
                sVar2.getClass();
                return oVar;
            }
            if (sVar2.b() != null) {
                this.f164244a = sVar2;
                this.f164245b = 3;
                obj = s.e(sVar2, mapM, this);
                if (obj != aVar) {
                    sVar = sVar2;
                    oVar2 = (sc2.o) obj;
                    if (oVar2 != null) {
                        sVar.getClass();
                        return oVar2;
                    }
                }
            }
            credentialExchangesExhaustedException = new CredentialExchangesExhaustedException(sVar2.f164286g.f177691b);
            if (sVar2.f164284e) {
                return null;
            }
            throw credentialExchangesExhaustedException;
        }
        return aVar;
    }
}
