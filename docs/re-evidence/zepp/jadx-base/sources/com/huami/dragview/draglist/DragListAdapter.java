package com.huami.dragview.draglist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.dragview.R;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b&\u0010'J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tJ\u0016\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/dragview/draglist/DragListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/dragview/draglist/DragListViewHolder;", "", "Lcom/huami/dragview/draglist/DragEntry;", "list", "a", "", "b", "", "getList", "dragList", "", "updateList", "sourcePosition", "targetPosition", "", "dragMoveListener", "dragSuccess", "dragEnded", "position", "getItemViewType", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "onBindViewHolder", "getItemCount", "Ljava/util/List;", "itemList", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/recyclerview/widget/ItemTouchHelper;", "c", "Landroidx/recyclerview/widget/ItemTouchHelper;", "itemTouchHelper", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/ItemTouchHelper;)V", "Companion", "dragview_release"}, k = 1, mv = {1, 4, 0})
public final class DragListAdapter extends RecyclerView.Adapter<DragListViewHolder> {

    @Nullable
    private static String d;

    @Nullable
    private static Pair<Integer, String> f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<DragEntry> itemList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ItemTouchHelper itemTouchHelper;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static String e = "暂无数据";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/dragview/draglist/DragListAdapter$Companion;", "", "", "cannotDragTips", "Ljava/lang/String;", "getCannotDragTips", "()Ljava/lang/String;", "setCannotDragTips", "(Ljava/lang/String;)V", "emptyTitle", "getEmptyTitle", "setEmptyTitle", "Lkotlin/Pair;", "", "minLimit", "Lkotlin/Pair;", "getMinLimit", "()Lkotlin/Pair;", "setMinLimit", "(Lkotlin/Pair;)V", "<init>", "()V", "dragview_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final String getCannotDragTips() {
            return DragListAdapter.d;
        }

        @Nullable
        public final String getEmptyTitle() {
            return DragListAdapter.e;
        }

        @Nullable
        public final Pair<Integer, String> getMinLimit() {
            return DragListAdapter.f;
        }

        public final void setCannotDragTips(@Nullable String str) {
            DragListAdapter.d = str;
        }

        public final void setEmptyTitle(@Nullable String str) {
            DragListAdapter.e = str;
        }

        public final void setMinLimit(@Nullable Pair<Integer, String> pair) {
            DragListAdapter.f = pair;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DragListAdapter(@NotNull Context context, @NotNull ItemTouchHelper itemTouchHelper) {
        this.context = context;
        this.itemTouchHelper = itemTouchHelper;
    }

    private final List<DragEntry> a(List<DragEntry> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() == 1) {
            DragEntry dragEntry = list.get(0);
            DragEntry dragEntry2 = dragEntry;
            dragEntry2.setBackground$dragview_release(R.drawable.dragview_drag_item_bg);
            dragEntry2.setShowItemLine$dragview_release(false);
            arrayList.add(dragEntry);
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                DragEntry dragEntry3 = (DragEntry) obj;
                if (i == 0) {
                    dragEntry3.setBackground$dragview_release(R.drawable.dragview_drag_item_top);
                    dragEntry3.setShowItemLine$dragview_release(true);
                } else if (i == list.size() - 1) {
                    dragEntry3.setBackground$dragview_release(R.drawable.dragview_drag_item_bottom);
                    dragEntry3.setShowItemLine$dragview_release(false);
                } else {
                    dragEntry3.setBackground$dragview_release(R.drawable.dragview_drag_item_normal);
                    dragEntry3.setShowItemLine$dragview_release(true);
                }
                arrayList2.add(dragEntry3);
                i = i2;
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private final int b() {
        Integer first;
        Pair<Integer, String> pair = f;
        if (pair == null || (first = pair.getFirst()) == null) {
            return 0;
        }
        return first.intValue();
    }

    public final void dragEnded(boolean dragSuccess) {
        Pair<Integer, String> pair;
        updateList(this.itemList);
        if (dragSuccess || (pair = f) == null) {
            return;
        }
        Context context = this.context;
        if (pair == null) {
            Intrinsics.throwNpe();
        }
        DragListAdapterKt.centerToast(context, pair.getSecond());
    }

    public final boolean dragMoveListener(int sourcePosition, int targetPosition) {
        DragEntry dragEntry;
        int i = 0;
        int i2 = 0;
        for (Object obj : this.itemList) {
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (((DragEntry) obj).getType() == R.layout.dragview_activity_drag_item_title) {
                i2 = i;
            }
            i = i3;
        }
        if (targetPosition >= b()) {
            List<DragEntry> list = this.itemList;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((DragEntry) obj2).getShow()) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() <= b() && this.itemList.get(sourcePosition).getShow()) {
                return false;
            }
        }
        if (targetPosition > i2) {
            dragEntry = this.itemList.get(sourcePosition);
            dragEntry.setShow(false);
        } else if (targetPosition < i2) {
            dragEntry = this.itemList.get(sourcePosition);
            dragEntry.setShow(true);
        } else if (sourcePosition > targetPosition) {
            dragEntry = this.itemList.get(sourcePosition);
            dragEntry.setShow(true);
        } else {
            dragEntry = this.itemList.get(sourcePosition);
            dragEntry.setShow(false);
        }
        this.itemList.remove(sourcePosition);
        this.itemList.add(targetPosition, dragEntry);
        notifyItemMoved(sourcePosition, targetPosition);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.itemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.itemList.get(position).getType();
    }

    @NotNull
    public final List<DragEntry> getList() {
        return this.itemList;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateList(@NotNull List<DragEntry> dragList) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = dragList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((DragEntry) next).getType() == R.layout.dragview_activity_drag_item_title) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(CollectionsKt.first((List) arrayList2));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : dragList) {
            if (((DragEntry) obj).getType() == R.layout.dragview_activity_drag_item_data) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((DragEntry) obj2).getShow()) {
                arrayList4.add(obj2);
            } else {
                arrayList5.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList4, arrayList5);
        arrayList.addAll(0, a((List) pair.getFirst()));
        if (((List) pair.getSecond()).isEmpty()) {
            String str = e;
            if (str == null) {
                str = "";
            }
            DragEntry dragEntry = new DragEntry(false, false, str, 0, null, null, 48, null);
            dragEntry.setType$dragview_release(R.layout.dragview_activity_drag_item_empty);
            arrayList.add(dragEntry);
        } else {
            arrayList.addAll(a((List) pair.getSecond()));
        }
        this.itemList = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull DragListViewHolder holder, int position) {
        holder.bind(this.itemList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public DragListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return DragListViewHolder.INSTANCE.create(viewType, parent, this.itemTouchHelper);
    }
}
