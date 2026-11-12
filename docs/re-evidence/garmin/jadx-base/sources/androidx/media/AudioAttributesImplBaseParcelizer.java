package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f8113a = versionedParcel.j(audioAttributesImplBase.f8113a, 1);
        audioAttributesImplBase.f8114b = versionedParcel.j(audioAttributesImplBase.f8114b, 2);
        audioAttributesImplBase.f8115c = versionedParcel.j(audioAttributesImplBase.f8115c, 3);
        audioAttributesImplBase.f8116d = versionedParcel.j(audioAttributesImplBase.f8116d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.s(audioAttributesImplBase.f8113a, 1);
        versionedParcel.s(audioAttributesImplBase.f8114b, 2);
        versionedParcel.s(audioAttributesImplBase.f8115c, 3);
        versionedParcel.s(audioAttributesImplBase.f8116d, 4);
    }
}
