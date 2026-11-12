package com.xiaomi.fitness.devicesettings.bluttooth.directcard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardViewModel;
import defpackage.eui;
import defpackage.iyo;
import defpackage.jni;
import defpackage.qyi;
import defpackage.txo;
import defpackage.wzi;
import defpackage.y2a;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004EFGHB\u0007¢\u0006\u0004\bD\u0010\u0012J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001a\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0014¢\u0006\u0004\b&\u0010\u0012R\u0014\u0010'\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\u000602R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0014¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardViewModel;", "Ly2a;", "Liyo$a;", "result", "", "updateList", "(Liyo$a;)V", "", "id", "", "getWidgetName", "(Ljava/lang/Integer;)Ljava/lang/String;", "", "isListChanged", "()Z", "saveList", "()V", "getInvariableCount", "()I", "isRestrictMax", "isRestrictMin", "resetListItemIndex", "Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$Item;", "item", "isResident", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$Item;)Z", "Liyo;", "widget", "(Liyo;)Z", "isHeadResident", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "TAG", "Ljava/lang/String;", "ITEM_TYPE_HIDE_LABEL", "I", "ITEM_TYPE_DATA", "ITEM_TYPE_HIDE_DATA", "supportMaxNumber", "supportMinNumber", "", "mDataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$MyAdapter;", "mMyAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$MyAdapter;", "Landroidx/recyclerview/widget/l;", "mTouchHelper", "Landroidx/recyclerview/widget/l;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Landroidx/recyclerview/widget/l$e;", "mCallback", "Landroidx/recyclerview/widget/l$e;", "getMCallback", "()Landroidx/recyclerview/widget/l$e;", "setMCallback", "(Landroidx/recyclerview/widget/l$e;)V", "getLayoutId", "layoutId", "<init>", "MyAdapter", "MyViewHolder", "OnIconClickListener", "Item", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDirectCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectCardFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,525:1\n37#2:526\n36#2,3:527\n*S KotlinDebug\n*F\n+ 1 DirectCardFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment\n*L\n355#1:526\n355#1:527,3\n*E\n"})
public final class DirectCardFragment extends BaseBindingFragment<DirectCardViewModel, y2a> {
    private final int ITEM_TYPE_HIDE_LABEL;

    @Nullable
    private WearableDeviceModel deviceModel;
    private MyAdapter mMyAdapter;
    private l mTouchHelper;
    private int supportMaxNumber;
    private int supportMinNumber;

    @NotNull
    private final String TAG = "DirectCardFragment";
    private final int ITEM_TYPE_DATA = 1;
    private final int ITEM_TYPE_HIDE_DATA = 2;

    @NotNull
    private List<Item> mDataList = new LinkedList();

