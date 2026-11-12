package com.xiaomi.hm.health.training.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.huami.ad.Constants;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.GlideGifDrawable;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import java.util.HashSet;

/* JADX INFO: loaded from: classes22.dex */
public class URLImageGetter implements Html.ImageGetter {
    private static final int e = 20;
    private Context c;
    private TextView d;
    private HashSet<GlideGifDrawable> b = new HashSet<>();
    private HashSet<HMLoadTarget> a = new HashSet<>();

    public class a extends HMLoadTarget<Bitmap> {
        private final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Bitmap bitmap) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(URLImageGetter.this.c.getResources(), bitmap);
            Rect rectE = URLImageGetter.this.e(bitmapDrawable);
            bitmapDrawable.setBounds(rectE);
            this.a.setBounds(rectE);
            this.a.b(bitmapDrawable);
            URLImageGetter.this.d.setText(URLImageGetter.this.d.getText());
            URLImageGetter.this.d.invalidate();
        }
    }

    public class b extends HMLoadTarget<GlideGifDrawable> {
        private final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onLoadFinish(GlideGifDrawable glideGifDrawable) {
            Rect rectE = URLImageGetter.this.e(glideGifDrawable);
            glideGifDrawable.setBounds(rectE);
            this.a.setBounds(rectE);
            this.a.b(glideGifDrawable);
            URLImageGetter.this.b.add(glideGifDrawable);
            glideGifDrawable.setCallback(URLImageGetter.this.d);
            glideGifDrawable.start();
            glideGifDrawable.setLoopCount(-1);
            URLImageGetter.this.d.setText(URLImageGetter.this.d.getText());
            URLImageGetter.this.d.invalidate();
        }
    }

    public class c extends BitmapDrawable {
        private Drawable a;

        public c() {
        }

        public Drawable a() {
            return this.a;
        }

        public void b(Drawable drawable) {
            this.a = drawable;
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    public URLImageGetter(Context context, TextView textView) {
        this.c = context;
        this.d = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect e(Drawable drawable) {
        int i = f(this.c).x;
        return new Rect(20, 20, i - 20, (drawable.getIntrinsicHeight() * (i - 40)) / drawable.getIntrinsicWidth());
    }

    private Point f(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    private static boolean g(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 && Constants.GIF_PATH.toUpperCase().equals(str.substring(iLastIndexOf + 1).toUpperCase());
    }

    @Override // android.text.Html.ImageGetter
    public Drawable getDrawable(String str) {
        DisplayConfig.ConfigBuilder configBuilderAsBitmap;
        HMLoadTarget aVar;
        c cVar = new c();
        if (g(str)) {
            configBuilderAsBitmap = HMImageLoader.with(this.c).load(str).asGif();
            aVar = new b(cVar);
        } else {
            configBuilderAsBitmap = HMImageLoader.with(this.c).load(str).asBitmap();
            aVar = new a(cVar);
        }
        this.a.add(aVar);
        configBuilderAsBitmap.into(aVar);
        return cVar;
    }

    public void recycle() {
        this.a.clear();
        for (GlideGifDrawable glideGifDrawable : this.b) {
            glideGifDrawable.setCallback(null);
            glideGifDrawable.recycle();
        }
        this.b.clear();
    }
}
