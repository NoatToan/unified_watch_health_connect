package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.albumview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceUpdateReTrack;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.VideoModel;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jhl;
import defpackage.jho;
import defpackage.jpq;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SlideBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10750a;
    private Drawable aa;
    private Drawable ab;
    private int ac;
    private Drawable ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private Paint aj;
    private Drawable ak;
    private Scroller al;
    private Drawable am;
    private Drawable an;
    private VelocityTracker ao;
    private ReTrackSimplify ap;
    private Drawable aq;
    private int ar;
    private int as;
    private String at;
    private int au;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10752c;
    private Map<Integer, InterfaceUpdateReTrack.MarkerType> d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private Drawable j;
    private int k;
    private int l;
    private Map<Integer, String> m;
    private Map<Integer, ArrayList<PhotoModel>> n;
    private Drawable o;
    private int p;
    private boolean q;
    private Map<Integer, ArrayList<VideoModel>> r;
    private int s;
    private boolean t;
    private Drawable u;
    private Drawable v;
    private Drawable w;
    private HashMap<Drawable, String> x;
    private HashMap<Drawable, Integer> y;
    private int z;

    public SlideBar(Context context) {
        this(context, null);
    }

    public SlideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = new HashMap<>();
        this.x = new HashMap<>();
        this.m = new LinkedHashMap();
        this.r = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.q = false;
        this.t = false;
        this.ap = null;
        b(context);
        b(context, attributeSet);
        c(context);
        setWillNotDraw(false);
        d(context);
        this.q = LanguageUtil.ba(context);
        if (qrs.ab(context)) {
            this.t = true;
        }
    }

    private void d(Context context) {
        if (qrs.x(context)) {
            this.f10751b = 234881023;
        } else {
            this.f10751b = 218103808;
        }
    }

    private void b(Context context) {
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        this.ao = velocityTrackerObtain;
        if (velocityTrackerObtain == null) {
            Log.e("SlideBar", "SlideBar:mVelocityTracker is null");
            return;
        }
        this.aj = new Paint(1);
        this.al = new Scroller(context);
        this.z = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.af = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SlideBar);
        int i = getResources().getDisplayMetrics().widthPixels;
        this.au = i;
        this.ac = i / 2;
        this.as = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.SlideBar_topBoundary, jhl.c(context, 40.0f));
        this.i = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.SlideBar_bottomBoundary, jhl.c(context, 66.0f));
        this.ah = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.SlideBar_midLocationWidth, jhl.c(context, 1.0f));
        this.ai = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.SlideBar_midLocationHeight, jhl.c(context, 6.0f));
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.SlideBar_addIconBottom, jhl.c(context, 36.0f));
        this.f10750a = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.SlideBar_addIconTop, jhl.c(context, 0.0f));
        this.l = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.SlideBar_iconSize, jhl.c(context, 12.0f));
        this.f10752c = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.SlideBar_addIconSize, jhl.c(context, 18.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(Context context) {
        this.aa = ContextCompat.getDrawable(context, R.drawable.trackalbum_slidebar_pointer);
        this.ak = ContextCompat.getDrawable(context, R.drawable.trackalbum_slidebar_start);
        this.o = ContextCompat.getDrawable(context, R.drawable.trackalbum_slidebar_end);
        this.w = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_climb);
        this.v = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_heartrate);
        this.ab = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_speed);
        this.ad = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_pace);
        this.u = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_cadence);
        this.am = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_text_unselected);
        this.an = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_pic_unselected);
        this.aq = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_video_unselected);
        this.h = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_text_selected);
        this.g = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_pic_selected);
        this.j = ContextCompat.getDrawable(getContext(), R.drawable.trackalbum_slidebar_video_selected);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f = (getScrollX() * (this.ae - 1)) / this.s;
        a(canvas);
        b(canvas);
        e(canvas);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.al.computeScrollOffset()) {
            scrollTo(this.al.getCurrX(), this.al.getCurrY());
            postInvalidate();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (i <= 0) {
            b();
            i = 0;
        } else if (i >= this.s) {
            b();
            i = this.s;
        }
        if (i != getScrollX()) {
            super.scrollTo(i, i2);
        }
    }

    private void b() {
        if (this.al.isFinished()) {
            return;
        }
        this.al.abortAnimation();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.ao == null) {
            this.ao = VelocityTracker.obtain();
        }
        this.ao.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            int rawX = (int) motionEvent.getRawX();
            this.k = rawX;
            this.ar = rawX;
        } else if (action == 1) {
            this.ao.computeCurrentVelocity(1000, this.z);
            int xVelocity = (int) this.ao.getXVelocity();
            if (Math.abs(xVelocity) > this.af) {
                b(-xVelocity);
            }
            if (this.k == this.ar) {
                d();
            } else {
                a();
            }
            i();
        } else if (action == 2) {
            int rawX2 = (int) motionEvent.getRawX();
            this.ag = rawX2;
            if (Math.abs(rawX2 - this.k) < 3) {
                this.ag = this.k;
            }
            int i = this.ar - this.ag;
            if (this.q) {
                i = -i;
            }
            scrollBy(i, 0);
            this.ar = this.ag;
        } else if (action == 3) {
            b();
            a();
            i();
        }
        return true;
    }

    private void i() {
        VelocityTracker velocityTracker = this.ao;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ao = null;
        }
    }

    private void d() {
        int i = this.ar;
        if (this.t && !this.q) {
            i -= this.au;
        }
        if (this.q) {
            i = this.au - i;
        }
        Iterator<Map.Entry<Drawable, Integer>> it = this.y.entrySet().iterator();
        int iAbs = Integer.MAX_VALUE;
        int scrollX = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Integer value = it.next().getValue();
            if (value != null && Math.abs((getScrollX() + i) - value.intValue()) < 40 && Math.abs(iAbs) > Math.abs((getScrollX() + i) - value.intValue())) {
                scrollX = (value.intValue() - getScrollX()) - this.ac;
                iAbs = Math.abs((getScrollX() + i) - value.intValue());
            }
        }
        if (Math.abs((getScrollX() + i) - this.ac) < 40 && Math.abs(iAbs) > Math.abs((getScrollX() + i) - this.ac)) {
            scrollX = -getScrollX();
            iAbs = Math.abs((getScrollX() + i) - this.ac);
        }
        if (Math.abs(((getScrollX() + i) - this.ac) - this.s) < 40 && Math.abs(iAbs) > Math.abs(((getScrollX() + i) - this.ac) - this.s)) {
            scrollX = this.s - getScrollX();
            iAbs = Math.abs(((getScrollX() + i) - this.ac) - this.s);
        }
        Iterator<Map.Entry<Integer, InterfaceUpdateReTrack.MarkerType>> it2 = this.d.entrySet().iterator();
        while (it2.hasNext()) {
            int iIntValue = (it2.next().getKey().intValue() * this.s) / (this.ae - 1);
            if (Math.abs(((getScrollX() + i) - iIntValue) - this.ac) < 40 && Math.abs(iAbs) > Math.abs(((getScrollX() + i) - iIntValue) - this.ac)) {
                scrollX = iIntValue - getScrollX();
                iAbs = Math.abs(((getScrollX() + i) - iIntValue) - this.ac);
            }
        }
        if (scrollX != Integer.MAX_VALUE) {
            scrollBy(scrollX, 0);
            this.f = (getScrollX() * (this.ae - 1)) / this.s;
        }
    }

    private void a() {
        int i = this.ac;
        int scrollX = getScrollX();
        int i2 = this.p;
        int i3 = (i + scrollX) % i2;
        if (i3 > i2) {
            scrollBy(i2 - i3, 0);
            invalidate();
        } else {
            scrollBy(-i3, 0);
        }
    }

    private void e(Canvas canvas) {
        this.at = "";
        Drawable drawable = this.ak;
        int i = this.ac;
        int i2 = this.l;
        int i3 = (this.as + this.i) / 2;
        drawable.setBounds(i - i2, i3 - i2, i + i2, i3 + i2);
        this.ak.draw(canvas);
        Drawable drawable2 = this.o;
        int i4 = this.ac;
        int i5 = this.s;
        int i6 = this.l;
        int i7 = i4 + i5;
        int i8 = (this.as + this.i) / 2;
        drawable2.setBounds(i7 - i6, i8 - i6, i7 + i6, i8 + i6);
        this.o.draw(canvas);
        for (Map.Entry<Drawable, Integer> entry : this.y.entrySet()) {
            Integer value = entry.getValue();
            if (value != null) {
                int iIntValue = value.intValue();
                Drawable key = entry.getKey();
                int i9 = this.l;
                int i10 = (this.as + this.i) / 2;
                key.setBounds(iIntValue - i9, i10 - i9, iIntValue + i9, i10 + i9);
                entry.getKey().draw(canvas);
                if (value.intValue() == getScrollX() + this.ac) {
                    this.at = this.x.get(entry.getKey());
                }
            }
        }
    }

    public void c() {
        if (((Integer) this.ap.getMaxAltitude().first).intValue() != -1) {
            this.y.put(this.w, Integer.valueOf(e(((Integer) this.ap.getMaxAltitude().first).intValue())));
            this.x.put(this.w, getResources().getString(R.string.IDS_max_altitude, getResources().getQuantityString(UnitUtil.f() ? R.plurals.IDS_altitude_ft : R.plurals.IDS_altitude_meter, (int) Math.ceil(((Double) this.ap.getMaxAltitude().second).doubleValue()), jho.c(((Double) this.ap.getMaxAltitude().second).doubleValue()))));
        }
        if (((Integer) this.ap.getMaxHeartRate().first).intValue() != -1) {
            this.y.put(this.v, Integer.valueOf(e(((Integer) this.ap.getMaxHeartRate().first).intValue())));
            this.x.put(this.v, getResources().getString(R.string.IDS_max_heartrate, BidiFormatter.getInstance().unicodeWrap(getResources().getQuantityString(R.plurals.IDS_Plugin_motion_track_heart_rate_unit, (int) Math.ceil(((Double) this.ap.getMaxHeartRate().second).doubleValue()), jho.e(Math.ceil(((Double) this.ap.getMaxHeartRate().second).doubleValue()))))));
        }
        if (((Integer) this.ap.getMaxSpeed().first).intValue() != -1) {
            if (this.ap.getMaxSpeedType() == 18) {
                this.y.put(this.u, Integer.valueOf(e(((Integer) this.ap.getMaxSpeed().first).intValue())));
                this.x.put(this.u, getResources().getString(R.string.IDS_max_cadence, getResources().getQuantityString(R.plurals.IDS_steps_rate, (int) Math.ceil(((Double) this.ap.getMaxSpeed().second).doubleValue()), jho.i(((Double) this.ap.getMaxSpeed().second).doubleValue()))));
            } else if (this.ap.getMaxSpeedType() == 17) {
                this.y.put(this.ab, Integer.valueOf(e(((Integer) this.ap.getMaxSpeed().first).intValue())));
                this.x.put(this.ab, getResources().getString(R.string.IDS_max_speed, getResources().getQuantityString(UnitUtil.f() ? R.plurals.IDS_plugin_motion_track_distance_record_unit_mihour : R.plurals.IDS_speed_kilometer_per_hour, (int) Math.ceil(((Double) this.ap.getMaxSpeed().second).doubleValue()), jho.a(((Double) this.ap.getMaxSpeed().second).doubleValue()))));
            } else {
                this.y.put(this.ad, Integer.valueOf(e(((Integer) this.ap.getMaxSpeed().first).intValue())));
                double dDoubleValue = ((Double) this.ap.getMaxSpeed().second).doubleValue();
                this.x.put(this.ad, getResources().getString(R.string.IDS_max_pace, getResources().getQuantityString(UnitUtil.f() ? R.plurals.IDS_hwh_motiontrack_pre_unit_mi : R.plurals.IDS_hwh_motiontrack_pre_unit_km, (int) Math.ceil(dDoubleValue), jpq.e((float) dDoubleValue))));
            }
        }
    }

    private int e(int i) {
        return ((this.s * i) / (this.ae - 1)) + this.ac;
    }

    public void e() {
        int i = this.ae;
        if (i <= 450) {
            this.s = (i - 1) * 4;
            this.p = 4;
        } else if (i <= 650) {
            this.s = (i - 1) * 3;
            this.p = 3;
        } else {
            this.s = (i - 1) * 2;
            this.p = 2;
        }
        LogUtil.a("SlideBar", "mLengthOfSlideBar : ", Integer.valueOf(this.s), "mLineDegreeSpace : ", Integer.valueOf(this.p));
    }

    private void a(Canvas canvas) {
        this.aj.setAntiAlias(true);
        int i = (this.i - this.as) / 2;
        this.aj.setStyle(Paint.Style.FILL);
        this.aj.setColor(this.f10751b);
        int i2 = this.ac + this.s;
        canvas.drawArc(new RectF(i2 - i, this.as, i2 + i, this.i), 270.0f, 180.0f, false, this.aj);
        int i3 = this.ac;
        canvas.drawRect(i3, this.as, i3 + this.s, this.i, this.aj);
        this.aj.setStyle(Paint.Style.FILL);
        this.aj.setColor(-15978);
        int i4 = this.ac;
        canvas.drawArc(new RectF(i4 - i, this.as, i4 + i, this.i), 90.0f, 180.0f, false, this.aj);
        int i5 = this.ac;
        canvas.drawRect(i5, this.as, i5 + getScrollX(), this.i, this.aj);
        Drawable drawable = this.aa;
        int i6 = this.ac;
        int i7 = this.ah;
        drawable.setBounds((i6 - i7) + getScrollX(), this.as - this.ai, this.ac + this.ah + getScrollX(), this.i + this.ai);
        this.aa.draw(canvas);
    }

    private void b(Canvas canvas) {
        this.at = "";
        InterfaceUpdateReTrack.MarkerType value = null;
        for (Map.Entry<Integer, InterfaceUpdateReTrack.MarkerType> entry : this.d.entrySet()) {
            if (entry.getKey().intValue() == this.f) {
                value = entry.getValue();
            } else {
                a(canvas, entry);
            }
        }
        if (value != null) {
            a(canvas, value);
        }
    }

    private void a(Canvas canvas, InterfaceUpdateReTrack.MarkerType markerType) {
        if (markerType == InterfaceUpdateReTrack.MarkerType.Image_type) {
            Drawable drawable = this.g;
            int scrollX = getScrollX();
            int i = this.ac;
            int i2 = this.f10752c;
            int i3 = this.f10750a;
            int scrollX2 = getScrollX();
            int i4 = this.ac;
            drawable.setBounds((scrollX + i) - i2, i3, scrollX2 + i4 + this.f10752c, this.e);
            this.g.draw(canvas);
            return;
        }
        if (markerType == InterfaceUpdateReTrack.MarkerType.Text_type) {
            Drawable drawable2 = this.h;
            int scrollX3 = getScrollX();
            int i5 = this.ac;
            int i6 = this.f10752c;
            int i7 = this.f10750a;
            int scrollX4 = getScrollX();
            int i8 = this.ac;
            drawable2.setBounds((scrollX3 + i5) - i6, i7, scrollX4 + i8 + this.f10752c, this.e);
            this.h.draw(canvas);
            return;
        }
        Drawable drawable3 = this.j;
        int scrollX5 = getScrollX();
        int i9 = this.ac;
        int i10 = this.f10752c;
        int i11 = this.f10750a;
        int scrollX6 = getScrollX();
        int i12 = this.ac;
        drawable3.setBounds((scrollX5 + i9) - i10, i11, scrollX6 + i12 + this.f10752c, this.e);
        this.j.draw(canvas);
    }

    private void a(Canvas canvas, Map.Entry<Integer, InterfaceUpdateReTrack.MarkerType> entry) {
        int iIntValue = (entry.getKey().intValue() * this.s) / (this.ae - 1);
        if (entry.getValue() == InterfaceUpdateReTrack.MarkerType.Image_type) {
            Drawable drawable = this.an;
            int i = this.ac;
            int i2 = this.f10752c;
            int i3 = iIntValue + i;
            drawable.setBounds(i3 - i2, this.f10750a, i3 + i2, this.e);
            this.an.draw(canvas);
            return;
        }
        if (entry.getValue() == InterfaceUpdateReTrack.MarkerType.Text_type) {
            Drawable drawable2 = this.am;
            int i4 = this.ac;
            int i5 = this.f10752c;
            int i6 = iIntValue + i4;
            drawable2.setBounds(i6 - i5, this.f10750a, i6 + i5, this.e);
            this.am.draw(canvas);
            return;
        }
        Drawable drawable3 = this.aq;
        int i7 = this.ac;
        int i8 = this.f10752c;
        int i9 = iIntValue + i7;
        drawable3.setBounds(i9 - i8, this.f10750a, i9 + i8, this.e);
        this.aq.draw(canvas);
    }

    private void b(int i) {
        Scroller scroller = this.al;
        int scrollX = getScrollX();
        int i2 = this.s;
        scroller.fling(scrollX, 0, i, 0, -i2, i2, 0, 0);
    }

    public void setNumberPoints(int i) {
        this.ae = i;
    }

    public int getCurrentPointIndex() {
        return this.f;
    }

    public void setTrackSimplify(ReTrackSimplify reTrackSimplify) {
        this.ap = reTrackSimplify;
    }

    public String getWonderfulText() {
        return this.at;
    }

    public void setIndexOfText(Map<Integer, String> map) {
        this.m = map;
        setAddIconType(this.f);
        invalidate();
    }

    private void setAddIconType(int i) {
        if (this.r.containsKey(Integer.valueOf(i))) {
            if (this.d.get(Integer.valueOf(i)) != InterfaceUpdateReTrack.MarkerType.Video_type) {
                this.d.put(Integer.valueOf(i), InterfaceUpdateReTrack.MarkerType.Video_type);
            }
        } else if (this.n.containsKey(Integer.valueOf(i))) {
            if (this.d.get(Integer.valueOf(i)) != InterfaceUpdateReTrack.MarkerType.Image_type) {
                this.d.put(Integer.valueOf(i), InterfaceUpdateReTrack.MarkerType.Image_type);
            }
        } else {
            if (this.m.containsKey(Integer.valueOf(i))) {
                if (this.d.get(Integer.valueOf(i)) != InterfaceUpdateReTrack.MarkerType.Text_type) {
                    this.d.put(Integer.valueOf(i), InterfaceUpdateReTrack.MarkerType.Text_type);
                    return;
                }
                return;
            }
            this.d.remove(Integer.valueOf(i));
        }
    }

    public void setIndexOfVideo(Map<Integer, ArrayList<VideoModel>> map, int i) {
        this.r = map;
        if (i != this.f) {
            d(i);
        }
        setAddIconType(i);
        invalidate();
    }

    public void setIndexOfPhoto(Map<Integer, ArrayList<PhotoModel>> map, int i) {
        this.n = map;
        if (i != this.f) {
            d(i);
        }
        setAddIconType(i);
        invalidate();
    }

    public void setAutoMatchPhoto(int i, Map<Integer, ArrayList<PhotoModel>> map) {
        this.n = map;
        this.d.put(Integer.valueOf(i), InterfaceUpdateReTrack.MarkerType.Image_type);
    }

    public void d(int i) {
        scrollTo(i * this.p, 0);
        this.f = (getScrollX() * (this.ae - 1)) / this.s;
    }
}
