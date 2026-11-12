package defpackage;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f32319b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f32320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f32321b;
        public final long c;
        public final long d;

        public a(String str, String str2, long j, long j2) {
            this.f32320a = str;
            this.f32321b = str2;
            this.c = j;
            this.d = j2;
        }
    }

    public r8g(long j, List<a> list) {
        this.f32318a = j;
        this.f32319b = list;
    }

    public MotionPhotoMetadata a(long j) {
        long j2;
        if (this.f32319b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f32319b.size() - 1; size >= 0; size--) {
            a aVar = this.f32319b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f32320a) | z;
            if (size == 0) {
                j3 -= aVar.d;
                j2 = 0;
            } else {
                j2 = j3 - aVar.c;
            }
            long j8 = j3;
            j3 = j2;
            if (!zEquals || j3 == j8) {
                z = zEquals;
            } else {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.f32318a, j6, j7);
    }
}
