package com.xiaomi.fitness.health.threetarget.adpter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.health.threetarget.adpter.ShareSelectBgImgListAdapter;
import com.xiaomi.fitness.util.UrlConstants;
import defpackage.eri;
import defpackage.jui;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u001c\u0010\"\u001a\u00020\n2\n\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020\u0007H\u0016J\b\u0010%\u001a\u00020\u0007H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSelectBgImgListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSelectBgImgListAdapter$ItemViewHolder;", "context", "Landroid/app/Activity;", "dataList", "", "", "itemClickListener", "Lkotlin/Function1;", "", "<init>", "(Landroid/app/Activity;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "selectIndex", "getSelectIndex", "()I", "setSelectIndex", "(I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "ItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareSelectBgImgListAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    @NotNull
    private Activity context;

    @NotNull
    private List<Integer> dataList;

    @NotNull
    private Function1<? super Integer, Unit> itemClickListener;
    private int selectIndex;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSelectBgImgListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindView", "(I)V", "Landroid/widget/ImageView;", "bgView", "Landroid/widget/ImageView;", "getBgView", "()Landroid/widget/ImageView;", "setBgView", "(Landroid/widget/ImageView;)V", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSelectBgImgListAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nShareSelectBgImgListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareSelectBgImgListAdapter.kt\ncom/xiaomi/fitness/health/threetarget/adpter/ShareSelectBgImgListAdapter$ItemViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,60:1\n54#2,3:61\n24#2:64\n59#2,6:65\n*S KotlinDebug\n*F\n+ 1 ShareSelectBgImgListAdapter.kt\ncom/xiaomi/fitness/health/threetarget/adpter/ShareSelectBgImgListAdapter$ItemViewHolder\n*L\n39#1:61,3\n39#1:64\n39#1:65,6\n*E\n"})
    public final class ItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView bgView;
        final /* synthetic */ ShareSelectBgImgListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(@NotNull ShareSelectBgImgListAdapter shareSelectBgImgListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = shareSelectBgImgListAdapter;
            View viewFindViewById = itemView.findViewById(eri.p0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.bgView = (ImageView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindView$lambda$1(ShareSelectBgImgListAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.setSelectIndex(i);
            this$0.getItemClickListener().invoke2(Integer.valueOf(i));
            this$0.notifyDataSetChanged();
        }

        public final void bindView(final int position) {
            ImageView imageView = this.bgView;
            String strShareFdsUrl = UrlConstants.INSTANCE.shareFdsUrl(position, false);
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(strShareFdsUrl).target(imageView);
            builderTarget.transformations(new RoundedCornersTransformation(DisplayUtil.dip2px(16.0f)));
            imageLoader.enqueue(builderTarget.build());
            if (position == this.this$0.getSelectIndex()) {
                this.itemView.setBackgroundResource(pni.V0);
            } else {
                this.itemView.setBackground(null);
            }
            View view = this.itemView;
            final ShareSelectBgImgListAdapter shareSelectBgImgListAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: r7m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShareSelectBgImgListAdapter.ItemViewHolder.bindView$lambda$1(shareSelectBgImgListAdapter, position, view2);
                }
            });
        }

        @NotNull
        public final ImageView getBgView() {
            return this.bgView;
        }

        public final void setBgView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.bgView = imageView;
        }
    }

    public ShareSelectBgImgListAdapter(@NotNull Activity context, @NotNull List<Integer> dataList, @NotNull Function1<? super Integer, Unit> itemClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        this.context = context;
        this.dataList = dataList;
        this.itemClickListener = itemClickListener;
    }

    @NotNull
    public final Activity getContext() {
        return this.context;
    }

    @NotNull
    public final List<Integer> getDataList() {
        return this.dataList;
    }

    @NotNull
    public final Function1<Integer, Unit> getItemClickListener() {
        return this.itemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    public final int getSelectIndex() {
        return this.selectIndex;
    }

    public final void setContext(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<set-?>");
        this.context = activity;
    }

    public final void setDataList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setItemClickListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.itemClickListener = function1;
    }

    public final void setSelectIndex(int i) {
        this.selectIndex = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindView(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(jui.b4, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ItemViewHolder(this, viewInflate);
    }
}
