package com.xiaomi.hm.health.ui.sportfitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.huami.watch.hmwatchmanager.R;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/* JADX INFO: loaded from: classes22.dex */
public class ExercisePtrHeaderView extends LinearLayout implements RefreshHeader {
    private static final int g = 90;
    private static final int h = 3;
    private ImageView a;
    private TextView b;
    private TextView c;
    private Animation d;
    private Animation e;
    private Subscription f;

    public class a extends Subscriber<Long> {
        public a() {
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Long time) {
            int iIntValue = (time.intValue() + 1) % 4;
            String str = "";
            for (int i = 0; i < 3; i++) {
                str = i < iIntValue ? str + "." : str + " ";
            }
            ExercisePtrHeaderView.this.c.setText(str);
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            a = iArr;
            try {
                iArr[RefreshState.ReleaseToRefresh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ExercisePtrHeaderView(Context context) {
        super(context);
        b(context);
    }

    private void b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.xrefreshview_white_header, this);
        this.a = (ImageView) findViewById(R.id.xrefreshview_header_arrow);
        this.b = (TextView) findViewById(R.id.xrefreshview_header_hint_textview);
        this.c = (TextView) findViewById(R.id.xrefreshview_header_hint_dot);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.d = rotateAnimation;
        rotateAnimation.setDuration(90L);
        this.d.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.e = rotateAnimation2;
        rotateAnimation2.setDuration(90L);
        this.e.setFillAfter(true);
    }

    private void c() {
        String str = "";
        for (int i = 0; i < 3; i++) {
            str = str + " ";
        }
        this.c.setText(str);
    }

    private void d() {
        this.f = Observable.interval(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe((Subscriber<? super Long>) new a());
    }

    private void e() {
        Subscription subscription = this.f;
        if (subscription == null || subscription.isUnsubscribed()) {
            return;
        }
        this.f.unsubscribe();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Translate;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(RefreshLayout layout, boolean success) {
        this.a.setVisibility(4);
        c();
        e();
        return 50;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(RefreshKernel kernel, int height, int extendHeight) {
        this.a.setVisibility(0);
        this.a.startAnimation(this.e);
        this.b.setText(R.string.pull_label_sync_data);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onPullingDown(float percent, int offset, int headerHeight, int extendHeight) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onReleasing(float percent, int offset, int headerHeight, int extendHeight) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(RefreshLayout layout, int height, int extendHeight) {
        this.a.clearAnimation();
        this.a.setVisibility(4);
        this.b.setText(R.string.pull_to_refresh_refreshing_label);
        c();
        d();
    }

    @Override // com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState oldState, RefreshState newState) {
        int i = b.a[newState.ordinal()];
        if (i == 1) {
            this.a.setVisibility(0);
            this.a.clearAnimation();
            this.a.startAnimation(this.d);
            this.b.setText(R.string.release_to_sync);
            return;
        }
        if (i != 2) {
            return;
        }
        this.a.setVisibility(0);
        this.a.startAnimation(this.e);
        this.b.setText(R.string.pull_label_sync_data);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void setPrimaryColors(@ColorInt int... colors) {
    }

    public ExercisePtrHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        b(context);
    }
}
