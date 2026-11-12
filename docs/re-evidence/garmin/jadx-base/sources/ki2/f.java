package ki2;

import ch.qos.logback.classic.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lki2/f;", "", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104922a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hi2.d f104923b = new hi2.d("DSL-DataTransformFactory", null, 2, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lki2/f$a;", "", "<init>", "()V", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            if (r2.equals("walking") == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            return new ki2.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
        
            if (r2.equals("walkOptions") == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
        
            return new ki2.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            if (r2.equals("running") == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r2.equals("runOptions") == false) goto L43;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static e a(li2.a aVar, String str) {
            str.getClass();
            f.f104923b.getClass();
            switch (str.hashCode()) {
                case -1335157162:
                    if (str.equals("device")) {
                        return aVar != null ? new h(aVar.f112907h, aVar.f112908i) : new h(false, false);
                    }
                    Logger logger = hi2.d.f83889c;
                    return new g();
                case -690050923:
                    break;
                case -330818112:
                    if (str.equals("criticalSwimSpeed")) {
                        return new c();
                    }
                    Logger logger2 = hi2.d.f83889c;
                    return new g();
                case 98526144:
                    if (str.equals("goals")) {
                        return new i();
                    }
                    Logger logger3 = hi2.d.f83889c;
                    return new g();
                case 109761319:
                    if (str.equals("steps")) {
                        return new j();
                    }
                    Logger logger4 = hi2.d.f83889c;
                    return new g();
                case 709075226:
                    if (str.equals("controlsMenuReset")) {
                        return new b();
                    }
                    Logger logger5 = hi2.d.f83889c;
                    return new g();
                case 1118815609:
                    break;
                case 1199276435:
                    break;
                case 1550783935:
                    break;
                default:
                    Logger logger6 = hi2.d.f83889c;
                    return new g();
            }
        }

        private a() {
        }
    }
}
