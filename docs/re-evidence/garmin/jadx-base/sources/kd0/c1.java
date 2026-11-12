package kd0;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DataDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "fetchLteSubscribedDevices", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f104012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f104012b = e1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104011a = obj;
        this.f104013c |= Integer.MIN_VALUE;
        return this.f104012b.d(this);
    }
}
