package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class ImageLoader {
    private final RequestQueue a;
    private final ImageCache c;
    private Runnable g;
    private int b = 100;
    private final HashMap<String, e> d = new HashMap<>();
    private final HashMap<String, e> e = new HashMap<>();
    private final Handler f = new Handler(Looper.getMainLooper());

    public interface ImageCache {
        Bitmap getBitmap(String str);

        void putBitmap(String str, Bitmap bitmap);
    }

    public class ImageContainer {
        private Bitmap a;
        private final ImageListener b;
        private final String c;
        private final String d;

        public ImageContainer(Bitmap bitmap, String str, String str2, ImageListener imageListener) {
            this.a = bitmap;
            this.d = str;
            this.c = str2;
            this.b = imageListener;
        }

        public void cancelRequest() {
            if (this.b == null) {
                return;
            }
            e eVar = (e) ImageLoader.this.d.get(this.c);
            if (eVar != null) {
                if (eVar.f(this)) {
                    ImageLoader.this.d.remove(this.c);
                    return;
                }
                return;
            }
            e eVar2 = (e) ImageLoader.this.e.get(this.c);
            if (eVar2 != null) {
                eVar2.f(this);
                if (eVar2.d.size() == 0) {
                    ImageLoader.this.e.remove(this.c);
                }
            }
        }

        public Bitmap getBitmap() {
            return this.a;
        }

        public String getRequestUrl() {
            return this.d;
        }
    }

    public interface ImageListener extends Response.ErrorListener {
        void onResponse(ImageContainer imageContainer, boolean z);
    }

    public static class a implements ImageListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ int c;

        public a(int i, ImageView imageView, int i2) {
            this.a = i;
            this.b = imageView;
            this.c = i2;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            int i = this.a;
            if (i != 0) {
                this.b.setImageResource(i);
            }
        }

        @Override // com.android.volley.toolbox.ImageLoader.ImageListener
        public void onResponse(ImageContainer imageContainer, boolean z) {
            if (imageContainer.getBitmap() != null) {
                this.b.setImageBitmap(imageContainer.getBitmap());
                return;
            }
            int i = this.c;
            if (i != 0) {
                this.b.setImageResource(i);
            }
        }
    }

    public class b implements Response.Listener<Bitmap> {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.android.volley.Response.Listener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Bitmap bitmap) {
            ImageLoader.this.onGetImageSuccess(this.a, bitmap);
        }
    }

    public class c implements Response.ErrorListener {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            ImageLoader.this.onGetImageError(this.a, volleyError);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (e eVar : ImageLoader.this.e.values()) {
                for (ImageContainer imageContainer : eVar.d) {
                    if (imageContainer.b != null) {
                        if (eVar.e() == null) {
                            imageContainer.a = eVar.b;
                            imageContainer.b.onResponse(imageContainer, false);
                        } else {
                            imageContainer.b.onErrorResponse(eVar.e());
                        }
                    }
                }
            }
            ImageLoader.this.e.clear();
            ImageLoader.this.g = null;
        }
    }

    public class e {
        private final Request<?> a;
        private Bitmap b;
        private VolleyError c;
        private final LinkedList<ImageContainer> d;

        public e(Request<?> request, ImageContainer imageContainer) {
            LinkedList<ImageContainer> linkedList = new LinkedList<>();
            this.d = linkedList;
            this.a = request;
            linkedList.add(imageContainer);
        }

        public void d(ImageContainer imageContainer) {
            this.d.add(imageContainer);
        }

        public VolleyError e() {
            return this.c;
        }

        public boolean f(ImageContainer imageContainer) {
            this.d.remove(imageContainer);
            if (this.d.size() != 0) {
                return false;
            }
            this.a.cancel();
            return true;
        }

        public void g(VolleyError volleyError) {
            this.c = volleyError;
        }
    }

    public ImageLoader(RequestQueue requestQueue, ImageCache imageCache) {
        this.a = requestQueue;
        this.c = imageCache;
    }

    private void d(String str, e eVar) {
        this.e.put(str, eVar);
        if (this.g == null) {
            d dVar = new d();
            this.g = dVar;
            this.f.postDelayed(dVar, this.b);
        }
    }

    private static String e(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    private void f() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    public static ImageListener getImageListener(ImageView imageView, int i, int i2) {
        return new a(i2, imageView, i);
    }

    public ImageContainer get(String str, ImageListener imageListener) {
        return get(str, imageListener, 0, 0);
    }

    public boolean isCached(String str, int i, int i2) {
        return isCached(str, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    public Request<Bitmap> makeImageRequest(String str, int i, int i2, ImageView.ScaleType scaleType, String str2) {
        return new ImageRequest(str, new b(str2), i, i2, scaleType, Bitmap.Config.RGB_565, new c(str2));
    }

    public void onGetImageError(String str, VolleyError volleyError) {
        e eVarRemove = this.d.remove(str);
        if (eVarRemove != null) {
            eVarRemove.g(volleyError);
            d(str, eVarRemove);
        }
    }

    public void onGetImageSuccess(String str, Bitmap bitmap) {
        this.c.putBitmap(str, bitmap);
        e eVarRemove = this.d.remove(str);
        if (eVarRemove != null) {
            eVarRemove.b = bitmap;
            d(str, eVarRemove);
        }
    }

    public void setBatchedResponseDelay(int i) {
        this.b = i;
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2) {
        return get(str, imageListener, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    public boolean isCached(String str, int i, int i2, ImageView.ScaleType scaleType) {
        f();
        return this.c.getBitmap(e(str, i, i2, scaleType)) != null;
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2, ImageView.ScaleType scaleType) {
        f();
        String strE = e(str, i, i2, scaleType);
        Bitmap bitmap = this.c.getBitmap(strE);
        if (bitmap != null) {
            ImageContainer imageContainer = new ImageContainer(bitmap, str, null, null);
            imageListener.onResponse(imageContainer, true);
            return imageContainer;
        }
        ImageContainer imageContainer2 = new ImageContainer(null, str, strE, imageListener);
        imageListener.onResponse(imageContainer2, true);
        e eVar = this.d.get(strE);
        if (eVar != null) {
            eVar.d(imageContainer2);
            return imageContainer2;
        }
        Request<Bitmap> requestMakeImageRequest = makeImageRequest(str, i, i2, scaleType, strE);
        this.a.add(requestMakeImageRequest);
        this.d.put(strE, new e(requestMakeImageRequest, imageContainer2));
        return imageContainer2;
    }
}
