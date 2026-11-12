package com.xiaomi.fitness.sync;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.sync.WifiDataHandler;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.impl.MiuiNearbyServiceListener;
import com.xiaomi.fitness.sync.util.MiuiNearbyServiceHelper;
import defpackage.asi;
import defpackage.av6;
import defpackage.gyo;
import defpackage.hvi;
import defpackage.i1j;
import defpackage.s7r;
import defpackage.txo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0007¢\u0006\u0004\b'\u0010(J-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0010R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010 R\u001c\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/sync/WifiDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "ssid", "Lkotlin/Function1;", "", "callback", "getWifiPassword", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lgyo$a;", "basicInfo", "password", "syncWifiPassword", "(Lgyo$a;Ljava/lang/String;)V", "showConfirmDialog", "showWifiDialog", "(Lgyo$a;)V", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "handleWifiPacket", "Landroid/widget/EditText;", "userNameTxt", "Landroid/widget/EditText;", "passwordTxt", "Landroid/widget/Button;", "confirmTxt", "Landroid/widget/Button;", "cancleTxt", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "wifiDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "authMode", "I", "<init>", "()V", "Companion", "MyTextWatcher", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WifiDataHandler extends DataHandlerWrapper {

    @NotNull
    public static final String REQ_WIFI_TAG = "REQ_WIFI_TAG";
    private int authMode;
    private Button cancleTxt;
    private Button confirmTxt;

    @Nullable
    private EditText passwordTxt;

    @Nullable
    private EditText userNameTxt;

    @Nullable
    private CommonDialog<?> wifiDialog;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sync/WifiDataHandler$MyTextWatcher;", "Landroid/text/TextWatcher;", "<init>", "(Lcom/xiaomi/fitness/sync/WifiDataHandler;)V", "beforeTextChanged", "", "s", "", StatConstants.PARAM_START, "", "count", "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MyTextWatcher implements TextWatcher {
        public MyTextWatcher() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NotNull Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
            EditText editText = WifiDataHandler.this.userNameTxt;
            Button button = null;
            int length = String.valueOf(editText != null ? editText.getText() : null).length();
            EditText editText2 = WifiDataHandler.this.passwordTxt;
            int length2 = String.valueOf(editText2 != null ? editText2.getText() : null).length();
            boolean z = false;
            if (WifiDataHandler.this.authMode != 4) {
                Button button2 = WifiDataHandler.this.confirmTxt;
                if (button2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("confirmTxt");
                } else {
                    button = button2;
                }
                button.setEnabled(length2 > 0);
                return;
            }
            Button button3 = WifiDataHandler.this.confirmTxt;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmTxt");
            } else {
                button = button3;
            }
            if (length > 0 && length2 > 0) {
                z = true;
            }
            button.setEnabled(z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@NotNull CharSequence s, int start, int count, int after) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@NotNull CharSequence s, int start, int before, int count) {
            Intrinsics.checkNotNullParameter(s, "s");
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.WifiDataHandler$handlePacket$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.WifiDataHandler$handlePacket$1", f = "WifiDataHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ s7r $packet;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32291(s7r s7rVar, Continuation<? super C32291> continuation) {
            super(2, continuation);
            this.$packet = s7rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WifiDataHandler.this.new C32291(this.$packet, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CommonDialog commonDialog;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (WifiDataHandler.this.wifiDialog != null) {
                CommonDialog commonDialog2 = WifiDataHandler.this.wifiDialog;
                Intrinsics.checkNotNull(commonDialog2);
                if (commonDialog2.isShowing() && (commonDialog = WifiDataHandler.this.wifiDialog) != null) {
                    commonDialog.dismissAllowingStateLoss();
                }
            }
            Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
            gyo.a aVarQ = this.$packet.E().Q();
            if (currentActivity != null) {
                WifiDataHandler wifiDataHandler = WifiDataHandler.this;
                Intrinsics.checkNotNull(aVarQ);
                wifiDataHandler.handleWifiPacket(aVarQ);
                return Unit.INSTANCE;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            SyncPreference syncPreference = SyncPreference.INSTANCE;
            syncPreference.setCACHED_WIFI_SAVE_TIME(jCurrentTimeMillis);
            syncPreference.setCACHED_WIFI_INFO(new Gson().toJson(aVarQ));
            Logger.i(WifiDataHandler.REQ_WIFI_TAG, "handle wifi packet fail, current activity null save: " + jCurrentTimeMillis);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sync.WifiDataHandler$handleWifiPacket$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sync.WifiDataHandler$handleWifiPacket$2", f = "WifiDataHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ gyo.a $basicInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(gyo.a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$basicInfo = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WifiDataHandler.this.new AnonymousClass2(this.$basicInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WifiDataHandler.this.showWifiDialog(this.$basicInfo);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void getWifiPassword(final String ssid, final Function1<? super String, Unit> callback) {
        Logger.i(REQ_WIFI_TAG, "try getWifiPassword: " + ssid);
        MiuiNearbyServiceHelper.INSTANCE.init(new MiuiNearbyServiceListener() { // from class: com.xiaomi.fitness.sync.WifiDataHandler.getWifiPassword.1
            @Override // com.xiaomi.fitness.sync.impl.MiuiNearbyServiceListener
            public void onDestroy() {
                Logger.i(WifiDataHandler.REQ_WIFI_TAG, "getWifiPassword onDestroy");
                callback.invoke2(null);
            }

            @Override // com.xiaomi.fitness.sync.impl.MiuiNearbyServiceListener
            public void onInit(MiuiNearbyServiceHelper action) {
                String strSubstring;
                List listSplit$default;
                String str;
                Intrinsics.checkNotNullParameter(action, "action");
                Logger.i(WifiDataHandler.REQ_WIFI_TAG, "try getWifiPassword ssid, init: " + ssid);
                String wifiPassword = action.getWifiPassword(ssid);
                Logger.d(WifiDataHandler.REQ_WIFI_TAG, "originPassword: " + wifiPassword);
                Logger.i(WifiDataHandler.REQ_WIFI_TAG, "originPassword null? " + (wifiPassword == null || wifiPassword.length() == 0));
                if (wifiPassword == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) wifiPassword, new String[]{";"}, false, 0, 6, (Object) null)) == null || (str = (String) listSplit$default.get(1)) == null) {
                    strSubstring = null;
                } else {
                    strSubstring = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
                Logger.d(WifiDataHandler.REQ_WIFI_TAG, "password: " + strSubstring);
                callback.invoke2(strSubstring);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleWifiPacket$lambda$0(WifiDataHandler this$0, gyo.a basicInfo, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(basicInfo, "$basicInfo");
        SyncPreference syncPreference = SyncPreference.INSTANCE;
        if (syncPreference.getKEY_SYNC_WIFI() && str != null && str.length() != 0) {
            this$0.syncWifiPassword(basicInfo, str);
            Unit unit = Unit.INSTANCE;
        } else if (syncPreference.getKEY_SYNC_WIFI() || str == null || str.length() == 0) {
            AnyExtKt.main$default(null, new WifiDataHandler$handleWifiPacket$1$2(this$0, basicInfo, null), 1, null);
        } else {
            AnyExtKt.main$default(null, new WifiDataHandler$handleWifiPacket$1$1(this$0, basicInfo, str, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmDialog(final gyo.a basicInfo, final String password) {
        CommonDialog commonDialogAddDialogCallback;
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null || (commonDialogAddDialogCallback = new CommonDialog.c("").setDialogTitle(i1j.g).setDialogDescription(i1j.f).setPositiveText(i1j.common_allow).setNegativeText(i1j.common_reject).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sync.WifiDataHandler$showConfirmDialog$confirmDialog$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    this.this$0.showWifiDialog(basicInfo);
                } else {
                    if (which != -1) {
                        return;
                    }
                    this.this$0.syncWifiPassword(basicInfo, password);
                    SyncPreference.INSTANCE.setKEY_SYNC_WIFI(true);
                }
            }
        })) == null) {
            return;
        }
        commonDialogAddDialogCallback.showIfNeed(((FragmentActivity) currentActivity).getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWifiDialog(final gyo.a basicInfo) {
        int i = basicInfo.d;
        Logger.i("WifiConfig authMode = " + i + " frequencyInfo " + basicInfo.e + " ssid = " + basicInfo.c + " currentThread:" + Thread.currentThread().getName(), new Object[0]);
        this.authMode = i;
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        int sportState = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getSportState();
        if (currentActivity == null || wearableDeviceModel == null || !DeviceModelExtKt.isBluetooth(wearableDeviceModel) || !DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.WIFI_CONFIG)) {
            return;
        }
        if (sportState == 0 || sportState == 4) {
            Button button = null;
            View viewInflate = LayoutInflater.from(currentActivity).inflate(hvi.f20517a, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            this.userNameTxt = (EditText) viewInflate.findViewById(asi.c);
            this.passwordTxt = (EditText) viewInflate.findViewById(asi.e);
            this.confirmTxt = (Button) viewInflate.findViewById(asi.f3416b);
            this.cancleTxt = (Button) viewInflate.findViewById(asi.f3415a);
            ((TextView) viewInflate.findViewById(asi.d)).setText(currentActivity.getString(i1j.f20665a, basicInfo.c));
            if (basicInfo.d == 4) {
                EditText editText = this.userNameTxt;
                Intrinsics.checkNotNull(editText);
                editText.setVisibility(0);
            }
            Button button2 = this.confirmTxt;
            if (button2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmTxt");
                button2 = null;
            }
            button2.setEnabled(false);
            MyTextWatcher myTextWatcher = new MyTextWatcher();
            EditText editText2 = this.userNameTxt;
            if (editText2 != null) {
                editText2.addTextChangedListener(myTextWatcher);
            }
            EditText editText3 = this.passwordTxt;
            if (editText3 != null) {
                editText3.addTextChangedListener(myTextWatcher);
            }
            Button button3 = this.confirmTxt;
            if (button3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmTxt");
                button3 = null;
            }
            button3.setOnClickListener(new View.OnClickListener() { // from class: jkr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WifiDataHandler.showWifiDialog$lambda$1(this.f22899a, basicInfo, wearableDeviceModel, view);
                }
            });
            Button button4 = this.cancleTxt;
            if (button4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cancleTxt");
            } else {
                button = button4;
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: kkr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WifiDataHandler.showWifiDialog$lambda$2(this.f23957a, view);
                }
            });
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("wifi dialog").setDialogTitle(i1j.f20666b).setCustomView(viewInflate).create();
            this.wifiDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.showIfNeed(((FragmentActivity) currentActivity).getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWifiDialog$lambda$1(WifiDataHandler this$0, gyo.a basicInfo, WearableDeviceModel wearableDeviceModel, View view) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(basicInfo, "$basicInfo");
        EditText editText = this$0.passwordTxt;
        String strValueOf2 = String.valueOf(editText != null ? editText.getText() : null);
        if (basicInfo.d == 4) {
            EditText editText2 = this$0.userNameTxt;
            strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
        } else {
            strValueOf = "";
        }
        EditText editText3 = this$0.userNameTxt;
        int length = String.valueOf(editText3 != null ? editText3.getText() : null).length();
        EditText editText4 = this$0.passwordTxt;
        int length2 = String.valueOf(editText4 != null ? editText4.getText() : null).length();
        if ((this$0.authMode == 4 && length > 0 && length2 > 0) || length2 > 0) {
            com.xiaomi.fitness.sync.util.DeviceModelExtKt.addWifiConfig(wearableDeviceModel, strValueOf, strValueOf2, basicInfo);
        }
        CommonDialog<?> commonDialog = this$0.wifiDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWifiDialog$lambda$2(WifiDataHandler this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog<?> commonDialog = this$0.wifiDialog;
        Intrinsics.checkNotNull(commonDialog);
        commonDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncWifiPassword(gyo.a basicInfo, String password) {
        Logger.i(REQ_WIFI_TAG, "syncWifiPassword");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            com.xiaomi.fitness.sync.util.DeviceModelExtKt.addWifiConfig(wearableDeviceModel, "", password, basicInfo);
        }
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (type != 2 || packet == null || packet.f != 55) {
            return false;
        }
        txo txoVarE = packet.E();
        Logger.i(REQ_WIFI_TAG, "receive request wifi " + did + " " + (txoVarE != null ? txoVarE.Q() : null));
        if (packet.E() != null) {
            AnyExtKt.main$default(null, new C32291(packet, null), 1, null);
        }
        return true;
    }

    public final void handleWifiPacket(@NotNull final gyo.a basicInfo) {
        Intrinsics.checkNotNullParameter(basicInfo, "basicInfo");
        Logger.i(REQ_WIFI_TAG, "wifiManager reqSsid: " + basicInfo.c);
        if (RomUtils.isXiaomi()) {
            String ssid = basicInfo.c;
            Intrinsics.checkNotNullExpressionValue(ssid, "ssid");
            getWifiPassword(ssid, new Function1() { // from class: lkr
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WifiDataHandler.handleWifiPacket$lambda$0(this.f25185a, basicInfo, (String) obj);
                }
            });
        } else {
            AnyExtKt.main$default(null, new AnonymousClass2(basicInfo, null), 1, null);
        }
        SyncPreference syncPreference = SyncPreference.INSTANCE;
        syncPreference.setCACHED_WIFI_INFO("");
        syncPreference.setCACHED_WIFI_SAVE_TIME(0L);
    }
}
