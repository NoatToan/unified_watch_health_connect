package com.xiaomi.hm.health.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.huami.account.HMLoginManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.traininglib.model.TrainingCacheClearEvent;
import com.xiaomi.hm.health.traininglib.util.TrainingCacheClear;
import com.xiaomi.hm.health.ui.CacheActivity;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes22.dex */
public class CacheActivity extends BaseTitleActivity implements View.OnClickListener {
    private LoadingDialog x;
    private ListTile y;

    private void A() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(R.string.clear_training_cache).setMessage(getString(R.string.training_cache_clear_warning)).setPositiveButton(R.string.contiune_clear, new DialogInterface.OnClickListener() { // from class: yg0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.u(dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: zg0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CacheActivity.v(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void initView() {
        this.y = (ListTile) findViewById(R.id.training_cache_item);
        y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean r(Long l) {
        return Boolean.valueOf(TrainingCacheClear.clearAllCachedFileSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(Boolean bool) {
        if (!bool.booleanValue()) {
            w(R.string.clear_cache_failed);
        } else {
            EventBus.getDefault().post(new TrainingCacheClearEvent());
            x(R.string.clear_cache_success);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Throwable th) {
        w(R.string.clear_cache_failed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(DialogInterface dialogInterface, int i) {
        z(R.string.cache_clearing);
        Observable.timer(500L, TimeUnit.MILLISECONDS).map(new Func1() { // from class: dh0
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return CacheActivity.r((Long) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1() { // from class: bh0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.s((Boolean) obj);
            }
        }, new Action1() { // from class: ch0
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.t((Throwable) obj);
            }
        }, new Action0() { // from class: ah0
            @Override // rx.functions.Action0
            public final void call() {
                this.a.y();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(DialogInterface dialogInterface, int i) {
    }

    private void w(final int stringId) {
        LoadingDialog loadingDialog = this.x;
        if (loadingDialog != null) {
            loadingDialog.setFailed(getString(stringId), 1000, null);
        }
    }

    private void x(final int stringId) {
        LoadingDialog loadingDialog = this.x;
        if (loadingDialog != null) {
            loadingDialog.setSuccess(getString(stringId), 1000, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (!Language.isSimplifiedChinese() || !HMLoginManager.isInChina()) {
            this.y.setVisibility(8);
            return;
        }
        this.y.setTips(TrainingCacheClear.transSize(TrainingCacheClear.getDirSize(new File(FileUtils.getTrainingDir().getAbsolutePath()))));
        this.y.setOnClickListener(this);
    }

    private void z(int msg) {
        if (this.x == null) {
            this.x = LoadingDialog.showDialog(this, getString(msg));
        }
        this.x.setCancelable(false);
        this.x.setMessage(getString(msg));
        this.x.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (v.getId() == R.id.training_cache_item) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SETTING_CACHE_OPERATION).setValue(StatEvent.EventParams.CACHE_TRAIN));
            A();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cache_activity);
        GlobalTitleStyle.setUnifyTitleStyle(this, getString(R.string.clear_cache));
        initView();
    }
}
