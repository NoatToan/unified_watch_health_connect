package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class k6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f23533a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f23534b = new ArrayList();

    public interface a {
    }

    public interface b {
    }

    public void registerBulletChangerListener(a aVar) {
        jpe.h("UDTClientListener", "registerBulletChangerListener called");
        if (this.f23533a.contains(aVar)) {
            return;
        }
        this.f23533a.add(aVar);
    }

    public void registerPosterChangeListener(b bVar) {
        jpe.h("UDTClientListener", "registerPosterChangeListener called");
        if (this.f23534b.contains(bVar)) {
            return;
        }
        this.f23534b.add(bVar);
    }

    public void unRegisterBulletChangerListener(a aVar) {
        jpe.h("UDTClientListener", "unRegisterBulletChangerListener called");
        this.f23533a.remove(aVar);
    }

    public void unRegisterPosterChangeListener(b bVar) {
        jpe.h("UDTClientListener", "unRegisterPosterChangeListener called");
        this.f23534b.remove(bVar);
    }
}
