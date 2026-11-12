package com.huami.lib.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
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
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.widget.toast.CustomToast;

/* JADX INFO: loaded from: classes10.dex */
public class ItemView extends FrameLayout {
    private static final String D = "ItemView";
    public static final int DIVIDER_GONE = 0;
    public static final int DIVIDER_NORMAL = 1;
    public static final int DIVIDER_START_SHORT = 2;
    private static final boolean E = true;
    private static final int F = 0;
    private static final int G = 1;
    private boolean A;
    private boolean B;
    private boolean C;
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
    private TextView m;
    private TextView n;
    private TextView o;
    private ImageView p;
    private SwitchCompat q;
    private View r;
    private View s;
    private View t;
    private View u;
    private View v;
    private ImageView w;
    private OnCheckedChangeListener x;
    private View.OnClickListener y;
    private CenterAlignImageSpan z;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(ItemView itemView, boolean z, boolean z2);
    }

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ItemView.this.x != null) {
                OnCheckedChangeListener onCheckedChangeListener = ItemView.this.x;
                ItemView itemView = ItemView.this;
                onCheckedChangeListener.onCheckedChanged(itemView, z, itemView.A || ItemView.this.q.isPressed());
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
            ItemView.this.q.toggle();
        }
    }

    public class c extends ClickableSpan {
        public c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (ItemView.this.y != null) {
                ItemView.this.y.onClick(view);
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ boolean a;

        public d(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ItemView.this.r == null) {
                ItemView itemView = ItemView.this;
                itemView.r = itemView.getMaskView();
            }
            if (!((Boolean) ItemView.this.r.getTag()).booleanValue()) {
                ItemView.this.r.setLayoutParams(new FrameLayout.LayoutParams(ItemView.this.t.getMeasuredWidth(), ItemView.this.t.getMeasuredHeight()));
                ItemView itemView2 = ItemView.this;
                itemView2.addView(itemView2.r, ItemView.this.getChildCount());
                ItemView.this.r.setTag(Boolean.TRUE);
            }
            ItemView.this.r.setVisibility(this.a ? 8 : 0);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) ItemView.this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy text", ((TextView) view).getText()));
            CustomToast.makeText(ItemView.this.a, ItemView.this.a.getString(R.string.copy_success), 0).show();
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

    private void k() {
        if (this.B) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.content_layout);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (this.o.getVisibility() == 8 && this.n.getVisibility() == 8) {
                layoutParams.setMargins(0, (int) ViewUtils.dp2px(this.a, 5.5f), 0, (int) ViewUtils.dp2px(this.a, 5.5f));
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    private void l() {
        setBackgroundResource(R.drawable.bg_item);
        if (this.C) {
            this.t = FrameLayout.inflate(this.a, R.layout.view_adaptive_item, this);
        } else {
            this.t = FrameLayout.inflate(this.a, this.B ? R.layout.view_item_top_bottom : R.layout.view_item, this);
        }
        this.m = (TextView) findViewById(R.id.title);
        this.n = (TextView) findViewById(R.id.summary);
        this.o = (TextView) findViewById(R.id.right_value);
        this.p = (ImageView) findViewById(R.id.right_value_img);
        this.q = (SwitchCompat) findViewById(R.id.item_switch);
        this.s = findViewById(R.id.right_arrow);
        this.m.setText(this.b);
        setSummary(this.c);
        setValue(this.d);
        if (this.e) {
            this.q.setVisibility(0);
            this.q.setOnCheckedChangeListener(new a());
            this.o.setVisibility(8);
            this.s.setVisibility(8);
            setOnClickListener(new b());
        } else if (!this.f) {
            this.s.setVisibility(8);
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
        this.w = imageView;
        int i = this.j;
        if (i != -1) {
            if (this.l != -1) {
                Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
                DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, this.l));
                DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
                this.w.setImageDrawable(drawableWrap);
            } else {
                imageView.setBackgroundResource(i);
            }
        }
        int i2 = this.k;
        if (i2 == 0) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.item_icon_small);
            dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.item_icon_small_margin_top);
            dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(R.dimen.item_icon_small_margin_end);
        } else if (i2 == 1) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.item_icon_big);
            dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.item_icon_big_margin_top);
            dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(R.dimen.item_icon_big_margin_end);
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
        this.w.setLayoutParams(layoutParams);
        ((LinearLayout) findViewById(R.id.content)).addView(this.w, 0);
    }

    private void n() {
        Drawable drawable;
        ImageView imageView = new ImageView(getContext());
        int i = this.h;
        if (i == -1) {
            drawable = null;
        } else if (this.i != -1) {
            drawable = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
            DrawableCompat.setTint(drawable, ContextCompat.getColor(this.a, this.i));
            DrawableCompat.setTintMode(drawable, PorterDuff.Mode.SRC_IN);
            imageView.setImageDrawable(drawable);
        } else {
            drawable = ContextCompat.getDrawable(this.a, i);
        }
        if (drawable != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b + "  ");
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            CenterAlignImageSpan centerAlignImageSpan = new CenterAlignImageSpan(drawable, 1);
            this.z = centerAlignImageSpan;
            spannableStringBuilder.setSpan(centerAlignImageSpan, this.b.length() + 1, this.b.length() + 2, 17);
            spannableStringBuilder.setSpan(new c(), this.b.length() + 1, this.b.length() + 2, 17);
            this.m.setText(spannableStringBuilder);
            this.m.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private void setupDividerView(int i) {
        View view = this.v;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMarginStart(i);
            return;
        }
        View view2 = new View(this.a);
        this.v = view2;
        view2.setBackgroundColor(ContextCompat.getColor(this.a, R.color.divide));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.a.getResources().getDimensionPixelSize(R.dimen.divider));
        layoutParams.gravity = 80;
        layoutParams.setMarginEnd(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
        layoutParams.setMarginStart(i);
        this.v.setLayoutParams(layoutParams);
        addView(this.v);
    }

    public TextView getSummaryTv() {
        return this.n;
    }

    public ImageView getmIconImage() {
        return this.w;
    }

    public ImageView getmValueImage() {
        return this.p;
    }

    public TextView getmValueTv() {
        return this.o;
    }

    public boolean isChecked() {
        return this.e && this.q.isChecked();
    }

    @Deprecated
    public boolean isPressedSwitch() {
        return this.q.isPressed();
    }

    public boolean isShowingRedDot() {
        View view = this.u;
        return view != null && view.getVisibility() == 0;
    }

    public void setChecked(boolean z) {
        if (this.e) {
            this.q.setChecked(z);
        }
    }

    public void setEnableCopy(boolean z) {
        TextView textView;
        this.g = z;
        if (!z || (textView = this.o) == null) {
            return;
        }
        textView.setOnClickListener(new e());
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        post(new d(z));
    }

    public void setEnabledWithoutGrayBack(boolean z) {
        super.setEnabled(z);
    }

    public void setEndArrowVisible(boolean z) {
        this.s.setVisibility(z ? 0 : 8);
    }

    public void setIcon(@DrawableRes int i) {
        if (this.w == null) {
            m();
        }
        this.w.setBackgroundResource(i);
    }

    public void setIconWithTint(@DrawableRes int i) {
        if (this.l == -1) {
            this.w.setBackgroundResource(i);
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
        DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, this.l));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        this.w.setImageDrawable(drawableWrap);
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.x = onCheckedChangeListener;
    }

    public void setRedDotVisible(boolean z) {
        if (!z) {
            View view = this.u;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.u;
        if (view2 != null) {
            view2.setVisibility(0);
            return;
        }
        View view3 = new View(this.a);
        this.u = view3;
        view3.setBackground(ContextCompat.getDrawable(this.a, R.drawable.ic_red_circle));
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.item_red_dot_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginEnd(this.a.getResources().getDimensionPixelSize(R.dimen.item_red_dot_end_margin));
        this.u.setLayoutParams(layoutParams);
        addView(this.u);
    }

    public void setSummary(@StringRes int i) {
        setSummary(getResources().getString(i));
    }

    public void setSwitchThumbTint(int i, int i2) {
        if (this.e) {
            this.q.setThumbTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{i, i2}));
        }
    }

    public void setSwitchVisible(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
        this.e = z;
    }

    public void setTitle(@StringRes int i) {
        this.m.setText(i);
    }

    public void setTitleColor(@ColorInt int i) {
        this.m.setTextColor(i);
    }

    public void setTitleTipIconClickListener(View.OnClickListener onClickListener) {
        if (this.z == null) {
            n();
        }
        this.y = onClickListener;
    }

    public void setValue(@StringRes int i) {
        setValue(getContext().getString(i));
    }

    public void setValueVisible(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    public void setupDivider(int i) {
        if (i == 0) {
            View view = this.v;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 1) {
            setupDividerView(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
            this.v.setVisibility(0);
        } else if (i == 2) {
            setupDividerView(this.a.getResources().getDimensionPixelSize(R.dimen.item_short_start_margin));
            this.v.setVisibility(0);
        }
    }

    public void setupDividerColor(@ColorRes int i) {
        View view = this.v;
        if (view != null) {
            view.setBackgroundColor(ContextCompat.getColor(this.a, i));
        }
    }

    public void toggle() {
        if (this.e) {
            this.q.toggle();
        }
    }

    public ItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setSummary(String str) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((RelativeLayout) findViewById(R.id.content_layout)).getLayoutParams();
        if (TextUtils.isEmpty(str)) {
            this.n.setVisibility(8);
            if (!this.B) {
                layoutParams.setMargins(0, (int) ViewUtils.dp2px(this.a, 5.5f), 0, (int) ViewUtils.dp2px(this.a, 5.5f));
            }
        } else {
            this.n.setVisibility(0);
            this.n.setText(str);
            layoutParams.setMargins(0, 0, 0, 0);
        }
        k();
    }

    public void setTitle(CharSequence charSequence) {
        this.m.setText(charSequence);
    }

    public void setValue(String str) {
        this.o.setText(str);
        if (this.B && TextUtils.isEmpty(str)) {
            this.o.setVisibility(8);
        } else {
            this.o.setVisibility(0);
        }
        k();
    }

    public ItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.A = false;
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ItemView, 0, i);
        this.B = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ItemView_itemTopBottomStyle, false);
        this.C = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ItemView_itemAdaptiveStyle, false);
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
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.ItemView_itemIconStyle, -1);
        this.k = i2;
        if (this.j != -1 && i2 == -1) {
            this.k = 0;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(R.styleable.ItemView_itemDivider, 1);
        typedArrayObtainStyledAttributes.recycle();
        l();
        setRedDotVisible(z);
        setupDivider(i3);
    }

    public void setIconWithTint(@DrawableRes int i, @ColorRes int i2) {
        this.w.setImageDrawable(null);
        this.w.setBackground(null);
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
        DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, i2));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        this.w.setImageDrawable(drawableWrap);
    }
}
