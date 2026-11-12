package com.xiaomi.fitness.baseui.recyclerview.provider;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.d;
import androidx.databinding.f;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\b*\u0001+\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b0\u0010\u001dB\u0017\b\u0016\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b0\u00101J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0011\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\u00042\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00032\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u00042\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00032\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b#\u0010$R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0006¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "T", "Ljava/util/AbstractList;", "Landroidx/databinding/f;", "", "getSizeInternal", "()I", "Landroidx/databinding/f$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addOnListChangedCallback", "(Landroidx/databinding/f$a;)V", "removeOnListChangedCallback", "obj", "insertItem", "(Ljava/lang/Object;)Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "list", "insertList", "(Landroidx/databinding/f;)Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", "", "(Ljava/util/List;)Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "removeItem", "(Ljava/lang/Object;)Z", "listToRemove", "removeList", "(Landroidx/databinding/f;)Z", "removeAll", "()V", "backingList", "index", "mergeToBackingIndex", "(Landroidx/databinding/f;I)I", "backingIndexToMerge", "get", "(I)Ljava/lang/Object;", "Ljava/util/ArrayList;", "lists", "Ljava/util/ArrayList;", "Landroidx/databinding/d;", "listeners", "Landroidx/databinding/d;", "com/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList$mCallback$1", "mCallback", "Lcom/xiaomi/fitness/baseui/recyclerview/provider/MergeObservableList$mCallback$1;", "getSize", MediaStoreUtil.MediaInfo.SIZE, "<init>", "(Landroidx/databinding/f;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class MergeObservableList<T> extends AbstractList<T> implements f<T> {

    @NotNull
    private final d listeners;

    @NotNull
    private final ArrayList<List<T>> lists;

    @NotNull
    private final MergeObservableList$mCallback$1 mCallback;

    public MergeObservableList() {
        this.lists = new ArrayList<>();
        this.listeners = new d();
        this.mCallback = new f.a<f<T>>(this) { // from class: com.xiaomi.fitness.baseui.recyclerview.provider.MergeObservableList$mCallback$1
            final /* synthetic */ MergeObservableList<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.databinding.f.a
            public void onChanged(f<T> sender) {
                Intrinsics.checkNotNullParameter(sender, "sender");
                ((AbstractList) this.this$0).modCount++;
                ((MergeObservableList) this.this$0).listeners.p(this.this$0);
            }

            @Override // androidx.databinding.f.a
            public void onItemRangeChanged(f<T> sender, int positionStart, int itemCount) {
                int size = ((MergeObservableList) this.this$0).lists.size();
                int size2 = 0;
                for (int i = 0; i < size; i++) {
                    Object obj = ((MergeObservableList) this.this$0).lists.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    List list = (List) obj;
                    if (list == sender) {
                        ((MergeObservableList) this.this$0).listeners.q(this.this$0, size2 + positionStart, itemCount);
                        return;
                    }
                    size2 += list.size();
                }
            }

            @Override // androidx.databinding.f.a
            public void onItemRangeInserted(f<T> sender, int positionStart, int itemCount) {
                ((AbstractList) this.this$0).modCount++;
                int size = ((MergeObservableList) this.this$0).lists.size();
                StringBuilder sb = new StringBuilder();
                sb.append("onItemRangeInserted: ");
                sb.append(size);
                int size2 = 0;
                for (int i = 0; i < size; i++) {
                    Object obj = ((MergeObservableList) this.this$0).lists.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    List list = (List) obj;
                    if (list == sender) {
                        ((MergeObservableList) this.this$0).listeners.r(this.this$0, size2 + positionStart, itemCount);
                        return;
                    }
                    size2 += list.size();
                }
            }

            @Override // androidx.databinding.f.a
            public void onItemRangeMoved(f<T> sender, int fromPosition, int toPosition, int itemCount) {
                int size = ((MergeObservableList) this.this$0).lists.size();
                int size2 = 0;
                for (int i = 0; i < size; i++) {
                    Object obj = ((MergeObservableList) this.this$0).lists.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    List list = (List) obj;
                    if (list == sender) {
                        ((MergeObservableList) this.this$0).listeners.s(this.this$0, fromPosition + size2, size2 + toPosition, itemCount);
                        return;
                    }
                    size2 += list.size();
                }
            }

            @Override // androidx.databinding.f.a
            public void onItemRangeRemoved(f<T> sender, int positionStart, int itemCount) {
                ((AbstractList) this.this$0).modCount++;
                int size = ((MergeObservableList) this.this$0).lists.size();
                int size2 = 0;
                for (int i = 0; i < size; i++) {
                    Object obj = ((MergeObservableList) this.this$0).lists.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    List list = (List) obj;
                    if (list == sender) {
                        ((MergeObservableList) this.this$0).listeners.t(this.this$0, size2 + positionStart, itemCount);
                        return;
                    }
                    size2 += list.size();
                }
            }
        };
    }

    private final int getSizeInternal() {
        int size = this.lists.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            List<T> list = this.lists.get(i);
            Intrinsics.checkNotNullExpressionValue(list, "get(...)");
            size2 += list.size();
        }
        return size2;
    }

    @Override // androidx.databinding.f
    public void addOnListChangedCallback(@NotNull f.a<? extends f<T>> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.a(listener);
    }

    public final int backingIndexToMerge(@NotNull f<? extends T> backingList, int index) {
        Intrinsics.checkNotNullParameter(backingList, "backingList");
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.lists.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            List<T> list = this.lists.get(i);
            Intrinsics.checkNotNullExpressionValue(list, "get(...)");
            List<T> list2 = list;
            if (backingList == list2) {
                int i2 = index - size2;
                if (i2 < ((f) list2).size()) {
                    return i2;
                }
                throw new IndexOutOfBoundsException();
            }
            size2 += list2.size();
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.lists.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            List<T> list = this.lists.get(i);
            Intrinsics.checkNotNullExpressionValue(list, "get(...)");
            List<T> list2 = list;
            int i2 = index - size2;
            if (i2 < list2.size()) {
                return list2.get(i2);
            }
            size2 += list2.size();
        }
        throw new IndexOutOfBoundsException();
    }

    public int getSize() {
        return getSizeInternal();
    }

    @NotNull
    public final MergeObservableList<T> insertItem(T obj) {
        this.lists.add(CollectionsKt__CollectionsJVMKt.listOf(obj));
        ((AbstractList) this).modCount++;
        this.listeners.r(this, size() - 1, 1);
        return this;
    }

    @NotNull
    public final MergeObservableList<T> insertList(@NotNull f<T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        list.addOnListChangedCallback(this.mCallback);
        int size = size();
        this.lists.add(list);
        ((AbstractList) this).modCount++;
        if (!list.isEmpty()) {
            this.listeners.r(this, size, list.size());
        }
        return this;
    }

    public final int mergeToBackingIndex(@NotNull f<? extends T> backingList, int index) {
        Intrinsics.checkNotNullParameter(backingList, "backingList");
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.lists.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            List<T> list = this.lists.get(i);
            Intrinsics.checkNotNullExpressionValue(list, "get(...)");
            List<T> list2 = list;
            if (backingList == list2) {
                if (index < ((f) list2).size()) {
                    return size2 + index;
                }
                throw new IndexOutOfBoundsException();
            }
            size2 += list2.size();
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public final void removeAll() {
        int size = size();
        int size2 = this.lists.size();
        for (int i = 0; i < size2; i++) {
            List<T> list = this.lists.get(i);
            Intrinsics.checkNotNullExpressionValue(list, "get(...)");
            List<T> list2 = list;
            if (list2 instanceof f) {
                ((f) list2).removeOnListChangedCallback(this.mCallback);
            }
        }
        this.lists.clear();
        ((AbstractList) this).modCount++;
        if (size > 0) {
            this.listeners.t(this, 0, size);
        }
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    public final boolean removeItem(@Nullable T t) {
        int size = this.lists.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            List<T> list = this.lists.get(i);
            Intrinsics.checkNotNullExpressionValue(list, "get(...)");
            List<T> list2 = list;
            if (!(list2 instanceof f)) {
                T t2 = list2.get(0);
                if (t == null) {
                    if (t2 == null) {
                        this.lists.remove(i);
                        ((AbstractList) this).modCount++;
                        this.listeners.t(this, size2, 1);
                        return true;
                    }
                } else if (Intrinsics.areEqual(t, t2)) {
                    this.lists.remove(i);
                    ((AbstractList) this).modCount++;
                    this.listeners.t(this, size2, 1);
                    return true;
                }
            }
            size2 += list2.size();
        }
        return false;
    }

    public final boolean removeList(@NotNull f<T> listToRemove) {
        Intrinsics.checkNotNullParameter(listToRemove, "listToRemove");
        int size = this.lists.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            List<T> list = this.lists.get(i);
            Intrinsics.checkNotNullExpressionValue(list, "get(...)");
            List<T> list2 = list;
            if (list2 == listToRemove) {
                listToRemove.removeOnListChangedCallback(this.mCallback);
                this.lists.remove(i);
                ((AbstractList) this).modCount++;
                this.listeners.t(this, size2, ((f) list2).size());
                return true;
            }
            size2 += list2.size();
        }
        return false;
    }

    @Override // androidx.databinding.f
    public void removeOnListChangedCallback(@NotNull f.a<? extends f<T>> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.i(listener);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MergeObservableList(@NotNull f<T> list) {
        this();
        Intrinsics.checkNotNullParameter(list, "list");
        insertList((f) list);
    }

    @NotNull
    public final MergeObservableList<T> insertList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ObservableArrayList observableArrayList = new ObservableArrayList();
        observableArrayList.addAll(list);
        insertList((f) observableArrayList);
        return this;
    }
}