    @NotNull
    private l.e mCallback = new DirectCardFragment$mCallback$1(this);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$MyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$MyViewHolder;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment;", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment;)V", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "getItemViewType", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
        public MyAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return DirectCardFragment.this.mDataList.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return ((Item) DirectCardFragment.this.mDataList.get(position)).getType();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull MyViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            final DirectCardFragment directCardFragment = DirectCardFragment.this;
            holder.bindView(new OnIconClickListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardFragment$MyAdapter$onBindViewHolder$1
                @Override // com.xiaomi.fitness.devicesettings.bluttooth.directcard.DirectCardFragment.OnIconClickListener
                public void onClick(int fromPosition) {
                    DirectCardFragment.Item item = (DirectCardFragment.Item) directCardFragment.mDataList.get(fromPosition);
                    if (item.isInvariable()) {
                        return;
                    }
                    DirectCardFragment.MyAdapter myAdapter = null;
                    if (!item.getIsHide()) {
                        int size = directCardFragment.mDataList.size() - 1;
                        int i = fromPosition;
                        while (i < size) {
                            DirectCardFragment.Item item2 = (DirectCardFragment.Item) directCardFragment.mDataList.get(i);
                            int i2 = i + 1;
                            DirectCardFragment.Item item3 = (DirectCardFragment.Item) directCardFragment.mDataList.get(i2);
                            int targetIndex = item2.getTargetIndex();
                            item2.setTargetIndex(item3.getTargetIndex());
                            item3.setTargetIndex(targetIndex);
                            if (item3.getType() == directCardFragment.ITEM_TYPE_HIDE_LABEL) {
                                item2.setHide(true);
                            }
                            Collections.swap(directCardFragment.mDataList, i, i2);
                            i = i2;
                        }
                        Logger.d("WidgetAdapter", "onItemIconClicked:move item " + fromPosition + " to " + size);
                        DirectCardFragment.MyAdapter myAdapter2 = directCardFragment.mMyAdapter;
                        if (myAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
                            myAdapter2 = null;
                        }
                        myAdapter2.notifyItemMoved(fromPosition, size);
                        int iMin = Math.min(fromPosition, size);
                        ((DirectCardFragment.Item) directCardFragment.mDataList.get(size)).setType(directCardFragment.ITEM_TYPE_HIDE_DATA);
                        DirectCardFragment.MyAdapter myAdapter3 = directCardFragment.mMyAdapter;
                        if (myAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
                        } else {
                            myAdapter = myAdapter3;
                        }
                        myAdapter.notifyItemRangeChanged(iMin, this.getCount() - iMin);
                        directCardFragment.saveList();
                        return;
                    }
                    DirectCardFragment.Item item4 = (DirectCardFragment.Item) directCardFragment.mDataList.get(0);
                    if (item4.getWidget() == null) {
                        return;
                    }
                    int i3 = 0;
                    while (i3 < fromPosition && item4.getType() != directCardFragment.ITEM_TYPE_HIDE_LABEL) {
                        iyo widget = item4.getWidget();
                        Intrinsics.checkNotNull(widget);
                        if (widget.e >= 100) {
                            break;
                        }
                        i3++;
                        item4 = (DirectCardFragment.Item) directCardFragment.mDataList.get(i3);
                    }
                    if (directCardFragment.isRestrictMax() && i3 >= (directCardFragment.getInvariableCount() + directCardFragment.supportMaxNumber) - 1) {
                        Context context = directCardFragment.getContext();
                        if (context != null) {
                            String quantityString = directCardFragment.getResources().getQuantityString(qyi.z, directCardFragment.supportMaxNumber, Integer.valueOf(directCardFragment.supportMaxNumber));
                            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                            ToastExtKt.toastShort(context, quantityString);
                            return;
                        }
                        return;
                    }
                    int i4 = i3 + 1;
                    if (i4 <= fromPosition) {
                        int i5 = fromPosition;
                        while (true) {
                            DirectCardFragment.Item item5 = (DirectCardFragment.Item) directCardFragment.mDataList.get(i5);
                            int i6 = i5 - 1;
                            DirectCardFragment.Item item6 = (DirectCardFragment.Item) directCardFragment.mDataList.get(i6);
                            int targetIndex2 = item5.getTargetIndex();
                            item5.setTargetIndex(item6.getTargetIndex());
                            item6.setTargetIndex(targetIndex2);
                            if (item6.getType() == directCardFragment.ITEM_TYPE_HIDE_LABEL) {
                                item5.setHide(false);
                            }
                            Collections.swap(directCardFragment.mDataList, i5, i6);
                            if (i5 == i4) {
                                break;
                            } else {
                                i5--;
                            }
                        }
                    }
                    Logger.d("WidgetAdapter", "onItemIconClicked:move item " + fromPosition + " to " + i3);
                    DirectCardFragment.MyAdapter myAdapter4 = directCardFragment.mMyAdapter;
                    if (myAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
                        myAdapter4 = null;
                    }
                    myAdapter4.notifyItemMoved(fromPosition, i3);
                    int iMin2 = Math.min(fromPosition, i3);
                    ((DirectCardFragment.Item) directCardFragment.mDataList.get(i3)).setType(directCardFragment.ITEM_TYPE_DATA);
                    DirectCardFragment.MyAdapter myAdapter5 = directCardFragment.mMyAdapter;
                    if (myAdapter5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
                    } else {
                        myAdapter = myAdapter5;
                    }
                    myAdapter.notifyItemRangeChanged(iMin2, this.getCount() - iMin2);
                    directCardFragment.saveList();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public MyViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            if (viewType == DirectCardFragment.this.ITEM_TYPE_HIDE_LABEL) {
                DirectCardFragment directCardFragment = DirectCardFragment.this;
                View viewInflate = LayoutInflater.from(directCardFragment.getMActivity()).inflate(eui.U2, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                return new MyViewHolder(directCardFragment, viewInflate);
            }
            if (viewType == DirectCardFragment.this.ITEM_TYPE_HIDE_DATA) {
                DirectCardFragment directCardFragment2 = DirectCardFragment.this;
                View viewInflate2 = LayoutInflater.from(directCardFragment2.getMActivity()).inflate(eui.Q2, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
                return new MyViewHolder(directCardFragment2, viewInflate2);
            }
            DirectCardFragment directCardFragment3 = DirectCardFragment.this;
            View viewInflate3 = LayoutInflater.from(directCardFragment3.getMActivity()).inflate(eui.T2, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new MyViewHolder(directCardFragment3, viewInflate3);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$OnIconClickListener;", "iconClickListener", "", "bindView", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$OnIconClickListener;)V", "Landroid/view/View;", "tipInfo", "Landroid/view/View;", "getTipInfo", "()Landroid/view/View;", "setTipInfo", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "nameTV", "Landroid/widget/TextView;", "getNameTV", "()Landroid/widget/TextView;", "setNameTV", "(Landroid/widget/TextView;)V", "swipe", "getSwipe", "setSwipe", "itemView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MyViewHolder extends RecyclerView.d0 {

        @Nullable
        private ImageView icon;

        @Nullable
        private TextView nameTV;

        @Nullable
        private ImageView swipe;
        final /* synthetic */ DirectCardFragment this$0;

        @Nullable
        private View tipInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @SuppressLint({"ClickableViewAccessibility"})
        public MyViewHolder(@NotNull final DirectCardFragment directCardFragment, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = directCardFragment;
            this.tipInfo = itemView.findViewById(zqi.S9);
            this.icon = (ImageView) itemView.findViewById(zqi.A3);
            this.nameTV = (TextView) itemView.findViewById(zqi.B5);
            ImageView imageView = (ImageView) itemView.findViewById(zqi.Z8);
            this.swipe = imageView;
            if (imageView == null || imageView == null) {
                return;
            }
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: rx6
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return DirectCardFragment.MyViewHolder._init_$lambda$2(directCardFragment, this, view, motionEvent);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean _init_$lambda$2(DirectCardFragment this$0, MyViewHolder this$1, View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() != 0) {
                return false;
            }
            l lVar = this$0.mTouchHelper;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTouchHelper");
                lVar = null;
            }
            lVar.x(this$1);
            this$0.resetListItemIndex();
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindView$lambda$0(OnIconClickListener iconClickListener, MyViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(iconClickListener, "$iconClickListener");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            iconClickListener.onClick(this$0.getBindingAdapterPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindView$lambda$1(OnIconClickListener iconClickListener, MyViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(iconClickListener, "$iconClickListener");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            iconClickListener.onClick(this$0.getBindingAdapterPosition());
        }

        public final void bindView(@NotNull final OnIconClickListener iconClickListener) {
            ImageView imageView;
            ImageView imageView2;
            Intrinsics.checkNotNullParameter(iconClickListener, "iconClickListener");
            Item item = (Item) this.this$0.mDataList.get(getBindingAdapterPosition());
            int i = 8;
            if (getItemViewType() == this.this$0.ITEM_TYPE_HIDE_LABEL) {
                View view = this.tipInfo;
                if (view != null) {
                    view.setVisibility(getBindingAdapterPosition() >= this.this$0.mDataList.size() - 1 ? 0 : 8);
                    return;
                }
                return;
            }
            if (getItemViewType() == this.this$0.ITEM_TYPE_HIDE_DATA) {
                DirectCardFragment directCardFragment = this.this$0;
                iyo widget = item.getWidget();
                String widgetName = directCardFragment.getWidgetName(widget != null ? Integer.valueOf(widget.c) : null);
                if (TextUtils.isEmpty(widgetName)) {
                    TextView textView = this.nameTV;
                    if (textView != null) {
                        textView.setVisibility(4);
                    }
                    ImageView imageView3 = this.icon;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    TextView textView2 = this.nameTV;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    ImageView imageView4 = this.icon;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                    }
                    TextView textView3 = this.nameTV;
                    if (textView3 != null) {
                        textView3.setText(widgetName);
                    }
                    ImageView imageView5 = this.icon;
                    if (imageView5 != null) {
                        imageView5.setImageResource(item.itemIconRes());
                    }
                }
                if (item.isInvariable() || (imageView2 = this.icon) == null) {
                    return;
                }
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: px6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DirectCardFragment.MyViewHolder.bindView$lambda$0(iconClickListener, this, view2);
                    }
                });
                return;
            }
            DirectCardFragment directCardFragment2 = this.this$0;
            iyo widget2 = item.getWidget();
            String widgetName2 = directCardFragment2.getWidgetName(widget2 != null ? Integer.valueOf(widget2.c) : null);
            if (TextUtils.isEmpty(widgetName2)) {
                TextView textView4 = this.nameTV;
                if (textView4 != null) {
                    textView4.setVisibility(4);
                }
                ImageView imageView6 = this.icon;
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
            } else {
                TextView textView5 = this.nameTV;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                ImageView imageView7 = this.icon;
                if (imageView7 != null) {
                    imageView7.setVisibility(0);
                }
                TextView textView6 = this.nameTV;
                if (textView6 != null) {
                    textView6.setText(widgetName2);
                }
                ImageView imageView8 = this.icon;
                if (imageView8 != null) {
                    imageView8.setImageResource(item.itemIconRes());
                }
            }
            boolean zIsInvariable = item.isInvariable();
            if (!zIsInvariable && (imageView = this.icon) != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: qx6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DirectCardFragment.MyViewHolder.bindView$lambda$1(iconClickListener, this, view2);
                    }
                });
            }
            ImageView imageView9 = this.swipe;
            if (imageView9 != null) {
                if (!zIsInvariable && !item.getIsHide()) {
                    i = 0;
                }
                imageView9.setVisibility(i);
            }
            TextView textView7 = this.nameTV;
            if (textView7 != null) {
                textView7.setEnabled(true);
            }
            ImageView imageView10 = this.swipe;
            if (imageView10 != null) {
                imageView10.setEnabled(true);
            }
        }

