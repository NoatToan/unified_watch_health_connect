package uu;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesViewModel$getConnectionsWithBadge$1", f = "BadgesViewModel.kt", l = {198}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.p>>> f172779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f172780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f172782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f172784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.p>>> y0Var, q qVar, int i14, int i15, int i16, boolean z14, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f172779b = y0Var;
        this.f172780c = qVar;
        this.f172781d = i14;
        this.f172782e = i15;
        this.f172783f = i16;
        this.f172784g = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f172779b, this.f172780c, this.f172781d, this.f172782e, this.f172783f, this.f172784g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172778a;
        y0<g3<List<com.garmin.android.apps.connectmobile.badges.service.model.p>>> y0Var = this.f172779b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            av.g gVar = this.f172780c.f172741f;
            this.f172778a = 1;
            zy0.b bVar = gVar.f13087d;
            int i15 = this.f172781d;
            int i16 = this.f172782e;
            int i17 = this.f172783f;
            obj = zy0.b.b(bVar, new av.v(gVar, i15, i16, i17, null), new av.w(), this.f172784g, zy0.q.a(u0.e(new o13.p(TtmlNode.START, new Integer(i16)), new o13.p(MapboxMap.QFE_LIMIT, new Integer(i17))), zy0.a.GET_FOLLOWINGS_WITH_BADGE.f207440a, new Integer(i15)), null, this, 48);
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
        Object obj2 = ((zy0.p) obj).f207459a;
        if (obj2 instanceof v2.b) {
            u62.z.h(g3.f35298f, ((v2.b) obj2).f47386a, y0Var);
        } else {
            if (!(obj2 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            v2.a aVar2 = (v2.a) obj2;
            y0Var.j(g3.a.a(g3.f35298f, aVar2.f47383a.toString(), aVar2.f47383a, null, aVar2.f47384b, 4));
        }
        return Unit.INSTANCE;
    }
}
