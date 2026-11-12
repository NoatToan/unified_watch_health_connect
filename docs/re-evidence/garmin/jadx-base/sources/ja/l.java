package ja;

import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fa.j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.a f97982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AudioSink.a f97983c;

    public /* synthetic */ l(b.a aVar, AudioSink.a aVar2, int i14) {
        this.f97981a = i14;
        this.f97982b = aVar;
        this.f97983c = aVar2;
    }

    @Override // fa.j.a
    public final void invoke(Object obj) {
        switch (this.f97981a) {
            case 0:
                ((b) obj).b0(this.f97982b, this.f97983c);
                break;
            default:
                ((b) obj).i(this.f97982b, this.f97983c);
                break;
        }
    }
}
