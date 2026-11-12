package com.xiaomi.hm.health.ui.smartplay.customvibrate.ui;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.device.VibrateSyncUtils;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateRepo;
import com.xiaomi.hm.health.ui.smartplay.customvibrate.model.VibrateTransformer;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventReminderExpandKt;
import com.xiaomi.hm.health.utils.Utils;
import java.util.List;
import java.util.Objects;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class EditVibrateActivity extends BaseTitleActivity {
    private TextView A;
    private TextView B;
    private View C;
    private LoadingDialog D;
    private boolean E = false;
    private boolean F = false;
    private HMDeviceSource G = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
    private CustomVibrateIndicator x;
    private VibrateController y;
    private TextView z;

    public class a implements VibrateController.RecordListener {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(View view) {
            EditVibrateActivity.this.F = false;
            EditVibrateActivity.this.y.stop();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(View view) {
            EditVibrateActivity.this.A.setEnabled(false);
            EditVibrateActivity.this.z.setText(R.string.custom_vibrate_vibrate_stop);
            EditVibrateActivity.this.z.setEnabled(false);
            EditVibrateActivity.this.C.setVisibility(8);
            EditVibrateActivity.this.L(false);
            EditVibrateActivity.this.y.reStart();
            EditVibrateActivity.this.B.setVisibility(8);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController.RecordListener
        public void onInvalidate(List<VibrateController.DataSegment> vibrateConfig) {
            EditVibrateActivity.this.x.a(vibrateConfig);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController.RecordListener
        public void onRecord(boolean vibrate) {
            if (EditVibrateActivity.this.F) {
                EditVibrateActivity.this.C.setVisibility(vibrate ? 0 : 8);
            }
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController.RecordListener
        public void onRecordStart() {
            if (EditVibrateActivity.this.E) {
                return;
            }
            EditVibrateActivity.this.F = true;
            EditVibrateActivity.this.L(false);
            EditVibrateActivity.this.A.setEnabled(false);
            EditVibrateActivity.this.z.setEnabled(true);
            EditVibrateActivity.this.z.setText(R.string.custom_vibrate_vibrate_stop);
            EditVibrateActivity.this.z.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c(view);
                }
            });
            EditVibrateActivity.this.C.setVisibility(0);
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController.RecordListener
        public void onRecordStop(List<VibrateController.DataSegment> vibrateConfig) {
            if (EditVibrateActivity.this.E) {
                return;
            }
            EditVibrateActivity.this.F = false;
            EditVibrateActivity.this.L(true);
            EditVibrateActivity.this.A.setEnabled(true);
            EditVibrateActivity.this.z.setEnabled(true);
            EditVibrateActivity.this.z.setText(R.string.custom_vibrate_record_again);
            EditVibrateActivity.this.z.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.d(view);
                }
            });
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.customvibrate.VibrateController.RecordListener
        public void onVibrateTooLong() {
            EditVibrateActivity.this.B.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(BaseDialogFragment baseDialogFragment, String str) {
        Utils.closeSoftInput(this);
        baseDialogFragment.dismiss();
        VibrateRepo.getInstance().addVibrateEntity(VibrateTransformer.getVibrateEntity(VibrateRepo.getInstance().getValidName(str), this.y.getVibrateConfig()));
        VibrateRepo.getInstance().save();
        setResult(-1);
        this.y.clearWhenExitActivity();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(View view) {
        EditVibrateNameDialog editVibrateNameDialogNewInstance = EditVibrateNameDialog.newInstance();
        editVibrateNameDialogNewInstance.setNameChangedListener(new EditVibrateNameDialog.INameChangedListener() { // from class: uj1
            @Override // com.xiaomi.hm.health.ui.smartplay.customvibrate.ui.EditVibrateNameDialog.INameChangedListener
            public final void onDisplayNameChanged(BaseDialogFragment baseDialogFragment, String str) {
                this.a.D(baseDialogFragment, str);
            }
        });
        editVibrateNameDialogNewInstance.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        M(getString(R.string.custom_vibrate_loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Boolean bool) {
        this.D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Throwable th) {
        this.D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        VibrateSyncUtils.vibrateOnDevice(VibrateTransformer.getVibrateEntity("test", this.y.getVibrateConfig()).times).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Action0() { // from class: vj1
            @Override // rx.functions.Action0
            public final void call() {
                this.a.F();
            }
        }).subscribe(new Action1() { // from class: wj1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.G((Boolean) obj);
            }
        }, new Action1() { // from class: xj1
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.H((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        findViewById(R.id.record_container).setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(DialogInterface dialogInterface, int i) {
        this.y.stop();
        dialogInterface.dismiss();
        findViewById(R.id.record_container).setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(boolean enable) {
        this.A.setEnabled(enable);
        getRightTitle().setEnabled(enable);
        getRightTitle().setTextColor(ContextCompat.getColor(this, enable ? R.color.black60 : R.color.black40));
    }

    private void M(CharSequence msg) {
        if (this.D == null) {
            this.D = new LoadingDialog(this);
        }
        this.D.setMessage(msg);
        this.D.setCancelable(false);
        this.D.show();
    }

    private void N() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.custom_vibrate_too_long).setPositiveButton(R.string.smart_alarm_diaog_continue, new DialogInterface.OnClickListener() { // from class: rj1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.J(dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: qj1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.K(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void initTitle() {
        EventReminderExpandKt.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.CANCEL_AND_SAVE, getString(R.string.custom_vibrate_new), null);
        L(false);
        getRightTitle().setOnClickListener(new View.OnClickListener() { // from class: sj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.E(view);
            }
        });
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.E = true;
        this.y.clearWhenExitActivity();
        super.onBackPressed();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_vibrate);
        this.A = (TextView) findViewById(R.id.vibrate_on_device_btn);
        this.B = (TextView) findViewById(R.id.vibrate_too_long_tv);
        initTitle();
        VibrateController vibrateControllerInit = VibrateController.init(getApplicationContext());
        this.y = vibrateControllerInit;
        vibrateControllerInit.refresh();
        this.A.setOnClickListener(new View.OnClickListener() { // from class: tj1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.I(view);
            }
        });
        this.z = (TextView) findViewById(R.id.stop_btn);
        this.x = (CustomVibrateIndicator) findViewById(R.id.custom_indicator);
        if (ConfigHelperKt.getDeviceIcon(this.G) == R.drawable.img_miband) {
            this.C = findViewById(R.id.vibrate_img);
        } else {
            this.C = findViewById(R.id.vibrate_img_gt);
        }
        if (GlobalConfig.get().isBuildMidong()) {
            ImageView imageView = (ImageView) findViewById(R.id.left_vibrate_img);
            ImageView imageView2 = (ImageView) findViewById(R.id.right_vibrate_img);
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.img_left_zzzz);
            Objects.requireNonNull(drawable);
            imageView.setImageDrawable(TintUtils.tintDrawable(drawable, ContextCompat.getColor(this, R.color.midong_progress_color)));
            Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.img_right_zzzz);
            Objects.requireNonNull(drawable2);
            imageView2.setImageDrawable(TintUtils.tintDrawable(drawable2, ContextCompat.getColor(this, R.color.midong_progress_color)));
        }
        this.y.setRecordListener(new a());
        findViewById(R.id.record_container).setOnTouchListener(this.y);
        HMDeviceUtils.updateDeviceImg((ImageView) findViewById(R.id.device_img), this.G);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        onBackPressed();
    }
}
