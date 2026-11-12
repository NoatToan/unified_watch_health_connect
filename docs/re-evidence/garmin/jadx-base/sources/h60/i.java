package h60;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.criticalswimspeed.summary.CriticalSwimSpeedReportsViewModel$deleteCriticalSwimSpeedRecord$1", f = "CriticalSwimSpeedReportsViewModel.kt", l = {141}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f82189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f82190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f82191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f82192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, DateTime dateTime, Long l14, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f82190c = hVar;
        this.f82191d = dateTime;
        this.f82192e = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f82190c, this.f82191d, this.f82192e, dVar);
        iVar.f82189b = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        b0 b0Var = (b0) this.f82189b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f82188a;
        h hVar = this.f82190c;
        if (i14 == 0) {
            r.b(obj);
            q60.b bVar = hVar.f82166b;
            long jLongValue = this.f82192e.longValue();
            this.f82189b = b0Var;
            this.f82188a = 1;
            obj = bVar.b(this.f82191d, jLongValue, this);
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
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            hVar.f82167c.debug(h.f82164j + " - Successfully deleted critical swim speed record");
            p2 p2Var = hVar.f82169e;
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, j.a((j) value3, null, null, 5)));
            hVar.f82171g.g();
            hVar.f82172h.g();
            hVar.f82173i.g();
        } else if (v2Var instanceof v2.a) {
            Logger logger = hVar.f82167c;
            p2 p2Var2 = hVar.f82169e;
            logger.error(h.f82164j + " - Error " + v2Var + " while deleting critical swim speed");
            v2.a aVar2 = (v2.a) v2Var;
            Integer num = aVar2.f47384b;
            if (num != null && num.intValue() == 400) {
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, j.a((j) value2, null, new fw.j(), 1)));
            } else {
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, j.a((j) value, null, null, 5)));
                String str = h.f82164j;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar2.f47383a, "Failed to delete critical swim speed record with error: ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, str, strD);
            }
        }
        return Unit.INSTANCE;
    }
}
