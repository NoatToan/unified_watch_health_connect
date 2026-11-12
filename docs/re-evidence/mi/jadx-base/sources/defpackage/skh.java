package defpackage;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Properties;

/* JADX INFO: loaded from: classes6.dex */
public abstract class skh implements mc4 {
    public static final ThreadLocal<LinkedList<skh>> d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xb4 f33735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lc4 f33736b;
    public jc4 c;

    public static class a extends ThreadLocal<LinkedList<skh>> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LinkedList<skh> initialValue() {
            return new LinkedList<>();
        }
    }

    public static class b extends FilterReader {
        public b(Reader reader) {
            super(reader);
        }

        @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public static final class c extends skh {
        public final File e;

        public c(File file, lc4 lc4Var) {
            this.e = file;
            u(lc4Var);
        }

        @Override // defpackage.skh
        public mc4 A(String str) {
            File file = new File(str).isAbsolute() ? new File(str) : skh.B(this.e, str);
            if (file == null) {
                return null;
            }
            return file.exists() ? skh.l(file, a().k(null)) : super.A(str);
        }

        @Override // defpackage.skh
        public jc4 f() {
            return ocm.o(this.e.getPath());
        }

        @Override // defpackage.skh
        public ConfigSyntax j() {
            return skh.D(this.e.getName());
        }

        @Override // defpackage.skh
        public String toString() {
            return c.class.getSimpleName() + "(" + this.e.getPath() + ")";
        }

        @Override // defpackage.skh
        public Reader x() throws IOException {
            if (vb4.s()) {
                skh.E("Loading config from a file: " + this.e);
            }
            return skh.y(new FileInputStream(this.e));
        }
    }

    public static final class d extends skh {
        public final String e;
        public final String f;

        public d(String str, String str2, lc4 lc4Var) {
            this.e = str;
            this.f = str2;
            u(lc4Var);
        }

        @Override // defpackage.skh
        public jc4 f() {
            return ocm.r(this.e);
        }

        @Override // defpackage.skh
        public Reader x() throws IOException {
            throw new FileNotFoundException(this.f);
        }
    }

    public static final class e extends skh {
        public final Properties e;

        public e(Properties properties, lc4 lc4Var) {
            this.e = properties;
            u(lc4Var);
        }

        @Override // defpackage.skh
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public g00 v(jc4 jc4Var, lc4 lc4Var) {
            if (vb4.s()) {
                skh.E("Loading config from properties " + this.e);
            }
            return kdi.d(jc4Var, this.e);
        }

        @Override // defpackage.skh
        public jc4 f() {
            return ocm.r("properties");
        }

        @Override // defpackage.skh
        public ConfigSyntax j() {
            return ConfigSyntax.PROPERTIES;
        }

        @Override // defpackage.skh
        public String toString() {
            return e.class.getSimpleName() + "(" + this.e.size() + " props)";
        }

        @Override // defpackage.skh
        public Reader x() throws IOException {
            throw new ConfigException.BugOrBroken("reader() should not be called on props");
        }
    }

    public static final class f extends skh {
        public final Reader e;

        public f(Reader reader, lc4 lc4Var) {
            this.e = reader;
            u(lc4Var);
        }

        @Override // defpackage.skh
        public jc4 f() {
            return ocm.r("Reader");
        }

        @Override // defpackage.skh
        public Reader x() {
            if (vb4.s()) {
                skh.E("Loading config from reader " + this.e);
            }
            return this.e;
        }
    }

    public static final class g extends skh {
        public final String e;

        public g(String str, lc4 lc4Var) {
            this.e = str;
            u(lc4Var);
        }

        public static String F(String str) {
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf < 0) {
                return null;
            }
            return str.substring(0, iLastIndexOf);
        }

        @Override // defpackage.skh
        public mc4 A(String str) {
            if (str.startsWith("/")) {
                return skh.p(str.substring(1), a().k(null));
            }
            String strF = F(this.e);
            if (strF == null) {
                return skh.p(str, a().k(null));
            }
            return skh.p(strF + "/" + str, a().k(null));
        }

        @Override // defpackage.skh
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public g00 v(jc4 jc4Var, lc4 lc4Var) throws Throwable {
            ClassLoader classLoaderD = lc4Var.d();
            if (classLoaderD == null) {
                throw new ConfigException.BugOrBroken("null class loader; pass in a class loader or use Thread.currentThread().setContextClassLoader()");
            }
            Enumeration<URL> resources = classLoaderD.getResources(this.e);
            if (!resources.hasMoreElements()) {
                if (vb4.s()) {
                    skh.E("Loading config from class loader " + classLoaderD + " but there were no resources called " + this.e);
                }
                throw new IOException("resource not found on classpath: " + this.e);
            }
            g00 g00VarB0 = ncm.B0(jc4Var);
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                if (vb4.s()) {
                    skh.E("Loading config from URL " + urlNextElement.toExternalForm() + " from class loader " + classLoaderD);
                }
                ocm ocmVarC = ((ocm) jc4Var).c(urlNextElement);
                InputStream inputStreamOpenStream = urlNextElement.openStream();
                try {
                    Reader readerY = skh.y(inputStreamOpenStream);
                    try {
                        h00 h00VarW = w(readerY, ocmVarC, lc4Var);
                        try {
                            readerY.close();
                            g00VarB0 = g00VarB0.d0(h00VarW);
                        } catch (Throwable th) {
                            th = th;
                            inputStreamOpenStream = null;
                            if (inputStreamOpenStream != null) {
                                inputStreamOpenStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        readerY.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            return g00VarB0;
        }

        @Override // defpackage.skh
        public jc4 f() {
            return ocm.p(this.e);
        }

        @Override // defpackage.skh
        public ConfigSyntax j() {
            return skh.D(this.e);
        }

        @Override // defpackage.skh
        public String toString() {
            return g.class.getSimpleName() + "(" + this.e + ")";
        }

        @Override // defpackage.skh
        public Reader x() throws IOException {
            throw new ConfigException.BugOrBroken("reader() should not be called on resources");
        }
    }

    public static final class h extends skh {
        public final URL e;
        public String f = null;

        public h(URL url, lc4 lc4Var) {
            this.e = url;
            u(lc4Var);
        }

        @Override // defpackage.skh
        public mc4 A(String str) {
            URL urlC = skh.C(this.e, str);
            if (urlC == null) {
                return null;
            }
            return skh.q(urlC, a().k(null));
        }

        @Override // defpackage.skh
        public ConfigSyntax e() {
            String str = this.f;
            if (str != null) {
                if (str.equals("application/json")) {
                    return ConfigSyntax.JSON;
                }
                if (this.f.equals("text/x-java-properties")) {
                    return ConfigSyntax.PROPERTIES;
                }
                if (this.f.equals("application/hocon")) {
                    return ConfigSyntax.CONF;
                }
                if (vb4.s()) {
                    skh.E("'" + this.f + "' isn't a known content type");
                }
            }
            return null;
        }

        @Override // defpackage.skh
        public jc4 f() {
            return ocm.s(this.e);
        }

        @Override // defpackage.skh
        public ConfigSyntax j() {
            return skh.D(this.e.getPath());
        }

        @Override // defpackage.skh
        public String toString() {
            return h.class.getSimpleName() + "(" + this.e.toExternalForm() + ")";
        }

        @Override // defpackage.skh
        public Reader x() throws IOException {
            if (vb4.s()) {
                skh.E("Loading config from a URL: " + this.e.toExternalForm());
            }
            URLConnection uRLConnectionOpenConnection = this.e.openConnection();
            uRLConnectionOpenConnection.connect();
            String contentType = uRLConnectionOpenConnection.getContentType();
            this.f = contentType;
            if (contentType != null) {
                if (vb4.s()) {
                    skh.E("URL sets Content-Type: '" + this.f + "'");
                }
                String strTrim = this.f.trim();
                this.f = strTrim;
                int iIndexOf = strTrim.indexOf(59);
                if (iIndexOf >= 0) {
                    this.f = this.f.substring(0, iIndexOf);
                }
            }
            return skh.y(uRLConnectionOpenConnection.getInputStream());
        }
    }

    public static File B(File file, String str) {
        File parentFile;
        if (new File(str).isAbsolute() || (parentFile = file.getParentFile()) == null) {
            return null;
        }
        return new File(parentFile, str);
    }

    public static URL C(URL url, String str) {
        if (new File(str).isAbsolute()) {
            return null;
        }
        try {
            return url.toURI().resolve(new URI(str)).toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            return null;
        }
    }

    public static ConfigSyntax D(String str) {
        if (str.endsWith(".json")) {
            return ConfigSyntax.JSON;
        }
        if (str.endsWith(".conf")) {
            return ConfigSyntax.CONF;
        }
        if (str.endsWith(".properties")) {
            return ConfigSyntax.PROPERTIES;
        }
        return null;
    }

    public static void E(String str) {
        if (vb4.s()) {
            vb4.r(str);
        }
    }

    public static Reader g(Reader reader) {
        return new b(reader);
    }

    public static g00 i(rc4 rc4Var) {
        if (rc4Var instanceof g00) {
            return (g00) rc4Var;
        }
        throw new ConfigException.WrongType(rc4Var.g(), "", "object at file root", rc4Var.valueType().name());
    }

    public static skh l(File file, lc4 lc4Var) {
        return new c(file, lc4Var);
    }

    public static skh m(String str, String str2, lc4 lc4Var) {
        return new d(str, str2, lc4Var);
    }

    public static skh n(Properties properties, lc4 lc4Var) {
        return new e(properties, lc4Var);
    }

    public static skh o(Reader reader, lc4 lc4Var) {
        return new f(g(reader), lc4Var);
    }

    public static skh p(String str, lc4 lc4Var) {
        if (lc4Var.d() != null) {
            return new g(str, lc4Var);
        }
        throw new ConfigException.BugOrBroken("null class loader; pass in a class loader or use Thread.currentThread().setContextClassLoader()");
    }

    public static skh q(URL url, lc4 lc4Var) {
        return url.getProtocol().equals("file") ? l(wb4.h(url), lc4Var) : new h(url, lc4Var);
    }

    public static Reader y(InputStream inputStream) {
        return z(inputStream, "UTF-8");
    }

    public static Reader z(InputStream inputStream, String str) {
        try {
            return new BufferedReader(new InputStreamReader(inputStream, str));
        } catch (UnsupportedEncodingException e2) {
            throw new ConfigException.BugOrBroken("Java runtime does not support UTF-8", e2);
        }
    }

    public mc4 A(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return p(str, a().k(null));
    }

    @Override // defpackage.mc4
    public lc4 a() {
        return this.f33736b;
    }

    @Override // defpackage.mc4
    public ic4 b(lc4 lc4Var) {
        LinkedList<skh> linkedList = d.get();
        if (linkedList.size() >= 50) {
            throw new ConfigException.Parse(this.c, "include statements nested more than 50 times, you probably have a cycle in your includes. Trace: " + linkedList);
        }
        linkedList.addFirst(this);
        try {
            g00 g00VarI = i(t(lc4Var));
            linkedList.removeFirst();
            if (linkedList.isEmpty()) {
            }
            return g00VarI;
        } finally {
            linkedList.removeFirst();
            if (linkedList.isEmpty()) {
                d.remove();
            }
        }
    }

    public ConfigSyntax e() {
        return null;
    }

    public abstract jc4 f();

    public final lc4 h(lc4 lc4Var) {
        ConfigSyntax configSyntaxG = lc4Var.g();
        if (configSyntaxG == null) {
            configSyntaxG = j();
        }
        if (configSyntaxG == null) {
            configSyntaxG = ConfigSyntax.CONF;
        }
        lc4 lc4VarA = lc4Var.l(configSyntaxG).a(vb4.d());
        return lc4VarA.j(wcm.l(lc4VarA.e()));
    }

    public ConfigSyntax j() {
        return null;
    }

    public xb4 k() {
        return this.f33735a;
    }

    public ic4 r() {
        return i(t(a()));
    }

    public final h00 s(jc4 jc4Var, lc4 lc4Var) {
        try {
            return v(jc4Var, lc4Var);
        } catch (IOException e2) {
            if (lc4Var.c()) {
                return ncm.C0(jc4Var);
            }
            E("exception loading " + jc4Var.a() + ": " + e2.getClass().getName() + ": " + e2.getMessage());
            throw new ConfigException.IO(jc4Var, e2.getClass().getName() + ": " + e2.getMessage(), e2);
        }
    }

    public final h00 t(lc4 lc4Var) {
        lc4 lc4VarH = h(lc4Var);
        return s(lc4VarH.f() != null ? ocm.r(lc4VarH.f()) : this.c, lc4VarH);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void u(lc4 lc4Var) {
        this.f33736b = h(lc4Var);
        this.f33735a = new vcm(this);
        if (this.f33736b.f() != null) {
            this.c = ocm.r(this.f33736b.f());
        } else {
            this.c = f();
        }
    }

    public h00 v(jc4 jc4Var, lc4 lc4Var) throws IOException {
        Reader readerX = x();
        ConfigSyntax configSyntaxE = e();
        if (configSyntaxE != null) {
            if (vb4.s() && lc4Var.g() != null) {
                E("Overriding syntax " + lc4Var.g() + " with Content-Type which specified " + configSyntaxE);
            }
            lc4Var = lc4Var.l(configSyntaxE);
        }
        try {
            return w(readerX, jc4Var, lc4Var);
        } finally {
            readerX.close();
        }
    }

    public h00 w(Reader reader, jc4 jc4Var, lc4 lc4Var) throws IOException {
        return lc4Var.g() == ConfigSyntax.PROPERTIES ? kdi.f(reader, jc4Var) : wkh.e(mip.c(jc4Var, reader, lc4Var.g()), jc4Var, lc4Var, k());
    }

    public abstract Reader x() throws IOException;
}
