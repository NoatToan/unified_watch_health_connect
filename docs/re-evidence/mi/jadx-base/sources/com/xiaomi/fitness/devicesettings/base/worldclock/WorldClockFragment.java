package com.xiaomi.fitness.devicesettings.base.worldclock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockFragment;
import com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.aje;
import defpackage.av6;
import defpackage.eui;
import defpackage.jni;
import defpackage.oi6;
import defpackage.qyi;
import defpackage.wc0;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001_\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\bd\u0010\u001bJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b)\u0010*J3\u0010/\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u000f2\u0006\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u00100J+\u00101\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u0010\u001bJ)\u0010<\u001a\u00020\b2\u0006\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020+2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010\u001bR\u001a\u0010?\u001a\u00020+8\u0006X\u0086D¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010J\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010B¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockViewModel;", "Loi6;", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$OnItemClickListener;", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter$DragListener;", "", "isEditMode", "", "display", "(Z)V", "changeEditStatus", "editMode", "setEditMode", "", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "cities", "bindDataToView", "(Ljava/util/List;)V", "", "", "cityIdList", "deleteSelectList", "cityId", "findItemById", "(Ljava/lang/String;)Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "displayDataList", "()V", "onAddViewClick", "onDeleteViewClick", "onImgBackClick", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "position", "wordClockBean", "isAllSelected", "onItemClick", "(Landroid/view/View;ILcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;Z)V", "onItemLongClick", "(Landroid/view/View;ILcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;)V", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "startDragItem", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "endDrag", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_DESTROY, "sRequestCodeChooseCity", "I", "getSRequestCodeChooseCity", "()I", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "currentTimeID", "Ljava/lang/String;", "getCurrentTimeID", "()Ljava/lang/String;", "setCurrentTimeID", "(Ljava/lang/String;)V", "mDataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter;", "mAdapter", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockAdapter;", "Landroidx/recyclerview/widget/l;", "mTouchHelper", "Landroidx/recyclerview/widget/l;", "Z", "deleteView", "Landroid/view/View;", "addView", "Landroid/widget/ImageView;", "rightIconView", "Landroid/widget/ImageView;", "com/xiaomi/fitness/devicesettings/base/worldclock/WorldClockFragment$mTimeSetReceiver$1", "mTimeSetReceiver", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockFragment$mTimeSetReceiver$1;", "getLayoutId", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WorldClockFragment extends BaseBindingFragment<WorldClockViewModel, oi6> implements WorldClockAdapter.OnItemClickListener, WorldClockAdapter.DragListener {

    @Nullable
    private View addView;

    @Nullable
    private String currentTimeID;

    @Nullable
    private View deleteView;
    private boolean isEditMode;

    @Nullable
    private WorldClockAdapter mAdapter;
    public RecyclerView mRecyclerView;

    @Nullable
    private l mTouchHelper;

    @Nullable
    private ImageView rightIconView;
    private final int sRequestCodeChooseCity = 10;

    @NotNull
    private final List<TimeZoneItem> mDataList = new ArrayList();

    @NotNull
    private final WorldClockFragment$mTimeSetReceiver$1 mTimeSetReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockFragment$mTimeSetReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WorldClockAdapter worldClockAdapter = this.this$0.mAdapter;
            if (worldClockAdapter != null) {
                worldClockAdapter.notifyDataSetChanged();
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ WorldClockViewModel access$getMViewModel(WorldClockFragment worldClockFragment) {
        return (WorldClockViewModel) worldClockFragment.getMViewModel();
    }

    private final void bindDataToView(List<TimeZoneItem> cities) {
        hideLoading();
        if (cities != null) {
            this.mDataList.clear();
            this.mDataList.addAll(cities);
            displayDataList();
        }
    }

    private final void changeEditStatus(boolean isEditMode) {
        if (isEditMode) {
            View view = this.deleteView;
            Intrinsics.checkNotNull(view);
            view.setVisibility(0);
            View view2 = this.addView;
            Intrinsics.checkNotNull(view2);
            view2.setVisibility(8);
            return;
        }
        setTitle(wzi.L2);
        View view3 = this.deleteView;
        Intrinsics.checkNotNull(view3);
        view3.setVisibility(8);
        View view4 = this.addView;
        Intrinsics.checkNotNull(view4);
        view4.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void deleteSelectList(List<String> cityIdList) {
        if (cityIdList == null) {
            dismissDialog();
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, wzi.oa);
                return;
            }
            return;
        }
        if (this.isEditMode) {
            display(false);
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        int size = cityIdList.size();
        for (int i = 0; i < size; i++) {
            TimeZoneItem timeZoneItemFindItemById = findItemById(cityIdList.get(i));
            if (timeZoneItemFindItemById != null) {
                this.mDataList.remove(timeZoneItemFindItemById);
            }
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            WorldClockViewModel.syncWorldTime$default((WorldClockViewModel) getMViewModel(), this.mDataList, null, 2, null);
        }
        displayDataList();
        setEditMode(false);
    }

    private final void display(boolean isEditMode) {
        View startView;
        List<TimeZoneItem> selectedList;
        View startView2;
        this.isEditMode = isEditMode;
        WorldClockAdapter worldClockAdapter = this.mAdapter;
        Intrinsics.checkNotNull(worldClockAdapter);
        worldClockAdapter.setEditStatus(isEditMode);
        if (isEditMode) {
            ImageView imageView = this.rightIconView;
            if (imageView != null) {
                imageView.setImageResource(jni.Q);
            }
            wc0 miuiActionBar = getMiuiActionBar();
            if (miuiActionBar != null && (startView2 = miuiActionBar.getStartView()) != null) {
                startView2.setOnClickListener(new View.OnClickListener() { // from class: nor
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WorldClockFragment.display$lambda$8(this.f28210a, view);
                    }
                });
            }
            ImageView imageView2 = this.rightIconView;
            if (imageView2 != null) {
                WorldClockAdapter worldClockAdapter2 = this.mAdapter;
                imageView2.setSelected((worldClockAdapter2 == null || (selectedList = worldClockAdapter2.getSelectedList()) == null || selectedList.size() != this.mDataList.size()) ? false : true);
            }
        } else {
            WorldClockAdapter worldClockAdapter3 = this.mAdapter;
            if (worldClockAdapter3 != null) {
                worldClockAdapter3.selectAll(false);
            }
            wc0 miuiActionBar2 = getMiuiActionBar();
            if (miuiActionBar2 != null && (startView = miuiActionBar2.getStartView()) != null) {
                startView.setOnClickListener(new View.OnClickListener() { // from class: oor
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WorldClockFragment.display$lambda$9(this.f29348a, view);
                    }
                });
            }
            ImageView imageView3 = this.rightIconView;
            if (imageView3 != null) {
                imageView3.setImageResource(jni.X);
            }
            ImageView imageView4 = this.rightIconView;
            if (imageView4 != null) {
                ViewExtKt.setVisible(imageView4, true ^ this.mDataList.isEmpty());
            }
            ImageView imageView5 = this.rightIconView;
            if (imageView5 != null) {
                imageView5.setContentDescription(getString(wzi.Q1));
            }
        }
        changeEditStatus(isEditMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void display$lambda$8(WorldClockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onImgBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void display$lambda$9(WorldClockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onImgBackClick();
    }

    private final void displayDataList() {
        if (this.mDataList.isEmpty()) {
            LinearLayout timezoneEmptyLinear = getMBinding().D;
            Intrinsics.checkNotNullExpressionValue(timezoneEmptyLinear, "timezoneEmptyLinear");
            ExtUtilsKt.setVisible(timezoneEmptyLinear, true);
            getMRecyclerView().setVisibility(4);
            return;
        }
        LinearLayout timezoneEmptyLinear2 = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(timezoneEmptyLinear2, "timezoneEmptyLinear");
        ExtUtilsKt.setVisible(timezoneEmptyLinear2, false);
        getMRecyclerView().setVisibility(0);
        WorldClockAdapter worldClockAdapter = this.mAdapter;
        Intrinsics.checkNotNull(worldClockAdapter);
        worldClockAdapter.notifyDataSetChanged();
        setEditMode(false);
    }

    private final TimeZoneItem findItemById(String cityId) {
        int size = this.mDataList.size();
        for (int i = 0; i < size; i++) {
            TimeZoneItem timeZoneItem = this.mDataList.get(i);
            Intrinsics.checkNotNull(timeZoneItem);
            TimeZoneItem timeZoneItem2 = timeZoneItem;
            if (timeZoneItem2.d.equals(cityId)) {
                return timeZoneItem2;
            }
        }
        return null;
    }

    private final void onAddViewClick() {
        if (this.mDataList.size() < 20) {
            BaseFragmentExKt.gotoPageForResult(this, WorldClockChooseCityFragment.class, this.sRequestCodeChooseCity);
            return;
        }
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, wzi.o);
        }
    }

    private final void onDeleteViewClick() {
        WorldClockAdapter worldClockAdapter = this.mAdapter;
        final List<TimeZoneItem> selectedList = worldClockAdapter != null ? worldClockAdapter.getSelectedList() : null;
        List<TimeZoneItem> list = selectedList;
        if (list != null && !list.isEmpty()) {
            new CommonDialog.c("world clock").setDialogDescription(wzi.na).setPositiveText(wzi.g).setNegativeText(wzi.e).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockFragment.onDeleteViewClick.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else {
                        if (which != -1) {
                            return;
                        }
                        WorldClockFragment.this.showLoading();
                        WorldClockFragment.access$getMViewModel(WorldClockFragment.this).deleteWordCLockData(selectedList);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                }
            }).showIfNeed(getParentFragmentManager());
            return;
        }
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, wzi.ra);
        }
    }

    private final void onImgBackClick() {
        if (this.isEditMode) {
            setEditMode(false);
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(WorldClockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isEditMode) {
            ImageView imageView = this$0.rightIconView;
            if (imageView != null) {
                imageView.setContentDescription(this$0.getString(wzi.F5));
            }
            this$0.setEditMode(true);
            return;
        }
        ImageView imageView2 = this$0.rightIconView;
        Intrinsics.checkNotNull(imageView2);
        if (imageView2.isSelected()) {
            ImageView imageView3 = this$0.rightIconView;
            Intrinsics.checkNotNull(imageView3);
            imageView3.setSelected(false);
            WorldClockAdapter worldClockAdapter = this$0.mAdapter;
            if (worldClockAdapter != null) {
                worldClockAdapter.selectAll(false);
            }
            this$0.setTitle(this$0.getString(wzi.sa));
            ImageView imageView4 = this$0.rightIconView;
            if (imageView4 != null) {
                imageView4.setContentDescription(this$0.getString(wzi.F5));
            }
        } else {
            ImageView imageView5 = this$0.rightIconView;
            Intrinsics.checkNotNull(imageView5);
            imageView5.setSelected(true);
            WorldClockAdapter worldClockAdapter2 = this$0.mAdapter;
            Intrinsics.checkNotNull(worldClockAdapter2);
            worldClockAdapter2.selectAll(true);
            this$0.setTitle(this$0.getResources().getQuantityString(qyi.B, this$0.mDataList.size(), Integer.valueOf(this$0.mDataList.size())));
            ImageView imageView6 = this$0.rightIconView;
            if (imageView6 != null) {
                imageView6.setContentDescription(this$0.getString(wzi.J5));
            }
        }
        ImageView imageView7 = this$0.rightIconView;
        if (imageView7 != null) {
            imageView7.sendAccessibilityEvent(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(WorldClockFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deleteSelectList(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(WorldClockFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.bindDataToView(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(WorldClockFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, bool.booleanValue() ? wzi.common_set_success : wzi.common_set_error);
        }
        this$0.dismissDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(WorldClockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onAddViewClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(WorldClockFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onDeleteViewClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$7(WorldClockFragment this$0, WorldClockViewModel.SetBleResult setBleResult) {
        int i;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
        Context context = this$0.getContext();
        if (context != null) {
            int code = setBleResult.getCode();
            if (code == 0) {
                Iterator<TimeZoneItem> it = setBleResult.getAddList().iterator();
                while (it.hasNext()) {
                    this$0.mDataList.add(0, it.next());
                }
                this$0.displayDataList();
                i = wzi.common_set_success;
            } else if (code == 1) {
                i = wzi.ma;
            } else if (code != 2) {
                i = wzi.ta;
            } else {
                this$0.showLoading();
                ((WorldClockViewModel) this$0.getMViewModel()).loadWordClockData();
                i = wzi.o;
            }
            ToastExtKt.toastShort(context, i);
        }
        return Unit.INSTANCE;
    }

    private final void setEditMode(boolean editMode) {
        this.isEditMode = editMode;
        WorldClockAdapter worldClockAdapter = this.mAdapter;
        Intrinsics.checkNotNull(worldClockAdapter);
        worldClockAdapter.setEditStatus(editMode);
        display(editMode);
        changeEditStatus(editMode);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockAdapter.DragListener
    public void endDrag() {
    }

    @Nullable
    public final String getCurrentTimeID() {
        return this.currentTimeID;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.A0;
    }

    @NotNull
    public final RecyclerView getMRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        return null;
    }

    public final int getSRequestCodeChooseCity() {
        return this.sRequestCodeChooseCity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.sRequestCodeChooseCity && resultCode == -1) {
            Intrinsics.checkNotNull(data);
            ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra(WorldClockChooseCityFragment.INSTANCE.getSData());
            ArrayList arrayList = new ArrayList();
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() <= 0) {
                return;
            }
            int size = parcelableArrayListExtra.size();
            for (int i = 0; i < size; i++) {
                TimeZoneItem timeZoneItem = (TimeZoneItem) parcelableArrayListExtra.get(i);
                if (findItemById(timeZoneItem.d) != null) {
                    Context context = getContext();
                    if (context != null) {
                        ToastExtKt.toastShort(context, wzi.la);
                        return;
                    }
                    return;
                }
                Intrinsics.checkNotNull(timeZoneItem);
                arrayList.add(0, timeZoneItem);
            }
            PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
            ((WorldClockViewModel) getMViewModel()).syncWorldTime(this.mDataList, arrayList);
            displayDataList();
            setEditMode(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ((WorldClockViewModel) getMViewModel()).initCityMap();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        aje.b(requireContext()).c(this.mTimeSetReceiver, intentFilter);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        aje.b(requireContext()).e(this.mTimeSetReceiver);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockAdapter.OnItemClickListener
    public void onItemClick(@Nullable View view, int position, @Nullable TimeZoneItem wordClockBean, boolean isAllSelected) {
        if (this.isEditMode) {
            ImageView imageView = this.rightIconView;
            Intrinsics.checkNotNull(imageView);
            imageView.setSelected(isAllSelected);
            WorldClockAdapter worldClockAdapter = this.mAdapter;
            Intrinsics.checkNotNull(worldClockAdapter);
            List<TimeZoneItem> selectedList = worldClockAdapter.getSelectedList();
            if (selectedList.size() == this.mDataList.size()) {
                setTitle(getResources().getQuantityString(qyi.B, selectedList.size(), Integer.valueOf(selectedList.size())));
                ImageView imageView2 = this.rightIconView;
                Intrinsics.checkNotNull(imageView2);
                imageView2.setSelected(true);
                ImageView imageView3 = this.rightIconView;
                if (imageView3 != null) {
                    imageView3.setContentDescription(getString(wzi.J5));
                    return;
                }
                return;
            }
            if (selectedList.size() == 0) {
                setTitle(getString(wzi.sa));
            } else {
                setTitle(getResources().getQuantityString(qyi.B, selectedList.size(), Integer.valueOf(selectedList.size())));
            }
            ImageView imageView4 = this.rightIconView;
            Intrinsics.checkNotNull(imageView4);
            imageView4.setSelected(false);
            ImageView imageView5 = this.rightIconView;
            if (imageView5 != null) {
                imageView5.setContentDescription(getString(wzi.F5));
            }
        }
    }

    @Override // com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockAdapter.OnItemClickListener
    public void onItemLongClick(@Nullable View view, int position, @Nullable TimeZoneItem wordClockBean) {
        display(true);
        changeEditStatus(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(wzi.L2);
        setMRecyclerView(getMBinding().E);
        View viewInflate = LayoutInflater.from(getActivity()).inflate(eui.common_layout_title_bar_right_icon, (ViewGroup) null);
        this.rightIconView = (ImageView) viewInflate.findViewById(zqi.V9);
        Intrinsics.checkNotNull(viewInflate);
        setEndView(viewInflate);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: gor
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WorldClockFragment.onViewCreated$lambda$0(this.f19195a, view2);
            }
        });
        ImageView imageView = this.rightIconView;
        if (imageView != null) {
            imageView.setContentDescription(getString(wzi.Q1));
            imageView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockFragment$onViewCreated$2$1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
                    Intrinsics.checkNotNullParameter(host, "host");
                    Intrinsics.checkNotNullParameter(event, "event");
                    super.onInitializeAccessibilityEvent(host, event);
                    if (this.this$0.isEditMode) {
                        if (host.isSelected()) {
                            event.setContentDescription(this.this$0.getString(wzi.z2));
                        } else {
                            event.setContentDescription(this.this$0.getString(wzi.G2));
                        }
                    }
                }
            });
        }
        this.deleteView = getMBinding().C;
        this.addView = getMBinding().G;
        ((WorldClockViewModel) getMViewModel()).getCityIdListRet().observe(getViewLifecycleOwner(), new WorldClockFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hor
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorldClockFragment.onViewCreated$lambda$2(this.f20300a, (List) obj);
            }
        }));
        ((WorldClockViewModel) getMViewModel()).getGetWorldClocksRet().observe(getViewLifecycleOwner(), new WorldClockFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ior
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorldClockFragment.onViewCreated$lambda$3(this.f21958a, (List) obj);
            }
        }));
        ((WorldClockViewModel) getMViewModel()).getSyncResult().observe(getViewLifecycleOwner(), new WorldClockFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jor
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorldClockFragment.onViewCreated$lambda$4(this.f22985a, (Boolean) obj);
            }
        }));
        View view2 = this.addView;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: kor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    WorldClockFragment.onViewCreated$lambda$5(this.f24063a, view3);
                }
            });
        }
        View view3 = this.deleteView;
        if (view3 != null) {
            view3.setOnClickListener(new View.OnClickListener() { // from class: lor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    WorldClockFragment.onViewCreated$lambda$6(this.f25286a, view4);
                }
            });
        }
        this.currentTimeID = TimeZone.getDefault().getID();
        getMRecyclerView().setLayoutManager(new LinearLayoutManager(getMActivity()));
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        WorldClockAdapter worldClockAdapter = new WorldClockAdapter(mActivity, this.mDataList);
        this.mAdapter = worldClockAdapter;
        worldClockAdapter.setDragListener(this);
        getMRecyclerView().setAdapter(this.mAdapter);
        WorldClockAdapter worldClockAdapter2 = this.mAdapter;
        if (worldClockAdapter2 != null) {
            worldClockAdapter2.setOnItemClickListener(this);
        }
        WorldClockAdapter worldClockAdapter3 = this.mAdapter;
        Intrinsics.checkNotNull(worldClockAdapter3);
        l lVar = new l(worldClockAdapter3.getMCallback());
        this.mTouchHelper = lVar;
        lVar.d(getMRecyclerView());
        showLoading();
        ((WorldClockViewModel) getMViewModel()).loadWordClockData();
        display(false);
        ((WorldClockViewModel) getMViewModel()).getSetBleResult().observe(getViewLifecycleOwner(), new WorldClockFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: mor
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WorldClockFragment.onViewCreated$lambda$7(this.f27057a, (WorldClockViewModel.SetBleResult) obj);
            }
        }));
    }

    public final void setCurrentTimeID(@Nullable String str) {
        this.currentTimeID = str;
    }

    public final void setMRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.mRecyclerView = recyclerView;
    }

    @Override // com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockAdapter.DragListener
    public void startDragItem(@Nullable RecyclerView.d0 holder) {
        l lVar;
        if (holder == null || (lVar = this.mTouchHelper) == null) {
            return;
        }
        lVar.x(holder);
    }
}
