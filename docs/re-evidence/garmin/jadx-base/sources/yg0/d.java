package yg0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lah0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.feedback.FeedbackRepo$getFeedbackStateAsync$2", f = "FeedbackRepo.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<ah0.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f196904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f196905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, int i14, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f196904b = cVar;
        this.f196905c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f196904b, this.f196905c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ah0.a>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196903a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<ah0.a>> i0VarA = this.f196904b.f196902a.a(this.f196905c);
        this.f196903a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
