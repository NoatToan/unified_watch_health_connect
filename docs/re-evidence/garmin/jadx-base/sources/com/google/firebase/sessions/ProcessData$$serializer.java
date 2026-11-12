package com.google.firebase.sessions;

import l63.f;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/ProcessData.$serializer", "Lm63/e0;", "Lcom/google/firebase/sessions/ProcessData;", "<init>", "()V", "Ll63/f;", "encoder", "value", "", "serialize", "(Ll63/f;Lcom/google/firebase/sessions/ProcessData;)V", "Ll63/e;", "decoder", "deserialize", "(Ll63/e;)Lcom/google/firebase/sessions/ProcessData;", "", "Li63/c;", "childSerializers", "()[Li63/c;", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@o13.e
public /* synthetic */ class ProcessData$$serializer implements e0<ProcessData> {
    public static final ProcessData$$serializer INSTANCE;
    private static final k63.e descriptor;

    static {
        ProcessData$$serializer processData$$serializer = new ProcessData$$serializer();
        INSTANCE = processData$$serializer;
        m1 m1Var = new m1("com.google.firebase.sessions.ProcessData", processData$$serializer, 2);
        m1Var.j("pid", false);
        m1Var.j("uuid", false);
        descriptor = m1Var;
    }

    private ProcessData$$serializer() {
    }

    @Override // m63.e0
    public final i63.c<?>[] childSerializers() {
        return new i63.c[]{m0.f116981a, y1.f117048a};
    }

    @Override // i63.b
    public final ProcessData deserialize(l63.e decoder) {
        decoder.getClass();
        k63.e eVar = descriptor;
        l63.c cVarC = decoder.c(eVar);
        int i14 = l63.c.f110557a;
        boolean z14 = true;
        int i15 = 0;
        int iA = 0;
        String strR = null;
        while (z14) {
            int iE = cVarC.e(eVar);
            if (iE == -1) {
                z14 = false;
            } else if (iE == 0) {
                iA = cVarC.A(eVar, 0);
                i15 |= 1;
            } else {
                if (iE != 1) {
                    hb.a.o(iE);
                    return null;
                }
                strR = cVarC.r(eVar, 1);
                i15 |= 2;
            }
        }
        cVarC.b(eVar);
        return new ProcessData(i15, iA, strR, null);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return descriptor;
    }

    @Override // i63.i
    public final void serialize(f encoder, ProcessData value) {
        encoder.getClass();
        value.getClass();
        k63.e eVar = descriptor;
        l63.d dVarC = encoder.c(eVar);
        ProcessData.write$Self$com_google_firebase_firebase_sessions(value, dVarC, eVar);
        dVarC.b(eVar);
    }

    @Override // m63.e0
    public i63.c<?>[] typeParametersSerializers() {
        return k1.f116970b;
    }
}
