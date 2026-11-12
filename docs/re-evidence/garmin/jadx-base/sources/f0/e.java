package f0;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lf0/e;", "Ld0/a;", "Lf0/e$b;", "mode", "<init>", "(Lf0/e$b;)V", "b", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends d0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f67638d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f67639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0.b f67640c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf0/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        OFF,
        ON,
        PREVIEW
    }

    static {
        new a(null);
        f67638d = b.OFF;
    }

    public e(b bVar) {
        bVar.getClass();
        this.f67639b = bVar;
        this.f67640c = f0.b.VIDEO_STABILIZATION;
    }

    @Override // d0.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public final f0.b getF67640c() {
        return this.f67640c;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.f67639b.name() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf0/e$a;", "", "<init>", "()V", "Lf0/e$b;", "DEFAULT_STABILIZATION_MODE", "Lf0/e$b;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
