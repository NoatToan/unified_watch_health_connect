package bi1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3SportWatchFaceSettings;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3SportWatchFaceSettings$loadActualDeviceImage$1", f = "Vivomove3SportWatchFaceSettings.kt", l = {181}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Vivomove3SportWatchFaceSettings f18055c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3SportWatchFaceSettings$loadActualDeviceImage$1$1", f = "Vivomove3SportWatchFaceSettings.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Vivomove3SportWatchFaceSettings f18056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sd2.f f18057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Vivomove3SportWatchFaceSettings vivomove3SportWatchFaceSettings, sd2.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f18056a = vivomove3SportWatchFaceSettings;
            this.f18057b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f18056a, this.f18057b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            sd2.f fVar = this.f18057b;
            Vivomove3SportWatchFaceSettings vivomove3SportWatchFaceSettings = this.f18056a;
            String strEa = vivomove3SportWatchFaceSettings.ea(fVar);
            int i14 = vivomove3SportWatchFaceSettings.f43214f;
            ImageView imageView = vivomove3SportWatchFaceSettings.f43213e;
            if (strEa != null) {
                if (imageView == null) {
                    p005kotlin.jvm.internal.s.m("imageDeviceFrame");
                    throw null;
                }
                com.bumptech.glide.j<Bitmap> jVarJ = com.bumptech.glide.b.e(vivomove3SportWatchFaceSettings.getApplicationContext()).g().J(strEa);
                p pVar = new p(imageView, i14);
                jVarJ.getClass();
                jVarJ.F(pVar, null, jVarJ, qj.e.f144968a);
            } else {
                if (imageView == null) {
                    p005kotlin.jvm.internal.s.m("imageDeviceFrame");
                    throw null;
                }
                imageView.setImageResource(i14);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Vivomove3SportWatchFaceSettings vivomove3SportWatchFaceSettings, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f18055c = vivomove3SportWatchFaceSettings;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f18055c, dVar);
        oVar.f18054b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        sd2.f fVarI;
        Vivomove3SportWatchFaceSettings vivomove3SportWatchFaceSettings = this.f18055c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18053a;
        if (i14 == 0) {
            o13.r.b(obj);
            try {
                rd2.j jVar = rd2.f.a().f152045a;
                DeviceSettingsDTO deviceSettingsDTO = vivomove3SportWatchFaceSettings.f43210b;
                if (deviceSettingsDTO == null) {
                    p005kotlin.jvm.internal.s.m("deviceSettingsDTO");
                    throw null;
                }
                long j8 = deviceSettingsDTO.f33860a;
                jVar.getClass();
                fVarI = rd2.j.i(j8, null);
                x53.c cVar = s0.f129406a;
                t1 t1Var = u53.o.f168762a;
                a aVar2 = new a(vivomove3SportWatchFaceSettings, fVarI, null);
                this.f18054b = null;
                this.f18053a = 1;
                if (ge1.b.e0(t1Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } catch (Throwable th3) {
                a2 a2Var = a2.GENERAL;
                String str = Vivomove3SportWatchFaceSettings.f43207h;
                String string = th3.toString();
                i2.f36769a.getClass();
                i2.a.f(a2Var, str, string);
                fVarI = null;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
