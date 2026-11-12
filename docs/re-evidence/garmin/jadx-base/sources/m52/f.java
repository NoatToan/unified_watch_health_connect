package m52;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lm52/f;", "", "", TtmlNode.ATTR_ID, "resId", "", "isSupported", "<init>", "(Ljava/lang/String;IIIZ)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum f {
    FREESTYLE(6, R.string.stroke_type_free, false, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    BREASTSTROKE(3, R.string.activity_details_swim_stroke_breaststroke, false, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    BACKSTROKE(2, R.string.activity_details_swim_stroke_backstroke, false, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTERFLY(5, R.string.stroke_type_fly, false, 4, null),
    CHOICE(1, R.string.activity_details_swim_stroke_choice, false, 4, null),
    /* JADX INFO: Fake field, exist only in values array */
    INDIVIDUAL_MEDLEY(7, R.string.activity_details_swim_stroke_individual_medley, false, 4, null),
    INDIVIDUAL_MEDLEY_BY_ROUND(9, R.string.activity_details_swim_stroke_im_by_round, false, 4, null),
    REVERSE_INDIVIDUAL_MEDLEY_ORDER(10, R.string.activity_details_swim_stroke_reverse_individual_medley_order, false, 4, null),
    DRILL(4, R.string.activity_details_swim_stroke_drill, false),
    /* JADX INFO: Fake field, exist only in values array */
    MIXED(8, R.string.activity_details_swim_stroke_mixed, false, 4, null);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f116704d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116713c;

    /* synthetic */ f(int i14, int i15, boolean z14, int i16, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i16 & 4) != 0 ? true : z14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm52/f$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    f(int i14, int i15, boolean z14) {
        this.f116711a = i14;
        this.f116712b = i15;
        this.f116713c = z14;
    }
}
