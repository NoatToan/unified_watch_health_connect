package com.xiaomi.fitness.baseui.recyclerview.diff;

import androidx.databinding.f;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.ghe;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00013B\u0015\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\b/\u00100B\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u000001¢\u0006\u0004\b/\u00102J\u001d\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001c¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/diff/AsyncDiffObservableList;", "T", "Ljava/util/AbstractList;", "Landroidx/databinding/f;", "", "newItems", "", "update", "(Ljava/util/List;)V", "Landroidx/databinding/f$a;", "callback", "addOnListChangedCallback", "(Landroidx/databinding/f$a;)V", "removeOnListChangedCallback", "", "index", "get", "(I)Ljava/lang/Object;", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "fromIndex", "toIndex", "", "subList", "(II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "listIterator", "(I)Ljava/util/ListIterator;", "Landroidx/recyclerview/widget/d;", "differ", "Landroidx/recyclerview/widget/d;", "Landroidx/databinding/d;", "listeners", "Landroidx/databinding/d;", "getSize", MediaStoreUtil.MediaInfo.SIZE, "Landroidx/recyclerview/widget/c;", q.f13857a, "<init>", "(Landroidx/recyclerview/widget/c;)V", "Landroidx/recyclerview/widget/h$f;", "(Landroidx/recyclerview/widget/h$f;)V", "ObservableListUpdateCallback", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class AsyncDiffObservableList<T> extends AbstractList<T> implements f<T> {

    @NotNull
    private final d<T> differ;

    @NotNull
    private final androidx.databinding.d listeners;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/diff/AsyncDiffObservableList$ObservableListUpdateCallback;", "Lghe;", "", "position", "count", "", TSMAuthContants.PARAM_PAYLOAD, "", "onChanged", "(IILjava/lang/Object;)V", "onInserted", "(II)V", "onRemoved", "fromPosition", "toPosition", "onMoved", "<init>", "(Lcom/xiaomi/fitness/baseui/recyclerview/diff/AsyncDiffObservableList;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
    public final class ObservableListUpdateCallback implements ghe {
        public ObservableListUpdateCallback() {
        }

        @Override // defpackage.ghe
        public void onChanged(int position, int count, @Nullable Object payload) {
            ((AsyncDiffObservableList) AsyncDiffObservableList.this).listeners.q(AsyncDiffObservableList.this, position, count);
        }

        @Override // defpackage.ghe
        public void onInserted(int position, int count) {
            ((AsyncDiffObservableList) AsyncDiffObservableList.this).listeners.r(AsyncDiffObservableList.this, position, count);
        }

        @Override // defpackage.ghe
        public void onMoved(int fromPosition, int toPosition) {
            ((AsyncDiffObservableList) AsyncDiffObservableList.this).listeners.s(AsyncDiffObservableList.this, fromPosition, toPosition, 1);
        }

        @Override // defpackage.ghe
        public void onRemoved(int position, int count) {
            ((AsyncDiffObservableList) AsyncDiffObservableList.this).listeners.t(AsyncDiffObservableList.this, position, count);
        }
    }

    public AsyncDiffObservableList(@NotNull c<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.listeners = new androidx.databinding.d();
        this.differ = new d<>(new ObservableListUpdateCallback(), config);
    }

    @Override // androidx.databinding.f
    public void addOnListChangedCallback(@NotNull f.a<? extends f<T>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.listeners.a(callback);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object other) {
        if (other instanceof AsyncDiffObservableList) {
            return Intrinsics.areEqual(this.differ.b(), ((AsyncDiffObservableList) other).differ.b());
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        return this.differ.b().get(index);
    }

    public int getSize() {
        return this.differ.b().size();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.differ.b().hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@Nullable Object element) {
        return this.differ.b().indexOf(element);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        return this.differ.b().lastIndexOf(element);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return this.differ.b().listIterator(index);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // androidx.databinding.f
    public void removeOnListChangedCallback(@NotNull f.a<? extends f<T>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.listeners.i(callback);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        return this.differ.b().subList(fromIndex, toIndex);
    }

    public final void update(@Nullable List<? extends T> newItems) {
        this.differ.e(newItems);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AsyncDiffObservableList(@NotNull h.f<T> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c<T> cVarA = new c.a(callback).a();
        Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
        this(cVarA);
    }
}
