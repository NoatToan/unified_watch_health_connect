package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.audio.f;
import com.google.android.exoplayer2.mediacodec.d;
import com.google.android.exoplayer2.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class pw5 implements tkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30849a;
    public boolean d;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f30851k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30850b = 0;
    public long c = 5000;
    public d e = d.f7982a;

    public pw5(Context context) {
        this.f30849a = context;
    }

    @Override // defpackage.tkk
    public s[] a(Handler handler, vrq vrqVar, a aVar, j8p j8pVar, stf stfVar) {
        ArrayList<s> arrayList = new ArrayList<>();
        h(this.f30849a, this.f30850b, this.e, this.d, handler, vrqVar, this.c, arrayList);
        AudioSink audioSinkC = c(this.f30849a, this.i, this.j, this.f30851k);
        if (audioSinkC != null) {
            b(this.f30849a, this.f30850b, this.e, this.d, audioSinkC, handler, aVar, arrayList);
        }
        g(this.f30849a, j8pVar, handler.getLooper(), this.f30850b, arrayList);
        e(this.f30849a, stfVar, handler.getLooper(), this.f30850b, arrayList);
        d(this.f30849a, this.f30850b, arrayList);
        f(this.f30849a, handler, this.f30850b, arrayList);
        return (s[]) arrayList.toArray(new s[0]);
    }

    public void b(Context context, int i, d dVar, boolean z, AudioSink audioSink, Handler handler, a aVar, ArrayList<s> arrayList) {
        String str;
        int i2;
        int i3;
        f fVar = new f(context, dVar, z, handler, aVar, audioSink);
        fVar.h0(this.f);
        fVar.i0(this.g);
        fVar.j0(this.h);
        arrayList.add(fVar);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (s) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                    str = "DefaultRenderersFactory";
                    try {
                        toe.f(str, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i2;
                        i2 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                    str = "DefaultRenderersFactory";
                }
            } catch (ClassNotFoundException unused3) {
                str = "DefaultRenderersFactory";
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (s) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                        toe.f(str, "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused4) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    arrayList.add(i3, (s) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, a.class, AudioSink.class).newInstance(handler, aVar, audioSink));
                    toe.f(str, "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused6) {
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e);
                }
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FLAC extension", e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating Opus extension", e3);
        }
    }

    public AudioSink c(Context context, boolean z, boolean z2, boolean z3) {
        return new DefaultAudioSink(om1.b(context), new DefaultAudioSink.d(new AudioProcessor[0]), z, z2, z3 ? 1 : 0);
    }

    public void d(Context context, int i, ArrayList<s> arrayList) {
        arrayList.add(new nh3());
    }

    public void e(Context context, stf stfVar, Looper looper, int i, ArrayList<s> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.metadata.a(stfVar, looper));
    }

    public void f(Context context, Handler handler, int i, ArrayList<s> arrayList) {
    }

    public void g(Context context, j8p j8pVar, Looper looper, int i, ArrayList<s> arrayList) {
        arrayList.add(new l8p(j8pVar, looper));
    }

    public void h(Context context, int i, d dVar, boolean z, Handler handler, vrq vrqVar, long j, ArrayList<s> arrayList) {
        int i2;
        fjf fjfVar = new fjf(context, dVar, j, z, handler, vrqVar, 50);
        fjfVar.h0(this.f);
        fjfVar.i0(this.g);
        fjfVar.j0(this.h);
        arrayList.add(fjfVar);
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (s) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, vrq.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, vrqVar, 50));
                    toe.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i2, (s) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, vrq.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, vrqVar, 50));
            toe.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating AV1 extension", e2);
        }
    }
}
