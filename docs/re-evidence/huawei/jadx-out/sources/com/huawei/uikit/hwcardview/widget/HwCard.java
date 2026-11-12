package com.huawei.uikit.hwcardview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.uikit.hwcardview.R;

/* JADX INFO: loaded from: classes44.dex */
public class HwCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewStub f29304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LayoutInflater f29305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f29306c;
    private Context d;
    private ViewStub e;
    private View f;
    private boolean g;
    private View h;
    private View i;
    private ViewStub j;
    private float l;
    private float m;

    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private LayoutInflater f29309c;
        private Context e;
        private Template h;
        private OnCardClickListener k;
        private CharSequence l;
        private int m;
        private boolean n;
        private CharSequence p;
        private CharSequence q;
        private OnCardClickListener r;
        private CharSequence s;
        private OnCardClickListener t;
        private OnCardClickListener u;
        private OnCardClickListener v;
        private int d = 4098;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f29307a = 8193;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f29308b = 0;
        private int f = 0;
        private int g = 0;
        private float i = 44.0f;
        private float j = 426.0f;
        private boolean o = true;

        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Builder.this.k.onClick();
            }
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Builder.this.t.onClick();
            }
        }

        class d implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppCompatImageView f29311b;

            d(AppCompatImageView appCompatImageView) {
                this.f29311b = appCompatImageView;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AppCompatImageView appCompatImageView = this.f29311b;
                if (appCompatImageView != null) {
                    appCompatImageView.performClick();
                }
            }
        }

        class e implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ TextView f29312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TextView f29313b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TextView f29314c;

            e(TextView textView, TextView textView2, TextView textView3) {
                this.f29314c = textView;
                this.f29312a = textView2;
                this.f29313b = textView3;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == this.f29314c) {
                    if (Builder.this.r != null) {
                        Builder.this.r.onClick();
                    }
                } else if (view == this.f29312a) {
                    if (Builder.this.u != null) {
                        Builder.this.u.onClick();
                    }
                } else if (view != this.f29313b) {
                    Log.e("HwCard", "invalid view");
                } else if (Builder.this.v != null) {
                    Builder.this.v.onClick();
                }
            }
        }

        public Builder(Context context) {
            this.e = context;
            this.f29309c = LayoutInflater.from(context);
            f();
        }

        private View a() {
            return null;
        }

        private View d() {
            return null;
        }

        private void f() {
            this.f29308b = c(this.d);
            this.f = e(this.f29307a);
        }

        private boolean g() {
            return (TextUtils.isEmpty(this.p) && TextUtils.isEmpty(this.q) && TextUtils.isEmpty(this.s)) && (this.r == null && this.u == null && this.v == null);
        }

        private View i() {
            int iC = c(4099);
            if (iC == 0) {
                return null;
            }
            View viewInflate = this.f29309c.inflate(iC, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.hwcardview_title);
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.hwcardview_icon);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewInflate.findViewById(R.id.hwcardview_action_more);
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) viewInflate.findViewById(R.id.hwcardview_action_info);
            textView.setText(this.l);
            e(appCompatImageView, appCompatImageView2);
            if (this.t != null) {
                appCompatImageView3.setOnClickListener(new c());
            }
            if (this.n) {
                b(viewInflate);
            }
            return viewInflate;
        }

        public void e(Template template) {
            this.h = template;
        }

        private View b() {
            View viewInflate = this.f29309c.inflate(R.layout.hwcardview_header_no_button, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.hwcardview_title);
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.hwcardview_icon);
            textView.setText(this.l);
            int i = this.m;
            if (i != 0) {
                appCompatImageView.setImageResource(i);
            }
            if (this.n) {
                b(viewInflate);
                e(viewInflate);
            }
            return viewInflate;
        }

        private void b(HwCard hwCard) {
            View viewI;
            if (this.f29308b == 0 || hwCard == null) {
                Log.w("HwCard", "mHeaderLayout == 0 or hwcardview_activity is null");
                return;
            }
            if (c(4097) == this.f29308b) {
                viewI = b();
            } else if (c(4098) == this.f29308b) {
                viewI = j();
            } else {
                viewI = c(4099) == this.f29308b ? i() : a();
            }
            if (viewI != null) {
                hwCard.c(viewI);
            }
        }

        private int c(int i) {
            if (i == 4096) {
                return 0;
            }
            if (i == 4097) {
                return R.layout.hwcardview_header_no_button;
            }
            if (i == 4098) {
                return R.layout.hwcardview_header_with_one_button;
            }
            if (i == 4099) {
                return R.layout.hwcardview_header_with_two_button;
            }
            Log.e("HwCard", "invalid type");
            return 0;
        }

        private void d(HwCard hwCard) {
            if (this.f == 0 || hwCard == null) {
                Log.w("HwCard", "mFooterLayout == 0 or hwcardview_activity is null");
                return;
            }
            View viewC = e(8193) == this.f ? c() : d();
            if (viewC != null) {
                hwCard.e(viewC);
            }
        }

        private View j() {
            int iC = c(4098);
            if (iC == 0) {
                return null;
            }
            View viewInflate = this.f29309c.inflate(iC, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.hwcardview_title);
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.hwcardview_icon);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewInflate.findViewById(R.id.hwcardview_action_more);
            textView.setText(this.l);
            e(appCompatImageView, appCompatImageView2);
            if (this.n) {
                b(viewInflate);
            }
            return viewInflate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public LayoutInflater e() {
            return this.f29309c;
        }

        private int e(int i) {
            if (i == 8192) {
                return 0;
            }
            if (i == 8193) {
                return R.layout.hwcardview_footer_three_button;
            }
            Log.e("HwCard", "invalid type");
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public HwCard b(boolean z) {
            HwCard hwCard = new HwCard(this.e, null);
            b(hwCard);
            d(hwCard);
            hwCard.c(this.i);
            hwCard.d(this.j);
            if (z) {
                Template template = this.h;
                if (template != null) {
                    hwCard.a(template.makeContentView());
                }
            } else {
                c(hwCard);
            }
            a(hwCard);
            return hwCard;
        }

        private void c(HwCard hwCard) {
            int i = this.g;
            if (i != 0 && hwCard != null) {
                View viewInflate = this.f29309c.inflate(i, (ViewGroup) null);
                if (viewInflate != null) {
                    hwCard.a(viewInflate);
                    return;
                }
                return;
            }
            Log.w("HwCard", "mContentLayout == 0 or hwcardview_activity is null");
        }

        private View c() {
            int iE;
            if (g() || (iE = e(8193)) == 0) {
                return null;
            }
            View viewInflate = this.f29309c.inflate(iE, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.hwcardview_btn_positive);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.hwcardview_btn_negative);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.hwcardview_btn_neutral);
            e eVar = new e(textView, textView2, textView3);
            b(textView, eVar);
            a(textView3, eVar);
            d(textView2, eVar);
            return viewInflate;
        }

        private void b(View view) {
            view.setOnClickListener(new d((AppCompatImageView) view.findViewById(R.id.hwcardview_action_expand)));
        }

        private void a(TextView textView, View.OnClickListener onClickListener) {
            if (textView == null) {
                return;
            }
            CharSequence charSequence = this.s;
            if (charSequence != null || this.v != null) {
                textView.setText(charSequence);
                textView.setOnClickListener(onClickListener);
                textView.setVisibility(0);
            }
            if (this.q == null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(0);
                    textView.setLayoutParams(marginLayoutParams);
                }
            }
        }

        private void a(HwCard hwCard) {
            if (this.n) {
                hwCard.d(this.o);
            }
        }

        private void e(AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
            int i = this.m;
            if (i != 0) {
                appCompatImageView.setImageResource(i);
            }
            if (this.k != null) {
                appCompatImageView2.setOnClickListener(new b());
            }
        }

        private void e(View view) {
            view.setPaddingRelative(view.getPaddingStart(), 0, this.e.getResources().getDimensionPixelSize(R.dimen.hwcardview_padding_m), 0);
        }

        private void d(TextView textView, View.OnClickListener onClickListener) {
            if (textView == null) {
                return;
            }
            CharSequence charSequence = this.q;
            if (charSequence == null && this.r == null) {
                return;
            }
            textView.setText(charSequence);
            textView.setOnClickListener(onClickListener);
            textView.setVisibility(0);
        }

        private void b(TextView textView, View.OnClickListener onClickListener) {
            if (textView == null) {
                return;
            }
            CharSequence charSequence = this.p;
            if (charSequence != null || this.r != null) {
                textView.setText(charSequence);
                textView.setOnClickListener(onClickListener);
                textView.setVisibility(0);
            }
            if (this.s == null && this.q == null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(0);
                    textView.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public interface OnCardClickListener {
        void onClick();
    }

    public static abstract class Template {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Builder f29315a;

        public Template(Builder builder) {
            a(builder);
        }

        private void a(Builder builder) {
            if (builder == null || this.f29315a == builder) {
                return;
            }
            this.f29315a = builder;
            builder.e(this);
        }

        public HwCard build() {
            Builder builder = this.f29315a;
            if (builder != null) {
                return builder.b(true);
            }
            return null;
        }

        public LayoutInflater getLayoutInflater() {
            Builder builder = this.f29315a;
            if (builder != null) {
                return builder.e();
            }
            Log.w("HwCard", "mBuilder is null");
            return null;
        }

        public abstract View makeContentView();
    }

    class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppCompatImageView f29317b;
        final /* synthetic */ int e;

        c(int i, int i2, AppCompatImageView appCompatImageView) {
            this.e = i;
            this.f29316a = i2;
            this.f29317b = appCompatImageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HwCard hwCard = HwCard.this;
            hwCard.g = !hwCard.g;
            int i = HwCard.this.g ? this.e : this.f29316a;
            if (i != 0) {
                this.f29317b.setImageResource(i);
            }
            int i2 = HwCard.this.g ? 0 : 8;
            if (HwCard.this.h != null) {
                HwCard.this.h.setVisibility(i2);
            }
            if (HwCard.this.i != null) {
                HwCard.this.i.setVisibility(i2);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29319a;

        d(int i) {
            this.f29319a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup.LayoutParams layoutParams = HwCard.this.h.getLayoutParams();
            int measuredHeight = HwCard.this.h.getMeasuredHeight();
            int i = this.f29319a;
            if (measuredHeight > i) {
                layoutParams.height = i;
            }
            if (HwCard.this.h.getVisibility() == 4) {
                HwCard.this.h.setVisibility(8);
            }
            HwCard.this.h.setLayoutParams(layoutParams);
            HwCard.this.h.requestLayout();
        }
    }

    /* synthetic */ HwCard(Context context, d dVar) {
        this(context);
    }

    protected void a(View view) {
        if (this.h != null) {
            Log.w("HwCard", "mContentView already exists");
        } else if (view != null) {
            this.h = view;
            d(view, this.e);
            c();
            a();
        }
    }

    protected void c(View view) {
        if (this.f != null) {
            Log.w("HwCard", "mHeaderView already exists");
        } else if (view != null) {
            d(view, this.f29304a);
            this.f = view;
        }
    }

    protected void e(View view) {
        if (this.i != null) {
            Log.w("HwCard", "mFooterView already exists");
        } else if (view != null) {
            d(view, this.j);
            this.i = view;
        }
    }

    private HwCard(Context context) {
        this.m = 44.0f;
        this.l = 426.0f;
        this.d = context;
        this.f29305b = LayoutInflater.from(context);
        d();
    }

    private void d() {
        int i = R.layout.hwcardview_layout_stubs;
        if (i != 0) {
            View viewInflate = this.f29305b.inflate(i, (ViewGroup) null);
            if (viewInflate instanceof ViewGroup) {
                this.f29306c = (ViewGroup) viewInflate;
            }
            this.f29304a = (ViewStub) viewInflate.findViewById(R.id.hwcardview_header_stub);
            this.e = (ViewStub) viewInflate.findViewById(R.id.hwcardview_content_stub);
            this.j = (ViewStub) viewInflate.findViewById(R.id.hwcardview_footer_stub);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(float f) {
        this.m = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(float f) {
        this.l = f;
    }

    private void a() {
        float f = this.m;
        if (f >= 0.0f) {
            this.h.setMinimumHeight((int) TypedValue.applyDimension(1, f, this.d.getResources().getDisplayMetrics()));
        }
        float f2 = this.l;
        if (f2 >= 0.0f) {
            this.h.post(new d((int) TypedValue.applyDimension(1, f2, this.d.getResources().getDisplayMetrics())));
        }
    }

    private void c() {
        View view = this.h;
        if (view != null && this.f == null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            marginLayoutParams.topMargin = this.d.getResources().getDimensionPixelSize(R.dimen.hwcardview_margin_l);
            this.h.setLayoutParams(marginLayoutParams);
        }
        View view2 = this.h;
        if (view2 != null && this.i == null && (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            marginLayoutParams2.bottomMargin = this.d.getResources().getDimensionPixelSize(R.dimen.hwcardview_margin_l);
            this.h.setLayoutParams(marginLayoutParams2);
        }
    }

    private void d(View view, ViewStub viewStub) {
        ViewGroup viewGroup = this.f29306c;
        if (viewGroup == null) {
            Log.w("HwCard", "mCardLayout is null");
            return;
        }
        int iIndexOfChild = viewGroup.indexOfChild(viewStub);
        this.f29306c.removeViewInLayout(viewStub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        if (layoutParams != null) {
            this.f29306c.addView(view, iIndexOfChild, layoutParams);
        } else {
            this.f29306c.addView(view, iIndexOfChild);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        AppCompatImageView appCompatImageView;
        int i;
        this.g = z;
        View view = this.f;
        if (view == null || (appCompatImageView = (AppCompatImageView) view.findViewById(R.id.hwcardview_action_expand)) == null) {
            return;
        }
        appCompatImageView.setVisibility(0);
        View view2 = this.h;
        if (view2 != null) {
            if (z) {
                i = 0;
            } else {
                i = this.l < 0.0f ? 8 : 4;
            }
            view2.setVisibility(i);
        }
        View view3 = this.i;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        int i2 = R.drawable.hwcardview_ic_public_arrow_down;
        int i3 = R.drawable.hwcardview_ic_public_arrow_up;
        appCompatImageView.setImageResource(z ? i2 : i3);
        appCompatImageView.setOnClickListener(new c(i2, i3, appCompatImageView));
    }
}
