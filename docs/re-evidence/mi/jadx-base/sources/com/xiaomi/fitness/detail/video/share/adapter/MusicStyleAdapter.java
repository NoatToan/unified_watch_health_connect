package com.xiaomi.fitness.detail.video.share.adapter;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.video.share.adapter.MusicStyleAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bsi;
import defpackage.ivi;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 *2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004*+,-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rJ\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0019J\u0016\u0010\u001f\u001a\u00020\u001b2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\u0014H\u0016J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u001c\u0010'\u001a\u00020\u001b2\n\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020\u0014H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter$PatternStyleItemViewHolder;", "<init>", "()V", "mItemList", "", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicItem;", "getMItemList", "()Ljava/util/List;", "setMItemList", "(Ljava/util/List;)V", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "posVHMap", "", "", "prevSelectedPos", "initialState", "", "mOnItemClickListener", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter$OnItemClickListener;", "setRecyclerView", "", "recyclerView", "setOnItemClickListener", "onItemClickListener", "bindListData", "itemList", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onAttachedToRecyclerView", "onBindViewHolder", "holder", "position", "Companion", "OnItemClickListener", "PatternStyleItemViewHolder", "PatternStyleDecor", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMusicStyleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicStyleAdapter.kt\ncom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1863#2,2:179\n*S KotlinDebug\n*F\n+ 1 MusicStyleAdapter.kt\ncom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter\n*L\n121#1:179,2\n*E\n"})
public final class MusicStyleAdapter extends RecyclerView.Adapter<PatternStyleItemViewHolder> {

    @NotNull
    public static final String TAG = "PatternStyleAdapter";
    public List<MusicItem> mItemList;

    @Nullable
    private OnItemClickListener mOnItemClickListener;
    public RecyclerView mRecyclerView;
    private int prevSelectedPos;

    @NotNull
    private Map<Integer, PatternStyleItemViewHolder> posVHMap = new LinkedHashMap();
    private boolean initialState = true;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter$OnItemClickListener;", "", "onItemClick", "", "styleItem", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicItem;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(@NotNull MusicItem styleItem);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter$PatternStyleItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/detail/video/share/adapter/MusicItem;", "styleItem", "", "bindItem", "(Lcom/xiaomi/fitness/detail/video/share/adapter/MusicItem;)V", "Landroid/widget/ImageView;", "styleIconIv", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "styleNameTv", "Landroid/widget/TextView;", "selectedRing", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "downImg", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMusicStyleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicStyleAdapter.kt\ncom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter$PatternStyleItemViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,178:1\n1#2:179\n54#3,3:180\n24#3:183\n57#3,6:184\n63#3,2:191\n57#4:190\n*S KotlinDebug\n*F\n+ 1 MusicStyleAdapter.kt\ncom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter$PatternStyleItemViewHolder\n*L\n84#1:180,3\n84#1:183\n84#1:184,6\n84#1:191,2\n84#1:190\n*E\n"})
    public final class PatternStyleItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView downImg;

        @NotNull
        private final ProgressBar progressBar;

        @NotNull
        private final ImageView selectedRing;

        @NotNull
        private final ImageView styleIconIv;

        @NotNull
        private final TextView styleNameTv;
        final /* synthetic */ MusicStyleAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PatternStyleItemViewHolder(@NotNull MusicStyleAdapter musicStyleAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = musicStyleAdapter;
            View viewFindViewById = itemView.findViewById(bsi.h7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.styleIconIv = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bsi.j7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.styleNameTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bsi.i7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.selectedRing = (ImageView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(bsi.b5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.progressBar = (ProgressBar) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(bsi.I1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.downImg = (ImageView) viewFindViewById5;
        }

        public final void bindItem(@NotNull MusicItem styleItem) {
            Intrinsics.checkNotNullParameter(styleItem, "styleItem");
            ImageView imageView = this.styleIconIv;
            String iconUrl = styleItem.getIconUrl();
            int length = iconUrl.length();
            Object objValueOf = iconUrl;
            if (length == 0) {
                objValueOf = Integer.valueOf(styleItem.getIconResId());
            }
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(objValueOf).target(imageView).build());
            this.styleIconIv.setContentDescription(styleItem.getName());
            this.styleNameTv.setText(styleItem.getName());
            this.downImg.setVisibility(8);
            this.progressBar.setVisibility(8);
            this.styleIconIv.setAlpha(1.0f);
            ViewExtKt.invisible(this.selectedRing);
            if (styleItem.getState() == 2) {
                this.progressBar.setVisibility(0);
                this.styleIconIv.setAlpha(0.5f);
            }
            if (styleItem.getState() == 0) {
                this.downImg.setVisibility(0);
                this.styleIconIv.setAlpha(0.5f);
            }
            if (styleItem.isSelected()) {
                ViewExtKt.visible(this.selectedRing);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(MusicStyleAdapter this$0, MusicItem styleItem, PatternStyleItemViewHolder holder, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(styleItem, "$styleItem");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.initialState = false;
        Iterator<T> it2 = this$0.getMItemList().iterator();
        while (it2.hasNext()) {
            ((MusicItem) it2.next()).setSelected(false);
        }
        OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onItemClick(styleItem);
            styleItem.setSelected(true);
            this$0.prevSelectedPos = holder.getBindingAdapterPosition();
        }
        return Unit.INSTANCE;
    }

    public final void bindListData(@Nullable List<MusicItem> itemList) {
        List<MusicItem> list = itemList;
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
    public final List<MusicItem> getMItemList() {
        List<MusicItem> list = this.mItemList;
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        setMRecyclerView(recyclerView);
        getMRecyclerView().addItemDecoration(new PatternStyleDecor(this, 36, 0, 2, null));
    }

    public final void setMItemList(@NotNull List<MusicItem> list) {
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

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        setMRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final PatternStyleItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setIsRecyclable(false);
        this.posVHMap.put(Integer.valueOf(position), holder);
        final MusicItem musicItem = getMItemList().get(position);
        holder.bindItem(musicItem);
        ViewExtKt.clickWithTrigger$default(holder.itemView, 0L, new Function1() { // from class: hdg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicStyleAdapter.onBindViewHolder$lambda$1(this.f19951a, musicItem, holder, (View) obj);
            }
        }, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PatternStyleItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.A2, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new PatternStyleItemViewHolder(this, viewInflate);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter$PatternStyleDecor;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "spaceInPixel", "I", "rightMargin", "<init>", "(Lcom/xiaomi/fitness/detail/video/share/adapter/MusicStyleAdapter;II)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
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
            if (childAdapterPosition == MusicStyleAdapter.this.getMItemList().size() - 1) {
                outRect.right = this.rightMargin;
            }
        }

        public /* synthetic */ PatternStyleDecor(MusicStyleAdapter musicStyleAdapter, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? ExtUtilsKt.getDp(12) : i2);
        }
    }
}
