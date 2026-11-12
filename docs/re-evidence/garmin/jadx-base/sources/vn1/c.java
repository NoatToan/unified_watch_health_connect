package vn1;

import android.hardware.camera2.CameraManager;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.smartrequest.FlashBlink$execute$1", f = "FlashBlink.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f178842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f178843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f178844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f178844c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f178844c, dVar);
        cVar.f178843b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f178843b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f178842a;
        d dVar = this.f178844c;
        if (i14 == 0) {
            r.b(obj);
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                r.b(obj);
            } catch (Exception unused) {
            }
        }
        while (c0.g(b0Var)) {
            boolean z14 = dVar.f178847c;
            CameraManager cameraManager = dVar.f178845a;
            if (z14) {
                cameraManager.setTorchMode("0", false);
                dVar.f178847c = false;
            } else {
                cameraManager.setTorchMode("0", true);
                dVar.f178847c = true;
            }
            this.f178843b = b0Var;
            this.f178842a = 1;
            if (m0.b(500L, this) == aVar) {
                return aVar;
            }
        }
        if (dVar.f178847c) {
            try {
                dVar.f178845a.setTorchMode("0", false);
                dVar.f178847c = false;
            } catch (Exception unused2) {
            }
        }
        dVar.f178848d = true;
        return Unit.INSTANCE;
    }
}
