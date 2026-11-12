package com.huawei.health.marketing.views;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qrs;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes29.dex */
public class HealthFloatingShapedBox extends HealthFloatBar {
    private static final int l = R.dimen.health_common_56dp;
    private final Pair<Integer, Integer> k;
    private e m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private LinearLayout t;

    static class e extends BaseHandler<HealthFloatingShapedBox> {
        e(HealthFloatingShapedBox healthFloatingShapedBox) {
            super(healthFloatingShapedBox);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HealthFloatingShapedBox healthFloatingShapedBox, Message message) {
            LogUtil.d("HealthFloatingShapedBox", "ShapeBoxHandler receive msg = ", Integer.valueOf(message.what));
            if (message.what != 1) {
                return;
            }
            healthFloatingShapedBox.f();
        }
    }

    public HealthFloatingShapedBox(Context context) {
        this(context, R.layout.bottom_shaped_floating_box);
    }

    public HealthFloatingShapedBox(Context context, int i) {
        super(context, i);
        this.k = BaseActivity.getSafeRegionWidth();
    }

    @Override // com.huawei.health.marketing.views.HealthFloatBar
    protected void a() {
        if (this.g == null) {
            this.g = (ImageView) findViewById(R.id.marketing_bar_image_shaped);
            this.h = (ImageView) findViewById(R.id.marketing_bar_image_shaped_wide);
            this.g.setOnClickListener(this);
            this.h.setOnClickListener(this);
            this.d = (ImageView) findViewById(R.id.marketing_close_icon);
            this.f8340c = (HealthButton) findViewById(R.id.marketing_float_bar_button);
            this.f8340c.setOnClickListener(this);
            this.j = (HealthTextView) findViewById(R.id.marketing_float_bar_text);
            this.j.setVisibility(8);
            this.f8340c.setVisibility(8);
            this.t = (LinearLayout) findViewById(R.id.shape_endtime_layout);
            b();
            this.m = new e(this);
        }
        if (this.f8339b == null) {
            return;
        }
        i();
        if (qrs.af(this.f8338a)) {
            setIconImage(this.h, this.f8339b.getTahitiPicture());
            this.h.setVisibility(0);
            this.g.setVisibility(8);
        } else {
            setIconImage(this.g, this.f8339b.getPicture());
            this.h.setVisibility(8);
            this.g.setVisibility(0);
        }
    }

    @Override // com.huawei.health.marketing.views.HealthFloatBar
    protected void e(boolean z) {
        if (!z) {
            LogUtil.j("HealthFloatingShapedBox", "float image not loaded");
            this.t.setVisibility(8);
            this.f8340c.setVisibility(8);
            this.m.removeMessages(1);
            return;
        }
        this.d.setVisibility(0);
        if (this.f8339b == null) {
            LogUtil.j("HealthFloatingShapedBox", "mMemberPromotionTemplate is empty");
            return;
        }
        if ("buttonName".equals(this.f8339b.getDisplayControls())) {
            this.f8340c.setVisibility(0);
            this.f8340c.setText(this.f8339b.getButtonName());
            this.t.setVisibility(8);
        } else if ("countdown".equals(this.f8339b.getDisplayControls())) {
            this.t.setVisibility(0);
            this.f8340c.setVisibility(8);
            e();
        } else {
            this.t.setVisibility(8);
            this.f8340c.setVisibility(8);
        }
    }

    @Override // com.huawei.health.marketing.views.HealthFloatBar
    protected FrameLayout.LayoutParams getParams() {
        return (FrameLayout.LayoutParams) getLayoutParams();
    }

