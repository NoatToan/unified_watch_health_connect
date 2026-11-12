package com.huawei.ui.main.stories.health.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarDeviceMeasureActivity;
import com.huawei.ui.main.stories.health.adapter.BloodSugarMeasureMutipleAdapter;
import com.huawei.ui.main.stories.health.fragment.BloodSugarMeasureMutipleFragment;
import defpackage.njy;
import defpackage.uwh;
import health.compact.a.util.LogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarMeasureMutipleFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f27873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExpandableListView f27875c;
    private BloodSugarDeviceMeasureActivity d;
    private BloodSugarMeasureMutipleAdapter e;

    public static /* synthetic */ void d(View view) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof BloodSugarDeviceMeasureActivity) {
            this.d = (BloodSugarDeviceMeasureActivity) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_blood_sugar_measure_mutiple, viewGroup, false);
        this.f27875c = (ExpandableListView) viewInflate.findViewById(R.id.hw_show_blood_sugar_measure_mutiple_expandable_lv);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.hw_show_blood_sugar_measure_mutiple_bt_batch_done);
        this.f27873a = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: uus
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50591c.a(view);
            }
        });
        this.d.d(new BloodSugarDeviceMeasureActivity.DataConfirmRefreshListener() { // from class: uur
            @Override // com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarDeviceMeasureActivity.DataConfirmRefreshListener
            public final void refresh() {
                this.d.a();
            }
        });
        BloodSugarMeasureMutipleAdapter bloodSugarMeasureMutipleAdapter = new BloodSugarMeasureMutipleAdapter(getContext());
        this.e = bloodSugarMeasureMutipleAdapter;
        this.f27875c.setAdapter(bloodSugarMeasureMutipleAdapter);
        this.f27875c.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: com.huawei.ui.main.stories.health.fragment.BloodSugarMeasureMutipleFragment$$ExternalSyntheticLambda2
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                return this.d.d(expandableListView, view, i, i2, j);
            }
        });
        View viewInflate2 = layoutInflater.inflate(R.layout.item_blood_sugar_remind, (ViewGroup) null);
        viewInflate2.setOnClickListener(null);
        this.f27875c.addFooterView(viewInflate2);
        return viewInflate;
    }

    public /* synthetic */ void a(View view) {
        this.f27873a.setClickable(false);
        this.f27873a.setBackgroundResource(R.drawable.button_background_emphasize_disable);
        b();
    }

    public /* synthetic */ void a() {
        this.f27874b = false;
        this.f27873a.setClickable(true);
        this.f27873a.setBackgroundResource(R.drawable.button_background_emphasize);
        d();
    }

    /* synthetic */ boolean d(ExpandableListView expandableListView, View view, int i, int i2, long j) throws IllegalAccessException, InstantiationException {
        this.d.c(i, i2);
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (isHidden()) {
            return;
        }
        d();
    }

    private void d() {
        LogUtil.a("BloodSugarMeasureMutipleFragment", "update");
        List<List<uwh>> listF = this.d.f();
        List<String> listC = c(listF);
        this.e.a(listC, listF);
        this.e.notifyDataSetChanged();
        for (int i = 0; i < listC.size(); i++) {
            this.f27875c.expandGroup(i);
        }
    }

    private List<String> c(List<List<uwh>> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/M/d");
        ArrayList arrayList = new ArrayList();
        for (List<uwh> list2 : list) {
            if (njy.c(list2, 0)) {
                arrayList.add(simpleDateFormat.format(Long.valueOf(list2.get(0).g())));
            }
        }
        return arrayList;
    }

    private void b() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.d);
        int iC = this.d.c();
        builder.a(this.d.getResources().getQuantityString(R.plurals.IDS_hw_show_healthdata_bloodsugar_confirm_record_msg, iC, Integer.valueOf(iC))).a(getString(R.string.IDS_hw_show_healthdata_bloodsugar_certain), new View.OnClickListener() { // from class: uuq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50590a.c(view);
            }
        }).d(getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: uut
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodSugarMeasureMutipleFragment.d(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: uup
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f50589b.c(dialogInterface);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void c(View view) {
        this.f27874b = true;
        this.d.e();
    }

    public /* synthetic */ void c(DialogInterface dialogInterface) {
        if (this.f27874b) {
            return;
        }
        this.f27873a.setClickable(true);
        this.f27873a.setBackgroundResource(R.drawable.button_background_emphasize);
    }
}
