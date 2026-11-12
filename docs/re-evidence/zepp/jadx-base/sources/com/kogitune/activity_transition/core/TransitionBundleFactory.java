package com.kogitune.activity_transition.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.kogitune.activity_transition.BuildConfigUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class TransitionBundleFactory {
    public static final String TEMP_IMAGE_FILE_NAME = "activity_transition_image.png";
    private static final String a = "Transition";

    public static class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ File b;
        public final /* synthetic */ Bitmap c;

        public a(Context context, File file, Bitmap bitmap) {
            this.a = context;
            this.b = file;
            this.c = bitmap;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0086 A[PHI: r2
          0x0086: PHI (r2v7 'e' java.lang.Exception) = (r2v4 'e' java.lang.Exception), (r2v6 'e' java.lang.Exception), (r2v15 'e' java.lang.Exception) binds: [B:30:0x006a, B:40:0x0084, B:12:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            TransitionAnimation.isImageFileReady = false;
            Boolean bool = (Boolean) BuildConfigUtils.getBuildConfigValue(this.a, "DEBUG");
            BufferedOutputStream bufferedOutputStream = null;
            try {
                try {
                    if (this.b.exists()) {
                        this.b.delete();
                    }
                    this.b.createNewFile();
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(this.b));
                    try {
                        this.c.compress(Bitmap.CompressFormat.JPEG, 50, bufferedOutputStream2);
                        try {
                            bufferedOutputStream2.close();
                        } catch (Exception e) {
                            e = e;
                            if (bool.booleanValue()) {
                                Log.i(TransitionBundleFactory.a, "fail save image", e);
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bool.booleanValue()) {
                            Log.i(TransitionBundleFactory.a, "file not found", e);
                        }
                        try {
                            bufferedOutputStream.close();
                        } catch (Exception e3) {
                            e = e3;
                            if (bool.booleanValue()) {
                                Log.i(TransitionBundleFactory.a, "fail save image", e);
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bool.booleanValue()) {
                            Log.i(TransitionBundleFactory.a, "can't create file", e);
                        }
                        try {
                            bufferedOutputStream.close();
                        } catch (Exception e5) {
                            e = e5;
                            if (bool.booleanValue()) {
                                Log.i(TransitionBundleFactory.a, "fail save image", e);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        try {
                            bufferedOutputStream.close();
                        } catch (Exception e6) {
                            if (bool.booleanValue()) {
                                Log.i(TransitionBundleFactory.a, "fail save image", e6);
                            }
                        }
                        TransitionAnimation.isImageFileReady = true;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e7) {
                e = e7;
            } catch (IOException e8) {
                e = e8;
            }
            TransitionAnimation.isImageFileReady = true;
            Object obj = TransitionAnimation.lock;
            synchronized (obj) {
                obj.notify();
            }
        }
    }

    private static String a(Context context, Bitmap bitmap) {
        String str = context.getFilesDir().getAbsolutePath() + "/activity_transition/";
        new File(str).mkdirs();
        File file = new File(str, TEMP_IMAGE_FILE_NAME);
        String absolutePath = file.getAbsolutePath();
        new Thread(new a(context, file, bitmap)).start();
        return absolutePath;
    }

    public static Bundle createTransitionBundle(Context context, View view, Bitmap bitmap) {
        String strA;
        if (bitmap != null) {
            TransitionAnimation.bitmapCache = new WeakReference<>(bitmap);
            strA = a(context, bitmap);
        } else {
            strA = null;
        }
        String str = strA;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new TransitionData(context, iArr[0], iArr[1], view.getMeasuredWidth(), view.getMeasuredHeight(), str).getBundle();
    }
}
