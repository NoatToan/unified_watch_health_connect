package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderCreator;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.g0;
import com.huawei.hms.scankit.p.h4;
import com.huawei.hms.scankit.p.i8;
import com.huawei.hms.scankit.p.j0;
import com.huawei.hms.scankit.p.k0;
import com.huawei.hms.scankit.p.m0;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.s6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.y6;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
final class c extends Handler {
    private static a j;
    private static long k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f15924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.scankit.a f15925c;
    private boolean d = true;
    private int e = 50;
    private Rect f;
    private int g;
    private IRemoteFrameDecoderDelegate h;
    private boolean i;

    static class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f15926a;
        private List e;
        private List f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f15927b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f15928c = false;
        private int d = 0;
        private int g = 0;
        private int h = 0;

        public a(c cVar) {
            this.f15926a = new WeakReference(cVar);
        }

        public void b(int i) {
            this.h = i;
            c cVar = (c) this.f15926a.get();
            if (cVar != null) {
                try {
                    cVar.a(this.h, this.f);
                    o4.d("DecodeHandler", "ScanCode handle global value" + this.h);
                } catch (RuntimeException e) {
                    o4.b("DecodeHandler", "RuntimeException: " + e.getMessage());
                } catch (Exception unused) {
                    o4.b("DecodeHandler", "Exception");
                }
            }
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object... objArr) {
            Log.i("ScankitDecode", "doInBackground: ");
            if (c.j.isCancelled()) {
                return null;
            }
            while (!this.f15928c) {
                if (this.f15927b) {
                    try {
                        Thread.sleep(400L);
                    } catch (InterruptedException unused) {
                        o4.d("ScankitDecode", "doInBackground  get InterruptedException  error!!!");
                    }
                    this.f15927b = false;
                } else {
                    c cVar = (c) this.f15926a.get();
                    int i = this.g;
                    if (i == 0) {
                        this.f15927b = true;
                    } else if (cVar != null) {
                        try {
                            cVar.a(this.d / i, this.e);
                            o4.d("DecodeHandler", "ScanCode handle auto value" + (this.d / this.g));
                            a();
                            this.f15927b = true;
                        } catch (RuntimeException e) {
                            o4.b("DecodeHandler", "RuntimeException: " + e.getMessage());
                        } catch (Exception unused2) {
                            o4.b("DecodeHandler", "Exception");
                        }
                    }
                }
            }
            return null;
        }

        public void a(int i) {
            this.d += i;
            this.g++;
        }

