package qf1;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.samd.data.SaMDRepositoryImpl", f = "SaMDRepositoryImpl.kt", l = {SyslogConstants.LOG_LOCAL1, 137}, m = "isEcgFeatureEnabled", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f144625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f144626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f144626b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144625a = obj;
        this.f144627c |= Integer.MIN_VALUE;
        return this.f144626b.m(this);
    }
}
