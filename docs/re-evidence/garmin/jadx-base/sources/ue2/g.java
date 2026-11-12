package ue2;

import com.google.android.play.agesignals.AgeSignalsAccessRequest;
import java.io.Serializable;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.agesignals.GooglePlayAgeSignalsHelper", f = "GooglePlayAgeSignalsHelper.kt", l = {164, 171}, m = "fetchAccessStatus-gIAlu-s")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AgeSignalsAccessRequest f170274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f170275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f170276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f170277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f170276c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170275b = obj;
        this.f170277d |= Integer.MIN_VALUE;
        Serializable serializableC = this.f170276c.c(null, this);
        return serializableC == u13.a.COROUTINE_SUSPENDED ? serializableC : q.a(serializableC);
    }
}
