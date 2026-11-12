package vp2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lvp2/a;", "", "", "symbol", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a {
    APPROVED(null, 1, null),
    REFUNDED(Marker.ANY_NON_NULL_MARKER),
    SETTLED(null, 1, null),
    PENDING(null, 1, null),
    DECLINED(null, 1, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179407a;

    /* synthetic */ a(String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? "" : str);
    }

    a(String str) {
        this.f179407a = str;
    }
}
