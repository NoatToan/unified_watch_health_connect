package com.garmin.android.apps.connectmobile.contacts.edit;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import c22.f;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodActivity;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import ei0.q0;
import f20.e0;
import fp0.l;
import fw.p;
import g.h;
import ho2.o;
import i20.e;
import i20.w;
import j20.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l20.k;
import o13.m;
import o13.n;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/EditContactActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/contacts/edit/a$f;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditContactActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.contacts.edit.a.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f32500n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f32501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f32502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f32504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f32505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.contacts.edit.a f32506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MenuItem f32507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l20.a f32508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f32509i = j0.f134944a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32510j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f.c<Intent> f32511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f.c<Intent> f32512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.c<Intent> f32513m;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32514a;

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
            f32514a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<i20.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32518d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32515a = gVar;
            this.f32516b = qualifier;
            this.f32517c = aVar;
            this.f32518d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, i20.t] */
        @Override // e23.a
        public final i20.t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f32515a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f32517c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i20.t.class), f189591b, null, defaultViewModelCreationExtras, this.f32516b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32518d, 4, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i20.e] */
    /* JADX WARN: Type inference failed for: r0v1, types: [i20.e] */
    public EditContactActivity() {
        final int i14 = 0;
        this.f32501a = new z0(this) { // from class: i20.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactActivity f87151b;

            {
                this.f87151b = this;
            }

            /* JADX WARN: Code duplicated, block: B:233:0x04cd  */
            /* JADX WARN: Code duplicated, block: B:245:0x0232 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
            /* JADX WARN: Code duplicated, block: B:99:0x020c  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
            /* JADX WARN: Type inference failed for: r12v3 */
            /* JADX WARN: Type inference failed for: r12v4 */
            /* JADX WARN: Type inference failed for: r12v8 */
            /* JADX WARN: Type inference failed for: r12v9 */
            /* JADX WARN: Type inference failed for: r1v34 */
            /* JADX WARN: Type inference failed for: r1v35, types: [l20.c] */
            /* JADX WARN: Type inference failed for: r1v47 */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r39v1, types: [java.lang.Throwable, z6.b] */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) throws Throwable {
                l20.a aVar;
                boolean z14;
                ArrayList arrayList;
                ?? r14;
                l20.c cVarH;
                List<l20.c> listN0;
                boolean z15;
                Throwable th3;
                boolean z16;
                e0 e0Var;
                boolean z17;
                boolean z18;
                boolean z19 = true;
                Throwable th4 = null;
                switch (i14) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        EditContactActivity.a aVar2 = EditContactActivity.f32500n;
                        g3Var.getClass();
                        int i15 = EditContactActivity.b.f32514a[g3Var.f35300a.ordinal()];
                        EditContactActivity editContactActivity = this.f87151b;
                        if (i15 == 1) {
                            editContactActivity.showProgressOverlay();
                            return;
                        }
                        if (i15 != 2) {
                            editContactActivity.hideProgressOverlay();
                            q0.b(editContactActivity);
                            return;
                        }
                        editContactActivity.hideProgressOverlay();
                        l20.a aVar3 = (l20.a) g3Var.f35301b;
                        if (aVar3 == null) {
                            l20.a aVar4 = editContactActivity.f32508h;
                            if (aVar4 == null) {
                                p005kotlin.jvm.internal.s.m("contactDto");
                                throw null;
                            }
                            aVar = aVar4;
                        } else {
                            aVar = aVar3;
                        }
                        editContactActivity.f32508h = aVar;
                        if (editContactActivity.f32510j) {
                            editContactActivity.setResult(-1, new Intent().putExtra("extra_contact_key", aVar3));
                            editContactActivity.finish();
                            return;
                        }
                        f.c<Intent> cVar = editContactActivity.f32511k;
                        EmergencyContactSendRequestActivity.a aVar5 = EmergencyContactSendRequestActivity.f32570v;
                        ?? r15 = editContactActivity.f32509i;
                        if (r15 == 0 || !r15.isEmpty()) {
                            Iterator it = r15.iterator();
                            while (it.hasNext()) {
                                if (((l20.c) it.next()).G()) {
                                    ?? r16 = editContactActivity.f32509i;
                                    if (r16 == 0 || !r16.isEmpty()) {
                                        Iterator it3 = r16.iterator();
                                        while (it3.hasNext()) {
                                            if (((l20.c) it3.next()).g0()) {
                                                z14 = true;
                                            }
                                        }
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                }
                            }
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar5, editContactActivity, aVar, r15, false, z14, (hl.a) editContactActivity.f32503c.getValue(), 16), null);
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        EditContactActivity.a aVar6 = EditContactActivity.f32500n;
                        g3Var2.getClass();
                        int i16 = EditContactActivity.b.f32514a[g3Var2.f35300a.ordinal()];
                        EditContactActivity editContactActivity2 = this.f87151b;
                        if (i16 == 1) {
                            editContactActivity2.showProgressOverlay();
                            return;
                        }
                        if (i16 != 2) {
                            editContactActivity2.hideProgressOverlay();
                            q0.b(editContactActivity2);
                            return;
                        }
                        editContactActivity2.hideProgressOverlay();
                        l20.a aVar7 = (l20.a) g3Var2.f35301b;
                        if (aVar7 == null) {
                            i2.a aVar8 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar8.getClass();
                            i2.a.f(a2Var, "EditContactActivity", "No contact DTO received! Could not display activity!");
                            q0.b(editContactActivity2);
                            editContactActivity2.finish();
                            return;
                        }
                        editContactActivity2.f32508h = aVar7;
                        int i17 = 0;
                        for (Object obj2 : aVar7.k()) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            l20.c cVar2 = (l20.c) obj2;
                            if (cVar2.getLocalId() == -1) {
                                cVar2.k0(i17);
                            }
                            i17 = i18;
                        }
                        View viewFindViewById = editContactActivity2.findViewById(R.id.recycler_view);
                        viewFindViewById.getClass();
                        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
                        editContactActivity2.f32505e = recyclerView;
                        recyclerView.setLayoutManager(new LinearLayoutManager(editContactActivity2));
                        RecyclerView recyclerView2 = editContactActivity2.f32505e;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView2.setHasFixedSize(true);
                        com.garmin.android.apps.connectmobile.contacts.edit.a aVar9 = new com.garmin.android.apps.connectmobile.contacts.edit.a(editContactActivity2);
                        editContactActivity2.f32506f = aVar9;
                        RecyclerView recyclerView3 = editContactActivity2.f32505e;
                        if (recyclerView3 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView3.setAdapter(aVar9);
                        t tVarDa = editContactActivity2.da();
                        l20.a aVar10 = editContactActivity2.f32508h;
                        if (aVar10 == null) {
                            p005kotlin.jvm.internal.s.m("contactDto");
                            throw null;
                        }
                        tVarDa.z4(aVar10, new e0(editContactActivity2));
                        editContactActivity2.da().f87210i.f(editContactActivity2, editContactActivity2.f32501a);
                        com.garmin.android.apps.connectmobile.contacts.edit.a aVar11 = editContactActivity2.f32506f;
                        if (aVar11 == null) {
                            p005kotlin.jvm.internal.s.m("contactAdapter");
                            throw null;
                        }
                        Integer contactInfoLimit = editContactActivity2.da().f87206e.getContactInfoLimit();
                        aVar11.f32527c = contactInfoLimit != null ? contactInfoLimit.intValue() : 5;
                        com.garmin.android.apps.connectmobile.contacts.edit.a aVar12 = editContactActivity2.f32506f;
                        if (aVar12 == null) {
                            p005kotlin.jvm.internal.s.m("contactAdapter");
                            throw null;
                        }
                        t tVarDa2 = editContactActivity2.da();
                        tVarDa2.getClass();
                        ArrayList<com.garmin.android.apps.connectmobile.contacts.a> arrayList2 = new ArrayList();
                        List<l20.c> listY = tVarDa2.f87206e.y();
                        if (listY != null) {
                            arrayList = new ArrayList(p13.y.r(listY, 10));
                            Iterator it4 = listY.iterator();
                            while (it4.hasNext()) {
                                String str = ((l20.c) it4.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                arrayList.add(str != null ? new com.garmin.android.apps.connectmobile.contacts.a.e(str, false, false, 6, null) : null);
                            }
                        } else {
                            arrayList = null;
                        }
                        String firstName = tVarDa2.f87206e.getFirstName();
                        if (firstName == null) {
                            firstName = "";
                        }
                        String lastName = tVarDa2.f87206e.getLastName();
                        if (lastName == null) {
                            lastName = "";
                        }
                        l20.g gVarQ = tVarDa2.f87206e.q();
                        arrayList2.add(new com.garmin.android.apps.connectmobile.contacts.a.d(firstName, lastName, gVarQ != null ? gVarQ.getProfileImageUrlMedium() : null, false, null, 24, null));
                        List<l20.c> listZ = tVarDa2.f87206e.z();
                        if (listZ != null && (listN0 = h0.N0(listZ, new v())) != null) {
                            for (l20.c cVar3 : listN0) {
                                String str2 = cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                if (str2 != null) {
                                    Long contactInfoPk = cVar3.getContactInfoPk();
                                    l20.p pVarU = cVar3.u();
                                    z15 = z19;
                                    e0 e0Var2 = tVarDa2.f87208g;
                                    if (e0Var2 == null) {
                                        Throwable th5 = th4;
                                        p005kotlin.jvm.internal.s.m("phonePrefixProvider");
                                        throw th5;
                                    }
                                    if (gl1.d.K(cVar3, e0Var2)) {
                                        th3 = th4;
                                        if (!p005kotlin.jvm.internal.s.g(cVar3.getIsValid(), Boolean.FALSE)) {
                                            z16 = false;
                                        }
                                        e0Var = tVarDa2.f87208g;
                                        if (e0Var != null) {
                                            p005kotlin.jvm.internal.s.m("phonePrefixProvider");
                                            throw th3;
                                        }
                                        if (gl1.d.K(cVar3, e0Var) || p005kotlin.jvm.internal.s.g(cVar3.getIsValid(), Boolean.FALSE)) {
                                            z17 = false;
                                        } else {
                                            z17 = z15;
                                        }
                                        Boolean isEmsValue = cVar3.getIsEmsValue();
                                        String phoneUUID = cVar3.getPhoneUUID();
                                        boolean zG = cVar3.G();
                                        Boolean isValid = cVar3.getIsValid();
                                        int localId = cVar3.getLocalId();
                                        if (arrayList != null || arrayList.isEmpty()) {
                                            z18 = false;
                                        } else {
                                            Iterator it5 = arrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    com.garmin.android.apps.connectmobile.contacts.a.e eVar = (com.garmin.android.apps.connectmobile.contacts.a.e) it5.next();
                                                    if (p005kotlin.jvm.internal.s.g(eVar != null ? eVar.f32353a : th3, str2)) {
                                                        z18 = z15;
                                                    }
                                                } else {
                                                    z18 = false;
                                                }
                                            }
                                        }
                                        arrayList2.add(new com.garmin.android.apps.connectmobile.contacts.a.f(contactInfoPk, str2, pVarU, z16, false, false, false, false, z17, isEmsValue, phoneUUID, null, zG, null, null, false, isValid, false, localId, null, z18, 190704, null));
                                    } else {
                                        th3 = th4;
                                    }
                                    z16 = z15;
                                    e0Var = tVarDa2.f87208g;
                                    if (e0Var != null) {
                                        p005kotlin.jvm.internal.s.m("phonePrefixProvider");
                                        throw th3;
                                    }
                                    if (gl1.d.K(cVar3, e0Var)) {
                                        z17 = false;
                                    } else {
                                        z17 = false;
                                    }
                                    Boolean isEmsValue2 = cVar3.getIsEmsValue();
                                    String phoneUUID2 = cVar3.getPhoneUUID();
                                    boolean zG2 = cVar3.G();
                                    Boolean isValid2 = cVar3.getIsValid();
                                    int localId2 = cVar3.getLocalId();
                                    if (arrayList != null) {
                                        z18 = false;
                                    } else {
                                        z18 = false;
                                    }
                                    arrayList2.add(new com.garmin.android.apps.connectmobile.contacts.a.f(contactInfoPk, str2, pVarU, z16, false, false, false, false, z17, isEmsValue2, phoneUUID2, null, zG2, null, null, false, isValid2, false, localId2, null, z18, 190704, null));
                                } else {
                                    z15 = z19;
                                    th3 = th4;
                                }
                                z19 = z15;
                                th4 = th3;
                            }
                        }
                        boolean z24 = z19;
                        ?? r39 = th4;
                        List<l20.c> listR = tVarDa2.f87206e.r();
                        if (listR != null) {
                            for (l20.c cVar4 : listR) {
                                String str3 = cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                if (str3 != null) {
                                    arrayList2.add(new com.garmin.android.apps.connectmobile.contacts.a.c(cVar4.getContactInfoPk(), str3, cVar4.m(), gl1.d.J(cVar4), cVar4.getLocalId(), false, false, false, false, cVar4.G(), null, null, false, null, 7648, null));
                                }
                            }
                        }
                        boolean z25 = editContactActivity2.da().f87206e.getContactId() == null ? z24 : false;
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = aVar12.f32526b;
                        arrayList5.clear();
                        aVar12.f32528d = 0;
                        aVar12.f32529e = 0;
                        ?? r17 = r39;
                        for (com.garmin.android.apps.connectmobile.contacts.a aVar13 : arrayList2) {
                            if (aVar13 instanceof com.garmin.android.apps.connectmobile.contacts.a.d) {
                                r17 = aVar13;
                            } else if (aVar13 instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
                                aVar12.f32528d++;
                                arrayList3.add(aVar13);
                            } else if (aVar13 instanceof com.garmin.android.apps.connectmobile.contacts.a.c) {
                                aVar12.f32529e++;
                                arrayList4.add(aVar13);
                            } else {
                                Objects.toString(aVar13);
                            }
                        }
                        com.garmin.android.apps.connectmobile.contacts.a.d dVar = (com.garmin.android.apps.connectmobile.contacts.a.d) r17;
                        if (dVar != null) {
                            arrayList5.add(dVar);
                        }
                        arrayList5.addAll(arrayList3);
                        if (aVar12.f32528d < aVar12.f32527c) {
                            arrayList5.add(com.garmin.android.apps.connectmobile.contacts.a.b.f32333a);
                        }
                        arrayList5.addAll(arrayList4);
                        if (aVar12.f32529e < aVar12.f32527c) {
                            arrayList5.add(com.garmin.android.apps.connectmobile.contacts.a.C0525a.f32332a);
                        }
                        if (!z25) {
                            arrayList5.add(com.garmin.android.apps.connectmobile.contacts.a.g.f32377a);
                        }
                        aVar12.notifyDataSetChanged();
                        editContactActivity2.initActionBar(editContactActivity2.da().f87206e.getContactId() == null ? R.string.contact_management_title_create_contact : R.string.contact_management_title_edit_contact, 2);
                        if (editContactActivity2.getIntent().hasExtra("EXTRA_CONTACT_METHOD_EDIT_IMMEDIATELY")) {
                            String stringExtra = editContactActivity2.getIntent().getStringExtra("EXTRA_CONTACT_METHOD_EDIT_IMMEDIATELY");
                            if (stringExtra != null) {
                                l20.a aVar14 = editContactActivity2.f32508h;
                                if (aVar14 == null) {
                                    p005kotlin.jvm.internal.s.m("contactDto");
                                    throw r39;
                                }
                                cVarH = aVar14.h(stringExtra);
                            } else {
                                r14 = r39;
                            }
                            if (r14 != 0) {
                                l20.a aVar15 = editContactActivity2.f32508h;
                                if (aVar15 == null) {
                                    r14 = cVarH;
                                    p005kotlin.jvm.internal.s.m("contactDto");
                                    throw r39;
                                }
                                Boolean boolH = com.garmin.android.apps.connectmobile.contacts.b.h(aVar15, r14);
                                if (p005kotlin.jvm.internal.s.g(boolH, Boolean.TRUE)) {
                                    f.c<Intent> cVar5 = editContactActivity2.f32513m;
                                    EditContactMethodActivity.a aVar16 = EditContactMethodActivity.f32519d;
                                    l20.a aVar17 = editContactActivity2.f32508h;
                                    if (aVar17 == null) {
                                        r14 = cVarH;
                                        p005kotlin.jvm.internal.s.m("contactDto");
                                        throw r39;
                                    }
                                    r14 = cVarH;
                                    cVar5.a(EditContactMethodActivity.a.b(aVar16, editContactActivity2, aVar17, r14.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), null, r14.m(), null, 96), r39);
                                } else if (p005kotlin.jvm.internal.s.g(boolH, Boolean.FALSE)) {
                                    f.c<Intent> cVar6 = editContactActivity2.f32512l;
                                    EditContactMethodActivity.a aVar18 = EditContactMethodActivity.f32519d;
                                    l20.a aVar19 = editContactActivity2.f32508h;
                                    if (aVar19 == null) {
                                        r14 = cVarH;
                                        p005kotlin.jvm.internal.s.m("contactDto");
                                        throw null;
                                    }
                                    r14 = cVarH;
                                    cVar6.a(EditContactMethodActivity.a.b(aVar18, editContactActivity2, aVar19, r14.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), r14.getIsEmsValue(), r14.u(), null, 96), null);
                                } else {
                                    String str4 = r14.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                    l20.a aVar20 = editContactActivity2.f32508h;
                                    if (aVar20 == null) {
                                        r14 = cVarH;
                                        p005kotlin.jvm.internal.s.m("contactDto");
                                        throw null;
                                    }
                                    r14 = cVarH;
                                    String str5 = "Error! We cannot edit a contact method immediately because " + str4 + " is not part of " + aVar20 + ". Falling back to editing the entire contact.";
                                    i2.a aVar21 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar21.getClass();
                                    i2.a.f(a2Var2, "EditContactActivity", str5);
                                }
                            } else {
                                r14 = cVarH;
                                i2.a aVar22 = i2.f36769a;
                                a2 a2Var3 = a2.GENERAL;
                                aVar22.getClass();
                                i2.a.f(a2Var3, "EditContactActivity", "Error! We cannot edit a contact method immediately because contactInfoDTO was null. Falling back to editing the entire contact.");
                            }
                        }
                        if (editContactActivity2.getIntent().getBooleanExtra("EXTRA_CREATE_NEW_PHONE_NUMBER", false)) {
                            editContactActivity2.W8(null);
                            return;
                        }
                        return;
                }
            }
        };
        final int i15 = 1;
        this.f32502b = new z0(this) { // from class: i20.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactActivity f87151b;

            {
                this.f87151b = this;
            }

            /* JADX WARN: Code duplicated, block: B:233:0x04cd  */
            /* JADX WARN: Code duplicated, block: B:245:0x0232 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:78:0x01b6  */
            /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
            /* JADX WARN: Code duplicated, block: B:99:0x020c  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
            /* JADX WARN: Type inference failed for: r12v3 */
            /* JADX WARN: Type inference failed for: r12v4 */
            /* JADX WARN: Type inference failed for: r12v8 */
            /* JADX WARN: Type inference failed for: r12v9 */
            /* JADX WARN: Type inference failed for: r1v34 */
            /* JADX WARN: Type inference failed for: r1v35, types: [l20.c] */
            /* JADX WARN: Type inference failed for: r1v47 */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r39v1, types: [java.lang.Throwable, z6.b] */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) throws Throwable {
                l20.a aVar;
                boolean z14;
                ArrayList arrayList;
                ?? r14;
                l20.c cVarH;
                List<l20.c> listN0;
                boolean z15;
                Throwable th3;
                boolean z16;
                e0 e0Var;
                boolean z17;
                boolean z18;
                boolean z19 = true;
                Throwable th4 = null;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        EditContactActivity.a aVar2 = EditContactActivity.f32500n;
                        g3Var.getClass();
                        int i16 = EditContactActivity.b.f32514a[g3Var.f35300a.ordinal()];
                        EditContactActivity editContactActivity = this.f87151b;
                        if (i16 == 1) {
                            editContactActivity.showProgressOverlay();
                            return;
                        }
                        if (i16 != 2) {
                            editContactActivity.hideProgressOverlay();
                            q0.b(editContactActivity);
                            return;
                        }
                        editContactActivity.hideProgressOverlay();
                        l20.a aVar3 = (l20.a) g3Var.f35301b;
                        if (aVar3 == null) {
                            l20.a aVar4 = editContactActivity.f32508h;
                            if (aVar4 == null) {
                                p005kotlin.jvm.internal.s.m("contactDto");
                                throw null;
                            }
                            aVar = aVar4;
                        } else {
                            aVar = aVar3;
                        }
                        editContactActivity.f32508h = aVar;
                        if (editContactActivity.f32510j) {
                            editContactActivity.setResult(-1, new Intent().putExtra("extra_contact_key", aVar3));
                            editContactActivity.finish();
                            return;
                        }
                        f.c<Intent> cVar = editContactActivity.f32511k;
                        EmergencyContactSendRequestActivity.a aVar5 = EmergencyContactSendRequestActivity.f32570v;
                        ?? r15 = editContactActivity.f32509i;
                        if (r15 == 0 || !r15.isEmpty()) {
                            Iterator it = r15.iterator();
                            while (it.hasNext()) {
                                if (((l20.c) it.next()).G()) {
                                    ?? r16 = editContactActivity.f32509i;
                                    if (r16 == 0 || !r16.isEmpty()) {
                                        Iterator it3 = r16.iterator();
                                        while (it3.hasNext()) {
                                            if (((l20.c) it3.next()).g0()) {
                                                z14 = true;
                                            }
                                        }
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                }
                            }
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        cVar.a(EmergencyContactSendRequestActivity.a.b(aVar5, editContactActivity, aVar, r15, false, z14, (hl.a) editContactActivity.f32503c.getValue(), 16), null);
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        EditContactActivity.a aVar6 = EditContactActivity.f32500n;
                        g3Var2.getClass();
                        int i17 = EditContactActivity.b.f32514a[g3Var2.f35300a.ordinal()];
                        EditContactActivity editContactActivity2 = this.f87151b;
                        if (i17 == 1) {
                            editContactActivity2.showProgressOverlay();
                            return;
                        }
                        if (i17 != 2) {
                            editContactActivity2.hideProgressOverlay();
                            q0.b(editContactActivity2);
                            return;
                        }
                        editContactActivity2.hideProgressOverlay();
                        l20.a aVar7 = (l20.a) g3Var2.f35301b;
                        if (aVar7 == null) {
                            i2.a aVar8 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar8.getClass();
                            i2.a.f(a2Var, "EditContactActivity", "No contact DTO received! Could not display activity!");
                            q0.b(editContactActivity2);
                            editContactActivity2.finish();
                            return;
                        }
                        editContactActivity2.f32508h = aVar7;
                        int i18 = 0;
                        for (Object obj2 : aVar7.k()) {
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            l20.c cVar2 = (l20.c) obj2;
                            if (cVar2.getLocalId() == -1) {
                                cVar2.k0(i18);
                            }
                            i18 = i19;
                        }
                        View viewFindViewById = editContactActivity2.findViewById(R.id.recycler_view);
                        viewFindViewById.getClass();
                        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
                        editContactActivity2.f32505e = recyclerView;
                        recyclerView.setLayoutManager(new LinearLayoutManager(editContactActivity2));
                        RecyclerView recyclerView2 = editContactActivity2.f32505e;
                        if (recyclerView2 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView2.setHasFixedSize(true);
                        com.garmin.android.apps.connectmobile.contacts.edit.a aVar9 = new com.garmin.android.apps.connectmobile.contacts.edit.a(editContactActivity2);
                        editContactActivity2.f32506f = aVar9;
                        RecyclerView recyclerView3 = editContactActivity2.f32505e;
                        if (recyclerView3 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView3.setAdapter(aVar9);
                        t tVarDa = editContactActivity2.da();
                        l20.a aVar10 = editContactActivity2.f32508h;
                        if (aVar10 == null) {
                            p005kotlin.jvm.internal.s.m("contactDto");
                            throw null;
                        }
                        tVarDa.z4(aVar10, new e0(editContactActivity2));
                        editContactActivity2.da().f87210i.f(editContactActivity2, editContactActivity2.f32501a);
                        com.garmin.android.apps.connectmobile.contacts.edit.a aVar11 = editContactActivity2.f32506f;
                        if (aVar11 == null) {
                            p005kotlin.jvm.internal.s.m("contactAdapter");
                            throw null;
                        }
                        Integer contactInfoLimit = editContactActivity2.da().f87206e.getContactInfoLimit();
                        aVar11.f32527c = contactInfoLimit != null ? contactInfoLimit.intValue() : 5;
                        com.garmin.android.apps.connectmobile.contacts.edit.a aVar12 = editContactActivity2.f32506f;
                        if (aVar12 == null) {
                            p005kotlin.jvm.internal.s.m("contactAdapter");
                            throw null;
                        }
                        t tVarDa2 = editContactActivity2.da();
                        tVarDa2.getClass();
                        ArrayList<com.garmin.android.apps.connectmobile.contacts.a> arrayList2 = new ArrayList();
                        List<l20.c> listY = tVarDa2.f87206e.y();
                        if (listY != null) {
                            arrayList = new ArrayList(p13.y.r(listY, 10));
                            Iterator it4 = listY.iterator();
                            while (it4.hasNext()) {
                                String str = ((l20.c) it4.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                arrayList.add(str != null ? new com.garmin.android.apps.connectmobile.contacts.a.e(str, false, false, 6, null) : null);
                            }
                        } else {
                            arrayList = null;
                        }
                        String firstName = tVarDa2.f87206e.getFirstName();
                        if (firstName == null) {
                            firstName = "";
                        }
                        String lastName = tVarDa2.f87206e.getLastName();
                        if (lastName == null) {
                            lastName = "";
                        }
                        l20.g gVarQ = tVarDa2.f87206e.q();
                        arrayList2.add(new com.garmin.android.apps.connectmobile.contacts.a.d(firstName, lastName, gVarQ != null ? gVarQ.getProfileImageUrlMedium() : null, false, null, 24, null));
                        List<l20.c> listZ = tVarDa2.f87206e.z();
                        if (listZ != null && (listN0 = h0.N0(listZ, new v())) != null) {
                            for (l20.c cVar3 : listN0) {
                                String str2 = cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                if (str2 != null) {
                                    Long contactInfoPk = cVar3.getContactInfoPk();
                                    l20.p pVarU = cVar3.u();
                                    z15 = z19;
                                    e0 e0Var2 = tVarDa2.f87208g;
                                    if (e0Var2 == null) {
                                        Throwable th5 = th4;
                                        p005kotlin.jvm.internal.s.m("phonePrefixProvider");
                                        throw th5;
                                    }
                                    if (gl1.d.K(cVar3, e0Var2)) {
                                        th3 = th4;
                                        if (!p005kotlin.jvm.internal.s.g(cVar3.getIsValid(), Boolean.FALSE)) {
                                            z16 = false;
                                        }
                                        e0Var = tVarDa2.f87208g;
                                        if (e0Var != null) {
                                            p005kotlin.jvm.internal.s.m("phonePrefixProvider");
                                            throw th3;
                                        }
                                        if (gl1.d.K(cVar3, e0Var) || p005kotlin.jvm.internal.s.g(cVar3.getIsValid(), Boolean.FALSE)) {
                                            z17 = false;
                                        } else {
                                            z17 = z15;
                                        }
                                        Boolean isEmsValue2 = cVar3.getIsEmsValue();
                                        String phoneUUID2 = cVar3.getPhoneUUID();
                                        boolean zG2 = cVar3.G();
                                        Boolean isValid2 = cVar3.getIsValid();
                                        int localId2 = cVar3.getLocalId();
                                        if (arrayList != null || arrayList.isEmpty()) {
                                            z18 = false;
                                        } else {
                                            Iterator it5 = arrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    com.garmin.android.apps.connectmobile.contacts.a.e eVar = (com.garmin.android.apps.connectmobile.contacts.a.e) it5.next();
                                                    if (p005kotlin.jvm.internal.s.g(eVar != null ? eVar.f32353a : th3, str2)) {
                                                        z18 = z15;
                                                    }
                                                } else {
                                                    z18 = false;
                                                }
                                            }
                                        }
                                        arrayList2.add(new com.garmin.android.apps.connectmobile.contacts.a.f(contactInfoPk, str2, pVarU, z16, false, false, false, false, z17, isEmsValue2, phoneUUID2, null, zG2, null, null, false, isValid2, false, localId2, null, z18, 190704, null));
                                    } else {
                                        th3 = th4;
                                    }
                                    z16 = z15;
                                    e0Var = tVarDa2.f87208g;
                                    if (e0Var != null) {
                                        p005kotlin.jvm.internal.s.m("phonePrefixProvider");
                                        throw th3;
                                    }
                                    if (gl1.d.K(cVar3, e0Var)) {
                                        z17 = false;
                                    } else {
                                        z17 = false;
                                    }
                                    Boolean isEmsValue3 = cVar3.getIsEmsValue();
                                    String phoneUUID3 = cVar3.getPhoneUUID();
                                    boolean zG3 = cVar3.G();
                                    Boolean isValid3 = cVar3.getIsValid();
                                    int localId3 = cVar3.getLocalId();
                                    if (arrayList != null) {
                                        z18 = false;
                                    } else {
                                        z18 = false;
                                    }
                                    arrayList2.add(new com.garmin.android.apps.connectmobile.contacts.a.f(contactInfoPk, str2, pVarU, z16, false, false, false, false, z17, isEmsValue3, phoneUUID3, null, zG3, null, null, false, isValid3, false, localId3, null, z18, 190704, null));
                                } else {
                                    z15 = z19;
                                    th3 = th4;
                                }
                                z19 = z15;
                                th4 = th3;
                            }
                        }
                        boolean z24 = z19;
                        ?? r39 = th4;
                        List<l20.c> listR = tVarDa2.f87206e.r();
                        if (listR != null) {
                            for (l20.c cVar4 : listR) {
                                String str3 = cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                if (str3 != null) {
                                    arrayList2.add(new com.garmin.android.apps.connectmobile.contacts.a.c(cVar4.getContactInfoPk(), str3, cVar4.m(), gl1.d.J(cVar4), cVar4.getLocalId(), false, false, false, false, cVar4.G(), null, null, false, null, 7648, null));
                                }
                            }
                        }
                        boolean z25 = editContactActivity2.da().f87206e.getContactId() == null ? z24 : false;
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = aVar12.f32526b;
                        arrayList5.clear();
                        aVar12.f32528d = 0;
                        aVar12.f32529e = 0;
                        ?? r17 = r39;
                        for (com.garmin.android.apps.connectmobile.contacts.a aVar13 : arrayList2) {
                            if (aVar13 instanceof com.garmin.android.apps.connectmobile.contacts.a.d) {
                                r17 = aVar13;
                            } else if (aVar13 instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
                                aVar12.f32528d++;
                                arrayList3.add(aVar13);
                            } else if (aVar13 instanceof com.garmin.android.apps.connectmobile.contacts.a.c) {
                                aVar12.f32529e++;
                                arrayList4.add(aVar13);
                            } else {
                                Objects.toString(aVar13);
                            }
                        }
                        com.garmin.android.apps.connectmobile.contacts.a.d dVar = (com.garmin.android.apps.connectmobile.contacts.a.d) r17;
                        if (dVar != null) {
                            arrayList5.add(dVar);
                        }
                        arrayList5.addAll(arrayList3);
                        if (aVar12.f32528d < aVar12.f32527c) {
                            arrayList5.add(com.garmin.android.apps.connectmobile.contacts.a.b.f32333a);
                        }
                        arrayList5.addAll(arrayList4);
                        if (aVar12.f32529e < aVar12.f32527c) {
                            arrayList5.add(com.garmin.android.apps.connectmobile.contacts.a.C0525a.f32332a);
                        }
                        if (!z25) {
                            arrayList5.add(com.garmin.android.apps.connectmobile.contacts.a.g.f32377a);
                        }
                        aVar12.notifyDataSetChanged();
                        editContactActivity2.initActionBar(editContactActivity2.da().f87206e.getContactId() == null ? R.string.contact_management_title_create_contact : R.string.contact_management_title_edit_contact, 2);
                        if (editContactActivity2.getIntent().hasExtra("EXTRA_CONTACT_METHOD_EDIT_IMMEDIATELY")) {
                            String stringExtra = editContactActivity2.getIntent().getStringExtra("EXTRA_CONTACT_METHOD_EDIT_IMMEDIATELY");
                            if (stringExtra != null) {
                                l20.a aVar14 = editContactActivity2.f32508h;
                                if (aVar14 == null) {
                                    p005kotlin.jvm.internal.s.m("contactDto");
                                    throw r39;
                                }
                                cVarH = aVar14.h(stringExtra);
                            } else {
                                r14 = r39;
                            }
                            if (r14 != 0) {
                                l20.a aVar15 = editContactActivity2.f32508h;
                                if (aVar15 == null) {
                                    r14 = cVarH;
                                    p005kotlin.jvm.internal.s.m("contactDto");
                                    throw r39;
                                }
                                Boolean boolH = com.garmin.android.apps.connectmobile.contacts.b.h(aVar15, r14);
                                if (p005kotlin.jvm.internal.s.g(boolH, Boolean.TRUE)) {
                                    f.c<Intent> cVar5 = editContactActivity2.f32513m;
                                    EditContactMethodActivity.a aVar16 = EditContactMethodActivity.f32519d;
                                    l20.a aVar17 = editContactActivity2.f32508h;
                                    if (aVar17 == null) {
                                        r14 = cVarH;
                                        p005kotlin.jvm.internal.s.m("contactDto");
                                        throw r39;
                                    }
                                    r14 = cVarH;
                                    cVar5.a(EditContactMethodActivity.a.b(aVar16, editContactActivity2, aVar17, r14.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), null, r14.m(), null, 96), r39);
                                } else if (p005kotlin.jvm.internal.s.g(boolH, Boolean.FALSE)) {
                                    f.c<Intent> cVar6 = editContactActivity2.f32512l;
                                    EditContactMethodActivity.a aVar18 = EditContactMethodActivity.f32519d;
                                    l20.a aVar19 = editContactActivity2.f32508h;
                                    if (aVar19 == null) {
                                        r14 = cVarH;
                                        p005kotlin.jvm.internal.s.m("contactDto");
                                        throw null;
                                    }
                                    r14 = cVarH;
                                    cVar6.a(EditContactMethodActivity.a.b(aVar18, editContactActivity2, aVar19, r14.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), r14.getIsEmsValue(), r14.u(), null, 96), null);
                                } else {
                                    String str4 = r14.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                    l20.a aVar20 = editContactActivity2.f32508h;
                                    if (aVar20 == null) {
                                        r14 = cVarH;
                                        p005kotlin.jvm.internal.s.m("contactDto");
                                        throw null;
                                    }
                                    r14 = cVarH;
                                    String str5 = "Error! We cannot edit a contact method immediately because " + str4 + " is not part of " + aVar20 + ". Falling back to editing the entire contact.";
                                    i2.a aVar21 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar21.getClass();
                                    i2.a.f(a2Var2, "EditContactActivity", str5);
                                }
                            } else {
                                r14 = cVarH;
                                i2.a aVar22 = i2.f36769a;
                                a2 a2Var3 = a2.GENERAL;
                                aVar22.getClass();
                                i2.a.f(a2Var3, "EditContactActivity", "Error! We cannot edit a contact method immediately because contactInfoDTO was null. Falling back to editing the entire contact.");
                            }
                        }
                        if (editContactActivity2.getIntent().getBooleanExtra("EXTRA_CREATE_NEW_PHONE_NUMBER", false)) {
                            editContactActivity2.W8(null);
                            return;
                        }
                        return;
                }
            }
        };
        final int i16 = 0;
        this.f32503c = m.b(new e23.a(this) { // from class: i20.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactActivity f87153b;

            {
                this.f87153b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i17 = i16;
                EditContactActivity editContactActivity = this.f87153b;
                switch (i17) {
                    case 0:
                        EditContactActivity.a aVar = EditContactActivity.f32500n;
                        Bundle extras = editContactActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                        return ParametersHolderKt.parametersOf((hl.a) editContactActivity.f32503c.getValue());
                }
            }
        });
        final int i17 = 1;
        this.f32504d = m.a(n.NONE, new c(this, null, null, new e23.a(this) { // from class: i20.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactActivity f87153b;

            {
                this.f87153b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                int i18 = i17;
                EditContactActivity editContactActivity = this.f87153b;
                switch (i18) {
                    case 0:
                        EditContactActivity.a aVar = EditContactActivity.f32500n;
                        Bundle extras = editContactActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable2 = extras.getParcelable("GCM_extra_screen_access_role");
                                if (!(parcelable2 instanceof hl.a)) {
                                    parcelable2 = null;
                                }
                                parcelable = (hl.a) parcelable2;
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                        return ParametersHolderKt.parametersOf((hl.a) editContactActivity.f32503c.getValue());
                }
            }
        }));
        final int i18 = 0;
        this.f32511k = registerForActivityResult(new h(), new f.b(this) { // from class: i20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactActivity f87155b;

            {
                this.f87155b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                Bundle extras;
                Bundle extras2;
                Parcelable parcelable;
                l20.p pVar;
                String str;
                Serializable serializableExtra;
                l20.k kVar;
                int i19;
                Serializable serializableExtra2;
                int i24 = i18;
                int i25 = 0;
                int i26 = -1;
                Boolean boolValueOf = null;
                boolValueOf = null;
                EditContactActivity editContactActivity = this.f87155b;
                switch (i24) {
                    case 0:
                        f.a aVar2 = (f.a) obj;
                        EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                        aVar2.getClass();
                        Intent intent = aVar2.f67586b;
                        if (aVar2.f67585a == -1) {
                            if (intent == null || (extras2 = intent.getExtras()) == null) {
                                aVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) extras2.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable2 = extras2.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable2 instanceof l20.a)) {
                                        parcelable2 = null;
                                    }
                                    parcelable = (l20.a) parcelable2;
                                }
                                aVar = (l20.a) parcelable;
                            }
                            if (intent != null && (extras = intent.getExtras()) != null) {
                                boolValueOf = Boolean.valueOf(extras.getBoolean("IS_CONTACT_UPDATED", true));
                            }
                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.FALSE) || aVar == null) {
                                return;
                            }
                            editContactActivity.da().z4(aVar, new e0(editContactActivity));
                            editContactActivity.f32510j = true;
                            editContactActivity.da().y4();
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar4 = (f.a) obj;
                        EditContactActivity.a aVar5 = EditContactActivity.f32500n;
                        aVar4.getClass();
                        Intent intent2 = aVar4.f67586b;
                        if (aVar4.f67585a == -1) {
                            String stringExtra = intent2 != null ? intent2.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra2 = intent2 != null ? intent2.getStringExtra("EXTRA_RESULT") : null;
                            String stringExtra3 = intent2 != null ? intent2.getStringExtra("RESULT_PHONE_UUID") : null;
                            Boolean boolValueOf2 = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("RESULT_PHONE_ISVALID", true)) : null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent2.getSerializableExtra("EXTRA_LABEL", l20.p.class);
                                } else {
                                    Serializable serializableExtra3 = intent2.getSerializableExtra("EXTRA_LABEL");
                                    if (!(serializableExtra3 instanceof l20.p)) {
                                        serializableExtra3 = null;
                                    }
                                    serializableExtra = (l20.p) serializableExtra3;
                                }
                                pVar = (l20.p) serializableExtra;
                            } else {
                                pVar = null;
                            }
                            if (stringExtra2 == null || d53.w.J(stringExtra2)) {
                                if (stringExtra != null) {
                                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar6 = editContactActivity.f32506f;
                                    if (aVar6 == null) {
                                        p005kotlin.jvm.internal.s.m("contactAdapter");
                                        throw null;
                                    }
                                    for (com.garmin.android.apps.connectmobile.contacts.a aVar7 : aVar6.f32526b) {
                                        com.garmin.android.apps.connectmobile.contacts.a.f fVar = aVar7 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) aVar7 : null;
                                        if (p005kotlin.jvm.internal.s.g(fVar != null ? fVar.f32357b : null, stringExtra)) {
                                            i26 = i25;
                                            aVar6.u(i26);
                                            return;
                                        }
                                        i25++;
                                    }
                                    aVar6.u(i26);
                                    return;
                                }
                                return;
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a aVar8 = editContactActivity.f32506f;
                            if (aVar8 == null) {
                                p005kotlin.jvm.internal.s.m("contactAdapter");
                                throw null;
                            }
                            str = stringExtra != null ? stringExtra : "";
                            ArrayList arrayList = aVar8.f32526b;
                            Iterator it = arrayList.iterator();
                            int i27 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    com.garmin.android.apps.connectmobile.contacts.a aVar9 = (com.garmin.android.apps.connectmobile.contacts.a) it.next();
                                    com.garmin.android.apps.connectmobile.contacts.a.f fVar2 = aVar9 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) aVar9 : null;
                                    if (!p005kotlin.jvm.internal.s.g(fVar2 != null ? fVar2.f32357b : null, str)) {
                                        i27++;
                                    }
                                } else {
                                    i27 = -1;
                                }
                            }
                            if (i27 != -1) {
                                Object obj2 = arrayList.get(i27);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar3 = obj2 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj2 : null;
                                if (fVar3 != null) {
                                    fVar3.f32357b = stringExtra2;
                                }
                                Object obj3 = arrayList.get(i27);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar4 = obj3 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj3 : null;
                                if (fVar4 != null) {
                                    fVar4.f32372q = boolValueOf2;
                                }
                                Object obj4 = arrayList.get(i27);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar5 = obj4 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj4 : null;
                                if (fVar5 != null) {
                                    fVar5.f32366k = stringExtra3;
                                }
                                if (pVar != null) {
                                    Object obj5 = arrayList.get(i27);
                                    com.garmin.android.apps.connectmobile.contacts.a.f fVar6 = obj5 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj5 : null;
                                    if (fVar6 != null) {
                                        fVar6.f32358c = pVar;
                                    }
                                }
                                aVar8.notifyItemChanged(i27);
                            } else {
                                int i28 = aVar8.f32528d;
                                int i29 = i28 + 1;
                                boolean zBooleanValue = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
                                if (i29 != -1) {
                                    aVar8.f32528d++;
                                    if (pVar == null) {
                                        Object obj6 = arrayList.get(i28);
                                        com.garmin.android.apps.connectmobile.contacts.a.f fVar7 = obj6 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj6 : null;
                                        l20.p pVar2 = fVar7 != null ? fVar7.f32358c : null;
                                        l20.i.a aVar10 = l20.i.f109004a;
                                        l20.p[] pVarArrValues = l20.p.values();
                                        aVar10.getClass();
                                        pVarArrValues.getClass();
                                        int iM = p13.u.M(pVarArrValues, pVar2);
                                        pVar = (iM < 0 || iM >= pVarArrValues.length - 1) ? pVarArrValues[0] : pVarArrValues[iM + 1];
                                    }
                                    aVar8.r(i29, new com.garmin.android.apps.connectmobile.contacts.a.f(null, stringExtra2, pVar, false, false, false, false, false, zBooleanValue, null, stringExtra3, null, false, null, null, false, null, false, arrayList.size() + 1, null, false, 1309433, null));
                                    if (aVar8.f32528d >= aVar8.f32527c) {
                                        aVar8.x(i28 + 2);
                                    }
                                }
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar8 = aVar8.f32525a;
                            if (fVar8 != null) {
                                fVar8.q9(arrayList);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f.a aVar11 = (f.a) obj;
                        EditContactActivity.a aVar12 = EditContactActivity.f32500n;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1) {
                            String stringExtra4 = intent3 != null ? intent3.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra5 = intent3 != null ? intent3.getStringExtra("EXTRA_RESULT") : null;
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra2 = intent3.getSerializableExtra("EXTRA_LABEL", l20.k.class);
                                } else {
                                    Serializable serializableExtra4 = intent3.getSerializableExtra("EXTRA_LABEL");
                                    if (!(serializableExtra4 instanceof l20.k)) {
                                        serializableExtra4 = null;
                                    }
                                    serializableExtra2 = (l20.k) serializableExtra4;
                                }
                                kVar = (l20.k) serializableExtra2;
                            } else {
                                kVar = null;
                            }
                            if (stringExtra5 == null || d53.w.J(stringExtra5)) {
                                if (stringExtra4 != null) {
                                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar13 = editContactActivity.f32506f;
                                    if (aVar13 == null) {
                                        p005kotlin.jvm.internal.s.m("contactAdapter");
                                        throw null;
                                    }
                                    for (com.garmin.android.apps.connectmobile.contacts.a aVar14 : aVar13.f32526b) {
                                        com.garmin.android.apps.connectmobile.contacts.a.c cVar = aVar14 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) aVar14 : null;
                                        if (p005kotlin.jvm.internal.s.g(cVar != null ? cVar.f32335b : null, stringExtra4)) {
                                            i26 = i25;
                                            aVar13.u(i26);
                                            return;
                                        }
                                        i25++;
                                    }
                                    aVar13.u(i26);
                                    return;
                                }
                                return;
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a aVar15 = editContactActivity.f32506f;
                            if (aVar15 == null) {
                                p005kotlin.jvm.internal.s.m("contactAdapter");
                                throw null;
                            }
                            str = stringExtra4 != null ? stringExtra4 : "";
                            ArrayList arrayList2 = aVar15.f32526b;
                            Iterator it3 = arrayList2.iterator();
                            int i30 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    com.garmin.android.apps.connectmobile.contacts.a aVar16 = (com.garmin.android.apps.connectmobile.contacts.a) it3.next();
                                    com.garmin.android.apps.connectmobile.contacts.a.c cVar2 = aVar16 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) aVar16 : null;
                                    if (!p005kotlin.jvm.internal.s.g(cVar2 != null ? cVar2.f32335b : null, str)) {
                                        i30++;
                                    }
                                } else {
                                    i30 = -1;
                                }
                            }
                            if (i30 != -1) {
                                Object obj7 = arrayList2.get(i30);
                                com.garmin.android.apps.connectmobile.contacts.a.c cVar3 = obj7 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj7 : null;
                                if (cVar3 != null) {
                                    cVar3.f32335b = stringExtra5;
                                }
                                if (kVar != null) {
                                    Object obj8 = arrayList2.get(i30);
                                    com.garmin.android.apps.connectmobile.contacts.a.c cVar4 = obj8 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj8 : null;
                                    if (cVar4 != null) {
                                        cVar4.f32336c = kVar;
                                    }
                                }
                                aVar15.notifyItemChanged(i30);
                            } else {
                                int i34 = aVar15.f32528d;
                                if (arrayList2 == null || !arrayList2.isEmpty()) {
                                    Iterator it4 = arrayList2.iterator();
                                    i19 = 0;
                                    while (it4.hasNext()) {
                                        if ((((com.garmin.android.apps.connectmobile.contacts.a) it4.next()) instanceof com.garmin.android.apps.connectmobile.contacts.a.b) && (i19 = i19 + 1) < 0) {
                                            p13.x.p();
                                            throw null;
                                        }
                                    }
                                } else {
                                    i19 = 0;
                                }
                                int i35 = aVar15.f32529e;
                                int i36 = i34 + i19 + i35;
                                int i37 = i36 + 1;
                                if (i37 != -1) {
                                    aVar15.f32529e = i35 + 1;
                                    if (kVar == null) {
                                        Object obj9 = arrayList2.get(i36);
                                        com.garmin.android.apps.connectmobile.contacts.a.c cVar5 = obj9 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj9 : null;
                                        l20.k kVar2 = cVar5 != null ? cVar5.f32336c : null;
                                        l20.i.a aVar17 = l20.i.f109004a;
                                        l20.k[] kVarArrValues = l20.k.values();
                                        aVar17.getClass();
                                        kVarArrValues.getClass();
                                        int iM2 = p13.u.M(kVarArrValues, kVar2);
                                        kVar = (iM2 < 0 || iM2 >= kVarArrValues.length - 1) ? kVarArrValues[0] : kVarArrValues[iM2 + 1];
                                    }
                                    aVar15.r(i37, new com.garmin.android.apps.connectmobile.contacts.a.c(null, stringExtra5, kVar, false, arrayList2.size() + 1, false, false, false, false, false, null, null, false, null, 8169, null));
                                    if (aVar15.f32529e >= aVar15.f32527c) {
                                        aVar15.x(i36 + 2);
                                    }
                                }
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar9 = aVar15.f32525a;
                            if (fVar9 != null) {
                                fVar9.q9(arrayList2);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i19 = 1;
        this.f32512l = registerForActivityResult(new h(), new f.b(this) { // from class: i20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactActivity f87155b;

            {
                this.f87155b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                Bundle extras;
                Bundle extras2;
                Parcelable parcelable;
                l20.p pVar;
                String str;
                Serializable serializableExtra;
                l20.k kVar;
                int i110;
                Serializable serializableExtra2;
                int i24 = i19;
                int i25 = 0;
                int i26 = -1;
                Boolean boolValueOf = null;
                boolValueOf = null;
                EditContactActivity editContactActivity = this.f87155b;
                switch (i24) {
                    case 0:
                        f.a aVar2 = (f.a) obj;
                        EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                        aVar2.getClass();
                        Intent intent = aVar2.f67586b;
                        if (aVar2.f67585a == -1) {
                            if (intent == null || (extras2 = intent.getExtras()) == null) {
                                aVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) extras2.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable2 = extras2.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable2 instanceof l20.a)) {
                                        parcelable2 = null;
                                    }
                                    parcelable = (l20.a) parcelable2;
                                }
                                aVar = (l20.a) parcelable;
                            }
                            if (intent != null && (extras = intent.getExtras()) != null) {
                                boolValueOf = Boolean.valueOf(extras.getBoolean("IS_CONTACT_UPDATED", true));
                            }
                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.FALSE) || aVar == null) {
                                return;
                            }
                            editContactActivity.da().z4(aVar, new e0(editContactActivity));
                            editContactActivity.f32510j = true;
                            editContactActivity.da().y4();
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar4 = (f.a) obj;
                        EditContactActivity.a aVar5 = EditContactActivity.f32500n;
                        aVar4.getClass();
                        Intent intent2 = aVar4.f67586b;
                        if (aVar4.f67585a == -1) {
                            String stringExtra = intent2 != null ? intent2.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra2 = intent2 != null ? intent2.getStringExtra("EXTRA_RESULT") : null;
                            String stringExtra3 = intent2 != null ? intent2.getStringExtra("RESULT_PHONE_UUID") : null;
                            Boolean boolValueOf2 = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("RESULT_PHONE_ISVALID", true)) : null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent2.getSerializableExtra("EXTRA_LABEL", l20.p.class);
                                } else {
                                    Serializable serializableExtra3 = intent2.getSerializableExtra("EXTRA_LABEL");
                                    if (!(serializableExtra3 instanceof l20.p)) {
                                        serializableExtra3 = null;
                                    }
                                    serializableExtra = (l20.p) serializableExtra3;
                                }
                                pVar = (l20.p) serializableExtra;
                            } else {
                                pVar = null;
                            }
                            if (stringExtra2 == null || d53.w.J(stringExtra2)) {
                                if (stringExtra != null) {
                                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar6 = editContactActivity.f32506f;
                                    if (aVar6 == null) {
                                        p005kotlin.jvm.internal.s.m("contactAdapter");
                                        throw null;
                                    }
                                    for (com.garmin.android.apps.connectmobile.contacts.a aVar7 : aVar6.f32526b) {
                                        com.garmin.android.apps.connectmobile.contacts.a.f fVar = aVar7 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) aVar7 : null;
                                        if (p005kotlin.jvm.internal.s.g(fVar != null ? fVar.f32357b : null, stringExtra)) {
                                            i26 = i25;
                                            aVar6.u(i26);
                                            return;
                                        }
                                        i25++;
                                    }
                                    aVar6.u(i26);
                                    return;
                                }
                                return;
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a aVar8 = editContactActivity.f32506f;
                            if (aVar8 == null) {
                                p005kotlin.jvm.internal.s.m("contactAdapter");
                                throw null;
                            }
                            str = stringExtra != null ? stringExtra : "";
                            ArrayList arrayList = aVar8.f32526b;
                            Iterator it = arrayList.iterator();
                            int i27 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    com.garmin.android.apps.connectmobile.contacts.a aVar9 = (com.garmin.android.apps.connectmobile.contacts.a) it.next();
                                    com.garmin.android.apps.connectmobile.contacts.a.f fVar2 = aVar9 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) aVar9 : null;
                                    if (!p005kotlin.jvm.internal.s.g(fVar2 != null ? fVar2.f32357b : null, str)) {
                                        i27++;
                                    }
                                } else {
                                    i27 = -1;
                                }
                            }
                            if (i27 != -1) {
                                Object obj2 = arrayList.get(i27);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar3 = obj2 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj2 : null;
                                if (fVar3 != null) {
                                    fVar3.f32357b = stringExtra2;
                                }
                                Object obj3 = arrayList.get(i27);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar4 = obj3 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj3 : null;
                                if (fVar4 != null) {
                                    fVar4.f32372q = boolValueOf2;
                                }
                                Object obj4 = arrayList.get(i27);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar5 = obj4 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj4 : null;
                                if (fVar5 != null) {
                                    fVar5.f32366k = stringExtra3;
                                }
                                if (pVar != null) {
                                    Object obj5 = arrayList.get(i27);
                                    com.garmin.android.apps.connectmobile.contacts.a.f fVar6 = obj5 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj5 : null;
                                    if (fVar6 != null) {
                                        fVar6.f32358c = pVar;
                                    }
                                }
                                aVar8.notifyItemChanged(i27);
                            } else {
                                int i28 = aVar8.f32528d;
                                int i29 = i28 + 1;
                                boolean zBooleanValue = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
                                if (i29 != -1) {
                                    aVar8.f32528d++;
                                    if (pVar == null) {
                                        Object obj6 = arrayList.get(i28);
                                        com.garmin.android.apps.connectmobile.contacts.a.f fVar7 = obj6 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj6 : null;
                                        l20.p pVar2 = fVar7 != null ? fVar7.f32358c : null;
                                        l20.i.a aVar10 = l20.i.f109004a;
                                        l20.p[] pVarArrValues = l20.p.values();
                                        aVar10.getClass();
                                        pVarArrValues.getClass();
                                        int iM = p13.u.M(pVarArrValues, pVar2);
                                        pVar = (iM < 0 || iM >= pVarArrValues.length - 1) ? pVarArrValues[0] : pVarArrValues[iM + 1];
                                    }
                                    aVar8.r(i29, new com.garmin.android.apps.connectmobile.contacts.a.f(null, stringExtra2, pVar, false, false, false, false, false, zBooleanValue, null, stringExtra3, null, false, null, null, false, null, false, arrayList.size() + 1, null, false, 1309433, null));
                                    if (aVar8.f32528d >= aVar8.f32527c) {
                                        aVar8.x(i28 + 2);
                                    }
                                }
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar8 = aVar8.f32525a;
                            if (fVar8 != null) {
                                fVar8.q9(arrayList);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f.a aVar11 = (f.a) obj;
                        EditContactActivity.a aVar12 = EditContactActivity.f32500n;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1) {
                            String stringExtra4 = intent3 != null ? intent3.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra5 = intent3 != null ? intent3.getStringExtra("EXTRA_RESULT") : null;
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra2 = intent3.getSerializableExtra("EXTRA_LABEL", l20.k.class);
                                } else {
                                    Serializable serializableExtra4 = intent3.getSerializableExtra("EXTRA_LABEL");
                                    if (!(serializableExtra4 instanceof l20.k)) {
                                        serializableExtra4 = null;
                                    }
                                    serializableExtra2 = (l20.k) serializableExtra4;
                                }
                                kVar = (l20.k) serializableExtra2;
                            } else {
                                kVar = null;
                            }
                            if (stringExtra5 == null || d53.w.J(stringExtra5)) {
                                if (stringExtra4 != null) {
                                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar13 = editContactActivity.f32506f;
                                    if (aVar13 == null) {
                                        p005kotlin.jvm.internal.s.m("contactAdapter");
                                        throw null;
                                    }
                                    for (com.garmin.android.apps.connectmobile.contacts.a aVar14 : aVar13.f32526b) {
                                        com.garmin.android.apps.connectmobile.contacts.a.c cVar = aVar14 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) aVar14 : null;
                                        if (p005kotlin.jvm.internal.s.g(cVar != null ? cVar.f32335b : null, stringExtra4)) {
                                            i26 = i25;
                                            aVar13.u(i26);
                                            return;
                                        }
                                        i25++;
                                    }
                                    aVar13.u(i26);
                                    return;
                                }
                                return;
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a aVar15 = editContactActivity.f32506f;
                            if (aVar15 == null) {
                                p005kotlin.jvm.internal.s.m("contactAdapter");
                                throw null;
                            }
                            str = stringExtra4 != null ? stringExtra4 : "";
                            ArrayList arrayList2 = aVar15.f32526b;
                            Iterator it3 = arrayList2.iterator();
                            int i30 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    com.garmin.android.apps.connectmobile.contacts.a aVar16 = (com.garmin.android.apps.connectmobile.contacts.a) it3.next();
                                    com.garmin.android.apps.connectmobile.contacts.a.c cVar2 = aVar16 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) aVar16 : null;
                                    if (!p005kotlin.jvm.internal.s.g(cVar2 != null ? cVar2.f32335b : null, str)) {
                                        i30++;
                                    }
                                } else {
                                    i30 = -1;
                                }
                            }
                            if (i30 != -1) {
                                Object obj7 = arrayList2.get(i30);
                                com.garmin.android.apps.connectmobile.contacts.a.c cVar3 = obj7 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj7 : null;
                                if (cVar3 != null) {
                                    cVar3.f32335b = stringExtra5;
                                }
                                if (kVar != null) {
                                    Object obj8 = arrayList2.get(i30);
                                    com.garmin.android.apps.connectmobile.contacts.a.c cVar4 = obj8 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj8 : null;
                                    if (cVar4 != null) {
                                        cVar4.f32336c = kVar;
                                    }
                                }
                                aVar15.notifyItemChanged(i30);
                            } else {
                                int i34 = aVar15.f32528d;
                                if (arrayList2 == null || !arrayList2.isEmpty()) {
                                    Iterator it4 = arrayList2.iterator();
                                    i110 = 0;
                                    while (it4.hasNext()) {
                                        if ((((com.garmin.android.apps.connectmobile.contacts.a) it4.next()) instanceof com.garmin.android.apps.connectmobile.contacts.a.b) && (i110 = i110 + 1) < 0) {
                                            p13.x.p();
                                            throw null;
                                        }
                                    }
                                } else {
                                    i110 = 0;
                                }
                                int i35 = aVar15.f32529e;
                                int i36 = i34 + i110 + i35;
                                int i37 = i36 + 1;
                                if (i37 != -1) {
                                    aVar15.f32529e = i35 + 1;
                                    if (kVar == null) {
                                        Object obj9 = arrayList2.get(i36);
                                        com.garmin.android.apps.connectmobile.contacts.a.c cVar5 = obj9 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj9 : null;
                                        l20.k kVar2 = cVar5 != null ? cVar5.f32336c : null;
                                        l20.i.a aVar17 = l20.i.f109004a;
                                        l20.k[] kVarArrValues = l20.k.values();
                                        aVar17.getClass();
                                        kVarArrValues.getClass();
                                        int iM2 = p13.u.M(kVarArrValues, kVar2);
                                        kVar = (iM2 < 0 || iM2 >= kVarArrValues.length - 1) ? kVarArrValues[0] : kVarArrValues[iM2 + 1];
                                    }
                                    aVar15.r(i37, new com.garmin.android.apps.connectmobile.contacts.a.c(null, stringExtra5, kVar, false, arrayList2.size() + 1, false, false, false, false, false, null, null, false, null, 8169, null));
                                    if (aVar15.f32529e >= aVar15.f32527c) {
                                        aVar15.x(i36 + 2);
                                    }
                                }
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar9 = aVar15.f32525a;
                            if (fVar9 != null) {
                                fVar9.q9(arrayList2);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        final int i24 = 2;
        this.f32513m = registerForActivityResult(new h(), new f.b(this) { // from class: i20.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactActivity f87155b;

            {
                this.f87155b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                l20.a aVar;
                Bundle extras;
                Bundle extras2;
                Parcelable parcelable;
                l20.p pVar;
                String str;
                Serializable serializableExtra;
                l20.k kVar;
                int i110;
                Serializable serializableExtra2;
                int i25 = i24;
                int i26 = 0;
                int i27 = -1;
                Boolean boolValueOf = null;
                boolValueOf = null;
                EditContactActivity editContactActivity = this.f87155b;
                switch (i25) {
                    case 0:
                        f.a aVar2 = (f.a) obj;
                        EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                        aVar2.getClass();
                        Intent intent = aVar2.f67586b;
                        if (aVar2.f67585a == -1) {
                            if (intent == null || (extras2 = intent.getExtras()) == null) {
                                aVar = null;
                            } else {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) extras2.getParcelable("RESULT_CONTACT_DTO", l20.a.class);
                                } else {
                                    Parcelable parcelable2 = extras2.getParcelable("RESULT_CONTACT_DTO");
                                    if (!(parcelable2 instanceof l20.a)) {
                                        parcelable2 = null;
                                    }
                                    parcelable = (l20.a) parcelable2;
                                }
                                aVar = (l20.a) parcelable;
                            }
                            if (intent != null && (extras = intent.getExtras()) != null) {
                                boolValueOf = Boolean.valueOf(extras.getBoolean("IS_CONTACT_UPDATED", true));
                            }
                            if (p005kotlin.jvm.internal.s.g(boolValueOf, Boolean.FALSE) || aVar == null) {
                                return;
                            }
                            editContactActivity.da().z4(aVar, new e0(editContactActivity));
                            editContactActivity.f32510j = true;
                            editContactActivity.da().y4();
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar4 = (f.a) obj;
                        EditContactActivity.a aVar5 = EditContactActivity.f32500n;
                        aVar4.getClass();
                        Intent intent2 = aVar4.f67586b;
                        if (aVar4.f67585a == -1) {
                            String stringExtra = intent2 != null ? intent2.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra2 = intent2 != null ? intent2.getStringExtra("EXTRA_RESULT") : null;
                            String stringExtra3 = intent2 != null ? intent2.getStringExtra("RESULT_PHONE_UUID") : null;
                            Boolean boolValueOf2 = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra("RESULT_PHONE_ISVALID", true)) : null;
                            if (intent2 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra = intent2.getSerializableExtra("EXTRA_LABEL", l20.p.class);
                                } else {
                                    Serializable serializableExtra3 = intent2.getSerializableExtra("EXTRA_LABEL");
                                    if (!(serializableExtra3 instanceof l20.p)) {
                                        serializableExtra3 = null;
                                    }
                                    serializableExtra = (l20.p) serializableExtra3;
                                }
                                pVar = (l20.p) serializableExtra;
                            } else {
                                pVar = null;
                            }
                            if (stringExtra2 == null || d53.w.J(stringExtra2)) {
                                if (stringExtra != null) {
                                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar6 = editContactActivity.f32506f;
                                    if (aVar6 == null) {
                                        p005kotlin.jvm.internal.s.m("contactAdapter");
                                        throw null;
                                    }
                                    for (com.garmin.android.apps.connectmobile.contacts.a aVar7 : aVar6.f32526b) {
                                        com.garmin.android.apps.connectmobile.contacts.a.f fVar = aVar7 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) aVar7 : null;
                                        if (p005kotlin.jvm.internal.s.g(fVar != null ? fVar.f32357b : null, stringExtra)) {
                                            i27 = i26;
                                            aVar6.u(i27);
                                            return;
                                        }
                                        i26++;
                                    }
                                    aVar6.u(i27);
                                    return;
                                }
                                return;
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a aVar8 = editContactActivity.f32506f;
                            if (aVar8 == null) {
                                p005kotlin.jvm.internal.s.m("contactAdapter");
                                throw null;
                            }
                            str = stringExtra != null ? stringExtra : "";
                            ArrayList arrayList = aVar8.f32526b;
                            Iterator it = arrayList.iterator();
                            int i28 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    com.garmin.android.apps.connectmobile.contacts.a aVar9 = (com.garmin.android.apps.connectmobile.contacts.a) it.next();
                                    com.garmin.android.apps.connectmobile.contacts.a.f fVar2 = aVar9 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) aVar9 : null;
                                    if (!p005kotlin.jvm.internal.s.g(fVar2 != null ? fVar2.f32357b : null, str)) {
                                        i28++;
                                    }
                                } else {
                                    i28 = -1;
                                }
                            }
                            if (i28 != -1) {
                                Object obj2 = arrayList.get(i28);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar3 = obj2 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj2 : null;
                                if (fVar3 != null) {
                                    fVar3.f32357b = stringExtra2;
                                }
                                Object obj3 = arrayList.get(i28);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar4 = obj3 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj3 : null;
                                if (fVar4 != null) {
                                    fVar4.f32372q = boolValueOf2;
                                }
                                Object obj4 = arrayList.get(i28);
                                com.garmin.android.apps.connectmobile.contacts.a.f fVar5 = obj4 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj4 : null;
                                if (fVar5 != null) {
                                    fVar5.f32366k = stringExtra3;
                                }
                                if (pVar != null) {
                                    Object obj5 = arrayList.get(i28);
                                    com.garmin.android.apps.connectmobile.contacts.a.f fVar6 = obj5 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj5 : null;
                                    if (fVar6 != null) {
                                        fVar6.f32358c = pVar;
                                    }
                                }
                                aVar8.notifyItemChanged(i28);
                            } else {
                                int i29 = aVar8.f32528d;
                                int i210 = i29 + 1;
                                boolean zBooleanValue = boolValueOf2 != null ? boolValueOf2.booleanValue() : false;
                                if (i210 != -1) {
                                    aVar8.f32528d++;
                                    if (pVar == null) {
                                        Object obj6 = arrayList.get(i29);
                                        com.garmin.android.apps.connectmobile.contacts.a.f fVar7 = obj6 instanceof com.garmin.android.apps.connectmobile.contacts.a.f ? (com.garmin.android.apps.connectmobile.contacts.a.f) obj6 : null;
                                        l20.p pVar2 = fVar7 != null ? fVar7.f32358c : null;
                                        l20.i.a aVar10 = l20.i.f109004a;
                                        l20.p[] pVarArrValues = l20.p.values();
                                        aVar10.getClass();
                                        pVarArrValues.getClass();
                                        int iM = p13.u.M(pVarArrValues, pVar2);
                                        pVar = (iM < 0 || iM >= pVarArrValues.length - 1) ? pVarArrValues[0] : pVarArrValues[iM + 1];
                                    }
                                    aVar8.r(i210, new com.garmin.android.apps.connectmobile.contacts.a.f(null, stringExtra2, pVar, false, false, false, false, false, zBooleanValue, null, stringExtra3, null, false, null, null, false, null, false, arrayList.size() + 1, null, false, 1309433, null));
                                    if (aVar8.f32528d >= aVar8.f32527c) {
                                        aVar8.x(i29 + 2);
                                    }
                                }
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar8 = aVar8.f32525a;
                            if (fVar8 != null) {
                                fVar8.q9(arrayList);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f.a aVar11 = (f.a) obj;
                        EditContactActivity.a aVar12 = EditContactActivity.f32500n;
                        aVar11.getClass();
                        Intent intent3 = aVar11.f67586b;
                        if (aVar11.f67585a == -1) {
                            String stringExtra4 = intent3 != null ? intent3.getStringExtra("EXTRA_PHONE_NUMBER_OR_EMAIL") : null;
                            String stringExtra5 = intent3 != null ? intent3.getStringExtra("EXTRA_RESULT") : null;
                            if (intent3 != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    serializableExtra2 = intent3.getSerializableExtra("EXTRA_LABEL", l20.k.class);
                                } else {
                                    Serializable serializableExtra4 = intent3.getSerializableExtra("EXTRA_LABEL");
                                    if (!(serializableExtra4 instanceof l20.k)) {
                                        serializableExtra4 = null;
                                    }
                                    serializableExtra2 = (l20.k) serializableExtra4;
                                }
                                kVar = (l20.k) serializableExtra2;
                            } else {
                                kVar = null;
                            }
                            if (stringExtra5 == null || d53.w.J(stringExtra5)) {
                                if (stringExtra4 != null) {
                                    com.garmin.android.apps.connectmobile.contacts.edit.a aVar13 = editContactActivity.f32506f;
                                    if (aVar13 == null) {
                                        p005kotlin.jvm.internal.s.m("contactAdapter");
                                        throw null;
                                    }
                                    for (com.garmin.android.apps.connectmobile.contacts.a aVar14 : aVar13.f32526b) {
                                        com.garmin.android.apps.connectmobile.contacts.a.c cVar = aVar14 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) aVar14 : null;
                                        if (p005kotlin.jvm.internal.s.g(cVar != null ? cVar.f32335b : null, stringExtra4)) {
                                            i27 = i26;
                                            aVar13.u(i27);
                                            return;
                                        }
                                        i26++;
                                    }
                                    aVar13.u(i27);
                                    return;
                                }
                                return;
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a aVar15 = editContactActivity.f32506f;
                            if (aVar15 == null) {
                                p005kotlin.jvm.internal.s.m("contactAdapter");
                                throw null;
                            }
                            str = stringExtra4 != null ? stringExtra4 : "";
                            ArrayList arrayList2 = aVar15.f32526b;
                            Iterator it3 = arrayList2.iterator();
                            int i30 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    com.garmin.android.apps.connectmobile.contacts.a aVar16 = (com.garmin.android.apps.connectmobile.contacts.a) it3.next();
                                    com.garmin.android.apps.connectmobile.contacts.a.c cVar2 = aVar16 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) aVar16 : null;
                                    if (!p005kotlin.jvm.internal.s.g(cVar2 != null ? cVar2.f32335b : null, str)) {
                                        i30++;
                                    }
                                } else {
                                    i30 = -1;
                                }
                            }
                            if (i30 != -1) {
                                Object obj7 = arrayList2.get(i30);
                                com.garmin.android.apps.connectmobile.contacts.a.c cVar3 = obj7 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj7 : null;
                                if (cVar3 != null) {
                                    cVar3.f32335b = stringExtra5;
                                }
                                if (kVar != null) {
                                    Object obj8 = arrayList2.get(i30);
                                    com.garmin.android.apps.connectmobile.contacts.a.c cVar4 = obj8 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj8 : null;
                                    if (cVar4 != null) {
                                        cVar4.f32336c = kVar;
                                    }
                                }
                                aVar15.notifyItemChanged(i30);
                            } else {
                                int i34 = aVar15.f32528d;
                                if (arrayList2 == null || !arrayList2.isEmpty()) {
                                    Iterator it4 = arrayList2.iterator();
                                    i110 = 0;
                                    while (it4.hasNext()) {
                                        if ((((com.garmin.android.apps.connectmobile.contacts.a) it4.next()) instanceof com.garmin.android.apps.connectmobile.contacts.a.b) && (i110 = i110 + 1) < 0) {
                                            p13.x.p();
                                            throw null;
                                        }
                                    }
                                } else {
                                    i110 = 0;
                                }
                                int i35 = aVar15.f32529e;
                                int i36 = i34 + i110 + i35;
                                int i37 = i36 + 1;
                                if (i37 != -1) {
                                    aVar15.f32529e = i35 + 1;
                                    if (kVar == null) {
                                        Object obj9 = arrayList2.get(i36);
                                        com.garmin.android.apps.connectmobile.contacts.a.c cVar5 = obj9 instanceof com.garmin.android.apps.connectmobile.contacts.a.c ? (com.garmin.android.apps.connectmobile.contacts.a.c) obj9 : null;
                                        l20.k kVar2 = cVar5 != null ? cVar5.f32336c : null;
                                        l20.i.a aVar17 = l20.i.f109004a;
                                        l20.k[] kVarArrValues = l20.k.values();
                                        aVar17.getClass();
                                        kVarArrValues.getClass();
                                        int iM2 = p13.u.M(kVarArrValues, kVar2);
                                        kVar = (iM2 < 0 || iM2 >= kVarArrValues.length - 1) ? kVarArrValues[0] : kVarArrValues[iM2 + 1];
                                    }
                                    aVar15.r(i37, new com.garmin.android.apps.connectmobile.contacts.a.c(null, stringExtra5, kVar, false, arrayList2.size() + 1, false, false, false, false, false, null, null, false, null, 8169, null));
                                    if (aVar15.f32529e >= aVar15.f32527c) {
                                        aVar15.x(i36 + 2);
                                    }
                                }
                            }
                            com.garmin.android.apps.connectmobile.contacts.edit.a.f fVar9 = aVar15.f32525a;
                            if (fVar9 != null) {
                                fVar9.q9(arrayList2);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.edit.a.f
    public final void A8(com.garmin.android.apps.connectmobile.contacts.a.c cVar) {
        k kVar;
        EditContactMethodActivity.a aVar = EditContactMethodActivity.f32519d;
        l20.a aVar2 = da().f87206e;
        String str = cVar != null ? cVar.f32335b : null;
        if (cVar == null || (kVar = cVar.f32336c) == null) {
            k.f109008d.getClass();
            kVar = k.HOME;
        }
        this.f32513m.a(EditContactMethodActivity.a.b(aVar, this, aVar2, str, null, kVar, null, 96), null);
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.edit.a.f
    public final void B1(i20.h hVar) {
        q1.b bVar = q1.f41066b;
        String string = getString(R.string.lbl_remove_phone_number_question);
        string.getClass();
        String string2 = getString(R.string.lbl_remove_phone_number_message);
        string2.getClass();
        hy.d dVar = new hy.d(hVar, 1);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.lbl_remove, R.string.lbl_cancel, dVar);
        q1VarC.setCancelable(false);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.edit.a.f
    public final void W8(com.garmin.android.apps.connectmobile.contacts.a.f fVar) {
        l20.p pVar;
        EditContactMethodActivity.a aVar = EditContactMethodActivity.f32519d;
        l20.a aVar2 = da().f87206e;
        String str = fVar != null ? fVar.f32357b : null;
        Boolean bool = fVar != null ? fVar.f32365j : null;
        if (fVar == null || (pVar = fVar.f32358c) == null) {
            l20.p.f109036d.getClass();
            pVar = l20.p.MOBILE;
        }
        this.f32512l.a(EditContactMethodActivity.a.b(aVar, this, aVar2, str, bool, pVar, fVar != null ? Boolean.valueOf(fVar.f32376u) : null, 64), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    public final void ca(l20.a aVar) {
        ?? arrayList;
        List<l20.c> listK;
        List<l20.c> listK2 = da().f87205d.k();
        if (aVar == null || (listK = aVar.k()) == null) {
            arrayList = j0.f134944a;
        } else {
            arrayList = new ArrayList();
            for (Object obj : listK) {
                l20.c cVar = (l20.c) obj;
                if (cVar.getContactInfoPk() != null) {
                    if (listK2 == null || !listK2.isEmpty()) {
                        Iterator it = listK2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                l20.c cVar2 = (l20.c) it.next();
                                if (!s.g(cVar.getContactInfoPk(), cVar2.getContactInfoPk()) || s.g(cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                                }
                            }
                        }
                    }
                }
                if (cVar.G() || cVar.g0()) {
                    arrayList.add(obj);
                }
            }
        }
        this.f32509i = arrayList;
        if (aVar == null || arrayList.isEmpty()) {
            da().y4();
            return;
        }
        ?? r14 = this.f32509i;
        if (r14 == 0 || !r14.isEmpty()) {
            Iterator it3 = r14.iterator();
            while (it3.hasNext()) {
                if (((l20.c) it3.next()).G()) {
                    ?? r15 = this.f32509i;
                    if (r15 != 0 && r15.isEmpty()) {
                        break;
                    }
                    Iterator it4 = r15.iterator();
                    while (it4.hasNext()) {
                        if (((l20.c) it4.next()).g0()) {
                            String string = getResources().getString(R.string.lbl_dont_send_request_message_format, aVar.j(), x.d(getString(R.string.lbl_dont_send_assistance_contact_fragment), StringUtils.SPACE, getString(R.string.lbl_and), StringUtils.SPACE, getString(R.string.lbl_dont_send_livetrack_combined_fragment)));
                            string.getClass();
                            String string2 = getResources().getString(R.string.lbl_contact_must_accept_request_message_format, x.d(getString(R.string.lbl_contact_must_accept_request_emergency_contact_fragment), StringUtils.SPACE, getString(R.string.lbl_and), StringUtils.SPACE, getString(R.string.lbl_contact_must_accept_request_livetrack_fragment)));
                            string2.getClass();
                            fa(string2, string);
                            return;
                        }
                    }
                    break;
                }
            }
        }
        ?? r16 = this.f32509i;
        if (r16 == 0 || !r16.isEmpty()) {
            Iterator it5 = r16.iterator();
            while (it5.hasNext()) {
                if (((l20.c) it5.next()).G()) {
                    String string3 = getResources().getString(R.string.lbl_contact_must_accept_request_message_format, getString(R.string.lbl_contact_must_accept_request_emergency_contact_fragment));
                    string3.getClass();
                    String string4 = getResources().getString(R.string.lbl_dont_send_request_message_format, aVar.j(), getString(R.string.lbl_dont_send_emergency_contact_fragment));
                    string4.getClass();
                    fa(string3, string4);
                    return;
                }
            }
        }
        ?? r17 = this.f32509i;
        if (r17 == 0 || !r17.isEmpty()) {
            Iterator it6 = r17.iterator();
            while (it6.hasNext()) {
                if (((l20.c) it6.next()).g0()) {
                    String string5 = getResources().getString(R.string.lbl_contact_must_accept_request_message_format, getString(R.string.lbl_contact_must_accept_request_livetrack_fragment));
                    string5.getClass();
                    String string6 = getResources().getString(R.string.lbl_dont_send_request_message_format, aVar.j(), getString(R.string.lbl_dont_send_livetrack_combined_fragment));
                    string6.getClass();
                    fa(string5, string6);
                    return;
                }
            }
        }
        da().y4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i20.t da() {
        return (i20.t) this.f32504d.getValue();
    }

    public final void ea(Intent intent) {
        Parcelable parcelable;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("USER_ID");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("extra_contact_key", l20.a.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("extra_contact_key");
                if (!(parcelableExtra instanceof l20.a)) {
                    parcelableExtra = null;
                }
                parcelable = (l20.a) parcelableExtra;
            }
            l20.a aVar = (l20.a) parcelable;
            if (string == null && aVar == null) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "EditContactActivity", "No user ID or contact DTO received! Could not display activity!");
                finish();
                return;
            }
            if (string != null) {
                i20.t tVarDa = da();
                tVarDa.getClass();
                ge1.b.T(v1.a(tVarDa), null, null, new w(tVarDa, string, null), 3);
            } else if (aVar != null) {
                i20.t tVarDa2 = da();
                tVarDa2.getClass();
                tVarDa2.f87205d = aVar;
                y0<g3<l20.a>> y0Var = tVarDa2.f87211j;
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(aVar));
            }
        }
    }

    public final void fa(String str, String str2) {
        f.d(f.f23050a, this, getString(R.string.send_new_request_alert_title), str, new o13.p(getString(R.string.send_request), new l(this, 20)), new o13.p(getString(R.string.not_now_lbl), new i20.b(0, this, str2)), new o13.p(getString(R.string.lbl_cancel), new o(11)), false, 64).show();
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.edit.a.f
    public final void i3() {
        if (ge1.b.Q(da().f87206e)) {
            q1.b bVar = q1.f41066b;
            String string = getString(R.string.contact_management_title_delete_contact);
            string.getClass();
            String string2 = getString(R.string.msg_delete_assistance_calling_contact);
            string2.getClass();
            final int i14 = 0;
            q1.a aVar = new q1.a(this) { // from class: i20.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ EditContactActivity f87149b;

                {
                    this.f87149b = this;
                }

                @Override // com.garmin.android.apps.connectmobile.q1.a
                public final void g(boolean z14) {
                    int i15 = i14;
                    EditContactActivity editContactActivity = this.f87149b;
                    switch (i15) {
                        case 0:
                            EditContactActivity.a aVar2 = EditContactActivity.f32500n;
                            if (z14) {
                                t tVarDa = editContactActivity.da();
                                if (!TextUtils.isEmpty(tVarDa.f87206e.getContactId())) {
                                    ge1.b.T(v1.a(tVarDa), null, null, new u(tVarDa, null), 3);
                                }
                            }
                            break;
                        default:
                            EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                            if (z14) {
                                t tVarDa2 = editContactActivity.da();
                                if (!TextUtils.isEmpty(tVarDa2.f87206e.getContactId())) {
                                    ge1.b.T(v1.a(tVarDa2), null, null, new u(tVarDa2, null), 3);
                                }
                            }
                            break;
                    }
                }
            };
            bVar.getClass();
            q1 q1VarC = q1.b.c(string, string2, R.string.lbl_delete, R.string.lbl_cancel, aVar);
            q1VarC.setCancelable(false);
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
            return;
        }
        String strJ = da().f87206e.j();
        q1.b bVar2 = q1.f41066b;
        String string3 = getString(R.string.contact_management_title_delete_contact);
        string3.getClass();
        String string4 = getString(R.string.delete_contact_message, strJ);
        string4.getClass();
        final int i15 = 1;
        q1.a aVar2 = new q1.a(this) { // from class: i20.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditContactActivity f87149b;

            {
                this.f87149b = this;
            }

            @Override // com.garmin.android.apps.connectmobile.q1.a
            public final void g(boolean z14) {
                int i16 = i15;
                EditContactActivity editContactActivity = this.f87149b;
                switch (i16) {
                    case 0:
                        EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                        if (z14) {
                            t tVarDa = editContactActivity.da();
                            if (!TextUtils.isEmpty(tVarDa.f87206e.getContactId())) {
                                ge1.b.T(v1.a(tVarDa), null, null, new u(tVarDa, null), 3);
                            }
                        }
                        break;
                    default:
                        EditContactActivity.a aVar4 = EditContactActivity.f32500n;
                        if (z14) {
                            t tVarDa2 = editContactActivity.da();
                            if (!TextUtils.isEmpty(tVarDa2.f87206e.getContactId())) {
                                ge1.b.T(v1.a(tVarDa2), null, null, new u(tVarDa2, null), 3);
                            }
                        }
                        break;
                }
            }
        };
        bVar2.getClass();
        q1 q1VarC2 = q1.b.c(string3, string4, R.string.lbl_delete, R.string.lbl_cancel, aVar2);
        q1VarC2.setCancelable(false);
        v supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        q1VarC2.v6(supportFragmentManager2, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.edit.a.f
    public final void m9(i20.h hVar) {
        q1.b bVar = q1.f41066b;
        String string = getString(R.string.lbl_delete_phone_number_question);
        string.getClass();
        String string2 = getString(R.string.msg_delete_emergency_calling_phone_number);
        string2.getClass();
        hy.d dVar = new hy.d(hVar, 2);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.lbl_delete, R.string.lbl_cancel, dVar);
        q1VarC.setCancelable(false);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        q1VarC.v6(supportFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_layout);
        da().f87212k.f(this, this.f32502b);
        Intent intent = getIntent();
        intent.getClass();
        ea(intent);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.save_menu, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_menu_item);
        this.f32507g = menuItemFindItem;
        if (menuItemFindItem == null) {
            return true;
        }
        menuItemFindItem.setEnabled(false);
        return true;
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        ea(intent);
        setIntent(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        if (menuItem.getItemId() != R.id.save_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca(da().f87206e);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x039f  */
    @Override // com.garmin.android.apps.connectmobile.contacts.edit.a.f
    public final void q9(List<? extends com.garmin.android.apps.connectmobile.contacts.a> list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String lastName;
        Object next;
        Object next2;
        list.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "EditContactActivity", "onContactUpdated()");
        i20.t tVarDa = da();
        tVarDa.getClass();
        for (com.garmin.android.apps.connectmobile.contacts.a aVar2 : list) {
            if (aVar2 instanceof com.garmin.android.apps.connectmobile.contacts.a.d) {
                com.garmin.android.apps.connectmobile.contacts.a.d dVar = (com.garmin.android.apps.connectmobile.contacts.a.d) aVar2;
                tVarDa.f87206e = l20.a.g(tVarDa.f87206e, null, d53.w.i0(dVar.f32348a).toString(), d53.w.i0(dVar.f32349b).toString(), null, null, null, null, null, null, 8185);
            } else if (aVar2 instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
                com.garmin.android.apps.connectmobile.contacts.a.f fVar = (com.garmin.android.apps.connectmobile.contacts.a.f) aVar2;
                List<l20.c> listZ = tVarDa.f87206e.z();
                ArrayList<l20.c> arrayList3 = listZ != null ? new ArrayList(listZ) : new ArrayList();
                ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
                for (l20.c cVarB : arrayList3) {
                    int localId = cVarB.getLocalId();
                    int i14 = fVar.f32374s;
                    boolean z14 = fVar.f32368m;
                    if (localId == i14 && !s.g(cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), fVar.f32357b)) {
                        cVarB = l20.c.b(cVarB, null, fVar.f32357b, null, Integer.valueOf(fVar.f32358c.f109040a), null, null, fVar.f32372q, fVar.f32366k, null, Boolean.valueOf(z14), fVar.f32374s, 456428);
                    } else if (s.g(cVarB.getContactInfoPk(), fVar.f32356a)) {
                        int localId2 = cVarB.getLocalId();
                        int i15 = fVar.f32374s;
                        if (localId2 == i15) {
                            cVarB = l20.c.b(cVarB, null, fVar.f32357b, null, Integer.valueOf(fVar.f32358c.f109040a), null, null, fVar.f32372q, fVar.f32366k, null, Boolean.valueOf(z14), i15, 456429);
                        }
                    }
                    arrayList4.add(cVarB);
                }
                ArrayList arrayList5 = new ArrayList(arrayList4);
                if (arrayList5.isEmpty()) {
                    arrayList5.add(new l20.c(null, fVar.f32357b, null, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(fVar.f32358c.f109040a), null, null, null, Boolean.valueOf(fVar.f32364i), null, null, fVar.f32366k, null, null, null, null, null, null, null, fVar.f32374s, 521957, null));
                    break;
                }
                Iterator it = arrayList5.iterator();
                do {
                    if (!it.hasNext()) {
                        arrayList5.add(new l20.c(null, fVar.f32357b, null, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(fVar.f32358c.f109040a), null, null, null, Boolean.valueOf(fVar.f32364i), null, null, fVar.f32366k, null, null, null, null, null, null, null, fVar.f32374s, 521957, null));
                        break;
                    }
                } while (!s.g(((l20.c) it.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), fVar.f32357b));
                tVarDa.f87206e = l20.a.g(tVarDa.f87206e, null, null, null, null, null, null, null, arrayList5, null, 8063);
            } else if (aVar2 instanceof com.garmin.android.apps.connectmobile.contacts.a.c) {
                com.garmin.android.apps.connectmobile.contacts.a.c cVar = (com.garmin.android.apps.connectmobile.contacts.a.c) aVar2;
                List<l20.c> listR = tVarDa.f87206e.r();
                ArrayList<l20.c> arrayList6 = listR != null ? new ArrayList(listR) : new ArrayList();
                ArrayList arrayList7 = new ArrayList(y.r(arrayList6, 10));
                for (l20.c cVarB2 : arrayList6) {
                    if (s.g(cVarB2.getContactInfoPk(), cVar.f32334a)) {
                        int localId3 = cVarB2.getLocalId();
                        int i16 = cVar.f32338e;
                        if (localId3 == i16) {
                            cVarB2 = l20.c.b(cVarB2, null, cVar.f32335b, null, Integer.valueOf(cVar.f32336c.f109012a), null, null, null, null, null, null, i16, 524269);
                        }
                    }
                    arrayList7.add(cVarB2);
                }
                ArrayList arrayList8 = new ArrayList(arrayList7);
                if (arrayList8.isEmpty()) {
                    arrayList8.add(new l20.c(null, cVar.f32335b, null, null, Integer.valueOf(cVar.f32336c.f109012a), null, null, null, Boolean.valueOf(cVar.f32337d), null, null, null, null, null, null, null, null, null, null, cVar.f32338e, 524013, null));
                    break;
                }
                Iterator it3 = arrayList8.iterator();
                do {
                    if (!it3.hasNext()) {
                        arrayList8.add(new l20.c(null, cVar.f32335b, null, null, Integer.valueOf(cVar.f32336c.f109012a), null, null, null, Boolean.valueOf(cVar.f32337d), null, null, null, null, null, null, null, null, null, null, cVar.f32338e, 524013, null));
                        break;
                    }
                } while (!s.g(((l20.c) it3.next()).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar.f32335b));
                tVarDa.f87206e = l20.a.g(tVarDa.f87206e, null, null, null, null, null, null, arrayList8, null, null, 8127);
            } else {
                Objects.toString(aVar2);
            }
        }
        List<l20.c> listZ2 = tVarDa.f87206e.z();
        Object obj = null;
        if (listZ2 != null) {
            ArrayList arrayList9 = new ArrayList();
            for (Object obj2 : listZ2) {
                l20.c cVar2 = (l20.c) obj2;
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    com.garmin.android.apps.connectmobile.contacts.a aVar3 = (com.garmin.android.apps.connectmobile.contacts.a) next2;
                    if ((aVar3 instanceof com.garmin.android.apps.connectmobile.contacts.a.f) && ((com.garmin.android.apps.connectmobile.contacts.a.f) aVar3).f32374s == cVar2.getLocalId()) {
                        break;
                    }
                }
                if (next2 != null) {
                    arrayList9.add(obj2);
                }
            }
            arrayList = arrayList9;
        } else {
            arrayList = null;
        }
        List<l20.c> listR2 = tVarDa.f87206e.r();
        if (listR2 != null) {
            ArrayList arrayList10 = new ArrayList();
            for (Object obj3 : listR2) {
                l20.c cVar3 = (l20.c) obj3;
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                    com.garmin.android.apps.connectmobile.contacts.a aVar4 = (com.garmin.android.apps.connectmobile.contacts.a) next;
                    if ((aVar4 instanceof com.garmin.android.apps.connectmobile.contacts.a.c) && ((com.garmin.android.apps.connectmobile.contacts.a.c) aVar4).f32338e == cVar3.getLocalId()) {
                        break;
                    }
                }
                if (next != null) {
                    arrayList10.add(obj3);
                }
            }
            arrayList2 = arrayList10;
        } else {
            arrayList2 = null;
        }
        l20.a aVarG = l20.a.g(tVarDa.f87206e, null, null, null, null, null, null, arrayList2, arrayList, null, 7999);
        tVarDa.f87206e = aVarG;
        String firstName = aVarG.getFirstName();
        boolean z15 = true;
        if ((firstName == null || !(!d53.w.J(firstName))) && ((lastName = tVarDa.f87206e.getLastName()) == null || !(!d53.w.J(lastName)))) {
            z15 = false;
        } else {
            List<l20.c> listR3 = tVarDa.f87206e.r();
            if (listR3 == null || !(!listR3.isEmpty())) {
                List<l20.c> listZ3 = tVarDa.f87206e.z();
                if (listZ3 != null) {
                    for (Object obj4 : listZ3) {
                        String str = ((l20.c) obj4).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        if (str != null && (!d53.w.J(str))) {
                            obj = obj4;
                            break;
                        }
                    }
                    obj = (l20.c) obj;
                }
                if (obj == null) {
                    z15 = false;
                }
            } else {
                List<l20.c> listR4 = tVarDa.f87206e.r();
                if (listR4 != null) {
                    for (Object obj5 : listR4) {
                        if (!nb2.a.a(((l20.c) obj5).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                            obj = obj5;
                            break;
                        }
                    }
                    obj = (l20.c) obj;
                }
                if (obj != null) {
                    z15 = false;
                }
            }
        }
        MenuItem menuItem = this.f32507g;
        if (menuItem != null) {
            menuItem.setEnabled(z15);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/edit/EditContactActivity$a;", "", "<init>", "()V", "", "EXTRA_CONTACT_KEY", "Ljava/lang/String;", "EXTRA_CONTACT_METHOD_EDIT_IMMEDIATELY", "EXTRA_CREATE_NEW_PHONE_NUMBER", "TAG", "USER_ID", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Activity activity, l20.a aVar2, hl.a aVar3, int i14) {
            l20.a aVar4 = (i14 & 2) != 0 ? new l20.a(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null) : aVar2;
            hl.a aVar5 = (i14 & 4) != 0 ? hl.a.c.f84256b : aVar3;
            aVar.getClass();
            activity.getClass();
            aVar4.getClass();
            aVar5.getClass();
            Intent intent = new Intent(activity, (Class<?>) EditContactActivity.class);
            intent.putExtra("extra_contact_key", aVar4);
            intent.putExtra("GCM_extra_screen_access_role", aVar5);
            return intent;
        }

        private a() {
        }
    }
}
