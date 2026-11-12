package aq1;

import i3.e5;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import z10.d1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksRepositoryImpl$updateUserLocation$result$1", f = "StartupChecksRepositoryImpl.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f12440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, j jVar, t13.d<? super v> dVar) {
        super(1, dVar);
        this.f12439b = str;
        this.f12440c = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v(this.f12439b, this.f12440c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((v) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f12438a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        d1.f200951a.getClass();
        d20.c cVarD = d1.d(this.f12439b);
        Locale locale = Locale.getDefault();
        o53.i0<c83.a0<Unit>> i0VarG = this.f12440c.f12387a.g(cVarD, e5.g(locale.getLanguage(), "-", locale.getCountry()));
        this.f12438a = 1;
        Object objAwait = i0VarG.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
