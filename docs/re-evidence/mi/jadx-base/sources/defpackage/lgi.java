package defpackage;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class lgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<kgi> f25046a;

    public lgi(List<kgi> list) {
        this.f25046a = new ArrayList(list);
    }

    public boolean a(Class<? extends kgi> cls) {
        Iterator<kgi> it = this.f25046a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends kgi> T b(Class<T> cls) {
        Iterator<kgi> it = this.f25046a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
