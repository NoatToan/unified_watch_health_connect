package com.youth.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.youth.banner.listener.OnBannerClickListener;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoaderInterface;
import com.youth.banner.view.BannerViewPager;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class Banner extends FrameLayout implements ViewPager.OnPageChangeListener {
    private Context A;
    private BannerViewPager B;
    private TextView C;
    private TextView D;
    private TextView E;
    private LinearLayout F;
    private LinearLayout G;
    private LinearLayout H;
    private ImageView I;
    private ImageLoaderInterface J;
    private b K;
    private ViewPager.OnPageChangeListener L;
    private BannerScroller M;
    private OnBannerClickListener N;
    private OnBannerListener O;
    private DisplayMetrics P;
    private WeakHandler Q;
    private final Runnable R;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    public String tag;
    private int u;
    private int v;
    private List<String> w;
    private List x;
    private List<View> y;
    private List<ImageView> z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Banner.this.r <= 1 || !Banner.this.i) {
                return;
            }
            Banner banner = Banner.this;
            banner.s = (banner.s % (Banner.this.r + 1)) + 1;
            if (Banner.this.s == 1) {
                Banner.this.B.setCurrentItem(Banner.this.s, false);
                Banner.this.Q.post(Banner.this.R);
            } else {
                Banner.this.B.setCurrentItem(Banner.this.s);
                Banner.this.Q.postDelayed(Banner.this.R, Banner.this.g);
            }
        }
    }

    public class b extends PagerAdapter {

        public class a implements View.OnClickListener {
            public final /* synthetic */ int a;

            public a(int i) {
                this.a = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Log.e(Banner.this.tag, "你正在使用旧版点击事件接口，下标是从1开始，为了体验请更换为setOnBannerListener，下标从0开始计算");
                Banner.this.N.OnBannerClick(this.a);
            }
        }

        /* JADX INFO: renamed from: com.youth.banner.Banner$b$b, reason: collision with other inner class name */
        public class ViewOnClickListenerC1079b implements View.OnClickListener {
            public final /* synthetic */ int a;

            public ViewOnClickListenerC1079b(int i) {
                this.a = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Banner.this.O.OnBannerClick(Banner.this.toRealPosition(this.a));
            }
        }

        public b() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return Banner.this.y.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            viewGroup.addView((View) Banner.this.y.get(i));
            View view = (View) Banner.this.y.get(i);
            if (Banner.this.N != null) {
                view.setOnClickListener(new a(i));
            }
            if (Banner.this.O != null) {
                view.setOnClickListener(new ViewOnClickListenerC1079b(i));
            }
            return view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public Banner(Context context) {
        this(context, null);
    }

    private void l() {
        this.z.clear();
        this.F.removeAllViews();
        this.G.removeAllViews();
        for (int i = 0; i < this.r; i++) {
            ImageView imageView = new ImageView(this.A);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.b, this.c);
            int i2 = this.a;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
            if (i == 0) {
                imageView.setImageResource(this.k);
            } else {
                imageView.setImageResource(this.l);
            }
            this.z.add(imageView);
            int i3 = this.f;
            if (i3 == 1 || i3 == 4) {
                this.F.addView(imageView, layoutParams);
            } else if (i3 == 5) {
                this.G.addView(imageView, layoutParams);
            }
        }
    }

    private void m(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Banner);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_indicator_width, this.d);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_indicator_height, this.d);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_indicator_margin, 5);
        this.k = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Banner_indicator_drawable_selected, R.drawable.gray_radius);
        this.l = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Banner_indicator_drawable_unselected, R.drawable.white_radius);
        this.v = typedArrayObtainStyledAttributes.getInt(R.styleable.Banner_image_scale_type, this.v);
        this.g = typedArrayObtainStyledAttributes.getInt(R.styleable.Banner_delay_time, 2000);
        this.h = typedArrayObtainStyledAttributes.getInt(R.styleable.Banner_scroll_time, 800);
        this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Banner_is_auto_play, true);
        this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.Banner_title_background, -1);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_title_height, -1);
        this.p = typedArrayObtainStyledAttributes.getColor(R.styleable.Banner_title_textcolor, -1);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Banner_title_textsize, -1);
        this.m = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Banner_banner_layout, this.m);
        this.e = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Banner_banner_default_image, R.drawable.no_banner);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void n() {
        this.y.clear();
        int i = this.f;
        if (i == 1 || i == 4 || i == 5) {
            l();
            return;
        }
        if (i == 3) {
            this.D.setText("1/" + this.r);
            return;
        }
        if (i == 2) {
            this.E.setText("1/" + this.r);
        }
    }

    private void o(Context context, AttributeSet attributeSet) {
        this.y.clear();
        m(context, attributeSet);
        View viewInflate = LayoutInflater.from(context).inflate(this.m, (ViewGroup) this, true);
        this.I = (ImageView) viewInflate.findViewById(R.id.bannerDefaultImage);
        this.B = (BannerViewPager) viewInflate.findViewById(R.id.bannerViewPager);
        this.H = (LinearLayout) viewInflate.findViewById(R.id.titleView);
        this.F = (LinearLayout) viewInflate.findViewById(R.id.circleIndicator);
        this.G = (LinearLayout) viewInflate.findViewById(R.id.indicatorInside);
        this.C = (TextView) viewInflate.findViewById(R.id.bannerTitle);
        this.E = (TextView) viewInflate.findViewById(R.id.numIndicator);
        this.D = (TextView) viewInflate.findViewById(R.id.numIndicatorInside);
        this.I.setImageResource(this.e);
        p();
    }

    private void p() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            BannerScroller bannerScroller = new BannerScroller(this.B.getContext());
            this.M = bannerScroller;
            bannerScroller.setDuration(this.h);
            declaredField.set(this.B, this.M);
        } catch (Exception e) {
            Log.e(this.tag, e.getMessage());
        }
    }

    private void q() {
        int i = this.r > 1 ? 0 : 8;
        int i2 = this.f;
        if (i2 == 1) {
            this.F.setVisibility(i);
            return;
        }
        if (i2 == 2) {
            this.E.setVisibility(i);
            return;
        }
        if (i2 == 3) {
            this.D.setVisibility(i);
            s();
        } else if (i2 == 4) {
            this.F.setVisibility(i);
            s();
        } else {
            if (i2 != 5) {
                return;
            }
            this.G.setVisibility(i);
            s();
        }
    }

    private void r() {
        this.s = 1;
        if (this.K == null) {
            this.K = new b();
            this.B.addOnPageChangeListener(this);
        }
        this.B.setAdapter(this.K);
        this.B.setFocusable(true);
        this.B.setCurrentItem(1);
        int i = this.t;
        if (i != -1) {
            this.F.setGravity(i);
        }
        if (!this.j || this.r <= 1) {
            this.B.setScrollable(false);
        } else {
            this.B.setScrollable(true);
        }
        if (this.i) {
            startAutoPlay();
        }
    }

    private void s() {
        if (this.w.size() != this.x.size()) {
            throw new RuntimeException("[Banner] --> The number of titles and images is different");
        }
        int i = this.o;
        if (i != -1) {
            this.H.setBackgroundColor(i);
        }
        if (this.n != -1) {
            this.H.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.n));
        }
        int i2 = this.p;
        if (i2 != -1) {
            this.C.setTextColor(i2);
        }
        int i3 = this.q;
        if (i3 != -1) {
            this.C.setTextSize(0, i3);
        }
        List<String> list = this.w;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.C.setText(this.w.get(0));
        this.C.setVisibility(0);
        this.H.setVisibility(0);
    }

    private void setImageList(List<?> list) {
        Object obj;
        if (list == null || list.size() <= 0) {
            this.I.setVisibility(0);
            Log.e(this.tag, "The image data set is empty.");
            return;
        }
        this.I.setVisibility(8);
        n();
        int i = 0;
        while (i <= this.r + 1) {
            ImageLoaderInterface imageLoaderInterface = this.J;
            View viewCreateImageView = imageLoaderInterface != null ? imageLoaderInterface.createImageView(this.A) : null;
            if (viewCreateImageView == null) {
                viewCreateImageView = new ImageView(this.A);
            }
            setScaleType(viewCreateImageView);
            if (i == 0) {
                obj = list.get(this.r - 1);
            } else {
                obj = i == this.r + 1 ? list.get(0) : list.get(i - 1);
            }
            this.y.add(viewCreateImageView);
            ImageLoaderInterface imageLoaderInterface2 = this.J;
            if (imageLoaderInterface2 != null) {
                imageLoaderInterface2.displayImage(this.A, obj, viewCreateImageView);
            } else {
                Log.e(this.tag, "Please set images loader.");
            }
            i++;
        }
    }

    private void setScaleType(View view) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            switch (this.v) {
                case 0:
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    break;
                case 1:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    break;
                case 2:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    break;
                case 3:
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    break;
                case 4:
                    imageView.setScaleType(ImageView.ScaleType.FIT_END);
                    break;
                case 5:
                    imageView.setScaleType(ImageView.ScaleType.FIT_START);
                    break;
                case 6:
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                case 7:
                    imageView.setScaleType(ImageView.ScaleType.MATRIX);
                    break;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.i) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                startAutoPlay();
            } else if (action == 0) {
                stopAutoPlay();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Banner isAutoPlay(boolean z) {
        this.i = z;
        return this;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.L;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
        if (i == 0) {
            int i2 = this.s;
            if (i2 == 0) {
                this.B.setCurrentItem(this.r, false);
                return;
            } else {
                if (i2 == this.r + 1) {
                    this.B.setCurrentItem(1, false);
                    return;
                }
                return;
            }
        }
        if (i != 1) {
            return;
        }
        int i3 = this.s;
        int i4 = this.r;
        if (i3 == i4 + 1) {
            this.B.setCurrentItem(1, false);
        } else if (i3 == 0) {
            this.B.setCurrentItem(i4, false);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.L;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(toRealPosition(i), f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.s = i;
        ViewPager.OnPageChangeListener onPageChangeListener = this.L;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(toRealPosition(i));
        }
        int i2 = this.f;
        if (i2 == 1 || i2 == 4 || i2 == 5) {
            List<ImageView> list = this.z;
            int i3 = this.u - 1;
            int i4 = this.r;
            list.get((i3 + i4) % i4).setImageResource(this.l);
            List<ImageView> list2 = this.z;
            int i5 = this.r;
            list2.get(((i - 1) + i5) % i5).setImageResource(this.k);
            this.u = i;
        }
        if (i == 0) {
            i = this.r;
        }
        if (i > this.r) {
            i = 1;
        }
        int i6 = this.f;
        if (i6 == 2) {
            this.E.setText(i + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.r);
            return;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                this.C.setText(this.w.get(i - 1));
                return;
            } else {
                if (i6 != 5) {
                    return;
                }
                this.C.setText(this.w.get(i - 1));
                return;
            }
        }
        this.D.setText(i + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.r);
        this.C.setText(this.w.get(i - 1));
    }

    public void releaseBanner() {
        this.Q.removeCallbacksAndMessages(null);
    }

    public Banner setBannerAnimation(Class<? extends ViewPager.PageTransformer> cls) {
        try {
            setPageTransformer(true, cls.newInstance());
        } catch (Exception unused) {
            Log.e(this.tag, "Please set the PageTransformer class");
        }
        return this;
    }

    public Banner setBannerStyle(int i) {
        this.f = i;
        return this;
    }

    public Banner setBannerTitles(List<String> list) {
        this.w = list;
        return this;
    }

    public Banner setDelayTime(int i) {
        this.g = i;
        return this;
    }

    public Banner setImageLoader(ImageLoaderInterface imageLoaderInterface) {
        this.J = imageLoaderInterface;
        return this;
    }

    public Banner setImages(List<?> list) {
        this.x = list;
        this.r = list.size();
        return this;
    }

    public Banner setIndicatorGravity(int i) {
        if (i == 5) {
            this.t = 19;
        } else if (i == 6) {
            this.t = 17;
        } else if (i == 7) {
            this.t = 21;
        }
        return this;
    }

    public Banner setOffscreenPageLimit(int i) {
        BannerViewPager bannerViewPager = this.B;
        if (bannerViewPager != null) {
            bannerViewPager.setOffscreenPageLimit(i);
        }
        return this;
    }

    @Deprecated
    public Banner setOnBannerClickListener(OnBannerClickListener onBannerClickListener) {
        this.N = onBannerClickListener;
        return this;
    }

    public Banner setOnBannerListener(OnBannerListener onBannerListener) {
        this.O = onBannerListener;
        return this;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.L = onPageChangeListener;
    }

    public Banner setPageTransformer(boolean z, ViewPager.PageTransformer pageTransformer) {
        this.B.setPageTransformer(z, pageTransformer);
        return this;
    }

    public Banner setViewPagerIsScroll(boolean z) {
        this.j = z;
        return this;
    }

    public Banner start() {
        q();
        setImageList(this.x);
        r();
        return this;
    }

    public void startAutoPlay() {
        this.Q.removeCallbacks(this.R);
        this.Q.postDelayed(this.R, this.g);
    }

    public void stopAutoPlay() {
        this.Q.removeCallbacks(this.R);
    }

    public int toRealPosition(int i) {
        int i2 = this.r;
        int i3 = (i - 1) % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    public void update(List<?> list, List<String> list2) {
        this.w.clear();
        this.w.addAll(list2);
        update(list);
    }

    public void updateBannerStyle(int i) {
        this.F.setVisibility(8);
        this.E.setVisibility(8);
        this.D.setVisibility(8);
        this.G.setVisibility(8);
        this.C.setVisibility(8);
        this.H.setVisibility(8);
        this.f = i;
        start();
    }

    public Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Banner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tag = "banner";
        this.a = 5;
        this.f = 1;
        this.g = 2000;
        this.h = 800;
        this.i = true;
        this.j = true;
        this.k = R.drawable.gray_radius;
        this.l = R.drawable.white_radius;
        this.m = R.layout.banner;
        this.r = 0;
        this.t = -1;
        this.u = 1;
        this.v = 1;
        this.Q = new WeakHandler();
        this.R = new a();
        this.A = context;
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.P = displayMetrics;
        this.d = displayMetrics.widthPixels / 80;
        o(context, attributeSet);
    }

    public void update(List<?> list) {
        this.x.clear();
        this.y.clear();
        this.z.clear();
        this.x.addAll(list);
        this.r = this.x.size();
        start();
    }
}
