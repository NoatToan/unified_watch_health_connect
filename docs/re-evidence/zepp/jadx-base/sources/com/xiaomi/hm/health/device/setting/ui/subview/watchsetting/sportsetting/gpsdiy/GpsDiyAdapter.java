package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r\u0012\u001a\u0010\u001c\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R0\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R-\u0010\u001c\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u000b0\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyVo;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", "a", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "list", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "onClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsDiyAdapter extends RecyclerView.Adapter<GpsDiyViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private List<? extends GpsDiyVo<? extends GpsSetting>> list;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<GpsDiyVo<? extends GpsSetting>, Unit> onClick;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ GpsDiyVo<? extends GpsSetting> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GpsDiyVo<? extends GpsSetting> gpsDiyVo) {
            super(1);
            this.b = gpsDiyVo;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            GpsDiyAdapter.this.getOnClick().invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GpsDiyAdapter(@NotNull List<? extends GpsDiyVo<? extends GpsSetting>> list, @NotNull Function1<? super GpsDiyVo<? extends GpsSetting>, Unit> function1) {
        this.list = list;
        this.onClick = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.list.size();
    }

    @NotNull
    public final List<GpsDiyVo<? extends GpsSetting>> getList() {
        return this.list;
    }

    @NotNull
    public final Function1<GpsDiyVo<? extends GpsSetting>, Unit> getOnClick() {
        return this.onClick;
    }

    public final void setList(@NotNull List<? extends GpsDiyVo<? extends GpsSetting>> list) {
        this.list = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull GpsDiyViewHolder holder, int position) {
        GpsDiyVo<? extends GpsSetting> gpsDiyVo = this.list.get(position);
        ExtKt.setVisible$default(holder.getMaskView(), !gpsDiyVo.getEnable(), false, 2, null);
        holder.getNameTv().setText(gpsDiyVo.getName());
        holder.getSelectedTv().setText(gpsDiyVo.getSelectItem().shortDesc());
        holder.getTipsTv().setText(gpsDiyVo.getTips());
        ExtKt.smartClick$default(holder.itemView, 0L, new a(gpsDiyVo), 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public GpsDiyViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new GpsDiyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gps_diy, parent, false));
    }
}
