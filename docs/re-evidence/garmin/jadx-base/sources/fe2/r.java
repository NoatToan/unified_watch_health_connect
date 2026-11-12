package fe2;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicTerminator", f = "ClassicTerminator.kt", l = {69}, m = "handleSessionsNotTerminated", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f70899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f70900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f70901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f70901c = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70900b = obj;
        this.f70902d |= Integer.MIN_VALUE;
        int i14 = q.f70890f;
        return this.f70901c.a(null, null, this);
    }
}
