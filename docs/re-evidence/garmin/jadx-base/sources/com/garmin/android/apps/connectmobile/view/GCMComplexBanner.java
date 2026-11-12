package com.garmin.android.apps.connectmobile.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class GCMComplexBanner extends LinearLayout implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f47418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f47419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public VelocityTracker f47420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f47421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f47422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f47423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f47424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f47425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f47426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f47427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f47428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f47429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f47430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f47431r;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f47432a;

        public a(View view2) {
            this.f47432a = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            GCMComplexBanner gCMComplexBanner = GCMComplexBanner.this;
            if (gCMComplexBanner.f47423j.getVisibility() == 0) {
                gCMComplexBanner.setMinimized(true);
            } else {
                gCMComplexBanner.setVisibility(8);
            }
            View view2 = this.f47432a;
            view2.setX(0.0f);
            view2.setAlpha(1.0f);
        }
    }

    public interface b {
    }

    public enum c {
        ERROR,
        INFO,
        WARNING,
        SUCCESS,
        GC_STATUS_RED,
        /* JADX INFO: Fake field, exist only in values array */
        GC_STATUS_YELLOW,
        /* JADX INFO: Fake field, exist only in values array */
        GC_STATUS_GREEN
    }

    public GCMComplexBanner(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        LayoutInflater.from(context).inflate(R.layout.gcm_complex_banner, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149704f, i14, 0);
        this.f47429p = typedArrayObtainStyledAttributes.getBoolean(0, true);
        View viewFindViewById = findViewById(R.id.gcm_banner_progress_container);
        this.f47422i = viewFindViewById;
        this.f47423j = viewFindViewById.findViewById(R.id.gcm_banner_progress_bar);
        this.f47424k = viewFindViewById.findViewById(R.id.gcm_banner_progress_background);
        View viewFindViewById2 = findViewById(R.id.gcm_banner_container);
        this.f47425l = viewFindViewById2;
        viewFindViewById2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(1, 0));
        viewFindViewById2.setVisibility(this.f47430q ? 8 : 0);
        this.f47426m = (TextView) viewFindViewById2.findViewById(R.id.primary_text);
        setPrimaryText(typedArrayObtainStyledAttributes.getString(2));
        this.f47427n = (TextView) viewFindViewById2.findViewById(R.id.secondary_text);
        setSecondaryText(typedArrayObtainStyledAttributes.getString(3));
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.gcm_hide_text_container);
        this.f47428o = viewFindViewById3;
        oq.a aVar = new oq.a(this, 14);
        viewFindViewById3.setOnClickListener(aVar);
        viewFindViewById3.findViewById(R.id.gcm_hide_text).setOnClickListener(aVar);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f47414a = viewConfiguration.getScaledTouchSlop();
        this.f47415b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f47416c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f47417d = getContext().getResources().getInteger(android.R.integer.config_shortAnimTime);
        setOnTouchListener(this);
        typedArrayObtainStyledAttributes.recycle();
    }

    public c getStyle() {
        return this.f47431r;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view2, MotionEvent motionEvent) {
        boolean z14;
        motionEvent.offsetLocation(this.f47421h, 0.0f);
        int actionMasked = motionEvent.getActionMasked();
        boolean z15 = true;
        if (actionMasked != 0) {
            long j8 = this.f47417d;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker = this.f47420g;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.f47418e;
                        if (Math.abs(rawX) > this.f47414a) {
                            this.f47419f = true;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                            motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                        if (this.f47419f) {
                            this.f47421h = rawX;
                            setTranslationX(rawX);
                            return true;
                        }
                    }
                } else if (actionMasked == 3 && this.f47420g != null) {
                    animate().translationX(0.0f).alpha(1.0f).setDuration(j8).setListener(null);
                    this.f47420g.recycle();
                    this.f47420g = null;
                    this.f47421h = 0.0f;
                    this.f47418e = 0.0f;
                    this.f47419f = false;
                    return false;
                }
            } else if (this.f47420g != null) {
                float rawX2 = motionEvent.getRawX() - this.f47418e;
                this.f47420g.addMovement(motionEvent);
                this.f47420g.computeCurrentVelocity(1000);
                float xVelocity = this.f47420g.getXVelocity();
                float fAbs = Math.abs(xVelocity);
                float fAbs2 = Math.abs(this.f47420g.getYVelocity());
                if (Math.abs(rawX2) > getWidth() / 2) {
                    z14 = rawX2 > 0.0f;
                } else if (this.f47415b > fAbs || fAbs > this.f47416c || fAbs2 >= fAbs) {
                    z14 = false;
                    z15 = false;
                } else {
                    z15 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                    z14 = this.f47420g.getXVelocity() > 0.0f;
                }
                if (z15) {
                    animate().translationX(z14 ? getWidth() : -getWidth()).alpha(0.0f).setDuration(j8).setListener(new a(view2));
                } else if (this.f47419f) {
                    animate().translationX(0.0f).alpha(1.0f).setDuration(j8).setListener(null);
                } else {
                    this.f47423j.getVisibility();
                }
                this.f47420g.recycle();
                this.f47420g = null;
                this.f47421h = 0.0f;
                this.f47418e = 0.0f;
                this.f47419f = false;
                return false;
            }
        } else {
            this.f47418e = motionEvent.getRawX();
            if (this.f47429p && !this.f47430q) {
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f47420g = velocityTrackerObtain;
                velocityTrackerObtain.addMovement(motionEvent);
                return true;
            }
        }
        return false;
    }

    public void setBannerListener(b bVar) {
    }

    public void setDismissible(boolean z14) {
        this.f47429p = z14;
        View view2 = this.f47428o;
        if (z14) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
    }

    public void setMinimized(boolean z14) {
        this.f47430q = z14;
        View view2 = this.f47425l;
        if (view2 != null) {
            view2.setVisibility(z14 ? 8 : 0);
            View view3 = this.f47423j;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view3.getLayoutParams();
            layoutParams.bottomMargin = z14 ? 0 : (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
            view3.setLayoutParams(layoutParams);
        }
    }

    public void setPrimaryText(String str) {
        TextView textView = this.f47426m;
        if (textView != null) {
            if (str == null || str.isEmpty()) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
        }
    }

    public void setProgress(float f14) {
        View view2 = this.f47423j;
        if (view2 != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.weight = f14;
            view2.setLayoutParams(layoutParams);
            View view3 = this.f47424k;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view3.getLayoutParams();
            layoutParams2.weight = 100.0f - f14;
            view3.setLayoutParams(layoutParams2);
        }
    }

    public void setSecondaryText(String str) {
        TextView textView = this.f47427n;
        if (textView != null) {
            if (str == null || str.isEmpty()) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
        }
    }

    public void setShowProgress(boolean z14) {
        View view2 = this.f47422i;
        if (view2 != null) {
            view2.setVisibility(z14 ? 0 : 8);
        }
    }

    public void setStyle(c cVar) {
        int i14;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 1) {
            i14 = R.color.gds_data_viz_blue_primary;
        } else if (iOrdinal == 2) {
            i14 = R.color.gds_data_viz_green_primary;
        } else if (iOrdinal != 3) {
            i14 = R.color.gds_data_viz_red_primary;
            if (iOrdinal != 4 && iOrdinal != 5) {
                i14 = R.color.gcm_surface_danger_action;
            }
        } else {
            i14 = R.color.palette_mango_1;
        }
        this.f47425l.setBackgroundColor(a7.b.getColor(getContext(), i14));
        this.f47423j.setBackgroundColor(a7.b.getColor(getContext(), i14));
        this.f47431r = cVar;
    }

    public GCMComplexBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GCMComplexBanner(Context context) {
        this(context, null, 0);
    }
}
