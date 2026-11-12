package fa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f70014a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f70015b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<E> f70016c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<E> f70017d = Collections.EMPTY_LIST;

    public final int a(androidx.media3.exoplayer.drm.b.a aVar) {
        int iIntValue;
        synchronized (this.f70014a) {
            try {
                iIntValue = this.f70015b.containsKey(aVar) ? ((Integer) this.f70015b.get(aVar)).intValue() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f70014a) {
            it = this.f70017d.iterator();
        }
        return it;
    }
}
