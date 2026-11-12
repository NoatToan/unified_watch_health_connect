package com.huami.lib.view.widget;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
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
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huami.lib.view.R;
import com.huami.lib.view.ViewUtils;
import com.huami.widget.toast.CustomToast;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes10.dex */
public class ItemView2 extends FrameLayout {
    public static final int DIVIDER_GONE = 0;
    public static final int DIVIDER_NORMAL = 1;
    public static final int DIVIDER_START_SHORT = 2;
    private static final String I = "ItemView";
    private static final boolean J = true;
    private static final int K = 0;
    private static final int L = 1;
    private ImageView A;
    private ImageView B;
    private OnCheckedChangeListener C;
    private int D;
    private boolean E;
    private boolean F;
    private float G;
    private float H;
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
    private float[] n;
    private StateListDrawable o;
    private int p;
    private TextView q;
    private TextView r;
    private TextView s;
    private ImageView t;
    private SwitchCompat u;
    private View v;
    private View w;
    private View x;
    private View y;
    private View z;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(ItemView2 itemView2, boolean z, boolean z2);
    }

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ItemView2.this.C != null) {
                OnCheckedChangeListener onCheckedChangeListener = ItemView2.this.C;
                ItemView2 itemView2 = ItemView2.this;
                onCheckedChangeListener.onCheckedChanged(itemView2, z, itemView2.E || ItemView2.this.u.isPressed());
            }
            ItemView2.this.E = false;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ItemView2.this.E = true;
            ItemView2.this.u.toggle();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ItemView2.this.v == null) {
                ItemView2 itemView2 = ItemView2.this;
                itemView2.v = itemView2.getMaskView();
            }
            if (!((Boolean) ItemView2.this.v.getTag()).booleanValue()) {
                ItemView2.this.v.setLayoutParams(new FrameLayout.LayoutParams(ItemView2.this.x.getMeasuredWidth(), ItemView2.this.x.getMeasuredHeight()));
                ItemView2 itemView3 = ItemView2.this;
                itemView3.addView(itemView3.v, ItemView2.this.getChildCount());
                ItemView2.this.v.setTag(Boolean.TRUE);
            }
            ItemView2.this.v.setVisibility(this.a ? 8 : 0);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) ItemView2.this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy text", ((TextView) view).getText()));
            CustomToast.makeText(ItemView2.this.a, ItemView2.this.a.getString(R.string.copy_success), 0).show();
        }
    }

    public ItemView2(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getMaskView() {
        View view = new View(this.a);
        view.setBackgroundColor(this.p);
        view.setClickable(true);
        view.setVisibility(8);
        view.setTag(Boolean.FALSE);
        return view;
    }

    private void j() {
        View view = this.v;
        if (view == null || this.x == null) {
            return;
        }
        if (view.getMeasuredWidth() == this.x.getMeasuredWidth() && this.v.getMeasuredHeight() == this.x.getMeasuredHeight()) {
            return;
        }
        this.v.setLayoutParams(new FrameLayout.LayoutParams(this.x.getMeasuredWidth(), this.x.getMeasuredHeight()));
    }

    private void k() {
        if (this.F) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.content_layout);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (this.s.getVisibility() == 8 && this.r.getVisibility() == 8) {
                layoutParams.setMargins(0, (int) ViewUtils.dp2px(this.a, 5.5f), 0, (int) ViewUtils.dp2px(this.a, 5.5f));
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            relativeLayout.setLayoutParams(layoutParams);
        }
    }

    private Drawable l(StateListDrawable stateListDrawable, int i) {
        try {
            return (Drawable) StateListDrawable.class.getMethod("getStateDrawable", Integer.TYPE).invoke(stateListDrawable, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void m() {
        if (this.a != null) {
            Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.bg_item, this.a.getTheme());
            if (drawable instanceof StateListDrawable) {
                this.o = (StateListDrawable) drawable;
                float[] fArr = this.n;
                setRadius(fArr[0], fArr[2], fArr[4], fArr[6]);
            }
            setBackground(drawable);
        } else {
            setBackgroundResource(R.drawable.bg_item);
        }
        this.x = FrameLayout.inflate(this.a, this.F ? R.layout.view_item_top_bottom : R.layout.baseui_view_item, this);
        this.q = (TextView) findViewById(R.id.title);
        this.r = (TextView) findViewById(R.id.summary);
        this.s = (TextView) findViewById(R.id.right_value);
        this.t = (ImageView) findViewById(R.id.right_value_img);
        this.u = (SwitchCompat) findViewById(R.id.item_switch);
        this.w = findViewById(R.id.right_arrow);
        this.q.setText(this.b);
        setSummary(this.c);
        setValue(this.d);
        if (this.e) {
            this.u.setVisibility(0);
            this.u.setOnCheckedChangeListener(new a());
            this.s.setVisibility(8);
            this.w.setVisibility(8);
            setOnClickListener(new b());
        } else if (!this.f) {
            this.w.setVisibility(8);
        }
        if (this.k != -1) {
            o();
        }
        if (this.h != -1) {
            p();
        }
        n();
    }

    private void n() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
        float f = this.G;
        int paddingStart = f != -1.0f ? (int) f : linearLayout.getPaddingStart();
        float f2 = this.H;
        linearLayout.setPadding(paddingStart, linearLayout.getPaddingTop(), f2 != -1.0f ? (int) f2 : linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
    }

    private void o() {
        int dimensionPixelSize;
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        ImageView imageView = new ImageView(this.a);
        this.A = imageView;
        int i = this.j;
        if (i != -1) {
            if (this.l != -1) {
                Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
                DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, this.l));
                DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
                this.A.setImageDrawable(drawableWrap);
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
        this.A.setLayoutParams(layoutParams);
        ((LinearLayout) findViewById(R.id.content)).addView(this.A, 0);
    }

    private void p() {
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
        int iDp2px = (int) ViewUtils.dp2px(getContext(), 2.0f);
        layoutParams.setMargins(0, iDp2px, 0, 0);
        layoutParams.setMarginStart(iDp2px);
        relativeLayout.addView(imageView, layoutParams);
        this.B = imageView;
        q();
    }

    private void q() {
        int measuredWidth;
        if (this.B == null || (measuredWidth = this.q.getMeasuredWidth()) == 0) {
            return;
        }
        int i = measuredWidth + this.D;
        this.D = 0;
        if (this.B.getVisibility() != 8) {
            int measuredWidth2 = this.B.getMeasuredWidth();
            if (findViewById(R.id.content_layout).getMeasuredWidth() - i < measuredWidth2) {
                this.D = measuredWidth2;
            }
            i -= this.D;
        }
        this.q.setWidth(i);
    }

    private void setupDividerView(int i) {
        View view = this.z;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).setMarginStart(i);
            return;
        }
        View view2 = new View(this.a);
        this.z = view2;
        int color = this.m;
        if (color == -1) {
            color = ContextCompat.getColor(this.a, R.color.divide);
        }
        view2.setBackgroundColor(color);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.a.getResources().getDimensionPixelSize(R.dimen.divider));
        layoutParams.gravity = 80;
        layoutParams.setMarginEnd(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
        layoutParams.setMarginStart(i);
        this.z.setLayoutParams(layoutParams);
        addView(this.z);
    }

    public TextView getSummaryTv() {
        return this.r;
    }

    public ImageView getmIconImage() {
        return this.A;
    }

    public ImageView getmValueImage() {
        return this.t;
    }

    public TextView getmValueTv() {
        return this.s;
    }

    public boolean isChecked() {
        return this.e && this.u.isChecked();
    }

    @Deprecated
    public boolean isPressedSwitch() {
        return this.u.isPressed();
    }

    public boolean isShowingRedDot() {
        View view = this.y;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        q();
        j();
    }

    public void setChecked(boolean z) {
        if (this.e) {
            this.u.setChecked(z);
        }
    }

    public void setEnableCopy(boolean z) {
        TextView textView;
        this.g = z;
        if (!z || (textView = this.s) == null) {
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
        this.w.setVisibility(z ? 0 : 8);
    }

    public void setIcon(@DrawableRes int i) {
        if (this.A == null) {
            o();
        }
        this.A.setBackgroundResource(i);
    }

    public void setIconWithTint(@DrawableRes int i) {
        if (this.l == -1) {
            this.A.setBackgroundResource(i);
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
        DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, this.l));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        this.A.setImageDrawable(drawableWrap);
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.C = onCheckedChangeListener;
    }

    public void setRadius(float f, float f2, float f3, float f4) {
        if (f >= 0.0f) {
            float[] fArr = this.n;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (f2 >= 0.0f) {
            float[] fArr2 = this.n;
            fArr2[2] = f2;
            fArr2[3] = f2;
        }
        if (f4 >= 0.0f) {
            float[] fArr3 = this.n;
            fArr3[4] = f4;
            fArr3[5] = f4;
        }
        if (f3 >= 0.0f) {
            float[] fArr4 = this.n;
            fArr4[6] = f3;
            fArr4[7] = f3;
        }
        int stateCount = Build.VERSION.SDK_INT >= 29 ? this.o.getStateCount() : 20;
        for (int i = 0; i < stateCount; i++) {
            Drawable stateDrawable = Build.VERSION.SDK_INT >= 29 ? this.o.getStateDrawable(i) : l(this.o, i);
            if (stateDrawable == null) {
                return;
            }
            if (stateDrawable instanceof GradientDrawable) {
                ((GradientDrawable) ((GradientDrawable) stateDrawable).mutate()).setCornerRadii(this.n);
            }
        }
    }

    public void setRedDotVisible(boolean z) {
        if (!z) {
            View view = this.y;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.y;
        if (view2 != null) {
            view2.setVisibility(0);
            return;
        }
        View view3 = new View(this.a);
        this.y = view3;
        view3.setBackground(ContextCompat.getDrawable(this.a, R.drawable.ic_red_circle));
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.item_red_dot_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginEnd(this.a.getResources().getDimensionPixelSize(R.dimen.item_red_dot_end_margin));
        this.y.setLayoutParams(layoutParams);
        addView(this.y);
    }

    public void setSummary(@StringRes int i) {
        setSummary(getResources().getString(i));
    }

    public void setSwitchStyle(int i, int i2) {
        if (this.e) {
            this.u.setThumbResource(i);
            this.u.setBackgroundResource(i2);
        }
    }

    public void setSwitchThumbTint(int i, int i2) {
        if (this.e) {
            this.u.setThumbTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{i, i2}));
        }
    }

    public void setSwitchVisible(boolean z) {
        this.u.setVisibility(z ? 0 : 8);
        this.e = z;
    }

    public void setTitle(@StringRes int i) {
        this.q.setText(i);
    }

    public void setTitleColor(@ColorInt int i) {
        this.q.setTextColor(i);
    }

    public void setTitleTipIcon(@DrawableRes int i) {
        ImageView imageView = this.B;
        if (imageView == null) {
            p();
        } else {
            imageView.setBackgroundResource(i);
            q();
        }
    }

    public void setTitleTipIconClickListener(View.OnClickListener onClickListener) {
        if (this.B == null) {
            p();
        }
        this.B.setOnClickListener(onClickListener);
    }

    public void setTitleTipIconVisibility(int i) {
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setVisibility(i);
            q();
        }
    }

    public void setValue(@StringRes int i) {
        setValue(getContext().getString(i));
    }

    public void setValueVisible(boolean z) {
        this.s.setVisibility(z ? 0 : 8);
    }

    public void setupDivider(int i) {
        if (i == 0) {
            View view = this.z;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (i == 1) {
            setupDividerView(this.a.getResources().getDimensionPixelSize(R.dimen.common_item_padding));
            this.z.setVisibility(0);
        } else if (i == 2) {
            setupDividerView(this.a.getResources().getDimensionPixelSize(R.dimen.item_short_start_margin));
            this.z.setVisibility(0);
        }
    }

    public void setupDividerColor(@ColorRes int i) {
        View view = this.z;
        if (view != null) {
            view.setBackgroundColor(ContextCompat.getColor(this.a, i));
        }
    }

    public void toggle() {
        if (this.e) {
            this.u.toggle();
        }
    }

    public ItemView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setSummary(String str) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((RelativeLayout) findViewById(R.id.content_layout)).getLayoutParams();
        if (TextUtils.isEmpty(str)) {
            this.r.setVisibility(8);
            if (!this.F) {
                layoutParams.setMargins(0, (int) ViewUtils.dp2px(this.a, 5.5f), 0, (int) ViewUtils.dp2px(this.a, 5.5f));
            }
        } else {
            this.r.setVisibility(0);
            this.r.setText(str);
            layoutParams.setMargins(0, 0, 0, 0);
        }
        k();
    }

    public void setTitle(CharSequence charSequence) {
        this.q.setText(charSequence);
    }

    public void setValue(String str) {
        this.s.setText(str);
        if (this.F && TextUtils.isEmpty(str)) {
            this.s.setVisibility(8);
        } else {
            this.s.setVisibility(0);
        }
        k();
    }

    public ItemView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.p = -1;
        this.D = 0;
        this.E = false;
        this.H = -1.0f;
        this.a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ItemView, 0, i);
        this.F = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ItemView_itemTopBottomStyle, false);
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
        this.n[0] = typedArrayObtainStyledAttributes.getDimension(R.styleable.ItemView_leftTopRadius, 0.0f);
        float[] fArr = this.n;
        fArr[1] = fArr[0];
        fArr[2] = typedArrayObtainStyledAttributes.getDimension(R.styleable.ItemView_rightTopRadius, 0.0f);
        float[] fArr2 = this.n;
        fArr2[3] = fArr2[2];
        fArr2[4] = typedArrayObtainStyledAttributes.getDimension(R.styleable.ItemView_rightBottomRadius, 0.0f);
        float[] fArr3 = this.n;
        fArr3[5] = fArr3[4];
        fArr3[6] = typedArrayObtainStyledAttributes.getDimension(R.styleable.ItemView_leftBottomRadius, 0.0f);
        float[] fArr4 = this.n;
        fArr4[7] = fArr4[6];
        this.G = typedArrayObtainStyledAttributes.getDimension(R.styleable.ItemView_contentPaddingStart, -1.0f);
        this.H = typedArrayObtainStyledAttributes.getDimension(R.styleable.ItemView_contentPaddingEnd, -1.0f);
        this.p = typedArrayObtainStyledAttributes.getColor(R.styleable.ItemView_disableMaskColor, ContextCompat.getColor(this.a, R.color.mask_view));
        if (this.j != -1 && this.k == -1) {
            this.k = 0;
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.ItemView_itemDivider, 1);
        typedArrayObtainStyledAttributes.recycle();
        m();
        setRedDotVisible(z);
        setupDivider(i2);
    }

    public void setIconWithTint(@DrawableRes int i, @ColorRes int i2) {
        this.A.setImageDrawable(null);
        this.A.setBackground(null);
        Drawable drawableWrap = DrawableCompat.wrap(ContextCompat.getDrawable(this.a, i));
        DrawableCompat.setTint(drawableWrap, ContextCompat.getColor(this.a, i2));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        this.A.setImageDrawable(drawableWrap);
    }
}
