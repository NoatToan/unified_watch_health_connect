package cn.bingoogolapple.bgabanner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BGABannerUtil {

    public static class a<S extends Throwable> extends Pair<Bitmap, S> {
        public a(@Nullable Bitmap bitmap, @Nullable S s) {
            super(bitmap, s);
        }
    }

    private BGABannerUtil() {
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        if (i != 0 && i2 != 0) {
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            if (i4 > i2 || i5 > i) {
                int i6 = i4 / 2;
                int i7 = i5 / 2;
                while (i6 / i3 >= i2 && i7 / i3 >= i) {
                    i3 *= 2;
                }
            }
        }
        return i3;
    }

    public static int dp2px(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static a<Throwable> getImageFromResource(@NonNull Context context, int i, int i2, int i3) throws Throwable {
        a<Throwable> aVar;
        InputStream inputStreamOpenRawResource;
        a<Throwable> aVar2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap.Config config = Bitmap.Config.RGB_565;
        ?? r2 = 0;
        try {
            try {
                try {
                    if (i2 == 0 && i3 == 0) {
                        options.inPreferredConfig = config;
                        inputStreamOpenRawResource = context.getResources().openRawResource(i);
                        aVar2 = new a<>(BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options), null);
                        inputStreamOpenRawResource.close();
                    } else {
                        options.inJustDecodeBounds = true;
                        options.inPreferredConfig = config;
                        InputStream inputStreamOpenRawResource2 = context.getResources().openRawResource(i);
                        try {
                            BitmapFactory.decodeStream(inputStreamOpenRawResource2, null, options);
                            inputStreamOpenRawResource2.reset();
                            inputStreamOpenRawResource2.close();
                            int i4 = options.outWidth;
                            int i5 = options.outHeight;
                            int resizedDimension = getResizedDimension(i2, i3, i4, i5);
                            int resizedDimension2 = getResizedDimension(i3, i2, i5, i4);
                            options.inJustDecodeBounds = false;
                            options.inSampleSize = calculateInSampleSize(options, resizedDimension, resizedDimension2);
                            options.inPreferredConfig = config;
                            inputStreamOpenRawResource = context.getResources().openRawResource(i);
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options);
                            inputStreamOpenRawResource.close();
                            if (bitmapDecodeStream == null || (bitmapDecodeStream.getWidth() <= resizedDimension && bitmapDecodeStream.getHeight() <= resizedDimension2)) {
                                aVar2 = new a<>(bitmapDecodeStream, null);
                            } else {
                                a<Throwable> aVar3 = new a<>(Bitmap.createScaledBitmap(bitmapDecodeStream, resizedDimension, resizedDimension2, true), null);
                                bitmapDecodeStream.recycle();
                                aVar2 = aVar3;
                            }
                        } catch (Exception e) {
                            e = e;
                            context = inputStreamOpenRawResource2;
                            e.printStackTrace();
                            aVar = new a<>(null, e);
                            if (context != 0) {
                                try {
                                    context.close();
                                } catch (IOException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                    return aVar;
                                }
                            }
                            return aVar;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            context = inputStreamOpenRawResource2;
                            e.printStackTrace();
                            aVar = new a<>(null, e);
                            if (context != 0) {
                                try {
                                    context.close();
                                } catch (IOException e4) {
                                    e = e4;
                                    e.printStackTrace();
                                    return aVar;
                                }
                            }
                            return aVar;
                        } catch (Throwable th) {
                            th = th;
                            r2 = inputStreamOpenRawResource2;
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    return aVar2;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = context;
                }
            } catch (Exception e7) {
                e = e7;
            } catch (OutOfMemoryError e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            context = 0;
        } catch (OutOfMemoryError e10) {
            e = e10;
            context = 0;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static ImageView getItemImageView(Context context, @DrawableRes int i, BGALocalImageSize bGALocalImageSize, ImageView.ScaleType scaleType) {
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(getScaledImageFromResource(context, i, bGALocalImageSize.getMaxWidth(), bGALocalImageSize.getMaxHeight(), bGALocalImageSize.getMinWidth(), bGALocalImageSize.getMinHeight()));
        imageView.setClickable(true);
        imageView.setScaleType(scaleType);
        return imageView;
    }

    public static int getResizedDimension(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        }
        if (i2 == 0) {
            return i;
        }
        double d = ((double) i4) / ((double) i3);
        double d2 = i2;
        return ((double) i) * d > d2 ? (int) (d2 / d) : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static Bitmap getScaledImageFromResource(@NonNull Context context, int i, int i2, int i3, float f, float f2) throws Throwable {
        a<Throwable> imageFromResource;
        do {
            imageFromResource = getImageFromResource(context, i, i2, i3);
            if (imageFromResource != null && imageFromResource.first != 0) {
                break;
            }
            i2 /= 2;
            i3 /= 2;
            if (imageFromResource == null || !(imageFromResource.second instanceof OutOfMemoryError) || i2 <= f) {
                break;
            }
        } while (i3 > f2);
        if (imageFromResource == null) {
            return null;
        }
        return (Bitmap) imageFromResource.first;
    }

    public static boolean isCollectionEmpty(Collection collection, Collection... collectionArr) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        for (Collection collection2 : collectionArr) {
            if (collection2 == null || collection2.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCollectionNotEmpty(Collection collection, Collection... collectionArr) {
        return !isCollectionEmpty(collection, collectionArr);
    }

    public static boolean isIndexNotOutOfBounds(int i, Collection collection) {
        return isCollectionNotEmpty(collection, new Collection[0]) && i < collection.size();
    }

    public static void resetPageTransformer(List<? extends View> list) {
        if (list == null) {
            return;
        }
        for (View view : list) {
            view.setVisibility(0);
            ViewCompat.setAlpha(view, 1.0f);
            ViewCompat.setPivotX(view, view.getMeasuredWidth() * 0.5f);
            ViewCompat.setPivotY(view, view.getMeasuredHeight() * 0.5f);
            ViewCompat.setTranslationX(view, 0.0f);
            ViewCompat.setTranslationY(view, 0.0f);
            ViewCompat.setScaleX(view, 1.0f);
            ViewCompat.setScaleY(view, 1.0f);
            ViewCompat.setRotationX(view, 0.0f);
            ViewCompat.setRotationY(view, 0.0f);
            ViewCompat.setRotation(view, 0.0f);
        }
    }

    public static int sp2px(Context context, float f) {
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }
}
