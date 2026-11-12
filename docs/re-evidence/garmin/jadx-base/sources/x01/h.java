package x01;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionStateProvider", f = "NutritionStateProvider.kt", l = {TsExtractor.TS_PACKET_SIZE, 129, TsExtractor.TS_STREAM_TYPE_DTS, 139}, m = "refresh", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f188266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f188267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f188268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f188269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e01.a f188270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j1 f188271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v2.b f188272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f188273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f188274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f188275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f188276k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f188277l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f188276k = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f188275j = obj;
        this.f188277l |= Integer.MIN_VALUE;
        return this.f188276k.a(false, this);
    }
}
