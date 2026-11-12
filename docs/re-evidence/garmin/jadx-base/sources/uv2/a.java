package uv2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.z0;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import cx2.h;
import e23.l;
import gw2.i;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Luv2/a;", "Lew2/d;", "<init>", "()V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends ew2.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f172960c;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f172961a;

        public b(l lVar) {
            lVar.getClass();
            this.f172961a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f172961a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f172961a.invoke(obj);
        }
    }

    static {
        new C3235a(null);
        f172960c = new h("MenuClickHelper", null, 2, null);
    }

    public static void c(com.garmin.realtimesettings.app.presentationlayer.c cVar, Map map, String str) {
        f172960c.getClass();
        if (!str.equals("ACTION_CANCEL")) {
            Logger logger = h.f56678c;
            return;
        }
        Object obj = map.get(i.FALLBACK_CLICK_EVENT.f79975a);
        String str2 = null;
        try {
            if (!(obj instanceof String)) {
                obj = null;
            }
            str2 = (String) obj;
        } catch (ClassCastException unused) {
        }
        m activity = cVar.getActivity();
        activity.getClass();
        SettingsDeviceActivity settingsDeviceActivity = (SettingsDeviceActivity) activity;
        if (s.g(str2, "EXIT_INSTANTIATE")) {
            settingsDeviceActivity.V9();
        } else if (s.g(str2, "EXIT")) {
            settingsDeviceActivity.finish();
        } else {
            cx2.i.f56681a.getClass();
            cx2.i.a.a(cVar);
        }
    }

    public static void d(Fragment fragment, dx2.c cVar, int i14, int i15) {
        f172960c.getClass();
        bv2.i iVar = new bv2.i(fragment);
        cVar.getClass();
        cVar.f61485b.getClass();
        ge1.b.T(v1.a(cVar), null, null, new dx2.d(i14, i15, cVar, iVar, null), 3);
    }

    /* JADX INFO: renamed from: uv2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luv2/a$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3235a {
        public /* synthetic */ C3235a(j jVar) {
            this();
        }

        private C3235a() {
        }
    }
}
