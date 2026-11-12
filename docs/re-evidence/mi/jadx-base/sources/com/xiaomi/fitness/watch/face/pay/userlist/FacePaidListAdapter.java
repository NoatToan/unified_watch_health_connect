package com.xiaomi.fitness.watch.face.pay.userlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.watch.face.pay.userlist.FacePaidListAdapter;
import com.xiaomi.fitness.watch.face.view.FaceImageView;
import defpackage.b9e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007j\u0002`\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u001c\u0010\u0018\u001a\u00020\n2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007j\u0002`\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter$FacePaidListHolder;", "source", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/watch/face/pay/userlist/OnFacePaidItemClickListener;", "Lkotlin/Function2;", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "faceList", "", "Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidItem;", "setDataList", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "FacePaidListHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FacePaidListAdapter extends RecyclerView.Adapter<FacePaidListHolder> {

    @NotNull
    private final List<FacePaidItem> faceList;

    @NotNull
    private final Function2<Integer, FaceData, Unit> listener;

    @NotNull
    private final String source;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter$FacePaidListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidItem;", "item", "", "bindData", "(ILcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidItem;)V", "onClick", "(Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidItem;)V", "Lb9e;", "binding", "Lb9e;", "<init>", "(Lcom/xiaomi/fitness/watch/face/pay/userlist/FacePaidListAdapter;Lb9e;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FacePaidListHolder extends RecyclerView.d0 {

        @NotNull
        private final b9e binding;
        final /* synthetic */ FacePaidListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacePaidListHolder(@NotNull FacePaidListAdapter facePaidListAdapter, b9e binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = facePaidListAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$2(FacePaidListAdapter this$0, FacePaidListHolder this$1, FacePaidItem item, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(item, "$item");
            this$0.listener.invoke(Integer.valueOf(this$1.getBindingAdapterPosition()), item.getData());
        }

        public final void bindData(int position, @NotNull FacePaidItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            FaceData data = item.getData();
            AnyExtKt.main$default(null, new FacePaidListAdapter$FacePaidListHolder$bindData$1(data, this, null), 1, null);
            FaceManager faceManager = FaceManager.INSTANCE;
            String icon = data.getIcon();
            FaceImageView mImageView = this.binding.D;
            Intrinsics.checkNotNullExpressionValue(mImageView, "mImageView");
            faceManager.loadFaceUrl(icon, mImageView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            this.binding.E.setText(data.getDisplay_name());
            TextView mTagView = this.binding.H;
            Intrinsics.checkNotNullExpressionValue(mTagView, "mTagView");
            ViewExtKt.setVisible(mTagView, data.buyWithVip());
            TextView mStateView = this.binding.F;
            Intrinsics.checkNotNullExpressionValue(mStateView, "mStateView");
            ViewExtKt.gone(mStateView);
            FaceOneTrackUtil faceOneTrackUtil = FaceOneTrackUtil.INSTANCE;
            Map mapBuildTrackMap = faceOneTrackUtil.buildTrackMap(data, "user_content", "paid_notinstalled", (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null);
            String id = data.getId();
            FacePaidListAdapter facePaidListAdapter = this.this$0;
            mapBuildTrackMap.put("watchface_position_id", Integer.valueOf(position + 1));
            mapBuildTrackMap.put("source", facePaidListAdapter.source);
            mapBuildTrackMap.put("tip", "56.0.0.0.39956");
            mapBuildTrackMap.put("name", "watchface_single");
            Unit unit = Unit.INSTANCE;
            this.binding.D.setTag(FaceOneTrackUtil.buildTrackContent$default(faceOneTrackUtil, id, "expose_v3", MapsKt__MapsKt.toMap(mapBuildTrackMap), 0.0f, 8, null));
            long jCurrentTimeMillis = System.currentTimeMillis() - item.getLoadTime();
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            mapBuildTrackMap.put("tip", "56.82.0.1.41529");
            mapBuildTrackMap.put("name", "watchface_loading_time");
            mapBuildTrackMap.put("duration_msec", Long.valueOf(jCurrentTimeMillis));
            oneTrackExtKt.reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, MapsKt__MapsKt.toMap(mapBuildTrackMap));
        }

        public final void onClick(@NotNull final FacePaidItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            View root = this.binding.getRoot();
            final FacePaidListAdapter facePaidListAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: m49
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FacePaidListAdapter.FacePaidListHolder.onClick$lambda$2(facePaidListAdapter, this, item, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FacePaidListAdapter(@NotNull String source, @NotNull Function2<? super Integer, ? super FaceData, Unit> listener) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.source = source;
        this.listener = listener;
        this.faceList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.faceList.size();
    }

    public final void setDataList(@NotNull List<FacePaidItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.faceList.clear();
        this.faceList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FacePaidListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FacePaidItem facePaidItem = this.faceList.get(position);
        holder.bindData(position, facePaidItem);
        holder.onClick(facePaidItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FacePaidListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        b9e b9eVarA0 = b9e.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(b9eVarA0, "inflate(...)");
        return new FacePaidListHolder(this, b9eVarA0);
    }
}
