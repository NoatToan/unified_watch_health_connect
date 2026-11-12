package com.xiaomi.hm.health.watermarkcamera.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.watermarkcamera.R;
import com.xiaomi.hm.health.watermarkcamera.entity.Watermark;
import com.xiaomi.hm.health.watermarkcamera.ui.activity.WatermarkShareActivity;
import com.xiaomi.hm.health.watermarkcamera.ui.widget.CustomWatermarkView;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkViewGenerator;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.DataFormatterProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.GPSAddressConversionProxy;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.GPSAddressConversionAdapter;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkViewGenerator {
    private static final String L = "WatermarkViewGenerator";
    private static final String M = "mi";
    private static final String N = "km";
    private String A;
    private boolean B;
    private String C;
    private TextView D;
    private CustomWatermarkView K;
    private boolean a;
    private Watermark b;
    private Context c;
    private LayoutInflater d;
    private ImageView e;
    private ImageView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private ImageView j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private View o;
    private RelativeLayout p;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private WatermarkShareActivity x;
    private Resources y;
    private String z;
    private RelativeLayout q = null;
    private final int H = 12;
    private final View.OnTouchListener J = new a();
    private boolean I = WatermarkShareDataUtil.isMetric();
    private int E = 0;
    private int F = -16777216;
    private int G = -1;

    public class a implements View.OnTouchListener {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Long l) {
            WatermarkViewGenerator.this.x.setOperateEnable(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e() {
            return "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(Throwable th) {
            HMLog.error(WatermarkViewGenerator.L, "", th, new Function0() { // from class: com.xiaomi.hm.health.watermarkcamera.utils.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WatermarkViewGenerator.a.e();
                }
            });
        }

        private void g(MotionEvent motionEvent) {
            this.a = (int) motionEvent.getRawX();
            this.b = (int) motionEvent.getRawY();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) WatermarkViewGenerator.this.p.getLayoutParams();
            layoutParams.removeRule(14);
            layoutParams.leftMargin = this.c;
            layoutParams.topMargin = this.d;
            WatermarkViewGenerator.this.p.setLayoutParams(layoutParams);
            if (!WatermarkViewGenerator.this.B) {
                WatermarkViewGenerator.this.p.setBackgroundColor(Color.parseColor("#00000000"));
            }
            Observable.timer(500L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: com.xiaomi.hm.health.watermarkcamera.utils.b
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.d((Long) obj);
                }
            }, new Action1() { // from class: com.xiaomi.hm.health.watermarkcamera.utils.c
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    WatermarkViewGenerator.a.f((Throwable) obj);
                }
            });
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    g(motionEvent);
                } else if (action != 2) {
                    if (action == 3) {
                        g(motionEvent);
                    }
                }
                return false;
            }
            WatermarkViewGenerator.this.x.setOperateEnable(false);
            this.a = (int) motionEvent.getRawX();
            this.b = (int) motionEvent.getRawY();
            WatermarkViewGenerator.this.p.setBackgroundResource(R.drawable.watermark_dotted_line_gray);
            int rawX = ((int) motionEvent.getRawX()) - this.a;
            int rawY = ((int) motionEvent.getRawY()) - this.b;
            this.c = view.getLeft() + rawX;
            this.d = view.getTop() + rawY;
            this.e = view.getRight() + rawX;
            this.f = view.getBottom() + rawY;
            if (this.c < 0) {
                this.c = 0;
                this.e = view.getWidth() + 0;
            }
            if (this.e > WatermarkViewGenerator.this.r) {
                int i = WatermarkViewGenerator.this.r;
                this.e = i;
                this.c = i - view.getWidth();
            }
            if (this.d < 0) {
                this.d = 0;
                this.f = view.getHeight() + 0;
            }
            if (this.f > WatermarkViewGenerator.this.s) {
                int i2 = WatermarkViewGenerator.this.s;
                this.f = i2;
                this.d = i2 - view.getHeight();
            }
            if (!WatermarkViewGenerator.this.B) {
                view.layout(this.c, this.d, this.e, this.f);
            }
            this.a = (int) motionEvent.getRawX();
            this.b = (int) motionEvent.getRawY();
            return false;
        }
    }

    public class b implements GPSAddressConversionAdapter.GeoAddrCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.GPSAddressConversionAdapter.GeoAddrCallback
        public void onComplete(GPSAddressConversionAdapter.GeoLocation geoLocation) {
            if (geoLocation == null) {
                return;
            }
            String str = geoLocation.mCity;
            String str2 = geoLocation.mDistrict;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            WatermarkViewGenerator.this.C = str + "\r\n" + str2;
            WatermarkViewGenerator watermarkViewGenerator = WatermarkViewGenerator.this;
            watermarkViewGenerator.c0(watermarkViewGenerator.C);
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WatermarkViewGenerator.this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            WatermarkViewGenerator.this.S();
            WatermarkViewGenerator.this.B();
            WatermarkViewGenerator.this.C(WatermarkShareDataUtil.getCurrTrackId(), WatermarkShareDataUtil.getDeviceSource(), WatermarkShareDataUtil.getRunType());
        }
    }

    public class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WatermarkViewGenerator.this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            WatermarkViewGenerator.this.S();
            WatermarkViewGenerator.this.B();
        }
    }

    public class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WatermarkViewGenerator.this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            WatermarkViewGenerator.this.S();
            WatermarkViewGenerator.this.B();
        }
    }

    public class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WatermarkViewGenerator.this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            WatermarkViewGenerator.this.S();
            WatermarkViewGenerator.this.B();
        }
    }

    public class g implements ViewTreeObserver.OnGlobalLayoutListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            WatermarkViewGenerator.this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            WatermarkViewGenerator watermarkViewGenerator = WatermarkViewGenerator.this;
            watermarkViewGenerator.t = watermarkViewGenerator.p.getHeight();
            WatermarkViewGenerator watermarkViewGenerator2 = WatermarkViewGenerator.this;
            watermarkViewGenerator2.v = (watermarkViewGenerator2.s - WatermarkViewGenerator.this.t) - WatermarkViewGenerator.this.u;
            WatermarkViewGenerator.this.K.setVisibility(0);
            WatermarkViewGenerator.this.K.setFragmentPosition(WatermarkViewGenerator.this.b.position);
            WatermarkViewGenerator.this.K.setBlackOrWhite(WatermarkViewGenerator.this.a);
            GetWatermarkAPI.WebWatermark currentWebWatermark = GetWatermarkAPI.getCurrentWebWatermark(WatermarkViewGenerator.this.b.markCreateTime);
            if (currentWebWatermark != null) {
                WatermarkViewGenerator watermarkViewGenerator3 = WatermarkViewGenerator.this;
                watermarkViewGenerator3.v = ViewUtils.parse2RealPxBy1080(watermarkViewGenerator3.c, currentWebWatermark.mWatermarkPicY);
                int i = ViewUtils.parse2RealPxBy1080(WatermarkViewGenerator.this.c, currentWebWatermark.mWatermarkPicWidth + 24);
                int i2 = ViewUtils.parse2RealPxBy1080(WatermarkViewGenerator.this.c, currentWebWatermark.mWatermarkPicHeight + 24);
                if (WatermarkShareDataUtil.getWatermarkShareHeight() < WatermarkViewGenerator.this.v + i2) {
                    WatermarkViewGenerator.this.v = WatermarkShareDataUtil.getWatermarkShareHeight() - i2;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                HMLog.d(WatermarkViewGenerator.L, "w:" + currentWebWatermark.mWatermarkPicWidth + ",h:" + currentWebWatermark.mWatermarkPicHeight + ",lw:" + i + ",lh:" + i2, new Object[0]);
                layoutParams.topMargin = WatermarkViewGenerator.this.v;
                layoutParams.leftMargin = ViewUtils.parse2RealPxBy1080(WatermarkViewGenerator.this.c, currentWebWatermark.mWatermarkPicX);
                WatermarkViewGenerator.this.p.setLayoutParams(layoutParams);
                WatermarkViewGenerator.this.p.setVisibility(0);
                WatermarkViewGenerator.this.p.setId(R.id.watermark_dragline);
                WatermarkViewGenerator.this.p.setOnTouchListener(WatermarkViewGenerator.this.J);
                WatermarkViewGenerator.this.p.setClickable(true);
                WatermarkViewGenerator.this.K.getDrawDatasFromMark(currentWebWatermark);
            }
            WatermarkViewGenerator.this.B();
        }
    }

    public WatermarkViewGenerator(Context context, Watermark watermark, boolean z) {
        this.B = false;
        this.c = context;
        this.b = watermark;
        this.a = z;
        this.y = context.getResources();
        this.d = LayoutInflater.from(this.c);
        this.B = WatermarkKeeper.getWatermarkGuideKey(this.c);
        Locale locale = this.y.getConfiguration().locale;
        this.z = locale.getLanguage();
        this.A = locale.getCountry();
        this.u = this.y.getDimensionPixelSize(R.dimen.watermark_drag_line_margin_bottom);
        this.r = WatermarkShareDataUtil.getWatermarkShareWidth();
        this.s = WatermarkShareDataUtil.getWatermarkShareHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.B) {
            int dimensionPixelSize = this.y.getDimensionPixelSize(R.dimen.watermark_guide_tips_w);
            int dimensionPixelSize2 = this.y.getDimensionPixelSize(R.dimen.watermark_guide_tips_h);
            int dimensionPixelSize3 = (this.v - this.y.getDimensionPixelSize(R.dimen.watermark_guide_tips_margin_bottom)) - dimensionPixelSize2;
            int i = (this.r / 2) - (dimensionPixelSize / 2);
            this.q.setBackgroundColor(Color.parseColor("#50000000"));
            TextView textView = new TextView(this.c);
            this.D = textView;
            textView.setVisibility(8);
            this.D.setTextSize(2, 11.0f);
            this.D.setTextColor(Color.parseColor("#FFFFFF"));
            this.D.setBackgroundResource(R.drawable.running_click_btn_bg_dark_corners);
            this.D.setText(R.string.running_watermark_guide_tips);
            this.D.setGravity(17);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
            layoutParams.topMargin = dimensionPixelSize3;
            layoutParams.leftMargin = i;
            this.q.addView(this.D, layoutParams);
            this.p.setBackgroundResource(R.drawable.watermark_dotted_line);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C(long j, int i, int i2) {
        if (TextUtils.isEmpty(this.C)) {
            GPSAddressConversionProxy.getInstance().loadSLLDescription(this.c, new b(), j, i, i2);
            return true;
        }
        c0(this.C);
        return true;
    }

    private Bitmap F(String str, boolean z) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bitmap bitmapCopy = copy(this.c, BitmapFactory.decodeFile(str));
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = 0;
        if (z) {
            while (i2 < i) {
                if (iArr[i2] != this.E) {
                    iArr[i2] = this.F;
                }
                i2++;
            }
        } else {
            while (i2 < i) {
                if (iArr[i2] != this.E) {
                    iArr[i2] = this.G;
                }
                i2++;
            }
        }
        bitmapCopy.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCopy;
    }

    private void G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Throwable {
        if (!WatermarkShareDataUtil.isRunInternal() && this.z.equalsIgnoreCase("zh") && this.A.equalsIgnoreCase("cn")) {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(R.layout.fragment_watermark_camera_line_trace_loc, viewGroup, false);
            this.q = relativeLayout;
            this.e = (ImageView) relativeLayout.findViewById(R.id.watermark_line_icon);
            this.f = (ImageView) this.q.findViewById(R.id.iv_watermark_local);
            this.m = (TextView) this.q.findViewById(R.id.watermark_km_value);
            this.h = (TextView) this.q.findViewById(R.id.watermark_city_text);
            this.g = (TextView) this.q.findViewById(R.id.tv_km_unit);
            boolean z = this.a;
            if (z) {
                Bitmap bitmapF = F(this.b.mapLine, z);
                if (bitmapF != null) {
                    this.e.setImageBitmap(bitmapF);
                }
                U(this.a);
            } else {
                this.e.setImageURI(Uri.parse(this.b.mapLine));
            }
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) layoutInflater.inflate(R.layout.fragment_watermark_camera_line_dis_costtime, viewGroup, false);
            this.q = relativeLayout2;
            this.m = (TextView) relativeLayout2.findViewById(R.id.watermark_km_value);
            TextView textView = (TextView) this.q.findViewById(R.id.watermark_time_text);
            this.n = textView;
            textView.setText(DataFormatterProxy.getInstance().getConsumeTime(Long.parseLong(this.b.time)));
            this.g = (TextView) this.q.findViewById(R.id.tv_km_unit);
        }
        this.m.setText(this.b.kilometer);
        if (this.I) {
            this.g.setText("km");
        } else {
            this.g.setText("mi");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Long l) {
        this.x.setOperateEnable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(Throwable th) {
        HMLog.error(L, "", th, new Function0() { // from class: qm8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatermarkViewGenerator.I();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Long l) {
        this.p.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(Throwable th) {
        HMLog.error(L, "", th, new Function0() { // from class: pm8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatermarkViewGenerator.L();
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void N() {
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout == null) {
            return;
        }
        this.p = (RelativeLayout) relativeLayout.findViewById(R.id.rl_drag_line);
        this.K = (CustomWatermarkView) this.q.findViewById(R.id.custom_markview);
        HMLog.d(L, "reloadCustomWatermark pos=" + this.b.position, new Object[0]);
        this.p.getViewTreeObserver().addOnGlobalLayoutListener(new g());
    }

    private void Q(int i) {
        Z(this.m, i);
        Z(this.g, i);
        Z(this.n, i);
    }

    private void R(int i) {
        Z(this.i, i);
        Z(this.n, i);
        Z(this.m, i);
        Z(this.g, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void S() {
        int height = this.p.getHeight();
        this.t = height;
        this.v = (this.s - height) - this.u;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.p.getLayoutParams();
        layoutParams.topMargin = this.v;
        layoutParams.addRule(14);
        this.p.setLayoutParams(layoutParams);
        this.p.setId(R.id.watermark_dragline);
        this.p.setOnTouchListener(this.J);
        this.p.setClickable(true);
        Observable.timer(200L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: sm8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.K((Long) obj);
            }
        }, new Action1() { // from class: tm8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatermarkViewGenerator.M((Throwable) obj);
            }
        });
    }

    private void T(boolean z) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-16777216);
        Drawable drawable = ContextCompat.getDrawable(this.c, R.drawable.watermark_logo);
        if (z) {
            this.k.setBackground(BitmapUtils.tintDrawable(drawable.mutate(), colorStateListValueOf));
            this.l.setTextColor(this.F);
        } else {
            this.k.setBackground(drawable);
            this.l.setTextColor(this.G);
        }
    }

    private void U(boolean z) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-16777216);
        Drawable drawable = ContextCompat.getDrawable(this.c, R.drawable.watermark_location_white);
        if (z) {
            this.f.setBackground(BitmapUtils.tintDrawable(drawable.mutate(), colorStateListValueOf));
            a0(this.F);
        } else {
            this.f.setBackground(drawable);
            a0(this.G);
        }
    }

    private void V(boolean z) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-16777216);
        Drawable drawable = ContextCompat.getDrawable(this.c, R.drawable.run_watermark_running_rhythm_white);
        if (z) {
            W(this.F);
            this.o.setBackground(BitmapUtils.tintDrawable(drawable.mutate(), colorStateListValueOf));
        } else {
            W(this.G);
            this.o.setBackground(drawable);
        }
    }

    private void W(int i) {
        Z(this.m, i);
        Z(this.n, i);
    }

    private void X(int i) {
        Z(this.m, i);
        Z(this.g, i);
    }

    private void Y(boolean z) {
        Drawable drawable;
        if (this.z.equalsIgnoreCase("zh")) {
            drawable = this.A.equalsIgnoreCase("cn") ? ContextCompat.getDrawable(this.c, R.drawable.run_watermark_running_is_good_white) : ContextCompat.getDrawable(this.c, R.drawable.run_watermark_running_is_good_white_tw);
        } else {
            drawable = ContextCompat.getDrawable(this.c, R.drawable.run_watermark_running_is_good_white_en);
        }
        if (z) {
            this.j.setBackground(BitmapUtils.tintDrawable(drawable.mutate(), ColorStateList.valueOf(-16777216)));
        } else {
            this.j.setBackground(drawable);
        }
    }

    private void Z(View view, int i) {
        ((TextView) view).setTextColor(i);
    }

    private void a0(int i) {
        Z(this.m, i);
        Z(this.g, i);
        Z(this.h, i);
    }

    private void b0() {
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(TextUtils.isEmpty(this.C) ? this.c.getString(R.string.running_share_to_title) : this.C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(String str) {
        this.C = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b0();
    }

    public static Bitmap copy(Context context, Bitmap bitmap) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(WatermarkFileUtils.getCachePath(context, "temp.txt"), "rw");
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0L, width * height * 4);
                    bitmap.copyPixelsToBuffer(map);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    map.position(0);
                    bitmapCreateBitmap.copyPixelsFromBuffer(map);
                    bitmap.recycle();
                    try {
                        channel.close();
                        randomAccessFile.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return bitmapCreateBitmap;
                } catch (Exception unused) {
                    bitmap.recycle();
                    try {
                        channel.close();
                        randomAccessFile.close();
                        return null;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileChannel = channel;
                    bitmap.recycle();
                    try {
                        fileChannel.close();
                        randomAccessFile.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                channel = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            randomAccessFile = null;
            channel = null;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public void D(int i, boolean z) throws Throwable {
        T(z);
        if (i == 17) {
            if (!WatermarkShareDataUtil.isRunInternal() && this.z.equalsIgnoreCase("zh") && this.A.equalsIgnoreCase("cn")) {
                Bitmap bitmapF = F(this.b.mapLine, z);
                if (bitmapF != null) {
                    this.e.setImageBitmap(bitmapF);
                }
                U(z);
            } else {
                Q(z ? this.F : this.G);
            }
        } else if (i == 18) {
            R(z ? this.F : this.G);
        } else if (i == 19) {
            X(z ? this.F : this.G);
            Y(z);
        } else if (i == 20) {
            V(z);
        } else {
            this.K.setBlackOrWhite(z);
            this.K.invalidate();
        }
        Observable.timer(500L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: rm8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.H((Long) obj);
            }
        }, new Action1() { // from class: um8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WatermarkViewGenerator.J((Throwable) obj);
            }
        });
    }

    public View E() throws Throwable {
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        int i = this.b.type;
        if (i != 100 && i != 101) {
            switch (i) {
                case 17:
                    G(this.d, null);
                    RelativeLayout relativeLayout2 = (RelativeLayout) this.q.findViewById(R.id.rl_drag_line);
                    this.p = relativeLayout2;
                    relativeLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new c());
                    break;
                case 18:
                    RelativeLayout relativeLayout3 = (RelativeLayout) View.inflate(this.c, R.layout.fragment_watermark_camera_line_dis_time_pace, null);
                    this.q = relativeLayout3;
                    this.p = (RelativeLayout) relativeLayout3.findViewById(R.id.rl_drag_line);
                    this.i = (TextView) this.q.findViewById(R.id.watermark_speed_text);
                    this.n = (TextView) this.q.findViewById(R.id.watermark_time_text);
                    this.g = (TextView) this.q.findViewById(R.id.watermark_mileage_label_text);
                    this.m = (TextView) this.q.findViewById(R.id.watermark_km_value);
                    if (this.I) {
                        this.g.setText("km");
                    } else {
                        this.g.setText("mi");
                    }
                    if (TextUtils.isEmpty(this.b.pace)) {
                        this.i.setText(DataFormatterProxy.getInstance().formatTimeInSportForm(0L));
                    } else {
                        this.i.setText(this.b.pace);
                    }
                    this.n.setText(DataFormatterProxy.getInstance().getConsumeTime(Long.parseLong(this.b.time)));
                    this.m.setText(this.b.kilometer);
                    this.p.getViewTreeObserver().addOnGlobalLayoutListener(new d());
                    break;
                case 19:
                    RelativeLayout relativeLayout4 = (RelativeLayout) View.inflate(this.c, R.layout.fragment_watermark_camera_line_third, null);
                    this.q = relativeLayout4;
                    this.p = (RelativeLayout) relativeLayout4.findViewById(R.id.rl_drag_line);
                    this.m = (TextView) this.q.findViewById(R.id.watermark_km_value);
                    TextView textView = (TextView) this.q.findViewById(R.id.tv_km_unit_value);
                    this.g = textView;
                    if (this.I) {
                        textView.setText("km");
                    } else {
                        textView.setText("mi");
                    }
                    this.j = (ImageView) this.q.findViewById(R.id.running_is_good);
                    Y(this.a);
                    this.m.setText(this.b.kilometer);
                    this.p.getViewTreeObserver().addOnGlobalLayoutListener(new e());
                    break;
                case 20:
                    RelativeLayout relativeLayout5 = (RelativeLayout) View.inflate(this.c, R.layout.fragment_watermark_camera_line_rhythm_endtime, null);
                    this.q = relativeLayout5;
                    this.p = (RelativeLayout) relativeLayout5.findViewById(R.id.rl_drag_line);
                    this.o = this.q.findViewById(R.id.watermark_rhythm_layout);
                    this.m = (TextView) this.q.findViewById(R.id.watermark_km_value);
                    this.n = (TextView) this.q.findViewById(R.id.watermark_time_value);
                    StringBuilder sb = new StringBuilder(this.b.kilometer);
                    if (this.I) {
                        sb.append("km");
                    } else {
                        sb.append("mi");
                    }
                    this.m.setText(sb.toString());
                    this.n.setText(this.b.time);
                    V(this.a);
                    this.p.getViewTreeObserver().addOnGlobalLayoutListener(new f());
                    break;
            }
        } else {
            HMLog.d(L, "onCreateView custom", new Object[0]);
            this.q = (RelativeLayout) View.inflate(this.c, R.layout.fragment_watermark_camera_line_custom, null);
            N();
        }
        this.k = (ImageView) this.q.findViewById(R.id.watermark_logo_icon);
        this.l = (TextView) this.q.findViewById(R.id.watermark_logo_label);
        T(this.a);
        this.k.setBackgroundResource(WatermarkShareDataUtil.getLogoDrawableId());
        this.l.setText(WatermarkShareDataUtil.getDeviceName());
        return this.q;
    }

    public void O(WatermarkShareActivity watermarkShareActivity) {
        this.x = watermarkShareActivity;
    }

    public void P(boolean z) {
        this.a = z;
    }

    public CustomWatermarkView getSelfCustomWatermarkView() {
        return this.K;
    }

    public Watermark getWatermark() {
        return this.b;
    }
}
