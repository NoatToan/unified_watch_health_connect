package com.huami.flutter.appletcompanionplugin;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.bluetooth.store.Callback;
import com.huami.applet.bluetooth.store.StoreProtocolProxyKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001e\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002J\u001b\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0002H\u0017J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/AppletPluginServiceImpl;", "Lcom/huami/flutter/appletcompanionplugin/AppletPluginService;", "", "deviceSource", "Lcom/huami/flutter/appletcompanionplugin/AppletPluginWebApi;", "appletPluginWebApi", "", "Lcom/huami/flutter/appletcompanionplugin/InstalledJsAppData;", "installedMap", "", GoogleApiAvailabilityLight.a, "installedAppListStr", "b", "version1", "version2", "", "a", "version", GoogleApiAvailabilityLight.b, com.google.android.exoplayer2.text.ttml.b.r, "Lkotlin/Pair;", "c", "hasJsAppNeedUpgrade", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hostUrl", "isJsAppDeveloper", "appId", "Lcom/huami/flutter/appletcompanionplugin/HasJsAppInstalledCallback;", "hasJsAppInstalledCallback", "", "hasJsAppInstalled", "Lcom/huami/flutter/appletcompanionplugin/AppletPluginWebApi;", "getAppletPluginWebApi", "()Lcom/huami/flutter/appletcompanionplugin/AppletPluginWebApi;", "", "J", "getLastQueryTimeStamp", "()J", "setLastQueryTimeStamp", "(J)V", "lastQueryTimeStamp", "<init>", "(Lcom/huami/flutter/appletcompanionplugin/AppletPluginWebApi;)V", "Companion", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public final class AppletPluginServiceImpl implements AppletPluginService {

    @NotNull
    private static final String c = "AppletPluginServiceImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppletPluginWebApi appletPluginWebApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long lastQueryTimeStamp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Need request app id list ", this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Datum> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Datum> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Query js app info from cloud, list is ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Js app need upgrade result is false, request app list from clound data is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Datum a;
        public final /* synthetic */ InstalledJsAppData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Datum datum, InstalledJsAppData installedJsAppData) {
            super(0);
            this.a = datum;
            this.b = installedJsAppData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Has js app need upgrade, app id is " + ((int) this.a.getAppid()) + " cloud version is " + this.a.getVersion() + " but installed version is " + this.b.getVersion();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Js app need upgrade result is ", Boolean.valueOf(this.a.element));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Throwable, Unit> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            Job.DefaultImpls.cancel$default((Job) NonCancellable.INSTANCE, (CancellationException) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Query installed app list from applet frequently.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Applet start obtain installed app list.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ JsAppDeveloperInfoData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(JsAppDeveloperInfoData jsAppDeveloperInfoData) {
            super(0);
            this.a = jsAppDeveloperInfoData;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Is js app developer mode data > ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Is js app developer mode result > ", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Is js app developer mode exception > ", this.a);
        }
    }

    public AppletPluginServiceImpl(@NotNull AppletPluginWebApi appletPluginWebApi) {
        this.appletPluginWebApi = appletPluginWebApi;
    }

    private final int a(String version1, String version2) {
        int iIntValue;
        int iIntValue2;
        int length = version1.length();
        int length2 = version2.length();
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        do {
            if (iIntValue3 >= length && iIntValue4 >= length2) {
                return 0;
            }
            Pair<Integer, Integer> pairC = c(version1, length, iIntValue3);
            iIntValue = pairC.getFirst().intValue();
            iIntValue3 = pairC.getSecond().intValue();
            Pair<Integer, Integer> pairC2 = c(version2, length2, iIntValue4);
            iIntValue2 = pairC2.getFirst().intValue();
            iIntValue4 = pairC2.getSecond().intValue();
        } while (iIntValue == iIntValue2);
        return iIntValue > iIntValue2 ? 1 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, InstalledJsAppData> b(String installedAppListStr) {
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) installedAppListStr, new String[]{";"}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : listSplit$default) {
            if (str.length() > 0) {
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, (Object) null);
                if ((!listSplit$default2.isEmpty()) && listSplit$default2.size() >= 2) {
                    String str2 = (String) listSplit$default2.get(1);
                    String strValueOf = String.valueOf(Long.parseLong((String) listSplit$default2.get(0), kotlin.text.a.checkRadix(16)));
                    InstalledJsAppData installedJsAppData = new InstalledJsAppData(strValueOf, str2);
                    if (strValueOf.length() > 0) {
                        map.put(strValueOf, installedJsAppData);
                    }
                }
            }
        }
        return map;
    }

    private final Pair<Integer, Integer> c(String version, int n, int p) {
        int i2;
        int i3 = n - 1;
        if (p > i3) {
            return new Pair<>(0, Integer.valueOf(p));
        }
        int i4 = p;
        while (i4 < n && version.charAt(i4) != '.') {
            i4++;
        }
        if (i4 != i3) {
            Objects.requireNonNull(version, "null cannot be cast to non-null type java.lang.String");
            i2 = Integer.parseInt(version.substring(p, i4));
        } else {
            Objects.requireNonNull(version, "null cannot be cast to non-null type java.lang.String");
            i2 = Integer.parseInt(version.substring(p, n));
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i4 + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.String] */
    public final boolean d(String deviceSource, AppletPluginWebApi appletPluginWebApi, Map<String, InstalledJsAppData> installedMap) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Iterator<Map.Entry<String, InstalledJsAppData>> it2 = installedMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, InstalledJsAppData> next = it2.next();
            if (next.getKey().length() > 0) {
                objectRef.element = Intrinsics.stringPlus(((CharSequence) objectRef.element).length() == 0 ? "" : Intrinsics.stringPlus((String) objectRef.element, ","), next.getKey());
            }
        }
        HMLog.info(c, new a(objectRef));
        List<Datum> jsAppListInfoFromCloud = appletPluginWebApi.getJsAppListInfoFromCloud(deviceSource, (String) objectRef.element);
        HMLog.info(c, new b(jsAppListInfoFromCloud));
        if (jsAppListInfoFromCloud == null || jsAppListInfoFromCloud.isEmpty()) {
            HMLog.error$default(c, null, null, c.a, 6, null);
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (Datum datum : jsAppListInfoFromCloud) {
            InstalledJsAppData installedJsAppData = installedMap.get(String.valueOf((int) datum.getAppid()));
            if (installedJsAppData != null && a(datum.getDeviceSupportVersion(), installedJsAppData.getVersion()) == 1) {
                booleanRef.element = true;
                HMLog.info(c, new d(datum, installedJsAppData));
                break;
            }
        }
        HMLog.info(c, new e(booleanRef));
        return booleanRef.element;
    }

    @NotNull
    public final AppletPluginWebApi getAppletPluginWebApi() {
        return this.appletPluginWebApi;
    }

    public final long getLastQueryTimeStamp() {
        return this.lastQueryTimeStamp;
    }

    @Override // com.huami.flutter.appletcompanionplugin.AppletPluginService
    public void hasJsAppInstalled(@NotNull final String appId, @NotNull final HasJsAppInstalledCallback hasJsAppInstalledCallback) {
        StoreProtocolProxyKt.getStoreProtocol().getInstalledApps(new Callback<String>() { // from class: com.huami.flutter.appletcompanionplugin.AppletPluginServiceImpl.hasJsAppInstalled.1

            /* JADX INFO: renamed from: com.huami.flutter.appletcompanionplugin.AppletPluginServiceImpl$hasJsAppInstalled$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "hasJsAppInstalled：Get installed apps from binding device failed! So has js app need upgrade result is false!";
                }
            }

            /* JADX INFO: renamed from: com.huami.flutter.appletcompanionplugin.AppletPluginServiceImpl$hasJsAppInstalled$1$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "hasJsAppInstalled： response is null.";
                }
            }

            /* JADX INFO: renamed from: com.huami.flutter.appletcompanionplugin.AppletPluginServiceImpl$hasJsAppInstalled$1$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("hasJsAppInstalled result ", Boolean.valueOf(this.a));
                }
            }

            /* JADX INFO: renamed from: com.huami.flutter.appletcompanionplugin.AppletPluginServiceImpl$hasJsAppInstalled$1$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("hasJsAppInstalled：Applet obtain installed app list success,but compare version exception > ", this.a);
                }
            }

            @Override // com.huami.applet.bluetooth.store.Callback
            public void failed(@NotNull Throwable e2) {
                HMLog.error$default(AppletPluginServiceImpl.c, null, null, a.a, 6, null);
                hasJsAppInstalledCallback.onInstalledResultCallback(false);
            }

            @Override // com.huami.applet.bluetooth.store.Callback
            public void success(@NotNull String response) {
                try {
                    if (response.length() == 0) {
                        HMLog.info(AppletPluginServiceImpl.c, b.a);
                        hasJsAppInstalledCallback.onInstalledResultCallback(false);
                        return;
                    }
                    Map mapB = this.b(response);
                    if (mapB == null) {
                        mapB = new HashMap();
                    }
                    boolean zContainsKey = mapB.containsKey(appId);
                    HMLog.info(AppletPluginServiceImpl.c, new c(zContainsKey));
                    hasJsAppInstalledCallback.onInstalledResultCallback(zContainsKey);
                } catch (Exception e2) {
                    HMLog.error$default(AppletPluginServiceImpl.c, null, null, new d(e2), 6, null);
                    hasJsAppInstalledCallback.onInstalledResultCallback(false);
                }
            }
        });
    }

    @Override // com.huami.flutter.appletcompanionplugin.AppletPluginService
    @InternalCoroutinesApi
    @Nullable
    public Object hasJsAppNeedUpgrade(@NotNull final String str, @NotNull Continuation<? super Boolean> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(f.a);
        if (System.currentTimeMillis() - getLastQueryTimeStamp() < 1000) {
            HMLog.info(c, g.a);
            CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
        } else {
            HMLog.info(c, h.a);
            setLastQueryTimeStamp(System.currentTimeMillis());
            StoreProtocolProxyKt.getStoreProtocol().getInstalledApps(new Callback<String>() { // from class: com.huami.flutter.appletcompanionplugin.AppletPluginServiceImpl$hasJsAppNeedUpgrade$2$4

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public static final a a = new a();

                    public a() {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "Get installed apps from binding device failed! So has js app need upgrade result is false!";
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ String a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(String str) {
                        super(0);
                        this.a = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return Intrinsics.stringPlus("Applet start obtain installed app list success > ", this.a);
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class c extends Lambda implements Function0<String> {
                    public final /* synthetic */ Exception a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(Exception exc) {
                        super(0);
                        this.a = exc;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return Intrinsics.stringPlus("Applet obtain installed app list success,but compare version exception > ", this.a);
                    }
                }

                @Override // com.huami.applet.bluetooth.store.Callback
                public void failed(@NotNull Throwable e2) {
                    HMLog.error$default("AppletPluginServiceImpl", null, null, a.a, 6, null);
                    CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                    Boolean bool = Boolean.FALSE;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m3845constructorimpl(bool));
                }

                @Override // com.huami.applet.bluetooth.store.Callback
                public void success(@NotNull String response) {
                    HMLog.info("AppletPluginServiceImpl", new b(response));
                    try {
                        boolean zD = false;
                        if (response.length() == 0) {
                            CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl;
                            Boolean bool = Boolean.FALSE;
                            Result.Companion companion = Result.Companion;
                            cancellableContinuation.resumeWith(Result.m3845constructorimpl(bool));
                            return;
                        }
                        Map mapB = this.b(response);
                        if (mapB != null && !mapB.isEmpty()) {
                            AppletPluginServiceImpl appletPluginServiceImpl = this;
                            zD = appletPluginServiceImpl.d(str, appletPluginServiceImpl.getAppletPluginWebApi(), mapB);
                        }
                        CancellableContinuation<Boolean> cancellableContinuation2 = cancellableContinuationImpl;
                        Boolean boolValueOf = Boolean.valueOf(zD);
                        Result.Companion companion2 = Result.Companion;
                        cancellableContinuation2.resumeWith(Result.m3845constructorimpl(boolValueOf));
                    } catch (Exception e2) {
                        HMLog.error$default("AppletPluginServiceImpl", null, null, new c(e2), 6, null);
                        CancellableContinuation<Boolean> cancellableContinuation3 = cancellableContinuationImpl;
                        Boolean bool2 = Boolean.FALSE;
                        Result.Companion companion3 = Result.Companion;
                        cancellableContinuation3.resumeWith(Result.m3845constructorimpl(bool2));
                    }
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.huami.flutter.appletcompanionplugin.AppletPluginService
    @InternalCoroutinesApi
    public boolean isJsAppDeveloper(@NotNull String hostUrl) {
        Integer examineType;
        try {
            JsAppDeveloperInfoData jsAppDeveloperInfo = this.appletPluginWebApi.getJsAppDeveloperInfo(hostUrl);
            HMLog.info(c, new i(jsAppDeveloperInfo));
            boolean z = ((jsAppDeveloperInfo == null ? null : jsAppDeveloperInfo.getExamineType()) == null || (examineType = jsAppDeveloperInfo.getExamineType()) == null || examineType.intValue() != 2) ? false : true;
            HMLog.info(c, new j(z));
            return z;
        } catch (Exception e2) {
            HMLog.error$default(c, null, null, new k(e2), 6, null);
            return false;
        }
    }

    public final void setLastQueryTimeStamp(long j2) {
        this.lastQueryTimeStamp = j2;
    }
}
