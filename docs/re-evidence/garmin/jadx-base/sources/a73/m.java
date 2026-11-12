package a73;

import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import org.apache.commons.lang3.function.FailableIntConsumer;
import org.apache.commons.lang3.function.FailableRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements FailableRunnable, fa.j.a, l7.h, GCMCheckableRow.b, l0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1861c;

    public /* synthetic */ m(Object obj, int i14, int i15) {
        this.f1859a = i15;
        this.f1861c = obj;
        this.f1860b = i14;
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow.b
    public void a(View view2, boolean z14) {
        d10.e eVar = (d10.e) this.f1861c;
        boolean[] zArr = eVar.f57034a;
        int i14 = this.f1860b;
        zArr[i14] = z14;
        eVar.u(zArr, i14);
        eVar.notifyDataSetChanged();
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        v.a0.d dVar = (v.a0.d) this.f1861c;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        dVar.f173646d.getClass();
        if (v.a0.c(this.f1860b, totalCaptureResult)) {
            dVar.f173649g = 5000000000L;
        }
        return dVar.f173651i.a(totalCaptureResult);
    }

    @Override // fa.j.a
    public void invoke(Object obj) {
        int i14 = this.f1859a;
        int i15 = this.f1860b;
        Object obj2 = this.f1861c;
        switch (i14) {
            case 1:
                int i16 = androidx.media3.exoplayer.v.f9731j0;
                androidx.media3.common.d0 d0Var = ((androidx.media3.exoplayer.p0) obj2).f9318a;
                ((androidx.media3.common.z.d) obj).M0(i15);
                break;
            default:
                int i17 = androidx.media3.exoplayer.v.f9731j0;
                ((androidx.media3.common.z.d) obj).P7((androidx.media3.common.t) obj2, i15);
                break;
        }
    }

    @Override // l7.h
    public boolean perform(View view2, l7.h.a aVar) {
        return ((SideSheetBehavior) this.f1861c).lambda$createAccessibilityViewCommandForState$2(this.f1860b, view2, aVar);
    }

    @Override // org.apache.commons.lang3.function.FailableRunnable
    public void run() {
        ((FailableIntConsumer) this.f1861c).accept(this.f1860b);
    }
}
