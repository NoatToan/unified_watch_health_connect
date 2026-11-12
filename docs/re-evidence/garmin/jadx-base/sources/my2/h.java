package my2;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.sync.retrofit.SyncRetrofitDelegate", f = "SyncRetrofitDelegate.kt", l = {SyslogConstants.LOG_LOCAL7, 185}, m = "getBinaryFile")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f121559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f121560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f121561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f121562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f121563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f121564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f121565g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f121564f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121563e = obj;
        this.f121565g |= Integer.MIN_VALUE;
        return this.f121564f.f(0L, null, null, null, this);
    }
}
