package com.huami.core.device.wifi_settings.wifiscan;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.wifi_settings.bean.ConnectStatus;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.bean.WifiCipherType;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001a\u0010\u0017\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J4\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0014\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0002J\u000e\u0010(\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010)\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010*\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020#J.\u0010.\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u00100\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010&R\u0016\u00102\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u00101¨\u00065"}, d2 = {"Lcom/huami/core/device/wifi_settings/wifiscan/WifiUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/net/wifi/WifiInfo;", GoogleApiAvailabilityLight.a, "Landroid/net/wifi/WifiManager;", "f", "", hl.k, "", "Landroid/net/wifi/ScanResult;", "list", "", "c", "scanResult", "", "filter5G", "a", "", "sSid", "", "freq", "g", "it", "connectionInfo", "h", "ssid", "b", "targetSSID", "targetBSSID", "capabilities", "Lcom/huami/core/device/wifi_settings/bean/ConnectStatus;", "state", "frequency", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "i", SOAP.XMLNS, "Lcom/huami/core/device/wifi_settings/bean/WifiCipherType;", "e", "isWifiConnect", "checkWifiIsEnable", "openWifi", "currentIsWifi5G", "wifiBean", "wifiBeanIsWifi5G", "parseWifiBeans", "wifiCipherType", "needWifiPwd", "Ljava/lang/String;", "TAG", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiUtil {

    @NotNull
    public static final WifiUtil INSTANCE = new WifiUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WifiUtil";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Ref.IntRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Ref.IntRef intRef) {
            super(0);
            this.a = str;
            this.b = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "currentIsWifi5G" + ((Object) this.a) + ":freq:" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/net/wifi/ScanResult;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ScanResult, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull ScanResult scanResult) {
            return Boolean.valueOf(TextUtils.isEmpty(scanResult.SSID));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "is5GWifi:" + ((Object) this.a) + JsonLexerKt.COLON + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "wifi connect..";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "oepn wifi success...";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ ScanResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ScanResult scanResult) {
            super(0);
            this.a = scanResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "it:" + ((Object) this.a.SSID) + JsonLexerKt.COLON + ((Object) this.a.BSSID) + JsonLexerKt.COLON + this.a.frequency + JsonLexerKt.COLON + this.a.level;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/net/wifi/ScanResult;", "it", "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<ScanResult, WifiBean> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WifiBean invoke(@NotNull ScanResult scanResult) {
            return WifiUtil.j(WifiUtil.INSTANCE, scanResult.SSID, scanResult.BSSID, scanResult.capabilities, null, scanResult.frequency, 8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("showWifiSetting error:", this.a.getMessage());
        }
    }

    private WifiUtil() {
    }

    private final boolean a(ScanResult scanResult, boolean filter5G) {
        if (filter5G) {
            return g(scanResult.SSID, scanResult.frequency);
        }
        return false;
    }

    private final String b(String ssid) {
        return (m.startsWith$default(ssid, "\"", false, 2, null) && m.endsWith$default(ssid, "\"", false, 2, null)) ? ssid.substring(1, ssid.length() - 1) : ssid;
    }

    private final List<ScanResult> c(List<? extends ScanResult> list) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ScanResult scanResult : SequencesKt___SequencesKt.filterNot(CollectionsKt___CollectionsKt.asSequence(list), b.a)) {
            if (!INSTANCE.g(scanResult.SSID, scanResult.frequency)) {
                if (!linkedHashMap.containsKey(scanResult.SSID)) {
                    linkedHashMap.put(scanResult.SSID, scanResult);
                } else if (scanResult.level > ((ScanResult) linkedHashMap.get(scanResult.SSID)).level) {
                    linkedHashMap.put(scanResult.SSID, scanResult);
                }
            }
        }
        arrayList.addAll(linkedHashMap.values());
        return arrayList;
    }

    private final WifiInfo d(Context context) {
        return f(context).getConnectionInfo();
    }

    private final WifiCipherType e(String s) {
        if (s == null) {
            return WifiCipherType.WIFICIPHER_INVALID;
        }
        if (s.length() == 0) {
            return WifiCipherType.WIFICIPHER_INVALID;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) s, (CharSequence) com.thanosfisherman.wifiutils.a.b, false, 2, (Object) null)) {
            return WifiCipherType.WIFICIPHER_WEP;
        }
        return (StringsKt__StringsKt.contains$default((CharSequence) s, (CharSequence) "WPA", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) s, (CharSequence) "WPA2", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) s, (CharSequence) "WPS", false, 2, (Object) null)) ? WifiCipherType.WIFICIPHER_WPA : WifiCipherType.WIFICIPHER_NOPASS;
    }

    private final WifiManager f(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    private final boolean g(String sSid, int freq) {
        HMLog.info(TAG, new c(sSid, freq));
        return (freq < 5900) & (freq > 4900);
    }

    private final boolean h(ScanResult it2, WifiInfo connectionInfo) {
        return Intrinsics.areEqual(it2.SSID, b(connectionInfo.getSSID())) && Intrinsics.areEqual(it2.BSSID, connectionInfo.getBSSID());
    }

    private final WifiBean i(String targetSSID, String targetBSSID, String capabilities, ConnectStatus state, int frequency) {
        return new WifiBean(targetSSID, targetBSSID, state, null, 0, INSTANCE.e(capabilities == null ? null : StringsKt__StringsKt.trim(capabilities).toString()), null, null, frequency, 216, null);
    }

    public static /* synthetic */ WifiBean j(WifiUtil wifiUtil, String str, String str2, String str3, ConnectStatus connectStatus, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            connectStatus = ConnectStatus.DISCONNECT;
        }
        return wifiUtil.i(str, str2, str3, connectStatus, i);
    }

    private final void k(Context context) {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            HMLog.info(TAG, new h(e2));
        }
    }

    public final boolean checkWifiIsEnable(@NotNull Context context) {
        return f(context).isWifiEnabled();
    }

    public final boolean currentIsWifi5G(@NotNull Context context) {
        Sequence sequenceAsSequence;
        int i;
        Ref.IntRef intRef = new Ref.IntRef();
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiManager wifiManager = (WifiManager) systemService;
        WifiInfo wifiInfoD = d(context);
        String ssid = wifiInfoD.getSSID();
        if (Build.VERSION.SDK_INT > 21) {
            intRef.element = wifiInfoD.getFrequency();
        } else if (ssid != null) {
            String str = ssid.length() > 2 ? ssid : null;
            if (str != null) {
                String strSubstring = str.substring(1, ssid.length() - 1);
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults != null && (sequenceAsSequence = CollectionsKt___CollectionsKt.asSequence(scanResults)) != null) {
                    Iterator it2 = sequenceAsSequence.iterator();
                    i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        Object next = it2.next();
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        if (Intrinsics.areEqual(((ScanResult) next).SSID, strSubstring)) {
                            break;
                        }
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
                Integer numValueOf = Integer.valueOf(i);
                Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
                if (num != null) {
                    intRef.element = scanResults.get(num.intValue()).frequency;
                }
            }
        }
        HMLog.info(TAG, new a(ssid, intRef));
        return g(ssid, intRef.element);
    }

    public final boolean isWifiConnect(@NotNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasTransport(1)) {
                return false;
            }
            HMLog.debug(TAG, d.a);
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                return false;
            }
        }
        return true;
    }

    public final boolean needWifiPwd(@Nullable WifiCipherType wifiCipherType) {
        if (wifiCipherType == null) {
            return false;
        }
        return wifiCipherType == WifiCipherType.WIFICIPHER_WEP || wifiCipherType == WifiCipherType.WIFICIPHER_WPA;
    }

    public final void openWifi(@NotNull Context context) {
        if (f(context).setWifiEnabled(true)) {
            HMLog.info(TAG, e.a);
        } else {
            k(context);
        }
    }

    @Nullable
    public final List<WifiBean> parseWifiBeans(@NotNull Context context, @Nullable List<? extends ScanResult> list, boolean filter5G) {
        ScanResult scanResult;
        WifiBean wifiBeanI;
        if (list == null) {
            return null;
        }
        WifiInfo wifiInfoD = INSTANCE.d(context);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            HMLog.info(TAG, new f((ScanResult) it2.next()));
        }
        Iterator it3 = CollectionsKt___CollectionsKt.asSequence(list).iterator();
        int i = 0;
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            }
            Object next = it3.next();
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (INSTANCE.h((ScanResult) next, wifiInfoD)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (!(numValueOf.intValue() != -1)) {
            numValueOf = null;
        }
        if (numValueOf != null && (scanResult = list.get(numValueOf.intValue())) != null) {
            WifiUtil wifiUtil = INSTANCE;
            ScanResult scanResult2 = wifiUtil.a(scanResult, filter5G) ? null : scanResult;
            if (scanResult2 != null && (wifiBeanI = wifiUtil.i(scanResult2.SSID, scanResult2.BSSID, scanResult2.capabilities, ConnectStatus.CONNECTED, scanResult2.frequency)) != null) {
                arrayList.add(wifiBeanI);
            }
        }
        WifiUtil wifiUtil2 = INSTANCE;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!INSTANCE.h((ScanResult) obj, wifiInfoD)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(wifiUtil2.c(arrayList2)), g.a)));
        return arrayList;
    }

    public final boolean wifiBeanIsWifi5G(@NotNull WifiBean wifiBean) {
        return g(wifiBean.getWifiSSID(), wifiBean.getFrequency());
    }
}
