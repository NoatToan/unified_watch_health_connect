package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.q;
import defpackage.zpe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, b> f1740b = new LinkedHashMap();

    public interface a {
        boolean a(b bVar);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SessionConfig f1741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1742b = false;
        public boolean c = false;

        public b(SessionConfig sessionConfig) {
            this.f1741a = sessionConfig;
        }

        public boolean a() {
            return this.c;
        }

        public boolean b() {
            return this.f1742b;
        }

        public SessionConfig c() {
            return this.f1741a;
        }

        public void d(boolean z) {
            this.c = z;
        }

        public void e(boolean z) {
            this.f1742b = z;
        }
    }

    public q(String str) {
        this.f1739a = str;
    }

    public static /* synthetic */ boolean j(b bVar) {
        return bVar.a() && bVar.b();
    }

    public SessionConfig.e c() {
        SessionConfig.e eVar = new SessionConfig.e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f1740b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                String key = entry.getKey();
                eVar.a(value.c());
                arrayList.add(key);
            }
        }
        zpe.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f1739a);
        return eVar;
    }

    public Collection<SessionConfig> d() {
        return Collections.unmodifiableCollection(h(new a() { // from class: vdq
            @Override // androidx.camera.core.impl.q.a
            public final boolean a(q.b bVar) {
                return q.j(bVar);
            }
        }));
    }

    public SessionConfig.e e() {
        SessionConfig.e eVar = new SessionConfig.e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f1740b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                eVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        zpe.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f1739a);
        return eVar;
    }

    public Collection<SessionConfig> f() {
        return Collections.unmodifiableCollection(h(new a() { // from class: udq
            @Override // androidx.camera.core.impl.q.a
            public final boolean a(q.b bVar) {
                return bVar.b();
            }
        }));
    }

    public final b g(String str, SessionConfig sessionConfig) {
        b bVar = this.f1740b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(sessionConfig);
        this.f1740b.put(str, bVar2);
        return bVar2;
    }

    public final Collection<SessionConfig> h(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f1740b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().c());
            }
        }
        return arrayList;
    }

    public boolean i(String str) {
        if (this.f1740b.containsKey(str)) {
            return this.f1740b.get(str).b();
        }
        return false;
    }

    public void l(String str) {
        this.f1740b.remove(str);
    }

    public void m(String str, SessionConfig sessionConfig) {
        g(str, sessionConfig).d(true);
    }

    public void n(String str, SessionConfig sessionConfig) {
        g(str, sessionConfig).e(true);
    }

    public void o(String str) {
        if (this.f1740b.containsKey(str)) {
            b bVar = this.f1740b.get(str);
            bVar.e(false);
            if (bVar.a()) {
                return;
            }
            this.f1740b.remove(str);
        }
    }

    public void p(String str) {
        if (this.f1740b.containsKey(str)) {
            b bVar = this.f1740b.get(str);
            bVar.d(false);
            if (bVar.b()) {
                return;
            }
            this.f1740b.remove(str);
        }
    }

    public void q(String str, SessionConfig sessionConfig) {
        if (this.f1740b.containsKey(str)) {
            b bVar = new b(sessionConfig);
            b bVar2 = this.f1740b.get(str);
            bVar.e(bVar2.b());
            bVar.d(bVar2.a());
            this.f1740b.put(str, bVar);
        }
    }
}
