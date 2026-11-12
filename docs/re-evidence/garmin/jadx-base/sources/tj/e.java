package tj;

import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f164741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f164742d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f164743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f164744b;

    public enum a {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum b {
        meet,
        slice
    }

    static {
        new e(null, null);
        f164741c = new e(a.none, null);
        a aVar = a.xMidYMid;
        b bVar = b.meet;
        f164742d = new e(aVar, bVar);
        a aVar2 = a.xMinYMin;
        new e(aVar2, bVar);
        new e(a.xMaxYMax, bVar);
        new e(a.xMidYMin, bVar);
        new e(a.xMidYMax, bVar);
        b bVar2 = b.slice;
        new e(aVar, bVar2);
        new e(aVar2, bVar2);
    }

    public e(a aVar, b bVar) {
        this.f164743a = aVar;
        this.f164744b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f164743a == eVar.f164743a && this.f164744b == eVar.f164744b;
    }

    public final String toString() {
        return this.f164743a + StringUtils.SPACE + this.f164744b;
    }
}
