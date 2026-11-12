package vd2;

import android.graphics.Bitmap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lvd2/i;", "", "Lvd2/i$a;", "frame", "Lvd2/i$c;", "vote", "<init>", "(Lvd2/i$a;Lvd2/i$c;)V", "a", "c", "b", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f177517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f177518b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvd2/i$a;", "", "Lvd2/i$b;", "status", "", "hourAngle", "minuteAngle", "", "timeSpent", "Landroid/graphics/Bitmap;", "debugImage", "<init>", "(Lvd2/i$b;FFJLandroid/graphics/Bitmap;)V", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f177519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f177520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f177521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f177522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bitmap f177523e;

        public a(b bVar, float f14, float f15, long j8, Bitmap bitmap) {
            bVar.getClass();
            this.f177519a = bVar;
            this.f177520b = f14;
            this.f177521c = f15;
            this.f177522d = j8;
            this.f177523e = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f177519a == aVar.f177519a && Float.compare(this.f177520b, aVar.f177520b) == 0 && Float.compare(this.f177521c, aVar.f177521c) == 0 && this.f177522d == aVar.f177522d && s.g(this.f177523e, aVar.f177523e);
        }

        public final int hashCode() {
            int iE = q6.f.e(q6.f.d(this.f177521c, q6.f.d(this.f177520b, this.f177519a.hashCode() * 31, 31), 31), 31, this.f177522d);
            Bitmap bitmap = this.f177523e;
            return iE + (bitmap == null ? 0 : bitmap.hashCode());
        }

        public final String toString() {
            return "FrameResult(status=" + this.f177519a + ", hourAngle=" + this.f177520b + ", minuteAngle=" + this.f177521c + ", timeSpent=" + this.f177522d + ", debugImage=" + this.f177523e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvd2/i$c;", "", "Lvd2/i$b;", "status", "", "hourAngle", "minuteAngle", "<init>", "(Lvd2/i$b;FF)V", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f177535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f177536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f177537c;

        public c(b bVar, float f14, float f15) {
            bVar.getClass();
            this.f177535a = bVar;
            this.f177536b = f14;
            this.f177537c = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f177535a == cVar.f177535a && Float.compare(this.f177536b, cVar.f177536b) == 0 && Float.compare(this.f177537c, cVar.f177537c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f177537c) + q6.f.d(this.f177536b, this.f177535a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("VotingResult(status=");
            sb3.append(this.f177535a);
            sb3.append(", hourAngle=");
            sb3.append(this.f177536b);
            sb3.append(", minuteAngle=");
            return e0.e(this.f177537c, ")", sb3);
        }
    }

    public i(a aVar, c cVar) {
        aVar.getClass();
        cVar.getClass();
        this.f177517a = aVar;
        this.f177518b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f177517a.equals(iVar.f177517a) && this.f177518b.equals(iVar.f177518b);
    }

    public final int hashCode() {
        return this.f177518b.hashCode() + (this.f177517a.hashCode() * 31);
    }

    public final String toString() {
        return "WatchHandDetectionResult(frame=" + this.f177517a + ", vote=" + this.f177518b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvd2/i$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        Success,
        /* JADX INFO: Fake field, exist only in values array */
        InputImageTooSmall,
        NoFaceCircle,
        /* JADX INFO: Fake field, exist only in values array */
        NoLightBar,
        /* JADX INFO: Fake field, exist only in values array */
        NoHourHand,
        /* JADX INFO: Fake field, exist only in values array */
        NoMinuteHand,
        /* JADX INFO: Fake field, exist only in values array */
        NoHands,
        /* JADX INFO: Fake field, exist only in values array */
        SurfaceReflection,
        HandTooClose,
        HandTooCloseInv,
        HandOverlap,
        HandOverlapInv,
        NumberOverlap,
        NumberOverlapInv,
        Undefined;


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f177524a = new a(null);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvd2/i$b$a;", "", "<init>", "()V", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }
}
