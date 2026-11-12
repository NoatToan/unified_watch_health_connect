package com.xiaomi.hm.health.device.model;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableSet;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\u0019\u001c\u001eB1\b\u0004\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b2\u00103B\t\b\u0016¢\u0006\u0004\b2\u00104J!\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001e\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016J\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\fH\u0016J\u001a\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\b\u0010\u0017\u001a\u00020\u0013H\u0016R\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR)\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00048V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R.\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0#8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000#8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010#8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010(¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/device/model/AbstractBiMap;", "", "K", "V", "Lcom/xiaomi/hm/health/device/model/MutableBiMap;", "key", "value", "forcePut", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", DataItem.HTTP_METHOD_PUT, "", "from", "", "putAll", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "clear", "get", "getKey", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "isEmpty", "", "a", "Ljava/util/Map;", "direct", "b", "reverse", "c", "Lkotlin/Lazy;", "getInverse", "()Lcom/xiaomi/hm/health/device/model/MutableBiMap;", "inverse", "", "", GoogleApiAvailabilityLight.a, "Ljava/util/Set;", "getEntries", "()Ljava/util/Set;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "getSize", "()I", "size", "getKeys", "keys", "getValues", "values", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractBiMap<K, V> implements MutableBiMap<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<K, V> direct;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<V, K> reverse;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy inverse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Set<Map.Entry<K, V>> entries;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010'\n\u0002\b\u000e\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00028\u00008\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00028\u00018\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"com/xiaomi/hm/health/device/model/AbstractBiMap$a", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/util/Map$Entry;", "entry", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "<init>", "(Lcom/xiaomi/hm/health/device/model/AbstractBiMap;Ljava/util/Map$Entry;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class a implements Map.Entry<K, V>, KMutableMap.Entry {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Map.Entry<K, V> entry;

        public a(Map.Entry<K, V> entry) {
            this.entry = entry;
        }

        @Override // java.util.Map.Entry
        @NotNull
        public K getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        @NotNull
        public V getValue() {
            return this.entry.getValue();
        }

        @Override // java.util.Map.Entry
        @NotNull
        public V setValue(@NotNull V newValue) {
            if (Intrinsics.areEqual(this.entry.getValue(), newValue)) {
                ((AbstractBiMap) AbstractBiMap.this).reverse.put(newValue, this.entry.getKey());
                try {
                    return this.entry.setValue(newValue);
                } catch (Throwable th) {
                    ((AbstractBiMap) AbstractBiMap.this).reverse.put(this.entry.getValue(), this.entry.getKey());
                    throw th;
                }
            }
            if (!(!((AbstractBiMap) AbstractBiMap.this).reverse.containsKey(newValue))) {
                throw new IllegalStateException(("BiMap already contains value " + newValue).toString());
            }
            ((AbstractBiMap) AbstractBiMap.this).reverse.put(newValue, this.entry.getKey());
            try {
                return this.entry.setValue(newValue);
            } catch (Throwable th2) {
                ((AbstractBiMap) AbstractBiMap.this).reverse.remove(newValue);
                throw th2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00020\u0003B=\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00020\u0017¢\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0002H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0001J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0002H\u0096\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0001J\t\u0010\r\u001a\u00020\u0005H\u0096\u0001J\u0017\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0001J\u0017\u0010\u000f\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0001J\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0013H\u0096\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u001d8\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001e¨\u0006\""}, d2 = {"com/xiaomi/hm/health/device/model/AbstractBiMap$b", "", ExifInterface.GPS_DIRECTION_TRUE, "", "element", "", TransportUri.ACTION_ADD, "(Ljava/lang/Object;)Z", "", MessengerShareContentUtility.ELEMENTS, "addAll", SearchCriteria.CONTAINS, "containsAll", "isEmpty", "removeAll", "retainAll", "remove", "", "clear", "", "iterator", "a", "Ljava/util/Set;", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "keyGetter", "c", "elementWrapper", "", "()I", "size", "<init>", "(Lcom/xiaomi/hm/health/device/model/AbstractBiMap;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class b<T> implements Set<T>, KMutableSet {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Set<T> elements;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Function1<T, K> keyGetter;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<T, T> elementWrapper;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Set<T> set, @NotNull Function1<? super T, ? extends K> function1, Function1<? super T, ? extends T> function2) {
            this.elements = set;
            this.keyGetter = function1;
            this.elementWrapper = function2;
        }

        public int a() {
            return this.elements.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(@NotNull T element) {
            return this.elements.add(element);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> elements) {
            return this.elements.addAll(elements);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ((AbstractBiMap) AbstractBiMap.this).direct.clear();
            ((AbstractBiMap) AbstractBiMap.this).reverse.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(@Nullable Object element) {
            if (element == null) {
                return false;
            }
            return this.elements.contains(element);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            return this.elements.containsAll(elements);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.elements.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return AbstractBiMap.this.new c(this.elements.iterator(), this.keyGetter, this.elementWrapper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean remove(@Nullable Object element) {
            K kInvoke;
            Object objRemove;
            if (element == null || !contains(element) || (objRemove = ((AbstractBiMap) AbstractBiMap.this).direct.remove((kInvoke = this.keyGetter.invoke(element)))) == null) {
                return false;
            }
            try {
                ((AbstractBiMap) AbstractBiMap.this).reverse.remove(objRemove);
                return true;
            } catch (Throwable th) {
                ((AbstractBiMap) AbstractBiMap.this).direct.put(kInvoke, objRemove);
                throw th;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            return this.elements.removeAll(elements);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            return this.elements.retainAll(elements);
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00020\u0003B=\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0006\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0015\u001a\u0004\u0018\u00018\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"com/xiaomi/hm/health/device/model/AbstractBiMap$c", "", ExifInterface.GPS_DIRECTION_TRUE, "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "remove", "a", "Ljava/util/Iterator;", "iterator", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "keyGetter", "c", "elementWrapper", GoogleApiAvailabilityLight.a, "Ljava/lang/Object;", "last", "<init>", "(Lcom/xiaomi/hm/health/device/model/AbstractBiMap;Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class c<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Iterator<T> iterator;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final Function1<T, K> keyGetter;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Function1<T, T> elementWrapper;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private T last;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull Iterator<? extends T> it2, @NotNull Function1<? super T, ? extends K> function1, Function1<? super T, ? extends T> function2) {
            this.iterator = it2;
            this.keyGetter = function1;
            this.elementWrapper = function2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        @NotNull
        public T next() {
            T next = this.iterator.next();
            this.last = next;
            return this.elementWrapper.invoke(next);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            T t = this.last;
            if (t == null) {
                throw new IllegalStateException("Move to an element before removing it".toString());
            }
            try {
                K kInvoke = this.keyGetter.invoke(t);
                Object obj = ((AbstractBiMap) AbstractBiMap.this).direct.get(kInvoke);
                if (obj == null) {
                    throw new IllegalStateException(("BiMap doesn't contain key " + kInvoke + " ").toString());
                }
                ((AbstractBiMap) AbstractBiMap.this).reverse.remove(obj);
                try {
                    this.iterator.remove();
                    this.last = null;
                } catch (Throwable th) {
                    ((AbstractBiMap) AbstractBiMap.this).reverse.put(obj, kInvoke);
                    throw th;
                }
            } catch (Throwable th2) {
                this.last = null;
                throw th2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n"}, d2 = {"", "K", "V", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Map.Entry<K, V>, K> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(@NotNull Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n"}, d2 = {"", "K", "V", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Map.Entry<K, V>, Map.Entry<K, V>> {
        public final /* synthetic */ AbstractBiMap<K, V> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractBiMap<K, V> abstractBiMap) {
            super(1);
            this.a = abstractBiMap;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map.Entry<K, V> invoke(@NotNull Map.Entry<K, V> entry) {
            return this.a.new a(entry);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"", "K", "V", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<K, K> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final K invoke(@NotNull K k) {
            return k;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"", "K", "V", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<K, K> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final K invoke(@NotNull K k) {
            return k;
        }
    }

    public AbstractBiMap(@NotNull Map<K, V> map, @NotNull Map<V, K> map2) {
        this.direct = map;
        this.reverse = map2;
        this.inverse = LazyKt__LazyJVMKt.lazy(new Function0<AbstractBiMap$inverse$2.AnonymousClass1>(this) { // from class: com.xiaomi.hm.health.device.model.AbstractBiMap$inverse$2
            public final /* synthetic */ AbstractBiMap<K, V> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.a = this;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [com.xiaomi.hm.health.device.model.AbstractBiMap$inverse$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 invoke() {
                Map map3 = ((AbstractBiMap) this.a).reverse;
                Map map4 = ((AbstractBiMap) this.a).direct;
                final AbstractBiMap<K, V> abstractBiMap = this.a;
                return new AbstractBiMap<V, K>(map3, map4) { // from class: com.xiaomi.hm.health.device.model.AbstractBiMap$inverse$2.1
                    @Override // com.xiaomi.hm.health.device.model.AbstractBiMap, java.util.Map
                    public /* bridge */ /* synthetic */ Collection values() {
                        return getValues();
                    }

                    @Override // com.xiaomi.hm.health.device.model.AbstractBiMap, com.xiaomi.hm.health.device.model.BiMap
                    @NotNull
                    public MutableBiMap<K, V> getInverse() {
                        return abstractBiMap;
                    }
                };
            }
        });
        this.entries = new b(map.entrySet(), d.a, new e(this));
    }

    @Override // java.util.Map
    public void clear() {
        this.direct.clear();
        this.reverse.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object key) {
        if (key == null) {
            return false;
        }
        return this.direct.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object value) {
        if (value == null) {
            return false;
        }
        return this.reverse.containsKey(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // com.xiaomi.hm.health.device.model.MutableBiMap
    @Nullable
    public V forcePut(@NotNull K key, @NotNull V value) {
        V vPut = this.direct.put(key, value);
        if (vPut != null) {
            this.reverse.remove(vPut);
        }
        K kPut = this.reverse.put(value, key);
        if (kPut != null) {
            this.direct.remove(kPut);
        }
        return vPut;
    }

    @Override // java.util.Map
    @Nullable
    public V get(@Nullable Object key) {
        if (key == null) {
            return null;
        }
        return this.direct.get(key);
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Nullable
    public final K getKey(@NotNull V value) {
        return this.reverse.get(value);
    }

    @NotNull
    public Set<K> getKeys() {
        return new b(this.direct.keySet(), f.a, g.a);
    }

    public int getSize() {
        return this.direct.size();
    }

    @Override // com.xiaomi.hm.health.device.model.MutableBiMap, com.xiaomi.hm.health.device.model.BiMap
    @NotNull
    public Set<V> getValues() {
        return getInverse().keySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.direct.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    @Nullable
    public V put(@NotNull K key, @NotNull V value) {
        if (!this.reverse.containsKey(value)) {
            return forcePut(key, value);
        }
        throw new IllegalArgumentException(("BiMap already contains value " + value).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        for (Object obj : from.values()) {
            if (!(!this.reverse.containsKey(obj))) {
                throw new IllegalArgumentException(("BiMap already contains value " + obj).toString());
            }
        }
        Iterator<T> it2 = from.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            forcePut(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    @Nullable
    public V remove(@Nullable Object key) {
        if (key == null) {
            return null;
        }
        V vRemove = this.direct.remove(key);
        if (vRemove != null) {
            this.reverse.remove(vRemove);
        }
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // com.xiaomi.hm.health.device.model.BiMap
    @NotNull
    public MutableBiMap<V, K> getInverse() {
        return (MutableBiMap) this.inverse.getValue();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<V> values() {
        return getValues();
    }

    public AbstractBiMap() {
        this(new HashMap(), new HashMap());
    }
}
