package com.huami.components.title;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.AnyRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huami.tools.systembartint.SystemBarTintManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseTitleActivity extends FragmentActivity {
    private ViewGroup a;
    private ViewGroup b;
    private ViewGroup c;
    private LinearLayout d;
    private ImageButton e;
    private TextView f;
    private SystemBarTintManager g;
    private StyleOptions h;

    public static class ImageButtonBuilder {

        @DrawableRes
        public int a;
        public View.OnClickListener b;

        public ImageButtonBuilder setIcon(@DrawableRes int i) {
            this.a = i;
            return this;
        }

        public ImageButtonBuilder setOnClickListener(View.OnClickListener onClickListener) {
            this.b = onClickListener;
            return this;
        }
    }

    public static class StyleOptions {
        private boolean a = true;
        private boolean b = true;
        private boolean c = true;
        private boolean d = false;
        private boolean e = true;
        private boolean f = true;
        private boolean g = true;

        @ColorInt
        private Integer h;

        @ColorInt
        private Integer i;

        @ColorInt
        private Integer j;
        private String k;
        private List<ImageButtonBuilder> l;

        public static StyleOptions noTitleBar() {
            return new StyleOptions().showTitleBar(false);
        }

        public static StyleOptions onlyTitleWithBg() {
            return titleBarWithBg().showBackButton(false);
        }

        public static StyleOptions titleBarWithBg() {
            return new StyleOptions().showTitleBar(true).showTitle(true).showBackButton(true);
        }

        public StyleOptions addEndButton(ImageButtonBuilder imageButtonBuilder) {
            if (this.l == null) {
                this.l = new ArrayList();
            }
            this.l.add(imageButtonBuilder);
            return this;
        }

        public StyleOptions enablePhysicBackButton(boolean z) {
            this.g = z;
            return this;
        }

        public StyleOptions setBackButtonDark(boolean z) {
            this.f = z;
            return this;
        }

        public StyleOptions setContentBehindTitleBar(boolean z) {
            this.d = z;
            return this;
        }

        public StyleOptions setStatusBarColor(@ColorInt int i) {
            this.j = Integer.valueOf(i);
            return this;
        }

        public StyleOptions setStatusBarColorIsLight(boolean z) {
            this.e = z;
            return this;
        }

        public StyleOptions setTitle(String str) {
            this.k = str;
            return this;
        }

        public StyleOptions setTitleBarBgColor(@ColorInt int i) {
            this.i = Integer.valueOf(i);
            return this;
        }

        public StyleOptions setTitleTextColor(@ColorInt int i) {
            this.h = Integer.valueOf(i);
            return this;
        }

        public StyleOptions showBackButton(boolean z) {
            this.c = z;
            return this;
        }

        public StyleOptions showTitle(boolean z) {
            this.b = z;
            return this;
        }

        public StyleOptions showTitleBar(boolean z) {
            this.a = z;
            return this;
        }
    }

    private int d(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        finish();
    }

    @AnyRes
    private int f(@AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    private void findViews() {
        this.a = (ViewGroup) findViewById(R.id.root);
        this.b = (ViewGroup) findViewById(R.id.title_bar);
        this.c = (ViewGroup) findViewById(R.id.content);
        this.e = (ImageButton) findViewById(R.id.back_button);
        this.f = (TextView) findViewById(R.id.title_text);
        this.d = (LinearLayout) findViewById(R.id.end_buttons);
    }

    private void g(boolean z) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
        if (z) {
            layoutParams.addRule(3, 0);
        } else {
            layoutParams.addRule(3, this.b.getId());
        }
        this.c.setLayoutParams(layoutParams);
        if (this.g.isStatusBarAvailable()) {
            this.g.setStatusBarTintEnabled(!z);
            this.a.setFitsSystemWindows(!z);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.b.getLayoutParams();
            layoutParams2.topMargin = z ? this.g.getConfig().getStatusBarHeight() : 0;
            this.b.setLayoutParams(layoutParams2);
        }
    }

    private void initViews() {
        SystemBarTintManager.enableTransparentStatusBar(this);
        this.g = new SystemBarTintManager(this);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: jr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e(view);
            }
        });
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.c.addView(view, layoutParams);
    }

    public void applyStyleOptions(StyleOptions styleOptions) {
        if (styleOptions == null) {
            return;
        }
        this.h = styleOptions;
        this.b.setVisibility(styleOptions.a ? 0 : 8);
        this.f.setVisibility(styleOptions.b ? 0 : 8);
        setTitle(!TextUtils.isEmpty(styleOptions.k) ? styleOptions.k : this.f.getText());
        this.e.setVisibility(styleOptions.c ? 0 : 8);
        g(styleOptions.d);
        this.e.setImageResource(styleOptions.f ? R.drawable.ic_back : R.drawable.ic_back_white);
        if (styleOptions.h != null) {
            this.f.setTextColor(styleOptions.h.intValue());
        }
        this.b.setBackgroundColor(styleOptions.i == null ? ContextCompat.getColor(this, R.color.pale_grey) : styleOptions.i.intValue());
        this.g.setStatusBarTintColor(styleOptions.j == null ? ContextCompat.getColor(this, R.color.pale_grey) : styleOptions.j.intValue());
        SystemBarTintManager.changeStatusBarMode(this, styleOptions.e);
        if (styleOptions.l != null) {
            for (ImageButtonBuilder imageButtonBuilder : styleOptions.l) {
                ImageButton imageButton = new ImageButton(this);
                imageButton.setImageResource(imageButtonBuilder.a);
                imageButton.setOnClickListener(imageButtonBuilder.b);
                imageButton.setLayoutParams(new LinearLayout.LayoutParams(d(48.0f), -1));
                imageButton.setBackgroundResource(f(R.attr.clickableItemBackground));
                this.d.addView(imageButton);
            }
        }
    }

    public ImageButton getBackButton() {
        return this.e;
    }

    @IdRes
    public int getContentViewId() {
        return this.c.getId();
    }

    public LinearLayout getEndButtons() {
        return this.d;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        StyleOptions styleOptions = this.h;
        if (styleOptions == null || styleOptions.g) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        super.setContentView(R.layout.activity_common);
        findViews();
        initViews();
        applyStyleOptions(StyleOptions.titleBarWithBg());
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        this.c.removeAllViews();
        this.c.addView(view);
    }

    @Override // android.app.Activity
    public void setTitle(@StringRes int i) {
        super.setTitle(i);
        this.f.setText(i);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        this.c.removeAllViews();
        View.inflate(this, i, this.c);
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f.setText(charSequence);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.c.removeAllViews();
        this.c.addView(view, layoutParams);
    }
}
