package or;

import a7.c;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.service.chooser.ChooserResult;
import androidx.camera.camera2.internal.compat.f;
import e23.p;
import o13.r;
import oe.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.share.GetChosenComponentPackageNameUseCase$invoke$1", f = "GetChosenComponentPackageNameUseCase.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<t<? super String>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f133324c;

    /* JADX INFO: renamed from: or.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"or/a$a", "Landroid/content/BroadcastReceiver;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2532a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t<String> f133325a;

        /* JADX WARN: Multi-variable type inference failed */
        public C2532a(t<? super String> tVar) {
            this.f133325a = tVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object parcelableExtra;
            Object parcelableExtra2;
            ComponentName selectedComponent;
            intent.getClass();
            int i14 = Build.VERSION.SDK_INT;
            String packageName = null;
            if (i14 >= 35) {
                Class clsJ = f.j();
                if (i14 >= 34) {
                    parcelableExtra2 = c.a(intent, "android.intent.extra.CHOOSER_RESULT", clsJ);
                } else {
                    parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.CHOOSER_RESULT");
                    if (!clsJ.isInstance(parcelableExtra2)) {
                        parcelableExtra2 = null;
                    }
                }
                ChooserResult chooserResultI = f.i(parcelableExtra2);
                if (chooserResultI != null && (selectedComponent = chooserResultI.getSelectedComponent()) != null) {
                    packageName = selectedComponent.getPackageName();
                }
            } else {
                if (i14 >= 34) {
                    parcelableExtra = c.a(intent, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
                } else {
                    parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                    if (!ComponentName.class.isInstance(parcelableExtra)) {
                        parcelableExtra = null;
                    }
                }
                ComponentName componentName = (ComponentName) parcelableExtra;
                if (componentName != null) {
                    packageName = componentName.getPackageName();
                }
            }
            if (packageName != null) {
                this.f133325a.i(packageName);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.f133324c = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        a aVar = new a(this.f133324c, dVar);
        aVar.f133323b = obj;
        return aVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super String> tVar, d<? super Unit> dVar) {
        return ((a) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f133323b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133322a;
        if (i14 == 0) {
            r.b(obj);
            C2532a c2532a = new C2532a(tVar);
            b bVar = this.f133324c;
            a7.b.registerReceiver(bVar.f133326a, c2532a, new IntentFilter("ACTIVITY_DETAILS_SHARE_APP_PICKED"), 4);
            j jVar = new j(10, bVar, c2532a);
            this.f133323b = null;
            this.f133322a = 1;
            if (q53.r.a(tVar, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
