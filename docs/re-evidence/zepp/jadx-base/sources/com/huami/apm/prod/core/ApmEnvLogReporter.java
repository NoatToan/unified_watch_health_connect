package com.huami.apm.prod.core;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.p008lifecycle.DefaultLifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.ProcessLifecycleOwner;
import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.ktx.Firebase;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import defpackage.x51;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/apm/prod/core/ApmEnvLogReporter;", "", "Landroid/content/Context;", "applicationContext", "", "c", DbUtils.Const.Table.CONTEXT, "", "a", "b", PointCategory.INIT, "Ljava/lang/String;", "APP_STATUS_TAG", "", "Lcom/huami/apm/prod/core/ApmEnvLogReporter$PageEnvCollector;", "Ljava/util/List;", "pageEnvCollectors", "<init>", "()V", "PageEnvCollector", "apm-prod-core_release"}, k = 1, mv = {1, 5, 1})
public final class ApmEnvLogReporter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String APP_STATUS_TAG = "AppStatus";

    @NotNull
    public static final ApmEnvLogReporter INSTANCE = new ApmEnvLogReporter();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final List<PageEnvCollector> pageEnvCollectors = CollectionsKt__CollectionsKt.listOf((Object[]) new PageEnvCollector[]{new PageEnvCollector("activity", a.a), new PageEnvCollector("locale", b.a), new PageEnvCollector("timezone", c.a), new PageEnvCollector("memory", d.a)});

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0017\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R'\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/apm/prod/core/ApmEnvLogReporter$PageEnvCollector;", "", "", "component1", "Lkotlin/Function1;", "Landroid/app/Activity;", "component2", "name", "infoCollector", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function1;", "getInfoCollector", "()Lkotlin/jvm/functions/Function1;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "apm-prod-core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PageEnvCollector {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final Function1<Activity, String> infoCollector;

        /* JADX WARN: Multi-variable type inference failed */
        public PageEnvCollector(@NotNull String str, @NotNull Function1<? super Activity, String> function1) {
            this.name = str;
            this.infoCollector = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PageEnvCollector copy$default(PageEnvCollector pageEnvCollector, String str, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pageEnvCollector.name;
            }
            if ((i & 2) != 0) {
                function1 = pageEnvCollector.infoCollector;
            }
            return pageEnvCollector.copy(str, function1);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Function1<Activity, String> component2() {
            return this.infoCollector;
        }

        @NotNull
        public final PageEnvCollector copy(@NotNull String name, @NotNull Function1<? super Activity, String> infoCollector) {
            return new PageEnvCollector(name, infoCollector);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageEnvCollector)) {
                return false;
            }
            PageEnvCollector pageEnvCollector = (PageEnvCollector) other;
            return Intrinsics.areEqual(this.name, pageEnvCollector.name) && Intrinsics.areEqual(this.infoCollector, pageEnvCollector.infoCollector);
        }

        @NotNull
        public final Function1<Activity, String> getInfoCollector() {
            return this.infoCollector;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.infoCollector.hashCode();
        }

        @NotNull
        public String toString() {
            return "PageEnvCollector(name=" + this.name + ", infoCollector=" + this.infoCollector + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/app/Activity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Activity, String> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Activity activity) {
            return Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/app/Activity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Activity, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Activity activity) {
            return Locale.getDefault().toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/app/Activity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Activity, String> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Activity activity) {
            return Calendar.getInstance().getTimeZone().getID();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/app/Activity;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Activity, String> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull Activity activity) {
            return ApmEnvLogReporter.INSTANCE.a(activity);
        }
    }

    private ApmEnvLogReporter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a(Context context) {
        Object systemService = context.getSystemService("activity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        return "[ava=" + ((memoryInfo.availMem / 1024.0f) / 1024.0f) + "MB, total=" + ((memoryInfo.totalMem / 1024.0f) / 1024.0f) + "MB, low=" + memoryInfo.lowMemory + ", threshold=" + ((memoryInfo.threshold / 1024.0f) / 1024.0f) + "MB]";
    }

    private final void b() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.huami.apm.prod.core.ApmEnvLogReporter$observeAppStatus$1
            @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                x51.a(this, lifecycleOwner);
            }

            @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
            public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                x51.b(this, lifecycleOwner);
            }

            @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                x51.c(this, lifecycleOwner);
            }

            @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                x51.d(this, lifecycleOwner);
            }

            @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
            public void onStart(@NotNull LifecycleOwner owner) {
                x51.e(this, owner);
                FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).log("AppStatus: App 进入前台");
            }

            @Override // androidx.p008lifecycle.DefaultLifecycleObserver, androidx.p008lifecycle.FullLifecycleObserver
            public void onStop(@NotNull LifecycleOwner owner) {
                x51.f(this, owner);
                FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).log("AppStatus: App 进入后台");
            }
        });
    }

    private final void c(Context applicationContext) {
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.huami.apm.prod.core.ApmEnvLogReporter$observePageEnvInfo$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/apm/prod/core/ApmEnvLogReporter$PageEnvCollector;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<ApmEnvLogReporter.PageEnvCollector, CharSequence> {
                public final /* synthetic */ Activity b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Activity activity) {
                    super(1);
                    this.b = activity;
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CharSequence invoke(@NotNull ApmEnvLogReporter.PageEnvCollector pageEnvCollector) {
                    Object objM3845constructorimpl;
                    StringBuilder sb = new StringBuilder();
                    sb.append(pageEnvCollector.getName());
                    sb.append(": ");
                    Activity activity = this.b;
                    try {
                        Result.Companion companion = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(pageEnvCollector.getInfoCollector().invoke(activity));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                        objM3845constructorimpl = null;
                    }
                    sb.append(objM3845constructorimpl);
                    return sb.toString();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NotNull Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NotNull Activity activity) {
                FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).log(CollectionsKt___CollectionsKt.joinToString$default(ApmEnvLogReporter.pageEnvCollectors, "\n", null, null, 0, null, new a(activity), 30, null));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
            }
        });
    }

    public final void init(@NotNull Context applicationContext) {
        b();
        c(applicationContext);
    }
}
