package com.huami.view.basetitle;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseTitleActivity extends BaseFragmentActivity {
    private static final String s = "BaseTitleActivity";
    private static final String t = "status_bar_height";
    private static int u;
    private static int v;
    private static int w;
    private RelativeLayout a;
    private FrameLayout b;
    private ViewGroup c;
    private ViewGroup d;
    private ViewGroup e;
    private TextView f;
    private TextView g;
    private Button h;
    private ImageButton i;
    private ImageButton j;
    private ImageButton k;
    private Button l;
    private ImageButton m;
    public SystemBarTintManager mTintManager;
    private View n;
    private ImageButton o;
    private boolean p = true;
    private boolean q = true;
    private boolean r = true;

    public enum STYLE {
        BACK_AND_TITLE,
        BACK_AND_TITLE_TRANSPARENT,
        TITLE_AND_EDIT,
        BACK_DOUBLE_TITLE_SHARE,
        BACK_DOUBLE_TITLE,
        CANCEL_AND_SAVE,
        BACK_AND_TITLE_COMMIT,
        SINGLE_BACK,
        NONE,
        SINGLE_TITLE,
        BACK_AND_SHARE,
        BACK_AND_TITLE_EXCHANGE,
        EDIT_AND_TITLE_MSG,
        BACK_AND_TITLE_CLEAR,
        BACK_DOUBLE_TITLE_DEVICE,
        BACK_AND_TITLE_FUNC
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseTitleActivity.this.onShareClicked(view);
        }
    }

    public static float dp2px(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private void f(TextView textView, String str) {
        int iDp2px = (int) dp2px(this, 48.0f);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (textView.getPaint().measureText(str) > iDp2px) {
            layoutParams.width = (int) dp2px(this, 68.0f);
            textView.setLayoutParams(layoutParams);
        }
    }

    private boolean g() {
        return this.j.getVisibility() == 0 || this.m.getVisibility() == 0;
    }

    public static int getPxOfDp48(Context context) {
        if (u <= 0) {
            u = Math.round(TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics()));
        }
        return u;
    }

    public static int getStatusBarHeight(Context context) {
        if (v <= 0) {
            try {
                v = context.getResources().getDimensionPixelSize(IdGetter.getIdSys(context, t, "dimen"));
            } catch (Exception unused) {
                v = getPxOfDp48(context) / 2;
            }
        }
        return v;
    }

    public static int getTitleBarHeightDefault(Context context) {
        if (w <= 0) {
            w = context.getResources().getDimensionPixelSize(R.dimen.common_title_height);
        }
        return w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        onLeftClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        onLeftClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        onRightFuncClicked();
    }

    private void k() {
        this.b.setFitsSystemWindows(!this.q);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        int titleBarHeight = 0;
        layoutParams.topMargin = !this.q ? 0 : getStatusBarHeight(this);
        this.c.setLayoutParams(layoutParams);
        if ((!this.p || !this.q) && this.r) {
            titleBarHeight = getTitleBarHeight();
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams2.topMargin = titleBarHeight;
        this.a.setLayoutParams(layoutParams2);
    }

    public static Drawable tintDrawable(Drawable drawable, @ColorInt int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(drawableWrap, i);
        return drawableWrap;
    }

    public void addFragment(Fragment fragment, int i) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(i, fragment, fragment.getClass().getSimpleName()).commitAllowingStateLoss();
        }
    }

    public ImageButton getLeft() {
        this.i.setVisibility(0);
        return this.i;
    }

    public ImageButton getLeft2() {
        this.j.setVisibility(0);
        return this.j;
    }

    public Button getLeftText() {
        this.h.setVisibility(0);
        return this.h;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        if (resources != null && resources.getConfiguration().fontScale != 1.0f) {
            Configuration configuration = resources.getConfiguration();
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    public ImageButton getRight2() {
        this.m.setVisibility(0);
        return this.m;
    }

    public ImageButton getRightImage() {
        this.l.setVisibility(8);
        this.k.setVisibility(0);
        return this.k;
    }

    public Button getRightTitle() {
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        return this.l;
    }

    public TextView getSubTitleTextView() {
        return this.g;
    }

    public int getTitleBarHeight() {
        if (this.r) {
            return getTitleBarHeightDefault();
        }
        return 0;
    }

    public ViewGroup getTitleBarView() {
        return this.c;
    }

    public TextView getTitleTextView() {
        return this.f;
    }

    public boolean isShowRight2Image() {
        return this.m.getVisibility() == 0;
    }

    public boolean isShowingRightImage() {
        return this.k.getVisibility() == 0;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().requestFeature(1);
        super.onCreate(bundle);
        super.setContentView(R.layout.common_activity_base_title);
        this.mTintManager = new SystemBarTintManager(this);
        this.b = (FrameLayout) findViewById(R.id.common_title_content_parent);
        this.a = (RelativeLayout) findViewById(R.id.custom_content);
        this.c = (ViewGroup) findViewById(R.id.common_title_bar_parent);
        this.d = (ViewGroup) findViewById(R.id.common_title_bar_bg);
        this.e = (ViewGroup) findViewById(R.id.common_title_center_layout);
        this.f = (TextView) findViewById(R.id.common_title_center_top_text);
        this.g = (TextView) findViewById(R.id.common_title_center_bottom_text);
        this.h = (Button) findViewById(R.id.common_title_left_text);
        this.i = (ImageButton) findViewById(R.id.common_title_left_image);
        this.j = (ImageButton) findViewById(R.id.common_title_left_image2);
        this.k = (ImageButton) findViewById(R.id.common_title_right_image);
        Button button = (Button) findViewById(R.id.common_title_right_text);
        this.l = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: kr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.onRightOnClicked(view);
            }
        });
        this.k.setOnClickListener(new View.OnClickListener() { // from class: kr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.onRightOnClicked(view);
            }
        });
        this.m = (ImageButton) findViewById(R.id.common_title_right_text2);
        this.n = findViewById(R.id.common_title_right_red_dot);
        this.o = (ImageButton) findViewById(R.id.common_title_right_func);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: or
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: nr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: mr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j(view);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    public void onLeftClicked() {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public void onRightFuncClicked() {
    }

    public void onRightOnClicked(View view) {
    }

    public void onShareClicked(View view) {
    }

    public void setBaseTitleColor(int i) {
        this.f.setTextColor(i);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        View.inflate(this, i, this.a);
        k();
    }

    public void setContentViewBehindTitleBar(boolean z, boolean z2) {
        this.p = z;
        this.q = z;
        this.r = z2;
        k();
    }

    public void setImageResWithTint(ImageButton imageButton, @DrawableRes int i, @ColorInt int i2) {
        Drawable drawable = imageButton.getDrawable();
        if (i > 0) {
            drawable = ContextCompat.getDrawable(this, i);
        }
        imageButton.setImageDrawable(tintDrawable(drawable, i2));
    }

    public void setLeft2Visible(boolean z) {
        this.j.setVisibility(z ? 0 : 8);
    }

    public void setLeftImageRes(@DrawableRes int i, @ColorRes int i2) {
        this.i.setVisibility(0);
        setImageResWithTint(this.i, i, ContextCompat.getColor(this, i2));
    }

    public void setLeftImageRes2(@DrawableRes int i, @ColorRes int i2) {
        this.j.setVisibility(0);
        setImageResWithTint(this.j, i, ContextCompat.getColor(this, i2));
    }

    public void setLeftImageResWithTint(@ColorInt int i) {
        setImageResWithTint(this.i, 0, i);
        setImageResWithTint(this.j, 0, i);
    }

    public void setRight2ImageRes(@DrawableRes int i, @ColorRes int i2) {
        setRight2ImageResWithTint(i, ContextCompat.getColor(this, i2));
    }

    public void setRight2ImageResWithTint(@DrawableRes int i, @ColorInt int i2) {
        this.m.setVisibility(0);
        setImageResWithTint(this.m, i, i2);
    }

    public void setRightImageRes(@DrawableRes int i, @ColorRes int i2) {
        setRightImageResWithTint(i, ContextCompat.getColor(this, i2));
    }

    public void setRightImageResWithTint(@DrawableRes int i, @ColorInt int i2) {
        this.l.setVisibility(8);
        this.k.setVisibility(0);
        setImageResWithTint(this.k, i, i2);
    }

    public void setRightTitle(String str) {
        this.k.setVisibility(8);
        this.l.setVisibility(0);
        this.l.setText(str);
        f(this.l, str);
    }

    public void setStatusBarColor(@ColorInt int i) {
        Log.d(s, "setStatusbarcolor " + i);
        this.mTintManager.setStatusBarTintColor(i);
    }

    public void setStyle(STYLE style) {
        setStyle(style, 0);
    }

    public void setSubTitleText(int i) {
        this.g.setText(i);
    }

    public void setSystemBarMode(boolean z) {
        String str = s;
        Log.d(str, "setSystembarMode " + z);
        Log.d(str, "return " + this.mTintManager.chagenStatusBarMode(this, z));
    }

    public void setTintColor(int i) {
        Log.d(s, "setTintColor " + i);
        this.mTintManager.setStatusBarTintEnabled(true);
        this.mTintManager.setStatusBarTintColor(i);
    }

    public void setTitleBarBackgroundColor(int i) {
        this.d.setBackgroundColor(i);
    }

    public void setTitleBarVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
        this.r = z;
        k();
    }

    public void setTitleText(int i) {
        this.f.setText(i);
    }

    public void setTitleTextAlpha(float f) {
        this.f.setAlpha(f);
    }

    public void showRightFunc(boolean z) {
        this.o.setVisibility(z ? 0 : 8);
    }

    public void showRightRedDot(boolean z) {
        this.n.setVisibility(z ? 0 : 8);
    }

    public void updateTitleLayout() {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (g()) {
            layoutParams.width = (int) dp2px(this, 200.0f);
        } else {
            layoutParams.width = (int) dp2px(this, 240.0f);
        }
    }

    public void setBaseTitleColor(int i, int i2) {
        this.f.setTextColor(i);
        this.g.setTextColor(i2);
    }

    public void setStyle(STYLE style, int i) {
        setStyle(style, i, "");
    }

    public void setSubTitleText(String str) {
        this.g.setText(str);
    }

    public void setTitleText(String str) {
        this.f.setText(str);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 48;
        setContentView(view, layoutParams);
    }

    public void setStyle(STYLE style, String str) {
        setStyle(style, 0, str);
    }

    public int getTitleBarHeightDefault() {
        return getTitleBarHeightDefault(this);
    }

    public void setBaseTitleColor(int i, int i2, int i3) {
        this.f.setTextColor(i);
        this.h.setTextColor(i2);
        this.l.setTextColor(i3);
    }

    public void setStyle(STYLE style, int i, boolean z) {
        setStyle(style, i, "", z);
    }

    public void setStyle(STYLE style, int i, String str) {
        setStyle(style, i, str, "");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.a.addView(view, 0, (FrameLayout.LayoutParams) layoutParams);
        k();
    }

    public void setStyle(STYLE style, int i, String str, boolean z) {
        setStyle(style, i, str, "", z);
    }

    public void setBaseTitleColor(int i, int i2, int i3, int i4) {
        this.f.setTextColor(i);
        this.g.setTextColor(i2);
        this.h.setTextColor(i3);
        this.l.setTextColor(i4);
    }

    public void setStyle(STYLE style, int i, String str, String str2) {
        setStyle(style, i, str, str2, false);
    }

    public void setStyle(STYLE style, int i, String str, String str2, boolean z) {
        Log.d(s, "setStyle " + style + " title " + str + " darkMode " + z + " color " + i);
        STYLE style2 = STYLE.NONE;
        StatusBarUtil.setStatusColor(this, style == style2, z, i);
        if (style == STYLE.BACK_AND_TITLE) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(4);
            this.l.setVisibility(4);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(false, true);
            setTitleText(str);
            return;
        }
        if (style == STYLE.SINGLE_BACK) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(false, true);
            return;
        }
        if (style == STYLE.SINGLE_TITLE) {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(false, true);
            setTitleText(str);
            return;
        }
        if (style == STYLE.BACK_AND_TITLE_TRANSPARENT) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(4);
            this.l.setVisibility(4);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            setTitleBarBackgroundColor(i);
            setContentViewBehindTitleBar(true, true);
            setTitleText(str);
            return;
        }
        if (style == style2) {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.c.setBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(true, false);
            this.c.setVisibility(8);
            setTitleText("");
            return;
        }
        if (style == STYLE.TITLE_AND_EDIT) {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            if (z) {
                this.k.setImageResource(R.drawable.icon_edit_dark);
            } else {
                this.k.setImageResource(R.drawable.icon_edit);
            }
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(true, true);
            setTitleText(str);
            return;
        }
        if (style == STYLE.BACK_DOUBLE_TITLE) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            this.k.setVisibility(8);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            setTitleBarBackgroundColor(i);
            setContentViewBehindTitleBar(false, true);
            setTintColor(i);
            setTitleText(str);
            setSubTitleText(str2);
            return;
        }
        if (style == STYLE.BACK_DOUBLE_TITLE_SHARE) {
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
                this.k.setImageResource(R.drawable.icon_share_dark);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
                this.k.setImageResource(R.drawable.icon_share);
            }
            setTitleBarBackgroundColor(i);
            setContentViewBehindTitleBar(false, true);
            setTintColor(i);
            setTitleText(str);
            setSubTitleText(str2);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: lr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.onShareClicked(view);
                }
            });
            return;
        }
        if (style == STYLE.BACK_AND_SHARE) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
                this.k.setImageResource(R.drawable.icon_share_dark);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
                this.k.setImageResource(R.drawable.icon_share);
            }
            setTitleBarBackgroundColor(i);
            setContentViewBehindTitleBar(false, true);
            setTintColor(i);
            setTitleText(str);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: lr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.onShareClicked(view);
                }
            });
            return;
        }
        if (style == STYLE.CANCEL_AND_SAVE) {
            this.i.setVisibility(8);
            this.h.setVisibility(0);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            this.c.setVisibility(0);
            this.h.setBackgroundResource(R.drawable.text_rect_bg);
            this.h.setText(getString(R.string.cancel));
            this.l.setBackgroundResource(R.drawable.bg_rect_selector);
            Button button = this.l;
            int i2 = R.string.save;
            button.setText(getString(i2));
            f(this.l, getString(i2));
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(false, true);
            setTitleText(str);
            return;
        }
        if (style == STYLE.BACK_AND_TITLE_COMMIT) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            this.l.setBackgroundResource(R.drawable.bg_rect_selector);
            Button button2 = this.l;
            int i3 = R.string.commit;
            button2.setText(getString(i3));
            f(this.l, getString(i3));
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(false, true);
            setTitleText(str);
            return;
        }
        if (style == STYLE.BACK_AND_TITLE_EXCHANGE) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            this.k.setImageResource(R.drawable.icon_exchange);
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(false, true);
            setTitleText(str);
            return;
        }
        if (style == STYLE.EDIT_AND_TITLE_MSG) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            this.i.setImageResource(R.drawable.icon_edit);
            this.k.setImageResource(R.drawable.message_center);
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(true, true);
            setTitleText(str);
            return;
        }
        if (style == STYLE.BACK_AND_TITLE_CLEAR) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            this.l.setBackgroundResource(R.drawable.bg_rect_selector);
            this.l.setText(getString(R.string.clear));
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(false, true);
            setTitleText(str);
            return;
        }
        if (style == STYLE.BACK_DOUBLE_TITLE_DEVICE) {
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            this.k.setVisibility(0);
            this.l.setVisibility(8);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            this.k.setImageResource(R.drawable.icon_edit);
            setTitleBarBackgroundColor(i);
            setContentViewBehindTitleBar(true, true);
            setTintColor(i);
            setTitleText(str);
            setSubTitleText(str2);
            this.k.setOnClickListener(new a());
            return;
        }
        if (style == STYLE.BACK_AND_TITLE_FUNC) {
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.k.setVisibility(4);
            this.l.setVisibility(4);
            this.c.setVisibility(0);
            if (z) {
                this.i.setImageResource(R.drawable.arrow_back_black);
            } else {
                this.i.setImageResource(R.drawable.arrow_back);
            }
            setTitleBarBackgroundColor(i);
            this.mTintManager.setStatusBarTintEnabled(true);
            this.mTintManager.setStatusBarTintColor(i);
            setContentViewBehindTitleBar(false, true);
            setTitleText(str);
        }
    }
}
