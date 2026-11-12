package me2;

import com.google.maps.android.compose.MapUiSettings;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.google.GoogleMapComposeKt$GoogleMapContainer$9$1", f = "GoogleMapCompose.kt", l = {}, m = "invokeSuspend", v = 1)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f118234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<MapUiSettings> f118235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z14, p1<MapUiSettings> p1Var, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f118234a = z14;
        this.f118235b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f118234a, this.f118235b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<MapUiSettings> p1Var = this.f118235b;
        MapUiSettings f182175a = p1Var.getF182175a();
        boolean z14 = this.f118234a;
        p1Var.setValue(MapUiSettings.copy$default(f182175a, false, false, false, false, z14, z14, false, false, false, z14, 463, null));
        return Unit.INSTANCE;
    }
}
