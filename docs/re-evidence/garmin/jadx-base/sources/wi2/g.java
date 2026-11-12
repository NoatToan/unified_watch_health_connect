package wi2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.auth.cmc.presentation.CMCPortalViewModel", f = "CMCPortalViewModel.kt", l = {131, TsExtractor.TS_STREAM_TYPE_DTS, 139, 140, 141}, m = "generateITAutoLoginUrl")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ui2.f.a f185661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f185662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f185663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f185664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f185663c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f185662b = obj;
        this.f185664d |= Integer.MIN_VALUE;
        return e.x4(this.f185663c, this);
    }
}
