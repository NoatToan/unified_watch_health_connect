package qm0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.BaseGroupFeedViewModel$requestDeleteAnnouncement$1", f = "BaseGroupFeedViewModel.kt", l = {126}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f145555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f145556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupAnnouncementDTO f145557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f145558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p pVar, GroupAnnouncementDTO groupAnnouncementDTO, e23.a<Unit> aVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f145556c = pVar;
        this.f145557d = groupAnnouncementDTO;
        this.f145558e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f145556c, this.f145557d, this.f145558e, dVar);
        tVar.f145555b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f145555b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145554a;
        p pVar = this.f145556c;
        if (i14 == 0) {
            o13.r.b(obj);
            ym0.a aVar2 = pVar.f145528d;
            GroupAnnouncementDTO groupAnnouncementDTO = this.f145557d;
            String str = groupAnnouncementDTO.f31503b;
            str.getClass();
            String str2 = groupAnnouncementDTO.f31502a;
            str2.getClass();
            this.f145555b = b0Var;
            this.f145554a = 1;
            aVar2.getClass();
            obj = aVar2.C(new ym0.h(aVar2, str, str2, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "deleteAnnouncement failed: ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.p(a2Var, "BaseGroupFeedViewModel", strD);
            pVar.f145531g.j(s51.e.FAILED);
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            pVar.f145531g.j(s51.e.LOADED);
            this.f145558e.invoke();
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var2, "BaseGroupFeedViewModel", "request delete announcement success");
        }
        return Unit.INSTANCE;
    }
}
