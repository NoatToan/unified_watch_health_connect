package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f53269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i14, Throwable th3) {
        super(new Status(i14, o2.c.e(i14, "Integrity API error (", "): ", com.google.android.play.core.integrity.model.a.a(i14), ".")));
        Locale locale = Locale.ROOT;
        if (i14 != 0) {
            this.f53269a = th3;
        } else {
            vb.h.s("ErrorCode should not be 0.");
            throw null;
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f53269a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
