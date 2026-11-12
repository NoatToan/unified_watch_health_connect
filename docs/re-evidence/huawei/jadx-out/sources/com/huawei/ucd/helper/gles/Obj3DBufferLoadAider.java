package com.huawei.ucd.helper.gles;

import android.content.Context;
import defpackage.qid;
import defpackage.qie;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes43.dex */
public class Obj3DBufferLoadAider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f23224b;
    private float[] d;
    private float[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f23223a = Executors.newFixedThreadPool(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23225c = 0;
    private int i = 0;
    private String h = "";

    public interface OnLoadListener {
        void onLoadFailed(String str);

        void onLoadOK(b bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6, types: [long] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable[]] */
    public void a(Context context, InputStream inputStream, InputStream inputStream2, InputStream inputStream3, OnLoadListener onLoadListener) {
        long jCurrentTimeMillis;
        String string = " Load Time=";
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(inputStream3, 0, onLoadListener));
        arrayList.add(new c(inputStream2, 1, onLoadListener));
        arrayList.add(new c(inputStream, 2, onLoadListener));
        try {
            this.f23223a.invokeAll(arrayList);
            qie.d(inputStream, inputStream2, inputStream3);
            jCurrentTimeMillis = System.currentTimeMillis();
            inputStream3 = new StringBuilder();
        } catch (InterruptedException e) {
            e.printStackTrace();
            qid.e("Obj3DBufferLoadAider", qid.a() + " e=" + e.getMessage());
            d(-1, e.getMessage(), onLoadListener);
            onLoadListener.onLoadFailed(e.getMessage());
            qie.d(inputStream, inputStream2, inputStream3);
            jCurrentTimeMillis = System.currentTimeMillis();
            inputStream3 = new StringBuilder();
        } finally {
            qie.d(new Closeable[]{inputStream, inputStream2, inputStream3});
            qid.e("Obj3DBufferLoadAider", qid.a() + string + (System.currentTimeMillis() - jCurrentTimeMillis2));
        }
        inputStream3.append(qid.a());
        inputStream3.append(" Load Time=");
        inputStream = jCurrentTimeMillis - jCurrentTimeMillis2;
        inputStream3.append(inputStream);
        string = inputStream3.toString();
    }

    public class c implements Callable<float[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OnLoadListener f23227a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InputStream f23228c;
        private int d;

        public c(InputStream inputStream, int i, OnLoadListener onLoadListener) {
            if (inputStream == null) {
                qid.e("Obj3DBufferLoadAider", " InputStream can not be null dataType=" + i);
                throw new RuntimeException(" InputStream can not be null dataType=" + i);
            }
            this.f23228c = inputStream;
            this.d = i;
            this.f23227a = onLoadListener;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float[] call() throws Exception {
            byte[] bArrD = d(this.f23228c);
            int length = bArrD.length;
            qid.e("Obj3DBufferLoadAider", qid.a() + " onLoadThread mDataType=" + this.d + " size=" + length);
            this.f23228c.read(bArrD, 0, length);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrD);
            byteBufferWrap.clear();
            float[] fArr = new float[byteBufferWrap.capacity() / 4];
            byteBufferWrap.asFloatBuffer().get(fArr);
            int i = this.d;
            if (i == 0) {
                Obj3DBufferLoadAider.this.d = fArr;
            } else if (i == 1) {
                Obj3DBufferLoadAider.this.e = fArr;
            } else if (i == 2) {
                Obj3DBufferLoadAider.this.f23224b = fArr;
            }
            Obj3DBufferLoadAider.this.d(1, "", this.f23227a);
            return fArr;
        }

        private byte[] d(InputStream inputStream) throws IOException {
            byte[] bArr = new byte[4096];
            if (inputStream == null) {
                return bArr;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (-1 != i) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str, OnLoadListener onLoadListener) {
        synchronized (this) {
            if (onLoadListener == null) {
                return;
            }
            this.i += i;
            this.f23225c++;
            this.h += str;
            qid.e("Obj3DBufferLoadAider", qid.a() + " onLoadThreadFinishedCount=" + this.f23225c + " onLoadThreadSucceedCount=" + this.i);
            int i2 = this.f23225c;
            if (i2 == 3 && this.i == 3) {
                onLoadListener.onLoadOK(new b());
                this.i = 0;
                this.f23225c = 0;
            } else if (i2 == 3 && this.i != 3) {
                onLoadListener.onLoadFailed(this.h);
                this.i = 0;
                this.f23225c = 0;
                this.h = "";
            }
        }
    }

    public class b {
        public b() {
        }

        public float[] d() {
            return Obj3DBufferLoadAider.this.d;
        }

        public float[] a() {
            return Obj3DBufferLoadAider.this.e;
        }

        public float[] c() {
            return Obj3DBufferLoadAider.this.f23224b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LoadResult{VertexXYZ=null? ");
            sb.append(Obj3DBufferLoadAider.this.d == null);
            sb.append(", NormalVectorXYZ=null? ");
            sb.append(Obj3DBufferLoadAider.this.e == null);
            sb.append(", TextureVertexST=null? ");
            sb.append(Obj3DBufferLoadAider.this.f23224b == null);
            sb.append('}');
            return sb.toString();
        }
    }
}
