package com.google.firebase.sessions.settings;

import i63.c;
import j63.a;
import l63.d;
import l63.f;
import m63.e0;
import m63.g;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.v0;
import m63.x;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/settings/SessionConfigs.$serializer", "Lm63/e0;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "()V", "Ll63/f;", "encoder", "value", "", "serialize", "(Ll63/f;Lcom/google/firebase/sessions/settings/SessionConfigs;)V", "Ll63/e;", "decoder", "deserialize", "(Ll63/e;)Lcom/google/firebase/sessions/settings/SessionConfigs;", "", "Li63/c;", "childSerializers", "()[Li63/c;", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@e
public /* synthetic */ class SessionConfigs$$serializer implements e0<SessionConfigs> {
    public static final SessionConfigs$$serializer INSTANCE;
    private static final k63.e descriptor;

    static {
        SessionConfigs$$serializer sessionConfigs$$serializer = new SessionConfigs$$serializer();
        INSTANCE = sessionConfigs$$serializer;
        m1 m1Var = new m1("com.google.firebase.sessions.settings.SessionConfigs", sessionConfigs$$serializer, 5);
        m1Var.j("sessionsEnabled", false);
        m1Var.j("sessionSamplingRate", false);
        m1Var.j("sessionTimeoutSeconds", false);
        m1Var.j("cacheDurationSeconds", false);
        m1Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = m1Var;
    }

    private SessionConfigs$$serializer() {
    }

    @Override // m63.e0
    public final c<?>[] childSerializers() {
        c<?> cVarD = a.d(g.f116948a);
        c<?> cVarD2 = a.d(x.f117036a);
        m0 m0Var = m0.f116981a;
        return new c[]{cVarD, cVarD2, a.d(m0Var), a.d(m0Var), a.d(v0.f117027a)};
    }

    @Override // i63.b
    public final SessionConfigs deserialize(l63.e decoder) {
        decoder.getClass();
        k63.e eVar = descriptor;
        l63.c cVarC = decoder.c(eVar);
        int i14 = l63.c.f110557a;
        boolean z14 = true;
        int i15 = 0;
        Boolean bool = null;
        Double d14 = null;
        Integer num = null;
        Integer num2 = null;
        Long l14 = null;
        while (z14) {
            int iE = cVarC.e(eVar);
            if (iE == -1) {
                z14 = false;
            } else if (iE == 0) {
                bool = (Boolean) cVarC.v(eVar, 0, g.f116948a, bool);
                i15 |= 1;
            } else if (iE == 1) {
                d14 = (Double) cVarC.v(eVar, 1, x.f117036a, d14);
                i15 |= 2;
            } else if (iE == 2) {
                num = (Integer) cVarC.v(eVar, 2, m0.f116981a, num);
                i15 |= 4;
            } else if (iE == 3) {
                num2 = (Integer) cVarC.v(eVar, 3, m0.f116981a, num2);
                i15 |= 8;
            } else {
                if (iE != 4) {
                    hb.a.o(iE);
                    return null;
                }
                l14 = (Long) cVarC.v(eVar, 4, v0.f117027a, l14);
                i15 |= 16;
            }
        }
        cVarC.b(eVar);
        return new SessionConfigs(i15, bool, d14, num, num2, l14, null);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return descriptor;
    }

    @Override // i63.i
    public final void serialize(f encoder, SessionConfigs value) {
        encoder.getClass();
        value.getClass();
        k63.e eVar = descriptor;
        d dVarC = encoder.c(eVar);
        SessionConfigs.write$Self$com_google_firebase_firebase_sessions(value, dVarC, eVar);
        dVarC.b(eVar);
    }

    @Override // m63.e0
    public c<?>[] typeParametersSerializers() {
        return k1.f116970b;
    }
}
