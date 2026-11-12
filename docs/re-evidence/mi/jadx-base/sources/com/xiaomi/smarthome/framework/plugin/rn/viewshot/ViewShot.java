package com.xiaomi.smarthome.framework.plugin.rn.viewshot;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.util.Base64;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.p7q;
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
public class ViewShot implements p7q {
    private static final int ARGB_SIZE = 4;
    public static final String ERROR_UNABLE_TO_SNAPSHOT = "E_UNABLE_TO_SNAPSHOT";
    private static final int PREALLOCATE_SIZE = 65536;
    private static final String TAG = "ViewShot";
    private final Activity currentActivity;
    private final String extension;

    @Formats
    private final int format;
    private final Integer height;
    private final File output;
    private final Promise promise;
    private final double quality;
    private final ReactApplicationContext reactContext;

    @Results
    private final String result;
    private final Boolean snapshotContentContainer;
    private final int tag;
    private final Integer width;
    private static byte[] outputBuffer = new byte[65536];
    private static final Object guardBitmaps = new Object();
    private static final Set<Bitmap> weakBitmaps = Collections.newSetFromMap(new WeakHashMap());

    public @interface Formats {
        public static final int JPEG = 0;
        public static final int PNG = 1;
        public static final int RAW = -1;
        public static final int WEBP = 2;
        public static final Bitmap.CompressFormat[] mapping = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    public @interface Results {
        public static final String BASE_64 = "base64";
        public static final String DATA_URI = "data-uri";
        public static final String TEMP_FILE = "tmpfile";
        public static final String ZIP_BASE_64 = "zip-base64";
    }

    public static class ReusableByteArrayOutputStream extends ByteArrayOutputStream {
        private static final int MAX_ARRAY_SIZE = 2147483639;

        public ReusableByteArrayOutputStream(byte[] bArr) {
            super(0);
            ((ByteArrayOutputStream) this).buf = bArr;
        }

        public static int hugeCapacity(int i) {
            if (i < 0) {
                throw new OutOfMemoryError();
            }
            if (i > MAX_ARRAY_SIZE) {
                return Integer.MAX_VALUE;
            }
            return MAX_ARRAY_SIZE;
        }

        public ByteBuffer asBuffer(int i) {
            if (((ByteArrayOutputStream) this).buf.length < i) {
                grow(i);
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
        }

        public void grow(int i) {
            int length = ((ByteArrayOutputStream) this).buf.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - MAX_ARRAY_SIZE > 0) {
                length = hugeCapacity(i);
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(((ByteArrayOutputStream) this).buf, length);
        }

        public byte[] innerBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public void setSize(int i) {
            ((ByteArrayOutputStream) this).count = i;
        }
    }

    public ViewShot(int i, String str, @Formats int i2, double d, Integer num, Integer num2, File file, @Results String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, Promise promise) {
        this.tag = i;
        this.extension = str;
        this.format = i2;
        this.quality = d;
        this.width = num;
        this.height = num2;
        this.output = file;
        this.result = str2;
        this.snapshotContentContainer = bool;
        this.reactContext = reactApplicationContext;
        this.currentActivity = activity;
        this.promise = promise;
    }

