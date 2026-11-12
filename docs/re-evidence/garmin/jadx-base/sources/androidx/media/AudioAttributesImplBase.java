package androidx.media;

import am.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8116d;

    public AudioAttributesImplBase() {
        this.f8113a = 0;
        this.f8114b = 0;
        this.f8115c = 0;
        this.f8116d = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i14 = this.f8116d;
        return i14 != -1 ? i14 : AudioAttributesCompat.b(this.f8115c, this.f8113a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f8114b == audioAttributesImplBase.f8114b) {
            int i14 = this.f8115c;
            int i15 = audioAttributesImplBase.f8115c;
            int iA = audioAttributesImplBase.a();
            if (iA == 6) {
                i15 |= 4;
            } else if (iA == 7) {
                i15 |= 1;
            }
            if (i14 == (i15 & 273) && this.f8113a == audioAttributesImplBase.f8113a && this.f8116d == audioAttributesImplBase.f8116d) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object getAudioAttributes() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8114b), Integer.valueOf(this.f8115c), Integer.valueOf(this.f8113a), Integer.valueOf(this.f8116d)});
    }

    public final String toString() {
        String strH;
        StringBuilder sb3 = new StringBuilder("AudioAttributesCompat:");
        if (this.f8116d != -1) {
            sb3.append(" stream=");
            sb3.append(this.f8116d);
            sb3.append(" derived");
        }
        sb3.append(" usage=");
        int i14 = this.f8113a;
        int i15 = AudioAttributesCompat.f8107b;
        switch (i14) {
            case 0:
                strH = "USAGE_UNKNOWN";
                break;
            case 1:
                strH = "USAGE_MEDIA";
                break;
            case 2:
                strH = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strH = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strH = "USAGE_ALARM";
                break;
            case 5:
                strH = "USAGE_NOTIFICATION";
                break;
            case 6:
                strH = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strH = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strH = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strH = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strH = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strH = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strH = "USAGE_GAME";
                break;
            case 15:
            default:
                strH = j.h(i14, "unknown usage ");
                break;
            case 16:
                strH = "USAGE_ASSISTANT";
                break;
        }
        sb3.append(strH);
        sb3.append(" content=");
        sb3.append(this.f8114b);
        sb3.append(" flags=0x");
        sb3.append(Integer.toHexString(this.f8115c).toUpperCase());
        return sb3.toString();
    }

    public AudioAttributesImplBase(int i14, int i15, int i16, int i17) {
        this.f8114b = i14;
        this.f8115c = i15;
        this.f8113a = i16;
        this.f8116d = i17;
    }
}
