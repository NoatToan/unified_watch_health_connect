package cn.hutool.core.io.resource;

import cn.hutool.core.io.IORuntimeException;
import defpackage.d8q;
import defpackage.g4h;
import defpackage.i04;
import defpackage.jm9;
import defpackage.qk1;
import defpackage.tt3;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class ClassPathResource extends UrlResource {
    private static final long serialVersionUID = 1;
    private final ClassLoader classLoader;
    private final Class<?> clazz;
    private final String path;

    public ClassPathResource(String str) {
        this(str, null, null);
    }

    private void initUrl() {
        Class<?> cls = this.clazz;
        if (cls != null) {
            this.url = cls.getResource(this.path);
        } else {
            ClassLoader classLoader = this.classLoader;
            if (classLoader != null) {
                this.url = classLoader.getResource(this.path);
            } else {
                this.url = ClassLoader.getSystemResource(this.path);
            }
        }
        if (this.url == null) {
            throw new NoResourceException("Resource of path [{}] not exist!", this.path);
        }
    }

    private String normalizePath(String str) throws Throwable {
        String strQ = tt3.Q(jm9.E(str), "/");
        qk1.f(jm9.z(strQ), "Path [{}] must be a relative path !", strQ);
        return strQ;
    }

    public final String getAbsolutePath() {
        return jm9.z(this.path) ? this.path : jm9.E(d8q.g(this.url));
    }

    public final ClassLoader getClassLoader() {
        return this.classLoader;
    }

    public final String getPath() {
        return this.path;
    }

    @Override // cn.hutool.core.io.resource.UrlResource, defpackage.mqk
    public /* bridge */ /* synthetic */ BufferedReader getReader(Charset charset) {
        return super.getReader(charset);
    }

    @Override // cn.hutool.core.io.resource.UrlResource, defpackage.mqk
    public /* bridge */ /* synthetic */ byte[] readBytes() throws IORuntimeException {
        return super.readBytes();
    }

    @Override // cn.hutool.core.io.resource.UrlResource, defpackage.mqk
    public /* bridge */ /* synthetic */ String readStr(Charset charset) throws IORuntimeException {
        return super.readStr(charset);
    }

    @Override // cn.hutool.core.io.resource.UrlResource, defpackage.mqk
    public /* bridge */ /* synthetic */ String readUtf8Str() throws IORuntimeException {
        return super.readUtf8Str();
    }

    @Override // cn.hutool.core.io.resource.UrlResource
    public String toString() {
        if (this.path == null) {
            return super.toString();
        }
        return "classpath:" + this.path;
    }

    @Override // cn.hutool.core.io.resource.UrlResource, defpackage.mqk
    public /* bridge */ /* synthetic */ void writeTo(OutputStream outputStream) throws IORuntimeException {
        super.writeTo(outputStream);
    }

    public ClassPathResource(String str, ClassLoader classLoader) {
        this(str, classLoader, null);
    }

    public ClassPathResource(String str, Class<?> cls) {
        this(str, null, cls);
    }

    public ClassPathResource(String str, ClassLoader classLoader, Class<?> cls) throws Throwable {
        super((URL) null);
        qk1.u(str, "Path must not be null", new Object[0]);
        String strNormalizePath = normalizePath(str);
        this.path = strNormalizePath;
        this.name = tt3.F(strNormalizePath) ? null : jm9.t(strNormalizePath);
        this.classLoader = (ClassLoader) g4h.e(classLoader, i04.b());
        this.clazz = cls;
        initUrl();
    }
}
