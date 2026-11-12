package com.xiaomi.smarthome.state;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.newui.utils.NumberUtils;
import com.xiaomi.smarthome.state.StateHolderImpl;
import com.xiaomi.smarthome.state.ValueEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0002J6\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0002J6\u0010\u0019\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J$\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J8\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010 \u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010!\u001a\u00020\u0014H\u0016R4\u0010\u0003\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00040\u0004X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/smarthome/state/StateHolderImpl;", "Lcom/xiaomi/smarthome/state/IStateHolder$Stub;", "()V", "mPropsMap", "", "", "Lcom/xiaomi/smarthome/state/ValueEntry;", "getMPropsMap", "()Ljava/util/Map;", "mStateChangedListener", "Ljava/util/ArrayList;", "Lcom/xiaomi/smarthome/state/OnStateChangedListener;", "state", "", "tag", "checkTime", "", "time", "type", "dispatchStateChange", "", "did", "prop", "value", "", "dispatchTimeChange", "getProp", "getPropsMap", "loadPropsFromLocal", "notifyPropChangedListener", "registerStateChangedListener", e.f13808a, "removePropMap", "savePropsCache", "Companion", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StateHolderImpl extends IStateHolder.Stub {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final byte STATE_CHECK = 2;
    private static final byte STATE_INIT = 0;
    private static final byte STATE_INVALID = -1;
    private static final byte STATE_LOADED = 1;
    private static final byte STATE_MODIFY = 3;
    private static final byte STATE_SAVED = 4;

    @NotNull
    private static final String TAG = "StateHolder";
    public static final byte TYPE_FAIL_ACCESS = -5;
    public static final byte TYPE_FAIL_NODEVICE = -3;
    public static final byte TYPE_FAIL_OFFLINE = -1;
    public static final byte TYPE_FAIL_PARAM = -4;
    public static final byte TYPE_FAIL_TIMEOUT = -2;
    public static final byte TYPE_GET = 5;
    public static final byte TYPE_PUSH = 4;
    public static final byte TYPE_SET_FAIL = 3;
    public static final byte TYPE_SET_REQUEST = 1;
    public static final byte TYPE_SET_SUCCESS = 2;
    private byte state;

    @NotNull
    private final Map<String, Map<String, ValueEntry>> mPropsMap = new ConcurrentHashMap();

    @NotNull
    private final ArrayList<OnStateChangedListener> mStateChangedListener = new ArrayList<>();

    @NotNull
    private final String tag = Intrinsics.stringPlus(TAG, Integer.toString(hashCode(), 36));

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/smarthome/state/StateHolderImpl$Companion;", "", "()V", "STATE_CHECK", "", "STATE_INIT", "STATE_INVALID", "STATE_LOADED", "STATE_MODIFY", "STATE_SAVED", "TAG", "", "TYPE_FAIL_ACCESS", "TYPE_FAIL_NODEVICE", "TYPE_FAIL_OFFLINE", "TYPE_FAIL_PARAM", "TYPE_FAIL_TIMEOUT", "TYPE_GET", "TYPE_PUSH", "TYPE_SET_FAIL", "TYPE_SET_REQUEST", "TYPE_SET_SUCCESS", "cacheFile", "Ljava/io/File;", "getCacheFile", "()Ljava/io/File;", "getStateName", "type", "getTypeName", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File getCacheFile() {
            File file = new File(FileUtils.getAppFilesDir(MiJiaEnvironment.getAppContext()) + ((Object) File.separator) + "_StateHolder");
            if (!file.exists()) {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdir();
                }
                try {
                    file.createNewFile();
                } catch (Throwable th) {
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, StateHolderImpl.TAG, Log.getStackTraceString(th));
                }
            }
            return file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getStateName(byte type) {
            if (type == -1) {
                return " invalid ";
            }
            if (type == 0) {
                return " init ";
            }
            if (type == 1) {
                return " loaded ";
            }
            if (type == 2) {
                return " check ";
            }
            if (type == 3) {
                return " modify ";
            }
            return type == 4 ? " saved " : Intrinsics.stringPlus(" type ", Byte.valueOf(type));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTypeName(byte type) {
            if (type == 4) {
                return "type_push";
            }
            if (type == 5) {
                return "type_get";
            }
            if (type == 2) {
                return "set_success";
            }
            if (type == 1) {
                return "set_request";
            }
            if (type == 3 || type < 0) {
                return "set_fail";
            }
            return "TYPE_SET_FAIL(" + ((int) type) + ')';
        }
    }

    private final long checkTime(long time, byte type) {
        if (time > 0) {
            return NumberUtils.checkTime(time);
        }
        if (type == 2 || type == 1) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    private final void dispatchStateChange(String did, String prop, Object value, long time, byte type) {
        this.state = (byte) 3;
        int size = this.mStateChangedListener.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            this.mStateChangedListener.get(size).onStateChanged(did, prop, value, time, type);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    private final void dispatchTimeChange(String did, String prop, Object value, long time, byte type) {
        this.state = (byte) 3;
        int size = this.mStateChangedListener.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            this.mStateChangedListener.get(size).onTimeChanged(did, prop, value, time, type);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadPropsFromLocal$lambda-2, reason: not valid java name */
    public static final Map m850loadPropsFromLocal$lambda2(Parcel parcel) {
        return ParcelUtils.readStringMap(parcel, Collections.synchronizedMap(new ArrayMap()), new ParcelUtils.ValueReader() { // from class: mco
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueReader
            public final Object readValue(Parcel parcel2) {
                return StateHolderImpl.m851loadPropsFromLocal$lambda2$lambda1(parcel2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadPropsFromLocal$lambda-2$lambda-1, reason: not valid java name */
    public static final ValueEntry m851loadPropsFromLocal$lambda2$lambda1(Parcel parcel) {
        return (ValueEntry) (parcel == null ? null : parcel.readParcelable(ValueEntry.class.getClassLoader()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerStateChangedListener$lambda-0, reason: not valid java name */
    public static final void m852registerStateChangedListener$lambda0(StateHolderImpl this$0, OnStateChangedListener onStateChangedListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mStateChangedListener.remove(onStateChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: savePropsCache$lambda-5, reason: not valid java name */
    public static final void m853savePropsCache$lambda5(StateHolderImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        ParcelUtils.writeStringMap(parcelObtain, this$0.mPropsMap, new ParcelUtils.ValueWriter() { // from class: nco
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueWriter
            public final void writeValue(Parcel parcel, Object obj) {
                StateHolderImpl.m854savePropsCache$lambda5$lambda4(parcel, (Map) obj);
            }
        });
        FileUtils.writeFile(INSTANCE.getCacheFile(), parcelObtain.marshall());
        parcelObtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: savePropsCache$lambda-5$lambda-4, reason: not valid java name */
    public static final void m854savePropsCache$lambda5$lambda4(Parcel parcel, Map map) {
        ParcelUtils.writeStringMap(parcel, map, new ParcelUtils.ValueWriter() { // from class: oco
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueWriter
            public final void writeValue(Parcel parcel2, Object obj) {
                StateHolderImpl.m855savePropsCache$lambda5$lambda4$lambda3(parcel2, (ValueEntry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: savePropsCache$lambda-5$lambda-4$lambda-3, reason: not valid java name */
    public static final void m855savePropsCache$lambda5$lambda4$lambda3(Parcel pInner, ValueEntry valueEntry) {
        Intrinsics.checkNotNullParameter(pInner, "pInner");
        pInner.writeParcelable(valueEntry, 0);
    }

    @NotNull
    public final Map<String, Map<String, ValueEntry>> getMPropsMap() {
        return this.mPropsMap;
    }

    @Override // com.xiaomi.smarthome.state.IStateHolder
    @Nullable
    public ValueEntry getProp(@Nullable String did, @Nullable String prop) {
        Map<String, ValueEntry> propsMap;
        if (TextUtils.isEmpty(did) || TextUtils.isEmpty(prop) || (propsMap = getPropsMap(did)) == null) {
            return null;
        }
        return propsMap.get(prop);
    }

    @Override // com.xiaomi.smarthome.state.IStateHolder
    @Nullable
    public Map<String, ValueEntry> getPropsMap(@Nullable String did) {
        try {
            Map<String, ValueEntry> map = this.mPropsMap.get(did);
            if (map != null || this.state != 0) {
                return map;
            }
            loadPropsFromLocal();
            return this.mPropsMap.get(did);
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.CARD, this.tag, this.mPropsMap + Log.getStackTraceString(e));
            return null;
        }
    }

    @Override // com.xiaomi.smarthome.state.IStateHolder
    public void loadPropsFromLocal() {
        byte b2 = this.state;
        if (b2 >= 1) {
            MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, Intrinsics.stringPlus("loadPropsFromLocal skip state ", INSTANCE.getStateName(b2)));
            return;
        }
        this.state = (byte) 1;
        File cacheFile = INSTANCE.getCacheFile();
        Parcel parcel = FileUtils.readParcel(cacheFile);
        if (parcel == null) {
            MiJiaLog.onlyLogcat(6, this.tag, Intrinsics.stringPlus("loadPropsFromLocal file:", cacheFile));
            return;
        }
        ParcelUtils.readStringMap(parcel, this.mPropsMap, new ParcelUtils.ValueReader() { // from class: lco
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.ParcelUtils.ValueReader
            public final Object readValue(Parcel parcel2) {
                return StateHolderImpl.m850loadPropsFromLocal$lambda2(parcel2);
            }
        });
        MiJiaLog.onlyLogcat(this.tag, "loadPropsFromLocal refresh propSize:" + this.mPropsMap.size() + " file:" + cacheFile);
    }

    @Override // com.xiaomi.smarthome.state.IStateHolder
    @Nullable
    public Object notifyPropChangedListener(@Nullable String did, @Nullable String prop, @Nullable Object value, long time, byte type) {
        Object obj;
        Object obj2;
        long jCheckTime = checkTime(time, type);
        if (TextUtils.isEmpty(prop)) {
            dispatchStateChange(did, prop, value, jCheckTime, type);
            MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener no prop " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
            return null;
        }
        Map<String, ValueEntry> propsMap = getPropsMap(did);
        if (propsMap == null) {
            Map<String, ValueEntry> mapSynchronizedMap = Collections.synchronizedMap(new ArrayMap());
            this.mPropsMap.put(did, mapSynchronizedMap);
            mapSynchronizedMap.put(prop, ValueEntry.create(type, value, jCheckTime));
            if (value != null) {
                dispatchStateChange(did, prop, value, jCheckTime, type);
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state no cache device " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
            } else if (jCheckTime > 0) {
                dispatchTimeChange(did, prop, value, jCheckTime, type);
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time no cache device " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
            }
            return null;
        }
        ValueEntry valueEntry = propsMap.get(prop);
        if (valueEntry == null) {
            propsMap.put(prop, ValueEntry.create(type, value, jCheckTime));
            if (value != null) {
                dispatchStateChange(did, prop, value, jCheckTime, type);
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state no cache prop " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
            } else if (jCheckTime > 0) {
                dispatchTimeChange(did, prop, value, jCheckTime, type);
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time no cache prop " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
            } else {
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener error " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
            }
            return null;
        }
        Object value2 = valueEntry.getValue();
        long j = valueEntry.time;
        if (Intrinsics.areEqual(value2, value)) {
            obj = value2;
            if (jCheckTime == 0 || j == jCheckTime) {
                valueEntry.setType(type);
                MiJiaLog.writeLogOnGrey(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener ignore same " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + j);
                return obj;
            }
            if (type == 5 || type == 4) {
                if (valueEntry.getType() == 1) {
                    if (System.currentTimeMillis() - j > 10000) {
                        valueEntry.setType(type);
                        valueEntry.time = jCheckTime;
                        valueEntry.typeIgnore = (byte) 0;
                        valueEntry.valueIgnore = null;
                        valueEntry.timeIgnore = 0L;
                        dispatchTimeChange(did, prop, value, jCheckTime, type);
                        MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time error " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + j);
                    } else {
                        MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time ignore " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + j);
                        valueEntry.typeIgnore = type;
                        valueEntry.valueIgnore = value;
                        valueEntry.timeIgnore = jCheckTime;
                    }
                } else {
                    if (j <= jCheckTime) {
                        byte type2 = valueEntry.getType();
                        valueEntry.setType(type);
                        valueEntry.time = jCheckTime;
                        valueEntry.typeIgnore = (byte) 0;
                        valueEntry.valueIgnore = null;
                        valueEntry.timeIgnore = 0L;
                        if (type2 == 2 && type == 4 && jCheckTime - j < 5000) {
                            MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time ignore set-push " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + j);
                            return obj;
                        }
                        dispatchTimeChange(did, prop, value, jCheckTime, type);
                        MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + j);
                        return obj;
                    }
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time ignore value because cache bigger " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + j);
                }
            } else if (type == 2) {
                valueEntry.time = jCheckTime;
                valueEntry.setType(type);
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time update " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + j);
            } else {
                valueEntry.setType(type);
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener time ignore " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + j);
            }
        } else if (type == 5 || type == 4) {
            obj = value2;
            if (valueEntry.getType() == 1) {
                if (System.currentTimeMillis() - j > 10000) {
                    valueEntry.setType(type);
                    valueEntry.setValue(value);
                    valueEntry.time = jCheckTime;
                    valueEntry.typeIgnore = (byte) 0;
                    valueEntry.valueIgnore = null;
                    valueEntry.timeIgnore = 0L;
                    dispatchStateChange(did, prop, value, jCheckTime, type);
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state error " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + obj + '/' + j);
                } else {
                    valueEntry.typeIgnore = type;
                    valueEntry.valueIgnore = value;
                    valueEntry.timeIgnore = jCheckTime;
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state ignore " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + obj + '/' + j);
                }
            } else if (jCheckTime == 0 || j <= jCheckTime) {
                valueEntry.setType(type);
                valueEntry.setValue(value);
                valueEntry.time = jCheckTime;
                valueEntry.typeIgnore = (byte) 0;
                valueEntry.valueIgnore = null;
                valueEntry.timeIgnore = 0L;
                dispatchStateChange(did, prop, value, jCheckTime, type);
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + obj + '/' + j);
            } else {
                MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state ignore value because cache bigger " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value + '/' + jCheckTime + " old=" + obj + '/' + j);
            }
        } else {
            if (type != 3 && type >= 0) {
                if (type == 1) {
                    byte type3 = valueEntry.getType();
                    valueEntry.typeIgnore = type3;
                    valueEntry.valueIgnore = value2;
                    valueEntry.timeIgnore = j;
                    valueEntry.setType(type);
                    valueEntry.setValue(value);
                    valueEntry.time = jCheckTime;
                    if (type3 >= 0 && type3 != 3) {
                        valueEntry.setType(type);
                    }
                    dispatchStateChange(did, prop, value, jCheckTime, type);
                    LogType logType = LogType.DEVICE_CONTROL;
                    String str = this.tag;
                    StringBuilder sb = new StringBuilder();
                    sb.append("notifyPropChangedListener state cur=");
                    Companion companion = INSTANCE;
                    sb.append(companion.getTypeName(type));
                    sb.append(" old=");
                    sb.append(companion.getTypeName(type3));
                    sb.append(' ');
                    sb.append((Object) did);
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append((Object) prop);
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(value);
                    sb.append('/');
                    sb.append(jCheckTime);
                    sb.append(" old=");
                    sb.append(value2);
                    sb.append('/');
                    sb.append(j);
                    MiJiaLog.writeLogOnAll(logType, str, sb.toString());
                    return value2;
                }
                byte type4 = valueEntry.getType();
                valueEntry.setType(type);
                valueEntry.time = jCheckTime;
                valueEntry.typeIgnore = (byte) 0;
                valueEntry.valueIgnore = null;
                valueEntry.timeIgnore = 0L;
                if (value == null || Intrinsics.areEqual(value, value2)) {
                    obj2 = value2;
                    LogType logType2 = LogType.DEVICE_CONTROL;
                    String str2 = this.tag;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("notifyPropChangedListener state ignore cur=");
                    Companion companion2 = INSTANCE;
                    sb2.append(companion2.getTypeName(type));
                    sb2.append(" old=");
                    sb2.append(companion2.getTypeName(type4));
                    sb2.append(' ');
                    sb2.append((Object) did);
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append((Object) prop);
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(value);
                    MiJiaLog.writeLogOnAll(logType2, str2, sb2.toString());
                } else {
                    valueEntry.setValue(value);
                    obj2 = value2;
                    dispatchStateChange(did, prop, value, jCheckTime, type);
                    LogType logType3 = LogType.DEVICE_CONTROL;
                    String str3 = this.tag;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("notifyPropChangedListener state cur=");
                    Companion companion3 = INSTANCE;
                    sb3.append(companion3.getTypeName(type));
                    sb3.append(" old=");
                    sb3.append(companion3.getTypeName(type4));
                    sb3.append(' ');
                    sb3.append((Object) did);
                    sb3.append(AbstractJsonLexerKt.COLON);
                    sb3.append((Object) prop);
                    sb3.append(AbstractJsonLexerKt.COLON);
                    sb3.append(value);
                    MiJiaLog.writeLogOnAll(logType3, str3, sb3.toString());
                }
                return obj2;
            }
            valueEntry.setType(type);
            Object obj3 = valueEntry.valueIgnore;
            if (obj3 == null) {
                obj = value2;
                if (Intrinsics.areEqual(obj, value)) {
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state ignore old null " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
                } else {
                    valueEntry.setType(type);
                    valueEntry.setValue(value);
                    valueEntry.time = jCheckTime;
                    dispatchStateChange(did, prop, value, jCheckTime, type);
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state old=null " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
                }
            } else {
                obj = value2;
                if (Intrinsics.areEqual(obj, obj3)) {
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state ignore same " + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + value);
                } else {
                    valueEntry.setType(valueEntry.typeIgnore);
                    valueEntry.setValue(valueEntry.valueIgnore);
                    valueEntry.time = valueEntry.timeIgnore;
                    dispatchStateChange(did, prop, valueEntry.getValue(), jCheckTime, type);
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "notifyPropChangedListener state use old=" + valueEntry.valueIgnore + ' ' + INSTANCE.getTypeName(type) + ' ' + ((Object) did) + AbstractJsonLexerKt.COLON + ((Object) prop) + AbstractJsonLexerKt.COLON + obj);
                }
            }
        }
        return obj;
    }

    @Override // com.xiaomi.smarthome.state.IStateHolder
    public void registerStateChangedListener(@Nullable final OnStateChangedListener l) throws RemoteException {
        if (l == null || this.mStateChangedListener.contains(l)) {
            return;
        }
        this.mStateChangedListener.add(l);
        IBinder iBinderAsBinder = l.asBinder();
        if (iBinderAsBinder == null) {
            return;
        }
        iBinderAsBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: kco
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                StateHolderImpl.m852registerStateChangedListener$lambda0(this.f23723a, l);
            }
        }, 0);
    }

    @Override // com.xiaomi.smarthome.state.IStateHolder
    public void removePropMap(@Nullable String did) {
        this.mPropsMap.remove(did);
    }

    @Override // com.xiaomi.smarthome.state.IStateHolder
    public void savePropsCache() {
        if (this.state != 3) {
            MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "savePropsCache not modify size:" + this.mPropsMap.size() + " state " + INSTANCE.getStateName(this.state));
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, this.tag, "savePropsCache size:" + this.mPropsMap.size() + " state:" + INSTANCE.getStateName(this.state));
        this.state = (byte) 4;
        GlobalHandlerManager.getInstance().getGlobalWorkerHandler().post(new Runnable() { // from class: pco
            @Override // java.lang.Runnable
            public final void run() {
                StateHolderImpl.m853savePropsCache$lambda5(this.f30258a);
            }
        });
    }
}
