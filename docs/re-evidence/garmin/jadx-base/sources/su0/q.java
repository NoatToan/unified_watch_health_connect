package su0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "removeLiveTrackRecipient", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f160994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f160995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160996c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f160995b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160994a = obj;
        this.f160996c |= Integer.MIN_VALUE;
        return this.f160995b.o(null, this);
    }
}
