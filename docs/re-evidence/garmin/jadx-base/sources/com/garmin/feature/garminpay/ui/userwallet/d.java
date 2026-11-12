package com.garmin.feature.garminpay.ui.userwallet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import androidx.room.a0;
import c22.s3;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.v;
import e23.l;
import java.util.List;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.g0;
import p13.j0;
import t61.m;
import tn.k;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/feature/garminpay/ui/userwallet/d$g;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "f", "g", "c", "b", JWKParameterNames.RSA_EXPONENT, "a", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends x<g, RecyclerView.f0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f52283d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f52284e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m13.a<c> f52285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f52286c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lk32/g;", "holder", "<init>", "(Lk32/g;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {
        /* JADX WARN: Illegal instructions before constructor call */
        public a(k32.g gVar) {
            gVar.getClass();
            View view2 = gVar.f102685a;
            super(view2);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.getClass();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) view2.getResources().getDimension(R.dimen.spacing_normal);
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$d;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/feature/garminpay/ui/userwallet/d$g;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1112d extends o.f<g> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(g gVar, g gVar2) {
            g gVar3 = gVar;
            g gVar4 = gVar2;
            gVar3.getClass();
            gVar4.getClass();
            return gVar4.equals(gVar3);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(g gVar, g gVar2) {
            g gVar3 = gVar;
            g gVar4 = gVar2;
            gVar3.getClass();
            gVar4.getClass();
            if ((gVar3 instanceof g.b) && (gVar4 instanceof g.b)) {
                return true;
            }
            return ((gVar3 instanceof g.a) && (gVar4 instanceof g.a)) || gVar4 == gVar3;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(g gVar, g gVar2) {
            g gVar3 = gVar;
            g gVar4 = gVar2;
            gVar3.getClass();
            gVar4.getClass();
            return Integer.valueOf(((gVar3 instanceof g.b) && (gVar4 instanceof g.b)) ? ((g.b) gVar3).f52301a.b(((g.b) gVar4).f52301a) : -1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends RecyclerView.f0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f52290h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f52291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f52292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f52293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CardView f52294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f52295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f52296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f52297g;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52298a;

            static {
                int[] iArr = new int[br2.g.values().length];
                try {
                    iArr[br2.g.PAY_ENABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[br2.g.PAY_NOT_ENABLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f52298a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.text_over_card_image);
            viewFindViewById.getClass();
            this.f52291a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.image_user_wallet_card_item);
            viewFindViewById2.getClass();
            this.f52292b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.image_user_wallet_card_item_rounded);
            viewFindViewById3.getClass();
            this.f52293c = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.card_view_wallet_card_item);
            viewFindViewById4.getClass();
            this.f52294d = (CardView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.image_card_flag);
            viewFindViewById5.getClass();
            this.f52295e = (ImageView) viewFindViewById5;
            View viewFindViewById6 = view2.findViewById(R.id.text_user_wallet_item_card_title);
            viewFindViewById6.getClass();
            this.f52296f = (TextView) viewFindViewById6;
            View viewFindViewById7 = view2.findViewById(R.id.text_user_wallet_item_card_subtitle);
            viewFindViewById7.getClass();
            this.f52297g = (TextView) viewFindViewById7;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$f;", "", "", "Lcom/garmin/feature/garminpay/ui/userwallet/d$g;", "displayList", "<init>", "(Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<g> f52299a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends g> list) {
            list.getClass();
            this.f52299a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f52299a.equals(((f) obj).f52299a);
        }

        public final int hashCode() {
            return this.f52299a.hashCode();
        }

        public final String toString() {
            return k.h("UserWalletDisplayAdapterState(displayList=", ")", this.f52299a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f52302a = new h();

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Integer);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52284e = gt2.b.f79005a.h("PAY#UserWalletAdapter");
    }

    public d() {
        super(new C1112d());
        m13.a<c> aVar = new m13.a<>();
        this.f52285b = aVar;
        this.f52286c = aVar.g(r03.a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        g gVarR = r(i14);
        gVarR.getClass();
        g gVar = gVarR;
        if (s.g(gVar, g.a.f52300a)) {
            return 0;
        }
        if (gVar instanceof g.b) {
            return 1;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<? extends Object> list) {
        int iIntValue;
        g.b bVar;
        is2.b bVar2;
        f0Var.getClass();
        list.getClass();
        g gVarR = r(i14);
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            c53.g.a aVar = new c53.g.a(c0.h(new g0(list), h.f52302a));
            if (!aVar.hasNext()) {
                org.apache.commons.lang3.e.w("Empty sequence can't be reduced.");
                return;
            }
            Object next = aVar.next();
            while (aVar.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() | ((Number) aVar.next()).intValue());
            }
            iIntValue = ((Number) next).intValue();
        } else {
            iIntValue = -1;
        }
        if (s.g(gVarR, g.a.f52300a)) {
            if ((f0Var instanceof a ? (a) f0Var : null) != null) {
                f0Var.itemView.setOnClickListener(new m(this, 5));
                return;
            }
            return;
        }
        if (!(gVarR instanceof g.b)) {
            u0.r();
            return;
        }
        e eVar = f0Var instanceof e ? (e) f0Var : null;
        if (eVar != null) {
            if (eVar.getBindingAdapterPosition() == -1) {
                bVar = null;
            } else {
                g gVarR2 = r(eVar.getBindingAdapterPosition());
                if (!(gVarR2 instanceof g.b)) {
                    gVarR2 = null;
                }
                bVar = (g.b) gVarR2;
            }
            q qVar = bVar != null ? bVar.f52301a : null;
            if (qVar != null) {
                f52284e.debug("bind(" + qVar + ", " + i14);
                e eVar2 = (e) f0Var;
                CardView cardView = eVar2.f52294d;
                ImageView imageView = eVar2.f52292b;
                s3.f23252a.getClass();
                if (s3.a("ROLE_MBTESTER")) {
                    eVar2.itemView.setOnLongClickListener(new b00.c(6, eVar2, qVar));
                }
                int i15 = 8;
                if ((iIntValue & 1) != 0 && (bVar2 = qVar.f179660g) != null) {
                    yq2.b bVarA = yr2.m.a(bVar2);
                    if (qVar.f179655b != null) {
                        imageView.setVisibility(0);
                        cardView.setVisibility(8);
                        bVarA.e(imageView, qVar, 30);
                        bVarA.c(eVar2.f52291a, qVar);
                    } else {
                        imageView.setVisibility(8);
                        cardView.setVisibility(0);
                        yq2.b.f(eVar2.f52293c, qVar);
                    }
                }
                ImageView imageView2 = eVar2.f52295e;
                br2.g gVar = qVar.f179659f;
                int i16 = gVar != null ? e.a.f52298a[gVar.ordinal()] : -1;
                imageView2.setVisibility((i16 == 1 || i16 == 2) ? 8 : 0);
                if ((iIntValue & 2) != 0) {
                    eVar2.f52296f.setText(qVar.f179654a);
                }
                if ((iIntValue & 4) != 0) {
                    String str = w3.x.r(qVar.f179658e) ? qVar.f179657d : null;
                    TextView textView = eVar2.f52297g;
                    if (str != null) {
                        textView.setText(str);
                        i15 = 0;
                    }
                    textView.setVisibility(i15);
                }
                eVar.itemView.setOnClickListener(new pm0.h(25, this, qVar));
                eVar.itemView.setOnLongClickListener(new b00.c(5, this, qVar));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == 0) {
            View viewD = a0.d(viewGroup, R.layout.system_message_card, viewGroup, false);
            viewD.getClass();
            return new a(new k32.g(viewD, k32.g.a.BLUETOOTH));
        }
        View viewD2 = a0.d(viewGroup, R.layout.user_wallet_card_item, viewGroup, false);
        viewD2.getClass();
        return new e(viewD2);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$b;", "", "<init>", "()V", "", "TYPE_BLUETOOTH_BANNER_ITEM", "I", "TYPE_CARD_ITEM", "PAYLOAD_ALL", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$c;", "", "<init>", "()V", "a", "b", "Lcom/garmin/feature/garminpay/ui/userwallet/d$c$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/d$c$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$c$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/d$c;", "", "isLongClick", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52287a;

            public a(boolean z14) {
                super(null);
                this.f52287a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f52287a == ((a) obj).f52287a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52287a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("BluetoothBannerItem(isLongClick=", ")", this.f52287a);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$c$b;", "Lcom/garmin/feature/garminpay/ui/userwallet/d$c;", "Lvr2/q;", ModelSourceWrapper.TYPE, "", "isLongClick", "<init>", "(Lvr2/q;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f52288a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f52289b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q qVar, boolean z14) {
                super(null);
                qVar.getClass();
                this.f52288a = qVar;
                this.f52289b = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return s.g(this.f52288a, bVar.f52288a) && this.f52289b == bVar.f52289b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52289b) + (this.f52288a.hashCode() * 31);
            }

            public final String toString() {
                return "CardItem(model=" + this.f52288a + ", isLongClick=" + this.f52289b + ")";
            }
        }

        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$g;", "", "<init>", "()V", "a", "b", "Lcom/garmin/feature/garminpay/ui/userwallet/d$g$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/d$g$b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class g {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$g$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/d$g;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f52300a = new a();

            private a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/d$g$b;", "Lcom/garmin/feature/garminpay/ui/userwallet/d$g;", "Lvr2/q;", ModelSourceWrapper.TYPE, "<init>", "(Lvr2/q;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f52301a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q qVar) {
                super(null);
                qVar.getClass();
                this.f52301a = qVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.g(this.f52301a, ((b) obj).f52301a);
            }

            public final int hashCode() {
                return this.f52301a.hashCode();
            }

            public final String toString() {
                return "CardItem(model=" + this.f52301a + ")";
            }
        }

        public /* synthetic */ g(j jVar) {
            this();
        }

        private g() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        onBindViewHolder(f0Var, i14, j0.f134944a);
    }
}
