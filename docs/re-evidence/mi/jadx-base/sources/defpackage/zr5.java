package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.WindowManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zr5 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh3 f41593b;
    public final sj3 c;
    public final dag d;
    public boolean e = true;
    public long f;

    public zr5(Context context, eh3 eh3Var, sj3 sj3Var, Map<DecodeHintType, Object> map) {
        dag dagVar = new dag();
        this.d = dagVar;
        dagVar.d(map);
        this.f41592a = context;
        this.f41593b = eh3Var;
        this.c = sj3Var;
    }

    public static void b(a0i a0iVar, Bundle bundle) {
        int[] iArrJ = a0iVar.j();
        int i = a0iVar.i();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArrJ, 0, i, i, a0iVar.h(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray("barcode_bitmap", byteArrayOutputStream.toByteArray());
        bundle.putFloat("barcode_scaled_factor", i / a0iVar.d());
    }

    public final a0i a(byte[] bArr, int i, int i2, boolean z) {
        if (!z) {
            return this.f41593b.a(bArr, i, i2);
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        return this.f41593b.a(bArr2, i2, i);
    }

    public final void c(byte[] bArr, int i, int i2, boolean z, boolean z2) throws NotFoundException {
        boolean z3;
        System.currentTimeMillis();
        a0i a0iVarA = a(bArr, i, i2, z);
        wsk wskVarC = null;
        if (a0iVarA != null) {
            try {
                wskVarC = this.d.c(new cj2(new ync(a0iVarA)));
                z3 = false;
            } catch (Exception unused) {
                z3 = true;
            }
            if (z3 && this.c.d()) {
                try {
                    wskVarC = this.d.c(new cj2(new ync(a0iVarA.e())));
                    z3 = false;
                } catch (Exception unused2) {
                    z3 = true;
                }
            }
            if (z3) {
                try {
                    wskVarC = this.d.c(new cj2(new n0b(a0iVarA)));
                    z3 = false;
                } catch (Exception unused3) {
                    z3 = true;
                }
            }
            if (z3) {
                try {
                    wskVarC = this.d.c(new cj2(new n0b(a0iVarA.e())));
                    z3 = false;
                } catch (Exception unused4) {
                    z3 = true;
                }
            }
            if (z3 && z2 && (a0iVarA = a(bArr, i, i2, !z)) != null) {
                try {
                    wskVarC = this.d.c(new cj2(new ync(a0iVarA)));
                } catch (Exception unused5) {
                }
            }
            this.d.reset();
        }
        if (wskVarC == null) {
            sj3 sj3Var = this.c;
            if (sj3Var != null) {
                Message.obtain(sj3Var, sqi.c).sendToTarget();
                return;
            }
            return;
        }
        System.currentTimeMillis();
        BarcodeFormat barcodeFormatB = wskVarC.b();
        sj3 sj3Var2 = this.c;
        if (sj3Var2 != null && sj3Var2.c() && barcodeFormatB == BarcodeFormat.QR_CODE) {
            atk[] atkVarArrE = wskVarC.e();
            if (atkVarArrE.length >= 3) {
                if (d((int) Math.max(Math.max(atk.b(atkVarArrE[0], atkVarArrE[1]), atk.b(atkVarArrE[1], atkVarArrE[2])), atk.b(atkVarArrE[0], atkVarArrE[2])), i)) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = sqi.d;
                    messageObtain.obj = wskVarC;
                    if (this.c.b()) {
                        Bundle bundle = new Bundle();
                        b(a0iVarA, bundle);
                        messageObtain.setData(bundle);
                    }
                    this.c.sendMessageDelayed(messageObtain, 300L);
                    return;
                }
            }
        }
        sj3 sj3Var3 = this.c;
        if (sj3Var3 != null) {
            Message messageObtain2 = Message.obtain(sj3Var3, sqi.d, wskVarC);
            if (this.c.b()) {
                Bundle bundle2 = new Bundle();
                b(a0iVarA, bundle2);
                messageObtain2.setData(bundle2);
            }
            messageObtain2.sendToTarget();
        }
    }

    public final boolean d(int i, int i2) {
        Camera cameraA;
        if (this.f > System.currentTimeMillis() - 1000) {
            return true;
        }
        if (i >= i2 / 5 || (cameraA = this.f41593b.f().a()) == null) {
            return false;
        }
        Camera.Parameters parameters = cameraA.getParameters();
        if (!parameters.isZoomSupported()) {
            return false;
        }
        int maxZoom = parameters.getMaxZoom();
        parameters.setZoom(Math.min(parameters.getZoom() + (maxZoom / 5), maxZoom));
        cameraA.setParameters(parameters);
        this.f = System.currentTimeMillis();
        return true;
    }

    public final boolean e() {
        Display defaultDisplay = ((WindowManager) this.f41592a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x < point.y;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws NotFoundException {
        if (message == null || !this.e) {
            return;
        }
        int i = message.what;
        if (i == sqi.f33889b) {
            c((byte[]) message.obj, message.arg1, message.arg2, e(), this.c.e());
        } else if (i == sqi.g) {
            this.e = false;
            Looper.myLooper().quit();
        }
    }
}
