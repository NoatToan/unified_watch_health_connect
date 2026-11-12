package com.xiaomi.hm.health.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.ListTile;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.utils.HMPropertyUtil;

/* JADX INFO: loaded from: classes22.dex */
public class AnalyseActivity extends BaseTitleActivity {
    private static final String C = "AnalyseActivity";
    private ListTile A;
    private ListTile B;
    private boolean x;
    private boolean y;
    private Context z;

    private void B() {
        this.A = (ListTile) findViewById(R.id.sleep_analyse_item);
        this.B = (ListTile) findViewById(R.id.body_analyse_item);
        this.A.setChecked(HMPropertyUtil.getSmartAnalysis("slp"));
        if (!this.x) {
            this.A.setEnabled(false);
        }
        this.B.setChecked(HMPropertyUtil.getSmartAnalysis("body"));
        if (!this.y) {
            this.B.setEnabled(false);
        }
        this.A.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qc
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.t(compoundButton, z);
            }
        });
        this.B.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pc
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.u(compoundButton, z);
            }
        });
    }

    @SuppressLint({"StringFormatInvalid"})
    private void C() {
        String string = getString(R.string.ai_analysis_unbind_weight);
        if (string.contains("%s")) {
            string = String.format(string, getString(R.string.weight_setting_weight_bodyfat));
        }
        new AlertDialogFragment.Builder(this.z).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: lc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.v(dialogInterface, i);
            }
        }).setTitle(string).create().show(getSupportFragmentManager());
    }

    private void D() {
        new AlertDialogFragment.Builder(this.z).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: mc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.w(dialogInterface, i);
            }
        }).setTitle(R.string.ai_analysis_unbind_band).create().show(getSupportFragmentManager());
    }

    private void E() {
        new AlertDialogFragment.Builder(this.z).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: jc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.x(dialogInterface, i);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: nc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setTitle(R.string.ai_analysis_weight_dialog_title).setMessage(R.string.ai_analysis_weight_dialog_content).create().show(getSupportFragmentManager());
    }

    private void F() {
        new AlertDialogFragment.Builder(this.z).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: kc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.z(dialogInterface, i);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: oc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).setTitle(R.string.ai_analysis_slp_dialog_title).setMessage(R.string.ai_analysis_slp_dialog_content).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (this.x) {
                return;
            }
            D();
        } else if (this.x) {
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (this.y) {
                return;
            }
            C();
        } else if (this.y) {
            E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        this.B.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        this.A.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        this.B.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
        this.A.setChecked(true);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyse);
        GlobalTitleStyle.setUnifyTitleStyle(this, getString(R.string.ai_analysis));
        this.z = this;
        this.x = HMDeviceManager.getInstance().hasBound(HMDeviceType.MILI);
        this.y = HMDeviceConfig.hasBoundBfs();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        HMPropertyUtil.setSmartAnalysis("slp", this.A.isChecked(), "body", this.B.isChecked());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        B();
    }
}
