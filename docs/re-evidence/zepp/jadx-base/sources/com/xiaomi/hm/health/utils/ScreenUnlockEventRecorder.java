package com.xiaomi.hm.health.utils;

import android.content.SharedPreferences;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\"\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/utils/ScreenUnlockEventRecorder;", "", "Landroid/content/SharedPreferences;", "sharePreference", "", PointCategory.INIT, "recordStep2ClickTime", "", "reason", "recordUnbindDeviceReason", "currentDevice", "", "devices", "recordMiUIBindDevices", "printRecord", "a", "Ljava/lang/String;", "TAG", "b", "CLICK_STEP2_TIME", "c", "DEVICE_UNBIND_TIME", GoogleApiAvailabilityLight.a, "DEVICE_UNBIND_REASON", "e", "MIUI_BIND_DEVICES", "f", "NO_RECORD", "g", "Landroid/content/SharedPreferences;", "sp", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ScreenUnlockEventRecorder {

    @NotNull
    public static final ScreenUnlockEventRecorder INSTANCE = new ScreenUnlockEventRecorder();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ScreenUnlockEventRecorder";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String CLICK_STEP2_TIME = "ClickStep2Time";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String DEVICE_UNBIND_TIME = "DeviceUnBindTime";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String DEVICE_UNBIND_REASON = "DeviceUnBindReason";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String MIUI_BIND_DEVICES = "MiUiBindDevices";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String NO_RECORD = "NoRecord";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private static SharedPreferences sp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sp is null!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONObject jSONObject) {
            super(0);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "record unlock screen info: " + this.a;
        }
    }

    private ScreenUnlockEventRecorder() {
    }

    @JvmStatic
    public static final void init(@NotNull SharedPreferences sharePreference) {
        sp = sharePreference;
    }

    @JvmStatic
    public static final void printRecord() throws JSONException {
        if (sp == null) {
            HMLog.info(TAG, a.a);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        SharedPreferences sharedPreferences = sp;
        long j = sharedPreferences == null ? 0L : sharedPreferences.getLong(CLICK_STEP2_TIME, 0L);
        SharedPreferences sharedPreferences2 = sp;
        long j2 = sharedPreferences2 != null ? sharedPreferences2.getLong(DEVICE_UNBIND_TIME, 0L) : 0L;
        SharedPreferences sharedPreferences3 = sp;
        String str = NO_RECORD;
        String string = sharedPreferences3 == null ? null : sharedPreferences3.getString(DEVICE_UNBIND_REASON, NO_RECORD);
        if (string == null) {
            string = NO_RECORD;
        }
        SharedPreferences sharedPreferences4 = sp;
        String string2 = sharedPreferences4 != null ? sharedPreferences4.getString(MIUI_BIND_DEVICES, NO_RECORD) : null;
        if (string2 != null) {
            str = string2;
        }
        jSONObject.put(CLICK_STEP2_TIME, j);
        jSONObject.put(DEVICE_UNBIND_TIME, j2);
        jSONObject.put(DEVICE_UNBIND_REASON, string);
        jSONObject.put(MIUI_BIND_DEVICES, str);
        HMLog.info(TAG, new b(jSONObject));
    }

    @JvmStatic
    public static final void recordMiUIBindDevices(@Nullable String currentDevice, @Nullable List<String> devices) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if (devices == null) {
            devices = CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> list = devices;
        String str = System.currentTimeMillis() + ": " + currentDevice + AESEncryptionHelper.SEPARATOR + (list.isEmpty() ^ true ? CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, null, 62, null) : "No Devices");
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutString = editorEdit.putString(MIUI_BIND_DEVICES, str)) == null) {
            return;
        }
        editorPutString.apply();
    }

    @JvmStatic
    public static final void recordStep2ClickTime() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutLong;
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutLong = editorEdit.putLong(CLICK_STEP2_TIME, System.currentTimeMillis())) == null) {
            return;
        }
        editorPutLong.apply();
    }

    @JvmStatic
    public static final void recordUnbindDeviceReason(@NotNull String reason) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutLong;
        SharedPreferences.Editor editorEdit2;
        SharedPreferences.Editor editorPutString;
        System.currentTimeMillis();
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null && (editorEdit2 = sharedPreferences.edit()) != null && (editorPutString = editorEdit2.putString(DEVICE_UNBIND_REASON, reason)) != null) {
            editorPutString.apply();
        }
        SharedPreferences sharedPreferences2 = sp;
        if (sharedPreferences2 == null || (editorEdit = sharedPreferences2.edit()) == null || (editorPutLong = editorEdit.putLong(DEVICE_UNBIND_TIME, System.currentTimeMillis())) == null) {
            return;
        }
        editorPutLong.apply();
    }
}
