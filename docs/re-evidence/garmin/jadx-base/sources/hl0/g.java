package hl0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIInternationalGolf;
import java.util.ArrayList;
import java.util.Iterator;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.DeleteGolfCourseDownloadUseCase$invoke$2", f = "DeleteGolfCourseDownloadUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f84288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84289b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f84290a = w13.b.g(GDIInternationalGolf.MapType.values());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, int i14, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f84288a = fVar;
        this.f84289b = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f84288a, this.f84289b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Long l14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        w13.c cVar = a.f84290a;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            arrayList.add(new Integer(el0.a.a((GDIInternationalGolf.MapType) bVar.next())));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i14 = this.f84289b;
            f fVar = this.f84288a;
            if (!zHasNext) {
                int i15 = f.f84284d;
                fVar.getClass();
                a2 a2Var = a2.GOLF;
                String strH = am.j.h(i14, "broadcastDatabaseContentChanged: golf course removed ");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeleteGolfCourseDownloadUseCase", strH);
                ol0.a aVar2 = new ol0.a(i14, 1);
                oi2.a.f132270a.getClass();
                l73.c.b().e(aVar2);
                return Unit.INSTANCE;
            }
            int iIntValue = ((Number) it.next()).intValue();
            rd2.l lVar = fVar.f84286b;
            Integer num = new Integer(i14);
            lVar.getClass();
            sd2.h hVarI = rd2.l.i(iIntValue, num);
            if (hVarI != null && (l14 = hVarI.f158679x) != null) {
                o72.t.k(fVar.f84285a.remove(l14.longValue()));
            }
            rd2.l lVar2 = fVar.f84286b;
            Integer num2 = new Integer(i14);
            lVar2.getClass();
            try {
                qd2.a.b().f144484a.delete("golf_downloaded_course", "global_layout_id=? and map_type=?", new String[]{String.valueOf(num2), String.valueOf(iIntValue)});
            } catch (Exception e4) {
                rd2.l.f152081a.error("delete", (Throwable) e4);
            }
        }
    }
}
