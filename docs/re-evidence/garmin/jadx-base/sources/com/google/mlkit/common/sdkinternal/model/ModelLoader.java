package com.google.mlkit.common.sdkinternal.model;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.ktx.BuildConfig;
import com.google.mlkit.common.MlKitException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;
import v.e0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class ModelLoader {
    private static final GmsLogger zza = new GmsLogger("ModelLoader", "");

    @KeepForSdk
    public final LocalModelLoader localModelLoader;

    @KeepForSdk
    protected ModelLoadingState modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;

    @KeepForSdk
    public final RemoteModelLoader remoteModelLoader;
    private final ModelLoadingLogger zzb;

    @KeepForSdk
    public interface ModelContentHandler {
        @KeepForSdk
        void constructModel(MappedByteBuffer mappedByteBuffer);
    }

    @KeepForSdk
    public interface ModelLoadingLogger {
        @KeepForSdk
        void logErrorCodes(List<Integer> list);
    }

    @KeepForSdk
    public enum ModelLoadingState {
        NO_MODEL_LOADED,
        REMOTE_MODEL_LOADED,
        LOCAL_MODEL_LOADED
    }

    @KeepForSdk
    public ModelLoader(RemoteModelLoader remoteModelLoader, LocalModelLoader localModelLoader, ModelLoadingLogger modelLoadingLogger) {
        boolean z14 = true;
        if (remoteModelLoader == null && localModelLoader == null) {
            z14 = false;
        }
        Preconditions.checkArgument(z14, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        Preconditions.checkNotNull(modelLoadingLogger);
        this.remoteModelLoader = remoteModelLoader;
        this.localModelLoader = localModelLoader;
        this.zzb = modelLoadingLogger;
    }

    private final String zza() {
        LocalModelLoader localModelLoader = this.localModelLoader;
        String string = null;
        if (localModelLoader != null) {
            String assetFilePath = localModelLoader.getLocalModel().getAssetFilePath();
            LocalModelLoader localModelLoader2 = this.localModelLoader;
            if (assetFilePath != null) {
                string = localModelLoader2.getLocalModel().getAssetFilePath();
            } else {
                String absoluteFilePath = localModelLoader2.getLocalModel().getAbsoluteFilePath();
                LocalModelLoader localModelLoader3 = this.localModelLoader;
                if (absoluteFilePath != null) {
                    string = localModelLoader3.getLocalModel().getAbsoluteFilePath();
                } else if (localModelLoader3.getLocalModel().getUri() != null) {
                    string = ((Uri) Preconditions.checkNotNull(this.localModelLoader.getLocalModel().getUri())).toString();
                }
            }
        }
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        return e0.g("Local model path: ", string, ". Remote model name: ", remoteModelLoader == null ? BuildConfig.VERSION_NAME : remoteModelLoader.getRemoteModel().getUniqueModelNameForPersist(), ". ");
    }

    private final synchronized boolean zzb(ModelContentHandler modelContentHandler, List list) {
        MappedByteBuffer mappedByteBufferLoad;
        LocalModelLoader localModelLoader = this.localModelLoader;
        if (localModelLoader == null || (mappedByteBufferLoad = localModelLoader.load()) == null) {
            return false;
        }
        try {
            modelContentHandler.constructModel(mappedByteBufferLoad);
            zza.d("ModelLoader", "Local model source is loaded successfully");
            return true;
        } catch (RuntimeException e4) {
            list.add(18);
            throw e4;
        }
    }

    private final synchronized boolean zzc(ModelContentHandler modelContentHandler, List list) {
        RemoteModelLoader remoteModelLoader = this.remoteModelLoader;
        if (remoteModelLoader != null) {
            try {
                MappedByteBuffer mappedByteBufferLoad = remoteModelLoader.load();
                if (mappedByteBufferLoad != null) {
                    try {
                        modelContentHandler.constructModel(mappedByteBufferLoad);
                        zza.d("ModelLoader", "Remote model source is loaded successfully");
                        return true;
                    } catch (RuntimeException e4) {
                        list.add(19);
                        throw e4;
                    }
                }
                zza.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(21);
            } catch (MlKitException e14) {
                zza.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(20);
                throw e14;
            }
        }
        return false;
    }

    @KeepForSdk
    public synchronized boolean isRemoteModelLoaded() {
        return this.modelLoadingState == ModelLoadingState.REMOTE_MODEL_LOADED;
    }

    @KeepForSdk
    public synchronized void loadWithModelContentHandler(ModelContentHandler modelContentHandler) {
        Exception exc;
        boolean zZzc;
        ArrayList arrayList = new ArrayList();
        boolean zZzb = false;
        Exception e4 = null;
        try {
            zZzc = zzc(modelContentHandler, arrayList);
            exc = null;
        } catch (Exception e14) {
            exc = e14;
            zZzc = false;
        }
        if (zZzc) {
            this.zzb.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.REMOTE_MODEL_LOADED;
            return;
        }
        try {
            zZzb = zzb(modelContentHandler, arrayList);
        } catch (Exception e15) {
            e4 = e15;
        }
        if (zZzb) {
            this.zzb.logErrorCodes(arrayList);
            this.modelLoadingState = ModelLoadingState.LOCAL_MODEL_LOADED;
            return;
        }
        arrayList.add(17);
        this.zzb.logErrorCodes(arrayList);
        this.modelLoadingState = ModelLoadingState.NO_MODEL_LOADED;
        if (exc != null) {
            throw new MlKitException("Remote model load failed with the model options: ".concat(String.valueOf(zza())), 14, exc);
        }
        if (e4 == null) {
            throw new MlKitException("Cannot load any model with the model options: ".concat(String.valueOf(zza())), 14);
        }
        throw new MlKitException("Local model load failed with the model options: ".concat(String.valueOf(zza())), 14, e4);
    }
}
