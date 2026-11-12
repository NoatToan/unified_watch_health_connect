package com.huami.watch.companion.esim.ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.rainbow.widget.SwitchCompat;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.companion.esim.EsimOperationHelperFactory;
import com.huami.watch.companion.esim.OperationCallBack;
import com.huami.watch.companion.esim.R;
import com.huami.watch.companion.esim.arch.EsimProfileViewModel;
import com.huami.watch.companion.esim.model.SimpleProfileInfo;
import com.huami.watch.companion.esim.ui.activity.EsimOperationActivity;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Rx;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class EsimOperationActivity extends AppCompatActivity {
    private static final String l = "ESimOperationActivity";
    private static final int m = 20;
    private View a;
    private TextView b;
    private View c;
    private SwitchCompat d;
    private EditText e;
    private TextView f;
    private TextView g;
    private boolean h = false;
    private LoadingDialog i;
    private String j;
    private EsimProfileViewModel k;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EsimOperationActivity.this.g.setEnabled(editable.toString().length() <= 20);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements OperationCallBack {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(String str) {
            return "switch profile state failure:" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            EsimOperationActivity.this.C();
            EsimOperationActivity.this.D();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g() {
            return "switch profile state success";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(String str) {
            EsimOperationActivity.this.k.setEnable(str, true);
            EsimOperationActivity.this.C();
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onFailure(@NotNull String str, @NotNull final String str2) {
            if (AbsEsimOperation.TYPE_SWITCH_PROFILE_STATE.equals(str)) {
                HMLog.info(EsimOperationActivity.l, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.k
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return EsimOperationActivity.b.e(str2);
                    }
                });
                EsimOperationActivity.this.k.setEnable(this.a, false);
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.f();
                    }
                });
            }
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onSuccess(@NotNull String str) {
            if (AbsEsimOperation.TYPE_SWITCH_PROFILE_STATE.equals(str)) {
                HMLog.info(EsimOperationActivity.l, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.l
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return EsimOperationActivity.b.g();
                    }
                });
                final String str2 = this.a;
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h(str2);
                    }
                });
            }
        }
    }

    public class c implements OperationCallBack {
        public final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(String str) {
            return "disable profile failure:" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            EsimOperationActivity.this.C();
            EsimOperationActivity.this.b0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g() {
            return "disable profile  success";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(boolean z) {
            EsimOperationActivity.this.k.setEnable(EsimOperationActivity.this.j, false);
            EsimOperationActivity.this.C();
            if (z) {
                EsimOperationActivity esimOperationActivity = EsimOperationActivity.this;
                esimOperationActivity.Z(esimOperationActivity.j);
            }
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onFailure(@NotNull String str, @NotNull final String str2) {
            if (AbsEsimOperation.TYPE_SWITCH_PROFILE_STATE.equals(str)) {
                EsimOperationActivity.this.k.setEnable(EsimOperationActivity.this.j, true);
                HMLog.info(EsimOperationActivity.l, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.o
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return EsimOperationActivity.c.e(str2);
                    }
                });
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.f();
                    }
                });
            }
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onSuccess(@NotNull String str) {
            if (AbsEsimOperation.TYPE_SWITCH_PROFILE_STATE.equals(str)) {
                HMLog.info(EsimOperationActivity.l, new Function0() { // from class: com.huami.watch.companion.esim.ui.activity.p
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return EsimOperationActivity.c.g();
                    }
                });
                final boolean z = this.a;
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h(z);
                    }
                });
            }
        }
    }

    public class d implements OperationCallBack {
        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            EsimOperationActivity.this.C();
            Toast.makeText(EsimOperationActivity.this, R.string.esim_delete_failure, 0).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            EsimOperationActivity.this.C();
            Toast.makeText(EsimOperationActivity.this, R.string.esim_delete_success, 0).show();
            EsimOperationActivity.this.k.deleteProfile(EsimOperationActivity.this.j);
            EsimOperationActivity.this.finish();
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onFailure(@NotNull String str, @NotNull String str2) {
            if ("delete".equals(str)) {
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onSuccess(@NotNull String str) {
            if ("delete".equals(str)) {
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            }
        }
    }

    public class e implements OperationCallBack {
        public final /* synthetic */ String a;

        public e(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            EsimOperationActivity.this.C();
            Toast.makeText(EsimOperationActivity.this, R.string.esim_rename_failure, 0).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(String str) {
            EsimOperationActivity.this.C();
            EsimOperationActivity.this.h = false;
            EsimOperationActivity.this.k.setName(EsimOperationActivity.this.j, str);
            Toast.makeText(EsimOperationActivity.this, R.string.esim_rename_success, 0).show();
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onFailure(@NotNull String str, @NotNull String str2) {
            if (AbsEsimOperation.TYPE_SET_NAME.equals(str)) {
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                });
            }
        }

        @Override // com.huami.watch.companion.esim.OperationCallBack
        public void onSuccess(@NotNull String str) {
            if (AbsEsimOperation.TYPE_SET_NAME.equals(str)) {
                final String str2 = this.a;
                Rx.mainThread(new Runnable() { // from class: com.huami.watch.companion.esim.ui.activity.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d(str2);
                    }
                });
            }
        }
    }

    private void A(String str) {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        if (!absEsimOperationCreateOperationHelper.isConnected(this)) {
            d0();
            return;
        }
        showLoadingDialog();
        absEsimOperationCreateOperationHelper.setOperationCallback(new d());
        absEsimOperationCreateOperationHelper.deleteProfile(str);
    }

    private void B(boolean z) {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        if (!absEsimOperationCreateOperationHelper.isConnected(this)) {
            d0();
            return;
        }
        showLoadingDialog();
        absEsimOperationCreateOperationHelper.setOperationCallback(new c(z));
        absEsimOperationCreateOperationHelper.switchProfileState(this.j, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        LoadingDialog loadingDialog = this.i;
        if (loadingDialog == null || !loadingDialog.isShowing()) {
            return;
        }
        this.i.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_switch_state_failure)).setMessage(getString(R.string.esim_switch_retry)).setNeutralButton(getString(R.string.btn_known), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager(), "switch_state_failure");
    }

    private void E(String str) {
        AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        if (!absEsimOperationCreateOperationHelper.isConnected(this)) {
            d0();
            return;
        }
        showLoadingDialog();
        absEsimOperationCreateOperationHelper.setOperationCallback(new b(str));
        absEsimOperationCreateOperationHelper.switchProfileState(this.j, true);
    }

    private SimpleProfileInfo F() {
        return this.k.getProfile(this.j);
    }

    private void G() {
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            this.j = intent.getExtras().getString("info", "");
        }
        EsimProfileViewModel esimProfileViewModel = (EsimProfileViewModel) new ViewModelProvider(this).get(EsimProfileViewModel.class);
        this.k = esimProfileViewModel;
        esimProfileViewModel.getProfileMap().observe(this, new Observer() { // from class: br1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.L((Map) obj);
            }
        });
        this.k.getConnectStateLiveData().observe(this, new Observer() { // from class: ar1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.N((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(View view) {
        this.h = true;
        e0(F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        if (!this.d.isChecked()) {
            SimpleProfileInfo simpleProfileInfoF = F();
            if (simpleProfileInfoF != null) {
                a0(simpleProfileInfoF.getName(this), false);
                return;
            }
            return;
        }
        String enableId = this.k.getEnableId();
        if (enableId == null || TextUtils.isEmpty(enableId) || enableId.equals(this.j)) {
            E(this.j);
        } else {
            c0(enableId, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Map map) {
        e0(F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String M(Boolean bool) {
        return "connect status change：" + bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(final Boolean bool) {
        HMLog.info(l, new Function0() { // from class: dr1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return EsimOperationActivity.M(bool);
            }
        });
        if (bool.booleanValue()) {
            W();
        } else {
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O(String str, String str2) {
        return "setProfileName:" + str + "," + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(String str, DialogInterface dialogInterface, int i) {
        A(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(boolean z, DialogInterface dialogInterface, int i) {
        B(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(DialogInterface dialogInterface, int i) {
        this.d.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(DialogInterface dialogInterface, int i) {
        this.d.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(String str, DialogInterface dialogInterface, int i) {
        E(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(View view) {
        Y(this.j, this.e.getText().toString());
    }

    private void W() {
        this.d.setEnabled(true);
        this.c.setEnabled(true);
        this.e.setEnabled(true);
    }

    private void X() {
        LoadingDialog loadingDialog = this.i;
        if (loadingDialog != null && loadingDialog.isShowing()) {
            C();
            d0();
        }
        this.d.setEnabled(false);
        this.c.setEnabled(false);
        this.e.setEnabled(false);
    }

    private void Y(final String str, final String str2) {
        showLoadingDialog();
        final AbsEsimOperation absEsimOperationCreateOperationHelper = EsimOperationHelperFactory.INSTANCE.createOperationHelper(this);
        absEsimOperationCreateOperationHelper.setOperationCallback(new e(str2));
        HMLog.info(l, new Function0() { // from class: er1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return EsimOperationActivity.O(str, str2);
            }
        });
        Rx.io(new Runnable() { // from class: cr1
            @Override // java.lang.Runnable
            public final void run() {
                absEsimOperationCreateOperationHelper.setProfileName(str, str2);
            }
        }).safeSubscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(final String str) {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_delete_account)).setMessage(getString(R.string.esim_delete_account_tips)).setNegativeButton(getString(R.string.btn_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(getString(R.string.esim_delete_account_confirm), new DialogInterface.OnClickListener() { // from class: gr1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Q(str, dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "delete_account");
    }

    private void a0(String str, final boolean z) {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_disable_state_title)).setMessage(getString(R.string.esim_disable_state_message, new Object[]{str})).setNegativeButton(getString(R.string.btn_cancel), new DialogInterface.OnClickListener() { // from class: zq1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.S(dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: ir1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.R(z, dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "disable_state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_disable_state_failure)).setMessage(getString(R.string.esim_switch_retry)).setNeutralButton(getString(R.string.btn_known), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager(), "disable_failure");
    }

    private void c0(String str, final String str2) {
        new AlertDialogFragment.Builder(this).setTitle(getString(R.string.esim_switch_account_title)).setMessage(getString(R.string.esim_switch_account_message, new Object[]{this.k.getProfileName(str), this.k.getProfileName(str2)})).setNegativeButton(getString(R.string.btn_cancel), new DialogInterface.OnClickListener() { // from class: fr1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.T(dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: hr1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.U(str2, dialogInterface, i);
            }
        }).show(getSupportFragmentManager(), "switch_account");
    }

    private void d0() {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.esim_check_connect_tips)).setNeutralButton(getString(R.string.btn_known), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager(), "tips_dialog");
    }

    private void e0(SimpleProfileInfo simpleProfileInfo) {
        if (simpleProfileInfo == null) {
            return;
        }
        this.b.setText(simpleProfileInfo.getName(getApplicationContext()));
        this.d.setChecked(simpleProfileInfo.isEnabled());
        if (!this.h) {
            this.f.setText(simpleProfileInfo.getName(getApplicationContext()));
            this.g.setOnClickListener(null);
            this.g.setVisibility(4);
            this.a.setVisibility(0);
            this.c.setVisibility(0);
            this.e.setVisibility(8);
            return;
        }
        this.f.setText(R.string.esim_rename_message);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: jr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.V(view);
            }
        });
        this.g.setVisibility(0);
        this.a.setVisibility(8);
        this.c.setVisibility(8);
        this.e.setVisibility(0);
        this.e.setText(simpleProfileInfo.getNickName());
        this.e.setSelection(TextUtils.isEmpty(simpleProfileInfo.getNickName()) ? 0 : simpleProfileInfo.getNickName().length());
        this.e.setHint(simpleProfileInfo.getI18nProviderName(this));
        this.e.requestFocus();
    }

    private void initView() {
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() { // from class: lr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H(view);
            }
        });
        this.f = (TextView) findViewById(R.id.titleText);
        this.g = (TextView) findViewById(R.id.right_text);
        this.a = findViewById(R.id.esim_info);
        this.e = (EditText) findViewById(R.id.esim_name_edit);
        this.b = (TextView) findViewById(R.id.esim_name);
        this.d = (SwitchCompat) findViewById(R.id.esim_state);
        this.c = findViewById(R.id.delete);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: nr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.I(view);
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: kr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.J(view);
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: mr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.K(view);
            }
        });
        this.e.addTextChangedListener(new a());
    }

    public static void open(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) EsimOperationActivity.class);
        intent.putExtra("info", str);
        activity.startActivity(intent);
    }

    private void showLoadingDialog() {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.esim_loading));
        this.i = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    private void z() {
        SimpleProfileInfo simpleProfileInfoF = F();
        if (simpleProfileInfoF == null) {
            return;
        }
        if (simpleProfileInfoF.isEnabled()) {
            a0(simpleProfileInfoF.getName(this), true);
        } else {
            Z(this.j);
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.h) {
            super.onBackPressed();
        } else {
            this.h = false;
            e0(F());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_esim_operation);
        DeviceCompatibility.setStatusBarDarkMode(this, !RainbowUtils.isDarkMode(this), R.color.s38);
        initView();
        G();
    }
}
