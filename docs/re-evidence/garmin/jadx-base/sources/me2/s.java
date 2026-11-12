package me2;

import com.google.maps.android.compose.CameraPositionState;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.google.GoogleMapComposeKt$GoogleMapContainer$6$1", f = "GoogleMapCompose.kt", l = {}, m = "invokeSuspend", v = 1)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f118225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraPositionState f118226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f118227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(e23.l<? super Float, Unit> lVar, CameraPositionState cameraPositionState, p1<Boolean> p1Var, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f118225a = lVar;
        this.f118226b = cameraPositionState;
        this.f118227c = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f118225a, this.f118226b, this.f118227c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        e23.l<Float, Unit> lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (this.f118227c.getF182175a().booleanValue() && (lVar = this.f118225a) != null) {
            lVar.invoke(new Float(this.f118226b.getPosition().bearing));
        }
        return Unit.INSTANCE;
    }
}
