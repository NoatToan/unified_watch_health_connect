package qr;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getTrailsData$1", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ps.r f146190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f146192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(ps.r rVar, t tVar, long j8, t13.d<? super e5> dVar) {
        super(2, dVar);
        this.f146190a = rVar;
        this.f146191b = tVar;
        this.f146192c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e5(this.f146190a, this.f146191b, this.f146192c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long matchedCuratedCourseId;
        ps.a1 metadataDTO;
        ps.a1 metadataDTO2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).b()) {
            ps.r rVar = this.f146190a;
            if (rVar == null || (metadataDTO2 = rVar.getMetadataDTO()) == null || (matchedCuratedCourseId = metadataDTO2.getCuratedCourseId()) == null) {
                matchedCuratedCourseId = (rVar == null || (metadataDTO = rVar.getMetadataDTO()) == null) ? null : metadataDTO.getMatchedCuratedCourseId();
            }
            if (matchedCuratedCourseId == null || matchedCuratedCourseId.longValue() != -1) {
                t tVar = this.f146191b;
                long j8 = this.f146192c;
                if (matchedCuratedCourseId == null) {
                    int i14 = t.A2;
                    tVar.getClass();
                    r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new a5(tVar, null), new r53.c2(new z4(tVar, j8, null))), new b5(tVar, j8, null)), new c5(null)), new d5(tVar, null)), androidx.lifecycle.v1.a(tVar));
                } else {
                    long jLongValue = matchedCuratedCourseId.longValue();
                    int i15 = t.A2;
                    tVar.getClass();
                    r53.s.C(new r53.u(new r53.w(new r53.m1(new r53.v(new c3(tVar, null), new r53.c2(new b3(tVar, jLongValue, j8, null))), new d3(tVar, jLongValue, null)), new e3(jLongValue, null)), new f3(tVar, null)), androidx.lifecycle.v1.a(tVar));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
