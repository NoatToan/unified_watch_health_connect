package com.garmin.feature.garminpay.ui.userwallet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import androidx.room.a0;
import c53.c0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.v;
import e23.l;
import er2.j;
import er2.n;
import er2.r;
import er2.u;
import java.util.List;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.g0;
import p13.j0;
import u62.z;
import vr2.q;
import yr2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\b\t\n\u000b\f\rB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", JWKParameterNames.RSA_EXPONENT, "d", "c", "f", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends x<b, RecyclerView.f0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f52233e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f52234f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f52235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m13.a<e> f52236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f52237d;

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$a;", "", "Lvr2/a;", "deviceModel", "Lvr2/q;", "cardItemViewModel", "", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "fullList", "<init>", "(Lvr2/a;Lvr2/q;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1104a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final vr2.a f52238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f52239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f52240c;

        /* JADX WARN: Multi-variable type inference failed */
        public C1104a(vr2.a aVar, q qVar, List<? extends b> list) {
            qVar.getClass();
            list.getClass();
            this.f52238a = aVar;
            this.f52239b = qVar;
            this.f52240c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1104a)) {
                return false;
            }
            C1104a c1104a = (C1104a) obj;
            return s.g(this.f52238a, c1104a.f52238a) && this.f52239b.equals(c1104a.f52239b) && this.f52240c.equals(c1104a.f52240c);
        }

        public final int hashCode() {
            vr2.a aVar = this.f52238a;
            return this.f52240c.hashCode() + ((this.f52239b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("CardDetailsAdapterStateModel(deviceModel=");
            sb3.append(this.f52238a);
            sb3.append(", cardItemViewModel=");
            sb3.append(this.f52239b);
            sb3.append(", fullList=");
            return z.c(sb3, this.f52240c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f52249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.card_image_view);
            viewFindViewById.getClass();
            this.f52249a = (ImageView) viewFindViewById;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$f;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends o.f<b> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            return bVar3.equals(bVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            if ((bVar3 instanceof b.C1106b) && (bVar4 instanceof b.C1106b)) {
                return true;
            }
            if ((bVar3 instanceof b.d) && (bVar4 instanceof b.d)) {
                return true;
            }
            return ((bVar3 instanceof b.g) && (bVar4 instanceof b.g)) || bVar3 == bVar4;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(b bVar, b bVar2) {
            int iB;
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            if ((bVar3 instanceof b.C1106b) && (bVar4 instanceof b.C1106b)) {
                iB = ((b.C1106b) bVar3).f52242a.b(((b.C1106b) bVar4).f52242a);
            } else if ((bVar3 instanceof b.d) && (bVar4 instanceof b.d)) {
                iB = ((b.d) bVar3).f52244a.b(((b.d) bVar4).f52244a);
            } else {
                iB = ((bVar3 instanceof b.g) && (bVar4 instanceof b.g)) ? ((b.g) bVar3).f52247a.b(((b.g) bVar4).f52247a) : -1;
            }
            return Integer.valueOf(iB);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f52251a = new g();

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Integer);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52234f = gt2.b.f79005a.h("PAY#CardDetailsAdapter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(new f());
        context.getClass();
        this.f52235b = context;
        m13.a<e> aVar = new m13.a<>();
        this.f52236c = aVar;
        this.f52237d = aVar.g(r03.a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        b bVarR = r(i14);
        bVarR.getClass();
        b bVar = bVarR;
        if (bVar instanceof b.C1106b) {
            return 0;
        }
        if (s.g(bVar, b.f.f52246a)) {
            return 1;
        }
        if (bVar instanceof b.d) {
            return 2;
        }
        if (bVar instanceof b.e) {
            return 3;
        }
        if (bVar instanceof b.h) {
            return 4;
        }
        if (bVar instanceof b.g) {
            return 5;
        }
        if (s.g(bVar, b.c.f52243a)) {
            return 6;
        }
        if (s.g(bVar, b.C1105a.f52241a)) {
            return 7;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<? extends Object> list) {
        int iIntValue;
        b.g gVar;
        b.d dVar;
        b.C1106b c1106b;
        is2.b bVar;
        f0Var.getClass();
        list.getClass();
        b bVarR = r(i14);
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            c53.g.a aVar = new c53.g.a(c0.h(new g0(list), g.f52251a));
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
        if (bVarR instanceof b.C1106b) {
            c cVar = f0Var instanceof c ? (c) f0Var : null;
            if (cVar != null) {
                if (cVar.getBindingAdapterPosition() == -1) {
                    c1106b = null;
                } else {
                    b bVarR2 = r(cVar.getBindingAdapterPosition());
                    if (!(bVarR2 instanceof b.C1106b)) {
                        bVarR2 = null;
                    }
                    c1106b = (b.C1106b) bVarR2;
                }
                q qVar = c1106b != null ? c1106b.f52242a : null;
                if (qVar == null || (bVar = qVar.f179660g) == null) {
                    return;
                }
                m.a(bVar).e(cVar.f52249a, qVar, 30);
                return;
            }
            return;
        }
        boolean zG = s.g(bVarR, b.f.f52246a);
        Context context = this.f52235b;
        if (zG) {
            u uVar = f0Var instanceof u ? (u) f0Var : null;
            if (uVar != null) {
                uVar.f65121a.setText(context.getString(R.string.wallet_card_enabled));
                return;
            }
            return;
        }
        if (bVarR instanceof b.d) {
            j jVar = f0Var instanceof j ? (j) f0Var : null;
            if (jVar != null) {
                if (jVar.getBindingAdapterPosition() == -1) {
                    dVar = null;
                } else {
                    b bVarR3 = r(jVar.getBindingAdapterPosition());
                    if (!(bVarR3 instanceof b.d)) {
                        bVarR3 = null;
                    }
                    dVar = (b.d) bVarR3;
                }
                final br2.f fVar = dVar != null ? dVar.f52244a : null;
                jVar.d(context, fVar, iIntValue, j.a.DEVICE_ONLY_ITEM);
                final int i15 = 0;
                jVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: tr2.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i16 = i15;
                        com.garmin.feature.garminpay.ui.userwallet.a aVar2 = this;
                        br2.f fVar2 = fVar;
                        switch (i16) {
                            case 0:
                                if (fVar2 == null) {
                                    com.garmin.feature.garminpay.ui.userwallet.a.d dVar2 = com.garmin.feature.garminpay.ui.userwallet.a.f52233e;
                                } else {
                                    aVar2.f52236c.c(new com.garmin.feature.garminpay.ui.userwallet.a.e.C1107a(fVar2));
                                }
                                break;
                            default:
                                if (fVar2 == null) {
                                    com.garmin.feature.garminpay.ui.userwallet.a.d dVar3 = com.garmin.feature.garminpay.ui.userwallet.a.f52233e;
                                } else {
                                    aVar2.f52236c.c(new com.garmin.feature.garminpay.ui.userwallet.a.e.C1107a(fVar2));
                                }
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (bVarR instanceof b.e) {
            er2.o oVar = f0Var instanceof er2.o ? (er2.o) f0Var : null;
            if (oVar != null) {
                oVar.f65104a.setText(context.getString(R.string.wallet_view_watch_details_message));
                return;
            }
            return;
        }
        if (bVarR instanceof b.h) {
            u uVar2 = f0Var instanceof u ? (u) f0Var : null;
            if (uVar2 != null) {
                uVar2.f65121a.setText(context.getString(R.string.wallet_card_not_enabled));
                return;
            }
            return;
        }
        if (!(bVarR instanceof b.g)) {
            f52234f.debug("onBindViewHolder: " + bVarR + " not handled");
            return;
        }
        j jVar2 = f0Var instanceof j ? (j) f0Var : null;
        if (jVar2 != null) {
            if (jVar2.getBindingAdapterPosition() == -1) {
                gVar = null;
            } else {
                b bVarR4 = r(jVar2.getBindingAdapterPosition());
                if (!(bVarR4 instanceof b.g)) {
                    bVarR4 = null;
                }
                gVar = (b.g) bVarR4;
            }
            final br2.f fVar2 = gVar != null ? gVar.f52247a : null;
            jVar2.d(context, fVar2, iIntValue, j.a.DEVICE_WITH_ENABLE_PAY_OPTIONS_ITEM);
            final int i16 = 1;
            jVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: tr2.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i17 = i16;
                    com.garmin.feature.garminpay.ui.userwallet.a aVar2 = this;
                    br2.f fVar3 = fVar2;
                    switch (i17) {
                        case 0:
                            if (fVar3 == null) {
                                com.garmin.feature.garminpay.ui.userwallet.a.d dVar2 = com.garmin.feature.garminpay.ui.userwallet.a.f52233e;
                            } else {
                                aVar2.f52236c.c(new com.garmin.feature.garminpay.ui.userwallet.a.e.C1107a(fVar3));
                            }
                            break;
                        default:
                            if (fVar3 == null) {
                                com.garmin.feature.garminpay.ui.userwallet.a.d dVar3 = com.garmin.feature.garminpay.ui.userwallet.a.f52233e;
                            } else {
                                aVar2.f52236c.c(new com.garmin.feature.garminpay.ui.userwallet.a.e.C1107a(fVar3));
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = this.f52235b;
        switch (i14) {
            case 0:
                View viewD = a0.d(viewGroup, R.layout.item_card_image, viewGroup, false);
                viewD.getClass();
                return new c(viewD);
            case 1:
            case 4:
                View viewD2 = a0.d(viewGroup, R.layout.item_section_header, viewGroup, false);
                viewD2.getClass();
                return new u(viewD2);
            case 2:
            case 5:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_selectable_device, viewGroup, false);
                viewInflate.getClass();
                return new j(viewInflate);
            case 3:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_info_text, viewGroup, false);
                viewInflate2.getClass();
                return new er2.o(viewInflate2);
            case 6:
            default:
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_empty_section, viewGroup, false);
                viewInflate3.getClass();
                return new n(viewInflate3);
            case 7:
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.item_border_section, viewGroup, false);
                viewInflate4.getClass();
                return new er2.d(viewInflate4);
            case 8:
                View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.item_link_button, viewGroup, false);
                viewInflate5.getClass();
                return new r(viewInflate5);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "", "<init>", "()V", "b", "f", "d", JWKParameterNames.RSA_EXPONENT, "h", "g", "c", "a", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b$b;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b$c;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b$d;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b$e;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b$f;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b$g;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b$h;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1105a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1105a f52241a = new C1105a();

            private C1105a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b$b;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "Lvr2/q;", ModelSourceWrapper.TYPE, "<init>", "(Lvr2/q;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1106b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f52242a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1106b(q qVar) {
                super(null);
                qVar.getClass();
                this.f52242a = qVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1106b) && s.g(this.f52242a, ((C1106b) obj).f52242a);
            }

            public final int hashCode() {
                return this.f52242a.hashCode();
            }

            public final String toString() {
                return "CardImageSection(model=" + this.f52242a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b$c;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f52243a = new c();

            private c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b$d;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "Lbr2/f;", ModelSourceWrapper.TYPE, "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52244a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(br2.f fVar) {
                super(null);
                fVar.getClass();
                this.f52244a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && s.g(this.f52244a, ((d) obj).f52244a);
            }

            public final int hashCode() {
                return this.f52244a.hashCode();
            }

            public final String toString() {
                return "PayEnabledDevice(model=" + this.f52244a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b$e;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f52245a = new e();

            private e() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b$f;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f52246a = new f();

            private f() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b$g;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "Lbr2/f;", ModelSourceWrapper.TYPE, "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52247a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(br2.f fVar) {
                super(null);
                fVar.getClass();
                this.f52247a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && s.g(this.f52247a, ((g) obj).f52247a);
            }

            public final int hashCode() {
                return this.f52247a.hashCode();
            }

            public final String toString() {
                return "PayNotEnabledDevice(model=" + this.f52247a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$b$h;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f52248a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$d;", "", "<init>", "()V", "", "TYPE_CARD_IMAGE_SECTION", "I", "TYPE_PAY_ENABLED_DEVICES_HEADER_SECTION", "TYPE_PAY_ENABLED_DEVICES_SECTION", "TYPE_PAY_ENABLED_DEVICES_INFO_SECTION", "TYPE_PAY_NOT_ENABLED_DEVICES_HEADER_SECTION", "TYPE_PAY_NOT_ENABLED_DEVICES_SECTION", "TYPE_EMPTY_SECTION", "TYPE_BORDER_SECTION", "TYPE_REMOVE_CARD_SECTION", "PAYLOAD_ALL", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$e;", "", "<init>", "()V", "a", "Lcom/garmin/feature/garminpay/ui/userwallet/a$e$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class e {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/a$e$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/a$e;", "Lbr2/f;", "selectedDeviceModel", "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1107a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52250a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1107a(br2.f fVar) {
                super(null);
                fVar.getClass();
                this.f52250a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1107a) && s.g(this.f52250a, ((C1107a) obj).f52250a);
            }

            public final int hashCode() {
                return this.f52250a.hashCode();
            }

            public final String toString() {
                return "DeviceItem(selectedDeviceModel=" + this.f52250a + ")";
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
