package bp2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import b21.s4;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.v;
import er2.n;
import fo2.j;
import go1.g0;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\b\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lbp2/c;", "Landroidx/recyclerview/widget/x;", "Lbp2/c$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "a", "d", "c", JWKParameterNames.RSA_EXPONENT, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends x<b, RecyclerView.f0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0291c f19439f = new C0291c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static List<fj2.a> f19440g = j0.f134944a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f19441h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f19442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f19443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m13.a<d> f19444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f19445e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        ITEM_CLICK,
        ITEM_LONG_CLICK,
        REMOVE_ICON_CLICK
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbp2/c$e;", "Landroidx/recyclerview/widget/o$f;", "Lbp2/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends o.f<b> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return ((bVar3 instanceof b.C0289b) && (bVar4 instanceof b.C0289b)) ? false : true;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return ((bVar3 instanceof b.C0289b) && (bVar4 instanceof b.C0289b)) ? false : true;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f19441h = gt2.b.f79005a.h("PAY#NEW_FITPAY#AddressManagementAdapter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(new e());
        context.getClass();
        this.f19442b = context;
        this.f19443c = j.SELECT_MODE;
        m13.a<d> aVar = new m13.a<>();
        this.f19444d = aVar;
        this.f19445e = aVar.g(r03.a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        b bVarR = r(i14);
        bVarR.getClass();
        b bVar = bVarR;
        if (bVar instanceof b.C0290c) {
            return 0;
        }
        if (bVar instanceof b.C0289b) {
            return 1;
        }
        if (bVar instanceof b.a) {
            return 2;
        }
        if (bVar instanceof b.d) {
            return 3;
        }
        u0.r();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0172  */
    /* JADX WARN: Code duplicated, block: B:84:0x017b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0188  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        b.C0289b c0289b;
        View view2;
        bp2.b bVar;
        Drawable drawableA;
        StringBuilder sb3;
        int i15;
        int i16;
        String strA;
        int i17;
        int i18;
        String str;
        String line4;
        String line3;
        String line2;
        String line1;
        String lastName;
        String firstName;
        f0Var.getClass();
        b bVarR = r(i14);
        boolean z14 = bVarR instanceof b.C0290c;
        Context context = this.f19442b;
        if (z14) {
            ip2.c cVar = f0Var instanceof ip2.c ? (ip2.c) f0Var : null;
            if (cVar != null) {
                cVar.f94724a.setText(context.getString(R.string.pay_select_billing_address));
                return;
            }
            return;
        }
        if (bVarR instanceof b.C0289b) {
            ip2.b bVar2 = f0Var instanceof ip2.b ? (ip2.b) f0Var : null;
            if (bVar2 != null) {
                if (bVar2.getBindingAdapterPosition() == -1) {
                    c0289b = null;
                } else {
                    b bVarR2 = r(bVar2.getBindingAdapterPosition());
                    if (!(bVarR2 instanceof b.C0289b)) {
                        bVarR2 = null;
                    }
                    c0289b = (b.C0289b) bVarR2;
                }
                fj2.a aVar = c0289b != null ? c0289b.f19451a : null;
                j jVar = this.f19443c;
                bp2.b bVar3 = new bp2.b(aVar, this, i14, 0);
                bp2.b bVar4 = new bp2.b(aVar, this, i14, 1);
                bp2.b bVar5 = new bp2.b(aVar, this, i14, 2);
                ImageView imageView = bVar2.f94721k;
                TextView textView = bVar2.f94720j;
                LinearLayout linearLayout = bVar2.f94719i;
                TextView textView2 = bVar2.f94713c;
                ImageView imageView2 = bVar2.f94722l;
                TextView textView3 = bVar2.f94717g;
                TextView textView4 = bVar2.f94716f;
                TextView textView5 = bVar2.f94715e;
                TextView textView6 = bVar2.f94714d;
                View view3 = bVar2.f94711a;
                jVar.getClass();
                ConstraintLayout constraintLayout = bVar2.f94712b;
                if (aVar != null) {
                    bVar = bVar4;
                    view2 = view3;
                    if (aVar.f71863r) {
                        drawableA = j.a.a(view2.getContext(), R.color.surface_2);
                    }
                    constraintLayout.setBackground(drawableA);
                    sb3 = new StringBuilder();
                    if (aVar != null && (firstName = aVar.getFirstName()) != null) {
                        sb3.append(firstName);
                        sb3.append(StringUtils.SPACE);
                    }
                    if (aVar != null && (lastName = aVar.getLastName()) != null) {
                        sb3.append(lastName);
                    }
                    if (sb3.toString().length() == 0) {
                        textView2.setVisibility(8);
                        i15 = 0;
                    } else {
                        i15 = 0;
                        textView2.setVisibility(0);
                        textView2.setText(sb3.toString());
                    }
                    if (aVar != null || (line1 = aVar.getLine1()) == null) {
                        i16 = 8;
                        textView6.setVisibility(8);
                    } else {
                        textView6.setVisibility(i15);
                        textView6.setText(line1);
                        i16 = 8;
                    }
                    if (aVar != null || (line2 = aVar.getLine2()) == null) {
                        textView5.setVisibility(i16);
                    } else {
                        textView5.setVisibility(i15);
                        textView5.setText(line2);
                    }
                    if (aVar != null || (line3 = aVar.getLine3()) == null) {
                        textView4.setVisibility(i16);
                    } else {
                        textView4.setVisibility(i15);
                        textView4.setText(line3);
                    }
                    if (aVar != null || (line4 = aVar.getLine4()) == null) {
                        textView3.setVisibility(i16);
                    } else {
                        textView3.setVisibility(i15);
                        textView3.setText(line4);
                    }
                    if (aVar != null || (str = aVar.f71862q) == null) {
                        linearLayout.setVisibility(i16);
                    } else {
                        linearLayout.setVisibility(i15);
                        bVar2.f94718h.setText(str);
                    }
                    if (aVar != null) {
                        mj2.c.f119091a.getClass();
                        strA = mj2.c.a(aVar);
                    } else {
                        strA = null;
                    }
                    textView.setVisibility(0);
                    textView.setText(strA);
                    i17 = ip2.b.a.f94723a[jVar.ordinal()];
                    if (i17 != 1) {
                        imageView2.setVisibility(8);
                        if (aVar == null && aVar.f71863r) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        imageView.setVisibility(i18);
                    } else if (i17 == 2) {
                        imageView.setVisibility(8);
                        imageView2.setVisibility(0);
                    }
                    imageView2.setOnClickListener(new g0(bVar5, 22));
                    View view4 = view2;
                    view4.setOnClickListener(new g0(bVar3, 23));
                    view4.setOnLongClickListener(new gc0.a(bVar, 1));
                }
                view2 = view3;
                bVar = bVar4;
                drawableA = j.a.a(view2.getContext(), R.color.surface_1);
                constraintLayout.setBackground(drawableA);
                sb3 = new StringBuilder();
                if (aVar != null) {
                    sb3.append(firstName);
                    sb3.append(StringUtils.SPACE);
                }
                if (aVar != null) {
                    sb3.append(lastName);
                }
                if (sb3.toString().length() == 0) {
                    textView2.setVisibility(8);
                    i15 = 0;
                } else {
                    i15 = 0;
                    textView2.setVisibility(0);
                    textView2.setText(sb3.toString());
                }
                if (aVar != null) {
                    i16 = 8;
                    textView6.setVisibility(8);
                } else {
                    i16 = 8;
                    textView6.setVisibility(8);
                }
                if (aVar != null) {
                    textView5.setVisibility(i16);
                } else {
                    textView5.setVisibility(i16);
                }
                if (aVar != null) {
                    textView4.setVisibility(i16);
                } else {
                    textView4.setVisibility(i16);
                }
                if (aVar != null) {
                    textView3.setVisibility(i16);
                } else {
                    textView3.setVisibility(i16);
                }
                if (aVar != null) {
                    linearLayout.setVisibility(i16);
                } else {
                    linearLayout.setVisibility(i16);
                }
                if (aVar != null) {
                    mj2.c.f119091a.getClass();
                    strA = mj2.c.a(aVar);
                } else {
                    strA = null;
                }
                textView.setVisibility(0);
                textView.setText(strA);
                i17 = ip2.b.a.f94723a[jVar.ordinal()];
                if (i17 != 1) {
                    imageView2.setVisibility(8);
                    if (aVar == null) {
                        i18 = 8;
                    } else {
                        i18 = 8;
                    }
                    imageView.setVisibility(i18);
                } else if (i17 == 2) {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(0);
                }
                imageView2.setOnClickListener(new g0(bVar5, 22));
                View view5 = view2;
                view5.setOnClickListener(new g0(bVar3, 23));
                view5.setOnLongClickListener(new gc0.a(bVar, 1));
            }
        } else {
            if (!(bVarR instanceof b.a)) {
                if (!(bVarR instanceof b.d)) {
                    u0.r();
                    return;
                }
                n nVar = f0Var instanceof n ? (n) f0Var : null;
                if (nVar != null) {
                    context.getClass();
                    nVar.f65103a.getLayoutParams().height = (int) context.getResources().getDimension(R.dimen.spacing_small);
                    return;
                }
                return;
            }
            ip2.a aVar2 = f0Var instanceof ip2.a ? (ip2.a) f0Var : null;
            if (aVar2 != null) {
                fp2.c cVar2 = fp2.c.f73188a;
                List<fj2.a> list = f19440g;
                cVar2.getClass();
                boolean z15 = fp2.c.a(list) == null;
                s4 s4Var = new s4(this, 21);
                context.getClass();
                aVar2.f94708b.setText(context.getString(R.string.pay_add_new_address));
                aVar2.f94709c.setVisibility(z15 ? 0 : 8);
                aVar2.f94707a.setOnClickListener(new g0(s4Var, 21));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = this.f19442b;
        if (i14 == 0) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_header_section, viewGroup, false);
            viewInflate.getClass();
            return new ip2.c(viewInflate);
        }
        if (i14 == 1) {
            View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_address_section, viewGroup, false);
            viewInflate2.getClass();
            return new ip2.b(viewInflate2);
        }
        if (i14 != 2) {
            View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_empty_section, viewGroup, false);
            viewInflate3.getClass();
            return new n(viewInflate3);
        }
        View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.item_add_new_address_section, viewGroup, false);
        viewInflate4.getClass();
        return new ip2.a(viewInflate4);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lbp2/c$b;", "", "<init>", "()V", "c", "b", "a", "d", "Lbp2/c$b$a;", "Lbp2/c$b$b;", "Lbp2/c$b$c;", "Lbp2/c$b$d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/c$b$a;", "Lbp2/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f19450a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 491215983;
            }

            public final String toString() {
                return "AddNewAddressSection";
            }
        }

        /* JADX INFO: renamed from: bp2.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbp2/c$b$b;", "Lbp2/c$b;", "Lfj2/a;", "addressDTO", "<init>", "(Lfj2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0289b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final fj2.a f19451a;

            static {
                Parcelable.Creator<fj2.a> creator = fj2.a.CREATOR;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0289b(fj2.a aVar) {
                super(null);
                aVar.getClass();
                this.f19451a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0289b) && s.g(this.f19451a, ((C0289b) obj).f19451a);
            }

            public final int hashCode() {
                return this.f19451a.hashCode();
            }

            public final String toString() {
                return "AddressSection(addressDTO=" + this.f19451a + ")";
            }
        }

        /* JADX INFO: renamed from: bp2.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/c$b$c;", "Lbp2/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0290c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0290c f19452a = new C0290c();

            private C0290c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0290c);
            }

            public final int hashCode() {
                return -1751714731;
            }

            public final String toString() {
                return "AddressesHeaderSection";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/c$b$d;", "Lbp2/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {
            static {
                new d();
            }

            private d() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -375308073;
            }

            public final String toString() {
                return "EmptySection";
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: bp2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lbp2/c$c;", "", "<init>", "()V", "", "Lfj2/a;", "currentItemList", "Ljava/util/List;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "TYPE_ADDRESSES_HEADER_SECTION", "I", "TYPE_ADDRESS_SECTION", "TYPE_ADD_NEW_ADDRESS_SECTION", "TYPE_EMPTY_SECTION", "PAYLOAD_ALL", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0291c {
        public /* synthetic */ C0291c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static ArrayList a(String str, List list) {
            ArrayList arrayListL = androidx.core.view.j.l(list);
            c.f19440g = list;
            arrayListL.add(b.C0290c.f19452a);
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                fj2.a aVar = (fj2.a) obj;
                if (s.g(aVar.getAddressId(), str)) {
                    aVar.f71863r = true;
                    arrayListL.add(new b.C0289b(aVar));
                } else {
                    arrayListL.add(new b.C0289b(aVar));
                }
                i14 = i15;
            }
            arrayListL.add(b.a.f19450a);
            return arrayListL;
        }

        private C0291c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lbp2/c$d;", "", "<init>", "()V", "b", "a", "Lbp2/c$d$a;", "Lbp2/c$d$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/c$d$a;", "Lbp2/c$d;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f19453a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -238787191;
            }

            public final String toString() {
                return "AddNewAddressItem";
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbp2/c$d$b;", "Lbp2/c$d;", "Lfj2/a;", "addressDTO", "", ModelSourceWrapper.POSITION, "Lbp2/c$a;", "clickType", "<init>", "(Lfj2/a;ILbp2/c$a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final fj2.a f19454a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f19455b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a f19456c;

            static {
                Parcelable.Creator<fj2.a> creator = fj2.a.CREATOR;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(fj2.a aVar, int i14, a aVar2) {
                super(null);
                aVar.getClass();
                aVar2.getClass();
                this.f19454a = aVar;
                this.f19455b = i14;
                this.f19456c = aVar2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return s.g(this.f19454a, bVar.f19454a) && this.f19455b == bVar.f19455b && this.f19456c == bVar.f19456c;
            }

            public final int hashCode() {
                return this.f19456c.hashCode() + q2.d(this.f19455b, this.f19454a.hashCode() * 31, 31);
            }

            public final String toString() {
                return "AddressItem(addressDTO=" + this.f19454a + ", position=" + this.f19455b + ", clickType=" + this.f19456c + ")";
            }
        }

        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }
}
