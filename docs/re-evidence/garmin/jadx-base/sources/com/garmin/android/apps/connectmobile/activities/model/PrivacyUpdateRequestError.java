package com.garmin.android.apps.connectmobile.activities.model;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p6.b;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ:\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006 "}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/model/PrivacyUpdateRequestError;", "Ljava/lang/Exception;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "message", "", "errors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/garmin/android/apps/connectmobile/activities/model/PrivacyUpdateRequestError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "getMessage", "Ljava/util/List;", "getErrors", "Companion", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PrivacyUpdateRequestError extends Exception {
    public static final String TOO_MANY_REQUESTS = "TooManyRequestsException";
    public static final String UNKNOWN = "unknown";

    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private final String error;

    @SerializedName("errors")
    private final List<String> errors;

    @SerializedName("message")
    private final String message;
    public static final int $stable = 8;

    public /* synthetic */ PrivacyUpdateRequestError(String str, String str2, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacyUpdateRequestError copy$default(PrivacyUpdateRequestError privacyUpdateRequestError, String str, String str2, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = privacyUpdateRequestError.error;
        }
        if ((i14 & 2) != 0) {
            str2 = privacyUpdateRequestError.message;
        }
        if ((i14 & 4) != 0) {
            list = privacyUpdateRequestError.errors;
        }
        return privacyUpdateRequestError.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<String> component3() {
        return this.errors;
    }

    public final PrivacyUpdateRequestError copy(String error, String message, List<String> errors) {
        return new PrivacyUpdateRequestError(error, message, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyUpdateRequestError)) {
            return false;
        }
        PrivacyUpdateRequestError privacyUpdateRequestError = (PrivacyUpdateRequestError) other;
        return s.g(this.error, privacyUpdateRequestError.error) && s.g(this.message, privacyUpdateRequestError.message) && s.g(this.errors, privacyUpdateRequestError.errors);
    }

    public final String getError() {
        return this.error;
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.error;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.errors;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = this.error;
        String str2 = this.message;
        return z.c(b.i("PrivacyUpdateRequestError(error=", str, ", message=", str2, ", errors="), this.errors, ")");
    }

    public PrivacyUpdateRequestError(String str, String str2, List<String> list) {
        super(str2);
        this.error = str;
        this.message = str2;
        this.errors = list;
    }

    public PrivacyUpdateRequestError() {
        this(null, null, null, 7, null);
    }
}
