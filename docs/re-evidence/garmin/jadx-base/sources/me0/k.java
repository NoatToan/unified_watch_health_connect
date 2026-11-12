package me0;

import c83.a0;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc83/a0;", "", "", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getBreeds$2", f = "DogsRepository.kt", l = {88}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super a0<Map<Long, ? extends String>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f118023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w wVar, String str, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f118022b = wVar;
        this.f118023c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f118022b, this.f118023c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Map<Long, ? extends String>>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118021a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.c cVarB = w.b(this.f118022b);
        this.f118021a = 1;
        Object objB = cVarB.b(this.f118023c, this);
        return objB == aVar ? aVar : objB;
    }
}
