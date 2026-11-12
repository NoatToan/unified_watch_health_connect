package i42;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Li42/d;", "", "", TtmlNode.ATTR_ID, "Lcom/garmin/android/apps/connectmobile/webtranslation/c;", "locale", "", "versionName", HeaderParameterNames.AUTHENTICATION_TAG, "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/j;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f90990d;

    public /* synthetic */ d(long j8, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, str, str2, str3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f90987a != dVar.f90987a) {
            return false;
        }
        String str = dVar.f90988b;
        com.garmin.android.apps.connectmobile.webtranslation.c.a aVar = com.garmin.android.apps.connectmobile.webtranslation.c.f47979b;
        return s.g(this.f90988b, str) && s.g(this.f90989c, dVar.f90989c) && s.g(this.f90990d, dVar.f90990d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f90987a) * 31;
        com.garmin.android.apps.connectmobile.webtranslation.c.a aVar = com.garmin.android.apps.connectmobile.webtranslation.c.f47979b;
        return this.f90990d.hashCode() + wr.g.j(wr.g.j(iHashCode, 31, this.f90988b), 31, this.f90989c);
    }

    public final String toString() {
        com.garmin.android.apps.connectmobile.webtranslation.c.a aVar = com.garmin.android.apps.connectmobile.webtranslation.c.f47979b;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f90987a, "InstallationRecord(id=", ", locale=", am.j.m("WebTranslationLocale(apiValue=", this.f90988b, ")"));
        sn.a.t(sbK, ", versionName=", this.f90989c, ", tag=", this.f90990d);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ d(long j8, String str, String str2, String str3, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, str2, str3);
    }

    private d(long j8, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f90987a = j8;
        this.f90988b = str;
        this.f90989c = str2;
        this.f90990d = str3;
    }
}
