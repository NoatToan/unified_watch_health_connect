package com.google.firebase.sessions;

import androidx.datastore.core.CorruptionException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import u7.k1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/sessions/SessionDataSerializer;", "Lu7/k1;", "Lcom/google/firebase/sessions/SessionData;", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "<init>", "(Lcom/google/firebase/sessions/SessionGenerator;)V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Ljava/io/OutputStream;", "output", "", "writeTo", "(Lcom/google/firebase/sessions/SessionData;Ljava/io/OutputStream;Lt13/d;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/SessionGenerator;", "getDefaultValue", "()Lcom/google/firebase/sessions/SessionData;", "defaultValue", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionDataSerializer implements k1<SessionData> {
    private final SessionGenerator sessionGenerator;

    public SessionDataSerializer(SessionGenerator sessionGenerator) {
        sessionGenerator.getClass();
        this.sessionGenerator = sessionGenerator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // u7.k1
    public SessionData getDefaultValue() {
        return new SessionData(this.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 6, (j) null);
    }

    @Override // u7.k1
    public Object readFrom(InputStream inputStream, t13.d<? super SessionData> dVar) throws CorruptionException {
        try {
            n63.b.a aVar = n63.b.f123892d;
            String strN = u.n(dh.b.M(inputStream));
            aVar.getClass();
            return (SessionData) aVar.c(SessionData.INSTANCE.serializer(), strN);
        } catch (Exception e4) {
            throw new CorruptionException("Cannot parse session data", e4);
        }
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(SessionData sessionData, OutputStream outputStream, t13.d<? super Unit> dVar) throws IOException {
        outputStream.write(u.o(n63.b.f123892d.b(SessionData.INSTANCE.serializer(), sessionData)));
        return Unit.INSTANCE;
    }

    @Override // u7.k1
    public /* bridge */ /* synthetic */ Object writeTo(SessionData sessionData, OutputStream outputStream, t13.d dVar) {
        return writeTo2(sessionData, outputStream, (t13.d<? super Unit>) dVar);
    }
}
