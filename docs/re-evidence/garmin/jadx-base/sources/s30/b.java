package s30;

import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u007f\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ls30/b;", "", "", "iconRes", "bidirectionalIconRes", "", "iconHeadingOffsetDegrees", "spacingPx", "minZoom", "maxArrows", "maxArrowsPerRoute", "zIndex", "viewportPaddingRatio", "sharedLineTolerancePx", "", "maxSharedLineToleranceMeters", "oppositeBearingToleranceDegrees", "<init>", "(IIFFFIIFFFDF)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f156402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f156403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f156404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f156405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f156406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f156407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f156408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f156409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f156410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f156411l;

    static {
        new a(null);
    }

    public /* synthetic */ b(int i14, int i15, float f14, float f15, float f16, int i16, int i17, float f17, float f18, float f19, double d14, float f22, int i18, j jVar) {
        this((i18 & 1) != 0 ? R.drawable.chev : i14, (i18 & 2) != 0 ? R.drawable.bi_directional_chev : i15, (i18 & 4) != 0 ? 180.0f : f14, (i18 & 8) != 0 ? 96.0f : f15, (i18 & 16) != 0 ? 0.0f : f16, (i18 & 32) != 0 ? 250 : i16, (i18 & 64) != 0 ? 2000 : i17, (i18 & 128) != 0 ? -1000.0f : f17, (i18 & 256) != 0 ? 0.25f : f18, (i18 & 512) != 0 ? 5.0f : f19, (i18 & 1024) != 0 ? 500.0d : d14, (i18 & 2048) != 0 ? 35.0f : f22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f156400a == bVar.f156400a && this.f156401b == bVar.f156401b && Float.compare(this.f156402c, bVar.f156402c) == 0 && Float.compare(this.f156403d, bVar.f156403d) == 0 && Float.compare(this.f156404e, bVar.f156404e) == 0 && this.f156405f == bVar.f156405f && this.f156406g == bVar.f156406g && Float.compare(this.f156407h, bVar.f156407h) == 0 && Float.compare(this.f156408i, bVar.f156408i) == 0 && Float.compare(this.f156409j, bVar.f156409j) == 0 && Double.compare(this.f156410k, bVar.f156410k) == 0 && Float.compare(this.f156411l, bVar.f156411l) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f156411l) + org.apache.commons.lang3.e.b(q6.f.d(this.f156409j, q6.f.d(this.f156408i, q6.f.d(this.f156407h, q2.d(this.f156406g, q2.d(this.f156405f, q6.f.d(this.f156404e, q6.f.d(this.f156403d, q6.f.d(this.f156402c, q2.d(this.f156401b, Integer.hashCode(this.f156400a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f156410k);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f156400a, this.f156401b, "DirectionArrowConfig(iconRes=", ", bidirectionalIconRes=", ", iconHeadingOffsetDegrees=");
        l2.n(sbJ, this.f156402c, ", spacingPx=", this.f156403d, ", minZoom=");
        sbJ.append(this.f156404e);
        sbJ.append(", maxArrows=");
        sbJ.append(this.f156405f);
        sbJ.append(", maxArrowsPerRoute=");
        sbJ.append(this.f156406g);
        sbJ.append(", zIndex=");
        sbJ.append(this.f156407h);
        sbJ.append(", viewportPaddingRatio=");
        l2.n(sbJ, this.f156408i, ", sharedLineTolerancePx=", this.f156409j, ", maxSharedLineToleranceMeters=");
        sbJ.append(this.f156410k);
        sbJ.append(", oppositeBearingToleranceDegrees=");
        sbJ.append(this.f156411l);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Ls30/b$a;", "", "<init>", "()V", "", "DEFAULT_SPACING_PX", "F", "DEFAULT_MIN_ZOOM", "", "DEFAULT_MAX_VISIBLE_ARROWS", "I", "DEFAULT_ICON_HEADING_OFFSET_DEGREES", "DEFAULT_Z_INDEX", "DEFAULT_VIEWPORT_PADDING_RATIO", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(int i14, int i15, float f14, float f15, float f16, int i16, int i17, float f17, float f18, float f19, double d14, float f22) {
        this.f156400a = i14;
        this.f156401b = i15;
        this.f156402c = f14;
        this.f156403d = f15;
        this.f156404e = f16;
        this.f156405f = i16;
        this.f156406g = i17;
        this.f156407h = f17;
        this.f156408i = f18;
        this.f156409j = f19;
        this.f156410k = d14;
        this.f156411l = f22;
    }

    public b() {
        this(0, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0d, 0.0f, 4095, null);
    }
}
