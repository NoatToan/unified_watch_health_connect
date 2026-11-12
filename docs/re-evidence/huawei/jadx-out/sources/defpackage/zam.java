package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hms.network.embedded.q0;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0084\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\f\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001BG\b\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0013J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020!H\u0016J\u0015\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00100J\u0015\u00101\u001a\u00020!2\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00100J\u0018\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00103J\u001f\u00104\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00105J\u001e\u00106\u001a\u00020*2\u0014\u00107\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0016J\u0017\u00108\u001a\u0004\u0018\u00018\u00012\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\b\u00109\u001a\u00020*H\u0016J\u0013\u0010E\u001a\u00020!2\b\u0010F\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010G\u001a\u00020\rH\u0016J\b\u0010H\u001a\u00020IH\u0016J\b\u0010N\u001a\u00020*H\u0002J\r\u0010O\u001a\u00020*H\u0000¢\u0006\u0002\bPJ\u0010\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020\rH\u0002J\u0010\u0010S\u001a\u00020!2\u0006\u0010T\u001a\u00020\rH\u0002J\u0010\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020\rH\u0002J\u0013\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010ZJ\u0010\u0010[\u001a\u00020*2\u0006\u0010\\\u001a\u00020!H\u0002J\u0010\u0010]\u001a\u00020*2\u0006\u0010^\u001a\u00020\rH\u0002J\u0010\u0010_\u001a\u00020!2\u0006\u0010`\u001a\u00020\rH\u0002J\u0015\u0010a\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010ZJ\u0015\u0010b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010ZJ\u0017\u0010c\u001a\u00020\r2\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\bd\u0010ZJ\u0017\u0010e\u001a\u00020!2\u0006\u0010/\u001a\u00028\u0000H\u0000¢\u0006\u0004\bf\u00100J\u0010\u0010g\u001a\u00020*2\u0006\u0010h\u001a\u00020\rH\u0002J\u0010\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\rH\u0002J!\u0010k\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0002\bnJ\u0018\u0010o\u001a\u00020!2\u000e\u0010F\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030&H\u0002J\u0019\u0010p\u001a\u00020!2\n\u0010q\u001a\u0006\u0012\u0002\b\u00030rH\u0000¢\u0006\u0002\bsJ\u001c\u0010t\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0002J\"\u0010u\u001a\u00020!2\u0018\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010m0rH\u0002J!\u0010v\u001a\u00020!2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010mH\u0000¢\u0006\u0002\bwJ\u0017\u0010x\u001a\u00020!2\u0006\u0010y\u001a\u00028\u0001H\u0000¢\u0006\u0004\bz\u00100J\u0019\u0010{\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010|H\u0000¢\u0006\u0002\b}J\u001a\u0010~\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u007fH\u0000¢\u0006\u0003\b\u0080\u0001J\u001c\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001H\u0000¢\u0006\u0003\b\u0083\u0001R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR&\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010C0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0014\u0010J\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u001aR\u0014\u0010L\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u001a¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "[Ljava/lang/Object;", "hashShift", "modCount", "value", "size", "getSize", "()I", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "isEmpty", "containsKey", MedalConstants.EVENT_KEY, "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", EventType.REMOVE, CervicalMucusRecord.Appearance.CLEAR, "keys", "", "getKeys", "()Ljava/util/Set;", q0.j, "", "getValues", "()Ljava/util/Collection;", "entries", "", "getEntries", "equals", "other", WatchFaceConstant.HASHCODE, "toString", "", "capacity", "getCapacity$kotlin_stdlib", "hashSize", "getHashSize", "registerModification", "checkIsMutable", "checkIsMutable$kotlin_stdlib", "ensureExtraCapacity", "n", "shouldCompact", "extraCapacity", "ensureCapacity", "minCapacity", "allocateValuesArray", "()[Ljava/lang/Object;", "hash", "(Ljava/lang/Object;)I", "compact", "updateHashArray", "rehash", "newHashSize", "putRehash", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "findKey", "findValue", "addKey", "addKey$kotlin_stdlib", "removeKey", "removeKey$kotlin_stdlib", "removeEntryAt", "index", "removeHashAt", "removedHash", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "contentEquals", "containsAllEntries", FitRunPlayAudio.OPPORTUNITY_M, "", "containsAllEntries$kotlin_stdlib", "putEntry", "putAllEntries", "removeEntry", "removeEntry$kotlin_stdlib", "removeValue", FunctionSetBeanReader.BI_ELEMENT, "removeValue$kotlin_stdlib", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "Companion", "Itr", "KeysItr", "ValuesItr", "EntriesItr", "EntryRef", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zam<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zam f53937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f53938b = new e(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zap<K, V> f53939c;
    private int[] d;
    private int e;
    private zas<K> f;
    private K[] g;
    private int h;
    private boolean i;
    private int j;
    private zar<V> k;
    private int l;
    private int[] m;
    private int n;
    private V[] o;

    private zam(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.g = kArr;
        this.o = vArr;
        this.m = iArr;
        this.d = iArr2;
        this.j = i;
        this.h = i2;
        this.e = f53938b.b(l());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return f();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return j();
    }

    @Override // java.util.Map
    public final int size() {
        return getN();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return g();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int getN() {
        return this.n;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getI() {
        return this.i;
    }

    public zam() {
        this(8);
    }

    public zam(int i) {
        this(arrayOfUninitializedElements.b(i), null, new int[i], new int[f53938b.d(i)], 2, 0);
    }

    public final Map<K, V> b() {
        e();
        this.i = true;
        if (size() > 0) {
            return this;
        }
        zam zamVar = f53937a;
        zcp.e(zamVar, "");
        return zamVar;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.i) {
            return new zaq(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return c(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return d(value) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int iC = c(key);
        if (iC < 0) {
            return null;
        }
        V[] vArr = this.o;
        zcp.e(vArr);
        return vArr[iC];
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        e();
        int iA = a(key);
        V[] vArrN = n();
        if (iA < 0) {
            int i = (-iA) - 1;
            V v = vArrN[i];
            vArrN[i] = value;
            return v;
        }
        vArrN[iA] = value;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        zcp.c(from, "");
        e();
        b((Collection) from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        e();
        int iC = c(key);
        if (iC < 0) {
            return null;
        }
        V[] vArr = this.o;
        zcp.e(vArr);
        V v = vArr[iC];
        d(iC);
        return v;
    }

    @Override // java.util.Map
    public void clear() {
        e();
        int i = this.h - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.m;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        arrayOfUninitializedElements.e(this.g, 0, this.h);
        V[] vArr = this.o;
        if (vArr != null) {
            arrayOfUninitializedElements.e(vArr, 0, this.h);
        }
        this.n = 0;
        this.h = 0;
        m();
    }

    public Set<K> j() {
        zas<K> zasVar = this.f;
        if (zasVar == null) {
            zas<K> zasVar2 = new zas<>(this);
            this.f = zasVar2;
            return zasVar2;
        }
        return zasVar;
    }

    public Collection<V> g() {
        zar<V> zarVar = this.k;
        if (zarVar == null) {
            zar<V> zarVar2 = new zar<>(this);
            this.k = zarVar2;
            return zarVar2;
        }
        return zarVar;
    }

    public Set<Map.Entry<K, V>> f() {
        zap<K, V> zapVar = this.f53939c;
        if (zapVar == null) {
            zap<K, V> zapVar2 = new zap<>(this);
            this.f53939c = zapVar2;
            return zapVar2;
        }
        return zapVar;
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && a((Map<?, ?>) other);
        }
        return true;
    }

    @Override // java.util.Map
    public int hashCode() {
        c<K, V> cVarA = a();
        int iA = 0;
        while (cVarA.hasNext()) {
            iA += cVarA.a();
        }
        return iA;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        c<K, V> cVarA = a();
        int i = 0;
        while (cVarA.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            cVarA.e(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        zcp.b((Object) string, "");
        return string;
    }

    public final int d() {
        return this.g.length;
    }

    private final int l() {
        return this.d.length;
    }

    private final void m() {
        this.l++;
    }

    public final void e() {
        if (this.i) {
            throw new UnsupportedOperationException();
        }
    }

    private final void b(int i) {
        if (f(i)) {
            c(true);
        } else {
            a(this.h + i);
        }
    }

    private final boolean f(int i) {
        int iD = d();
        int i2 = this.h;
        int i3 = iD - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= d() / 4;
    }

    private final void a(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > d()) {
            int iD = AbstractList.INSTANCE.d(d(), i);
            this.g = (K[]) arrayOfUninitializedElements.b(this.g, iD);
            V[] vArr = this.o;
            this.o = vArr != null ? (V[]) arrayOfUninitializedElements.b(vArr, iD) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.m, iD);
            zcp.b((Object) iArrCopyOf, "");
            this.m = iArrCopyOf;
            int iD2 = f53938b.d(iD);
            if (iD2 > l()) {
                c(iD2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] n() {
        V[] vArr = this.o;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) arrayOfUninitializedElements.b(d());
        this.o = vArr2;
        return vArr2;
    }

    private final int h(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.e;
    }

    private final void c(boolean z) {
        int i;
        V[] vArr = this.o;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.h;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.m;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.g;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        arrayOfUninitializedElements.e(this.g, i3, i);
        if (vArr != null) {
            arrayOfUninitializedElements.e(vArr, i3, this.h);
        }
        this.h = i3;
    }

    private final void c(int i) {
        m();
        if (this.h > size()) {
            c(false);
        }
        this.d = new int[i];
        this.e = f53938b.b(i);
        for (int i2 = 0; i2 < this.h; i2++) {
            if (!e(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final boolean e(int i) {
        int iH = h(this.g[i]);
        int i2 = this.j;
        while (true) {
            int[] iArr = this.d;
            if (iArr[iH] == 0) {
                iArr[iH] = i + 1;
                this.m[i] = iH;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iH = iH == 0 ? l() - 1 : iH - 1;
        }
    }

    private final int c(K k) {
        int iH = h(k);
        int i = this.j;
        while (true) {
            int i2 = this.d[iH];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (zcp.b(this.g[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? l() - 1 : iH - 1;
        }
    }

    private final int d(V v) {
        int i = this.h;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.m[i] >= 0) {
                V[] vArr = this.o;
                zcp.e(vArr);
                if (zcp.b(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public final int a(K k) {
        e();
        while (true) {
            int iH = h(k);
            int iE = zdm.e(this.j * 2, l() / 2);
            int i = 0;
            while (true) {
                int i2 = this.d[iH];
                if (i2 <= 0) {
                    if (this.h >= d()) {
                        b(1);
                        break;
                    }
                    int i3 = this.h;
                    int i4 = i3 + 1;
                    this.h = i4;
                    this.g[i3] = k;
                    this.m[i3] = iH;
                    this.d[iH] = i4;
                    this.n = size() + 1;
                    m();
                    if (i > this.j) {
                        this.j = i;
                    }
                    return i3;
                }
                if (zcp.b(this.g[i2 - 1], k)) {
                    return -i2;
                }
                i++;
                if (i > iE) {
                    c(l() * 2);
                    break;
                }
                iH = iH == 0 ? l() - 1 : iH - 1;
            }
        }
    }

    public final boolean b(K k) {
        e();
        int iC = c(k);
        if (iC < 0) {
            return false;
        }
        d(iC);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i) {
        arrayOfUninitializedElements.e(this.g, i);
        V[] vArr = this.o;
        if (vArr != null) {
            arrayOfUninitializedElements.e(vArr, i);
        }
        i(this.m[i]);
        this.m[i] = -1;
        this.n = size() - 1;
        m();
    }

    private final void i(int i) {
        int iE = zdm.e(this.j * 2, l() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? l() - 1 : i - 1;
            i2++;
            if (i2 > this.j) {
                this.d[i3] = 0;
                return;
            }
            int[] iArr = this.d;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((h(this.g[i5]) - i) & (l() - 1)) >= i2) {
                    this.d[i3] = i4;
                    this.m[i5] = i3;
                }
                iE--;
            }
            i3 = i;
            i2 = 0;
            iE--;
        } while (iE >= 0);
        this.d[i3] = -1;
    }

    public final boolean e(Map.Entry<? extends K, ? extends V> entry) {
        zcp.c(entry, "");
        int iC = c(entry.getKey());
        if (iC < 0) {
            return false;
        }
        V[] vArr = this.o;
        zcp.e(vArr);
        return zcp.b(vArr[iC], entry.getValue());
    }

    private final boolean a(Map<?, ?> map) {
        return size() == map.size() && c((Collection<?>) map.entrySet());
    }

    public final boolean c(Collection<?> collection) {
        zcp.c(collection, "");
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!e((Map.Entry) obj)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean b(Map.Entry<? extends K, ? extends V> entry) {
        int iA = a(entry.getKey());
        V[] vArrN = n();
        if (iA >= 0) {
            vArrN[iA] = entry.getValue();
            return true;
        }
        int i = (-iA) - 1;
        if (zcp.b(entry.getValue(), vArrN[i])) {
            return false;
        }
        vArrN[i] = entry.getValue();
        return true;
    }

    private final boolean b(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (b((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public final boolean a(Map.Entry<? extends K, ? extends V> entry) {
        zcp.c(entry, "");
        e();
        int iC = c(entry.getKey());
        if (iC < 0) {
            return false;
        }
        V[] vArr = this.o;
        zcp.e(vArr);
        if (!zcp.b(vArr[iC], entry.getValue())) {
            return false;
        }
        d(iC);
        return true;
    }

    public final boolean e(V v) {
        e();
        int iD = d(v);
        if (iD < 0) {
            return false;
        }
        d(iD);
        return true;
    }

    public final b<K, V> k() {
        return new b<>(this);
    }

    public final j<K, V> o() {
        return new j<>(this);
    }

    public final c<K, V> a() {
        return new c<>(this);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "<init>", "()V", "MAGIC", "", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "Empty", "Lkotlin/collections/builders/MapBuilder;", "", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e {
        private e() {
        }

        public final zam d() {
            return zam.f53937a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i) {
            return Integer.highestOneBit(zdm.c(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public /* synthetic */ e(zcm zcmVar) {
            this();
        }
    }

    static {
        zam zamVar = new zam(0);
        zamVar.i = true;
        f53937a = zamVar;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0015J\r\u0010\u001a\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u001bR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "index", "", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "expectedModCount", "initNext", "", "initNext$kotlin_stdlib", "hasNext", "", EventType.REMOVE, "checkForComodification", "checkForComodification$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class d<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53943c;
        private final zam<K, V> d;
        private int e;

        public d(zam<K, V> zamVar) {
            zcp.c(zamVar, "");
            this.d = zamVar;
            this.f53942b = -1;
            this.e = ((zam) zamVar).l;
            i();
        }

        public final zam<K, V> g() {
            return this.d;
        }

        public final void b(int i) {
            this.f53943c = i;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getF53943c() {
            return this.f53943c;
        }

        public final void a(int i) {
            this.f53942b = i;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getF53942b() {
            return this.f53942b;
        }

        public final void i() {
            while (this.f53943c < ((zam) this.d).h) {
                int[] iArr = ((zam) this.d).m;
                int i = this.f53943c;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.f53943c = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f53943c < ((zam) this.d).h;
        }

        public final void remove() {
            c();
            if (this.f53942b == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.d.e();
            this.d.d(this.f53942b);
            this.f53942b = -1;
            this.e = ((zam) this.d).l;
        }

        public final void c() {
            if (((zam) this.d).l != this.e) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b<K, V> extends d<K, V> implements Iterator<K>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zam<K, V> zamVar) {
            super(zamVar);
            zcp.c(zamVar, "");
        }

        @Override // java.util.Iterator
        public K next() {
            c();
            if (getF53943c() >= ((zam) g()).h) {
                throw new NoSuchElementException();
            }
            int iE = getF53943c();
            b(iE + 1);
            a(iE);
            K k = (K) ((zam) g()).g[getF53942b()];
            i();
            return k;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j<K, V> extends d<K, V> implements Iterator<V>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(zam<K, V> zamVar) {
            super(zamVar);
            zcp.c(zamVar, "");
        }

        @Override // java.util.Iterator
        public V next() {
            c();
            if (getF53943c() >= ((zam) g()).h) {
                throw new NoSuchElementException();
            }
            int iE = getF53943c();
            b(iE + 1);
            a(iE);
            Object[] objArr = ((zam) g()).o;
            zcp.e(objArr);
            V v = (V) objArr[getF53942b()];
            i();
            return v;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000bH\u0096\u0002J\r\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zam<K, V> zamVar) {
            super(zamVar);
            zcp.c(zamVar, "");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<K, V> next() {
            c();
            if (getF53943c() >= ((zam) g()).h) {
                throw new NoSuchElementException();
            }
            int iE = getF53943c();
            b(iE + 1);
            a(iE);
            a<K, V> aVar = new a<>(g(), getF53942b());
            i();
            return aVar;
        }

        public final int a() {
            if (getF53943c() >= ((zam) g()).h) {
                throw new NoSuchElementException();
            }
            int iE = getF53943c();
            b(iE + 1);
            a(iE);
            Object obj = ((zam) g()).g[getF53942b()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((zam) g()).o;
            zcp.e(objArr);
            Object obj2 = objArr[getF53942b()];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            i();
            return iHashCode ^ iHashCode2;
        }

        public final void e(StringBuilder sb) {
            zcp.c(sb, "");
            if (getF53943c() >= ((zam) g()).h) {
                throw new NoSuchElementException();
            }
            int iE = getF53943c();
            b(iE + 1);
            a(iE);
            Object obj = ((zam) g()).g[getF53942b()];
            if (obj == g()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((zam) g()).o;
            zcp.e(objArr);
            Object obj2 = objArr[getF53942b()];
            if (obj2 == g()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            i();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0010\u001a\u00028\u00032\u0006\u0010\u0011\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "map", "Lkotlin/collections/builders/MapBuilder;", "index", "", "<init>", "(Lkotlin/collections/builders/MapBuilder;I)V", "expectedModCount", MedalConstants.EVENT_KEY, "getKey", "()Ljava/lang/Object;", "value", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "checkForComodification", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zam<K, V> f53940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53941b;
        private final int e;

        public a(zam<K, V> zamVar, int i) {
            zcp.c(zamVar, "");
            this.f53940a = zamVar;
            this.e = i;
            this.f53941b = ((zam) zamVar).l;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            d();
            return (K) ((zam) this.f53940a).g[this.e];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            d();
            Object[] objArr = ((zam) this.f53940a).o;
            zcp.e(objArr);
            return (V) objArr[this.e];
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            d();
            this.f53940a.e();
            Object[] objArrN = this.f53940a.n();
            int i = this.e;
            V v = (V) objArrN[i];
            objArrN[i] = newValue;
            return v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return zcp.b(entry.getKey(), getKey()) && zcp.b(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }

        private final void d() {
            if (((zam) this.f53940a).l != this.f53941b) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }
    }
}
