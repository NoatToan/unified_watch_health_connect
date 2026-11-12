package ui1;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u0005H'¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00060\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lui1/l0;", "", "", "", "queryMap", "Lo53/i0;", "Lc83/a0;", "Lui1/x0;", JWKParameterNames.RSA_EXPONENT, "(Ljava/util/Map;)Lo53/i0;", "Ltj1/v;", "b", "()Lo53/i0;", "Lui1/m0;", "c", "Lui1/g0;", "rmaRequest", "d", "(Lui1/g0;)Lo53/i0;", "jobID", "Lui1/c0;", "a", "(Ljava/lang/String;)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface l0 {
    @i83.f("/subscriber/job/{jobGuid}")
    o53.i0<c83.a0<c0>> a(@i83.s("jobGuid") String jobID);

    @i83.f("/subscriber/account/contact")
    o53.i0<c83.a0<tj1.v>> b();

    @i83.f("/subscriber/device")
    o53.i0<c83.a0<m0>> c();

    @i83.o("/subscriber/rma")
    o53.i0<c83.a0<String>> d(@i83.a g0 rmaRequest);

    @i83.f("/subscriber/check")
    o53.i0<c83.a0<x0>> e(@i83.u Map<String, String> queryMap);
}
