package com.huawei.ui.commonui.viewpager.pagetransformer;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class OverlayLayerPageTransformer implements ViewPager.PageTransformer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f24044b;

    public OverlayLayerPageTransformer(d dVar) {
        if (dVar == null) {
            LogUtil.e("OverlayLayerPageTransformer", "OverlayLayerPageTransformer builder is null");
            this.f24044b = new d();
        } else {
            this.f24044b = dVar;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        float fE;
        float fB;
        int iCompare = Float.compare(f, 0.0f);
        if (iCompare == -1 || iCompare == 0) {
            view.setClickable(true);
            view.setVisibility(0);
            view.setTranslationX(0.0f);
            float fAbs = 1.0f - (Math.abs(f) * 0.5f);
            view.setAlpha(fAbs);
            view.setScaleX(fAbs);
            view.setScaleY(fAbs);
            return;
        }
        view.setClickable(false);
        int iD = this.f24044b.d();
        int iCompare2 = Float.compare(f, iD - 1);
        int width = view.getWidth();
        float fA = this.f24044b.a();
        if (iCompare2 == 1 && Float.compare(f, iD) == -1) {
            view.setVisibility(0);
            double d2 = fA;
            float fFloor = (float) (Math.floor(f - 1.0f) * d2);
            view.setTranslationX(((-width) * f) + fFloor + ((1.0f - (f % ((int) f))) * (((float) (Math.floor(f) * d2)) - fFloor)));
            view.setAlpha((float) Math.max(Math.pow(this.f24044b.c(), f * f * f), 0.10000000149011612d));
        } else if (iCompare2 == 0 || iCompare2 == -1) {
            view.setVisibility(0);
            view.setTranslationX(((-width) * f) + (fA * f));
            view.setAlpha((float) Math.max(Math.pow(this.f24044b.c(), f * f * f), 0.10000000149011612d));
        } else {
            view.setAlpha(0.0f);
        }
        if (width > 0) {
            float f2 = width;
            fE = (f2 - (this.f24044b.e() * f)) / f2;
        } else {
            fE = 0.0f;
        }
        int height = view.getHeight();
        if (height > 0) {
            float f3 = height;
            fB = (f3 - (this.f24044b.b() * f)) / f3;
        } else {
            fB = 0.0f;
        }
        if (fE > 0.0f && fB > 0.0f) {
            view.setScaleX(fE);
            view.setScaleY(fB);
            return;
        }
        if (fE <= 0.0f) {
            if (fB <= 0.0f) {
                LogUtil.e("OverlayLayerPageTransformer", "transformPage scaleX ", Float.valueOf(fE), " scaleY ", Float.valueOf(fB), " position ", Float.valueOf(f), " view ", view);
                return;
            }
            fE = fB;
        }
        view.setScaleX(fE);
        view.setScaleY(fE);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24047c;
        private float d;
        private int e;

        private d() {
            this.e = 3;
            this.f24045a = 100;
            this.f24046b = 100;
            this.f24047c = 100;
            this.d = 0.5f;
        }

        public d(int i) {
            this.f24045a = 100;
            this.f24046b = 100;
            this.f24047c = 100;
            this.d = 0.5f;
            this.e = i;
        }

        public int d() {
            return this.e;
        }

        public int a() {
            return this.f24045a;
        }

        public d c(int i) {
            this.f24045a = i;
            return this;
        }

        public int e() {
            return this.f24046b;
        }

        public d e(int i) {
            this.f24046b = i;
            return this;
        }

        public int b() {
            return this.f24047c;
        }

        public d a(int i) {
            this.f24047c = i;
            return this;
        }

        public float c() {
            return this.d;
        }

        public d b(float f) {
            this.d = f;
            return this;
        }
    }
}
