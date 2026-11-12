package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.health.HealthReport;
import com.nimbusds.jose.util.health.HealthReportListener;
import com.nimbusds.jose.util.health.HealthStatus;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class JWKSetSourceWithHealthStatusReporting<C extends SecurityContext> extends JWKSetSourceWrapper<C> {
    private final HealthReportListener<JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener;

    public JWKSetSourceWithHealthStatusReporting(JWKSetSource<C> jWKSetSource, HealthReportListener<JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener) {
        super(jWKSetSource);
        Objects.requireNonNull(healthReportListener);
        this.healthReportListener = healthReportListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public JWKSet getJWKSet(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14) throws Exception {
        JWKSetSourceWithHealthStatusReporting<C> jWKSetSourceWithHealthStatusReporting;
        long j14;
        C c15;
        try {
            JWKSet jWKSet = getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j8, c14);
            jWKSetSourceWithHealthStatusReporting = this;
            j14 = j8;
            c15 = c14;
            try {
                this.healthReportListener.notify(new HealthReport<>(jWKSetSourceWithHealthStatusReporting, HealthStatus.HEALTHY, j14, c15));
                return jWKSet;
            } catch (Exception e4) {
                e = e4;
                Exception exc = e;
                C c16 = c15;
                JWKSetSourceWithHealthStatusReporting<C> jWKSetSourceWithHealthStatusReporting2 = jWKSetSourceWithHealthStatusReporting;
                jWKSetSourceWithHealthStatusReporting.healthReportListener.notify(new HealthReport<>(jWKSetSourceWithHealthStatusReporting2, HealthStatus.NOT_HEALTHY, exc, j14, c16));
                throw exc;
            }
        } catch (Exception e14) {
            e = e14;
            jWKSetSourceWithHealthStatusReporting = this;
            j14 = j8;
            c15 = c14;
        }
    }
}
