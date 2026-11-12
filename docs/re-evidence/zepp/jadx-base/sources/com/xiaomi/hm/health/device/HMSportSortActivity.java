package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import com.xiaomi.hm.health.device.HMSportSortActivity;
import com.xiaomi.hm.health.device.viewmodel.SportSortViewModel;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.view.dslv.DragSortController;
import com.xiaomi.hm.health.view.dslv.DragSortListView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0004H\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\u001c\u001a\u00060\u001aR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010'¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/device/HMSportSortActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/view/dslv/DragSortListView;", "sortListView", "", "y", "x", "C", "w", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "E", "z", "v", "t", SOAP.XMLNS, "u", LogUtil.I, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "onLeftClicked", "onBackPressed", "Lcom/xiaomi/hm/health/device/viewmodel/SportSortViewModel;", "Lcom/xiaomi/hm/health/device/viewmodel/SportSortViewModel;", "viewModel", "Lcom/xiaomi/hm/health/device/HMSportSortActivity$MyAdapter;", "Lcom/xiaomi/hm/health/device/HMSportSortActivity$MyAdapter;", "adapter", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", "Ljava/util/ArrayList;", "data", "Landroid/view/View;", "Landroid/view/View;", "footerView", "B", "deviceSportList", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "MyAdapter", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMSportSortActivity extends BaseTitleActivity {

    @NotNull
    private static final String D = "HMSportSortActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private View footerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    @NotNull
    private static final SparseArray<String> E = new SparseArray<>();

    @NotNull
    private static final SparseIntArray F = new SparseIntArray();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final SportSortViewModel viewModel = new SportSortViewModel();

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private MyAdapter adapter = new MyAdapter(this);

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<SportTypeItem> data = new ArrayList<>();

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private ArrayList<SportTypeItem> deviceSportList = new ArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J&\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017R\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/HMSportSortActivity$MyAdapter;", "Landroid/widget/BaseAdapter;", "", "getCount", "position", "", "getItem", "", "getItemId", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/ViewGroup;", "parent", "getView", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Lcom/xiaomi/hm/health/device/HMSportSortActivity;Landroid/content/Context;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public final class MyAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Context context;

        public MyAdapter(Context context) {
            this.context = context;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return HMSportSortActivity.this.viewModel.getSize();
        }

        @Override // android.widget.Adapter
        @Nullable
        public Object getItem(int position) {
            return Integer.valueOf(HMSportSortActivity.this.viewModel.getItem(position));
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @SuppressLint({"InflateParams"})
        @Nullable
        public View getView(int position, @Nullable View view, @Nullable ViewGroup parent) {
            if (HMSportSortActivity.this.viewModel.isDivider(position)) {
                View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.sort_item_layout_for_title, (ViewGroup) null);
                if (HMSportSortActivity.this.viewModel.isNoneHidden()) {
                    HMSportSortActivity.this.footerView.setVisibility(0);
                    return viewInflate;
                }
                HMSportSortActivity.this.footerView.setVisibility(8);
                return viewInflate;
            }
            View viewInflate2 = LayoutInflater.from(this.context).inflate(R.layout.sort_item_app_layout, (ViewGroup) null);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.sort_item_text);
            ((TextView) viewInflate2.findViewById(R.id.sort_item_sub_text)).setVisibility(8);
            int type = HMSportSortActivity.this.viewModel.getType(position);
            textView.setText((CharSequence) HMSportSortActivity.E.get(type));
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate2.findViewById(R.id.sort_icon);
            appCompatImageView.setImageResource(HMSportSortActivity.F.get(type));
            if (HMSportSortActivity.this.viewModel.isHidden(position)) {
                TintUtils.tintDrawable(appCompatImageView, ContextCompat.getColor(this.context, R.color.device_sport_sort_no_selected));
            } else {
                TintUtils.tintDrawable(appCompatImageView, ContextCompat.getColor(this.context, R.color.high_color));
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewInflate2.findViewById(R.id.sort_drag_item);
            TintUtils.tintDrawable(appCompatImageView2, ContextCompat.getColor(HMSportSortActivity.this, R.color.color_999999));
            appCompatImageView2.setEnabled((HMSportSortActivity.this.viewModel.getDividerIndex() == 1 && position == 0) ? false : true);
            return viewInflate2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "save failed...";
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
            return "save success....";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2) {
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
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onBackPressed ";
        }
    }

    private final void A() {
        getRightTitle().setOnClickListener(new View.OnClickListener() { // from class: fi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMSportSortActivity.B(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(HMSportSortActivity hMSportSortActivity, View view) {
        if (hMSportSortActivity.viewModel.getEdited()) {
            hMSportSortActivity.viewModel.saveSportTypeConfig();
        } else {
            hMSportSortActivity.finish();
        }
    }

    private final void C() {
        DragSortListView dragSortListView = (DragSortListView) findViewById(R.id.sort_listview);
        y(dragSortListView);
        x(dragSortListView);
        this.data.addAll(this.deviceSportList);
        this.adapter = new MyAdapter(this);
        dragSortListView.setDropListener(new DragSortListView.DropListener() { // from class: ji3
            @Override // com.xiaomi.hm.health.view.dslv.DragSortListView.DropListener
            public final void drop(int i, int i2) {
                HMSportSortActivity.D(this.a, i, i2);
            }
        });
        dragSortListView.setDragEnabled(true);
        dragSortListView.setAdapter((ListAdapter) this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(HMSportSortActivity hMSportSortActivity, int i, int i2) {
        HMLog.debug(D, new c(i, i2));
        if (i == i2) {
            return;
        }
        if (hMSportSortActivity.viewModel.getDividerIndex() == 1 && i == 0) {
            return;
        }
        hMSportSortActivity.viewModel.drop(i, i2);
    }

    private final void E() {
        this.viewModel.getSaveState().observe(this, new Observer() { // from class: hi3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMSportSortActivity.F(this.a, (Integer) obj);
            }
        });
        this.viewModel.getBtStatusEnable().observe(this, new Observer() { // from class: gi3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMSportSortActivity.G(this.a, (Boolean) obj);
            }
        });
        this.viewModel.getSportTypeList().observe(this, new Observer() { // from class: ii3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMSportSortActivity.H(this.a, (ArrayList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(HMSportSortActivity hMSportSortActivity, Integer num) {
        if (num != null && num.intValue() == 0) {
            hMSportSortActivity.u();
            return;
        }
        if (num != null && num.intValue() == 1) {
            hMSportSortActivity.v();
            return;
        }
        if (num != null && num.intValue() == 2) {
            hMSportSortActivity.t();
        } else if (num != null && num.intValue() == 3) {
            hMSportSortActivity.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(HMSportSortActivity hMSportSortActivity, Boolean bool) {
        View viewFindViewById = hMSportSortActivity.findViewById(R.id.mask_view);
        if (bool.booleanValue()) {
            hMSportSortActivity.getRightTitle().setEnabled(true);
            hMSportSortActivity.getRightTitle().setTextColor(ContextCompat.getColor(hMSportSortActivity, R.color.black60));
            viewFindViewById.setVisibility(8);
        } else {
            hMSportSortActivity.getRightTitle().setEnabled(false);
            hMSportSortActivity.getRightTitle().setTextColor(ContextCompat.getColor(hMSportSortActivity, R.color.black40));
            viewFindViewById.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HMSportSortActivity hMSportSortActivity, ArrayList arrayList) {
        hMSportSortActivity.adapter.notifyDataSetChanged();
    }

    private final void I() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.sort_save_cancle).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: ei3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMSportSortActivity.J(dialogInterface, i);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: di3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMSportSortActivity.K(this.a, dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(HMSportSortActivity hMSportSortActivity, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        hMSportSortActivity.finish();
    }

    private final void s() {
        if (this.viewModel.getEdited()) {
            I();
        } else {
            finish();
        }
    }

    private final void t() {
        HMLog.debug(D, a.a);
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(getString(R.string.save_failed));
    }

    private final void u() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.saving));
        this.loadingDialog = loadingDialogShowDialog;
        if (loadingDialogShowDialog == null) {
            return;
        }
        loadingDialogShowDialog.show();
    }

    private final void v() {
        HMLog.debug(D, b.a);
        this.deviceSportList.clear();
        LoadingDialog loadingDialog = this.loadingDialog;
        if (loadingDialog != null) {
            loadingDialog.setSuccess(getString(R.string.save_success));
        }
        finish();
    }

    private final void w() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.HMSportSortActivity$initBTStatus$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                this.a.viewModel.updateBtStatusEnable(enable);
            }
        });
    }

    private final void x(DragSortListView sortListView) {
        DragSortController dragSortController = new DragSortController(sortListView);
        dragSortController.setDragHandleId(R.id.sort_item_drag_area);
        dragSortController.setRemoveEnabled(false);
        dragSortController.setSortEnabled(true);
        dragSortController.setDragInitMode(2);
        sortListView.setOnTouchListener(dragSortController);
        sortListView.setFloatViewManager(dragSortController);
    }

    private final void y(DragSortListView sortListView) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.sort_list_scapp_footer, (ViewGroup) null);
        this.footerView = viewInflate;
        ((TextView) viewInflate.findViewById(R.id.footer_tips)).setText(R.string.invisible_item_sport_sort_band_tips);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(this.footerView, new LinearLayout.LayoutParams(-1, -2));
        sortListView.addFooterView(linearLayout);
    }

    private final void z() {
        SparseIntArray sparseIntArray = F;
        sparseIntArray.put(1, R.drawable.device_sport_outdoor);
        sparseIntArray.put(8, R.drawable.device_sport_indoor);
        sparseIntArray.put(9, R.drawable.device_sport_bike);
        sparseIntArray.put(10, R.drawable.device_sport_bike_indoor_ride);
        sparseIntArray.put(14, R.drawable.device_sport_swim);
        sparseIntArray.put(16, R.drawable.device_sport_training);
        sparseIntArray.put(6, R.drawable.device_sport_strides);
        sparseIntArray.put(12, R.drawable.device_sport_elliptical_trainer);
        sparseIntArray.put(23, R.drawable.device_sport_rowing_machine);
        sparseIntArray.put(60, R.drawable.device_sport_yoga);
        sparseIntArray.put(21, R.drawable.device_sport_rope_skipping);
        sparseIntArray.put(15, R.drawable.device_sport_swim_outdoor);
        SparseArray<String> sparseArray = E;
        sparseArray.put(1, getString(R.string.device_sport_outdoor));
        sparseArray.put(8, getString(R.string.device_sport_indoor));
        sparseArray.put(9, getString(R.string.device_sport_bike));
        sparseArray.put(10, getString(R.string.device_sport_bike_indoor_ride));
        sparseArray.put(14, getString(R.string.device_sport_swim));
        sparseArray.put(16, getString(R.string.device_sport_training));
        sparseArray.put(6, getString(R.string.device_sport_strides));
        sparseArray.put(12, getString(R.string.device_sport_elliptical_trainer));
        sparseArray.put(23, getString(R.string.device_sport_rowing_machine));
        sparseArray.put(60, getString(R.string.device_sport_yoga));
        sparseArray.put(21, getString(R.string.device_sport_rope_skipping));
        sparseArray.put(15, getString(R.string.sports_type_swim_outdoor));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HMLog.debug(D, d.a);
        this.viewModel.exit();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sport_sort_layout);
        setStyle(BaseTitleActivity.STYLE.CANCEL_AND_SAVE, ContextCompat.getColor(this, R.color.pale_grey), getString(R.string.device_sport_setting_title), true);
        int color = ContextCompat.getColor(this, R.color.black70);
        int i = R.color.black60;
        setBaseTitleColor(color, ContextCompat.getColor(this, i), ContextCompat.getColor(this, i));
        if (!GlobalConfig.get().isBuildMidong() && Language.isJapanese()) {
            ViewGroup.LayoutParams layoutParams = getLeftText().getLayoutParams();
            layoutParams.width = -2;
            getLeftText().setLayoutParams(layoutParams);
        }
        z();
        C();
        A();
        w();
        E();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.viewModel.clear();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        this.viewModel.exit();
    }
}
