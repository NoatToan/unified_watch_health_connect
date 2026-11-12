package com.xiaomi.hm.health.training.ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.ListTile;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.helper.GlobalTitleStyleKt;
import com.xiaomi.hm.health.traininglib.util.TrainingAlarmUtils;
import com.xiaomi.hm.health.traininglib.util.TrainingConfig;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class TrainingNotifyActivity extends BaseTitleActivity {
    public static final int REQUEST_CODE = 1900;
    private ListTile x;
    private ListTile y;
    private ListTile z;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            TrainingNotifyActivity.this.p(z);
            TrainingConfig.setPhoneEnable(z);
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            TrainingConfig.setBandEnable(z);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrainingNotifyActivity.this.q(TrainingConfig.getHour(), TrainingConfig.getMinute());
        }
    }

    public class d implements HMTimeChooseView.ITimeChooseListener {
        public final /* synthetic */ AtomicInteger a;
        public final /* synthetic */ AtomicInteger b;

        public d(AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
            this.a = atomicInteger;
            this.b = atomicInteger2;
        }

        @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
        public void onTimeChoose(int i, int i2) {
            this.a.set(i);
            this.b.set(i2);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public final /* synthetic */ AtomicInteger a;
        public final /* synthetic */ AtomicInteger b;

        public f(AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
            this.a = atomicInteger;
            this.b = atomicInteger2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            TrainingNotifyActivity.this.z.setTips(TrainingDateUtils.getTimeStrByIdx(TrainingNotifyActivity.this, this.a.get(), this.b.get()));
            TrainingConfig.setHourAndMinute(this.a.get(), this.b.get());
            TrainingAlarmUtils.setAlarmByCourse(TrainingNotifyActivity.this.getApplicationContext());
        }
    }

    private void initView() {
        this.x = (ListTile) findViewById(R.id.training_notify);
        this.y = (ListTile) findViewById(R.id.miband_training_notify);
        ListTile listTile = (ListTile) findViewById(R.id.training_notify_time);
        this.z = listTile;
        listTile.setTips(TrainingDateUtils.getTimeStrByIdx(this, TrainingConfig.getHour(), TrainingConfig.getMinute()));
        this.x.setChecked(true);
        o(this.x);
        o(this.y);
        o(this.z);
        boolean phoneEnable = TrainingConfig.getPhoneEnable();
        this.x.setChecked(phoneEnable);
        p(phoneEnable);
        this.y.setChecked(TrainingConfig.getBandEnable());
        this.x.setOnCheckedChangeListener(new a());
        this.y.setOnCheckedChangeListener(new b());
        this.z.setOnClickListener(new c());
    }

    private void o(ListTile listTile) {
        listTile.setTitleColor(ContextCompat.getColor(this, R.color.s1));
        listTile.setBackgroundColor(ContextCompat.getColor(this, R.color.s38));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z) {
        this.y.setEnabled(z);
        this.z.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i, int i2) {
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(this);
        String string = getResources().getString(R.string.training_notify_time);
        hMTimeChooseView.setInitialTime(i, i2);
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        AtomicInteger atomicInteger2 = new AtomicInteger(-1);
        hMTimeChooseView.setOnTimeChooseListener(new d(atomicInteger, atomicInteger2));
        new AlertDialogFragment.Builder(this).setTitle(string).setCancelable(true).setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.confirm), new f(atomicInteger, atomicInteger2)).setNegativeButton(getString(R.string.cancel), new e()).show(getSupportFragmentManager());
    }

    public static void startForResult(Activity activity) {
        activity.startActivityForResult(new Intent(activity, (Class<?>) TrainingNotifyActivity.class), 1900);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_training_notify);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.s1));
        GlobalTitleStyleKt.setUnifyTitleStyle(this, getString(R.string.training_notify), "");
        initView();
    }
}
