package com.xiaomi.fitness.watch.face.market.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.watch.face.market.search.FaceSearchAdapter;
import com.xiaomi.fitness.watch.face.view.FaceImageView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.f39;
import defpackage.p1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B%\u0012\u001c\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\u0004¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\u00020\b2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0006H\u0016R&\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005j\u0002`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/search/FaceSearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/market/search/FaceSearchAdapter$FaceSearchHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/watch/face/market/search/OnFaceSearchClickListener;", "Lkotlin/Function2;", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "mList", "", "updateList", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceSearchHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceSearchAdapter extends RecyclerView.Adapter<FaceSearchHolder> {

    @NotNull
    private final Function2<Integer, FaceData, Unit> listener;

    @NotNull
    private final List<FaceData> mList;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/search/FaceSearchAdapter$FaceSearchHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "data", "", "onBind", "(ILcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "onClick", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "Lf39;", "binding", "Lf39;", "<init>", "(Lcom/xiaomi/fitness/watch/face/market/search/FaceSearchAdapter;Lf39;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceSearchHolder extends RecyclerView.d0 {

        @NotNull
        private final f39 binding;
        final /* synthetic */ FaceSearchAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceSearchHolder(@NotNull FaceSearchAdapter faceSearchAdapter, f39 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceSearchAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(FaceSearchAdapter this$0, FaceSearchHolder this$1, FaceData data, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(data, "$data");
            this$0.listener.invoke(Integer.valueOf(this$1.getBindingAdapterPosition()), data);
        }

        public final void onBind(int position, @NotNull FaceData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            FaceManager faceManager = FaceManager.INSTANCE;
            String icon = data.getIcon();
            FaceImageView mImageView = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(mImageView, "mImageView");
            faceManager.loadFaceUrl(icon, mImageView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            this.binding.C.setText(data.getDisplay_name());
            String string = ApplicationExtKt.getApplication().getString(p1j.e1, Float.valueOf(data.getFileSize() / 1048576.0f));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this.binding.D.setText(string);
            this.binding.B.setTag(FaceOneTrackUtil.buildTrackContent$default(FaceOneTrackUtil.INSTANCE, data.getId(), "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.0.0.0.39956"), TuplesKt.to("name", "watchface_single"), TuplesKt.to("asset_id", data.getId()), TuplesKt.to(OneTrack.Param.ASSET_NAME, data.getDisplay_name()), TuplesKt.to("source", 21), TuplesKt.to("utm_source", 14), TuplesKt.to("watchface_position_id", Integer.valueOf(position + 1))), 0.0f, 8, null));
        }

        public final void onClick(@NotNull final FaceData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            View root = this.binding.getRoot();
            final FaceSearchAdapter faceSearchAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: a59
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceSearchAdapter.FaceSearchHolder.onClick$lambda$0(faceSearchAdapter, this, data, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaceSearchAdapter(@NotNull Function2<? super Integer, ? super FaceData, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.mList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mList.size();
    }

    public final void updateList(@NotNull List<FaceData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceSearchHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FaceData faceData = this.mList.get(position);
        holder.onBind(position, faceData);
        holder.onClick(faceData);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceSearchHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        f39 f39VarA0 = f39.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(f39VarA0, "inflate(...)");
        return new FaceSearchHolder(this, f39VarA0);
    }
}
