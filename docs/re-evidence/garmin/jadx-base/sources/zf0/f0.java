package zf0;

import java.util.List;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfg0/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.EventRepo$uploadEventImage2$2", f = "EventRepo.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.l<t13.d<? super c83.a0<fg0.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f204365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f204366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<MultipartBody.Part> f204367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d dVar, long j8, List<MultipartBody.Part> list, t13.d<? super f0> dVar2) {
        super(1, dVar2);
        this.f204365b = dVar;
        this.f204366c = j8;
        this.f204367d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f0(this.f204365b, this.f204366c, this.f204367d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<fg0.m>> dVar) {
        return ((f0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204364a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<fg0.m>> i0VarS = this.f204365b.f204344a.s(this.f204366c, this.f204367d);
        this.f204364a = 1;
        Object objAwait = i0VarS.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
