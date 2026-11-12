package ff2;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.promotionlibrary.domain.CampaignRepository$storeCampaignsToCache$1$1$1$1", f = "CampaignRepository.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f71176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f71177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, a aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f71176b = iVar;
        this.f71177c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f71176b, this.f71177c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71175a;
        a aVar2 = this.f71177c;
        i iVar = this.f71176b;
        if (i14 == 0) {
            r.b(obj);
            df2.a aVarE = iVar.f71159c.e();
            df2.c cVar = new df2.c(aVar2);
            this.f71175a = 1;
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
        iVar.e(kf2.a.CACHE_SUCCESS, aVar2.getCampaignId());
        return Unit.INSTANCE;
    }
}
