package zh2;

import android.graphics.Typeface;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.h;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzh2/f;", "", "", "loadingViewResourceId", "backButtonResourceId", "cancelButtonResourceId", "confirmButtonResourceId", "", "confirmButtonTitle", "", "isShowSaveSuccessToastEnabled", "isShowSaveConfirmBeforeDiscardEnabled", "Landroid/graphics/Typeface;", "regularTypeface", "semiBoldTypeface", "requestedOrientation", "Lli2/d;", "networkConfiguration", "Lli2/a;", "deviceSettingsConfiguration", "<init>", "(ILjava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;ZZLandroid/graphics/Typeface;Landroid/graphics/Typeface;ILli2/d;Lli2/a;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f204814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f204815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f204816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f204817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f204818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f204819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f204820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Typeface f204821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Typeface f204822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f204823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final li2.d f204824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final li2.a f204825l;

    public /* synthetic */ f(int i14, Integer num, int i15, Integer num2, String str, boolean z14, boolean z15, Typeface typeface, Typeface typeface2, int i16, li2.d dVar, li2.a aVar, int i17, j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? null : num, (i17 & 4) != 0 ? R.drawable.dsl_ic_cancel : i15, (i17 & 8) != 0 ? Integer.valueOf(R.drawable.dsl_ic_check_white) : num2, (i17 & 16) != 0 ? "" : str, (i17 & 32) != 0 ? true : z14, (i17 & 64) != 0 ? true : z15, (i17 & 128) != 0 ? null : typeface, (i17 & 256) != 0 ? null : typeface2, (i17 & 512) == 0 ? i16 : 1, (i17 & 1024) != 0 ? null : dVar, (i17 & 2048) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f204814a == fVar.f204814a && s.g(this.f204815b, fVar.f204815b) && this.f204816c == fVar.f204816c && s.g(this.f204817d, fVar.f204817d) && s.g(this.f204818e, fVar.f204818e) && this.f204819f == fVar.f204819f && this.f204820g == fVar.f204820g && s.g(this.f204821h, fVar.f204821h) && s.g(this.f204822i, fVar.f204822i) && this.f204823j == fVar.f204823j && s.g(this.f204824k, fVar.f204824k) && s.g(this.f204825l, fVar.f204825l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f204814a) * 31;
        Integer num = this.f204815b;
        int iD = q2.d(this.f204816c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f204817d;
        int iJ = g.j((iD + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f204818e);
        boolean z14 = this.f204819f;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iJ + r14) * 31;
        boolean z15 = this.f204820g;
        int i15 = (i14 + (z15 ? 1 : z15)) * 31;
        Typeface typeface = this.f204821h;
        int iHashCode2 = (i15 + (typeface == null ? 0 : typeface.hashCode())) * 31;
        Typeface typeface2 = this.f204822i;
        int iD2 = q2.d(this.f204823j, (iHashCode2 + (typeface2 == null ? 0 : typeface2.hashCode())) * 31, 31);
        li2.d dVar = this.f204824k;
        int iHashCode3 = (iD2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        li2.a aVar = this.f204825l;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SettingsConfiguration(loadingViewResourceId=");
        sb3.append(this.f204814a);
        sb3.append(", backButtonResourceId=");
        sb3.append(this.f204815b);
        sb3.append(", cancelButtonResourceId=");
        sb3.append(this.f204816c);
        sb3.append(", confirmButtonResourceId=");
        sb3.append(this.f204817d);
        sb3.append(", confirmButtonTitle=");
        h.C(this.f204818e, ", isShowSaveSuccessToastEnabled=", ", isShowSaveConfirmBeforeDiscardEnabled=", sb3, this.f204819f);
        sb3.append(this.f204820g);
        sb3.append(", regularTypeface=");
        sb3.append(this.f204821h);
        sb3.append(", semiBoldTypeface=");
        sb3.append(this.f204822i);
        sb3.append(", requestedOrientation=");
        sb3.append(this.f204823j);
        sb3.append(", networkConfiguration=");
        sb3.append(this.f204824k);
        sb3.append(", deviceSettingsConfiguration=");
        sb3.append(this.f204825l);
        sb3.append(")");
        return sb3.toString();
    }

    public f(int i14, Integer num, int i15, Integer num2, String str, boolean z14, boolean z15, Typeface typeface, Typeface typeface2, int i16, li2.d dVar, li2.a aVar) {
        str.getClass();
        this.f204814a = i14;
        this.f204815b = num;
        this.f204816c = i15;
        this.f204817d = num2;
        this.f204818e = str;
        this.f204819f = z14;
        this.f204820g = z15;
        this.f204821h = typeface;
        this.f204822i = typeface2;
        this.f204823j = i16;
        this.f204824k = dVar;
        this.f204825l = aVar;
    }

    public f() {
        this(0, null, 0, null, null, false, false, null, null, 0, null, null, 4095, null);
    }
}
