package androidx.camera.view.video;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_OutputFileResults extends OutputFileResults {
    private final Uri savedUri;

    public AutoValue_OutputFileResults(@Nullable Uri uri) {
        this.savedUri = uri;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputFileResults)) {
            return false;
        }
        Uri uri = this.savedUri;
        Uri savedUri = ((OutputFileResults) obj).getSavedUri();
        if (uri == null) {
            return savedUri == null;
        }
        return uri.equals(savedUri);
    }

    @Override // androidx.camera.view.video.OutputFileResults
    @Nullable
    public Uri getSavedUri() {
        return this.savedUri;
    }

    public int hashCode() {
        Uri uri = this.savedUri;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "OutputFileResults{savedUri=" + this.savedUri + i.d;
    }
}
