package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import de.c;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVarM = audioAttributesCompat.f8108a;
        if (versionedParcel.h(1)) {
            cVarM = versionedParcel.m();
        }
        audioAttributesCompat.f8108a = (AudioAttributesImpl) cVarM;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f8108a;
        versionedParcel.n(1);
        versionedParcel.v(audioAttributesImpl);
    }
}
