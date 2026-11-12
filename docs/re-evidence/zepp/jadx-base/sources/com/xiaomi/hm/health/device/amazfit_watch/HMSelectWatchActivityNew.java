package com.xiaomi.hm.health.device.amazfit_watch;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.devicex.injection.other.AppUtilApi;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.util.Analytics;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.device.amazfit_watch.HMSelectWatchActivityNew;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMSelectWatchActivityNew extends BaseTitleActivity {
    private static final String A = "HMSelectWatchActivityNew";
    private SupportWatchViewModel x;
    private final Lazy<AppUtilApi> y = KoinJavaComponent.inject(AppUtilApi.class);
    private final Lazy<DeviceXNavigator> z = KoinJavaComponent.inject(DeviceXNavigator.class);

    public class a extends RecyclerView.Adapter<b> {
        private List<SupportWatchItem> a;
        private final Context b;

        public a(Context context) {
            this.b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(int i, boolean z) {
            if (z) {
                ((DeviceXNavigator) HMSelectWatchActivityNew.this.z.getValue()).startCapture(HMSelectWatchActivityNew.this, i);
                HMSelectWatchActivityNew.this.finish();
            } else {
                AppUtilApi appUtilApi = (AppUtilApi) HMSelectWatchActivityNew.this.y.getValue();
                HMSelectWatchActivityNew hMSelectWatchActivityNew = HMSelectWatchActivityNew.this;
                appUtilApi.showPermissionDenieDialog(hMSelectWatchActivityNew, hMSelectWatchActivityNew.getString(R.string.open_loaction_msg));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(int i, boolean z) {
            if (z) {
                ((DeviceXNavigator) HMSelectWatchActivityNew.this.z.getValue()).startCapture(HMSelectWatchActivityNew.this, i);
                HMSelectWatchActivityNew.this.finish();
            } else {
                AppUtilApi appUtilApi = (AppUtilApi) HMSelectWatchActivityNew.this.y.getValue();
                HMSelectWatchActivityNew hMSelectWatchActivityNew = HMSelectWatchActivityNew.this;
                appUtilApi.showPermissionDenieDialog(hMSelectWatchActivityNew, hMSelectWatchActivityNew.getString(R.string.open_loaction_msg));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(int i, View view) {
            if (((AppUtilApi) HMSelectWatchActivityNew.this.y.getValue()).isFastDoubleClick(view)) {
                return;
            }
            if (HMSelectWatchActivityNew.this.x.isWearCompanionDevice(i)) {
                HMSelectWatchActivityNew.this.C();
            } else {
                d(i);
            }
        }

        public void d(final int i) {
            if ((i == 11 || i == 12 || i == 19 || i == 22) || i == 21 || i == 23) {
                if (!((DeviceXNavigator) HMSelectWatchActivityNew.this.z.getValue()).testPhoneEnv(HMSelectWatchActivityNew.this, true, i) || ManagerFunctionsKt.getDeviceManagerApi().checkConnectedWatchDevice(HMSelectWatchActivityNew.this, i)) {
                    HMSelectWatchActivityNew.this.finish();
                    return;
                } else {
                    BindWatchUtils.INSTANCE.requestForNeededPermission(HMSelectWatchActivityNew.this, new BindWatchUtils.IUserAction() { // from class: com.xiaomi.hm.health.device.amazfit_watch.b
                        @Override // com.xiaomi.hm.health.device.amazfit_watch.BindWatchUtils.IUserAction
                        public final void onUserAllow(boolean z) {
                            this.a.e(i, z);
                        }
                    });
                    return;
                }
            }
            if (i == 7 || i == 27) {
                if (!((DeviceXNavigator) HMSelectWatchActivityNew.this.z.getValue()).testPhoneEnv(HMSelectWatchActivityNew.this, true, i) || ManagerFunctionsKt.getDeviceManagerApi().checkConnectedWatchDevice(HMSelectWatchActivityNew.this, i)) {
                    HMSelectWatchActivityNew.this.finish();
                    return;
                } else {
                    BindWatchUtils.INSTANCE.requestForNeededPermission(HMSelectWatchActivityNew.this, new BindWatchUtils.IUserAction() { // from class: com.xiaomi.hm.health.device.amazfit_watch.c
                        @Override // com.xiaomi.hm.health.device.amazfit_watch.BindWatchUtils.IUserAction
                        public final void onUserAllow(boolean z) {
                            this.a.f(i, z);
                        }
                    });
                    return;
                }
            }
            if (HMSelectWatchActivityNew.this.w(i)) {
                if (((DeviceXNavigator) HMSelectWatchActivityNew.this.z.getValue()).testPhoneEnv(HMSelectWatchActivityNew.this, true, i) && !ManagerFunctionsKt.getDeviceManagerApi().checkConnectedWatchDevice(HMSelectWatchActivityNew.this, i)) {
                    ((DeviceXNavigator) HMSelectWatchActivityNew.this.z.getValue()).startBindWatch(HMSelectWatchActivityNew.this, null, i);
                }
                HMSelectWatchActivityNew.this.finish();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull b bVar, int i) {
            SupportWatchItem supportWatchItem = this.a.get(i);
            bVar.c.setText(supportWatchItem.getName());
            final int bindType = supportWatchItem.getBindType();
            if (supportWatchItem.getImgUrl() != null) {
                HMImageLoader.with(this.b).load(supportWatchItem.getImgUrl()).into(bVar.b);
            } else if (supportWatchItem.getResId() != null && supportWatchItem.getResId().intValue() != 0) {
                bVar.b.setImageResource(supportWatchItem.getResId().intValue());
            }
            bVar.a.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.amazfit_watch.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.g(bindType, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new b(LayoutInflater.from(this.b).inflate(R.layout.layout_select_watch_item, viewGroup, false));
        }

        public void setNewData(List<SupportWatchItem> list) {
            this.a = list;
        }
    }

    public static class b extends RecyclerView.ViewHolder {
        public View a;
        public ImageView b;
        public TextView c;
        public View d;

        public b(View view) {
            super(view);
            this.a = view;
            this.b = (ImageView) view.findViewById(R.id.watch_img);
            this.c = (TextView) view.findViewById(R.id.watch_tv);
            this.d = view.findViewById(R.id.divider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A(Throwable th) throws Exception {
        HMLog.warn(A, th, new Function0() { // from class: cf3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMSelectWatchActivityNew.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(int i, DialogInterface dialogInterface, int i2) {
        D(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
    }

    @SuppressLint({"CheckResult"})
    private void D(final int i) {
        new RxPermissions(this).request(Build.VERSION.SDK_INT > 30 ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"}).subscribe(new Consumer() { // from class: af3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.y(i, (Boolean) obj);
            }
        }, new Consumer() { // from class: bf3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                HMSelectWatchActivityNew.A((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w(int i) {
        if (!this.y.getValue().checkPermission(this, "android.permission.ACCESS_FINE_LOCATION")) {
            showBeforeMsgLocationPermissionDialog(i);
            return false;
        }
        if (Build.VERSION.SDK_INT < 23 || this.y.getValue().isLocationServerOpen(this)) {
            return true;
        }
        this.y.getValue().showGotoLocationServerDialog(this);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(RecyclerView recyclerView, List list) {
        a aVar = new a(this);
        aVar.setNewData(list);
        recyclerView.setAdapter(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(int i, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            this.y.getValue().showPermissionDenieDialog(this, getString(R.string.open_loaction_msg));
            return;
        }
        HMLog.d(A, "get ACCESS_FINE_LOCATION permission~", new Object[0]);
        if (Build.VERSION.SDK_INT >= 23 && !this.y.getValue().isLocationServerOpen(this)) {
            this.y.getValue().showGotoLocationServerDialog(this);
            return;
        }
        if (this.z.getValue().testPhoneEnv(this, true, i) && !ManagerFunctionsKt.getDeviceManagerApi().checkConnectedWatchDevice(this, i)) {
            this.z.getValue().startBindWatch(this, null, i);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z() {
        return "";
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_select_watch);
        BaseTitleBarExtKt.setTitleBar(this, getString(R.string.select_watch_title), null, R.color.s10, BaseTitleActivity.STYLE.SINGLE_TITLE);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.watch_rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        findViewById(R.id.cancel_tv).setOnClickListener(new View.OnClickListener() { // from class: ye3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        SupportWatchViewModel supportWatchViewModel = (SupportWatchViewModel) new ViewModelProvider(this).get(SupportWatchViewModel.class);
        this.x = supportWatchViewModel;
        supportWatchViewModel.getSupportItems().observe(this, new Observer() { // from class: ze3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.x(recyclerView, (List) obj);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
    }

    public void showBeforeMsgLocationPermissionDialog(final int i) {
        new AlertDialogFragment.Builder(this).setTitle("").setMessage(R.string.open_loaction_per_msg).setNeutralButton(R.string.running_tip_known, new DialogInterface.OnClickListener() { // from class: xe3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.B(i, dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }
}
