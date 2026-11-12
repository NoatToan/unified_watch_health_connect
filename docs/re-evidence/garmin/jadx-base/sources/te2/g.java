package te2;

import com.garmin.android.library.mobileauth.exception.CredentialExchangesExhaustedException;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/m;", "<anonymous>", "(Lo53/b0;)Lsc2/m;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation$execute$2", f = "AbstractOAuth2DIOperation.kt", l = {229, 235, 242}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.m>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f164029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f164030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f164031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f164031c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f164031c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.m> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        sc2.m mVar;
        HashMap mapM;
        j jVar;
        CredentialExchangesExhaustedException credentialExchangesExhaustedException;
        sc2.m mVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164030b;
        j jVar2 = this.f164031c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f164030b = 1;
            obj = j.d(jVar2, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                mVar = (sc2.m) obj;
                if (mVar != null) {
                    jVar2.getClass();
                    return mVar;
                }
                if (!jVar2.f164106k && jVar2.b() != null && (mapM = j2.m(jVar2.f164101f)) != null) {
                    this.f164029a = jVar2;
                    this.f164030b = 3;
                    obj = j.e(jVar2, mapM, this);
                    if (obj != aVar) {
                        jVar = jVar2;
                    }
                    return aVar;
                }
                credentialExchangesExhaustedException = new CredentialExchangesExhaustedException(jVar2.f164105j);
                if (jVar2.f164100e) {
                    throw credentialExchangesExhaustedException;
                }
                return null;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jVar = this.f164029a;
            o13.r.b(obj);
        }
        mVar2 = (sc2.m) obj;
        if (mVar2 != null) {
            jVar.getClass();
            return mVar2;
        }
        credentialExchangesExhaustedException = new CredentialExchangesExhaustedException(jVar2.f164105j);
        if (jVar2.f164100e) {
            return null;
        }
        throw credentialExchangesExhaustedException;
        sc2.m mVar3 = (sc2.m) obj;
        if (mVar3 != null) {
            return mVar3;
        }
        jVar2.getClass();
        dd2.a aVar2 = jVar2.f164102g;
        sc2.j jVar3 = aVar2.f59204a;
        sc2.o oVar = aVar2.f59205b;
        this.f164030b = 2;
        obj = j.f(jVar2, jVar3, oVar, this);
        if (obj != aVar) {
            mVar = (sc2.m) obj;
            if (mVar != null) {
                jVar2.getClass();
                return mVar;
            }
            if (!jVar2.f164106k) {
                this.f164029a = jVar2;
                this.f164030b = 3;
                obj = j.e(jVar2, mapM, this);
                if (obj != aVar) {
                    jVar = jVar2;
                    mVar2 = (sc2.m) obj;
                    if (mVar2 != null) {
                        jVar.getClass();
                        return mVar2;
                    }
                }
            }
            credentialExchangesExhaustedException = new CredentialExchangesExhaustedException(jVar2.f164105j);
            if (jVar2.f164100e) {
                return null;
            }
            throw credentialExchangesExhaustedException;
        }
        return aVar;
    }
}
