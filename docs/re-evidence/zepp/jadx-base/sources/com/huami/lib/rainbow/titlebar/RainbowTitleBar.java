package com.huami.lib.rainbow.titlebar;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.widget.ImageViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.huami.lib.rainbow.statusbar.StatusBarCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowTitleBar extends LinearLayout {
    public static final int ACTION_BUTTON_COLLAPSE = 1;
    public static final int ACTION_BUTTON_MENU = 0;
    public static final int MODE_STATUS_BAR_AUTO = 0;
    public static final int MODE_STATUS_BAR_DARK = 1;
    private static final int[] w = {R.attr.colorBackground};
    private final int a;

    @ColorInt
    private final int b;
    private final boolean c;
    private final TextView d;
    private final TextView e;
    private View f;
    private final ImageButton g;
    private final TextView h;

    @ColorInt
    private int i;
    private View.OnClickListener j;
    private View k;
    private final ImageButton l;
    private final TextView m;
    private ColorStateList n;
    private final ImageButton o;
    private OnActionMenuClickListener p;
    private View q;
    private final ViewStub r;
    private EditText s;
    private OnSearchActionListener t;
    private int u;
    private final int v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionType {
    }

    public interface OnActionMenuClickListener {
        void onClick(View view, int i);
    }

    public interface OnSearchActionListener {
        void onCancel();
    }

    public RainbowTitleBar(Context context) {
        this(context, null);
    }

    private void e() {
        View view = new View(getContext());
        view.setBackgroundColor(this.b);
        this.u = StatusBarCompat.getStatusBarHeight(getContext());
        addView(view, -1, new LinearLayout.LayoutParams(-1, this.u));
    }

    @Nullable
    private Activity f(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    private void g() {
        this.k.setOnClickListener(new View.OnClickListener() { // from class: n66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
    }

    private void h() {
        if (this.j != null) {
            this.f.setOnClickListener(new View.OnClickListener() { // from class: m66
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.l(view);
                }
            });
        }
    }

    private void i(Activity activity) {
        if (activity.getActionBar() != null) {
            activity.getActionBar().hide();
        }
        if (activity instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (appCompatActivity.getSupportActionBar() != null) {
                appCompatActivity.getSupportActionBar().hide();
            }
        }
    }

    private void j() {
        Activity activityF = f(getContext());
        if (activityF == null) {
            return;
        }
        i(activityF);
        refreshStatusBar(activityF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        OnActionMenuClickListener onActionMenuClickListener = this.p;
        if (onActionMenuClickListener != null) {
            onActionMenuClickListener.onClick(view, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        this.j.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        OnActionMenuClickListener onActionMenuClickListener = this.p;
        if (onActionMenuClickListener != null) {
            onActionMenuClickListener.onClick(view, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        this.s.setText((CharSequence) null);
        OnSearchActionListener onSearchActionListener = this.t;
        if (onSearchActionListener != null) {
            onSearchActionListener.onCancel();
        }
    }

    public EditText getSearchInputText() {
        return this.s;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.c ? this.u + this.v : this.v, 1073741824));
    }

    public void refreshStatusBar(Activity activity) {
        StatusBarCompat.transparent(activity);
        int i = this.a;
        if (i == 0) {
            StatusBarCompat.setMode(activity, (getResources().getConfiguration().uiMode & 48) == 16);
        } else {
            StatusBarCompat.setMode(activity, i == 1);
        }
    }

    public void reset() {
        this.q.setVisibility(8);
        this.g.setVisibility(0);
        if (!TextUtils.isEmpty(this.d.getText())) {
            this.d.setVisibility(0);
        }
        this.d.setVisibility(0);
        if (!TextUtils.isEmpty(this.e.getText())) {
            this.e.setVisibility(0);
        }
        this.l.setVisibility(0);
    }

    public void setCollapseIcon(@DrawableRes int i) {
        setCollapseIcon(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setMenuEnable(int i, boolean z) {
        if (i == 0) {
            this.m.setEnabled(z);
        } else {
            if (i != 1) {
                return;
            }
            this.o.setEnabled(z);
        }
    }

    public void setMenuIcon(@DrawableRes int i) {
        setMenuIcon(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setMenuText(@StringRes int i) {
        setMenuText(getContext().getText(i));
    }

    public void setMenuTint(@ColorRes int i) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setTextColor(AppCompatResources.getColorStateList(getContext(), i));
        }
    }

    public void setNavigationIcon(@DrawableRes int i) {
        setNavigationIcon(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
        View view = this.f;
        if (view == null) {
            this.g.setOnClickListener(onClickListener);
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setNavigationText(@StringRes int i) {
        setNavigationText(getContext().getText(i));
    }

    public void setOnActionMenuClickListener(OnActionMenuClickListener onActionMenuClickListener) {
        this.p = onActionMenuClickListener;
    }

    public void setOnSearchActionListener(OnSearchActionListener onSearchActionListener) {
        this.t = onSearchActionListener;
    }

    public void setStatusBarMode(Activity activity) {
        StatusBarCompat.setMode(activity, this.a == 1);
    }

    public void setSubtitle(@StringRes int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(@ColorInt int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(@StringRes int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(@ColorInt int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setViewPager(ViewPager viewPager) {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.o.setVisibility(8);
        TabLayout tabLayout = (TabLayout) findViewById(com.huami.lib.rainbow.R.id.rainbow_tab_layout);
        tabLayout.setVisibility(0);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void showSearchLayout() {
        showSearchLayout(null);
    }

    public RainbowTitleBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable == null) {
            this.o.setVisibility(8);
            return;
        }
        this.o.setVisibility(0);
        this.o.setImageDrawable(drawable);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: p66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
    }

    public void setMenuIcon(Drawable drawable) {
        TextView textView = this.m;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (drawable != null) {
            this.l.setVisibility(0);
            this.l.setImageDrawable(drawable);
        } else {
            this.l.setVisibility(8);
        }
        this.k = this.l;
        g();
    }

    public void setMenuText(CharSequence charSequence) {
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.m.setVisibility(8);
        } else {
            this.m.setVisibility(0);
            this.m.setText(charSequence);
            ColorStateList colorStateList = this.n;
            if (colorStateList != null) {
                this.m.setTextColor(colorStateList);
            }
        }
        this.k = this.m;
        g();
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        TextView textView = this.h;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (drawable != null) {
            this.g.setVisibility(0);
            this.g.setImageDrawable(drawable);
        } else {
            this.g.setVisibility(8);
        }
        this.f = this.g;
        h();
    }

    public void setNavigationText(CharSequence charSequence) {
        ImageButton imageButton = this.g;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            int i = this.i;
            if (i != 0) {
                this.h.setTextColor(i);
            }
            this.h.setText(charSequence);
        }
        this.f = this.h;
        h();
    }

    public void setSubtitle(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.e.setText(charSequence);
        }
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence instanceof SpannableString) {
            this.d.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.d.setText(charSequence);
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void showSearchLayout(String str) {
        this.g.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.l.setVisibility(8);
        this.m.setVisibility(8);
        View view = this.q;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        View viewInflate = this.r.inflate();
        this.q = viewInflate;
        EditText editText = (EditText) viewInflate.findViewById(com.huami.lib.rainbow.R.id.rainbow_search_text);
        this.s = editText;
        editText.setHint(str);
        this.q.findViewById(com.huami.lib.rainbow.R.id.rainbow_search_cancel).setOnClickListener(new View.OnClickListener() { // from class: o66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.n(view2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:40:0x014e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0154  */
    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Code duplicated, block: B:45:0x015e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0166  */
    /* JADX WARN: Code duplicated, block: B:49:0x0170  */
    public RainbowTitleBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        String string;
        Drawable drawable;
        super(context, attributeSet, i);
        setOrientation(1);
        this.v = Math.round(TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics()));
        if (getBackground() == null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(w);
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            setBackgroundColor(color);
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, com.huami.lib.rainbow.R.styleable.RainbowTitleBar, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_immersion, true);
        this.c = z;
        this.a = typedArrayObtainStyledAttributes2.getInt(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_statusBarMode, 0);
        this.b = typedArrayObtainStyledAttributes2.getColor(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_statusBarColor, 0);
        if (z) {
            j();
            e();
        }
        LinearLayout.inflate(context, com.huami.lib.rainbow.R.layout.rainbow_layout_titlebar, this);
        this.d = (TextView) findViewById(com.huami.lib.rainbow.R.id.rainbow_title);
        CharSequence text = typedArrayObtainStyledAttributes2.getText(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_title);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        int i3 = com.huami.lib.rainbow.R.styleable.RainbowTitleBar_titleTextColor;
        if (typedArrayObtainStyledAttributes2.hasValue(i3)) {
            setTitleTextColor(typedArrayObtainStyledAttributes2.getColorStateList(i3));
        }
        this.e = (TextView) findViewById(com.huami.lib.rainbow.R.id.rainbow_subtitle);
        CharSequence text2 = typedArrayObtainStyledAttributes2.getText(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_subtitle);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
            int i4 = com.huami.lib.rainbow.R.styleable.RainbowTitleBar_subtitleTextColor;
            if (typedArrayObtainStyledAttributes2.hasValue(i4)) {
                setSubtitleTextColor(typedArrayObtainStyledAttributes2.getColorStateList(i4));
            }
        }
        ImageButton imageButton = (ImageButton) findViewById(com.huami.lib.rainbow.R.id.rainbow_navigation_icon);
        this.g = imageButton;
        Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_navigationIcon);
        int i5 = com.huami.lib.rainbow.R.styleable.RainbowTitleBar_navigationTint;
        if (typedArrayObtainStyledAttributes2.hasValue(i5)) {
            int color2 = typedArrayObtainStyledAttributes2.getColor(i5, -16777216);
            this.i = color2;
            ImageViewCompat.setImageTintList(imageButton, ColorStateList.valueOf(color2));
        }
        if (!typedArrayObtainStyledAttributes2.getBoolean(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_showNavigationView, true)) {
            imageButton.setVisibility(8);
        }
        if (drawable2 != null) {
            setNavigationIcon(drawable2);
        }
        this.h = (TextView) findViewById(com.huami.lib.rainbow.R.id.rainbow_navigation_text);
        String string2 = typedArrayObtainStyledAttributes2.getString(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_navigationText);
        if (!TextUtils.isEmpty(string2)) {
            setNavigationText(string2);
        }
        TextView textView = (TextView) findViewById(com.huami.lib.rainbow.R.id.rainbow_menu_text);
        this.m = textView;
        ImageButton imageButton2 = (ImageButton) findViewById(com.huami.lib.rainbow.R.id.rainbow_menu_icon);
        this.l = imageButton2;
        int i6 = com.huami.lib.rainbow.R.styleable.RainbowTitleBar_menuTint;
        if (typedArrayObtainStyledAttributes2.hasValue(i6)) {
            ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(i6);
            this.n = colorStateList;
            ImageViewCompat.setImageTintList(imageButton2, colorStateList);
        }
        int i7 = com.huami.lib.rainbow.R.styleable.RainbowTitleBar_menuIcon;
        if (typedArrayObtainStyledAttributes2.hasValue(i7)) {
            int i8 = com.huami.lib.rainbow.R.styleable.RainbowTitleBar_menuText;
            if (typedArrayObtainStyledAttributes2.hasValue(i8)) {
                String string3 = typedArrayObtainStyledAttributes2.getString(i8);
                Drawable drawable3 = typedArrayObtainStyledAttributes2.getDrawable(i7);
                if (!TextUtils.isEmpty(string3)) {
                    setMenuText(string3);
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable3, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            } else if (typedArrayObtainStyledAttributes2.hasValue(i7)) {
                drawable = typedArrayObtainStyledAttributes2.getDrawable(i7);
                if (drawable != null) {
                    setMenuIcon(drawable);
                }
            } else {
                i2 = com.huami.lib.rainbow.R.styleable.RainbowTitleBar_menuText;
                if (typedArrayObtainStyledAttributes2.hasValue(i2)) {
                    string = typedArrayObtainStyledAttributes2.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        setMenuText(string);
                    }
                }
            }
        } else if (typedArrayObtainStyledAttributes2.hasValue(i7)) {
            drawable = typedArrayObtainStyledAttributes2.getDrawable(i7);
            if (drawable != null) {
                setMenuIcon(drawable);
            }
        } else {
            i2 = com.huami.lib.rainbow.R.styleable.RainbowTitleBar_menuText;
            if (typedArrayObtainStyledAttributes2.hasValue(i2)) {
                string = typedArrayObtainStyledAttributes2.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    setMenuText(string);
                }
            }
        }
        this.o = (ImageButton) findViewById(com.huami.lib.rainbow.R.id.rainbow_collapse_icon);
        Drawable drawable4 = typedArrayObtainStyledAttributes2.getDrawable(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_collapseIcon);
        if (drawable4 != null) {
            setCollapseIcon(drawable4);
        }
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_searchable, false);
        this.r = (ViewStub) findViewById(com.huami.lib.rainbow.R.id.rainbow_view_stub);
        if (z2) {
            showSearchLayout(typedArrayObtainStyledAttributes2.getString(com.huami.lib.rainbow.R.styleable.RainbowTitleBar_searchHint));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }
}
