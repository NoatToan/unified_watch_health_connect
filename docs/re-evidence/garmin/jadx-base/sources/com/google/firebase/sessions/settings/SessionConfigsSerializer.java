package com.google.firebase.sessions.settings;

import androidx.datastore.core.CorruptionException;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import n63.b;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import u7.k1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigsSerializer;", "Lu7/k1;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lt13/d;)Ljava/lang/Object;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Ljava/io/OutputStream;", "output", "", "writeTo", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Ljava/io/OutputStream;Lt13/d;)Ljava/lang/Object;", "defaultValue", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "getDefaultValue", "()Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionConfigsSerializer implements k1<SessionConfigs> {
    public static final SessionConfigsSerializer INSTANCE = new SessionConfigsSerializer();
    private static final SessionConfigs defaultValue = new SessionConfigs(null, null, null, null, null);

    private SessionConfigsSerializer() {
    }

    @Override // u7.k1
    public Object readFrom(InputStream inputStream, d<? super SessionConfigs> dVar) throws CorruptionException {
        try {
            b.a aVar = b.f123892d;
            String strN = u.n(dh.b.M(inputStream));
            aVar.getClass();
            return (SessionConfigs) aVar.c(SessionConfigs.INSTANCE.serializer(), strN);
        } catch (Exception e4) {
            throw new CorruptionException("Cannot parse session configs", e4);
        }
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(SessionConfigs sessionConfigs, OutputStream outputStream, d<? super Unit> dVar) throws IOException {
        outputStream.write(u.o(b.f123892d.b(SessionConfigs.INSTANCE.serializer(), sessionConfigs)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // u7.k1
    public SessionConfigs getDefaultValue() {
        return defaultValue;
    }

    @Override // u7.k1
    public /* bridge */ /* synthetic */ Object writeTo(SessionConfigs sessionConfigs, OutputStream outputStream, d dVar) {
        return writeTo2(sessionConfigs, outputStream, (d<? super Unit>) dVar);
    }
}
