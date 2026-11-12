package qm0;

import android.content.Context;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.BaseGroupFeedViewModel$refreshActivityItem$1", f = "BaseGroupFeedViewModel.kt", l = {268}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f145544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f145545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f145546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f145547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, String str, Context context, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f145545c = pVar;
        this.f145546d = str;
        this.f145547e = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r rVar = new r(this.f145545c, this.f145546d, this.f145547e, dVar);
        rVar.f145544b = obj;
        return rVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f145544b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145543a;
        p pVar = this.f145545c;
        if (i14 == 0) {
            o13.r.b(obj);
            pVar.f145531g.j(s51.e.LOADING);
            ym0.a aVar2 = pVar.f145528d;
            String strValueOf = String.valueOf(pVar.f145526b);
            this.f145544b = b0Var;
            this.f145543a = 1;
            aVar2.getClass();
            obj = f0.J(aVar2, new ym0.s(aVar2, strValueOf, this.f145546d, null), this);
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
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Load activity feed failed with exception: ");
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
            ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) ((v2.b) v2Var).f47386a;
            Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = activityListItemDTO.Y1;
            GroupDTO.c cVar = pVar.f145527c;
            y0<s51.e> y0Var = pVar.f145531g;
            wg0.a aVarY4 = pVar.y4(this.f145547e, activityListItemDTO, map, cVar);
            if (aVarY4 == null) {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.p(a2Var2, "BaseGroupFeedViewModel", "Convert ActivityListItemDTO to ActivityFeed failed, get null converted feed");
                y0Var.j(s51.e.FAILED);
                return Unit.INSTANCE;
            }
            pVar.H4(aVarY4);
            y0Var.j(s51.e.LOADED);
        }
        return Unit.INSTANCE;
    }
}
