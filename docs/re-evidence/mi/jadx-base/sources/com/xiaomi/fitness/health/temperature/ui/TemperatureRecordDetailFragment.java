package com.xiaomi.fitness.health.temperature.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.adapter.CommonRecordDetailAdapter;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.temperature.TemperatureViewModel;
import com.xiaomi.fitness.health.temperature.ui.TemperatureRecordDetailFragment;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.pni;
import defpackage.saa;
import defpackage.wc0;
import defpackage.yaa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001%B\u0007¢\u0006\u0004\b$\u0010\rJ!\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/health/temperature/ui/TemperatureRecordDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/temperature/TemperatureViewModel;", "Lsaa;", "Lyaa;", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "record", "", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter$DetailItem;", "fillList", "(Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;)Ljava/util/List;", "", "initActionBar", "()V", "showDeleteDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/item/TemperatureItem;", "Lmiuix/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "mAdapter", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "mDetailItemList", "Ljava/util/List;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TemperatureRecordDetailFragment extends Hilt_TemperatureRecordDetailFragment<TemperatureViewModel, saa> implements yaa {
    public static final int DELETE_DIALOG_REQ_CODE = 200;

    @NotNull
    public static final String PARAM_RECORD = "temp_record";

    @Nullable
    private CommonRecordDetailAdapter mAdapter;

    @Nullable
    private List<? extends CommonRecordDetailAdapter.DetailItem> mDetailItemList;

    @Nullable
    private RecyclerView mRecyclerView;

    @Nullable
    private TemperatureItem record;

    public TemperatureRecordDetailFragment() {
        super(jui.C0);
    }

    private final List<CommonRecordDetailAdapter.DetailItem> fillList(TemperatureItem record) {
        String string;
        if (record == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.Z1), TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(record.getTime(), false, 2, null)));
        if (record.getBodyTemp() != null) {
            Float bodyTemp = record.getBodyTemp();
            Intrinsics.checkNotNull(bodyTemp);
            if (bodyTemp.floatValue() > 0.0f) {
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.dn), requireContext().getString(c0j.tn, record.getBodyTemp())));
            }
        }
        if (record.getSkinTemp() != null) {
            Float skinTemp = record.getSkinTemp();
            Intrinsics.checkNotNull(skinTemp);
            if (skinTemp.floatValue() > 0.0f) {
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.nn), requireContext().getString(c0j.tn, record.getSkinTemp())));
            }
        }
        Logger.i("Temperature", "record detail sid:" + record.getSid());
        if (!TextUtils.isEmpty(record.getSid())) {
            if (StringsKt__StringsJVMKt.equals("xiaomiwear_app_manually", record.getSid(), true)) {
                string = requireContext().getString(c0j.o5);
            } else {
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                String sid = record.getSid();
                Intrinsics.checkNotNull(sid);
                DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(sid);
                if (deviceInfoInAll == null || deviceInfoInAll.getName() == null) {
                    string = "";
                } else {
                    string = StringsKt__StringsKt.trim((CharSequence) deviceInfoInAll.getName()).toString();
                    Logger.i("Temperature", "sid device name:" + string);
                }
            }
            if (!TextUtils.isEmpty(string)) {
                arrayList.add(new CommonRecordDetailAdapter.DetailItem(requireContext().getString(c0j.i5), string));
            }
        }
        return arrayList;
    }

    private final void initActionBar() {
        setTitle(c0j.s5);
        if (getMiuiActionBar() != null) {
            Context contextRequireContext = requireContext();
            wc0 miuiActionBar = getMiuiActionBar();
            Intrinsics.checkNotNull(miuiActionBar);
            k5g.h(contextRequireContext, miuiActionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: s3p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TemperatureRecordDetailFragment.initActionBar$lambda$1$lambda$0(this.f33249a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$1$lambda$0(TemperatureRecordDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteDialog();
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.F7).setDialogDescription(c0j.E7).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.setRequestCode(200);
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 200 && resultCode == -1) {
            ((TemperatureViewModel) getMViewModel()).deleteRecord(this.record);
            requireActivity().setResult(2);
            requireActivity().lambda$onCreate$0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        Bundle arguments = getArguments();
        TemperatureItem temperatureItem = (TemperatureItem) (arguments != null ? arguments.getSerializable(PARAM_RECORD) : null);
        this.record = temperatureItem;
        this.mDetailItemList = fillList(temperatureItem);
        this.mRecyclerView = ((saa) getMBinding()).B;
        this.mAdapter = new CommonRecordDetailAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mAdapter);
        if (ArrayUtils.isEmpty(this.mDetailItemList)) {
            return;
        }
        CommonRecordDetailAdapter commonRecordDetailAdapter = this.mAdapter;
        Intrinsics.checkNotNull(commonRecordDetailAdapter);
        commonRecordDetailAdapter.setDetailItems(this.mDetailItemList);
    }
}
