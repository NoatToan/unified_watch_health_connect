package defpackage;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class fig extends dvq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ViewModelProvider.Factory f17814b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<UUID, ViewModelStore> f17815a = new HashMap<>();

    public class a implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends dvq> T create(Class<T> cls) {
            return new fig();
        }
    }

    public static fig b(ViewModelStore viewModelStore) {
        return (fig) new ViewModelProvider(viewModelStore, f17814b).get(fig.class);
    }

    public void a(UUID uuid) {
        ViewModelStore viewModelStoreRemove = this.f17815a.remove(uuid);
        if (viewModelStoreRemove != null) {
            viewModelStoreRemove.clear();
        }
    }

    public ViewModelStore c(UUID uuid) {
        ViewModelStore viewModelStore = this.f17815a.get(uuid);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.f17815a.put(uuid, viewModelStore2);
        return viewModelStore2;
    }

    @Override // defpackage.dvq
    public void onCleared() {
        Iterator<ViewModelStore> it = this.f17815a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f17815a.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f17815a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
