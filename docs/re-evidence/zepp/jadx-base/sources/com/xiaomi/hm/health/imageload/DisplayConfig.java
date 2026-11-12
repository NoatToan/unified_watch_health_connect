package com.xiaomi.hm.health.imageload;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
public class DisplayConfig {
    private ConfigBuilder.b a;
    private Context b;
    private FragmentActivity c;
    private Fragment d;
    private View e;
    private String f;
    private Uri g;
    private File h;
    private int i;
    private ConfigBuilder.c j;
    private ConfigBuilder.DiskCacheStrategy k;
    private boolean l;
    private int m;
    private int n;
    private ConfigBuilder.a o;
    private HMLoadListener p;
    private GlideTransformation q;
    private HMLoadTarget r;
    private ImageView s;
    private int t;
    private int u;

    public static class ConfigBuilder {
        private b a;
        private Context b;
        private FragmentActivity c;
        private Fragment d;
        private View e;
        private String f;
        private Uri g;
        private File h;
        private int i;
        private c j;
        private DiskCacheStrategy k;
        private boolean l;
        private int m;
        private int n;
        private a o;
        private int p;
        private int q;
        private HMLoadListener r;
        private GlideTransformation s;
        private HMLoadTarget t;
        private ImageView u;

        public enum DiskCacheStrategy {
            ALL,
            NONE,
            DATA,
            RESOURCE,
            AUTOMATIC
        }

        public enum a {
            FIT_CENTER,
            CENTER_INSIDE,
            CENTER_CROP,
            CIRCLE_CROP
        }

        public enum b {
            CONTEXT,
            ACTIVITY,
            FRAGMENT,
            VIEW
        }

        public enum c {
            GIF,
            FILE,
            BITMAP,
            DRAWABLE
        }

        public ConfigBuilder(Context context) {
            this.a = b.CONTEXT;
            this.b = context;
        }

        public ConfigBuilder asBitmap() {
            this.j = c.BITMAP;
            return this;
        }

        public ConfigBuilder asDrawable() {
            this.j = c.DRAWABLE;
            return this;
        }

        public ConfigBuilder asFile() {
            this.j = c.FILE;
            return this;
        }

        public ConfigBuilder asGif() {
            this.j = c.GIF;
            return this;
        }

        public ConfigBuilder centerCrop() {
            this.o = a.CENTER_CROP;
            return this;
        }

        public ConfigBuilder centerInside() {
            this.o = a.CENTER_INSIDE;
            return this;
        }

        public ConfigBuilder circleCrop() {
            this.o = a.CIRCLE_CROP;
            return this;
        }

        public ConfigBuilder crossFade() {
            this.l = false;
            return this;
        }

        public ConfigBuilder diskCacheStrategy(DiskCacheStrategy diskCacheStrategy) {
            this.k = diskCacheStrategy;
            return this;
        }

        public ConfigBuilder dontAnimate() {
            this.l = true;
            return this;
        }

        @MainThread
        public void downloadOnly(HMLoadTarget hMLoadTarget) {
            this.t = hMLoadTarget;
            new DisplayConfig(this).g();
        }

        @WorkerThread
        public void downloadOnlyExecute(HMLoadTarget hMLoadTarget) {
            this.t = hMLoadTarget;
            new DisplayConfig(this).h();
        }

        public ConfigBuilder error(@DrawableRes int i) {
            this.n = i;
            return this;
        }

        public ConfigBuilder fitCenter() {
            this.o = a.FIT_CENTER;
            return this;
        }

        public Bitmap get() {
            asBitmap();
            return new DisplayConfig(this).i();
        }

        public void into(ImageView imageView) {
            this.u = imageView;
            new DisplayConfig(this).l();
        }

        public ConfigBuilder listener(HMLoadListener hMLoadListener) {
            this.r = hMLoadListener;
            return this;
        }

        public ConfigBuilder load(String str) {
            this.f = str;
            return this;
        }

        @WorkerThread
        public File obtain() {
            return new DisplayConfig(this).j();
        }

