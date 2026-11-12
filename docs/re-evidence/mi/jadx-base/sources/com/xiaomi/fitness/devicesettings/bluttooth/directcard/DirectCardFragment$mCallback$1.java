package com.xiaomi.fitness.devicesettings.bluttooth.directcard;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardFragment$mCallback$1;
import defpackage.cji;
import defpackage.wzi;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"com/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$mCallback$1", "Landroidx/recyclerview/widget/l$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "target", "", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "", "actionState", "", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "isLongPressDragEnabled", "()Z", "i", "onSwiped", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DirectCardFragment$mCallback$1 extends l.h {
    final /* synthetic */ DirectCardFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectCardFragment$mCallback$1(DirectCardFragment directCardFragment) {
        super(3, 0);
        this.this$0 = directCardFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearView$lambda$0(DirectCardFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DirectCardFragment.MyAdapter myAdapter = this$0.mMyAdapter;
        if (myAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
            myAdapter = null;
        }
        myAdapter.notifyDataSetChanged();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    @Override // androidx.recyclerview.widget.l.e
    public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
        Context context;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        if (this.this$0.deviceModel != null) {
            WearableDeviceModel wearableDeviceModel = this.this$0.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            if (!wearableDeviceModel.getIsDeviceConnected()) {
                context = this.this$0.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, wzi.u);
                }
            }
        } else {
            context = this.this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.u);
            }
        }
        if (viewHolder instanceof DirectCardFragment.MyViewHolder) {
            viewHolder.itemView.setBackgroundColor(this.this$0.getResources().getColor(cji.common_transparent));
        }
        if (this.this$0.isListChanged()) {
            this.this$0.saveList();
            if (recyclerView.isComputingLayout()) {
                return;
            }
            FragmentActivity activity = this.this$0.getActivity();
            Intrinsics.checkNotNull(activity);
            final DirectCardFragment directCardFragment = this.this$0;
            activity.runOnUiThread(new Runnable() { // from class: sx6
                @Override // java.lang.Runnable
                public final void run() {
                    DirectCardFragment$mCallback$1.clearView$lambda$0(directCardFragment);
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
        if (this.this$0.deviceModel != null) {
            WearableDeviceModel wearableDeviceModel = this.this$0.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            if (wearableDeviceModel.getIsDeviceConnected()) {
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                int bindingAdapterPosition2 = target.getBindingAdapterPosition();
                DirectCardFragment.Item item = (DirectCardFragment.Item) this.this$0.mDataList.get(bindingAdapterPosition2);
                if (bindingAdapterPosition < bindingAdapterPosition2) {
                    if (this.this$0.isResident(item)) {
                        return true;
                    }
                } else {
                    if (this.this$0.isHeadResident(item)) {
                        return true;
                    }
                    int i = bindingAdapterPosition2 - 1;
                    if (i >= 0) {
                        DirectCardFragment directCardFragment = this.this$0;
                        if (directCardFragment.isResident((DirectCardFragment.Item) directCardFragment.mDataList.get(i))) {
                            return true;
                        }
                    }
                }
                boolean z = ((DirectCardFragment.Item) this.this$0.mDataList.get(this.this$0.mDataList.size() - 1)).getType() == this.this$0.ITEM_TYPE_HIDE_LABEL;
                if (bindingAdapterPosition >= bindingAdapterPosition2) {
                    int i2 = bindingAdapterPosition2 + 1;
                    if (i2 <= bindingAdapterPosition) {
                        int i3 = bindingAdapterPosition;
                        while (true) {
                            DirectCardFragment.Item item2 = (DirectCardFragment.Item) this.this$0.mDataList.get(i3);
                            int i4 = i3 - 1;
                            DirectCardFragment.Item item3 = (DirectCardFragment.Item) this.this$0.mDataList.get(i4);
                            int targetIndex = item2.getTargetIndex();
                            item2.setTargetIndex(item3.getTargetIndex());
                            item3.setTargetIndex(targetIndex);
                            if (item3.getType() == this.this$0.ITEM_TYPE_HIDE_LABEL) {
                                item2.setHide(false);
                                item2.setType(this.this$0.ITEM_TYPE_DATA);
                            }
                            Collections.swap(this.this$0.mDataList, i3, i4);
                            if (i3 == i2) {
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    int i5 = bindingAdapterPosition;
                    while (i5 < bindingAdapterPosition2) {
                        DirectCardFragment.Item item4 = (DirectCardFragment.Item) this.this$0.mDataList.get(i5);
                        int i6 = i5 + 1;
                        DirectCardFragment.Item item5 = (DirectCardFragment.Item) this.this$0.mDataList.get(i6);
                        int targetIndex2 = item4.getTargetIndex();
                        item4.setTargetIndex(item5.getTargetIndex());
                        item5.setTargetIndex(targetIndex2);
                        if (item5.getType() == this.this$0.ITEM_TYPE_HIDE_LABEL) {
                            item4.setHide(true);
                            item4.setType(this.this$0.ITEM_TYPE_HIDE_DATA);
                        }
                        Collections.swap(this.this$0.mDataList, i5, i6);
                        i5 = i6;
                    }
                }
                if (!recyclerView.isComputingLayout()) {
                    DirectCardFragment.MyAdapter myAdapter = null;
                    if (!z || ((DirectCardFragment.Item) this.this$0.mDataList.get(this.this$0.mDataList.size() - 1)).getType() == this.this$0.ITEM_TYPE_HIDE_LABEL) {
                        DirectCardFragment.MyAdapter myAdapter2 = this.this$0.mMyAdapter;
                        if (myAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
                        } else {
                            myAdapter = myAdapter2;
                        }
                        myAdapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
                    } else {
                        DirectCardFragment.MyAdapter myAdapter3 = this.this$0.mMyAdapter;
                        if (myAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
                        } else {
                            myAdapter = myAdapter3;
                        }
                        myAdapter.notifyDataSetChanged();
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSelectedChanged(RecyclerView.d0 viewHolder, int actionState) {
        if (viewHolder != null && (viewHolder instanceof DirectCardFragment.MyViewHolder)) {
            ((DirectCardFragment.MyViewHolder) viewHolder).itemView.setBackgroundColor(this.this$0.getResources().getColor(cji.H));
        }
        super.onSelectedChanged(viewHolder, actionState);
    }

    @Override // androidx.recyclerview.widget.l.e
    public void onSwiped(RecyclerView.d0 viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
