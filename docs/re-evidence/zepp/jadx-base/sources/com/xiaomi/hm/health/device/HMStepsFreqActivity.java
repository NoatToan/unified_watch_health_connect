package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.view.WeightChartView;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMStepsFreqActivity;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceRealtimeStepEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import de.greenrobot.event.EventBus;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes20.dex */
public class HMStepsFreqActivity extends BaseTitleActivity {
    private static final String K = "HMStepsFreqActivity";
    private static final int L = 30;
    private boolean A;
    private int E;
    private int F;
    private TextView I;
    private Subscription J;
    private TextView x;
    private TextView y;
    private WeightChartView z;
    private LinkedList<Integer> B = new LinkedList<>();
    private CountDownTimer C = null;
    private int D = 30;
    private AlertDialogFragment G = null;
    private long H = System.currentTimeMillis();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMStepsFreqActivity.this.z.setValue(0.0f);
        }
    }

    public class b extends CountDownTimer {
        public b(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            HMStepsFreqActivity.this.y();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            HMStepsFreqActivity.this.F = (int) (j / 1000);
            HMStepsFreqActivity.this.I.setText(HMStepsFreqActivity.this.getString(R.string.count_down, new Object[]{Long.toString(HMStepsFreqActivity.this.F)}));
            HMStepsFreqActivity.this.F();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMStepsFreqActivity.this.y.setText(String.valueOf(HMStepsFreqActivity.this.z()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Long l) {
        int i = this.E;
        if (i > (this.D * 1000) + 250) {
            this.J.unsubscribe();
            this.z.postDelayed(new a(), 1000L);
        } else {
            this.z.setValue(i);
            this.E += 100;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(Throwable th) {
        HMLog.error(K, "", th, new Function0() { // from class: mi3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMStepsFreqActivity.B();
            }
        });
    }

    private void D() {
        if (this.A) {
            this.z.setValue(0.0f);
            this.C.cancel();
            this.J.unsubscribe();
            y();
            return;
        }
        this.A = true;
        this.x.setText(R.string.shoes_restart);
        this.D = 30;
        this.J = Observable.interval(100L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: ni3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.A((Long) obj);
            }
        }, new Action1() { // from class: oi3
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                HMStepsFreqActivity.C((Throwable) obj);
            }
        });
        G();
    }

    private void E(boolean z) {
        if (!z) {
            AlertDialogFragment alertDialogFragment = this.G;
            if (alertDialogFragment != null) {
                alertDialogFragment.dismiss();
                this.G = null;
                return;
            }
            return;
        }
        AlertDialogFragment alertDialogFragment2 = this.G;
        if (alertDialogFragment2 == null || !alertDialogFragment2.isShowing()) {
            AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.shoes_not_connected).setMessage(R.string.shoes_sport_monitor_shoes_offline_notice).setNeutralButton(R.string.confirm, new c()).create();
            this.G = alertDialogFragmentCreate;
            alertDialogFragmentCreate.show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        runOnUiThread(new d());
    }

    private void G() {
        this.I.setText(getString(R.string.count_down, new Object[]{String.valueOf(this.D)}));
        this.z.setMaxValue((this.D * 1000) + 250);
        this.E = 0;
        this.B.clear();
        this.C = new b((this.D * 1000) + 250, 1000L);
        this.H = System.currentTimeMillis();
        this.C.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        F();
        this.B.clear();
        this.A = false;
        this.I.setText(getString(R.string.count_down, new Object[]{String.valueOf(30)}));
        this.x.setText(R.string.shoes_start);
        this.H = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z() {
        if (this.B.size() <= 1) {
            return 0;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.H) / 1000;
        if (jCurrentTimeMillis <= 0) {
            return 0;
        }
        int iIntValue = this.B.getFirst().intValue();
        int iIntValue2 = this.B.getLast().intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("getFren:");
        int i = iIntValue2 - iIntValue;
        sb.append(i);
        sb.append(",");
        sb.append(jCurrentTimeMillis);
        HMLog.d(K, sb.toString(), new Object[0]);
        return (int) (((long) (i * 60)) / jCurrentTimeMillis);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.pale_grey_two), true);
        setContentView(R.layout.activity_steps_freq_test);
        HMLog.d(K, "init page", new Object[0]);
        TextView textView = (TextView) findViewById(R.id.right_btn);
        this.x = textView;
        textView.setText(R.string.shoes_start);
        this.x.setOnClickListener(new View.OnClickListener() { // from class: li3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.left_btn);
        textView2.setText(R.string.cancel);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: ki3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        this.y = (TextView) findViewById(R.id.sport_rating);
        WeightChartView weightChartView = (WeightChartView) findViewById(R.id.sport_progress_state);
        this.z = weightChartView;
        weightChartView.setValue(0.0f);
        this.y.setText("0");
        TextView textView3 = (TextView) findViewById(R.id.count_down_tv);
        this.I = textView3;
        textView3.setText(getString(R.string.count_down, new Object[]{String.valueOf(30)}));
        this.A = false;
        EventBus.getDefault().register(this);
        Analytics.event(this, StatEvent.DeviceSetting.SHOE_STEP_FEQ_NUM);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
        CountDownTimer countDownTimer = this.C;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        Subscription subscription = this.J;
        if (subscription == null || subscription.isUnsubscribed()) {
            return;
        }
        this.J.unsubscribe();
    }

    public void onEventMainThread(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        if (hMDeviceConnectionEvent.getDeviceType() == HMDeviceType.SHOES) {
            boolean zIsConnected = hMDeviceConnectionEvent.isConnected();
            E(!zIsConnected);
            this.x.setEnabled(zIsConnected);
        }
    }

    public void process(int i) {
        HMLog.d(K, "steps: " + i, new Object[0]);
        this.B.add(Integer.valueOf(i));
    }

    public void onEventMainThread(HMDeviceRealtimeStepEvent hMDeviceRealtimeStepEvent) {
        if (hMDeviceRealtimeStepEvent.getDeviceType() == HMDeviceType.SHOES && this.A) {
            process(hMDeviceRealtimeStepEvent.getRealtimeStep().getTotalStep());
        }
    }
}
