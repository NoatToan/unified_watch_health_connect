package fr.greweb.reactnativeviewshot;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Base64;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import defpackage.p7q;
import defpackage.tr5;
import defpackage.zhg;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public class a implements p7q, LifecycleEventListener {
    public static final String o = "a";
    public static byte[] p = new byte[65536];
    public static final Object q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Set<Bitmap> f18106r = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f18107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f18108b;
    public final int c;
    public final String d;

    @c
    public final int e;
    public final double f;
    public final Integer g;
    public final Integer h;
    public final File i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Promise f18109k;
    public final Boolean l;
    public final ReactApplicationContext m;
    public final Activity n;

    /* JADX INFO: renamed from: fr.greweb.reactnativeviewshot.a$a, reason: collision with other inner class name */
    public class RunnableC0935a implements Runnable {
        public RunnableC0935a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.s();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zhg f18111a;

        public b(zhg zhgVar) {
            this.f18111a = zhgVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewFindViewById = a.this.c == -1 ? a.this.n.getWindow().getDecorView().findViewById(R.id.content) : this.f18111a.x(a.this.c);
            if (viewFindViewById == null) {
                String unused = a.o;
                StringBuilder sb = new StringBuilder();
                sb.append("No view found with reactTag: ");
                sb.append(a.this.c);
                new AssertionError();
                a.this.f18109k.reject(ViewShot.ERROR_UNABLE_TO_SNAPSHOT, "No view found with reactTag: " + a.this.c);
                return;
            }
            try {
                d dVar = new d(a.p);
                dVar.l(a.w(viewFindViewById));
                a.p = dVar.d();
                if (ViewShot.Results.TEMP_FILE.equals(a.this.j) && -1 == a.this.e) {
                    a.this.A(viewFindViewById);
                } else if (ViewShot.Results.TEMP_FILE.equals(a.this.j) && -1 != a.this.e) {
                    a.this.B(viewFindViewById);
                } else if (ViewShot.Results.BASE_64.equals(a.this.j) || ViewShot.Results.ZIP_BASE_64.equals(a.this.j)) {
                    a.this.y(viewFindViewById);
                } else if (ViewShot.Results.DATA_URI.equals(a.this.j)) {
                    a.this.z(viewFindViewById);
                }
            } catch (Throwable unused2) {
                String unused3 = a.o;
                a.this.f18109k.reject(ViewShot.ERROR_UNABLE_TO_SNAPSHOT, "Failed to capture view snapshot");
            }
        }
    }

    public @interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Bitmap.CompressFormat[] f18113a = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    public static class d extends ByteArrayOutputStream {
        public d(byte[] bArr) {
            super(0);
            ((ByteArrayOutputStream) this).buf = bArr;
        }

        public static int c(int i) {
            if (i >= 0) {
                return i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            throw new OutOfMemoryError();
        }

        public ByteBuffer a(int i) {
            if (((ByteArrayOutputStream) this).buf.length < i) {
                b(i);
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
        }

        public void b(int i) {
            int length = ((ByteArrayOutputStream) this).buf.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                length = c(i);
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(((ByteArrayOutputStream) this).buf, length);
        }

        public byte[] d() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public void l(int i) {
            ((ByteArrayOutputStream) this).count = i;
        }
    }

    public a(int i, String str, @c int i2, double d2, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, Promise promise) {
        this.c = i;
        this.d = str;
        this.e = i2;
        this.f = d2;
        this.g = num;
        this.h = num2;
        this.i = file;
        this.j = str2;
        this.l = bool;
        this.m = reactApplicationContext;
        this.n = activity;
        this.f18109k = promise;
        reactApplicationContext.addLifecycleEventListener(this);
        HandlerThread handlerThread = new HandlerThread("RNViewShot-Handler-Thread");
        this.f18107a = handlerThread;
        handlerThread.start();
        this.f18108b = new Handler(this.f18107a.getLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends A, A> T r(A a2) {
        return a2;
    }

    public static Bitmap u(int i, int i2) {
        synchronized (q) {
            try {
                for (Bitmap bitmap : f18106r) {
                    if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                        f18106r.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Bitmap v(int i, int i2) {
        synchronized (q) {
            try {
                for (Bitmap bitmap : f18106r) {
                    if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                        f18106r.remove(bitmap);
                        bitmap.eraseColor(0);
                        return bitmap;
                    }
                }
                return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int w(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    public static void x(Bitmap bitmap) {
        synchronized (q) {
            f18106r.add(bitmap);
        }
    }

    public final void A(View view) throws IOException {
        String string = Uri.fromFile(this.i).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.i);
        d dVar = new d(p);
        Point pointP = p(view, dVar);
        p = dVar.d();
        int size = dVar.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(pointP.x), Integer.valueOf(pointP.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(p, 0, size);
        fileOutputStream.close();
        this.f18109k.resolve(string);
    }

    public final void B(View view) throws IOException {
        p(view, new FileOutputStream(this.i));
        this.f18109k.resolve(Uri.fromFile(this.i).toString());
    }

    @Override // defpackage.p7q
    public void execute(zhg zhgVar) {
        this.f18108b.post(new b(zhgVar));
    }

    public final Matrix o(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList<View> linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        for (View view4 : linkedList) {
            canvas.save();
            int paddingTop = 0;
            float left = view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                paddingTop = view4.getPaddingTop();
            }
            float translationY = top + paddingTop + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.m.removeLifecycleEventListener(this);
        this.f18108b.post(new RunnableC0935a());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public final Point p(View view, OutputStream outputStream) throws IOException {
        try {
            tr5.d(o, tr5.b(this.n));
            return q(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    public final Point q(View view, OutputStream outputStream) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        if (this.l.booleanValue()) {
            ScrollView scrollView = (ScrollView) view;
            int height2 = 0;
            for (int i = 0; i < scrollView.getChildCount(); i++) {
                height2 += scrollView.getChildAt(i).getHeight();
            }
            height = height2;
        }
        Point point = new Point(width, height);
        Bitmap bitmapU = u(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(bitmapU);
        view.draw(canvas);
        for (View view2 : t(view)) {
            if ((view2 instanceof TextureView) && view2.getVisibility() == 0) {
                TextureView textureView = (TextureView) view2;
                textureView.setOpaque(false);
                Bitmap bitmap = textureView.getBitmap(v(view2.getWidth(), view2.getHeight()));
                int iSave = canvas.save();
                o(canvas, view, view2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                canvas.restoreToCount(iSave);
                x(bitmap);
            }
        }
        Integer num = this.g;
        if (num != null && this.h != null && (num.intValue() != width || this.h.intValue() != height)) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapU, this.g.intValue(), this.h.intValue(), true);
            x(bitmapU);
            bitmapU = bitmapCreateScaledBitmap;
        }
        int i2 = this.e;
        if (-1 == i2 && (outputStream instanceof d)) {
            int i3 = width * height * 4;
            d dVar = (d) r(outputStream);
            bitmapU.copyPixelsToBuffer(dVar.a(i3));
            dVar.l(i3);
        } else {
            bitmapU.compress(c.f18113a[i2], (int) (this.f * 100.0d), outputStream);
        }
        x(bitmapU);
        return point;
    }

    public final void s() {
        HandlerThread handlerThread = this.f18107a;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f18107a = null;
        }
    }

    public final List<View> t(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList2.addAll(t(viewGroup.getChildAt(i)));
        }
        return arrayList2;
    }

    public final void y(View view) throws IOException {
        String str;
        boolean z = -1 == this.e;
        boolean zEquals = ViewShot.Results.ZIP_BASE_64.equals(this.j);
        d dVar = new d(p);
        Point pointP = p(view, dVar);
        p = dVar.d();
        int size = dVar.size();
        String str2 = String.format(Locale.US, "%d:%d|", Integer.valueOf(pointP.x), Integer.valueOf(pointP.y));
        if (!z) {
            str2 = "";
        }
        if (zEquals) {
            Deflater deflater = new Deflater();
            deflater.setInput(p, 0, size);
            deflater.finish();
            d dVar2 = new d(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                dVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = str2 + Base64.encodeToString(dVar2.d(), 0, dVar2.size(), 2);
        } else {
            str = str2 + Base64.encodeToString(p, 0, size, 2);
        }
        this.f18109k.resolve(str);
    }

    public final void z(View view) throws IOException {
        d dVar = new d(p);
        p(view, dVar);
        p = dVar.d();
        String strEncodeToString = Base64.encodeToString(p, 0, dVar.size(), 2);
        String str = "jpg".equals(this.d) ? "jpeg" : this.d;
        this.f18109k.resolve("data:image/" + str + ";base64," + strEncodeToString);
    }
}
