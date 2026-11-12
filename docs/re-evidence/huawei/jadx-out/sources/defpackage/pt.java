package defpackage;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.impl.ExpectedCheckHolder;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.auth0.jwt.interfaces.Verification;
import io.jsonwebtoken.Claims;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;

/* JADX INFO: loaded from: classes21.dex */
public final class pt implements JWTVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl f45880a = new rl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Algorithm f45881b;
    final List<ExpectedCheckHolder> d;

    pt(Algorithm algorithm, List<ExpectedCheckHolder> list) {
        this.f45881b = algorithm;
        this.d = Collections.unmodifiableList(list);
    }

    static Verification b(Algorithm algorithm) throws IllegalArgumentException {
        return new d(algorithm);
    }

    public static class d implements Verification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<ExpectedCheckHolder> f45882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Clock f45883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, Long> f45884c;
        private long d;
        private final Algorithm e;
        private boolean f;

        static /* synthetic */ boolean b(Claim claim, DecodedJWT decodedJWT) {
            return true;
        }

        d(Algorithm algorithm) throws IllegalArgumentException {
            if (algorithm == null) {
                throw new IllegalArgumentException("The Algorithm cannot be null.");
            }
            this.e = algorithm;
            this.f45882a = new ArrayList();
            this.f45884c = new HashMap();
            this.d = 0L;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withIssuer(String... strArr) {
            final List listAsList = e(strArr) ? null : Arrays.asList(strArr);
            d(Claims.ISSUER, new BiPredicate() { // from class: py
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f45951c.b(listAsList, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean b(List list, Claim claim, DecodedJWT decodedJWT) {
            if (c(claim, list)) {
                return true;
            }
            if (list == null || !list.contains(claim.asString())) {
                throw new qy("The Claim 'iss' value doesn't match the required issuer.", Claims.ISSUER, claim);
            }
            return true;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withSubject(final String str) {
            d(Claims.SUBJECT, new BiPredicate() { // from class: qk
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.e.d(str, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean d(String str, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, str) || str.equals(claim.asString());
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withAudience(String... strArr) {
            final List listAsList = e(strArr) ? null : Arrays.asList(strArr);
            d(Claims.AUDIENCE, new BiPredicate() { // from class: pz
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.d.a(listAsList, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean a(List list, Claim claim, DecodedJWT decodedJWT) {
            if (c(claim, list) || d(decodedJWT.getAudience(), (List<String>) list, true)) {
                return true;
            }
            throw new qy("The Claim 'aud' value doesn't contain the required audience.", Claims.AUDIENCE, claim);
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withAnyOfAudience(String... strArr) {
            final List listAsList = e(strArr) ? null : Arrays.asList(strArr);
            d(Claims.AUDIENCE, new BiPredicate() { // from class: qf
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f46090b.c(listAsList, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean c(List list, Claim claim, DecodedJWT decodedJWT) {
            if (c(claim, list) || d(decodedJWT.getAudience(), (List<String>) list, false)) {
                return true;
            }
            throw new qy("The Claim 'aud' value doesn't contain the required audience.", Claims.AUDIENCE, claim);
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification acceptLeeway(long j) throws IllegalArgumentException {
            c(j);
            this.d = j;
            return this;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification acceptExpiresAt(long j) throws IllegalArgumentException {
            c(j);
            this.f45884c.put(Claims.EXPIRATION, Long.valueOf(j));
            return this;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification acceptNotBefore(long j) throws IllegalArgumentException {
            c(j);
            this.f45884c.put(Claims.NOT_BEFORE, Long.valueOf(j));
            return this;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification acceptIssuedAt(long j) throws IllegalArgumentException {
            c(j);
            this.f45884c.put(Claims.ISSUED_AT, Long.valueOf(j));
            return this;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification ignoreIssuedAt() {
            this.f = true;
            return this;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withJWTId(final String str) {
            d(Claims.ID, new BiPredicate() { // from class: qm
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.e.c(str, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean c(String str, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, str) || str.equals(claim.asString());
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaimPresence(String str) throws IllegalArgumentException {
            e(str);
            withClaim(str, new BiPredicate() { // from class: ql
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return pt.d.b((Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withNullClaim(String str) throws IllegalArgumentException {
            e(str);
            withClaim(str, new BiPredicate() { // from class: qp
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return ((Claim) obj).isNull();
                }
            });
            return this;
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaim(String str, final Boolean bool) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qc
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.d.e(bool, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean e(Boolean bool, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, bool) || bool.equals(claim.asBoolean());
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaim(String str, final Integer num) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qi
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f46263a.e(num, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean e(Integer num, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, num) || num.equals(claim.asInt());
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaim(String str, final Long l) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qg
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f46150c.b(l, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean b(Long l, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, l) || l.equals(claim.asLong());
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaim(String str, final Double d) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qd
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.e.d(d, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean d(Double d, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, d) || d.equals(claim.asDouble());
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaim(String str, final String str2) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qa
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.d.e(str2, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean e(String str, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, str) || str.equals(claim.asString());
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaim(String str, Date date) throws IllegalArgumentException {
            return withClaim(str, date != null ? date.toInstant() : null);
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaim(String str, final Instant instant) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qo
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f46541a.d(instant, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean d(Instant instant, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, instant) || instant.truncatedTo(ChronoUnit.SECONDS).equals(claim.asInstant());
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withClaim(String str, final BiPredicate<Claim, DecodedJWT> biPredicate) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qh
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.d.a(biPredicate, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean a(BiPredicate biPredicate, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, biPredicate) || biPredicate.test(claim, decodedJWT);
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withArrayClaim(String str, final String... strArr) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qt
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f46782c.d(strArr, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean d(String[] strArr, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, strArr) || b(claim, strArr);
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withArrayClaim(String str, final Integer... numArr) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qe
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f46045a.a(numArr, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean a(Integer[] numArr, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, numArr) || b(claim, numArr);
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public Verification withArrayClaim(String str, final Long... lArr) throws IllegalArgumentException {
            e(str);
            d(str, new BiPredicate() { // from class: qb
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f46014a.a(lArr, (Claim) obj, (DecodedJWT) obj2);
                }
            });
            return this;
        }

        /* synthetic */ boolean a(Long[] lArr, Claim claim, DecodedJWT decodedJWT) {
            return c(claim, lArr) || b(claim, lArr);
        }

        @Override // com.auth0.jwt.interfaces.Verification
        public pt build() {
            return e(Clock.systemUTC());
        }

        public pt e(Clock clock) {
            this.f45883b = clock;
            d();
            return new pt(this.e, this.f45882a);
        }

        public long d(String str) {
            return this.f45884c.getOrDefault(str, Long.valueOf(this.d)).longValue();
        }

        private void d() {
            final long jD = d(Claims.EXPIRATION);
            final long jD2 = d(Claims.NOT_BEFORE);
            final long jD3 = d(Claims.ISSUED_AT);
            this.f45882a.add(a(Claims.EXPIRATION, new BiPredicate() { // from class: qr
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.f46689b.b(jD, (Claim) obj, (DecodedJWT) obj2);
                }
            }));
            this.f45882a.add(a(Claims.NOT_BEFORE, new BiPredicate() { // from class: qn
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.e.e(jD2, (Claim) obj, (DecodedJWT) obj2);
                }
            }));
            if (this.f) {
                return;
            }
            this.f45882a.add(a(Claims.ISSUED_AT, new BiPredicate() { // from class: qq
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return this.d.d(jD3, (Claim) obj, (DecodedJWT) obj2);
                }
            }));
        }

        /* synthetic */ boolean b(long j, Claim claim, DecodedJWT decodedJWT) {
            return d(Claims.EXPIRATION, claim, j, true);
        }

        /* synthetic */ boolean e(long j, Claim claim, DecodedJWT decodedJWT) {
            return d(Claims.NOT_BEFORE, claim, j, false);
        }

        /* synthetic */ boolean d(long j, Claim claim, DecodedJWT decodedJWT) {
            return d(Claims.ISSUED_AT, claim, j, false);
        }

        private boolean b(Claim claim, Object[] objArr) {
            List listAsList;
            Object[] objArr2 = (Object[]) claim.as(Object[].class);
            if (objArr instanceof Long[]) {
                listAsList = new ArrayList(objArr2.length);
                for (Object obj : objArr2) {
                    if (obj instanceof Integer) {
                        listAsList.add(Long.valueOf(((Integer) obj).longValue()));
                    } else {
                        listAsList.add(obj);
                    }
                }
            } else {
                listAsList = Arrays.asList((Object[]) claim.as(Object[].class));
            }
            return listAsList.containsAll(Arrays.asList(objArr));
        }

        private boolean d(String str, Claim claim, long j, boolean z) {
            Instant instantAsInstant = claim.asInstant();
            Instant instantTruncatedTo = this.f45883b.instant().truncatedTo(ChronoUnit.SECONDS);
            if (z) {
                if (e(instantAsInstant, j, instantTruncatedTo)) {
                    return true;
                }
                throw new rk(String.format("The Token has expired on %s.", instantAsInstant), instantAsInstant);
            }
            if (a(instantAsInstant, j, instantTruncatedTo)) {
                return true;
            }
            throw new qy(String.format("The Token can't be used before %s.", instantAsInstant), str, claim);
        }

        private boolean e(Instant instant, long j, Instant instant2) {
            return instant == null || instant2.minus((TemporalAmount) Duration.ofSeconds(j)).isBefore(instant);
        }

        private boolean a(Instant instant, long j, Instant instant2) {
            return instant == null || !instant2.plus((TemporalAmount) Duration.ofSeconds(j)).isBefore(instant);
        }

        private boolean d(List<String> list, List<String> list2, boolean z) {
            if (list == null || list2 == null) {
                return false;
            }
            if (z) {
                return list.containsAll(list2);
            }
            return !Collections.disjoint(list, list2);
        }

        private void c(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("Leeway value can't be negative.");
            }
        }

        private void e(String str) {
            if (str == null) {
                throw new IllegalArgumentException("The Custom Claim's name can't be null.");
            }
        }

        private void d(final String str, final BiPredicate<Claim, DecodedJWT> biPredicate) {
            this.f45882a.add(a(str, new BiPredicate() { // from class: qj
                @Override // java.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return pt.d.e(str, biPredicate, (Claim) obj, (DecodedJWT) obj2);
                }
            }));
        }

        static /* synthetic */ boolean e(String str, BiPredicate biPredicate, Claim claim, DecodedJWT decodedJWT) {
            if (claim.isMissing()) {
                throw new re(str);
            }
            return biPredicate.test(claim, decodedJWT);
        }

        private ExpectedCheckHolder a(final String str, final BiPredicate<Claim, DecodedJWT> biPredicate) {
            return new ExpectedCheckHolder() { // from class: pt.d.2
                @Override // com.auth0.jwt.impl.ExpectedCheckHolder
                public String getClaimName() {
                    return str;
                }

                @Override // com.auth0.jwt.impl.ExpectedCheckHolder
                public boolean verify(Claim claim, DecodedJWT decodedJWT) {
                    return biPredicate.test(claim, decodedJWT);
                }
            };
        }

        private boolean c(Claim claim, Object obj) {
            return obj == null && claim.isNull();
        }

        private boolean e(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return true;
            }
            for (String str : strArr) {
                if (str != null) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // com.auth0.jwt.interfaces.JWTVerifier
    public DecodedJWT verify(String str) throws rd {
        return verify(new pv(this.f45880a, str));
    }

    @Override // com.auth0.jwt.interfaces.JWTVerifier
    public DecodedJWT verify(DecodedJWT decodedJWT) throws rd {
        c(decodedJWT, this.f45881b);
        this.f45881b.verify(decodedJWT);
        d(decodedJWT, this.d);
        return decodedJWT;
    }

    private void c(DecodedJWT decodedJWT, Algorithm algorithm) throws qx {
        if (!algorithm.getName().equals(decodedJWT.getAlgorithm())) {
            throw new qx("The provided Algorithm doesn't match the one defined in the JWT's Header.");
        }
    }

    private void d(DecodedJWT decodedJWT, List<ExpectedCheckHolder> list) throws rb, rk {
        for (ExpectedCheckHolder expectedCheckHolder : list) {
            String claimName = expectedCheckHolder.getClaimName();
            Claim claim = decodedJWT.getClaim(claimName);
            if (!expectedCheckHolder.verify(claim, decodedJWT)) {
                throw new qy(String.format("The Claim '%s' value doesn't match the required one.", claimName), claimName, claim);
            }
        }
    }
}
