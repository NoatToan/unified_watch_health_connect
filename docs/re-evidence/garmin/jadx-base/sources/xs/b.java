package xs;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activityrecording.domain.ActivityRecordingStateHandler", f = "ActivityRecordingStateHandler.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "updateProtobufHandler", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f192040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f192041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f192042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f192041b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192040a = obj;
        this.f192042c |= Integer.MIN_VALUE;
        return this.f192041b.a(this);
    }
}
