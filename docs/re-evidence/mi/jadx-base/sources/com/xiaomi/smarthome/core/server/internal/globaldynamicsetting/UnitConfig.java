package com.xiaomi.smarthome.core.server.internal.globaldynamicsetting;

import android.text.TextUtils;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.UnitConfig;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u001b\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\t0\u001c2\u0006\u0010\u001d\u001a\u00020\u0004J*\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\t\u0018\u00010\b2\u0006\u0010\u001d\u001a\u00020\u0004J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u0010\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0016J\b\u0010#\u001a\u00020!H\u0002J\u0016\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000RÄ\u0001\u0010\u0005\u001aª\u0001\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0012@\u0012>\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\t \u0007*\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\t\u0018\u00010\b0\b \u0007*T\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u0004\u0012@\u0012>\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\t \u0007*\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00010\t\u0018\u00010\b0\b\u0018\u00010\b0\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR'\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00010\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/smarthome/core/server/internal/globaldynamicsetting/UnitConfig;", "", "()V", "CENTIGRADE", "", "CONFIG_TRANSLATE", "", "kotlin.jvm.PlatformType", "", "Lcom/xiaomi/smarthome/core/server/internal/plugin/util/Callback;", "getCONFIG_TRANSLATE", "()Ljava/util/Map;", "CONFIG_TRANSLATE$delegate", "Lkotlin/Lazy;", "DEFAULT_EXPRESSION", "getDEFAULT_EXPRESSION", "()Lcom/xiaomi/smarthome/core/server/internal/plugin/util/Callback;", "FAHRENHEIT", "LOCALE_UNIT", "TAG", "mListener", "", "Lcom/xiaomi/smarthome/core/server/internal/globaldynamicsetting/OnUnitChangeListener;", "target", "getTarget", "()Ljava/lang/String;", "unitMap", "getSelectUnit", "Landroid/util/Pair;", "unit", "getUnit", "getUnitDefault", "registerUnitChangeListener", "", e.f13808a, "saveSetting", "setUnit", "origin", "unregisterUnitChangeListener", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UnitConfig {

    @NotNull
    public static final String CENTIGRADE = "℃";

    @NotNull
    public static final String FAHRENHEIT = "°F";

    @NotNull
    public static final String LOCALE_UNIT = "unit";

    @NotNull
    private static final String TAG = "UnitConfig";

    @NotNull
    public static final UnitConfig INSTANCE = new UnitConfig();

    @NotNull
    private static final Callback<Object, Object> DEFAULT_EXPRESSION = new Callback() { // from class: n9q
        @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.Callback
        public final Object call(Object obj) {
            return UnitConfig.m841DEFAULT_EXPRESSION$lambda0(obj);
        }
    };

    /* JADX INFO: renamed from: CONFIG_TRANSLATE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy CONFIG_TRANSLATE = LazyKt__LazyJVMKt.lazy(UnitConfig$CONFIG_TRANSLATE$2.INSTANCE);

    @NotNull
    private static final Map<String, String> unitMap = new ArrayMap();

    @NotNull
    private static final List<OnUnitChangeListener> mListener = new ArrayList();

    private UnitConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: DEFAULT_EXPRESSION$lambda-0, reason: not valid java name */
    public static final Object m841DEFAULT_EXPRESSION$lambda0(Object obj) {
        return obj == null ? "" : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSelectUnit$lambda-1, reason: not valid java name */
    public static final Object m842getSelectUnit$lambda1(Object obj) {
        return obj == null ? "" : obj;
    }

    private final String getTarget() {
        String string = MiJiaEnvironment.getAppContext().getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0).getString("unit", "");
        Map<String, String> map = unitMap;
        StringUtil.string2Map(string, map);
        return map.get(CENTIGRADE);
    }

    private final synchronized void saveSetting() {
        SharePrefsManager.setSettingString(MiJiaEnvironment.getAppContext().getSharedPreferences("com.xiaomi.smarthome.globaldynamicsetting", 0), "unit", StringUtil.map2String(unitMap));
    }

    public final Map<String, Map<String, Callback<Object, Object>>> getCONFIG_TRANSLATE() {
        return (Map) CONFIG_TRANSLATE.getValue();
    }

    @NotNull
    public final Callback<Object, Object> getDEFAULT_EXPRESSION() {
        return DEFAULT_EXPRESSION;
    }

    @NotNull
    public final Pair<String, Callback<Object, Object>> getSelectUnit(@NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        String unitDefault = unitMap.get(unit);
        if (unitDefault == null) {
            unitDefault = getUnitDefault(unit);
        }
        Map<String, Callback<Object, Object>> unit2 = getUnit(unit);
        if (unit2 != null && unit2.get(unitDefault) != null) {
            Callback<Object, Object> callback = unit2.get(unitDefault);
            if (callback == null) {
                callback = DEFAULT_EXPRESSION;
            }
            return new Pair<>(unitDefault, callback);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unit:");
        sb.append(unit);
        sb.append(" target:");
        sb.append((Object) unitDefault);
        return new Pair<>(unitDefault, new Callback() { // from class: o9q
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.Callback
            public final Object call(Object obj) {
                return UnitConfig.m842getSelectUnit$lambda1(obj);
            }
        });
    }

    @Nullable
    public final Map<String, Callback<Object, Object>> getUnit(@NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return getCONFIG_TRANSLATE().get(unit);
    }

    @Nullable
    public final String getUnitDefault(@NotNull String unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (Intrinsics.areEqual(CENTIGRADE, unit)) {
            ServerBean currentServer = ServerCompact.getCurrentServer(MiJiaEnvironment.getAppContext());
            String str = currentServer == null ? "" : currentServer.countryCode;
            return (Intrinsics.areEqual(ServerConstants.NEW_US_TRUE_COUNTRY_CODE, str) || Intrinsics.areEqual("PR", str) || Intrinsics.areEqual("GU", str) || Intrinsics.areEqual("VI", str) || Intrinsics.areEqual("BS", str) || Intrinsics.areEqual("BZ", str) || Intrinsics.areEqual("KY", str) || Intrinsics.areEqual("PW", str)) ? FAHRENHEIT : CENTIGRADE;
        }
        if (!Intrinsics.areEqual("°C", unit)) {
            return unit;
        }
        String target = getTarget();
        return target == null ? getUnitDefault(CENTIGRADE) : target;
    }

    public final void registerUnitChangeListener(@Nullable OnUnitChangeListener l) {
        if (l != null) {
            List<OnUnitChangeListener> list = mListener;
            if (list.contains(l)) {
                return;
            }
            list.add(l);
        }
    }

    public final synchronized void setUnit(@NotNull String origin, @NotNull String target) {
        int size;
        try {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(target, "target");
            String strPut = unitMap.put(origin, target);
            if (!TextUtils.equals(strPut, target) && (size = mListener.size() - 1) >= 0) {
                while (true) {
                    int i = size - 1;
                    mListener.get(size).onUnitChange(origin, strPut, target);
                    if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            saveSetting();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void unregisterUnitChangeListener(@NotNull OnUnitChangeListener l) {
        Intrinsics.checkNotNullParameter(l, "l");
        mListener.remove(l);
    }
}
