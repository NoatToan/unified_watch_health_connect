package wd2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$Companion", f = "LivetrackManager.kt", l = {61}, m = "deleteLocalData", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f184538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f184539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q.a f184540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f184541d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q.a aVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f184540c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184539b = obj;
        this.f184541d |= Integer.MIN_VALUE;
        return this.f184540c.b(null, this);
    }
}
