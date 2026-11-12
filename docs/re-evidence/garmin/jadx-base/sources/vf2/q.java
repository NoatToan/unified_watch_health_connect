package vf2;

import com.garmin.proto.generated.GDIDataTypes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvf2/q;", "", "Lvf2/k;", "exerciseMapSource", "<init>", "(Lvf2/k;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f178006a;

    public q(k kVar) {
        kVar.getClass();
        this.f178006a = kVar;
    }

    public abstract Object a(int i14, int i15, v13.c cVar);

    public abstract Object b(String str, fg2.j jVar);

    public abstract Object c(String str, long j8, String str2, GDIDataTypes.UUID uuid, t13.d<? super p> dVar);
}
