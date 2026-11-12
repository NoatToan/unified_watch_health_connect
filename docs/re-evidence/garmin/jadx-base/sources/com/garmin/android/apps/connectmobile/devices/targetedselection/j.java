package com.garmin.android.apps.connectmobile.devices.targetedselection;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/j;", "Lcom/garmin/android/apps/connectmobile/devices/targetedselection/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends com.garmin.android.apps.connectmobile.devices.targetedselection.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f34605k = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f34606j = true;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f34607a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f34607a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f34607a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34607a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.a
    public final void C6() {
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(new fd0.e(this), getViewLifecycleOwner(), b0.b.RESUMED);
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.d
    public final void a3(l.a aVar) {
        if (aVar.f34621j != bz.d.f22265d) {
            z6().A4(aVar);
            z6().z4(w6(), this.f34576c, this.f34578e);
        } else {
            o52.e eVar = (o52.e) KoinJavaComponent.get$default(o52.e.class, null, null, 6, null);
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            eVar.p(mVarRequireActivity);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        v6().setText(getString(R.string.send_to_device_empty_state_message));
        v6().setVisibility(8);
        RecyclerView recyclerView = this.f34581h;
        if (recyclerView == null) {
            s.m("deviceRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        i iVar = new i(this);
        RecyclerView recyclerView2 = this.f34581h;
        if (recyclerView2 == null) {
            s.m("deviceRecyclerView");
            throw null;
        }
        recyclerView2.setAdapter(iVar);
        z6().f34639g.f(getViewLifecycleOwner(), new b(new e52.b(17, this, iVar)));
    }

    @Override // com.garmin.android.apps.connectmobile.devices.targetedselection.a
    /* JADX INFO: renamed from: y6, reason: from getter */
    public final boolean getF34606j() {
        return this.f34606j;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/targetedselection/j$a;", "", "<init>", "()V", "", "BUNDLE_CAPACITY", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
