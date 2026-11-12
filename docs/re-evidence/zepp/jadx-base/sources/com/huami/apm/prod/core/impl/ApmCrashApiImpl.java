package com.huami.apm.prod.core.impl;

import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.perf.ktx.PerformanceKt;
import com.huami.apm.prod.service.AbstractApmApiKt;
import com.huami.apm.prod.service.ApmCrashApi;
import com.huami.tools.log.HMLog;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J*\u0010\u000e\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/huami/apm/prod/core/impl/ApmCrashApiImpl;", "Lcom/huami/apm/prod/service/ApmCrashApi;", "", "", "keys", "", "throwable", "", "recordException", "message", "log", "setCustomKeys", "Lkotlin/Function0;", "action", "setTempKey", "<init>", "()V", "apm-prod-core_release"}, k = 1, mv = {1, 5, 1})
public final class ApmCrashApiImpl implements ApmCrashApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("上报了日志：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).recordException(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<String, String> a;
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<String, String> map, Throwable th) {
            super(0);
            this.a = map;
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上报了自定义异常：key=" + this.a + ", exception: " + this.b;
        }
    }

    @Override // com.huami.apm.prod.service.ApmCrashApi
    public void log(@NotNull String message) {
        FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).log(message);
        HMLog.debug(AbstractApmApiKt.APM_MODULE_TAG, new a(message));
    }

    @Override // com.huami.apm.prod.service.ApmCrashApi
    public void recordException(@NotNull Map<String, String> keys, @NotNull Throwable throwable) {
        if (PerformanceKt.getPerformance(Firebase.INSTANCE).isPerformanceCollectionEnabled()) {
            setTempKey(keys, new b(throwable));
            HMLog.debug(AbstractApmApiKt.APM_MODULE_TAG, new c(keys, throwable));
        }
    }

    @Override // com.huami.apm.prod.service.ApmCrashApi
    public void setCustomKeys(@NotNull Map<String, String> keys) {
        for (Map.Entry<String, String> entry : keys.entrySet()) {
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).setCustomKey(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.huami.apm.prod.service.ApmCrashApi
    public void setTempKey(@NotNull Map<String, String> keys, @NotNull Function0<Unit> action) {
        setCustomKeys(keys);
        action.invoke();
        Iterator<Map.Entry<String, String>> it2 = keys.entrySet().iterator();
        while (it2.hasNext()) {
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).setCustomKey(it2.next().getKey(), "");
        }
    }
}
