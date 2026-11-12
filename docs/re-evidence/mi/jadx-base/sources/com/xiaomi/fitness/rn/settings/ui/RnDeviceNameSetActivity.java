package com.xiaomi.fitness.rn.settings.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.settings.ui.RnDeviceNameSetActivity;
import com.xiaomi.fitness.rn.settings.util.RnDeviceRenameDialogKt;
import defpackage.sri;
import defpackage.v0j;
import defpackage.zui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/ui/RnDeviceNameSetActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "mViewEdit", "Landroid/widget/EditText;", "mViewError", "Landroid/widget/TextView;", "mBtnNext", "Landroid/widget/Button;", "mDeviceModel", "Lcom/xiaomi/fitness/rn/export/RNDeviceModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "renameDevice", "mac", "", "oldName", "getDeviceModelByMac", "showErrorMsg", "code", "openPlugin", "did", "onBackPressed", "Companion", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRnDeviceNameSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnDeviceNameSetActivity.kt\ncom/xiaomi/fitness/rn/settings/ui/RnDeviceNameSetActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,135:1\n58#2,23:136\n93#2,3:159\n*S KotlinDebug\n*F\n+ 1 RnDeviceNameSetActivity.kt\ncom/xiaomi/fitness/rn/settings/ui/RnDeviceNameSetActivity\n*L\n75#1:136,23\n75#1:159,3\n*E\n"})
public final class RnDeviceNameSetActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_MAC = "mac";

    @NotNull
    private static final String KEY_NAME = "name";

    @NotNull
    private static final String TAG = "RnDeviceNameSetActivity";
    private Button mBtnNext;

    @Nullable
    private RNDeviceModel mDeviceModel;
    private EditText mViewEdit;
    private TextView mViewError;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/ui/RnDeviceNameSetActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_MAC", "KEY_NAME", "launch", "", "context", "Landroid/content/Context;", "mac", "name", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit launch$lambda$0(String mac, String name, Intent it) {
            Intrinsics.checkNotNullParameter(mac, "$mac");
            Intrinsics.checkNotNullParameter(name, "$name");
            Intrinsics.checkNotNullParameter(it, "it");
            it.putExtra("mac", mac);
            it.putExtra("name", name);
            return Unit.INSTANCE;
        }

        public final void launch(@NotNull Context context, @NotNull final String mac, @NotNull final String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(name, "name");
            LaunchExtensionKt.startActivity(context, (Class<?>) RnDeviceNameSetActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: nuk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RnDeviceNameSetActivity.Companion.launch$lambda$0(mac, name, (Intent) obj);
                }
            });
        }
    }

    private final RNDeviceModel getDeviceModelByMac(final String mac) {
        RNDeviceModel rNDeviceModel = this.mDeviceModel;
        if (rNDeviceModel != null) {
            return rNDeviceModel;
        }
        RNDeviceModel rNDeviceModel2 = (RNDeviceModel) RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).findDeviceModel(new Function1() { // from class: muk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(RnDeviceNameSetActivity.getDeviceModelByMac$lambda$4(mac, (RNDeviceModel) obj));
            }
        });
        this.mDeviceModel = rNDeviceModel2;
        return rNDeviceModel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getDeviceModelByMac$lambda$4(String mac, RNDeviceModel it) {
        Intrinsics.checkNotNullParameter(mac, "$mac");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(DeviceModelExtKt.getMac(it), mac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(RnDeviceNameSetActivity this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            EditText editText = this$0.mViewEdit;
            EditText editText2 = null;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewEdit");
                editText = null;
            }
            String string = editText.getText().toString();
            if (string == null || string.length() == 0) {
                EditText editText3 = this$0.mViewEdit;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewEdit");
                    editText3 = null;
                }
                EditText editText4 = this$0.mViewEdit;
                if (editText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewEdit");
                } else {
                    editText2 = editText4;
                }
                editText3.setText(editText2.getHint());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(RnDeviceNameSetActivity this$0, String str, String str2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ViewUtil.INSTANCE.isFastClick()) {
            return;
        }
        TextView textView = this$0.mViewError;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewError");
            textView = null;
        }
        ViewExtKt.setVisible(textView, false);
        this$0.renameDevice(str, str2);
    }

    private final void openPlugin(String did) {
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).openPlugin(did);
        finish();
    }

    private final void renameDevice(String mac, String oldName) {
        RNDeviceModel deviceModelByMac = getDeviceModelByMac(mac);
        EditText editText = null;
        final String did = deviceModelByMac != null ? deviceModelByMac.getDid() : null;
        if (did == null) {
            Logger.w(TAG, "renameDevice: did is null");
            showErrorMsg(-1);
            return;
        }
        EditText editText2 = this.mViewEdit;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewEdit");
        } else {
            editText = editText2;
        }
        RnDeviceRenameDialogKt.requestRenameDevice(did, oldName, StringsKt__StringsKt.trim((CharSequence) editText.getText().toString()).toString(), new Function1() { // from class: iuk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RnDeviceNameSetActivity.renameDevice$lambda$3(this.f22107a, did, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renameDevice$lambda$3(RnDeviceNameSetActivity this$0, String str, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "renameDevice: onSuccess(" + i + ")");
        if (i == 0) {
            this$0.openPlugin(str);
        } else {
            this$0.showErrorMsg(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMsg(final int code) {
        runOnUiThread(new Runnable() { // from class: luk
            @Override // java.lang.Runnable
            public final void run() {
                RnDeviceNameSetActivity.showErrorMsg$lambda$5(code, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorMsg$lambda$5(int i, RnDeviceNameSetActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iConvertInputErrorMsgResId = RnDeviceRenameDialogKt.convertInputErrorMsgResId(i);
        TextView textView = this$0.mViewError;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewError");
            textView = null;
        }
        ViewExtKt.setVisible(textView, true);
        TextView textView3 = this$0.mViewError;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewError");
        } else {
            textView2 = textView3;
        }
        textView2.setText(iConvertInputErrorMsgResId);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return zui.f41692b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        ToastUtil.showLongToast(v0j.I);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(v0j.H);
        Intent intent = getIntent();
        EditText editText = null;
        final String stringExtra = intent != null ? intent.getStringExtra("mac") : null;
        if (stringExtra == null || stringExtra.length() == 0) {
            Logger.w(TAG, "no mac address (" + stringExtra + ")");
            finish();
            return;
        }
        Intent intent2 = getIntent();
        final String stringExtra2 = intent2 != null ? intent2.getStringExtra("name") : null;
        this.mViewEdit = (EditText) findViewById(sri.e);
        this.mViewError = (TextView) findViewById(sri.h);
        this.mBtnNext = (Button) findViewById(sri.f33917b);
        EditText editText2 = this.mViewEdit;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewEdit");
            editText2 = null;
        }
        editText2.setHint(stringExtra2);
        EditText editText3 = this.mViewEdit;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewEdit");
            editText3 = null;
        }
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: juk
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                RnDeviceNameSetActivity.onCreate$lambda$0(this.f23150a, view, z);
            }
        });
        Button button = this.mBtnNext;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBtnNext");
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: kuk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RnDeviceNameSetActivity.onCreate$lambda$1(this.f24309a, stringExtra, stringExtra2, view);
            }
        });
        EditText editText4 = this.mViewEdit;
        if (editText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewEdit");
        } else {
            editText = editText4;
        }
        editText.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.rn.settings.ui.RnDeviceNameSetActivity$onCreate$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                EditText editText5 = this.this$0.mViewEdit;
                Button button2 = null;
                if (editText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewEdit");
                    editText5 = null;
                }
                int iCheckInputNameValid = RnDeviceRenameDialogKt.checkInputNameValid(StringsKt__StringsKt.trim((CharSequence) editText5.getText().toString()).toString());
                if (iCheckInputNameValid != 0) {
                    this.this$0.showErrorMsg(iCheckInputNameValid);
                } else {
                    TextView textView = this.this$0.mViewError;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewError");
                        textView = null;
                    }
                    ViewExtKt.setVisible(textView, false);
                }
                Button button3 = this.this$0.mBtnNext;
                if (button3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBtnNext");
                } else {
                    button2 = button3;
                }
                button2.setEnabled(iCheckInputNameValid == 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        lambda$onCreate$0();
        return true;
    }
}
