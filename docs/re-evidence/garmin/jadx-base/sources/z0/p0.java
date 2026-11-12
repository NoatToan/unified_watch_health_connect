package z0;

import android.util.Range;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f200704a = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f200705b;

    @AutoValue.Builder
    public static abstract class a {
    }

    static {
        i iVar = u.f200710c;
        List<u> listAsList = Arrays.asList(iVar, u.f200709b, u.f200708a);
        e eVar = n.f200695a;
        e eVar2 = new e(iVar, 1);
        k7.h.e(listAsList, "qualities cannot be null");
        k7.h.b(!listAsList.isEmpty(), "qualities cannot be empty");
        for (u uVar : listAsList) {
            k7.h.b(u.f200715h.contains(uVar), "qualities contain invalid quality: " + uVar);
        }
        f200705b = new x(listAsList, eVar2);
    }

    public static l.b a() {
        l.b bVar = new l.b();
        bVar.c(f200705b);
        bVar.f200668b = 0;
        Range<Integer> range = f200704a;
        if (range == null) {
            j20.x.l("Null bitrate");
            return null;
        }
        bVar.f200669c = range;
        bVar.f200670d = -1;
        return bVar;
    }

    public abstract int b();

    public abstract Range<Integer> c();

    public abstract int d();

    public abstract x e();

    public abstract l.b f();
}
