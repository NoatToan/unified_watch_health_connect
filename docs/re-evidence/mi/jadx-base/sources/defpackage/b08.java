package defpackage;

import com.xiaomi.ai.api.common.Instruction;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b08 {
    public static final qpe c = aqe.f(b08.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Instruction> f3642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f3643b;

    public b08(List<Instruction> list, JSONObject jSONObject) {
        this.f3642a = list;
        this.f3643b = jSONObject;
    }

    public List<Instruction> a() {
        c.info("getEdgeRespInstructions:{}", this.f3642a);
        return this.f3642a;
    }
}
