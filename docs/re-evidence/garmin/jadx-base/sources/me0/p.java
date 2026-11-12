package me0;

import c83.a0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lje0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getDogs$2", f = "DogsRepository.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super a0<List<? extends je0.f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f118042b = wVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f118042b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends je0.f>>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118041a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.c cVarB = w.b(this.f118042b);
        this.f118041a = 1;
        Object objC = cVarB.c(this);
        return objC == aVar ? aVar : objC;
    }
}
