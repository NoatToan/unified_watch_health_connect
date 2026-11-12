package cp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import e23.l;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcp2/i;", "Lbr2/h;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends br2.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f54962j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f54963k = m.b(new com.google.accompanist.drawablepainter.a(8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ap2.h f54965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yq2.a f54966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextInputLayout f54967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextInputEditText f54968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f54969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f54970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f54971h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54964a = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f54972i = "";

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f54973a;

        public b(l lVar) {
            lVar.getClass();
            this.f54973a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f54973a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54973a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_fit_pay_verify_card_security_code, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        hn2.c cVarU6 = u6();
        String string = getString(R.string.wallet_add_a_card);
        string.getClass();
        cVarU6.W9(string, hn2.c.a.BACK);
        a7.e activity = getActivity();
        yq2.a aVar = activity instanceof yq2.a ? (yq2.a) activity : null;
        if (aVar == null) {
            com.nimbusds.jose.shaded.gson.internal.a.t("Activity should not be null");
            return;
        }
        this.f54966c = aVar;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f54965b = (ap2.h) new x1(mVarRequireActivity).b(s0.f105811a.b(ap2.h.class));
        Bundle arguments = getArguments();
        this.f54969f = arguments != null ? arguments.getString("extra.payment.card.id") : null;
        Bundle arguments2 = getArguments();
        this.f54970g = arguments2 != null ? arguments2.getString("extra.payment.card.image.url") : null;
        Bundle arguments3 = getArguments();
        this.f54971h = arguments3 != null ? arguments3.getString("extra.payment.card.type") : null;
        ap2.h hVar = this.f54965b;
        if (hVar == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        if (s.g(hVar.f11705i.d(), Boolean.TRUE)) {
            ap2.h hVar2 = this.f54965b;
            if (hVar2 != null) {
                hVar2.f11714r.f(getViewLifecycleOwner(), new b(new cn1.d(9, this, view2)));
            } else {
                s.m("fitPayAddCardViewModel");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcp2/i$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
