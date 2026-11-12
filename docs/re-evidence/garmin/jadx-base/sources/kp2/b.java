package kp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import bv2.j;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.v;
import dq2.f;
import er2.n;
import java.util.ArrayList;
import lc.u0;
import np2.e;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\n\u000b\f\rB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkp2/b;", "Landroidx/recyclerview/widget/x;", "Lkp2/b$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ldq2/f;", "selectedVerificationMethod", "<init>", "(Landroid/content/Context;Ldq2/f;)V", "a", "c", "b", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends x<a, RecyclerView.f0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2044b f106012f = new C2044b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f106013g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f106014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f106015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m13.a<c> f106016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f106017e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkp2/b$d;", "Landroidx/recyclerview/widget/o$f;", "Lkp2/b$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends o.f<a> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            return ((aVar3 instanceof a.e) && (aVar4 instanceof a.e)) ? false : true;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            aVar3.getClass();
            aVar4.getClass();
            return ((aVar3 instanceof a.e) && (aVar4 instanceof a.e)) ? false : true;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f106013g = gt2.b.f79005a.h("PAY#NEW_FITPAY#CardVerificationAdapter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, f fVar) {
        super(new d());
        context.getClass();
        fVar.getClass();
        this.f106014b = context;
        this.f106015c = fVar;
        m13.a<c> aVar = new m13.a<>();
        this.f106016d = aVar;
        this.f106017e = aVar.g(r03.a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        a aVarR = r(i14);
        aVarR.getClass();
        a aVar = aVarR;
        if (aVar instanceof a.C2042a) {
            return 0;
        }
        if (aVar instanceof a.C2043b) {
            return 1;
        }
        if (aVar instanceof a.e) {
            return 2;
        }
        if (aVar instanceof a.c) {
            return 3;
        }
        if (aVar instanceof a.d) {
            return 4;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        a.e eVar;
        a.e eVar2;
        mp2.a aVar;
        a.C2042a c2042a;
        f0Var.getClass();
        a aVarR = r(i14);
        boolean z14 = aVarR instanceof a.C2042a;
        Context context = this.f106014b;
        if (z14) {
            np2.a aVar2 = f0Var instanceof np2.a ? (np2.a) f0Var : null;
            if (aVar2 != null) {
                if (aVar2.getBindingAdapterPosition() == -1) {
                    c2042a = null;
                } else {
                    a aVarR2 = r(aVar2.getBindingAdapterPosition());
                    if (!(aVarR2 instanceof a.C2042a)) {
                        aVarR2 = null;
                    }
                    c2042a = (a.C2042a) aVarR2;
                }
                aVar2.d(context, c2042a != null ? c2042a.f106018a : null);
                return;
            }
            return;
        }
        boolean z15 = aVarR instanceof a.C2043b;
        f fVar = this.f106015c;
        if (z15) {
            np2.f fVar2 = f0Var instanceof np2.f ? (np2.f) f0Var : null;
            if (fVar2 == null || (aVar = fVar.f60808c) == null) {
                return;
            }
            String str = fVar.f60809d;
            if (str != null) {
                fVar2.f126880a.setText(aVar.b(str));
                return;
            } else {
                f106013g.error("Selected verification method value is empty");
                return;
            }
        }
        if (!(aVarR instanceof a.e)) {
            if (aVarR instanceof a.c) {
                np2.d dVar = f0Var instanceof np2.d ? (np2.d) f0Var : null;
                if (dVar != null) {
                    Button button = dVar.f126876a;
                    button.setText(context.getString(R.string.verification_change_method));
                    button.setOnClickListener(new js0.d(this, 10));
                    return;
                }
                return;
            }
            if (!(aVarR instanceof a.d)) {
                u0.r();
                return;
            }
            e eVar3 = f0Var instanceof e ? (e) f0Var : null;
            if (eVar3 != null) {
                eVar3.d(new jx0.e(this, 23), context);
                return;
            }
            return;
        }
        np2.c cVar = f0Var instanceof np2.c ? (np2.c) f0Var : null;
        if (cVar != null) {
            if (cVar.getBindingAdapterPosition() == -1) {
                eVar = null;
            } else {
                a aVarR3 = r(cVar.getBindingAdapterPosition());
                if (!(aVarR3 instanceof a.e)) {
                    aVarR3 = null;
                }
                eVar = (a.e) aVarR3;
            }
            String str2 = eVar != null ? eVar.f106022a : null;
            if (cVar.getBindingAdapterPosition() == -1) {
                eVar2 = null;
            } else {
                a aVarR4 = r(cVar.getBindingAdapterPosition());
                if (!(aVarR4 instanceof a.e)) {
                    aVarR4 = null;
                }
                eVar2 = (a.e) aVarR4;
            }
            String str3 = eVar2 != null ? eVar2.f106023b : null;
            kp2.a aVar3 = new kp2.a(this, 0);
            context.getClass();
            fVar.getClass();
            Button button2 = cVar.f126874c;
            button2.getBackground().setColorFilter(null);
            button2.setClickable(true);
            TextInputEditText textInputEditText = cVar.f126873b;
            textInputEditText.setEnabled(true);
            textInputEditText.setText(str3, TextView.BufferType.EDITABLE);
            TextInputLayout textInputLayout = cVar.f126872a;
            textInputLayout.setError(str2);
            textInputEditText.addTextChangedListener(new np2.c.a(textInputLayout));
            button2.setOnClickListener(new j(cVar, 23, context, aVar3));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = this.f106014b;
        if (i14 == 0) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_fitpay_card_image, viewGroup, false);
            viewInflate.getClass();
            return new np2.a(viewInflate);
        }
        if (i14 == 1) {
            View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_fitpay_card_verification_title, viewGroup, false);
            viewInflate2.getClass();
            return new np2.f(viewInflate2);
        }
        if (i14 == 2) {
            View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_fitpay_submit_verification, viewGroup, false);
            viewInflate3.getClass();
            return new np2.c(viewInflate3);
        }
        if (i14 == 3) {
            View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.item_fitpay_link_button, viewGroup, false);
            viewInflate4.getClass();
            return new np2.d(viewInflate4);
        }
        if (i14 != 4) {
            View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.item_empty_section, viewGroup, false);
            viewInflate5.getClass();
            return new n(viewInflate5);
        }
        View viewInflate6 = LayoutInflater.from(context).inflate(R.layout.item_link_button_red, viewGroup, false);
        viewInflate6.getClass();
        return new e(viewInflate6);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lkp2/b$a;", "", "<init>", "()V", "a", "b", JWKParameterNames.RSA_EXPONENT, "c", "d", "Lkp2/b$a$a;", "Lkp2/b$a$b;", "Lkp2/b$a$c;", "Lkp2/b$a$d;", "Lkp2/b$a$e;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: kp2.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkp2/b$a$a;", "Lkp2/b$a;", "Lyo2/b;", "cardModel", "<init>", "(Lyo2/b;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2042a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final yo2.b f106018a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2042a(yo2.b bVar) {
                super(null);
                bVar.getClass();
                this.f106018a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2042a) && s.g(this.f106018a, ((C2042a) obj).f106018a);
            }

            public final int hashCode() {
                return this.f106018a.hashCode();
            }

            public final String toString() {
                return "CardImageSection(cardModel=" + this.f106018a + ")";
            }
        }

        /* JADX INFO: renamed from: kp2.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp2/b$a$b;", "Lkp2/b$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2043b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2043b f106019a = new C2043b();

            private C2043b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp2/b$a$c;", "Lkp2/b$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f106020a = new c();

            private c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp2/b$a$d;", "Lkp2/b$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f106021a = new d();

            private d() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkp2/b$a$e;", "Lkp2/b$a;", "", "submitVerificationErrorStringHandle", "authCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f106022a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f106023b;

            public e(String str, String str2) {
                super(null);
                this.f106022a = str;
                this.f106023b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return s.g(this.f106022a, eVar.f106022a) && s.g(this.f106023b, eVar.f106023b);
            }

            public final int hashCode() {
                String str = this.f106022a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f106023b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return e0.g("SubmitVerificationSection(submitVerificationErrorStringHandle=", this.f106022a, ", authCode=", this.f106023b, ")");
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: kp2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lkp2/b$b;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "TYPE_CARD_IMAGE_SECTION", "I", "TYPE_CARD_SUBMIT_VERIFICATION_HEADER", "TYPE_SUBMIT_VERIFICATION_SECTION", "TYPE_CHOOSE_DIFFERENT_VERIFICATION_SECTION", "TYPE_REMOVE_CARD_SECTION", "PAYLOAD_ALL", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2044b {

        /* JADX INFO: renamed from: kp2.b$b$a */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106024a;

            static {
                int[] iArr = new int[mp2.a.values().length];
                try {
                    iArr[mp2.a.f120057a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mp2.a.f120060d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f106024a = iArr;
            }
        }

        public /* synthetic */ C2044b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static ArrayList a(f fVar, yo2.b bVar, String str, String str2) {
            fVar.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new a.C2042a(bVar));
            arrayList.add(a.C2043b.f106019a);
            mp2.a aVar = fVar.f60808c;
            int i14 = aVar == null ? -1 : a.f106024a[aVar.ordinal()];
            if (i14 == 1 || i14 == 2) {
                b.f106013g.debug("createAdapterState: selected verification type does not support OTP");
            } else {
                arrayList.add(new a.e(str, str2));
            }
            arrayList.add(a.c.f106020a);
            arrayList.add(a.d.f106021a);
            return arrayList;
        }

        public static /* synthetic */ ArrayList b(C2044b c2044b, f fVar, yo2.b bVar, String str, String str2, int i14) {
            if ((i14 & 4) != 0) {
                str = null;
            }
            if ((i14 & 8) != 0) {
                str2 = null;
            }
            c2044b.getClass();
            return a(fVar, bVar, str, str2);
        }

        private C2044b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lkp2/b$c;", "", "<init>", "()V", "c", "a", "b", "Lkp2/b$c$a;", "Lkp2/b$c$b;", "Lkp2/b$c$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp2/b$c$a;", "Lkp2/b$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f106025a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: kp2.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkp2/b$c$b;", "Lkp2/b$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2045b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2045b f106026a = new C2045b();

            private C2045b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: kp2.b$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkp2/b$c$c;", "Lkp2/b$c;", "", "authCode", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C2046c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f106027a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2046c(String str) {
                super(null);
                str.getClass();
                this.f106027a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2046c) && s.g(this.f106027a, ((C2046c) obj).f106027a);
            }

            public final int hashCode() {
                return this.f106027a.hashCode();
            }

            public final String toString() {
                return am.j.m("SubmitVerificationItem(authCode=", this.f106027a, ")");
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}
