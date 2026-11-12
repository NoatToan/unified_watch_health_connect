package com.google.firebase.remoteconfig;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/Firebase;", "Lcom/google/firebase/FirebaseApp;", "app", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "remoteConfig", "(Lcom/google/firebase/Firebase;Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "", Action.KEY_ATTRIBUTE, "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "get", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings$Builder;", "", "init", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "remoteConfigSettings", "(Le23/l;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "Lcom/google/firebase/remoteconfig/CustomSignals$Builder;", "builder", "Lcom/google/firebase/remoteconfig/CustomSignals;", RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, "(Le23/l;)Lcom/google/firebase/remoteconfig/CustomSignals;", "getRemoteConfig", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "Lr53/i;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "getConfigUpdates", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)Lr53/i;", "configUpdates", "com.google.firebase-firebase-config"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RemoteConfigKt {
    public static final CustomSignals customSignals(l<? super CustomSignals.Builder, Unit> lVar) {
        lVar.getClass();
        CustomSignals.Builder builder = new CustomSignals.Builder();
        lVar.invoke(builder);
        CustomSignals customSignalsBuild = builder.build();
        customSignalsBuild.getClass();
        return customSignalsBuild;
    }

    public static final FirebaseRemoteConfigValue get(FirebaseRemoteConfig firebaseRemoteConfig, String str) {
        firebaseRemoteConfig.getClass();
        str.getClass();
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(str);
        value.getClass();
        return value;
    }

    public static final i<ConfigUpdate> getConfigUpdates(FirebaseRemoteConfig firebaseRemoteConfig) {
        firebaseRemoteConfig.getClass();
        return s.f(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    public static final FirebaseRemoteConfig getRemoteConfig(Firebase firebase) {
        firebase.getClass();
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        firebaseRemoteConfig.getClass();
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfig remoteConfig(Firebase firebase, FirebaseApp firebaseApp) {
        firebase.getClass();
        firebaseApp.getClass();
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(firebaseApp);
        firebaseRemoteConfig.getClass();
        return firebaseRemoteConfig;
    }

    public static final FirebaseRemoteConfigSettings remoteConfigSettings(l<? super FirebaseRemoteConfigSettings.Builder, Unit> lVar) {
        lVar.getClass();
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        lVar.invoke(builder);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = builder.build();
        firebaseRemoteConfigSettingsBuild.getClass();
        return firebaseRemoteConfigSettingsBuild;
    }
}
