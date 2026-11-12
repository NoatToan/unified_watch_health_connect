package com.garmin.feature.garminpay.ui.userwallet;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import androidx.room.a0;
import bm.y;
import c53.c0;
import c53.g;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.v;
import e23.l;
import er2.j;
import er2.k;
import er2.n;
import er2.u;
import i3.e5;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.g0;
import p13.j0;
import pm0.h;
import u62.z;
import vr2.q;
import yr2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\b\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "d", "c", JWKParameterNames.RSA_EXPONENT, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends x<b, RecyclerView.f0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1110c f52257e = new C1110c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f52258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m13.a<d> f52259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f52260d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$a;", "", "Lvr2/a;", "deviceModel", "Lvr2/q;", "cardItemViewModel", "", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "fullList", "<init>", "(Lvr2/a;Lvr2/q;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final vr2.a f52261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f52262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f52263c;

        public a(vr2.a aVar, q qVar, List<b> list) {
            qVar.getClass();
            list.getClass();
            this.f52261a = aVar;
            this.f52262b = qVar;
            this.f52263c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f52261a, aVar.f52261a) && this.f52262b.equals(aVar.f52262b) && this.f52263c.equals(aVar.f52263c);
        }

        public final int hashCode() {
            vr2.a aVar = this.f52261a;
            return this.f52263c.hashCode() + ((this.f52262b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("CardDetailsAdapterStateModel(deviceModel=");
            sb3.append(this.f52261a);
            sb3.append(", cardItemViewModel=");
            sb3.append(this.f52262b);
            sb3.append(", fullList=");
            return z.c(sb3, this.f52263c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$e;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends o.f<b> {
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
            if ((bVar3 instanceof b.e) && (bVar4 instanceof b.e)) {
                return true;
            }
            if ((bVar3 instanceof b.k) && (bVar4 instanceof b.k)) {
                return true;
            }
            if ((bVar3 instanceof b.m) && (bVar4 instanceof b.m)) {
                return true;
            }
            return ((bVar3 instanceof b.f) && (bVar4 instanceof b.f)) || bVar3 == bVar4;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(b bVar, b bVar2) {
            int iB;
            b bVar3 = bVar;
            b bVar4 = bVar2;
            bVar3.getClass();
            bVar4.getClass();
            if ((bVar3 instanceof b.e) && (bVar4 instanceof b.e)) {
                iB = ((b.e) bVar3).f52267a.b(((b.e) bVar4).f52267a);
            } else if ((bVar3 instanceof b.k) && (bVar4 instanceof b.k)) {
                iB = ((b.k) bVar3).f52275a.b(((b.k) bVar4).f52275a);
            } else {
                iB = ((bVar3 instanceof b.m) && (bVar4 instanceof b.m)) ? ((b.m) bVar3).f52277a.b(((b.m) bVar4).f52277a) : -1;
            }
            return Integer.valueOf(iB);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f52282a = new f();

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Integer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(new e());
        context.getClass();
        this.f52258b = context;
        m13.a<d> aVar = new m13.a<>();
        this.f52259c = aVar;
        this.f52260d = aVar.g(r03.a.a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        b bVarR = r(i14);
        bVarR.getClass();
        b bVar = bVarR;
        if (bVar instanceof b.d) {
            return 0;
        }
        if (bVar instanceof b.e) {
            return 1;
        }
        if (bVar instanceof b.j) {
            return 2;
        }
        if (bVar instanceof b.l) {
            return 3;
        }
        if (bVar instanceof b.k) {
            return 4;
        }
        if (bVar instanceof b.n) {
            return 5;
        }
        if (bVar instanceof b.m) {
            return 6;
        }
        if (bVar instanceof b.h) {
            return 7;
        }
        if (bVar instanceof b.f) {
            return 8;
        }
        if (bVar instanceof b.g) {
            return 9;
        }
        if (bVar instanceof b.a) {
            return 10;
        }
        if (bVar instanceof b.C1108b) {
            return 11;
        }
        if (bVar instanceof b.i) {
            return 12;
        }
        if (bVar instanceof b.C1109c) {
            return 13;
        }
        u0.r();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e7  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<? extends Object> list) {
        int iIntValue;
        b.C1108b c1108b;
        String str;
        String line4;
        String line3;
        String line2;
        String line1;
        b.f fVar;
        b.f fVar2;
        b.f fVar3;
        b.m mVar;
        b.k kVar;
        b.e eVar;
        is2.b bVar;
        b.d dVar;
        String str2;
        f0Var.getClass();
        list.getClass();
        b bVarR = r(i14);
        Unit unit = null;
        String strA = null;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            g.a aVar = new g.a(c0.h(new g0(list), f.f52282a));
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
        if (bVarR instanceof b.d) {
            er2.f fVar4 = f0Var instanceof er2.f ? (er2.f) f0Var : null;
            if (fVar4 != null) {
                TextView textView = fVar4.f65077a;
                if (fVar4.getBindingAdapterPosition() == -1) {
                    dVar = null;
                } else {
                    b bVarR2 = r(fVar4.getBindingAdapterPosition());
                    if (!(bVarR2 instanceof b.d)) {
                        bVarR2 = null;
                    }
                    dVar = (b.d) bVarR2;
                }
                q qVar = dVar != null ? dVar.f52266a : null;
                if (qVar == null || (str2 = qVar.f179654a) == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str2);
                }
            }
        } else if (bVarR instanceof b.e) {
            er2.g gVar = f0Var instanceof er2.g ? (er2.g) f0Var : null;
            if (gVar != null) {
                CardView cardView = gVar.f65080c;
                ImageView imageView = gVar.f65078a;
                if (gVar.getBindingAdapterPosition() == -1) {
                    eVar = null;
                } else {
                    b bVarR3 = r(gVar.getBindingAdapterPosition());
                    if (!(bVarR3 instanceof b.e)) {
                        bVarR3 = null;
                    }
                    eVar = (b.e) bVarR3;
                }
                q qVar2 = eVar != null ? eVar.f52267a : null;
                if (qVar2 == null || qVar2.f179655b == null) {
                    imageView.setVisibility(8);
                    cardView.setVisibility(0);
                    if (qVar2 != null && (bVar = qVar2.f179660g) != null) {
                        m.a(bVar);
                        yq2.b.f(gVar.f65079b, qVar2);
                    }
                } else {
                    imageView.setVisibility(0);
                    cardView.setVisibility(8);
                    is2.b bVar2 = qVar2.f179660g;
                    if (bVar2 != null) {
                        m.a(bVar2).e(imageView, qVar2, 30);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        imageView.setVisibility(8);
                        cardView.setVisibility(0);
                        if (qVar2 != null) {
                            m.a(bVar);
                            yq2.b.f(gVar.f65079b, qVar2);
                        }
                    }
                }
            }
        } else {
            boolean z14 = bVarR instanceof b.j;
            Context context = this.f52258b;
            if (z14) {
                er2.l lVar = f0Var instanceof er2.l ? (er2.l) f0Var : null;
                if (lVar != null) {
                    lVar.f65100a.setText(context.getString(R.string.ecom_only_card_restriction));
                }
            } else if (s.g(bVarR, b.l.f52276a)) {
                u uVar = f0Var instanceof u ? (u) f0Var : null;
                if (uVar != null) {
                    uVar.f65121a.setText(context.getString(R.string.enabled_on_watch_lbl));
                }
            } else if (bVarR instanceof b.k) {
                j jVar = f0Var instanceof j ? (j) f0Var : null;
                if (jVar != null) {
                    if (jVar.getBindingAdapterPosition() == -1) {
                        kVar = null;
                    } else {
                        b bVarR4 = r(jVar.getBindingAdapterPosition());
                        if (!(bVarR4 instanceof b.k)) {
                            bVarR4 = null;
                        }
                        kVar = (b.k) bVarR4;
                    }
                    final br2.f fVar5 = kVar != null ? kVar.f52275a : null;
                    jVar.d(context, fVar5, iIntValue, j.a.DEVICE_ONLY_ITEM);
                    final int i15 = 0;
                    jVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: tr2.n
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i16 = i15;
                            com.garmin.feature.garminpay.ui.userwallet.c cVar = this;
                            br2.f fVar6 = fVar5;
                            switch (i16) {
                                case 0:
                                    com.garmin.feature.garminpay.ui.userwallet.c.C1110c c1110c = com.garmin.feature.garminpay.ui.userwallet.c.f52257e;
                                    if (fVar6 != null) {
                                        cVar.u(fVar6);
                                    }
                                    break;
                                default:
                                    com.garmin.feature.garminpay.ui.userwallet.c.C1110c c1110c2 = com.garmin.feature.garminpay.ui.userwallet.c.f52257e;
                                    if (fVar6 != null) {
                                        cVar.u(fVar6);
                                    }
                                    break;
                            }
                        }
                    });
                }
            } else if (bVarR instanceof b.n) {
                u uVar2 = f0Var instanceof u ? (u) f0Var : null;
                if (uVar2 != null) {
                    uVar2.f65121a.setText(context.getString(R.string.not_enabled_on_watch_lbl));
                }
            } else if (bVarR instanceof b.m) {
                j jVar2 = f0Var instanceof j ? (j) f0Var : null;
                if (jVar2 != null) {
                    if (jVar2.getBindingAdapterPosition() == -1) {
                        mVar = null;
                    } else {
                        b bVarR5 = r(jVar2.getBindingAdapterPosition());
                        if (!(bVarR5 instanceof b.m)) {
                            bVarR5 = null;
                        }
                        mVar = (b.m) bVarR5;
                    }
                    final br2.f fVar6 = mVar != null ? mVar.f52277a : null;
                    jVar2.d(context, fVar6, iIntValue, j.a.DEVICE_WITH_PAYMENT_CARD_OPTIONS_ITEM);
                    final int i16 = 1;
                    jVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: tr2.n
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i17 = i16;
                            com.garmin.feature.garminpay.ui.userwallet.c cVar = this;
                            br2.f fVar7 = fVar6;
                            switch (i17) {
                                case 0:
                                    com.garmin.feature.garminpay.ui.userwallet.c.C1110c c1110c = com.garmin.feature.garminpay.ui.userwallet.c.f52257e;
                                    if (fVar7 != null) {
                                        cVar.u(fVar7);
                                    }
                                    break;
                                default:
                                    com.garmin.feature.garminpay.ui.userwallet.c.C1110c c1110c2 = com.garmin.feature.garminpay.ui.userwallet.c.f52257e;
                                    if (fVar7 != null) {
                                        cVar.u(fVar7);
                                    }
                                    break;
                            }
                        }
                    });
                }
            } else if (bVarR instanceof b.h) {
                u uVar3 = f0Var instanceof u ? (u) f0Var : null;
                if (uVar3 != null) {
                    uVar3.f65121a.setText(context.getString(R.string.lbl_other));
                }
            } else {
                if (!(bVarR instanceof b.f)) {
                    if (bVarR instanceof b.g) {
                        k kVar2 = f0Var instanceof k ? (k) f0Var : null;
                        if (kVar2 != null) {
                            kVar2.f65099a.setText(context.getString(R.string.ecom_payment_description));
                            return;
                        }
                        return;
                    }
                    if (bVarR instanceof b.a) {
                        er2.a aVar2 = f0Var instanceof er2.a ? (er2.a) f0Var : null;
                        if (aVar2 != null) {
                            aVar2.itemView.setOnClickListener(new t61.m(this, 3));
                            return;
                        }
                        return;
                    }
                    if (!(bVarR instanceof b.C1108b)) {
                        if (s.g(bVarR, b.i.f52273a)) {
                            n nVar = f0Var instanceof n ? (n) f0Var : null;
                            if (nVar != null) {
                                context.getClass();
                                nVar.f65103a.getLayoutParams().height = (int) context.getResources().getDimension(R.dimen.spacing_small);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    er2.c cVar = f0Var instanceof er2.c ? (er2.c) f0Var : null;
                    if (cVar != null) {
                        if (cVar.getBindingAdapterPosition() == -1) {
                            c1108b = null;
                        } else {
                            b bVarR6 = r(cVar.getBindingAdapterPosition());
                            if (!(bVarR6 instanceof b.C1108b)) {
                                bVarR6 = null;
                            }
                            c1108b = (b.C1108b) bVarR6;
                        }
                        fj2.a aVar3 = c1108b != null ? c1108b.f52265a : null;
                        TextView textView2 = cVar.f65075g;
                        TextView textView3 = cVar.f65074f;
                        TextView textView4 = cVar.f65073e;
                        TextView textView5 = cVar.f65072d;
                        TextView textView6 = cVar.f65071c;
                        TextView textView7 = cVar.f65070b;
                        String firstName = aVar3 != null ? aVar3.getFirstName() : null;
                        String lastName = aVar3 != null ? aVar3.getLastName() : null;
                        if (firstName != null && lastName != null) {
                            firstName = e5.g(firstName, StringUtils.SPACE, lastName);
                        } else if (firstName == null) {
                            firstName = lastName == null ? null : lastName;
                        }
                        if (firstName != null) {
                            cVar.f65069a.setText(firstName);
                        }
                        if (aVar3 == null || (line1 = aVar3.getLine1()) == null) {
                            textView7.setVisibility(8);
                        } else {
                            textView7.setVisibility(0);
                            textView7.setText(line1);
                        }
                        if (aVar3 == null || (line2 = aVar3.getLine2()) == null) {
                            textView6.setVisibility(8);
                        } else {
                            textView6.setVisibility(0);
                            textView6.setText(line2);
                        }
                        if (aVar3 == null || (line3 = aVar3.getLine3()) == null) {
                            textView5.setVisibility(8);
                        } else {
                            textView5.setVisibility(0);
                            textView5.setText(line3);
                        }
                        if (aVar3 == null || (line4 = aVar3.getLine4()) == null) {
                            textView4.setVisibility(8);
                        } else {
                            textView4.setVisibility(0);
                            textView4.setText(line4);
                        }
                        if (aVar3 != null) {
                            mj2.c.f119091a.getClass();
                            strA = mj2.c.a(aVar3);
                        }
                        if (strA != null) {
                            textView2.setVisibility(0);
                            textView2.setText(strA);
                        } else {
                            textView2.setVisibility(8);
                        }
                        if (aVar3 == null || (str = aVar3.f71862q) == null) {
                            textView3.setVisibility(8);
                        } else {
                            textView3.setVisibility(0);
                            textView3.setText(str);
                        }
                        cVar.itemView.setOnClickListener(new h(24, this, aVar3));
                        return;
                    }
                    return;
                }
                er2.m mVar2 = f0Var instanceof er2.m ? (er2.m) f0Var : null;
                if (mVar2 != null) {
                    if (mVar2.getBindingAdapterPosition() == -1) {
                        fVar = null;
                    } else {
                        b bVarR7 = r(mVar2.getBindingAdapterPosition());
                        if (!(bVarR7 instanceof b.f)) {
                            bVarR7 = null;
                        }
                        fVar = (b.f) bVarR7;
                    }
                    String str3 = fVar != null ? fVar.f52268a : null;
                    if (mVar2.getBindingAdapterPosition() == -1) {
                        fVar2 = null;
                    } else {
                        b bVarR8 = r(mVar2.getBindingAdapterPosition());
                        if (!(bVarR8 instanceof b.f)) {
                            bVarR8 = null;
                        }
                        fVar2 = (b.f) bVarR8;
                    }
                    String str4 = fVar2 != null ? fVar2.f52269b : null;
                    if (mVar2.getBindingAdapterPosition() == -1) {
                        fVar3 = null;
                    } else {
                        b bVarR9 = r(mVar2.getBindingAdapterPosition());
                        if (!(bVarR9 instanceof b.f)) {
                            bVarR9 = null;
                        }
                        fVar3 = (b.f) bVarR9;
                    }
                    ew2.c cVar2 = new ew2.c(this, str3, str4, fVar3 != null ? fVar3.f52270c : null, 19);
                    context.getClass();
                    TextView textView8 = mVar2.f65101a;
                    textView8.setText(context.getString(R.string.ecom_payments));
                    AppCompatButton appCompatButton = mVar2.f65102b;
                    appCompatButton.setText(context.getString(R.string.common_verify));
                    textView8.setVisibility(0);
                    appCompatButton.setVisibility(0);
                    appCompatButton.setOnClickListener(cVar2);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = this.f52258b;
        switch (i14) {
            case 0:
                View viewD = a0.d(viewGroup, R.layout.item_card_section_header, viewGroup, false);
                viewD.getClass();
                return new er2.f(viewD);
            case 1:
                View viewD2 = a0.d(viewGroup, R.layout.item_card_image, viewGroup, false);
                viewD2.getClass();
                return new er2.g(viewD2);
            case 2:
                View viewD3 = a0.d(viewGroup, R.layout.item_ecom_payments_description_layout, viewGroup, false);
                viewD3.getClass();
                return new er2.l(viewD3);
            case 3:
            case 5:
                View viewD4 = a0.d(viewGroup, R.layout.item_section_header, viewGroup, false);
                viewD4.getClass();
                return new u(viewD4);
            case 4:
            case 6:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_selectable_device, viewGroup, false);
                viewInflate.getClass();
                return new j(viewInflate);
            case 7:
                View viewD5 = a0.d(viewGroup, R.layout.item_section_header, viewGroup, false);
                viewD5.getClass();
                return new u(viewD5);
            case 8:
                View viewD6 = a0.d(viewGroup, R.layout.item_ecom_payments_item_layout, viewGroup, false);
                viewD6.getClass();
                return new er2.m(viewD6);
            case 9:
                View viewD7 = a0.d(viewGroup, R.layout.item_ecom_payments_description_footer_layout, viewGroup, false);
                viewD7.getClass();
                return new k(viewD7);
            case 10:
                View viewD8 = a0.d(viewGroup, R.layout.item_add_address_layout, viewGroup, false);
                viewD8.getClass();
                return new er2.a(viewD8);
            case 11:
                View viewD9 = a0.d(viewGroup, R.layout.item_billing_address_layout, viewGroup, false);
                viewD9.getClass();
                return new er2.c(viewD9);
            case 12:
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_empty_section, viewGroup, false);
                viewInflate2.getClass();
                return new n(viewInflate2);
            case 13:
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_border_section, viewGroup, false);
                viewInflate3.getClass();
                return new er2.d(viewInflate3);
        }
    }

    public final void u(br2.f fVar) {
        if (br2.d.NOT_CONNECTED != fVar.f19602d) {
            this.f52259c.c(new d.C1111c(fVar));
        } else {
            br2.c.f19585a.d(this.f52258b, fVar.f19600b, new y(15));
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "", "<init>", "()V", "d", JWKParameterNames.RSA_EXPONENT, "j", "l", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_MODULUS, "m", "h", "f", "g", "a", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$b;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$c;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$d;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$e;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$f;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$g;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$h;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$i;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$j;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$k;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$l;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$m;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b$n;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f52264a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 34272214;
            }

            public final String toString() {
                return "AddAddress";
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$b;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "Lfj2/a;", ModelSourceWrapper.TYPE, "<init>", "(Lfj2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1108b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final fj2.a f52265a;

            static {
                Parcelable.Creator<fj2.a> creator = fj2.a.CREATOR;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1108b(fj2.a aVar) {
                super(null);
                aVar.getClass();
                this.f52265a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1108b) && s.g(this.f52265a, ((C1108b) obj).f52265a);
            }

            public final int hashCode() {
                return this.f52265a.hashCode();
            }

            public final String toString() {
                return "BillingAddress(model=" + this.f52265a + ")";
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.c$b$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$c;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1109c extends b {
            static {
                new C1109c();
            }

            private C1109c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1109c);
            }

            public final int hashCode() {
                return 1611865718;
            }

            public final String toString() {
                return "BorderSection";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$d;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "Lvr2/q;", ModelSourceWrapper.TYPE, "<init>", "(Lvr2/q;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f52266a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(q qVar) {
                super(null);
                qVar.getClass();
                this.f52266a = qVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && s.g(this.f52266a, ((d) obj).f52266a);
            }

            public final int hashCode() {
                return this.f52266a.hashCode();
            }

            public final String toString() {
                return "CardImageHeader(model=" + this.f52266a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$e;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "Lvr2/q;", ModelSourceWrapper.TYPE, "<init>", "(Lvr2/q;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f52267a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(q qVar) {
                super(null);
                qVar.getClass();
                this.f52267a = qVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && s.g(this.f52267a, ((e) obj).f52267a);
            }

            public final int hashCode() {
                return this.f52267a.hashCode();
            }

            public final String toString() {
                return "CardImageSection(model=" + this.f52267a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$f;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "", "paymentCardId", "paymentCardImageUrl", "paymentCardType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f52268a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f52269b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f52270c;

            public f(String str, String str2, String str3) {
                super(null);
                this.f52268a = str;
                this.f52269b = str2;
                this.f52270c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return s.g(this.f52268a, fVar.f52268a) && s.g(this.f52269b, fVar.f52269b) && s.g(this.f52270c, fVar.f52270c);
            }

            public final int hashCode() {
                String str = this.f52268a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f52269b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f52270c;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                return am.j.o(this.f52270c, ")", p6.b.i("EcomPayments(paymentCardId=", this.f52268a, ", paymentCardImageUrl=", this.f52269b, ", paymentCardType="));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$g;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f52271a = new g();

            private g() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 2124807371;
            }

            public final String toString() {
                return "EcomPaymentsDescriptionFooter";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$h;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f52272a = new h();

            private h() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1542593799;
            }

            public final String toString() {
                return "EcomPaymentsHeader";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$i;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f52273a = new i();

            private i() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 1910419401;
            }

            public final String toString() {
                return "EmptySpaceSection";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$j;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class j extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f52274a = new j();

            private j() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return 718268228;
            }

            public final String toString() {
                return "OnlyEcomPaymentsDescription";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$k;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "Lbr2/f;", ModelSourceWrapper.TYPE, "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class k extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52275a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(br2.f fVar) {
                super(null);
                fVar.getClass();
                this.f52275a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && s.g(this.f52275a, ((k) obj).f52275a);
            }

            public final int hashCode() {
                return this.f52275a.hashCode();
            }

            public final String toString() {
                return "PayEnabledDevice(model=" + this.f52275a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$l;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class l extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f52276a = new l();

            private l() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return 1669156334;
            }

            public final String toString() {
                return "PayEnabledDevicesHeader";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$m;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "Lbr2/f;", ModelSourceWrapper.TYPE, "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class m extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52277a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(br2.f fVar) {
                super(null);
                fVar.getClass();
                this.f52277a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && s.g(this.f52277a, ((m) obj).f52277a);
            }

            public final int hashCode() {
                return this.f52277a.hashCode();
            }

            public final String toString() {
                return "PayNotEnabledDevice(model=" + this.f52277a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$b$n;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class n extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final n f52278a = new n();

            private n() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -429681801;
            }

            public final String toString() {
                return "PayNotEnabledDevicesHeader";
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$c;", "", "<init>", "()V", "", "TYPE_CARD_IMAGE_HEADER_SECTION", "I", "TYPE_CARD_IMAGE_SECTION", "TYPE_ONLY_ECOM_PAYMENTS_DESCRIPTION_SECTION", "TYPE_PAY_ENABLED_DEVICES_HEADER_SECTION", "TYPE_PAY_ENABLED_DEVICES_SECTION", "TYPE_PAY_NOT_ENABLED_DEVICES_HEADER_SECTION", "TYPE_PAY_NOT_ENABLED_DEVICES_SECTION", "TYPE_ECOM_PAYMENTS_HEADER_SECTION", "TYPE_ECOM_PAYMENTS_SECTION", "TYPE_ECOM_PAYMENTS_DESCRIPTION_FOOTER_SECTION", "TYPE_ADD_ADDRESS_SECTION", "TYPE_BILLING_ADDRESS_SECTION", "TYPE_EMPTY_SECTION", "TYPE_BORDER_SECTION", "PAYLOAD_ALL", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1110c {
        public /* synthetic */ C1110c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1110c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$d;", "", "<init>", "()V", "c", "a", "b", "Lcom/garmin/feature/garminpay/ui/userwallet/c$d$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$d$b;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$d$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$d$a;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$d;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f52279a = new a();

            private a() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -800027034;
            }

            public final String toString() {
                return "AddAddress";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$d$b;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$d;", "", "addressId", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f52280a;

            public b(String str) {
                super(null);
                this.f52280a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.g(this.f52280a, ((b) obj).f52280a);
            }

            public final int hashCode() {
                String str = this.f52280a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return am.j.m("BillingAddressItem(addressId=", this.f52280a, ")");
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.userwallet.c$d$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/c$d$c;", "Lcom/garmin/feature/garminpay/ui/userwallet/c$d;", "Lbr2/f;", "selectedDeviceModel", "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1111c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52281a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1111c(br2.f fVar) {
                super(null);
                fVar.getClass();
                this.f52281a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1111c) && s.g(this.f52281a, ((C1111c) obj).f52281a);
            }

            public final int hashCode() {
                return this.f52281a.hashCode();
            }

            public final String toString() {
                return "DeviceItem(selectedDeviceModel=" + this.f52281a + ")";
            }
        }

        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        onBindViewHolder(f0Var, i14, j0.f134944a);
    }
}
