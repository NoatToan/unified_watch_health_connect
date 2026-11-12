package com.huami.watch.companion.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.event.ConnectedEvent;
import com.huami.watch.companion.event.DisconnectedEvent;
import com.huami.watch.companion.sport.SportSortManager;
import com.huami.watch.companion.ui.activity.SportSortV2Activity;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.RxBus;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class SportSortV2Activity extends Activity {
    private ListView a;
    private String b;
    private boolean c = false;
    private ArrayList<SportData> d = new ArrayList<>();
    private Disposable e;

    public class SportAdapter extends BaseAdapter {

        public class ViewHolder {
            public TextView a;

            public ViewHolder() {
            }
        }

        public SportAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return SportSortV2Activity.this.d.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return SportSortV2Activity.this.d.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            if (view == null) {
                view = LayoutInflater.from(SportSortV2Activity.this).inflate(R.layout.list_item_sport, viewGroup, false);
                viewHolder = new ViewHolder();
                viewHolder.a = (TextView) view.findViewById(R.id.sport_item_text);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.a.setText(((SportData) getItem(i)).getName());
            return view;
        }
    }

    public static class SportData {
        private String a;
        private int b;
        private String c;
        private String d;

        public SportData(String str, int i, String str2, String str3) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
        }

        public String getEvent() {
            return this.d;
        }

        public int getIndex() {
            return this.b;
        }

        public String getKey() {
            return this.c;
        }

        public String getName() {
            return this.a;
        }

        public void setEvent(String str) {
            this.d = str;
        }

        public void setIndex(int i) {
            this.b = i;
        }

        public void setKey(String str) {
            this.c = str;
        }

        public void setName(String str) {
            this.a = str;
        }
    }

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SportSortV2Activity sportSortV2Activity = SportSortV2Activity.this;
            SportItemSortActivity.to(sportSortV2Activity, ((SportData) sportSortV2Activity.d.get(i)).getIndex(), ((SportData) SportSortV2Activity.this.d.get(i)).getName(), ((SportData) SportSortV2Activity.this.d.get(i)).getKey(), ((SportData) SportSortV2Activity.this.d.get(i)).getEvent(), SportSortV2Activity.this.b, SportSortV2Activity.this.c);
        }
    }

    public class b implements Consumer<Object> {
        public b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(@NonNull Object obj) throws Exception {
            if (obj instanceof DisconnectedEvent) {
                if (DeviceManager.getManager(SportSortV2Activity.this).getCurrentDevice() == null) {
                    return;
                }
                SportSortV2Activity.this.s();
            } else if (obj instanceof ConnectedEvent) {
                SportSortV2Activity.this.r();
            }
        }
    }

    private void i() {
        this.b = getIntent().getStringExtra("deviceModel");
        this.c = getIntent().getBooleanExtra(SportItemSortActivity.KEY_SUPPORT_HIDE, false);
        this.d.addAll(SportSortManager.getManager().generateSportData(this, this.b));
    }

    private void j() {
        this.e = RxBus.get().toObservable().subscribe(new b(), new Consumer() { // from class: uc7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SportSortV2Activity.p((Throwable) obj);
            }
        });
    }

    private void k() {
        i();
        this.a.setAdapter((ListAdapter) new SportAdapter());
    }

    private void l() {
        this.a.setOnItemClickListener(new a());
        j();
    }

    private void m() {
        ((TextView) findViewById(R.id.title)).setText(R.string.widget_sport_order);
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() { // from class: tc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.q(view);
            }
        });
    }

    private void n() {
        this.a = (ListView) findViewById(R.id.sport_list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Throwable th) throws Exception {
        HMLog.warn("SportSortV2Activity", th, new Function0() { // from class: vc7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportSortV2Activity.o();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.a.setAlpha(1.0f);
        this.a.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.a.setAlpha(0.5f);
        this.a.setEnabled(false);
    }

    private void t() {
        this.a.setAlpha(0.5f);
        this.a.setEnabled(false);
    }

    public static void to(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SportSortV2Activity.class);
        intent.addFlags(536870912);
        intent.putExtra("deviceModel", str);
        intent.putExtra(SportItemSortActivity.KEY_SUPPORT_HIDE, z);
        context.startActivity(intent);
    }

    public void checkDeviceState() {
        Device currentDevice = DeviceManager.getManager(this).getCurrentDevice();
        if (currentDevice == null) {
            t();
        } else if (currentDevice.isConnected()) {
            r();
        } else {
            s();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sport_sort_new);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        m();
        n();
        k();
        l();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.e.dispose();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
        checkDeviceState();
    }
}
