package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.UnifyBindWaySelectActivity;
import com.xiaomi.hm.health.device.capturedevice.HMCaptureWatchQRActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMSelectBoundMiliActivity extends BaseTitleActivity {
    private static String C = "connected_devices";
    private List<b> x = new ArrayList();
    private int y = 0;
    private final Lazy<BindServiceApi> z = KoinJavaComponent.inject(BindServiceApi.class);
    private final Lazy<DeviceManagerApi> A = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> B = KoinJavaComponent.inject(DeviceUtilsApi.class);

    public static class ViewHolder {
        public TextView a;
    }

    public class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return HMSelectBoundMiliActivity.this.x.size();
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
                view = HMSelectBoundMiliActivity.this.getLayoutInflater().inflate(R.layout.select_mili_bound_item, (ViewGroup) null);
                viewHolder = new ViewHolder();
                viewHolder.a = (TextView) view.findViewById(R.id.device_title);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.a.setText(((b) HMSelectBoundMiliActivity.this.x.get(i)).b);
            return view;
        }
    }

    public static class b {
        public HMDeviceSource a;
        public String b;
        public BluetoothDevice c;

        public b(HMDeviceSource hMDeviceSource, String str, BluetoothDevice bluetoothDevice) {
            this.a = hMDeviceSource;
            this.b = str;
            this.c = bluetoothDevice;
        }
    }

    private void initData() {
        this.y = getIntent().getIntExtra("bind_type", -1);
        ArrayList<BluetoothDevice> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(C);
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() == 0) {
            return;
        }
        for (BluetoothDevice bluetoothDevice : parcelableArrayListExtra) {
            HMDeviceSource hMDeviceSourceNameToDeviceSource = this.B.getValue().nameToDeviceSource(GattUtils.getBluetoothDeviceName(bluetoothDevice));
            this.x.add(new b(hMDeviceSourceNameToDeviceSource, t(hMDeviceSourceNameToDeviceSource), bluetoothDevice));
        }
    }

    private void initView() {
        TextView textView = (TextView) findViewById(R.id.tips);
        int i = R.id.select_mili_other_tv;
        TextView textView2 = (TextView) findViewById(i);
        if (this.y == 24) {
            textView.setText(R.string.select_chaohu_tips_1);
            textView2.setText(R.string.bound_other_watch);
        } else if (this.z.getValue().isBindingWatch(this.y)) {
            textView.setText(R.string.select_chaohu_tips_1);
            textView2.setText(R.string.search_other_chaohu);
        }
        ListView listView = (ListView) findViewById(R.id.mili_device_list);
        listView.setVerticalScrollBarEnabled(false);
        listView.setAdapter((ListAdapter) new a());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: oe3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                this.a.q(adapterView, view, i2, j);
            }
        });
        findViewById(R.id.select_mili_quit_tv).setOnClickListener(new View.OnClickListener() { // from class: ne3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: me3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(view);
            }
        });
    }

    private void p() {
        int i = this.y;
        if (i == 11 || i == 12 || i == 19) {
            HMCaptureWatchQRActivity.startCapture(this, i);
        } else {
            this.z.getValue().startBindWatch(this, null, this.y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(AdapterView adapterView, View view, int i, long j) {
        if (this.z.getValue().isBindingWatch(this.y) || this.z.getValue().isBindingAllWatch(this.y)) {
            this.z.getValue().startBindWatch(this, this.x.get(i).c, this.z.getValue().sourceToWatchType(this.x.get(i).a));
        } else {
            this.z.getValue().startBindMiLi(this, this.x.get(i).c);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        if (this.z.getValue().isBindingAllWatch(this.y)) {
            UnifyBindWaySelectActivity.INSTANCE.launch(this, false);
        } else if (this.z.getValue().isBindingWatch(this.y)) {
            p();
        } else {
            this.z.getValue().startBind(this, HMDeviceType.MILI);
        }
        finish();
    }

    public static void show(Context context, List<BluetoothDevice> list) {
        Intent intent = new Intent(context, (Class<?>) HMSelectBoundMiliActivity.class);
        if (list != null && list.size() > 0) {
            intent.putParcelableArrayListExtra(C, new ArrayList<>(list));
        }
        context.startActivity(intent);
    }

    private String t(HMDeviceSource hMDeviceSource) {
        return hMDeviceSource == null ? getString(R.string.unknown) : this.B.getValue().getDeviceDescription(hMDeviceSource);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.select_mili_layout_unify);
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s10, BaseTitleActivity.STYLE.NONE);
        initData();
        initView();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.BIND_QUICK_BIND).setValue(this.z.getValue().isBindingWatch(this.y) ? StatEvent.BIND_QUICK_BIND_WATCH : "Band"));
    }

    public static void show(Activity activity, List<BluetoothDevice> list, int i) {
        Intent intent = new Intent(activity, (Class<?>) HMSelectBoundMiliActivity.class);
        if (list != null && list.size() > 0) {
            intent.putParcelableArrayListExtra(C, new ArrayList<>(list));
        }
        intent.putExtra("bind_type", i);
        activity.startActivity(intent);
    }
}
