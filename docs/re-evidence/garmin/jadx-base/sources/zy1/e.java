package zy1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import fg0.k;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.dashboard.EventDashBoardViewModel$getEventDetails$1", f = "EventDashBoardViewModel.kt", l = {524}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f207487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f207488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f207489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, k kVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f207488c = dVar;
        this.f207489d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f207488c, this.f207489d, dVar);
        eVar.f207487b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f207487b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207486a;
        d dVar = this.f207488c;
        if (i14 == 0) {
            r.b(obj);
            dVar.O0.j(g3.a.c(g3.f35298f));
            k kVar = this.f207489d;
            Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            String shareableEventUuid = kVar.getShareableEventUuid();
            this.f207487b = b0Var;
            this.f207486a = 1;
            obj = d.X4(dVar, l14, shareableEventUuid, this);
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
        k kVar2 = (k) obj;
        if (kVar2 != null) {
            y0<g3<k>> y0Var = dVar.O0;
            g3.f35298f.getClass();
            y0Var.j(g3.a.d(kVar2));
        } else {
            dVar.O0.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
