package com.garmin.android.apps.connectmobile.contacts.emergency;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.u;
import f20.e0;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k23.l;
import n23.j;
import o13.h;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/c;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/contacts/emergency/b$c;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment implements com.garmin.android.apps.connectmobile.contacts.emergency.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f32630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.contacts.emergency.b f32631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f32632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w1 f32633d = new w1(s0.f105811a.b(com.garmin.android.apps.connectmobile.contacts.emergency.d.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g23.b f32634e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l<Object>[] f32629g = {s0.f105811a.f(new b0(c.class, "showAllContactMethods", "getShowAllContactMethods()Z", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f32628f = new a(null);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32635a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f32635a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.emergency.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0536c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f32636a;

        public C0536c(e23.l lVar) {
            lVar.getClass();
            this.f32636a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32636a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32636a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32637a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f32637a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f32637a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f32638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f32639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f32638a = aVar;
            this.f32639b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f32638a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f32639b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32640a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f32640a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f32640a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        g23.a.f75578a.getClass();
        this.f32634e = new g23.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.safety_feature_contact_picker, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f32634e.setValue(this, f32629g[0], Boolean.valueOf(!u6().f32642a));
        Context context = getContext();
        this.f32632c = context != null ? new e0(context) : null;
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f32630a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView2 = this.f32630a;
        if (recyclerView2 == null) {
            s.m("contactDetailsList");
            throw null;
        }
        recyclerView2.setHasFixedSize(true);
        RecyclerView recyclerView3 = this.f32630a;
        if (recyclerView3 == null) {
            s.m("contactDetailsList");
            throw null;
        }
        recyclerView3.addItemDecoration(new n20.a(getResources().getDimensionPixelSize(R.dimen.spacing_micro)));
        g22.e.g(this, u6().f32646e.j());
        v6();
        u6().f32653l.f(getViewLifecycleOwner(), new C0536c(new iz1.f(this, 5)));
    }

    @Override // com.garmin.android.apps.connectmobile.contacts.emergency.b.c
    public final void q5(com.garmin.android.apps.connectmobile.contacts.a aVar) {
        l20.c cVar;
        l20.c cVar2;
        String str;
        l20.c cVar3 = null;
        if (aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.f) {
            com.garmin.android.apps.connectmobile.contacts.emergency.d dVarU6 = u6();
            com.garmin.android.apps.connectmobile.contacts.a.f fVar = (com.garmin.android.apps.connectmobile.contacts.a.f) aVar;
            List<l20.c> listZ = dVarU6.f32646e.z();
            if (listZ != null) {
                Iterator<T> it = listZ.iterator();
                do {
                    if (!it.hasNext()) {
                        j.s("Collection contains no element matching the predicate.");
                        return;
                    } else {
                        cVar2 = (l20.c) it.next();
                        str = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    }
                } while (!s.g(str != null ? u.v(str, Marker.ANY_NON_NULL_MARKER, "", false) : null, u.v(fVar.f32357b, Marker.ANY_NON_NULL_MARKER, "", false)));
                cVar3 = cVar2;
            }
            if (cVar3 != null) {
                dVarU6.I4(cVar3);
                return;
            }
            a2 a2Var = a2.SAFETY_FEATURES;
            String strM = am.j.m("Warning! The selected phone number ", fVar.f32357b, " is not in the phones list of this contact!");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EmergencyContactViewModel", strM);
            dVarU6.I.j(EmergencyContactSendRequestActivity.b.UNKNOWN);
            return;
        }
        if (!(aVar instanceof com.garmin.android.apps.connectmobile.contacts.a.c)) {
            i2.f36769a.getClass();
            i2.a.f(a2.SAFETY_FEATURES, "EmergencyContactMethodPickerFragment", "item " + aVar + " is not the right ContactDetailsListItem Type!");
            return;
        }
        com.garmin.android.apps.connectmobile.contacts.emergency.d dVarU7 = u6();
        com.garmin.android.apps.connectmobile.contacts.a.c cVar4 = (com.garmin.android.apps.connectmobile.contacts.a.c) aVar;
        List<l20.c> listR = dVarU7.f32646e.r();
        if (listR != null) {
            Iterator<T> it3 = listR.iterator();
            do {
                if (!it3.hasNext()) {
                    j.s("Collection contains no element matching the predicate.");
                    return;
                }
                cVar = (l20.c) it3.next();
            } while (!s.g(cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar4.f32335b));
            cVar3 = cVar;
        }
        if (cVar3 != null) {
            dVarU7.I4(cVar3);
            return;
        }
        a2 a2Var2 = a2.SAFETY_FEATURES;
        String strM2 = am.j.m("Warning! The selected email address ", cVar4.f32335b, " is not in the emails list of this contact!");
        i2.f36769a.getClass();
        i2.a.f(a2Var2, "EmergencyContactViewModel", strM2);
        dVarU7.I.j(EmergencyContactSendRequestActivity.b.UNKNOWN);
    }

    public final com.garmin.android.apps.connectmobile.contacts.emergency.d u6() {
        return (com.garmin.android.apps.connectmobile.contacts.emergency.d) this.f32633d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    public final void v6() {
        String str;
        Integer num;
        boolean z14;
        e0 e0Var;
        boolean zA;
        boolean z15;
        boolean z16;
        Integer num2;
        Boolean isValid;
        boolean zBooleanValue;
        Integer numValueOf = Integer.valueOf(R.string.contact_method_label_dot_request_sent);
        com.garmin.android.apps.connectmobile.contacts.emergency.b bVar = new com.garmin.android.apps.connectmobile.contacts.emergency.b(this);
        this.f32631b = bVar;
        RecyclerView recyclerView = this.f32630a;
        if (recyclerView == null) {
            s.m("contactDetailsList");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        com.garmin.android.apps.connectmobile.contacts.emergency.b bVar2 = this.f32631b;
        if (bVar2 == null) {
            s.m("contactInfoAdapter");
            throw null;
        }
        l20.a aVar = u6().f32646e;
        ArrayList arrayList = new ArrayList();
        List<l20.c> listZ = aVar.z();
        l<?>[] lVarArr = f32629g;
        g23.b bVar3 = this.f32634e;
        if (listZ != null) {
            for (l20.c cVar : listZ) {
                boolean zD = cVar.D();
                if ((((Boolean) bVar3.getValue(this, lVarArr[0])).booleanValue() || !zD) && (str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()) != null) {
                    e0 e0Var2 = this.f32632c;
                    boolean zA2 = e0Var2 != null ? e0Var2.a(str) : true;
                    Boolean isValid2 = cVar.getIsValid();
                    Boolean bool = Boolean.FALSE;
                    if (s.g(isValid2, bool)) {
                        num = null;
                    } else {
                        String str2 = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        int length = str2 != null ? str2.length() : 0;
                        num = null;
                        if (7 <= length && length < 16 && zA2) {
                            z14 = true;
                        }
                        e0Var = this.f32632c;
                        if (e0Var != null) {
                            zA = e0Var.a(str);
                        } else {
                            zA = true;
                        }
                        if (zA || s.g(cVar.getIsValid(), bool)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        Long contactInfoPk = cVar.getContactInfoPk();
                        l20.p pVarU = cVar.u();
                        if (!cVar.Z() || cVar.G()) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        Boolean isEmsValue = cVar.getIsEmsValue();
                        String phoneUUID = cVar.getPhoneUUID();
                        if (cVar.Z()) {
                            num2 = numValueOf;
                        } else {
                            num2 = num;
                        }
                        isValid = cVar.getIsValid();
                        if (isValid != null) {
                            zBooleanValue = isValid.booleanValue();
                        } else {
                            zBooleanValue = true;
                        }
                        arrayList.add(new com.garmin.android.apps.connectmobile.contacts.a.f(contactInfoPk, str, pVarU, z15, false, false, z16, false, z14, isEmsValue, phoneUUID, null, false, null, num2, zBooleanValue, null, false, 0, ge1.b.F(aVar), false, 1521824, null));
                    }
                    z14 = false;
                    e0Var = this.f32632c;
                    if (e0Var != null) {
                        zA = e0Var.a(str);
                    } else {
                        zA = true;
                    }
                    if (zA) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    Long contactInfoPk2 = cVar.getContactInfoPk();
                    l20.p pVarU2 = cVar.u();
                    if (cVar.Z()) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    Boolean isEmsValue2 = cVar.getIsEmsValue();
                    String phoneUUID2 = cVar.getPhoneUUID();
                    if (cVar.Z()) {
                        num2 = numValueOf;
                    } else {
                        num2 = num;
                    }
                    isValid = cVar.getIsValid();
                    if (isValid != null) {
                        zBooleanValue = isValid.booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                    arrayList.add(new com.garmin.android.apps.connectmobile.contacts.a.f(contactInfoPk2, str, pVarU2, z15, false, false, z16, false, z14, isEmsValue2, phoneUUID2, null, false, null, num2, zBooleanValue, null, false, 0, ge1.b.F(aVar), false, 1521824, null));
                }
            }
        }
        List<l20.c> listR = aVar.r();
        if (listR != null) {
            for (l20.c cVar2 : listR) {
                boolean zD2 = cVar2.D();
                if (((Boolean) bVar3.getValue(this, lVarArr[0])).booleanValue() || !zD2) {
                    String str3 = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                    if (str3 != null) {
                        arrayList.add(new com.garmin.android.apps.connectmobile.contacts.a.c(cVar2.getContactInfoPk(), str3, cVar2.m(), !s.g(cVar2.getIsValid(), Boolean.FALSE), 0, false, false, (cVar2.Z() || cVar2.G()) ? false : true, false, false, null, cVar2.Z() ? numValueOf : null, false, ge1.b.F(aVar), 6000, null));
                    }
                }
            }
        }
        ArrayList arrayList2 = bVar2.f32621b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        bVar2.notifyDataSetChanged();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/emergency/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
