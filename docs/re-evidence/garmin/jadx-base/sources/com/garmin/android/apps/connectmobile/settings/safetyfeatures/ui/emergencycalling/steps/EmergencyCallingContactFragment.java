package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.steps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import g22.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.d0;
import p13.y;
import vg1.z0;
import vj1.f;
import vj1.i;
import xa2.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/steps/EmergencyCallingContactFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmergencyCallingContactFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f43797a = new w1(s0.f105811a.b(i.class), new b(this), new d(this), new c(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MenuItem f43798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f43799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xj1.c f43800d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/steps/EmergencyCallingContactFragment$a", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements s {
        public a() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.emergency_calling_menu, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
            EmergencyCallingContactFragment emergencyCallingContactFragment = EmergencyCallingContactFragment.this;
            if (menuItemFindItem != null) {
                menuItemFindItem.setEnabled(emergencyCallingContactFragment.v6().f178472v != null);
            } else {
                menuItemFindItem = null;
            }
            emergencyCallingContactFragment.f43798b = menuItemFindItem;
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_done) {
                return false;
            }
            EmergencyCallingContactFragment.this.u6();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43802a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f43802a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43802a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43803a = aVar;
            this.f43804b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43803a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43804b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43805a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f43805a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43805a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v6().f178470r = vj1.c.CONTACT;
        setMenuVisibility(!v6().A);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(v6().A ? R.layout.emergency_calling_contact_wizard : R.layout.emergency_calling_contact, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        wj1.b.a aVar;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        e.k(this, new a(), b0.b.RESUMED);
        l20.a aVar2 = v6().f178472v;
        Button button = null;
        if (aVar2 != null) {
            String contactId = aVar2.getContactId();
            l20.c cVarB = f.b(aVar2);
            aVar = new wj1.b.a(contactId, cVarB != null ? cVarB.getContactInfoPk() : null);
        } else {
            aVar = null;
        }
        this.f43800d = new xj1.c(aVar, new g(this, 6));
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.contacts_list);
        xj1.c cVar = this.f43800d;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("contactsAdapter");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        xj1.c cVar2 = this.f43800d;
        if (cVar2 == null) {
            p005kotlin.jvm.internal.s.m("contactsAdapter");
            throw null;
        }
        ArrayList<l20.a> arrayList = v6().f178476z;
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (l20.a aVar3 : arrayList) {
            aVar3.getClass();
            ArrayList arrayList3 = new ArrayList();
            List<l20.c> listZ = aVar3.z();
            if (listZ != null) {
                for (l20.c cVar3 : listZ) {
                    String contactId2 = aVar3.getContactId();
                    String firstName = aVar3.getFirstName();
                    String str = "";
                    if (firstName == null) {
                        firstName = "";
                    }
                    String lastName = aVar3.getLastName();
                    if (lastName != null) {
                        str = lastName;
                    }
                    arrayList3.add(new wj1.b(contactId2, firstName, str, cVar3));
                }
            }
            d0.v(arrayList2, arrayList3);
        }
        cVar2.t(arrayList2);
        Button button2 = (Button) view2.findViewById(R.id.emergency_calling_next);
        if (button2 != null) {
            button2.setEnabled(v6().f178472v != null);
            button2.setOnClickListener(new z0(this, 23));
            button = button2;
        }
        this.f43799c = button;
    }

    public final void u6() {
        Object next;
        l20.a aVarG;
        ArrayList arrayList;
        xj1.c cVar = this.f43800d;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("contactsAdapter");
            throw null;
        }
        wj1.b.a aVar = cVar.f191162c;
        if (aVar != null) {
            String str = aVar.f185789a;
            Long l14 = aVar.f185790b;
            if (str != null && l14 != null) {
                i iVarV6 = v6();
                long jLongValue = l14.longValue();
                Iterator it = iVarV6.f178476z.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((l20.a) next).getContactId(), str));
                l20.a aVar2 = (l20.a) next;
                if (aVar2 != null) {
                    List<l20.c> listZ = aVar2.z();
                    if (listZ != null) {
                        ArrayList arrayList2 = new ArrayList(y.r(listZ, 10));
                        for (l20.c cVar2 : listZ) {
                            Long contactInfoPk = cVar2.getContactInfoPk();
                            arrayList2.add(l20.c.b(cVar2, null, null, null, null, null, Boolean.valueOf(contactInfoPk != null && contactInfoPk.longValue() == jLongValue), null, null, null, null, 0, 1048511));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    aVarG = l20.a.g(aVar2, null, null, null, null, null, null, null, arrayList, Boolean.TRUE, 6015);
                } else {
                    aVarG = null;
                }
                iVarV6.f178472v = aVarG;
            }
        }
        NavHostFragment.f10124e.getClass();
        NavHostFragment.a.a(this).g(R.id.action_emergency_calling_details, null);
    }

    public final i v6() {
        return (i) this.f43797a.getValue();
    }
}
