package defpackage;

import com.xiaomi.ai.api.common.Instruction;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface zz7 {
    String getDomain();

    JSONObject parse(String str, n08 n08Var);

    a08 provide(JSONObject jSONObject, List<Instruction> list, n08 n08Var);
}
