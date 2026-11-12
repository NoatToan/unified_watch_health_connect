package me0;

import c83.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lje0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domaindogs.data.repository.DogsRepository$getAnimalProfile$2", f = "DogsRepository.kt", l = {100}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super a0<je0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f118020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w wVar, long j8, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f118019b = wVar;
        this.f118020c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f118019b, this.f118020c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<je0.c>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118018a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ke0.a aVarA = w.a(this.f118019b);
        this.f118018a = 1;
        Object objC = aVarA.c(this.f118020c, this);
        return objC == aVar ? aVar : objC;
    }
}
