package defpackage;

import com.xiaomi.push.io;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class fds {
    public static io a(io ioVar) {
        Map<String, String> map;
        if (ioVar != null && (map = ioVar.f164b) != null) {
            map.remove("score_info");
        }
        return ioVar;
    }
}
