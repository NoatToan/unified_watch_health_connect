package ex2;

import android.content.Context;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper", f = "StringsHelper.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 177}, m = "writeStringVersion", v = 1)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f67053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f67054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f67055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f67056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f67056d = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67055c = obj;
        this.f67057e |= Integer.MIN_VALUE;
        w wVar = w.f67058a;
        return this.f67056d.k(null, 0L, null, this);
    }
}
