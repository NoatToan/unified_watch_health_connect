package com.xiaomi.fitness.devicesettings.base.worldclock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockAdapter;
import com.xiaomi.fitness.devicesettings.widget.TimeZoneItemView;
import defpackage.eui;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 92\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0004:;<9B\u001f\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u000e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!¢\u0006\u0004\b7\u00108J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00102R\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$WordClockViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "i", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$WordClockViewHolder;", "viewHolder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$WordClockViewHolder;I)V", "", "isEditMode", "setEditStatus", "(Z)V", "select", "selectAll", "getItemCount", "()I", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "(Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$OnItemClickListener;)V", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$DragListener;", "draglistener", "setDragListener", "(Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$DragListener;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "mDataList", "Ljava/util/List;", "mDragListener", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$DragListener;", "mGapPos", "I", "Z", "mSelectedList", "Landroidx/recyclerview/widget/l$e;", "mCallback", "Landroidx/recyclerview/widget/l$e;", "getMCallback", "()Landroidx/recyclerview/widget/l$e;", "setMCallback", "(Landroidx/recyclerview/widget/l$e;)V", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$OnItemClickListener;", "getSelectedList", "()Ljava/util/List;", "selectedList", "dataList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Companion", "OnItemClickListener", "WordClockViewHolder", "DragListener", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WorldClockAdapter extends RecyclerView.Adapter<WordClockViewHolder> {

    @NotNull
    public static final String TAG = "WordClockAdapter";
    private boolean isEditMode;

    @NotNull
    private l.e mCallback;

    @NotNull
    private final Context mContext;

    @NotNull
    private List<TimeZoneItem> mDataList;

    @Nullable
    private DragListener mDragListener;
    private int mGapPos;

    @NotNull
    private final List<TimeZoneItem> mSelectedList;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$DragListener;", "", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "", "startDragItem", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "endDrag", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public interface DragListener {
        void endDrag();

        void startDragItem(@Nullable RecyclerView.d0 holder);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&J$\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "wordClockBean", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "isAllSelected", "", "onItemLongClick", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(@Nullable View view, int position, @Nullable TimeZoneItem wordClockBean, boolean isAllSelected);

        void onItemLongClick(@Nullable View view, int position, @Nullable TimeZoneItem wordClockBean);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$WordClockViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/devicesettings/widget/TimeZoneItemView;", "timeZoneItemView", "Lcom/xiaomi/fitness/devicesettings/widget/TimeZoneItemView;", "getTimeZoneItemView", "()Lcom/xiaomi/fitness/devicesettings/widget/TimeZoneItemView;", "setTimeZoneItemView", "(Lcom/xiaomi/fitness/devicesettings/widget/TimeZoneItemView;)V", "Landroid/widget/ImageView;", "checkBoxView", "Landroid/widget/ImageView;", "getCheckBoxView", "()Landroid/widget/ImageView;", "setCheckBoxView", "(Landroid/widget/ImageView;)V", "sortImg", "getSortImg", "setSortImg", "itemView", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class WordClockViewHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView checkBoxView;

        @NotNull
        private View contentView;

        @NotNull
        private ImageView sortImg;

        @NotNull
        private TimeZoneItemView timeZoneItemView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WordClockViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.contentView = itemView;
            View viewFindViewById = itemView.findViewById(zqi.U0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.timeZoneItemView = (TimeZoneItemView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(zqi.C0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.checkBoxView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(zqi.N3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.sortImg = (ImageView) viewFindViewById3;
        }

        @NotNull
        public final ImageView getCheckBoxView() {
            return this.checkBoxView;
        }

        @NotNull
        public final View getContentView() {
            return this.contentView;
        }

        @NotNull
        public final ImageView getSortImg() {
            return this.sortImg;
        }

        @NotNull
        public final TimeZoneItemView getTimeZoneItemView() {
            return this.timeZoneItemView;
        }

        public final void setCheckBoxView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.checkBoxView = imageView;
        }

        public final void setContentView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.contentView = view;
        }

        public final void setSortImg(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.sortImg = imageView;
        }

        public final void setTimeZoneItemView(@NotNull TimeZoneItemView timeZoneItemView) {
            Intrinsics.checkNotNullParameter(timeZoneItemView, "<set-?>");
            this.timeZoneItemView = timeZoneItemView;
        }
    }

    public WorldClockAdapter(@NotNull Context mContext, @NotNull List<TimeZoneItem> dataList) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.mContext = mContext;
        this.mDataList = dataList;
        this.mSelectedList = new ArrayList();
        this.mCallback = new l.h() { // from class: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockAdapter$mCallback$1
            {
                super(3, 0);
            }

            @Override // androidx.recyclerview.widget.l.e
            public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                super.clearView(recyclerView, viewHolder);
                Logger.d(WorldClockAdapter.TAG, "clearView: ");
                if (recyclerView.isComputingLayout()) {
                    return;
                }
                this.this$0.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean isLongPressDragEnabled() {
                return false;
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, RecyclerView.d0 target) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Intrinsics.checkNotNullParameter(target, "target");
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = target.getAdapterPosition();
                Logger.d(WorldClockAdapter.TAG, "onMove: " + adapterPosition + " " + adapterPosition2);
                if (target instanceof WorldClockAdapter.WordClockViewHolder) {
                    this.this$0.mGapPos = adapterPosition;
                }
                Logger.d(WorldClockAdapter.TAG, "gap pos: " + this.this$0.mGapPos + "  or " + (adapterPosition2 < this.this$0.mGapPos));
                Collections.swap(this.this$0.mDataList, adapterPosition, adapterPosition2);
                int itemCount = this.this$0.getItemCount() - 1;
                if (!recyclerView.isComputingLayout()) {
                    if (adapterPosition2 == itemCount) {
                        Logger.d(WorldClockAdapter.TAG, "onMove: start has disable");
                        this.this$0.notifyDataSetChanged();
                    } else {
                        this.this$0.notifyItemMoved(adapterPosition, adapterPosition2);
                    }
                }
                if (this.this$0.mDragListener != null) {
                    WorldClockAdapter.DragListener dragListener = this.this$0.mDragListener;
                    Intrinsics.checkNotNull(dragListener);
                    dragListener.endDrag();
                }
                return true;
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSwiped(RecyclerView.d0 viewHolder, int i) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$0(WorldClockAdapter this$0, WordClockViewHolder viewHolder, View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0) {
            return false;
        }
        DragListener dragListener = this$0.mDragListener;
        Intrinsics.checkNotNull(dragListener);
        dragListener.startDragItem(viewHolder);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(WorldClockAdapter this$0, int i, TimeZoneItem wordClockBean, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(wordClockBean, "$wordClockBean");
        TimeZoneItem timeZoneItem = this$0.mDataList.get(i);
        if (this$0.mSelectedList.contains(timeZoneItem)) {
            this$0.mSelectedList.remove(timeZoneItem);
        } else {
            this$0.mSelectedList.add(timeZoneItem);
        }
        this$0.notifyDataSetChanged();
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        Intrinsics.checkNotNull(onItemClickListener);
        onItemClickListener.onItemClick(view, i, wordClockBean, this$0.mSelectedList.size() == this$0.mDataList.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$2(WorldClockAdapter this$0, WordClockViewHolder viewHolder, int i, TimeZoneItem wordClockBean, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(wordClockBean, "$wordClockBean");
        if (this$0.isEditMode) {
            return true;
        }
        this$0.isEditMode = true;
        Object tag = viewHolder.getContentView().getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.base.worldclock.TimeZoneItem");
        this$0.mSelectedList.add((TimeZoneItem) tag);
        this$0.notifyDataSetChanged();
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        Intrinsics.checkNotNull(onItemClickListener);
        onItemClickListener.onItemLongClick(view, i, wordClockBean);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @NotNull
    public final l.e getMCallback() {
        return this.mCallback;
    }

    @NotNull
    public final List<TimeZoneItem> getSelectedList() {
        return this.mSelectedList;
    }

    public final void selectAll(boolean select) {
        if (select) {
            this.mSelectedList.clear();
            List<TimeZoneItem> list = this.mSelectedList;
            List<TimeZoneItem> list2 = this.mDataList;
            Intrinsics.checkNotNull(list2);
            list.addAll(list2);
        } else {
            this.mSelectedList.clear();
        }
        notifyDataSetChanged();
    }

    public final void setDragListener(@Nullable DragListener draglistener) {
        this.mDragListener = draglistener;
    }

    public final void setEditStatus(boolean isEditMode) {
        this.isEditMode = isEditMode;
        notifyDataSetChanged();
    }

    public final void setMCallback(@NotNull l.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.mCallback = eVar;
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final WordClockViewHolder viewHolder, final int position) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        final TimeZoneItem timeZoneItem = this.mDataList.get(position);
        if (timeZoneItem == null) {
            return;
        }
        viewHolder.getCheckBoxView().setTag(timeZoneItem);
        viewHolder.getContentView().setTag(timeZoneItem);
        viewHolder.getTimeZoneItemView().a(timeZoneItem);
        if (this.isEditMode) {
            viewHolder.getCheckBoxView().setVisibility(0);
            viewHolder.getTimeZoneItemView().setTimeVisible(4);
            viewHolder.getCheckBoxView().setSelected(this.mSelectedList.contains(timeZoneItem));
            ImageView sortImg = viewHolder.getSortImg();
            Intrinsics.checkNotNull(sortImg);
            sortImg.setOnTouchListener(new View.OnTouchListener() { // from class: xnr
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return WorldClockAdapter.onBindViewHolder$lambda$0(this.f39294a, viewHolder, view, motionEvent);
                }
            });
        } else {
            viewHolder.getCheckBoxView().setVisibility(8);
            viewHolder.getSortImg().setVisibility(8);
            viewHolder.getTimeZoneItemView().setTimeVisible(0);
        }
        viewHolder.getContentView().setOnClickListener(new View.OnClickListener() { // from class: ynr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WorldClockAdapter.onBindViewHolder$lambda$1(this.f40351a, position, timeZoneItem, view);
            }
        });
        viewHolder.getContentView().setOnLongClickListener(new View.OnLongClickListener() { // from class: znr
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return WorldClockAdapter.onBindViewHolder$lambda$2(this.f41503a, viewHolder, position, timeZoneItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public WordClockViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.mContext).inflate(eui.w1, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new WordClockViewHolder(viewInflate);
    }
}
