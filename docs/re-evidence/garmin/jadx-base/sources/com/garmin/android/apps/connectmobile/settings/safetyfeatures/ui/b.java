package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w0;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.u;
import b21.z6;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsActivity;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import e23.l;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l20.r;
import lc.u0;
import o13.h;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.y;
import pj1.d0;
import pj1.s;
import r22.q0;
import ty1.f1;
import uj1.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/b;", "Ldv/b;", "Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/a$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends dv.b implements com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f43713m = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConstraintLayout f43715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f43716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f43717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f43718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a f43719g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.c<Intent> f43723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f43724l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43714b = new w1(s0.f105811a.b(s.class), new e(this), new g(this), new f(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f43720h = m.b(new f1(this, 13));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f43721i = s3.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f43722j = new c();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0812b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43725a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43725a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/b$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends b.s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            Boolean boolValueOf;
            boolean z14;
            r userContactsDTO;
            List<l20.a> listF;
            a aVar = b.f43713m;
            b bVar = b.this;
            int i14 = 1;
            if (((Boolean) bVar.f43720h.getValue()).booleanValue()) {
                s sVarY6 = bVar.y6();
                g3<tj1.e> g3VarD = sVarY6.C4().d();
                tj1.e eVar = g3VarD != null ? g3VarD.f35301b : null;
                if (s.n5(eVar, new z6(i14, eVar, sVarY6))) {
                    y0<g3<tj1.e>> y0VarC4 = sVarY6.C4();
                    g3.a aVar2 = g3.f35298f;
                    g3<tj1.e> g3VarD2 = sVarY6.C4().d();
                    tj1.e eVar2 = g3VarD2 != null ? g3VarD2.f35301b : null;
                    aVar2.getClass();
                    y0VarC4.m(g3.a.b(eVar2));
                    s.Z4(sVarY6, eVar, 2);
                    return;
                }
                return;
            }
            s sVarY7 = bVar.y6();
            Integer numValueOf = Integer.valueOf(R.string.lte_exit_assistance_contacts);
            y0<w61.f<o13.p<Integer, Integer>>> y0Var = sVarY7.L0;
            g3<tj1.e> g3VarD3 = sVarY7.C4().d();
            tj1.e eVar3 = g3VarD3 != null ? g3VarD3.f35301b : null;
            ArrayList arrayListT = (eVar3 == null || (userContactsDTO = eVar3.getUserContactsDTO()) == null || (listF = userContactsDTO.f()) == null) ? null : ge1.b.t(listF);
            boolean z15 = arrayListT != null && d0.f(arrayListT);
            if (arrayListT != null) {
                if (arrayListT.isEmpty()) {
                    z14 = true;
                } else {
                    Iterator it = arrayListT.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            List<l20.c> listZ = ((l20.a) it.next()).z();
                            if (listZ == null || listZ.isEmpty()) {
                                z14 = false;
                            }
                        } else {
                            z14 = true;
                        }
                    }
                }
                boolValueOf = Boolean.valueOf(z14);
            } else {
                boolValueOf = null;
            }
            if (!z15) {
                y0<g3<tj1.e>> y0VarC5 = sVarY7.C4();
                g3.a aVar3 = g3.f35298f;
                tj1.e eVarB = eVar3 != null ? tj1.e.b(eVar3, Boolean.FALSE, null, 2) : null;
                aVar3.getClass();
                y0VarC5.m(g3.a.d(eVarB));
            }
            if (!(eVar3 != null ? p005kotlin.jvm.internal.s.g(eVar3.getAssistancePlusEnabled(), Boolean.TRUE) : false)) {
                if (((arrayListT == null || !arrayListT.isEmpty()) ? 0 : 1) != 0) {
                    y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_assistance_contact_mandatory))));
                    return;
                } else {
                    y0Var.m(new w61.f<>(new o13.p(null, null)));
                    return;
                }
            }
            if ((arrayListT != null && (arrayListT.isEmpty() ^ true)) && !z15) {
                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_assistance_contact_assistance_plus))));
                return;
            }
            if ((arrayListT != null && (arrayListT.isEmpty() ^ true)) && p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.FALSE)) {
                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_assistance_contact_phone_number_required))));
                return;
            }
            if (((arrayListT == null || !arrayListT.isEmpty()) ? 0 : 1) != 0) {
                y0Var.m(new w61.f<>(new o13.p(numValueOf, Integer.valueOf(R.string.lte_exit_info_assistance_contacts_and_other_safety))));
            } else {
                y0Var.m(new w61.f<>(new o13.p(null, null)));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43727a;

        public d(l lVar) {
            lVar.getClass();
            this.f43727a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43727a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43727a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43728a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f43728a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43728a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43729a = aVar;
            this.f43730b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43729a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43730b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f43731a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43731a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public b() {
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: uj1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b f171522b;

            {
                this.f171522b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                Bundle extras;
                Parcelable parcelable;
                l20.a aVar2;
                l20.r rVar;
                ArrayList arrayList;
                List<l20.a> listF;
                List<l20.a> listF2;
                List<l20.a> listF3;
                tj1.e eVar;
                Bundle extras2;
                Bundle extras3;
                Parcelable parcelable2;
                Bundle extras4;
                Parcelable parcelable3;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar = this.f171522b;
                f.a aVar3 = (f.a) obj;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent = aVar3.f67586b;
                            if (intent == null || (extras = intent.getExtras()) == null) {
                                aVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) extras.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable4 = extras.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable4 instanceof l20.a)) {
                                        parcelable4 = null;
                                    }
                                    parcelable = (l20.a) parcelable4;
                                }
                                aVar = (l20.a) parcelable;
                            }
                            if (aVar != null) {
                                bVar.y6().R4(aVar);
                            } else {
                                pj1.s sVarY6 = bVar.y6();
                                ge1.b.T(v1.a(sVarY6), null, null, new pj1.w(sVarY6, null), 3);
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            if (intent2 == null || (extras4 = intent2.getExtras()) == null) {
                                aVar2 = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) extras4.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable5 = extras4.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable5 instanceof l20.a)) {
                                        parcelable5 = null;
                                    }
                                    parcelable3 = (l20.a) parcelable5;
                                }
                                aVar2 = (l20.a) parcelable3;
                            }
                            if (intent2 == null || (extras3 = intent2.getExtras()) == null) {
                                rVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) extras3.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO", l20.r.class);
                                } else {
                                    Parcelable parcelable6 = extras3.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO");
                                    if (!(parcelable6 instanceof l20.r)) {
                                        parcelable6 = null;
                                    }
                                    parcelable2 = (l20.r) parcelable6;
                                }
                                rVar = (l20.r) parcelable2;
                            }
                            if (!p005kotlin.jvm.internal.s.g((intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("IS_CONTACT_UPDATED", true)), Boolean.FALSE)) {
                                g3<tj1.e> g3VarD = bVar.y6().C4().d();
                                l20.r userContactsDTO = (g3VarD == null || (eVar = g3VarD.f35301b) == null) ? null : eVar.getUserContactsDTO();
                                l20.a aVarA = (userContactsDTO == null || (listF3 = userContactsDTO.f()) == null) ? null : vj1.f.a(listF3);
                                l20.c cVarB = aVarA != null ? vj1.f.b(aVarA) : null;
                                l20.a aVarA2 = (userContactsDTO == null || (listF2 = userContactsDTO.f()) == null) ? null : vj1.f.a(listF2);
                                l20.c cVarB2 = aVarA2 != null ? vj1.f.b(aVarA2) : null;
                                if (rVar == null || (listF = rVar.f()) == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList(p13.y.r(listF, 10));
                                    Iterator<T> it = listF.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.A6((l20.a) it.next(), aVarA2, cVarB2));
                                    }
                                }
                                l20.r rVarB = rVar != null ? l20.r.b(rVar, arrayList, userContactsDTO != null ? userContactsDTO.getEmergencyServiceContact() : null, null, 60) : null;
                                l20.a aVarA6 = aVar2 != null ? com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.A6(aVar2, aVarA, cVarB) : null;
                                if (aVarA6 != null) {
                                    if (rVarB != null) {
                                        bVar.y6().h5(rVarB);
                                    }
                                    bVar.y6().R4(aVarA6);
                                } else if (rVarB != null) {
                                    bVar.y6().Q4(rVarB);
                                    bVar.y6().h5(rVarB);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f43723k = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: uj1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b f171522b;

            {
                this.f171522b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                Bundle extras;
                Parcelable parcelable;
                l20.a aVar2;
                l20.r rVar;
                ArrayList arrayList;
                List<l20.a> listF;
                List<l20.a> listF2;
                List<l20.a> listF3;
                tj1.e eVar;
                Bundle extras2;
                Bundle extras3;
                Parcelable parcelable2;
                Bundle extras4;
                Parcelable parcelable3;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar = this.f171522b;
                f.a aVar3 = (f.a) obj;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        aVar3.getClass();
                        if (aVar3.f67585a == -1) {
                            Intent intent = aVar3.f67586b;
                            if (intent == null || (extras = intent.getExtras()) == null) {
                                aVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) extras.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable4 = extras.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable4 instanceof l20.a)) {
                                        parcelable4 = null;
                                    }
                                    parcelable = (l20.a) parcelable4;
                                }
                                aVar = (l20.a) parcelable;
                            }
                            if (aVar != null) {
                                bVar.y6().R4(aVar);
                            } else {
                                pj1.s sVarY6 = bVar.y6();
                                ge1.b.T(v1.a(sVarY6), null, null, new pj1.w(sVarY6, null), 3);
                            }
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        aVar3.getClass();
                        Intent intent2 = aVar3.f67586b;
                        if (aVar3.f67585a == -1) {
                            if (intent2 == null || (extras4 = intent2.getExtras()) == null) {
                                aVar2 = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable3 = (Parcelable) extras4.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable5 = extras4.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable5 instanceof l20.a)) {
                                        parcelable5 = null;
                                    }
                                    parcelable3 = (l20.a) parcelable5;
                                }
                                aVar2 = (l20.a) parcelable3;
                            }
                            if (intent2 == null || (extras3 = intent2.getExtras()) == null) {
                                rVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable2 = (Parcelable) extras3.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO", l20.r.class);
                                } else {
                                    Parcelable parcelable6 = extras3.getParcelable("RESULT_EXTRA_USER_CONTACTS_DTO");
                                    if (!(parcelable6 instanceof l20.r)) {
                                        parcelable6 = null;
                                    }
                                    parcelable2 = (l20.r) parcelable6;
                                }
                                rVar = (l20.r) parcelable2;
                            }
                            if (!p005kotlin.jvm.internal.s.g((intent2 == null || (extras2 = intent2.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("IS_CONTACT_UPDATED", true)), Boolean.FALSE)) {
                                g3<tj1.e> g3VarD = bVar.y6().C4().d();
                                l20.r userContactsDTO = (g3VarD == null || (eVar = g3VarD.f35301b) == null) ? null : eVar.getUserContactsDTO();
                                l20.a aVarA = (userContactsDTO == null || (listF3 = userContactsDTO.f()) == null) ? null : vj1.f.a(listF3);
                                l20.c cVarB = aVarA != null ? vj1.f.b(aVarA) : null;
                                l20.a aVarA2 = (userContactsDTO == null || (listF2 = userContactsDTO.f()) == null) ? null : vj1.f.a(listF2);
                                l20.c cVarB2 = aVarA2 != null ? vj1.f.b(aVarA2) : null;
                                if (rVar == null || (listF = rVar.f()) == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList(p13.y.r(listF, 10));
                                    Iterator<T> it = listF.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.A6((l20.a) it.next(), aVarA2, cVarB2));
                                    }
                                }
                                l20.r rVarB = rVar != null ? l20.r.b(rVar, arrayList, userContactsDTO != null ? userContactsDTO.getEmergencyServiceContact() : null, null, 60) : null;
                                l20.a aVarA6 = aVar2 != null ? com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.A6(aVar2, aVarA, cVarB) : null;
                                if (aVarA6 != null) {
                                    if (rVarB != null) {
                                        bVar.y6().h5(rVarB);
                                    }
                                    bVar.y6().R4(aVarA6);
                                } else if (rVarB != null) {
                                    bVar.y6().Q4(rVarB);
                                    bVar.y6().h5(rVarB);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f43724l = cVarRegisterForActivityResult2;
    }

    public static l20.a A6(l20.a aVar, l20.a aVar2, l20.c cVar) {
        ArrayList arrayList;
        List<l20.c> listZ = aVar.z();
        if (listZ != null) {
            ArrayList arrayList2 = new ArrayList(y.r(listZ, 10));
            for (l20.c cVarB : listZ) {
                if (p005kotlin.jvm.internal.s.g(aVar.getContactId(), aVar2 != null ? aVar2.getContactId() : null)) {
                    if (p005kotlin.jvm.internal.s.g(cVarB.getContactInfoPk(), cVar != null ? cVar.getContactInfoPk() : null)) {
                        cVarB = l20.c.b(cVarB, null, null, null, null, null, Boolean.TRUE, null, null, null, null, 0, 1048511);
                    }
                }
                arrayList2.add(cVarB);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        boolean z14 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (p005kotlin.jvm.internal.s.g(((l20.c) it.next()).getIsEmsValue(), Boolean.TRUE)) {
                    z14 = true;
                    break;
                }
            }
        }
        return l20.a.g(aVar, null, null, null, null, null, null, null, arrayList, Boolean.valueOf(z14), 6015);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a.b
    public final void H5(l20.a aVar) {
        Context context;
        if (this.f43721i || (context = getContext()) == null) {
            return;
        }
        this.f43723k.a(ContactDetailsActivity.a.b(ContactDetailsActivity.f32429g, context, aVar, y6().f137981q, 24), null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_emergency_contacts, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.add_emergency_contact_btn);
        viewFindViewById.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.f43715c = constraintLayout;
        View viewFindViewById2 = constraintLayout.findViewById(R.id.left_option_label);
        viewFindViewById2.getClass();
        this.f43716d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.emergency_contacts_lbl);
        viewFindViewById3.getClass();
        this.f43717e = (TextView) viewFindViewById3;
        TextView textView = this.f43716d;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("buttonTextView");
            throw null;
        }
        textView.setText(getString(R.string.incident_detection_title_add_assistance_contact));
        View viewFindViewById4 = view2.findViewById(R.id.contacts_recycler_view);
        viewFindViewById4.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f43718f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        String string = requireContext().getString(R.string.assistance_contacts_title);
        string.getClass();
        g22.e.g(this, string);
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f43722j, viewLifecycleOwner);
        if (this.f43721i) {
            f12.l.f68084a.getClass();
            com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
            TextView textView2 = this.f43717e;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("descriptionTextView");
                throw null;
            }
            String str = gVarW0 != null ? gVarW0.f46858b : null;
            if (str == null) {
                str = "";
            }
            textView2.setText(getString(R.string.msg_child_safety_feature_assistance_contacts, str));
            ConstraintLayout constraintLayout2 = this.f43715c;
            if (constraintLayout2 == null) {
                p005kotlin.jvm.internal.s.m("addEmergencyContactsButton");
                throw null;
            }
            constraintLayout2.setVisibility(8);
        }
        final int i14 = 0;
        y6().C.f(getViewLifecycleOwner(), new d(new l(this) { // from class: uj1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b f171501b;

            {
                this.f171501b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                pj1.l lVar;
                String string2;
                String string3;
                int i15 = i14;
                final int i16 = 2;
                final int i17 = 1;
                final int i18 = 0;
                final com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar = this.f171501b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i19 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.C0812b.f43725a[pVar.ordinal()];
                        if (i19 == 1) {
                            g22.e.f(bVar);
                            yj1.g gVar = (yj1.g) t7;
                            if (gVar != null) {
                                if (bVar.f43721i && gVar.f197543b.isEmpty()) {
                                    androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                                    SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                                    androidx.fragment.app.m mVarRequireActivity2 = bVar.requireActivity();
                                    mVarRequireActivity2.getClass();
                                    hl.a aVar3 = bVar.y6().f137981q;
                                    aVar2.getClass();
                                    mVarRequireActivity.startActivity(SafetyFeatureSetupWizardActivity.a.a(mVarRequireActivity2, aVar3));
                                    bVar.requireActivity().finish();
                                } else {
                                    bVar.v6(gVar);
                                }
                            }
                        } else if (i19 == 2) {
                            g22.e.l(bVar);
                        } else {
                            if (i19 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(bVar);
                            if (lv0.c.c(g3Var)) {
                                bVar.w6(null);
                            } else {
                                g22.e.c(bVar);
                            }
                            yj1.g gVar2 = (yj1.g) t7;
                            if (gVar2 != null) {
                                bVar.v6(gVar2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        if (g3Var2.f35300a == fw.p.SUCCESS) {
                            yj1.k kVar = (yj1.k) g3Var2.f35301b;
                            if (kVar != null && (lVar = kVar.f197558c) != pj1.l.NONE && lVar != pj1.l.ACCEPT) {
                                pj1.l lVar2 = pj1.l.OPT_OUT;
                                final l20.a aVar5 = kVar.f197556a;
                                if (lVar != lVar2) {
                                    long j8 = kVar.f197557b;
                                    l20.c cVarI = aVar5.i(j8);
                                    if (cVarI != null) {
                                        if (cVarI.getDeclineReason() == null || cVarI.getDeclineReason() != com.garmin.android.apps.connectmobile.contacts.model.b.DECLINE_STRANGER) {
                                            string2 = bVar.getString(R.string.assistance_contact_request_declined_alert_title);
                                            string2.getClass();
                                            string3 = bVar.getString(R.string.emergency_contact_request_declined_alert_message, aVar5.j());
                                            string3.getClass();
                                        } else {
                                            string2 = bVar.getString(R.string.assistance_contact_request_needs_attention);
                                            string2.getClass();
                                            string3 = bVar.getString(R.string.emergency_contact_request_needs_attention_alert_message, aVar5.j());
                                            string3.getClass();
                                        }
                                        String str2 = string2;
                                        String str3 = string3;
                                        c22.f fVar = c22.f.f23050a;
                                        Context contextRequireContext = bVar.requireContext();
                                        contextRequireContext.getClass();
                                        c22.f.d(fVar, contextRequireContext, str2, str3, new o13.p(bVar.getString(R.string.choose_another_contact), new e23.p() { // from class: uj1.g
                                            @Override // e23.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i24 = i17;
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                                DialogInterface dialogInterface = (DialogInterface) obj2;
                                                ((Integer) obj3).getClass();
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                                switch (i24) {
                                                    case 0:
                                                        dialogInterface.getClass();
                                                        bVar2.f43722j.f(false);
                                                        dialogInterface.dismiss();
                                                        if (((Boolean) bVar2.f43720h.getValue()).booleanValue()) {
                                                            pj1.s.Z4(bVar2.y6(), null, 3);
                                                        } else {
                                                            bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                                        }
                                                        break;
                                                    default:
                                                        dialogInterface.getClass();
                                                        bVar2.f43724l.a(ContactActivity.a.a(ContactActivity.T, bVar2.getActivity(), false, 1, null, 3, false, bVar2.y6().f137981q, 40), null);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), new o13.p(bVar.getString(R.string.review_contact_details), new e23.p() { // from class: uj1.h
                                            @Override // e23.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i24 = i16;
                                                l20.a aVar6 = aVar5;
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                                DialogInterface dialogInterface = (DialogInterface) obj2;
                                                ((Integer) obj3).getClass();
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                                switch (i24) {
                                                    case 0:
                                                        dialogInterface.getClass();
                                                        pj1.s sVarY6 = bVar2.y6();
                                                        ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                        break;
                                                    case 1:
                                                        dialogInterface.getClass();
                                                        f.c<Intent> cVar = bVar2.f43724l;
                                                        EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                        androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                        mVarRequireActivity3.getClass();
                                                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                        break;
                                                    default:
                                                        dialogInterface.getClass();
                                                        bVar2.H5(aVar6);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), new o13.p(bVar.getString(R.string.lbl_close), new a(2)), false, 64).show();
                                    } else {
                                        a2 a2Var = a2.SAFETY_FEATURES;
                                        String strF = androidx.room.a0.f(j8, "[showDeclineDialog] Contact declined but did not have contactInfoPk ", "; not displaying dialog.");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var, "EmergencyContactsFragment", strF);
                                    }
                                } else if (aVar5.D()) {
                                    a2 a2Var2 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var2, "EmergencyContactsFragment", "[showOptOutDialog] Contact opted out but had another accepted contact method; not showing dialog.");
                                } else {
                                    c22.f fVar2 = c22.f.f23050a;
                                    Context contextRequireContext2 = bVar.requireContext();
                                    contextRequireContext2.getClass();
                                    c22.f.d(fVar2, contextRequireContext2, bVar.getString(R.string.assistance_contact_opted_out_alert_title), bVar.getString(R.string.assistance_contact_opted_out_alert_message, aVar5.j()), new o13.p(bVar.getString(R.string.remove_assistance_contact), new e23.p() { // from class: uj1.h
                                        @Override // e23.p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i24 = i18;
                                            l20.a aVar6 = aVar5;
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                            DialogInterface dialogInterface = (DialogInterface) obj2;
                                            ((Integer) obj3).getClass();
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                            switch (i24) {
                                                case 0:
                                                    dialogInterface.getClass();
                                                    pj1.s sVarY6 = bVar2.y6();
                                                    ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                    break;
                                                case 1:
                                                    dialogInterface.getClass();
                                                    f.c<Intent> cVar = bVar2.f43724l;
                                                    EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                    androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                    mVarRequireActivity3.getClass();
                                                    cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                    break;
                                                default:
                                                    dialogInterface.getClass();
                                                    bVar2.H5(aVar6);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), new o13.p(bVar.getString(R.string.send_new_request), new e23.p() { // from class: uj1.h
                                        @Override // e23.p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i24 = i17;
                                            l20.a aVar6 = aVar5;
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                            DialogInterface dialogInterface = (DialogInterface) obj2;
                                            ((Integer) obj3).getClass();
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                            switch (i24) {
                                                case 0:
                                                    dialogInterface.getClass();
                                                    pj1.s sVarY6 = bVar2.y6();
                                                    ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                    break;
                                                case 1:
                                                    dialogInterface.getClass();
                                                    f.c<Intent> cVar = bVar2.f43724l;
                                                    EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                    androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                    mVarRequireActivity3.getClass();
                                                    cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                    break;
                                                default:
                                                    dialogInterface.getClass();
                                                    bVar2.H5(aVar6);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), null, false, 96).show();
                                }
                            }
                            pj1.s sVarY6 = bVar.y6();
                            w0<g3<yj1.k>> w0Var = sVarY6.E;
                            w0Var.o(sVarY6.C4());
                            w0Var.j(g3.a.c(g3.f35298f));
                        }
                        return Unit.INSTANCE;
                    case 2:
                        o13.p pVar2 = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        pVar2.getClass();
                        Integer num = (Integer) pVar2.f128594a;
                        Integer num2 = (Integer) pVar2.f128595b;
                        if (num == null || num2 == null) {
                            bVar.f43722j.f(false);
                            bVar.requireActivity().getOnBackPressedDispatcher().d();
                        } else {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            c22.f fVar3 = c22.f.f23050a;
                            Context contextRequireContext3 = bVar.requireContext();
                            contextRequireContext3.getClass();
                            c22.f.d(fVar3, contextRequireContext3, bVar.getString(iIntValue), bVar.getString(iIntValue2), new o13.p(bVar.getString(R.string.lbl_exit), new e23.p() { // from class: uj1.g
                                @Override // e23.p
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i24 = i18;
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                    DialogInterface dialogInterface = (DialogInterface) obj2;
                                    ((Integer) obj3).getClass();
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                    switch (i24) {
                                        case 0:
                                            dialogInterface.getClass();
                                            bVar2.f43722j.f(false);
                                            dialogInterface.dismiss();
                                            if (((Boolean) bVar2.f43720h.getValue()).booleanValue()) {
                                                pj1.s.Z4(bVar2.y6(), null, 3);
                                            } else {
                                                bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                            }
                                            break;
                                        default:
                                            dialogInterface.getClass();
                                            bVar2.f43724l.a(ContactActivity.a.a(ContactActivity.T, bVar2.getActivity(), false, 1, null, 3, false, bVar2.y6().f137981q, 40), null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), new o13.p(bVar.getString(R.string.lbl_cancel), new a(3)), null, false, 96).show();
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        ((Unit) obj).getClass();
                        bVar.f43722j.f(false);
                        if (((Boolean) bVar.f43720h.getValue()).booleanValue()) {
                            Intent intent = new Intent(bVar.getContext(), (Class<?>) MoreActivity.class);
                            intent.addFlags(67108864);
                            intent.putExtra("GCM_extra_top_navigation", true);
                            Context context = bVar.getContext();
                            if (context != null) {
                                context.startActivity(intent);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i15 = 1;
        y6().F.f(getViewLifecycleOwner(), new d(new l(this) { // from class: uj1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b f171501b;

            {
                this.f171501b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                pj1.l lVar;
                String string2;
                String string3;
                int i16 = i15;
                final int i17 = 2;
                final int i18 = 1;
                final int i19 = 0;
                final com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar = this.f171501b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i110 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.C0812b.f43725a[pVar.ordinal()];
                        if (i110 == 1) {
                            g22.e.f(bVar);
                            yj1.g gVar = (yj1.g) t7;
                            if (gVar != null) {
                                if (bVar.f43721i && gVar.f197543b.isEmpty()) {
                                    androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                                    SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                                    androidx.fragment.app.m mVarRequireActivity2 = bVar.requireActivity();
                                    mVarRequireActivity2.getClass();
                                    hl.a aVar3 = bVar.y6().f137981q;
                                    aVar2.getClass();
                                    mVarRequireActivity.startActivity(SafetyFeatureSetupWizardActivity.a.a(mVarRequireActivity2, aVar3));
                                    bVar.requireActivity().finish();
                                } else {
                                    bVar.v6(gVar);
                                }
                            }
                        } else if (i110 == 2) {
                            g22.e.l(bVar);
                        } else {
                            if (i110 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(bVar);
                            if (lv0.c.c(g3Var)) {
                                bVar.w6(null);
                            } else {
                                g22.e.c(bVar);
                            }
                            yj1.g gVar2 = (yj1.g) t7;
                            if (gVar2 != null) {
                                bVar.v6(gVar2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        if (g3Var2.f35300a == fw.p.SUCCESS) {
                            yj1.k kVar = (yj1.k) g3Var2.f35301b;
                            if (kVar != null && (lVar = kVar.f197558c) != pj1.l.NONE && lVar != pj1.l.ACCEPT) {
                                pj1.l lVar2 = pj1.l.OPT_OUT;
                                final l20.a aVar5 = kVar.f197556a;
                                if (lVar != lVar2) {
                                    long j8 = kVar.f197557b;
                                    l20.c cVarI = aVar5.i(j8);
                                    if (cVarI != null) {
                                        if (cVarI.getDeclineReason() == null || cVarI.getDeclineReason() != com.garmin.android.apps.connectmobile.contacts.model.b.DECLINE_STRANGER) {
                                            string2 = bVar.getString(R.string.assistance_contact_request_declined_alert_title);
                                            string2.getClass();
                                            string3 = bVar.getString(R.string.emergency_contact_request_declined_alert_message, aVar5.j());
                                            string3.getClass();
                                        } else {
                                            string2 = bVar.getString(R.string.assistance_contact_request_needs_attention);
                                            string2.getClass();
                                            string3 = bVar.getString(R.string.emergency_contact_request_needs_attention_alert_message, aVar5.j());
                                            string3.getClass();
                                        }
                                        String str2 = string2;
                                        String str3 = string3;
                                        c22.f fVar = c22.f.f23050a;
                                        Context contextRequireContext = bVar.requireContext();
                                        contextRequireContext.getClass();
                                        c22.f.d(fVar, contextRequireContext, str2, str3, new o13.p(bVar.getString(R.string.choose_another_contact), new e23.p() { // from class: uj1.g
                                            @Override // e23.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i24 = i18;
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                                DialogInterface dialogInterface = (DialogInterface) obj2;
                                                ((Integer) obj3).getClass();
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                                switch (i24) {
                                                    case 0:
                                                        dialogInterface.getClass();
                                                        bVar2.f43722j.f(false);
                                                        dialogInterface.dismiss();
                                                        if (((Boolean) bVar2.f43720h.getValue()).booleanValue()) {
                                                            pj1.s.Z4(bVar2.y6(), null, 3);
                                                        } else {
                                                            bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                                        }
                                                        break;
                                                    default:
                                                        dialogInterface.getClass();
                                                        bVar2.f43724l.a(ContactActivity.a.a(ContactActivity.T, bVar2.getActivity(), false, 1, null, 3, false, bVar2.y6().f137981q, 40), null);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), new o13.p(bVar.getString(R.string.review_contact_details), new e23.p() { // from class: uj1.h
                                            @Override // e23.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i24 = i17;
                                                l20.a aVar6 = aVar5;
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                                DialogInterface dialogInterface = (DialogInterface) obj2;
                                                ((Integer) obj3).getClass();
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                                switch (i24) {
                                                    case 0:
                                                        dialogInterface.getClass();
                                                        pj1.s sVarY6 = bVar2.y6();
                                                        ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                        break;
                                                    case 1:
                                                        dialogInterface.getClass();
                                                        f.c<Intent> cVar = bVar2.f43724l;
                                                        EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                        androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                        mVarRequireActivity3.getClass();
                                                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                        break;
                                                    default:
                                                        dialogInterface.getClass();
                                                        bVar2.H5(aVar6);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), new o13.p(bVar.getString(R.string.lbl_close), new a(2)), false, 64).show();
                                    } else {
                                        a2 a2Var = a2.SAFETY_FEATURES;
                                        String strF = androidx.room.a0.f(j8, "[showDeclineDialog] Contact declined but did not have contactInfoPk ", "; not displaying dialog.");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var, "EmergencyContactsFragment", strF);
                                    }
                                } else if (aVar5.D()) {
                                    a2 a2Var2 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var2, "EmergencyContactsFragment", "[showOptOutDialog] Contact opted out but had another accepted contact method; not showing dialog.");
                                } else {
                                    c22.f fVar2 = c22.f.f23050a;
                                    Context contextRequireContext2 = bVar.requireContext();
                                    contextRequireContext2.getClass();
                                    c22.f.d(fVar2, contextRequireContext2, bVar.getString(R.string.assistance_contact_opted_out_alert_title), bVar.getString(R.string.assistance_contact_opted_out_alert_message, aVar5.j()), new o13.p(bVar.getString(R.string.remove_assistance_contact), new e23.p() { // from class: uj1.h
                                        @Override // e23.p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i24 = i19;
                                            l20.a aVar6 = aVar5;
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                            DialogInterface dialogInterface = (DialogInterface) obj2;
                                            ((Integer) obj3).getClass();
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                            switch (i24) {
                                                case 0:
                                                    dialogInterface.getClass();
                                                    pj1.s sVarY6 = bVar2.y6();
                                                    ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                    break;
                                                case 1:
                                                    dialogInterface.getClass();
                                                    f.c<Intent> cVar = bVar2.f43724l;
                                                    EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                    androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                    mVarRequireActivity3.getClass();
                                                    cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                    break;
                                                default:
                                                    dialogInterface.getClass();
                                                    bVar2.H5(aVar6);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), new o13.p(bVar.getString(R.string.send_new_request), new e23.p() { // from class: uj1.h
                                        @Override // e23.p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i24 = i18;
                                            l20.a aVar6 = aVar5;
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                            DialogInterface dialogInterface = (DialogInterface) obj2;
                                            ((Integer) obj3).getClass();
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                            switch (i24) {
                                                case 0:
                                                    dialogInterface.getClass();
                                                    pj1.s sVarY6 = bVar2.y6();
                                                    ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                    break;
                                                case 1:
                                                    dialogInterface.getClass();
                                                    f.c<Intent> cVar = bVar2.f43724l;
                                                    EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                    androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                    mVarRequireActivity3.getClass();
                                                    cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                    break;
                                                default:
                                                    dialogInterface.getClass();
                                                    bVar2.H5(aVar6);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), null, false, 96).show();
                                }
                            }
                            pj1.s sVarY6 = bVar.y6();
                            w0<g3<yj1.k>> w0Var = sVarY6.E;
                            w0Var.o(sVarY6.C4());
                            w0Var.j(g3.a.c(g3.f35298f));
                        }
                        return Unit.INSTANCE;
                    case 2:
                        o13.p pVar2 = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        pVar2.getClass();
                        Integer num = (Integer) pVar2.f128594a;
                        Integer num2 = (Integer) pVar2.f128595b;
                        if (num == null || num2 == null) {
                            bVar.f43722j.f(false);
                            bVar.requireActivity().getOnBackPressedDispatcher().d();
                        } else {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            c22.f fVar3 = c22.f.f23050a;
                            Context contextRequireContext3 = bVar.requireContext();
                            contextRequireContext3.getClass();
                            c22.f.d(fVar3, contextRequireContext3, bVar.getString(iIntValue), bVar.getString(iIntValue2), new o13.p(bVar.getString(R.string.lbl_exit), new e23.p() { // from class: uj1.g
                                @Override // e23.p
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i24 = i19;
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                    DialogInterface dialogInterface = (DialogInterface) obj2;
                                    ((Integer) obj3).getClass();
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                    switch (i24) {
                                        case 0:
                                            dialogInterface.getClass();
                                            bVar2.f43722j.f(false);
                                            dialogInterface.dismiss();
                                            if (((Boolean) bVar2.f43720h.getValue()).booleanValue()) {
                                                pj1.s.Z4(bVar2.y6(), null, 3);
                                            } else {
                                                bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                            }
                                            break;
                                        default:
                                            dialogInterface.getClass();
                                            bVar2.f43724l.a(ContactActivity.a.a(ContactActivity.T, bVar2.getActivity(), false, 1, null, 3, false, bVar2.y6().f137981q, 40), null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), new o13.p(bVar.getString(R.string.lbl_cancel), new a(3)), null, false, 96).show();
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        ((Unit) obj).getClass();
                        bVar.f43722j.f(false);
                        if (((Boolean) bVar.f43720h.getValue()).booleanValue()) {
                            Intent intent = new Intent(bVar.getContext(), (Class<?>) MoreActivity.class);
                            intent.addFlags(67108864);
                            intent.putExtra("GCM_extra_top_navigation", true);
                            Context context = bVar.getContext();
                            if (context != null) {
                                context.startActivity(intent);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i16 = 2;
        y6().M0.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: uj1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b f171501b;

            {
                this.f171501b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                pj1.l lVar;
                String string2;
                String string3;
                int i17 = i16;
                final int i18 = 2;
                final int i19 = 1;
                final int i110 = 0;
                final com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar = this.f171501b;
                switch (i17) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i111 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.C0812b.f43725a[pVar.ordinal()];
                        if (i111 == 1) {
                            g22.e.f(bVar);
                            yj1.g gVar = (yj1.g) t7;
                            if (gVar != null) {
                                if (bVar.f43721i && gVar.f197543b.isEmpty()) {
                                    androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                                    SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                                    androidx.fragment.app.m mVarRequireActivity2 = bVar.requireActivity();
                                    mVarRequireActivity2.getClass();
                                    hl.a aVar3 = bVar.y6().f137981q;
                                    aVar2.getClass();
                                    mVarRequireActivity.startActivity(SafetyFeatureSetupWizardActivity.a.a(mVarRequireActivity2, aVar3));
                                    bVar.requireActivity().finish();
                                } else {
                                    bVar.v6(gVar);
                                }
                            }
                        } else if (i111 == 2) {
                            g22.e.l(bVar);
                        } else {
                            if (i111 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(bVar);
                            if (lv0.c.c(g3Var)) {
                                bVar.w6(null);
                            } else {
                                g22.e.c(bVar);
                            }
                            yj1.g gVar2 = (yj1.g) t7;
                            if (gVar2 != null) {
                                bVar.v6(gVar2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        if (g3Var2.f35300a == fw.p.SUCCESS) {
                            yj1.k kVar = (yj1.k) g3Var2.f35301b;
                            if (kVar != null && (lVar = kVar.f197558c) != pj1.l.NONE && lVar != pj1.l.ACCEPT) {
                                pj1.l lVar2 = pj1.l.OPT_OUT;
                                final l20.a aVar5 = kVar.f197556a;
                                if (lVar != lVar2) {
                                    long j8 = kVar.f197557b;
                                    l20.c cVarI = aVar5.i(j8);
                                    if (cVarI != null) {
                                        if (cVarI.getDeclineReason() == null || cVarI.getDeclineReason() != com.garmin.android.apps.connectmobile.contacts.model.b.DECLINE_STRANGER) {
                                            string2 = bVar.getString(R.string.assistance_contact_request_declined_alert_title);
                                            string2.getClass();
                                            string3 = bVar.getString(R.string.emergency_contact_request_declined_alert_message, aVar5.j());
                                            string3.getClass();
                                        } else {
                                            string2 = bVar.getString(R.string.assistance_contact_request_needs_attention);
                                            string2.getClass();
                                            string3 = bVar.getString(R.string.emergency_contact_request_needs_attention_alert_message, aVar5.j());
                                            string3.getClass();
                                        }
                                        String str2 = string2;
                                        String str3 = string3;
                                        c22.f fVar = c22.f.f23050a;
                                        Context contextRequireContext = bVar.requireContext();
                                        contextRequireContext.getClass();
                                        c22.f.d(fVar, contextRequireContext, str2, str3, new o13.p(bVar.getString(R.string.choose_another_contact), new e23.p() { // from class: uj1.g
                                            @Override // e23.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i24 = i19;
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                                DialogInterface dialogInterface = (DialogInterface) obj2;
                                                ((Integer) obj3).getClass();
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                                switch (i24) {
                                                    case 0:
                                                        dialogInterface.getClass();
                                                        bVar2.f43722j.f(false);
                                                        dialogInterface.dismiss();
                                                        if (((Boolean) bVar2.f43720h.getValue()).booleanValue()) {
                                                            pj1.s.Z4(bVar2.y6(), null, 3);
                                                        } else {
                                                            bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                                        }
                                                        break;
                                                    default:
                                                        dialogInterface.getClass();
                                                        bVar2.f43724l.a(ContactActivity.a.a(ContactActivity.T, bVar2.getActivity(), false, 1, null, 3, false, bVar2.y6().f137981q, 40), null);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), new o13.p(bVar.getString(R.string.review_contact_details), new e23.p() { // from class: uj1.h
                                            @Override // e23.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i24 = i18;
                                                l20.a aVar6 = aVar5;
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                                DialogInterface dialogInterface = (DialogInterface) obj2;
                                                ((Integer) obj3).getClass();
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                                switch (i24) {
                                                    case 0:
                                                        dialogInterface.getClass();
                                                        pj1.s sVarY6 = bVar2.y6();
                                                        ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                        break;
                                                    case 1:
                                                        dialogInterface.getClass();
                                                        f.c<Intent> cVar = bVar2.f43724l;
                                                        EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                        androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                        mVarRequireActivity3.getClass();
                                                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                        break;
                                                    default:
                                                        dialogInterface.getClass();
                                                        bVar2.H5(aVar6);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), new o13.p(bVar.getString(R.string.lbl_close), new a(2)), false, 64).show();
                                    } else {
                                        a2 a2Var = a2.SAFETY_FEATURES;
                                        String strF = androidx.room.a0.f(j8, "[showDeclineDialog] Contact declined but did not have contactInfoPk ", "; not displaying dialog.");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var, "EmergencyContactsFragment", strF);
                                    }
                                } else if (aVar5.D()) {
                                    a2 a2Var2 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var2, "EmergencyContactsFragment", "[showOptOutDialog] Contact opted out but had another accepted contact method; not showing dialog.");
                                } else {
                                    c22.f fVar2 = c22.f.f23050a;
                                    Context contextRequireContext2 = bVar.requireContext();
                                    contextRequireContext2.getClass();
                                    c22.f.d(fVar2, contextRequireContext2, bVar.getString(R.string.assistance_contact_opted_out_alert_title), bVar.getString(R.string.assistance_contact_opted_out_alert_message, aVar5.j()), new o13.p(bVar.getString(R.string.remove_assistance_contact), new e23.p() { // from class: uj1.h
                                        @Override // e23.p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i24 = i110;
                                            l20.a aVar6 = aVar5;
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                            DialogInterface dialogInterface = (DialogInterface) obj2;
                                            ((Integer) obj3).getClass();
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                            switch (i24) {
                                                case 0:
                                                    dialogInterface.getClass();
                                                    pj1.s sVarY6 = bVar2.y6();
                                                    ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                    break;
                                                case 1:
                                                    dialogInterface.getClass();
                                                    f.c<Intent> cVar = bVar2.f43724l;
                                                    EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                    androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                    mVarRequireActivity3.getClass();
                                                    cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                    break;
                                                default:
                                                    dialogInterface.getClass();
                                                    bVar2.H5(aVar6);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), new o13.p(bVar.getString(R.string.send_new_request), new e23.p() { // from class: uj1.h
                                        @Override // e23.p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i24 = i19;
                                            l20.a aVar6 = aVar5;
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                            DialogInterface dialogInterface = (DialogInterface) obj2;
                                            ((Integer) obj3).getClass();
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                            switch (i24) {
                                                case 0:
                                                    dialogInterface.getClass();
                                                    pj1.s sVarY6 = bVar2.y6();
                                                    ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                    break;
                                                case 1:
                                                    dialogInterface.getClass();
                                                    f.c<Intent> cVar = bVar2.f43724l;
                                                    EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                    androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                    mVarRequireActivity3.getClass();
                                                    cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                    break;
                                                default:
                                                    dialogInterface.getClass();
                                                    bVar2.H5(aVar6);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), null, false, 96).show();
                                }
                            }
                            pj1.s sVarY6 = bVar.y6();
                            w0<g3<yj1.k>> w0Var = sVarY6.E;
                            w0Var.o(sVarY6.C4());
                            w0Var.j(g3.a.c(g3.f35298f));
                        }
                        return Unit.INSTANCE;
                    case 2:
                        o13.p pVar2 = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        pVar2.getClass();
                        Integer num = (Integer) pVar2.f128594a;
                        Integer num2 = (Integer) pVar2.f128595b;
                        if (num == null || num2 == null) {
                            bVar.f43722j.f(false);
                            bVar.requireActivity().getOnBackPressedDispatcher().d();
                        } else {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            c22.f fVar3 = c22.f.f23050a;
                            Context contextRequireContext3 = bVar.requireContext();
                            contextRequireContext3.getClass();
                            c22.f.d(fVar3, contextRequireContext3, bVar.getString(iIntValue), bVar.getString(iIntValue2), new o13.p(bVar.getString(R.string.lbl_exit), new e23.p() { // from class: uj1.g
                                @Override // e23.p
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i24 = i110;
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                    DialogInterface dialogInterface = (DialogInterface) obj2;
                                    ((Integer) obj3).getClass();
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                    switch (i24) {
                                        case 0:
                                            dialogInterface.getClass();
                                            bVar2.f43722j.f(false);
                                            dialogInterface.dismiss();
                                            if (((Boolean) bVar2.f43720h.getValue()).booleanValue()) {
                                                pj1.s.Z4(bVar2.y6(), null, 3);
                                            } else {
                                                bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                            }
                                            break;
                                        default:
                                            dialogInterface.getClass();
                                            bVar2.f43724l.a(ContactActivity.a.a(ContactActivity.T, bVar2.getActivity(), false, 1, null, 3, false, bVar2.y6().f137981q, 40), null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), new o13.p(bVar.getString(R.string.lbl_cancel), new a(3)), null, false, 96).show();
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        ((Unit) obj).getClass();
                        bVar.f43722j.f(false);
                        if (((Boolean) bVar.f43720h.getValue()).booleanValue()) {
                            Intent intent = new Intent(bVar.getContext(), (Class<?>) MoreActivity.class);
                            intent.addFlags(67108864);
                            intent.putExtra("GCM_extra_top_navigation", true);
                            Context context = bVar.getContext();
                            if (context != null) {
                                context.startActivity(intent);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        final int i17 = 3;
        y6().O0.f(getViewLifecycleOwner(), new w61.g(new l(this) { // from class: uj1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b f171501b;

            {
                this.f171501b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                pj1.l lVar;
                String string2;
                String string3;
                int i18 = i17;
                final int i19 = 2;
                final int i110 = 1;
                final int i111 = 0;
                final com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar = this.f171501b;
                switch (i18) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        fw.p pVar = g3Var.f35300a;
                        T t7 = g3Var.f35301b;
                        int i112 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.C0812b.f43725a[pVar.ordinal()];
                        if (i112 == 1) {
                            g22.e.f(bVar);
                            yj1.g gVar = (yj1.g) t7;
                            if (gVar != null) {
                                if (bVar.f43721i && gVar.f197543b.isEmpty()) {
                                    androidx.fragment.app.m mVarRequireActivity = bVar.requireActivity();
                                    SafetyFeatureSetupWizardActivity.a aVar2 = SafetyFeatureSetupWizardActivity.f43851k;
                                    androidx.fragment.app.m mVarRequireActivity2 = bVar.requireActivity();
                                    mVarRequireActivity2.getClass();
                                    hl.a aVar3 = bVar.y6().f137981q;
                                    aVar2.getClass();
                                    mVarRequireActivity.startActivity(SafetyFeatureSetupWizardActivity.a.a(mVarRequireActivity2, aVar3));
                                    bVar.requireActivity().finish();
                                } else {
                                    bVar.v6(gVar);
                                }
                            }
                        } else if (i112 == 2) {
                            g22.e.l(bVar);
                        } else {
                            if (i112 != 3) {
                                u0.r();
                                return null;
                            }
                            g22.e.f(bVar);
                            if (lv0.c.c(g3Var)) {
                                bVar.w6(null);
                            } else {
                                g22.e.c(bVar);
                            }
                            yj1.g gVar2 = (yj1.g) t7;
                            if (gVar2 != null) {
                                bVar.v6(gVar2);
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                        g3 g3Var2 = (g3) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        if (g3Var2.f35300a == fw.p.SUCCESS) {
                            yj1.k kVar = (yj1.k) g3Var2.f35301b;
                            if (kVar != null && (lVar = kVar.f197558c) != pj1.l.NONE && lVar != pj1.l.ACCEPT) {
                                pj1.l lVar2 = pj1.l.OPT_OUT;
                                final l20.a aVar5 = kVar.f197556a;
                                if (lVar != lVar2) {
                                    long j8 = kVar.f197557b;
                                    l20.c cVarI = aVar5.i(j8);
                                    if (cVarI != null) {
                                        if (cVarI.getDeclineReason() == null || cVarI.getDeclineReason() != com.garmin.android.apps.connectmobile.contacts.model.b.DECLINE_STRANGER) {
                                            string2 = bVar.getString(R.string.assistance_contact_request_declined_alert_title);
                                            string2.getClass();
                                            string3 = bVar.getString(R.string.emergency_contact_request_declined_alert_message, aVar5.j());
                                            string3.getClass();
                                        } else {
                                            string2 = bVar.getString(R.string.assistance_contact_request_needs_attention);
                                            string2.getClass();
                                            string3 = bVar.getString(R.string.emergency_contact_request_needs_attention_alert_message, aVar5.j());
                                            string3.getClass();
                                        }
                                        String str2 = string2;
                                        String str3 = string3;
                                        c22.f fVar = c22.f.f23050a;
                                        Context contextRequireContext = bVar.requireContext();
                                        contextRequireContext.getClass();
                                        c22.f.d(fVar, contextRequireContext, str2, str3, new o13.p(bVar.getString(R.string.choose_another_contact), new e23.p() { // from class: uj1.g
                                            @Override // e23.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i24 = i110;
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                                DialogInterface dialogInterface = (DialogInterface) obj2;
                                                ((Integer) obj3).getClass();
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                                switch (i24) {
                                                    case 0:
                                                        dialogInterface.getClass();
                                                        bVar2.f43722j.f(false);
                                                        dialogInterface.dismiss();
                                                        if (((Boolean) bVar2.f43720h.getValue()).booleanValue()) {
                                                            pj1.s.Z4(bVar2.y6(), null, 3);
                                                        } else {
                                                            bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                                        }
                                                        break;
                                                    default:
                                                        dialogInterface.getClass();
                                                        bVar2.f43724l.a(ContactActivity.a.a(ContactActivity.T, bVar2.getActivity(), false, 1, null, 3, false, bVar2.y6().f137981q, 40), null);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), new o13.p(bVar.getString(R.string.review_contact_details), new e23.p() { // from class: uj1.h
                                            @Override // e23.p
                                            public final Object invoke(Object obj2, Object obj3) {
                                                int i24 = i19;
                                                l20.a aVar6 = aVar5;
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                                DialogInterface dialogInterface = (DialogInterface) obj2;
                                                ((Integer) obj3).getClass();
                                                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                                switch (i24) {
                                                    case 0:
                                                        dialogInterface.getClass();
                                                        pj1.s sVarY6 = bVar2.y6();
                                                        ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                        break;
                                                    case 1:
                                                        dialogInterface.getClass();
                                                        f.c<Intent> cVar = bVar2.f43724l;
                                                        EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                        androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                        mVarRequireActivity3.getClass();
                                                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                        break;
                                                    default:
                                                        dialogInterface.getClass();
                                                        bVar2.H5(aVar6);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), new o13.p(bVar.getString(R.string.lbl_close), new a(2)), false, 64).show();
                                    } else {
                                        a2 a2Var = a2.SAFETY_FEATURES;
                                        String strF = androidx.room.a0.f(j8, "[showDeclineDialog] Contact declined but did not have contactInfoPk ", "; not displaying dialog.");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var, "EmergencyContactsFragment", strF);
                                    }
                                } else if (aVar5.D()) {
                                    a2 a2Var2 = a2.SAFETY_FEATURES;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var2, "EmergencyContactsFragment", "[showOptOutDialog] Contact opted out but had another accepted contact method; not showing dialog.");
                                } else {
                                    c22.f fVar2 = c22.f.f23050a;
                                    Context contextRequireContext2 = bVar.requireContext();
                                    contextRequireContext2.getClass();
                                    c22.f.d(fVar2, contextRequireContext2, bVar.getString(R.string.assistance_contact_opted_out_alert_title), bVar.getString(R.string.assistance_contact_opted_out_alert_message, aVar5.j()), new o13.p(bVar.getString(R.string.remove_assistance_contact), new e23.p() { // from class: uj1.h
                                        @Override // e23.p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i24 = i111;
                                            l20.a aVar6 = aVar5;
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                            DialogInterface dialogInterface = (DialogInterface) obj2;
                                            ((Integer) obj3).getClass();
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                            switch (i24) {
                                                case 0:
                                                    dialogInterface.getClass();
                                                    pj1.s sVarY6 = bVar2.y6();
                                                    ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                    break;
                                                case 1:
                                                    dialogInterface.getClass();
                                                    f.c<Intent> cVar = bVar2.f43724l;
                                                    EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                    androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                    mVarRequireActivity3.getClass();
                                                    cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                    break;
                                                default:
                                                    dialogInterface.getClass();
                                                    bVar2.H5(aVar6);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), new o13.p(bVar.getString(R.string.send_new_request), new e23.p() { // from class: uj1.h
                                        @Override // e23.p
                                        public final Object invoke(Object obj2, Object obj3) {
                                            int i24 = i110;
                                            l20.a aVar6 = aVar5;
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                            DialogInterface dialogInterface = (DialogInterface) obj2;
                                            ((Integer) obj3).getClass();
                                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                            switch (i24) {
                                                case 0:
                                                    dialogInterface.getClass();
                                                    pj1.s sVarY6 = bVar2.y6();
                                                    ge1.b.T(v1.a(sVarY6), null, null, new pj1.x(sVarY6, aVar6, null), 3);
                                                    break;
                                                case 1:
                                                    dialogInterface.getClass();
                                                    f.c<Intent> cVar = bVar2.f43724l;
                                                    EmergencyContactSendRequestActivity.a aVar8 = EmergencyContactSendRequestActivity.f32570v;
                                                    androidx.fragment.app.m mVarRequireActivity3 = bVar2.requireActivity();
                                                    mVarRequireActivity3.getClass();
                                                    cVar.a(EmergencyContactSendRequestActivity.a.b(aVar8, mVarRequireActivity3, aVar5, p13.j0.f134944a, false, false, null, 112), null);
                                                    break;
                                                default:
                                                    dialogInterface.getClass();
                                                    bVar2.H5(aVar6);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), null, false, 96).show();
                                }
                            }
                            pj1.s sVarY6 = bVar.y6();
                            w0<g3<yj1.k>> w0Var = sVarY6.E;
                            w0Var.o(sVarY6.C4());
                            w0Var.j(g3.a.c(g3.f35298f));
                        }
                        return Unit.INSTANCE;
                    case 2:
                        o13.p pVar2 = (o13.p) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        pVar2.getClass();
                        Integer num = (Integer) pVar2.f128594a;
                        Integer num2 = (Integer) pVar2.f128595b;
                        if (num == null || num2 == null) {
                            bVar.f43722j.f(false);
                            bVar.requireActivity().getOnBackPressedDispatcher().d();
                        } else {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            c22.f fVar3 = c22.f.f23050a;
                            Context contextRequireContext3 = bVar.requireContext();
                            contextRequireContext3.getClass();
                            c22.f.d(fVar3, contextRequireContext3, bVar.getString(iIntValue), bVar.getString(iIntValue2), new o13.p(bVar.getString(R.string.lbl_exit), new e23.p() { // from class: uj1.g
                                @Override // e23.p
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i24 = i111;
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b bVar2 = bVar;
                                    DialogInterface dialogInterface = (DialogInterface) obj2;
                                    ((Integer) obj3).getClass();
                                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                                    switch (i24) {
                                        case 0:
                                            dialogInterface.getClass();
                                            bVar2.f43722j.f(false);
                                            dialogInterface.dismiss();
                                            if (((Boolean) bVar2.f43720h.getValue()).booleanValue()) {
                                                pj1.s.Z4(bVar2.y6(), null, 3);
                                            } else {
                                                bVar2.requireActivity().getOnBackPressedDispatcher().d();
                                            }
                                            break;
                                        default:
                                            dialogInterface.getClass();
                                            bVar2.f43724l.a(ContactActivity.a.a(ContactActivity.T, bVar2.getActivity(), false, 1, null, 3, false, bVar2.y6().f137981q, 40), null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), new o13.p(bVar.getString(R.string.lbl_cancel), new a(3)), null, false, 96).show();
                        }
                        return Unit.INSTANCE;
                    default:
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                        ((Unit) obj).getClass();
                        bVar.f43722j.f(false);
                        if (((Boolean) bVar.f43720h.getValue()).booleanValue()) {
                            Intent intent = new Intent(bVar.getContext(), (Class<?>) MoreActivity.class);
                            intent.addFlags(67108864);
                            intent.putExtra("GCM_extra_top_navigation", true);
                            Context context = bVar.getContext();
                            if (context != null) {
                                context.startActivity(intent);
                            }
                        }
                        return Unit.INSTANCE;
                }
            }
        }));
        ConstraintLayout constraintLayout3 = this.f43715c;
        if (constraintLayout3 != null) {
            constraintLayout3.setOnClickListener(new t61.m(this, 18));
        } else {
            p005kotlin.jvm.internal.s.m("addEmergencyContactsButton");
            throw null;
        }
    }

    public final void v6(yj1.g gVar) {
        b bVar;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a aVar = new com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a(this);
        this.f43719g = aVar;
        RecyclerView recyclerView = this.f43718f;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a aVar2 = this.f43719g;
        if (aVar2 != null) {
            List<yj1.f> list = gVar.f197546e;
            list.getClass();
            ArrayList arrayList = aVar2.f43701b;
            arrayList.clear();
            arrayList.addAll(list);
            aVar2.notifyDataSetChanged();
        }
        Context context = getContext();
        if (context != null) {
            bVar = this;
            androidx.recyclerview.widget.s sVar = new androidx.recyclerview.widget.s(new j(a7.b.getColor(context, R.color.gcm_surface_danger_action), a7.b.getColor(context, R.color.palette_white_alpha_5), bVar, getResources(), R.string.lbl_remove, R.dimen.andfont_body_1));
            RecyclerView recyclerView2 = bVar.f43718f;
            if (recyclerView2 == null) {
                p005kotlin.jvm.internal.s.m("recyclerView");
                throw null;
            }
            sVar.e(recyclerView2);
        } else {
            bVar = this;
        }
        if (gVar.f197545d) {
            q0.b bVar2 = q0.f149800b;
            RecyclerView recyclerView3 = bVar.f43718f;
            if (recyclerView3 == null) {
                p005kotlin.jvm.internal.s.m("recyclerView");
                throw null;
            }
            bVar2.getClass();
            q0.b.a(recyclerView3, R.string.assistance_contact_removed_toast_message, 0).show();
        }
    }

    public final void w6(Integer num) {
        new androidx.appcompat.app.e.a(requireContext()).setTitle(getString(R.string.lbl_admin_cannot_be_removed)).setMessage(getString(R.string.msg_admin_cannot_be_removed_safety_feature)).setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null).setOnDismissListener(new uj1.f(this, num, 0)).create().show();
    }

    public final s y6() {
        return (s) this.f43714b.getValue();
    }

    public final void z6(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.a aVar = this.f43719g;
            if (aVar != null) {
                aVar.notifyItemChanged(iIntValue);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_CONTACTS_LIMIT", "I", "ARG_FROM_MY_DAY_CARD", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
