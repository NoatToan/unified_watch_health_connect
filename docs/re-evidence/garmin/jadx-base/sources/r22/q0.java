package r22;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.GCMSnackbarContentLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lr22/q0;", "Lcom/google/android/material/snackbar/BaseTransientBottomBar;", "Landroid/view/ViewGroup;", "parent", "Lcom/garmin/android/apps/connectmobile/view/GCMSnackbarContentLayout;", FirebaseAnalytics.Param.CONTENT, "", "actionTextType", "<init>", "(Landroid/view/ViewGroup;Lcom/garmin/android/apps/connectmobile/view/GCMSnackbarContentLayout;I)V", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q0 extends BaseTransientBottomBar<q0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f149800b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f149801a;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"r22/q0$a", "Lcom/google/android/material/snackbar/BaseTransientBottomBar$BaseCallback;", "Lr22/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends BaseTransientBottomBar.BaseCallback<q0> {
        public a() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public final void onShown(q0 q0Var) {
            super.onShown(q0Var);
            ((BaseTransientBottomBar) q0.this).f53248view.sendAccessibilityEvent(8);
        }
    }

    private q0(ViewGroup viewGroup, GCMSnackbarContentLayout gCMSnackbarContentLayout, int i14) {
        int recommendedTimeoutMillis;
        super(viewGroup, gCMSnackbarContentLayout, gCMSnackbarContentLayout);
        this.f149801a = i14;
        getView().setBackgroundColor(a7.b.getColor(this.f53248view.getContext(), R.color.transparent));
        TextView textView = (TextView) getView().findViewById(com.google.android.material.R.id.snackbar_text);
        if (textView != null) {
            textView.setTextColor(a7.b.getColor(this.f53248view.getContext(), R.color.gcm_snackbar_text_primary));
        }
        setAnimationMode(1);
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = getContext().getSystemService("accessibility");
            systemService.getClass();
            recommendedTimeoutMillis = ((AccessibilityManager) systemService).getRecommendedTimeoutMillis(5000, 6);
        } else {
            recommendedTimeoutMillis = 5000;
        }
        setDuration(recommendedTimeoutMillis);
        addCallback(new a());
    }

    public final void b(int i14, View.OnClickListener onClickListener) {
        CharSequence text = getContext().getText(i14);
        text.getClass();
        c(text, onClickListener);
    }

    public final void c(CharSequence charSequence, View.OnClickListener onClickListener) {
        TextView actionViewLongText;
        charSequence.getClass();
        View childAt = this.f53248view.getChildAt(0);
        childAt.getClass();
        GCMSnackbarContentLayout gCMSnackbarContentLayout = (GCMSnackbarContentLayout) childAt;
        if (this.f149801a == 0) {
            v22.e.j(gCMSnackbarContentLayout.getActionViewLongText());
            actionViewLongText = gCMSnackbarContentLayout.getActionViewShortText();
        } else {
            v22.e.j(gCMSnackbarContentLayout.getActionViewShortText());
            actionViewLongText = gCMSnackbarContentLayout.getActionViewLongText();
        }
        if (TextUtils.isEmpty(charSequence)) {
            v22.e.j(actionViewLongText);
            actionViewLongText.setOnClickListener(null);
        } else {
            v22.e.q(actionViewLongText);
            actionViewLongText.setText(charSequence);
            actionViewLongText.setOnClickListener(new pm0.h(9, onClickListener, this));
            androidx.core.view.s0.a(this.f53248view, charSequence, new r22.a(actionViewLongText, 3));
        }
    }

    public final void d(String str) {
        str.getClass();
        if (str.length() > 0) {
            View childAt = this.f53248view.getChildAt(0);
            GCMSnackbarContentLayout gCMSnackbarContentLayout = childAt instanceof GCMSnackbarContentLayout ? (GCMSnackbarContentLayout) childAt : null;
            TextView messageView = gCMSnackbarContentLayout != null ? gCMSnackbarContentLayout.getMessageView() : null;
            if (messageView != null) {
                messageView.setContentDescription(str);
            }
        }
    }

    public final void e(CharSequence charSequence) {
        charSequence.getClass();
        View childAt = this.f53248view.getChildAt(0);
        childAt.getClass();
        ((GCMSnackbarContentLayout) childAt).getMessageView().setText(charSequence);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lr22/q0$b;", "", "<init>", "()V", "", "SNACKBAR_DURATION", "I", "ACTION_TEXT_SHORT", "ACTION_TEXT_LONG", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q0 a(View view2, int i14, int i15) {
            view2.getClass();
            CharSequence text = view2.getResources().getText(i14);
            text.getClass();
            return b(view2, text, "", i15);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0030  */
        /* JADX WARN: Code duplicated, block: B:15:0x0033  */
        /* JADX WARN: Code duplicated, block: B:25:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:3:0x000b->B:30:?, LOOP_END, SYNTHETIC] */
        public static q0 b(View view2, CharSequence charSequence, String str, int i14) {
            ViewGroup viewGroup;
            Object parent;
            view2.getClass();
            charSequence.getClass();
            str.getClass();
            p005kotlin.jvm.internal.j jVar = null;
            ViewGroup viewGroup2 = null;
            while (true) {
                if (view2 instanceof CoordinatorLayout) {
                    viewGroup = (ViewGroup) view2;
                    break;
                }
                if (!(view2 instanceof FrameLayout)) {
                    parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    } else {
                        view2 = null;
                    }
                    if (view2 == null) {
                        viewGroup = viewGroup2;
                        break;
                    }
                } else {
                    if (((FrameLayout) view2).getId() == 16908290) {
                        viewGroup = (ViewGroup) view2;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view2;
                    parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    } else {
                        view2 = null;
                    }
                    if (view2 == null) {
                        viewGroup = viewGroup2;
                        break;
                    }
                }
            }
            if (viewGroup == null) {
                vb.h.s("No suitable parent found from the given view. Please provide a valid view.");
                return null;
            }
            q0 q0Var = new q0(viewGroup, (GCMSnackbarContentLayout) n23.j.b(viewGroup, R.layout.layout_custom_snackbar, viewGroup, false), i14, jVar);
            q0Var.e(charSequence);
            if (str.length() > 0) {
                q0Var.d(str);
            }
            return q0Var;
        }

        public static /* synthetic */ q0 c(b bVar, View view2, CharSequence charSequence, String str, int i14) {
            if ((i14 & 4) != 0) {
                str = "";
            }
            int i15 = (i14 & 8) != 0 ? 0 : 1;
            bVar.getClass();
            return b(view2, charSequence, str, i15);
        }

        private b() {
        }
    }

    public /* synthetic */ q0(ViewGroup viewGroup, GCMSnackbarContentLayout gCMSnackbarContentLayout, int i14, p005kotlin.jvm.internal.j jVar) {
        this(viewGroup, gCMSnackbarContentLayout, i14);
    }
}
