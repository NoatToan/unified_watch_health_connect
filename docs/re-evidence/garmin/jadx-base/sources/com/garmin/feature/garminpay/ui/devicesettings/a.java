package com.garmin.feature.garminpay.ui.devicesettings;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.x;
import androidx.room.a0;
import br2.g;
import c53.c0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.common.BannerControlView;
import com.google.firebase.perf.util.Constants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.v;
import e23.l;
import er2.h;
import er2.i;
import er2.n;
import er2.t;
import er2.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.d0;
import p13.g0;
import p13.h0;
import p13.j0;
import p13.w;
import u62.z;
import vr2.q;
import wr2.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceUnitId", "", "deviceName", "", "isLostWatchView", "<init>", "(Landroid/content/Context;JLjava/lang/String;Z)V", "b", "c", "d", "a", JWKParameterNames.RSA_EXPONENT, "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends x<c, RecyclerView.f0> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f52062h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f52063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f52065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m13.a<d> f52066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f52067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f52068g;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$b;", "", "Lmr2/b;", "deviceAssociatedCardsModel", "Lbr2/f;", "deviceItemModel", "", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "fullList", "<init>", "(Lmr2/b;Lbr2/f;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mr2.b f52069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final br2.f f52070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f52071c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(mr2.b bVar, br2.f fVar, List<? extends c> list) {
            list.getClass();
            this.f52069a = bVar;
            this.f52070b = fVar;
            this.f52071c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f52069a, bVar.f52069a) && s.g(this.f52070b, bVar.f52070b) && this.f52071c.equals(bVar.f52071c);
        }

        public final int hashCode() {
            mr2.b bVar = this.f52069a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            br2.f fVar = this.f52070b;
            return this.f52071c.hashCode() + ((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("DeviceSettingsAdapterStateModel(deviceAssociatedCardsModel=");
            sb3.append(this.f52069a);
            sb3.append(", deviceItemModel=");
            sb3.append(this.f52070b);
            sb3.append(", fullList=");
            return z.c(sb3, this.f52071c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$e;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends o.f<c> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            cVar3.getClass();
            cVar4.getClass();
            if (cVar3 instanceof c.b) {
                return (cVar4 instanceof c.b) && cVar3.equals(cVar4);
            }
            boolean z14 = cVar3 instanceof c.n;
            if (z14) {
                return (cVar4 instanceof c.n) && s.g(((c.n) cVar3).f52087a, ((c.n) cVar4).f52087a);
            }
            boolean z15 = cVar3 instanceof c.o;
            if (z15) {
                return (cVar4 instanceof c.o) && s.g(((c.o) cVar3).f52088a, ((c.o) cVar4).f52088a);
            }
            if (cVar3 instanceof c.f) {
                return (cVar4 instanceof c.f) && s.g(((c.f) cVar3).f52079a, ((c.f) cVar4).f52079a);
            }
            if (cVar3 instanceof c.i) {
                return cVar4 instanceof c.i;
            }
            if (cVar3 instanceof c.h) {
                return (cVar4 instanceof c.h) && s.g(((c.h) cVar3).f52081a, ((c.h) cVar4).f52081a);
            }
            if (cVar3 instanceof c.q) {
                return cVar4 instanceof c.q;
            }
            if (cVar3 instanceof c.p) {
                return (cVar4 instanceof c.p) && s.g(((c.p) cVar3).f52089a, ((c.p) cVar4).f52089a);
            }
            if (cVar3 instanceof c.g) {
                return cVar4 instanceof c.g;
            }
            if (cVar3 instanceof c.d) {
                return cVar4 instanceof c.d;
            }
            if (cVar3 instanceof c.m) {
                return cVar4 instanceof c.m;
            }
            if (cVar3 instanceof c.l) {
                return cVar4 instanceof c.l;
            }
            if (cVar3 instanceof c.e) {
                return cVar4 instanceof c.e;
            }
            if (cVar3 instanceof c.C1093c) {
                return cVar4 instanceof c.C1093c;
            }
            if (z14) {
                return cVar4 instanceof c.n;
            }
            if (z15) {
                return cVar4 instanceof c.o;
            }
            if (cVar3 instanceof c.C1092a) {
                return cVar4 instanceof c.C1092a;
            }
            if (cVar3 instanceof c.k) {
                return cVar4 instanceof c.k;
            }
            if (cVar3 instanceof c.r) {
                if (!(cVar4 instanceof c.r)) {
                    return false;
                }
                c.r rVar = (c.r) cVar3;
                hs2.c cVar5 = rVar.f52091a;
                byte[] bArr = cVar5 != null ? cVar5.f85441a : null;
                c.r rVar2 = (c.r) cVar4;
                hs2.c cVar6 = rVar2.f52091a;
                if (Arrays.equals(bArr, cVar6 != null ? cVar6.f85441a : null)) {
                    return s.g(cVar5 != null ? cVar5.f85442b : null, cVar6 != null ? cVar6.f85442b : null) && rVar.f52092b == rVar2.f52092b;
                }
                return false;
            }
            if (!(cVar3 instanceof c.s)) {
                if (cVar3 instanceof c.j) {
                    return (cVar4 instanceof c.j) && ((c.j) cVar3).f52083a == ((c.j) cVar4).f52083a;
                }
                u0.r();
                return false;
            }
            if (!(cVar4 instanceof c.s)) {
                return false;
            }
            c.s sVar = (c.s) cVar3;
            hs2.c cVar7 = sVar.f52093a;
            Float fValueOf = cVar7 != null ? Float.valueOf(cVar7.f85443c) : null;
            c.s sVar2 = (c.s) cVar4;
            hs2.c cVar8 = sVar2.f52093a;
            return s.f(fValueOf, cVar8 != null ? Float.valueOf(cVar8.f85443c) : null) && sVar.f52094b == sVar2.f52094b;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            cVar3.getClass();
            cVar4.getClass();
            if ((cVar3 instanceof c.b) && (cVar4 instanceof c.b)) {
                return true;
            }
            if ((cVar3 instanceof c.n) && (cVar4 instanceof c.n)) {
                return true;
            }
            if ((cVar3 instanceof c.o) && (cVar4 instanceof c.o)) {
                return true;
            }
            if ((cVar3 instanceof c.f) && (cVar4 instanceof c.f)) {
                return true;
            }
            if ((cVar3 instanceof c.h) && (cVar4 instanceof c.h)) {
                return true;
            }
            if ((cVar3 instanceof c.p) && (cVar4 instanceof c.p)) {
                return true;
            }
            if ((cVar3 instanceof c.r) && (cVar4 instanceof c.r)) {
                return true;
            }
            if ((cVar3 instanceof c.s) && (cVar4 instanceof c.s)) {
                return true;
            }
            return ((cVar3 instanceof c.j) && (cVar4 instanceof c.j)) || cVar3 == cVar4;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final Object c(c cVar, c cVar2) {
            br2.f fVar;
            c cVar3 = cVar;
            c cVar4 = cVar2;
            cVar3.getClass();
            cVar4.getClass();
            int iB = -1;
            if ((cVar3 instanceof c.f) && (cVar4 instanceof c.f)) {
                br2.f fVar2 = ((c.f) cVar3).f52079a;
                if (fVar2 == null || (fVar = ((c.f) cVar4).f52079a) == null) {
                    return -1;
                }
                iB = fVar2.b(fVar);
            } else if ((cVar3 instanceof c.h) && (cVar4 instanceof c.h)) {
                iB = ((c.h) cVar3).f52081a.b(((c.h) cVar4).f52081a);
            } else if ((cVar3 instanceof c.p) && (cVar4 instanceof c.p)) {
                iB = ((c.p) cVar3).f52089a.b(((c.p) cVar4).f52089a);
            }
            return Integer.valueOf(iB);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f52104a = new f();

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof Integer);
        }
    }

    static {
        new C1091a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, long j8, String str, boolean z14) {
        super(new e());
        context.getClass();
        str.getClass();
        this.f52063b = context;
        this.f52064c = str;
        this.f52065d = z14;
        m13.a<d> aVar = new m13.a<>();
        this.f52066e = aVar;
        this.f52067f = aVar.g(r03.a.a());
    }

    public static boolean x(List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((q) it.next()).f179659f == g.PAY_ENABLED) {
                return true;
            }
        }
        return false;
    }

    public static void z(a aVar, br2.f fVar, hs2.c cVar, boolean z14, boolean z15, js2.e eVar) {
        b bVar = aVar.f52068g;
        if (bVar != null) {
            b bVarU = aVar.u(bVar.f52069a, fVar, cVar, Boolean.valueOf(z14), z15, eVar);
            aVar.f52068g = bVarU;
            aVar.t(bVarU.f52071c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        c cVarR = r(i14);
        cVarR.getClass();
        c cVar = cVarR;
        if (cVar instanceof c.f) {
            return 0;
        }
        if (cVar instanceof c.i) {
            return 1;
        }
        if (cVar instanceof c.h) {
            return 2;
        }
        if (cVar instanceof c.q) {
            return 3;
        }
        if (cVar instanceof c.p) {
            return 4;
        }
        if (cVar instanceof c.g) {
            return 5;
        }
        if (cVar instanceof c.d) {
            return 6;
        }
        if (cVar instanceof c.m) {
            return 7;
        }
        if (cVar instanceof c.l) {
            return 9;
        }
        if (cVar instanceof c.e) {
            return 10;
        }
        if (cVar instanceof c.C1093c) {
            return 11;
        }
        if (cVar instanceof c.C1092a) {
            return 12;
        }
        if (cVar instanceof c.k) {
            return 13;
        }
        if (cVar instanceof c.r) {
            return 14;
        }
        if (cVar instanceof c.s) {
            return 15;
        }
        if (cVar instanceof c.j) {
            return 16;
        }
        if (cVar instanceof c.b) {
            return 17;
        }
        if (cVar instanceof c.n) {
            return 18;
        }
        if (cVar instanceof c.o) {
            return 19;
        }
        u0.r();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<? extends Object> list) {
        int iIntValue;
        q qVar;
        as2.a aVarA;
        mr2.b bVar;
        List list2;
        Object next;
        byte[] bArrD;
        hs2.c cVar;
        q qVar2;
        mr2.b bVar2;
        List list3;
        Object next2;
        byte[] bArrD2;
        hs2.c cVar2;
        c.p pVar;
        c.h hVar;
        c.f fVar;
        c.b bVar3;
        c.o oVar;
        c.n nVar;
        f0Var.getClass();
        list.getClass();
        c cVarR = r(i14);
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            c53.g.a aVar = new c53.g.a(c0.h(new g0(list), f.f52104a));
            if (!aVar.hasNext()) {
                org.apache.commons.lang3.e.w("Empty sequence can't be reduced.");
                return;
            }
            Object next3 = aVar.next();
            while (aVar.hasNext()) {
                next3 = Integer.valueOf(((Number) next3).intValue() | ((Number) aVar.next()).intValue());
            }
            iIntValue = ((Number) next3).intValue();
        } else {
            iIntValue = -1;
        }
        boolean z14 = cVarR instanceof c.n;
        final int i15 = 8;
        final int i16 = 0;
        final int i17 = 1;
        Context context = this.f52063b;
        if (z14) {
            er2.s sVar = f0Var instanceof er2.s ? (er2.s) f0Var : null;
            if (sVar != null) {
                if (sVar.getBindingAdapterPosition() == -1) {
                    nVar = null;
                } else {
                    c cVarR2 = r(sVar.getBindingAdapterPosition());
                    if (!(cVarR2 instanceof c.n)) {
                        cVarR2 = null;
                    }
                    nVar = (c.n) cVarR2;
                }
                br2.f fVar2 = nVar != null ? nVar.f52087a : null;
                TextView textView = sVar.f65112a;
                x0 x0Var = x0.f105818a;
                String string = context.getString(R.string.add_card_info_lbl);
                string.getClass();
                q6.f.y(new Object[]{fVar2 != null ? fVar2.f19600b : null}, 1, string, textView);
                sVar.f65114c.setVisibility(8);
                sVar.f65115d.setText(context.getString(R.string.wallet_change_passcode_lbl));
                sVar.f65116e.setVisibility(8);
                sVar.f65117f.setVisibility(8);
                sVar.f65113b.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i16) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
                sVar.f65118g.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i15) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (cVarR instanceof c.o) {
            t tVar = f0Var instanceof t ? (t) f0Var : null;
            if (tVar != null) {
                if (tVar.getBindingAdapterPosition() == -1) {
                    oVar = null;
                } else {
                    c cVarR3 = r(tVar.getBindingAdapterPosition());
                    if (!(cVarR3 instanceof c.o)) {
                        cVarR3 = null;
                    }
                    oVar = (c.o) cVarR3;
                }
                br2.f fVar3 = oVar != null ? oVar.f52088a : null;
                TextView textView2 = tVar.f65119a;
                x0 x0Var2 = x0.f105818a;
                String string2 = context.getString(R.string.add_card_info_lbl);
                string2.getClass();
                q6.f.y(new Object[]{fVar3 != null ? fVar3.f19600b : null}, 1, string2, textView2);
                final int i18 = 9;
                tVar.f65120b.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i18) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (cVarR instanceof c.C1092a) {
            er2.e eVar = f0Var instanceof er2.e ? (er2.e) f0Var : null;
            if (eVar != null) {
                Button button = eVar.f65076a;
                button.setText(context.getString(R.string.add_card_button));
                button.setTextColor(a7.b.getColor(context, R.color.GPcolorAccent));
                button.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i17) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        final int i19 = 2;
        if (cVarR instanceof c.b) {
            er2.b bVar4 = f0Var instanceof er2.b ? (er2.b) f0Var : null;
            if (bVar4 != null) {
                BannerControlView bannerControlView = bVar4.f65068a;
                if (bVar4.getBindingAdapterPosition() == -1) {
                    bVar3 = null;
                } else {
                    c cVarR4 = r(bVar4.getBindingAdapterPosition());
                    if (!(cVarR4 instanceof c.b)) {
                        cVarR4 = null;
                    }
                    bVar3 = (c.b) cVarR4;
                }
                br2.f fVar4 = bVar3 != null ? bVar3.f52073a : null;
                boolean z15 = bVar3 != null ? bVar3.f52074b : false;
                boolean z16 = bVar3 != null ? bVar3.f52075c : false;
                Unit unit = Unit.INSTANCE;
                if (!z15) {
                    if (!z16) {
                        bannerControlView.setVisibility(8);
                        return;
                    }
                    bannerControlView.setBannerTitle(context.getString(R.string.wallet_locked_title));
                    bannerControlView.setBannerText(context.getString(R.string.wallet_reset_needed_message));
                    bannerControlView.setLeftButtonText(context.getString(R.string.wallet_reset_wallet_confirm));
                    bannerControlView.setRightButtonVisible(Boolean.FALSE);
                    bannerControlView.setLeftButtonAction(new l(this) { // from class: lr2.b

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114381b;

                        {
                            this.f114381b = this;
                        }

                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            int i24 = i19;
                            com.garmin.feature.garminpay.ui.devicesettings.a aVar2 = this.f114381b;
                            View view2 = (View) obj;
                            switch (i24) {
                                case 0:
                                    int i25 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                    view2.getClass();
                                    aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                    break;
                                case 1:
                                    int i26 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                    view2.getClass();
                                    aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.g(false));
                                    break;
                                default:
                                    int i27 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                    view2.getClass();
                                    aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.g(false));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                    bannerControlView.setVisibility(0);
                    return;
                }
                bannerControlView.setBannerTitle(context.getString(R.string.wallet_locked_title));
                x0 x0Var3 = x0.f105818a;
                String string3 = context.getString(R.string.wallet_locked_message);
                string3.getClass();
                bannerControlView.setBannerText(String.format(string3, Arrays.copyOf(new Object[]{fVar4 != null ? fVar4.f19600b : null}, 1)));
                bannerControlView.setLeftButtonText(context.getString(R.string.wallet_change_passcode_lbl));
                bannerControlView.setRightButtonText(context.getString(R.string.wallet_reset_wallet_confirm));
                bannerControlView.setLeftButtonAction(new l(this) { // from class: lr2.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114381b;

                    {
                        this.f114381b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i24 = i16;
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar2 = this.f114381b;
                        View view2 = (View) obj;
                        switch (i24) {
                            case 0:
                                int i25 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                view2.getClass();
                                aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                int i26 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                view2.getClass();
                                aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.g(false));
                                break;
                            default:
                                int i27 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                view2.getClass();
                                aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.g(false));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                bannerControlView.setRightButtonAction(new l(this) { // from class: lr2.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114381b;

                    {
                        this.f114381b = this;
                    }

                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        int i24 = i17;
                        com.garmin.feature.garminpay.ui.devicesettings.a aVar2 = this.f114381b;
                        View view2 = (View) obj;
                        switch (i24) {
                            case 0:
                                int i25 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                view2.getClass();
                                aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                int i26 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                view2.getClass();
                                aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.g(false));
                                break;
                            default:
                                int i27 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                                view2.getClass();
                                aVar2.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.g(false));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                bannerControlView.setVisibility(0);
                return;
            }
            return;
        }
        final int i24 = 4;
        if (cVarR instanceof c.f) {
            i iVar = f0Var instanceof i ? (i) f0Var : null;
            if (iVar != null) {
                if (iVar.getBindingAdapterPosition() == -1) {
                    fVar = null;
                } else {
                    c cVarR5 = r(iVar.getBindingAdapterPosition());
                    if (!(cVarR5 instanceof c.f)) {
                        cVarR5 = null;
                    }
                    fVar = (c.f) cVarR5;
                }
                br2.f fVar5 = fVar != null ? fVar.f52079a : null;
                TextView textView3 = iVar.f65085d;
                context.getClass();
                if (fVar5 != null) {
                    if ((iIntValue & 1) != 0) {
                        com.bumptech.glide.b.c(context).c(context).l(fVar5.f19601c).E(iVar.f65083b);
                    }
                    if ((iIntValue & 2) != 0) {
                        iVar.f65084c.setText(fVar5.f19600b);
                    }
                    if ((iIntValue & 4) != 0) {
                        if (this.f52065d) {
                            textView3.setVisibility(8);
                            return;
                        } else {
                            textView3.setVisibility(0);
                            textView3.setText(fVar5.f19602d.a(context));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (cVarR instanceof c.i) {
            u uVar = f0Var instanceof u ? (u) f0Var : null;
            if (uVar != null) {
                uVar.f65121a.setText(context.getString(R.string.enabled_on_watch_lbl));
                return;
            }
            return;
        }
        if (cVarR instanceof c.h) {
            er2.v vVar = f0Var instanceof er2.v ? (er2.v) f0Var : null;
            if (vVar != null) {
                if (vVar.getBindingAdapterPosition() == -1) {
                    hVar = null;
                } else {
                    c cVarR6 = r(vVar.getBindingAdapterPosition());
                    if (!(cVarR6 instanceof c.h)) {
                        cVarR6 = null;
                    }
                    hVar = (c.h) cVarR6;
                }
                final q qVar3 = hVar != null ? hVar.f52081a : null;
                r rVar = r.f186883a;
                fs2.a aVar2 = qVar3 != null ? qVar3.f179658e : null;
                rVar.getClass();
                final boolean z17 = r.a(aVar2) != null;
                boolean z18 = this.f52065d;
                er2.v vVar2 = vVar;
                vVar2.d(this.f52063b, qVar3, iIntValue, z18, z18 && z17);
                vVar2.itemView.setOnClickListener(new hb1.c(qVar3, this, z17, i17));
                vVar2.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: lr2.c
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        vr2.q qVar4 = qVar3;
                        if (qVar4 != null) {
                            this.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.b(qVar4, z17, true));
                            return true;
                        }
                        int i25 = com.garmin.feature.garminpay.ui.devicesettings.a.f52062h;
                        return true;
                    }
                });
                return;
            }
            return;
        }
        if (cVarR instanceof c.q) {
            u uVar2 = f0Var instanceof u ? (u) f0Var : null;
            if (uVar2 != null) {
                uVar2.f65121a.setText(context.getString(R.string.not_enabled_on_watch_lbl));
                return;
            }
            return;
        }
        if (cVarR instanceof c.p) {
            er2.v vVar3 = f0Var instanceof er2.v ? (er2.v) f0Var : null;
            if (vVar3 != null) {
                if (vVar3.getBindingAdapterPosition() == -1) {
                    pVar = null;
                } else {
                    c cVarR7 = r(vVar3.getBindingAdapterPosition());
                    if (!(cVarR7 instanceof c.p)) {
                        cVarR7 = null;
                    }
                    pVar = (c.p) cVarR7;
                }
                q qVar4 = pVar != null ? pVar.f52089a : null;
                int i25 = er2.v.f65122f;
                er2.v vVar4 = vVar3;
                vVar4.d(this.f52063b, qVar4, iIntValue, false, false);
                vVar4.itemView.setOnClickListener(new lq.g(i17, qVar4, this));
                vVar4.itemView.setOnLongClickListener(new b00.c(i19, qVar4, this));
                return;
            }
            return;
        }
        if (cVarR instanceof c.d) {
            er2.e eVar2 = f0Var instanceof er2.e ? (er2.e) f0Var : null;
            if (eVar2 != null) {
                Button button2 = eVar2.f65076a;
                button2.setText(context.getString(R.string.wallet_change_passcode_lbl));
                button2.setTextColor(a7.b.getColor(context, R.color.GPcolorText));
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i19) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (cVarR instanceof c.m) {
            er2.e eVar3 = f0Var instanceof er2.e ? (er2.e) f0Var : null;
            if (eVar3 != null) {
                Button button3 = eVar3.f65076a;
                button3.setText(context.getString(R.string.lost_your_watch_title));
                button3.setTextColor(a7.b.getColor(context, R.color.GPcolorText));
                final int i26 = 3;
                button3.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i26) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (cVarR instanceof c.l) {
            h hVar2 = f0Var instanceof h ? (h) f0Var : null;
            if (hVar2 != null) {
                hVar2.f65081a.setText(context.getString(R.string.lost_your_watch_info_lbl, this.f52064c));
                return;
            }
            return;
        }
        if (cVarR instanceof c.e) {
            h hVar3 = f0Var instanceof h ? (h) f0Var : null;
            if (hVar3 != null) {
                hVar3.f65081a.setText(context.getString(R.string.lost_your_watch_cards_removal_info_lbl));
                return;
            }
            return;
        }
        if (cVarR instanceof c.k) {
            u uVar3 = f0Var instanceof u ? (u) f0Var : null;
            if (uVar3 != null) {
                uVar3.f65121a.setText(R.string.wallet_rapid_pass_settings);
                return;
            }
            return;
        }
        if (cVarR instanceof c.r) {
            er2.q qVar5 = f0Var instanceof er2.q ? (er2.q) f0Var : null;
            if (qVar5 != null) {
                View view2 = qVar5.f65109a;
                qVar5.f65110b.setText(R.string.wallet_rapid_pass_card);
                b bVar5 = this.f52068g;
                if (bVar5 == null || (bVar2 = bVar5.f52069a) == null || (list3 = (List) bVar2.f120360e.getValue()) == null) {
                    qVar2 = null;
                } else {
                    Iterator it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it.next();
                            bArrD2 = ((q) next2).d();
                            cVar2 = ((c.r) cVarR).f52091a;
                        }
                    } while (!Arrays.equals(bArrD2, cVar2 != null ? cVar2.f85441a : null));
                    qVar2 = (q) next2;
                }
                TextView textView4 = qVar5.f65111c;
                if (qVar2 == null) {
                    textView4.setText(R.string.lbl_none);
                } else {
                    textView4.setText(qVar2.f179658e.f73429d);
                }
                if (((c.r) cVarR).f52092b) {
                    view2.setEnabled(true);
                    view2.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                        {
                            this.f114379b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            switch (i24) {
                                case 0:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                    break;
                                case 1:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                    break;
                                case 2:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                    break;
                                case 3:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                    break;
                                case 4:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                    break;
                                case 5:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                    break;
                                case 6:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                    break;
                                case 7:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                    break;
                                case 8:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                    break;
                                default:
                                    this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                    break;
                            }
                        }
                    });
                    return;
                } else {
                    view2.setEnabled(false);
                    view2.setOnClickListener(null);
                    return;
                }
            }
            return;
        }
        if (!(cVarR instanceof c.s)) {
            if (cVarR instanceof c.j) {
                er2.x xVar = f0Var instanceof er2.x ? (er2.x) f0Var : null;
                if (xVar != null) {
                    xVar.f65135b.setText(((c.j) cVarR).f52083a ? context.getString(R.string.wallet_rapid_pass_balance_notification_hint) : context.getString(R.string.wallet_rapid_pass_card_balance_notification_hint_when_not_available));
                    return;
                }
                return;
            }
            if ((cVarR instanceof c.C1093c) || (cVarR instanceof c.g)) {
                Unit unit2 = Unit.INSTANCE;
                return;
            } else {
                u0.r();
                return;
            }
        }
        er2.q qVar6 = f0Var instanceof er2.q ? (er2.q) f0Var : null;
        if (qVar6 != null) {
            TextView textView5 = qVar6.f65111c;
            View view3 = qVar6.f65109a;
            qVar6.f65110b.setText(R.string.wallet_balance_notification);
            b bVar6 = this.f52068g;
            if (bVar6 == null || (bVar = bVar6.f52069a) == null || (list2 = (List) bVar.f120360e.getValue()) == null) {
                qVar = null;
            } else {
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        bArrD = ((q) next).d();
                        cVar = ((c.s) cVarR).f52093a;
                    }
                } while (!Arrays.equals(bArrD, cVar != null ? cVar.f85441a : null));
                qVar = (q) next;
            }
            c.s sVar2 = (c.s) cVarR;
            hs2.c cVar3 = sVar2.f52093a;
            Float fValueOf = cVar3 != null ? Float.valueOf(cVar3.f85443c) : null;
            if (qVar == null || fValueOf == null || !sVar2.f52094b) {
                textView5.setText(R.string.lbl_off);
                view3.setOnClickListener(null);
                view3.setEnabled(false);
                return;
            }
            if (s.e(fValueOf, Float.NEGATIVE_INFINITY) || Float.isNaN(fValueOf.floatValue())) {
                textView5.setText(R.string.lbl_off);
                view3.setEnabled(true);
                final int i27 = 5;
                view3.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i27) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
                return;
            }
            if (s.e(fValueOf, Float.POSITIVE_INFINITY)) {
                textView5.setText(R.string.wallet_balance_notification_always);
                view3.setEnabled(true);
                final int i28 = 6;
                view3.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i28) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
                return;
            }
            qs2.a aVar3 = qVar.f179658e.f73428c;
            if (aVar3 == null || (aVarA = yr2.e.a(aVar3)) == null) {
                textView5.setText(R.string.lbl_off);
                view3.setOnClickListener(null);
                view3.setEnabled(false);
            } else {
                textView5.setText(w5.r.v(R.string.wallet_balance_notification_under_price, aVarA.a(fValueOf)));
                view3.setEnabled(true);
                final int i29 = 7;
                view3.setOnClickListener(new View.OnClickListener(this) { // from class: lr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.devicesettings.a f114379b;

                    {
                        this.f114379b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        switch (i29) {
                            case 0:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 1:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            case 2:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.c(false));
                                break;
                            case 3:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.f(false));
                                break;
                            case 4:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1095d(false));
                                break;
                            case 5:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 6:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 7:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.e(false));
                                break;
                            case 8:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                            default:
                                this.f114379b.f52066e.c(new com.garmin.feature.garminpay.ui.devicesettings.a.d.C1094a(false));
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = this.f52063b;
        switch (i14) {
            case 0:
                View viewD = a0.d(viewGroup, R.layout.item_device_info, viewGroup, false);
                viewD.getClass();
                return new i(viewD);
            case 1:
            case 3:
            case 13:
                View viewD2 = a0.d(viewGroup, R.layout.item_section_header, viewGroup, false);
                viewD2.getClass();
                return new u(viewD2);
            case 2:
            case 4:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_selectable_card_small, viewGroup, false);
                viewInflate.getClass();
                return new er2.v(viewInflate);
            case 5:
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_empty_section, viewGroup, false);
                viewInflate2.getClass();
                return new n(viewInflate2);
            case 6:
            case 7:
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_button_section, viewGroup, false);
                viewInflate3.getClass();
                return new er2.e(viewInflate3);
            case 8:
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.item_info_text, viewGroup, false);
                viewInflate4.getClass();
                return new er2.o(viewInflate4);
            case 9:
            case 10:
                View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.item_description_text, viewGroup, false);
                viewInflate5.getClass();
                return new h(viewInflate5);
            case 11:
                View viewInflate6 = LayoutInflater.from(context).inflate(R.layout.item_border_section, viewGroup, false);
                viewInflate6.getClass();
                return new er2.d(viewInflate6);
            case 12:
                View viewInflate7 = LayoutInflater.from(context).inflate(R.layout.item_button_section, viewGroup, false);
                viewInflate7.getClass();
                return new er2.e(viewInflate7);
            case 14:
            case 15:
                View viewInflate8 = LayoutInflater.from(context).inflate(R.layout.item_info_value_section, viewGroup, false);
                viewInflate8.getClass();
                return new er2.q(viewInflate8);
            case 16:
                View viewInflate9 = LayoutInflater.from(context).inflate(R.layout.item_subtext_2, viewGroup, false);
                viewInflate9.getClass();
                return new er2.x(viewInflate9);
            case 17:
                View viewInflate10 = LayoutInflater.from(context).inflate(R.layout.banner_section, viewGroup, false);
                viewInflate10.getClass();
                return new er2.b(viewInflate10);
            case 18:
                View viewInflate11 = LayoutInflater.from(context).inflate(R.layout.no_cards_section, viewGroup, false);
                viewInflate11.getClass();
                return new er2.s(viewInflate11);
            case 19:
                View viewInflate12 = LayoutInflater.from(context).inflate(R.layout.no_wallet_cards_section, viewGroup, false);
                viewInflate12.getClass();
                return new t(viewInflate12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b u(mr2.b bVar, br2.f fVar, hs2.c cVar, Boolean bool, boolean z14, js2.e eVar) {
        Collection collectionD0;
        Collection collectionD1;
        List listD0;
        Collection collectionD2;
        Collection collectionD3;
        boolean z15 = false;
        qs2.a aVar = null;
        list = null;
        List list = null;
        if (this.f52065d) {
            listD0 = w.c(c.l.f52085a);
            List list2 = bVar != null ? (List) bVar.f120358c.getValue() : null;
            if (list2 == null || !(!list2.isEmpty())) {
                list2 = null;
            }
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    d0.v(arrayList, p13.x.k(c.C1093c.f52076a, new c.h((q) it.next())));
                }
                collectionD2 = h0.D0(arrayList, c.C1093c.f52076a);
            } else {
                collectionD2 = j0.f134944a;
            }
            List list3 = bVar != null ? (List) bVar.f120360e.getValue() : null;
            if (list3 != null && (!list3.isEmpty())) {
                list = list3;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    d0.v(arrayList2, p13.x.k(c.C1093c.f52076a, new c.h((q) it3.next())));
                }
                collectionD3 = h0.D0(arrayList2, c.C1093c.f52076a);
            } else {
                collectionD3 = j0.f134944a;
            }
            if (!collectionD2.isEmpty() || !collectionD3.isEmpty()) {
                listD0 = h0.D0(listD0, c.e.f52078a);
            }
            if (!collectionD2.isEmpty()) {
                listD0 = h0.D0(h0.C0(listD0, collectionD2), c.g.f52080a);
            }
            if (!collectionD3.isEmpty()) {
                listD0 = h0.D0(h0.C0(listD0, collectionD3), c.g.f52080a);
            }
        } else {
            List listC = w.c(c.i.f52082a);
            List<q> list4 = bVar != null ? bVar.f120356a : null;
            if (list4 == null || !(!list4.isEmpty())) {
                list4 = null;
            }
            if (list4 != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    d0.v(arrayList3, p13.x.k(c.C1093c.f52076a, new c.h((q) it4.next())));
                }
                collectionD0 = h0.D0(arrayList3, c.C1093c.f52076a);
            } else {
                collectionD0 = j0.f134944a;
            }
            List listC2 = w.c(c.q.f52090a);
            List<q> list5 = bVar != null ? bVar.f120357b : null;
            if (list5 == null || !(!list5.isEmpty())) {
                list5 = null;
            }
            if (list5 != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    d0.v(arrayList4, p13.x.k(c.C1093c.f52076a, new c.p((q) it5.next())));
                }
                collectionD1 = h0.D0(arrayList4, c.C1093c.f52076a);
            } else {
                collectionD1 = j0.f134944a;
            }
            ArrayList arrayListD0 = h0.D0(j0.f134944a, new c.b(fVar, eVar == js2.e.BLOCKED_WALLET, eVar == js2.e.LOCKED_WALLET));
            Object[] objArr = (bVar == null || (bVar.f120356a.isEmpty() && bVar.f120357b.isEmpty())) ? false : true;
            if (objArr != true && eVar == js2.e.NO_PASSCODE_SET) {
                listD0 = h0.D0(arrayListD0, new c.o(fVar));
            } else if (objArr == true) {
                if (!collectionD0.isEmpty()) {
                    arrayListD0 = h0.D0(h0.C0(h0.C0(arrayListD0, listC), collectionD0), c.g.f52080a);
                }
                if (!collectionD1.isEmpty()) {
                    arrayListD0 = h0.D0(h0.C0(h0.C0(arrayListD0, listC2), collectionD1), c.g.f52080a);
                }
                if (s.g(bool, Boolean.TRUE)) {
                    c.C1093c c1093c = c.C1093c.f52076a;
                    arrayListD0 = h0.D0(h0.D0(h0.D0(arrayListD0, c1093c), c.C1092a.f52072a), c1093c);
                }
                List list6 = bVar != null ? (List) bVar.f120360e.getValue() : null;
                if (list6 != null && !list6.isEmpty()) {
                    list6.getClass();
                    if (list6.isEmpty()) {
                        ArrayList arrayListD1 = h0.D0(arrayListD0, c.k.f52084a);
                        c.C1093c c1093c2 = c.C1093c.f52076a;
                        arrayListD0 = h0.D0(h0.D0(h0.D0(h0.D0(h0.D0(arrayListD1, c1093c2), new c.r(cVar, x(list6))), c1093c2), new c.j(false)), c.g.f52080a);
                        break;
                    }
                    Iterator it6 = list6.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            ArrayList arrayListD2 = h0.D0(arrayListD0, c.k.f52084a);
                            c.C1093c c1093c3 = c.C1093c.f52076a;
                            arrayListD0 = h0.D0(h0.D0(h0.D0(h0.D0(h0.D0(arrayListD2, c1093c3), new c.r(cVar, x(list6))), c1093c3), new c.j(false)), c.g.f52080a);
                            break;
                        }
                        qs2.a aVar2 = ((q) it6.next()).f179658e.f73428c;
                        if (aVar2 != null && aVar2.f147401f) {
                            ArrayList arrayListD3 = h0.D0(arrayListD0, c.k.f52084a);
                            c.C1093c c1093c4 = c.C1093c.f52076a;
                            ArrayList arrayListD4 = h0.D0(h0.D0(h0.D0(arrayListD3, c1093c4), new c.r(cVar, x(list6))), c1093c4);
                            if (cVar != null) {
                                String str = cVar.f85442b;
                                for (qs2.a aVar3 : qs2.a.values()) {
                                    if (s.g(aVar3.f147399d, str)) {
                                        aVar = aVar3;
                                        break;
                                    }
                                }
                                if (aVar != null) {
                                    z15 = aVar.f147401f;
                                }
                            }
                            arrayListD0 = h0.D0(h0.D0(h0.D0(h0.D0(arrayListD4, new c.s(cVar, z15)), c.C1093c.f52076a), new c.j(true)), c.g.f52080a);
                            break;
                        }
                    }
                }
                c.C1093c c1093c5 = c.C1093c.f52076a;
                ArrayList arrayListD5 = h0.D0(arrayListD0, c1093c5);
                if (z14) {
                    arrayListD5 = h0.D0(h0.D0(arrayListD5, c.d.f52077a), c1093c5);
                }
                listD0 = h0.D0(h0.D0(h0.D0(arrayListD5, c.m.f52086a), c1093c5), c.g.f52080a);
            } else {
                listD0 = h0.D0(arrayListD0, new c.n(fVar));
            }
        }
        return new b(bVar, fVar, listD0);
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.devicesettings.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$a;", "", "<init>", "()V", "", "TYPE_DEVICE_IMAGE_SECTION", "I", "TYPE_ENABLED_CARDS_HEADER_SECTION", "TYPE_ENABLED_CARDS_SECTION", "TYPE_NOT_ENABLED_CARDS_HEADER_SECTION", "TYPE_NOT_ENABLED_CARDS_SECTION", "TYPE_EMPTY_SECTION", "TYPE_CHANGE_PASSCODE_SECTION", "TYPE_LOST_WATCH_SECTION", "TYPE_LOST_WATCH_INFO_SECTION", "TYPE_LOST_WATCH_DESCRIPTION_SECTION", "TYPE_DELETE_CARD_DESCRIPTION_SECTION", "TYPE_BORDER_SECTION", "TYPE_ADD_CARD_SECTION", "TYPE_EXPRESS_CARD_HEADER", "TYPE_SET_EXPRESS_CARD", "TYPE_SET_EXPRESS_CARD_NOTIFICATION_THRESHOLD", "TYPE_EXPRESS_CARD_REMINDER", "TYPE_BANNER_SECTION", "TYPE_NO_CARDS_SECTION", "TYPE_NO_WALLET_CARDS_SECTION", "PAYLOAD_ALL", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1091a {
        public /* synthetic */ C1091a(j jVar) {
            this();
        }

        private C1091a() {
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "", "<init>", "()V", JWKParameterNames.RSA_MODULUS, "o", "a", "b", "f", IntegerTokenConverter.CONVERTER_KEY, "h", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "p", "g", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "s", "j", "d", "m", "l", JWKParameterNames.RSA_EXPONENT, "c", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$a;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$b;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$c;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$d;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$e;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$f;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$g;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$h;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$i;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$j;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$k;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$l;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$m;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$n;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$o;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$p;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$q;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$r;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.devicesettings.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$a;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1092a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1092a f52072a = new C1092a();

            private C1092a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$b;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Lbr2/f;", ModelSourceWrapper.TYPE, "", "isWalletBlocked", "isWalletLocked", "<init>", "(Lbr2/f;ZZ)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52073a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f52074b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f52075c;

            public b(br2.f fVar, boolean z14, boolean z15) {
                super(null);
                this.f52073a = fVar;
                this.f52074b = z14;
                this.f52075c = z15;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p005kotlin.jvm.internal.s.g(this.f52073a, bVar.f52073a) && this.f52074b == bVar.f52074b && this.f52075c == bVar.f52075c;
            }

            public final int hashCode() {
                br2.f fVar = this.f52073a;
                return Boolean.hashCode(this.f52075c) + q6.f.g((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f52074b);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("BannerSection(model=");
                sb3.append(this.f52073a);
                sb3.append(", isWalletBlocked=");
                sb3.append(this.f52074b);
                sb3.append(", isWalletLocked=");
                return hb.a.k(sb3, this.f52075c, ")");
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.devicesettings.a$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$c;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1093c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1093c f52076a = new C1093c();

            private C1093c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$d;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f52077a = new d();

            private d() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$e;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f52078a = new e();

            private e() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$f;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Lbr2/f;", ModelSourceWrapper.TYPE, "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52079a;

            public f(br2.f fVar) {
                super(null);
                this.f52079a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && p005kotlin.jvm.internal.s.g(this.f52079a, ((f) obj).f52079a);
            }

            public final int hashCode() {
                br2.f fVar = this.f52079a;
                if (fVar == null) {
                    return 0;
                }
                return fVar.hashCode();
            }

            public final String toString() {
                return "DeviceImageSection(model=" + this.f52079a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$g;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class g extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f52080a = new g();

            private g() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$h;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Lvr2/q;", ModelSourceWrapper.TYPE, "<init>", "(Lvr2/q;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final vr2.q f52081a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(vr2.q qVar) {
                super(null);
                qVar.getClass();
                this.f52081a = qVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && p005kotlin.jvm.internal.s.g(this.f52081a, ((h) obj).f52081a);
            }

            public final int hashCode() {
                return this.f52081a.hashCode();
            }

            public final String toString() {
                return "EnabledCardItem(model=" + this.f52081a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$i;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class i extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f52082a = new i();

            private i() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$j;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "", "isNotificationSupport", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class j extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52083a;

            public j(boolean z14) {
                super(null);
                this.f52083a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.f52083a == ((j) obj).f52083a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52083a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("ExpressCardReminder(isNotificationSupport=", ")", this.f52083a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$k;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class k extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f52084a = new k();

            private k() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$l;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class l extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f52085a = new l();

            private l() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$m;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class m extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final m f52086a = new m();

            private m() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$n;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Lbr2/f;", ModelSourceWrapper.TYPE, "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class n extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52087a;

            public n(br2.f fVar) {
                super(null);
                this.f52087a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && p005kotlin.jvm.internal.s.g(this.f52087a, ((n) obj).f52087a);
            }

            public final int hashCode() {
                br2.f fVar = this.f52087a;
                if (fVar == null) {
                    return 0;
                }
                return fVar.hashCode();
            }

            public final String toString() {
                return "NoCardsSection(model=" + this.f52087a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$o;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Lbr2/f;", ModelSourceWrapper.TYPE, "<init>", "(Lbr2/f;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class o extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final br2.f f52088a;

            public o(br2.f fVar) {
                super(null);
                this.f52088a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && p005kotlin.jvm.internal.s.g(this.f52088a, ((o) obj).f52088a);
            }

            public final int hashCode() {
                br2.f fVar = this.f52088a;
                if (fVar == null) {
                    return 0;
                }
                return fVar.hashCode();
            }

            public final String toString() {
                return "NoWalletCardsSection(model=" + this.f52088a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$p;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Lvr2/q;", ModelSourceWrapper.TYPE, "<init>", "(Lvr2/q;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class p extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final vr2.q f52089a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(vr2.q qVar) {
                super(null);
                qVar.getClass();
                this.f52089a = qVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && p005kotlin.jvm.internal.s.g(this.f52089a, ((p) obj).f52089a);
            }

            public final int hashCode() {
                return this.f52089a.hashCode();
            }

            public final String toString() {
                return "NotEnabledCardItem(model=" + this.f52089a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$q;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class q extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final q f52090a = new q();

            private q() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$r;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Lhs2/c;", "expressCard", "", Constants.ENABLE_DISABLE, "<init>", "(Lhs2/c;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class r extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final hs2.c f52091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f52092b;

            static {
                Parcelable.Creator<hs2.c> creator = hs2.c.CREATOR;
            }

            public r(hs2.c cVar, boolean z14) {
                super(null);
                this.f52091a = cVar;
                this.f52092b = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return p005kotlin.jvm.internal.s.g(this.f52091a, rVar.f52091a) && this.f52092b == rVar.f52092b;
            }

            public final int hashCode() {
                hs2.c cVar = this.f52091a;
                return Boolean.hashCode(this.f52092b) + ((cVar == null ? 0 : cVar.hashCode()) * 31);
            }

            public final String toString() {
                return "SetExpressCard(expressCard=" + this.f52091a + ", isEnabled=" + this.f52092b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$c$s;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$c;", "Lhs2/c;", "expressCard", "", Constants.ENABLE_DISABLE, "<init>", "(Lhs2/c;Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class s extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final hs2.c f52093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f52094b;

            static {
                Parcelable.Creator<hs2.c> creator = hs2.c.CREATOR;
            }

            public s(hs2.c cVar, boolean z14) {
                super(null);
                this.f52093a = cVar;
                this.f52094b = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s)) {
                    return false;
                }
                s sVar = (s) obj;
                return p005kotlin.jvm.internal.s.g(this.f52093a, sVar.f52093a) && this.f52094b == sVar.f52094b;
            }

            public final int hashCode() {
                hs2.c cVar = this.f52093a;
                return Boolean.hashCode(this.f52094b) + ((cVar == null ? 0 : cVar.hashCode()) * 31);
            }

            public final String toString() {
                return "SetExpressCardNotificationThreshold(expressCard=" + this.f52093a + ", isEnabled=" + this.f52094b + ")";
            }
        }

        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$d;", "", "<init>", "()V", "b", "c", "f", "a", "g", "d", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$a;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$b;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$c;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$d;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$e;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$f;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$g;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.devicesettings.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$a;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d;", "", "isLongClick", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1094a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52095a;

            public C1094a(boolean z14) {
                super(null);
                this.f52095a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1094a) && this.f52095a == ((C1094a) obj).f52095a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52095a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("AddCard(isLongClick=", ")", this.f52095a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$c;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d;", "", "isLongClick", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52099a;

            public c(boolean z14) {
                super(null);
                this.f52099a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f52099a == ((c) obj).f52099a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52099a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("ChangePasscode(isLongClick=", ")", this.f52099a);
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.devicesettings.a$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$d;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d;", "", "isLongClick", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1095d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52100a;

            public C1095d(boolean z14) {
                super(null);
                this.f52100a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1095d) && this.f52100a == ((C1095d) obj).f52100a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52100a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("ExpressCard(isLongClick=", ")", this.f52100a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$e;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d;", "", "isLongClick", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52101a;

            public e(boolean z14) {
                super(null);
                this.f52101a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f52101a == ((e) obj).f52101a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52101a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("ExpressCardNotificationThreshold(isLongClick=", ")", this.f52101a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$f;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d;", "", "isLongClick", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52102a;

            public f(boolean z14) {
                super(null);
                this.f52102a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f52102a == ((f) obj).f52102a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52102a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("LostYourWatch(isLongClick=", ")", this.f52102a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$g;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d;", "", "isLongClick", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52103a;

            public g(boolean z14) {
                super(null);
                this.f52103a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f52103a == ((g) obj).f52103a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52103a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("ResetWallet(isLongClick=", ")", this.f52103a);
            }
        }

        public /* synthetic */ d(j jVar) {
            this();
        }

        private d() {
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/ui/devicesettings/a$d$b;", "Lcom/garmin/feature/garminpay/ui/devicesettings/a$d;", "Lvr2/q;", "selectedCardModel", "", "cardSupportsRemoveOperation", "isLongClick", "<init>", "(Lvr2/q;ZZ)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q f52096a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f52097b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f52098c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q qVar, boolean z14, boolean z15) {
                super(null);
                qVar.getClass();
                this.f52096a = qVar;
                this.f52097b = z14;
                this.f52098c = z15;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return s.g(this.f52096a, bVar.f52096a) && this.f52097b == bVar.f52097b && this.f52098c == bVar.f52098c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f52098c) + q6.f.g(this.f52096a.hashCode() * 31, 31, this.f52097b);
            }

            public final String toString() {
                StringBuilder sb3 = new StringBuilder("CardItem(selectedCardModel=");
                sb3.append(this.f52096a);
                sb3.append(", cardSupportsRemoveOperation=");
                sb3.append(this.f52097b);
                sb3.append(", isLongClick=");
                return hb.a.k(sb3, this.f52098c, ")");
            }

            public /* synthetic */ b(q qVar, boolean z14, boolean z15, int i14, j jVar) {
                this(qVar, (i14 & 2) != 0 ? false : z14, z15);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        onBindViewHolder(f0Var, i14, j0.f134944a);
    }
}
