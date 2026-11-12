package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.mlkit.common.model.RemoteModel;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class SharedPrefManager {

    @KeepForSdk
    public static final Component<?> COMPONENT = Component.builder(SharedPrefManager.class).add(Dependency.required((Class<?>) MlKitContext.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: com.google.mlkit.common.sdkinternal.zzs
        @Override // com.google.firebase.components.ComponentFactory
        public final Object create(ComponentContainer componentContainer) {
            return new SharedPrefManager((Context) componentContainer.get(Context.class));
        }
    }).build();

    @KeepForSdk
    public static final String PREF_FILE = "com.google.mlkit.internal";
    protected final Context zza;

    public SharedPrefManager(Context context) {
        this.zza = context;
    }

    @KeepForSdk
    public static SharedPrefManager getInstance(MlKitContext mlKitContext) {
        return (SharedPrefManager) mlKitContext.get(SharedPrefManager.class);
    }

    @KeepForSdk
    public synchronized void clearDownloadingModelInfo(RemoteModel remoteModel) {
        String downloadingModelHash = getDownloadingModelHash(remoteModel);
        zza().edit().remove("downloading_model_id_" + remoteModel.getUniqueModelNameForPersist()).remove("downloading_model_hash_" + remoteModel.getUniqueModelNameForPersist()).remove("downloading_model_type_" + downloadingModelHash).remove("downloading_begin_time_" + remoteModel.getUniqueModelNameForPersist()).remove("model_first_use_time_" + remoteModel.getUniqueModelNameForPersist()).apply();
    }

    @KeepForSdk
    public synchronized void clearIncompatibleModelInfo(RemoteModel remoteModel) {
        zza().edit().remove("bad_hash_" + remoteModel.getUniqueModelNameForPersist()).remove("app_version").apply();
    }

    @KeepForSdk
    public synchronized void clearLatestModelHash(RemoteModel remoteModel) {
        zza().edit().remove("current_model_hash_" + remoteModel.getUniqueModelNameForPersist()).commit();
    }

    @KeepForSdk
    public synchronized String getDownloadingModelHash(RemoteModel remoteModel) {
        return zza().getString("downloading_model_hash_" + remoteModel.getUniqueModelNameForPersist(), null);
    }

    @KeepForSdk
    public synchronized Long getDownloadingModelId(RemoteModel remoteModel) {
        long j8 = zza().getLong("downloading_model_id_" + remoteModel.getUniqueModelNameForPersist(), -1L);
        if (j8 < 0) {
            return null;
        }
        return Long.valueOf(j8);
    }

    @KeepForSdk
    public synchronized String getIncompatibleModelHash(RemoteModel remoteModel) {
        return zza().getString("bad_hash_" + remoteModel.getUniqueModelNameForPersist(), null);
    }

    @KeepForSdk
    public synchronized String getLatestModelHash(RemoteModel remoteModel) {
        return zza().getString("current_model_hash_" + remoteModel.getUniqueModelNameForPersist(), null);
    }

    @KeepForSdk
    public synchronized String getMlSdkInstanceId() {
        String string = zza().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        zza().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    @KeepForSdk
    public synchronized long getModelDownloadBeginTimeMs(RemoteModel remoteModel) {
        return zza().getLong("downloading_begin_time_" + remoteModel.getUniqueModelNameForPersist(), 0L);
    }

    @KeepForSdk
    public synchronized long getModelFirstUseTimeMs(RemoteModel remoteModel) {
        return zza().getLong("model_first_use_time_" + remoteModel.getUniqueModelNameForPersist(), 0L);
    }

    @KeepForSdk
    public synchronized String getPreviousAppVersion() {
        return zza().getString("app_version", null);
    }

    @KeepForSdk
    public synchronized void setDownloadingModelInfo(long j8, ModelInfo modelInfo) {
        String modelNameForPersist = modelInfo.getModelNameForPersist();
        String modelHash = modelInfo.getModelHash();
        zza().edit().putString("downloading_model_hash_" + modelNameForPersist, modelHash).putLong("downloading_model_id_" + modelNameForPersist, j8).putLong("downloading_begin_time_" + modelNameForPersist, SystemClock.elapsedRealtime()).apply();
    }

    @KeepForSdk
    public synchronized void setIncompatibleModelInfo(RemoteModel remoteModel, String str, String str2) {
        zza().edit().putString("bad_hash_" + remoteModel.getUniqueModelNameForPersist(), str).putString("app_version", str2).apply();
    }

    @KeepForSdk
    public synchronized void setLatestModelHash(RemoteModel remoteModel, String str) {
        zza().edit().putString("current_model_hash_" + remoteModel.getUniqueModelNameForPersist(), str).apply();
    }

    @KeepForSdk
    public synchronized void setModelFirstUseTimeMs(RemoteModel remoteModel, long j8) {
        zza().edit().putLong("model_first_use_time_" + remoteModel.getUniqueModelNameForPersist(), j8).apply();
    }

    public final SharedPreferences zza() {
        return this.zza.getSharedPreferences(PREF_FILE, 0);
    }

    public final synchronized String zzb(String str, long j8) {
        return zza().getString(String.format("cached_local_model_hash_%1s_%2s", Preconditions.checkNotNull(str), Long.valueOf(j8)), null);
    }

    public final synchronized void zzc(String str, long j8, String str2) {
        zza().edit().putString(String.format("cached_local_model_hash_%1s_%2s", Preconditions.checkNotNull(str), Long.valueOf(j8)), str2).apply();
    }
}
