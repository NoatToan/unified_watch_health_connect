package com.xiaomi.fitness.feedback.bugreport;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.FileUtils;
import defpackage.cri;
import defpackage.hui;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001)B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\fJ\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010%\u001a\u00020\u0010H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedImgAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/feedback/bugreport/FeedImgAdapter$ImgHolder;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mListener", "Lcom/xiaomi/fitness/feedback/bugreport/OnItemClickCallBack;", "mList", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "mInflater", "Landroid/view/LayoutInflater;", "MAX_COUNT", "", "TYPE_IMG", "setOnItemClickCallBack", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "onBindViewHolder", "holder", "pos", "getItemViewType", "position", "isAddIcon", "", "addData", "path", "removeData", "destPath", "", "getItemCount", "onClick", "v", "Landroid/view/View;", "ImgHolder", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeedImgAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedImgAdapter.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedImgAdapter\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,97:1\n54#2,3:98\n24#2:101\n57#2,6:102\n63#2,2:109\n57#3:108\n*S KotlinDebug\n*F\n+ 1 FeedImgAdapter.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedImgAdapter\n*L\n52#1:98,3\n52#1:101\n52#1:102,6\n52#1:109,2\n52#1:108\n*E\n"})
public final class FeedImgAdapter extends RecyclerView.Adapter<ImgHolder> implements View.OnClickListener {

    @Nullable
    private LayoutInflater mInflater;

    @Nullable
    private OnItemClickCallBack mListener;

    @NotNull
    private final ArrayList<Uri> mList = new ArrayList<>();
    private final int MAX_COUNT = 3;
    private final int TYPE_IMG = 17;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedImgAdapter$ImgHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ImgHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImgHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    public FeedImgAdapter(@Nullable Context context) {
        this.mInflater = LayoutInflater.from(context);
    }

    private final boolean isAddIcon(int pos) {
        return pos == getCount() - 1 && this.mList.size() < this.MAX_COUNT;
    }

    public final void addData(@Nullable Uri path) {
        if (path == null) {
            return;
        }
        this.mList.add(0, path);
        if (this.mList.size() < this.MAX_COUNT) {
            notifyItemInserted(0);
        } else {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        int size = this.mList.size();
        int i = this.MAX_COUNT;
        return size >= i ? i : size + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (isAddIcon(position)) {
            return 0;
        }
        return this.TYPE_IMG;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        OnItemClickCallBack onItemClickCallBack = this.mListener;
        Intrinsics.checkNotNull(onItemClickCallBack);
        onItemClickCallBack.onItemClick(v, v.getTag());
    }

    public final void removeData(@Nullable Uri path, @Nullable String destPath) {
        int iIndexOf;
        if (path != null && (iIndexOf = this.mList.indexOf(path)) >= 0) {
            this.mList.remove(path);
            FileUtils.INSTANCE.deleteFile(new File(destPath));
            notifyItemRemoved(iIndexOf);
        }
    }

    public final void setOnItemClickCallBack(@NotNull OnItemClickCallBack listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ImgHolder holder, int pos) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (getItemViewType(pos) != this.TYPE_IMG) {
            holder.itemView.setTag(null);
            return;
        }
        holder.itemView.setTag(this.mList.get(pos));
        ImageView imageView = (ImageView) holder.itemView.findViewById(cri.f14644k);
        Intrinsics.checkNotNull(imageView);
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(this.mList.get(pos)).target(imageView).build());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ImgHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        int itemViewType = getItemViewType(i);
        LayoutInflater layoutInflater = this.mInflater;
        Intrinsics.checkNotNull(layoutInflater);
        View viewInflate = layoutInflater.inflate(itemViewType == this.TYPE_IMG ? hui.n : hui.m, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.setOnClickListener(this);
        return new ImgHolder(viewInflate);
    }
}
