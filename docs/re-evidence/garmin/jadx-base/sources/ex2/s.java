package ex2;

import android.content.Context;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper", f = "StringsHelper.kt", l = {231, 238, PsExtractor.VIDEO_STREAM_MASK}, m = "initiateDownloadRequest", v = 1)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f67037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f67039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f67041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f67042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f67043g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f67042f = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67041e = obj;
        this.f67043g |= Integer.MIN_VALUE;
        return this.f67042f.g(null, 0L, null, null, this);
    }
}
