package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.device.HMShortcutAppSortNewActivity;
import com.xiaomi.hm.health.device.viewmodel.ShortcutAppSortNewViewModel;
import com.xiaomi.hm.health.model.account.secondaryscreen.SecondaryModel;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.view.dslv.DragSortController;
import com.xiaomi.hm.health.view.dslv.DragSortListView;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0002GHB\u0007¢\u0006\u0004\bE\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u00032\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u0003H\u0014J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014J\u000e\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\rJ\u0006\u0010#\u001a\u00020\u0003R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u00105R\u001a\u0010:\u001a\u000607R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010%\u001a\u0004\b=\u0010>R\u001d\u0010D\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "L", "C", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/model/account/secondaryscreen/SecondaryModel;", "Lkotlin/collections/ArrayList;", "data", "u", "", "from", "to", "", "G", "H", "type", "t", "K", "", "x", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onLeftClicked", "onBackPressed", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onRightOnClicked", "msg", "showLoginDialog", "hideProgressDialog", "Lcom/xiaomi/hm/health/device/viewmodel/ShortcutAppSortNewViewModel;", "Lkotlin/Lazy;", "y", "()Lcom/xiaomi/hm/health/device/viewmodel/ShortcutAppSortNewViewModel;", "viewModel", "Z", "edited", "Landroid/view/View;", "maskView", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "Landroid/view/ViewGroup;", "B", "Landroid/view/ViewGroup;", "notificationPermissionTip", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "titleBar", "Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity$DragSortAdapter;", LogUtil.D, "Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity$DragSortAdapter;", "adapter", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "E", "v", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "F", "w", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "<init>", "()V", "Companion", "DragSortAdapter", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMShortcutAppSortNewActivity extends BaseTitleActivity implements KoinComponent {

    @NotNull
    private static final String G = "HMShortcutAppSortNewActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    private ViewGroup notificationPermissionTip;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private RainbowTitleBar titleBar;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean edited;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private View maskView;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final DragSortAdapter adapter = new DragSortAdapter();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n0\u0004R\u00060\u0000R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\n2\u000e\u0010\u0006\u001a\n0\u0004R\u00060\u0000R\u00020\u0005H\u0002J$\u0010\u0011\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity$DragSortAdapter;", "Landroid/widget/BaseAdapter;", "Lcom/xiaomi/hm/health/model/account/secondaryscreen/SecondaryModel;", "model", "Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity$DragSortAdapter$ViewHolder;", "Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity;", "viewHolder", "", "dividerIndex", "position", "", GoogleApiAvailabilityLight.a, "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/ViewGroup;", "parent", "getView", "getItem", "", "getItemId", "getCount", "<init>", "(Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity;)V", "ViewHolder", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class DragSortAdapter extends BaseAdapter {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity$DragSortAdapter$ViewHolder;", "", "Landroid/view/View;", "a", "Landroid/view/View;", "getGroup", "()Landroid/view/View;", "setGroup", "(Landroid/view/View;)V", "group", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getDividerItem", "()Landroid/widget/TextView;", "setDividerItem", "(Landroid/widget/TextView;)V", "dividerItem", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "getSortIcon", "()Landroid/widget/ImageView;", "setSortIcon", "(Landroid/widget/ImageView;)V", "sortIcon", GoogleApiAvailabilityLight.a, "getSortItemText", "setSortItemText", "sortItemText", "e", "getSortItemDragArea", "setSortItemDragArea", "sortItemDragArea", "", "f", LogUtil.I, "getPosition", "()I", "setPosition", "(I)V", "position", "<init>", "(Lcom/xiaomi/hm/health/device/HMShortcutAppSortNewActivity$DragSortAdapter;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public final class ViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            private View group;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            private TextView dividerItem;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            private ImageView sortIcon;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @Nullable
            private TextView sortItemText;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @Nullable
            private View sortItemDragArea;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private int position;

            public ViewHolder() {
            }

            @Nullable
            public final TextView getDividerItem() {
                return this.dividerItem;
            }

            @Nullable
            public final View getGroup() {
                return this.group;
            }

            public final int getPosition() {
                return this.position;
            }

            @Nullable
            public final ImageView getSortIcon() {
                return this.sortIcon;
            }

            @Nullable
            public final View getSortItemDragArea() {
                return this.sortItemDragArea;
            }

            @Nullable
            public final TextView getSortItemText() {
                return this.sortItemText;
            }

            public final void setDividerItem(@Nullable TextView textView) {
                this.dividerItem = textView;
            }

            public final void setGroup(@Nullable View view) {
                this.group = view;
            }

            public final void setPosition(int i) {
                this.position = i;
            }

            public final void setSortIcon(@Nullable ImageView imageView) {
                this.sortIcon = imageView;
            }

            public final void setSortItemDragArea(@Nullable View view) {
                this.sortItemDragArea = view;
            }

            public final void setSortItemText(@Nullable TextView textView) {
                this.sortItemText = textView;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SecondaryModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SecondaryModel secondaryModel) {
                super(0);
                this.a = secondaryModel;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "[ERROR]not support:" + this.a;
            }
        }

        public DragSortAdapter() {
        }

        private final void b(final ViewHolder viewHolder) {
            ImageView sortIcon = viewHolder.getSortIcon();
            if (sortIcon == null) {
                return;
            }
            final HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity = HMShortcutAppSortNewActivity.this;
            sortIcon.setOnClickListener(new View.OnClickListener() { // from class: xg3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HMShortcutAppSortNewActivity.DragSortAdapter.c(hMShortcutAppSortNewActivity, viewHolder, this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity, ViewHolder viewHolder, DragSortAdapter dragSortAdapter, View view) {
            int dividerIndex = hMShortcutAppSortNewActivity.y().getDividerIndex();
            if (viewHolder.getPosition() < dividerIndex) {
                hMShortcutAppSortNewActivity.y().delete(viewHolder.getPosition(), dividerIndex);
                hMShortcutAppSortNewActivity.edited = true;
            } else if (dividerIndex <= 10) {
                hMShortcutAppSortNewActivity.y().add(viewHolder.getPosition());
                hMShortcutAppSortNewActivity.edited = true;
            } else {
                IconToast.showError(hMShortcutAppSortNewActivity, R.string.sort_max_visible_size);
            }
            dragSortAdapter.notifyDataSetChanged();
        }

        private final void d(SecondaryModel model, ViewHolder viewHolder, int dividerIndex, int position) {
            if (HMShortcutAppSortNewActivity.this.t(model.getType())) {
                View group = viewHolder.getGroup();
                if (group != null) {
                    group.setVisibility(0);
                }
                ImageView sortIcon = viewHolder.getSortIcon();
                if (sortIcon != null) {
                    sortIcon.setImageResource(R.drawable.icon_item_quick_delete);
                }
                ImageView sortIcon2 = viewHolder.getSortIcon();
                if (sortIcon2 != null) {
                    sortIcon2.setEnabled(false);
                }
                View sortItemDragArea = viewHolder.getSortItemDragArea();
                if (sortItemDragArea != null) {
                    sortItemDragArea.setVisibility(0);
                }
                TextView dividerItem = viewHolder.getDividerItem();
                if (dividerItem == null) {
                    return;
                }
                dividerItem.setVisibility(8);
                return;
            }
            if (position < dividerIndex) {
                View group2 = viewHolder.getGroup();
                if (group2 != null) {
                    group2.setVisibility(0);
                }
                ImageView sortIcon3 = viewHolder.getSortIcon();
                if (sortIcon3 != null) {
                    sortIcon3.setImageResource(R.drawable.icon_item_quick_delete);
                }
                ImageView sortIcon4 = viewHolder.getSortIcon();
                if (sortIcon4 != null) {
                    sortIcon4.setEnabled(true);
                }
                View sortItemDragArea2 = viewHolder.getSortItemDragArea();
                if (sortItemDragArea2 != null) {
                    sortItemDragArea2.setVisibility(0);
                }
                TextView dividerItem2 = viewHolder.getDividerItem();
                if (dividerItem2 == null) {
                    return;
                }
                dividerItem2.setVisibility(8);
                return;
            }
            if (position == dividerIndex) {
                View group3 = viewHolder.getGroup();
                if (group3 != null) {
                    group3.setVisibility(8);
                }
                TextView dividerItem3 = viewHolder.getDividerItem();
                if (dividerItem3 == null) {
                    return;
                }
                dividerItem3.setVisibility(0);
                return;
            }
            View group4 = viewHolder.getGroup();
            if (group4 != null) {
                group4.setVisibility(0);
            }
            ImageView sortIcon5 = viewHolder.getSortIcon();
            if (sortIcon5 != null) {
                sortIcon5.setImageResource(R.drawable.icon_item_quick_add);
            }
            ImageView sortIcon6 = viewHolder.getSortIcon();
            if (sortIcon6 != null) {
                sortIcon6.setEnabled(true);
            }
            View sortItemDragArea3 = viewHolder.getSortItemDragArea();
            if (sortItemDragArea3 != null) {
                sortItemDragArea3.setVisibility(8);
            }
            TextView dividerItem4 = viewHolder.getDividerItem();
            if (dividerItem4 == null) {
                return;
            }
            dividerItem4.setVisibility(8);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return HMShortcutAppSortNewActivity.this.y().m3447getSecondaryModelList().size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(int position, @Nullable View view, @Nullable ViewGroup parent) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(HMShortcutAppSortNewActivity.this).inflate(R.layout.sort_item_app_new_layout, (ViewGroup) null);
                viewHolder = new ViewHolder();
                viewHolder.setGroup(view.findViewById(R.id.sort_item_group));
                viewHolder.setDividerItem((TextView) view.findViewById(R.id.divider_item));
                viewHolder.setSortIcon((ImageView) view.findViewById(R.id.sort_icon));
                viewHolder.setSortItemText((TextView) view.findViewById(R.id.sort_item_text));
                viewHolder.setSortItemDragArea(view.findViewById(R.id.sort_item_drag_area));
                viewHolder.setPosition(position);
                view.setTag(viewHolder);
                b(viewHolder);
            } else {
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.xiaomi.hm.health.device.HMShortcutAppSortNewActivity.DragSortAdapter.ViewHolder");
                viewHolder = (ViewHolder) tag;
                viewHolder.setPosition(position);
            }
            SecondaryModel item = getItem(position);
            String strX = HMShortcutAppSortNewActivity.this.x(item.getType());
            int dividerIndex = HMShortcutAppSortNewActivity.this.y().getDividerIndex();
            if (TextUtils.isEmpty(strX) && position != dividerIndex) {
                view.setVisibility(8);
                HMLog.info(HMShortcutAppSortNewActivity.G, new a(item));
                return view;
            }
            view.setVisibility(0);
            TextView sortItemText = viewHolder.getSortItemText();
            if (sortItemText != null) {
                sortItemText.setText(strX);
            }
            d(item, viewHolder, dividerIndex, position);
            return view;
        }

        @Override // android.widget.Adapter
        @NotNull
        public SecondaryModel getItem(int position) {
            return HMShortcutAppSortNewActivity.this.y().m3447getSecondaryModelList().get(position);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "drop from " + this.a + " to " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Dragging Limit";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/viewmodel/ShortcutAppSortNewViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ShortcutAppSortNewViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShortcutAppSortNewViewModel getA() {
            return (ShortcutAppSortNewViewModel) ViewModelProviders.of(HMShortcutAppSortNewActivity.this).get(ShortcutAppSortNewViewModel.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMShortcutAppSortNewActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.HMShortcutAppSortNewActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.HMShortcutAppSortNewActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final KeeperProxyApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), objArr2, objArr3);
            }
        });
    }

    private final void A() {
        DragSortListView dragSortListView = (DragSortListView) findViewById(R.id.sort_listview);
        DragSortController dragSortController = new DragSortController(dragSortListView);
        dragSortController.setDragHandleId(R.id.sort_item_drag_area);
        dragSortController.setRemoveEnabled(false);
        dragSortController.setSortEnabled(true);
        dragSortController.setDragInitMode(2);
        dragSortListView.setDragEnabled(true);
        dragSortListView.setOnTouchListener(dragSortController);
        dragSortListView.setFloatViewManager(dragSortController);
        dragSortListView.setAdapter((ListAdapter) this.adapter);
        dragSortListView.setDropListener(new DragSortListView.DropListener() { // from class: wg3
            @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.DropListener
            public final void drop(int i, int i2) {
                HMShortcutAppSortNewActivity.B(this.a, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity, int i, int i2) {
        HMLog.debug(G, new a(i, i2));
        if (i == i2) {
            return;
        }
        if (hMShortcutAppSortNewActivity.H(i, i2)) {
            HMLog.info(G, b.a);
            return;
        }
        hMShortcutAppSortNewActivity.edited = true;
        hMShortcutAppSortNewActivity.y().drag(i, i2);
        hMShortcutAppSortNewActivity.adapter.notifyDataSetChanged();
        if (hMShortcutAppSortNewActivity.G(i, i2)) {
            HMShotcutAppSortActivity.showAlipayTips(hMShortcutAppSortNewActivity);
        }
        hMShortcutAppSortNewActivity.K();
    }

    private final void C() {
        y().getBtStatusEnable().observe(this, new Observer() { // from class: sg3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMShortcutAppSortNewActivity.D(this.a, (Boolean) obj);
            }
        });
        y().getSecondaryModelList().observe(this, new Observer() { // from class: ug3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMShortcutAppSortNewActivity.E(this.a, (ArrayList) obj);
            }
        });
        y().getSaveType().observe(this, new Observer() { // from class: tg3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMShortcutAppSortNewActivity.F(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity, Boolean bool) {
        if (bool.booleanValue()) {
            View view = hMShortcutAppSortNewActivity.maskView;
            if (view != null) {
                view.setVisibility(8);
            }
            hMShortcutAppSortNewActivity.K();
            return;
        }
        View view2 = hMShortcutAppSortNewActivity.maskView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        ViewGroup viewGroup = hMShortcutAppSortNewActivity.notificationPermissionTip;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity, ArrayList arrayList) {
        hMShortcutAppSortNewActivity.adapter.notifyDataSetChanged();
        hMShortcutAppSortNewActivity.u(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(final HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity, Integer num) {
        LoadingDialog loadingDialog;
        if (num != null && num.intValue() == 1) {
            hMShortcutAppSortNewActivity.showLoginDialog(R.string.saving);
            return;
        }
        if (num != null && num.intValue() == 2) {
            LoadingDialog loadingDialog2 = hMShortcutAppSortNewActivity.loadingDialog;
            if (loadingDialog2 == null) {
                return;
            }
            loadingDialog2.setSuccess(hMShortcutAppSortNewActivity.getString(R.string.save_success), new LoadingDialog.OnAnimEndListener() { // from class: com.xiaomi.hm.health.device.HMShortcutAppSortNewActivity$initViewModel$3$1
                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onAnimEnd(@NotNull LoadingDialog dialog) {
                }

                @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
                public void onDismiss(@NotNull LoadingDialog dialog) {
                    this.a.finish();
                }
            });
            return;
        }
        if (num == null || num.intValue() != 3 || (loadingDialog = hMShortcutAppSortNewActivity.loadingDialog) == null) {
            return;
        }
        loadingDialog.setFailed(hMShortcutAppSortNewActivity.getString(R.string.save_failed));
    }

    private final boolean G(int from, int to) {
        int dividerIndex = y().getDividerIndex();
        return v().isHK(this) && from >= dividerIndex && to < dividerIndex && y().m3447getSecondaryModelList().get(from).getType() == 17;
    }

    private final boolean H(int from, int to) {
        return t(y().m3447getSecondaryModelList().get(from).getType()) && to >= y().getDividerIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity, View view) {
        hMShortcutAppSortNewActivity.onLeftClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity, View view, int i) {
        hMShortcutAppSortNewActivity.onRightOnClicked(view);
    }

    private final void K() {
        HMAppSortActivity.showNotificationPermissionTip(this, this.notificationPermissionTip, v().shouldInitMusic() && y().isMusicEnable());
    }

    private final void L() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.sort_save_cancle).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: qg3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMShortcutAppSortNewActivity.M(dialogInterface, i);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: pg3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMShortcutAppSortNewActivity.N(this.a, dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(HMShortcutAppSortNewActivity hMShortcutAppSortNewActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        hMShortcutAppSortNewActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(int type) {
        return type == 18;
    }

    private final void u(ArrayList<SecondaryModel> data) {
        if (v().isHK(this) && w().getShowHKAlipayTips()) {
            for (SecondaryModel secondaryModel : data) {
                if (secondaryModel.getType() == 17 && secondaryModel.isEnable()) {
                    HMShotcutAppSortActivity.showAlipayTips(this);
                    w().setShowHKAlipayTips(false);
                    return;
                }
            }
        }
    }

    private final DeviceUtilsApi v() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final KeeperProxyApi w() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String x(int type) {
        if (type == 1) {
            return getApplicationContext().getString(R.string.setting_app_status);
        }
        if (type == 2) {
            return getApplicationContext().getString(R.string.setting_app_hr);
        }
        if (type == 3) {
            return getApplicationContext().getString(R.string.setting_app_activities);
        }
        if (type == 4) {
            return getApplicationContext().getString(R.string.setting_app_weather);
        }
        if (type == 6) {
            return getApplicationContext().getString(R.string.setting_app_notification);
        }
        if (type == 21) {
            return getApplicationContext().getString(R.string.event_remind_title);
        }
        if (type == 49) {
            return getApplicationContext().getString(R.string.wechat_pay);
        }
        if (type == 51) {
            return getApplicationContext().getString(R.string.setting_app_breath_train);
        }
        if (type == 67) {
            return getApplicationContext().getString(R.string.device_app_sort_flashlight);
        }
        if (type == 25) {
            return getApplicationContext().getString(R.string.pai);
        }
        if (type == 26) {
            return getApplicationContext().getString(R.string.app_sort_world_clock);
        }
        if (type == 35) {
            return getApplicationContext().getString(R.string.sort_sleep);
        }
        if (type == 36) {
            return getApplicationContext().getString(R.string.setting_app_spo2);
        }
        if (type == 56) {
            return getApplicationContext().getString(R.string.device_app_sort_tomato_timer);
        }
        if (type == 57) {
            return getApplicationContext().getString(R.string.alexa);
        }
        switch (type) {
            case 8:
                return getApplicationContext().getString(R.string.app_sort_dnd);
            case 9:
                return getApplicationContext().getString(R.string.setting_app_alarm);
            case 10:
                return getApplicationContext().getString(R.string.app_sort_photograph);
            case 11:
                return getApplicationContext().getString(R.string.app_sort_music);
            case 12:
                return getApplicationContext().getString(R.string.app_sort_stopwatch);
            case 13:
                return getApplicationContext().getString(R.string.app_sort_countdown);
            case 14:
                return getApplicationContext().getString(R.string.app_sort_find_phone);
            case 15:
                return getApplicationContext().getString(R.string.app_sort_mute);
            case 16:
                return getApplicationContext().getString(R.string.app_sort_card_bag);
            case 17:
                return getApplicationContext().getString(R.string.bind_alipay);
            case 18:
                return getApplicationContext().getString(R.string.setting_app_dialplate);
            default:
                switch (type) {
                    case 28:
                        return getApplicationContext().getString(R.string.setting_app_pressure);
                    case 29:
                        return getApplicationContext().getString(R.string.setting_app_women_health);
                    case 30:
                        return getApplicationContext().getString(R.string.setting_app_activities_status);
                    case 31:
                        return getApplicationContext().getString(R.string.app_sort_voice);
                    case 32:
                        return getApplicationContext().getString(R.string.app_sort_calendar);
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShortcutAppSortNewViewModel y() {
        return (ShortcutAppSortNewViewModel) this.viewModel.getValue();
    }

    private final void z() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.HMShortcutAppSortNewActivity$initBTStatus$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                this.a.y().setBtStatusEnable(enable);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final void hideProgressDialog() {
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.loadingDialog.dismiss();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.edited) {
            L();
        } else {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scapp_sort_new_layout);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.s38), !RainbowUtils.isDarkMode(this));
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.tv_title_bar);
        this.titleBar = rainbowTitleBar;
        Objects.requireNonNull(rainbowTitleBar);
        rainbowTitleBar.setNavigationText(R.string.cancel);
        RainbowTitleBar rainbowTitleBar2 = this.titleBar;
        Objects.requireNonNull(rainbowTitleBar2);
        rainbowTitleBar2.setMenuText(R.string.save);
        RainbowTitleBar rainbowTitleBar3 = this.titleBar;
        Objects.requireNonNull(rainbowTitleBar3);
        rainbowTitleBar3.setNavigationOnClickListener(new View.OnClickListener() { // from class: rg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMShortcutAppSortNewActivity.I(this.a, view);
            }
        });
        RainbowTitleBar rainbowTitleBar4 = this.titleBar;
        Objects.requireNonNull(rainbowTitleBar4);
        rainbowTitleBar4.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: vg3
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                HMShortcutAppSortNewActivity.J(this.a, view, i);
            }
        });
        this.notificationPermissionTip = (ViewGroup) findViewById(R.id.notification_permission_container);
        this.maskView = findViewById(R.id.mask_view);
        K();
        A();
        C();
        z();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        if (this.edited) {
            L();
        } else {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        K();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightOnClicked(@Nullable View view) {
        if (this.edited) {
            y().save();
        } else {
            finish();
        }
    }

    public final void showLoginDialog(int msg) {
        if (isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            this.loadingDialog = LoadingDialog.showDialog(this, getString(msg));
        } else if (loadingDialog != null) {
            loadingDialog.setMessage(getString(msg));
        }
        LoadingDialog loadingDialog2 = this.loadingDialog;
        if (loadingDialog2 != null) {
            loadingDialog2.setCancelable(false);
        }
        LoadingDialog loadingDialog3 = this.loadingDialog;
        if (loadingDialog3 == null) {
            return;
        }
        loadingDialog3.show();
    }
}
