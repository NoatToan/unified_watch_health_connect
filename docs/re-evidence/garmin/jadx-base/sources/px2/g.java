package px2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.samd.protoimpl.GarminHealthServiceHandler", f = "GarminHealthServiceHandler.kt", l = {SyslogConstants.LOG_LOCAL2, 173}, m = "handleMsg")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f141799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dt2.k f141800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f141801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f141802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f141803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f141802d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141801c = obj;
        this.f141803e |= Integer.MIN_VALUE;
        return this.f141802d.h(0L, null, this);
    }
}
