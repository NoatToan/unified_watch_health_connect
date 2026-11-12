package xe2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.InputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.ui.ContinueAsFrag", f = "ContinueAsFrag.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3, 162}, m = "displayCustomerNameAndImage")
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f190571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f190572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f190573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f190574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f190573c = yVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190572b = obj;
        this.f190574d |= Integer.MIN_VALUE;
        return y.w6(this.f190573c, null, this);
    }
}
