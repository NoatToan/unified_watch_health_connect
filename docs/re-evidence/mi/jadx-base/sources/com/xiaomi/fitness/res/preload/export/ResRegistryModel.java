package com.xiaomi.fitness.res.preload.export;

import com.xiaomi.fitness.net.downloadV2.DownloadRequest;
import com.xiaomi.fitness.net.downloadV2.DownloadRequestKt;
import com.xiaomi.fitness.net.downloadV2.listener.ISingleFileDownloadListener;
import com.xiaomi.fitness.res.preload.export.ResRegistryModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/res/preload/export/ResRegistryModel;", "", "request", "Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "existCheck", "Lkotlin/Function0;", "", "downloadListener", "Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "<init>", "(Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;Lkotlin/jvm/functions/Function0;Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;)V", "getRequest", "()Lcom/xiaomi/fitness/net/downloadV2/DownloadRequest;", "getExistCheck", "()Lkotlin/jvm/functions/Function0;", "getDownloadListener", "()Lcom/xiaomi/fitness/net/downloadV2/listener/ISingleFileDownloadListener;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "res-preload-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResRegistryModel {

    @Nullable
    private final ISingleFileDownloadListener downloadListener;

    @NotNull
    private final Function0<Boolean> existCheck;

    @NotNull
    private final DownloadRequest request;

    public ResRegistryModel(@NotNull DownloadRequest request, @NotNull Function0<Boolean> existCheck, @Nullable ISingleFileDownloadListener iSingleFileDownloadListener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(existCheck, "existCheck");
        this.request = request;
        this.existCheck = existCheck;
        this.downloadListener = iSingleFileDownloadListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(DownloadRequest request) {
        Intrinsics.checkNotNullParameter(request, "$request");
        return DownloadRequestKt.isFileExist(request);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResRegistryModel copy$default(ResRegistryModel resRegistryModel, DownloadRequest downloadRequest, Function0 function0, ISingleFileDownloadListener iSingleFileDownloadListener, int i, Object obj) {
        if ((i & 1) != 0) {
            downloadRequest = resRegistryModel.request;
        }
        if ((i & 2) != 0) {
            function0 = resRegistryModel.existCheck;
        }
        if ((i & 4) != 0) {
            iSingleFileDownloadListener = resRegistryModel.downloadListener;
        }
        return resRegistryModel.copy(downloadRequest, function0, iSingleFileDownloadListener);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownloadRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final Function0<Boolean> component2() {
        return this.existCheck;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ISingleFileDownloadListener getDownloadListener() {
        return this.downloadListener;
    }

    @NotNull
    public final ResRegistryModel copy(@NotNull DownloadRequest request, @NotNull Function0<Boolean> existCheck, @Nullable ISingleFileDownloadListener downloadListener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(existCheck, "existCheck");
        return new ResRegistryModel(request, existCheck, downloadListener);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResRegistryModel)) {
            return false;
        }
        ResRegistryModel resRegistryModel = (ResRegistryModel) other;
        return Intrinsics.areEqual(this.request, resRegistryModel.request) && Intrinsics.areEqual(this.existCheck, resRegistryModel.existCheck) && Intrinsics.areEqual(this.downloadListener, resRegistryModel.downloadListener);
    }

    @Nullable
    public final ISingleFileDownloadListener getDownloadListener() {
        return this.downloadListener;
    }

    @NotNull
    public final Function0<Boolean> getExistCheck() {
        return this.existCheck;
    }

    @NotNull
    public final DownloadRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        int iHashCode = ((this.request.hashCode() * 31) + this.existCheck.hashCode()) * 31;
        ISingleFileDownloadListener iSingleFileDownloadListener = this.downloadListener;
        return iHashCode + (iSingleFileDownloadListener == null ? 0 : iSingleFileDownloadListener.hashCode());
    }

    @NotNull
    public String toString() {
        return "ResRegistryModel(request=" + this.request + ", existCheck=" + this.existCheck + ", downloadListener=" + this.downloadListener + ")";
    }

    public /* synthetic */ ResRegistryModel(final DownloadRequest downloadRequest, Function0 function0, ISingleFileDownloadListener iSingleFileDownloadListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(downloadRequest, (i & 2) != 0 ? new Function0() { // from class: fpk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ResRegistryModel._init_$lambda$0(downloadRequest));
            }
        } : function0, (i & 4) != 0 ? null : iSingleFileDownloadListener);
    }
}
