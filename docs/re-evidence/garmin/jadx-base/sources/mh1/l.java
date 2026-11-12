package mh1;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmh1/l;", "", "", "friendlyName", "currentFirmwareVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118483b;

    public l(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f118482a = str;
        this.f118483b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f118482a.equals(lVar.f118482a) && this.f118483b.equals(lVar.f118483b);
    }

    public final int hashCode() {
        return this.f118483b.hashCode() + (this.f118482a.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("IndexS2FirmwareUpdateFieldData(friendlyName=", this.f118482a, ", currentFirmwareVersion=", this.f118483b, ")");
    }
}
