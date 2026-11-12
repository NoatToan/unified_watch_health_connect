package sq2;

import is2.b;
import java.util.Set;
import ms2.g;
import ms2.h;
import p005kotlin.Metadata;
import pl2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsq2/a;", "Lms2/h;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f160536a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f160537b = b.UNION_PAY;

    private a() {
    }

    @Override // ms2.h
    public final b a() {
        return f160537b;
    }

    @Override // ms2.h
    public final boolean b(Set<? extends c> set) {
        set.getClass();
        return false;
    }

    @Override // ms2.h
    public final ms2.c c(Set<? extends c> set) {
        return new ms2.b(f160537b);
    }

    @Override // ms2.h
    public final g d(Set<? extends c> set) {
        set.getClass();
        throw new RuntimeException("Untouched code");
    }
}
