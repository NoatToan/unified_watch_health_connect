package com.xiaomi.hm.health.device.setting.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.device.setting.ui.dialog.SetTimeStyleDialogFactory;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class SetTimeStyleDialogFactory {
    private final String a = "SetTimeStyleDialogFactory";
    private CheckBox b;
    private CheckBox c;
    private ImageView d;
    private View e;
    private AlertDialogFragment f;
    private final Lazy<DeviceUtilsApi> g;
    private final int h;
    private DeviceFeatureViewModel i;

    public SetTimeStyleDialogFactory(DeviceFeatureViewModel deviceFeatureViewModel) {
        Lazy<DeviceUtilsApi> lazyInject = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.g = lazyInject;
        this.h = lazyInject.getValue().getSystemLang();
        this.i = deviceFeatureViewModel;
    }

    private AlertDialogFragment.Builder g(Context context) {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(context);
        int i = R.string.time_type_title;
        return builder.setTitle(i).setMessage(context.getString(i)).setContentView(this.e).setCancelable(false).setPositiveButton(context.getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: iq6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.i(dialogInterface, i2);
            }
        }).setNegativeButton(context.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: jq6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SetTimeStyleDialogFactory.j(dialogInterface, i2);
            }
        });
    }

    private void h(Context context) {
        View viewInflate = View.inflate(context, R.layout.time_type_select_layout, null);
        this.e = viewInflate;
        this.b = (CheckBox) viewInflate.findViewById(R.id.checkbox_time_only);
        this.c = (CheckBox) this.e.findViewById(R.id.checkbox_time_date);
        this.d = (ImageView) this.e.findViewById(R.id.iv_time_date);
        this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: nq6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.k(compoundButton, z);
            }
        });
        this.c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mq6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.l(compoundButton, z);
            }
        });
        this.e.findViewById(R.id.ll_time_only).setOnClickListener(new View.OnClickListener() { // from class: lq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        this.e.findViewById(R.id.ll_time_date).setOnClickListener(new View.OnClickListener() { // from class: kq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.n(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(DialogInterface dialogInterface, int i) {
        HMDisplayType hMDisplayType;
        int i2 = 1;
        if (this.b.isChecked()) {
            this.i.updateTimeDisplayStyle(HMDisplayType.ONLY_TIME);
            i2 = 0;
        } else {
            int i3 = this.h;
            if (i3 != 0) {
                hMDisplayType = i3 != 1 ? HMDisplayType.ENGLISH : HMDisplayType.TRAD_CHINESE;
            } else {
                hMDisplayType = HMDisplayType.SIMPLE_CHINESE;
            }
            this.i.updateTimeDisplayStyle(hMDisplayType);
        }
        HMLog.i("SetTimeStyleDialogFactory", "save :  " + i2 + ";" + this.h, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(CompoundButton compoundButton, boolean z) {
        if (!z) {
            this.c.setEnabled(false);
            this.b.setEnabled(true);
        } else {
            this.c.setEnabled(true);
            this.c.setChecked(false);
            this.b.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(CompoundButton compoundButton, boolean z) {
        if (!z) {
            this.b.setEnabled(false);
            this.c.setEnabled(true);
        } else {
            this.b.setEnabled(true);
            this.b.setChecked(false);
            this.c.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        this.b.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        this.c.setChecked(true);
    }

    public AlertDialogFragment create(Context context) {
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        int timePanelType = miliConfig.getTimePanelType();
        int timePanelLang = miliConfig.getTimePanelLang();
        if (this.e == null) {
            h(context);
            this.f = g(context).create();
        }
        if (timePanelType == 0) {
            this.b.setChecked(true);
            this.c.setChecked(false);
        } else {
            this.b.setChecked(false);
            this.c.setChecked(true);
        }
        int i = this.h;
        if (i == 0) {
            this.d.setImageResource(R.drawable.time_panel_date_cn);
        } else if (i != 1) {
            this.d.setImageResource(R.drawable.time_panel_date_en);
        } else {
            this.d.setImageResource(R.drawable.time_panel_date_tw);
        }
        HMLog.i("SetTimeStyleDialogFactory", "timePanel :  " + timePanelType + ";" + timePanelLang + ";sysLang = " + this.h, new Object[0]);
        return this.f;
    }
}
