package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f8110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8111b;

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i14) {
        this.f8110a = audioAttributes;
        this.f8111b = i14;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i14 = this.f8111b;
        return i14 != -1 ? i14 : AudioAttributesCompat.b(this.f8110a.getFlags(), this.f8110a.getUsage());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f8110a.equals(((AudioAttributesImplApi21) obj).f8110a);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object getAudioAttributes() {
        return this.f8110a;
    }

    public final int hashCode() {
        return this.f8110a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f8110a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21() {
        this.f8111b = -1;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f8112a;

        public a(Object obj) {
            this.f8112a = new AudioAttributes.Builder((AudioAttributes) obj);
        }

        public a() {
            this.f8112a = new AudioAttributes.Builder();
        }
    }
}
