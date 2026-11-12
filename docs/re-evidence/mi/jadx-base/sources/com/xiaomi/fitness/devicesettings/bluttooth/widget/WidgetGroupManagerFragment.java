package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManagerFragment;
import com.xiaomi.fitness.devicesettings.utils.UiUtils;
import com.xiaomi.fitness.devicesettings.widget.ItemDeleteHighLightAreaView;
import defpackage.cji;
import defpackage.e8h;
import defpackage.eu6;
import defpackage.eui;
import defpackage.hir;
import defpackage.ikr;
import defpackage.jyo;
import defpackage.kyo;
import defpackage.p8h;
import defpackage.pir;
import defpackage.sj6;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002dcB\u0007¢\u0006\u0004\bb\u0010\u0010J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ!\u0010\u001f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0010J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0010J#\u0010)\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0014¢\u0006\u0004\b+\u0010\u0010J\u000f\u0010,\u001a\u00020\bH\u0014¢\u0006\u0004\b,\u0010\u0010J)\u00102\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010WR\u0016\u0010Y\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupManagerFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/BaseWidgetBindingFragment;", "Lsj6;", "Le8h;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/a$a;", "Lp8h;", "Lhir;", "listContainer", "", "onWidgetGroupAvailable", "(Lhir;)V", "Landroid/view/View;", "view", "initContentView", "(Landroid/view/View;)V", "loadBottomView", "()V", "appendAddMask", "makeListCopy", "checkListItemChanged", "onWidgetItemChanged", "handleUpdateWidgetToDevice", "checkNumOfGroupList", "", "visible", "showOrHideAddCard", "(Z)V", "isShow", "showEmtpyInfo", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "startDragItem", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "endDrag", "onWidgetGroupAddClick", "", "groupWrapper", "onItemClick", "(Landroid/view/View;Ljava/lang/Object;)V", "onVisible", "onInvisible", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/widget/TextView;", "mTvTitleHint", "Landroid/widget/TextView;", "mTvEmpty", "Landroidx/recyclerview/widget/RecyclerView;", "mWidgetRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/a;", "mManagerAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/a;", "Landroidx/recyclerview/widget/l$e;", "mItemTouchHelperCallback", "Landroidx/recyclerview/widget/l$e;", "getMItemTouchHelperCallback", "()Landroidx/recyclerview/widget/l$e;", "setMItemTouchHelperCallback", "(Landroidx/recyclerview/widget/l$e;)V", "Landroidx/recyclerview/widget/l;", "mItemTouchHelper", "Landroidx/recyclerview/widget/l;", "", "Lpir;", "mWidgetGroupList", "Ljava/util/List;", "mWidgetGroupListCopy", "mWidgetGroupListContainer", "Lhir;", "Lcom/xiaomi/fitness/devicesettings/widget/ItemDeleteHighLightAreaView;", "mDeleteAreaView", "Lcom/xiaomi/fitness/devicesettings/widget/ItemDeleteHighLightAreaView;", "mIsDraggedDeleted", "Z", "mCanDeleteGroupList", "Landroid/graphics/Rect;", "mWidgetItemRect", "Landroid/graphics/Rect;", "mDeleteAreaRect", "mMinGroupSize", "I", "mMaxGroupSize", "", "mWidgetGroupManagerFragmentVisibleTime", "J", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "WidgetGroupItemTouchHelper", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetGroupManagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetGroupManagerFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupManagerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,442:1\n1863#2,2:443\n1863#2,2:445\n*S KotlinDebug\n*F\n+ 1 WidgetGroupManagerFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupManagerFragment\n*L\n272#1:443,2\n301#1:445,2\n*E\n"})
public final class WidgetGroupManagerFragment extends Hilt_WidgetGroupManagerFragment<sj6> implements e8h, a.InterfaceC0473a, p8h {

