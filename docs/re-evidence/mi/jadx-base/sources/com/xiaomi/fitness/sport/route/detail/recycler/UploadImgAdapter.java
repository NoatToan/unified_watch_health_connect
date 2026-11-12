package com.xiaomi.fitness.sport.route.detail.recycler;

import android.graphics.Rect;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.material.imageview.ShapeableImageView;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.recycler.UploadImgAdapter;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.dvi;
import defpackage.xri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u000e\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000512345B\u0007¢\u0006\u0004\b/\u00100J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u0010J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "pos", "", "isAddButtonPosition", "(I)Z", "Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$OnPicItemClickListener;", "onItemClickListener", "", "setOnItemClickListener", "(Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$OnPicItemClickListener;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "Landroid/net/Uri;", "dataList", "updateDataList", "(Ljava/util/List;)V", SportRecordBundleKey.BUNDLE_PARAM_URI, "addNewPic", "(Landroid/net/Uri;)V", "removePic", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "onAttachedToRecyclerView", "getItemViewType", "(I)I", "", "mUriList", "Ljava/util/List;", "mOnItemClickListener", "Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$OnPicItemClickListener;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "()V", "Companion", "OnPicItemClickListener", "PicItemViewHolder", "PicAddBtnViewHolder", "AddPicItemDecoration", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class UploadImgAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int MAX_PIC_COUNT = 9;

    @NotNull
    public static final String TAG = "UploadImgAdapter";
    public static final int TYPE_PIC_ADD = 2;
    public static final int TYPE_PIC_ITEM = 1;

    @Nullable
    private OnPicItemClickListener mOnItemClickListener;

    @Nullable
    private RecyclerView mRecyclerView;

    @NotNull
    private List<Uri> mUriList = new ArrayList();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$AddPicItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "", "spacing", "I", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter;I)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class AddPicItemDecoration extends RecyclerView.n {
        private final int spacing;

        public AddPicItemDecoration(int i) {
            this.spacing = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            if (parent.getChildAdapterPosition(view) > 0) {
                outRect.left = this.spacing;
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$OnPicItemClickListener;", "", "onRemovePicItemClick", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "onAddButtonClick", "pos", "", "onPicCountChange", "countAdded", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnPicItemClickListener {
        void onAddButtonClick(int pos);

        void onPicCountChange(int countAdded);

        void onRemovePicItemClick(@NotNull Uri uri);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$PicAddBtnViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class PicAddBtnViewHolder extends RecyclerView.d0 {
        final /* synthetic */ UploadImgAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PicAddBtnViewHolder(@NotNull UploadImgAdapter uploadImgAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = uploadImgAdapter;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$PicItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "", "bindData", "(Landroid/net/Uri;)V", "Lcom/google/android/material/imageview/ShapeableImageView;", "picThumbnailIv", "Lcom/google/android/material/imageview/ShapeableImageView;", "getPicThumbnailIv", "()Lcom/google/android/material/imageview/ShapeableImageView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter;Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nUploadImgAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadImgAdapter.kt\ncom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$PicItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,147:1\n54#2,3:148\n24#2:151\n57#2,6:152\n63#2,2:159\n57#3:158\n*S KotlinDebug\n*F\n+ 1 UploadImgAdapter.kt\ncom/xiaomi/fitness/sport/route/detail/recycler/UploadImgAdapter$PicItemViewHolder\n*L\n127#1:148,3\n127#1:151\n127#1:152,6\n127#1:159,2\n127#1:158\n*E\n"})
    public final class PicItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final ShapeableImageView picThumbnailIv;
        final /* synthetic */ UploadImgAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PicItemViewHolder(@NotNull UploadImgAdapter uploadImgAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = uploadImgAdapter;
            View viewFindViewById = itemView.findViewById(xri.m4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.picThumbnailIv = (ShapeableImageView) viewFindViewById;
        }

        public final void bindData(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            ShapeableImageView shapeableImageView = this.picThumbnailIv;
            Coil.imageLoader(shapeableImageView.getContext()).enqueue(new ImageRequest.Builder(shapeableImageView.getContext()).data(uri).target(shapeableImageView).build());
        }

        @NotNull
        public final ShapeableImageView getPicThumbnailIv() {
            return this.picThumbnailIv;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence addNewPic$lambda$0(Uri uri, Uri it) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(it, "it");
        return "uri=" + uri;
    }

    private final boolean isAddButtonPosition(int pos) {
        int size = this.mUriList.size();
        return size < 9 && pos == size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(UploadImgAdapter this$0, Uri uri, ShapeableImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(it, "it");
        OnPicItemClickListener onPicItemClickListener = this$0.mOnItemClickListener;
        if (onPicItemClickListener != null) {
            onPicItemClickListener.onRemovePicItemClick(uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3(UploadImgAdapter this$0, int i, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        OnPicItemClickListener onPicItemClickListener = this$0.mOnItemClickListener;
        if (onPicItemClickListener != null) {
            onPicItemClickListener.onAddButtonClick(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence removePic$lambda$1(Uri uri, Uri it) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(it, "it");
        return "uri=" + uri;
    }

    public final void addNewPic(@NotNull final Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (this.mUriList.size() < 9) {
            this.mUriList.add(uri);
            Logger.d(TAG, "addNewPic uri=" + uri + " mUriList=" + CollectionsKt___CollectionsKt.joinToString$default(this.mUriList, null, null, null, 0, null, new Function1() { // from class: bdq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UploadImgAdapter.addNewPic$lambda$0(uri, (Uri) obj);
                }
            }, 31, null));
            OnPicItemClickListener onPicItemClickListener = this.mOnItemClickListener;
            if (onPicItemClickListener != null) {
                onPicItemClickListener.onPicCountChange(this.mUriList.size());
            }
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        int size = this.mUriList.size();
        if (size >= 9) {
            return 9;
        }
        return size + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return isAddButtonPosition(position) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new AddPicItemDecoration(36));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (!(holder instanceof PicItemViewHolder)) {
            ViewExtKt.clickWithTrigger$default(holder.itemView, 0L, new Function1() { // from class: zcq
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return UploadImgAdapter.onBindViewHolder$lambda$3(this.f41130a, position, (View) obj);
                }
            }, 1, null);
            return;
        }
        final Uri uri = this.mUriList.get(position);
        PicItemViewHolder picItemViewHolder = (PicItemViewHolder) holder;
        picItemViewHolder.bindData(uri);
        ViewExtKt.clickWithTrigger$default(picItemViewHolder.getPicThumbnailIv(), 0L, new Function1() { // from class: ycq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UploadImgAdapter.onBindViewHolder$lambda$2(this.f40053a, uri, (ShapeableImageView) obj);
            }
        }, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(dvi.S0, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new PicItemViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(dvi.R0, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new PicAddBtnViewHolder(this, viewInflate2);
    }

    public final void removePic(@NotNull final Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        int iIndexOf = this.mUriList.indexOf(uri);
        ListExtKt.remove(this.mUriList, iIndexOf);
        Logger.d(TAG, "removePic uri=" + uri + " mUriList=" + CollectionsKt___CollectionsKt.joinToString$default(this.mUriList, null, null, null, 0, null, new Function1() { // from class: adq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UploadImgAdapter.removePic$lambda$1(uri, (Uri) obj);
            }
        }, 31, null));
        OnPicItemClickListener onPicItemClickListener = this.mOnItemClickListener;
        if (onPicItemClickListener != null) {
            onPicItemClickListener.onPicCountChange(this.mUriList.size());
        }
        notifyItemRemoved(iIndexOf);
    }

    public final void setOnItemClickListener(@NotNull OnPicItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.mOnItemClickListener = onItemClickListener;
    }

    public final void setRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.mRecyclerView = recyclerView;
    }

    public final void updateDataList(@Nullable List<? extends Uri> dataList) {
        this.mUriList.clear();
        List<Uri> list = this.mUriList;
        if (dataList == null) {
            dataList = CollectionsKt__CollectionsKt.emptyList();
        }
        list.addAll(dataList);
        notifyDataSetChanged();
    }
}
