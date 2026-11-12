package fa2;

import ch.qos.logback.classic.Logger;
import ge1.b;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import rs2.c;
import rs2.h;
import rs2.v;
import rs2.w;
import t13.g;
import u53.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfa2/a;", "Lrs2/h;", "Lrs2/w;", "", "logTag", "Lt13/g;", "coroutineContext", "<init>", "(Ljava/lang/String;Lt13/g;)V", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class a implements h, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f70164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Logger f70165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f70166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f70167f;

    public a(String str, g gVar) {
        str.getClass();
        gVar.getClass();
        this.f70163b = str;
        this.f70164c = zl.a.e(str, gVar.plus(b.h()));
    }

    public final c a() {
        c cVar = this.f70167f;
        if (cVar != null) {
            return cVar;
        }
        s.m("deviceInfo");
        throw null;
    }

    public final org.slf4j.Logger b() {
        Logger logger = this.f70165d;
        if (logger != null) {
            return logger;
        }
        s.m("logger");
        throw null;
    }

    @Override // rs2.h
    public void close(String str) {
        str.getClass();
        c0.d(this.f70164c, this.f70163b + " closed");
    }

    @Override // rs2.h
    public void start(c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        String strB = oa2.d.b("GDI#", this.f70163b, cVar.getF92741e(), -1L, this);
        int i14 = gt2.c.f79010a;
        this.f70165d = gt2.b.f79005a.i(strB);
        this.f70166e = vVar;
        this.f70167f = cVar;
    }

    public a(String str, g gVar, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? s0.f129406a : gVar);
    }
}
