package androidx.media3.common.audio;

import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<AudioProcessor> f8127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8128b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f8129c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8130d;

    public a(ImmutableList<AudioProcessor> immutableList) {
        this.f8127a = immutableList;
        AudioProcessor.a aVar = AudioProcessor.a.f8122e;
        this.f8130d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f8128b;
        arrayList.clear();
        this.f8130d = false;
        int i14 = 0;
        while (true) {
            ImmutableList<AudioProcessor> immutableList = this.f8127a;
            if (i14 >= immutableList.size()) {
                break;
            }
            AudioProcessor audioProcessor = immutableList.get(i14);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            }
            i14++;
        }
        this.f8129c = new ByteBuffer[arrayList.size()];
        for (int i15 = 0; i15 <= b(); i15++) {
            this.f8129c[i15] = ((AudioProcessor) arrayList.get(i15)).getOutput();
        }
    }

    public final int b() {
        return this.f8129c.length - 1;
    }

    public final boolean c() {
        return this.f8130d && ((AudioProcessor) this.f8128b.get(b())).isEnded() && !this.f8129c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.f8128b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z14;
        for (boolean z15 = true; z15; z15 = z14) {
            z14 = false;
            for (int i14 = 0; i14 <= b(); i14++) {
                if (!this.f8129c[i14].hasRemaining()) {
                    ArrayList arrayList = this.f8128b;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i14);
                    if (!audioProcessor.isEnded()) {
                        ByteBuffer byteBuffer2 = i14 > 0 ? this.f8129c[i14 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f8121a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.f8129c[i14] = audioProcessor.getOutput();
                        z14 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f8129c[i14].hasRemaining();
                    } else if (!this.f8129c[i14].hasRemaining() && i14 < b()) {
                        ((AudioProcessor) arrayList.get(i14 + 1)).queueEndOfStream();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ImmutableList<AudioProcessor> immutableList = ((a) obj).f8127a;
        ImmutableList<AudioProcessor> immutableList2 = this.f8127a;
        if (immutableList2.size() != immutableList.size()) {
            return false;
        }
        for (int i14 = 0; i14 < immutableList2.size(); i14++) {
            if (immutableList2.get(i14) != immutableList.get(i14)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f8127a.hashCode();
    }
}
