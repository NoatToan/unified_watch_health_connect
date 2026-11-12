package k12;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.data.repo.UsersRepo", f = "UsersRepo.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "getAllInvitedWeightScaleUsers", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f102360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f102361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, t13.d<? super o> dVar2) {
        super(dVar2);
        this.f102361b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f102360a = obj;
        this.f102362c |= Integer.MIN_VALUE;
        return this.f102361b.a(0L, this);
    }
}
