package fe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public interface p1 {
    boolean a();

    void b();

    void c();

    Object d(boolean z14, wd2.b1 b1Var);

    Object e(String str, t13.d<? super xd2.g1<Unit>> dVar);

    Object f(int i14, long j8, String str, wd2.j jVar, wd2.r0 r0Var);

    Object g(com.garmin.android.library.livetrack.i iVar, v13.c cVar);

    long getDeviceUnitId();

    String getName();

    ae2.e0 getPublisher();

    DateTime getStartTime();

    Object h(com.garmin.android.library.livetrack.i iVar, v13.c cVar);

    Object i(int i14, long j8, String str, long j14, wd2.q0 q0Var);

    boolean isCreated();

    boolean j();

    List<v1> k();

    boolean l();

    void m();

    Object n(DateTime dateTime, DateTime dateTime2, ArrayList arrayList, ArrayList arrayList2, b2 b2Var);

    Object o(int i14, String str, int i15, List list, Integer num, Integer num2, wd2.o0 o0Var);

    Object p(v1.b bVar, v13.c cVar);

    Map<wd2.f2, List<wd2.d2>> q();

    Object r(int i14, String str, List list, wd2.p0 p0Var);
}
