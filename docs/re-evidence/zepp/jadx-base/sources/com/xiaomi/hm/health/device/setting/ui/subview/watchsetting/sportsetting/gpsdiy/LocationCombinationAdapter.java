package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bloodoxygen.ui.utils.ExtensionsKt;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.LocationCombinationAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R)\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LocationCombinationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LocationCombinationHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LocateCombinationVo;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getVos", "()Ljava/util/ArrayList;", "vos", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LocationCombinationAdapter extends RecyclerView.Adapter<LocationCombinationHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<LocateCombinationVo> vos;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<Integer, Unit> listener;

    /* JADX WARN: Multi-variable type inference failed */
    public LocationCombinationAdapter(@NotNull ArrayList<LocateCombinationVo> arrayList, @NotNull Function1<? super Integer, Unit> function1) {
        this.vos = arrayList;
        this.listener = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LocationCombinationAdapter locationCombinationAdapter, int i, View view) {
        locationCombinationAdapter.getListener().invoke(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.vos.size();
    }

    @NotNull
    public final Function1<Integer, Unit> getListener() {
        return this.listener;
    }

    @NotNull
    public final ArrayList<LocateCombinationVo> getVos() {
        return this.vos;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull LocationCombinationHolder holder, final int position) {
        LocateCombinationVo locateCombinationVo = this.vos.get(position);
        holder.getTitleTv().setText(locateCombinationVo.getCombination().shortDesc());
        ExtensionsKt.setVisible(holder.getSelectedImg(), locateCombinationVo.getSelected());
        holder.getAccuracyLevelView().setLevel(locateCombinationVo.getCombination().getAccuracy());
        holder.getConsumptionLevelView().setLevel(locateCombinationVo.getCombination().getPowerConsume());
        holder.getCom.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY java.lang.String().setOnClickListener(new View.OnClickListener() { // from class: gr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocationCombinationAdapter.b(this.a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public LocationCombinationHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new LocationCombinationHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_locate_combination, parent, false));
    }
}
