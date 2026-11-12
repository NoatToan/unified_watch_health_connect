package com.huami.account.ui.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.account.ui.R;
import com.huami.widget.toast.CustomToast;

/* JADX INFO: loaded from: classes4.dex */
public class ItemView extends FrameLayout {
    private static final String C = "ItemView";
    private static final boolean D = true;
    public static final int DIVIDER_GONE = 0;
    public static final int DIVIDER_NORMAL = 1;
    public static final int DIVIDER_START_SHORT = 2;
    private static final int E = 0;
    private static final int F = 1;
    private boolean A;
    private boolean B;
    private Context a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private TextView n;
    private TextView o;
    private TextView p;
    private ImageView q;
    private SwitchCompat r;
    private View s;
    private View t;
    private View u;
    private View v;
    private View w;
    private ImageView x;
    private ImageView y;
    private OnCheckedChangeListener z;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(ItemView itemView, boolean z, boolean z2);
    }

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ItemView.this.z != null) {
                OnCheckedChangeListener onCheckedChangeListener = ItemView.this.z;
                ItemView itemView = ItemView.this;
                onCheckedChangeListener.onCheckedChanged(itemView, z, itemView.A || ItemView.this.r.isPressed());
            }
            ItemView.this.A = false;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ItemView.this.A = true;
            ItemView.this.r.toggle();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ItemView.this.s == null) {
                ItemView itemView = ItemView.this;
                itemView.s = itemView.getMaskView();
            }
            if (!((Boolean) ItemView.this.s.getTag()).booleanValue()) {
                ItemView.this.s.setLayoutParams(new FrameLayout.LayoutParams(ItemView.this.u.getMeasuredWidth(), ItemView.this.u.getMeasuredHeight()));
                ItemView itemView2 = ItemView.this;
                itemView2.addView(itemView2.s, ItemView.this.getChildCount());
                ItemView.this.s.setTag(Boolean.TRUE);
            }
            ItemView.this.s.setVisibility(this.a ? 8 : 0);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) ItemView.this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy text", ((TextView) view).getText()));
            CustomToast.makeText(ItemView.this.a, ItemView.this.a.getString(R.string.account_ui_copy_success), 0).show();
        }
    }

    public ItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getMaskView() {
        View view = new View(this.a);
        view.setBackgroundColor(ContextCompat.getColor(this.a, R.color.mask_view));
        view.setClickable(true);
        view.setVisibility(8);
        view.setTag(Boolean.FALSE);
        return view;
    }

    private void j() {
        if (this.B) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.content_layout);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (this.p.getVisibility() == 8 && this.o.getVisibility() == 8) {
                layoutParams.setMargins(0, (int) k(this.a, 5.5f), 0, (int) k(this.a, 5.5f));
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    private float k(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private void l() {
        setBackgroundResource(R.drawable.bg_item);
        this.u = FrameLayout.inflate(this.a, this.B ? R.layout.account_ui_view_item_top_bottom : R.layout.account_ui_view_item, this);
        this.n = (TextView) findViewById(R.id.title);
        this.o = (TextView) findViewById(R.id.summary);
        this.p = (TextView) findViewById(R.id.right_value);
        this.q = (ImageView) findViewById(R.id.right_value_img);
        this.r = (SwitchCompat) findViewById(R.id.item_switch);
        this.t = findViewById(R.id.right_arrow);
        this.n.setText(this.b);
        setSummary(this.c);
        setValue(this.d);
        if (this.e) {
            this.r.setVisibility(0);
            this.r.setOnCheckedChangeListener(new a());
            this.p.setVisibility(8);
            this.t.setVisibility(8);
            setOnClickListener(new b());
        } else if (!this.f) {
            this.t.setVisibility(8);
        }
        if (this.k != -1) {
            m();
        }
        if (this.h != -1) {
            n();
        }
    }

    private void m() {
        int dimensionPixelSize;
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        ImageView imageView = new ImageView(this.a);
        this.x = imageView;
        int i = this.j;
        if (i != -1) {
            if (this.l != -1) {
                Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
                DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, this.l));
                DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
                this.x.setImageDrawable(drawableWrap);
            } else {
                imageView.setBackgroundResource(i);
            }
        }
        int i2 = this.k;
        if (i2 == 0) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.account_ui_item_icon_small);
            dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.account_ui_item_icon_small_margin_top);
            dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(R.dimen.account_ui_item_icon_small_margin_end);
        } else if (i2 == 1) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.account_ui_item_icon_big);
            dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.account_ui_item_icon_big_margin_top);
            dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(R.dimen.account_ui_item_icon_big_margin_end);
        } else {
            dimensionPixelSize = 0;
            dimensionPixelOffset = 0;
            dimensionPixelOffset2 = 0;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(dimensionPixelOffset2);
        layoutParams.topMargin = dimensionPixelOffset;
        layoutParams.bottomMargin = dimensionPixelOffset;
        layoutParams.gravity = 8388627;
        this.x.setLayoutParams(layoutParams);
        ((LinearLayout) findViewById(R.id.content)).addView(this.x, 0);
    }

    private void n() {
        ImageView imageView = new ImageView(getContext());
        int i = this.h;
        if (i != -1) {
            if (this.i != -1) {
                Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
                DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, this.i));
                DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
                imageView.setImageDrawable(drawableWrap);
            } else {
                imageView.setBackgroundResource(i);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.content_layout);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(17, R.id.title);
        int iK = (int) k(getContext(), 2.0f);
        layoutParams.setMargins(0, iK, 0, 0);
        layoutParams.setMarginStart(iK);
        relativeLayout.addView(imageView, layoutParams);
        this.y = imageView;
    }

    private void setupDividerView(int i) {
        View view = this.w;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMarginStart(i);
            return;
        }
        View view2 = new View(this.a);
        this.w = view2;
        int color = this.m;
        if (color == -1) {
            color = ContextCompat.getColor(this.a, R.color.divide);
        }
        view2.setBackgroundColor(color);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.a.getResources().getDimensionPixelSize(R.dimen.divider));
        layoutParams.gravity = 80;
        layoutParams.setMarginEnd(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
        layoutParams.setMarginStart(i);
        this.w.setLayoutParams(layoutParams);
        addView(this.w);
    }

    public TextView getSummaryTv() {
        return this.o;
    }

    public ImageView getmIconImage() {
        return this.x;
    }

    public ImageView getmValueImage() {
        return this.q;
    }

    public TextView getmValueTv() {
        return this.p;
    }

    public boolean isChecked() {
        return this.e && this.r.isChecked();
    }

    @Deprecated
    public boolean isPressedSwitch() {
        return this.r.isPressed();
    }

    public boolean isShowingRedDot() {
        View view = this.v;
        return view != null && view.getVisibility() == 0;
    }

    public void setChecked(boolean z) {
        if (this.e) {
            this.r.setChecked(z);
        }
    }

    public void setEnableCopy(boolean z) {
        TextView textView;
        this.g = z;
        if (!z || (textView = this.p) == null) {
            return;
        }
        textView.setOnClickListener(new d());
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        post(new c(z));
    }

    public void setEnabledWithoutGrayBack(boolean z) {
        super.setEnabled(z);
    }

    public void setEndArrowVisible(boolean z) {
        this.t.setVisibility(z ? 0 : 8);
    }

    public void setIcon(@DrawableRes int i) {
        if (this.x == null) {
            m();
        }
        this.x.setBackgroundResource(i);
    }

    public void setIconWithTint(@DrawableRes int i) {
        if (this.l == -1) {
            this.x.setBackgroundResource(i);
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
        DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, this.l));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        this.x.setImageDrawable(drawableWrap);
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.z = onCheckedChangeListener;
    }

    public void setRedDotVisible(boolean z) {
        if (!z) {
            View view = this.v;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.v;
        if (view2 != null) {
            view2.setVisibility(0);
            return;
        }
        View view3 = new View(this.a);
        this.v = view3;
        view3.setBackground(ContextCompat.getDrawable(this.a, R.drawable.ic_red_circle));
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.account_ui_item_red_dot_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginEnd(this.a.getResources().getDimensionPixelSize(R.dimen.account_ui_item_red_dot_end_margin));
        this.v.setLayoutParams(layoutParams);
        addView(this.v);
    }

    public void setSummary(@StringRes int i) {
        setSummary(getResources().getString(i));
    }

    public void setSwitchThumbTint(int i, int i2) {
        if (this.e) {
            this.r.setThumbTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{i, i2}));
        }
    }

    public void setSwitchVisible(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
        this.e = z;
    }

    public void setTitle(@StringRes int i) {
        this.n.setText(i);
    }

    public void setTitleColor(@ColorInt int i) {
        this.n.setTextColor(i);
    }

    public void setTitleTipIcon(@DrawableRes int i) {
        if (this.y == null) {
            n();
        }
        this.y.setBackgroundResource(i);
    }

    public void setTitleTipIconClickListener(View.OnClickListener onClickListener) {
        if (this.y == null) {
            n();
        }
        this.y.setOnClickListener(onClickListener);
    }

    public void setTitleTipIconVisibility(int i) {
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setValue(@StringRes int i) {
        setValue(getContext().getString(i));
    }

    public void setValueVisible(boolean z) {
        this.p.setVisibility(z ? 0 : 8);
    }

    public void setupDivider(int i) {
        if (i == 0) {
            View view = this.w;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 1) {
            setupDividerView(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
            this.w.setVisibility(0);
        } else if (i == 2) {
            setupDividerView(this.a.getResources().getDimensionPixelSize(R.dimen.account_ui_item_short_start_margin));
            this.w.setVisibility(0);
        }
    }

    public void setupDividerColor(@ColorRes int i) {
        View view = this.w;
        if (view != null) {
            view.setBackgroundColor(ContextCompat.getColor(this.a, i));
        }
    }

    public void toggle() {
        if (this.e) {
            this.r.toggle();
        }
    }

    public ItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setSummary(String str) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((RelativeLayout) findViewById(R.id.content_layout)).getLayoutParams();
        if (TextUtils.isEmpty(str)) {
            this.o.setVisibility(8);
            if (!this.B) {
                layoutParams.setMargins(0, (int) k(this.a, 5.5f), 0, (int) k(this.a, 5.5f));
            }
        } else {
            this.o.setVisibility(0);
            this.o.setText(str);
            layoutParams.setMargins(0, 0, 0, 0);
        }
        j();
    }

    public void setTitle(String str) {
        this.n.setText(str);
    }

    public void setValue(String str) {
        this.p.setText(str);
        if (this.B && TextUtils.isEmpty(str)) {
            this.p.setVisibility(8);
        } else {
            this.p.setVisibility(0);
        }
        j();
    }

    public ItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.A = false;
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ItemView, 0, i);
        this.B = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ItemView_itemTopBottomStyle, false);
        this.b = typedArrayObtainStyledAttributes.getString(R.styleable.ItemView_itemTitle);
        this.c = typedArrayObtainStyledAttributes.getString(R.styleable.ItemView_itemSummary);
        this.d = typedArrayObtainStyledAttributes.getString(R.styleable.ItemView_itemValue);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ItemView_itemSwitch, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ItemView_itemEndArrow, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ItemView_itemRedDot, false);
        this.h = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ItemView_itemTitleTipIcon, -1);
        this.i = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ItemView_itemTitleTipIconTintColor, -1);
        this.j = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ItemView_itemIcon, -1);
        this.l = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ItemView_itemIconTintColor, -1);
        this.k = typedArrayObtainStyledAttributes.getInt(R.styleable.ItemView_itemIconStyle, -1);
        this.m = typedArrayObtainStyledAttributes.getColor(R.styleable.ItemView_dividerColor, -1);
        if (this.j != -1 && this.k == -1) {
            this.k = 0;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.ItemView_itemDivider, 1);
        typedArrayObtainStyledAttributes.recycle();
        l();
        setRedDotVisible(z);
        setupDivider(i2);
    }

    public void setIconWithTint(@DrawableRes int i, @ColorRes int i2) {
        this.x.setImageDrawable(null);
        this.x.setBackground(null);
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
        DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, i2));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        this.x.setImageDrawable(drawableWrap);
    }
}
