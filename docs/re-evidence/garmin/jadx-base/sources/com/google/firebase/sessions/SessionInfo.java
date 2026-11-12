package com.google.firebase.sessions;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006'"}, d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "sessionId", "", "firstSessionId", "sessionIndex", "", "eventTimestampUs", "", "dataCollectionStatus", "Lcom/google/firebase/sessions/DataCollectionStatus;", "firebaseInstallationId", "firebaseAuthenticationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getFirstSessionId", "getSessionIndex", "()I", "getEventTimestampUs", "()J", "getDataCollectionStatus", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "getFirebaseInstallationId", "getFirebaseAuthenticationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionInfo {
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(String str, String str2, int i14, long j8, DataCollectionStatus dataCollectionStatus, String str3, String str4) {
        str.getClass();
        str2.getClass();
        dataCollectionStatus.getClass();
        str3.getClass();
        str4.getClass();
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i14;
        this.eventTimestampUs = j8;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = str3;
        this.firebaseAuthenticationToken = str4;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i14, long j8, DataCollectionStatus dataCollectionStatus, String str3, String str4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((i15 & 2) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        if ((i15 & 4) != 0) {
            i14 = sessionInfo.sessionIndex;
        }
        if ((i15 & 8) != 0) {
            j8 = sessionInfo.eventTimestampUs;
        }
        if ((i15 & 16) != 0) {
            dataCollectionStatus = sessionInfo.dataCollectionStatus;
        }
        if ((i15 & 32) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        if ((i15 & 64) != 0) {
            str4 = sessionInfo.firebaseAuthenticationToken;
        }
        String str5 = str4;
        DataCollectionStatus dataCollectionStatus2 = dataCollectionStatus;
        long j14 = j8;
        int i16 = i14;
        return sessionInfo.copy(str, str2, i16, j14, dataCollectionStatus2, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final SessionInfo copy(String sessionId, String firstSessionId, int sessionIndex, long eventTimestampUs, DataCollectionStatus dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        sessionId.getClass();
        firstSessionId.getClass();
        dataCollectionStatus.getClass();
        firebaseInstallationId.getClass();
        firebaseAuthenticationToken.getClass();
        return new SessionInfo(sessionId, firstSessionId, sessionIndex, eventTimestampUs, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) other;
        return s.g(this.sessionId, sessionInfo.sessionId) && s.g(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && s.g(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && s.g(this.firebaseInstallationId, sessionInfo.firebaseInstallationId) && s.g(this.firebaseAuthenticationToken, sessionInfo.firebaseAuthenticationToken);
    }

    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public int hashCode() {
        return this.firebaseAuthenticationToken.hashCode() + g.j((this.dataCollectionStatus.hashCode() + f.e(q2.d(this.sessionIndex, g.j(this.sessionId.hashCode() * 31, 31, this.firstSessionId), 31), 31, this.eventTimestampUs)) * 31, 31, this.firebaseInstallationId);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SessionInfo(sessionId=");
        sb3.append(this.sessionId);
        sb3.append(", firstSessionId=");
        sb3.append(this.firstSessionId);
        sb3.append(", sessionIndex=");
        sb3.append(this.sessionIndex);
        sb3.append(", eventTimestampUs=");
        sb3.append(this.eventTimestampUs);
        sb3.append(", dataCollectionStatus=");
        sb3.append(this.dataCollectionStatus);
        sb3.append(", firebaseInstallationId=");
        sb3.append(this.firebaseInstallationId);
        sb3.append(", firebaseAuthenticationToken=");
        return a0.m(sb3, this.firebaseAuthenticationToken, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
