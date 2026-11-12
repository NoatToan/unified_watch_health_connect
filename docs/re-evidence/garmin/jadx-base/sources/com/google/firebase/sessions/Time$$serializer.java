package com.google.firebase.sessions;

import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.v0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/Time.$serializer", "Lm63/e0;", "Lcom/google/firebase/sessions/Time;", "<init>", "()V", "Ll63/f;", "encoder", "value", "", "serialize", "(Ll63/f;Lcom/google/firebase/sessions/Time;)V", "Ll63/e;", "decoder", "deserialize", "(Ll63/e;)Lcom/google/firebase/sessions/Time;", "", "Li63/c;", "childSerializers", "()[Li63/c;", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@o13.e
public /* synthetic */ class Time$$serializer implements e0<Time> {
    public static final Time$$serializer INSTANCE;
    private static final k63.e descriptor;

    static {
        Time$$serializer time$$serializer = new Time$$serializer();
        INSTANCE = time$$serializer;
        m1 m1Var = new m1("com.google.firebase.sessions.Time", time$$serializer, 3);
        m1Var.j("ms", false);
        m1Var.j("us", true);
        m1Var.j("seconds", true);
        descriptor = m1Var;
    }

    private Time$$serializer() {
    }

    @Override // m63.e0
    public final i63.c<?>[] childSerializers() {
        v0 v0Var = v0.f117027a;
        return new i63.c[]{v0Var, v0Var, v0Var};
    }

    @Override // i63.b
    public final Time deserialize(l63.e decoder) {
        decoder.getClass();
        k63.e eVar = descriptor;
        l63.c cVarC = decoder.c(eVar);
        int i14 = l63.c.f110557a;
        int i15 = 0;
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        boolean z14 = true;
        while (z14) {
            int iE = cVarC.e(eVar);
            if (iE == -1) {
                z14 = false;
            } else if (iE == 0) {
                jW = cVarC.w(eVar, 0);
                i15 |= 1;
            } else if (iE == 1) {
                jW2 = cVarC.w(eVar, 1);
                i15 |= 2;
            } else {
                if (iE != 2) {
                    hb.a.o(iE);
                    return null;
                }
                jW3 = cVarC.w(eVar, 2);
                i15 |= 4;
            }
        }
        cVarC.b(eVar);
        return new Time(i15, jW, jW2, jW3, null);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return descriptor;
    }

    @Override // i63.i
    public final void serialize(f encoder, Time value) {
        encoder.getClass();
        value.getClass();
        k63.e eVar = descriptor;
        l63.d dVarC = encoder.c(eVar);
        Time.write$Self$com_google_firebase_firebase_sessions(value, dVarC, eVar);
        dVarC.b(eVar);
    }

    @Override // m63.e0
    public i63.c<?>[] typeParametersSerializers() {
        return k1.f116970b;
    }
}
