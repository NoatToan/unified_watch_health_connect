package pd2;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f137395b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137396a;

    public class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            boolean z14 = obj instanceof c;
            if (z14 && (obj2 instanceof c)) {
                return ((c) obj).f137396a - ((c) obj2).f137396a;
            }
            if (z14) {
                return 1;
            }
            return obj2 instanceof c ? -1 : 0;
        }
    }

    public c(int i14) {
        this.f137396a = i14;
    }
}
