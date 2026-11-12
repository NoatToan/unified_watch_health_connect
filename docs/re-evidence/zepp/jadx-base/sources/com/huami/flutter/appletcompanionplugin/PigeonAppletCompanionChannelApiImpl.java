package com.huami.flutter.appletcompanionplugin;

import android.content.Context;
import com.huami.applet.CompanionStarterKt;
import com.huami.applet.bluetooth.store.StoreProtocolProxy;
import com.huami.applet.bluetooth.store.StoreProtocolProxyKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import io.netty.util.internal.StringUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J)\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\r\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002H\u0016J)\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\"\u0010\u0013\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0002H\u0016J$\u0010\u0015\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00142\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0002H\u0016R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannelApiImpl;", "Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$PigeonAppletCompanionChannelApi;", "Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$Result;", "", "result", "", "getInstalledApps", "", "appSize", "getDeviceStorageConditions", "(Ljava/lang/Long;Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$Result;)V", "filePath", "", "installAppletCompanion", "appId", "uninstallApp", "Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$OpenSettingPageParams;", "params", "Ljava/lang/Void;", "openSettingPage", "Lcom/huami/flutter/appletcompanionplugin/PigeonAppletCompanionChannel$OpenJsLogPageParams;", "openJsLogPage", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public final class PigeonAppletCompanionChannelApiImpl implements PigeonAppletCompanionChannel.PigeonAppletCompanionChannelApi {

    @NotNull
    private static final String b = "PigeonAppletCompanionChannelApiImpl";
    private static final int c = -1;
    private static final long d = 1;
    private static final int e = 255;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannelApiImpl$getDeviceStorageConditions$2", f = "PigeonAppletCompanionChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Long b;
        public final /* synthetic */ PigeonAppletCompanionChannel.Result<Long> c;

        /* JADX INFO: renamed from: com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannelApiImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0424a extends Lambda implements Function1<Integer, Long> {
            public static final C0424a a = new C0424a();

            public C0424a() {
                super(1);
            }

            public final long a(int i) {
                return i;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Integer num) {
                return Long.valueOf(a(num.intValue()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l, PigeonAppletCompanionChannel.Result<Long> result, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = l;
            this.c = result;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer numBoxInt;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Long l = this.b;
            int iIntValue = 0;
            if (l != null && (numBoxInt = Boxing.boxInt((int) l.longValue())) != null) {
                iIntValue = numBoxInt.intValue();
            }
            StoreProtocolProxyKt.getStoreProtocol().haveInstallationConditions(iIntValue, PigeonResultUtilsKt.handleResultCallback("haveInstallationConditions", this.c, Boxing.boxInt(255), C0424a.a));
            return Unit.INSTANCE;
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
            return "invoke getInstalledApps() with applet companion server.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannelApiImpl$getInstalledApps$3", f = "PigeonAppletCompanionChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PigeonAppletCompanionChannel.Result<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PigeonAppletCompanionChannel.Result<String> result, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = result;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StoreProtocolProxyKt.getStoreProtocol().getInstalledApps(PigeonResultUtilsKt.handleResultCallback("getInstalledApps", this.b, ""));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Start open js app log page";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Start open app setting page";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannelApiImpl$uninstallApp$2", f = "PigeonAppletCompanionChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Long b;
        public final /* synthetic */ PigeonAppletCompanionChannel.Result<Long> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Integer, Long> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final long a(int i) {
                return i;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Integer num) {
                return Long.valueOf(a(num.intValue()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Long l, PigeonAppletCompanionChannel.Result<Long> result, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = l;
            this.c = result;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer numBoxInt;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Long l = this.b;
            int iIntValue = -1;
            if (l != null && (numBoxInt = Boxing.boxInt((int) l.longValue())) != null) {
                iIntValue = numBoxInt.intValue();
            }
            StoreProtocolProxyKt.getStoreProtocol().uninstallApp(iIntValue, PigeonResultUtilsKt.handleResultCallback("uninstallApp", this.c, Boxing.boxInt(255), a.a));
            return Unit.INSTANCE;
        }
    }

    public PigeonAppletCompanionChannelApiImpl(@NotNull Context context) {
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.PigeonAppletCompanionChannelApi
    public void getDeviceStorageConditions(@Nullable Long appSize, @Nullable PigeonAppletCompanionChannel.Result<Long> result) {
        if (result != null) {
            kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(appSize, result, null), 3, null);
            return;
        }
        throw new IllegalArgumentException(("PigeonAppletCompanionChannelApiImpl getDeviceStorageConditions(): Bad result=" + result + StringUtil.SPACE).toString());
    }

    @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.PigeonAppletCompanionChannelApi
    public void getInstalledApps(@Nullable PigeonAppletCompanionChannel.Result<String> result) {
        if (result != null) {
            HMLog.info(b, b.a);
            kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new c(result, null), 3, null);
        } else {
            throw new IllegalArgumentException(("PigeonAppletCompanionChannelApiImpl getInstalledApps(): Bad result=" + result + StringUtil.SPACE).toString());
        }
    }

    @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.PigeonAppletCompanionChannelApi
    public void installAppletCompanion(@Nullable String filePath, @Nullable PigeonAppletCompanionChannel.Result<Boolean> result) {
        if (result != null) {
            StoreProtocolProxy storeProtocol = StoreProtocolProxyKt.getStoreProtocol();
            if (filePath == null) {
                filePath = "";
            }
            PigeonResultUtilsKt.postSuccess(result, "installCompanionApp", Boolean.valueOf(storeProtocol.installCompanionApp(filePath)));
            return;
        }
        throw new IllegalArgumentException(("PigeonAppletCompanionChannelApiImpl installAppletCompanion(): Bad result=" + result + StringUtil.SPACE).toString());
    }

    @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.PigeonAppletCompanionChannelApi
    public void openJsLogPage(@Nullable PigeonAppletCompanionChannel.OpenJsLogPageParams params, @Nullable PigeonAppletCompanionChannel.Result<Void> result) {
        if ((params == null || params.getAppId() == null || params.getAppName() == null) ? false : true) {
            HMLog.debug$default(null, d.a, 1, null);
            CompanionStarterKt.startJsAppLogActivity(this.context, params.getAppName(), String.valueOf(params.getAppId()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PigeonAppletCompanionChannelApiImpl open setting page failed, app id ");
        sb.append(params == null ? null : params.getAppId());
        sb.append(" app name is ");
        sb.append((Object) (params != null ? params.getAppName() : null));
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.PigeonAppletCompanionChannelApi
    public void openSettingPage(@Nullable PigeonAppletCompanionChannel.OpenSettingPageParams params, @Nullable PigeonAppletCompanionChannel.Result<Void> result) {
        if ((params == null || params.getAppId() == null || params.getAppName() == null) ? false : true) {
            HMLog.debug$default(null, e.a, 1, null);
            CompanionStarterKt.startSettingActivity(this.context, params.getAppName(), String.valueOf(params.getAppId()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PigeonAppletCompanionChannelApiImpl open setting page failed, app id ");
        sb.append(params == null ? null : params.getAppId());
        sb.append(" app name is ");
        sb.append((Object) (params != null ? params.getAppName() : null));
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // com.huami.flutter.appletcompanionplugin.PigeonAppletCompanionChannel.PigeonAppletCompanionChannelApi
    public void uninstallApp(@Nullable Long appId, @Nullable PigeonAppletCompanionChannel.Result<Long> result) {
        if (result != null) {
            kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new f(appId, result, null), 3, null);
            return;
        }
        throw new IllegalArgumentException(("PigeonAppletCompanionChannelApiImpl uninstallApp(): Bad result=" + result + StringUtil.SPACE).toString());
    }
}