    private void i() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById(R.id.shape_floating_box_layout).getLayoutParams();
        int dimensionPixelSize = this.f8338a.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        layoutParams.setMarginStart(((Integer) this.k.first).intValue() + dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize + ((Integer) this.k.second).intValue());
        layoutParams.bottomMargin = this.f8338a.getResources().getDimensionPixelSize(l);
    }

    private void e() {
        LogUtil.a("HealthFloatingShapedBox", "initCountDownLayout DeadlineTime is ", Long.valueOf(this.f8339b.getDeadlineTime()));
        if (this.f8339b.getDeadlineTime() <= 0) {
            this.t.setVisibility(8);
            return;
        }
        if (this.o == null) {
            this.o = (HealthTextView) findViewById(R.id.shape_endtime_first_num);
            this.n = (HealthTextView) findViewById(R.id.shape_endtime_first);
            this.s = (HealthTextView) findViewById(R.id.shape_endtime_second_num);
            this.r = (HealthTextView) findViewById(R.id.shape_endtime_second);
            this.q = (HealthTextView) findViewById(R.id.shape_endtime_third_num);
            this.p = (HealthTextView) findViewById(R.id.shape_endtime_third);
        }
        if (this.m.hasMessages(1)) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.n == null) {
            LogUtil.j("HealthFloatingShapedBox", "updateTimer mShapeEndTimeFirst is not init, return");
            return;
        }
        long deadlineTime = this.f8339b.getDeadlineTime() - System.currentTimeMillis();
        int[] iArrB = b(deadlineTime);
        LogUtil.d("HealthFloatingShapedBox", "initCountDownLayout leftTime= ", Integer.valueOf(iArrB[0]), Integer.valueOf(iArrB[1]), Integer.valueOf(iArrB[2]), Integer.valueOf(iArrB[3]));
        if (deadlineTime < 86400000) {
            this.o.setText(e(iArrB[1]));
            this.s.setText(e(iArrB[2]));
            this.q.setText(e(iArrB[3]));
            this.n.setText(this.f8338a.getResources().getQuantityString(R.plurals.IDS_countdown_hour, iArrB[1]));
            this.r.setText(this.f8338a.getResources().getQuantityString(R.plurals.IDS_countdown_minute, iArrB[2]));
            this.p.setText(this.f8338a.getResources().getQuantityString(R.plurals.IDS_countdown_sec, iArrB[3]));
            if (deadlineTime >= 1000) {
                this.m.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            return;
        }
        this.o.setText(e(iArrB[0]));
        this.s.setText(e(iArrB[1]));
        this.q.setText(e(iArrB[2]));
        this.n.setText(this.f8338a.getResources().getQuantityString(R.plurals.IDS_countdown_day, iArrB[0]));
        this.r.setText(this.f8338a.getResources().getQuantityString(R.plurals.IDS_countdown_hour, iArrB[1]));
        this.p.setText(this.f8338a.getResources().getQuantityString(R.plurals.IDS_countdown_minute, iArrB[2]));
        this.m.sendEmptyMessageDelayed(1, 60000L);
    }

    private int[] b(long j) {
        int[] iArr = new int[4];
        if (j <= 1000) {
            return iArr;
        }
        int i = (int) (j / 86400000);
        long j2 = j - (((long) i) * 86400000);
        int i2 = (int) (j2 / 3600000);
        long j3 = j2 - (((long) i2) * 3600000);
        int i3 = (int) (j3 / 60000);
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = (int) ((j3 - (((long) i3) * 60000)) / 1000);
        return iArr;
    }

    private String e(int i) {
        String strE = UnitUtil.e(i, 1, 0);
        String strE2 = UnitUtil.e(0.0d, 1, 0);
        if (String.valueOf(i).length() != 1) {
            return strE;
        }
        return strE2 + strE;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        LogUtil.a("HealthFloatingShapedBox", "onWindowVisibilityChanged ");
        if (this.e) {
            a(i);
        }
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        LogUtil.a("HealthFloatingShapedBox", "onDetachedFromWindow ");
        this.m.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    @Override // com.huawei.health.marketing.views.HealthFloatBar
    protected void a(int i) {
        super.a(i);
        e eVar = this.m;
        if (eVar == null) {
            LogUtil.j("HealthFloatingShapedBox", "onPageVisibilityChange mHandler is null");
            return;
        }
        if (i == 0) {
            if (!eVar.hasMessages(1)) {
                this.m.sendEmptyMessage(1);
            }
        } else {
            eVar.removeMessages(1);
        }
        LogUtil.a("HealthFloatingShapedBox", "onPageVisibilityChange visibility = ", Integer.valueOf(i));
    }
}
