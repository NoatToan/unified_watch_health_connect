package com.xiaomi.fitness.feedback.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/feedback/data/DownloadFileModel;", "", "<init>", "()V", "DownloadFileRequest", "DownloadFileResult", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadFileModel {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/feedback/data/DownloadFileModel$DownloadFileRequest;", "", "objName", "", "<init>", "(Ljava/lang/String;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DownloadFileRequest {

        @SerializedName("obj_name")
        @NotNull
        private final String objName;

        public DownloadFileRequest(@NotNull String objName) {
            Intrinsics.checkNotNullParameter(objName, "objName");
            this.objName = objName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/feedback/data/DownloadFileModel$DownloadFileResult;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DownloadFileResult {

        @Nullable
        private String url;

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }
}
