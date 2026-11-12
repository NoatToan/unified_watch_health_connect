package bl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zk.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbl/e;", "Lzk/g;", "<init>", "()V", "a", "analytics-gcs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements g {
    static {
        new a(null);
    }

    @Override // zk.g
    public final boolean a(zk.a aVar) {
        aVar.getClass();
        List<zk.e> list = aVar.f205030b;
        String str = aVar.f205029a;
        if (str.length() != 0 && aVar.f205032d > 0) {
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((zk.e) it.next()).f205040a.equals(str)) {
                        return true;
                    }
                }
            }
            if (list != null && list.isEmpty()) {
                return true;
            }
            for (zk.e eVar : list) {
                try {
                    if (eVar.f205040a.length() != 0 && Long.parseLong(eVar.f205041b.toString()) > 0) {
                    }
                } catch (Exception unused) {
                    Objects.toString(eVar);
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbl/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "analytics-gcs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
