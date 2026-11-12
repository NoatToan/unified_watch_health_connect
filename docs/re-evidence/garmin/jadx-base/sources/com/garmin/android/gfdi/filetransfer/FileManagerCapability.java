package com.garmin.android.gfdi.filetransfer;

import com.airbnb.lottie.animation.keyframe.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability;", "", "setDefaultFileReadOptions", "", "options", "Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability$FileReadOptions;", "FileReadOptions", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FileManagerCapability {
    void setDefaultFileReadOptions(FileReadOptions options);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability$FileReadOptions;", "", "useCompression", "", "<init>", "(Z)V", "getUseCompression", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FileReadOptions {
        private final boolean useCompression;

        public /* synthetic */ FileReadOptions(boolean z14, int i14, j jVar) {
            this((i14 & 1) != 0 ? true : z14);
        }

        public static /* synthetic */ FileReadOptions copy$default(FileReadOptions fileReadOptions, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = fileReadOptions.useCompression;
            }
            return fileReadOptions.copy(z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getUseCompression() {
            return this.useCompression;
        }

        public final FileReadOptions copy(boolean useCompression) {
            return new FileReadOptions(useCompression);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FileReadOptions) && this.useCompression == ((FileReadOptions) other).useCompression;
        }

        public final boolean getUseCompression() {
            return this.useCompression;
        }

        public int hashCode() {
            return Boolean.hashCode(this.useCompression);
        }

        public String toString() {
            return a.g("FileReadOptions(useCompression=", ")", this.useCompression);
        }

        public FileReadOptions(boolean z14) {
            this.useCompression = z14;
        }

        public FileReadOptions() {
            this(false, 1, null);
        }
    }
}
