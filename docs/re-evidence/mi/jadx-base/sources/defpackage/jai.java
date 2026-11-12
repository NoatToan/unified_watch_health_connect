package defpackage;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.text.TextUtils;
import cn.bingoogolapple.qrcode.core.QRCodeView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class jai extends AsyncTask<Void, Void, ael> {
    public static long g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera f22592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f22593b;
    public boolean c;
    public String d;
    public Bitmap e;
    public WeakReference<QRCodeView> f;

    public jai(Camera camera, byte[] bArr, QRCodeView qRCodeView, boolean z) {
        this.f22592a = camera;
        this.f22593b = bArr;
        this.f = new WeakReference<>(qRCodeView);
        this.c = z;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ael doInBackground(Void... voidArr) {
        QRCodeView qRCodeView = this.f.get();
        if (qRCodeView == null) {
            return null;
        }
        String str = this.d;
        if (str != null) {
            return qRCodeView.k(ou1.i(str));
        }
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            ael aelVarK = qRCodeView.k(bitmap);
            this.e = null;
            return aelVarK;
        }
        if (ou1.l()) {
            ou1.e("两次任务执行的时间间隔：" + (System.currentTimeMillis() - g));
            g = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ael aelVarD = d(qRCodeView);
        if (ou1.l()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (aelVarD == null || TextUtils.isEmpty(aelVarD.f929a)) {
                ou1.h("识别失败时间为：" + jCurrentTimeMillis2);
            } else {
                ou1.e("识别成功时间为：" + jCurrentTimeMillis2);
            }
        }
        return aelVarD;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(ael aelVar) {
        QRCodeView qRCodeView = this.f.get();
        if (qRCodeView == null) {
            return;
        }
        if (this.d == null && this.e == null) {
            qRCodeView.i(aelVar);
        } else {
            this.e = null;
            qRCodeView.h(aelVar);
        }
    }

    public jai c() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return this;
    }

    public final ael d(QRCodeView qRCodeView) {
        int i;
        Exception e;
        int i2;
        byte[] bArr = this.f22593b;
        if (bArr == null) {
            return null;
        }
        try {
            Camera.Size previewSize = this.f22592a.getParameters().getPreviewSize();
            i = previewSize.width;
            try {
                i2 = previewSize.height;
                try {
                    if (this.c) {
                        bArr = new byte[this.f22593b.length];
                        for (int i3 = 0; i3 < i2; i3++) {
                            for (int i4 = 0; i4 < i; i4++) {
                                bArr[(((i4 * i2) + i2) - i3) - 1] = this.f22593b[(i3 * i) + i4];
                            }
                        }
                        i = i2;
                        i2 = i;
                    }
                    return qRCodeView.l(bArr, i, i2, false);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (i != 0 && i2 != 0) {
                        try {
                            ou1.e("识别失败重试");
                            return qRCodeView.l(bArr, i, i2, true);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            return null;
                        }
                    }
                    return null;
                }
            } catch (Exception e4) {
                i2 = 0;
                e = e4;
            }
        } catch (Exception e5) {
            i = 0;
            e = e5;
            i2 = 0;
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        this.f.clear();
        this.e = null;
        this.f22593b = null;
    }
}
