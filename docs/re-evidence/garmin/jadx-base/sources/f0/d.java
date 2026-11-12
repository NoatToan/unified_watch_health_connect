package f0;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lf0/d;", "Ld0/a;", "", "imageCaptureOutputFormat", "<init>", "(I)V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends d0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f67637c = b.IMAGE_FORMAT;

    static {
        new a(null);
    }

    public d(int i14) {
        this.f67636b = i14;
    }

    @Override // d0.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF67640c() {
        return this.f67637c;
    }

    public final String toString() {
        String strI;
        StringBuilder sb3 = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i14 = this.f67636b;
        if (i14 != 0) {
            strI = i14 != 1 ? e0.i("UNDEFINED(", i14, CoreConstants.RIGHT_PARENTHESIS_CHAR) : "JPEG_R";
        } else {
            strI = "JPEG";
        }
        return a0.m(sb3, strI, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf0/d$a;", "", "<init>", "()V", "", "DEFAULT_IMAGE_CAPTURE_OUTPUT_FORMAT", "I", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
