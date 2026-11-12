package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class zqh implements Cloneable {
    private boolean h;
    private File m;
    private List<zpz> i = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<zpw> f54474a = new ArrayList();
    private zps d = new zps();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zpt f54476c = new zpt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zpv f54475b = new zpv();
    private zqd f = new zqd();
    private zqb g = new zqb();
    private boolean e = false;
    private long j = -1;

    public List<zpz> b() {
        return this.i;
    }

    public zpt c() {
        return this.f54476c;
    }

    public void d(zpt zptVar) {
        this.f54476c = zptVar;
    }

    public zpv e() {
        return this.f54475b;
    }

    public void b(zpv zpvVar) {
        this.f54475b = zpvVar;
    }

    public boolean i() {
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
    }

    public File f() {
        return this.m;
    }

    public void d(File file) {
        this.m = file;
    }

    public zqd a() {
        return this.f;
    }

    public void d(zqd zqdVar) {
        this.f = zqdVar;
    }

    public zqb g() {
        return this.g;
    }

    public void c(zqb zqbVar) {
        this.g = zqbVar;
    }

    public boolean h() {
        return this.e;
    }

    public void c(boolean z) {
        this.e = z;
    }

    public long d() {
        return this.j;
    }

    public void d(long j) {
        this.j = j;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
