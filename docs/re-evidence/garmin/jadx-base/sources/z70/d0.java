package z70;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.data.PromosStoreImpl", f = "PromosStore.kt", l = {TsExtractor.TS_PACKET_SIZE, 156}, m = "dismissPromotion", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f202790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f202791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f202792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f202793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f202794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f202795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f202796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f202797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f202798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f202799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f202800k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, t13.d<? super d0> dVar) {
        super(dVar);
        this.f202799j = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f202798i = obj;
        this.f202800k |= Integer.MIN_VALUE;
        return this.f202799j.c(null, null, this);
    }
}
