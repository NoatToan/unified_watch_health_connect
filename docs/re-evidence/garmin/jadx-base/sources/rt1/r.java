package rt1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB7\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lrt1/r;", "", "", TtmlNode.ATTR_ID, "distanceInMeters", "bannerResId", "thumbnailResId", "shortTitleResId", "<init>", "(Ljava/lang/String;IIIIII)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum r {
    FIVE_K(1, 5000, R.drawable.art_coach_5k, R.drawable.art_coach_5k_listpage, R.string.personal_records_label_5k_run),
    TEN_K(2, 10000, R.drawable.art_coach_10k, R.drawable.art_coach_10k_listpage, R.string.personal_records_label_10k_run),
    HALF_MARATHON(3, 21098, R.drawable.art_coach_half_marathon, R.drawable.art_coach_half_marathon_listpage, R.string.atp_lbl_half_marathon);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f154555d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f154561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154562c;

    r(int i14, int i15, int i16, int i17, int i18) {
        this.f154560a = i14;
        this.f154561b = i15;
        this.f154562c = i18;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrt1/r$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(Integer num) {
            int i14 = r.FIVE_K.f154560a;
            if (num != null && num.intValue() == i14) {
                return "5K";
            }
            int i15 = r.TEN_K.f154560a;
            if (num != null && num.intValue() == i15) {
                return "10K";
            }
            return (num != null && num.intValue() == r.HALF_MARATHON.f154560a) ? "Half Marathon" : "Unknown";
        }

        public static r b(int i14) {
            for (r rVar : r.values()) {
                if (rVar.f154560a == i14) {
                    return rVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
