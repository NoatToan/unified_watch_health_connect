package com.garmin.android.apps.connectmobile.contacts.details;

import a61.i;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.e;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import bi2.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.emergency.d;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import ei0.q0;
import ew1.h1;
import f20.a0;
import f20.e0;
import fw.p;
import g20.l;
import gg1.v0;
import j20.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l20.f;
import lc.u0;
import m20.p0;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/c;", "Lcom/garmin/android/apps/connectmobile/contacts/details/b;", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$f;", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$g;", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$h;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends com.garmin.android.apps.connectmobile.contacts.details.b implements com.garmin.android.apps.connectmobile.contacts.details.a.f, com.garmin.android.apps.connectmobile.contacts.details.a.g, com.garmin.android.apps.connectmobile.contacts.details.a.h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f32482m = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f32483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f32484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.contacts.details.a f32485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f32487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f32488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32489k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f32490l;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32491a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32491a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.details.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0529c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f32492a;

        public C0529c(e23.l lVar) {
            lVar.getClass();
            this.f32492a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32492a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32492a.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g20.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [g20.l] */
    public c() {
        final int i14 = 0;
        this.f32483e = new z0(this) { // from class: g20.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.details.c f75358b;

            {
                this.f75358b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ArrayList arrayList;
                ArrayList arrayList2;
                l20.c cVar;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.contacts.details.c cVar2 = this.f75358b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.contacts.details.c.a aVar = com.garmin.android.apps.connectmobile.contacts.details.c.f32482m;
                        g3Var.getClass();
                        int i16 = com.garmin.android.apps.connectmobile.contacts.details.c.b.f32491a[g3Var.f35300a.ordinal()];
                        if (i16 == 1) {
                            g22.e.l(cVar2);
                        } else if (i16 == 2) {
                            g22.e.f(cVar2);
                            o13.p pVar = (o13.p) g3Var.f35301b;
                            if (pVar != null) {
                                p0 p0Var = (p0) pVar.f128594a;
                                l20.a aVar2 = (l20.a) pVar.f128595b;
                                List<l20.c> listZ = aVar2.z();
                                ArrayList arrayList3 = null;
                                if (listZ != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj2 : listZ) {
                                        if (s.g(((l20.c) obj2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), p0Var.getPhoneNumber())) {
                                            Boolean valid = p0Var.getValid();
                                            Boolean bool = Boolean.TRUE;
                                            if (s.g(valid, bool) && s.g(p0Var.getCanReceiveText(), bool)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList == null || arrayList.isEmpty()) {
                                    List<l20.c> listZ2 = aVar2.z();
                                    if (listZ2 != null) {
                                        arrayList3 = new ArrayList(y.r(listZ2, 10));
                                        for (l20.c cVarB : listZ2) {
                                            if (s.g(cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), p0Var.getPhoneNumber())) {
                                                cVarB = l20.c.b(cVarB, null, null, null, null, null, null, Boolean.FALSE, null, null, null, 0, 1048319);
                                            }
                                            arrayList3.add(cVarB);
                                        }
                                    }
                                    cVar2.v6().B4(l20.a.g(aVar2, null, null, null, null, null, null, null, arrayList3, null, 8063));
                                    cVar2.A6();
                                } else {
                                    List<l20.c> listZ3 = aVar2.z();
                                    if (listZ3 != null) {
                                        ArrayList arrayList4 = new ArrayList(y.r(listZ3, 10));
                                        for (l20.c cVarB2 : listZ3) {
                                            if (s.g(cVarB2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), p0Var.getPhoneNumber())) {
                                                cVarB2 = l20.c.b(cVarB2, null, null, null, null, null, null, Boolean.TRUE, p0Var.getPhoneUuid(), null, null, 0, 1046271);
                                            }
                                            arrayList4.add(cVarB2);
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 != null) {
                                        arrayList3 = new ArrayList();
                                        for (Object obj3 : arrayList2) {
                                            if (s.g(((l20.c) obj3).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), p0Var.getPhoneNumber())) {
                                                arrayList3.add(obj3);
                                            }
                                        }
                                    }
                                    if (arrayList3 == null || (cVar = (l20.c) arrayList3.get(0)) == null) {
                                        cVar = new l20.c(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null);
                                    }
                                    cVar2.z6(cVar);
                                    cVar2.v6().B4(l20.a.g(aVar2, null, null, null, null, null, null, null, arrayList2, null, 8063));
                                }
                            }
                        } else if (i16 == 3) {
                            g22.e.f(cVar2);
                            Context context = cVar2.getContext();
                            if (context != null) {
                                q0.b(context);
                            }
                        } else {
                            u0.r();
                        }
                        break;
                    default:
                        g3 g3Var2 = (g3) obj;
                        com.garmin.android.apps.connectmobile.contacts.details.c.a aVar3 = com.garmin.android.apps.connectmobile.contacts.details.c.f32482m;
                        g3Var2.getClass();
                        T t7 = g3Var2.f35301b;
                        int i17 = com.garmin.android.apps.connectmobile.contacts.details.c.b.f32491a[g3Var2.f35300a.ordinal()];
                        if (i17 == 1) {
                            g22.e.l(cVar2);
                        } else if (i17 == 2) {
                            g22.e.f(cVar2);
                            o13.p pVar2 = (o13.p) t7;
                            if (pVar2 != null) {
                                cVar2.C6((String) pVar2.f128594a, (String) pVar2.f128595b);
                            }
                        } else if (i17 == 3) {
                            g22.e.f(cVar2);
                            o13.p pVar3 = (o13.p) t7;
                            if (pVar3 != null) {
                                cVar2.C6((String) pVar3.f128594a, (String) pVar3.f128595b);
                            }
                        } else {
                            u0.r();
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f32484f = new z0(this) { // from class: g20.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.details.c f75358b;

            {
                this.f75358b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ArrayList arrayList;
                ArrayList arrayList2;
                l20.c cVar;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.contacts.details.c cVar2 = this.f75358b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        com.garmin.android.apps.connectmobile.contacts.details.c.a aVar = com.garmin.android.apps.connectmobile.contacts.details.c.f32482m;
                        g3Var.getClass();
                        int i17 = com.garmin.android.apps.connectmobile.contacts.details.c.b.f32491a[g3Var.f35300a.ordinal()];
                        if (i17 == 1) {
                            g22.e.l(cVar2);
                        } else if (i17 == 2) {
                            g22.e.f(cVar2);
                            o13.p pVar = (o13.p) g3Var.f35301b;
                            if (pVar != null) {
                                p0 p0Var = (p0) pVar.f128594a;
                                l20.a aVar2 = (l20.a) pVar.f128595b;
                                List<l20.c> listZ = aVar2.z();
                                ArrayList arrayList3 = null;
                                if (listZ != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj2 : listZ) {
                                        if (s.g(((l20.c) obj2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), p0Var.getPhoneNumber())) {
                                            Boolean valid = p0Var.getValid();
                                            Boolean bool = Boolean.TRUE;
                                            if (s.g(valid, bool) && s.g(p0Var.getCanReceiveText(), bool)) {
                                                arrayList.add(obj2);
                                            }
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList == null || arrayList.isEmpty()) {
                                    List<l20.c> listZ2 = aVar2.z();
                                    if (listZ2 != null) {
                                        arrayList3 = new ArrayList(y.r(listZ2, 10));
                                        for (l20.c cVarB : listZ2) {
                                            if (s.g(cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), p0Var.getPhoneNumber())) {
                                                cVarB = l20.c.b(cVarB, null, null, null, null, null, null, Boolean.FALSE, null, null, null, 0, 1048319);
                                            }
                                            arrayList3.add(cVarB);
                                        }
                                    }
                                    cVar2.v6().B4(l20.a.g(aVar2, null, null, null, null, null, null, null, arrayList3, null, 8063));
                                    cVar2.A6();
                                } else {
                                    List<l20.c> listZ3 = aVar2.z();
                                    if (listZ3 != null) {
                                        ArrayList arrayList4 = new ArrayList(y.r(listZ3, 10));
                                        for (l20.c cVarB2 : listZ3) {
                                            if (s.g(cVarB2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), p0Var.getPhoneNumber())) {
                                                cVarB2 = l20.c.b(cVarB2, null, null, null, null, null, null, Boolean.TRUE, p0Var.getPhoneUuid(), null, null, 0, 1046271);
                                            }
                                            arrayList4.add(cVarB2);
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    if (arrayList2 != null) {
                                        arrayList3 = new ArrayList();
                                        for (Object obj3 : arrayList2) {
                                            if (s.g(((l20.c) obj3).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), p0Var.getPhoneNumber())) {
                                                arrayList3.add(obj3);
                                            }
                                        }
                                    }
                                    if (arrayList3 == null || (cVar = (l20.c) arrayList3.get(0)) == null) {
                                        cVar = new l20.c(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null);
                                    }
                                    cVar2.z6(cVar);
                                    cVar2.v6().B4(l20.a.g(aVar2, null, null, null, null, null, null, null, arrayList2, null, 8063));
                                }
                            }
                        } else if (i17 == 3) {
                            g22.e.f(cVar2);
                            Context context = cVar2.getContext();
                            if (context != null) {
                                q0.b(context);
                            }
                        } else {
                            u0.r();
                        }
                        break;
                    default:
                        g3 g3Var2 = (g3) obj;
                        com.garmin.android.apps.connectmobile.contacts.details.c.a aVar3 = com.garmin.android.apps.connectmobile.contacts.details.c.f32482m;
                        g3Var2.getClass();
                        T t7 = g3Var2.f35301b;
                        int i18 = com.garmin.android.apps.connectmobile.contacts.details.c.b.f32491a[g3Var2.f35300a.ordinal()];
                        if (i18 == 1) {
                            g22.e.l(cVar2);
                        } else if (i18 == 2) {
                            g22.e.f(cVar2);
                            o13.p pVar2 = (o13.p) t7;
                            if (pVar2 != null) {
                                cVar2.C6((String) pVar2.f128594a, (String) pVar2.f128595b);
                            }
                        } else if (i18 == 3) {
                            g22.e.f(cVar2);
                            o13.p pVar3 = (o13.p) t7;
                            if (pVar3 != null) {
                                cVar2.C6((String) pVar3.f128594a, (String) pVar3.f128595b);
                            }
                        } else {
                            u0.r();
                        }
                        break;
                }
            }
        };
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new i(this, 20));
        cVarRegisterForActivityResult.getClass();
        this.f32490l = cVarRegisterForActivityResult;
    }

    public final void A6() {
        Context context = getContext();
        if (context != null) {
            new e.a(context).setTitle(getString(R.string.les_invalid_phone_number_dialog_title)).setMessage(getString(R.string.les_invalid_phone_number_dialog_message)).setNegativeButton(getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.contact_management_title_contacts), new h1(this, 6)).show();
        }
    }

    public final void C6(String str, String str2) {
        Context context = getContext();
        if (context != null) {
            e.a aVar = new e.a(context);
            aVar.setCancelable(false);
            aVar.setTitle(R.string.lbl_recipient_send_opt_in_request_pop_up_title);
            aVar.setMessage(R.string.message_recipient_send_opt_in_request_pop_up);
            aVar.setPositiveButton(getString(R.string.common_send), new k(this, 12, str2, str));
            aVar.setNegativeButton(getString(R.string.lbl_cancel), new f20.i(8));
            aVar.show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.details.a.g
    public final void Z1() {
        A6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.contacts.details.a.h
    public final void k4(com.garmin.android.apps.connectmobile.contacts.a.f fVar) {
        l20.a aVar;
        l20.c cVar;
        l20.c cVar2;
        String str;
        Object next;
        Object next2;
        g20.n nVar = (g20.n) v6().f75347k.d();
        if (nVar == null || (aVar = nVar.f75368i) == null) {
            return;
        }
        List<l20.c> listZ = aVar.z();
        if (listZ != null) {
            Iterator<T> it = listZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                l20.c cVar3 = (l20.c) next2;
                if (s.g(cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), fVar.f32357b) && s.g(cVar3.getIsValid(), Boolean.TRUE)) {
                    break;
                }
            }
            cVar = (l20.c) next2;
        } else {
            cVar = null;
        }
        List<l20.c> listZ2 = aVar.z();
        if (listZ2 != null) {
            Iterator<T> it3 = listZ2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                l20.c cVar4 = (l20.c) next;
                if (s.g(cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), fVar.f32357b) && (cVar4.getIsValid() == null || cVar4.getPhoneUUID() == null)) {
                    break;
                }
            }
            cVar2 = (l20.c) next;
        } else {
            cVar2 = null;
        }
        if (cVar != null) {
            if (!cVar.f0()) {
                z6(cVar);
                return;
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "LiveTrackLiveEventShareContactDetailsFragment", "should not enter here, the send request link needs to be gone.");
            return;
        }
        if (cVar2 == null || (str = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()) == null) {
            return;
        }
        d dVar = this.f32487i;
        if (dVar != null) {
            ge1.b.T(v1.a(dVar), null, null, new q(dVar, str, aVar, null), 3);
        } else {
            s.m("emergencyContactViewModel");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:125:0x0170 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0177  */
    /* JADX WARN: Code duplicated, block: B:95:0x0197  */
    /* JADX WARN: Code duplicated, block: B:96:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v2 */
    @Override // com.garmin.android.apps.connectmobile.contacts.details.a.g
    public final void n6(com.garmin.android.apps.connectmobile.contacts.a.f fVar) throws Throwable {
        l20.c cVarB;
        boolean z14;
        Throwable th3;
        int iB;
        boolean z15;
        l20.a aVar;
        List<l20.c> listZ;
        ?? r34;
        l20.a aVarG;
        y0<g20.n> y0Var;
        ?? Y4;
        l20.a aVar2;
        l20.a aVar3;
        ArrayList arrayList;
        Long contactInfoPk;
        Object next;
        g20.i iVarV6 = v6();
        iVarV6.getClass();
        Long l14 = fVar.f32356a;
        String str = fVar.f32357b;
        l20.a aVar4 = iVarV6.f75341e;
        if (aVar4 == null) {
            s.m("contactDTO");
            throw null;
        }
        List<l20.c> listZ2 = aVar4.z();
        if (listZ2 != null) {
            Iterator it = listZ2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                l20.c cVar = (l20.c) next;
                if (l14 != null) {
                    Long contactInfoPk2 = cVar.getContactInfoPk();
                    long jLongValue = l14.longValue();
                    if (contactInfoPk2 != null && contactInfoPk2.longValue() == jLongValue) {
                        break;
                    }
                    if (str.length() <= 0 && s.g(cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str)) {
                        break;
                    }
                } else if (str.length() <= 0) {
                }
            }
            cVarB = (l20.c) next;
        } else {
            cVarB = null;
        }
        if (cVarB != null) {
            Boolean isLiveEventSharingDefault = cVarB.getIsLiveEventSharingDefault();
            Boolean bool = Boolean.TRUE;
            if (!s.g(isLiveEventSharingDefault, bool)) {
                z14 = false;
                th3 = null;
                int i14 = iVarV6.f75343g;
                int i15 = iVarV6.f75342f;
                l20.a aVar5 = iVarV6.f75340d;
                if (i15 == 2) {
                    if (aVar5 == null) {
                        s.m("initialContactDTO");
                        throw null;
                    }
                    iB = com.garmin.android.apps.connectmobile.contacts.b.a(aVar5);
                } else {
                    if (aVar5 == null) {
                        s.m("initialContactDTO");
                        throw null;
                    }
                    iB = com.garmin.android.apps.connectmobile.contacts.b.b(aVar5);
                }
                int i16 = iB + i14;
                l20.a aVar6 = iVarV6.f75341e;
                if (aVar6 == null) {
                    s.m("contactDTO");
                    throw null;
                }
                if (i16 > com.garmin.android.apps.connectmobile.contacts.b.a(aVar6)) {
                    cVarB = l20.c.b(cVarB, null, null, null, null, bool, null, null, null, null, null, 0, 1048543);
                    fVar.f32363h = true;
                    e0 e0Var = iVarV6.f75344h;
                    if (e0Var == null) {
                        s.m("phonePrefixProvider");
                        throw null;
                    }
                    Integer numD = com.garmin.android.apps.connectmobile.contacts.b.d(cVarB, e0Var, true);
                    fVar.f32367l = numD;
                    e0 e0Var2 = iVarV6.f75344h;
                    if (e0Var2 == null) {
                        s.m("phonePrefixProvider");
                        throw null;
                    }
                    fVar.f32359d = (e0Var2.a(fVar.f32357b) && numD == null) ? false : true;
                } else {
                    z15 = true;
                }
                aVar = iVarV6.f75341e;
                if (aVar != null) {
                    s.m("contactDTO");
                    throw th3;
                }
                listZ = aVar.z();
                if (listZ != null) {
                    arrayList = new ArrayList(y.r(listZ, 10));
                    for (l20.c cVar2 : listZ) {
                        if (l14 != null) {
                            contactInfoPk = cVar2.getContactInfoPk();
                            long jLongValue2 = l14.longValue();
                            if (contactInfoPk != null && contactInfoPk.longValue() == jLongValue2) {
                                cVar2 = cVarB;
                            } else if (str.length() <= 0 && s.g(cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str)) {
                                cVar2 = cVarB;
                            }
                        } else if (str.length() <= 0) {
                        }
                        arrayList.add(cVar2);
                    }
                    r34 = arrayList;
                } else {
                    r34 = th3;
                }
                aVarG = l20.a.g(aVar, null, null, null, null, null, null, null, r34, null, 8063);
                iVarV6.f75341e = aVarG;
                y0Var = iVarV6.f75346j;
                if (z15) {
                    Y4 = th3;
                } else {
                    Y4 = iVarV6.y4(aVarG);
                }
                aVar2 = iVarV6.f75340d;
                if (aVar2 != null) {
                    s.m("initialContactDTO");
                    throw th3;
                }
                aVar3 = iVarV6.f75341e;
                if (aVar3 != null) {
                    s.m("contactDTO");
                    throw th3;
                }
                y0Var.m(new g20.n(Y4, false, z15, !aVar2.equals(aVar3), false, false, null, false, aVarG, 242, null));
            }
            z14 = false;
            th3 = null;
            cVarB = l20.c.b(cVarB, null, null, null, null, Boolean.FALSE, null, null, null, null, null, 0, 1048543);
            fVar.f32363h = false;
            e0 e0Var3 = iVarV6.f75344h;
            if (e0Var3 == null) {
                s.m("phonePrefixProvider");
                throw null;
            }
            Integer numD2 = com.garmin.android.apps.connectmobile.contacts.b.d(cVarB, e0Var3, true);
            fVar.f32367l = numD2;
            e0 e0Var4 = iVarV6.f75344h;
            if (e0Var4 == null) {
                s.m("phonePrefixProvider");
                throw null;
            }
            fVar.f32359d = (e0Var4.a(fVar.f32357b) && numD2 == null) ? false : true;
            z15 = z14;
            aVar = iVarV6.f75341e;
            if (aVar != null) {
                s.m("contactDTO");
                throw th3;
            }
            listZ = aVar.z();
            if (listZ != null) {
                arrayList = new ArrayList(y.r(listZ, 10));
                while (r4.hasNext()) {
                    if (l14 != null) {
                        contactInfoPk = cVar2.getContactInfoPk();
                        long jLongValue3 = l14.longValue();
                        if (contactInfoPk != null) {
                            cVar2 = cVarB;
                        } else if (str.length() <= 0) {
                        }
                    } else if (str.length() <= 0) {
                    }
                    arrayList.add(cVar2);
                }
                r34 = arrayList;
            } else {
                r34 = th3;
            }
            aVarG = l20.a.g(aVar, null, null, null, null, null, null, null, r34, null, 8063);
            iVarV6.f75341e = aVarG;
            y0Var = iVarV6.f75346j;
            if (z15) {
                Y4 = th3;
            } else {
                Y4 = iVarV6.y4(aVarG);
            }
            aVar2 = iVarV6.f75340d;
            if (aVar2 != null) {
                s.m("initialContactDTO");
                throw th3;
            }
            aVar3 = iVarV6.f75341e;
            if (aVar3 != null) {
                s.m("contactDTO");
                throw th3;
            }
            y0Var.m(new g20.n(Y4, false, z15, !aVar2.equals(aVar3), false, false, null, false, aVarG, 242, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.contacts.details.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        l20.a aVar;
        l20.a aVar2;
        int i14;
        List<l20.c> listZ;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("extra_contact_key", l20.a.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("extra_contact_key");
                if (!(parcelable2 instanceof l20.a)) {
                    parcelable2 = null;
                }
                parcelable = (l20.a) parcelable2;
            }
            aVar = (l20.a) parcelable;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            this.f32487i = (d) new x1(mVarRequireActivity, new j20.s(aVar, null, null, false, false, false, null, 126, null)).b(s0.f105811a.b(d.class));
        }
        this.f32485g = new com.garmin.android.apps.connectmobile.contacts.details.a(this, v6().f75342f == 1 ? this : null, v6().f75342f == 2 ? this : null, v6().f75342f == 2 ? this : null, null, 16, null);
        RecyclerView recyclerViewW6 = w6();
        com.garmin.android.apps.connectmobile.contacts.details.a aVar3 = this.f32485g;
        if (aVar3 == null) {
            s.m("contactInfoAdapter");
            throw null;
        }
        recyclerViewW6.setAdapter(aVar3);
        View viewFindViewById = view2.findViewById(R.id.banner_layout);
        viewFindViewById.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        g20.n nVar = (g20.n) v6().f75347k.d();
        if (nVar != null && (aVar2 = nVar.f75368i) != null) {
            g20.i iVarV6 = v6();
            iVarV6.getClass();
            if (bo1.a.a().c().b0() && iVarV6.f75342f == 2 && (listZ = aVar2.z()) != null && !listZ.isEmpty()) {
                Iterator<T> it = listZ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i14 = 8;
                        break;
                    }
                    l20.e smsOptinStatus = ((l20.c) it.next()).getSmsOptinStatus();
                    if ((smsOptinStatus != null ? smsOptinStatus.getLiveEventSharingFitnessStatus() : null) != f.OPTIN) {
                        i14 = 0;
                        break;
                    }
                }
            } else {
                i14 = 8;
                break;
            }
            linearLayout.setVisibility(i14);
        }
        d dVar = this.f32487i;
        if (dVar == null) {
            s.m("emergencyContactViewModel");
            throw null;
        }
        dVar.f32663x.f(getViewLifecycleOwner(), this.f32483e);
        d dVar2 = this.f32487i;
        if (dVar2 != null) {
            dVar2.D.f(getViewLifecycleOwner(), this.f32484f);
        } else {
            s.m("emergencyContactViewModel");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0163 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:65:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x0137  */
    /* JADX WARN: Code duplicated, block: B:72:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x0162  */
    /* JADX WARN: Code duplicated, block: B:84:0x016a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x0184  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0192  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bb  */
    @Override // com.garmin.android.apps.connectmobile.contacts.details.a.f
    public final void u5(com.garmin.android.apps.connectmobile.contacts.a.c cVar) {
        l20.c cVarB;
        boolean z14;
        int iB;
        Boolean bool;
        boolean z15;
        boolean z16;
        Boolean boolValueOf;
        l20.a aVar;
        List<l20.c> listR;
        ArrayList arrayList;
        l20.a aVarG;
        y0<g20.n> y0Var;
        ArrayList arrayListY4;
        l20.a aVar2;
        l20.a aVar3;
        ArrayList arrayList2;
        Long contactInfoPk;
        l20.c cVar2;
        Object next;
        Object next2;
        g20.i iVarV6 = v6();
        iVarV6.getClass();
        Long l14 = cVar.f32334a;
        String str = cVar.f32335b;
        l20.a aVar4 = iVarV6.f75341e;
        if (aVar4 == null) {
            s.m("contactDTO");
            throw null;
        }
        List<l20.c> listR2 = aVar4.r();
        if (listR2 != null) {
            Iterator<T> it = listR2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                l20.c cVar3 = (l20.c) next2;
                if (l14 != null) {
                    Long contactInfoPk2 = cVar3.getContactInfoPk();
                    long jLongValue = l14.longValue();
                    if (contactInfoPk2 != null && contactInfoPk2.longValue() == jLongValue) {
                        break;
                    }
                    if (str.length() <= 0 && s.g(cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str)) {
                        break;
                    }
                } else if (str.length() <= 0) {
                }
            }
            cVarB = (l20.c) next2;
        } else {
            cVarB = null;
        }
        if (cVarB != null) {
            l20.a aVar5 = iVarV6.f75341e;
            if (aVar5 == null) {
                s.m("contactDTO");
                throw null;
            }
            Boolean isLiveTrackDefault = aVar5.getIsLiveTrackDefault();
            if (!cVarB.g0()) {
                z14 = false;
                int i14 = iVarV6.f75343g;
                int i15 = iVarV6.f75342f;
                l20.a aVar6 = iVarV6.f75340d;
                if (i15 == 2) {
                    if (aVar6 == null) {
                        s.m("initialContactDTO");
                        throw null;
                    }
                    iB = com.garmin.android.apps.connectmobile.contacts.b.a(aVar6);
                } else {
                    if (aVar6 == null) {
                        s.m("initialContactDTO");
                        throw null;
                    }
                    iB = com.garmin.android.apps.connectmobile.contacts.b.b(aVar6);
                }
                int i16 = iB + i14;
                l20.a aVar7 = iVarV6.f75341e;
                if (aVar7 == null) {
                    s.m("contactDTO");
                    throw null;
                }
                if (i16 > com.garmin.android.apps.connectmobile.contacts.b.b(aVar7)) {
                    z16 = true;
                    cVarB = l20.c.b(cVarB, null, null, Integer.valueOf(l20.m.AUTO_LIVE_TRACK.f109026a), null, null, null, null, null, null, null, 0, 1048567);
                    boolValueOf = Boolean.TRUE;
                    cVar.f32342i = true;
                } else {
                    bool = isLiveTrackDefault;
                    z15 = true;
                }
                aVar = iVarV6.f75341e;
                if (aVar != null) {
                    s.m("contactDTO");
                    throw null;
                }
                listR = aVar.r();
                if (listR != null) {
                    arrayList2 = new ArrayList(y.r(listR, 10));
                    for (l20.c cVar4 : listR) {
                        if (l14 != null) {
                            contactInfoPk = cVar4.getContactInfoPk();
                            long jLongValue2 = l14.longValue();
                            if (contactInfoPk != null && contactInfoPk.longValue() == jLongValue2) {
                                cVar4 = cVarB;
                            } else if (str.length() <= 0 && s.g(cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str)) {
                                cVar4 = cVarB;
                            }
                        } else if (str.length() <= 0) {
                        }
                        arrayList2.add(cVar4);
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                aVarG = l20.a.g(aVar, null, null, null, null, bool, null, arrayList, null, null, 8111);
                iVarV6.f75341e = aVarG;
                y0Var = iVarV6.f75346j;
                if (z15) {
                    arrayListY4 = null;
                } else {
                    arrayListY4 = iVarV6.y4(aVarG);
                }
                aVar2 = iVarV6.f75340d;
                if (aVar2 != null) {
                    s.m("initialContactDTO");
                    throw null;
                }
                aVar3 = iVarV6.f75341e;
                if (aVar3 != null) {
                    s.m("contactDTO");
                    throw null;
                }
                y0Var.m(new g20.n(arrayListY4, z15, false, !aVar2.equals(aVar3), false, false, null, false, aVarG, 244, null));
            }
            z14 = false;
            z16 = true;
            cVarB = l20.c.b(cVarB, null, null, Integer.valueOf(l20.m.NONE.f109026a), null, null, null, null, null, null, null, 0, 1048567);
            l20.a aVar8 = iVarV6.f75341e;
            if (aVar8 == null) {
                s.m("contactDTO");
                throw null;
            }
            List<l20.c> listR3 = aVar8.r();
            if (listR3 != null) {
                Iterator<T> it3 = listR3.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!((l20.c) next).g0());
                cVar2 = (l20.c) next;
            } else {
                cVar2 = null;
            }
            boolValueOf = Boolean.valueOf(cVar2 != null);
            cVar.f32342i = false;
            z15 = z14;
            bool = boolValueOf;
            aVar = iVarV6.f75341e;
            if (aVar != null) {
                s.m("contactDTO");
                throw null;
            }
            listR = aVar.r();
            if (listR != null) {
                arrayList2 = new ArrayList(y.r(listR, 10));
                while (r0.hasNext()) {
                    if (l14 != null) {
                        contactInfoPk = cVar4.getContactInfoPk();
                        long jLongValue3 = l14.longValue();
                        if (contactInfoPk != null) {
                            cVar4 = cVarB;
                        } else if (str.length() <= 0) {
                        }
                    } else if (str.length() <= 0) {
                    }
                    arrayList2.add(cVar4);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            aVarG = l20.a.g(aVar, null, null, null, null, bool, null, arrayList, null, null, 8111);
            iVarV6.f75341e = aVarG;
            y0Var = iVarV6.f75346j;
            if (z15) {
                arrayListY4 = null;
            } else {
                arrayListY4 = iVarV6.y4(aVarG);
            }
            aVar2 = iVarV6.f75340d;
            if (aVar2 != null) {
                s.m("initialContactDTO");
                throw null;
            }
            aVar3 = iVarV6.f75341e;
            if (aVar3 != null) {
                s.m("contactDTO");
                throw null;
            }
            y0Var.m(new g20.n(arrayListY4, z15, false, !aVar2.equals(aVar3), false, false, null, false, aVarG, 244, null));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.details.b
    public final void u6() {
        m activity = getActivity();
        activity.getClass();
        activity.addMenuProvider(new g20.m(this), getViewLifecycleOwner(), b0.b.RESUMED);
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.details.b
    public final void y6() {
        v6().f75347k.f(getViewLifecycleOwner(), new C0529c(new g12.f(this, 5)));
    }

    public final void z6(l20.c cVar) {
        String str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
        String phoneUUID = cVar.getPhoneUUID();
        if (str == null || phoneUUID == null) {
            String strG = v.e0.g("Unable to send SMS! PhoneNumber = ", str, " && phoneUUID = ", phoneUUID, ".");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "LiveTrackLiveEventShareContactDetailsFragment", strG);
            return;
        }
        f20.b0.a aVar2 = f20.b0.f68352b;
        v0.T.getClass();
        v0 v0VarB = v0.a.b();
        a0 a0Var = a0.LIVE_EVENT_SHARING_FITNESS;
        aVar2.getClass();
        v0VarB.getClass();
        a0Var.getClass();
        int i14 = f20.b0.a.C1416a.f68357a[v0VarB.ordinal()];
        String strV = u.v(u.v(((i14 == 1 || i14 == 2) ? f20.b0.PROD : f20.b0.DEV).f68356a, "programKey", a0Var.f68349a, false), "phoneUUID", phoneUUID, false);
        d dVar = this.f32487i;
        if (dVar != null) {
            ge1.b.T(v1.a(dVar), null, null, new j20.k(strV, dVar, str, null), 3);
        } else {
            s.m("emergencyContactViewModel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONTACT_KEY", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
