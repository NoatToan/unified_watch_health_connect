package com.google.firebase.sessions.settings;

import ch.qos.logback.core.CoreConstants;
import i63.c;
import i63.h;
import k63.e;
import l63.d;
import m63.g;
import m63.k1;
import m63.m0;
import m63.u1;
import m63.v0;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0081\b\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lm63/u1;)V", "self", "Ll63/d;", "output", "Lk63/e;", "serialDesc", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Ll63/d;Lk63/e;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getSessionsEnabled", "Ljava/lang/Double;", "getSessionSamplingRate", "Ljava/lang/Integer;", "getSessionTimeoutSeconds", "getCacheDurationSeconds", "Ljava/lang/Long;", "getCacheUpdatedTimeSeconds", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@h
public final /* data */ class SessionConfigs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer cacheDurationSeconds;
    private final Long cacheUpdatedTimeSeconds;
    private final Double sessionSamplingRate;
    private final Integer sessionTimeoutSeconds;
    private final Boolean sessionsEnabled;

    public /* synthetic */ SessionConfigs(int i14, Boolean bool, Double d14, Integer num, Integer num2, Long l14, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, SessionConfigs$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d14;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l14;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d14, Integer num, Integer num2, Long l14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            bool = sessionConfigs.sessionsEnabled;
        }
        if ((i14 & 2) != 0) {
            d14 = sessionConfigs.sessionSamplingRate;
        }
        if ((i14 & 4) != 0) {
            num = sessionConfigs.sessionTimeoutSeconds;
        }
        if ((i14 & 8) != 0) {
            num2 = sessionConfigs.cacheDurationSeconds;
        }
        if ((i14 & 16) != 0) {
            l14 = sessionConfigs.cacheUpdatedTimeSeconds;
        }
        Long l15 = l14;
        Integer num3 = num;
        return sessionConfigs.copy(bool, d14, num3, num2, l15);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionConfigs self, d output, e serialDesc) {
        output.d(serialDesc, 0, g.f116948a, self.sessionsEnabled);
        output.d(serialDesc, 1, x.f117036a, self.sessionSamplingRate);
        m0 m0Var = m0.f116981a;
        output.d(serialDesc, 2, m0Var, self.sessionTimeoutSeconds);
        output.d(serialDesc, 3, m0Var, self.cacheDurationSeconds);
        output.d(serialDesc, 4, v0.f117027a, self.cacheUpdatedTimeSeconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    public final SessionConfigs copy(Boolean sessionsEnabled, Double sessionSamplingRate, Integer sessionTimeoutSeconds, Integer cacheDurationSeconds, Long cacheUpdatedTimeSeconds) {
        return new SessionConfigs(sessionsEnabled, sessionSamplingRate, sessionTimeoutSeconds, cacheDurationSeconds, cacheUpdatedTimeSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return s.g(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && s.g(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && s.g(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && s.g(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && s.g(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d14 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l14 = this.cacheUpdatedTimeSeconds;
        return iHashCode4 + (l14 != null ? l14.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigs$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "serializer", "()Li63/c;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final c<SessionConfigs> serializer() {
            return SessionConfigs$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public SessionConfigs(Boolean bool, Double d14, Integer num, Integer num2, Long l14) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d14;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l14;
    }
}
