package y80;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository", f = "DeviceStorageRepository.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS, 147, 154, 163, TsExtractor.TS_STREAM_TYPE_AC4}, m = "fetchLottieAssetImages", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f195098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zb0.u0 f195099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o90.a f195100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f195101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f195102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f195103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f195104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f195105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f195106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f195107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f195108k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, t13.d<? super c0> dVar) {
        super(dVar);
        this.f195107j = b0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195106i = obj;
        this.f195108k |= Integer.MIN_VALUE;
        return b0.a(this.f195107j, null, null, null, this);
    }
}
