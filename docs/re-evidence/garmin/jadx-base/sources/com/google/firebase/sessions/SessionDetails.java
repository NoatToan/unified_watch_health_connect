package com.google.firebase.sessions;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import i63.h;
import m63.k1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/google/firebase/sessions/SessionDetails;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "sessionStartTimestampUs", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IJLm63/u1;)V", "self", "Ll63/d;", "output", "Lk63/e;", "serialDesc", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SessionDetails;Ll63/d;Lk63/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;IJ)Lcom/google/firebase/sessions/SessionDetails;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getFirstSessionId", "I", "getSessionIndex", "J", "getSessionStartTimestampUs", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@h
public final /* data */ class SessionDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;
    private final long sessionStartTimestampUs;

    public /* synthetic */ SessionDetails(int i14, String str, String str2, int i15, long j8, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, SessionDetails$$serializer.INSTANCE.getF158591b());
            throw null;
        }
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i15;
        this.sessionStartTimestampUs = j8;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, int i14, long j8, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = sessionDetails.sessionId;
        }
        if ((i15 & 2) != 0) {
            str2 = sessionDetails.firstSessionId;
        }
        if ((i15 & 4) != 0) {
            i14 = sessionDetails.sessionIndex;
        }
        if ((i15 & 8) != 0) {
            j8 = sessionDetails.sessionStartTimestampUs;
        }
        int i16 = i14;
        return sessionDetails.copy(str, str2, i16, j8);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(SessionDetails self, l63.d output, k63.e serialDesc) {
        output.k(serialDesc, 0, self.sessionId);
        output.k(serialDesc, 1, self.firstSessionId);
        output.v(2, self.sessionIndex, serialDesc);
        output.z(serialDesc, 3, self.sessionStartTimestampUs);
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
    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public final SessionDetails copy(String sessionId, String firstSessionId, int sessionIndex, long sessionStartTimestampUs) {
        sessionId.getClass();
        firstSessionId.getClass();
        return new SessionDetails(sessionId, firstSessionId, sessionIndex, sessionStartTimestampUs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) other;
        return s.g(this.sessionId, sessionDetails.sessionId) && s.g(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
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

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        return Long.hashCode(this.sessionStartTimestampUs) + q2.d(this.sessionIndex, g.j(this.sessionId.hashCode() * 31, 31, this.firstSessionId), 31);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SessionDetails(sessionId=");
        sb3.append(this.sessionId);
        sb3.append(", firstSessionId=");
        sb3.append(this.firstSessionId);
        sb3.append(", sessionIndex=");
        sb3.append(this.sessionIndex);
        sb3.append(", sessionStartTimestampUs=");
        return a0.l(sb3, this.sessionStartTimestampUs, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/SessionDetails$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/google/firebase/sessions/SessionDetails;", "serializer", "()Li63/c;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<SessionDetails> serializer() {
            return SessionDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public SessionDetails(String str, String str2, int i14, long j8) {
        str.getClass();
        str2.getClass();
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i14;
        this.sessionStartTimestampUs = j8;
    }
}