        public void a(List list, int i, int i2, boolean z) {
            if (list == null) {
                o4.a("ScankitDecode", "areas is null");
                return;
            }
            if (list.size() == 0) {
                this.f = Collections.singletonList(new k0.a(new Rect(-100, -100, 100, 100), 1000));
                return;
            }
            this.f = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Rect rect = (Rect) it.next();
                int iCenterX = ((rect.centerX() * 2000) / i) - 1000;
                int iCenterY = ((rect.centerY() * 2000) / i2) - 1000;
                int iWidth = ((rect.width() * 2000) / i) / 2;
                int iHeight = ((rect.height() * 2000) / i2) / 2;
                this.f.add(new k0.a(new Rect(iCenterX - (iWidth / 2), iCenterY - (iHeight / 2), iCenterX + iWidth, iCenterY + iHeight), 1000 / list.size()));
            }
            list.clear();
        }

        public void b(List list, int i, int i2, boolean z) {
            if (list == null) {
                o4.a("ScankitDecode", "areas is null");
                return;
            }
            if (list.size() == 0) {
                this.e = Collections.singletonList(new k0.a(new Rect(-100, -100, 100, 100), 1000));
                return;
            }
            this.e = new ArrayList();
            if (z) {
                int i3 = i2 > i ? i2 - i : i - i2;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Rect rect = (Rect) it.next();
                    int iCenterY = (((rect.centerY() + (i3 >> 1)) * 2000) / i) - 1000;
                    int iCenterX = ((rect.centerX() * 2000) / i2) - 1000;
                    int iHeight = ((rect.height() * 2000) / i) / 2;
                    int iWidth = ((rect.width() * 2000) / i2) / 2;
                    this.e.add(new k0.a(new Rect(iCenterY - (iHeight / 2), iCenterX - (iWidth / 2), iCenterY + iHeight, iCenterX + iWidth), 1000 / list.size()));
                }
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Rect rect2 = (Rect) it2.next();
                int iCenterX2 = ((rect2.centerX() * 2000) / i) - 1000;
                int iCenterY2 = ((rect2.centerY() * 2000) / i2) - 1000;
                int iWidth2 = ((rect2.width() * 2000) / i) / 2;
                int iHeight2 = ((rect2.height() * 2000) / i2) / 2;
                this.e.add(new k0.a(new Rect(iCenterX2 - (iWidth2 / 2), iCenterY2 - (iHeight2 / 2), iCenterX2 + iWidth2, iCenterY2 + iHeight2), 1000 / list.size()));
            }
            list.clear();
        }

        private void a() {
            this.d = 0;
            this.g = 0;
        }
    }

    private boolean d() {
        Context context = this.f15923a;
        if (context == null) {
            return true;
        }
        Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            o4.d("ScankitDecode", "isScreenPortrait  getSystemService  WINDOW_SERVICE  error!!!");
            return true;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x < point.y;
    }

    public boolean b(float f) {
        boolean z;
        com.huawei.hms.scankit.a aVar = this.f15925c;
        if (aVar != null && aVar.a()) {
            return false;
        }
        try {
            m0 m0VarG = this.f15924b.g();
            if (m0VarG == null) {
                o4.d("ScankitDecode", "Zoom not supported,data is null");
                return false;
            }
            int iC = m0VarG.c();
            int iB = m0VarG.b();
            List listA = m0VarG.a();
            float fIntValue = ((((Integer) listA.get(iB)).intValue() * 1.0f) / 100.0f) * f;
            if (((int) (fIntValue * 100.0f)) > ((Integer) listA.get(iC)).intValue()) {
                fIntValue = (iC * 1.0f) / 100.0f;
            }
            if (!this.f15924b.j()) {
                o4.d("ScankitDecode", "Zoom not supported");
                return false;
            }
            int iA = a(fIntValue);
            if (iA > iB) {
                this.f15924b.d(iA);
                z = true;
            } else {
                this.f15924b.d(iB);
                z = false;
            }
            this.f15924b.a(Collections.singletonList(new k0.a(new Rect(-150, -150, 150, 150), 1000)));
            return z;
        } catch (RuntimeException unused) {
            o4.b("ScankitDecode", "Zoom not supported,RuntimeException happen");
            return false;
        } catch (Exception unused2) {
            o4.b("ScankitDecode", "Zoom not supported,Exception happen");
            return false;
        }
    }

    public float c() {
        List listB = b();
        if (listB == null) {
            return 1.0f;
        }
        return Math.round(((Integer) listB.get(listB.size() - 1)).intValue() / 100.0f);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null || !this.d) {
            return;
        }
        int i = message.what;
        if (i == R.id.scankit_decode) {
            int i2 = this.g;
            if (i2 <= 1) {
                this.g = i2 + 1;
                this.f15925c.sendEmptyMessage(R.id.scankit_decode_failed);
                return;
            } else {
                Object obj = message.obj;
                if (obj instanceof byte[]) {
                    a((byte[]) obj, d());
                    return;
                }
                return;
            }
        }
        if (i != R.id.scankit_quit) {
            o4.d("ScankitDecode", "handleMessage  message.what:" + message.what);
        } else {
            this.d = false;
            a aVar = j;
            if (aVar != null) {
                aVar.f15928c = true;
                j.cancel(true);
            }
            Looper.myLooper().quit();
        }
    }

    public List b() {
        return this.f15924b.g().a();
    }

    c(Context context, j0 j0Var, com.huawei.hms.scankit.a aVar, Map map, Rect rect, boolean z) {
        this.i = false;
        this.f15923a = context;
        this.f15924b = j0Var;
        this.f15925c = aVar;
        this.f = rect;
        if (j == null) {
            a aVar2 = new a(this);
            j = aVar2;
            aVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        }
        this.g = 0;
        this.i = z;
        a(context);
    }

    private void a(s6[] s6VarArr, byte[] bArr, int i, int i2, w3.c cVar) {
        if (this.f15925c != null) {
            Message messageObtain = Message.obtain(this.f15925c, R.id.scankit_decode_succeeded, y6.a(s6VarArr));
            Log.d("ScankitDecode", "scankit decode succeed msg SCAN_MODE: FULLSDK VERSION_CODE: 21300303 VERSION_NAME: 2.13.0.303");
            try {
                if (b.I != null) {
                    b.I.a(s6VarArr[0].e(), s6VarArr[0].b(), s6VarArr[0].m());
                }
            } catch (Exception unused) {
                Log.d("ScankitDecode", "ha is null");
            }
            if (this.f15925c.c()) {
                Bundle bundle = new Bundle();
                a(bArr, i, i2, bundle);
                messageObtain.setData(bundle);
            }
            messageObtain.sendToTarget();
        }
    }

    private boolean a(float f, s6[] s6VarArr, w3.c cVar) {
        if (!b(f)) {
            return false;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = R.id.scankit_decode_succeeded;
        HmsScan[] hmsScanArrA = y6.a(s6VarArr);
        messageObtain.obj = hmsScanArrA;
        if (b.J != null) {
            b.J.a(hmsScanArrA, cVar);
        }
        this.f15925c.sendMessage(messageObtain);
        return true;
    }

    private void a(Context context) {
        Object objNewInstance;
        try {
            if (this.i) {
                Log.d("ScankitDecode", "use local decoder");
                objNewInstance = DecoderCreator.class.newInstance();
            } else {
                Log.d("ScankitDecode", "use remote decoder");
                try {
                    context = com.huawei.hms.hmsscankit.g.e(context);
                } catch (NoSuchMethodException | InvocationTargetException unused) {
                }
                Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.hms.scankit.DecoderCreator");
                context.getClassLoader().loadClass("com.huawei.hms.scankit.aiscan.common.BarcodeFormat");
                objNewInstance = clsLoadClass.newInstance();
            }
        } catch (ClassNotFoundException unused2) {
            o4.a("ScankitDecode", "ClassNotFoundException");
            objNewInstance = null;
        } catch (IllegalAccessException unused3) {
            o4.a("ScankitDecode", "IllegalAccessException");
            objNewInstance = null;
        } catch (InstantiationException unused4) {
            o4.a("ScankitDecode", "InstantiationException");
            objNewInstance = null;
        }
        try {
            if (objNewInstance instanceof IBinder) {
                this.h = IRemoteDecoderCreator.Stub.asInterface((IBinder) objNewInstance).newRemoteFrameDecoderDelegate();
            } else if (this.h == null) {
                this.h = h4.a();
            }
        } catch (RemoteException unused5) {
            o4.a("ScankitDecode", "RemoteException");
        }
    }

    private void a(byte[] bArr, boolean z) {
        s6[] s6VarArrDecode;
        s6[] s6VarArrDecode2;
        int i = this.f15924b.e().x;
        int i2 = this.f15924b.e().y;
        Context context = this.f15923a;
        int rotation = (context == null || !(context instanceof Activity)) ? 0 : ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
        if (this.f15925c != null) {
            w3.c cVarA = b.J != null ? b.J.a(false, i * i2) : null;
            Bundle bundle = new Bundle();
            bundle.putParcelable("Rect", this.f);
            Point pointB = i8.b(this.f15923a);
            if (pointB != null) {
                bundle.putParcelable("Screen", pointB);
            }
            bundle.putBoolean(DetailRect.SUPPORT_ROLLBACK, com.huawei.hms.hmsscankit.g.f13544c);
            bundle.putBoolean(DetailRect.USE_APK, com.huawei.hms.hmsscankit.g.f13542a);
            try {
                if (b.I != null) {
                    b.I.a(System.currentTimeMillis());
                }
                s6VarArrDecode = this.h.decode(bArr, i, i2, rotation, this.f15925c.b(), ObjectWrapper.wrap(bundle));
                try {
                    com.huawei.hms.hmsscankit.f.a(s6VarArrDecode);
                    if (com.huawei.hms.hmsscankit.g.a()) {
                        Log.e("ScankitDecode", "iRemoteFrameDecoderDelegate decode rollback");
                        a(this.f15923a);
                        s6VarArrDecode2 = this.h.decode(bArr, i, i2, rotation, this.f15925c.b(), ObjectWrapper.wrap(bundle));
                    } else {
                        s6VarArrDecode2 = s6VarArrDecode;
                    }
                } catch (RemoteException unused) {
                    Log.e("ScankitDecode", "RemoteException");
                }
            } catch (RemoteException unused2) {
                s6VarArrDecode = null;
            }
            if (s6VarArrDecode2 != null && s6VarArrDecode2.length > 0 && s6VarArrDecode2[0] != null) {
                if (this.f15925c.d() && s6VarArrDecode2[0].l() != 1.0f && System.currentTimeMillis() - k > 1000) {
                    o4.d("ScankitDecode", "need to zoom" + s6VarArrDecode2[0].l());
                    if (a(s6VarArrDecode2[0].l(), s6VarArrDecode2, cVarA)) {
                        k = System.currentTimeMillis();
                        return;
                    }
                }
                if (s6VarArrDecode2[0].k() == null) {
                    if (s6VarArrDecode2[0].o()) {
                        o4.d("ScankitDecode", "ScanCode need to focus area");
                        a((Rect) s6VarArrDecode2[0].d().get(0), z);
                    } else if (s6VarArrDecode2[0].n()) {
                        o4.d("ScankitDecode", "ScanCode need to globalexposure" + s6VarArrDecode2[0].h());
                        j.a(s6VarArrDecode2[0].g(), i, i2, false);
                        j.b(s6VarArrDecode2[0].h());
                    } else {
                        o4.d("ScankitDecode", "ScanCode need to exposure" + s6VarArrDecode2[0].f());
                        j.a(s6VarArrDecode2[0].f());
                        j.b(s6VarArrDecode2[0].d(), i, i2, z);
                    }
                }
                a(s6VarArrDecode2, bArr, i, i2, cVarA);
                return;
            }
            this.f15925c.sendEmptyMessage(R.id.scankit_decode_failed);
            if (b.J != null) {
                b.J.a((HmsScan[]) null, cVarA);
            }
        }
    }

    private static void a(byte[] bArr, int i, int i2, Bundle bundle) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        bundle.putByteArray("barcode_bitmap", byteArrayOutputStream.toByteArray());
        bundle.putFloat("barcode_scaled_factor", 1.0f);
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
            Log.e("ScankitDecode", "RemoteException");
        }
    }

    public void a(Rect rect, boolean z) {
        com.huawei.hms.scankit.a aVar = this.f15925c;
        if (aVar == null || !aVar.a()) {
            this.f15924b.a(rect, z);
        }
    }

    public void a(int i, List list) {
        g0 g0VarB = this.f15924b.b();
        int iB = g0VarB.b();
        int iC = g0VarB.c();
        int iA = g0VarB.a();
        if (i == 0) {
            return;
        }
        int i2 = iA + i;
        if (i2 <= iB) {
            iB = i2 < iC ? iC : i2;
        }
        this.f15924b.c(iB);
        k0 k0VarC = this.f15924b.c();
        Rect rectB = k0VarC.b();
        if (k0VarC.a() > 0) {
            if (k0VarC.a() == 1) {
                int iCenterX = rectB.centerX();
                int iCenterY = rectB.centerY();
                if (Math.sqrt(((iCenterX - ((k0.a) list.get(0)).f16176a.centerX()) * (iCenterX - ((k0.a) list.get(0)).f16176a.centerX())) + (iCenterY - ((k0.a) list.get(0)).f16176a.centerY()) + (iCenterY - ((k0.a) list.get(0)).f16176a.centerY())) > this.e) {
                    list.set(0, new k0.a(((k0.a) list.get(0)).f16176a, 1000));
                    this.f15924b.a(list.subList(0, 1));
                    return;
                }
                return;
            }
            this.f15924b.a(list);
        }
    }

    public int a(float f) {
        List listB = b();
        if (listB == null) {
            return -3;
        }
        if (listB.size() <= 0) {
            return -4;
        }
        if (Math.abs(f - 1.0f) < 1.0E-6f) {
            return 0;
        }
        if (f == c()) {
            return listB.size() - 1;
        }
        for (int i = 1; i < listB.size(); i++) {
            float f2 = 100.0f * f;
            if (((Integer) listB.get(i)).intValue() >= f2 && ((Integer) listB.get(i - 1)).intValue() <= f2) {
                return i;
            }
        }
        return -1;
    }
}
