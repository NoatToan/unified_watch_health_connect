package bi1;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.preference.Preference;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbi1/d;", "Landroidx/preference/b;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends androidx.preference.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f18024j = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f18025i = new w1(s0.f105811a.b(r.class), new c(this), new e(this), new C0264d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f18026a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f18026a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f18026a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18026a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f18027a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18027a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f18027a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: bi1.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0264d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f18028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f18029b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0264d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f18028a = aVar;
            this.f18029b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f18028a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f18029b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f18030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f18030a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f18030a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.preference.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Preference preferenceH0 = H0(getString(R.string.key_top_watch_face));
        if (preferenceH0 != null) {
            w6(preferenceH0, u.Top);
        }
        Preference preferenceH1 = H0(getString(R.string.key_bottom_watch_face));
        if (preferenceH1 != null) {
            w6(preferenceH1, u.Bottom);
        }
    }

    @Override // androidx.preference.b
    public final void v6() {
        u6(R.xml.gcm_device_settings_vvm3_classic_complication);
    }

    public final void w6(Preference preference, u uVar) {
        preference.f10152f = new a0.h(7, this, uVar);
        r rVar = (r) this.f18025i.getValue();
        t1.b(rVar.f18064a, new q(rVar, 0)).f(getViewLifecycleOwner(), new b(new a42.i(28, preference, uVar)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbi1/d$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
