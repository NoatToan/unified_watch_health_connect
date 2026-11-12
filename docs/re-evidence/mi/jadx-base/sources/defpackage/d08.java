package defpackage;

import com.xiaomi.ai.api.common.Instruction;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d08 implements zz7 {
    @Override // defpackage.zz7
    public abstract String getDomain();

    public List<String> getNormalizeDataForAsr(n08 n08Var) {
        return Collections.emptyList();
    }

    public boolean initEdge(Object obj) {
        return true;
    }

    public Object obtainPersistData() {
        return null;
    }

    @Override // defpackage.zz7
    public abstract JSONObject parse(String str, n08 n08Var);

    @Override // defpackage.zz7
    public abstract a08 provide(JSONObject jSONObject, List<Instruction> list, n08 n08Var);

    public boolean restoreFromPersistData(Object obj) {
        return true;
    }
}
