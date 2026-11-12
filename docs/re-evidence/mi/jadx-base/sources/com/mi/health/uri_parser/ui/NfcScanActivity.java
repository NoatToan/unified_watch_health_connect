package com.mi.health.uri_parser.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import com.mi.health.uri_parser.links.HttpLinkManager;
import com.mi.health.uri_parser.links.HttpLinkUtilKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnProductChangeListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.mi_connect_service.util.AddressUtil;
import defpackage.hzi;
import defpackage.otg;
import defpackage.qtg;
import defpackage.uuc;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\r\u0010\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J/\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001dj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u001c2\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\""}, d2 = {"Lcom/mi/health/uri_parser/ui/NfcScanActivity;", "Landroid/app/Activity;", "<init>", "()V", "linkUrlPrefixDefault", "", "linkUrlPrefix", "key_mac", "key_app_data", "linUrlLastDefault", "key_mac_param", "nfc_param", "mServiceConnection", "com/mi/health/uri_parser/ui/NfcScanActivity$mServiceConnection$1", "Lcom/mi/health/uri_parser/ui/NfcScanActivity$mServiceConnection$1;", "productListener", "com/mi/health/uri_parser/ui/NfcScanActivity$productListener$1", "Lcom/mi/health/uri_parser/ui/NfcScanActivity$productListener$1;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_DESTROY, "processIntent", "intent", "Landroid/content/Intent;", "dispatchTag", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "msg", "Landroid/nfc/NdefMessage;", "(Landroid/nfc/NdefMessage;)Ljava/util/HashMap;", "Companion", "uri-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcScanActivity extends Activity {

    @NotNull
    private static final String TAG = "NfcScanActivity";

    @Nullable
    private String linkUrlPrefix;

    @NotNull
    private final String linkUrlPrefixDefault = "https://region.hlth.io.mi.com/applinks/peripheral/";

    @NotNull
    private final String key_mac = "MAC";

    @NotNull
    private final String key_app_data = "APP_DATA";

    @NotNull
    private final String linUrlLastDefault = "connect?oob=&nextStep=startSport";

    @NotNull
    private final String key_mac_param = "&btmac=";

    @NotNull
    private final String nfc_param = "&NFC=true";

    @NotNull
    private final NfcScanActivity$mServiceConnection$1 mServiceConnection = new ServiceConnection() { // from class: com.mi.health.uri_parser.ui.NfcScanActivity$mServiceConnection$1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName p0, IBinder p1) {
            Logger.d("NfcScanActivity", "onServiceConnected() called with: p0 = " + p0 + ", p1 = " + p1);
            DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).addProductChangeListener(this.this$0.productListener);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName p0) {
        }
    };

    @NotNull
    private final NfcScanActivity$productListener$1 productListener = new OnProductChangeListener() { // from class: com.mi.health.uri_parser.ui.NfcScanActivity$productListener$1
        @Override // com.xiaomi.fitness.device.manager.OnProductChangeListener
        public void onChange() {
            Logger.i("NfcScanActivity", "productListener: processIntent");
            NfcScanActivity nfcScanActivity = this.this$0;
            nfcScanActivity.processIntent(nfcScanActivity.getIntent());
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public final void processIntent(Intent intent) {
        if (intent != null) {
            Logger.i("NfcScanActivity_action:" + intent.getAction(), new Object[0]);
            if (Intrinsics.areEqual("android.nfc.action.NDEF_DISCOVERED", intent.getAction())) {
                Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
                Logger.i(TAG, "processIntent: " + parcelableArrayExtra);
                if (parcelableArrayExtra == null) {
                    Toast.makeText(this, getString(hzi.common_data_empty), 0).show();
                    return;
                }
                if (this.linkUrlPrefix == null) {
                    this.linkUrlPrefix = this.linkUrlPrefixDefault;
                }
                String str = this.linkUrlPrefix;
                Intrinsics.checkNotNull(str);
                if (!StringsKt__StringsJVMKt.endsWith$default(str, "/", false, 2, null)) {
                    this.linkUrlPrefix = this.linkUrlPrefix + "/";
                }
                Logger.i(TAG, "processIntent: " + this.linkUrlPrefix);
                StringBuilder sb = new StringBuilder(this.linkUrlPrefix);
                Iterator it = ArrayIteratorKt.iterator(parcelableArrayExtra);
                while (it.hasNext()) {
                    Parcelable parcelable = (Parcelable) it.next();
                    Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type android.nfc.NdefMessage");
                    HashMap<String, String> mapDispatchTag = dispatchTag((NdefMessage) parcelable);
                    if (mapDispatchTag.containsKey(this.key_mac)) {
                        Logger.i(TAG, "processIntent: mac = " + ((Object) mapDispatchTag.get(this.key_mac)));
                        if (mapDispatchTag.containsKey(this.key_app_data)) {
                            String str2 = mapDispatchTag.get(this.key_app_data);
                            if (TextUtils.isEmpty(str2)) {
                                sb.append(this.linUrlLastDefault);
                            } else {
                                sb.append(str2);
                            }
                        } else {
                            sb.append(this.linUrlLastDefault);
                            Logger.i(TAG, "processIntent: not contain app data");
                            Unit unit = Unit.INSTANCE;
                        }
                        sb.append(this.key_mac_param);
                        sb.append(mapDispatchTag.get(this.key_mac));
                        sb.append(this.nfc_param);
                        boolean zIsLogin = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin();
                        Logger.d(TAG, "processIntent() called with: isLogin = " + zIsLogin);
                        if (!zIsLogin) {
                            HttpLinkUtilKt.setLinkUri(Uri.parse(sb.toString()));
                            break;
                        }
                        HttpLinkManager companion = HttpLinkManager.INSTANCE.getInstance();
                        Uri uri = Uri.parse(sb.toString());
                        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                        companion.handleLink(this, uri, 7);
                        break;
                    }
                    Logger.i(TAG, "processIntent: mac not exist");
                }
                Logger.i("NfcScanActivity:url:" + ((Object) sb), new Object[0]);
            }
        }
        finish();
    }

    @NotNull
    public final HashMap<String, String> dispatchTag(@NotNull NdefMessage msg) {
        List<uuc> listB;
        Intrinsics.checkNotNullParameter(msg, "msg");
        HashMap<String, String> map = new HashMap<>();
        Iterator it = ArrayIteratorKt.iterator(msg.getRecords());
        while (it.hasNext()) {
            NdefRecord ndefRecord = (NdefRecord) it.next();
            Logger.i(TAG, "dispatchTag: " + ndefRecord);
            try {
                if (ndefRecord.getTnf() == 4 && (listB = new otg().a(ndefRecord.getPayload()).b((byte) 1)) != null) {
                    Iterator<uuc> it2 = listB.iterator();
                    while (it2.hasNext()) {
                        qtg qtgVar = (qtg) it2.next().a(qtg.class);
                        if (qtgVar != null) {
                            Map<Short, byte[]> mapC = qtgVar.c();
                            Intrinsics.checkNotNull(mapC);
                            for (Map.Entry<Short, byte[]> entry : mapC.entrySet()) {
                                Short key = entry.getKey();
                                byte[] value = entry.getValue();
                                if (key.shortValue() == 2) {
                                    map.put(this.key_mac, AddressUtil.convertMacAddressToString(value));
                                } else if (key.shortValue() == 13) {
                                    String str = this.key_app_data;
                                    Intrinsics.checkNotNull(value);
                                    Charset UTF_8 = StandardCharsets.UTF_8;
                                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                    map.put(str, new String(value, UTF_8));
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                Logger.i(TAG, "");
            }
        }
        Logger.i(TAG, "dispatchTag() returned: " + map);
        return map;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        processIntent(getIntent());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        DeviceManagerExtKt.getInstance(WearableProductManager.INSTANCE).removeProductChangeListener(this.productListener);
        ServiceConnector.removeServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.mServiceConnection, 0, 2, null);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.d(TAG, "onResume() called");
    }
}
