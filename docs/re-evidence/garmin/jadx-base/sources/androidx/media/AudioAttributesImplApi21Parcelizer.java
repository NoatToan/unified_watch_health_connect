package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        Parcelable parcelableK = audioAttributesImplApi21.f8110a;
        if (versionedParcel.h(1)) {
            parcelableK = versionedParcel.k();
        }
        audioAttributesImplApi21.f8110a = (AudioAttributes) parcelableK;
        audioAttributesImplApi21.f8111b = versionedParcel.j(audioAttributesImplApi21.f8111b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f8110a;
        versionedParcel.n(1);
        versionedParcel.t(audioAttributes);
        versionedParcel.s(audioAttributesImplApi21.f8111b, 2);
    }
}
