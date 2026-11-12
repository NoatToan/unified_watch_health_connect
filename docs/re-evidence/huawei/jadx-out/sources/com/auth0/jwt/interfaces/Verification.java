package com.auth0.jwt.interfaces;

import defpackage.pt;
import java.time.Instant;
import java.util.Date;
import java.util.function.BiPredicate;

/* JADX INFO: loaded from: classes21.dex */
public interface Verification {
    Verification acceptExpiresAt(long j) throws IllegalArgumentException;

    Verification acceptIssuedAt(long j) throws IllegalArgumentException;

    Verification acceptLeeway(long j) throws IllegalArgumentException;

    Verification acceptNotBefore(long j) throws IllegalArgumentException;

    pt build();

    Verification ignoreIssuedAt();

    Verification withAnyOfAudience(String... strArr);

    Verification withArrayClaim(String str, Integer... numArr) throws IllegalArgumentException;

    Verification withArrayClaim(String str, Long... lArr) throws IllegalArgumentException;

    Verification withArrayClaim(String str, String... strArr) throws IllegalArgumentException;

    Verification withAudience(String... strArr);

    Verification withClaim(String str, Boolean bool) throws IllegalArgumentException;

    Verification withClaim(String str, Double d) throws IllegalArgumentException;

    Verification withClaim(String str, Integer num) throws IllegalArgumentException;

    Verification withClaim(String str, Long l) throws IllegalArgumentException;

    Verification withClaim(String str, String str2) throws IllegalArgumentException;

    Verification withClaim(String str, Date date) throws IllegalArgumentException;

    Verification withClaim(String str, BiPredicate<Claim, DecodedJWT> biPredicate) throws IllegalArgumentException;

    Verification withClaimPresence(String str) throws IllegalArgumentException;

    Verification withIssuer(String... strArr);

    Verification withJWTId(String str);

    Verification withNullClaim(String str) throws IllegalArgumentException;

    Verification withSubject(String str);

    default Verification withIssuer(String str) {
        return withIssuer(str);
    }

    default Verification withClaim(String str, Instant instant) throws IllegalArgumentException {
        return withClaim(str, instant != null ? Date.from(instant) : null);
    }
}