    @NotNull
    public static final String TAG = "WidgetGroupManagerFragment";
    public static final int sRequestCodeEdit = 100;
    public static final int sRequestCodeTemplate = 200;
    private boolean mCanDeleteGroupList;

    @Nullable
    private ItemDeleteHighLightAreaView mDeleteAreaView;
    private boolean mIsDraggedDeleted;
    private l mItemTouchHelper;

    @Nullable
    private l.e mItemTouchHelperCallback;
    private a mManagerAdapter;
    private int mMaxGroupSize;
    private int mMinGroupSize;

    @Nullable
    private TextView mTvEmpty;

    @Nullable
    private TextView mTvTitleHint;

    @Nullable
    private List<pir> mWidgetGroupList;

    @Nullable
    private hir mWidgetGroupListContainer;

    @Nullable
    private List<pir> mWidgetGroupListCopy;
    private long mWidgetGroupManagerFragmentVisibleTime;
    private RecyclerView mWidgetRecycler;

    @NotNull
    private final Rect mWidgetItemRect = new Rect();

    @NotNull
    private final Rect mDeleteAreaRect = new Rect();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010$J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0018\u0010\u000eJ\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupManagerFragment$WidgetGroupItemTouchHelper;", "Landroidx/recyclerview/widget/l$h;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "target", "", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "", "direction", "", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/graphics/Canvas;", PluginDeviceInfo.FICONON, "", "dX", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;FFIZ)V", "onSelectedChanged", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "isLongPressDragEnabled", "()Z", "mIsDeleteState", "Z", "mSelectPosition", "I", "dragDirs", "swipeDirs", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetGroupManagerFragment;II)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class WidgetGroupItemTouchHelper extends l.h {
        private boolean mIsDeleteState;
        private int mSelectPosition;

        public WidgetGroupItemTouchHelper(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.recyclerview.widget.l.e
        @SuppressLint({"NotifyDataSetChanged"})
        public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            super.clearView(recyclerView, viewHolder);
            WidgetGroupManagerFragment.this.endDrag();
            if (recyclerView.isComputingLayout()) {
                return;
            }
            a aVar = WidgetGroupManagerFragment.this.mManagerAdapter;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mManagerAdapter");
                aVar = null;
            }
            aVar.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean isLongPressDragEnabled() {
            return false;
        }

        @Override // androidx.recyclerview.widget.l.e
        public void onChildDraw(@NotNull Canvas c, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
            this.mSelectPosition = viewHolder.getAdapterPosition();
            WidgetGroupManagerFragment.access$getMBinding(WidgetGroupManagerFragment.this).A.getGlobalVisibleRect(WidgetGroupManagerFragment.this.mDeleteAreaRect);
            viewHolder.itemView.getGlobalVisibleRect(WidgetGroupManagerFragment.this.mWidgetItemRect);
            if (!WidgetGroupManagerFragment.this.mWidgetItemRect.intersect(WidgetGroupManagerFragment.this.mDeleteAreaRect) || WidgetGroupManagerFragment.this.mWidgetItemRect.bottom - WidgetGroupManagerFragment.this.mDeleteAreaRect.top <= 100) {
                ItemDeleteHighLightAreaView itemDeleteHighLightAreaView = WidgetGroupManagerFragment.this.mDeleteAreaView;
                Intrinsics.checkNotNull(itemDeleteHighLightAreaView);
                itemDeleteHighLightAreaView.b();
                this.mIsDeleteState = false;
                return;
            }
            this.mIsDeleteState = true;
            ItemDeleteHighLightAreaView itemDeleteHighLightAreaView2 = WidgetGroupManagerFragment.this.mDeleteAreaView;
            Intrinsics.checkNotNull(itemDeleteHighLightAreaView2);
            itemDeleteHighLightAreaView2.a();
        }

        @Override // androidx.recyclerview.widget.l.e
        public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, @NotNull RecyclerView.d0 target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            if (target instanceof a.b) {
                Logger.e(WidgetGroupManagerFragment.TAG, "onMove: add card cannot be sorted");
                return false;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            Collections.swap(WidgetGroupManagerFragment.this.mWidgetGroupList, adapterPosition, adapterPosition2);
            if (recyclerView.isComputingLayout()) {
                return true;
            }
            a aVar = WidgetGroupManagerFragment.this.mManagerAdapter;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mManagerAdapter");
                aVar = null;
            }
            aVar.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.l.e
        @SuppressLint({"NotifyDataSetChanged"})
        public void onSelectedChanged(@Nullable RecyclerView.d0 viewHolder, int actionState) {
            int i;
            if (this.mIsDeleteState && WidgetGroupManagerFragment.this.mCanDeleteGroupList && actionState == 0 && (i = this.mSelectPosition) >= 0) {
                List list = WidgetGroupManagerFragment.this.mWidgetGroupList;
                Intrinsics.checkNotNull(list);
                if (i < list.size()) {
                    WidgetGroupManagerFragment.this.mIsDraggedDeleted = true;
                    List list2 = WidgetGroupManagerFragment.this.mWidgetGroupList;
                    Intrinsics.checkNotNull(list2);
                    pir pirVar = (pir) list2.remove(this.mSelectPosition);
                    a aVar = WidgetGroupManagerFragment.this.mManagerAdapter;
                    if (aVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mManagerAdapter");
                        aVar = null;
                    }
                    aVar.notifyDataSetChanged();
                    ikr.i(CollectionsKt__CollectionsJVMKt.listOf(pirVar), "delete");
                }
            }
            this.mIsDeleteState = false;
            this.mSelectPosition = -1;
            super.onSelectedChanged(viewHolder, actionState);
        }

        @Override // androidx.recyclerview.widget.l.e
        public void onSwiped(@NotNull RecyclerView.d0 viewHolder, int direction) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ sj6 access$getMBinding(WidgetGroupManagerFragment widgetGroupManagerFragment) {
        return (sj6) widgetGroupManagerFragment.getMBinding();
    }

    private final void appendAddMask() {
        List<pir> list = this.mWidgetGroupList;
        Intrinsics.checkNotNull(list);
        int size = list.size();
        if (size <= this.mMaxGroupSize) {
            List<pir> list2 = this.mWidgetGroupList;
            Intrinsics.checkNotNull(list2);
            Iterator<pir> it = list2.iterator();
            while (it.hasNext()) {
                if (it.next().c() == 2) {
                    return;
                }
            }
            pir pirVar = new pir(2, size);
            pirVar.j(true);
            List<pir> list3 = this.mWidgetGroupList;
            Intrinsics.checkNotNull(list3);
            list3.add(pirVar);
        }
    }

    private final void checkListItemChanged() {
        if (!ikr.d(this.mWidgetGroupList, this.mWidgetGroupListCopy)) {
            onWidgetItemChanged();
        }
        List<pir> list = this.mWidgetGroupListCopy;
        Intrinsics.checkNotNull(list);
        list.clear();
    }

    private final void checkNumOfGroupList() {
        List<pir> list = this.mWidgetGroupList;
        Intrinsics.checkNotNull(list);
        int size = list.size();
        boolean z = true;
        if (size <= this.mMinGroupSize + 1) {
            TextView textView = this.mTvTitleHint;
            Intrinsics.checkNotNull(textView);
            textView.setText(wzi.ga);
            z = false;
        } else {
            TextView textView2 = this.mTvTitleHint;
            Intrinsics.checkNotNull(textView2);
            textView2.setText(wzi.fa);
        }
        this.mCanDeleteGroupList = z;
        if (size > this.mMaxGroupSize) {
            showOrHideAddCard(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleUpdateWidgetToDevice() {
        hir hirVar = this.mWidgetGroupListContainer;
        Intrinsics.checkNotNull(hirVar);
        jyo.b bVarI = hirVar.i();
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        if (!this.mIsDraggedDeleted) {
            ikr.i(this.mWidgetGroupList, "sort");
        }
        ((WidgetMangerViewModel) getMViewModel()).setWidgetGroupListToDevice(bVarI, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetGroupManagerFragment.handleUpdateWidgetToDevice.1
            @Override // defpackage.eu6
            public void onError(int errorCode) {
                Logger.e(WidgetGroupManagerFragment.TAG, "setWidgetGroupListToDevice: errorCode = " + errorCode);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.US, "%s,code = %d", Arrays.copyOf(new Object[]{WidgetGroupManagerFragment.this.getString(wzi.common_set_error), Integer.valueOf(errorCode)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                ToastUtil.showShortToast(str);
                WidgetGroupManagerFragment.this.dismissDialog();
            }

            @Override // defpackage.eu6
            public void onResult(Boolean result) {
                WidgetGroupManagerFragment.this.dismissDialog();
            }
        });
    }

    private final void initContentView(View view) {
        setTitleBackground(cji.x);
        this.mTvTitleHint = (TextView) view.findViewById(zqi.ua);
        this.mTvEmpty = (TextView) view.findViewById(zqi.ka);
        a aVar = new a();
        aVar.setOnDragListener(this);
        aVar.setOnWidgetGroupAddListener(this);
        aVar.m(this);
        this.mManagerAdapter = aVar;
        this.mWidgetRecycler = (RecyclerView) view.findViewById(zqi.J7);
        FullyLinearLayoutManager fullyLinearLayoutManager = new FullyLinearLayoutManager(getMActivity());
        RecyclerView recyclerView = this.mWidgetRecycler;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWidgetRecycler");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(fullyLinearLayoutManager);
        RecyclerView recyclerView3 = this.mWidgetRecycler;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWidgetRecycler");
            recyclerView3 = null;
        }
        a aVar2 = this.mManagerAdapter;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerAdapter");
            aVar2 = null;
        }
        recyclerView3.setAdapter(aVar2);
        WidgetGroupItemTouchHelper widgetGroupItemTouchHelper = new WidgetGroupItemTouchHelper(3, 0);
        this.mItemTouchHelperCallback = widgetGroupItemTouchHelper;
        Intrinsics.checkNotNull(widgetGroupItemTouchHelper);
        l lVar = new l(widgetGroupItemTouchHelper);
        this.mItemTouchHelper = lVar;
        RecyclerView recyclerView4 = this.mWidgetRecycler;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWidgetRecycler");
            recyclerView4 = null;
        }
        lVar.d(recyclerView4);
        UiUtils uiUtils = UiUtils.INSTANCE;
        RecyclerView recyclerView5 = this.mWidgetRecycler;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWidgetRecycler");
        } else {
            recyclerView2 = recyclerView5;
        }
        uiUtils.closeDefaultAnimator(recyclerView2);
        loadBottomView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadBottomView() {
        ((sj6) getMBinding()).A.removeAllViews();
        View viewInflate = LayoutInflater.from(getMActivity()).inflate(eui.k3, (ViewGroup) ((sj6) getMBinding()).A, true);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.mDeleteAreaView = (ItemDeleteHighLightAreaView) viewInflate.findViewById(zqi.e4);
    }

    private final void makeListCopy() {
        if (this.mWidgetGroupListCopy == null) {
            this.mWidgetGroupListCopy = new LinkedList();
        }
        List<pir> list = this.mWidgetGroupListCopy;
        Intrinsics.checkNotNull(list);
        list.clear();
        List<pir> list2 = this.mWidgetGroupList;
        if (list2 != null) {
            List<pir> list3 = this.mWidgetGroupListCopy;
            Intrinsics.checkNotNull(list3);
            list3.addAll(list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(WidgetGroupManagerFragment this$0, hir listContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listContainer, "listContainer");
        this$0.dismissDialog();
        if (listContainer == hir.f) {
            ToastUtil.showShortToast(wzi.h2);
        } else {
            this$0.onWidgetGroupAvailable(listContainer);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void onWidgetGroupAvailable(hir listContainer) {
        Logger.d(TAG, "onWidgetGroupAvailable: listContainer = " + listContainer);
        if (listContainer == null || !listContainer.f()) {
            showEmtpyInfo(true);
            return;
        }
        this.mWidgetGroupListContainer = listContainer;
        this.mMinGroupSize = listContainer.b();
        this.mMaxGroupSize = listContainer.a();
        this.mWidgetGroupList = listContainer.d();
        appendAddMask();
        checkNumOfGroupList();
        a aVar = this.mManagerAdapter;
        a aVar2 = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerAdapter");
            aVar = null;
        }
        aVar.setList(this.mWidgetGroupList);
        a aVar3 = this.mManagerAdapter;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerAdapter");
        } else {
            aVar2 = aVar3;
        }
        aVar2.notifyDataSetChanged();
        List<pir> list = this.mWidgetGroupList;
        showEmtpyInfo(list != null ? list.isEmpty() : true);
        ikr.i(this.mWidgetGroupList, "init");
    }

    private final void onWidgetItemChanged() {
        hir hirVar = this.mWidgetGroupListContainer;
        if (hirVar != null) {
            Intrinsics.checkNotNull(hirVar);
            hirVar.e();
            handleUpdateWidgetToDevice();
        }
    }

    private final void showEmtpyInfo(boolean isShow) {
        RecyclerView recyclerView = null;
        if (isShow) {
            TextView textView = this.mTvEmpty;
            Intrinsics.checkNotNull(textView);
            textView.setVisibility(0);
            TextView textView2 = this.mTvTitleHint;
            Intrinsics.checkNotNull(textView2);
            textView2.setVisibility(8);
            RecyclerView recyclerView2 = this.mWidgetRecycler;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWidgetRecycler");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setVisibility(8);
            return;
        }
        TextView textView3 = this.mTvEmpty;
        Intrinsics.checkNotNull(textView3);
        textView3.setVisibility(8);
        TextView textView4 = this.mTvTitleHint;
        Intrinsics.checkNotNull(textView4);
        textView4.setVisibility(0);
        RecyclerView recyclerView3 = this.mWidgetRecycler;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWidgetRecycler");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setVisibility(0);
    }

    private final void showOrHideAddCard(boolean visible) {
        List<pir> list = this.mWidgetGroupList;
        Intrinsics.checkNotNull(list);
        int size = list.size() - 1;
        List<pir> list2 = this.mWidgetGroupList;
        Intrinsics.checkNotNull(list2);
        pir pirVar = list2.get(size);
        pirVar.j(visible);
        if (size >= this.mMaxGroupSize) {
            pirVar.j(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void startDragItem$lambda$2(WidgetGroupManagerFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((sj6) this$0.getMBinding()).A.getGlobalVisibleRect(this$0.mDeleteAreaRect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void endDrag() {
        ((sj6) getMBinding()).A.setVisibility(8);
        ((sj6) getMBinding()).B.setPadding(0, 0, 0, 0);
        showOrHideAddCard(true);
        checkNumOfGroupList();
        checkListItemChanged();
        this.mIsDraggedDeleted = false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.P0;
    }

    @Nullable
    public final l.e getMItemTouchHelperCallback() {
        return this.mItemTouchHelperCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == 100 || requestCode == 200) && resultCode == -1) {
            ((WidgetMangerViewModel) getMViewModel()).loadWidgetGroupListLiveData();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mWidgetGroupManagerFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "widget_management_detail_page", "title", getString(wzi.ba), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mWidgetGroupManagerFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // defpackage.p8h
    public void onItemClick(@Nullable View view, @Nullable Object groupWrapper) {
        if (!(groupWrapper instanceof pir) || this.mWidgetGroupListContainer == null) {
            Logger.e(TAG, "mWidgetGroupListContainer:" + this.mWidgetGroupListContainer);
            return;
        }
        Bundle bundle = new Bundle();
        pir pirVar = (pir) groupWrapper;
        bundle.putInt("widget_group_sequence", pirVar.a());
        bundle.putInt(WidgetGroupEditFragment.KEY_WIDGET_GROUP_STYLE, pirVar.b());
        bundle.putString("origin", WidgetGroupEditFragment.ORIGIN_PAGE_MANAGE);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        List<kyo> listH = pirVar.h();
        Intrinsics.checkNotNullExpressionValue(listH, "getWidgetList(...)");
        for (kyo kyoVar : listH) {
            Intrinsics.checkNotNull(kyoVar);
            arrayList.add(WidgetBeanKt.convert2WidgetBean(kyoVar));
        }
        bundle.putParcelableArrayList(WidgetGroupEditFragment.sKeyWidgetBeanList, arrayList);
        BaseFragmentExKt.gotoPageForResult(this, (Class<?>) WidgetGroupEditFragment.class, bundle, 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.ba);
        initContentView(view);
        PageState.DefaultImpls.showLoading$default(this, null, 0, true, 3, null);
        ((WidgetMangerViewModel) getMViewModel()).getMWidgetGroupListLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: nir
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                WidgetGroupManagerFragment.onViewCreated$lambda$0(this.f27969a, (hir) obj);
            }
        });
        ((WidgetMangerViewModel) getMViewModel()).loadWidgetGroupListLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mWidgetGroupManagerFragmentVisibleTime = System.currentTimeMillis();
    }

    @Override // com.xiaomi.fitness.devicesettings.bluttooth.widget.a.InterfaceC0473a
    public void onWidgetGroupAddClick() {
        List<Integer> listC;
        if (this.mWidgetGroupListContainer == null) {
            Logger.e(TAG, "mWidgetGroupListContainer is null");
            return;
        }
        Bundle bundle = new Bundle();
        List<pir> list = this.mWidgetGroupList;
        Intrinsics.checkNotNull(list);
        bundle.putInt("widget_group_sequence", list.size());
        ArrayList<Integer> arrayList = new ArrayList<>();
        hir hirVar = this.mWidgetGroupListContainer;
        if (hirVar != null && (listC = hirVar.c()) != null) {
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
        }
        bundle.putIntegerArrayList(WidgetTemplateFragment.sKeySupportedWidgetGroupStyles, arrayList);
        BaseFragmentExKt.gotoPageForResult(this, (Class<?>) WidgetTemplateFragment.class, bundle, 200);
    }

    public final void setMItemTouchHelperCallback(@Nullable l.e eVar) {
        this.mItemTouchHelperCallback = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e8h
    public void startDragItem(@Nullable RecyclerView.d0 holder) {
        showOrHideAddCard(false);
        a aVar = this.mManagerAdapter;
        l lVar = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerAdapter");
            aVar = null;
        }
        List<pir> list = this.mWidgetGroupList;
        Intrinsics.checkNotNull(list);
        aVar.notifyItemChanged(list.size() - 1);
        l lVar2 = this.mItemTouchHelper;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemTouchHelper");
        } else {
            lVar = lVar2;
        }
        Intrinsics.checkNotNull(holder);
        lVar.x(holder);
        makeListCopy();
        if (this.mCanDeleteGroupList) {
            ((sj6) getMBinding()).A.setVisibility(0);
            ((sj6) getMBinding()).B.setPadding(0, 0, 0, 0);
            ((sj6) getMBinding()).A.post(new Runnable() { // from class: mir
                @Override // java.lang.Runnable
                public final void run() {
                    WidgetGroupManagerFragment.startDragItem$lambda$2(this.f26230a);
                }
            });
            ItemDeleteHighLightAreaView itemDeleteHighLightAreaView = this.mDeleteAreaView;
            Intrinsics.checkNotNull(itemDeleteHighLightAreaView);
            itemDeleteHighLightAreaView.b();
        }
    }
}
