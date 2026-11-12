package z0;

import android.util.Range;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f200500a = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Range<Integer> f200501b = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: z0.a$a, reason: collision with other inner class name */
    @AutoValue.Builder
    public static abstract class AbstractC3749a {
    }

    static {
        c.b bVarA = a();
        bVarA.f200601e = 0;
        bVarA.a();
    }

    public static c.b a() {
        c.b bVar = new c.b();
        bVar.f200598b = -1;
        bVar.f200599c = -1;
        bVar.f200601e = -1;
        Range<Integer> range = f200500a;
        if (range == null) {
            j20.x.l("Null bitrate");
            return null;
        }
        bVar.f200597a = range;
        Range<Integer> range2 = f200501b;
        if (range2 != null) {
            bVar.f200600d = range2;
            return bVar;
        }
        j20.x.l("Null sampleRate");
        return null;
    }

    public abstract Range<Integer> b();

    public abstract int c();

    public abstract Range<Integer> d();

    public abstract int e();

    public abstract int f();
}
