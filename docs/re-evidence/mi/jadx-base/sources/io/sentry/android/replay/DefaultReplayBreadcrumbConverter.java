package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.devicesettings.thirdparty.PhoneStateBroadcastReceiver;
import defpackage.elk;
import io.sentry.SentryLevel;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter;", "Lelk;", "Lio/sentry/a;", "", "isValidForRRWebSpan", "(Lio/sentry/a;)Z", "", "snakeToCamelCase", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/sentry/rrweb/e;", "toRRWebSpanEvent", "(Lio/sentry/a;)Lio/sentry/rrweb/e;", "breadcrumb", "Lio/sentry/rrweb/b;", "convert", "(Lio/sentry/a;)Lio/sentry/rrweb/b;", "lastConnectivityState", "Ljava/lang/String;", "<init>", "()V", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDefaultReplayBreadcrumbConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultReplayBreadcrumbConverter.kt\nio/sentry/android/replay/DefaultReplayBreadcrumbConverter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,167:1\n467#2,7:168\n*S KotlinDebug\n*F\n+ 1 DefaultReplayBreadcrumbConverter.kt\nio/sentry/android/replay/DefaultReplayBreadcrumbConverter\n*L\n96#1:168,7\n*E\n"})
public class DefaultReplayBreadcrumbConverter implements elk {

    @NotNull
    private static final HashSet<String> supportedNetworkData;

