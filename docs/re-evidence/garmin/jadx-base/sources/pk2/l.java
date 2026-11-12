package pk2;

import java.util.HashSet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper", f = "AgentQueueHelper.kt", l = {366}, m = "queueAllDownloadItems")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f138418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ok2.y f138419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f138420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f138421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f138422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f138423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f138424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f138425h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f138424g = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f138423f = obj;
        this.f138425h |= Integer.MIN_VALUE;
        return b.b(this.f138424g, null, this);
    }
}
