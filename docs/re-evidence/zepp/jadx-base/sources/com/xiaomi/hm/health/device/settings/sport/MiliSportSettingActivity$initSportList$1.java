package com.xiaomi.hm.health.device.settings.sport;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u001a\u0010\u0011\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"com/xiaomi/hm/health/device/settings/sport/MiliSportSettingActivity$initSportList$1", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "", "getMovementFlags", "source", "target", "", "onMove", "i", "", "onSwiped", "isLongPressDragEnabled", "actionState", "onSelectedChanged", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MiliSportSettingActivity$initSportList$1 extends ItemTouchHelper.Callback {
    public final /* synthetic */ MiliSportSettingActivity.SportTypeDisplayItemAdapter a;
    public final /* synthetic */ MiliSportSettingActivity b;

    public MiliSportSettingActivity$initSportList$1(MiliSportSettingActivity.SportTypeDisplayItemAdapter sportTypeDisplayItemAdapter, MiliSportSettingActivity miliSportSettingActivity) {
        this.a = sportTypeDisplayItemAdapter;
        this.b = miliSportSettingActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MiliSportSettingActivity.SportTypeDisplayItemAdapter sportTypeDisplayItemAdapter) {
        sportTypeDisplayItemAdapter.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* JADX INFO: renamed from: isLongPressDragEnabled */
    public boolean getIsEnableDrag() {
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder source, @NotNull RecyclerView.ViewHolder target) {
        int adapterPosition = source.getAdapterPosition();
        int adapterPosition2 = target.getAdapterPosition();
        this.a.k(adapterPosition, adapterPosition2);
        this.a.notifyItemMoved(adapterPosition, adapterPosition2);
        List<SportTypeDisplayItem> listD = this.a.d();
        SportTypeViewModel sportTypeViewModel = this.b.sportTypeViewModel;
        Objects.requireNonNull(sportTypeViewModel);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
        Iterator<T> it2 = listD.iterator();
        while (it2.hasNext()) {
            arrayList.add(new SportTypeItem(((SportTypeDisplayItem) it2.next()).getType(), 0, 2, null));
        }
        sportTypeViewModel.setSportTypeSort(new SportTypeConfig(arrayList, this.a.getSupportSort(), this.a.getSupportItemDataSetting()));
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        if (viewHolder == null) {
            RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.sportTypeListView);
            final MiliSportSettingActivity.SportTypeDisplayItemAdapter sportTypeDisplayItemAdapter = this.a;
            recyclerView.post(new Runnable() { // from class: com.xiaomi.hm.health.device.settings.sport.h
                @Override // java.lang.Runnable
                public final void run() {
                    MiliSportSettingActivity$initSportList$1.b(sportTypeDisplayItemAdapter);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
    }
}
