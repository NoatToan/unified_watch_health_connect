package ff2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.promotionlibrary.domain.CampaignRepository$retrieveActiveCampaignsFromCache$1", f = "CampaignRepository.kt", l = {225}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f71170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<List<a>, Unit> f71171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(i iVar, e23.l<? super List<a>, Unit> lVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f71170b = iVar;
        this.f71171c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f71170b, this.f71171c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f71169a;
        if (i14 == 0) {
            r.b(obj);
            df2.a aVarE = this.f71170b.f71159c.e();
            long millis = DateTime.now().getMillis();
            this.f71169a = 1;
            obj = aVarE.c(millis, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        List list = (List) obj;
        boolean zIsEmpty = list.isEmpty();
        e23.l<List<a>, Unit> lVar = this.f71171c;
        if (zIsEmpty) {
            lVar.invoke(null);
        } else {
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new a((df2.c) it.next()));
            }
            lVar.invoke(arrayList);
        }
        return Unit.INSTANCE;
    }
}
