package com.garmin.android.apps.connectmobile.contacts.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.q1;
import e23.l;
import g12.f;
import g20.i;
import java.util.List;
import o13.h;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/b;", "Landroidx/fragment/app/Fragment;", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$i;", "Lcom/garmin/android/apps/connectmobile/contacts/details/a$e;", "<init>", "()V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends Fragment implements com.garmin.android.apps.connectmobile.contacts.details.a.i, com.garmin.android.apps.connectmobile.contacts.details.a.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f32471d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.contacts.details.a f32472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f32473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32474c = m.a(n.NONE, new d(this, null, new c(this), null, null));

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.contacts.details.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0528b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f32475a;

        public C0528b(l lVar) {
            lVar.getClass();
            this.f32475a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f32475a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32475a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32476a;

        public c(Fragment fragment) {
            this.f32476a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f32476a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f32477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f32481e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f32477a = fragment;
            this.f32478b = qualifier;
            this.f32479c = aVar;
            this.f32480d = aVar2;
            this.f32481e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, g20.i] */
        @Override // e23.a
        public final i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f32479c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF185700a();
            Fragment fragment = this.f32477a;
            e23.a aVar = this.f32480d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i.class), viewModelStore, null, defaultViewModelCreationExtras, this.f32478b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f32481e, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.contacts.details.a.e
    public final void C0() {
        l20.a aVar;
        g20.n nVar = (g20.n) v6().f75347k.d();
        if (nVar == null || (aVar = nVar.f75368i) == null || !s3.b()) {
            return;
        }
        f12.l.f68084a.getClass();
        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
        List<l20.g> listA = aVar.A();
        Object obj = null;
        if (listA != null) {
            for (Object obj2 : listA) {
                if (s.g(((l20.g) obj2).getUserId(), gVarW0 != null ? gVarW0.f46857a : null)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (l20.g) obj;
        }
        if (obj != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            g20.g.a(contextRequireContext);
            return;
        }
        q1.b bVar = q1.f41066b;
        String string = getString(R.string.contact_management_title_delete_contact);
        string.getClass();
        String string2 = getString(R.string.delete_contact_message, aVar.j());
        string2.getClass();
        en0.n nVar2 = new en0.n(this, 22);
        bVar.getClass();
        q1 q1VarC = q1.b.c(string, string2, R.string.lbl_delete, R.string.lbl_cancel, nVar2);
        v parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        q1VarC.v6(parentFragmentManager, "GCMFragTwoBttnAlertDialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.contacts.details.a.i
    public final void Y() {
        l20.a aVar;
        g20.n nVar = (g20.n) v6().f75347k.d();
        if (nVar == null || (aVar = nVar.f75368i) == null) {
            return;
        }
        i iVarV6 = v6();
        iVarV6.getClass();
        iVarV6.f75346j.m(new g20.n(null, false, false, false, false, false, null, true, aVar, 127, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_recycler_view_with_banner, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u6();
        y6();
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        this.f32473b = (RecyclerView) viewFindViewById;
        w6().setLayoutManager(new LinearLayoutManager(requireContext()));
        w6().setHasFixedSize(true);
        this.f32472a = new com.garmin.android.apps.connectmobile.contacts.details.a(this, null, null, null, this, 14, null);
        RecyclerView recyclerViewW6 = w6();
        com.garmin.android.apps.connectmobile.contacts.details.a aVar = this.f32472a;
        if (aVar != null) {
            recyclerViewW6.setAdapter(aVar);
        } else {
            s.m("contactInfoAdapter");
            throw null;
        }
    }

    public void u6() {
        if (s3.b()) {
            return;
        }
        androidx.fragment.app.m activity = getActivity();
        activity.getClass();
        activity.addMenuProvider(new g20.h(this), getViewLifecycleOwner(), b0.b.CREATED);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i v6() {
        return (i) this.f32474c.getValue();
    }

    public final RecyclerView w6() {
        RecyclerView recyclerView = this.f32473b;
        if (recyclerView != null) {
            return recyclerView;
        }
        s.m("recyclerView");
        throw null;
    }

    public void y6() {
        v6().f75347k.f(getViewLifecycleOwner(), new C0528b(new f(this, 4)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/details/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
