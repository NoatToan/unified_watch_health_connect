package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMAmazfitDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity;
import com.xiaomi.hm.health.device.capturedevice.HMCaptureWatchQRActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMSelectMiliActivity extends BaseTitleActivity {
    private static String B = "connected_devices";
    private List<b> x = new ArrayList();
    private int y = 0;
    private final Lazy<BindServiceApi> z = KoinJavaComponent.inject(BindServiceApi.class);
    private final Lazy<DeviceUtilsApi> A = KoinJavaComponent.inject(DeviceUtilsApi.class);

    public static class ViewHolder {
        public TextView a;
        public TextView b;
    }

    public class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return HMSelectMiliActivity.this.x.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        @SuppressLint({"InflateParams"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = HMSelectMiliActivity.this.getLayoutInflater().inflate(R.layout.select_mili_item, (ViewGroup) null);
                viewHolder = new ViewHolder();
                viewHolder.a = (TextView) view.findViewById(R.id.device_title);
                viewHolder.b = (TextView) view.findViewById(R.id.device_mac);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            b bVar = (b) HMSelectMiliActivity.this.x.get(i);
            viewHolder.a.setText(HMSelectMiliActivity.this.u(GattUtils.getBluetoothDeviceName(bVar.a)));
            viewHolder.b.setText(String.format("%s %s", HMSelectMiliActivity.this.getResources().getString(R.string.mac), bVar.a.getAddress()));
            return view;
        }
    }

    public static class b {
        public BluetoothDevice a;

        public b(BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
        }
    }

    private void initData() {
        this.y = getIntent().getIntExtra("bind_type", -1);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(B);
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() == 0) {
            return;
        }
        Iterator it2 = parcelableArrayListExtra.iterator();
        while (it2.hasNext()) {
            this.x.add(new b((BluetoothDevice) it2.next()));
        }
    }

    private void initView() {
        TextView textView = (TextView) findViewById(R.id.tips);
        int i = R.id.select_mili_other_tv;
        TextView textView2 = (TextView) findViewById(i);
        if (this.z.getValue().isBindingWatch(this.y)) {
            textView.setText(R.string.select_chaohu_tips_1);
            textView2.setText(R.string.search_other_chaohu);
        }
        ListView listView = (ListView) findViewById(R.id.mili_device_list);
        listView.setVerticalScrollBarEnabled(false);
        listView.setAdapter((ListAdapter) new a());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: we3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                this.a.r(adapterView, view, i2, j);
            }
        });
        findViewById(R.id.select_mili_quit_tv).setOnClickListener(new View.OnClickListener() { // from class: ve3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
        findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: ue3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.t(view);
            }
        });
    }

    private void q() {
        int i = this.y;
        if ((i == 11 || i == 12 || i == 19) || i == 21 || i == 23) {
            HMCaptureWatchQRActivity.startCapture(this, i);
        } else {
            this.z.getValue().startBindWatch(this, null, this.y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(AdapterView adapterView, View view, int i, long j) {
        finish();
        if (this.z.getValue().isBindingWatch(this.y)) {
            this.z.getValue().startBindWatch(this, this.x.get(i).a, this.y);
        } else {
            this.z.getValue().startBindMiLi(this, this.x.get(i).a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        finish();
    }

    public static void show(Context context, List<BluetoothDevice> list) {
        Intent intent = new Intent(context, (Class<?>) HMSelectMiliActivity.class);
        if (list != null && list.size() > 0) {
            intent.putParcelableArrayListExtra(B, new ArrayList<>(list));
        }
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view) {
        int i;
        finish();
        if (this.z.getValue().isBindingWatch(this.y) || (i = this.y) == 21 || i == 23) {
            q();
        } else if (GlobalConfig.get().isBuildMidong()) {
            this.z.getValue().startBindDevice(this, HMDeviceType.MILI);
        } else {
            UnifyBindWaySelectActivity.INSTANCE.launch(this, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String u(String str) {
        if (TextUtils.isEmpty(str)) {
            return getString(R.string.unknown);
        }
        HMDeviceSource hMDeviceSourceNameToSource = HMMiLiDevice.nameToSource(str);
        if (hMDeviceSourceNameToSource == null && (hMDeviceSourceNameToSource = HMMiLiProDevice.nameToSource(str)) == HMDeviceSource.MILI_CINCO) {
            hMDeviceSourceNameToSource = HMDeviceSource.MILI_CINCO_L;
        }
        if (hMDeviceSourceNameToSource == null) {
            hMDeviceSourceNameToSource = HMAmazfitDevice.nameToSource(str);
        }
        return hMDeviceSourceNameToSource == null ? getString(R.string.unknown) : this.A.getValue().getDeviceDescription(hMDeviceSourceNameToSource);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.select_mili_layout);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.s38), !RainbowUtils.isDarkMode(this));
        initData();
        initView();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BIND_QUICK_BIND).setValue(this.z.getValue().isBindingWatch(this.y) ? StatEvent.BIND_QUICK_BIND_WATCH : "Band"));
    }

    public static void show(Context context, List<BluetoothDevice> list, int i) {
        Intent intent = new Intent(context, (Class<?>) HMSelectMiliActivity.class);
        if (list != null && list.size() > 0) {
            intent.putParcelableArrayListExtra(B, new ArrayList<>(list));
        }
        intent.putExtra("bind_type", i);
        context.startActivity(intent);
    }
}
