package tt;

import android.graphics.Color;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B=\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltt/m;", "", "", "", "lightBgGradientColor", "darkBgGradientColor", "primaryColor", "secondaryColor", "shareHighlightColor", "<init>", "(Ljava/lang/String;I[Ljava/lang/Integer;[Ljava/lang/Integer;III)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum m {
    STEPS_PUSHES(new Integer[]{Integer.valueOf(Color.parseColor("#1976D2")), Integer.valueOf(Color.parseColor("#002F5D"))}, new Integer[]{Integer.valueOf(Color.parseColor("#042A4F")), Integer.valueOf(Color.parseColor("#0A1D2F")), Integer.valueOf(Color.parseColor("#111111"))}, Color.parseColor("#1976D2"), Color.parseColor("#54A9FE"), Color.parseColor("#0A59B2")),
    SLEEP_SCORE(new Integer[]{Integer.valueOf(Color.parseColor("#815AF7")), Integer.valueOf(Color.parseColor("#0F0454"))}, new Integer[]{Integer.valueOf(Color.parseColor("#100748")), Integer.valueOf(Color.parseColor("#100C2D")), Integer.valueOf(Color.parseColor("#111111"))}, Color.parseColor("#815AF7"), Color.parseColor("#AA8DFC"), Color.parseColor("#4F28C0")),
    ACTIVITY_SUMMARY(new Integer[]{Integer.valueOf(Color.parseColor("#EE3E3E")), Integer.valueOf(Color.parseColor("#611313"))}, new Integer[]{Integer.valueOf(Color.parseColor("#521313")), Integer.valueOf(Color.parseColor("#331212")), Integer.valueOf(Color.parseColor("#111111"))}, Color.parseColor("#EE3E3E"), Color.parseColor("#FF6F6F"), Color.parseColor("#C21515")),
    ACTIVITY_TIME(new Integer[]{Integer.valueOf(Color.parseColor("#D42FC2")), Integer.valueOf(Color.parseColor("#66175D"))}, new Integer[]{Integer.valueOf(Color.parseColor("#56164F")), Integer.valueOf(Color.parseColor("#351431")), Integer.valueOf(Color.parseColor("#111111"))}, Color.parseColor("#D42FC2"), Color.parseColor("#ED79D5"), Color.parseColor("#AC06BC")),
    ACTIVITY_DISTANCE(new Integer[]{Integer.valueOf(Color.parseColor("#EA670E")), Integer.valueOf(Color.parseColor("#753407"))}, new Integer[]{Integer.valueOf(Color.parseColor("#622E09")), Integer.valueOf(Color.parseColor("#3B200D")), Integer.valueOf(Color.parseColor("#111111"))}, Color.parseColor("#EA670E"), Color.parseColor("#FD9D39"), Color.parseColor("#CF4A06")),
    ACTIVITY_ASCENT(new Integer[]{Integer.valueOf(Color.parseColor("#097D34")), Integer.valueOf(Color.parseColor("#033014"))}, new Integer[]{Integer.valueOf(Color.parseColor("#062A14")), Integer.valueOf(Color.parseColor("#0B1E12")), Integer.valueOf(Color.parseColor("#111111"))}, Color.parseColor("#097D34"), Color.parseColor("#60D275"), Color.parseColor("#007838")),
    ACHIEVEMENTS(new Integer[]{Integer.valueOf(Color.parseColor("#19BCD2")), Integer.valueOf(Color.parseColor("#004048"))}, new Integer[]{Integer.valueOf(Color.parseColor("#04373E")), Integer.valueOf(Color.parseColor("#0A2529")), Integer.valueOf(Color.parseColor("#111111"))}, Color.parseColor("#19BCD2"), Color.parseColor("#19BCD2"), Color.parseColor("#0A59B2"));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer[] f166326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer[] f166327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f166328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f166329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f166330e;

    m(Integer[] numArr, Integer[] numArr2, int i14, int i15, int i16) {
        this.f166326a = numArr;
        this.f166327b = numArr2;
        this.f166328c = i14;
        this.f166329d = i15;
        this.f166330e = i16;
    }
}
