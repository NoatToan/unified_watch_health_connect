package qo1;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.repo.ActivityRepo$removeVideo$2", f = "ActivityRepo.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f145958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f145959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, long j8, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f145958b = aVar;
        this.f145959c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f145958b, this.f145959c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<String>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145957a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<String>> i0VarQ = this.f145958b.f145956a.q(this.f145959c, new ps.g(new s(null, 1, null)));
        this.f145957a = 1;
        Object objAwait = i0VarQ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
