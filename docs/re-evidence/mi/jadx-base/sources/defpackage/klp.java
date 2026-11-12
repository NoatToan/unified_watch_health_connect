package defpackage;

import com.xiaomi.ai.api.common.APIUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class klp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c4h f23970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nnp f23971b;
    public boolean c;

    public klp(nnp nnpVar) {
        this.f23971b = nnpVar;
        c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        this.f23970a = c4hVarCreateObjectNode;
        c4hVarCreateObjectNode.j0("type", "client.perf.log.keep-alive");
    }

    public void a(c4h c4hVar) {
        mj1 mj1VarCreateArrayNode;
        synchronized (this) {
            try {
                if (this.f23970a.T("sdk.connect.process").C()) {
                    mj1VarCreateArrayNode = (mj1) this.f23970a.T("sdk.connect.process");
                } else {
                    mj1VarCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                    this.f23970a.q0("sdk.connect.process", mj1VarCreateArrayNode);
                }
                mj1VarCreateArrayNode.d0(c4hVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        wpe.h("TrackData", "finishTrack:mFinished=" + this.c);
        synchronized (this) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.f23971b.addTrackData(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zsd c() {
        return this.f23970a;
    }

    public long d(String str) {
        synchronized (this) {
            try {
                if (!this.f23970a.T("timestamps").H()) {
                    return 0L;
                }
                return ((c4h) this.f23970a.T("timestamps")).T(str).k(0L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e() {
        return this.c;
    }

    public void f(c4h c4hVar) {
        synchronized (this) {
            try {
                if (c4hVar.T("timestamps").H()) {
                    Iterator<Map.Entry<String, zsd>> itV = c4hVar.T("timestamps").v();
                    while (itV.hasNext()) {
                        Map.Entry<String, zsd> next = itV.next();
                        i(next.getKey(), next.getValue().j());
                    }
                }
                if (c4hVar.T("result").H()) {
                    this.f23970a.q0("result", c4hVar.T("result"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(String str, int i) {
        synchronized (this) {
            this.f23970a.g0(str, i);
        }
    }

    public void h(String str, String str2) {
        synchronized (this) {
            this.f23970a.j0(str, str2);
        }
    }

    public void i(String str, long j) {
        c4h c4hVarCreateObjectNode;
        synchronized (this) {
            try {
                if (this.f23970a.T("timestamps").H()) {
                    c4hVarCreateObjectNode = (c4h) this.f23970a.T("timestamps");
                } else {
                    c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                    this.f23970a.q0("timestamps", c4hVarCreateObjectNode);
                }
                c4hVarCreateObjectNode.h0(str, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        String string;
        synchronized (this) {
            string = this.f23971b.toString();
        }
        return string;
    }

    public klp(nnp nnpVar, boolean z) {
        this.f23971b = nnpVar;
        c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        this.f23970a = c4hVarCreateObjectNode;
        c4hVarCreateObjectNode.j0("type", "client.perf.log.keep-alive");
        this.c = z;
    }
}
