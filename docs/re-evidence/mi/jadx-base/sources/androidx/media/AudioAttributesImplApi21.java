package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributes f2607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f2608b;

    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f2609a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(int i) {
            this.f2609a.setLegacyStreamType(i);
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi21() {
        this.f2608b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i = this.f2608b;
        return i != -1 ? i : AudioAttributesCompat.b(false, b(), c());
    }

    public int b() {
        return this.f2607a.getFlags();
    }

    public int c() {
        return this.f2607a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2607a.equals(((AudioAttributesImplApi21) obj).f2607a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2607a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2607a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f2607a = audioAttributes;
        this.f2608b = i;
    }
}
