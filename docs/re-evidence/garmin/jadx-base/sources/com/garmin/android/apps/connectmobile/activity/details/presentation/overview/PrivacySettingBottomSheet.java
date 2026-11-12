package com.garmin.android.apps.connectmobile.activity.details.presentation.overview;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nr.v0;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.u;
import p13.y;
import ps.r;
import qr.t;
import xr.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/overview/PrivacySettingBottomSheet;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PrivacySettingBottomSheet extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f30087l = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f30088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l f30089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PrivacyType f30090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PrivacyType f30091k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30092a;

        public b(Fragment fragment) {
            this.f30092a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f30092a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30097e;

        public c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30093a = fragment;
            this.f30094b = qualifier;
            this.f30095c = aVar;
            this.f30096d = aVar2;
            this.f30097e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30095c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30093a;
            e23.a aVar = this.f30096d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), f189591b, null, defaultViewModelCreationExtras, this.f30094b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30097e, 4, null);
        }
    }

    static {
        new a(null);
    }

    public PrivacySettingBottomSheet() {
        super(R.layout.privacy_setting_bottom_sheet_content, false, false, false, 14, null);
        this.f30088h = o13.m.a(n.NONE, new c(this, null, new b(this), null, null));
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        PrivacyType privacyType = this.f30091k;
        if (privacyType == null) {
            s.m("currentPrivacyType");
            throw null;
        }
        String categoryAccessRule = privacyType.getCategoryAccessRule();
        PrivacyType privacyType2 = this.f30090j;
        if (privacyType2 != null) {
            return !s.g(categoryAccessRule, privacyType2.getCategoryAccessRule());
        }
        s.m("initialPrivacyType");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        t tVar = (t) this.f30088h.getValue();
        PrivacyType privacyType = this.f30091k;
        if (privacyType == null) {
            s.m("currentPrivacyType");
            throw null;
        }
        int id3 = privacyType.getId();
        PrivacyType privacyType2 = this.f30091k;
        if (privacyType2 == null) {
            s.m("currentPrivacyType");
            throw null;
        }
        String categoryAccessRule = privacyType2.getCategoryAccessRule();
        tVar.getClass();
        categoryAccessRule.getClass();
        tVar.X5(tVar.f146575z, new r(new ps.a(id3, categoryAccessRule), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262142, null), v0.PRIVACY);
        NavHostFragment.f10124e.getClass();
        NavHostFragment.a.a(this).n();
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        PrivacyType privacyType;
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("current_privacy_type", PrivacyType.class);
            } else {
                Object serializable2 = arguments.getSerializable("current_privacy_type");
                if (!(serializable2 instanceof PrivacyType)) {
                    serializable2 = null;
                }
                serializable = (PrivacyType) serializable2;
            }
            privacyType = (PrivacyType) serializable;
        } else {
            privacyType = null;
        }
        privacyType.getClass();
        this.f30090j = privacyType;
        this.f30091k = privacyType;
        l lVar = new l();
        lVar.f191986c = new xa2.g(this, 14);
        this.f30089i = lVar;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.activity_privacy_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        l lVar2 = this.f30089i;
        if (lVar2 == null) {
            s.m("privacyAdapter");
            throw null;
        }
        recyclerView.setAdapter(lVar2);
        l lVar3 = this.f30089i;
        if (lVar3 == null) {
            s.m("privacyAdapter");
            throw null;
        }
        PrivacyType[] privacyTypeArrValues = PrivacyType.values();
        privacyTypeArrValues.getClass();
        int length = privacyTypeArrValues.length - 1;
        int i14 = 0;
        if (length < 0) {
            length = 0;
        }
        List<PrivacyType> listA0 = u.a0(length, privacyTypeArrValues);
        ArrayList arrayList = new ArrayList(y.r(listA0, 10));
        for (PrivacyType privacyType2 : listA0) {
            String categoryAccessRule = privacyType2.getCategoryAccessRule();
            PrivacyType privacyType3 = this.f30090j;
            if (privacyType3 == null) {
                s.m("initialPrivacyType");
                throw null;
            }
            arrayList.add(new hr.a(privacyType2, s.g(categoryAccessRule, privacyType3.getCategoryAccessRule())));
        }
        ArrayList arrayList2 = lVar3.f191985b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((hr.a) it.next()).f85283b) {
                lVar3.f191984a = i14;
                lVar3.notifyDataSetChanged();
            }
            i14++;
        }
        i14 = -1;
        lVar3.f191984a = i14;
        lVar3.notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        String string = getString(R.string.lbl_who_can_view);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/overview/PrivacySettingBottomSheet$a;", "", "<init>", "()V", "", "CURRENT_PRIVACY_TYPE", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
