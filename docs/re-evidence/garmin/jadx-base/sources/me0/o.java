package me0;

import c83.a0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getDogActivityTypes$2", f = "DogsRepository.kt", l = {168}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super a0<List<? extends String>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f118040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, long j8, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f118039b = wVar;
        this.f118040c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f118039b, this.f118040c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends String>>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118038a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.b bVar = (ke0.b) this.f118039b.f118068c.getValue();
        this.f118038a = 1;
        Object objA = bVar.a(this.f118040c, this);
        return objA == aVar ? aVar : objA;
    }
}
