package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010\u001bJ\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0001J&\u0010\u0010\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000eH\u0086\bø\u0001\u0000J&\u0010\u0011\u001a\u00020\f2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000eH\u0086\bø\u0001\u0000J&\u0010\u0013\u001a\u00020\n2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u000eH\u0086\bø\u0001\u0000R(\u0010\u0014\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u001b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010%\u001a\u00020$8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010\u001b\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "key", "", "find", "midIndex", "value", "valueHash", "findExactIndex", "get", "", TransportUri.ACTION_ADD, "", "remove", "Lkotlin/Function2;", "predicate", "removeValueIf", "any", TransportUri.ACTION_BLOCK, "forEach", "size", LogUtil.I, "getSize", "()I", "setSize", "(I)V", "getSize$annotations", "()V", "", "keys", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "setKeys", "([Ljava/lang/Object;)V", "getKeys$annotations", "", "values", "[I", "getValues", "()[I", "setValues", "([I)V", "getValues$annotations", "<init>", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class IdentityArrayIntMap {
    private int size;

    @NotNull
    private Object[] keys = new Object[4];

    @NotNull
    private int[] values = new int[4];

    private final int find(Object key) {
        int i = this.size - 1;
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(key);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj = this.keys[i3];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj) - iIdentityHashCode;
            if (iIdentityHashCode2 < 0) {
                i2 = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= 0) {
                    return obj == key ? i3 : findExactIndex(i3, key, iIdentityHashCode);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private final int findExactIndex(int midIndex, Object value, int valueHash) {
        int i = midIndex - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                Object obj = this.keys[i];
                if (obj != value) {
                    if (ActualJvm_jvmKt.identityHashCode(obj) != valueHash || i2 < 0) {
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
                if (obj2 == value) {
                    return i3;
                }
                if (ActualJvm_jvmKt.identityHashCode(obj2) != valueHash) {
                    return -i5;
                }
                if (i5 < i4) {
                    i3 = i5;
                }
            }
        }
        return -(this.size + 1);
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSize$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    public final void add(@NotNull Object key, int value) {
        int iFind;
        if (this.size > 0) {
            iFind = find(key);
            if (iFind >= 0) {
                this.values[iFind] = value;
                return;
            }
        } else {
            iFind = -1;
        }
        int i = -(iFind + 1);
        int i2 = this.size;
        Object[] objArr = this.keys;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr = new int[objArr.length * 2];
            int i3 = i + 1;
            ArraysKt.copyInto(objArr, objArr2, i3, i, i2);
            ArraysKt___ArraysJvmKt.copyInto(this.values, iArr, i3, i, this.size);
            ArraysKt___ArraysJvmKt.copyInto$default(this.keys, objArr2, 0, 0, i, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto$default(this.values, iArr, 0, 0, i, 6, (Object) null);
            this.keys = objArr2;
            this.values = iArr;
        } else {
            int i4 = i + 1;
            ArraysKt.copyInto(objArr, objArr, i4, i, i2);
            int[] iArr2 = this.values;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i4, i, this.size);
        }
        this.keys[i] = key;
        this.values[i] = value;
        this.size++;
    }

    public final boolean any(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        int size = getSize();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object obj = getKeys()[i];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
                if (predicate.invoke(obj, Integer.valueOf(getValues()[i])).booleanValue()) {
                    return true;
                }
                if (i2 < size) {
                    i = i2;
                }
            }
        }
        return false;
    }

    public final void forEach(@NotNull Function2<Object, ? super Integer, Unit> block) {
        int size = getSize();
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Object obj = getKeys()[i];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
            block.invoke(obj, Integer.valueOf(getValues()[i]));
            if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final int get(@NotNull Object key) {
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    @NotNull
    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object key) {
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        int i = this.size;
        if (iFind < i - 1) {
            Object[] objArr = this.keys;
            int i2 = iFind + 1;
            ArraysKt.copyInto(objArr, objArr, iFind, i2, i);
            int[] iArr = this.values;
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, iFind, i2, this.size);
        }
        int i3 = this.size - 1;
        this.size = i3;
        this.keys[i3] = null;
        return true;
    }

    public final void removeValueIf(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        int size = getSize();
        int i = 0;
        if (size > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                Object obj = getKeys()[i];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
                int i4 = getValues()[i];
                if (!predicate.invoke(obj, Integer.valueOf(i4)).booleanValue()) {
                    if (i2 != i) {
                        getKeys()[i2] = obj;
                        getValues()[i2] = i4;
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
        int size2 = getSize();
        if (i < size2) {
            int i5 = i;
            while (true) {
                int i6 = i5 + 1;
                getKeys()[i5] = null;
                if (i6 >= size2) {
                    break;
                } else {
                    i5 = i6;
                }
            }
        }
        setSize(i);
    }

    public final void setKeys(@NotNull Object[] objArr) {
        this.keys = objArr;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setValues(@NotNull int[] iArr) {
        this.values = iArr;
    }
}
