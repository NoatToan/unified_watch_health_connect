package com.tencent.open.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.log.SLog;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes20.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f31096c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f31098b;
    private long d;
    private Handler e;
    private WeakReference<Activity> f;
    private Runnable g = new Runnable() { // from class: com.tencent.open.utils.c.2
        @Override // java.lang.Runnable
        public void run() {
            SLog.v("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + m.g(c.this.f31097a) + ".jpg";
            String str2 = c.f31096c + str;
            File file = new File(str2);
            Message messageObtainMessage = c.this.e.obtainMessage();
            if (!file.exists()) {
                Bitmap bitmapA = c.a(c.this.f31097a);
                if (bitmapA != null) {
                    if (c.this.a(bitmapA, str)) {
                        messageObtainMessage.arg1 = 0;
                        messageObtainMessage.obj = str2;
                    }
                    SLog.v("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - c.this.d));
                } else {
                    SLog.v("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                }
                messageObtainMessage.arg1 = 1;
                SLog.v("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - c.this.d));
            } else {
                messageObtainMessage.arg1 = 0;
                messageObtainMessage.obj = str2;
                SLog.v("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - c.this.d));
            }
            c.this.e.sendMessage(messageObtainMessage);
        }
    };

    public c(Activity activity) {
        this.f = new WeakReference<>(activity);
        this.e = new Handler(activity.getMainLooper()) { // from class: com.tencent.open.utils.c.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                SLog.v("AsynLoadImg", "handleMessage:" + message.arg1);
                if (message.arg1 == 0) {
                    c.this.f31098b.a(message.arg1, (String) message.obj);
                } else {
                    c.this.f31098b.a(message.arg1, (String) null);
                }
            }
        };
    }

    public void a(String str, d dVar) {
        SLog.v("AsynLoadImg", "--save---");
        if (str == null || str.equals("")) {
            dVar.a(1, (String) null);
            return;
        }
        if (!m.a()) {
            dVar.a(2, (String) null);
            return;
        }
        if (this.f.get() != null) {
            Activity activity = this.f.get();
            File fileH = m.h(activity, "Images");
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (fileH == null) {
                SLog.e("AsynLoadImg", "externalImageFile is null");
                dVar.a(2, (String) null);
                return;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(k.d(activity) ? fileH.getAbsolutePath() : externalStorageDirectory.getAbsolutePath());
                sb.append("/tmp/");
                f31096c = sb.toString();
            }
        }
        this.d = System.currentTimeMillis();
        this.f31097a = str;
        this.f31098b = dVar;
        new Thread(this.g).start();
    }

    public boolean a(Bitmap bitmap, String str) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        String str2 = f31096c;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdir();
                }
                SLog.v("AsynLoadImg", "saveFile:" + str);
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(str2 + str)));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream);
                    bufferedOutputStream.flush();
                    try {
                        bufferedOutputStream.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    e.printStackTrace();
                    SLog.e("AsynLoadImg", "saveFile bmp fail---", e);
                    if (bufferedOutputStream2 == null) {
                        return false;
                    }
                    try {
                        bufferedOutputStream2.close();
                        return false;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public static Bitmap a(String str) {
        SLog.v("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            SLog.v("AsynLoadImg", "image download finished." + str);
            return bitmapDecodeStream;
        } catch (IOException e) {
            e.printStackTrace();
            SLog.v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            SLog.v("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }
}
