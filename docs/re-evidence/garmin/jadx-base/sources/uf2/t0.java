package uf2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler", f = "LiveActivityProtobufDataHandler.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "getWorkoutsForActivityType", v = 2)
public final class t0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f170502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f170503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(r0 r0Var, t13.d<? super t0> dVar) {
        super(dVar);
        this.f170503b = r0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170502a = obj;
        this.f170504c |= Integer.MIN_VALUE;
        return this.f170503b.d(null, this);
    }
}
