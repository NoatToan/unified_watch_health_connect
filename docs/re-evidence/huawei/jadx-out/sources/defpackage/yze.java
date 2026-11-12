package defpackage;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import ohos.ace.plugin.taskmanagerplugin.EventType;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \\*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\\B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0005\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0011\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0083\bJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u000b\u0010#\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010%\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u000b\u0010&\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u0013\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00152\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u000b\u0010,\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010-\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010$J\r\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010$J\u0015\u00100\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u001d\u00100\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\u001e\u00103\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u0016\u00104\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001e\u00104\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u00105\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u00106\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00101J\u0015\u00109\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u0015\u0010<\u001a\u00020\"2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0015\u0010=\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u001bJ\u0016\u0010>\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u0010?\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001d\u0010@\u001a\u00020\"2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0BH\u0082\bJ\b\u0010C\u001a\u00020\u0015H\u0016J'\u0010D\u001a\b\u0012\u0004\u0012\u0002HE0\r\"\u0004\b\u0001\u0010E2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002HE0\rH\u0016¢\u0006\u0002\u0010GJ\u0015\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0016¢\u0006\u0002\u0010HJ\u0018\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0014J\u0018\u0010L\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0002J\u0018\u0010M\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0002J\u0018\u0010N\u001a\u00020\u00152\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0004H\u0002J\b\u0010Q\u001a\u00020\u0015H\u0002J)\u0010R\u001a\b\u0012\u0004\u0012\u0002HE0\r\"\u0004\b\u0001\u0010E2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002HE0\rH\u0000¢\u0006\u0004\bS\u0010GJ\u0017\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0000¢\u0006\u0004\bS\u0010HJ\u001d\u0010T\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0004H\u0000¢\u0006\u0002\bUJM\u0010V\u001a\u00020\u00152>\u0010W\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\u000b\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00150XH\u0000¢\u0006\u0002\b[R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006]"}, d2 = {"Lkotlin/collections/ArrayDeque;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "<init>", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", TtmlNode.TAG_HEAD, "elementData", "", "", "[Ljava/lang/Object;", "value", "size", "getSize", "()I", "ensureCapacity", "", "minCapacity", "copyElements", "newCapacity", "internalGet", "internalIndex", "(I)Ljava/lang/Object;", "positiveMod", "index", "negativeMod", "incremented", "decremented", "isEmpty", "", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "addFirst", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "copyCollectionElements", "addAll", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", EventType.REMOVE, "removeAt", "removeAll", "retainAll", "filterInPlace", "predicate", "Lkotlin/Function1;", CervicalMucusRecord.Appearance.CLEAR, "toArray", ExifInterface.GPS_DIRECTION_TRUE, "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "removeRange", "fromIndex", "toIndex", "removeRangeShiftPreceding", "removeRangeShiftSucceeding", "nullifyNonEmpty", "internalFromIndex", "internalToIndex", "registerModification", "testToArray", "testToArray$kotlin_stdlib", "testRemoveRange", "testRemoveRange$kotlin_stdlib", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yze<E> extends AbstractMutableList<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f53918c = f53916a;
    private int d;
    public static final d e = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object[] f53916a = new Object[0];

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public int getD() {
        return this.d;
    }

    private final void d(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f53918c;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f53916a) {
            this.f53918c = new Object[zdm.c(i, 10)];
        } else {
            b(AbstractList.INSTANCE.d(this.f53918c.length, i));
        }
    }

    private final void b(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f53918c;
        yzk.d(objArr2, objArr, 0, this.f53917b, objArr2.length);
        Object[] objArr3 = this.f53918c;
        int length = objArr3.length;
        int i2 = this.f53917b;
        yzk.d(objArr3, objArr, length - i2, 0, i2);
        this.f53917b = 0;
        this.f53918c = objArr;
    }

    private final int j(int i) {
        Object[] objArr = this.f53918c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final int a(int i) {
        return i < 0 ? i + this.f53918c.length : i;
    }

    private final int e(int i) {
        if (i == yzk.c(this.f53918c)) {
            return 0;
        }
        return i + 1;
    }

    private final int c(int i) {
        return i == 0 ? yzk.c(this.f53918c) : i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void addFirst(E element) {
        c();
        d(size() + 1);
        int iC = c(this.f53917b);
        this.f53917b = iC;
        this.f53918c[iC] = element;
        this.d = size() + 1;
    }

    public final void addLast(E element) {
        c();
        d(size() + 1);
        this.f53918c[j(this.f53917b + size())] = element;
        this.d = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        c();
        Object[] objArr = this.f53918c;
        int i = this.f53917b;
        E e2 = (E) objArr[i];
        objArr[i] = null;
        this.f53917b = e(i);
        this.d = size() - 1;
        return e2;
    }

    public final E a() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        c();
        int iJ = j(this.f53917b + yzp.a((List) this));
        Object[] objArr = this.f53918c;
        E e2 = (E) objArr[iJ];
        objArr[iJ] = null;
        this.d = size() - 1;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractList.INSTANCE.e(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        c();
        d(size() + 1);
        int iJ = j(this.f53917b + index);
        if (index < ((size() + 1) >> 1)) {
            int iC = c(iJ);
            int iC2 = c(this.f53917b);
            int i = this.f53917b;
            if (iC >= i) {
                Object[] objArr = this.f53918c;
                objArr[iC2] = objArr[i];
                yzk.d(objArr, objArr, i, i + 1, iC + 1);
            } else {
                Object[] objArr2 = this.f53918c;
                yzk.d(objArr2, objArr2, i - 1, i, objArr2.length);
                Object[] objArr3 = this.f53918c;
                objArr3[objArr3.length - 1] = objArr3[0];
                yzk.d(objArr3, objArr3, 0, 1, iC + 1);
            }
            this.f53918c[iC] = element;
            this.f53917b = iC2;
        } else {
            int iJ2 = j(this.f53917b + size());
            if (iJ < iJ2) {
                Object[] objArr4 = this.f53918c;
                yzk.d(objArr4, objArr4, iJ + 1, iJ, iJ2);
            } else {
                Object[] objArr5 = this.f53918c;
                yzk.d(objArr5, objArr5, 1, 0, iJ2);
                Object[] objArr6 = this.f53918c;
                objArr6[0] = objArr6[objArr6.length - 1];
                yzk.d(objArr6, objArr6, iJ + 1, iJ, objArr6.length - 1);
            }
            this.f53918c[iJ] = element;
        }
        this.d = size() + 1;
    }

    private final void e(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f53918c.length;
        while (i < length && it.hasNext()) {
            this.f53918c[i] = it.next();
            i++;
        }
        int i2 = this.f53917b;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f53918c[i3] = it.next();
        }
        this.d = size() + collection.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        zcp.c(elements, "");
        if (elements.isEmpty()) {
            return false;
        }
        c();
        d(size() + elements.size());
        e(j(this.f53917b + size()), elements);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        zcp.c(elements, "");
        AbstractList.INSTANCE.e(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        c();
        d(size() + elements.size());
        int iJ = j(this.f53917b + size());
        int iJ2 = j(this.f53917b + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i = this.f53917b;
            int length = i - size;
            if (iJ2 < i) {
                Object[] objArr = this.f53918c;
                yzk.d(objArr, objArr, length, i, objArr.length);
                if (size >= iJ2) {
                    Object[] objArr2 = this.f53918c;
                    yzk.d(objArr2, objArr2, objArr2.length - size, 0, iJ2);
                } else {
                    Object[] objArr3 = this.f53918c;
                    yzk.d(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f53918c;
                    yzk.d(objArr4, objArr4, 0, size, iJ2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f53918c;
                yzk.d(objArr5, objArr5, length, i, iJ2);
            } else {
                Object[] objArr6 = this.f53918c;
                length += objArr6.length;
                int length2 = objArr6.length - length;
                if (length2 >= iJ2 - i) {
                    yzk.d(objArr6, objArr6, length, i, iJ2);
                } else {
                    yzk.d(objArr6, objArr6, length, i, i + length2);
                    Object[] objArr7 = this.f53918c;
                    yzk.d(objArr7, objArr7, 0, this.f53917b + length2, iJ2);
                }
            }
            this.f53917b = length;
            e(a(iJ2 - size), elements);
        } else {
            int i2 = iJ2 + size;
            if (iJ2 < iJ) {
                int i3 = size + iJ;
                Object[] objArr8 = this.f53918c;
                if (i3 <= objArr8.length) {
                    yzk.d(objArr8, objArr8, i2, iJ2, iJ);
                } else if (i2 >= objArr8.length) {
                    yzk.d(objArr8, objArr8, i2 - objArr8.length, iJ2, iJ);
                } else {
                    int length3 = iJ - (i3 - objArr8.length);
                    yzk.d(objArr8, objArr8, 0, length3, iJ);
                    Object[] objArr9 = this.f53918c;
                    yzk.d(objArr9, objArr9, i2, iJ2, length3);
                }
            } else {
                Object[] objArr10 = this.f53918c;
                yzk.d(objArr10, objArr10, size, 0, iJ);
                Object[] objArr11 = this.f53918c;
                if (i2 >= objArr11.length) {
                    yzk.d(objArr11, objArr11, i2 - objArr11.length, iJ2, objArr11.length);
                } else {
                    yzk.d(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f53918c;
                    yzk.d(objArr12, objArr12, i2, iJ2, objArr12.length - size);
                }
            }
            e(iJ2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.INSTANCE.a(index, size());
        return (E) this.f53918c[j(this.f53917b + index)];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        AbstractList.INSTANCE.a(index, size());
        int iJ = j(this.f53917b + index);
        Object[] objArr = this.f53918c;
        E e2 = (E) objArr[iJ];
        objArr[iJ] = element;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i;
        int iJ = j(this.f53917b + size());
        int length = this.f53917b;
        if (length < iJ) {
            while (length < iJ) {
                if (zcp.b(element, this.f53918c[length])) {
                    i = this.f53917b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iJ) {
            return -1;
        }
        int length2 = this.f53918c.length;
        while (length < length2) {
            if (zcp.b(element, this.f53918c[length])) {
                i = this.f53917b;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iJ; i2++) {
            if (zcp.b(element, this.f53918c[i2])) {
                length = i2 + this.f53918c.length;
                i = this.f53917b;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int iC;
        int i;
        int iJ = j(this.f53917b + size());
        int i2 = this.f53917b;
        if (i2 < iJ) {
            iC = iJ - 1;
            if (i2 <= iC) {
                while (!zcp.b(element, this.f53918c[iC])) {
                    if (iC != i2) {
                        iC--;
                    }
                }
                i = this.f53917b;
                return iC - i;
            }
            return -1;
        }
        if (i2 > iJ) {
            for (int i3 = iJ - 1; -1 < i3; i3--) {
                if (zcp.b(element, this.f53918c[i3])) {
                    iC = i3 + this.f53918c.length;
                    i = this.f53917b;
                    return iC - i;
                }
            }
            iC = yzk.c(this.f53918c);
            int i4 = this.f53917b;
            if (i4 <= iC) {
                while (!zcp.b(element, this.f53918c[iC])) {
                    if (iC != i4) {
                        iC--;
                    }
                }
                i = this.f53917b;
                return iC - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int index) {
        AbstractList.INSTANCE.a(index, size());
        yze<E> yzeVar = this;
        if (index == yzp.a((List) yzeVar)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        c();
        int iJ = j(this.f53917b + index);
        E e2 = (E) this.f53918c[iJ];
        if (index < (size() >> 1)) {
            int i = this.f53917b;
            if (iJ >= i) {
                Object[] objArr = this.f53918c;
                yzk.d(objArr, objArr, i + 1, i, iJ);
            } else {
                Object[] objArr2 = this.f53918c;
                yzk.d(objArr2, objArr2, 1, 0, iJ);
                Object[] objArr3 = this.f53918c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i2 = this.f53917b;
                yzk.d(objArr3, objArr3, i2 + 1, i2, objArr3.length - 1);
            }
            Object[] objArr4 = this.f53918c;
            int i3 = this.f53917b;
            objArr4[i3] = null;
            this.f53917b = e(i3);
        } else {
            int iJ2 = j(this.f53917b + yzp.a((List) yzeVar));
            if (iJ <= iJ2) {
                Object[] objArr5 = this.f53918c;
                yzk.d(objArr5, objArr5, iJ, iJ + 1, iJ2 + 1);
            } else {
                Object[] objArr6 = this.f53918c;
                yzk.d(objArr6, objArr6, iJ, iJ + 1, objArr6.length);
                Object[] objArr7 = this.f53918c;
                objArr7[objArr7.length - 1] = objArr7[0];
                yzk.d(objArr7, objArr7, 0, 1, iJ2 + 1);
            }
            this.f53918c[iJ2] = null;
        }
        this.d = size() - 1;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            c();
            e(this.f53917b, j(this.f53917b + size()));
        }
        this.f53917b = 0;
        this.d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        zcp.c(array, "");
        if (array.length < size()) {
            array = (T[]) yzk.a(array, size());
        }
        int iJ = j(this.f53917b + size());
        int i = this.f53917b;
        if (i < iJ) {
            yzk.d(this.f53918c, array, 0, i, iJ, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f53918c;
            yzk.d(objArr, array, 0, this.f53917b, objArr.length);
            Object[] objArr2 = this.f53918c;
            yzk.d(objArr2, array, objArr2.length - this.f53917b, 0, iJ);
        }
        return (T[]) yzp.d(size(), array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        AbstractList.INSTANCE.e(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        if (i == 0) {
            return;
        }
        if (i == size()) {
            clear();
            return;
        }
        if (i == 1) {
            removeAt(fromIndex);
            return;
        }
        c();
        if (fromIndex < size() - toIndex) {
            d(fromIndex, toIndex);
            int iJ = j(this.f53917b + i);
            e(this.f53917b, iJ);
            this.f53917b = iJ;
        } else {
            b(fromIndex, toIndex);
            int iJ2 = j(this.f53917b + size());
            e(a(iJ2 - i), iJ2);
        }
        this.d = size() - i;
    }

    private final void d(int i, int i2) {
        int iJ = j(this.f53917b + (i - 1));
        int iJ2 = j(this.f53917b + (i2 - 1));
        while (i > 0) {
            int i3 = iJ + 1;
            int iMin = Math.min(i, Math.min(i3, iJ2 + 1));
            Object[] objArr = this.f53918c;
            int i4 = iJ2 - iMin;
            int i5 = iJ - iMin;
            yzk.d(objArr, objArr, i4 + 1, i5 + 1, i3);
            iJ = a(i5);
            iJ2 = a(i4);
            i -= iMin;
        }
    }

    private final void b(int i, int i2) {
        int iJ = j(this.f53917b + i2);
        int iJ2 = j(this.f53917b + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f53918c;
            i2 = Math.min(size, Math.min(objArr.length - iJ, objArr.length - iJ2));
            Object[] objArr2 = this.f53918c;
            int i3 = iJ + i2;
            yzk.d(objArr2, objArr2, iJ2, iJ, i3);
            iJ = j(i3);
            iJ2 = j(iJ2 + i2);
        }
    }

    private final void e(int i, int i2) {
        if (i < i2) {
            yzk.a(this.f53918c, null, i, i2);
            return;
        }
        Object[] objArr = this.f53918c;
        yzk.a(objArr, null, i, objArr.length);
        yzk.a(this.f53918c, null, 0, i2);
    }

    private final void c() {
        this.modCount++;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "<init>", "()V", "emptyElementData", "", "[Ljava/lang/Object;", "defaultMinCapacity", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        int iJ;
        zcp.c(elements, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f53918c.length != 0) {
            int iJ2 = j(this.f53917b + size());
            int i = this.f53917b;
            if (i < iJ2) {
                iJ = i;
                while (i < iJ2) {
                    Object obj = this.f53918c[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.f53918c[iJ] = obj;
                        iJ++;
                    }
                    i++;
                }
                yzk.a(this.f53918c, null, iJ, iJ2);
            } else {
                int length = this.f53918c.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f53918c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f53918c[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr2 = this.f53918c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f53918c[iJ] = obj3;
                        iJ = e(iJ);
                    }
                }
                z = z2;
            }
            if (z) {
                c();
                this.d = a(iJ - this.f53917b);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        int iJ;
        zcp.c(elements, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f53918c.length != 0) {
            int iJ2 = j(this.f53917b + size());
            int i = this.f53917b;
            if (i < iJ2) {
                iJ = i;
                while (i < iJ2) {
                    Object obj = this.f53918c[i];
                    if (elements.contains(obj)) {
                        this.f53918c[iJ] = obj;
                        iJ++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                yzk.a(this.f53918c, null, iJ, iJ2);
            } else {
                int length = this.f53918c.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f53918c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f53918c[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iJ = j(i2);
                for (int i3 = 0; i3 < iJ2; i3++) {
                    Object[] objArr2 = this.f53918c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.f53918c[iJ] = obj3;
                        iJ = e(iJ);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                c();
                this.d = a(iJ - this.f53917b);
            }
        }
        return z;
    }
}
