package hq;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhq/m;", "", "", "exerciseLabel", "timeLabel", "repsLabel", "weightLabel", "volumeLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f85070e;

    public /* synthetic */ m(String str, String str2, String str3, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? "" : str4, (i14 & 16) != 0 ? "" : str5);
    }

    public m(String str, String str2, String str3, String str4, String str5) {
        hb.a.p(str, str2, str3, str4, str5);
        this.f85066a = str;
        this.f85067b = str2;
        this.f85068c = str3;
        this.f85069d = str4;
        this.f85070e = str5;
    }

    public m() {
        this(null, null, null, null, null, 31, null);
    }
}
