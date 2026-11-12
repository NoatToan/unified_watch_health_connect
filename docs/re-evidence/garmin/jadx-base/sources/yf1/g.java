package yf1;

import c83.a0;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentsSummaryListDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/SegmentsSummaryListDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.data.SegmentsRepo$getUserSegments$2", f = "SegmentsRepo.kt", l = {15}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements l<t13.d<? super a0<SegmentsSummaryListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f196882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f196883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f196884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, int i14, int i15, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f196882b = bVar;
        this.f196883c = i14;
        this.f196884d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f196882b, this.f196883c, this.f196884d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<SegmentsSummaryListDTO>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196881a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<SegmentsSummaryListDTO>> i0VarE = this.f196882b.f196867a.e(this.f196883c, this.f196884d);
        this.f196881a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
