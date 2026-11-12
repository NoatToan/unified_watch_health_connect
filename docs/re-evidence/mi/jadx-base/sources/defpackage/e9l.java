package defpackage;

import androidx.core.util.Pools;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class e9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xve<pzd, String> f16419a = new xve<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools.Pool<b> f16420b = u69.d(10, new a());

    public class a implements u69.d<b> {
        public a() {
        }

        @Override // u69.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class b implements u69.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageDigest f16422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ado f16423b = ado.a();

        public b(MessageDigest messageDigest) {
            this.f16422a = messageDigest;
        }

        @Override // u69.f
        public ado e() {
            return this.f16423b;
        }
    }

    public final String a(pzd pzdVar) {
        b bVar = (b) a6i.d(this.f16420b.acquire());
        try {
            pzdVar.a(bVar.f16422a);
            return ulq.x(bVar.f16422a.digest());
        } finally {
            this.f16420b.release(bVar);
        }
    }

    public String b(pzd pzdVar) {
        String strE;
        synchronized (this.f16419a) {
            strE = this.f16419a.e(pzdVar);
        }
        if (strE == null) {
            strE = a(pzdVar);
        }
        synchronized (this.f16419a) {
            this.f16419a.i(pzdVar, strE);
        }
        return strE;
    }
}
