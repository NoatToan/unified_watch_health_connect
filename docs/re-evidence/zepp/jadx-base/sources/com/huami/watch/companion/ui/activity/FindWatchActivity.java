package com.huami.watch.companion.ui.activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.Key;
import com.huami.watch.companion.R;
import com.huami.watch.companion.delegate.CompanionToolUtilsDelegate;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.findphone.SettingsTransporterModules;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.ui.BaseActivity;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class FindWatchActivity extends BaseActivity {
    public static final String MAIN_MODULE_TOOL_KEY_NAME = "FIND_DEVICE";
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;
    private View b;
    private View c;
    private View d;
    private View e;
    private Transporter f;
    private Transporter.DataListener g;
    private a h;
    private ObjectAnimator i;

    public class a extends DoLooper.Result {
        public boolean a;

        public a() {
        }

        @Override // com.huami.watch.util.DoLooper.Result
        public String toString() {
            return "<Finish : " + this.finish + ", Success : " + this.success + ", Result : " + this.a + SearchCriteria.GT;
        }
    }

    private void A() {
        AlertDialog.setMessage(getString(R.string.find_watch_fail)).setCancelable(false).setPositiveBtn(getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: d72
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.t(dialogInterface, i);
            }
        }).setNegativeBtn(getString(R.string.btn_cancel), new DialogInterface.OnClickListener() { // from class: b72
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.u(dialogInterface, i);
            }
        }).show(this, "Find Watch No Device");
    }

    private void B() {
        AlertDialog.setMessage(getString(R.string.find_watch_success)).setCancelable(false).setNegativeBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: a72
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.v(dialogInterface, i);
            }
        }).show(this, "Watch Found");
    }

    private void C() {
        AlertDialog.setMessage(getString(R.string.find_watch_device_unconnect)).setCancelable(false).setNegativeBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: c72
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.w(dialogInterface, i);
            }
        }).show(this, "Find Watch No Device");
    }

    private void D() {
        Rx.io(new ObservableOnSubscribe() { // from class: i72
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.y(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: z62
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.z((Integer) obj);
            }
        });
    }

    private void initView() {
        this.b = findViewById(R.id.scan);
        this.c = findViewById(R.id.point_one);
        this.d = findViewById(R.id.point_two);
        this.e = findViewById(R.id.point_three);
        final ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: e72
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.r(view);
            }
        });
        actionbarLayout.setRightImage(R.drawable.appbar_icon_func);
        actionbarLayout.setRightImageVisible(false);
        actionbarLayout.setRightImageClickListener(new View.OnClickListener() { // from class: f72
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s(actionbarLayout, view);
            }
        });
    }

    private void n() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.b, Key.ROTATION, 0.0f, 360.0f);
        this.i = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(2000L);
        this.i.setRepeatCount(-1);
        this.i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y62
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.p(valueAnimator);
            }
        });
    }

    private void o() {
        this.f = Transporter.get(this, "com.huami.watch.companion");
        Transporter.DataListener dataListener = new Transporter.DataListener() { // from class: g72
            @Override // com.huami.watch.transport.Transporter.DataListener
            public final void onDataReceived(TransportDataItem transportDataItem) {
                this.a.q(transportDataItem);
            }
        };
        this.g = dataListener;
        this.f.addDataListener(dataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(ValueAnimator valueAnimator) {
        double dFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.c.setAlpha((float) Math.abs(Math.sin(Math.toRadians(90.0d + dFloatValue))));
        this.d.setAlpha((float) Math.abs(Math.sin(Math.toRadians(45.0d + dFloatValue))));
        this.e.setAlpha((float) Math.abs(Math.sin(Math.toRadians(dFloatValue + 0.0d))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(TransportDataItem transportDataItem) {
        if (SettingsTransporterModules.ACTION_WATCH_FOUND.equals(transportDataItem.getAction())) {
            a aVar = new a();
            this.h = aVar;
            aVar.finish = true;
            aVar.success = true;
            aVar.a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(ActionbarLayout actionbarLayout, View view) {
        CompanionToolUtilsDelegate.getInstance().getToolUtil().addToMyTools(MAIN_MODULE_TOOL_KEY_NAME);
        Toast.makeText(getApplicationContext(), com.huami.assistant.R.string.tool_add_success, 0).show();
        actionbarLayout.setRightImageVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(DialogInterface dialogInterface, int i) {
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DoLooper.Result x() throws Exception {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(1);
        if (!DeviceManager.getManager(this).isBoundDeviceConnected()) {
            observableEmitter.onNext(2);
            return;
        }
        this.h = new a();
        this.f.send(SettingsTransporterModules.ACTION_FIND_WATCH);
        DoLooper.doLoop(new DoLooper.Function() { // from class: h72
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return this.a.x();
            }
        }, 100, 120);
        observableEmitter.onNext(Integer.valueOf(this.h.a ? 3 : 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Integer num) throws Exception {
        if (1 == num.intValue()) {
            this.i.start();
        } else {
            this.i.cancel();
        }
        if (2 == num.intValue()) {
            C();
        }
        if (3 == num.intValue()) {
            B();
        }
        if (4 == num.intValue()) {
            A();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_find_watch);
        initView();
        o();
        n();
        D();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f.removeDataListener(this.g);
    }
}
