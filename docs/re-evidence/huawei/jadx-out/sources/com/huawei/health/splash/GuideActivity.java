package com.huawei.health.splash;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.dco;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class GuideActivity extends BaseActivity implements HealthViewPager.OnPageChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f8787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GuidePointView f8788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GestureDetector f8789c;
    private int d;
    private int e;
    private List<View> f;
    private HealthButton i;

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        getWindow().addFlags(134217728);
        this.f8789c = new GestureDetector(new a());
        this.d = qrs.d((Context) this, 20.0f);
        setContentView(R.layout.hw_health_guide_layout);
        d();
        a();
    }

    private void d() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.hw_health_guide_third_layout, (ViewGroup) null);
        this.f8787a = (LinearLayout) findViewById(R.id.hw_health_guide_dot_layout);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.hw_health_guide_done_button);
        this.i = healthButton;
        healthButton.setOnClickListener(this);
        this.f = new ArrayList();
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.hw_health_guide_first_layout, (ViewGroup) null);
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.hw_health_guide_second_layout, (ViewGroup) null);
        this.f.add(viewInflate2);
        this.f.add(viewInflate3);
        this.f.add(viewInflate);
        dco dcoVar = new dco(this.f);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.hw_health_guide_viewpager);
        healthViewPager.setAdapter(dcoVar);
        healthViewPager.setOnPageChangeListener(this);
    }

    private void a() {
        this.e = 0;
        GuidePointView guidePointView = new GuidePointView(this, this.f.size(), this.e);
        this.f8788b = guidePointView;
        this.f8787a.addView(guidePointView);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (i < 0 || i > this.f.size() - 1 || this.e == i) {
            return;
        }
        this.e = i;
        this.f8788b.setSelected(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.i) {
            setResult(103);
            finish();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            setResult(102);
            finish();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f8789c.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    class a extends GestureDetector.SimpleOnGestureListener {
        private a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (GuideActivity.this.e != 2 || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            if ((motionEvent.getX() - motionEvent2.getX() > (-GuideActivity.this.d) && motionEvent.getX() - motionEvent2.getX() < GuideActivity.this.d) || motionEvent.getX() - motionEvent2.getX() < GuideActivity.this.d) {
                return false;
            }
            GuideActivity.this.setResult(103);
            GuideActivity.this.finish();
            return true;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
