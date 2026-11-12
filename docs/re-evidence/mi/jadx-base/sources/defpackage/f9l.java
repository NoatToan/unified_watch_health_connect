package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.xiaomi.fitness.baseui.extension.ViewGroupExtendKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.nfc.widget.SafeKeyboardView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class f9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f17567a;

    public class a implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17568a;

        public a(boolean z) {
            this.f17568a = z;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            Logger.d("KEYBOARD", "onFocusChange" + z);
            w8q.d(view.getContext(), view, false);
            if (!z) {
                f9l.r(view);
                f9l.k(view);
            } else {
                f9l.o(view);
                f9l.f(view, this.f17568a);
                f9l.q(view);
            }
        }
    }

    public class b implements View.OnKeyListener {
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SafeKeyboardView safeKeyboardViewH;
            if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || (safeKeyboardViewH = f9l.h(view)) == null || !safeKeyboardViewH.q() || !f9l.m(view)) {
                return false;
            }
            f9l.k(view);
            return true;
        }
    }

    public class c implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            f9l.q(view);
            return false;
        }
    }

    public class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f17569a;

        public d(boolean z) {
            this.f17569a = z;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            View viewFindFocus = view.getRootView().findFocus();
            f9l.f(view, this.f17569a);
            if (viewFindFocus != null) {
                viewFindFocus.requestFocus();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            SafeKeyboardView safeKeyboardViewH = f9l.h(view);
            if (safeKeyboardViewH != null) {
                safeKeyboardViewH.l();
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewGroup f17570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup.MarginLayoutParams f17571b;
        public ViewGroup.MarginLayoutParams c;

        public e(Context context, int i) {
            if ((i & 240) == 48) {
                this.f17570a = new FrameLayout(context);
                this.f17571b = new FrameLayout.LayoutParams(-1, -2, 80);
                this.c = new FrameLayout.LayoutParams(-1, -2);
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                this.f17570a = linearLayout;
                linearLayout.setOrientation(1);
                this.f17571b = new LinearLayout.LayoutParams(-1, -2);
                this.c = new LinearLayout.LayoutParams(-1, -2, 1.0f);
            }
        }

        public final void a(View view) {
            ViewGroup viewGroup = (ViewGroup) view.getRootView().findViewById(R.id.content);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
            viewGroup.removeAllViews();
            viewGroup.setId(-1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            int i2 = marginLayoutParams.leftMargin;
            int i3 = marginLayoutParams.rightMargin;
            int i4 = marginLayoutParams.topMargin;
            int i5 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMargins(0, 0, 0, 0);
            ViewGroupExtendKt.setMarginRelative(this.c, i2, i4, i3, i5);
            viewGroup.addView(this.f17570a);
            int paddingLeft = viewGroup.getPaddingLeft();
            int paddingRight = viewGroup.getPaddingRight();
            int paddingTop = viewGroup.getPaddingTop();
            int paddingBottom = viewGroup.getPaddingBottom();
            viewGroup.setPadding(0, 0, 0, 0);
            Drawable background = viewGroup.getBackground();
            viewGroup.setBackground(new ColorDrawable(0));
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                frameLayout.addView((View) it.next());
            }
            frameLayout.setId(R.id.content);
            frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            frameLayout.setBackground(background);
            this.f17570a.addView(frameLayout, 0, this.c);
        }

        public final void b(View view) {
            this.f17570a.addView((SafeKeyboardView) LayoutInflater.from(view.getContext()).inflate(sui.B0, (ViewGroup) null), this.f17571b);
        }

        public void c(View view) {
            b(view);
            a(view);
        }
    }

    public interface f {
        void onKeyboardVisibilityChanged(boolean z);
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17572a;
    }

    public static void f(View view, boolean z) {
        SafeKeyboardView safeKeyboardViewH = h(view);
        if (safeKeyboardViewH == null) {
            l(view);
            safeKeyboardViewH = h(view);
        }
        safeKeyboardViewH.setNeedReorder(z);
        safeKeyboardViewH.k(view);
    }

    public static void g(Object obj) {
        if (obj == f17567a) {
            f17567a = null;
        }
    }

    public static SafeKeyboardView h(View view) {
        return (SafeKeyboardView) view.getRootView().findViewById(mri.s2);
    }

    public static Activity i(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static int j(Activity activity) {
        return activity.getWindow().getAttributes().softInputMode;
    }

    public static void k(View view) {
        SafeKeyboardView safeKeyboardViewH = h(view);
        if (safeKeyboardViewH == null || safeKeyboardViewH.getVisibility() != 0) {
            return;
        }
        safeKeyboardViewH.n();
    }

    public static void l(View view) {
        Context context = view.getContext();
        Activity activityI = i(context);
        new e(context, activityI != null ? j(activityI) : 0).c(view);
    }

    public static boolean m(View view) {
        View viewFindViewById = view.getRootView().findViewById(mri.s2);
        return viewFindViewById != null && viewFindViewById.getVisibility() == 0;
    }

    public static void n(boolean z) {
        vqg.b("onKeyboardVisibilityChanged  visible:" + z + "  mKeyboardVisibilityListener:" + f17567a);
        if (f17567a != null) {
            vqg.b("onKeyboardVisibilityChanged  mKeyboardVisibilityListener:" + f17567a.getClass().getSimpleName());
            f17567a.onKeyboardVisibilityChanged(z);
        }
    }

    public static void o(View view) {
        Activity activityI = i(view.getContext());
        if (activityI != null) {
            activityI.getWindow().setSoftInputMode(3);
        }
    }

    public static void p(View view, boolean z) {
        view.setOnFocusChangeListener(new a(z));
        view.setOnKeyListener(new b());
        view.setOnTouchListener(new c());
        view.addOnAttachStateChangeListener(new d(z));
    }

    public static void q(View view) {
        SafeKeyboardView safeKeyboardViewH = h(view);
        if (safeKeyboardViewH.p(view) && safeKeyboardViewH.isShown()) {
            return;
        }
        safeKeyboardViewH.r(view);
    }

    public static void r(View view) {
        g gVar;
        SafeKeyboardView safeKeyboardViewH = h(view);
        if (safeKeyboardViewH == null || (gVar = (g) safeKeyboardViewH.getTag()) == null) {
            return;
        }
        Activity activityI = i(view.getContext());
        if (activityI != null) {
            activityI.getWindow().setSoftInputMode(gVar.f17572a);
        }
        safeKeyboardViewH.setTag(null);
    }

    public static void s(f fVar) {
        f17567a = fVar;
        vqg.b("setKeyboardVisibilityListener " + fVar + " " + f17567a);
    }
}
