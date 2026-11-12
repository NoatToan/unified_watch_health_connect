package u63;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {
    public static void a(String str, t63.b bVar, t63.a aVar) {
        StringBuilder sb3 = new StringBuilder("OAuth ");
        if (aVar.f162800a.containsKey("realm")) {
            sb3.append(aVar.a("realm"));
            sb3.append(", ");
        }
        t63.a aVar2 = new t63.a();
        for (Map.Entry<String, SortedSet<String>> entry : aVar.f162800a.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("oauth_") || key.startsWith("x_oauth_")) {
                aVar2.f162800a.put(key, entry.getValue());
            }
        }
        aVar2.b("oauth_signature", str, true);
        Iterator<String> it = aVar2.f162800a.keySet().iterator();
        while (it.hasNext()) {
            sb3.append(aVar2.a(it.next()));
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        String string = sb3.toString();
        r63.b.a("Auth Header", string);
        bVar.a(string);
    }
}
