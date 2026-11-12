package ho2;

import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity$removeCreditCardIfCreated$isSuccessful$1", f = "PushProvMainActivity.kt", l = {551}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f84848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PushProvMainActivity pushProvMainActivity, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f84848b = pushProvMainActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f84848b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fo2.p creditCardLink;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84847a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ap2.h hVar = this.f84848b.f51164h;
        String link = null;
        if (hVar == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        this.f84847a = 1;
        g1 g1Var = hVar.E4().f205979a;
        yo2.b bVar = hVar.f11707k.get();
        if (bVar != null && (creditCardLink = bVar.getCreditCardLink()) != null) {
            link = creditCardLink.getLink();
        }
        Object objP = g1Var.p(link, this);
        return objP == aVar ? aVar : objP;
    }
}
