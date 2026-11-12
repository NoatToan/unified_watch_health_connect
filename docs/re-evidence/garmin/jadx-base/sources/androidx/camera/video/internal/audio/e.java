package androidx.camera.video.internal.audio;

import am.j;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AudioStream.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5969b;

    public e(int i14, long j8) {
        this.f5968a = i14;
        this.f5969b = j8;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.b
    public final int a() {
        return this.f5968a;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.b
    public final long b() {
        return this.f5969b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStream.b)) {
            return false;
        }
        AudioStream.b bVar = (AudioStream.b) obj;
        return this.f5968a == bVar.a() && this.f5969b == bVar.b();
    }

    public final int hashCode() {
        int i14 = (this.f5968a ^ 1000003) * 1000003;
        long j8 = this.f5969b;
        return i14 ^ ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PacketInfo{sizeInBytes=");
        sb3.append(this.f5968a);
        sb3.append(", timestampNs=");
        return j.i(this.f5969b, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
