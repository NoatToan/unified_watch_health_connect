package com.huami.hid;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.hid.bluetooth.BluetoothUtil;
import com.huami.hid.takepic.BluetoothServiceListener;
import com.huami.hid.takepic.DeviceConnectionHelper;
import com.huami.hid.takepic.HidListener;
import com.huami.hid.takepic.TakePicSettingActivity;
import com.huami.hid.utils.ReflectHiddenApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/hid/HidSdk;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/huami/hid/takepic/BluetoothServiceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/huami/hid/takepic/HidListener;", "hidListen", "", "isMIUIBased11", "", PointCategory.INIT, TakePicSettingActivity.KEY_IS_WATCH, "startTakePicSettingActivity", "unPairDevice", "updateSettingTips", "updateSettingStatus", "a", "Ljava/lang/String;", TakePicSettingActivity.KEY_ADDRESS, "b", "Lcom/huami/hid/takepic/HidListener;", "getHidListener$hid_release", "()Lcom/huami/hid/takepic/HidListener;", "setHidListener$hid_release", "(Lcom/huami/hid/takepic/HidListener;)V", "hidListener", "c", "Z", "isMIUIBased11$hid_release", "()Z", "setMIUIBased11$hid_release", "(Z)V", "<init>", "()V", "hid_release"}, k = 1, mv = {1, 5, 1})
public final class HidSdk {

    @NotNull
    public static final HidSdk INSTANCE = new HidSdk();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static String macAddress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static HidListener hidListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean isMIUIBased11;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("isReflected: ", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("init error: address is ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startTakePicSettingActivity error: mac address is empty.";
        }
    }

    static {
        HMLog.info(BluetoothUtil.TAG, new a(ReflectHiddenApi.INSTANCE.exemptAll$hid_release()));
    }

    private HidSdk() {
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(@NotNull Context context, @NotNull String str, @NotNull BluetoothServiceListener bluetoothServiceListener, @NotNull HidListener hidListener2) {
        init$default(context, str, bluetoothServiceListener, hidListener2, false, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void init(@NotNull Context context, @NotNull String address, @NotNull BluetoothServiceListener listener, @NotNull HidListener hidListen, boolean isMIUIBased12) {
        if (!BluetoothAdapter.checkBluetoothAddress(address)) {
            throw new IllegalArgumentException("The parameter address is not a valid value!");
        }
        DeviceConnectionHelper.INSTANCE.initProfile$hid_release(context, address, listener);
        macAddress = address;
        if (TextUtils.isEmpty(address)) {
            HMLog.info(BluetoothUtil.TAG, new b(address));
        }
        hidListener = hidListen;
        isMIUIBased11 = isMIUIBased12;
    }

    public static /* synthetic */ void init$default(Context context, String str, BluetoothServiceListener bluetoothServiceListener, HidListener hidListener2, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        init(context, str, bluetoothServiceListener, hidListener2, z);
    }

    @JvmStatic
    public static final void startTakePicSettingActivity(@NotNull Context context, boolean isWatch) {
        if (TextUtils.isEmpty(macAddress)) {
            HMLog.info(BluetoothUtil.TAG, c.a);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TakePicSettingActivity.class);
        intent.putExtra(TakePicSettingActivity.KEY_ADDRESS, macAddress);
        intent.putExtra(TakePicSettingActivity.KEY_IS_WATCH, isWatch);
        context.startActivity(intent);
    }

    @JvmStatic
    public static final void unPairDevice(@NotNull Context context) {
        String str = macAddress;
        if (str == null) {
            return;
        }
        DeviceConnectionHelper.INSTANCE.unPairDevice$hid_release(context, str);
    }

    @Nullable
    public final HidListener getHidListener$hid_release() {
        return hidListener;
    }

    public final boolean isMIUIBased11$hid_release() {
        return isMIUIBased11;
    }

    public final void setHidListener$hid_release(@Nullable HidListener hidListener2) {
        hidListener = hidListener2;
    }

    public final void setMIUIBased11$hid_release(boolean z) {
        isMIUIBased11 = z;
    }

    @NotNull
    public final String updateSettingStatus(@NotNull Context context) {
        String str = macAddress;
        return str == null ? false : DeviceConnectionHelper.INSTANCE.isDevicePairedAndConnected$hid_release(str) ? context.getResources().getString(R.string.bracelet_set_already) : context.getResources().getString(R.string.bracelet_not_set);
    }

    @NotNull
    public final String updateSettingTips(@NotNull Context context, boolean isWatch) {
        return isWatch ? context.getResources().getString(R.string.watch_desc_take_pic) : context.getResources().getString(R.string.bracelet_desc_take_pic);
    }
}
