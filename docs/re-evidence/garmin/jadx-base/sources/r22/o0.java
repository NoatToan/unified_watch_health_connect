package r22;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/o0;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f149771c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnClickListener f149772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnClickListener f149773b;

    @Override // androidx.fragment.app.i
    @SuppressLint({"InflateParams"})
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_TITLE", "") : null;
        String str = string == null ? "" : string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("EXTRA_DESCRIPTION", "") : null;
        String str2 = string2 == null ? "" : string2;
        Bundle arguments3 = getArguments();
        int i14 = arguments3 != null ? arguments3.getInt("EXTRA_POSITIVE_BUTTON_TEXT", -1) : -1;
        Bundle arguments4 = getArguments();
        int i15 = arguments4 != null ? arguments4.getInt("EXTRA_NEGATIVE_BUTTON_TEXT", -1) : -1;
        Bundle arguments5 = getArguments();
        boolean z14 = arguments5 != null ? arguments5.getBoolean("IS_CANCELLED_ON_TOUCH_OUTSIDE", false) : false;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        String string3 = i14 != -1 ? getString(i14) : null;
        final int i16 = 0;
        final int i17 = 1;
        return new k0(contextRequireContext, new k0.a(str, str2, z14, false, null, null, string3, null, new e23.l(this) { // from class: r22.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f149765b;

            {
                this.f149765b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i16;
                o0 o0Var = this.f149765b;
                View view2 = (View) obj;
                switch (i18) {
                    case 0:
                        o0.a aVar = o0.f149771c;
                        view2.getClass();
                        View.OnClickListener onClickListener = o0Var.f149772a;
                        if (onClickListener != null) {
                            onClickListener.onClick(view2);
                        }
                        break;
                    default:
                        o0.a aVar2 = o0.f149771c;
                        view2.getClass();
                        View.OnClickListener onClickListener2 = o0Var.f149773b;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(view2);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, i15 != -1 ? getString(i15) : null, null, new e23.l(this) { // from class: r22.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f149765b;

            {
                this.f149765b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                o0 o0Var = this.f149765b;
                View view2 = (View) obj;
                switch (i18) {
                    case 0:
                        o0.a aVar = o0.f149771c;
                        view2.getClass();
                        View.OnClickListener onClickListener = o0Var.f149772a;
                        if (onClickListener != null) {
                            onClickListener.onClick(view2);
                        }
                        break;
                    default:
                        o0.a aVar2 = o0.f149771c;
                        view2.getClass();
                        View.OnClickListener onClickListener2 = o0Var.f149773b;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(view2);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 1208, null));
    }

    public final void u6(Fragment fragment) {
        fragment.getClass();
        androidx.fragment.app.m activity = fragment.getActivity();
        if (activity != null) {
            show(activity.getSupportFragmentManager(), "GCMFragmentDialog");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lr22/o0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_TITLE", "EXTRA_DESCRIPTION", "EXTRA_POSITIVE_BUTTON_TEXT", "EXTRA_NEGATIVE_BUTTON_TEXT", "IS_CANCELLED_ON_TOUCH_OUTSIDE", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o0 a(String str, String str2, int i14, View.OnClickListener onClickListener, int i15, View.OnClickListener onClickListener2) {
            Bundle bundleD = tn.k.d("EXTRA_TITLE", str, "EXTRA_DESCRIPTION", str2);
            bundleD.putInt("EXTRA_POSITIVE_BUTTON_TEXT", i14);
            bundleD.putInt("EXTRA_NEGATIVE_BUTTON_TEXT", i15);
            bundleD.putBoolean("IS_CANCELLED_ON_TOUCH_OUTSIDE", false);
            o0 o0Var = new o0();
            o0Var.setArguments(bundleD);
            o0Var.f149772a = onClickListener;
            o0Var.f149773b = onClickListener2;
            return o0Var;
        }

        public static /* synthetic */ o0 b(a aVar, String str, String str2, int i14, View.OnClickListener onClickListener, int i15, js0.d dVar, int i16) {
            if ((i16 & 8) != 0) {
                onClickListener = null;
            }
            if ((i16 & 16) != 0) {
                i15 = -1;
            }
            if ((i16 & 32) != 0) {
                dVar = null;
            }
            aVar.getClass();
            return a(str, str2, i14, onClickListener, i15, dVar);
        }

        private a() {
        }
    }
}
