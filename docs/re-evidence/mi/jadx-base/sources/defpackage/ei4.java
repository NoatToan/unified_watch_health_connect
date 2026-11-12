package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ei4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f16667a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f16668b = new ArrayList();

    public static ei4 g(ei4 ei4Var, long j) {
        return ei4Var.e("exo_len", j);
    }

    public static ei4 h(ei4 ei4Var, Uri uri) {
        return uri == null ? ei4Var.d("exo_redir") : ei4Var.f("exo_redir", uri.toString());
    }

    public final ei4 a(String str, Object obj) {
        this.f16667a.put((String) rk1.e(str), rk1.e(obj));
        this.f16668b.remove(str);
        return this;
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap(this.f16667a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f16668b));
    }

    public ei4 d(String str) {
        this.f16668b.add(str);
        this.f16667a.remove(str);
        return this;
    }

    public ei4 e(String str, long j) {
        return a(str, Long.valueOf(j));
    }

    public ei4 f(String str, String str2) {
        return a(str, str2);
    }
}
