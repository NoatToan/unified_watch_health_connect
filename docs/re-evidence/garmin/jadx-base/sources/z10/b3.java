package z10;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz10/b3;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b3 extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f200898m = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d20.f f200900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f200901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f200902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f200903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f200904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f200905g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f200907i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f200899a = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f200906h = R.drawable.gcm_button_primary_selector;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f200908j = R.drawable.gcm_button_secondary_selector;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s92.e f200909k = new s92.e(null, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.w1 f200910l = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(f3.class), new b(this), new d(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f200911a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f200911a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f200911a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f200912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f200913b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f200912a = aVar;
            this.f200913b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f200912a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f200913b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f200914a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f200914a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f200914a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    public static String u6(d20.d dVar, String str) {
        String strQ;
        if (str == null) {
            return null;
        }
        if (dVar == null || (strQ = dVar.q()) == null) {
            strQ = "";
        }
        return d53.u.v(str, "[APP]", strQ, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("DETAILS_LAYOUT")) {
                this.f200899a = arguments.getInt("DETAILS_LAYOUT");
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("CONSENT_DATA", d20.f.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("CONSENT_DATA");
                if (!(parcelable2 instanceof d20.f)) {
                    parcelable2 = null;
                }
                parcelable = (d20.f) parcelable2;
            }
            this.f200900b = (d20.f) parcelable;
            boolean z14 = arguments.getBoolean("ACCOUNT_CONNECTED");
            this.f200901c = z14;
            d20.f fVar = this.f200900b;
            if (fVar != null) {
                d20.d dVar = fVar.f57284b;
                s92.g gVar = fVar.f57283a;
                if (gVar != null) {
                    this.f200902d = u6(dVar, z14 ? gVar.getRevokeHeadline() : gVar.getHeadline());
                    List<s92.b> listQ = this.f200901c ? gVar.q() : gVar.b();
                    if (listQ != null) {
                        if (!listQ.isEmpty()) {
                            this.f200903e = u6(dVar, listQ.get(0).getCopy());
                        }
                        if (listQ.size() > 1) {
                            int size = listQ.size() - 1;
                            String[] strArr = new String[size];
                            int i14 = 0;
                            while (i14 < size) {
                                int i15 = i14 + 1;
                                String strU6 = u6(dVar, listQ.get(i15).getCopy());
                                if (strU6 == null) {
                                    strU6 = "";
                                }
                                strArr[i14] = strU6;
                                i14 = i15;
                            }
                            this.f200904f = strArr;
                        }
                    }
                    this.f200905g = u6(dVar, this.f200901c ? gVar.getRevokeConsentButton() : gVar.getGrantButton());
                    boolean z15 = this.f200901c;
                    this.f200906h = z15 ? R.drawable.gcm_button_danger_selector : R.drawable.gcm_button_primary_selector;
                    this.f200907i = u6(dVar, z15 ? null : gVar.getRejectButton());
                    List<s92.e> listD = gVar.d();
                    if (dVar != null && listD != null && (!listD.isEmpty())) {
                        s92.e eVar = listD.get(0);
                        String strU7 = u6(dVar, eVar != null ? eVar.getText() : null);
                        s92.e eVar2 = this.f200909k;
                        eVar2.f(strU7);
                        String strS = dVar.s();
                        if (strS == null) {
                            strS = dVar.getCompanyWebsite();
                        }
                        eVar2.g(strS);
                    }
                }
            }
        }
        if (this.f200899a <= 0) {
            this.f200899a = v6();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewB = com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.third_party_consent_account_fragment, viewGroup, false);
        View viewFindViewById = viewB.findViewById(R.id.third_party_details);
        viewFindViewById.getClass();
        ViewStub viewStub = (ViewStub) viewFindViewById;
        viewStub.setLayoutResource(this.f200899a);
        viewStub.inflate();
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String url;
        String str;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.consent_text);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.primary_action_button);
        viewFindViewById2.getClass();
        Button button = (Button) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.secondary_action_button);
        viewFindViewById3.getClass();
        Button button2 = (Button) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.privacy_policy_button);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = this.f200902d;
        if (str2 != null && !d53.w.J(str2)) {
            spannableStringBuilder.append((CharSequence) this.f200902d);
        }
        String str3 = this.f200903e;
        float f14 = 0.5f;
        if (str3 != null && !d53.w.J(str3)) {
            if (!d53.w.J(spannableStringBuilder)) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.5f), length, length + 2, 33);
            }
            spannableStringBuilder.append((CharSequence) this.f200903e);
        }
        String[] strArr = this.f200904f;
        if (strArr != null) {
            int length2 = strArr.length;
            int i14 = 0;
            while (i14 < length2) {
                String str4 = strArr[i14];
                if (!d53.w.J(spannableStringBuilder)) {
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f14), length3, length3 + 2, 33);
                }
                spannableStringBuilder.append((CharSequence) str4);
                i14++;
                f14 = 0.5f;
            }
        }
        if (d53.w.J(spannableStringBuilder)) {
            textView.setVisibility(8);
        } else {
            textView.setText(spannableStringBuilder);
            textView.setVisibility(0);
        }
        String str5 = this.f200905g;
        if (str5 == null || d53.w.J(str5)) {
            button.setVisibility(8);
        } else {
            button.setText(this.f200905g);
            button.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_text_on_color));
            button.setBackgroundResource(this.f200906h);
            final int i15 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: z10.a3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b3 f200888b;

                {
                    this.f200888b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i16 = i15;
                    b3 b3Var = this.f200888b;
                    switch (i16) {
                        case 0:
                            z2 z2Var = b3Var.f200901c ? z2.d.f201350a : z2.a.f201347a;
                            f3 f3Var = (f3) b3Var.f200910l.getValue();
                            z2Var.getClass();
                            f3Var.f200995a.m(z2Var);
                            break;
                        case 1:
                            int i17 = b3.f200898m;
                            f3 f3Var2 = (f3) b3Var.f200910l.getValue();
                            z2.c cVar = z2.c.f201349a;
                            cVar.getClass();
                            f3Var2.f200995a.m(cVar);
                            break;
                        default:
                            int i18 = b3.f200898m;
                            f3 f3Var3 = (f3) b3Var.f200910l.getValue();
                            String url2 = b3Var.f200909k.getUrl();
                            if (url2 == null) {
                                url2 = "";
                            }
                            f3Var3.f200995a.m(new z2.b(url2));
                            break;
                    }
                }
            });
            button.setVisibility(0);
        }
        if (this.f200901c || (str = this.f200905g) == null || d53.w.J(str)) {
            button2.setVisibility(8);
        } else {
            button2.setText(this.f200907i);
            button2.setBackgroundResource(this.f200908j);
            final int i16 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: z10.a3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b3 f200888b;

                {
                    this.f200888b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i17 = i16;
                    b3 b3Var = this.f200888b;
                    switch (i17) {
                        case 0:
                            z2 z2Var = b3Var.f200901c ? z2.d.f201350a : z2.a.f201347a;
                            f3 f3Var = (f3) b3Var.f200910l.getValue();
                            z2Var.getClass();
                            f3Var.f200995a.m(z2Var);
                            break;
                        case 1:
                            int i18 = b3.f200898m;
                            f3 f3Var2 = (f3) b3Var.f200910l.getValue();
                            z2.c cVar = z2.c.f201349a;
                            cVar.getClass();
                            f3Var2.f200995a.m(cVar);
                            break;
                        default:
                            int i19 = b3.f200898m;
                            f3 f3Var3 = (f3) b3Var.f200910l.getValue();
                            String url2 = b3Var.f200909k.getUrl();
                            if (url2 == null) {
                                url2 = "";
                            }
                            f3Var3.f200995a.m(new z2.b(url2));
                            break;
                    }
                }
            });
            button2.setVisibility(0);
        }
        s92.e eVar = this.f200909k;
        String text = eVar.getText();
        if (text == null || d53.w.J(text) || (url = eVar.getUrl()) == null || d53.w.J(url)) {
            textView2.setVisibility(8);
        } else {
            String text2 = eVar.getText();
            textView2.setText(text2);
            final int i17 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: z10.a3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b3 f200888b;

                {
                    this.f200888b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i18 = i17;
                    b3 b3Var = this.f200888b;
                    switch (i18) {
                        case 0:
                            z2 z2Var = b3Var.f200901c ? z2.d.f201350a : z2.a.f201347a;
                            f3 f3Var = (f3) b3Var.f200910l.getValue();
                            z2Var.getClass();
                            f3Var.f200995a.m(z2Var);
                            break;
                        case 1:
                            int i19 = b3.f200898m;
                            f3 f3Var2 = (f3) b3Var.f200910l.getValue();
                            z2.c cVar = z2.c.f201349a;
                            cVar.getClass();
                            f3Var2.f200995a.m(cVar);
                            break;
                        default:
                            int i110 = b3.f200898m;
                            f3 f3Var3 = (f3) b3Var.f200910l.getValue();
                            String url2 = b3Var.f200909k.getUrl();
                            if (url2 == null) {
                                url2 = "";
                            }
                            f3Var3.f200995a.m(new z2.b(url2));
                            break;
                    }
                }
            });
            textView2.setVisibility(0);
            String strValueOf = String.valueOf(text2);
            String url2 = eVar.getUrl();
            if (url2 == null) {
                url2 = "";
            }
            v22.e.m(textView2, strValueOf, url2);
        }
        w6(view2);
    }

    public int v6() {
        return -1;
    }

    public void w6(View view2) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lz10/b3$a;", "", "<init>", "()V", "", "ARGS_DETAILS_LAYOUT", "Ljava/lang/String;", "ARGS_CONSENT_DATA", "ARGS_ACCOUNT_CONNECTED", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
