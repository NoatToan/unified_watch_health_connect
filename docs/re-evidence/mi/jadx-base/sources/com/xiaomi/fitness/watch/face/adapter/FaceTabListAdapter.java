package com.xiaomi.fitness.watch.face.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceTabListAdapter;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.p1j;
import defpackage.t9e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rJ \u0010\u0016\u001a\u00020\u000f2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u0015J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u001c\u0010\u001d\u001a\u00020\u000f2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceTabListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/watch/face/adapter/FaceTabListAdapter$FaceTabListHolder;", "source", "", "showWatchFacePrice", "", "<init>", "(IZ)V", "mList", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "tabName", "", "updateList", "", "list", "", "setTabName", "name", "onItemClickListener", "Lkotlin/Function2;", "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "position", "FaceTabListHolder", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceTabListAdapter extends RecyclerView.Adapter<FaceTabListHolder> {

    @Nullable
    private Function2<? super Integer, ? super FaceData, Unit> onItemClickListener;
    private final boolean showWatchFacePrice;
    private final int source;

    @NotNull
    private final List<FaceData> mList = new ArrayList();

    @NotNull
    private String tabName = "";

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceTabListAdapter$FaceTabListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", DeviceTagInterface.CUSTOM_TAG_TYPE, "", "bindData", "(ILcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "onClick", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "Lt9e;", "binding", "Lt9e;", "<init>", "(Lcom/xiaomi/fitness/watch/face/adapter/FaceTabListAdapter;Lt9e;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class FaceTabListHolder extends RecyclerView.d0 {

        @NotNull
        private final t9e binding;
        final /* synthetic */ FaceTabListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceTabListHolder(@NotNull FaceTabListAdapter faceTabListAdapter, t9e binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = faceTabListAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(FaceTabListAdapter this$0, FaceTabListHolder this$1, FaceData t, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(t, "$t");
            Function2 function2 = this$0.onItemClickListener;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(this$1.getBindingAdapterPosition()), t);
            }
        }

        public final void bindData(int position, @NotNull FaceData t) {
            Intrinsics.checkNotNullParameter(t, "t");
            this.binding.A.setText(t.getDisplay_name());
            FaceManager faceManager = FaceManager.INSTANCE;
            String icon = t.getIcon();
            FaceInfoView preview = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(preview, "preview");
            faceManager.loadFaceUrl(icon, preview, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : FaceIcon.TYPE_MARKET_COMMON_ITEM, (4092 & 1024) != 0 ? 0 : FaceSizeConstant.INSTANCE.getCurrentType(), (4092 & 2048) != 0 ? null : null);
            TextView price = this.binding.C;
            Intrinsics.checkNotNullExpressionValue(price, "price");
            ViewExtKt.visible(price);
            if (!this.this$0.showWatchFacePrice) {
                TextView price2 = this.binding.C;
                Intrinsics.checkNotNullExpressionValue(price2, "price");
                ViewExtKt.gone(price2);
            } else if (t.isPurchaseFace()) {
                this.binding.C.setText(ResourceExtKt.getString(p1j.r0, Float.valueOf(t.getPrice() / 100.0f)));
            } else {
                this.binding.C.setText(ResourceExtKt.getString(p1j.m));
            }
            this.binding.B.setTag(FaceOneTrackUtil.buildTrackContent$default(FaceOneTrackUtil.INSTANCE, t.getId(), "expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.0.0.0.39956"), TuplesKt.to("name", "watchface_single"), TuplesKt.to("asset_id", t.getId()), TuplesKt.to(OneTrack.Param.ASSET_NAME, t.getDisplay_name()), TuplesKt.to(FaceDetailFragment.PAGE_NAME, this.this$0.tabName), TuplesKt.to("source", Integer.valueOf(this.this$0.source)), TuplesKt.to("utm_source", 14), TuplesKt.to("watchface_position_id", Integer.valueOf(position + 1))), 0.0f, 8, null));
        }

        public final void onClick(@NotNull final FaceData t) {
            Intrinsics.checkNotNullParameter(t, "t");
            View root = this.binding.getRoot();
            final FaceTabListAdapter faceTabListAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: x59
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaceTabListAdapter.FaceTabListHolder.onClick$lambda$0(faceTabListAdapter, this, t, view);
                }
            });
        }
    }

    public FaceTabListAdapter(int i, boolean z) {
        this.source = i;
        this.showWatchFacePrice = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mList.size();
    }

    public final void setOnItemClickListener(@NotNull Function2<? super Integer, ? super FaceData, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }

    public final void setTabName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.tabName = name;
    }

    public final void updateList(@NotNull List<FaceData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull FaceTabListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(position, this.mList.get(position));
        holder.onClick(this.mList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public FaceTabListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        t9e t9eVarA0 = t9e.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(t9eVarA0, "inflate(...)");
        return new FaceTabListHolder(this, t9eVarA0);
    }
}
