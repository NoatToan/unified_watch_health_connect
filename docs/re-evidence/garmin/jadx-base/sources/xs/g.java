package xs;

import java.util.ArrayList;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.y;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxs/g;", "", "Lts/b;", "activityRecordingPreferences", "<init>", "(Lts/b;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts.b f192052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f192053b;

    public g(ts.b bVar) {
        bVar.getClass();
        this.f192052a = bVar;
        this.f192053b = q2.a(a());
    }

    public final ArrayList a() {
        Object next;
        Set<String> setC = this.f192052a.c();
        ArrayList arrayList = new ArrayList(y.r(setC, 10));
        for (String str : setC) {
            w13.c cVar = vs.f.f179710h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(((vs.f) next).f179711a, str));
            vs.f fVar = (vs.f) next;
            if (fVar == null) {
                fVar = vs.f.f179708f;
            }
            arrayList.add(new vs.e(fVar, false, 2, null));
        }
        return arrayList;
    }
}
