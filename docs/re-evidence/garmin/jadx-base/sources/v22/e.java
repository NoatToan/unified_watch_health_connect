package v22;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.s0;
import androidx.core.view.x0;
import c22.q1;
import c22.r2;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import e23.l;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ta0.j;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v22/e$a", "Landroidx/core/view/a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, l7.f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.k(l7.f.a.f110568g);
            fVar.o(false);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v22/e$b", "Landroid/text/style/ClickableSpan;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f175343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f175344b;

        public b(e23.a<Unit> aVar, int i14) {
            this.f175343a = aVar;
            this.f175344b = i14;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            view2.getClass();
            this.f175343a.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.getClass();
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f175344b);
        }
    }

    public static final void a(View view2) {
        view2.getClass();
        view2.performAccessibilityAction(64, null);
        view2.sendAccessibilityEvent(4);
    }

    public static final void b(View view2) {
        view2.getClass();
        Object systemService = view2.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
    }

    public static final void c(View view2, ViewGroup viewGroup) {
        if (view2 != null) {
            Object systemService = view2.getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
        }
    }

    public static final boolean d(View view2) {
        view2.getClass();
        return view2.getVisibility() == 0;
    }

    public static final void e(View view2, String str, String str2) {
        view2.getClass();
        str.getClass();
        s0.r(view2, new a());
        view2.setContentDescription(str + ". " + str2);
    }

    public static final void f(View view2, String str) {
        view2.getClass();
        String string = view2.getContext().getString(R.string.lbl_double_tap_to_dismiss);
        string.getClass();
        e(view2, str, string);
    }

    public static final void g(int i14, View view2) {
        view2.getClass();
        view2.setBackgroundColor(a7.b.getColor(view2.getContext(), i14));
    }

    public static final void h(ImageView imageView, int i14) {
        Drawable background;
        imageView.getClass();
        if (i14 == -1 || (background = imageView.getBackground()) == null) {
            return;
        }
        int color = a7.b.getColor(imageView.getContext(), i14);
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(color);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(color);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(color);
        }
    }

    public static final void i(View view2, boolean z14) {
        view2.getClass();
        view2.setEnabled(z14);
        if (view2 instanceof ViewGroup) {
            Iterator<View> it = new x0((ViewGroup) view2).iterator();
            while (it.hasNext()) {
                i(it.next(), z14);
            }
        }
    }

    public static final void j(View view2) {
        view2.getClass();
        view2.setVisibility(8);
    }

    public static final void k(ImageView imageView, Drawable drawable) {
        imageView.getClass();
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
    }

    public static final void l(View view2) {
        view2.getClass();
        view2.setVisibility(4);
    }

    public static final void m(TextView textView, String str, String str2) {
        if (textView != null) {
            Context context = textView.getContext();
            context.getClass();
            textView.setText(new q1(str, str, str2, context, R.color.gcm_text_primary_action_selector));
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void n(View view2, l lVar) {
        view2.getClass();
        view2.setOnClickListener(new r2(1000, new j(lVar, 16)));
    }

    public static final void o(TextView textView, CharSequence charSequence) {
        textView.getClass();
        if (charSequence == null || w.J(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }

    public static final void p(TextView textView, String str, String str2, int i14, e23.a<Unit> aVar) {
        textView.getClass();
        int iH = w.H(str, str2, 0, false, 6);
        if (str.length() == 0 || str2.length() == 0 || iH == -1) {
            return;
        }
        b bVar = new b(aVar, i14);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(bVar, iH, str2.length() + iH, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static final void q(View view2) {
        view2.getClass();
        view2.setVisibility(0);
    }

    public static final void r(View view2, boolean z14) {
        view2.getClass();
        view2.setVisibility(z14 ? 0 : 8);
    }

    public static final void s(View view2, boolean z14) {
        view2.getClass();
        view2.setVisibility(z14 ? 0 : 4);
    }

    public static final void t(View view2) {
        view2.getClass();
        Context context = view2.getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view2, 1);
        }
    }

    public static void u(int i14, View view2) {
        view2.setPaddingRelative(view2.getPaddingStart(), i14, view2.getPaddingEnd(), view2.getPaddingBottom());
    }

    public static final void v(View view2, boolean z14) {
        view2.getClass();
        if (z14) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
    }
}
