package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import defpackage.jtf;
import defpackage.njy;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ExplodeAnimationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f11387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f11388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExplodeAnimationCallback f11389c;
    private ArrayList<jtf> d = new ArrayList<>();
    private Size e;
    private List<List<Bitmap>> f;
    private boolean i;

    public interface ExplodeAnimationCallback {
        void onAnimationComplete();
    }

    public ExplodeAnimationHelper(List<List<Bitmap>> list, ViewGroup viewGroup, PointF pointF, ExplodeAnimationCallback explodeAnimationCallback) {
        this.f11389c = explodeAnimationCallback;
        this.f = list;
        this.f11387a = viewGroup;
        this.f11388b = pointF;
    }

    public void d(Size size) {
        this.e = size;
    }

    public void d() {
        ViewGroup viewGroup;
        Bitmap bitmap;
        if (njy.e(this.f) || (viewGroup = this.f11387a) == null || this.f11388b == null) {
            return;
        }
        viewGroup.removeAllViews();
        this.d.clear();
        for (List<Bitmap> list : this.f) {
            if (!njy.e(list) && (bitmap = list.get(new SecureRandom().nextInt(list.size()))) != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                Size size = this.e;
                if (size != null) {
                    width = Math.min(width, size.getWidth());
                    height = Math.min(height, this.e.getHeight());
                }
                b(this.f11387a, bitmap, width, height, this.f11388b);
            }
        }
    }

    private ImageView d(Context context) {
        return new ImageView(context);
    }

    private void b(ViewGroup viewGroup, Bitmap bitmap, int i, int i2, PointF pointF) {
        for (int i3 = 0; i3 < 31; i3++) {
            ImageView imageViewD = d(viewGroup.getContext());
            imageViewD.setImageBitmap(bitmap);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            float f = i / 2.0f;
            layoutParams.leftMargin = Math.round(pointF.x - f);
            float f2 = i2 / 2.0f;
            layoutParams.topMargin = Math.round(pointF.y - f2);
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
            viewGroup.addView(imageViewD, layoutParams);
            this.d.add(new jtf(imageViewD, new PointF(pointF.x - f, pointF.y - f2)));
        }
    }

    public void d(View view) {
        this.i = true;
        for (int i = 0; i < this.d.size(); i++) {
            this.d.get(i).c();
        }
        view.postDelayed(new Runnable() { // from class: jti
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        }, 3200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.i = false;
        ExplodeAnimationCallback explodeAnimationCallback = this.f11389c;
        if (explodeAnimationCallback != null) {
            explodeAnimationCallback.onAnimationComplete();
        }
    }
}
