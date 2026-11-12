package me2;

import com.google.maps.android.compose.MapProperties;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.google.GoogleMapComposeKt$GoogleMapContainer$7$1", f = "GoogleMapCompose.kt", l = {}, m = "invokeSuspend", v = 1)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f118228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<MapProperties> f118229b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z14, p1<MapProperties> p1Var, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f118228a = z14;
        this.f118229b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t(this.f118228a, this.f118229b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<MapProperties> p1Var = this.f118229b;
        p1Var.setValue(MapProperties.copy$default(p1Var.getF182175a(), false, false, this.f118228a, false, null, null, null, 0.0f, 0.0f, 507, null));
        return Unit.INSTANCE;
    }
}
