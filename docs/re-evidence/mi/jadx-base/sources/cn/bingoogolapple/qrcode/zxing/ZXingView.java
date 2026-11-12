package cn.bingoogolapple.qrcode.zxing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import cn.bingoogolapple.qrcode.core.BarcodeType;
import cn.bingoogolapple.qrcode.core.QRCodeView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import defpackage.a0i;
import defpackage.ael;
import defpackage.atk;
import defpackage.cj2;
import defpackage.dag;
import defpackage.ifi;
import defpackage.n0b;
import defpackage.ou1;
import defpackage.wsk;
import defpackage.ync;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ZXingView extends QRCodeView {
    public dag p;
    public Map<DecodeHintType, Object> q;

    public ZXingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // cn.bingoogolapple.qrcode.core.QRCodeView
    public ael k(Bitmap bitmap) {
        return new ael(ifi.a(bitmap));
    }

    @Override // cn.bingoogolapple.qrcode.core.QRCodeView
    public ael l(byte[] bArr, int i, int i2, boolean z) {
        wsk wskVarC;
        Rect rectH;
        try {
            try {
                rectH = this.c.h(i2);
                try {
                    a0i a0iVar = rectH != null ? new a0i(bArr, i, i2, rectH.left, rectH.top, rectH.width(), rectH.height(), false) : new a0i(bArr, i, i2, 0, 0, i, i2, false);
                    wskVarC = this.p.c(new cj2(new n0b(a0iVar)));
                    if (wskVarC == null) {
                        try {
                            wskVarC = this.p.c(new cj2(new ync(a0iVar)));
                            if (wskVarC != null) {
                                ou1.e("GlobalHistogramBinarizer 没识别到，HybridBinarizer 能识别到");
                            }
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    wskVarC = null;
                }
            } catch (Throwable th) {
                this.p.reset();
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            wskVarC = null;
            rectH = null;
        }
        this.p.reset();
        if (wskVarC == null) {
            return null;
        }
        String strF = wskVarC.f();
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        BarcodeFormat barcodeFormatB = wskVarC.b();
        ou1.e("格式为：" + barcodeFormatB.name());
        boolean zR = r(barcodeFormatB);
        if (g() || zR) {
            atk[] atkVarArrE = wskVarC.e();
            PointF[] pointFArr = new PointF[atkVarArrE.length];
            int i3 = 0;
            for (atk atkVar : atkVarArrE) {
                pointFArr[i3] = new PointF(atkVar.c(), atkVar.d());
                i3++;
            }
            if (q(pointFArr, rectH, zR, strF)) {
                return null;
            }
        }
        return new ael(strF);
    }

    @Override // cn.bingoogolapple.qrcode.core.QRCodeView
    public void n() {
        dag dagVar = new dag();
        this.p = dagVar;
        BarcodeType barcodeType = this.i;
        if (barcodeType == BarcodeType.ONE_DIMENSION) {
            dagVar.d(ifi.f21094b);
            return;
        }
        if (barcodeType == BarcodeType.TWO_DIMENSION) {
            dagVar.d(ifi.c);
            return;
        }
        if (barcodeType == BarcodeType.ONLY_QR_CODE) {
            dagVar.d(ifi.d);
            return;
        }
        if (barcodeType == BarcodeType.ONLY_CODE_128) {
            dagVar.d(ifi.e);
            return;
        }
        if (barcodeType == BarcodeType.ONLY_EAN_13) {
            dagVar.d(ifi.f);
            return;
        }
        if (barcodeType == BarcodeType.HIGH_FREQUENCY) {
            dagVar.d(ifi.g);
        } else if (barcodeType == BarcodeType.CUSTOM) {
            dagVar.d(this.q);
        } else {
            dagVar.d(ifi.f21093a);
        }
    }

    public final boolean r(BarcodeFormat barcodeFormat) {
        return f() && barcodeFormat == BarcodeFormat.QR_CODE;
    }

    public ZXingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
