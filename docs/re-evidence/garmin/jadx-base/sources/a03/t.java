package a03;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.skydoves.flexible.core.FlexibleSheetState", f = "FlexibleSheetState.kt", l = {187, TsExtractor.TS_PACKET_SIZE, 190}, m = "slightlyExpand")
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p pVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f199c = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198b = obj;
        this.f200d |= Integer.MIN_VALUE;
        return this.f199c.h(this);
    }
}
