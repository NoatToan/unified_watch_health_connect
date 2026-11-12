package com.garmin.android.apps.connectmobile.contacts.emergency;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c2.b0;
import c2.h2;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import i3.b1;
import i3.h1;
import i3.mh;
import j20.t;
import j20.x;
import j20.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.i;
import l72.p2;
import o13.p;
import o4.d0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import s5.x0;
import u1.u;
import v.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32689b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f32690a = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.contacts.emergency.d.class), new b(this), new d(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32691a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f32691a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32691a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f32693b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f32692a = aVar;
            this.f32693b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32692a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32693b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f32694a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f32694a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(1344009832, true, new y(this, 0)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.f(this);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[EDGE_INSN: B:39:0x00b8->B:27:0x0083 BREAK  A[LOOP:4: B:34:0x0099->B:113:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u6(l<? super l20.c, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        ArrayList arrayList;
        String string;
        boolean z14;
        p pVar;
        ArrayList arrayList2;
        this = this;
        o0 o0VarE = mVar.E(-1583004601);
        int i15 = i14 | (o0VarE.r(lVar) ? 4 : 2) | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = n.f135158a;
            ArrayList arrayList3 = this.w6().f32648g;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                arrayList = this.w6().f32648g;
                if (arrayList == null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((l20.c) it.next()).G()) {
                                string = this.getString(R.string.lbl_contact_must_accept_request_message_format, this.getString(R.string.lbl_contact_must_accept_request_emergency_contact_fragment));
                                break;
                            }
                        } else {
                            string = this.getResources().getString(R.string.lbl_contact_must_accept_request_message_format, this.getString(R.string.lbl_contact_must_accept_request_livetrack_fragment));
                            break;
                        }
                    }
                } else {
                    string = this.getResources().getString(R.string.lbl_contact_must_accept_request_message_format, this.getString(R.string.lbl_contact_must_accept_request_livetrack_fragment));
                    break;
                }
            } else {
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        arrayList = this.w6().f32648g;
                        if (arrayList == null) {
                            string = this.getResources().getString(R.string.lbl_contact_must_accept_request_message_format, this.getString(R.string.lbl_contact_must_accept_request_livetrack_fragment));
                            break;
                        } else {
                            string = this.getResources().getString(R.string.lbl_contact_must_accept_request_message_format, this.getString(R.string.lbl_contact_must_accept_request_livetrack_fragment));
                            break;
                        }
                    }
                    if (((l20.c) it3.next()).F()) {
                        string = this.getString(R.string.lbl_contact_must_accept_request_message_format, x.d(this.getString(R.string.lbl_contact_must_accept_request_emergency_contact_fragment), StringUtils.SPACE, this.getString(R.string.lbl_and), StringUtils.SPACE, this.getString(R.string.lbl_contact_must_accept_request_livetrack_fragment)));
                    }
                }
            }
            String str = string;
            str.getClass();
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            p3.x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String string2 = this.getString(R.string.lbl_send_new_requests);
            string2.getClass();
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97930g;
            long jD = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            r rVarF = x2.f(aVar, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97920e;
            bVar2.getClass();
            float f16 = eVar.f97917b;
            bVar2.getClass();
            bVar2.getClass();
            mh.c(string2, c2.l.B(rVarF, f15, f14, f15, f16), jD, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 130040);
            fVar.getClass();
            x0 x0Var2 = j92.f.f97931h;
            long jD2 = com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE);
            r rVarF2 = x2.f(aVar, 1.0f);
            bVar2.getClass();
            float f17 = eVar.f97918c;
            bVar2.getClass();
            float f18 = eVar.f97921f;
            bVar2.getClass();
            bVar2.getClass();
            mh.c(str, c2.l.B(rVarF2, f15, f17, f15, f18), jD2, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 0, 0, 130040);
            o0 o0Var2 = o0VarE;
            ArrayList<l20.c> arrayList4 = w6().f32648g;
            if (arrayList4 == null) {
                o0Var2.C(346867914);
                o0Var2.g0(false);
                o0Var = o0Var2;
                z14 = true;
            } else {
                o0Var2.C(346867915);
                for (l20.c cVar : arrayList4) {
                    com.garmin.android.apps.connectmobile.contacts.emergency.d dVarW6 = w6();
                    cVar.getClass();
                    Iterator it4 = dVarW6.f32661v.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            n23.j.s("Collection contains no element matching the predicate.");
                            return;
                        }
                        pVar = (p) it4.next();
                        if (s.g(((l20.c) pVar.f128594a).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                            break;
                        } else {
                            o0Var2 = o0Var2;
                        }
                    }
                    boolean z15 = !((Boolean) pVar.f128595b).booleanValue();
                    List<l20.c> listR = w6().f32646e.r();
                    if (listR != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj : listR) {
                            if (s.g(((l20.c) obj).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                                arrayList2.add(obj);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    boolean z16 = arrayList2 == null || arrayList2.isEmpty();
                    p2 p2Var = p2.f111205a;
                    String strV = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    if (z16) {
                        if (strV != null) {
                            Context contextRequireContext = requireContext();
                            contextRequireContext.getClass();
                            strV = jg.b.v(contextRequireContext, strV);
                        } else {
                            strV = null;
                        }
                    }
                    if (strV == null) {
                        strV = "";
                    }
                    o0 o0Var3 = o0Var2;
                    p2Var.h(strV, cVar.u().name(), null, null, null, false, false, null, z3.f.c(847537037, new ad0.g(this, z15, lVar, cVar), o0Var2), null, null, o0Var3, 100663296, 0, 1788);
                    o0Var2 = o0Var3;
                }
                o0Var = o0Var2;
                z14 = true;
                o0Var.g0(false);
            }
            o0Var.g0(z14);
            p3.x1 x1Var3 = n.f135158a;
        } else {
            lVar = lVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(this, lVar, i14, 14);
        }
    }

    public final void v6(String str, @SuppressLint({"ModifierParameter"}) r rVar, boolean z14, b1 b1Var, h2 h2Var, e23.a aVar, long j8, x0 x0Var, u uVar, m mVar, int i14) {
        h2 h2Var2;
        x0 x0Var2;
        h2 h2VarA;
        int i15;
        x0 x0Var3;
        o0 o0VarE = mVar.E(-1222247093);
        int i16 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.B(b1Var) ? 16384 : 8192) | 65536 | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.l(j8) ? 8388608 : 4194304) | 33554432 | (o0VarE.B(uVar) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, (306783379 & i16) != 306783378)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                d92.b bVar = d92.b.f58623a;
                bVar.getClass();
                d92.b.f58625c.getClass();
                h2VarA = c2.l.a(j92.b.f97899b.f97918c);
                bVar.getClass();
                d92.b.f58624b.getClass();
                i15 = i16 & (-235339777);
                x0Var3 = j92.f.f97931h;
            } else {
                o0VarE.e();
                i15 = i16 & (-235339777);
                h2VarA = h2Var;
                x0Var3 = x0Var;
            }
            o0VarE.h0();
            p3.x1 x1Var = n.f135158a;
            long jC = z14 ? j8 : d0.c(0.5f, j8, 14);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            int i17 = i15 >> 3;
            h2 h2Var3 = h2VarA;
            h1.a(aVar, rVar, z14, i.a(j92.b.f97900c.f97910b), b1Var, null, uVar, h2Var3, null, z3.f.c(105531227, new cw1.m(x0Var3, jC, str, 2), o0VarE), o0VarE, (14 & (i15 >> 18)) | C.ENCODING_PCM_32BIT | (i17 & 112) | (i17 & 896) | (57344 & i15) | ((i15 >> 9) & 3670016), 288);
            h2Var2 = h2Var3;
            x0Var2 = x0Var3;
        } else {
            o0VarE.e();
            h2Var2 = h2Var;
            x0Var2 = x0Var;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(this, str, rVar, z14, b1Var, h2Var2, aVar, j8, x0Var2, uVar, i14, 1);
        }
    }

    public final com.garmin.android.apps.connectmobile.contacts.emergency.d w6() {
        return (com.garmin.android.apps.connectmobile.contacts.emergency.d) this.f32690a.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
