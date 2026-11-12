package z10;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lz10/v2;", "Landroidx/fragment/app/i;", "<init>", "()V", "b", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v2 extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f201275c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s92.g f201276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f201277b;

    public interface b {
        void U8(s92.g gVar);

        void V5(s92.g gVar);

        void i7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f201277b = (b) context;
        } catch (ClassCastException e4) {
            String strN = fb1.c.n("Parent activity must implement ProductImprovementConsentListener: ", e4.getMessage());
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ProductImprovementConsentDialog", strN);
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        s92.g gVar = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("EXTRA_CONSENT_TEXT", s92.g.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("EXTRA_CONSENT_TEXT");
                parcelable = (s92.g) (parcelable2 instanceof s92.g ? parcelable2 : null);
            }
            gVar = (s92.g) parcelable;
        }
        this.f201276a = gVar;
    }

    @Override // androidx.fragment.app.i
    @SuppressLint({"InflateParams"})
    public final Dialog onCreateDialog(Bundle bundle) {
        List<s92.b> listB;
        androidx.fragment.app.m activity = getActivity();
        if (activity == null) {
            vb.h.z("Activity cannot be null");
            return null;
        }
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.product_improvement_consent_dialog, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.consent_headline);
        s92.g gVar = this.f201276a;
        textView.setText(gVar != null ? gVar.getHeadline() : null);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.consent_instruction);
        s92.g gVar2 = this.f201276a;
        s92.b bVar = (gVar2 == null || (listB = gVar2.b()) == null) ? null : (s92.b) p13.h0.d0(listB);
        String copy = bVar != null ? bVar.getCopy() : null;
        String string = getString(R.string.android_notification_update_failure_thirdline_learn_more);
        string.getClass();
        String str = copy + StringUtils.SPACE + string;
        textView2.getClass();
        v22.e.p(textView2, str, string, a7.b.getColor(activity, R.color.gcm_text_primary_action_selector), new yr.o0(this, 8));
        Button button = (Button) viewInflate.findViewById(R.id.consent_btn_grant);
        s92.g gVar3 = this.f201276a;
        button.setText(gVar3 != null ? gVar3.getGrantButton() : null);
        final int i14 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: z10.u2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v2 f201268b;

            {
                this.f201268b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v2.b bVar2;
                v2.b bVar3;
                switch (i14) {
                    case 0:
                        v2 v2Var = this.f201268b;
                        s92.g gVar4 = v2Var.f201276a;
                        if (gVar4 != null && (bVar2 = v2Var.f201277b) != null) {
                            bVar2.U8(gVar4);
                            break;
                        }
                        break;
                    default:
                        v2 v2Var2 = this.f201268b;
                        s92.g gVar5 = v2Var2.f201276a;
                        if (gVar5 != null && (bVar3 = v2Var2.f201277b) != null) {
                            bVar3.V5(gVar5);
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.consent_btn_reject);
        s92.g gVar4 = this.f201276a;
        textView3.setText(gVar4 != null ? gVar4.getRejectButton() : null);
        final int i15 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: z10.u2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v2 f201268b;

            {
                this.f201268b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v2.b bVar2;
                v2.b bVar3;
                switch (i15) {
                    case 0:
                        v2 v2Var = this.f201268b;
                        s92.g gVar5 = v2Var.f201276a;
                        if (gVar5 != null && (bVar2 = v2Var.f201277b) != null) {
                            bVar2.U8(gVar5);
                            break;
                        }
                        break;
                    default:
                        v2 v2Var2 = this.f201268b;
                        s92.g gVar6 = v2Var2.f201276a;
                        if (gVar6 != null && (bVar3 = v2Var2.f201277b) != null) {
                            bVar3.V5(gVar6);
                            break;
                        }
                        break;
                }
            }
        });
        Dialog dialog = new Dialog(activity, R.style.GCMInfoDialogStyle);
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz10/v2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONSENT_TEXT", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(androidx.fragment.app.v vVar) {
            Fragment fragmentG = vVar.G("ProductImprovementConsentDialog");
            if (fragmentG instanceof v2) {
                ((v2) fragmentG).dismiss();
            }
        }

        private a() {
        }
    }
}
