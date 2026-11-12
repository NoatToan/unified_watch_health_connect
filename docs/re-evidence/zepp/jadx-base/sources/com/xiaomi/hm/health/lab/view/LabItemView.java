package com.xiaomi.hm.health.lab.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import com.huami.bodymeasurements.common.chart.ChartConstantsKt;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.utils.LabTools;

/* JADX INFO: loaded from: classes21.dex */
public class LabItemView extends FrameLayout {
    public static final int DIVIDER_GONE = 0;
    public static final int DIVIDER_NORMAL = 1;
    public static final int DIVIDER_START_SHORT = 2;
    private Context a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private int f;
    private TextView g;
    private TextView h;
    private TextView i;
    private SwitchCompat j;
    private View k;
    private View l;
    private View m;
    private OnCheckedChangeListener n;
    private boolean o;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(LabItemView labItemView, boolean z, boolean z2);
    }

    public LabItemView(Context context) {
        this(context, null);
    }

    private void d() {
        setBackgroundResource(R.drawable.bg_item);
        this.l = FrameLayout.inflate(this.a, R.layout.lab_view_item, this);
        this.g = (TextView) findViewById(R.id.title);
        this.h = (TextView) findViewById(R.id.summary);
        this.i = (TextView) findViewById(R.id.right_value);
        this.j = (SwitchCompat) findViewById(R.id.item_switch);
        this.g.setText(this.b);
        setSummary(this.c);
        setValue(this.d);
        if (this.e) {
            this.j.setVisibility(0);
            this.j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ml4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.e(compoundButton, z);
                }
            });
            this.i.setVisibility(8);
            setOnClickListener(new View.OnClickListener() { // from class: ll4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.f(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(CompoundButton compoundButton, boolean z) {
        OnCheckedChangeListener onCheckedChangeListener = this.n;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z, this.o || this.j.isPressed());
        }
        this.o = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        this.o = true;
        this.j.toggle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(boolean z) {
        if (this.k == null) {
            this.k = getMaskView();
        }
        if (!((Boolean) this.k.getTag()).booleanValue()) {
            this.k.setLayoutParams(new FrameLayout.LayoutParams(this.l.getMeasuredWidth(), this.l.getMeasuredHeight()));
            addView(this.k, getChildCount());
            this.k.setTag(Boolean.TRUE);
        }
        this.k.setVisibility(z ? 8 : 0);
    }

    private View getMaskView() {
        View view = new View(this.a);
        view.setBackgroundColor(ContextCompat.getColor(this.a, R.color.mask_view));
        view.setClickable(true);
        view.setVisibility(8);
        view.setTag(Boolean.FALSE);
        return view;
    }

    private void setupDividerView(int i) {
        View view = this.m;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMarginStart(i);
            return;
        }
        View view2 = new View(this.a);
        this.m = view2;
        int color = this.f;
        if (color == -1) {
            color = Color.parseColor(ChartConstantsKt.INTERACTIVE_LINE_COLOR);
        }
        view2.setBackgroundColor(color);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.a.getResources().getDimensionPixelSize(R.dimen.divider));
        layoutParams.gravity = 80;
        layoutParams.setMarginEnd(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
        layoutParams.setMarginStart(i);
        this.m.setLayoutParams(layoutParams);
        addView(this.m);
    }

    public TextView getSummaryTv() {
        return this.h;
    }

    public TextView getmValueTv() {
        return this.i;
    }

    public boolean isChecked() {
        return this.e && this.j.isChecked();
    }

    @Deprecated
    public boolean isPressedSwitch() {
        return this.j.isPressed();
    }

    public void setChecked(boolean z) {
        if (this.e) {
            this.j.setChecked(z);
        }
    }

    @Override // android.view.View
    public void setEnabled(final boolean z) {
        super.setEnabled(z);
        post(new Runnable() { // from class: nl4
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(z);
            }
        });
    }

    public void setEnabledWithoutGrayBack(boolean z) {
        super.setEnabled(z);
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.n = onCheckedChangeListener;
    }

    public void setSummary(@StringRes int i) {
        setSummary(getResources().getString(i));
    }

    public void setSwitchThumbTint(int i, int i2) {
        if (this.e) {
            this.j.setThumbTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{i, i2}));
        }
    }

    public void setSwitchVisible(boolean z) {
        this.j.setVisibility(z ? 0 : 8);
        this.e = z;
    }

    public void setTitle(@StringRes int i) {
        this.g.setText(i);
    }

    public void setTitleColor(@ColorInt int i) {
        this.g.setTextColor(i);
    }

    public void setValue(@StringRes int i) {
        setValue(getContext().getString(i));
    }

    public void setValueVisible(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    public void setupDivider(int i) {
        if (i == 0) {
            View view = this.m;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 1) {
            setupDividerView(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
            this.m.setVisibility(0);
        } else if (i == 2) {
            setupDividerView(this.a.getResources().getDimensionPixelSize(R.dimen.item_short_start_margin));
            this.m.setVisibility(0);
        }
    }

    public void setupDividerColor(@ColorRes int i) {
        View view = this.m;
        if (view != null) {
            view.setBackgroundColor(ContextCompat.getColor(this.a, i));
        }
    }

    public void toggle() {
        if (this.e) {
            this.j.toggle();
        }
    }

    public LabItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setSummary(String str) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((RelativeLayout) findViewById(R.id.content_layout)).getLayoutParams();
        if (TextUtils.isEmpty(str)) {
            this.h.setVisibility(8);
            layoutParams.setMargins(0, (int) LabTools.dp2px(this.a, 5.5f), 0, (int) LabTools.dp2px(this.a, 5.5f));
        } else {
            this.h.setVisibility(0);
            this.h.setText(str);
            layoutParams.setMargins(0, 0, 0, 0);
        }
    }

    public void setTitle(String str) {
        this.g.setText(str);
    }

    public void setValue(String str) {
        this.i.setText(str);
        if (TextUtils.isEmpty(str)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
        }
    }

    public LabItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = false;
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LabItemView, 0, i);
        this.b = typedArrayObtainStyledAttributes.getString(R.styleable.LabItemView_labItemTitle);
        this.c = typedArrayObtainStyledAttributes.getString(R.styleable.LabItemView_labItemSummary);
        this.d = typedArrayObtainStyledAttributes.getString(R.styleable.LabItemView_labItemValue);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LabItemView_labItemSwitch, false);
        this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.LabItemView_labDividerColor, -1);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.LabItemView_labItemDivider, 1);
        typedArrayObtainStyledAttributes.recycle();
        d();
        setupDivider(i2);
    }
}
