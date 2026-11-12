package w3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lw3/d;", "K", "V", "Lp13/d;", "Lu3/d;", "Lw3/t;", "node", "", "size", "<init>", "(Lw3/t;I)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d<K, V> extends p13.d<K, V> implements u3.d<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f181785d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f181786e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t<K, V> f181787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f181788c;

    static {
        t.f181809e.getClass();
        f181786e = new d(t.f181810f, 0);
    }

    public d(t<K, V> tVar, int i14) {
        this.f181787b = tVar;
        this.f181788c = i14;
    }

    @Override // p13.d
    public final Set<Map.Entry<K, V>> b() {
        return new n(this);
    }

    @Override // p13.d
    public final Set c() {
        return new p(this);
    }

    @Override // p13.d, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f181787b.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // p13.d
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF102965c() {
        return this.f181788c;
    }

    @Override // p13.d
    public final Collection e() {
        return new r(this);
    }

    @Override // p13.d, java.util.Map
    public V get(Object obj) {
        return (V) this.f181787b.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // u3.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f<K, V> builder() {
        return new f<>(this);
    }

    public final d i(Object obj, x3.a aVar) {
        t.b<K, V> bVarU = this.f181787b.u(obj != null ? obj.hashCode() : 0, obj, aVar, 0);
        return bVarU == null ? this : new d(bVarU.f181815a, this.f181788c + bVarU.f181816b);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw3/d$a;", "", "<init>", "()V", "Lw3/d;", "", "EMPTY", "Lw3/d;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
