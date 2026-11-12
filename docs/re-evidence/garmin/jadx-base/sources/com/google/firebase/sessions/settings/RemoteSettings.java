package com.google.firebase.sessions.settings;

import android.os.Build;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.TimeProvider;
import d53.k;
import e53.f;
import java.util.Map;
import o13.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u0;
import t13.d;
import v13.c;
import v13.e;
import vb.h;
import z53.a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0012H\u0081@¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Lcom/google/firebase/sessions/settings/SettingsCache;)V", "", "s", "sanitize", "(Ljava/lang/String;)Ljava/lang/String;", "", "updateSettings", "(Lt13/d;)Ljava/lang/Object;", "", "isSettingsStale", "()Z", "clearCachedSettings$com_google_firebase_firebase_sessions", "clearCachedSettings", "Lcom/google/firebase/sessions/TimeProvider;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "Lcom/google/firebase/sessions/ApplicationInfo;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lz53/a;", "fetchInProgress", "Lz53/a;", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Le53/c;", "getSessionRestartTimeout-FghU774", "()Le53/c;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion(null);
    private static final int defaultCacheDuration;
    private static final k sanitizeRegex;
    private final ApplicationInfo appInfo;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final a fetchInProgress;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final SettingsCache settingsCache;
    private final TimeProvider timeProvider;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {165, 78, 95}, m = "updateSettings")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    static {
        e53.c.a aVar = e53.c.f63094b;
        defaultCacheDuration = (int) e53.c.j(e53.e.e(24, f.HOURS), f.SECONDS);
        sanitizeRegex = new k("/");
    }

    public RemoteSettings(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, SettingsCache settingsCache) {
        timeProvider.getClass();
        firebaseInstallationsApi.getClass();
        applicationInfo.getClass();
        crashlyticsSettingsFetcher.getClass();
        settingsCache.getClass();
        this.timeProvider = timeProvider;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = applicationInfo;
        this.configsFetcher = crashlyticsSettingsFetcher;
        this.settingsCache = settingsCache;
        this.fetchInProgress = z53.c.a();
    }

    private final String sanitize(String s8) {
        return sanitizeRegex.f(s8, "");
    }

    public final Object clearCachedSettings$com_google_firebase_firebase_sessions(d<? super Unit> dVar) {
        Object objUpdateConfigs = this.settingsCache.updateConfigs(SessionConfigsSerializer.INSTANCE.getDefaultValue(), dVar);
        return objUpdateConfigs == u13.a.COROUTINE_SUSPENDED ? objUpdateConfigs : Unit.INSTANCE;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public e53.c mo102getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        e53.c.a aVar = e53.c.f63094b;
        return e53.c.c(e53.e.e(numSessionRestartTimeout.intValue(), f.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return this.settingsCache.hasCacheExpired();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b9 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:21:0x0044, B:47:0x00ab, B:49:0x00b9, B:52:0x00bf), top: B:63:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf A[Catch: all -> 0x0049, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:21:0x0044, B:47:0x00ab, B:49:0x00b9, B:52:0x00bf), top: B:63:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00bf, please report this as an issue */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public Object updateSettings(d<? super Unit> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        a aVar;
        RemoteSettings remoteSettings;
        a aVar2;
        Throwable th3;
        a aVar3;
        RemoteSettings remoteSettings2;
        String fid;
        Map<String, String> mapE;
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1;
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        try {
            if (i15 == 0) {
                r.b(obj);
                if (!this.fetchInProgress.a() && !this.settingsCache.hasCacheExpired()) {
                    return Unit.INSTANCE;
                }
                aVar = this.fetchInProgress;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = aVar;
                anonymousClass1.label = 1;
                if (aVar.c(anonymousClass1) != aVar4) {
                    remoteSettings = this;
                }
                return aVar4;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) anonymousClass1.L$0;
                    try {
                        r.b(obj);
                        Unit unit = Unit.INSTANCE;
                        aVar2.e(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th3 = th4;
                        aVar2.e(null);
                        throw th3;
                    }
                }
                aVar3 = (a) anonymousClass1.L$1;
                remoteSettings2 = (RemoteSettings) anonymousClass1.L$0;
                try {
                    r.b(obj);
                    fid = ((InstallationId) obj).getFid();
                    if (s.g(fid, "")) {
                        Unit unit2 = Unit.INSTANCE;
                        aVar3.e(null);
                        return unit2;
                    }
                    p pVar = new p("X-Crashlytics-Installation-ID", fid);
                    p pVar2 = new p("X-Crashlytics-Device-Model", remoteSettings2.sanitize(Build.MANUFACTURER + Build.MODEL));
                    String str = Build.VERSION.INCREMENTAL;
                    str.getClass();
                    p pVar3 = new p("X-Crashlytics-OS-Build-Version", remoteSettings2.sanitize(str));
                    String str2 = Build.VERSION.RELEASE;
                    str2.getClass();
                    mapE = u0.e(pVar, pVar2, pVar3, new p("X-Crashlytics-OS-Display-Version", remoteSettings2.sanitize(str2)), new p("X-Crashlytics-API-Client-Version", remoteSettings2.appInfo.getSessionSdkVersion()));
                    crashlyticsSettingsFetcher = remoteSettings2.configsFetcher;
                    remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings2, null);
                    remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                    anonymousClass1.L$0 = aVar3;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (crashlyticsSettingsFetcher.doConfigFetch(mapE, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, anonymousClass1) != aVar4) {
                        aVar2 = aVar3;
                        Unit unit3 = Unit.INSTANCE;
                        aVar2.e(null);
                        return Unit.INSTANCE;
                    }
                    return aVar4;
                } catch (Throwable th5) {
                    th3 = th5;
                    aVar2 = aVar3;
                    aVar2.e(null);
                    throw th3;
                }
            }
            a aVar5 = (a) anonymousClass1.L$1;
            remoteSettings = (RemoteSettings) anonymousClass1.L$0;
            r.b(obj);
            aVar = aVar5;
            if (!remoteSettings.settingsCache.hasCacheExpired()) {
                Unit unit4 = Unit.INSTANCE;
                aVar.e(null);
                return unit4;
            }
            InstallationId.Companion companion = InstallationId.INSTANCE;
            FirebaseInstallationsApi firebaseInstallationsApi = remoteSettings.firebaseInstallationsApi;
            anonymousClass1.L$0 = remoteSettings;
            anonymousClass1.L$1 = aVar;
            anonymousClass1.label = 2;
            Object objCreate = companion.create(firebaseInstallationsApi, anonymousClass1);
            if (objCreate != aVar4) {
                aVar3 = aVar;
                obj = objCreate;
                remoteSettings2 = remoteSettings;
                fid = ((InstallationId) obj).getFid();
                if (s.g(fid, "")) {
                    Unit unit5 = Unit.INSTANCE;
                    aVar3.e(null);
                    return unit5;
                }
                p pVar4 = new p("X-Crashlytics-Installation-ID", fid);
                p pVar5 = new p("X-Crashlytics-Device-Model", remoteSettings2.sanitize(Build.MANUFACTURER + Build.MODEL));
                String str3 = Build.VERSION.INCREMENTAL;
                str3.getClass();
                p pVar6 = new p("X-Crashlytics-OS-Build-Version", remoteSettings2.sanitize(str3));
                String str4 = Build.VERSION.RELEASE;
                str4.getClass();
                mapE = u0.e(pVar4, pVar5, pVar6, new p("X-Crashlytics-OS-Display-Version", remoteSettings2.sanitize(str4)), new p("X-Crashlytics-API-Client-Version", remoteSettings2.appInfo.getSessionSdkVersion()));
                crashlyticsSettingsFetcher = remoteSettings2.configsFetcher;
                remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings2, null);
                remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(null);
                anonymousClass1.L$0 = aVar3;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (crashlyticsSettingsFetcher.doConfigFetch(mapE, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, anonymousClass1) != aVar4) {
                    aVar2 = aVar3;
                    Unit unit6 = Unit.INSTANCE;
                    aVar2.e(null);
                    return Unit.INSTANCE;
                }
            }
            return aVar4;
        } catch (Throwable th6) {
            aVar2 = aVar;
            th3 = th6;
            aVar2.e(null);
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "<init>", "()V", "", "defaultCacheDuration", "I", "getDefaultCacheDuration", "()I", "Ld53/k;", "sanitizeRegex", "Ld53/k;", "getSanitizeRegex", "()Ld53/k;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final int getDefaultCacheDuration() {
            return RemoteSettings.defaultCacheDuration;
        }

        public final k getSanitizeRegex() {
            return RemoteSettings.sanitizeRegex;
        }

        private Companion() {
        }
    }
}
