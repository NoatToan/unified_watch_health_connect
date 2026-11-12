package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.notification.TransportUri;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010-\u001a\u00020\u0005¢\u0006\u0004\b.\u0010,J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ/\u0010\u001a\u001a\u00020\u00122!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u0016H\u0086\bø\u0001\u0000JD\u0010\u001c\u001a\u00020\u001226\u0010\u0019\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u001bH\u0086\bø\u0001\u0000R*\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "", "Key", "Value", "key", "", "find", "midIndex", "keyHash", "findExactIndex", "", "isEmpty", "isNotEmpty", SearchCriteria.CONTAINS, "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "", WatchFaceArrivingEvent.CMD_SET, "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", TransportUri.ACTION_BLOCK, "removeValueIf", "Lkotlin/Function2;", "forEach", "", "keys", "[Ljava/lang/Object;", "getKeys$runtime_release", "()[Ljava/lang/Object;", "setKeys$runtime_release", "([Ljava/lang/Object;)V", "values", "getValues$runtime_release", "setValues$runtime_release", "size", LogUtil.I, "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "capacity", "<init>", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class IdentityArrayMap<Key, Value> {

    @NotNull
    private Object[] keys;
    private int size;

    @NotNull
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    public IdentityArrayMap(int i) {
        this.keys = new Object[i];
        this.values = new Object[i];
    }

    private final int find(Object key) {
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(key);
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj = this.keys[i3];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj) - iIdentityHashCode;
            if (iIdentityHashCode2 < 0) {
                i2 = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= 0) {
                    return key == obj ? i3 : findExactIndex(i3, key, iIdentityHashCode);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private final int findExactIndex(int midIndex, Object key, int keyHash) {
        int i = midIndex - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                Object obj = this.keys[i];
                if (obj != key) {
                    if (ActualJvm_jvmKt.identityHashCode(obj) != keyHash || i2 < 0) {
                        break;
                    }
                    i = i2;
                } else {
                    return i;
                }
            }
        }
        int i3 = midIndex + 1;
        int i4 = this.size;
        if (i3 < i4) {
            while (true) {
                int i5 = i3 + 1;
                Object obj2 = this.keys[i3];
                if (obj2 == key) {
                    return i3;
                }
                if (ActualJvm_jvmKt.identityHashCode(obj2) != keyHash) {
                    return -i5;
                }
                if (i5 < i4) {
                    i3 = i5;
                }
            }
        }
        return -(this.size + 1);
    }

    public final boolean contains(@NotNull Key key) {
        return find(key) >= 0;
    }

    public final void forEach(@NotNull Function2<? super Key, ? super Value, Unit> block) {
        int size = getSize();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Object obj = getKeys()[i];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            block.invoke(obj, getValues()[i]);
            if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @Nullable
    public final Value get(@NotNull Key key) {
        int iFind = find(key);
        if (iFind >= 0) {
            return (Value) this.values[iFind];
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getKeys$runtime_release, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    /* JADX INFO: renamed from: getSize$runtime_release, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: getValues$runtime_release, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final boolean remove(@NotNull Key key) {
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        int i = this.size;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i2 = iFind + 1;
        ArraysKt.copyInto(objArr, objArr, iFind, i2, i);
        ArraysKt.copyInto(objArr2, objArr2, iFind, i2, i);
        int i3 = i - 1;
        objArr[i3] = null;
        objArr2[i3] = null;
        this.size = i3;
        return true;
    }

    public final void removeValueIf(@NotNull Function1<? super Value, Boolean> block) {
        int size = getSize();
        int i = 0;
        if (size > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                Object obj = getValues()[i];
                if (!block.invoke(obj).booleanValue()) {
                    if (i2 != i) {
                        getKeys()[i2] = getKeys()[i];
                        getValues()[i2] = obj;
                    }
                    i2++;
                }
                if (i3 >= size) {
                    break;
                } else {
                    i = i3;
                }
            }
            i = i2;
        }
        if (getSize() > i) {
            int size2 = getSize();
            if (i < size2) {
                int i4 = i;
                while (true) {
                    int i5 = i4 + 1;
                    getKeys()[i4] = null;
                    getValues()[i4] = null;
                    if (i5 >= size2) {
                        break;
                    } else {
                        i4 = i5;
                    }
                }
            }
            setSize$runtime_release(i);
        }
    }

    public final void set(@NotNull Key key, Value value) {
        int iFind = find(key);
        if (iFind >= 0) {
            this.values[iFind] = value;
            return;
        }
        int i = -(iFind + 1);
        int i2 = this.size;
        Object[] objArr = this.keys;
        boolean z = i2 == objArr.length;
        Object[] objArr2 = z ? new Object[i2 * 2] : objArr;
        int i3 = i + 1;
        ArraysKt.copyInto(objArr, objArr2, i3, i, i2);
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.keys, objArr2, 0, 0, i, 6, (Object) null);
        }
        objArr2[i] = key;
        this.keys = objArr2;
        Object[] objArr3 = z ? new Object[this.size * 2] : this.values;
        ArraysKt.copyInto(this.values, objArr3, i3, i, this.size);
        if (z) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.values, objArr3, 0, 0, i, 6, (Object) null);
        }
        objArr3[i] = value;
        this.values = objArr3;
        this.size++;
    }

    public final void setKeys$runtime_release(@NotNull Object[] objArr) {
        this.keys = objArr;
    }

    public final void setSize$runtime_release(int i) {
        this.size = i;
    }

    public final void setValues$runtime_release(@NotNull Object[] objArr) {
        this.values = objArr;
    }

    public /* synthetic */ IdentityArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
