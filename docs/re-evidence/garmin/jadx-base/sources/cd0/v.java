package cd0;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import androidx.camera.core.CameraControl;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSNotificationManager;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaAddCardActivity;
import com.mapbox.maps.MapView;
import com.mapbox.maps.renderer.MapboxRenderer;
import java.util.ArrayList;
import v.o1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26864d;

    public /* synthetic */ v(boolean z14, com.garmin.android.apps.connectmobile.leaderboard.challenges.y yVar, ArrayList arrayList) {
        this.f26861a = 3;
        this.f26862b = z14;
        this.f26863c = yVar;
        this.f26864d = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [v.l$c, v.m1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        com.garmin.android.apps.connectmobile.leaderboard.challenges.y.b<T> bVar;
        switch (this.f26861a) {
            case 0:
                w.N((w) this.f26863c, (bm2.d) this.f26864d, this.f26862b);
                break;
            case 1:
                ((GNCSNotificationManager) this.f26863c).lambda$postNotification$0((GNCSNotificationInfo) this.f26864d, this.f26862b);
                break;
            case 2:
                MapboxRenderer.snapshot$lambda$4((MapView.OnSnapshotReady) this.f26863c, (MapboxRenderer) this.f26864d, this.f26862b);
                break;
            case 3:
                boolean z14 = this.f26862b;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.y yVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.y) this.f26863c;
                ArrayList arrayList = (ArrayList) this.f26864d;
                if (z14 && (bVar = yVar.f37965b) != 0) {
                    bVar.Q8(arrayList);
                    break;
                }
                break;
            case 4:
                final o1 o1Var = (o1) this.f26863c;
                boolean z15 = this.f26862b;
                final androidx.concurrent.futures.b.a aVar = (androidx.concurrent.futures.b.a) this.f26864d;
                o1Var.f173948a.f173878b.f173906a.remove(o1Var.f173968u);
                o1Var.f173967t = z15;
                if (!o1Var.f173951d) {
                    aVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
                } else {
                    final long jB = o1Var.f173948a.B();
                    ?? r14 = new v.l.c() { // from class: v.m1
                        @Override // v.l.c
                        public final boolean a(TotalCaptureResult totalCaptureResult) {
                            if ((((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5) != o1Var.f173967t || !l.x(totalCaptureResult, jB)) {
                                return false;
                            }
                            aVar.b(null);
                            return true;
                        }
                    };
                    o1Var.f173968u = r14;
                    o1Var.f173948a.p(r14);
                }
                break;
            default:
                FelicaAddCardActivity felicaAddCardActivity = (FelicaAddCardActivity) this.f26863c;
                boolean z16 = this.f26862b;
                int[] iArr = (int[]) this.f26864d;
                FelicaAddCardActivity.a aVar2 = FelicaAddCardActivity.f50949l;
                androidx.fragment.app.v supportFragmentManager = felicaAddCardActivity.getSupportFragmentManager();
                androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                if (z16) {
                    aVarB.d("PAY#FN#ProvisionInfoFrag");
                }
                xn2.p.f191723f.getClass();
                iArr.getClass();
                xn2.p pVar = new xn2.p();
                Bundle bundle = new Bundle();
                bundle.putIntArray("extra.initial.charge.options", iArr);
                pVar.setArguments(bundle);
                aVarB.l(R.id.content_frame, pVar, "PAY#FN#ProvisionFrag");
                aVarB.e();
                break;
        }
    }

    public /* synthetic */ v(Object obj, boolean z14, Object obj2, int i14) {
        this.f26861a = i14;
        this.f26863c = obj;
        this.f26862b = z14;
        this.f26864d = obj2;
    }

    public /* synthetic */ v(Object obj, Object obj2, boolean z14, int i14) {
        this.f26861a = i14;
        this.f26863c = obj;
        this.f26864d = obj2;
        this.f26862b = z14;
    }
}
