package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.smarthome.setting.ServerSetting;

/* JADX INFO: loaded from: classes7.dex */
public abstract class nnp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c4h f28098a;

    public nnp(gt3 gt3Var) {
        a(gt3Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
    private void a(gt3 gt3Var) {
        String str;
        e01 aivsConfig = gt3Var.getAivsConfig();
        c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        this.f28098a = c4hVarCreateObjectNode;
        c4hVarCreateObjectNode.j0(g.d, aivsConfig.i("auth.client_id"));
        if (gt3Var.getClientInfo().getDeviceId().c()) {
            this.f28098a.j0("did", gt3Var.getClientInfo().getDeviceId().b());
        }
        c4h c4hVarCreateObjectNode2 = APIUtils.getObjectMapper().createObjectNode();
        this.f28098a.q0("env", c4hVarCreateObjectNode2);
        c4hVarCreateObjectNode2.j0("log.version", "3.0");
        int iE = aivsConfig.e("aivs.env");
        if (iE == 2) {
            str = "staging";
        } else if (iE == 1) {
            str = ServerSetting.SERVER_ENV_PREVIEW;
        } else {
            if (iE != 0) {
                if (iE == 3) {
                    str = "preview4test";
                }
                c4hVarCreateObjectNode2.g0("authmode", gt3Var.getAuthProvider().getAuthType());
                c4hVarCreateObjectNode2.j0("sdk.type", "java");
                c4hVarCreateObjectNode2.g0("sdk.vad.type", aivsConfig.e("asr.vad_type"));
                if (gt3Var.getClientInfo().getEngineId().c()) {
                    c4hVarCreateObjectNode2.j0("engine.id", gt3Var.getClientInfo().getEngineId().b());
                }
                this.f28098a.q0("data", APIUtils.getObjectMapper().createArrayNode());
            }
            str = "production";
        }
        c4hVarCreateObjectNode2.j0("cloud", str);
        c4hVarCreateObjectNode2.g0("authmode", gt3Var.getAuthProvider().getAuthType());
        c4hVarCreateObjectNode2.j0("sdk.type", "java");
        c4hVarCreateObjectNode2.g0("sdk.vad.type", aivsConfig.e("asr.vad_type"));
        if (gt3Var.getClientInfo().getEngineId().c()) {
            c4hVarCreateObjectNode2.j0("engine.id", gt3Var.getClientInfo().getEngineId().b());
        }
        this.f28098a.q0("data", APIUtils.getObjectMapper().createArrayNode());
    }

    public void addTrackData(klp klpVar) {
        mj1 mj1VarCreateArrayNode;
        synchronized (this) {
            try {
                if (this.f28098a.T("data").C()) {
                    mj1VarCreateArrayNode = (mj1) this.f28098a.T("data");
                } else {
                    mj1VarCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                    this.f28098a.q0("data", mj1VarCreateArrayNode);
                }
                mj1VarCreateArrayNode.d0(klpVar.c());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearData() {
        synchronized (this) {
            try {
                if (this.f28098a.T("data").C()) {
                    this.f28098a.n0("data");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public klp createTrackData() {
        mj1 mj1VarCreateArrayNode;
        klp klpVar;
        synchronized (this) {
            try {
                if (this.f28098a.T("data").C()) {
                    mj1VarCreateArrayNode = (mj1) this.f28098a.T("data");
                } else {
                    mj1VarCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                    this.f28098a.q0("data", mj1VarCreateArrayNode);
                }
                klpVar = new klp(this, true);
                mj1VarCreateArrayNode.d0(klpVar.c());
            } catch (Throwable th) {
                throw th;
            }
        }
        return klpVar;
    }

    public int getTrackDataNum() {
        int size;
        synchronized (this) {
            try {
                size = this.f28098a.T("data").C() ? this.f28098a.T("data").size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return size;
    }

    public void set(String str, String str2) {
        synchronized (this) {
            this.f28098a.j0(str, str2);
        }
    }

    public void setEnv(String str, int i) {
        synchronized (this) {
            ((c4h) this.f28098a.T("env")).g0(str, i);
        }
    }

    public zsd toJsonNode() {
        return this.f28098a;
    }

    public String toString() {
        String jsonString;
        synchronized (this) {
            try {
                jsonString = APIUtils.toJsonString(this.f28098a);
            } catch (JsonProcessingException e) {
                wpe.e("TrackInfo", wpe.o(e));
                return super.toString();
            }
        }
        return jsonString;
    }

    public void setEnv(String str, String str2) {
        synchronized (this) {
            ((c4h) this.f28098a.T("env")).j0(str, str2);
        }
    }
}
