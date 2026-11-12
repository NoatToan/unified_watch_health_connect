package com.zhouyou.recyclerview.refresh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.zhouyou.recyclerview.progressindicator.AVLoadingIndicatorView;
import com.zhouyou.recyclerviewsdk.R;
import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
public class ArrowRefreshHeader extends LinearLayout implements IRefreshHeader {
    private static final int i = 180;
    private LinearLayout a;
    private ImageView b;
    private SimpleViewSwitcher c;
    private TextView d;
    private int e;
    private TextView f;
    private Animation g;
    private Animation h;
    public int mMeasuredHeight;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrowRefreshHeader.this.reset();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrowRefreshHeader.this.setState(0);
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ArrowRefreshHeader.this.setVisibleHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public ArrowRefreshHeader(Context context) {
        super(context);
        this.e = 0;
        a();
    }

    private void a() {
        this.a = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.listview_header, (ViewGroup) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setPadding(0, 0, 0, 0);
        addView(this.a, new LinearLayout.LayoutParams(-1, 0));
        setGravity(80);
        this.b = (ImageView) findViewById(R.id.listview_header_arrow);
        this.d = (TextView) findViewById(R.id.refresh_status_textview);
        SimpleViewSwitcher simpleViewSwitcher = (SimpleViewSwitcher) findViewById(R.id.listview_header_progressbar);
        this.c = simpleViewSwitcher;
        simpleViewSwitcher.setView(new ProgressBar(getContext(), null, android.R.attr.progressBarStyle));
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.g = rotateAnimation;
        rotateAnimation.setDuration(180L);
        this.g.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.h = rotateAnimation2;
        rotateAnimation2.setDuration(180L);
        this.h.setFillAfter(true);
        this.f = (TextView) findViewById(R.id.last_refresh_time);
        measure(-2, -2);
        this.mMeasuredHeight = getMeasuredHeight();
    }

    private void b(int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getVisibleHeight(), i2);
        valueAnimatorOfInt.setDuration(300L).start();
        valueAnimatorOfInt.addUpdateListener(new c());
        valueAnimatorOfInt.start();
    }

    public static String friendlyTime(Date date) {
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - date.getTime()) / 1000);
        if (iCurrentTimeMillis == 0) {
            return "刚刚";
        }
        if (iCurrentTimeMillis > 0 && iCurrentTimeMillis < 60) {
            return iCurrentTimeMillis + "秒前";
        }
        if (iCurrentTimeMillis >= 60 && iCurrentTimeMillis < 3600) {
            return Math.max(iCurrentTimeMillis / 60, 1) + "分钟前";
        }
        if (iCurrentTimeMillis >= 3600 && iCurrentTimeMillis < 86400) {
            return (iCurrentTimeMillis / 3600) + "小时前";
        }
        if (iCurrentTimeMillis >= 86400 && iCurrentTimeMillis < 2592000) {
            return (iCurrentTimeMillis / 86400) + "天前";
        }
        if (iCurrentTimeMillis < 2592000 || iCurrentTimeMillis >= 31104000) {
            return (iCurrentTimeMillis / 31104000) + "年前";
        }
        return (iCurrentTimeMillis / 2592000) + "月前";
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public View getHeaderView() {
        return this;
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public int getState() {
        return this.e;
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public int getVisibleHeight() {
        return ((LinearLayout.LayoutParams) this.a.getLayoutParams()).height;
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public boolean isRefreshHreader() {
        return this.e != 0;
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void onMove(float f) {
        if (getVisibleHeight() > 0 || f > 0.0f) {
            setVisibleHeight(((int) f) + getVisibleHeight());
            if (this.e <= 1) {
                if (getVisibleHeight() > this.mMeasuredHeight) {
                    setState(1);
                } else {
                    setState(0);
                }
            }
        }
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void refreshComplete() {
        this.f.setText(friendlyTime(new Date()));
        setState(3);
        new Handler().postDelayed(new a(), 200L);
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public boolean releaseAction() {
        boolean z;
        getVisibleHeight();
        if (getVisibleHeight() <= this.mMeasuredHeight || this.e >= 2) {
            z = false;
        } else {
            setState(2);
            z = true;
        }
        if (this.e != 2) {
            b(0);
        }
        if (this.e == 2) {
            b(this.mMeasuredHeight);
        }
        return z;
    }

    public void reset() {
        b(0);
        new Handler().postDelayed(new b(), 500L);
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void setArrowImageView(int i2) {
        this.b.setImageResource(i2);
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void setProgressStyle(int i2) {
        if (i2 == -1) {
            this.c.setView(new ProgressBar(getContext(), null, android.R.attr.progressBarStyle));
            return;
        }
        AVLoadingIndicatorView aVLoadingIndicatorView = new AVLoadingIndicatorView(getContext());
        aVLoadingIndicatorView.setIndicatorColor(-4868683);
        aVLoadingIndicatorView.setIndicatorId(i2);
        this.c.setView(aVLoadingIndicatorView);
    }

    @Override // com.zhouyou.recyclerview.refresh.IRefreshHeader
    public void setState(int i2) {
        if (i2 == this.e) {
            return;
        }
        if (i2 == 2) {
            this.b.clearAnimation();
            this.b.setVisibility(4);
            this.c.setVisibility(0);
            b(this.mMeasuredHeight);
        } else if (i2 == 3) {
            this.b.setVisibility(4);
            this.c.setVisibility(4);
        } else {
            this.b.setVisibility(0);
            this.c.setVisibility(4);
        }
        if (i2 == 0) {
            if (this.e == 1) {
                this.b.startAnimation(this.h);
            }
            if (this.e == 2) {
                this.b.clearAnimation();
            }
            this.d.setText(R.string.listview_header_hint_normal);
        } else if (i2 != 1) {
            if (i2 == 2) {
                this.d.setText(R.string.refreshing);
            } else if (i2 == 3) {
                this.d.setText(R.string.refresh_done);
            }
        } else if (this.e != 1) {
            this.b.clearAnimation();
            this.b.startAnimation(this.g);
            this.d.setText(R.string.listview_header_hint_release);
        }
        this.e = i2;
    }

    public void setStatusTextViewColor(@ColorInt int i2) {
        this.d.setTextColor(i2);
    }

    public void setVisibleHeight(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.height = i2;
        this.a.setLayoutParams(layoutParams);
    }

    public ArrowRefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        a();
    }
}
