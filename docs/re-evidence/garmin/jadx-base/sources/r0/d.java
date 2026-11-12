package r0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import b0.g1;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.interfaces.Detector;
import java.util.List;
import java.util.Map;
import p13.h0;
import p3.p1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements k7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f148703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f148704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f148705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f148706e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f148702a = i14;
        this.f148703b = obj;
        this.f148704c = obj2;
        this.f148705d = obj3;
        this.f148706e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k7.b
    public final void accept(Object obj) {
        List list;
        switch (this.f148702a) {
            case 0:
                e eVar = (e) this.f148703b;
                g1 g1Var = (g1) this.f148704c;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f148705d;
                Surface surface = (Surface) this.f148706e;
                synchronized (g1Var.f13905a) {
                    g1Var.f13919o = null;
                    g1Var.f13920p = null;
                    break;
                }
                surfaceTexture.setOnFrameAvailableListener(null);
                surfaceTexture.release();
                surface.release();
                eVar.f148715i--;
                eVar.d();
                return;
            default:
                BarcodeScanner barcodeScanner = (BarcodeScanner) this.f148703b;
                p1 p1Var = (p1) this.f148704c;
                e23.l lVar = (e23.l) this.f148705d;
                p1 p1Var2 = (p1) this.f148706e;
                y0.b.a aVar = (y0.b.a) obj;
                if (aVar != null) {
                    Map<Detector<?>, Object> map = aVar.f192982a;
                    Preconditions.checkArgument(map.containsKey(barcodeScanner) || aVar.f192983b.containsKey(barcodeScanner), "The detector does not exist");
                    list = (List) map.get(barcodeScanner);
                } else {
                    list = null;
                }
                if (list == null || list.isEmpty() || ((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    return;
                }
                Barcode barcode = (Barcode) h0.b0(list);
                RectF rectF = (RectF) p1Var.getF182175a();
                Rect boundingBox = barcode.getBoundingBox();
                if (rectF == null || boundingBox == null || !rectF.contains(new RectF(boundingBox))) {
                    return;
                }
                p1Var2.setValue(Boolean.TRUE);
                lVar.invoke(String.valueOf(barcode.getRawValue()));
                return;
        }
    }
}
