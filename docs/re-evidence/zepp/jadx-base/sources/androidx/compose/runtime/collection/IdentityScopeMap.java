package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.notification.TransportUri;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0017\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010&J\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\bJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0002J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\u0002J7\u0010\u0019\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00012!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00170\u0014H\u0086\bø\u0001\u0000J\u0006\u0010\u001a\u001a\u00020\u0017J\u001d\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0011J/\u0010\u001d\u001a\u00020\u00172!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0014H\u0086\bø\u0001\u0000R(\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010&\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R6\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060'8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010&\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00106\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010&\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006>"}, d2 = {"Landroidx/compose/runtime/collection/IdentityScopeMap;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "index", "valueAt", "Landroidx/compose/runtime/collection/IdentityArraySet;", "scopeSetAt", "value", "getOrCreateIdentitySet", "find", "midIndex", "valueHash", "findExactIndex", "scope", "", TransportUri.ACTION_ADD, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "element", SearchCriteria.CONTAINS, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", TransportUri.ACTION_BLOCK, "forEachScopeOf", "clear", "remove", "predicate", "removeValueIf", "", "valueOrder", "[I", "getValueOrder", "()[I", "setValueOrder", "([I)V", "getValueOrder$annotations", "()V", "", "values", "[Ljava/lang/Object;", "getValues", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "getValues$annotations", "scopeSets", "[Landroidx/compose/runtime/collection/IdentityArraySet;", "getScopeSets", "()[Landroidx/compose/runtime/collection/IdentityArraySet;", "setScopeSets", "([Landroidx/compose/runtime/collection/IdentityArraySet;)V", "getScopeSets$annotations", "size", LogUtil.I, "getSize", "()I", "setSize", "(I)V", "getSize$annotations", "<init>", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class IdentityScopeMap<T> {

    @NotNull
    private IdentityArraySet<T>[] scopeSets;
    private int size;

    @NotNull
    private int[] valueOrder;

    @NotNull
    private Object[] values;

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.valueOrder = iArr;
        this.values = new Object[50];
        this.scopeSets = new IdentityArraySet[50];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int find(Object value) {
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(value);
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj = getValues()[getValueOrder()[i3]];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj) - iIdentityHashCode;
            if (iIdentityHashCode2 < 0) {
                i2 = i3 + 1;
            } else {
                if (iIdentityHashCode2 <= 0) {
                    return value == obj ? i3 : findExactIndex(i3, value, iIdentityHashCode);
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
                Object obj = getValues()[getValueOrder()[i]];
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
                Object obj2 = getValues()[getValueOrder()[i3]];
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

    private final IdentityArraySet<T> getOrCreateIdentitySet(Object value) {
        int iFind;
        if (this.size > 0) {
            iFind = find(value);
            if (iFind >= 0) {
                return scopeSetAt(iFind);
            }
        } else {
            iFind = -1;
        }
        int i = -(iFind + 1);
        int i2 = this.size;
        int[] iArr = this.valueOrder;
        if (i2 < iArr.length) {
            int i3 = iArr[i2];
            this.values[i3] = value;
            IdentityArraySet<T> identityArraySet = this.scopeSets[i3];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet<>();
                getScopeSets()[i3] = identityArraySet;
            }
            int i4 = this.size;
            if (i < i4) {
                int[] iArr2 = this.valueOrder;
                ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i + 1, i, i4);
            }
            this.valueOrder[i] = i3;
            this.size++;
            return identityArraySet;
        }
        int length = iArr.length * 2;
        this.scopeSets = (IdentityArraySet[]) Arrays.copyOf(this.scopeSets, length);
        IdentityArraySet<T> identityArraySet2 = new IdentityArraySet<>();
        this.scopeSets[i2] = identityArraySet2;
        Object[] objArrCopyOf = Arrays.copyOf(this.values, length);
        this.values = objArrCopyOf;
        objArrCopyOf[i2] = value;
        int[] iArr3 = new int[length];
        int i5 = this.size + 1;
        if (i5 < length) {
            while (true) {
                int i6 = i5 + 1;
                iArr3[i5] = i5;
                if (i6 >= length) {
                    break;
                }
                i5 = i6;
            }
        }
        int i7 = this.size;
        if (i < i7) {
            ArraysKt___ArraysJvmKt.copyInto(this.valueOrder, iArr3, i + 1, i, i7);
        }
        iArr3[i] = i2;
        if (i > 0) {
            ArraysKt___ArraysJvmKt.copyInto$default(this.valueOrder, iArr3, 0, 0, i, 6, (Object) null);
        }
        this.valueOrder = iArr3;
        this.size++;
        return identityArraySet2;
    }

    @PublishedApi
    public static /* synthetic */ void getScopeSets$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSize$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValueOrder$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityArraySet<T> scopeSetAt(int index) {
        return this.scopeSets[this.valueOrder[index]];
    }

    private final Object valueAt(int index) {
        return getValues()[getValueOrder()[index]];
    }

    public final boolean add(@NotNull Object value, @NotNull T scope) {
        return getOrCreateIdentitySet(value).add(scope);
    }

    public final void clear() {
        int length = this.scopeSets.length;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                IdentityArraySet<T> identityArraySet = this.scopeSets[i];
                if (identityArraySet != null) {
                    identityArraySet.clear();
                }
                this.valueOrder[i] = i;
                this.values[i] = null;
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        this.size = 0;
    }

    public final boolean contains(@NotNull Object element) {
        return find(element) >= 0;
    }

    public final void forEachScopeOf(@NotNull Object value, @NotNull Function1<? super T, Unit> block) {
        int iFind = find(value);
        if (iFind >= 0) {
            Iterator<T> it2 = scopeSetAt(iFind).iterator();
            while (it2.hasNext()) {
                block.invoke(it2.next());
            }
        }
    }

    @NotNull
    public final IdentityArraySet<T>[] getScopeSets() {
        return this.scopeSets;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValueOrder() {
        return this.valueOrder;
    }

    @NotNull
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object value, @NotNull T scope) {
        int i;
        IdentityArraySet<T> identityArraySet;
        int iFind = find(value);
        if (iFind < 0 || (identityArraySet = this.scopeSets[(i = this.valueOrder[iFind])]) == null) {
            return false;
        }
        boolean zRemove = identityArraySet.remove(scope);
        if (identityArraySet.size() == 0) {
            int i2 = iFind + 1;
            int i3 = this.size;
            if (i2 < i3) {
                int[] iArr = this.valueOrder;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, iFind, i2, i3);
            }
            int[] iArr2 = this.valueOrder;
            int i4 = this.size;
            iArr2[i4 - 1] = i;
            this.values[i] = null;
            this.size = i4 - 1;
        }
        return zRemove;
    }

    public final void removeValueIf(@NotNull Function1<? super T, Boolean> predicate) {
        int i;
        int size = getSize();
        int i2 = 0;
        if (size > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                int i6 = getValueOrder()[i3];
                IdentityArraySet<T> identityArraySet = getScopeSets()[i6];
                int size2 = identityArraySet.size();
                if (size2 > 0) {
                    int i7 = 0;
                    i = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        Object obj = identityArraySet.getValues()[i7];
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (!predicate.invoke(obj).booleanValue()) {
                            if (i != i7) {
                                identityArraySet.getValues()[i] = obj;
                            }
                            i++;
                        }
                        if (i8 >= size2) {
                            break;
                        } else {
                            i7 = i8;
                        }
                    }
                } else {
                    i = 0;
                }
                int size3 = identityArraySet.size();
                if (i < size3) {
                    int i9 = i;
                    while (true) {
                        int i10 = i9 + 1;
                        identityArraySet.getValues()[i9] = null;
                        if (i10 >= size3) {
                            break;
                        } else {
                            i9 = i10;
                        }
                    }
                }
                identityArraySet.setSize(i);
                if (identityArraySet.size() > 0) {
                    if (i4 != i3) {
                        int i11 = getValueOrder()[i4];
                        getValueOrder()[i4] = i6;
                        getValueOrder()[i3] = i11;
                    }
                    i4++;
                }
                if (i5 >= size) {
                    break;
                } else {
                    i3 = i5;
                }
            }
            i2 = i4;
        }
        int size4 = getSize();
        if (i2 < size4) {
            int i12 = i2;
            while (true) {
                int i13 = i12 + 1;
                getValues()[getValueOrder()[i12]] = null;
                if (i13 >= size4) {
                    break;
                } else {
                    i12 = i13;
                }
            }
        }
        setSize(i2);
    }

    public final void setScopeSets(@NotNull IdentityArraySet<T>[] identityArraySetArr) {
        this.scopeSets = identityArraySetArr;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setValueOrder(@NotNull int[] iArr) {
        this.valueOrder = iArr;
    }

    public final void setValues(@NotNull Object[] objArr) {
        this.values = objArr;
    }
}
