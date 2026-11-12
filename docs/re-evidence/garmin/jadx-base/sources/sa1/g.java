package sa1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lsa1/g;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "", "minSpeed", "maxSpeed", "<init>", "(Ljava/lang/String;ILjava/lang/String;IDD)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g {
    UNTRAINED("UNTRAINED", R.string.lbl_untrained, 0.0d, 6.25856d),
    /* JADX INFO: Fake field, exist only in values array */
    FAIR("FAIR", R.string.lbl_fair, 6.25856d, 8.04672d),
    /* JADX INFO: Fake field, exist only in values array */
    GOOD("GOOD", R.string.lbl_good, 8.04672d, 9.38784d),
    /* JADX INFO: Fake field, exist only in values array */
    EXCELLENT("EXCELLENT", R.string.lbl_excellent, 9.83488d, 10.2819d),
    SUPERIOR("SUPERIOR", R.string.lbl_superior, 10.2819d, Double.MAX_VALUE),
    CUSTOM("CUSTOM", R.string.option_custom_ftp, 0.0d, 0.0d);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f158271e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f158277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f158278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f158279d;

    g(String str, int i14, double d14, double d15) {
        this.f158276a = str;
        this.f158277b = i14;
        this.f158278c = d14;
        this.f158279d = d15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsa1/g$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
