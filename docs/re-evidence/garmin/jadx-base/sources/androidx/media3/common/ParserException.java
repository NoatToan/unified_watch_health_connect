package androidx.media3.common;

import java.io.IOException;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(String str, Throwable th3, boolean z14, int i14) {
        super(str, th3);
        this.contentIsMalformed = z14;
        this.dataType = i14;
    }

    public static ParserException createForMalformedContainer(String str, Throwable th3) {
        return new ParserException(str, th3, true, 1);
    }

    public static ParserException createForMalformedDataOfUnknownType(String str, Throwable th3) {
        return new ParserException(str, th3, true, 0);
    }

    public static ParserException createForMalformedManifest(String str, Throwable th3) {
        return new ParserException(str, th3, true, 4);
    }

    public static ParserException createForManifestWithUnsupportedFeature(String str, Throwable th3) {
        return new ParserException(str, th3, false, 4);
    }

    public static ParserException createForUnsupportedContainerFeature(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.getMessage());
        sb3.append(" {contentIsMalformed=");
        sb3.append(this.contentIsMalformed);
        sb3.append(", dataType=");
        return am.j.q(sb3, this.dataType, StringSubstitutor.DEFAULT_VAR_END);
    }
}
