package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2610a = versionedParcel.p(audioAttributesImplBase.f2610a, 1);
        audioAttributesImplBase.f2611b = versionedParcel.p(audioAttributesImplBase.f2611b, 2);
        audioAttributesImplBase.c = versionedParcel.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = versionedParcel.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f2610a, 1);
        versionedParcel.F(audioAttributesImplBase.f2611b, 2);
        versionedParcel.F(audioAttributesImplBase.c, 3);
        versionedParcel.F(audioAttributesImplBase.d, 4);
    }
}
