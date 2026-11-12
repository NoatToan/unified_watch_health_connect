package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.huawei.hms.network.embedded.g4;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class ahf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<aho> f405a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Class<?> f406c;
    protected final ahf e;

    public ahf(Class<?> cls) {
        this(null, cls);
    }

    private ahf(ahf ahfVar, Class<?> cls) {
        this.e = ahfVar;
        this.f406c = cls;
    }

    public ahf b(Class<?> cls) {
        return new ahf(this, cls);
    }

    public void a(aho ahoVar) {
        if (this.f405a == null) {
            this.f405a = new ArrayList<>();
        }
        this.f405a.add(ahoVar);
    }

    public void c(JavaType javaType) {
        ArrayList<aho> arrayList = this.f405a;
        if (arrayList != null) {
            Iterator<aho> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(javaType);
            }
        }
    }

    public ahf d(Class<?> cls) {
        if (this.f406c == cls) {
            return this;
        }
        for (ahf ahfVar = this.e; ahfVar != null; ahfVar = ahfVar.e) {
            if (ahfVar.f406c == cls) {
                return ahfVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ClassStack (self-refs: ");
        ArrayList<aho> arrayList = this.f405a;
        sb.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb.append(g4.l);
        for (ahf ahfVar = this; ahfVar != null; ahfVar = ahfVar.e) {
            sb.append(' ');
            sb.append(ahfVar.f406c.getName());
        }
        sb.append(']');
        return sb.toString();
    }
}