    private Matrix applyTransformations(Canvas canvas, View view, View view2) {
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

    private Point captureView(View view, OutputStream outputStream) throws IOException {
        try {
            DebugViews.longDebug(TAG, DebugViews.logViewHierarchy(this.currentActivity));
            return captureViewImpl(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    private Point captureViewImpl(View view, OutputStream outputStream) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (this.snapshotContentContainer.booleanValue()) {
            if (width <= 0) {
                throw new RuntimeException("Impossible to snapshot the view: view is invalid");
            }
        } else if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        boolean z = false;
        if (this.snapshotContentContainer.booleanValue()) {
            ViewGroup viewGroup = (ViewGroup) view;
            int height2 = 0;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                height2 += viewGroup.getChildAt(i).getHeight();
            }
            height = height2;
        }
        Point point = new Point(width, height);
        Bitmap bitmapForScreenshot = getBitmapForScreenshot(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(bitmapForScreenshot);
        if (this.snapshotContentContainer.booleanValue()) {
            if (this.format == 1) {
                canvas.drawColor(0);
            } else {
                canvas.drawColor(-1);
            }
            ((ViewGroup) view).getChildAt(0).draw(canvas);
        } else {
            view.draw(canvas);
        }
        for (View view2 : getAllChildren(view)) {
            if ((view2 instanceof TextureView) && view2.getVisibility() == 0) {
                TextureView textureView = (TextureView) view2;
                textureView.setOpaque(z);
                Bitmap bitmap = textureView.getBitmap(getExactBitmapForScreenshot(view2.getWidth(), view2.getHeight()));
                int iSave = canvas.save();
                applyTransformations(canvas, view, view2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                canvas.restoreToCount(iSave);
                recycleBitmap(bitmap);
                z = false;
            }
        }
        Integer num = this.width;
        if (num != null && this.height != null && (num.intValue() != width || this.height.intValue() != height)) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapForScreenshot, this.width.intValue(), this.height.intValue(), true);
            recycleBitmap(bitmapForScreenshot);
            bitmapForScreenshot = bitmapCreateScaledBitmap;
        }
        int i2 = this.format;
        if (-1 == i2 && (outputStream instanceof ReusableByteArrayOutputStream)) {
            int i3 = width * height * 4;
            ReusableByteArrayOutputStream reusableByteArrayOutputStream = (ReusableByteArrayOutputStream) cast(outputStream);
            bitmapForScreenshot.copyPixelsToBuffer(reusableByteArrayOutputStream.asBuffer(i3));
            reusableByteArrayOutputStream.setSize(i3);
        } else {
            bitmapForScreenshot.compress(Formats.mapping[i2], (int) (this.quality * 100.0d), outputStream);
        }
        recycleBitmap(bitmapForScreenshot);
        return point;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends A, A> T cast(A a2) {
        return a2;
    }

    private List<View> getAllChildren(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            arrayList2.addAll(getAllChildren(viewGroup.getChildAt(i)));
        }
        return arrayList2;
    }

    private static Bitmap getBitmapForScreenshot(int i, int i2) {
        synchronized (guardBitmaps) {
            try {
                for (Bitmap bitmap : weakBitmaps) {
                    if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                        weakBitmaps.remove(bitmap);
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

    private static Bitmap getExactBitmapForScreenshot(int i, int i2) {
        synchronized (guardBitmaps) {
            try {
                for (Bitmap bitmap : weakBitmaps) {
                    if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                        weakBitmaps.remove(bitmap);
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

    private static int proposeSize(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    private static void recycleBitmap(Bitmap bitmap) {
        synchronized (guardBitmaps) {
            weakBitmaps.add(bitmap);
        }
    }

    private void saveToBase64String(View view) throws IOException {
        String str;
        boolean z = -1 == this.format;
        boolean zEquals = Results.ZIP_BASE_64.equals(this.result);
        ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(outputBuffer);
        Point pointCaptureView = captureView(view, reusableByteArrayOutputStream);
        outputBuffer = reusableByteArrayOutputStream.innerBuffer();
        int size = reusableByteArrayOutputStream.size();
        String str2 = String.format(Locale.US, "%d:%d|", Integer.valueOf(pointCaptureView.x), Integer.valueOf(pointCaptureView.y));
        if (!z) {
            str2 = "";
        }
        if (zEquals) {
            Deflater deflater = new Deflater();
            deflater.setInput(outputBuffer, 0, size);
            deflater.finish();
            ReusableByteArrayOutputStream reusableByteArrayOutputStream2 = new ReusableByteArrayOutputStream(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                reusableByteArrayOutputStream2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = str2 + Base64.encodeToString(reusableByteArrayOutputStream2.innerBuffer(), 0, reusableByteArrayOutputStream2.size(), 2);
        } else {
            str = str2 + Base64.encodeToString(outputBuffer, 0, size, 2);
        }
        this.promise.resolve(str);
    }

    private void saveToDataUriString(View view) throws IOException {
        ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(outputBuffer);
        captureView(view, reusableByteArrayOutputStream);
        outputBuffer = reusableByteArrayOutputStream.innerBuffer();
        String strEncodeToString = Base64.encodeToString(outputBuffer, 0, reusableByteArrayOutputStream.size(), 2);
        String str = "jpg".equals(this.extension) ? "jpeg" : this.extension;
        this.promise.resolve("data:image/" + str + ";base64," + strEncodeToString);
    }

    private void saveToRawFileOnDevice(View view) throws IOException {
        String string = Uri.fromFile(this.output).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.output);
        ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(outputBuffer);
        Point pointCaptureView = captureView(view, reusableByteArrayOutputStream);
        outputBuffer = reusableByteArrayOutputStream.innerBuffer();
        int size = reusableByteArrayOutputStream.size();
        fileOutputStream.write(String.format(Locale.US, "%d:%d|", Integer.valueOf(pointCaptureView.x), Integer.valueOf(pointCaptureView.y)).getBytes(Charset.forName("US-ASCII")));
        fileOutputStream.write(outputBuffer, 0, size);
        fileOutputStream.close();
        this.promise.resolve(string);
    }

    private void saveToTempFileOnDevice(View view) throws IOException {
        captureView(view, new FileOutputStream(this.output));
        this.promise.resolve(Uri.fromFile(this.output).toString());
    }

    @Override // defpackage.p7q
    public void execute(zhg zhgVar) {
        int i = this.tag;
        View viewFindViewById = i == -1 ? this.currentActivity.getWindow().getDecorView().findViewById(R.id.content) : zhgVar.x(i);
        if (viewFindViewById == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No view found with reactTag: ");
            sb.append(this.tag);
            new AssertionError();
            this.promise.reject(ERROR_UNABLE_TO_SNAPSHOT, "No view found with reactTag: " + this.tag);
            return;
        }
        try {
            ReusableByteArrayOutputStream reusableByteArrayOutputStream = new ReusableByteArrayOutputStream(outputBuffer);
            reusableByteArrayOutputStream.setSize(proposeSize(viewFindViewById));
            outputBuffer = reusableByteArrayOutputStream.innerBuffer();
            if (Results.TEMP_FILE.equals(this.result) && -1 == this.format) {
                saveToRawFileOnDevice(viewFindViewById);
            } else if (Results.TEMP_FILE.equals(this.result) && -1 != this.format) {
                saveToTempFileOnDevice(viewFindViewById);
            } else if (Results.BASE_64.equals(this.result) || Results.ZIP_BASE_64.equals(this.result)) {
                saveToBase64String(viewFindViewById);
            } else if (Results.DATA_URI.equals(this.result)) {
                saveToDataUriString(viewFindViewById);
            }
        } catch (Throwable unused) {
            this.promise.reject(ERROR_UNABLE_TO_SNAPSHOT, "Failed to capture view snapshot");
        }
    }
}
