package fe2;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.SessionRestorer", f = "SessionRestorer.kt", l = {100, 102, 105, 106, 107}, m = "filterOutNonRestorableSessions", v = 2)
public final class a2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wd2.e f70622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f70623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f70624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public be2.g f70625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f70628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f70629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z1 f70630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f70631j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(z1 z1Var, t13.d<? super a2> dVar) {
        super(dVar);
        this.f70630i = z1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70629h = obj;
        this.f70631j |= Integer.MIN_VALUE;
        int i14 = z1.f71025d;
        return this.f70630i.a(null, null, this);
    }
}
