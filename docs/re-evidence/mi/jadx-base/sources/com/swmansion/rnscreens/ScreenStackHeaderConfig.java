package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import defpackage.hdj;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ScreenStackHeaderConfig extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<ScreenStackHeaderSubview> f10675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10676b;
    public int c;
    public String d;
    public float e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10677k;
    public final Toolbar l;
    public boolean m;
    public View.OnClickListener n;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ScreenStackHeaderConfig.this.getScreenStack().t(ScreenStackHeaderConfig.this.getScreenFragment());
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10679a;

        static {
            int[] iArr = new int[ScreenStackHeaderSubview.Type.values().length];
            f10679a = iArr;
            try {
                iArr[ScreenStackHeaderSubview.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10679a[ScreenStackHeaderSubview.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10679a[ScreenStackHeaderSubview.Type.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10679a[ScreenStackHeaderSubview.Type.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ScreenStackHeaderConfig(Context context) {
        super(context);
        this.f10675a = new ArrayList<>(3);
        this.h = true;
        this.m = false;
        this.n = new a();
        setVisibility(8);
        Toolbar toolbar = new Toolbar(context);
        this.l = toolbar;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            toolbar.setBackgroundColor(typedValue.data);
        }
    }

    private Screen getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof Screen) {
            return (Screen) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ScreenStackFragment getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof Screen)) {
            return null;
        }
        Fragment fragment = ((Screen) parent).getFragment();
        if (fragment instanceof ScreenStackFragment) {
            return (ScreenStackFragment) fragment;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ScreenStack getScreenStack() {
        Screen screen = getScreen();
        if (screen == null) {
            return null;
        }
        ScreenContainer container = screen.getContainer();
        if (container instanceof ScreenStack) {
            return (ScreenStack) container;
        }
        return null;
    }

    private TextView getTitleTextView() {
        int childCount = this.l.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.l.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (textView.getText().equals(this.l.getTitle())) {
                    return textView;
                }
            }
        }
        return null;
    }

    public void c(ScreenStackHeaderSubview screenStackHeaderSubview, int i) {
        this.f10675a.add(i, screenStackHeaderSubview);
        f();
    }

    public ScreenStackHeaderSubview d(int i) {
        return this.f10675a.get(i);
    }

    public boolean e() {
        return this.h;
    }

    public final void f() {
        if (getParent() != null) {
            g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void g() {
        Drawable navigationIcon;
        Screen screen = (Screen) getParent();
        ScreenStack screenStack = getScreenStack();
        boolean z = screenStack == null || screenStack.getRootScreen() == screen;
        boolean z2 = screenStack == null || screenStack.getTopScreen() == screen;
        if (this.m && z2) {
            if (this.g) {
                if (this.l.getParent() != null) {
                    getScreenFragment().v();
                    return;
                }
                return;
            }
            if (this.l.getParent() == null) {
                getScreenFragment().w(this.l);
            }
            AppCompatActivity appCompatActivity = (AppCompatActivity) getScreenFragment().getActivity();
            appCompatActivity.setSupportActionBar(this.l);
            ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
            supportActionBar.setDisplayHomeAsUpEnabled((z || this.i) ? false : true);
            this.l.setNavigationOnClickListener(this.n);
            getScreenFragment().x(this.j);
            supportActionBar.setTitle(this.f10676b);
            TextView titleTextView = getTitleTextView();
            int i = this.c;
            if (i != 0) {
                this.l.setTitleTextColor(i);
            }
            if (titleTextView != null) {
                if (this.d != null) {
                    titleTextView.setTypeface(hdj.b().d(this.d, 0, getContext().getAssets()));
                }
                float f = this.e;
                if (f > 0.0f) {
                    titleTextView.setTextSize(f);
                }
            }
            int i2 = this.f;
            if (i2 != 0) {
                this.l.setBackgroundColor(i2);
            }
            if (this.f10677k != 0 && (navigationIcon = this.l.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(this.f10677k, PorterDuff.Mode.SRC_ATOP);
            }
            for (int childCount = this.l.getChildCount() - 1; childCount >= 0; childCount--) {
                if (this.l.getChildAt(childCount) instanceof ScreenStackHeaderSubview) {
                    this.l.removeViewAt(childCount);
                }
            }
            int size = this.f10675a.size();
            for (int i3 = 0; i3 < size; i3++) {
                ScreenStackHeaderSubview screenStackHeaderSubview = this.f10675a.get(i3);
                ScreenStackHeaderSubview.Type type = screenStackHeaderSubview.getType();
                Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -1);
                int i4 = b.f10679a[type.ordinal()];
                if (i4 == 1) {
                    this.l.setNavigationIcon((Drawable) null);
                    this.l.setTitle((CharSequence) null);
                    layoutParams.f1402a = 3;
                } else if (i4 != 2) {
                    if (i4 == 3) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                        this.l.setTitle((CharSequence) null);
                    } else if (i4 != 4) {
                    }
                    layoutParams.f1402a = 1;
                } else {
                    layoutParams.f1402a = 5;
                }
                screenStackHeaderSubview.setLayoutParams(layoutParams);
                this.l.addView(screenStackHeaderSubview);
            }
        }
    }

    public int getConfigSubviewsCount() {
        return this.f10675a.size();
    }

    public void h(int i) {
        this.f10675a.remove(i);
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f = i;
    }

    public void setGestureEnabled(boolean z) {
        this.h = z;
    }

    public void setHidden(boolean z) {
        this.g = z;
    }

    public void setHideBackButton(boolean z) {
        this.i = z;
    }

    public void setHideShadow(boolean z) {
        this.j = z;
    }

    public void setTintColor(int i) {
        this.f10677k = i;
    }

    public void setTitle(String str) {
        this.f10676b = str;
    }

    public void setTitleColor(int i) {
        this.c = i;
    }

    public void setTitleFontFamily(String str) {
        this.d = str;
    }

    public void setTitleFontSize(float f) {
        this.e = f;
    }
}
