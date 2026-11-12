package com.xiaomi.fitness.watch.face.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceMarketResourcePoolItemAdapter;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketIndexItem;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.watch.face.helper.ImageLoadUtil;
import com.xiaomi.onetrack.OneTrack;
import defpackage.l39;
import defpackage.p1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tJ\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u001c\u0010 \u001a\u00020\u000b2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceMarketResourcePoolItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceMarketResourcePoolItemAdapter$FaceMarketBasicTabItemAdapterHolder;", "showWatchFacePrice", "", "onItemClickListener", "Lcom/xiaomi/fitness/watch/face/adapter/OnItemClickListener;", "Lkotlin/Function3;", "Landroid/view/View;", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "", "<init>", "(ZLkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "key", "", "columnCount", "name", "mList", "", "source", "setData", "data", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketIndexItem;", "count", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "FaceMarketBasicTabItemAdapterHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceMarketResourcePoolItemAdapter extends RecyclerView.Adapter<FaceMarketBasicTabItemAdapterHolder> {
    private int columnCount;

    @NotNull
    private String key;

    @NotNull
    private final List<FaceData> mList;

    @Nullable
    private String name;

    @NotNull
    private final Function3<View, Integer, FaceData, Unit> onItemClickListener;
    private final boolean showWatchFacePrice;
    private int source;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceMarketResourcePoolItemAdapter$FaceMarketBasicTabItemAdapterHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "faceData", "", "bindData", "(ILcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "Ll39;", "binding", "Ll39;", "<init>", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceMarketResourcePoolItemAdapter;Ll39;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceMarketBasicTabItemAdapterHolder extends RecyclerView.d0 {

        @NotNull
        private final l39 binding;
        final /* synthetic */ FaceMarketResourcePoolItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceMarketBasicTabItemAdapterHolder(@NotNull FaceMarketResourcePoolItemAdapter faceMarketResourcePoolItemAdapter, l39 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceMarketResourcePoolItemAdapter;
            this.binding = binding;
        }

        public final void bindData(int position, @NotNull FaceData faceData) {
            int dp;
            Intrinsics.checkNotNullParameter(faceData, "faceData");
            int currentType = FaceSizeConstant.INSTANCE.getCurrentType();
            if (currentType == 1) {
                dp = ExtUtilsKt.getDp(88);
            } else if (currentType == 2) {
                dp = ExtUtilsKt.getDp(100);
            } else if (currentType != 3) {
                dp = currentType != 4 ? 0 : ExtUtilsKt.getDp(120);
            } else {
                dp = ExtUtilsKt.getDp(Double.valueOf(146.7d));
            }
            int i = dp;
            int i2 = (FaceIcon.WIDTH * i) / FaceIcon.HEIGHT;
            float f = (FaceIcon.RADIUS * i) / FaceIcon.HEIGHT;
            ImageLoadUtil imageLoadUtil = ImageLoadUtil.INSTANCE;
            ImageView faceIcon = this.binding.C;
            Intrinsics.checkNotNullExpressionValue(faceIcon, "faceIcon");
            ImageLoadUtil.load$default(imageLoadUtil, faceIcon, faceData.getIcon(), i2, i, (int) f, null, 32, null);
            this.binding.D.setText(faceData.getDisplay_name());
            TextView faceDes = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(faceDes, "faceDes");
            ViewExtKt.visible(faceDes);
            if (!this.this$0.showWatchFacePrice) {
                TextView faceDes2 = this.binding.B;
                Intrinsics.checkNotNullExpressionValue(faceDes2, "faceDes");
                ViewExtKt.gone(faceDes2);
            } else if (faceData.isPurchaseFace()) {
                this.binding.B.setText(ResourceExtKt.getString(p1j.r0, Float.valueOf(faceData.getPrice() / 100.0f)));
            } else {
                this.binding.B.setText(ResourceExtKt.getString(p1j.m));
            }
            this.binding.C.setTag(FaceOneTrackUtil.buildTrackContent$default(FaceOneTrackUtil.INSTANCE, faceData.getId(), "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.0.0.0.39956"), TuplesKt.to("name", "watchface_single"), TuplesKt.to("asset_id", faceData.getId()), TuplesKt.to(OneTrack.Param.ASSET_NAME, faceData.getDisplay_name()), TuplesKt.to(FaceDetailFragment.PAGE_NAME, ResourceExtKt.getString(p1j.h0)), TuplesKt.to("source", Integer.valueOf(this.this$0.source + 5)), TuplesKt.to("watchface_position_id", Integer.valueOf(position + 1))), 0.0f, 8, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceMarketResourcePoolItemAdapter(boolean z, @NotNull Function3<? super View, ? super Integer, ? super FaceData, Unit> onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.showWatchFacePrice = z;
        this.onItemClickListener = onItemClickListener;
        this.key = "";
        this.columnCount = 3;
        this.mList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(FaceMarketResourcePoolItemAdapter this$0, int i, FaceData face, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(face, "$face");
        Function3<View, Integer, FaceData, Unit> function3 = this$0.onItemClickListener;
        Intrinsics.checkNotNull(view);
        function3.invoke(view, Integer.valueOf(i), face);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mList.size();
    }

    public final void setData(@NotNull DeviceFaceMarketIndexItem data, int count, int position) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.name = data.getName();
        this.key = data.getKey();
        this.columnCount = count;
        this.source = position;
        if (!data.getWatchface_list().isEmpty()) {
            this.mList.clear();
            this.mList.addAll(data.getWatchface_list());
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceMarketBasicTabItemAdapterHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final FaceData faceData = this.mList.get(position);
        holder.bindData(position, faceData);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: q39
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceMarketResourcePoolItemAdapter.onBindViewHolder$lambda$0(this.f31040a, position, faceData, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceMarketBasicTabItemAdapterHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        l39 l39VarA0 = l39.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(l39VarA0, "inflate(...)");
        return new FaceMarketBasicTabItemAdapterHolder(this, l39VarA0);
    }
}
