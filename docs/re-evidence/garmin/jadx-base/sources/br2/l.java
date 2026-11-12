package br2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import o72.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbr2/l;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f19640b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f19641c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SnowballAddCardActivity.e f19642a;

    static {
        int i14 = gt2.c.f79010a;
        f19641c = gt2.b.f79005a.h("IssuerTermsAndConditionsFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_issuer_terms_and_conditions, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f19642a = null;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        view2.getClass();
        hn2.c cVarF = t.F(this);
        Logger logger = f19641c;
        if (cVarF == null) {
            logger.error("Failed to cast activity to GarminPayBaseActivity");
            return;
        }
        String string2 = cVarF.getString(R.string.label_terms_and_conditions);
        string2.getClass();
        cVarF.W9(string2, hn2.c.a.NONE);
        cVarF.X9(false);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("extra.terms_and_conditions_text")) == null) {
            logger.error("The text of terms and conditions is null");
            return;
        }
        ((TextView) view2.findViewById(R.id.terms_and_conditions_text)).setText(string);
        final int i14 = 0;
        ((Button) view2.findViewById(R.id.decline_button)).setOnClickListener(new View.OnClickListener(this) { // from class: br2.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f19639b;

            {
                this.f19639b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        SnowballAddCardActivity.e eVar = this.f19639b.f19642a;
                        if (eVar != null) {
                            SnowballAddCardActivity.this.b().z();
                        }
                        break;
                    default:
                        SnowballAddCardActivity.e eVar2 = this.f19639b.f19642a;
                        if (eVar2 != null) {
                            SnowballAddCardActivity.this.b().T();
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        ((Button) view2.findViewById(R.id.continue_button)).setOnClickListener(new View.OnClickListener(this) { // from class: br2.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f19639b;

            {
                this.f19639b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        SnowballAddCardActivity.e eVar = this.f19639b.f19642a;
                        if (eVar != null) {
                            SnowballAddCardActivity.this.b().z();
                        }
                        break;
                    default:
                        SnowballAddCardActivity.e eVar2 = this.f19639b.f19642a;
                        if (eVar2 != null) {
                            SnowballAddCardActivity.this.b().T();
                        }
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lbr2/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "EXTRA_TERMS_AND_CONDITIONS_TEXT", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
