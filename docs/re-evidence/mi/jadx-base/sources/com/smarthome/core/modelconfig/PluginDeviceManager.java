package com.smarthome.core.modelconfig;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.smarthome.core.modelconfig.PluginDeviceManager;
import com.xiaomi.fitness.settingitem.BaseSettingRequestHelper;
import com.xiaomi.smarthome.IReadyCallback;
import com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.CoreError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BtConstants;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.common.util.CloseUtils;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.newui.utils.NumberUtils;
import com.xiaomi.smarthome.utils.UpdateWatcher;
import com.xiaomi.smarthome.utils.Watcher;
import defpackage.b7g;
import defpackage.l1i;
import defpackage.o1i;
import defpackage.p1i;
import defpackage.q1i;
import defpackage.quc;
import defpackage.sbq;
import defpackage.wb6;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\f\u0018\u0000 j2\u00020\u0001:\u0001jB\u0019\b\u0002\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bh\u0010iJ!\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\u001f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u001eJ5\u0010$\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010%\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010&\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010\u001eJ'\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00020\u0016H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\f2\u0006\u00105\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u000106¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0017¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\f¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00010\u00172\b\u0010>\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u0004\u0018\u00010\u00172\u0006\u0010>\u001a\u00020\u0016¢\u0006\u0004\bA\u0010@J\u0019\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u0004\u0018\u00010\u00162\u0006\u0010D\u001a\u00020\n¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00162\b\u0010I\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\f¢\u0006\u0004\bL\u0010=J\u0017\u0010N\u001a\u0004\u0018\u00010\u00162\u0006\u0010M\u001a\u00020\u0019¢\u0006\u0004\bN\u0010OJ%\u0010S\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u00022\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\n0QH\u0016¢\u0006\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R[\u0010c\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00160\u0016\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00170\u0017 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00160\u0016\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00170\u0017\u0018\u00010\u00150_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010CR\u001b\u0010g\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010a\u001a\u0004\be\u0010f¨\u0006k"}, d2 = {"Lcom/smarthome/core/modelconfig/PluginDeviceManager;", "Lcom/xiaomi/smarthome/IReadyCallback;", "", "reset", "Lcom/smarthome/core/modelconfig/PluginDeviceState;", "kotlin.jvm.PlatformType", "getStateWithAccount", "(Z)Lcom/smarthome/core/modelconfig/PluginDeviceState;", "state", "Landroidx/core/util/Consumer;", "", "callback", "", "initPluginConfigFromLocal", "(Lcom/smarthome/core/modelconfig/PluginDeviceState;Landroidx/core/util/Consumer;)V", "Lq1i;", "result", "parseLanguage", "Landroid/util/Pair;", "parseConfigInfo", "(Lcom/smarthome/core/modelconfig/PluginDeviceState;Lq1i;I)Landroid/util/Pair;", "", "", "Lcom/smarthome/core/modelconfig/PluginDeviceInfo;", "deviceInfoMap", "", "time", "addDeviceInfoInternal", "(Lcom/smarthome/core/modelconfig/PluginDeviceState;Ljava/util/Map;J)V", "clearDeviceInfoInternal", "(Lcom/smarthome/core/modelconfig/PluginDeviceState;)V", "saveDeviceInfoPrefInternal", "(Lcom/smarthome/core/modelconfig/PluginDeviceState;Ljava/util/Map;)Z", "readDeviceBasefInternal", "developerInfoMap", "updatetime", "addDeveloperInfoInternal", "clearDeveloperInfoInternal", "saveDeveloperInfoPrefInternal", "(Lcom/smarthome/core/modelconfig/PluginDeviceState;)Z", "readDeveloperInfoPrefInternal", "caseLocale", "type", "Ljava/io/File;", "getConfigFile", "(Lcom/smarthome/core/modelconfig/PluginDeviceState;ZLjava/lang/String;)Ljava/io/File;", "deviceListChanged", "developerListChanged", "onPluginChanged", "(ZZ)V", "str", "writeLog", "(Ljava/lang/String;)V", "isForce", "Lsbq;", "updateConfig", "(ZLsbq;)V", "info", "readDeviceOtherfInternal", "(Lcom/smarthome/core/modelconfig/PluginDeviceInfo;)V", "clearConfig", "()V", "model", "getPluginInfo", "(Ljava/lang/String;)Lcom/smarthome/core/modelconfig/PluginDeviceInfo;", "getExtraPluginInfo", "getPluginInfoMap", "()Ljava/util/Map;", "productId", "getModelByProductId", "(I)Ljava/lang/String;", "getProductIdByModel", "(Ljava/lang/String;)I", "ssid", "getModelBySSID", "(Ljava/lang/String;)Ljava/lang/String;", "dumpPlugin", "id", "getDeveloperInfo", "(J)Ljava/lang/String;", "autoRequest", "Lcom/xiaomi/smarthome/utils/Watcher;", "runnable", "isReadyListener", "(ZLcom/xiaomi/smarthome/utils/Watcher;)V", "Lquc;", "api", "Lquc;", "Landroid/content/Context;", "mAppContext", "Landroid/content/Context;", "Lcom/xiaomi/smarthome/utils/UpdateWatcher;", "Lcom/smarthome/core/modelconfig/ConfigChangeInfo;", "changeObservable", "Lcom/xiaomi/smarthome/utils/UpdateWatcher;", "", "mExtraDeviceInfoMap$delegate", "Lkotlin/Lazy;", "getMExtraDeviceInfoMap", "mExtraDeviceInfoMap", "mAppFilesDir$delegate", "getMAppFilesDir", "()Ljava/lang/String;", "mAppFilesDir", "<init>", "(Lquc;Landroid/content/Context;)V", "Companion", "smarthome-core_release"}, k = 1, mv = {1, 6, 0})
public final class PluginDeviceManager implements IReadyCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DB_DEVICE_VERSION = 1;
    private static final int MILLISECOND_OF_HOUR = 3600000;

    @NotNull
    private static final String PLUGIN_DEVELOPER_LIST_PREF = "_dlp_xwxz3n";

    @NotNull
    private static final String PLUGIN_DEVICE_LIST_PREF = "_deb_85s22e";

    @NotNull
    private static final String PLUGIN_DEVICE_OTHER_PREF = "_deo_85s22e";

    @NotNull
    private static final String SPLIT = "_";
    private static final int STATE_CACHE_ASSET = 1;
    private static final int STATE_CACHE_NO = 0;
    private static final int STATE_CACHE_PARCEL = 2;

    @NotNull
    private static final String TAG = "PluginDeviceManager";
    public static PluginDeviceManager instance;

    @NotNull
    private final quc api;

    @NotNull
    private final UpdateWatcher<ConfigChangeInfo> changeObservable;

    @NotNull
    private final Context mAppContext;

    /* JADX INFO: renamed from: mAppFilesDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAppFilesDir;

    /* JADX INFO: renamed from: mExtraDeviceInfoMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mExtraDeviceInfoMap;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/smarthome/core/modelconfig/PluginDeviceManager$Companion;", "", "()V", "DB_DEVICE_VERSION", "", "MILLISECOND_OF_HOUR", "PLUGIN_DEVELOPER_LIST_PREF", "", "PLUGIN_DEVICE_LIST_PREF", "PLUGIN_DEVICE_OTHER_PREF", "SPLIT", "STATE_CACHE_ASSET", "STATE_CACHE_NO", "STATE_CACHE_PARCEL", "TAG", "instance", "Lcom/smarthome/core/modelconfig/PluginDeviceManager;", "getInstance$annotations", "getInstance", "()Lcom/smarthome/core/modelconfig/PluginDeviceManager;", "setInstance", "(Lcom/smarthome/core/modelconfig/PluginDeviceManager;)V", "init", "", "context", "Landroid/content/Context;", "smarthome-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final PluginDeviceManager getInstance() {
            PluginDeviceManager pluginDeviceManager = PluginDeviceManager.instance;
            if (pluginDeviceManager != null) {
                return pluginDeviceManager;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            return null;
        }

        public final void init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            l1i l1iVarD = l1i.d(context);
            Intrinsics.checkNotNullExpressionValue(l1iVarD, "getInstance(context)");
            setInstance(new PluginDeviceManager(l1iVarD, context, null));
        }

        public final void setInstance(@NotNull PluginDeviceManager pluginDeviceManager) {
            Intrinsics.checkNotNullParameter(pluginDeviceManager, "<set-?>");
            PluginDeviceManager.instance = pluginDeviceManager;
        }
    }

    public /* synthetic */ PluginDeviceManager(quc qucVar, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(qucVar, context);
    }

    private final void addDeveloperInfoInternal(PluginDeviceState state, Map<Long, String> developerInfoMap, long updatetime) {
        state.getDeveloperInfoMap().putAll(developerInfoMap);
        state.setDeveloperInfoLastModify(updatetime);
    }

    private final void addDeviceInfoInternal(PluginDeviceState state, Map<String, ? extends PluginDeviceInfo> deviceInfoMap, long time) {
        state.getDeviceInfoMap().putAll(deviceInfoMap);
        state.setDeviceInfoLastModify(time);
    }

    private final void clearDeveloperInfoInternal(PluginDeviceState state) {
        state.getDeveloperInfoMap().clear();
        state.setDeveloperInfoLastModify(0L);
        writeLog("clearDeveloperInfoInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearDeviceInfoInternal(PluginDeviceState state) {
        state.getDeviceInfoMap().clear();
        state.setDeviceInfoLastModify(0L);
        writeLog("clearDeviceInfoInternal");
    }

    private final File getConfigFile(PluginDeviceState state, boolean caseLocale, String type) {
        ServerBean server = state.getServer();
        if (!caseLocale) {
            return new File(getMAppFilesDir(), state.getMiId() + ((Object) server.machineCode) + type + Build.VERSION.SDK_INT);
        }
        Locale locale = state.getLocale();
        return new File(getMAppFilesDir(), state.getMiId() + ((Object) server.machineCode) + '_' + ((Object) locale.getLanguage()) + '_' + ((Object) locale.getCountry()) + type + Build.VERSION.SDK_INT);
    }

    @NotNull
    public static final PluginDeviceManager getInstance() {
        return INSTANCE.getInstance();
    }

    private final String getMAppFilesDir() {
        return (String) this.mAppFilesDir.getValue();
    }

    private final Map<String, PluginDeviceInfo> getMExtraDeviceInfoMap() {
        return (Map) this.mExtraDeviceInfoMap.getValue();
    }

    private final PluginDeviceState getStateWithAccount(boolean reset) {
        return this.api.a(reset);
    }

    public static /* synthetic */ PluginDeviceState getStateWithAccount$default(PluginDeviceManager pluginDeviceManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return pluginDeviceManager.getStateWithAccount(z);
    }

    private final void initPluginConfigFromLocal(final PluginDeviceState state, final Consumer<Integer> callback) {
        String strLoadJSONFromAsset;
        boolean z;
        if (!state.getDeviceInfoMap().isEmpty() && !state.getDeveloperInfoMap().isEmpty()) {
            callback.accept(2);
            return;
        }
        try {
            ServerBean server = state.getServer();
            Locale locale = state.getLocale();
            String[] list = this.mAppContext.getAssets().list("device_config");
            if (list == null) {
                writeLog("PluginManager.initPluginConfigFromLocal cache deviceConfigs = null");
                callback.accept(0);
                return;
            }
            String str = server.machineCode;
            if (Intrinsics.areEqual(str, "st")) {
                str = "cn";
            }
            Iterator it = ArrayIteratorKt.iterator(list);
            while (true) {
                strLoadJSONFromAsset = null;
                if (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2 != null && StringsKt__StringsJVMKt.startsWith$default(str2, Intrinsics.stringPlus("plugin_config_", str), false, 2, null)) {
                        strLoadJSONFromAsset = FileUtils.loadJSONFromAsset(this.mAppContext, "device_config" + ((Object) File.separator) + ((Object) str2));
                        Object[] array = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"-"}, false, 0, 6, (Object) null).toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        String str3 = ((String[]) array)[1];
                        String str4 = locale.getLanguage() + '_' + ((Object) locale.getCountry());
                        Locale locale2 = Locale.ROOT;
                        String lowerCase = str4.toLowerCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!Intrinsics.areEqual(str3, lowerCase)) {
                            String language = locale.getLanguage();
                            Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                            String lowerCase2 = language.toLowerCase(locale2);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (Intrinsics.areEqual(str2, lowerCase2)) {
                                break;
                            }
                        }
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
            }
            if (strLoadJSONFromAsset != null && strLoadJSONFromAsset.length() != 0) {
                parseConfigInfo(state, q1i.c(new JSONObject(strLoadJSONFromAsset).optJSONObject("result"), state.getDeviceInfoMap().isEmpty(), state.getDeveloperInfoMap().isEmpty()), z ? 3 : 1);
                writeLog("PluginManager.initPluginConfigFromLocal cache assets state.mDeviceInfoMap:" + state.getDeviceInfoMap().size() + " state.mDeveloperInfoMap:" + state.getDeveloperInfoMap().size() + " matchLanguage:" + z);
                if (z) {
                    callback.accept(1);
                    return;
                } else {
                    this.api.c(state, SystemApi.getInstance().getAppVersionCode(this.mAppContext), SystemApi.getInstance().getPlatform(), new CoreAsyncCallback<HashMap<String, wb6>, CoreError>() { // from class: com.smarthome.core.modelconfig.PluginDeviceManager$initPluginConfigFromLocal$coreAsyncCallback$1
                        @Override // com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback
                        public void onFailure(@Nullable CoreError error) {
                            this.writeLog(Intrinsics.stringPlus("PluginManager.initPluginConfigFromLocal getLanguageConfig fail error:", error));
                            this.clearDeviceInfoInternal(state);
                            callback.accept(0);
                        }

                        @Override // com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback
                        public void onSuccess(@Nullable HashMap<String, wb6> result) {
                            if (result == null || result.size() < state.getDeviceInfoMap().size()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("size different language:");
                                sb.append(result == null ? null : Integer.valueOf(result.size()));
                                sb.append(" deviceInfo:");
                                sb.append(state.getDeviceInfoMap().size());
                                onFailure(new CoreError(-1, sb.toString()));
                                return;
                            }
                            Map<String, PluginDeviceInfo> deviceInfoMap = state.getDeviceInfoMap();
                            Intrinsics.checkNotNullExpressionValue(deviceInfoMap, "state.deviceInfoMap");
                            for (Map.Entry<String, PluginDeviceInfo> entry : deviceInfoMap.entrySet()) {
                                String key = entry.getKey();
                                PluginDeviceInfo value = entry.getValue();
                                wb6 wb6Var = result.get(key);
                                if (wb6Var == null) {
                                    onFailure(new CoreError(-1, Intrinsics.stringPlus("deviceInfo = null model:", key)));
                                    return;
                                }
                                b7g.d(wb6Var, 2, value);
                            }
                            PluginDeviceManager pluginDeviceManager = this;
                            PluginDeviceState pluginDeviceState = state;
                            Map<String, PluginDeviceInfo> deviceInfoMap2 = pluginDeviceState.getDeviceInfoMap();
                            Intrinsics.checkNotNullExpressionValue(deviceInfoMap2, "state.deviceInfoMap");
                            pluginDeviceManager.saveDeviceInfoPrefInternal(pluginDeviceState, deviceInfoMap2);
                            this.writeLog("PluginManager.initPluginConfigFromLocal getLanguageConfig onSuccess");
                            callback.accept(1);
                        }
                    });
                    return;
                }
            }
            writeLog("PluginManager.initPluginConfigFromLocal cache no content empty deviceConfigs");
            callback.accept(0);
        } catch (Exception unused) {
            callback.accept(0);
        }
    }

    private final void onPluginChanged(boolean deviceListChanged, boolean developerListChanged) {
        this.changeObservable.dispatchUpdate(new ConfigChangeInfo(deviceListChanged, developerListChanged));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Boolean, Boolean> parseConfigInfo(PluginDeviceState state, q1i result, int parseLanguage) {
        boolean z;
        HashMap<Long, String> map;
        HashMap<String, wb6> map2;
        if (result == null) {
            writeLog("parseConfigInfo result is null");
            return null;
        }
        p1i p1iVar = result.f30990a;
        boolean z2 = true;
        if (p1iVar == null || (map2 = p1iVar.c) == null || map2.size() == 0) {
            z = false;
        } else {
            if (result.b()) {
                clearDeviceInfoInternal(state);
            }
            HashMap map3 = new HashMap((int) (((double) result.f30990a.c.size()) / 0.75d));
            HashMap<String, wb6> map4 = result.f30990a.c;
            Intrinsics.checkNotNullExpressionValue(map4, "result.deviceInfo.mDeviceList");
            Iterator<Map.Entry<String, wb6>> it = map4.entrySet().iterator();
            while (it.hasNext()) {
                wb6 value = it.next().getValue();
                PluginDeviceInfo pluginDeviceInfo = state.getDeviceInfoMap().get(value.f37796a);
                if (pluginDeviceInfo == null) {
                    String str = value.f37796a;
                    Intrinsics.checkNotNullExpressionValue(str, "deviceResult.mModel");
                    PluginDeviceInfo pluginDeviceInfo2 = new PluginDeviceInfo();
                    map3.put(str, pluginDeviceInfo2);
                    pluginDeviceInfo = pluginDeviceInfo2;
                } else {
                    String str2 = value.f37796a;
                    Intrinsics.checkNotNullExpressionValue(str2, "deviceResult.mModel");
                    map3.put(str2, pluginDeviceInfo);
                }
                b7g.d(value, parseLanguage, pluginDeviceInfo);
            }
            addDeviceInfoInternal(state, map3, result.f30990a.f29910b);
            if (parseLanguage == 3) {
                saveDeviceInfoPrefInternal(state, map3);
            }
            z = true;
        }
        o1i o1iVar = result.f30991b;
        if (o1iVar == null || (map = o1iVar.c) == null || map.size() == 0) {
            z2 = false;
        } else {
            if (result.a()) {
                clearDeveloperInfoInternal(state);
            }
            HashMap map5 = new HashMap((int) (((double) result.f30991b.c.size()) / 0.75d));
            HashMap<Long, String> map6 = result.f30991b.c;
            Intrinsics.checkNotNullExpressionValue(map6, "result.developerInfo.mDeveloperList");
            for (Map.Entry<Long, String> entry : map6.entrySet()) {
                Long key = entry.getKey();
                String value2 = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                map5.put(key, value2);
            }
            addDeveloperInfoInternal(state, map5, result.f30991b.f28643b);
            saveDeveloperInfoPrefInternal(state);
        }
        writeLog("parseConfigInfo state.mDeviceInfoMap:" + state.getDeviceInfoMap().size() + " state.mDeveloperInfoMap:" + state.getDeveloperInfoMap().size() + " deviceLastModify:" + state.getDeviceInfoLastModify() + " developerLastModify:" + state.getDeveloperInfoLastModify() + " parseLanguage:" + parseLanguage);
        onPluginChanged(z, z2);
        return new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    private final void readDeveloperInfoPrefInternal(PluginDeviceState state) {
        Map<Long, String> developerInfoMap = state.getDeveloperInfoMap();
        Intrinsics.checkNotNullExpressionValue(developerInfoMap, "state.developerInfoMap");
        if (!developerInfoMap.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        File configFile = getConfigFile(state, false, PLUGIN_DEVELOPER_LIST_PREF);
        if (!configFile.exists()) {
            writeLog("readDeveloperInfoPrefInternal not exit");
            return;
        }
        byte[] file = FileUtils.readFile(configFile);
        if (file == null) {
            writeLog("error readDeveloperInfoPrefInternal md5 notmatch");
            return;
        }
        Parcel parcel = FileUtils.readParcel(file);
        if (parcel == null) {
            writeLog("error readDeveloperInfoPrefInternal parcel.unmarshall error");
            return;
        }
        try {
            int i = parcel.readInt();
            HashMap map = new HashMap((int) (((double) i) / 0.75d));
            int i2 = 0;
            while (i2 < i) {
                i2++;
                map.put(Long.valueOf(parcel.readLong()), parcel.readString());
            }
            addDeveloperInfoInternal(state, map, parcel.readLong());
            if (state.getDeveloperInfoLastModify() > state.getDeviceInfoLastModify()) {
                state.setLastCheckTime(parcel.readString());
            }
            onPluginChanged(false, true);
            writeLog("readDeveloperInfoPrefInternal state.mDeveloperInfoMap.size:" + state.getDeveloperInfoMap().size() + " mDeveloperInfoLastModify:" + state.getDeveloperInfoLastModify() + " time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            parcel.recycle();
        } catch (Throwable th) {
            try {
                writeLog(Intrinsics.stringPlus("error readDeveloperInfoPrefInternal parcel ", Log.getStackTraceString(th)));
                FileUtils.deleteFile(configFile);
            } finally {
                parcel.recycle();
            }
        }
    }

    private final void readDeviceBasefInternal(PluginDeviceState state) {
        Map<String, PluginDeviceInfo> deviceInfoMap = state.getDeviceInfoMap();
        Intrinsics.checkNotNullExpressionValue(deviceInfoMap, "state.deviceInfoMap");
        if (!deviceInfoMap.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!getConfigFile(state, true, PLUGIN_DEVICE_OTHER_PREF).exists()) {
            writeLog("readDeviceInfoPrefInternal not exit");
            return;
        }
        File configFile = getConfigFile(state, true, PLUGIN_DEVICE_LIST_PREF);
        if (!configFile.exists()) {
            writeLog("readDeviceInfoPrefInternal not exit");
            return;
        }
        byte[] file = FileUtils.readFile(configFile);
        if (file == null) {
            writeLog("error readDeviceInfoPrefInternal md5 notmatch");
            return;
        }
        Parcel parcel = FileUtils.readParcel(file);
        if (parcel == null) {
            writeLog("error readDeviceInfoPrefInternal parcel.unmarshall error");
            return;
        }
        try {
            int i = parcel.readInt();
            HashMap map = new HashMap((int) (((double) i) / 0.75d));
            int i2 = 0;
            while (i2 < i) {
                i2++;
                PluginDeviceInfo pluginDeviceInfoX = new PluginDeviceInfo().x(parcel);
                String strL = pluginDeviceInfoX.l();
                Intrinsics.checkNotNullExpressionValue(strL, "deviceInfo.model");
                map.put(strL, pluginDeviceInfoX);
            }
            addDeviceInfoInternal(state, map, parcel.readLong());
            if (state.getDeviceInfoLastModify() > state.getDeveloperInfoLastModify()) {
                state.setLastCheckTime(parcel.readString());
            }
            onPluginChanged(true, false);
            writeLog("readDeviceInfoPrefInternal state.mDeviceInfoMap.size:" + state.getDeviceInfoMap().size() + " state.mDeviceInfoLastModify:" + state.getDeviceInfoLastModify() + " time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            parcel.recycle();
        } catch (Throwable th) {
            try {
                writeLog(Intrinsics.stringPlus("error readDeviceInfoPrefInternal parcel ", Log.getStackTraceString(th)));
                FileUtils.deleteFile(configFile);
            } finally {
                parcel.recycle();
            }
        }
    }

    private final boolean saveDeveloperInfoPrefInternal(PluginDeviceState state) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        File configFile = getConfigFile(state, false, PLUGIN_DEVELOPER_LIST_PREF);
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        int size = state.getDeveloperInfoMap().size();
        try {
            parcelObtain.writeInt(size);
            Map<Long, String> developerInfoMap = state.getDeveloperInfoMap();
            Intrinsics.checkNotNullExpressionValue(developerInfoMap, "state.developerInfoMap");
            for (Map.Entry<Long, String> entry : developerInfoMap.entrySet()) {
                Long key = entry.getKey();
                String value = entry.getValue();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                parcelObtain.writeLong(key.longValue());
                parcelObtain.writeString(value);
            }
            parcelObtain.writeLong(state.getDeveloperInfoLastModify());
            parcelObtain.writeString(state.getLastCheckTime());
            return FileUtils.writeFile(configFile, parcelObtain.marshall());
        } finally {
            parcelObtain.recycle();
            writeLog("saveDeveloperInfoPrefInternal size:" + size + " time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean saveDeviceInfoPrefInternal(PluginDeviceState state, Map<String, ? extends PluginDeviceInfo> deviceInfoMap) {
        int size;
        if (deviceInfoMap.isEmpty()) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        File configFile = getConfigFile(state, true, PLUGIN_DEVICE_LIST_PREF);
        File configFile2 = getConfigFile(state, true, PLUGIN_DEVICE_OTHER_PREF);
        synchronized (this) {
            try {
                size = state.getDeviceInfoMap().size();
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(configFile2, (SQLiteDatabase.CursorFactory) null);
                sQLiteDatabaseOpenOrCreateDatabase.beginTransaction();
                try {
                    if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 1) {
                        sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE OtherConfig (a TEXT PRIMARY KEY , b TEXT, c TEXT,d TEXT, e TEXT, f TEXT, g TEXT);");
                        sQLiteDatabaseOpenOrCreateDatabase.setVersion(1);
                    }
                    parcelObtain.writeInt(size);
                    Map<String, PluginDeviceInfo> deviceInfoMap2 = state.getDeviceInfoMap();
                    Intrinsics.checkNotNullExpressionValue(deviceInfoMap2, "state.deviceInfoMap");
                    for (Map.Entry<String, PluginDeviceInfo> entry : deviceInfoMap2.entrySet()) {
                        String key = entry.getKey();
                        PluginDeviceInfo value = entry.getValue();
                        value.N0(parcelObtain);
                        if (deviceInfoMap.get(key) != null) {
                            sQLiteDatabaseOpenOrCreateDatabase.execSQL("INSERT OR REPLACE INTO OtherConfig ( a, b, c, d,e, f, g ) VALUES (?,?,?,?,?,?,?);", new Object[]{value.l(), value.d(), value.h(), value.f(), value.g(), value.e(), value.j()});
                        }
                    }
                    parcelObtain.writeLong(state.getDeviceInfoLastModify());
                    parcelObtain.writeString(state.getLastCheckTime());
                    sQLiteDatabaseOpenOrCreateDatabase.setTransactionSuccessful();
                    sQLiteDatabaseOpenOrCreateDatabase.endTransaction();
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    sQLiteDatabaseOpenOrCreateDatabase.endTransaction();
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        writeLog("saveDeviceInfoPrefInternal size:" + size + ' ' + deviceInfoMap.size() + " time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return FileUtils.writeFile(configFile, bArrMarshall);
    }

    public static final void setInstance(@NotNull PluginDeviceManager pluginDeviceManager) {
        INSTANCE.setInstance(pluginDeviceManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateConfig$lambda-0, reason: not valid java name */
    public static final void m202updateConfig$lambda0(final PluginDeviceState pluginDeviceState, final PluginDeviceManager this$0, boolean z, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        final String lastCheckTime = pluginDeviceState.getLastCheckTime();
        int appVersionCode = SystemApi.getInstance().getAppVersionCode(this$0.mAppContext);
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append('_');
        sb.append(appVersionCode);
        String string = sb.toString();
        int size = pluginDeviceState.getDeviceInfoMap().size();
        int size2 = pluginDeviceState.getDeveloperInfoMap().size();
        if (size == 0 || size2 == 0 || i == 0) {
            appVersionCode = appVersionCode;
            this$0.writeLog("updatePluginConfigInternal no cache hasCache:" + i + " deviceInfo:" + size + " developerInfo:" + size2);
        } else if (z) {
            pluginDeviceState.getUpdateState().onSuccessCache(false, false);
            appVersionCode = appVersionCode;
        } else {
            List listSplit$default = lastCheckTime == null ? null : StringsKt__StringsKt.split$default((CharSequence) lastCheckTime, new String[]{"_"}, false, 0, 6, (Object) null);
            if (listSplit$default != null && listSplit$default.size() == 2) {
                Lifecycle.State currentState = ProcessLifecycleOwner.get().getLifecycle().getState();
                Intrinsics.checkNotNullExpressionValue(currentState, "get().lifecycle.currentState");
                long jValueOf = NumberUtils.valueOf(listSplit$default.get(0), 0L);
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if ((currentState == state && jCurrentTimeMillis < ((long) BaseSettingRequestHelper.UPDATE_SETTING_INTERVAL) + jValueOf) || (currentState != state && jCurrentTimeMillis < jValueOf + ((long) 86400000))) {
                    pluginDeviceState.getUpdateState().onFailure(new CoreError(-1, "no need update"));
                    this$0.writeLog("updatePluginConfigInternal checked lastTime:" + ((Object) lastCheckTime) + " current:" + string + " deviceInfo:" + size + " developerInfo:" + size2);
                    return;
                }
            }
        }
        pluginDeviceState.setLastCheckTime(string);
        String platform = SystemApi.getInstance().getPlatform();
        this$0.writeLog("updatePluginConfigInternal request deviceInfoMap.size:" + size + " developerInfoMap.size:" + size2 + " deviceListLastModify:" + pluginDeviceState.getDeviceInfoLastModify() + "  developerInfoLastModify:" + pluginDeviceState.getDeveloperInfoLastModify() + " hasCache:" + i);
        final Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        this$0.api.b(pluginDeviceState, appVersionCode, platform, new CoreAsyncCallback<q1i, CoreError>(looperMyLooper) { // from class: com.smarthome.core.modelconfig.PluginDeviceManager$updateConfig$1$coreAsyncCallback$1
            @Override // com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback
            public void onFailure(@Nullable CoreError error) {
                this.this$0.writeLog(Intrinsics.stringPlus("getPluginConfigNew onFailure Update All Plugin Record - ", error));
                pluginDeviceState.setLastCheckTime(lastCheckTime);
                pluginDeviceState.getUpdateState().onFailure(error);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback
            public void onSuccess(@Nullable q1i result) {
                PluginDeviceManager pluginDeviceManager = this.this$0;
                PluginDeviceState state2 = pluginDeviceState;
                Intrinsics.checkNotNullExpressionValue(state2, "state");
                Pair configInfo = pluginDeviceManager.parseConfigInfo(state2, result, 3);
                if (configInfo == null) {
                    pluginDeviceState.getUpdateState().onFailure(new CoreError(-1, "result is null"));
                    return;
                }
                UpdateState updateState = pluginDeviceState.getUpdateState();
                Object obj = configInfo.first;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.first");
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = configInfo.second;
                Intrinsics.checkNotNullExpressionValue(obj2, "pair.second");
                updateState.onSuccess(zBooleanValue, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeLog(String str) {
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, str);
    }

    public final void clearConfig() {
        getStateWithAccount(true);
    }

    public final void dumpPlugin() {
        Map<String, PluginDeviceInfo> deviceInfoMap = getStateWithAccount$default(this, false, 1, null).getDeviceInfoMap();
        Intrinsics.checkNotNullExpressionValue(deviceInfoMap, "state.deviceInfoMap");
        Iterator<Map.Entry<String, PluginDeviceInfo>> it = deviceInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().M0();
        }
    }

    @Nullable
    public final String getDeveloperInfo(long id) {
        return getStateWithAccount$default(this, false, 1, null).getDeveloperInfoMap().get(Long.valueOf(id));
    }

    @Nullable
    public final PluginDeviceInfo getExtraPluginInfo(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return getMExtraDeviceInfoMap().get(model);
    }

    @Nullable
    public final String getModelByProductId(int productId) {
        PluginDeviceState stateWithAccount$default = getStateWithAccount$default(this, false, 1, null);
        String strA = b7g.a(productId, stateWithAccount$default.getDeviceInfoMap());
        if (TextUtils.isEmpty(strA)) {
            strA = b7g.a(productId, getMExtraDeviceInfoMap());
        }
        if (TextUtils.isEmpty(strA)) {
            writeLog("getModelByProductId model =null productId:" + productId + " size:" + stateWithAccount$default.getDeviceInfoMap().size());
        }
        return strA;
    }

    @NotNull
    public final String getModelBySSID(@Nullable String ssid) {
        String strB = b7g.b(ssid, getStateWithAccount$default(this, false, 1, null).getDeviceInfoMap());
        Intrinsics.checkNotNullExpressionValue(strB, "getModelBySSID(ssid, get…hAccount().deviceInfoMap)");
        return strB;
    }

    @Nullable
    public final PluginDeviceInfo getPluginInfo(@Nullable String model) {
        return getStateWithAccount$default(this, false, 1, null).getDeviceInfoMap().get(model);
    }

    @NotNull
    public final Map<String, PluginDeviceInfo> getPluginInfoMap() {
        Map<String, PluginDeviceInfo> deviceInfoMap = getStateWithAccount$default(this, false, 1, null).getDeviceInfoMap();
        Intrinsics.checkNotNullExpressionValue(deviceInfoMap, "getStateWithAccount().deviceInfoMap");
        return deviceInfoMap;
    }

    public final int getProductIdByModel(@Nullable String model) {
        return b7g.c(model, getStateWithAccount$default(this, false, 1, null).getDeviceInfoMap());
    }

    @Override // com.xiaomi.smarthome.IReadyCallback
    public void isReadyListener(boolean autoRequest, @NotNull final Watcher<Integer> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        updateConfig(false, new sbq() { // from class: com.smarthome.core.modelconfig.PluginDeviceManager.isReadyListener.1
            private boolean callOnce;

            public final boolean getCallOnce() {
                return this.callOnce;
            }

            @Override // defpackage.sbq
            public void onFailure(@NotNull CoreError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                if (this.callOnce) {
                    return;
                }
                this.callOnce = true;
                Watcher<Integer> watcher = runnable;
                if (watcher == null) {
                    return;
                }
                watcher.accept(0);
            }

            @Override // defpackage.sbq
            public void onSuccess(boolean deviceListChanged, boolean developerListChanged) {
                if (this.callOnce) {
                    return;
                }
                this.callOnce = true;
                Watcher<Integer> watcher = runnable;
                if (watcher == null) {
                    return;
                }
                watcher.accept(0);
            }

            public final void setCallOnce(boolean z) {
                this.callOnce = z;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void readDeviceOtherfInternal(@NotNull PluginDeviceInfo info) {
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        String strStringPlus;
        Intrinsics.checkNotNullParameter(info, "info");
        PluginDeviceState state = getStateWithAccount$default(this, false, 1, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullExpressionValue(state, "state");
        File configFile = getConfigFile(state, true, PLUGIN_DEVICE_OTHER_PREF);
        if (!configFile.exists()) {
            writeLog("error readDeviceOtherfInternal not exists model:" + info + ".model");
            return;
        }
        synchronized (this) {
            try {
                try {
                    try {
                        sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(configFile.getPath(), null, 0);
                        try {
                            Cursor cursorRawQuery = sQLiteDatabaseOpenDatabase.rawQuery("SELECT   b, c, d, e, f, g FROM OtherConfig WHERE a='" + ((Object) info.l()) + "';", null);
                            if (cursorRawQuery == null || !cursorRawQuery.moveToFirst()) {
                                strStringPlus = "error readDeviceOtherfInternal no pluginDeviceInfo:" + info + " or cursor:" + cursorRawQuery + " model:" + info + ".model";
                            } else {
                                info.I(cursorRawQuery.getString(0));
                                info.Y(cursorRawQuery.getString(1));
                                info.W(cursorRawQuery.getString(2));
                                info.X(cursorRawQuery.getString(3));
                                info.V(cursorRawQuery.getString(4));
                                info.e0(cursorRawQuery.getString(5));
                                strStringPlus = "readDeviceOtherfInternal pluginDeviceInfo success model:" + ((Object) info.l()) + " time:" + (System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            CloseUtils.closeIO(cursorRawQuery, sQLiteDatabaseOpenDatabase);
                        } catch (Exception e) {
                            e = e;
                            strStringPlus = Intrinsics.stringPlus("error readDeviceOtherfInternal Exception:", Log.getStackTraceString(e));
                            CloseUtils.closeIO((AutoCloseable) null, sQLiteDatabaseOpenDatabase);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteDatabaseOpenDatabase = null;
                } catch (Throwable th2) {
                    th = th2;
                    configFile = null;
                    CloseUtils.closeIO((AutoCloseable) null, configFile);
                    throw th;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        writeLog(strStringPlus);
    }

    public final void updateConfig(final boolean isForce, @Nullable sbq callback) {
        final PluginDeviceState state = getStateWithAccount$default(this, false, 1, null);
        if (state.getUpdateState().newRequest(callback)) {
            writeLog(Intrinsics.stringPlus("updatePluginConfigInternalupdating:", state.getUpdateState()));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(state, "state");
        readDeviceBasefInternal(state);
        readDeveloperInfoPrefInternal(state);
        initPluginConfigFromLocal(state, new Consumer() { // from class: s1i
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                PluginDeviceManager.m202updateConfig$lambda0(state, this, isForce, ((Integer) obj).intValue());
            }
        });
    }

    private PluginDeviceManager(quc qucVar, Context context) {
        this.api = qucVar;
        this.mAppContext = context;
        this.changeObservable = new UpdateWatcher<>();
        this.mExtraDeviceInfoMap = LazyKt__LazyJVMKt.lazy(new Function0<Map<String, PluginDeviceInfo>>() { // from class: com.smarthome.core.modelconfig.PluginDeviceManager$mExtraDeviceInfoMap$2
            @Override // kotlin.jvm.functions.Function0
            public final Map<String, PluginDeviceInfo> invoke() {
                Map<String, PluginDeviceInfo> map = Collections.synchronizedMap(new HashMap());
                PluginDeviceInfo pluginDeviceInfo = new PluginDeviceInfo();
                pluginDeviceInfo.l0(BtConstants.UWB_TAG_MODEL);
                pluginDeviceInfo.w0(BtConstants.UWB_TAG_PID);
                pluginDeviceInfo.A0(0);
                pluginDeviceInfo.D0(false);
                pluginDeviceInfo.a0("https://cnbj1.fds.api.xiaomi.com/iotweb-product-center/28c8409c6a076becfb24461f8da7f7ae_1620632902445.png?GalaxyAccessKeyId=AKVGLQWBOVIRQ3XLEW&Expires=9223372036854775807&Signature=VNDnxNTSGHhDo6Gzlr+hCPttXVk=");
                Intrinsics.checkNotNullExpressionValue(map, "map");
                map.put(pluginDeviceInfo.l(), pluginDeviceInfo);
                return map;
            }
        });
        this.mAppFilesDir = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.smarthome.core.modelconfig.PluginDeviceManager$mAppFilesDir$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                String str = FileUtils.getAppFilesDir(this.this$0.mAppContext) + ((Object) File.separator) + "PluginDeviceManager";
                new File(str).mkdirs();
                return str;
            }
        });
    }
}
