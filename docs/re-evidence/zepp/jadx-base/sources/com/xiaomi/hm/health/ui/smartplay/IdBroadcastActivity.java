package com.xiaomi.hm.health.ui.smartplay;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class IdBroadcastActivity extends BaseSmartPlayActivity {
    private ListTile F;
    private HMPersonInfo G = null;
    private DialogInterface.OnClickListener H = new a();
    private BLEStatueListenerAdapter I = new b();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                IdBroadcastActivity.this.F.setChecked(false);
            } else if (i == -1) {
                IdBroadcastActivity.this.u(true);
                IdBroadcastActivity.this.w();
            }
        }
    }

    public class b extends BLEStatueListenerAdapter {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return IdBroadcastActivity.this.getString(R.string.id_broadcast_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean enable) {
            IdBroadcastActivity.this.F.setEnabled(enable);
        }
    }

    private void initView() {
        setStatusListener(this.I);
        setSmartTip(getString(R.string.idbroadcast_logo_tips));
        setSmartImageTopMargin(54.0f);
        setSmartImageView(R.drawable.id_broadcast, 0);
        ListTile listTile = (ListTile) findViewById(R.id.enable_broadcast);
        this.F = listTile;
        if (listTile != null) {
            listTile.setSubtitle(HMDeviceConfig.isWatch() ? R.string.enable_id_broadcast_query_msg_watch : R.string.enable_id_broadcast_query_msg);
            this.F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pc4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.v(compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(boolean isEnabled) {
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (hMMiLiDevice != null && hMMiLiDevice.isConnected()) {
            hMMiLiDevice.enableConnectedAdv(isEnabled, new HMCallback());
            this.G.getMiliConfig().setEnableConnectedBtAdv(isEnabled);
            this.G.saveInfo(2);
            HMAccountWebExtAPI.updateProfile();
        }
        Analytics.event(this, StatEvent.EventId.IDENTITY_SWITCH, isEnabled ? "On" : "Off");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(CompoundButton compoundButton, boolean z) {
        if (!z) {
            u(false);
        } else {
            if (this.G.getMiliConfig().isEnableConnectedBtAdv()) {
                return;
            }
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user", HMLoginManager.getValidUid());
            jSONObject.put("time", System.currentTimeMillis());
            HMPropertyUtil.setProperty(Property.PROPERTY_IDENTIFY_BROADCAST, jSONObject.toString());
            HMPropertyUtil.postPropertisToServer(true);
        } catch (Exception e) {
            HMLog.i("id-Broadcast-error", e.getMessage(), new Object[0]);
        }
    }

    private void x() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.id_broadcast_notify_content).setPositiveButton(getString(R.string.agree), this.H).setNegativeButton(getString(R.string.cancel), this.H).show(getSupportFragmentManager());
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSmartContent(R.layout.activity_id_broadcast);
        setRainbowTitleText(R.string.id_broadcast);
        this.G = HMPersonInfo.getInstance();
        initView();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ListTile listTile = this.F;
        if (listTile != null) {
            listTile.setChecked(this.G.getMiliConfig().isEnableConnectedBtAdv());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.event(this, StatEvent.EventId.IDENTITY_VIEW_NUM);
    }
}
