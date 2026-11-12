package h0;

import androidx.camera.core.ImageCaptureException;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageCaptureException f80480b;

    public i(int i14, ImageCaptureException imageCaptureException) {
        this.f80479a = i14;
        if (imageCaptureException != null) {
            this.f80480b = imageCaptureException;
        } else {
            j20.x.l("Null imageCaptureException");
            throw null;
        }
    }

    @Override // h0.p0.a
    public final ImageCaptureException a() {
        return this.f80480b;
    }

    @Override // h0.p0.a
    public final int b() {
        return this.f80479a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0.a)) {
            return false;
        }
        p0.a aVar = (p0.a) obj;
        return this.f80479a == aVar.b() && this.f80480b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f80479a ^ 1000003) * 1000003) ^ this.f80480b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f80479a + ", imageCaptureException=" + this.f80480b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
