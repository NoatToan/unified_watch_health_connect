package ff2;

import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.promotionlibrary.domain.CampaignRepository$updateCampaignInCache$1", f = "CampaignRepository.kt", l = {218}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f71179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f71180c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, a aVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f71179b = iVar;
        this.f71180c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f71179b, this.f71180c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71178a;
        if (i14 == 0) {
            r.b(obj);
            i iVar = this.f71179b;
            Logger loggerB = iVar.b();
            a aVar2 = this.f71180c;
            wr.g.w("updateCampaignInCache: ", aVar2.getCampaignId(), loggerB);
            df2.a aVarE = iVar.f71159c.e();
            df2.c cVar = new df2.c(aVar2);
            this.f71178a = 1;
            if (aVarE.d(cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
