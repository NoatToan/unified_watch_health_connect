package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.collection.LruCache;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zas;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageManager {
    private static final Object i = new Object();
    private static HashSet<Uri> j = new HashSet<>();
    private static ImageManager k;
    private final Context a;
    private final Handler b = new zas(Looper.getMainLooper());
    private final ExecutorService c = zao.zaa().zaa(4, zap.zab);

    @Nullable
    private final a d = null;
    private final zak e = new zak();
    private final Map<zab, ImageReceiver> f = new HashMap();
    private final Map<Uri, ImageReceiver> g = new HashMap();
    private final Map<Uri, Long> h = new HashMap();

    @KeepName
    public final class ImageReceiver extends ResultReceiver {
        private final Uri a;
        private final ArrayList<zab> b;

        public ImageReceiver(Uri uri) {
            super(new zas(Looper.getMainLooper()));
            this.a = uri;
            this.b = new ArrayList<>();
        }

        public final void b() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.a);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.a.sendBroadcast(intent);
        }

        public final void c(zab zabVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.b.add(zabVar);
        }

        public final void d(zab zabVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.b.remove(zabVar);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.c.execute(ImageManager.this.new c(this.a, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(@RecentlyNonNull Uri uri, @Nullable Drawable drawable, boolean z);
    }

    public static final class a extends LruCache<com.google.android.gms.common.images.a, Bitmap> {
        @Override // androidx.collection.LruCache
        public final /* synthetic */ void entryRemoved(boolean z, com.google.android.gms.common.images.a aVar, Bitmap bitmap, @Nullable Bitmap bitmap2) {
            throw new NoSuchMethodError();
        }

        @Override // androidx.collection.LruCache
        public final /* synthetic */ int sizeOf(com.google.android.gms.common.images.a aVar, Bitmap bitmap) {
            throw new NoSuchMethodError();
        }
    }

    public final class b implements Runnable {
        private final zab a;

        public b(zab zabVar) {
            this.a = zabVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.f.get(this.a);
            if (imageReceiver != null) {
                ImageManager.this.f.remove(this.a);
                imageReceiver.d(this.a);
            }
            zab zabVar = this.a;
            com.google.android.gms.common.images.a aVar = zabVar.a;
            if (aVar.a == null) {
                zabVar.c(ImageManager.this.a, ImageManager.this.e, true);
                return;
            }
            Bitmap bitmapB = ImageManager.this.b(aVar);
            if (bitmapB != null) {
                this.a.a(ImageManager.this.a, bitmapB, true);
                return;
            }
            Long l = (Long) ImageManager.this.h.get(aVar.a);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.a.c(ImageManager.this.a, ImageManager.this.e, true);
                    return;
                }
                ImageManager.this.h.remove(aVar.a);
            }
            this.a.b(ImageManager.this.a, ImageManager.this.e);
            ImageReceiver imageReceiver2 = (ImageReceiver) ImageManager.this.g.get(aVar.a);
            if (imageReceiver2 == null) {
                imageReceiver2 = ImageManager.this.new ImageReceiver(aVar.a);
                ImageManager.this.g.put(aVar.a, imageReceiver2);
            }
            imageReceiver2.c(this.a);
            if (!(this.a instanceof zac)) {
                ImageManager.this.f.put(this.a, imageReceiver2);
            }
            synchronized (ImageManager.i) {
                if (!ImageManager.j.contains(aVar.a)) {
                    ImageManager.j.add(aVar.a);
                    imageReceiver2.b();
                }
            }
        }
    }

    public final class c implements Runnable {
        private final Uri a;

        @Nullable
        private final ParcelFileDescriptor b;

        public c(@Nullable Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.a = uri;
            this.b = parcelFileDescriptor;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            Bitmap bitmap;
            Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.b;
            boolean z2 = false;
            Bitmap bitmapDecodeFileDescriptor = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String strValueOf = String.valueOf(this.a);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(strValueOf);
                    Log.e("ImageManager", sb.toString(), e);
                    z2 = true;
                }
                try {
                    this.b.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
                z = z2;
                bitmap = bitmapDecodeFileDescriptor;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.b.post(ImageManager.this.new d(this.a, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                String strValueOf2 = String.valueOf(this.a);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(strValueOf2);
                Log.w("ImageManager", sb2.toString());
            }
        }
    }

    public final class d implements Runnable {
        private final Uri a;

        @Nullable
        private final Bitmap b;
        private final CountDownLatch c;
        private boolean d;

        public d(@Nullable Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.a = uri;
            this.b = bitmap;
            this.d = z;
            this.c = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.b != null;
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.g.remove(this.a);
            if (imageReceiver != null) {
                ArrayList arrayList = imageReceiver.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zab zabVar = (zab) arrayList.get(i);
                    if (this.b == null || !z) {
                        ImageManager.this.h.put(this.a, Long.valueOf(SystemClock.elapsedRealtime()));
                        zabVar.c(ImageManager.this.a, ImageManager.this.e, false);
                    } else {
                        zabVar.a(ImageManager.this.a, this.b, false);
                    }
                    if (!(zabVar instanceof zac)) {
                        ImageManager.this.f.remove(zabVar);
                    }
                }
            }
            this.c.countDown();
            synchronized (ImageManager.i) {
                ImageManager.j.remove(this.a);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.a = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final Bitmap b(com.google.android.gms.common.images.a aVar) {
        return null;
    }

    @RecentlyNonNull
    public static ImageManager create(@RecentlyNonNull Context context) {
        if (k == null) {
            k = new ImageManager(context, false);
        }
        return k;
    }

    private final void e(zab zabVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new b(zabVar).run();
    }

    public final void loadImage(@RecentlyNonNull ImageView imageView, @RecentlyNonNull Uri uri) {
        e(new zad(imageView, uri));
    }

    public final void loadImage(@RecentlyNonNull ImageView imageView, int i2) {
        e(new zad(imageView, i2));
    }

    public final void loadImage(@RecentlyNonNull ImageView imageView, @RecentlyNonNull Uri uri, int i2) {
        zad zadVar = new zad(imageView, uri);
        zadVar.zab = i2;
        e(zadVar);
    }

    public final void loadImage(@RecentlyNonNull OnImageLoadedListener onImageLoadedListener, @RecentlyNonNull Uri uri) {
        e(new zac(onImageLoadedListener, uri));
    }

    public final void loadImage(@RecentlyNonNull OnImageLoadedListener onImageLoadedListener, @RecentlyNonNull Uri uri, int i2) {
        zac zacVar = new zac(onImageLoadedListener, uri);
        zacVar.zab = i2;
        e(zacVar);
    }
}
