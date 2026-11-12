package com.huawei.ui.commonui.linechart.view.timeperiod;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qnf;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes16.dex */
public class BloodSugarTimePeriodView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f23760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f23761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<BloodSugarTimePeriod> f23762c;
    private Context d;
    private OnTimePeriodItemChangedListener e;

    public interface OnTimePeriodItemChangedListener {
        void onTimePeriodItemChanged(int i, BloodSugarTimePeriod bloodSugarTimePeriod);
    }

    public BloodSugarTimePeriodView(Context context) {
        this(context, null);
    }

    public BloodSugarTimePeriodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BloodSugarTimePeriodView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23762c = new ArrayList<>(4);
        this.d = context;
        LogUtil.d("BloodSugarTimePeriodView", "BloodSugarTimePeriodView ", context);
        a(context);
    }

    public void c(long j) {
        b(j, 0);
    }

    public void b(final long j, final int i) {
        post(new Runnable() { // from class: qok
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(j, i);
            }
        });
    }

    public /* synthetic */ void c(long j, int i) {
        if (this.d == null) {
            LogUtil.j("BloodSugarTimePeriodView", "notify, the context is invalid");
        } else {
            d(j, i);
        }
    }

    public void setOnTimePeriodItemChangedListener(OnTimePeriodItemChangedListener onTimePeriodItemChangedListener) {
        this.e = onTimePeriodItemChangedListener;
    }

    private void a(Context context) {
        setOrientation(1);
        setMinimumHeight(context.getResources().getDimensionPixelSize(R.dimen.health_common_160dp));
        inflate(context, R.layout.layout_blood_sugar_time_period_view, this);
        this.f23761b = (LinearLayout) findViewById(R.id.layout_time_period_items);
        this.f23760a = (HealthTextView) findViewById(R.id.text_view_time_period_description);
        d(System.currentTimeMillis(), 0);
    }

    private void d(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = calendar.get(11);
        this.f23762c.clear();
        this.f23762c.addAll(BloodSugarTimePeriod.getTimePeriodsByHours(i2));
        LinearLayout linearLayout = this.f23761b;
        if (linearLayout == null) {
            LogUtil.j("BloodSugarTimePeriodView", "notifyImmediately: the mItemsLayout is null, return");
            return;
        }
        linearLayout.removeAllViews();
        HealthTextView healthTextView = this.f23760a;
        if (healthTextView != null) {
            healthTextView.setText((CharSequence) null);
        }
        int size = this.f23762c.size();
        for (int i3 = 0; i3 < size; i3++) {
            BloodSugarTimePeriod bloodSugarTimePeriod = this.f23762c.get(i3);
            BloodSugarTimePeriodItemView bloodSugarTimePeriodItemViewB = b(i3, bloodSugarTimePeriod);
            if (bloodSugarTimePeriodItemViewB != null) {
                b(bloodSugarTimePeriodItemViewB);
                if (i != 0 && bloodSugarTimePeriod.getCode() == i) {
                    bloodSugarTimePeriodItemViewB.setChecked(true);
                    setDescriptionText(bloodSugarTimePeriod.getTimePeriodDescriptionRes());
                }
            }
        }
    }

    private BloodSugarTimePeriodItemView b(final int i, final BloodSugarTimePeriod bloodSugarTimePeriod) {
        if (bloodSugarTimePeriod == null) {
            LogUtil.j("BloodSugarTimePeriodView", "createTimePeriodItemView, the timePeriod is null");
            return null;
        }
        BloodSugarTimePeriodItemView bloodSugarTimePeriodItemView = new BloodSugarTimePeriodItemView(getContext());
        bloodSugarTimePeriodItemView.setIconDrawable(bloodSugarTimePeriod.getIconResId());
        bloodSugarTimePeriodItemView.setTimePeriodText(getResources().getString(bloodSugarTimePeriod.getTimePeriodNameRes()));
        bloodSugarTimePeriodItemView.setChecked(false);
        bloodSugarTimePeriodItemView.setOnClickListener(new View.OnClickListener() { // from class: qoi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(i, bloodSugarTimePeriod, view);
            }
        });
        return bloodSugarTimePeriodItemView;
    }

    public /* synthetic */ void b(int i, BloodSugarTimePeriod bloodSugarTimePeriod, View view) {
        e(i, bloodSugarTimePeriod);
    }

    private void e(int i, BloodSugarTimePeriod bloodSugarTimePeriod) {
        if (this.f23760a == null || this.f23761b == null) {
            LogUtil.j("BloodSugarTimePeriodView", "select: the mDescriptionTextView or mItemsLayout is null, return");
            return;
        }
        setDescriptionText(bloodSugarTimePeriod.getTimePeriodDescriptionRes());
        int childCount = this.f23761b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f23761b.getChildAt(i2);
            if (childAt instanceof BloodSugarTimePeriodItemView) {
                BloodSugarTimePeriodItemView bloodSugarTimePeriodItemView = (BloodSugarTimePeriodItemView) childAt;
                if (i2 == i) {
                    bloodSugarTimePeriodItemView.setChecked(true);
                    d(i, bloodSugarTimePeriod);
                } else {
                    bloodSugarTimePeriodItemView.setChecked(false);
                }
            }
        }
    }

    private void d(int i, BloodSugarTimePeriod bloodSugarTimePeriod) {
        OnTimePeriodItemChangedListener onTimePeriodItemChangedListener = this.e;
        if (onTimePeriodItemChangedListener != null) {
            onTimePeriodItemChangedListener.onTimePeriodItemChanged(i, bloodSugarTimePeriod);
        }
    }

    private void setDescriptionText(int i) {
        HealthTextView healthTextView = this.f23760a;
        if (healthTextView != null) {
            healthTextView.setText(qnf.d(getContext(), i));
        }
    }

    private void b(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        this.f23761b.addView(view);
    }

    public void b() {
        setMinimumHeight(0);
        findViewById(R.id.title).setVisibility(8);
        findViewById(R.id.text_view_time_period_description).setVisibility(8);
    }
}
