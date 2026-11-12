package pu0;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpu0/e;", "", "", "Lpu0/b;", "phoneContacts", "garminContacts", "", "isMessengerSelfAvailable", "isMessengerSmsStatusForSelfSupported", "<init>", "(Ljava/util/List;Ljava/util/List;ZZ)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f141216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f141217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f141218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f141219d;

    public e(List<b> list, List<b> list2, boolean z14, boolean z15) {
        list.getClass();
        list2.getClass();
        this.f141216a = list;
        this.f141217b = list2;
        this.f141218c = z14;
        this.f141219d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f141216a.equals(eVar.f141216a) && this.f141217b.equals(eVar.f141217b) && this.f141218c == eVar.f141218c && this.f141219d == eVar.f141219d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141219d) + q6.f.g(u0.b(this.f141216a.hashCode() * 31, 31, this.f141217b), 31, this.f141218c);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.f(", isMessengerSmsStatusForSelfSupported=", ")", f3.k("Contacts(phoneContacts=", ", garminContacts=", ", isMessengerSelfAvailable=", this.f141216a, this.f141217b), this.f141218c, this.f141219d);
    }
}
