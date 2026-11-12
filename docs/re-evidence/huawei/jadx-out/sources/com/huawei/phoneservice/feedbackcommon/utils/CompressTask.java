package com.huawei.phoneservice.feedbackcommon.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import java.io.File;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes13.dex */
public class CompressTask implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f21894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f21896c;
    private TaskCallBack d;

    public interface TaskCallBack {
        void compressDone(Throwable th, String str);
    }

    class c implements RequestListener<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f21898a;
        private final String e;

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target<Bitmap> target, boolean z) {
            CompressTask.this.d.compressDone(new Throwable("onLoadFailed:" + glideException), this.f21898a);
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Bitmap bitmap, Object obj, Target<Bitmap> target, DataSource dataSource, boolean z) throws Throwable {
            if (bitmap != null) {
                com.huawei.phoneservice.faq.base.util.g.e("CompressTask", "after compress ,picture size：" + (a.a(bitmap, this.e).length() / 1024) + "KB, width: " + bitmap.getWidth() + " height:" + bitmap.getHeight());
                CompressTask.this.d.compressDone(null, this.e);
                return false;
            }
            CompressTask.this.d.compressDone(new Throwable("can't find file by path:" + this.f21898a), this.f21898a);
            return false;
        }

        c(String str, String str2) {
            this.f21898a = str;
            this.e = str2;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        new File(this.f21896c).mkdirs();
        String strValueOf = this.f21894a;
        if (strValueOf == null) {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        String str = this.f21896c + File.separator + (Base64.encodeToString(strValueOf.getBytes(StandardCharsets.UTF_8), 8) + ".jpg");
        if (new File(str).exists()) {
            this.d.compressDone(null, str);
        } else {
            e(this.f21894a, str);
        }
    }

    private void e(String str, String str2) {
        Glide.with(this.f21895b).asBitmap().load(str).listener(new c(str, str2)).into(new b());
    }

    class b extends SimpleTarget<Bitmap> {
        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
        }

        b() {
        }
    }

    public CompressTask(Context context, String str, String str2, TaskCallBack taskCallBack) {
        this.f21895b = context;
        this.f21894a = str;
        this.f21896c = str2;
        this.d = taskCallBack;
    }
}
