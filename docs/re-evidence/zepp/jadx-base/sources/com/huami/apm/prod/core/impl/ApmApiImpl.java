package com.huami.apm.prod.core.impl;

import android.content.Context;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.crashlytics.ktx.KeyValueBuilder;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.perf.ktx.PerformanceKt;
import com.huami.apm.prod.service.AbstractApmApiKt;
import com.huami.apm.prod.service.ApmApi;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/huami/apm/prod/core/impl/ApmApiImpl;", "Lcom/huami/apm/prod/service/ApmApi;", "", "", "", "params", "", "setupEnv", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "userId", "setUserId", "<init>", "()V", "apm-prod-core_release"}, k = 1, mv = {1, 5, 1})
public final class ApmApiImpl implements ApmApi {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "APM-Prod 模块已禁用";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "APM-Prod 模块已启用";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/google/firebase/crashlytics/ktx/KeyValueBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<KeyValueBuilder, Unit> {
        public final /* synthetic */ Map<String, Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map<String, ? extends Object> map) {
            super(1);
            this.a = map;
        }

        public final void a(@NotNull KeyValueBuilder keyValueBuilder) {
            for (Map.Entry<String, Object> entry : this.a.entrySet()) {
                keyValueBuilder.key(entry.getKey(), entry.getValue().toString());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyValueBuilder keyValueBuilder) {
            a(keyValueBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Map<String, Object> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Map<String, ? extends Object> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("APM-Prod 配置自定义 key：", this.a);
        }
    }

    @Override // com.huami.apm.prod.service.ApmApi
    public void disable(@NotNull Context context) {
        Firebase firebase = Firebase.INSTANCE;
        AnalyticsKt.getAnalytics(firebase).setAnalyticsCollectionEnabled(false);
        FirebaseCrashlyticsKt.getCrashlytics(firebase).setCrashlyticsCollectionEnabled(false);
        PerformanceKt.getPerformance(firebase).setPerformanceCollectionEnabled(false);
        HMLog.info(AbstractApmApiKt.APM_MODULE_TAG, a.a);
    }

    @Override // com.huami.apm.prod.service.ApmApi
    public void enable(@NotNull Context context) {
        Firebase firebase = Firebase.INSTANCE;
        AnalyticsKt.getAnalytics(firebase).setAnalyticsCollectionEnabled(true);
        FirebaseCrashlyticsKt.getCrashlytics(firebase).setCrashlyticsCollectionEnabled(true);
        PerformanceKt.getPerformance(firebase).setPerformanceCollectionEnabled(true);
        HMLog.info(AbstractApmApiKt.APM_MODULE_TAG, b.a);
    }

    @Override // com.huami.apm.prod.service.ApmApi
    public void setUserId(@Nullable String userId) {
        AnalyticsKt.getAnalytics(Firebase.INSTANCE).setUserId(userId);
    }

    @Override // com.huami.apm.prod.service.ApmApi
    public void setupEnv(@NotNull Map<String, ? extends Object> params) {
        FirebaseCrashlyticsKt.setCustomKeys(FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE), new c(params));
        HMLog.info(AbstractApmApiKt.APM_MODULE_TAG, new d(params));
    }
}
