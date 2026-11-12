package com.xiaomi.fitness.devicesettings.huami.typesort;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortFragment$mCallback$1;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import defpackage.nuf;
import defpackage.wzi;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0010¨\u0006\u0017"}, d2 = {"com/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortFragment$mCallback$1", "Landroidx/recyclerview/widget/l$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "current", "target", "", "canDropOver", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "viewHolder", "onMove", "", "actionState", "", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "isLongPressDragEnabled", "()Z", "i", "onSwiped", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportTypeSortFragment$mCallback$1 extends l.h {
    final /* synthetic */ SportTypeSortFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportTypeSortFragment$mCallback$1(SportTypeSortFragment sportTypeSortFragment) {
        super(3, 0);
        this.this$0 = sportTypeSortFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearView$lambda$1(SportTypeSortFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMAdapter().notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 current, RecyclerView.d0 target) {
        Product product;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(target, "target");
        WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
        return deviceModel == null || (product = deviceModel.getProduct()) == null || !DeviceModelExtKt.isPanGu(product) || target.getBindingAdapterPosition() != 0;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
        Context context;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        nuf.c(viewHolder.itemView);
        WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
        if (deviceModel != null && !deviceModel.getIsDeviceConnected() && (context = this.this$0.getContext()) != null) {
            ToastExtKt.toastShort(context, wzi.u);
        }
        if (!this.this$0.isListChanged() || recyclerView.isComputingLayout()) {
            return;
        }
        Logger.d("appSort:clearView", new Object[0]);
        CollectionsKt__MutableCollectionsJVMKt.sortWith(this.this$0.sportTypeSortBeans, SportTypeSortFragment.access$getMViewModel(this.this$0).getMItemComparator());
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            final SportTypeSortFragment sportTypeSortFragment = this.this$0;
            activity.runOnUiThread(new Runnable() { // from class: k5o
                @Override // java.lang.Runnable
                public final void run() {
                    SportTypeSortFragment$mCallback$1.clearView$lambda$1(sportTypeSortFragment);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, RecyclerView.d0 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
        if (deviceModel != null && !deviceModel.getIsDeviceConnected()) {
            return true;
        }
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = target.getBindingAdapterPosition();
        boolean z = ((SportTypeSortBean) this.this$0.sportTypeSortBeans.get(this.this$0.sportTypeSortBeans.size() - 1)).getType() == 0;
        if (bindingAdapterPosition >= bindingAdapterPosition2) {
            int i = bindingAdapterPosition2 + 1;
            if (i <= bindingAdapterPosition) {
                int i2 = bindingAdapterPosition;
                while (true) {
                    SportTypeSortBean sportTypeSortBean = (SportTypeSortBean) this.this$0.sportTypeSortBeans.get(i2);
                    int i3 = i2 - 1;
                    if (((SportTypeSortBean) this.this$0.sportTypeSortBeans.get(i3)).getType() == 0) {
                        sportTypeSortBean.setSportTypeSort(new SportTypeItem(sportTypeSortBean.getSportTypeSort().getType(), 1));
                        sportTypeSortBean.setType(1);
                    }
                    Collections.swap(this.this$0.sportTypeSortBeans, i2, i3);
                    if (i2 == i) {
                        break;
                    }
                    i2--;
                }
            }
        } else {
            int i4 = bindingAdapterPosition;
            while (i4 < bindingAdapterPosition2) {
                SportTypeSortBean sportTypeSortBean2 = (SportTypeSortBean) this.this$0.sportTypeSortBeans.get(i4);
                int i5 = i4 + 1;
                if (((SportTypeSortBean) this.this$0.sportTypeSortBeans.get(i5)).getType() == 0) {
                    sportTypeSortBean2.setSportTypeSort(new SportTypeItem(sportTypeSortBean2.getSportTypeSort().getType(), 0));
                    sportTypeSortBean2.setType(3);
                }
                Collections.swap(this.this$0.sportTypeSortBeans, i4, i5);
                i4 = i5;
            }
        }
        if (!recyclerView.isComputingLayout()) {
            if (!z || ((SportTypeSortBean) this.this$0.sportTypeSortBeans.get(this.this$0.sportTypeSortBeans.size() - 1)).getType() == 0) {
                this.this$0.getMAdapter().notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
            } else {
                this.this$0.getMAdapter().notifyDataSetChanged();
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSelectedChanged(RecyclerView.d0 viewHolder, int actionState) {
        View view;
        super.onSelectedChanged(viewHolder, actionState);
        if (viewHolder == null || (view = viewHolder.itemView) == null) {
            return;
        }
        nuf.d(view);
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSwiped(RecyclerView.d0 viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
