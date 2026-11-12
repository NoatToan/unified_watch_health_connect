package com.xiaomi.fitness.detail.video.share.adapter;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.video.share.adapter.PatternStyleAdapter;
import com.xiaomi.fitness.detail.video.share.model.StyleItem;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bsi;
import defpackage.ivi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 12\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00041234B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011J\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020!J\u0016\u0010&\u001a\u00020\u001e2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nJ\u001c\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0016J\u001c\u0010.\u001a\u00020\u001e2\n\u0010/\u001a\u00060\u0002R\u00020\u00002\u0006\u00100\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u0006R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter$PatternStyleItemViewHolder;", "viewOriginType", "", "<init>", "(I)V", "getViewOriginType", "()I", "mItemList", "", "Lcom/xiaomi/fitness/detail/video/share/model/StyleItem;", "getMItemList", "()Ljava/util/List;", "setMItemList", "(Ljava/util/List;)V", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "posVHMap", "", "prevSelectedPos", "getPrevSelectedPos", "setPrevSelectedPos", "initialState", "", "resetWholeAdapterSelected", "", "selectedPos", "mOnItemClickListener", "Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter$OnItemClickListener;", "setRecyclerView", "recyclerView", "setOnItemClickListener", "onItemClickListener", "bindListData", "itemList", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onAttachedToRecyclerView", "onBindViewHolder", "holder", "position", "Companion", "OnItemClickListener", "PatternStyleItemViewHolder", "PatternStyleDecor", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PatternStyleAdapter extends RecyclerView.Adapter<PatternStyleItemViewHolder> {

    @NotNull
    public static final String TAG = "PatternStyleAdapter";
    public static final int viewTypeShare = 1;
    public static final int viewTypeSportRecord = 2;
    private boolean initialState;
    public List<StyleItem> mItemList;

    @Nullable
    private OnItemClickListener mOnItemClickListener;
    public RecyclerView mRecyclerView;

    @NotNull
    private Map<Integer, PatternStyleItemViewHolder> posVHMap;
    private int prevSelectedPos;
    private final int viewOriginType;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter$OnItemClickListener;", "", "onItemClick", "", "styleItem", "Lcom/xiaomi/fitness/detail/video/share/model/StyleItem;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(@NotNull StyleItem styleItem);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter$PatternStyleItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/detail/video/share/model/StyleItem;", "styleItem", "", "bindItem", "(Lcom/xiaomi/fitness/detail/video/share/model/StyleItem;)V", "", "selected", "setSelected", "(Z)V", "Landroid/widget/ImageView;", "styleIconIv", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "styleNameTv", "Landroid/widget/TextView;", "selectedRing", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nPatternStyleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PatternStyleAdapter.kt\ncom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter$PatternStyleItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,149:1\n54#2,3:150\n24#2:153\n57#2,6:154\n63#2,2:161\n57#3:160\n*S KotlinDebug\n*F\n+ 1 PatternStyleAdapter.kt\ncom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter$PatternStyleItemViewHolder\n*L\n95#1:150,3\n95#1:153\n95#1:154,6\n95#1:161,2\n95#1:160\n*E\n"})
    public final class PatternStyleItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView selectedRing;

        @NotNull
        private final ImageView styleIconIv;

        @NotNull
        private final TextView styleNameTv;
        final /* synthetic */ PatternStyleAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PatternStyleItemViewHolder(@NotNull PatternStyleAdapter patternStyleAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = patternStyleAdapter;
            View viewFindViewById = itemView.findViewById(bsi.h7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.styleIconIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bsi.j7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.styleNameTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bsi.i7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.selectedRing = (ImageView) viewFindViewById3;
        }

        public final void bindItem(@NotNull StyleItem styleItem) {
            Intrinsics.checkNotNullParameter(styleItem, "styleItem");
            ImageView imageView = this.styleIconIv;
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(Integer.valueOf(styleItem.getIconResId())).target(imageView).build());
            this.styleIconIv.setContentDescription(styleItem.getName());
            this.styleNameTv.setText(styleItem.getName());
        }

        public final void setSelected(boolean selected) {
            if (selected) {
                ViewExtKt.visible(this.selectedRing);
            } else {
                ViewExtKt.invisible(this.selectedRing);
            }
        }
    }

    public PatternStyleAdapter() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(PatternStyleAdapter this$0, StyleItem styleItem, int i, PatternStyleItemViewHolder holder, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(styleItem, "$styleItem");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.initialState = false;
        OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(styleItem);
            this$0.resetWholeAdapterSelected(i);
            this$0.prevSelectedPos = holder.getBindingAdapterPosition();
        }
        return Unit.INSTANCE;
    }

    private final void resetWholeAdapterSelected(int selectedPos) {
        PatternStyleItemViewHolder patternStyleItemViewHolder = this.posVHMap.get(Integer.valueOf(this.prevSelectedPos));
        if (patternStyleItemViewHolder != null) {
            patternStyleItemViewHolder.setSelected(false);
        }
        PatternStyleItemViewHolder patternStyleItemViewHolder2 = this.posVHMap.get(Integer.valueOf(selectedPos));
        if (patternStyleItemViewHolder2 != null) {
            patternStyleItemViewHolder2.setSelected(true);
        }
    }

    public final void bindListData(@Nullable List<StyleItem> itemList) {
        List<StyleItem> list = itemList;
        if (list == null || list.isEmpty()) {
            return;
        }
        setMItemList(itemList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        if (getMItemList().isEmpty()) {
            return 0;
        }
        return getMItemList().size();
    }

    @NotNull
    public final List<StyleItem> getMItemList() {
        List<StyleItem> list = this.mItemList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mItemList");
        return null;
    }

    @NotNull
    public final RecyclerView getMRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        return null;
    }

    public final int getPrevSelectedPos() {
        return this.prevSelectedPos;
    }

    public final int getViewOriginType() {
        return this.viewOriginType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        setMRecyclerView(recyclerView);
        getMRecyclerView().addItemDecoration(new PatternStyleDecor(this, 36, 0, 2, null));
    }

    public final void setMItemList(@NotNull List<StyleItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mItemList = list;
    }

    public final void setMRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.mOnItemClickListener = onItemClickListener;
    }

    public final void setPrevSelectedPos(int i) {
        this.prevSelectedPos = i;
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        setMRecyclerView(recyclerView);
    }

    public PatternStyleAdapter(int i) {
        this.viewOriginType = i;
        this.posVHMap = new LinkedHashMap();
        this.initialState = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final PatternStyleItemViewHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setIsRecyclable(false);
        this.posVHMap.put(Integer.valueOf(position), holder);
        final StyleItem styleItem = getMItemList().get(position);
        holder.bindItem(styleItem);
        if (this.viewOriginType == 2) {
            if (this.prevSelectedPos == position) {
                holder.setSelected(true);
            }
        } else if (this.initialState && position == 0) {
            holder.setSelected(true);
        }
        ViewExtKt.clickWithTrigger$default(holder.itemView, 0L, new Function1() { // from class: jmh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PatternStyleAdapter.onBindViewHolder$lambda$0(this.f22926a, styleItem, position, holder, (View) obj);
            }
        }, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PatternStyleItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.viewOriginType == 1 ? LayoutInflater.from(parent.getContext()).inflate(ivi.z2, parent, false) : LayoutInflater.from(parent.getContext()).inflate(ivi.n2, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new PatternStyleItemViewHolder(this, viewInflate);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter$PatternStyleDecor;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "spaceInPixel", "I", "rightMargin", "<init>", "(Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter;II)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PatternStyleDecor extends RecyclerView.n {
        private final int rightMargin;
        private final int spaceInPixel;

        public PatternStyleDecor(int i, int i2) {
            this.spaceInPixel = i;
            this.rightMargin = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition > 0) {
                outRect.left = this.spaceInPixel;
            }
            if (childAdapterPosition == PatternStyleAdapter.this.getMItemList().size() - 1) {
                outRect.right = this.rightMargin;
            }
        }

        public /* synthetic */ PatternStyleDecor(PatternStyleAdapter patternStyleAdapter, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? ExtUtilsKt.getDp(12) : i2);
        }
    }

    public /* synthetic */ PatternStyleAdapter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i);
    }
}
