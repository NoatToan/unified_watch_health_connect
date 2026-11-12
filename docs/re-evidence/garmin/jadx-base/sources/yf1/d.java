package yf1;

import c83.a0;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/segments/model/SegmentDetailsDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.data.SegmentsRepo$getSegmentDetailsWithElevation$2", f = "SegmentsRepo.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements l<t13.d<? super a0<SegmentDetailsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f196872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f196873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f196874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, Boolean bool, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f196872b = bVar;
        this.f196873c = str;
        this.f196874d = bool;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f196872b, this.f196873c, this.f196874d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<SegmentDetailsDTO>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196871a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<SegmentDetailsDTO>> i0VarD = this.f196872b.f196867a.d(this.f196873c, this.f196874d);
        this.f196871a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
