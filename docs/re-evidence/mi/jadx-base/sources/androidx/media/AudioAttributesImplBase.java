package androidx.media;

import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f2610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f2611b;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int c;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int d;

    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2612a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2613b = 0;
        public int c = 0;
        public int d = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final a b(int i) {
            switch (i) {
                case 0:
                    this.f2613b = 1;
                    break;
                case 1:
                    this.f2613b = 4;
                    break;
                case 2:
                    this.f2613b = 4;
                    break;
                case 3:
                    this.f2613b = 2;
                    break;
                case 4:
                    this.f2613b = 4;
                    break;
                case 5:
                    this.f2613b = 4;
                    break;
                case 6:
                    this.f2613b = 1;
                    this.c |= 4;
                    break;
                case 7:
                    this.c = 1 | this.c;
                    this.f2613b = 4;
                    break;
                case 8:
                    this.f2613b = 4;
                    break;
                case 9:
                    this.f2613b = 4;
                    break;
                case 10:
                    this.f2613b = 1;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid stream type ");
                    sb.append(i);
                    sb.append(" for AudioAttributesCompat");
                    break;
            }
            this.f2612a = AudioAttributesImplBase.e(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f2613b, this.c, this.f2612a, this.d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(int i) {
            if (i == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.d = i;
            return b(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplBase() {
        this.f2610a = 0;
        this.f2611b = 0;
        this.c = 0;
        this.d = -1;
    }

    public static int e(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i = this.d;
        return i != -1 ? i : AudioAttributesCompat.b(false, this.c, this.f2610a);
    }

    public int b() {
        return this.f2611b;
    }

    public int c() {
        int i = this.c;
        int iA = a();
        if (iA == 6) {
            i |= 4;
        } else if (iA == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int d() {
        return this.f2610a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f2611b == audioAttributesImplBase.b() && this.c == audioAttributesImplBase.c() && this.f2610a == audioAttributesImplBase.d() && this.d == audioAttributesImplBase.d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2611b), Integer.valueOf(this.c), Integer.valueOf(this.f2610a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.c(this.f2610a));
        sb.append(" content=");
        sb.append(this.f2611b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f2611b = i;
        this.c = i2;
        this.f2610a = i3;
        this.d = i4;
    }
}
