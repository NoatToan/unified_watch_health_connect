package com.google.firebase.sessions;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import e53.f;
import i63.h;
import m63.k1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lcom/google/firebase/sessions/Time;", "", "", "ms", "<init>", "(J)V", "", "seen0", "us", "seconds", "Lm63/u1;", "serializationConstructorMarker", "(IJJJLm63/u1;)V", "self", "Ll63/d;", "output", "Lk63/e;", "serialDesc", "", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/Time;Ll63/d;Lk63/e;)V", "write$Self", "time", "Le53/c;", "minus-5sfh64U", "(Lcom/google/firebase/sessions/Time;)J", "minus", "component1", "()J", "copy", "(J)Lcom/google/firebase/sessions/Time;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getMs", "getUs", "getSeconds", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@h
public final /* data */ class Time {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long ms;
    private final long seconds;
    private final long us;

    public /* synthetic */ Time(int i14, long j8, long j14, long j15, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, Time$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.ms = j8;
        this.us = (i14 & 2) == 0 ? ((long) 1000) * j8 : j14;
        if ((i14 & 4) == 0) {
            this.seconds = j8 / ((long) 1000);
        } else {
            this.seconds = j15;
        }
    }

    public static /* synthetic */ Time copy$default(Time time, long j8, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j8 = time.ms;
        }
        return time.copy(j8);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(Time self, l63.d output, k63.e serialDesc) {
        output.z(serialDesc, 0, self.ms);
        if (output.C(serialDesc) || self.us != self.ms * ((long) 1000)) {
            output.z(serialDesc, 1, self.us);
        }
        if (!output.C(serialDesc) && self.seconds == self.ms / ((long) 1000)) {
            return;
        }
        output.z(serialDesc, 2, self.seconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMs() {
        return this.ms;
    }

    public final Time copy(long ms3) {
        return new Time(ms3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Time) && this.ms == ((Time) other).ms;
    }

    public final long getMs() {
        return this.ms;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final long getUs() {
        return this.us;
    }

    public int hashCode() {
        return Long.hashCode(this.ms);
    }

    /* JADX INFO: renamed from: minus-5sfh64U, reason: not valid java name */
    public final long m100minus5sfh64U(Time time) {
        time.getClass();
        e53.c.a aVar = e53.c.f63094b;
        return e53.e.f(this.ms - time.ms, f.MILLISECONDS);
    }

    public String toString() {
        return a0.l(new StringBuilder("Time(ms="), this.ms, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/Time$Companion;", "", "<init>", "()V", "Li63/c;", "Lcom/google/firebase/sessions/Time;", "serializer", "()Li63/c;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<Time> serializer() {
            return Time$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public Time(long j8) {
        this.ms = j8;
        long j14 = 1000;
        this.us = j8 * j14;
        this.seconds = j8 / j14;
    }
}
