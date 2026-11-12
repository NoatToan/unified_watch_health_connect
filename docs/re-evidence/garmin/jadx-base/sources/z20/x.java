package z20;

import java.util.List;
import p005kotlin.Metadata;
import r53.c2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz20/x;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f201965a;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public x(d60.b bVar) {
        bVar.getClass();
        this.f201965a = bVar;
    }

    public final c2 a(List list, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.apps.connectmobile.courses.model.b bVar2) {
        return new c2(new w(list, this, bVar, bVar2, null));
    }
}
