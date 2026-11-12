package com.xiaomi.fitness.watch.face.adapter;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.fitness.watch.face.FaceDetailFragment;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.FaceInfoBleFragment;
import com.xiaomi.fitness.watch.face.FaceInfoHMFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceAdapter;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceSlotItem;
import com.xiaomi.onetrack.OneTrack;
import defpackage.dih;
import defpackage.isi;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.rw8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003AB@B\u0019\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\u0006\u0010)\u001a\u00020\u0010¢\u0006\u0004\b>\u0010?J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u0015\u0010$\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "v", "bean", "", "onClick", "(Landroid/view/View;Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "doOnClickWatchFace", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;)V", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "faceHolder", "pos", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/view/View$OnLongClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter$OnCheckChangeListener;", "changeListener", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter$OnCheckChangeListener;)V", "", "edit", "setEditMode", "(Z)V", "selectAll", "", "getFaceId", "(I)Ljava/lang/String;", "position", "getItemViewType", "(I)I", "mFrom", "I", "Landroid/view/LayoutInflater;", "mInflater", "Landroid/view/LayoutInflater;", "longClickListener", "Landroid/view/View$OnLongClickListener;", "Landroid/util/SparseBooleanArray;", "checkedState", "Landroid/util/SparseBooleanArray;", "getCheckedState", "()Landroid/util/SparseBooleanArray;", "setCheckedState", "(Landroid/util/SparseBooleanArray;)V", "Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter$OnCheckChangeListener;", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "isEdit", "Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;I)V", "Companion", "OnCheckChangeListener", "DiffCallback", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceAdapter extends p<WatchFace, RecyclerView.d0> {
    public static final int FROM_ME = 1;
    public static final int FROM_MORE = 2;

    @Nullable
    private OnCheckChangeListener changeListener;

    @NotNull
    private SparseBooleanArray checkedState;

    @Nullable
    private final WearableDeviceModel device;
    private boolean isEdit;

    @Nullable
    private View.OnLongClickListener longClickListener;
    private final int mFrom;

    @NotNull
    private final LayoutInflater mInflater;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "oldItem", "newItem", "", "comparePhotos", "(Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;)Z", "compareSlot", "areItemsTheSame", "areContentsTheSame", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nFaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceAdapter.kt\ncom/xiaomi/fitness/watch/face/adapter/FaceAdapter$DiffCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
    public static final class DiffCallback extends h.f<WatchFace> {

        @Nullable
        private final WearableDeviceModel device = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

        private final boolean comparePhotos(WatchFace oldItem, WatchFace newItem) {
            if (oldItem.getBackgroundImageList().length == 0 && newItem.getBackgroundImageList().length == 0) {
                return true;
            }
            if (oldItem.getBackgroundImageList().length != newItem.getBackgroundImageList().length) {
                return false;
            }
            int length = oldItem.getBackgroundImageList().length;
            for (int i = 0; i < length; i++) {
                if (!Intrinsics.areEqual(oldItem.getBackgroundImageList()[i], newItem.getBackgroundImageList()[i])) {
                    return false;
                }
            }
            return true;
        }

        private final boolean compareSlot(WatchFace oldItem, WatchFace newItem) {
            ArrayList<WatchFaceSlotItem> slotItems;
            ArrayList<WatchFaceSlotItem> slotItems2;
            ArrayList<WatchFaceSlotItem> slotItems3;
            Object next;
            ArrayList<WatchFaceSlotItem> slotItems4;
            ArrayList<WatchFaceSlotItem> slotItems5 = oldItem.getSlotItems();
            if ((slotItems5 != null && !slotItems5.isEmpty()) || ((slotItems = newItem.getSlotItems()) != null && !slotItems.isEmpty())) {
                ArrayList<WatchFaceSlotItem> slotItems6 = oldItem.getSlotItems();
                if (((slotItems6 == null || slotItems6.isEmpty()) && (slotItems2 = newItem.getSlotItems()) != null && !slotItems2.isEmpty()) || ((slotItems3 = oldItem.getSlotItems()) != null && !slotItems3.isEmpty() && ((slotItems4 = newItem.getSlotItems()) == null || slotItems4.isEmpty()))) {
                    return false;
                }
                ArrayList<WatchFaceSlotItem> slotItems7 = oldItem.getSlotItems();
                Intrinsics.checkNotNull(slotItems7);
                int size = slotItems7.size();
                ArrayList<WatchFaceSlotItem> slotItems8 = newItem.getSlotItems();
                Intrinsics.checkNotNull(slotItems8);
                if (size != slotItems8.size()) {
                    return false;
                }
                ArrayList<WatchFaceSlotItem> slotItems9 = oldItem.getSlotItems();
                Intrinsics.checkNotNull(slotItems9);
                int size2 = slotItems9.size();
                for (int i = 0; i < size2; i++) {
                    ArrayList<WatchFaceSlotItem> slotItems10 = oldItem.getSlotItems();
                    Intrinsics.checkNotNull(slotItems10);
                    WatchFaceSlotItem watchFaceSlotItem = slotItems10.get(i);
                    Intrinsics.checkNotNullExpressionValue(watchFaceSlotItem, "get(...)");
                    WatchFaceSlotItem watchFaceSlotItem2 = watchFaceSlotItem;
                    ArrayList<WatchFaceSlotItem> slotItems11 = newItem.getSlotItems();
                    Intrinsics.checkNotNull(slotItems11);
                    Iterator<T> it = slotItems11.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((WatchFaceSlotItem) next).getSlotId(), watchFaceSlotItem2.getSlotId()));
                    WatchFaceSlotItem watchFaceSlotItem3 = (WatchFaceSlotItem) next;
                    if (!Intrinsics.areEqual(watchFaceSlotItem2.getWidgetId(), watchFaceSlotItem3 != null ? watchFaceSlotItem3.getWidgetId() : null)) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull WatchFace oldItem, @NotNull WatchFace newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            WearableDeviceModel wearableDeviceModel = this.device;
            return (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) && oldItem.isCurrent() == newItem.isCurrent() && Intrinsics.areEqual(oldItem.getStyle(), newItem.getStyle()) && oldItem.getVersionCode() == newItem.getVersionCode() && Intrinsics.areEqual(oldItem.getBackgroundColor(), newItem.getBackgroundColor()) && Intrinsics.areEqual(oldItem.getBackgroundImage(), newItem.getBackgroundImage()) && Intrinsics.areEqual(oldItem.getSpiritColor(), newItem.getSpiritColor()) && comparePhotos(oldItem, newItem) && compareSlot(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull WatchFace oldItem, @NotNull WatchFace newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/watch/face/adapter/FaceAdapter$OnCheckChangeListener;", "", "onChanged", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCheckChangeListener {
        void onChanged();
    }

    public FaceAdapter(@Nullable Context context, int i) {
        super(new DiffCallback());
        this.mFrom = i;
        this.checkedState = new SparseBooleanArray();
        this.device = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.mInflater = LayoutInflater.from(context);
    }

    private final void doOnClickWatchFace(WearableDeviceModel deviceModel, WatchFace bean) {
        String tabName;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("click_v3", "56.47.1.1.19541");
        Object[] objArr = new Object[16];
        objArr[0] = "name";
        objArr[1] = "watchface_select";
        objArr[2] = "source";
        objArr[3] = (bean.getTabId() == 0 || (tabName = bean.getTabName()) == null || tabName.length() == 0) ? "my_watchface" : "watchface_market";
        objArr[4] = "asset_id";
        String id = bean.getId();
        if (id == null) {
            id = "";
        }
        objArr[5] = id;
        objArr[6] = OneTrack.Param.ASSET_NAME;
        String name = bean.getName();
        if (name == null) {
            name = "";
        }
        objArr[7] = name;
        objArr[8] = HealthTabOneTrackExtKt.KEY_TYPE_NUM;
        objArr[9] = Integer.valueOf(bean.getTabId());
        objArr[10] = "type_str";
        String tabName2 = bean.getTabName();
        if (tabName2 == null) {
            tabName2 = "";
        }
        objArr[11] = tabName2;
        objArr[12] = "device_model";
        objArr[13] = DeviceModelExtKt.getModel(deviceModel);
        objArr[14] = "device_version";
        String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel);
        objArr[15] = firmwareVersion != null ? firmwareVersion : "";
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(FaceAdapter this$0, RecyclerView.d0 faceHolder, WatchFace watchFace, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(faceHolder, "$faceHolder");
        Intrinsics.checkNotNullParameter(it, "it");
        View itemView = faceHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        Intrinsics.checkNotNull(watchFace);
        this$0.onClick(itemView, watchFace);
        return Unit.INSTANCE;
    }

    private final void onClick(View v, WatchFace bean) {
        Class cls;
        if (this.isEdit) {
            Object tag = v.getTag(isi.T0);
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) tag).intValue();
            boolean z = !this.checkedState.get(iIntValue);
            this.checkedState.put(iIntValue, z);
            v.findViewById(isi.z).setSelected(z);
            OnCheckChangeListener onCheckChangeListener = this.changeListener;
            if (onCheckChangeListener != null) {
                Intrinsics.checkNotNull(onCheckChangeListener);
                onCheckChangeListener.onChanged();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(FaceInfoBase.FACE_ID, bean.getId());
        bundle.putInt(FaceInfoBase.FACE_FROM, this.mFrom == 1 ? 22 : 11);
        bundle.putInt(FaceDetailFragment.PAGE_SOURCE, 10);
        bundle.putInt("utm_source", 14);
        bundle.putString(FaceDetailFragment.PAGE_NAME, ResourceExtKt.getString(p1j.q0));
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            doOnClickWatchFace(wearableDeviceModel, bean);
            FragmentParams.b bVar = new FragmentParams.b();
            if (DeviceModelExtKt.isHuaMi(wearableDeviceModel) && bean.getCanEditByConfig()) {
                cls = FaceInfoHMFragment.class;
            } else {
                boolean z2 = (DeviceManagerExtKt.getInstance(companion).getDeviceCapability(wearableDeviceModel.getDid()) & 4194304) == 4194304;
                if (!bean.getCanEdit() || z2) {
                    bundle.putBoolean(FaceDetailFragment.IS_PHOTO_FACE, bean.getFaceType() == 1);
                    cls = FaceDetailFragment.class;
                } else {
                    cls = FaceInfoBleFragment.class;
                }
            }
            FragmentParams fragmentParamsB = bVar.e(cls).c(bundle).a(true).b();
            Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
            dih.a().f(v.getContext(), fragmentParamsB, true);
        }
    }

    @NotNull
    public final SparseBooleanArray getCheckedState() {
        return this.checkedState;
    }

    @NotNull
    public final String getFaceId(int pos) {
        return getItem(pos).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 faceHolder, int pos) {
        Intrinsics.checkNotNullParameter(faceHolder, "faceHolder");
        if (!(faceHolder instanceof FaceHolder)) {
            if (faceHolder instanceof rw8) {
                ((rw8) faceHolder).a(getItem(pos));
            }
        } else {
            final WatchFace item = getItem(pos);
            faceHolder.itemView.setTag(isi.T0, Integer.valueOf(pos));
            Intrinsics.checkNotNull(item);
            ((FaceHolder) faceHolder).bindView(item, this.mFrom, this.isEdit, this.checkedState.get(pos, false), pos);
            ViewExtKt.clickWithTrigger$default(faceHolder.itemView, 0L, new Function1() { // from class: mm8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceAdapter.onBindViewHolder$lambda$0(this.f26996a, faceHolder, item, (View) obj);
                }
            }, 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup viewGroup, int viewType) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        boolean z = false;
        View viewInflate = this.mInflater.inflate(ovi.r0, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.findViewById(isi.a1).setVisibility(this.mFrom == 1 ? 8 : 0);
        viewInflate.findViewById(isi.f0).setVisibility(this.mFrom == 1 ? 0 : 8);
        View.OnLongClickListener onLongClickListener = this.longClickListener;
        if (onLongClickListener != null) {
            viewInflate.setOnLongClickListener(onLongClickListener);
        }
        WearableDeviceModel wearableDeviceModel = this.device;
        if (wearableDeviceModel != null && DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            z = true;
        }
        return new FaceHolder(viewInflate, z);
    }

    public final void selectAll(boolean selectAll) {
        int itemCount = getCount();
        for (int i = 0; i < itemCount; i++) {
            this.checkedState.put(i, selectAll);
        }
        List<WatchFace> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        submitList(CollectionsKt___CollectionsKt.toList(currentList));
    }

    public final void setCheckedState(@NotNull SparseBooleanArray sparseBooleanArray) {
        Intrinsics.checkNotNullParameter(sparseBooleanArray, "<set-?>");
        this.checkedState = sparseBooleanArray;
    }

    public final void setEditMode(boolean edit) {
        this.isEdit = edit;
        List<WatchFace> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        submitList(CollectionsKt___CollectionsKt.toList(currentList));
    }

    public final void setOnLongClickListener(@NotNull View.OnLongClickListener listener, @Nullable OnCheckChangeListener changeListener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.longClickListener = listener;
        this.changeListener = changeListener;
    }
}
