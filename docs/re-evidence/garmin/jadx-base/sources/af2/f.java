package af2;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import re2.l0;
import we2.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laf2/f;", "", "", "isAppDebugBuild", "<init>", "(Z)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f3132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue<h> f3133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3134d;

    public f(boolean z14) {
        this.f3131a = z14;
        l0.f152316a.getClass();
        this.f3132b = l0.c("PortalMessageQueue");
        this.f3133c = new LinkedBlockingQueue<>();
        this.f3134d = new AtomicBoolean(true);
    }
}
