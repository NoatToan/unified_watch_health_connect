package com.xiaomi.hm.health.baseui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.widget.ImageView;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes19.dex */
public class FramesSequenceAnimation {
    private int[] a;
    private SoftReference<ImageView> e;
    private int[] g;
    private boolean h;
    private int i;
    private OnAnimationStoppedListener j;
    private Bitmap k;
    private BitmapFactory.Options l;
    private Handler f = new Handler();
    private int b = 0;
    private boolean c = false;
    private boolean d = false;

    public interface OnAnimationStoppedListener {
        void AnimationStopped();
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmapDecodeResource;
            ImageView imageView = (ImageView) FramesSequenceAnimation.this.e.get();
            if (!FramesSequenceAnimation.this.c || imageView == null) {
                FramesSequenceAnimation.this.d = false;
                if (FramesSequenceAnimation.this.j != null) {
                    FramesSequenceAnimation.this.j.AnimationStopped();
                    return;
                }
                return;
            }
            FramesSequenceAnimation.this.d = true;
            if (FramesSequenceAnimation.this.b < FramesSequenceAnimation.this.i - 1 || FramesSequenceAnimation.this.h) {
                FramesSequenceAnimation.this.f.postDelayed(this, FramesSequenceAnimation.this.g[FramesSequenceAnimation.this.b % FramesSequenceAnimation.this.i]);
            }
            if (FramesSequenceAnimation.this.b == FramesSequenceAnimation.this.i - 1) {
                FramesSequenceAnimation.this.d = false;
                if (FramesSequenceAnimation.this.j != null) {
                    FramesSequenceAnimation.this.j.AnimationStopped();
                }
            }
            if (imageView.isShown()) {
                int iN = FramesSequenceAnimation.this.n();
                if (FramesSequenceAnimation.this.k == null) {
                    imageView.setImageResource(iN);
                    return;
                }
                try {
                    bitmapDecodeResource = BitmapFactory.decodeResource(imageView.getResources(), iN, FramesSequenceAnimation.this.l);
                } catch (Exception e) {
                    e.printStackTrace();
                    bitmapDecodeResource = null;
                }
                if (bitmapDecodeResource != null) {
                    imageView.setImageBitmap(bitmapDecodeResource);
                    return;
                }
                imageView.setImageResource(iN);
                FramesSequenceAnimation.this.k.recycle();
                FramesSequenceAnimation.this.k = null;
            }
        }
    }

    public FramesSequenceAnimation(ImageView imageView, int[] iArr, int[] iArr2, boolean z) {
        this.h = false;
        this.k = null;
        this.a = iArr;
        this.e = new SoftReference<>(imageView);
        this.g = iArr2;
        this.h = z;
        this.i = iArr.length;
        imageView.setImageResource(this.a[0]);
        Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        this.k = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.l = options;
        options.inBitmap = this.k;
        options.inMutable = true;
        options.inSampleSize = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int n() {
        int i = this.b;
        int[] iArr = this.a;
        if (i > iArr.length - 1) {
            this.b = 0;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        return iArr[i2];
    }

    public void setOnAnimationStoppedListener(OnAnimationStoppedListener onAnimationStoppedListener) {
        this.j = onAnimationStoppedListener;
    }

    public synchronized void start() {
        this.c = true;
        if (this.d) {
            return;
        }
        this.b = 0;
        this.f.post(new a());
    }

    public synchronized void stop() {
        this.c = false;
        this.b = 0;
    }
}
