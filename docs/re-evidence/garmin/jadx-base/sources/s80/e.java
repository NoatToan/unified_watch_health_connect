package s80;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DeviceIncorrectPasscodeStatusImpl", f = "DeviceIncorrectPasscodeStatusImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "toDeviceIncorrectPasscode", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f157913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f157914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f157915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f157916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f157917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f157918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f157919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f157918f = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f157917e = obj;
        this.f157919g |= Integer.MIN_VALUE;
        return d.l(this.f157918f, null, 0, this);
    }
}
