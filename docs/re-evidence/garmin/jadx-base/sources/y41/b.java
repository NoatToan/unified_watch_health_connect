package y41;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ly41/b;", "", "", "goalPace", "maxPaceLimit", "minPaceLimit", "", "isPaceAndDistanceMetric", "isElevationMetric", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "splits", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "coursePoints", "<init>", "(FFFZZLjava/util/List;Ljava/util/List;)V", "a", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<Integer> f194470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<Integer> f194471i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f194472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f194473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f194474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f194475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f194476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<PaceBandSplitDTO> f194477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<GeoPointDTO> f194478g;

    static {
        new a(null);
        Integer numValueOf = Integer.valueOf(R.color.gcm_pace_pro_avg);
        f194470h = x.k(numValueOf, Integer.valueOf(R.color.gcm_pace_pro_slow_20_39), Integer.valueOf(R.color.gcm_pace_pro_slow_40_59), Integer.valueOf(R.color.gcm_pace_pro_slow_60_79), Integer.valueOf(R.color.gcm_pace_pro_slow_80_100));
        f194471i = x.k(Integer.valueOf(R.color.gcm_pace_pro_fast_80_100), Integer.valueOf(R.color.gcm_pace_pro_fast_60_79), Integer.valueOf(R.color.gcm_pace_pro_fast_40_59), Integer.valueOf(R.color.gcm_pace_pro_fast_20_39), numValueOf);
    }

    public b(float f14, float f15, float f16, boolean z14, boolean z15, List<PaceBandSplitDTO> list, List<GeoPointDTO> list2) {
        list.getClass();
        this.f194472a = f14;
        this.f194473b = f15;
        this.f194474c = f16;
        this.f194475d = z14;
        this.f194476e = z15;
        this.f194477f = list;
        this.f194478g = list2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ly41/b$a;", "", "<init>", "()V", "", "X_AXIS_LABEL_COUNT", "I", "", "SLOW_PACE_COLORS", "Ljava/util/List;", "FAST_PACE_COLORS", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
