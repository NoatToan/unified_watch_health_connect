package androidx.core.view;

import android.view.DisplayShape;
import ch.qos.logback.core.CoreConstants;
import com.google.maps.android.BuildConfig;
import i3.e5;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6458a;

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayShape f6459a;

        public a(DisplayShape displayShape) {
            this.f6459a = displayShape;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return Objects.equals(this.f6459a, ((a) obj).f6459a);
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.f6459a);
        }

        public final String toString() {
            return "DisplayShapeCompat{mPlatformDisplayShape=" + this.f6459a + CoreConstants.CURLY_RIGHT;
        }
    }

    public interface b {
    }

    public static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f6461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f6463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f6466g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f6467h;

        public c(String str, int i14, int i15, float f14, int i16, int i17, int i18, float f15) {
            this.f6460a = str;
            this.f6462c = i14;
            this.f6463d = i15;
            this.f6461b = f14;
            this.f6464e = i16;
            this.f6465f = i17;
            this.f6466g = i18;
            this.f6467h = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f6460a, cVar.f6460a) && this.f6462c == cVar.f6462c && this.f6463d == cVar.f6463d && this.f6461b == cVar.f6461b && this.f6464e == cVar.f6464e && this.f6465f == cVar.f6465f && this.f6466g == cVar.f6466g && this.f6467h == cVar.f6467h;
        }

        public final int hashCode() {
            return Objects.hash(this.f6460a, Integer.valueOf(this.f6462c), Integer.valueOf(this.f6463d), Float.valueOf(this.f6461b), Integer.valueOf(this.f6464e), Integer.valueOf(this.f6465f), Integer.valueOf(this.f6466g), Float.valueOf(this.f6467h));
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("DisplayShapeCompat{ spec=");
            String str = this.f6460a;
            sb3.append(str != null ? Integer.valueOf(str.hashCode()) : BuildConfig.TRAVIS);
            sb3.append(" displayWidth=");
            sb3.append(this.f6462c);
            sb3.append(" displayHeight=");
            sb3.append(this.f6463d);
            sb3.append(" physicalPixelDisplaySizeRatio=");
            sb3.append(this.f6461b);
            sb3.append(" rotation=");
            sb3.append(this.f6464e);
            sb3.append(" offsetX=");
            sb3.append(this.f6465f);
            sb3.append(" offsetY=");
            sb3.append(this.f6466g);
            sb3.append(" scale=");
            return v.e0.e(this.f6467h, StringSubstitutor.DEFAULT_VAR_END, sb3);
        }
    }

    static {
        new k("", 0, 0, 1.0f, 0, 0, 0, 1.0f);
    }

    private k(String str, int i14, int i15, float f14, int i16, int i17, int i18, float f15) {
        this.f6458a = new c(str, i14, i15, f14, i16, i17, i18, f15);
    }

    public static k a(int i14, int i15, boolean z14, int i16, int i17, int i18, int i19) {
        String string;
        if (z14) {
            int i24 = i14 / 2;
            int i25 = i15 / 2;
            StringBuilder sbJ = e5.j(i25, i24, "M0,", " A", ",");
            ds.e0.m(i25, i14, " 0 1,1 ", ",", sbJ);
            ds.e0.m(i25, i24, " A", ",", sbJ);
            string = j.e(i25, i25, " 0 1,1 0,", " Z", sbJ);
        } else {
            StringBuilder sb3 = new StringBuilder("M ");
            int iMin = Math.min(i14 / 2, i15 / 2);
            int iMin2 = Math.min(iMin, i16);
            int iMin3 = Math.min(iMin, i17);
            int iMin4 = Math.min(iMin, i18);
            int iMin5 = Math.min(iMin, i19);
            sb3.append(iMin2);
            sb3.append(",0 L ");
            sb3.append(i14 - iMin3);
            sb3.append(",0");
            if (iMin3 > 0) {
                j.m(iMin3, iMin3, " A ", ",", sb3);
                j.m(i14, iMin3, " 0 0,1 ", ",", sb3);
            }
            sb3.append(" L ");
            sb3.append(i14);
            sb3.append(",");
            sb3.append(i15 - iMin4);
            if (iMin4 > 0) {
                j.m(iMin4, iMin4, " A ", ",", sb3);
                sb3.append(" 0 0,1 ");
                sb3.append(i14 - iMin4);
                sb3.append(",");
                sb3.append(i15);
            }
            j.m(iMin5, i15, " L ", ",", sb3);
            if (iMin5 > 0) {
                j.m(iMin5, iMin5, " A ", ",", sb3);
                sb3.append(" 0 0,1 0,");
                sb3.append(i15 - iMin5);
            }
            if (iMin2 > 0) {
                j.m(iMin2, iMin2, " L 0,", " A ", sb3);
                j.m(iMin2, iMin2, ",", " 0 0,1 ", sb3);
                sb3.append(",0");
            }
            sb3.append(" Z");
            string = sb3.toString();
        }
        return new k(string, i14, i15, 1.0f, 0, 0, 0, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return Objects.equals(this.f6458a, ((k) obj).f6458a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f6458a);
    }

    public final String toString() {
        return this.f6458a.toString();
    }

    private k(DisplayShape displayShape) {
        this.f6458a = new a(displayShape);
    }
}
