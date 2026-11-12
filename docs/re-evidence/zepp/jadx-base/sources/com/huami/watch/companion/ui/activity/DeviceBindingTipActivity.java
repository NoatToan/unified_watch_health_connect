package com.huami.watch.companion.ui.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huami.watch.companion.R;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.companion.cloud.api.BusCardAPI;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.companion.ui.view.CircleIndicator;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.I18nUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.Rx;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.device.event.StatEvent;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceBindingTipActivity extends Activity implements Consumer<Integer>, SyncCenter.SyncListener {
    private static final String m = "BindingTipActivity";
    private static final int n = 100;
    private static final int o = 101;
    private TextView a;
    private ViewPager b;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private List<View> c = new ArrayList();
    private int k = 3000;
    private Handler l = new Handler(new a());

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 100) {
                DeviceBindingTipActivity.this.l.removeMessages(101);
                return false;
            }
            if (i != 101) {
                return false;
            }
            DeviceBindingTipActivity.this.b.setCurrentItem(DeviceBindingTipActivity.this.b.getCurrentItem() + 1);
            DeviceBindingTipActivity.this.l.sendEmptyMessageDelayed(101, DeviceBindingTipActivity.this.k);
            return false;
        }
    }

    public class b implements ViewPager.OnPageChangeListener {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                DeviceBindingTipActivity.this.l.sendEmptyMessage(100);
            } else if (DeviceBindingTipActivity.this.b.getAdapter() != null) {
                if (DeviceBindingTipActivity.this.j == DeviceBindingTipActivity.this.b.getAdapter().getPagerCount() - 1) {
                    DeviceBindingTipActivity.this.b.setCurrentItem(1, false);
                } else if (DeviceBindingTipActivity.this.j == 0) {
                    DeviceBindingTipActivity.this.b.setCurrentItem(DeviceBindingTipActivity.this.b.getAdapter().getPagerCount() - 2, false);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            DeviceBindingTipActivity.this.j = i;
        }
    }

    public class c extends PagerAdapter {
        public c() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
            viewGroup.removeView((View) DeviceBindingTipActivity.this.c.get(i));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            if (DeviceBindingTipActivity.this.c != null) {
                return DeviceBindingTipActivity.this.c.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
            viewGroup.addView((View) DeviceBindingTipActivity.this.c.get(i));
            return DeviceBindingTipActivity.this.c.get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            return view == obj;
        }
    }

    private void j() {
        String[] stringArray;
        int[] iArr;
        int length;
        LayoutInflater layoutInflater = getLayoutInflater();
        String[] stringArray2 = null;
        if (this.d) {
            if (this.e) {
                iArr = new int[]{R.drawable.ic_bind_guide_qogir_first, R.drawable.ic_bind_guide_qogir_second, R.drawable.ic_bind_guide_qogir_third, R.drawable.ic_bind_guide_qogir_fourth};
                stringArray = getResources().getStringArray(R.array.bind_guide_main_title_qogir);
            } else {
                iArr = new int[]{R.drawable.ic_bind_guide_qogir_first_oversea, R.drawable.ic_bind_guide_qogir_third, R.drawable.ic_bind_guide_qogir_fourth};
                stringArray = getResources().getStringArray(R.array.bind_guide_main_title_qogir_oversea);
                stringArray2 = getResources().getStringArray(R.array.bind_guide_support_title_qogir_oversea);
            }
        } else if (this.f) {
            stringArray = getResources().getStringArray(R.array.bind_guide_main_title_xihu);
            iArr = new int[]{R.drawable.ic_bind_guide_xihu_first, R.drawable.ic_bind_guide_xihu_second, R.drawable.ic_bind_guide_xihu_third};
        } else if (!this.g) {
            String[] stringArray3 = getResources().getStringArray(R.array.bind_guide_main_title);
            stringArray2 = getResources().getStringArray(R.array.bind_guide_support_title);
            stringArray = stringArray3;
            iArr = new int[]{R.drawable.ic_bind_guide_first, R.drawable.ic_bind_guide_second, R.drawable.ic_bind_guide_third, R.drawable.ic_bind_guide_fourth, R.drawable.ic_bind_guide_fifth};
        } else if (this.h) {
            stringArray = getResources().getStringArray(R.array.bind_guide_main_title_everest2_oversea);
            iArr = new int[]{R.drawable.ic_bind_guide_everest2_first, R.drawable.ic_bind_guide_everest2_third, R.drawable.ic_bind_guide_everest2_fourth};
        } else {
            String[] stringArray4 = getResources().getStringArray(R.array.bind_guide_main_title_everest2);
            int[] iArr2 = {R.drawable.ic_bind_guide_everest2_first, R.drawable.ic_bind_guide_everest2_second, R.drawable.ic_bind_guide_everest2_third, R.drawable.ic_bind_guide_everest2_fourth};
            if (this.i) {
                String[] strArr = (String[]) Arrays.copyOf(stringArray4, 5);
                strArr[4] = getString(R.string.device_binding_tip_everest2_starwar);
                int[] iArrCopyOf = Arrays.copyOf(iArr2, 5);
                iArrCopyOf[4] = R.drawable.ic_bind_guide_everest2_5_starwar;
                stringArray = strArr;
                iArr = iArrCopyOf;
            } else {
                stringArray = stringArray4;
                iArr = iArr2;
            }
        }
        int i = 0;
        while (i < stringArray.length + 2) {
            View viewInflate = layoutInflater.inflate(R.layout.view_bind_guide, (ViewGroup) this.b, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
            TextView textView = (TextView) viewInflate.findViewById(R.id.main_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.support_title);
            if (i == 0) {
                length = stringArray.length - 1;
            } else {
                length = i == stringArray.length + 1 ? 0 : i - 1;
            }
            imageView.setImageResource(iArr[length]);
            textView.setText(stringArray[length]);
            if (stringArray2 != null && !TextUtils.isEmpty(stringArray2[length])) {
                textView2.setText(stringArray2[length]);
                textView2.setVisibility(0);
            }
            this.c.add(viewInflate);
            i++;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void k() {
        this.b = (ViewPager) findViewById(R.id.bind_view_pager);
        CircleIndicator circleIndicator = (CircleIndicator) findViewById(R.id.bind_indicator);
        j();
        this.b.setAdapter(new c());
        circleIndicator.setLoopVisibity(true);
        circleIndicator.setViewPager(this.b);
        this.b.setCurrentItem(1);
        this.l.sendEmptyMessageDelayed(101, this.k);
        this.b.addOnPageChangeListener(new b());
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: v61
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.a.l(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean l(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        view.performClick();
        this.l.sendEmptyMessageDelayed(101, this.k);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, String str2, String str3, String str4, ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(BusCardAPI.getOpenedBusCardInfo(getApplicationContext(), str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        Log.d(m, "bind and sync bus card info to watch:" + str, new Object[0]);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString("buscard_info", str);
        Transporter.get(getApplicationContext(), "com.huami.watch.companion").send("com.huami.watch.companion.transport.SyncBusCard", dataBundle);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0072  */
    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Device deviceFind;
        boolean zIsModelEverest;
        TextView textView;
        boolean booleanExtra;
        int i;
        super.onCreate(bundle);
        String bindingDevice = BindHelper.getHelper().getBindingDevice();
        boolean z = false;
        Log.d(m, "Binding Address:" + bindingDevice, new Object[0]);
        this.d = false;
        if (bindingDevice != null) {
            deviceFind = DeviceManager.getManager(this).find(bindingDevice);
            if (deviceFind != null) {
                zIsModelEverest = DeviceSource.isModelEverest(deviceFind);
                this.d = DeviceSource.isModelQogir(deviceFind);
                this.e = DeviceSource.isModelQogirMainland(deviceFind);
                this.f = DeviceSource.isModelXihu(deviceFind);
                this.g = DeviceSource.isSeriesEverest2(deviceFind);
                this.h = DeviceSource.isModelEverest2Oversea(deviceFind);
                this.i = DeviceSource.isModelEverest2StarWar(deviceFind);
            }
            if (!zIsModelEverest || this.d || this.f || this.g) {
                setContentView(R.layout.activity_device_binding_with_guide);
                textView = (TextView) findViewById(R.id.device_name);
                if (deviceFind == null && DeviceSource.isModelXihuDisney(deviceFind)) {
                    textView.setText(R.string.device_name_xihu_disney_tip_title);
                } else {
                    textView.setText(DeviceSource.getDeviceName(this, deviceFind));
                }
                k();
            } else {
                setContentView(R.layout.activity_device_binding);
            }
            DeviceCompatibility.setStatusBarDarkMode(this, true);
            this.a = (TextView) findViewById(R.id.tip_text);
            booleanExtra = getIntent().getBooleanExtra(StatEvent.BIND_SCREEN_LOCK_RESTORE_OUT_RESTORE, false);
            BindHelper.getHelper().addCallback(this);
            BindHelper helper = BindHelper.getHelper();
            if (booleanExtra) {
                i = 13;
            } else {
                i = 14;
            }
            helper.notifyStateChanged(i);
            SyncCenter.getCenter(this).listen(this);
            if (!GlobalConfig.get().isBuildAmazfit() && DeviceUtil.isSupportNFC(deviceFind)) {
                z = true;
            }
            if (deviceFind == null && z && !this.g) {
                final String sn = deviceFind.getSN();
                final String cplc = deviceFind.getCplc();
                final String huamiModel = deviceFind.info().getHuamiModel();
                final String cpuId = deviceFind.getCpuId();
                Rx.io(new ObservableOnSubscribe() { // from class: w61
                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                        this.a.m(sn, cpuId, cplc, huamiModel, observableEmitter);
                    }
                }).safeSubscribe(new Consumer() { // from class: x61
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        this.a.n((String) obj);
                    }
                });
                return;
            }
            return;
        }
        deviceFind = null;
        zIsModelEverest = false;
        if (zIsModelEverest) {
            setContentView(R.layout.activity_device_binding_with_guide);
            textView = (TextView) findViewById(R.id.device_name);
            if (deviceFind == null) {
                textView.setText(DeviceSource.getDeviceName(this, deviceFind));
            } else {
                textView.setText(DeviceSource.getDeviceName(this, deviceFind));
            }
            k();
        } else {
            setContentView(R.layout.activity_device_binding_with_guide);
            textView = (TextView) findViewById(R.id.device_name);
            if (deviceFind == null) {
                textView.setText(DeviceSource.getDeviceName(this, deviceFind));
            } else {
                textView.setText(DeviceSource.getDeviceName(this, deviceFind));
            }
            k();
        }
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        this.a = (TextView) findViewById(R.id.tip_text);
        booleanExtra = getIntent().getBooleanExtra(StatEvent.BIND_SCREEN_LOCK_RESTORE_OUT_RESTORE, false);
        BindHelper.getHelper().addCallback(this);
        BindHelper helper2 = BindHelper.getHelper();
        if (booleanExtra) {
            i = 13;
        } else {
            i = 14;
        }
        helper2.notifyStateChanged(i);
        SyncCenter.getCenter(this).listen(this);
        if (!GlobalConfig.get().isBuildAmazfit()) {
            z = true;
        }
        if (deviceFind == null) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Log.i(m, "OnDestroy!!", new Object[0]);
        BindHelper.getHelper().removeCallback(this);
        SyncCenter.getCenter(this).removeListener(this);
        this.l.sendEmptyMessage(100);
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
    }

    @Override // com.huami.watch.companion.sync.SyncCenter.SyncListener
    public void onSyncStateChanged(int i, int i2, String str) {
        String string;
        String str2;
        if (Integer.MAX_VALUE == i) {
            this.a.setText(R.string.binding_content);
            return;
        }
        if (i2 != 0) {
            if (i != 1) {
                string = i != 2 ? null : getString(R.string.sync_data_health);
            } else {
                string = getString(R.string.sync_data_sport);
            }
            String string2 = i2 == 1 ? getString(R.string.sync_data_ing) : null;
            if (TextUtils.isEmpty(str)) {
                str = string2;
            }
            if (string == null || str == null) {
                return;
            }
            if (I18nUtil.isEn(this)) {
                str2 = string + " " + str.toLowerCase();
            } else {
                str2 = string + str;
            }
            this.a.setText(str2);
        }
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(@NonNull Integer num) throws Exception {
        int iIntValue = num.intValue();
        if (iIntValue == -7 || iIntValue == -5) {
            finish();
        } else if (iIntValue == 13) {
            Log.i(m, "State Restoring...", new Object[0]);
        } else {
            if (iIntValue != 14) {
                return;
            }
            Log.i(m, "State Restoring No...", new Object[0]);
        }
    }
}
