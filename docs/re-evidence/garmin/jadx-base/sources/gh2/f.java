package gh2;

import android.content.Context;
import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class f extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f77449c = m.a("LocalXmlRemoteConfig");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f77450b;

    public static class a extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f77451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77452b;

        public a(Context context, int i14) {
            this.f77451a = context;
            this.f77452b = i14;
        }

        @Override // gh2.i.a
        public final i.c b() {
            return i.c.Local;
        }

        @Override // gh2.i.a
        public final n c() {
            return new f(this.f77451a, this.f77452b, 0);
        }
    }

    private f(Context context, int i14) {
        this.f77450b = m.b(i14, context);
    }

    @Override // gh2.n
    public final void b() {
        a();
        setChanged();
        notifyObservers();
    }

    @Override // gh2.n
    public final boolean c(String str) {
        return Boolean.parseBoolean((String) this.f77450b.get(str));
    }

    @Override // gh2.n
    public final String d() {
        try {
            StringBuilder sb3 = new StringBuilder();
            for (Map.Entry entry : this.f77450b.entrySet()) {
                sb3.append((String) entry.getKey());
                sb3.append(": ");
                sb3.append((String) entry.getValue());
                sb3.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            return sb3.toString();
        } catch (Exception e4) {
            f77449c.error("getConfiguration", (Throwable) e4);
            return "";
        }
    }

    @Override // gh2.n
    public final Pair[] e() {
        TreeMap treeMap = this.f77450b;
        try {
            Pair[] pairArr = new Pair[treeMap.size()];
            int i14 = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                pairArr[i14] = Pair.create((String) entry.getKey(), m.d((String) entry.getValue()));
                i14++;
            }
            return pairArr;
        } catch (Exception e4) {
            f77449c.error("getConfigurationPairs", (Throwable) e4);
            return null;
        }
    }

    @Override // gh2.n
    public final FirebaseRemoteConfigInfo f() {
        return null;
    }

    @Override // gh2.n
    public final long g(String str) {
        return m.c(str, (String) this.f77450b.get(str));
    }

    @Override // gh2.n
    public final String h(String str) {
        return (String) this.f77450b.get(str);
    }

    public /* synthetic */ f(Context context, int i14, int i15) {
        this(context, i14);
    }
}
