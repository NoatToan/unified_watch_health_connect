package com.xiaomi.ai.android.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaomi.ai.android.track.TraceConstants;
import com.xiaomi.ai.api.common.APIUtils;
import defpackage.c4h;
import defpackage.wpe;

/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c4h f10907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c4h f10908b;
    private c4h c;
    private ObjectMapper d = APIUtils.getObjectMapper();

    public synchronized c4h a() {
        if (this.f10907a == null || this.f10908b == null || this.c == null) {
            return null;
        }
        b(TraceConstants.TimeStamp.EXEC.FINISH_TRACE);
        this.f10907a.q0("result", this.c);
        this.f10907a.q0("timestamps", this.f10908b);
        c4h c4hVarR = this.f10907a.r();
        this.f10908b.o0();
        this.c.o0();
        this.f10907a.o0();
        this.c = null;
        this.f10908b = null;
        this.f10907a = null;
        return c4hVarR;
    }

    public synchronized void b() {
        this.f10907a = this.d.createObjectNode();
        this.f10908b = this.d.createObjectNode();
        this.c = this.d.createObjectNode();
    }

    public synchronized void a(String str) {
        try {
            c4h c4hVar = this.f10907a;
            if (c4hVar != null) {
                c4hVar.j0("eventId", str);
            } else {
                wpe.h("TraceManager", "traceRequestId: not startTrace");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(String str) {
        b(str, System.currentTimeMillis());
    }

    public synchronized void a(String str, long j) {
        try {
            c4h c4hVar = this.c;
            if (c4hVar != null) {
                c4hVar.h0(str, j);
            } else {
                wpe.h("TraceManager", "traceResult: not startTrace");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(String str, long j) {
        try {
            c4h c4hVar = this.f10908b;
            if (c4hVar != null) {
                c4hVar.h0(str, j);
            } else {
                wpe.h("TraceManager", "traceTimeStamps: not startTrace");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(String str, String str2) {
        try {
            c4h c4hVar = this.c;
            if (c4hVar != null) {
                c4hVar.j0(str, str2);
            } else {
                wpe.h("TraceManager", "traceResult2: not startTrace");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
