package com.garmin.android.apps.connectmobile.devices.targetedselection;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.workouts.data.model.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/k;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends com.garmin.android.apps.connectmobile.devices.targetedselection.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f34608l = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f34610k = true;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f34611a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f34611a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f34611a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34611a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.a
    public final void A6(Bundle bundle) {
        super.A6(bundle);
        n nVarZ6 = z6();
        fd0.d dVarW6 = w6();
        m52.k kVar = this.f34576c;
        nVarZ6.f34633a = GCMSettingManager.r(dVarW6, kVar != null ? kVar.f116768d : null);
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.a
    public final void C6() {
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(new fd0.f(this), getViewLifecycleOwner(), b0.b.RESUMED);
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.d
    public final void a3(l.a aVar) {
        requireActivity().invalidateOptionsMenu();
        z6().A4(aVar);
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        v6().setText(getString(R.string.msg_no_device_connected));
        v6().setVisibility(8);
        RecyclerView recyclerView = this.f34581h;
        if (recyclerView == null) {
            s.m("deviceRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        h hVar = new h(this);
        RecyclerView recyclerView2 = this.f34581h;
        if (recyclerView2 == null) {
            s.m("deviceRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(hVar);
        z6().f34639g.f(getViewLifecycleOwner(), new b(new e52.b(18, this, hVar)));
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.a
    /* JADX INFO: renamed from: u6, reason: from getter */
    public final boolean getF34610k() {
        return this.f34610k;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/k$a;", "", "<init>", "()V", "", "BUNDLE_CAPACITY", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static k a(fd0.d dVar, m52.k kVar, com.garmin.android.library.mapsdkadapter.i.b bVar, f0 f0Var) {
            dVar.getClass();
            k kVar2 = new k();
            Bundle bundle = new Bundle(4);
            bundle.putSerializable("arg.module.type", dVar);
            bundle.putSerializable("arg.sport.type", kVar);
            bundle.putSerializable("arg.course.coordinate.system", bVar);
            bundle.putParcelable("arg.workout.feature.preferences", f0Var);
            kVar2.setArguments(bundle);
            return kVar2;
        }

        private a() {
        }
    }
}