        public ConfigBuilder override(int i) {
            this.p = i;
            this.q = i;
            return this;
        }

        public ConfigBuilder placeholder(@DrawableRes int i) {
            this.m = i;
            return this;
        }

        @MainThread
        public void preload() {
            new DisplayConfig(this).k();
        }

        public ConfigBuilder transform(GlideTransformation glideTransformation) {
            this.s = glideTransformation;
            return this;
        }

        public ConfigBuilder load(Uri uri) {
            this.g = uri;
            return this;
        }

        public Bitmap get(int i, int i2) {
            asBitmap();
            this.p = i;
            this.q = i2;
            return new DisplayConfig(this).i();
        }

        public void into(HMLoadTarget hMLoadTarget) {
            this.t = hMLoadTarget;
            new DisplayConfig(this).l();
        }

        public ConfigBuilder load(File file) {
            this.h = file;
            return this;
        }

        public ConfigBuilder override(int i, int i2) {
            this.p = i;
            this.q = i2;
            return this;
        }

        public ConfigBuilder(FragmentActivity fragmentActivity) {
            this.a = b.ACTIVITY;
            this.c = fragmentActivity;
        }

        public ConfigBuilder load(int i) {
            this.i = i;
            return this;
        }

        public ConfigBuilder(Fragment fragment) {
            this.a = b.FRAGMENT;
            this.d = fragment;
        }

        public ConfigBuilder(View view) {
            this.a = b.VIEW;
            this.e = view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void g() {
        GlobalConfig.INSTANCE.getLoader().downloadOnly(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void h() {
        GlobalConfig.INSTANCE.getLoader().downloadOnlyExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap i() {
        return GlobalConfig.INSTANCE.getLoader().get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File j() {
        return GlobalConfig.INSTANCE.getLoader().obtain(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        GlobalConfig.INSTANCE.getLoader().preload(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        GlobalConfig.INSTANCE.getLoader().show(this);
    }

    public FragmentActivity getActivity() {
        return this.c;
    }

    public ConfigBuilder.a getAdaptationType() {
        return this.o;
    }

    public Context getContext() {
        return this.b;
    }

    public ConfigBuilder.DiskCacheStrategy getDiskCacheStrategy() {
        return this.k;
    }

    public int getError() {
        return this.n;
    }

    public File getFile() {
        return this.h;
    }

    public Fragment getFragment() {
        return this.d;
    }

    public int getHeight() {
        return this.u;
    }

    public ImageView getImageView() {
        return this.s;
    }

    public ConfigBuilder.b getLifeCycle() {
        return this.a;
    }

    public HMLoadListener getListener() {
        return this.p;
    }

    public String getPath() {
        return this.f;
    }

    public int getPlaceHolder() {
        return this.m;
    }

    public Integer getResId() {
        return Integer.valueOf(this.i);
    }

    public ConfigBuilder.c getResourceType() {
        return this.j;
    }

    public HMLoadTarget getTarget() {
        return this.r;
    }

    public GlideTransformation getTransformation() {
        return this.q;
    }

    public Uri getUri() {
        return this.g;
    }

    public View getView() {
        return this.e;
    }

    public int getWidth() {
        return this.t;
    }

    public boolean isDontAnimate() {
        return this.l;
    }

    private DisplayConfig(ConfigBuilder configBuilder) {
        this.a = configBuilder.a;
        this.b = configBuilder.b;
        this.c = configBuilder.c;
        this.d = configBuilder.d;
        this.e = configBuilder.e;
        this.f = configBuilder.f;
        this.g = configBuilder.g;
        this.h = configBuilder.h;
        this.i = configBuilder.i;
        this.j = configBuilder.j;
        this.k = configBuilder.k;
        this.l = configBuilder.l;
        this.m = configBuilder.m;
        this.n = configBuilder.n;
        this.o = configBuilder.o;
        this.p = configBuilder.r;
        this.q = configBuilder.s;
        this.r = configBuilder.t;
        this.s = configBuilder.u;
        this.t = configBuilder.p;
        this.u = configBuilder.q;
    }
}
