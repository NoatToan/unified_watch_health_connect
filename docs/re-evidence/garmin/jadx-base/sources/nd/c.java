package nd;

import android.os.Bundle;
import androidx.lifecycle.z;
import java.util.Iterator;
import java.util.Map;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lnd/c;", "", "Lqd/a;", "impl", "<init>", "(Lqd/a;)V", "b", "a", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.a f125383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nd.a.b f125384b;

    public interface a {
        void a(e eVar);
    }

    public interface b {
        Bundle a();
    }

    public c(qd.a aVar) {
        aVar.getClass();
        this.f125383a = aVar;
    }

    public final Bundle a(String str) {
        qd.a aVar = this.f125383a;
        if (!aVar.f144460g) {
            h.z("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = aVar.f144459f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleG = bundle.containsKey(str) ? nd.b.g(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            aVar.f144459f = null;
        }
        return bundleG;
    }

    public final b b(String str) {
        b bVar;
        qd.a aVar = this.f125383a;
        synchronized (aVar.f144456c) {
            Iterator it = aVar.f144457d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                b bVar2 = (b) entry.getValue();
                if (s.g(str2, str)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final void c(String str, b bVar) {
        bVar.getClass();
        qd.a aVar = this.f125383a;
        synchronized (aVar.f144456c) {
            if (aVar.f144457d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f144457d.put(str, bVar);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void d() {
        if (!this.f125383a.f144461h) {
            h.z("Can not perform this action after onSaveInstanceState");
            return;
        }
        nd.a.b bVar = this.f125384b;
        if (bVar == null) {
            bVar = new nd.a.b(this);
        }
        this.f125384b = bVar;
        try {
            z.a.class.getDeclaredConstructor(null);
            nd.a.b bVar2 = this.f125384b;
            if (bVar2 != null) {
                bVar2.f125381a.add(z.a.class.getName());
            }
        } catch (NoSuchMethodException e4) {
            j.v("Class ", z.a.class.getSimpleName(), " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
