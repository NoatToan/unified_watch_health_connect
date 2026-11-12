package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0000\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0003QRSB\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0015\u0010'\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u001d\u0010'\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u0010+\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\b\u0010.\u001a\u00020)H\u0016J\u0015\u0010/\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u00100\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(J\u0016\u00101\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u0016\u00102\u001a\u00020\u00112\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0016J'\u00106\u001a\b\u0012\u0004\u0012\u0002H70\r\"\u0004\b\u0001\u001072\f\u00108\u001a\b\u0012\u0004\u0012\u0002H70\rH\u0016¢\u0006\u0002\u00109J\u0015\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\rH\u0016¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010=\u001a\u00020\tH\u0016J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\tH\u0002J\u0010\u0010D\u001a\u00020)2\u0006\u0010E\u001a\u00020\tH\u0002J\u0014\u0010F\u001a\u00020\u00112\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0018\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0002J\u001d\u0010I\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010*J&\u0010J\u001a\u00020)2\u0006\u0010H\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010C\u001a\u00020\tH\u0002J\u0015\u0010K\u001a\u00028\u00002\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u001cJ\u0018\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0002J.\u0010O\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\t2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010P\u001a\u00020\u0011H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006T"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initialCapacity", "", "<init>", "(I)V", "backing", "", "[Ljava/lang/Object;", "length", "isReadOnly", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "writeReplace", "", "size", "getSize", "()I", "isEmpty", "get", "index", "(I)Ljava/lang/Object;", "set", FunctionSetBeanReader.BI_ELEMENT, "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "addAll", "elements", "", CervicalMucusRecord.Appearance.CLEAR, "removeAt", EventType.REMOVE, "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", ExifInterface.GPS_DIRECTION_TRUE, "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", WatchFaceConstant.HASHCODE, "toString", "", "registerModification", "checkIsMutable", "ensureExtraCapacity", "n", "ensureCapacityInternal", "minCapacity", "contentEquals", "insertAtInternal", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "addAtInternal", "addAllInternal", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Companion", "Itr", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zak<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zak f53926a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f53927c = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53928b;
    private int d;
    private E[] e;

    public zak(int i) {
        this.e = (E[]) arrayOfUninitializedElements.b(i);
    }

    public /* synthetic */ zak(int i, int i2, zcm zcmVar) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "<init>", "()V", "Empty", "Lkotlin/collections/builders/ListBuilder;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class c {
        private c() {
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }

    static {
        zak zakVar = new zak(0);
        zakVar.f53928b = true;
        f53926a = zakVar;
    }

    public final List<E> c() {
        e();
        this.f53928b = true;
        return this.d > 0 ? this : f53926a;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f53928b) {
            return new zat(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int getD() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.INSTANCE.a(index, this.d);
        return this.e[index];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        e();
        AbstractList.INSTANCE.a(index, this.d);
        E[] eArr = this.e;
        E e = eArr[index];
        eArr[index] = element;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i = 0; i < this.d; i++) {
            if (zcp.b(this.e[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i = this.d - 1; i >= 0; i--) {
            if (zcp.b(this.e[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        AbstractList.INSTANCE.e(index, this.d);
        return new d(this, index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        e();
        d(this.d, element);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        e();
        AbstractList.INSTANCE.e(index, this.d);
        d(index, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        zcp.c(elements, "");
        e();
        int size = elements.size();
        e(this.d, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        zcp.c(elements, "");
        e();
        AbstractList.INSTANCE.e(index, this.d);
        int size = elements.size();
        e(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        b(0, this.d);
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        e();
        AbstractList.INSTANCE.a(index, this.d);
        return b(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        e();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        zcp.c(elements, "");
        e();
        return e(0, this.d, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        zcp.c(elements, "");
        e();
        return e(0, this.d, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        AbstractList.INSTANCE.e(fromIndex, toIndex, this.d);
        return new a(this.e, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        zcp.c(array, "");
        int length = array.length;
        int i = this.d;
        if (length < i) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.e, 0, i, array.getClass());
            zcp.b((Object) tArr, "");
            return tArr;
        }
        yzk.d(this.e, array, 0, 0, i);
        return (T[]) yzp.d(this.d, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return yzk.d(this.e, 0, this.d);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof List) && e((List<?>) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return arrayOfUninitializedElements.b(this.e, 0, this.d);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return arrayOfUninitializedElements.d((Object[]) this.e, 0, this.d, (Collection) this);
    }

    private final void a() {
        this.modCount++;
    }

    private final void e() {
        if (this.f53928b) {
            throw new UnsupportedOperationException();
        }
    }

    private final void d(int i) {
        c(this.d + i);
    }

    private final void c(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > this.e.length) {
            this.e = (E[]) arrayOfUninitializedElements.b(this.e, AbstractList.INSTANCE.d(this.e.length, i));
        }
    }

    private final boolean e(List<?> list) {
        return arrayOfUninitializedElements.c((Object[]) this.e, 0, this.d, (List<?>) list);
    }

    private final void d(int i, int i2) {
        d(i2);
        E[] eArr = this.e;
        yzk.d(eArr, eArr, i + i2, i, this.d);
        this.d += i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i, E e) {
        a();
        d(i, 1);
        this.e[i] = e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i, Collection<? extends E> collection, int i2) {
        a();
        d(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.e[i + i3] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E b(int i) {
        a();
        E[] eArr = this.e;
        E e = eArr[i];
        yzk.d(eArr, eArr, i, i + 1, this.d);
        arrayOfUninitializedElements.e(this.e, this.d - 1);
        this.d--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i, int i2) {
        if (i2 > 0) {
            a();
        }
        E[] eArr = this.e;
        yzk.d(eArr, eArr, i, i + i2, this.d);
        E[] eArr2 = this.e;
        int i3 = this.d;
        arrayOfUninitializedElements.e(eArr2, i3 - i2, i3);
        this.d -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.e[i5]) == z) {
                E[] eArr = this.e;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.e;
        yzk.d(eArr2, eArr2, i4 + i, i2 + i, this.d);
        E[] eArr3 = this.e;
        int i7 = this.d;
        arrayOfUninitializedElements.e(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            a();
        }
        this.d -= i6;
        return i6;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\fH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\r\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", ExifInterface.LONGITUDE_EAST, "", "list", "Lkotlin/collections/builders/ListBuilder;", "index", "", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "lastIndex", "expectedModCount", "hasPrevious", "", "hasNext", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "set", "", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)V", "add", EventType.REMOVE, "checkForComodification", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class d<E> implements ListIterator<E>, KMutableListIterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f53935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final zak<E> f53936c;
        private int d;
        private int e;

        public d(zak<E> zakVar, int i) {
            zcp.c(zakVar, "");
            this.f53936c = zakVar;
            this.f53935b = i;
            this.d = -1;
            this.e = zakVar.modCount;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f53935b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f53935b < ((zak) this.f53936c).d;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f53935b - 1;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f53935b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            c();
            int i = this.f53935b;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.f53935b = i2;
            this.d = i2;
            return (E) ((zak) this.f53936c).e[this.d];
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            c();
            if (this.f53935b >= ((zak) this.f53936c).d) {
                throw new NoSuchElementException();
            }
            int i = this.f53935b;
            this.f53935b = i + 1;
            this.d = i;
            return (E) ((zak) this.f53936c).e[this.d];
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            c();
            int i = this.d;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f53936c.set(i, element);
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            c();
            zak<E> zakVar = this.f53936c;
            int i = this.f53935b;
            this.f53935b = i + 1;
            zakVar.add(i, element);
            this.d = -1;
            this.e = this.f53936c.modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            c();
            int i = this.d;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f53936c.removeAt(i);
            this.f53935b = this.d;
            this.d = -1;
            this.e = this.f53936c.modCount;
        }

        private final void c() {
            if (this.f53936c.modCount != this.e) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001TBC\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0016\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010%J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0096\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016J\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u001d\u0010+\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u001e\u0010.\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\u0015\u00102\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010 J\u0015\u00103\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010,J\u0016\u00104\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u0016\u00105\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0016J'\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0002\u0010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H:0\tH\u0016¢\u0006\u0002\u0010<J\u0015\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\tH\u0016¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u001d2\b\u0010?\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010@\u001a\u00020\u000bH\u0016J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u00020\u0016H\u0002J\b\u0010D\u001a\u00020\u0016H\u0002J\b\u0010E\u001a\u00020\u0016H\u0002J\u0014\u0010H\u001a\u00020\u001d2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030IH\u0002J\u001d\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010-J&\u0010L\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010M\u001a\u00020\u000bH\u0002J\u0015\u0010N\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010 J\u0018\u0010O\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000bH\u0002J.\u0010R\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010S\u001a\u00020\u001dH\u0002R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010F\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006U"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", ExifInterface.LONGITUDE_EAST, "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "backing", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "length", "parent", "root", "Lkotlin/collections/builders/ListBuilder;", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "size", "getSize", "()I", "isEmpty", "", "get", "index", "(I)Ljava/lang/Object;", "set", FunctionSetBeanReader.BI_ELEMENT, "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "iterator", "", "listIterator", "", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "elements", "", CervicalMucusRecord.Appearance.CLEAR, "removeAt", EventType.REMOVE, "removeAll", "retainAll", "subList", "fromIndex", "toIndex", "toArray", ExifInterface.GPS_DIRECTION_TRUE, "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "other", WatchFaceConstant.HASHCODE, "toString", "", "registerModification", "checkForComodification", "checkIsMutable", "isReadOnly", "()Z", "contentEquals", "", "addAtInternal", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "addAllInternal", "n", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainOrRemoveAllInternal", "retain", "Itr", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<E> f53929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f53930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f53931c;
        private final zak<E> d;
        private E[] e;

        public a(E[] eArr, int i, int i2, a<E> aVar, zak<E> zakVar) {
            zcp.c(eArr, "");
            zcp.c(zakVar, "");
            this.e = eArr;
            this.f53930b = i;
            this.f53931c = i2;
            this.f53929a = aVar;
            this.d = zakVar;
            this.modCount = zakVar.modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (d()) {
                return new zat(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.collections.AbstractMutableList
        /* JADX INFO: renamed from: getSize */
        public int getD() {
            b();
            return this.f53931c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            b();
            return this.f53931c == 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            b();
            AbstractList.INSTANCE.a(index, this.f53931c);
            return this.e[this.f53930b + index];
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            a();
            b();
            AbstractList.INSTANCE.a(index, this.f53931c);
            E[] eArr = this.e;
            int i = this.f53930b + index;
            E e = eArr[i];
            eArr[i] = element;
            return e;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            b();
            for (int i = 0; i < this.f53931c; i++) {
                if (zcp.b(this.e[this.f53930b + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            b();
            for (int i = this.f53931c - 1; i >= 0; i--) {
                if (zcp.b(this.e[this.f53930b + i], element)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            b();
            AbstractList.INSTANCE.e(index, this.f53931c);
            return new b(this, index);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            a();
            b();
            d(this.f53930b + this.f53931c, element);
            return true;
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            a();
            b();
            AbstractList.INSTANCE.e(index, this.f53931c);
            d(this.f53930b + index, element);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            zcp.c(elements, "");
            a();
            b();
            int size = elements.size();
            c(this.f53930b + this.f53931c, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> elements) {
            zcp.c(elements, "");
            a();
            b();
            AbstractList.INSTANCE.e(index, this.f53931c);
            int size = elements.size();
            c(this.f53930b + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            a();
            b();
            e(this.f53930b, this.f53931c);
        }

        @Override // kotlin.collections.AbstractMutableList
        public E removeAt(int index) {
            a();
            b();
            AbstractList.INSTANCE.a(index, this.f53931c);
            return d(this.f53930b + index);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            a();
            b();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> elements) {
            zcp.c(elements, "");
            a();
            b();
            return b(this.f53930b, this.f53931c, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> elements) {
            zcp.c(elements, "");
            a();
            b();
            return b(this.f53930b, this.f53931c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            AbstractList.INSTANCE.e(fromIndex, toIndex, this.f53931c);
            return new a(this.e, this.f53930b + fromIndex, toIndex - fromIndex, this, this.d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            zcp.c(array, "");
            b();
            int length = array.length;
            int i = this.f53931c;
            if (length < i) {
                E[] eArr = this.e;
                int i2 = this.f53930b;
                T[] tArr = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, array.getClass());
                zcp.b((Object) tArr, "");
                return tArr;
            }
            E[] eArr2 = this.e;
            int i3 = this.f53930b;
            yzk.d(eArr2, array, 0, i3, i + i3);
            return (T[]) yzp.d(this.f53931c, array);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            b();
            E[] eArr = this.e;
            int i = this.f53930b;
            return yzk.d(eArr, i, this.f53931c + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            b();
            if (other != this) {
                return (other instanceof List) && a((List<?>) other);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            b();
            return arrayOfUninitializedElements.b(this.e, this.f53930b, this.f53931c);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            b();
            return arrayOfUninitializedElements.d((Object[]) this.e, this.f53930b, this.f53931c, (Collection) this);
        }

        private final void e() {
            this.modCount++;
        }

        private final void b() {
            if (this.d.modCount != this.modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void a() {
            if (d()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean d() {
            return ((zak) this.d).f53928b;
        }

        private final boolean a(List<?> list) {
            return arrayOfUninitializedElements.c((Object[]) this.e, this.f53930b, this.f53931c, (List<?>) list);
        }

        private final void d(int i, E e) {
            e();
            a<E> aVar = this.f53929a;
            if (aVar == null) {
                this.d.d(i, e);
            } else {
                aVar.d(i, e);
            }
            this.e = (E[]) ((zak) this.d).e;
            this.f53931c++;
        }

        private final void c(int i, Collection<? extends E> collection, int i2) {
            e();
            a<E> aVar = this.f53929a;
            if (aVar == null) {
                this.d.e(i, collection, i2);
            } else {
                aVar.c(i, collection, i2);
            }
            this.e = (E[]) ((zak) this.d).e;
            this.f53931c += i2;
        }

        private final E d(int i) {
            E eD;
            e();
            a<E> aVar = this.f53929a;
            if (aVar == null) {
                eD = (E) this.d.b(i);
            } else {
                eD = aVar.d(i);
            }
            this.f53931c--;
            return eD;
        }

        private final void e(int i, int i2) {
            if (i2 > 0) {
                e();
            }
            a<E> aVar = this.f53929a;
            if (aVar == null) {
                this.d.b(i, i2);
            } else {
                aVar.e(i, i2);
            }
            this.f53931c -= i2;
        }

        private final int b(int i, int i2, Collection<? extends E> collection, boolean z) {
            int iE;
            a<E> aVar = this.f53929a;
            if (aVar == null) {
                iE = this.d.e(i, i2, collection, z);
            } else {
                iE = aVar.b(i, i2, collection, z);
            }
            if (iE > 0) {
                e();
            }
            this.f53931c -= iE;
            return iE;
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\r\u001a\u00020\fH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\r\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$Itr;", ExifInterface.LONGITUDE_EAST, "", "list", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "index", "", "<init>", "(Lkotlin/collections/builders/ListBuilder$BuilderSubList;I)V", "lastIndex", "expectedModCount", "hasPrevious", "", "hasNext", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "set", "", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)V", "add", EventType.REMOVE, "checkForComodification", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        static final class b<E> implements ListIterator<E>, KMutableListIterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f53932a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f53933b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final a<E> f53934c;
            private int d;

            public b(a<E> aVar, int i) {
                zcp.c(aVar, "");
                this.f53934c = aVar;
                this.f53933b = i;
                this.d = -1;
                this.f53932a = aVar.modCount;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f53933b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f53933b < ((a) this.f53934c).f53931c;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f53933b - 1;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f53933b;
            }

            @Override // java.util.ListIterator
            public E previous() {
                c();
                int i = this.f53933b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f53933b = i2;
                this.d = i2;
                return (E) ((a) this.f53934c).e[((a) this.f53934c).f53930b + this.d];
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                c();
                if (this.f53933b >= ((a) this.f53934c).f53931c) {
                    throw new NoSuchElementException();
                }
                int i = this.f53933b;
                this.f53933b = i + 1;
                this.d = i;
                return (E) ((a) this.f53934c).e[((a) this.f53934c).f53930b + this.d];
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                c();
                int i = this.d;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.f53934c.set(i, element);
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                c();
                a<E> aVar = this.f53934c;
                int i = this.f53933b;
                this.f53933b = i + 1;
                aVar.add(i, element);
                this.d = -1;
                this.f53932a = this.f53934c.modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                c();
                int i = this.d;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.f53934c.removeAt(i);
                this.f53933b = this.d;
                this.d = -1;
                this.f53932a = this.f53934c.modCount;
            }

            private final void c() {
                if (((a) this.f53934c).d.modCount != this.f53932a) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }

    public zak() {
        this(0, 1, null);
    }
}
