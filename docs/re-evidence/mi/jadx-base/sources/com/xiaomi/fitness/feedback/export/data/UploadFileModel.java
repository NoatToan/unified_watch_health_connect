package com.xiaomi.fitness.feedback.export.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel;", "", "<init>", "()V", "UploadFileRequest", "UploadFileResult", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadFileModel {

    @NotNull
    public static final UploadFileModel INSTANCE = new UploadFileModel();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileRequest;", "", "prefix", "", "suffix", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UploadFileRequest {

        @NotNull
        private final String prefix;

        @NotNull
        private final String suffix;

        public UploadFileRequest(@NotNull String prefix, @NotNull String suffix) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileResult;", "", "<init>", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "obj_name", "getObj_name", "setObj_name", "method", "getMethod", "setMethod", "expires_time", "", "getExpires_time", "()J", "setExpires_time", "(J)V", "toString", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UploadFileResult {
        private long expires_time;

        @Nullable
        private String method;

        @Nullable
        private String obj_name;

        @Nullable
        private String url;

        public final long getExpires_time() {
            return this.expires_time;
        }

        @Nullable
        public final String getMethod() {
            return this.method;
        }

        @Nullable
        public final String getObj_name() {
            return this.obj_name;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setExpires_time(long j) {
            this.expires_time = j;
        }

        public final void setMethod(@Nullable String str) {
            this.method = str;
        }

        public final void setObj_name(@Nullable String str) {
            this.obj_name = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        @NotNull
        public String toString() {
            return "UploadFileResult(url=" + this.url + ", obj_name=" + this.obj_name + ", method=" + this.method + ", expires_time=" + this.expires_time + ")";
        }
    }

    private UploadFileModel() {
    }
}
