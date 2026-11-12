package com.huawei.pluginachievement.ui.listview;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import com.huawei.ui.commonui.listview.StatusBarListenListView;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveReboundListView extends StatusBarListenListView implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f22249c;
    private boolean d;
    private boolean e;
    private float f;
    private int g;
    private int h;
    private Handler i;
    private int j;
    private int k;
    private boolean m;
    private int o;

    public AchieveReboundListView(Context context) {
        super(context);
        this.m = true;
        this.f22247a = true;
        this.i = new Handler();
        c();
    }

    public AchieveReboundListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
        this.f22247a = true;
        this.i = new Handler();
        c();
    }

    public AchieveReboundListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = true;
        this.f22247a = true;
        this.i = new Handler();
        c();
    }

    public void setTopNotChange() {
        this.m = false;
    }

    private void c() {
        this.g = getPaddingLeft();
        this.o = getPaddingRight();
        this.k = getPaddingTop();
        this.h = getPaddingBottom();
        setOnScrollListener(this);
        setOverScrollMode(2);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22249c = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.i.removeCallbacksAndMessages(null);
                float y = motionEvent.getY();
                this.f = y;
                int i = (int) ((y - this.f22249c) / 2.5f);
                boolean z = i > 0;
                this.d = z;
                if (z) {
                    if (this.m && this.f22248b && this.j != 2) {
                        setPadding(this.g, i + this.k, this.o, this.h);
                        setSelection(0);
                    }
                } else if (this.f22247a && this.e && this.j != 2) {
                    setPadding(this.g, this.k, this.o, -(i - this.h));
                    setSelection(getCount() - 1);
                }
            }
        } else if (this.d) {
            b();
        } else {
            e();
        }
        return super.onTouchEvent(motionEvent);
    }

    private void b() {
        if (this.m) {
            final int paddingTop = getPaddingTop();
            int i = 0;
            while (paddingTop > this.k) {
                paddingTop -= 20;
                i += 10;
                this.i.postDelayed(new Runnable() { // from class: com.huawei.pluginachievement.ui.listview.AchieveReboundListView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (paddingTop < AchieveReboundListView.this.k) {
                            AchieveReboundListView achieveReboundListView = AchieveReboundListView.this;
                            achieveReboundListView.setPadding(achieveReboundListView.g, AchieveReboundListView.this.k, AchieveReboundListView.this.o, AchieveReboundListView.this.h);
                        } else {
                            AchieveReboundListView achieveReboundListView2 = AchieveReboundListView.this;
                            achieveReboundListView2.setPadding(achieveReboundListView2.g, paddingTop, AchieveReboundListView.this.o, AchieveReboundListView.this.h);
                        }
                    }
                }, i);
            }
        }
    }

    private void e() {
        if (this.f22247a) {
            final int paddingBottom = getPaddingBottom();
            int i = 0;
            while (paddingBottom > this.h) {
                paddingBottom -= 20;
                i += 10;
                this.i.postDelayed(new Runnable() { // from class: com.huawei.pluginachievement.ui.listview.AchieveReboundListView.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (paddingBottom < AchieveReboundListView.this.h) {
                            AchieveReboundListView achieveReboundListView = AchieveReboundListView.this;
                            achieveReboundListView.setPadding(achieveReboundListView.g, AchieveReboundListView.this.k, AchieveReboundListView.this.o, AchieveReboundListView.this.h);
                        } else {
                            AchieveReboundListView achieveReboundListView2 = AchieveReboundListView.this;
                            achieveReboundListView2.setPadding(achieveReboundListView2.g, AchieveReboundListView.this.k, AchieveReboundListView.this.o, paddingBottom);
                        }
                    }
                }, i);
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f22248b = i == 0;
        this.e = i + i2 == i3;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.j = i;
    }
}
