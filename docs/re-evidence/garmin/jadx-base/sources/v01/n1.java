package v01;

import java.time.LocalTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv01/n1;", "", "Lm01/g;", "repository", "Ld01/c;", "store", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lm01/g;Ld01/c;Lo53/z;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f174478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d01.c f174479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.z f174480c;

    public n1(m01.g gVar, d01.c cVar, o53.z zVar) {
        gVar.getClass();
        cVar.getClass();
        zVar.getClass();
        this.f174478a = gVar;
        this.f174479b = cVar;
        this.f174480c = zVar;
    }

    public static b63.v a(b63.v vVar) {
        int hour = vVar.f16219a.getHour();
        LocalTime localTime = vVar.f16219a;
        return new b63.v(hour, localTime.getMinute(), localTime.getSecond(), 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n1(m01.g gVar, d01.c cVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            x53.c cVar2 = o53.s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(gVar, cVar, zVar);
    }
}