        @Nullable
        public final ImageView getIcon() {
            return this.icon;
        }

        @Nullable
        public final TextView getNameTV() {
            return this.nameTV;
        }

        @Nullable
        public final ImageView getSwipe() {
            return this.swipe;
        }

        @Nullable
        public final View getTipInfo() {
            return this.tipInfo;
        }

        public final void setIcon(@Nullable ImageView imageView) {
            this.icon = imageView;
        }

        public final void setNameTV(@Nullable TextView textView) {
            this.nameTV = textView;
        }

        public final void setSwipe(@Nullable ImageView imageView) {
            this.swipe = imageView;
        }

        public final void setTipInfo(@Nullable View view) {
            this.tipInfo = view;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$OnIconClickListener;", "", "onClick", "", "position", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnIconClickListener {
        void onClick(int position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getInvariableCount() {
        Iterator<Item> it = this.mDataList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().isInvariable()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getWidgetName(Integer id) {
        if (id != null && id.intValue() == 17) {
            return getString(wzi.J1);
        }
        if (id != null && id.intValue() == 2) {
            return getString(wzi.X9);
        }
        if (id != null && id.intValue() == 3) {
            return getString(wzi.i);
        }
        if (id != null && id.intValue() == 4) {
            return getString(wzi.l);
        }
        if (id != null && id.intValue() == 32) {
            return getString(wzi.E1);
        }
        if (id != null && id.intValue() == 13) {
            return getString(wzi.I2);
        }
        if (id != null && id.intValue() == 5) {
            return getString(wzi.h);
        }
        if (id != null && id.intValue() == 6) {
            return getString(wzi.j);
        }
        if (id != null && id.intValue() == 9) {
            return getString(wzi.W6);
        }
        if (id != null && id.intValue() == 33) {
            return getString(wzi.I1);
        }
        if (id != null && id.intValue() == 14) {
            return getString(wzi.b8);
        }
        if (id != null && id.intValue() == 18) {
            return getString(wzi.l2);
        }
        if (id != null && id.intValue() == 19) {
            WearableDeviceModel wearableDeviceModel = this.deviceModel;
            return (wearableDeviceModel == null || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, "alexa")) ? getString(wzi.M2) : getString(wzi.D1);
        }
        if (id != null && id.intValue() == 20) {
            return getString(wzi.f38516k);
        }
        if (id != null && id.intValue() == 21) {
            return getString(wzi.S9);
        }
        if (id != null && id.intValue() == 16) {
            return getString(wzi.ka);
        }
        if (id != null && id.intValue() == 37) {
            return getString(wzi.J2);
        }
        if (id != null && id.intValue() == 10) {
            return getString(wzi.C1);
        }
        if (id != null && id.intValue() == 7) {
            return getString(wzi.G1);
        }
        if (id != null && id.intValue() == 22) {
            return getString(wzi.W1);
        }
        return null;
    }

    private final boolean isHeadResident(iyo widget) {
        int i;
        return widget != null && (i = widget.e) >= 0 && i < 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isListChanged() {
        for (Item item : this.mDataList) {
            if (item.getTargetIndex() != item.getIndex()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isResident(iyo widget) {
        return widget != null && widget.e >= 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRestrictMax() {
        return this.supportMaxNumber > 0;
    }

    private final boolean isRestrictMin() {
        return this.supportMinNumber > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DirectCardFragment this$0, DirectCardViewModel.GetWidgetSetting getWidgetSetting) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (getWidgetSetting.getCode() == 0) {
            this$0.updateList(getWidgetSetting.getResult());
        } else {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.i2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(DirectCardFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        if (num != null && num.intValue() == 0) {
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.common_set_success);
            }
        } else {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, wzi.common_set_error);
            }
            this$0.loadData();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetListItemIndex() {
        int size = this.mDataList.size();
        for (int i = 0; i < size; i++) {
            this.mDataList.get(i).setBothIndex(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void saveList() {
        showLoading();
        ArrayList arrayList = new ArrayList();
        int i = 10;
        boolean z = true;
        for (Item item : this.mDataList) {
            if (item.getType() == this.ITEM_TYPE_HIDE_LABEL) {
                z = false;
            } else if (item.getWidget() != null) {
                iyo iyoVar = new iyo();
                iyo widget = item.getWidget();
                Intrinsics.checkNotNull(widget);
                iyoVar.c = widget.c;
                if (isResident(item) || isHeadResident(item)) {
                    iyo widget2 = item.getWidget();
                    Intrinsics.checkNotNull(widget2);
                    iyoVar.e = widget2.e;
                    iyoVar.d = true;
                    arrayList.add(iyoVar);
                } else {
                    iyoVar.e = i;
                    iyoVar.d = z;
                    arrayList.add(iyoVar);
                    i++;
                }
            }
        }
        iyo.a aVar = new iyo.a();
        aVar.c = (iyo[]) arrayList.toArray(new iyo[0]);
        aVar.d = this.supportMaxNumber;
        aVar.e = this.supportMinNumber;
        txo txoVar = new txo();
        txoVar.v0(aVar);
        ((DirectCardViewModel) getMViewModel()).setWidget(txoVar);
    }

    private final void updateList(iyo.a result) {
        this.mDataList.clear();
        Intrinsics.checkNotNull(result);
        int i = result.d;
        this.supportMaxNumber = i;
        int i2 = result.e;
        this.supportMinNumber = i2;
        Logger.i(this.TAG, "supportMaxNumber: " + i + " supportMinNumber:" + i2);
        iyo[] iyoVarArr = result.c;
        if (iyoVarArr == null || iyoVarArr.length == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        Iterator it = ArrayIteratorKt.iterator(iyoVarArr);
        while (it.hasNext()) {
            iyo iyoVar = (iyo) it.next();
            if (isResident(iyoVar)) {
                Intrinsics.checkNotNull(iyoVar);
                linkedList.add(iyoVar);
            } else if (iyoVar.d) {
                Intrinsics.checkNotNull(iyoVar);
                linkedList2.add(iyoVar);
            } else {
                Intrinsics.checkNotNull(iyoVar);
                linkedList3.add(iyoVar);
            }
        }
        final Function2 function2 = new Function2() { // from class: jx6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(DirectCardFragment.updateList$lambda$2((iyo) obj, (iyo) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(linkedList, new Comparator() { // from class: kx6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DirectCardFragment.updateList$lambda$3(function2, obj, obj2);
            }
        });
        final Function2 function3 = new Function2() { // from class: lx6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(DirectCardFragment.updateList$lambda$4((iyo) obj, (iyo) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(linkedList2, new Comparator() { // from class: mx6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DirectCardFragment.updateList$lambda$5(function3, obj, obj2);
            }
        });
        final Function2 function4 = new Function2() { // from class: nx6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(DirectCardFragment.updateList$lambda$6((iyo) obj, (iyo) obj2));
            }
        };
        CollectionsKt__MutableCollectionsJVMKt.sortWith(linkedList3, new Comparator() { // from class: ox6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DirectCardFragment.updateList$lambda$7(function4, obj, obj2);
            }
        });
        Iterator it2 = linkedList2.iterator();
        while (it2.hasNext()) {
            this.mDataList.add(new Item(this.ITEM_TYPE_DATA, false, (iyo) it2.next()));
        }
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            this.mDataList.add(new Item(this.ITEM_TYPE_DATA, false, (iyo) it3.next()));
        }
        this.mDataList.add(new Item(this.ITEM_TYPE_HIDE_LABEL));
        Iterator it4 = linkedList3.iterator();
        while (it4.hasNext()) {
            this.mDataList.add(new Item(this.ITEM_TYPE_HIDE_DATA, true, (iyo) it4.next()));
        }
        MyAdapter myAdapter = this.mMyAdapter;
        if (myAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
            myAdapter = null;
        }
        myAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateList$lambda$2(iyo iyoVar, iyo iyoVar2) {
        return iyoVar.e - iyoVar2.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateList$lambda$3(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateList$lambda$4(iyo iyoVar, iyo iyoVar2) {
        return iyoVar.e - iyoVar2.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateList$lambda$5(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateList$lambda$6(iyo iyoVar, iyo iyoVar2) {
        return iyoVar.e - iyoVar2.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateList$lambda$7(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.r2;
    }

    @NotNull
    public final l.e getMCallback() {
        return this.mCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        showLoading();
        if (this.deviceModel != null) {
            DirectCardViewModel directCardViewModel = (DirectCardViewModel) getMViewModel();
            WearableDeviceModel wearableDeviceModel = this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            directCardViewModel.getWidgetSetting(wearableDeviceModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        setTitle(wzi.ia);
        this.mMyAdapter = new MyAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(zqi.j7);
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(1);
        MyAdapter myAdapter = this.mMyAdapter;
        if (myAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMyAdapter");
            myAdapter = null;
        }
        recyclerView.setAdapter(myAdapter);
        l lVar = new l(this.mCallback);
        this.mTouchHelper = lVar;
        lVar.d(recyclerView);
        ((DirectCardViewModel) getMViewModel()).getGetWidgetSetting().observe(getViewLifecycleOwner(), new DirectCardFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hx6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DirectCardFragment.onViewCreated$lambda$0(this.f20559a, (DirectCardViewModel.GetWidgetSetting) obj);
            }
        }));
        ((DirectCardViewModel) getMViewModel()).getSetWidgetRet().observe(getViewLifecycleOwner(), new DirectCardFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ix6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DirectCardFragment.onViewCreated$lambda$1(this.f22189a, (Integer) obj);
            }
        }));
    }

    public final void setMCallback(@NotNull l.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.mCallback = eVar;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0006B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b \u0010!J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\u0006R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\u0006R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\u0006¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/directcard/DirectCardFragment$Item;", "", "", "index", "", "setBothIndex", "(I)V", "itemIconRes", "()I", "", "isInvariable", "()Z", "type", "I", "getType", "setType", "Liyo;", "widget", "Liyo;", "getWidget", "()Liyo;", "setWidget", "(Liyo;)V", "isHide", "Z", "setHide", "(Z)V", "getIndex", "setIndex", "targetIndex", "getTargetIndex", "setTargetIndex", "<init>", "(IZLiyo;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Item {
        private int index;
        private boolean isHide;
        private int targetIndex;
        private int type;

        @Nullable
        private iyo widget;

        public Item(int i) {
            this.type = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getTargetIndex() {
            return this.targetIndex;
        }

        public final int getType() {
            return this.type;
        }

        @Nullable
        public final iyo getWidget() {
            return this.widget;
        }

        /* JADX INFO: renamed from: isHide, reason: from getter */
        public final boolean getIsHide() {
            return this.isHide;
        }

        public final boolean isInvariable() {
            iyo iyoVar = this.widget;
            if (iyoVar == null) {
                return false;
            }
            Intrinsics.checkNotNull(iyoVar);
            if (iyoVar.e < 100) {
                iyo iyoVar2 = this.widget;
                Intrinsics.checkNotNull(iyoVar2);
                if (iyoVar2.e < 0) {
                    return false;
                }
                iyo iyoVar3 = this.widget;
                Intrinsics.checkNotNull(iyoVar3);
                if (iyoVar3.e >= 10) {
                    return false;
                }
            }
            return true;
        }

        public final int itemIconRes() {
            if (this.widget == null) {
                return 0;
            }
            if (isInvariable()) {
                return jni.d1;
            }
            return this.isHide ? jni.a1 : jni.c1;
        }

        public final void setBothIndex(int index) {
            this.index = index;
            this.targetIndex = index;
        }

        public final void setHide(boolean z) {
            this.isHide = z;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public final void setTargetIndex(int i) {
            this.targetIndex = i;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setWidget(@Nullable iyo iyoVar) {
            this.widget = iyoVar;
        }

        public Item(int i, boolean z, @Nullable iyo iyoVar) {
            this.type = i;
            this.isHide = z;
            this.widget = iyoVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHeadResident(Item item) {
        if (item != null) {
            return isHeadResident(item.getWidget());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isResident(Item item) {
        if (item != null) {
            return isResident(item.getWidget());
        }
        return false;
    }
}
