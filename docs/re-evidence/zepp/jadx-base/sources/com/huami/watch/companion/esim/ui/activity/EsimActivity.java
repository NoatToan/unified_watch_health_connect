package com.huami.watch.companion.esim.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.android.design.dialog.loading.LoadingView;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.midong.webview.event.JsDownloadESIMEvent;
import com.huami.midong.webview.event.JsShowDeviceXCodeEvent;
import com.huami.midong.webview.ui.JsBridgeActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.companion.esim.ESimCallback;
import com.huami.watch.companion.esim.ESimUrl;
import com.huami.watch.companion.esim.ESimUrlHelper;
import com.huami.watch.companion.esim.Error;
import com.huami.watch.companion.esim.EsimOperationHelper;
import com.huami.watch.companion.esim.EsimOperationHelperFactory;
import com.huami.watch.companion.esim.IESimDeviceManager;
import com.huami.watch.companion.esim.OperationCallBack;
import com.huami.watch.companion.esim.R;
import com.huami.watch.companion.esim.SimResult;
import com.huami.watch.companion.esim.arch.EsimProfileViewModel;
import com.huami.watch.companion.esim.model.SimpleProfileInfo;
import com.huami.watch.companion.esim.ui.activity.EsimActivity;
import com.huami.watch.companion.esim.ui.adapter.ProfilesAdapter;
import com.huami.watch.companion.esim.ui.dialog.EnterPinCodeDialog;
import com.huami.watch.companion.esim.utils.ClickProxy;
import com.huami.watch.qr.QRUtil;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Rx;
import com.huami.watch.util.RxBus;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class EsimActivity extends AppCompatActivity {
    private static final String s = "ESimActivity";
    private static final int t = 1;
    private static final int u = 3;
    private LoadingDialog c;
    private EnterPinCodeDialog d;
    private RecyclerView e;
    private ProfilesAdapter f;
    private TextView g;
    private TextView h;
    private View i;
    private View j;
    private String l;
    private EsimProfileViewModel m;
    private ESimUrl p;
    private Disposable q;
    private Disposable r;
    private int a = 0;
    private int b = 0;
    private boolean k = false;
    private boolean n = false;
    private boolean o = true;

    public class a implements OperationCallBack {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(String str, String str2) {
            return "handlerOpenResult failure:" + str + ":" + str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(String str) {
            return "handlerOpenResult success:" + str;
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onFailure(@NotNull final String str, @NotNull final String str2) {
            HMLog.info(EsimActivity.s, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EsimActivity.a.c(str, str2);
                }
            });
            if (AbsEsimOperation.TYPE_DOWNLOAD_STATUS.equals(str)) {
                EsimActivity.this.t1();
            }
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onSuccess(@NotNull final String str) {
            HMLog.info(EsimActivity.s, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EsimActivity.a.d(str);
                }
            });
            if (AbsEsimOperation.TYPE_DOWNLOAD_STATUS.equals(str)) {
                EsimActivity.this.n0(false, false, true);
            }
        }
    }

    public class b implements EnterPinCodeDialog.SelectListener {
        public b() {
        }

        @Override // com.huami.watch.companion.esim.ui.dialog.EnterPinCodeDialog.SelectListener
        public void onCancel() {
            HMLog.i(EsimActivity.s, "cancel input pin code", new Object[0]);
        }

        @Override // com.huami.watch.companion.esim.ui.dialog.EnterPinCodeDialog.SelectListener
        public void onConfirm(@NotNull String str) {
            EsimActivity.this.u1(true);
            HMLog.i(EsimActivity.s, "input pin code: " + str, new Object[0]);
            EsimActivity esimActivity = EsimActivity.this;
            esimActivity.m0(esimActivity.l, str);
        }
    }

    public class c implements OperationCallBack {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        public c(String str, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String g() {
            return "switch profile state failure and retry:" + EsimActivity.this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(String str, boolean z, boolean z2, boolean z3) {
            EsimActivity.this.z1(str, z, z2, z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String i(String str) {
            return "switch profile state failure:" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(boolean z) {
            EsimActivity.this.u1(false);
            EsimActivity.this.k0();
            EsimActivity.this.y1(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String k() {
            return "switch profile state success";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str, boolean z) {
            EsimActivity.this.m.setEnable(str, z);
            EsimActivity.this.u1(false);
            EsimActivity.this.k0();
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onFailure(@NotNull String str, @NotNull final String str2) {
            if (AbsEsimOperation.TYPE_SWITCH_PROFILE_STATE.equals(str)) {
                HMLog.info(EsimActivity.s, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.g();
                    }
                });
                EsimActivity.this.b++;
                if (EsimActivity.this.b > 3) {
                    HMLog.info(EsimActivity.s, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EsimActivity.c.i(str2);
                        }
                    });
                    EsimActivity.this.b = 0;
                    final boolean z = this.c;
                    Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.j(z);
                        }
                    });
                    return;
                }
                final String str3 = this.a;
                final boolean z2 = this.b;
                final boolean z3 = this.c;
                final boolean z4 = this.d;
                Rx.delayIo(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h(str3, z2, z3, z4);
                    }
                }, 4L, TimeUnit.SECONDS);
            }
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onSuccess(@NotNull String str) {
            if (AbsEsimOperation.TYPE_SWITCH_PROFILE_STATE.equals(str)) {
                EsimActivity.this.b = 0;
                HMLog.info(EsimActivity.s, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EsimActivity.c.k();
                    }
                });
                final String str2 = this.a;
                final boolean z = this.b;
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(str2, z);
                    }
                });
            }
        }
    }

    public class d implements EnterPinCodeDialog.SelectListener {
        public d() {
        }

        @Override // com.huami.watch.companion.esim.ui.dialog.EnterPinCodeDialog.SelectListener
        public void onCancel() {
            EsimActivity.this.h0();
        }

        @Override // com.huami.watch.companion.esim.ui.dialog.EnterPinCodeDialog.SelectListener
        public void onConfirm(@NotNull String str) {
            EsimActivity.this.j0(str);
        }
    }

    public class e implements EnterPinCodeDialog.SelectListener {
        public e() {
        }

        @Override // com.huami.watch.companion.esim.ui.dialog.EnterPinCodeDialog.SelectListener
        public void onCancel() {
            HMLog.i(EsimActivity.s, "cancel input pin code", new Object[0]);
        }

        @Override // com.huami.watch.companion.esim.ui.dialog.EnterPinCodeDialog.SelectListener
        public void onConfirm(@NotNull String str) {
            EsimActivity.this.u1(true);
            HMLog.i(EsimActivity.s, "input pin code: " + str, new Object[0]);
            EsimActivity esimActivity = EsimActivity.this;
            esimActivity.m0(esimActivity.l, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(final Integer num) throws Exception {
        k0();
        if (num.intValue() == -1) {
            t1();
            return;
        }
        if (num.intValue() == 1) {
            s1(new b());
        } else {
            p1();
        }
        HMLog.info(s, new Function0() { // from class: cq1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.z0(num);
            }
        });
    }

    private void A1(int i) {
        if (i == 0) {
            this.g.setText(R.string.esim_add_account);
        } else {
            this.g.setText(R.string.esim_add_new_account);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(String str, ObservableEmitter observableEmitter) throws Exception {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        absEsimOperationCreateOperationHelper.continueDownloadProfile(str, true);
        SimResult result = absEsimOperationCreateOperationHelper.getResult();
        HMLog.i(s, "continueDownloadProfile qr esim return: " + result, new Object[0]);
        if (result == null) {
            result = new SimResult();
        }
        observableEmitter.onNext(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(SimResult simResult) throws Exception {
        if (simResult.getState() == 0) {
            n0(false, false, true);
        } else {
            k0();
            r1(simResult.getInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D0(String str) {
        return "downloadESIMProfile activationCode :" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E0(int i) {
        return "downloadESIMProfile state :" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(String str) {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        absEsimOperationCreateOperationHelper.startDownloadProfile(str, EsimOperationHelper.CARRIER_LIANTONG_GZH, true);
        final int state = absEsimOperationCreateOperationHelper.getResult() != null ? absEsimOperationCreateOperationHelper.getResult().getState() : 1;
        HMLog.info(s, new Function0() { // from class: wp1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.E0(state);
            }
        });
        if (state == 0) {
            open(getApplicationContext(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G0(String str, String str2) {
        return "downloadQrEsim activationCode :" + str + " and pincode is: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(String str, String str2, ObservableEmitter observableEmitter) throws Exception {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        if (str != null) {
            absEsimOperationCreateOperationHelper.startDownloadProfile(str2, EsimOperationHelper.CARRIER_QR, str, true);
        } else {
            absEsimOperationCreateOperationHelper.startDownloadProfile(str2, EsimOperationHelper.CARRIER_QR, true);
        }
        SimResult result = absEsimOperationCreateOperationHelper.getResult();
        HMLog.i(s, "download qr esim return: " + result, new Object[0]);
        if (result == null) {
            result = new SimResult();
        }
        observableEmitter.onNext(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(SimResult simResult) throws Exception {
        String type = simResult.getType();
        if (type != null && type.contains(AbsEsimOperation.TYPE_ESIM_CC)) {
            s1(new d());
        } else if (simResult.getState() == 0) {
            n0(false, false, true);
        } else {
            k0();
            r1(simResult.getInfo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J0(boolean z, boolean z2) {
        return "getProfileList: needSync=" + z + ", needAutoEnable=" + z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(boolean z, ObservableEmitter observableEmitter) throws Exception {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        absEsimOperationCreateOperationHelper.getProfileList(z);
        SimResult result = absEsimOperationCreateOperationHelper.getResult();
        String info = null;
        if (result != null) {
            if (AbsEsimOperation.TYPE_DOWNLOAD_STATUS.equals(result.getType())) {
                absEsimOperationCreateOperationHelper.getProfileList(z);
                result = absEsimOperationCreateOperationHelper.getResult();
            }
            if (result != null) {
                info = result.getInfo();
            }
        }
        HMLog.i(s, "getProfileList:" + result, new Object[0]);
        if (result == null || result.getState() != 0) {
            observableEmitter.onError(new Throwable());
            return;
        }
        if (info == null) {
            info = "";
        }
        observableEmitter.onNext(info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(boolean z, String str) throws Exception {
        this.a = 0;
        this.m.setProfileData(str);
        if (!z) {
            k0();
            u1(false);
            return;
        }
        List<SimpleProfileInfo> value = this.m.getProfileList().getValue();
        if (value != null) {
            int size = value.size();
            if (size == 1) {
                z1(value.get(0).getIccid(), true, false, true);
            } else if (size > 1) {
                z1(value.get(size - 1).getIccid(), true, true, true);
            } else {
                k0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String M0() {
        return "getProfileList failure and retry:" + this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(boolean z) {
        n0(false, false, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(final boolean z, Throwable th) throws Exception {
        this.a++;
        HMLog.info(s, new Function0() { // from class: zp1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.M0();
            }
        });
        if (this.a < 3) {
            Rx.delayIo(new Runnable() { // from class: up1
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.N0(z);
                }
            }, this.a, TimeUnit.SECONDS);
            return;
        }
        this.a = 0;
        k0();
        v1(getString(R.string.esim_get_list_failure));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(ObservableEmitter observableEmitter) throws Exception {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        absEsimOperationCreateOperationHelper.requestSimInfo();
        String info = absEsimOperationCreateOperationHelper.getResult() != null ? absEsimOperationCreateOperationHelper.getResult().getInfo() : "";
        if (TextUtils.isEmpty(info)) {
            info = "eid is empty";
        }
        observableEmitter.onNext(info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q0(String str) {
        return "sim info :" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(final String str) throws Exception {
        HMLog.info(s, new Function0() { // from class: eq1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.Q0(str);
            }
        });
        this.h.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S0(SimResult simResult) {
        return "handlerOpenResult result:" + simResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String T0() {
        return "mAutoEnable is " + this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0() {
        this.p = ESimUrlHelper.INSTANCE.getEsimUrl(getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(Object obj) throws Exception {
        if (obj instanceof JsShowDeviceXCodeEvent) {
            w1();
        } else if (obj instanceof JsDownloadESIMEvent) {
            l0(((JsDownloadESIMEvent) obj).getUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X0(Throwable th) throws Exception {
        HMLog.warn(s, th, new Function0() { // from class: iq1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.W0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        SimpleProfileInfo item = this.f.getItem(i);
        if (item == null || !this.o) {
            return;
        }
        EsimOperationActivity.open(this, item.getIccid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(View view) {
        if (this.k) {
            QRUtil.startScan(this);
        } else {
            EsimCategoryActivity.open(this, this.p, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(View view) {
        if (this.p != null) {
            ESimCallback.Companion companion = ESimCallback.INSTANCE;
            if (companion.getEsimDeviceManager() != null) {
                JsBridgeActivity.load(this, this.p.getFaqUrl() + companion.getEsimDeviceManager().getMetaValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c1(View view) {
        o0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d1(View view) {
        w1();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e1(List list) {
        this.f.setNewData(list);
        A1(ArraysUtil.isEmpty(list) ? 0 : list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(Boolean bool) {
        if (bool.booleanValue()) {
            m1();
        } else {
            n1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String g1() {
        return "qr result:" + this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        HMLog.i(s, "cancel download profile", new Object[0]);
        Rx.io(new ObservableOnSubscribe() { // from class: dp1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.v0(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: lp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.w0((SimResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(DialogInterface dialogInterface, int i) {
        u1(true);
        m0(this.l, null);
    }

    private void i0() {
        HMLog.info(s, new Function0() { // from class: yp1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.x0();
            }
        });
        showLoadingDialog();
        Rx.io(new ObservableOnSubscribe() { // from class: cp1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.y0(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: mp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.A0((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(DialogInterface dialogInterface, int i) {
        u1(false);
    }

    private void initView() {
        ((RainbowTitleBar) findViewById(R.id.actionbar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: mq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.Y0(view);
            }
        });
        this.i = findViewById(R.id.error_text);
        this.j = findViewById(R.id.opening_area);
        this.h = (TextView) findViewById(R.id.introduction);
        this.g = (TextView) findViewById(R.id.add);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.item_divider, null);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        this.e.addItemDecoration(dividerItemDecoration);
        ProfilesAdapter profilesAdapter = new ProfilesAdapter();
        this.f = profilesAdapter;
        this.e.setAdapter(profilesAdapter);
        this.f.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: bp1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.Z0(baseQuickAdapter, view, i);
            }
        });
        this.g.setOnClickListener(new ClickProxy(new View.OnClickListener() { // from class: kq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a1(view);
            }
        }));
        View viewFindViewById = findViewById(R.id.esim_tips);
        if (this.k) {
            viewFindViewById.setVisibility(4);
        } else {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: lq1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b1(view);
                }
            });
        }
        if (GlobalConfig.get().isBuildInner()) {
            this.g.setOnLongClickListener(new View.OnLongClickListener() { // from class: oq1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.a.c1(view);
                }
            });
            viewFindViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: nq1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.a.d1(view);
                }
            });
        }
        LoadingView loadingView = (LoadingView) findViewById(R.id.progress_bar);
        loadingView.setCycleColor(ContextCompat.getColor(this, R.color.s2));
        loadingView.setStrokeWidth(TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        loadingView.startLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(final String str) {
        HMLog.i(s, "continue download profile", new Object[0]);
        Rx.io(new ObservableOnSubscribe() { // from class: fp1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.B0(str, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: jp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.C0((SimResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j1(DialogInterface dialogInterface, int i) {
        u1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0() {
        LoadingDialog loadingDialog = this.c;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.c.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k1() {
        return "showQr";
    }

    private void l0(final String str) {
        Toast.makeText(this, R.string.esim_downloading_tips, 1).show();
        HMLog.info(s, new Function0() { // from class: dq1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.D0(str);
            }
        });
        Rx.io(new Runnable() { // from class: tp1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F0(str);
            }
        }).subscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l1(DialogInterface dialogInterface, int i) {
        u1(false);
        s1(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(final String str, final String str2) {
        showLoadingDialog();
        HMLog.info(s, new Function0() { // from class: fq1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.G0(str, str2);
            }
        });
        Rx.io(new ObservableOnSubscribe() { // from class: gp1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.H0(str2, str, observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: ip1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.I0((SimResult) obj);
            }
        });
    }

    private void m1() {
        this.i.setVisibility(8);
        this.g.setEnabled(true);
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(boolean z, final boolean z2, final boolean z3) {
        HMLog.info(s, new Function0() { // from class: hq1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.J0(z2, z3);
            }
        });
        if (z) {
            showLoadingDialog();
        }
        o1(this.r);
        this.r = Observable.create(new ObservableOnSubscribe() { // from class: hp1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.K0(z2, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: pp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.L0(z3, (String) obj);
            }
        }, new Consumer() { // from class: qp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.O0(z3, (Throwable) obj);
            }
        });
    }

    private void n1() {
        k0();
        this.i.setVisibility(0);
        this.g.setEnabled(false);
        this.o = false;
    }

    private void o0() {
        Rx.io(new ObservableOnSubscribe() { // from class: ep1
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.P0(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: np1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.R0((String) obj);
            }
        });
    }

    private void o1(Disposable disposable) {
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
    }

    public static void open(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) EsimActivity.class);
        intent.setFlags(268435456);
        intent.putExtra(AbsEsimOperation.KEY_AUTO_ENABLE, z);
        context.startActivity(intent);
    }

    private void p0() {
        u1(true);
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        final SimResult result = absEsimOperationCreateOperationHelper.getResult();
        if (result == null || !result.finish || !AbsEsimOperation.TYPE_DOWNLOAD_STATUS.equals(result.getType())) {
            absEsimOperationCreateOperationHelper.setOperationCallback(new a());
            return;
        }
        HMLog.info(s, new Function0() { // from class: xp1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.S0(result);
            }
        });
        if (result.getState() == 0) {
            n0(false, false, true);
        } else {
            t1();
        }
    }

    private void p1() {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_open_confirm_title)).setMessage(getString(R.string.esim_open_confirm_message)).setNegativeButton(getString(R.string.btn_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.esim_open_confirm_ok), new DialogInterface.OnClickListener() { // from class: kp1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.h1(dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "confirm_dialog");
    }

    private void q0(Intent intent) {
        if (intent != null) {
            this.n = intent.getBooleanExtra(AbsEsimOperation.KEY_AUTO_ENABLE, false);
            HMLog.info(s, new Function0() { // from class: aq1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.T0();
                }
            });
        }
        t0();
        if (this.p == null) {
            r0();
        }
    }

    private void q1(String str, String str2) {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_open_failure)).setMessage(getString(R.string.error_code) + str + com.alipay.sdk.m.s.a.l + str2).setNeutralButton(getString(R.string.btn_known), new DialogInterface.OnClickListener() { // from class: zo1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.i1(dialogInterface, i);
            }
        }).setCancelable(false).show(getSupportFragmentManager(), "error_code");
    }

    private void r0() {
        Rx.io(new Runnable() { // from class: sp1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U0();
            }
        }).subscribe();
    }

    private void r1(String str) {
        boolean zIsConnected = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this).isConnected(this);
        boolean zIsNetworkConnected = NetUtil.isNetworkConnected(this);
        if (!zIsConnected || !zIsNetworkConnected || str == null) {
            HMLog.i(s, "showDownloadErrorDialog devConnected: " + zIsConnected + "; netConnected: " + zIsNetworkConnected + "; errorJson: " + str, new Object[0]);
            t1();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(AbsEsimOperation.KEY_SUBJECT_CODE);
            String strOptString2 = jSONObject.optString("errorCode");
            if (strOptString.isEmpty() && strOptString2.isEmpty()) {
                t1();
            } else if (Error.getErrorType(strOptString, strOptString2) == 1) {
                x1();
            } else {
                q1(strOptString, strOptString2);
            }
        } catch (Exception unused) {
            HMLog.i(s, "showDownloadErrorDialog parse failed", new Object[0]);
            t1();
        }
    }

    private void s0() {
        this.q = RxBus.get().toObservable().subscribe(new Consumer() { // from class: op1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.V0(obj);
            }
        }, new Consumer() { // from class: rp1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                EsimActivity.X0((Throwable) obj);
            }
        });
    }

    private void s1(EnterPinCodeDialog.SelectListener selectListener) {
        if (this.d == null) {
            this.d = new EnterPinCodeDialog(this);
        }
        this.d.show(selectListener);
    }

    private void showLoadingDialog() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.esim_loading));
        this.c = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    private void t0() {
        IESimDeviceManager esimDeviceManager;
        boolean zIsBuildAmazfit = GlobalConfig.get().isBuildAmazfit();
        this.k = zIsBuildAmazfit;
        if (zIsBuildAmazfit || (esimDeviceManager = ESimCallback.INSTANCE.getEsimDeviceManager()) == null) {
            return;
        }
        if (esimDeviceManager.getBoundMajorDeviceType() == HMDeviceType.WATCH) {
            Device currentDevice = DeviceManager.getManager(getApplicationContext()).getCurrentDevice();
            if (currentDevice != null) {
                this.k = DeviceSource.isModelXihuEA(currentDevice);
                return;
            }
            return;
        }
        DeviceInfo deviceInfo = esimDeviceManager.getBoundMajorDevice().getDeviceInfo();
        if (deviceInfo != null && deviceInfo.getDeviceSource() == HMDeviceSource.MILI_VOLGA_W) {
            this.k = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1() {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_open_failure)).setMessage(getString(R.string.esim_open_retry)).setNeutralButton(getString(R.string.btn_known), new DialogInterface.OnClickListener() { // from class: vp1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.j1(dialogInterface, i);
            }
        }).setCancelable(false).show(getSupportFragmentManager(), "open_failure");
    }

    private void u0() {
        EsimProfileViewModel esimProfileViewModel = (EsimProfileViewModel) new ViewModelProvider(this).get(EsimProfileViewModel.class);
        this.m = esimProfileViewModel;
        esimProfileViewModel.getProfileList().observe(this, new Observer() { // from class: ap1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.e1((List) obj);
            }
        });
        this.m.getConnectStateLiveData().observe(this, new Observer() { // from class: pq1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.f1((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u1(boolean z) {
        if (z) {
            this.j.setVisibility(0);
            this.e.setVisibility(8);
            this.g.setVisibility(8);
        } else {
            this.j.setVisibility(8);
            this.e.setVisibility(0);
            this.g.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(ObservableEmitter observableEmitter) throws Exception {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        absEsimOperationCreateOperationHelper.cancelDownloadProfile(true);
        SimResult result = absEsimOperationCreateOperationHelper.getResult();
        HMLog.i(s, "cancelDownloadProfile qr esim return: " + result, new Object[0]);
        if (result == null) {
            result = new SimResult();
        }
        observableEmitter.onNext(result);
    }

    private void v1(String str) {
        new AlertDialogFragment.Builder(this).setTitle(str).setMessage(getString(R.string.esim_check_connect_tips)).setNeutralButton(getString(R.string.btn_known), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager(), "open_failure");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(SimResult simResult) throws Exception {
        k0();
        r1(simResult.getInfo());
    }

    private void w1() {
        HMLog.info(s, new Function0() { // from class: jq1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EsimActivity.k1();
            }
        });
        EsimOperationHelperFactory.INSTANCE.createOperationHelper(this).showQr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String x0() {
        return "checkNeedInput pinCode: " + this.l;
    }

    private void x1() {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_open_failure)).setMessage(getString(R.string.input_pin_error)).setNeutralButton(getString(R.string.btn_known), new DialogInterface.OnClickListener() { // from class: gq1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.l1(dialogInterface, i);
            }
        }).setCancelable(false).show(getSupportFragmentManager(), "re_input_pin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(ObservableEmitter observableEmitter) throws Exception {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        Boolean boolSupportEPin = absEsimOperationCreateOperationHelper.supportEPin();
        if (boolSupportEPin == null) {
            observableEmitter.onNext(-1);
            return;
        }
        if (!boolSupportEPin.booleanValue()) {
            observableEmitter.onNext(0);
            return;
        }
        absEsimOperationCreateOperationHelper.needInputPinCode(this.l, true);
        String info = absEsimOperationCreateOperationHelper.getResult() != null ? absEsimOperationCreateOperationHelper.getResult().getInfo() : "";
        HMLog.i(s, "checkNeedInputPinCode info: " + info, new Object[0]);
        if (TextUtils.isEmpty(info)) {
            observableEmitter.onNext(-1);
        } else {
            observableEmitter.onNext(Integer.valueOf(new JSONObject(info).optInt(AbsEsimOperation.KEY_CAPBILITY, -1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1(boolean z) {
        int i = R.string.esim_switch_state_failure;
        if (z) {
            i = R.string.esim_switch_account_failure;
        }
        new AlertDialogFragment.Builder(this).setTitle(getString(i)).setMessage(getString(R.string.esim_switch_retry)).setNeutralButton(getString(R.string.btn_known), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager(), "switch_state_failure");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z0(Integer num) {
        return "result is : " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1(String str, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            showLoadingDialog();
        }
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        absEsimOperationCreateOperationHelper.setOperationCallback(new c(str, z, z2, z3));
        absEsimOperationCreateOperationHelper.switchProfileState(str, z);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i == 1) {
                p0();
            } else {
                if (QRUtil.REQUEST_QR != i || intent == null) {
                    return;
                }
                this.l = intent.getStringExtra("SCAN_RESULT");
                HMLog.info(s, new Function0() { // from class: bq1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a.g1();
                    }
                });
                i0();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_esim);
        q0(getIntent());
        initView();
        s0();
        u0();
        boolean z = this.n;
        n0(!z, !z, z);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        HMLog.i(s, "exit esim Activity", new Object[0]);
        EsimOperationHelperFactory.INSTANCE.createOperationHelper(this).stop();
        o1(this.q);
        o1(this.r);
        this.m.clearData();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        q0(intent);
        if (this.n) {
            u1(true);
        }
        boolean z = this.n;
        n0(!z, false, z);
    }
}
