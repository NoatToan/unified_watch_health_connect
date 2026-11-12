package ib0;

import com.google.accompanist.permissions.MultiplePermissionsState;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.profile.picture.ProfileImageViewModel$onCameraPermissionsButtonClicked$1", f = "ProfileImageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f92478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f92479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, e23.a<Unit> aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f92478a = gVar;
        this.f92479b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f92478a, this.f92479b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        g gVar = this.f92478a;
        p2 p2Var = gVar.f92469f;
        p2 p2Var2 = gVar.f92471h;
        MultiplePermissionsState multiplePermissionsState = (MultiplePermissionsState) p2Var.getValue();
        if (multiplePermissionsState != null) {
            boolean allPermissionsGranted = multiplePermissionsState.getAllPermissionsGranted();
            boolean shouldShowRationale = multiplePermissionsState.getShouldShowRationale();
            if (allPermissionsGranted) {
                this.f92479b.invoke();
            } else if (shouldShowRationale) {
                g.x4(gVar, jb0.b.f98104d);
            } else if (((Boolean) p2Var2.getValue()).booleanValue()) {
                gVar.z4(jb0.b.f98104d);
            } else {
                do {
                    value = p2Var2.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var2.b(value, Boolean.TRUE));
                multiplePermissionsState.launchMultiplePermissionRequest();
            }
        }
        return Unit.INSTANCE;
    }
}
