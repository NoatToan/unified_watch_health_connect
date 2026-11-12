package me0;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lje0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$updateAnimal$2", f = "DogsRepository.kt", l = {129}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.l<t13.d<? super a0<je0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f118051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je0.b f118052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, long j8, je0.b bVar, t13.d<? super s> dVar) {
        super(1, dVar);
        this.f118050b = wVar;
        this.f118051c = j8;
        this.f118052d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s(this.f118050b, this.f118051c, this.f118052d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<je0.c>> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118049a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.a aVarA = w.a(this.f118050b);
        this.f118049a = 1;
        Object objF = aVarA.f(this.f118051c, this.f118052d, this);
        return objF == aVar ? aVar : objF;
    }
}
