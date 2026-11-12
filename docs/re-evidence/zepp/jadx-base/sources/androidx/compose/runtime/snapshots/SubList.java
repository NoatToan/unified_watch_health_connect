package androidx.compose.runtime.snapshots;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.notification.TransportUri;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.e;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u0016\u0010\u001d\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u0016\u0010\u001f\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J \u0010 \u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R$\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "validateModification", "element", "", SearchCriteria.CONTAINS, "(Ljava/lang/Object;)Z", "", MessengerShareContentUtility.ELEMENTS, "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", TransportUri.ACTION_ADD, "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "removeAt", "retainAll", WatchFaceArrivingEvent.CMD_SET, "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "parentList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getParentList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "offset", LogUtil.I, "modification", "<set-?>", "size", "getSize", "()I", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
final class SubList<T> implements List<T>, KMutableList {
    private int modification;
    private final int offset;

    @NotNull
    private final SnapshotStateList<T> parentList;
    private int size;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SubList$listIterator$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"androidx/compose/runtime/snapshots/SubList$listIterator$1", "", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", TransportUri.ACTION_ADD, "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "remove", WatchFaceArrivingEvent.CMD_SET, "runtime_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {
        public final /* synthetic */ Ref.IntRef $current;
        public final /* synthetic */ SubList<T> this$0;

        public AnonymousClass1(Ref.IntRef intRef, SubList<T> subList) {
            this.$current = intRef;
            this.this$0 = subList;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            add(obj);
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.$current.element < this.this$0.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.$current.element >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i = this.$current.element + 1;
            SnapshotStateListKt.validateRange(i, this.this$0.size());
            this.$current.element = i;
            return this.this$0.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.$current.element + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i = this.$current.element;
            SnapshotStateListKt.validateRange(i, this.this$0.size());
            this.$current.element = i - 1;
            return this.this$0.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.$current.element;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            remove();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            set(obj);
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        @NotNull
        public Void add(T element) {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @NotNull
        public Void remove() {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        @NotNull
        public Void set(T element) {
            SnapshotStateListKt.modificationError();
            throw new KotlinNothingValueException();
        }
    }

    public SubList(@NotNull SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.parentList = snapshotStateList;
        this.offset = i;
        this.modification = snapshotStateList.getModification$runtime_release();
        this.size = i2 - i;
    }

    private final void validateModification() {
        if (this.parentList.getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        validateModification();
        this.parentList.add(this.offset + size(), element);
        this.size = size() + 1;
        this.modification = this.parentList.getModification$runtime_release();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        validateModification();
        boolean zAddAll = this.parentList.addAll(index + this.offset, elements);
        if (zAddAll) {
            this.size = size() + elements.size();
            this.modification = this.parentList.getModification$runtime_release();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i = this.offset;
            snapshotStateList.removeRange(i, size() + i);
            this.size = 0;
            this.modification = this.parentList.getModification$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int index) {
        validateModification();
        SnapshotStateListKt.validateRange(index, size());
        return this.parentList.get(this.offset + index);
    }

    @NotNull
    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        validateModification();
        int i = this.offset;
        Iterator<Integer> it2 = e.until(i, size() + i).iterator();
        while (it2.hasNext()) {
            int iNextInt = ((IntIterator) it2).nextInt();
            if (Intrinsics.areEqual(element, getParentList().get(iNextInt))) {
                return iNextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        validateModification();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!Intrinsics.areEqual(element, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Iterator<? extends Object> it2 = elements.iterator();
        while (true) {
            boolean z = false;
            while (it2.hasNext()) {
                if (remove(it2.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    public T removeAt(int index) {
        validateModification();
        T tRemove = this.parentList.remove(this.offset + index);
        this.size = size() - 1;
        this.modification = getParentList().getModification$runtime_release();
        return tRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        validateModification();
        boolean z = false;
        for (int size = (this.offset + size()) - 1; size >= this.offset; size--) {
            if (!elements.contains(this.parentList.get(size))) {
                if (!z) {
                    z = true;
                }
                this.parentList.remove(size);
                this.size = size() - 1;
            }
        }
        if (z) {
            this.modification = this.parentList.getModification$runtime_release();
        }
        return z;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        SnapshotStateListKt.validateRange(index, size());
        validateModification();
        T t = this.parentList.set(index + this.offset, element);
        this.modification = this.parentList.getModification$runtime_release();
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        if (!((fromIndex >= 0 && fromIndex <= toIndex) && toIndex <= size())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i = this.offset;
        return new SubList(snapshotStateList, fromIndex + i, toIndex + i);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        validateModification();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = index - 1;
        return new AnonymousClass1(intRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public void add(int index, T element) {
        validateModification();
        this.parentList.add(this.offset + index, element);
        this.size = size() + 1;
        this.modification = this.parentList.getModification$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        return addAll(size(), elements);
    }
}
