package z6;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a extends a7.b {

    /* JADX INFO: renamed from: z6.a$a, reason: collision with other inner class name */
    public interface InterfaceC3779a {
        void validateRequestPermissionsRequestCode(int i14);
    }

    public static class b extends SharedElementCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g0 f202575a;

        public b(g0 g0Var) {
            this.f202575a = g0Var;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
        @Override // android.app.SharedElementCallback
        public final Parcelable onCaptureSharedElementSnapshot(View view2, Matrix matrix, RectF rectF) {
            Parcelable parcelable;
            Bitmap bitmap;
            g0 g0Var = this.f202575a;
            g0Var.getClass();
            float f14 = 1048576.0f;
            if (view2 instanceof ImageView) {
                ImageView imageView = (ImageView) view2;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable == null || background != null) {
                    f14 = 1048576.0f;
                    parcelable = null;
                } else {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        parcelable = null;
                        bitmap = null;
                    } else {
                        float fMin = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
                        if ((drawable instanceof BitmapDrawable) && fMin == 1.0f) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                            parcelable = null;
                        } else {
                            int i14 = (int) (intrinsicWidth * fMin);
                            int i15 = (int) (intrinsicHeight * fMin);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            Rect bounds = drawable.getBounds();
                            int i16 = bounds.left;
                            int i17 = bounds.top;
                            parcelable = null;
                            int i18 = bounds.right;
                            int i19 = bounds.bottom;
                            drawable.setBounds(0, 0, i14, i15);
                            drawable.draw(canvas);
                            drawable.setBounds(i16, i17, i18, i19);
                            bitmap = bitmapCreateBitmap;
                        }
                    }
                    if (bitmap != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("sharedElement:snapshot:bitmap", bitmap);
                        bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                        if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                            float[] fArr = new float[9];
                            imageView.getImageMatrix().getValues(fArr);
                            bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                        }
                        return bundle;
                    }
                }
            } else {
                f14 = 1048576.0f;
                parcelable = null;
            }
            int iRound = Math.round(rectF.width());
            int iRound2 = Math.round(rectF.height());
            if (iRound <= 0 || iRound2 <= 0) {
                return parcelable;
            }
            float fMin2 = Math.min(1.0f, f14 / (iRound * iRound2));
            int i24 = (int) (iRound * fMin2);
            int i25 = (int) (iRound2 * fMin2);
            if (g0Var.f202635a == null) {
                g0Var.f202635a = new Matrix();
            }
            g0Var.f202635a.set(matrix);
            g0Var.f202635a.postTranslate(-rectF.left, -rectF.top);
            g0Var.f202635a.postScale(fMin2, fMin2);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i24, i25, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            canvas2.concat(g0Var.f202635a);
            view2.draw(canvas2);
            return bitmapCreateBitmap2;
        }

        @Override // android.app.SharedElementCallback
        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            this.f202575a.getClass();
            if (!(parcelable instanceof Bundle)) {
                if (!(parcelable instanceof Bitmap)) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap((Bitmap) parcelable);
                return imageView;
            }
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (bitmap == null) {
                return null;
            }
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap(bitmap);
            imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView2.setImageMatrix(matrix);
            }
            return imageView2;
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f202575a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
            this.f202575a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f202575a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f202575a.getClass();
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            Objects.requireNonNull(onSharedElementsReadyListener);
            this.f202575a.getClass();
            onSharedElementsReadyListener.onSharedElementsReady();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, String[] strArr, int i14) {
        HashSet hashSet = new HashSet();
        for (int i15 = 0; i15 < strArr.length; i15++) {
            if (TextUtils.isEmpty(strArr[i15])) {
                vb.h.s(am.j.o(Arrays.toString(strArr), " must not contain null or empty values", new StringBuilder("Permission request for permissions ")));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i15], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i15));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i16 = 0;
            for (int i17 = 0; i17 < strArr.length; i17++) {
                if (!hashSet.contains(Integer.valueOf(i17))) {
                    strArr2[i16] = strArr[i17];
                    i16++;
                }
            }
        }
        if (activity instanceof InterfaceC3779a) {
            ((InterfaceC3779a) activity).validateRequestPermissionsRequestCode(i14);
        }
        activity.requestPermissions(strArr, i14);
    }

    public static boolean b(Activity activity, String str) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i14 < 32 && i14 == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
