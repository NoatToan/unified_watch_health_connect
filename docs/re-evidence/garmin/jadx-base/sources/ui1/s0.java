package ui1;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.network.SubscriptionsRepository", f = "SubscriptionsRepository.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "filterWithProductCode", v = 2)
public final class s0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f171375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f171376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f171377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f171378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0 f171379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f171380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(o0 o0Var, t13.d<? super s0> dVar) {
        super(dVar);
        this.f171379e = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f171378d = obj;
        this.f171380f |= Integer.MIN_VALUE;
        return this.f171379e.c(null, null, this);
    }
}
