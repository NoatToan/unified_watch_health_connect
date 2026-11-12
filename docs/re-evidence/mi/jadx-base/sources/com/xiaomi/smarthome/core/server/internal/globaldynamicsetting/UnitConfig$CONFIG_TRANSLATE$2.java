package com.xiaomi.smarthome.core.server.internal.globaldynamicsetting;

import androidx.collection.ArrayMap;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.utils.ScriptExpression;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001aª\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012@\u0012>\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00060\u0005 \u0003*\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00040\u0004 \u0003*T\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012@\u0012>\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00060\u0005 \u0003*\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", "Lcom/xiaomi/smarthome/core/server/internal/plugin/util/Callback;", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class UnitConfig$CONFIG_TRANSLATE$2 extends Lambda implements Function0<Map<String, Map<String, ? extends Callback<Object, Object>>>> {
    public static final UnitConfig$CONFIG_TRANSLATE$2 INSTANCE = new UnitConfig$CONFIG_TRANSLATE$2();

    public UnitConfig$CONFIG_TRANSLATE$2() {
        super(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final Object m843invoke$lambda0(Object obj) {
        return ScriptExpression.eval("32+1.8*x", obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
    public static final Object m844invoke$lambda1(Object obj) {
        return ScriptExpression.eval("(x-32)/1.8", obj);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, Map<String, ? extends Callback<Object, Object>>> invoke() {
        ArrayMap arrayMap = new ArrayMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(0, 0.75f, false);
        UnitConfig unitConfig = UnitConfig.INSTANCE;
        linkedHashMap.put(UnitConfig.CENTIGRADE, unitConfig.getDEFAULT_EXPRESSION());
        linkedHashMap.put(UnitConfig.FAHRENHEIT, new Callback() { // from class: com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.a
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.Callback
            public final Object call(Object obj) {
                return UnitConfig$CONFIG_TRANSLATE$2.m843invoke$lambda0(obj);
            }
        });
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(centigrade)");
        arrayMap.put(UnitConfig.CENTIGRADE, mapUnmodifiableMap);
        arrayMap.put("°C", mapUnmodifiableMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(0, 0.75f, false);
        linkedHashMap2.put(UnitConfig.CENTIGRADE, new Callback() { // from class: com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.b
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.Callback
            public final Object call(Object obj) {
                return UnitConfig$CONFIG_TRANSLATE$2.m844invoke$lambda1(obj);
            }
        });
        linkedHashMap2.put(UnitConfig.FAHRENHEIT, unitConfig.getDEFAULT_EXPRESSION());
        Map mapUnmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap2, "unmodifiableMap(fahrenheit)");
        arrayMap.put(UnitConfig.FAHRENHEIT, mapUnmodifiableMap2);
        return Collections.unmodifiableMap(arrayMap);
    }
}
