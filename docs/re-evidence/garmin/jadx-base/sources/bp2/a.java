package bp2;

import a61.d0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.v;
import er2.n;
import java.util.List;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import tn.k;
import u62.z;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\b\t\n\u000b\f\r\u000eB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lbp2/a;", "Landroidx/recyclerview/widget/x;", "Lbp2/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "c", "b", JWKParameterNames.RSA_EXPONENT, "d", "g", "a", "f", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends x<b, RecyclerView.f0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f19420d = new d(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f19421e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m13.a<e> f19422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f19423c;

    /* JADX INFO: renamed from: bp2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbp2/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0285a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Button f19424a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0285a(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.add_card_button);
            viewFindViewById.getClass();
            this.f19424a = (Button) viewFindViewById;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbp2/a$c;", "", "", "Lbp2/a$b;", "displayList", "<init>", "(Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<b> f19429a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends b> list) {
            list.getClass();
            this.f19429a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f19429a.equals(((c) obj).f19429a);
        }

        public final int hashCode() {
            return this.f19429a.hashCode();
        }

        public final String toString() {
            return k.h("AddCardOptionsDisplayAdapterState(displayList=", ")", this.f19429a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbp2/a$f;", "Landroidx/recyclerview/widget/o$f;", "Lbp2/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends o.f<b> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar4.equals(bVar3);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            if ((bVar3 instanceof b.d) && (bVar4 instanceof b.d)) {
                return true;
            }
            return ((bVar3 instanceof b.C0286a) && (bVar4 instanceof b.C0286a)) || bVar4 == bVar3;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(b bVar, b bVar2) {
            bVar.getClass();
            bVar2.getClass();
            return -1;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbp2/a$g;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f19432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f19433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f19434c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.payment_card_item_image);
            viewFindViewById.getClass();
            this.f19432a = (ImageView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.payment_card_item_name);
            viewFindViewById2.getClass();
            this.f19433b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.payment_card_item_info);
            viewFindViewById3.getClass();
            this.f19434c = (TextView) viewFindViewById3;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f19421e = gt2.b.f79005a.h("PAY#FitPayAddCardOptionsAdapter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(new f());
        context.getClass();
        m13.a<e> aVar = new m13.a<>();
        this.f19422b = aVar;
        this.f19423c = aVar.g(r03.a.a());
    }

    public static int u(b bVar) {
        if (bVar instanceof b.d) {
            return 0;
        }
        if (bVar instanceof b.C0286a) {
            return 1;
        }
        if (bVar instanceof b.C0287b) {
            return 2;
        }
        if (bVar instanceof b.c) {
            return 3;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        b bVarR = r(i14);
        bVarR.getClass();
        return u(bVarR);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<? extends Object> list) {
        b.d dVar;
        f0Var.getClass();
        list.getClass();
        b bVarR = r(i14);
        bVarR.getClass();
        z.i("onBindViewHolder: ", u(bVarR), f19421e);
        if (!(bVarR instanceof b.d)) {
            if (bVarR instanceof b.C0286a) {
                if ((f0Var instanceof C0285a ? (C0285a) f0Var : null) != null) {
                    ((C0285a) f0Var).f19424a.setOnClickListener(new a32.b(this, 19));
                    return;
                }
                return;
            } else {
                if ((bVarR instanceof b.C0287b) || (bVarR instanceof b.c)) {
                    return;
                }
                u0.r();
                return;
            }
        }
        g gVar = f0Var instanceof g ? (g) f0Var : null;
        if (gVar != null) {
            if (gVar.getBindingAdapterPosition() == -1) {
                dVar = null;
            } else {
                b bVarR2 = r(gVar.getBindingAdapterPosition());
                if (!(bVarR2 instanceof b.d)) {
                    bVarR2 = null;
                }
                dVar = (b.d) bVarR2;
            }
            zo2.a aVar = dVar != null ? dVar.f19428a : null;
            if (aVar != null) {
                g gVar2 = (g) f0Var;
                String strM = zo2.a.m(aVar);
                ImageView imageView = gVar2.f19432a;
                if (strM != null) {
                    j.a(imageView, strM, 10, aVar.getCardType());
                    imageView.setContentDescription(aVar.getMaskedPan());
                } else {
                    imageView.setImageResource(aVar.q());
                }
                gVar2.f19433b.setText(aVar.getDisplayName());
                gVar2.f19434c.setText(aVar.getMaskedPan());
                gVar.itemView.setOnClickListener(new d0(16, this, aVar));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        z.i("onCreateViewHolder: ", i14, f19421e);
        if (i14 == 0) {
            View viewD = a0.d(viewGroup, R.layout.item_payment_card, viewGroup, false);
            viewD.getClass();
            return new g(viewD);
        }
        if (i14 == 1) {
            View viewD2 = a0.d(viewGroup, R.layout.item_add_card_button, viewGroup, false);
            viewD2.getClass();
            return new C0285a(viewD2);
        }
        if (i14 == 2) {
            View viewD3 = a0.d(viewGroup, R.layout.item_border_section, viewGroup, false);
            viewD3.getClass();
            return new er2.d(viewD3);
        }
        if (i14 != 3) {
            View viewD4 = a0.d(viewGroup, R.layout.item_empty_section, viewGroup, false);
            viewD4.getClass();
            return new n(viewD4);
        }
        View viewD5 = a0.d(viewGroup, R.layout.item_empty_section, viewGroup, false);
        viewD5.getClass();
        return new n(viewD5);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lbp2/a$b;", "", "<init>", "()V", "d", "a", "b", "c", "Lbp2/a$b$a;", "Lbp2/a$b$b;", "Lbp2/a$b$c;", "Lbp2/a$b$d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: bp2.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/a$b$a;", "Lbp2/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0286a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0286a f19425a = new C0286a();

            private C0286a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0286a);
            }

            public final int hashCode() {
                return -284245919;
            }

            public final String toString() {
                return "AddPaymentCardButtonItem";
            }
        }

        /* JADX INFO: renamed from: bp2.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/a$b$b;", "Lbp2/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0287b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0287b f19426a = new C0287b();

            private C0287b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0287b);
            }

            public final int hashCode() {
                return -1913691854;
            }

            public final String toString() {
                return "BorderSection";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/a$b$c;", "Lbp2/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f19427a = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -31247227;
            }

            public final String toString() {
                return "EmptySpaceSection";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbp2/a$b$d;", "Lbp2/a$b;", "Lzo2/a;", ModelSourceWrapper.TYPE, "<init>", "(Lzo2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zo2.a f19428a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(zo2.a aVar) {
                super(null);
                aVar.getClass();
                this.f19428a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && s.g(this.f19428a, ((d) obj).f19428a);
            }

            public final int hashCode() {
                return this.f19428a.hashCode();
            }

            public final String toString() {
                return "PaymentCardItem(model=" + this.f19428a + ")";
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lbp2/a$d;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "TYPE_PAYMENT_CARD_ITEM", "I", "TYPE_ADD_PAYMENT_CARD_BUTTON_ITEM", "TYPE_BORDER_SECTION", "TYPE_EMPTY_SPACE_ITEM", "PAYLOAD_ALL", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lbp2/a$e;", "", "<init>", "()V", "a", "b", "Lbp2/a$e$a;", "Lbp2/a$e$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class e {

        /* JADX INFO: renamed from: bp2.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbp2/a$e$a;", "Lbp2/a$e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0288a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0288a f19430a = new C0288a();

            private C0288a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0288a);
            }

            public final int hashCode() {
                return 1812964299;
            }

            public final String toString() {
                return "AddPaymentCardButtonItem";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbp2/a$e$b;", "Lbp2/a$e;", "Lzo2/a;", ModelSourceWrapper.TYPE, "<init>", "(Lzo2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zo2.a f19431a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(zo2.a aVar) {
                super(null);
                aVar.getClass();
                this.f19431a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.g(this.f19431a, ((b) obj).f19431a);
            }

            public final int hashCode() {
                return this.f19431a.hashCode();
            }

            public final String toString() {
                return "PaymentCardItem(model=" + this.f19431a + ")";
            }
        }

        public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private e() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        onBindViewHolder(f0Var, i14, j0.f134944a);
    }
}
