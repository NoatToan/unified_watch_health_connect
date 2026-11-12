package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2607a = (AudioAttributes) versionedParcel.r(audioAttributesImplApi21.f2607a, 1);
        audioAttributesImplApi21.f2608b = versionedParcel.p(audioAttributesImplApi21.f2608b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.H(audioAttributesImplApi21.f2607a, 1);
        versionedParcel.F(audioAttributesImplApi21.f2608b, 2);
    }
}
