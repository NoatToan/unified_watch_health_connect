package et2;

import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.l0;
import rs2.c;
import rs2.d;
import rs2.v;
import us2.f;
import zs2.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Let2/a;", "Lbt2/b;", "<init>", "()V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements bt2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Logger f66027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f66028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f66029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f66030e;

    static {
        new C1386a(null);
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // bt2.b
    public final void m(h hVar) {
        hVar.getClass();
        this.f66029d = hVar;
    }

    @Override // rs2.h
    public final void start(c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        d dVar = d.f154380a;
        f fVar = (f) cVar;
        String str = fVar.f172493a;
        dVar.getClass();
        this.f66027b = LoggerFactory.getLogger(d.a("SetDeviceSettingsManager", -1L, this, str));
        this.f66028c = vVar;
        if (cVar instanceof f) {
            this.f66030e = fVar;
        } else {
            vb.h.z("Expected GfdiDeviceInfo");
        }
    }

    /* JADX INFO: renamed from: et2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Let2/a$a;", "", "<init>", "()V", "", "AUTO_UPLOAD_ENABLED", "I", "WEATHER_CONDITIONS_ENABLED", "WEATHER_ALERTS_ENABLED", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1386a {
        public /* synthetic */ C1386a(j jVar) {
            this();
        }

        private C1386a() {
        }
    }
}
