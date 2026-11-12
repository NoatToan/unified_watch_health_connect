package defpackage;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class v1a implements ook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ook> f36373a;

    public v1a(Set<ook> set) {
        this.f36373a = new ArrayList(set.size());
        for (ook ookVar : set) {
            if (ookVar != null) {
                this.f36373a.add(ookVar);
            }
        }
    }

    @Override // defpackage.hbi
    public void a(String str, String str2) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).a(str, str2);
            } catch (Exception e) {
                m("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // defpackage.ook
    public void b(ImageRequest imageRequest, String str, boolean z) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).b(imageRequest, str, z);
            } catch (Exception e) {
                m("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // defpackage.hbi
    public void c(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).c(str, str2, th, map);
            } catch (Exception e) {
                m("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // defpackage.hbi
    public void d(String str, String str2, String str3) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).d(str, str2, str3);
            } catch (Exception e) {
                m("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // defpackage.ook
    public void e(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).e(imageRequest, obj, str, z);
            } catch (Exception e) {
                m("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // defpackage.hbi
    public boolean f(String str) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            if (this.f36373a.get(i).f(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hbi
    public void g(String str, String str2, Map<String, String> map) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).g(str, str2, map);
            } catch (Exception e) {
                m("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.hbi
    public void h(String str, String str2, Map<String, String> map) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).h(str, str2, map);
            } catch (Exception e) {
                m("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // defpackage.hbi
    public void i(String str, String str2, boolean z) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).i(str, str2, z);
            } catch (Exception e) {
                m("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // defpackage.ook
    public void j(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).j(imageRequest, str, th, z);
            } catch (Exception e) {
                m("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // defpackage.ook
    public void k(String str) {
        int size = this.f36373a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f36373a.get(i).k(str);
            } catch (Exception e) {
                m("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public void l(ook ookVar) {
        this.f36373a.add(ookVar);
    }

    public final void m(String str, Throwable th) {
        cm8.j("ForwardingRequestListener", str, th);
    }

    public v1a(ook... ookVarArr) {
        this.f36373a = new ArrayList(ookVarArr.length);
        for (ook ookVar : ookVarArr) {
            if (ookVar != null) {
                this.f36373a.add(ookVar);
            }
        }
    }
}