    @Nullable
    private String lastConnectivityState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Lazy<Regex> snakecasePattern$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<Regex>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Regex invoke() {
            return new Regex("_[a-z]");
        }
    });

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/DefaultReplayBreadcrumbConverter$Companion;", "", "()V", "snakecasePattern", "Lkotlin/text/Regex;", "getSnakecasePattern", "()Lkotlin/text/Regex;", "snakecasePattern$delegate", "Lkotlin/Lazy;", "supportedNetworkData", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex getSnakecasePattern() {
            return (Regex) DefaultReplayBreadcrumbConverter.snakecasePattern$delegate.getValue();
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        supportedNetworkData = hashSet;
    }

    private final boolean isValidForRRWebSpan(io.sentry.a aVar) {
        Object obj = aVar.h().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && str.length() != 0) {
            Map<String, Object> data = aVar.h();
            Intrinsics.checkNotNullExpressionValue(data, "data");
            if (data.containsKey("http.start_timestamp")) {
                Map<String, Object> data2 = aVar.h();
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                if (data2.containsKey("http.end_timestamp")) {
                    return true;
                }
            }
        }
        return false;
    }

    private final String snakeToCamelCase(String str) {
        return INSTANCE.getSnakecasePattern().replace(str, new Function1<MatchResult, CharSequence>() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter.snakeToCamelCase.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull MatchResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String strValueOf = String.valueOf(StringsKt___StringsKt.last(it.getValue()));
                Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase;
            }
        });
    }

    private final io.sentry.rrweb.e toRRWebSpanEvent(io.sentry.a aVar) {
        double dLongValue;
        double dLongValue2;
        Object obj = aVar.h().get("http.start_timestamp");
        Object obj2 = aVar.h().get("http.end_timestamp");
        io.sentry.rrweb.e eVar = new io.sentry.rrweb.e();
        eVar.f(aVar.k().getTime());
        eVar.s("resource.http");
        Object obj3 = aVar.h().get("url");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
        eVar.q((String) obj3);
        if (obj instanceof Double) {
            dLongValue = ((Number) obj).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            dLongValue = ((Long) obj).longValue();
        }
        eVar.u(dLongValue / 1000.0d);
        if (obj2 instanceof Double) {
            dLongValue2 = ((Number) obj2).doubleValue();
        } else {
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            dLongValue2 = ((Long) obj2).longValue();
        }
        eVar.r(dLongValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> mapH = aVar.h();
        Intrinsics.checkNotNullExpressionValue(mapH, "breadcrumb.data");
        for (Map.Entry<String, Object> entry : mapH.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (supportedNetworkData.contains(key)) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(snakeToCamelCase(StringsKt__StringsKt.substringAfter$default(StringsKt__StringsJVMKt.replace$default(key, "content_length", "body_size", false, 4, (Object) null), ".", (String) null, 2, (Object) null)), value);
            }
        }
        eVar.o(linkedHashMap);
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    @Override // defpackage.elk
    @Nullable
    public io.sentry.rrweb.b convert(@NotNull io.sentry.a breadcrumb) {
        String strJ;
        SentryLevel sentryLevelI;
        Object obj;
        String strSubstringAfterLast$default;
        Intrinsics.checkNotNullParameter(breadcrumb, "breadcrumb");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.areEqual(breadcrumb.g(), "http")) {
            if (isValidForRRWebSpan(breadcrumb)) {
                return toRRWebSpanEvent(breadcrumb);
            }
            return null;
        }
        String strG = "navigation";
        if (Intrinsics.areEqual(breadcrumb.l(), "navigation") && Intrinsics.areEqual(breadcrumb.g(), "app.lifecycle")) {
            strG = "app." + breadcrumb.h().get("state");
        } else if (Intrinsics.areEqual(breadcrumb.l(), "navigation") && Intrinsics.areEqual(breadcrumb.g(), "device.orientation")) {
            strG = breadcrumb.g();
            Intrinsics.checkNotNull(strG);
            Object obj2 = breadcrumb.h().get("position");
            if (!Intrinsics.areEqual(obj2, "landscape") && !Intrinsics.areEqual(obj2, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj2);
        } else {
            if (!Intrinsics.areEqual(breadcrumb.l(), "navigation")) {
                if (Intrinsics.areEqual(breadcrumb.g(), "ui.click")) {
                    Object obj3 = breadcrumb.h().get("view.id");
                    if (obj3 == null && (obj3 = breadcrumb.h().get("view.tag")) == null) {
                        obj3 = breadcrumb.h().get("view.class");
                    }
                    strJ = obj3 instanceof String ? (String) obj3 : null;
                    if (strJ == null) {
                        return null;
                    }
                    Map<String, Object> mapH = breadcrumb.h();
                    Intrinsics.checkNotNullExpressionValue(mapH, "breadcrumb.data");
                    linkedHashMap.putAll(mapH);
                    strG = "ui.tap";
                    sentryLevelI = null;
                } else if (Intrinsics.areEqual(breadcrumb.l(), "system") && Intrinsics.areEqual(breadcrumb.g(), "network.event")) {
                    if (!Intrinsics.areEqual(breadcrumb.h().get("action"), "NETWORK_LOST")) {
                        Map<String, Object> mapH2 = breadcrumb.h();
                        Intrinsics.checkNotNullExpressionValue(mapH2, "breadcrumb.data");
                        if (mapH2.containsKey("network_type")) {
                            Object obj4 = breadcrumb.h().get("network_type");
                            String str = obj4 instanceof String ? (String) obj4 : null;
                            if (str != null && str.length() != 0) {
                                obj = breadcrumb.h().get("network_type");
                            }
                        }
                        return null;
                    }
                    obj = ThirdPartAccessConstants.GOOGLE_FIT_ACCESS_TYPE;
                    linkedHashMap.put("state", obj);
                    if (Intrinsics.areEqual(this.lastConnectivityState, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj5 = linkedHashMap.get("state");
                    this.lastConnectivityState = obj5 instanceof String ? (String) obj5 : null;
                    strG = "device.connectivity";
                } else if (Intrinsics.areEqual(breadcrumb.h().get("action"), "BATTERY_CHANGED")) {
                    Map<String, Object> mapH3 = breadcrumb.h();
                    Intrinsics.checkNotNullExpressionValue(mapH3, "breadcrumb.data");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : mapH3.entrySet()) {
                        String key = entry.getKey();
                        if (Intrinsics.areEqual(key, "level") || Intrinsics.areEqual(key, "charging")) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    strG = "device.battery";
                } else {
                    strG = breadcrumb.g();
                    strJ = breadcrumb.j();
                    sentryLevelI = breadcrumb.i();
                    Map<String, Object> mapH4 = breadcrumb.h();
                    Intrinsics.checkNotNullExpressionValue(mapH4, "breadcrumb.data");
                    linkedHashMap.putAll(mapH4);
                }
                if (strG == null && strG.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.f(breadcrumb.k().getTime());
                    aVar.r(breadcrumb.k().getTime() / 1000.0d);
                    aVar.s("default");
                    aVar.t(strG);
                    aVar.x(strJ);
                    aVar.w(sentryLevelI);
                    aVar.u(linkedHashMap);
                    return aVar;
                }
            }
            if (Intrinsics.areEqual(breadcrumb.h().get("state"), "resumed")) {
                Object obj6 = breadcrumb.h().get(PhoneStateBroadcastReceiver.PARAMS_SCREEN);
                String str2 = obj6 instanceof String ? (String) obj6 : null;
                if (str2 != null) {
                    strSubstringAfterLast$default = StringsKt__StringsKt.substringAfterLast$default(str2, '.', (String) null, 2, (Object) null);
                } else {
                    strSubstringAfterLast$default = null;
                }
            } else {
                Map<String, Object> mapH5 = breadcrumb.h();
                Intrinsics.checkNotNullExpressionValue(mapH5, "breadcrumb.data");
                if (mapH5.containsKey("to")) {
                    Object obj7 = breadcrumb.h().get("to");
                    if (obj7 instanceof String) {
                        strSubstringAfterLast$default = (String) obj7;
                    } else {
                        strSubstringAfterLast$default = null;
                    }
                } else {
                    strSubstringAfterLast$default = null;
                }
            }
            if (strSubstringAfterLast$default == null) {
                return null;
            }
            linkedHashMap.put("to", strSubstringAfterLast$default);
        }
        strJ = null;
        sentryLevelI = null;
        return strG == null ? null : null;
    }
}
