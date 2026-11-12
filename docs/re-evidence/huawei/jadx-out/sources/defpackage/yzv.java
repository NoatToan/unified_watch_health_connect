package defpackage;

import com.huawei.hms.network.embedded.q0;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010%\u001a\u00020\u0002H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lkotlin/collections/EmptyMap;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "serialVersionUID", "", "equals", "", "other", WatchFaceConstant.HASHCODE, "", "toString", "", "size", "getSize", "()I", "isEmpty", "containsKey", MedalConstants.EVENT_KEY, "containsValue", "value", "get", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", q0.j, "", "getValues", "()Ljava/util/Collection;", "readResolve", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class yzv implements Map, Serializable, KMappedMarker {
    public static final yzv e = new yzv();
    private static final long serialVersionUID = 8246714829545688274L;

    public int a() {
        return 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    private yzv() {
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return b((Void) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return e();
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return c();
    }

    @Override // java.util.Map
    public final int size() {
        return a();
    }

    @Override // java.util.Map
    public final Collection values() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return (other instanceof Map) && ((Map) other).isEmpty();
    }

    public String toString() {
        return "{}";
    }

    public Set<Map.Entry> e() {
        return zaa.f53923a;
    }

    public Set<Object> c() {
        return zaa.f53923a;
    }

    public Collection d() {
        return yzz.f53922c;
    }

    private final Object readResolve() {
        return e;
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(Void r2) {
        zcp.c(r2, "");
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
