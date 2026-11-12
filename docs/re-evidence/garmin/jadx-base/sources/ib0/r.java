package ib0;

import com.google.accompanist.permissions.MultiplePermissionsState;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.picture.ProfilePictureScreenKt$ProfilePictureRoute$4$1", f = "ProfilePictureScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f92506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiplePermissionsState f92507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g gVar, MultiplePermissionsState multiplePermissionsState, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f92506a = gVar;
        this.f92507b = multiplePermissionsState;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f92506a, this.f92507b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g gVar = this.f92506a;
        gVar.getClass();
        MultiplePermissionsState multiplePermissionsState = this.f92507b;
        multiplePermissionsState.getClass();
        gVar.f92469f.k(null, multiplePermissionsState);
        return Unit.INSTANCE;
    }
}
