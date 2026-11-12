package com.huami.watch.companion.ecg.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.view.EcgPtrHeaderView;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class EcgPtrHeaderView extends LinearLayout implements RefreshHeader {
    private static final int g = 90;
    private static final int h = 3;
    private static final String i = "EcgPtrHeaderView";
    private ImageView a;
    private TextView b;
    private TextView c;
    private Animation d;
    private Animation e;
    private Disposable f;

    public static /* synthetic */ class a {
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

    public EcgPtrHeaderView(Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_ecg_ptr_header, this);
        this.a = (ImageView) findViewById(R.id.header_arrow);
        this.b = (TextView) findViewById(R.id.header_text);
        this.c = (TextView) findViewById(R.id.header_dot);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        this.d = rotateAnimation;
        rotateAnimation.setDuration(90L);
        this.d.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        this.e = rotateAnimation2;
        rotateAnimation2.setDuration(90L);
        this.e.setFillAfter(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Long l) throws Exception {
        int iIntValue = (l.intValue() + 1) % 4;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            if (i2 < iIntValue) {
                sb.append(".");
            } else {
                sb.append(" ");
            }
        }
        this.c.setText(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Throwable th) throws Exception {
        Log.e(i, th.getMessage(), th);
    }

    private void f() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 3; i2++) {
            sb.append(" ");
        }
        this.c.setText(sb.toString());
    }

    private void g() {
        this.f = Observable.interval(300L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: hh1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.d((Long) obj);
            }
        }, new Consumer() { // from class: ih1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                EcgPtrHeaderView.e((Throwable) obj);
            }
        });
    }

    private void h() {
        Disposable disposable = this.f;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.f.dispose();
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
        h();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(RefreshLayout refreshLayout, boolean z) {
        this.a.setVisibility(4);
        f();
        h();
        return 50;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float f, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(RefreshKernel refreshKernel, int i2, int i3) {
        this.a.setVisibility(0);
        this.a.startAnimation(this.e);
        this.b.setText(R.string.pull_label_sync_data);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onPullingDown(float f, int i2, int i3, int i4) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshHeader
    public void onReleasing(float f, int i2, int i3, int i4) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(RefreshLayout refreshLayout, int i2, int i3) {
        this.a.clearAnimation();
        this.a.setVisibility(4);
        this.b.setText(R.string.pull_to_refresh_refreshing_label);
        f();
        g();
    }

    @Override // com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
        int i2 = a.a[refreshState2.ordinal()];
        if (i2 == 1) {
            this.a.setVisibility(0);
            this.a.clearAnimation();
            this.a.startAnimation(this.d);
            this.b.setText(R.string.release_to_sync);
            return;
        }
        if (i2 != 2) {
            return;
        }
        this.a.setVisibility(0);
        this.a.startAnimation(this.e);
        this.b.setText(R.string.pull_label_sync_data);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void setPrimaryColors(@ColorInt int... iArr) {
    }

    public EcgPtrHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }
}
