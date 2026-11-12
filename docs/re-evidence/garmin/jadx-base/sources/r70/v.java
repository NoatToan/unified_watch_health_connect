package r70;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import r22.u0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lr70/v;", "Landroidx/fragment/app/i;", "Lr22/v0;", "<init>", "()V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends androidx.fragment.app.i implements v0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f151104f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnClickListener f151105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnClickListener f151106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnClickListener f151107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f151108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f151109e;

    public v() {
        String string;
        Bundle arguments = getArguments();
        String str = "GCMThreeButtonDialogFragment";
        if (arguments != null && (string = arguments.getString("ARG_DIALOG_TAG", "GCMThreeButtonDialogFragment")) != null) {
            str = string;
        }
        this.f151109e = str;
    }

    @Override // r22.v0
    public final void L3(u0 u0Var) {
        this.f151108d = u0Var;
    }

    @Override // r22.v0
    /* JADX INFO: renamed from: b5, reason: from getter */
    public final String getF151109e() {
        return this.f151109e;
    }

    @Override // r22.v0
    public final void g(androidx.fragment.app.v vVar) {
        showNow(vVar, this.f151109e);
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ARG_TEXT") : null;
        Bundle arguments2 = getArguments();
        int i14 = arguments2 != null ? arguments2.getInt("ARG_BUTTON_1_TEXT_RES_ID", -1) : -1;
        Bundle arguments3 = getArguments();
        int i15 = arguments3 != null ? arguments3.getInt("ARG_BUTTON_2_TEXT_RES_ID", -1) : -1;
        Bundle arguments4 = getArguments();
        int i16 = arguments4 != null ? arguments4.getInt("ARG_BUTTON_3_TEXT_RES_ID", -1) : -1;
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.three_button_dialog_fragment, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.dialog_text)).setText(string);
        u6((TextView) viewInflate.findViewById(R.id.dialog_button_1), i14, this.f151105a);
        u6((TextView) viewInflate.findViewById(R.id.dialog_button_2), i15, this.f151106b);
        u6((TextView) viewInflate.findViewById(R.id.dialog_button_3), i16, this.f151107c);
        Dialog dialog = new Dialog(requireContext(), R.style.GCMInfoDialogStyle);
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.setCanceledOnTouchOutside(false);
        u0 u0Var = this.f151108d;
        if (u0Var != null) {
            u0Var.a();
        }
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        u0 u0Var = this.f151108d;
        if (u0Var != null) {
            u0Var.onDismiss();
        }
    }

    public final void u6(TextView textView, int i14, View.OnClickListener onClickListener) {
        if (textView != null) {
            if (i14 <= 0) {
                textView.setVisibility(8);
            } else {
                textView.setText(i14);
                textView.setOnClickListener(new pm0.h(11, this, onClickListener));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lr70/v$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_TEXT", "ARG_BUTTON_1_TEXT_RES_ID", "ARG_BUTTON_2_TEXT_RES_ID", "ARG_BUTTON_3_TEXT_RES_ID", "ARG_DIALOG_TAG", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static v a(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i14, zo0.c cVar) {
            Bundle bundle = new Bundle();
            bundle.putString("ARG_TEXT", str2);
            bundle.putInt("ARG_BUTTON_1_TEXT_RES_ID", R.string.common_tomorrow);
            bundle.putInt("ARG_BUTTON_2_TEXT_RES_ID", R.string.onboarding_next_week);
            bundle.putInt("ARG_BUTTON_3_TEXT_RES_ID", i14);
            bundle.putString("ARG_DIALOG_TAG", str);
            v vVar = new v();
            vVar.setArguments(bundle);
            vVar.f151105a = onClickListener;
            vVar.f151106b = onClickListener2;
            vVar.f151107c = cVar;
            return vVar;
        }

        private a() {
        }
    }
}
