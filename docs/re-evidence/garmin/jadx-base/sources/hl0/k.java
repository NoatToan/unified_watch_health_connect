package hl0;

import com.garmin.proto.generated.GDIInternationalGolf;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhl0/k;", "", "Lel0/c;", "golfCoursesRepository", "Lhl0/a;", "checkGolfCourseDownloadStatusUseCase", "<init>", "(Lel0/c;Lhl0/a;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final el0.c f84297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hl0.a f84298b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f84299a = w13.b.g(GDIInternationalGolf.MapType.values());
    }

    public k(el0.c cVar, hl0.a aVar) {
        cVar.getClass();
        aVar.getClass();
        this.f84297a = cVar;
        this.f84298b = aVar;
    }

    public static final sd2.i a(k kVar, int i14) {
        kVar.getClass();
        Iterator<T> it = a.f84299a.iterator();
        while (it.hasNext()) {
            sd2.h hVarH = kVar.f84297a.h(i14, (GDIInternationalGolf.MapType) it.next());
            if (hVarH != null) {
                return hVarH;
            }
        }
        return null;
    }
}
