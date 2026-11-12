package androidx.constraintlayout.core.parser;

import am.j;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import p6.d;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, d dVar) {
        super(str);
        this.mReason = str;
        if (dVar != null) {
            this.mElementClass = dVar.e();
            this.mLineNumber = 0;
        } else {
            this.mElementClass = PrivacyUpdateRequestError.UNKNOWN;
            this.mLineNumber = 0;
        }
    }

    public String reason() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.mReason);
        sb3.append(" (");
        sb3.append(this.mElementClass);
        sb3.append(" at line ");
        return j.q(sb3, this.mLineNumber, ")");
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
