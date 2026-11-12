package com.huami.hid.takepic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import com.huami.hid.R;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/hid/takepic/TakePicSettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onDestroy", "Landroid/view/View;", "v", "onClick", "Lcom/huami/hid/takepic/TakePicViewModel;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/hid/takepic/TakePicViewModel;", "takePicViewModel", "<init>", "()V", "Companion", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class TakePicSettingActivity extends AppCompatActivity implements View.OnClickListener {

    @NotNull
    public static final String KEY_ADDRESS = "macAddress";

    @NotNull
    public static final String KEY_IS_WATCH = "isWatch";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy takePicViewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/hid/takepic/TakePicViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<TakePicViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TakePicViewModel invoke() {
            return (TakePicViewModel) TakePicSettingActivity.this.getDefaultViewModelProviderFactory().create(TakePicViewModel.class);
        }
    }

    private final TakePicViewModel e() {
        return (TakePicViewModel) this.takePicViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(TakePicSettingActivity takePicSettingActivity, View view) {
        takePicSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(TakePicSettingActivity takePicSettingActivity, Boolean bool) {
        ((TextView) takePicSettingActivity.findViewById(R.id.tv_bluetooth_tip)).setText(takePicSettingActivity.e().tipBluetoothOperation$hid_release(bool.booleanValue()));
        ((ImageView) takePicSettingActivity.findViewById(R.id.iv_bluetooth_state)).setImageDrawable(takePicSettingActivity.e().picBluetoothState$hid_release(bool.booleanValue()));
        ((Button) takePicSettingActivity.findViewById(R.id.btn_bluetooth_operation)).setText(takePicSettingActivity.e().btnLabel$hid_release(bool.booleanValue()));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        Integer numValueOf = v == null ? null : Integer.valueOf(v.getId());
        int i = R.id.btn_bluetooth_operation;
        if (numValueOf != null && numValueOf.intValue() == i) {
            e().clickBtnBluetoothOperation$hid_release();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_pic_setting);
        TakePicViewModel takePicViewModelE = e();
        Intent intent = getIntent();
        String stringExtra = intent == null ? null : intent.getStringExtra(KEY_ADDRESS);
        Objects.requireNonNull(stringExtra, "You must put device TakePicViewModel.KEY_ADDRESS value before starting TakePicSettingActivity!");
        takePicViewModelE.setMacAddress$hid_release(stringExtra);
        TakePicViewModel takePicViewModelE2 = e();
        Intent intent2 = getIntent();
        Boolean boolValueOf = intent2 != null ? Boolean.valueOf(intent2.getBooleanExtra(KEY_IS_WATCH, false)) : null;
        Objects.requireNonNull(boolValueOf, "You must put device TakePicViewModel.KEY_IS_WATCH value before starting TakePicSettingActivity!");
        takePicViewModelE2.setWatch$hid_release(boolValueOf.booleanValue());
        e().setApplicationContext$hid_release(getApplicationContext());
        e().registerReceiver$hid_release(this);
        e().setLoadingDialog$hid_release(new AdaptedLoadingDialog(this, false));
        e().setMBondListener$hid_release(new TakePicViewModel.BondListener() { // from class: com.huami.hid.takepic.TakePicSettingActivity.onCreate.1
            @Override // com.huami.hid.takepic.TakePicViewModel.BondListener
            public void removeBond() {
                TakePicSettingActivity.this.finish();
            }
        });
        ((RainbowTitleBar) findViewById(R.id.title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: uk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakePicSettingActivity.f(this.a, view);
            }
        });
        ((Button) findViewById(R.id.btn_bluetooth_operation)).setOnClickListener(this);
        e().isConnected$hid_release().observe(this, new Observer() { // from class: vk7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TakePicSettingActivity.g(this.a, (Boolean) obj);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e().getLoadingDialog$hid_release().dismiss$hid_release();
        e().unregisterReceiver$hid_release(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        e().isConnected$hid_release().setValue(Boolean.valueOf(DeviceConnectionHelper.INSTANCE.isDevicePairedAndConnected$hid_release(e().getMacAddress$hid_release())));
    }
}
