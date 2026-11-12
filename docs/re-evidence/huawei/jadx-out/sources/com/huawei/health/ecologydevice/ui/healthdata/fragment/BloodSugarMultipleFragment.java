package com.huawei.health.ecologydevice.ui.healthdata.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.health.ecologydevice.ui.healthdata.activity.BloodSugarHistoryActivity;
import com.huawei.health.ecologydevice.ui.healthdata.adapter.BloodSugarMultipleAdapter;
import com.huawei.hihealth.HiHealthData;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.njy;
import defpackage.qrk;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class BloodSugarMultipleFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BloodSugarHistoryActivity f6609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CommonDialog21 f6610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BloodSugarMultipleAdapter f6611c;
    private NoTitleCustomAlertDialog d;
    private HealthButton e;
    private ExpandableListView h;
    private boolean i;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof BloodSugarHistoryActivity) {
            this.f6609a = (BloodSugarHistoryActivity) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_blood_sugar_multiple, viewGroup, false);
        if (viewInflate == null) {
            LogUtil.d("BloodSugarMultipleFragment", "view is null");
            return viewInflate;
        }
        this.h = (ExpandableListView) viewInflate.findViewById(R.id.blood_sugar_multiple_expandable_lv);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.blood_sugar_multiple_bt_batch_done);
        this.e = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: epa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33294c.e(view);
            }
        });
        this.f6609a.d(new BloodSugarHistoryActivity.DataConfirmRefreshListener() { // from class: eoz
            @Override // com.huawei.health.ecologydevice.ui.healthdata.activity.BloodSugarHistoryActivity.DataConfirmRefreshListener
            public final void refresh() throws IllegalAccessException, InstantiationException {
                this.f33290c.c();
            }
        });
        if (this.f6611c == null) {
            this.f6611c = new BloodSugarMultipleAdapter(this.f6609a);
        }
        this.h.setAdapter(this.f6611c);
        this.h.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarMultipleFragment$$ExternalSyntheticLambda5
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                return this.f6612a.c(expandableListView, view, i, i2, j);
            }
        });
        View viewInflate2 = layoutInflater.inflate(R.layout.item_blood_sugar_remind, (ViewGroup) null);
        viewInflate2.setOnClickListener(null);
        this.h.addFooterView(viewInflate2);
        return viewInflate;
    }

    public /* synthetic */ void e(View view) {
        this.e.setClickable(false);
        this.e.setBackgroundResource(R.drawable.button_background_emphasize_disable);
        b();
    }

    /* synthetic */ boolean c(ExpandableListView expandableListView, View view, int i, int i2, long j) throws IllegalAccessException, InstantiationException {
        this.f6609a.a(i, i2);
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (isHidden()) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() throws IllegalAccessException, InstantiationException {
        a();
        this.i = false;
        this.e.setClickable(true);
        this.e.setBackgroundResource(R.drawable.button_background_emphasize);
        if (this.f6609a.a() == 0) {
            this.f6609a.j();
        } else {
            f();
        }
    }

    private void f() {
        LogUtil.a("BloodSugarMultipleFragment", "updateView");
        List<List<HiHealthData>> listC = this.f6609a.c();
        this.f6611c.e(b(listC), listC);
        this.f6611c.notifyDataSetChanged();
        this.h.expandGroup(0);
    }

    private List<String> b(List<List<HiHealthData>> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (List<HiHealthData> list2 : list) {
            if (njy.c(list2, 0)) {
                arrayList.add(qrk.h(list2.get(0).getEndTime()));
            }
        }
        return arrayList;
    }

    private void b() {
        int iA = this.f6609a.a();
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f6609a).a(this.f6609a.getResources().getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_confirm_record_msg, iA, Integer.valueOf(iA))).a(getString(R.string.IDS_hw_health_show_healthdata_confirm), new View.OnClickListener() { // from class: eov
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33287b.a(view);
            }
        }).d(getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: eox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33288a.c(view);
            }
        }).c();
        this.d = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eow
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.e.b(dialogInterface);
            }
        });
        this.d.show();
    }

    public /* synthetic */ void a(View view) {
        d();
        this.i = true;
        this.f6609a.b();
    }

    public /* synthetic */ void c(View view) {
        e();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface) {
        if (this.i) {
            return;
        }
        this.e.setClickable(true);
        this.e.setBackgroundResource(R.drawable.button_background_emphasize);
    }

    private void e() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.d;
        if (noTitleCustomAlertDialog != null) {
            noTitleCustomAlertDialog.dismiss();
            this.d = null;
        }
    }

    private void d() {
        if (this.f6610b == null) {
            CommonDialog21 commonDialog21B = CommonDialog21.b(this.f6609a);
            this.f6610b = commonDialog21B;
            commonDialog21B.b(getString(R.string.IDS_device_blood_sugar_confirming));
            this.f6610b.c();
            this.f6610b.setCancelable(false);
            return;
        }
        LogUtil.d("BloodSugarMultipleFragment", "showConfirmingDialog: mConfirmingDialog is not null");
    }

    private void a() {
        CommonDialog21 commonDialog21 = this.f6610b;
        if (commonDialog21 != null) {
            commonDialog21.cancel();
            this.f6610b = null;
        }
    }
}
