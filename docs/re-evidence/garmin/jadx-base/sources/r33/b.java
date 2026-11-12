package r33;

import com.nimbusds.jose.jwk.JWKParameterNames;
import h33.c0;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.lang3.BooleanUtils;
import q33.x;

/* JADX INFO: loaded from: classes3.dex */
public class b implements x.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f150112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f150113k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f150114a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f150115b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150116c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f150117d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f150118e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f150119f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f150120g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r33.a.EnumC2820a f150121h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String[] f150122i = null;

    /* JADX INFO: renamed from: r33.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC2822b implements x.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f150123a = new ArrayList();

        @Override // q33.x.b
        public final void a() {
            f((String[]) this.f150123a.toArray(new String[0]));
        }

        @Override // q33.x.b
        public final void b(x33.b bVar, x33.f fVar) {
        }

        @Override // q33.x.b
        public final void c(Object obj) {
            if (obj instanceof String) {
                this.f150123a.add((String) obj);
            }
        }

        @Override // q33.x.b
        public final x.a d(x33.b bVar) {
            return null;
        }

        @Override // q33.x.b
        public final void e(d43.f fVar) {
        }

        public abstract void f(String[] strArr);
    }

    public class c implements x.a {
        private c() {
        }

        @Override // q33.x.a
        public final void a() {
        }

        @Override // q33.x.a
        public final x.b b(x33.f fVar) {
            String strB = fVar.b();
            if ("d1".equals(strB)) {
                return new r33.c(this);
            }
            if ("d2".equals(strB)) {
                return new r33.d(this);
            }
            return null;
        }

        @Override // q33.x.a
        public final void c(x33.f fVar, Object obj) {
            String strB = fVar.b();
            boolean zEquals = JWKParameterNames.OCT_KEY_VALUE.equals(strB);
            b bVar = b.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    r33.a.EnumC2820a.f150102b.getClass();
                    r33.a.EnumC2820a enumC2820a = (r33.a.EnumC2820a) r33.a.EnumC2820a.f150103c.get((Integer) obj);
                    if (enumC2820a == null) {
                        enumC2820a = r33.a.EnumC2820a.UNKNOWN;
                    }
                    bVar.f150121h = enumC2820a;
                    return;
                }
                return;
            }
            if ("mv".equals(strB)) {
                if (obj instanceof int[]) {
                    bVar.f150114a = (int[]) obj;
                    return;
                }
                return;
            }
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    bVar.f150115b = str;
                    return;
                }
                return;
            }
            if ("xi".equals(strB)) {
                if (obj instanceof Integer) {
                    bVar.f150116c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(strB) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (str2.isEmpty()) {
                    return;
                }
                bVar.f150117d = str2;
            }
        }

        @Override // q33.x.a
        public final void d(x33.f fVar, x33.b bVar, x33.f fVar2) {
        }

        @Override // q33.x.a
        public final void e(x33.f fVar, d43.f fVar2) {
        }

        @Override // q33.x.a
        public final x.a f(x33.b bVar, x33.f fVar) {
            return null;
        }
    }

    public class d implements x.a {
        private d() {
        }

        @Override // q33.x.a
        public final void a() {
        }

        @Override // q33.x.a
        public final x.b b(x33.f fVar) {
            if ("b".equals(fVar.b())) {
                return new r33.e(this);
            }
            return null;
        }

        @Override // q33.x.a
        public final void c(x33.f fVar, Object obj) {
        }

        @Override // q33.x.a
        public final void d(x33.f fVar, x33.b bVar, x33.f fVar2) {
        }

        @Override // q33.x.a
        public final void e(x33.f fVar, d43.f fVar2) {
        }

        @Override // q33.x.a
        public final x.a f(x33.b bVar, x33.f fVar) {
            return null;
        }
    }

    public class e implements x.a {
        private e() {
        }

        @Override // q33.x.a
        public final void a() {
        }

        @Override // q33.x.a
        public final x.b b(x33.f fVar) {
            String strB = fVar.b();
            if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
                return new f(this);
            }
            if ("strings".equals(strB)) {
                return new g(this);
            }
            return null;
        }

        @Override // q33.x.a
        public final void c(x33.f fVar, Object obj) {
            String strB = fVar.b();
            boolean zEquals = "version".equals(strB);
            b bVar = b.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    bVar.f150114a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strB)) {
                bVar.f150115b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // q33.x.a
        public final void d(x33.f fVar, x33.b bVar, x33.f fVar2) {
        }

        @Override // q33.x.a
        public final void e(x33.f fVar, d43.f fVar2) {
        }

        @Override // q33.x.a
        public final x.a f(x33.b bVar, x33.f fVar) {
            return null;
        }
    }

    static {
        try {
            f150112j = BooleanUtils.TRUE.equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f150112j = false;
        }
        HashMap map = new HashMap();
        f150113k = map;
        x33.c cVar = new x33.c("kotlin.jvm.internal.KotlinClass");
        x33.b.f188590d.getClass();
        map.put(x33.b.a.b(cVar), r33.a.EnumC2820a.CLASS);
        map.put(x33.b.a.b(new x33.c("kotlin.jvm.internal.KotlinFileFacade")), r33.a.EnumC2820a.FILE_FACADE);
        map.put(x33.b.a.b(new x33.c("kotlin.jvm.internal.KotlinMultifileClass")), r33.a.EnumC2820a.MULTIFILE_CLASS);
        map.put(x33.b.a.b(new x33.c("kotlin.jvm.internal.KotlinMultifileClassPart")), r33.a.EnumC2820a.MULTIFILE_CLASS_PART);
        map.put(x33.b.a.b(new x33.c("kotlin.jvm.internal.KotlinSyntheticClass")), r33.a.EnumC2820a.SYNTHETIC_CLASS);
    }

    @Override // q33.x.c
    public final void a() {
    }

    @Override // q33.x.c
    public final x.a b(x33.b bVar, y23.b bVar2) {
        r33.a.EnumC2820a enumC2820a;
        x33.c cVarA = bVar.a();
        if (cVarA.equals(c0.f81419a)) {
            return new c();
        }
        if (cVarA.equals(c0.f81433o)) {
            return new d();
        }
        if (f150112j || this.f150121h != null || (enumC2820a = (r33.a.EnumC2820a) f150113k.get(bVar)) == null) {
            return null;
        }
        this.f150121h = enumC2820a;
        return new e();
    }
}
