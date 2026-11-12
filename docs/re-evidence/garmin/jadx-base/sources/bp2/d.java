package bp2;

import a61.d0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.v;
import e23.l;
import i3.e5;
import java.util.List;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.g0;
import p13.j0;
import tn.k;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lbp2/d;", "Landroidx/recyclerview/widget/x;", "Lbp2/d$e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "f", JWKParameterNames.RSA_EXPONENT, "b", "a", "d", "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends x<e, RecyclerView.f0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f19457d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f19458e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m13.a<b> f19459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f19460c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbp2/d$c;", "Landroidx/recyclerview/widget/o$f;", "Lbp2/d$e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends o.f<e> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            eVar3.getClass();
            eVar4.getClass();
            return eVar4.equals(eVar3);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            eVar3.getClass();
            eVar4.getClass();
            return ((eVar3 instanceof e.a) && (eVar4 instanceof e.a)) || eVar4 == eVar3;
        }
    }

    /* JADX INFO: renamed from: bp2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbp2/d$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0292d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardView f19462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f19463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f19464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f19465d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0292d(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.payment_card_view);
            viewFindViewById.getClass();
            this.f19462a = (CardView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.payment_card_item_image);
            viewFindViewById2.getClass();
            this.f19463b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.payment_card_item_image_rounded);
            viewFindViewById3.getClass();
            this.f19464c = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.payment_card_item_card_title);
            viewFindViewById4.getClass();
            this.f19465d = (TextView) viewFindViewById4;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbp2/d$f;", "", "", "Lbp2/d$e;", "displayList", "<init>", "(Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<e> f19467a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends e> list) {
            list.getClass();
            this.f19467a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f19467a.equals(((f) obj).f19467a);
        }

        public final int hashCode() {
            return this.f19467a.hashCode();
        }

        public final String toString() {
            return k.h("PaymentCardsListDisplayAdapterState(displayList=", ")", this.f19467a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f19468a = new g();

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Integer);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f19458e = gt2.b.f79005a.h("PAY#PaymentCardsListAdapter");
    }

    public d() {
        super(new c());
        m13.a<b> aVar = new m13.a<>();
        this.f19459b = aVar;
        this.f19460c = aVar.g(r03.a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        e eVarR = r(i14);
        eVarR.getClass();
        if (eVarR instanceof e.a) {
            return 0;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<? extends Object> list) {
        e.a aVar;
        f0Var.getClass();
        list.getClass();
        e eVarR = r(i14);
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            c53.g.a aVar2 = new c53.g.a(c0.h(new g0(list), g.f19468a));
            if (!aVar2.hasNext()) {
                org.apache.commons.lang3.e.w("Empty sequence can't be reduced.");
                return;
            }
            Object next = aVar2.next();
            while (aVar2.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() | ((Number) aVar2.next()).intValue());
            }
            ((Number) next).intValue();
        }
        if (!(eVarR instanceof e.a)) {
            u0.r();
            return;
        }
        C0292d c0292d = f0Var instanceof C0292d ? (C0292d) f0Var : null;
        if (c0292d != null) {
            if (c0292d.getBindingAdapterPosition() == -1) {
                aVar = null;
            } else {
                e eVarR2 = r(c0292d.getBindingAdapterPosition());
                if (!(eVarR2 instanceof e.a)) {
                    eVarR2 = null;
                }
                aVar = (e.a) eVarR2;
            }
            zo2.a aVar3 = aVar != null ? aVar.f19466a : null;
            if (aVar3 != null) {
                f19458e.debug("bind(" + aVar3 + ", " + i14);
                C0292d c0292d2 = (C0292d) f0Var;
                CardView cardView = c0292d2.f19462a;
                c0292d2.f19465d.setText(aVar3.getDisplayName());
                String strM = zo2.a.m(aVar3);
                ImageView imageView = c0292d2.f19463b;
                if (strM != null) {
                    imageView.setVisibility(0);
                    cardView.setVisibility(8);
                    j.a(imageView, strM, 10, aVar3.getCardType());
                } else {
                    imageView.setVisibility(8);
                    cardView.setVisibility(0);
                    c0292d2.f19464c.setImageResource(aVar3.q());
                }
                c0292d.itemView.setOnClickListener(new d0(17, this, aVar3));
                c0292d.itemView.setOnLongClickListener(new b00.c(1, this, aVar3));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.payment_card_item, viewGroup, false);
        viewE.getClass();
        return new C0292d(viewE);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbp2/d$a;", "", "<init>", "()V", "", "TYPE_PAYMENT_CARD_ITEM", "I", "PAYLOAD_ALL", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lbp2/d$b;", "", "<init>", "()V", "a", "Lbp2/d$b$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbp2/d$b$a;", "Lbp2/d$b;", "Lzo2/a;", ModelSourceWrapper.TYPE, "<init>", "(Lzo2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zo2.a f19461a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zo2.a aVar) {
                super(null);
                aVar.getClass();
                this.f19461a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.g(this.f19461a, ((a) obj).f19461a);
            }

            public final int hashCode() {
                return this.f19461a.hashCode();
            }

            public final String toString() {
                return "PaymentCardItem(model=" + this.f19461a + ")";
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lbp2/d$e;", "", "<init>", "()V", "a", "Lbp2/d$e$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbp2/d$e$a;", "Lbp2/d$e;", "Lzo2/a;", ModelSourceWrapper.TYPE, "<init>", "(Lzo2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zo2.a f19466a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zo2.a aVar) {
                super(null);
                aVar.getClass();
                this.f19466a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.g(this.f19466a, ((a) obj).f19466a);
            }

            public final int hashCode() {
                return this.f19466a.hashCode();
            }

            public final String toString() {
                return "PaymentCardItem(model=" + this.f19466a + ")";
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
