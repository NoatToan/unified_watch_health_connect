package androidx.media;

import android.util.SparseIntArray;
import de.c;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8107b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f8108a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f8108a = audioAttributesImpl;
    }

    public static int b(int i14, int i15) {
        if ((i14 & 1) == 1) {
            return 7;
        }
        if ((i14 & 4) == 4) {
            return 6;
        }
        switch (i15) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f8108a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f8108a;
        if (audioAttributesImpl == null) {
            return audioAttributesImpl2 == null;
        }
        return audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.f8108a.hashCode();
    }

    public final String toString() {
        return this.f8108a.toString();
    }

    public AudioAttributesCompat() {
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributesImplApi26.a f8109a;

        public a(AudioAttributesCompat audioAttributesCompat) {
            int i14 = AudioAttributesCompat.f8107b;
            this.f8109a = new AudioAttributesImplApi26.a(audioAttributesCompat.f8108a.getAudioAttributes());
        }

        public a() {
            int i14 = AudioAttributesCompat.f8107b;
            this.f8109a = new AudioAttributesImplApi26.a();
        }
    }
}
