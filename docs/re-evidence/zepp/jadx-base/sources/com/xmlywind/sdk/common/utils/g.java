package com.xmlywind.sdk.common.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.LruCache;
import android.widget.ImageView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xmlywind.logger.SigmobLog;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
public class g {
    private static g a;
    private Context b;
    private ExecutorService c = Executors.newFixedThreadPool(4);
    private LruCache<String, Bitmap> d = new LruCache<>(4194304);
    private Handler e = new Handler();
    private File f;

    public interface a {
        void a();

        void a(Bitmap bitmap);
    }

    public class b implements Runnable {
        public String a;
        public int b;
        public int c;
        public ImageView d;

        public b(String str) {
            this.a = str;
        }

        private Bitmap a() {
            String str = this.a;
            File file = new File(g.this.b(), k.a(str.substring(str.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + 1)));
            if (!file.exists() || file.length() <= 0) {
                return null;
            }
            return BitmapFactory.decodeFile(file.getAbsolutePath());
        }

        private void b() {
            g.this.e.post(new Runnable() { // from class: com.xmlywind.sdk.common.utils.g.b.2
                @Override // java.lang.Runnable
                public void run() {
                    ImageView imageView;
                    b bVar = b.this;
                    int i = bVar.c;
                    if (i == 0 || (imageView = bVar.d) == null) {
                        return;
                    }
                    imageView.setImageResource(i);
                }
            });
        }

        public b a(int i) {
            this.b = i;
            return this;
        }

        public void a(ImageView imageView) {
            this.d = imageView;
            int i = this.b;
            if (i != 0 && imageView != null) {
                imageView.setImageResource(i);
            }
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            Bitmap bitmap = (Bitmap) g.this.d.get(this.a);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            Bitmap bitmapA = a();
            if (bitmapA == null) {
                g.this.c.submit(this);
            } else {
                imageView.setImageBitmap(bitmapA);
                g.this.d.put(this.a, bitmapA);
            }
        }

        public b b(int i) {
            this.c = i;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.a).openConnection()));
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(2000);
                if (httpURLConnection.getResponseCode() == 200) {
                    final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    g.this.e.post(new Runnable() { // from class: com.xmlywind.sdk.common.utils.g.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.d.setImageBitmap(bitmapDecodeStream);
                        }
                    });
                    g.this.d.put(this.a, bitmapDecodeStream);
                    String str = this.a;
                    bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(g.this.b(), k.a(str.substring(str.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + 1)))));
                } else {
                    b();
                }
            } catch (FileNotFoundException unused) {
            } catch (Exception e) {
                e.printStackTrace();
                b();
            }
        }
    }

    public g(Context context) {
        this.b = context.getApplicationContext();
    }

    public static g a(Context context) {
        return b(context);
    }

    private static g b(Context context) {
        if (a == null) {
            synchronized (g.class) {
                if (a == null) {
                    a = new g(context);
                }
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File b() {
        File file = this.f;
        if (file != null && file.isDirectory() && this.f.exists()) {
            return this.f;
        }
        return Environment.getExternalStorageState() == "mounted" ? this.b.getExternalCacheDir() : this.b.getCacheDir();
    }

    public b a(String str) {
        return new b(str);
    }

    public g a(File file) {
        this.f = file;
        return this;
    }

    public void a() {
        String str;
        try {
            File[] fileArrA = d.a(d.f(b().getAbsolutePath()), 100);
            if (fileArrA == null) {
                str = "native ad file list is null";
            } else {
                str = "native ad file remain num: " + fileArrA.length;
            }
            SigmobLog.i(str);
        } catch (Throwable th) {
            SigmobLog.e("clean native ad file error", th);
        }
    }

    public void a(final String str, final a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bitmap bitmapDecodeFile = this.d.get(str);
        if (bitmapDecodeFile == null) {
            File file = new File(b(), k.a(str.substring(str.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + 1)));
            bitmapDecodeFile = (!file.exists() || file.length() <= 0) ? null : BitmapFactory.decodeFile(file.getAbsolutePath());
            if (bitmapDecodeFile == null) {
                this.c.submit(new Runnable() { // from class: com.xmlywind.sdk.common.utils.g.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setConnectTimeout(2000);
                            if (httpURLConnection.getResponseCode() == 200) {
                                final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                                httpURLConnection.disconnect();
                                g.this.e.post(new Runnable() { // from class: com.xmlywind.sdk.common.utils.g.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        aVar.a(bitmapDecodeStream);
                                    }
                                });
                                g.this.d.put(str, bitmapDecodeStream);
                                String str2 = str;
                                bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(new File(g.this.b(), k.a(str2.substring(str2.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) + 1)))));
                            }
                        } catch (Exception unused) {
                            g.this.e.post(new Runnable() { // from class: com.xmlywind.sdk.common.utils.g.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    aVar.a();
                                }
                            });
                        }
                    }
                });
                return;
            }
            this.d.put(str, bitmapDecodeFile);
        }
        aVar.a(bitmapDecodeFile);
    }
}
