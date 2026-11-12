package x21;

import android.media.AudioRecord;
import android.os.ParcelFileDescriptor;
import com.google.android.exoplayer2.audio.AacUtil;
import e23.l;
import java.io.OutputStream;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lx21/a;", "", "Lkotlin/Function1;", "", "", "onAmplitude", "<init>", "(Le23/l;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<Float, Unit> f188481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioRecord f188483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread f188484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f188485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f188486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OutputStream f188487g;

    static {
        new C3507a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(l<? super Float, Unit> lVar) {
        lVar.getClass();
        this.f188481a = lVar;
        int minBufferSize = AudioRecord.getMinBufferSize(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 16, 2);
        this.f188482b = minBufferSize < 4096 ? 4096 : minBufferSize;
        this.f188486f = new Object();
    }

    public final void a(ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream) {
        OutputStream outputStream;
        synchronized (this.f188486f) {
            outputStream = this.f188487g;
            this.f188487g = autoCloseOutputStream;
            Unit unit = Unit.INSTANCE;
        }
        if (outputStream == null || outputStream == autoCloseOutputStream) {
            return;
        }
        try {
            int i14 = q.f128596b;
            outputStream.close();
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            new q.b(th3);
        }
    }

    public final void b() {
        Object bVar;
        Object bVar2;
        this.f188485e = false;
        Thread thread = this.f188484d;
        if (thread != null) {
            try {
                int i14 = q.f128596b;
                thread.join(500L);
                bVar = Unit.INSTANCE;
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            q.a(bVar);
        }
        this.f188484d = null;
        AudioRecord audioRecord = this.f188483c;
        if (audioRecord != null) {
            try {
                int i16 = q.f128596b;
                if (audioRecord.getRecordingState() == 3) {
                    audioRecord.stop();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th4) {
                int i17 = q.f128596b;
                new q.b(th4);
            }
            try {
                audioRecord.release();
                bVar2 = Unit.INSTANCE;
            } catch (Throwable th5) {
                int i18 = q.f128596b;
                bVar2 = new q.b(th5);
            }
            q.a(bVar2);
        }
        this.f188483c = null;
        a(null);
        this.f188481a.invoke(Float.valueOf(0.0f));
    }

    /* JADX INFO: renamed from: x21.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lx21/a$a;", "", "<init>", "()V", "", "SAMPLE_RATE_HZ", "I", "CHANNEL_COUNT", "CHANNEL_CONFIG", "AUDIO_ENCODING", "DEFAULT_BUFFER_BYTES", "", "THREAD_JOIN_MILLIS", "J", "", "AMPLITUDE_FULL_SCALE", "D", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3507a {
        public /* synthetic */ C3507a(j jVar) {
            this();
        }

        private C3507a() {
        }
    }
}
