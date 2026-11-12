package org.chromium.net;

import org.json.JSONException;
import org.json.JSONObject;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133475b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f133474a = i14;
        this.f133475b = obj;
    }

    @Override // org.chromium.net.b.a
    public final void a(JSONObject jSONObject) throws JSONException {
        switch (this.f133474a) {
            case 0:
                DnsOptions dnsOptions = (DnsOptions) this.f133475b;
                JSONObject jSONObjectA = b.a(jSONObject, "AsyncDNS");
                if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                    jSONObjectA.put("enable", dnsOptions.getUseBuiltInDnsResolver());
                }
                JSONObject jSONObjectA2 = b.a(jSONObject, "StaleDNS");
                if (dnsOptions.getEnableStaleDns() != null) {
                    jSONObjectA2.put("enable", dnsOptions.getEnableStaleDns());
                }
                if (dnsOptions.getPersistHostCache() != null) {
                    jSONObjectA2.put("persist_to_disk", dnsOptions.getPersistHostCache());
                }
                if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                    jSONObjectA2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
                }
                if (dnsOptions.getStaleDnsOptions() != null) {
                    DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                    if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                        jSONObjectA2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                    }
                    if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                        jSONObjectA2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                    }
                    if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                        jSONObjectA2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                    }
                    if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                        jSONObjectA2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                    }
                }
                JSONObject jSONObjectA3 = b.a(jSONObject, "QUIC");
                if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                    jSONObjectA3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
                }
                break;
            case 1:
                ConnectionMigrationOptions connectionMigrationOptions = (ConnectionMigrationOptions) this.f133475b;
                JSONObject jSONObjectA4 = b.a(jSONObject, "QUIC");
                if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                    jSONObjectA4.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
                }
                if (connectionMigrationOptions.getAllowServerMigration() != null) {
                    jSONObjectA4.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
                }
                if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                    jSONObjectA4.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
                }
                if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                    jSONObjectA4.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
                }
                if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                    jSONObjectA4.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
                }
                if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                    jSONObjectA4.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
                }
                if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                    jSONObjectA4.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                    jSONObjectA4.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                    boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                    if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                        boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                        if (!zBooleanValue && zBooleanValue2) {
                            h.s("Unable to turn on non-default network usage without path degradation migration!");
                        } else if (zBooleanValue && zBooleanValue2) {
                            jSONObjectA4.put("migrate_sessions_early_v2", true);
                        } else {
                            jSONObjectA4.put("migrate_sessions_early_v2", false);
                        }
                    }
                    jSONObjectA4.put("allow_port_migration", zBooleanValue);
                }
                break;
            default:
                QuicOptions quicOptions = (QuicOptions) this.f133475b;
                JSONObject jSONObjectA5 = b.a(jSONObject, "QUIC");
                if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                    jSONObjectA5.put("host_whitelist", String.join(",", quicOptions.getQuicHostAllowlist()));
                }
                if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                    jSONObjectA5.put("quic_version", String.join(",", quicOptions.getEnabledQuicVersions()));
                }
                if (!quicOptions.getConnectionOptions().isEmpty()) {
                    jSONObjectA5.put("connection_options", String.join(",", quicOptions.getConnectionOptions()));
                }
                if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                    jSONObjectA5.put("client_connection_options", String.join(",", quicOptions.getClientConnectionOptions()));
                }
                if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                    jSONObjectA5.put("set_quic_flags", String.join(",", quicOptions.getExtraQuicheFlags()));
                }
                if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                    jSONObjectA5.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
                }
                if (quicOptions.getHandshakeUserAgent() != null) {
                    jSONObjectA5.put("user_agent_id", quicOptions.getHandshakeUserAgent());
                }
                if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                    jSONObjectA5.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
                }
                if (quicOptions.getEnableTlsZeroRtt() != null) {
                    jSONObjectA5.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
                }
                if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                    jSONObjectA5.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
                }
                if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                    jSONObjectA5.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
                }
                if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                    jSONObjectA5.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
                }
                if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                    jSONObjectA5.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
                }
                if (quicOptions.getCloseSessionsOnIpChange() != null) {
                    jSONObjectA5.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
                }
                if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                    jSONObjectA5.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
                }
                if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                    jSONObjectA5.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
                }
                if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                    jSONObjectA5.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
                }
                if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                    jSONObjectA5.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
                }
                break;
        }
    }
}
