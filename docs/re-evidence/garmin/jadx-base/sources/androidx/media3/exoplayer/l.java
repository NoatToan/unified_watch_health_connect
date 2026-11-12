package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.mediacodec.b f9196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9197c = 5000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p6.b f9198d = androidx.media3.exoplayer.mediacodec.f.f9280u;

    public l(Context context) {
        this.f9195a = context;
        this.f9196b = new androidx.media3.exoplayer.mediacodec.b(context);
    }

    @Override // androidx.media3.exoplayer.w0
    public final t0[] a(Handler handler, v.b bVar, v.b bVar2, v.b bVar3, v.b bVar4) {
        ArrayList arrayList = new ArrayList();
        androidx.media3.exoplayer.mediacodec.b bVar5 = this.f9196b;
        Context context = this.f9195a;
        p6.b bVar6 = this.f9198d;
        arrayList.add(new androidx.media3.exoplayer.video.b(context, bVar5, bVar6, this.f9197c, false, handler, bVar, 50));
        DefaultAudioSink defaultAudioSinkA = new DefaultAudioSink.d(this.f9195a).a();
        arrayList.add(new androidx.media3.exoplayer.audio.f(this.f9195a, this.f9196b, bVar6, false, handler, bVar2, defaultAudioSinkA));
        arrayList.add(new va.g(bVar3, handler.getLooper()));
        arrayList.add(new qa.c(bVar4, handler.getLooper()));
        arrayList.add(new ab.b());
        arrayList.add(new oa.e(oa.c.a.f131020a, null));
        return (t0[]) arrayList.toArray(new t0[0]);
    }
}
