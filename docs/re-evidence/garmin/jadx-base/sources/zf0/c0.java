package zf0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.EventRepo$updateEventCourseProfile$2", f = "EventRepo.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f204340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f204341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j61.f f204342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d dVar, String str, j61.f fVar, t13.d<? super c0> dVar2) {
        super(1, dVar2);
        this.f204340b = dVar;
        this.f204341c = str;
        this.f204342d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c0(this.f204340b, this.f204341c, this.f204342d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((c0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204339a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Unit>> i0VarZ = this.f204340b.f204344a.z(this.f204341c, this.f204342d);
        this.f204339a = 1;
        Object objAwait = i0VarZ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
