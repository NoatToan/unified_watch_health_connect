package com.xiaomi.fitness.devicesettings.huami.appsort;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortFragment$mCallback$1;
import defpackage.wzi;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortFragment$mCallback$1", "Landroidx/recyclerview/widget/l$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "current", "target", "", "canDropOver", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "viewHolder", "onMove", "", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "isLongPressDragEnabled", "()Z", "", "i", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuaMiAppSortFragment$mCallback$1 extends l.h {
    final /* synthetic */ HuaMiAppSortFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HuaMiAppSortFragment$mCallback$1(HuaMiAppSortFragment huaMiAppSortFragment) {
        super(3, 0);
        this.this$0 = huaMiAppSortFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearView$lambda$0(HuaMiAppSortFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMAdapter().notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.l.e
    public boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 current, RecyclerView.d0 target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(target, "target");
        int bindingAdapterPosition = current.getBindingAdapterPosition();
        int bindingAdapterPosition2 = target.getBindingAdapterPosition();
        HuaMiAppSortBean huaMiAppSortBean = this.this$0.getAppSortBeans().get(bindingAdapterPosition);
        HuaMiAppSortBean huaMiAppSortBean2 = this.this$0.getAppSortBeans().get(bindingAdapterPosition2);
        if (huaMiAppSortBean.isAlwaysShown()) {
            if (!huaMiAppSortBean2.getAppItem().getEnable()) {
                return false;
            }
        } else if (huaMiAppSortBean2.getType() == 1 && !huaMiAppSortBean2.getAppItem().getEnable() && huaMiAppSortBean.getAppItem().getIndex() < huaMiAppSortBean2.getAppItem().getIndex()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
        Context context;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        if (!deviceModel.getIsDeviceConnected() && (context = this.this$0.getContext()) != null) {
            ToastExtKt.toastShort(context, wzi.u);
        }
        if (recyclerView.isComputingLayout()) {
            return;
        }
        Logger.d("appSort:clearView", new Object[0]);
        CollectionsKt__MutableCollectionsJVMKt.sortWith(this.this$0.getAppSortBeans(), HuaMiAppSortFragment.access$getMViewModel(this.this$0).getItemComparator());
        FragmentActivity activity = this.this$0.getActivity();
        Intrinsics.checkNotNull(activity);
        final HuaMiAppSortFragment huaMiAppSortFragment = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: uhc
            @Override // java.lang.Runnable
            public final void run() {
                HuaMiAppSortFragment$mCallback$1.clearView$lambda$0(huaMiAppSortFragment);
            }
        });
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
        Intrinsics.checkNotNull(deviceModel);
        if (!deviceModel.getIsDeviceConnected()) {
            return true;
        }
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = target.getBindingAdapterPosition();
        HuaMiAppSortFragment huaMiAppSortFragment = this.this$0;
        if (huaMiAppSortFragment.isPositionFixed(huaMiAppSortFragment.getAppSortBeans().get(bindingAdapterPosition2).getAppItem())) {
            return true;
        }
        boolean z = this.this$0.getAppSortBeans().get(this.this$0.getAppSortBeans().size() - 1).getType() == 0;
        if (bindingAdapterPosition >= bindingAdapterPosition2) {
            int i = bindingAdapterPosition2 + 1;
            if (i <= bindingAdapterPosition) {
                int i2 = bindingAdapterPosition;
                while (true) {
                    HuaMiAppSortBean huaMiAppSortBean = this.this$0.getAppSortBeans().get(i2);
                    int i3 = i2 - 1;
                    HuaMiAppSortBean huaMiAppSortBean2 = this.this$0.getAppSortBeans().get(i3);
                    if (huaMiAppSortBean2.getType() == 0) {
                        huaMiAppSortBean.getAppItem().setEnable(true);
                        huaMiAppSortBean.setType(1);
                    } else if (huaMiAppSortBean2.getType() == 2) {
                        huaMiAppSortBean.getAppItem().setParentType(-1);
                    }
                    Collections.swap(this.this$0.getAppSortBeans(), i2, i3);
                    if (i2 == i) {
                        break;
                    }
                    i2--;
                }
            }
        } else {
            int i4 = bindingAdapterPosition;
            while (i4 < bindingAdapterPosition2) {
                HuaMiAppSortBean huaMiAppSortBean3 = this.this$0.getAppSortBeans().get(i4);
                int i5 = i4 + 1;
                HuaMiAppSortBean huaMiAppSortBean4 = this.this$0.getAppSortBeans().get(i5);
                if (huaMiAppSortBean4.getType() == 0) {
                    huaMiAppSortBean3.getAppItem().setEnable(false);
                    huaMiAppSortBean3.setType(3);
                } else if (huaMiAppSortBean4.getType() == 2) {
                    huaMiAppSortBean3.getAppItem().setParentType(7);
                }
                Collections.swap(this.this$0.getAppSortBeans(), i4, i5);
                i4 = i5;
            }
        }
        if (!recyclerView.isComputingLayout()) {
            if (!z || this.this$0.getAppSortBeans().get(this.this$0.getAppSortBeans().size() - 1).getType() == 0) {
                this.this$0.getMAdapter().notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
            } else {
                this.this$0.getMAdapter().notifyDataSetChanged();
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSwiped(RecyclerView.d0 viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
