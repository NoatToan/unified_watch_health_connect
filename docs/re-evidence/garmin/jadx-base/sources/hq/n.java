package hq;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhq/n;", "Lhq/m;", "", "exerciseLabel", "timeLabel", "repsLabel", "weightLabel", "volumeLabel", "", FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<m> f85086f;

    public n(String str, String str2, String str3, String str4, String str5, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? "" : str4, (i14 & 16) != 0 ? "" : str5, (i14 & 32) != 0 ? j53.l.b() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(String str, String str2, String str3, String str4, String str5, List<? extends m> list) {
        super(str, str2, str3, str4, str5);
        hb.a.p(str, str2, str3, str4, str5);
        list.getClass();
        this.f85086f = list;
    }

    public n() {
        this(null, null, null, null, null, null, 63, null);
    }
}
