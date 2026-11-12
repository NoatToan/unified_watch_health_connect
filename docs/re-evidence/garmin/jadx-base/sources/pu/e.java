package pu;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lpu/e;", "", "", UserMetadata.KEYDATA_FILENAME, "<init>", "(Z)V", "a", "Z", "()Z", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(UserMetadata.KEYDATA_FILENAME)
    private final boolean keys;

    public e(boolean z14) {
        this.keys = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getKeys() {
        return this.keys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.keys == ((e) obj).keys;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.keys);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("GCMAuthRemoteConfigData(keys=", ")", this.keys);
    }
}
