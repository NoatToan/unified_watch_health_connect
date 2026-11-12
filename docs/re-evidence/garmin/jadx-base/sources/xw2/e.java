package xw2;

import android.graphics.Typeface;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxw2/e;", "", "", "loadingViewResourceId", "Landroid/graphics/Typeface;", "regularTypeface", "semiBoldTypeface", "requestedOrientation", "", "errorDialogTitle", "errorDialogMessage", "<init>", "(ILandroid/graphics/Typeface;Landroid/graphics/Typeface;ILjava/lang/String;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Typeface f192459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Typeface f192460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f192461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f192462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f192463f;

    public /* synthetic */ e(int i14, Typeface typeface, Typeface typeface2, int i15, String str, String str2, int i16, j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? null : typeface, (i16 & 4) != 0 ? null : typeface2, (i16 & 8) != 0 ? 1 : i15, (i16 & 16) != 0 ? null : str, (i16 & 32) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f192458a == eVar.f192458a && s.g(this.f192459b, eVar.f192459b) && s.g(this.f192460c, eVar.f192460c) && this.f192461d == eVar.f192461d && s.g(this.f192462e, eVar.f192462e) && s.g(this.f192463f, eVar.f192463f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f192458a) * 31;
        Typeface typeface = this.f192459b;
        int iHashCode2 = (iHashCode + (typeface == null ? 0 : typeface.hashCode())) * 31;
        Typeface typeface2 = this.f192460c;
        int iD = q2.d(this.f192461d, (iHashCode2 + (typeface2 == null ? 0 : typeface2.hashCode())) * 31, 31);
        String str = this.f192462e;
        int iHashCode3 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f192463f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SettingsUIConfiguration(loadingViewResourceId=");
        sb3.append(this.f192458a);
        sb3.append(", regularTypeface=");
        sb3.append(this.f192459b);
        sb3.append(", semiBoldTypeface=");
        sb3.append(this.f192460c);
        sb3.append(", requestedOrientation=");
        sb3.append(this.f192461d);
        sb3.append(", errorDialogTitle=");
        return e5.h(sb3, this.f192462e, ", errorDialogMessage=", this.f192463f, ")");
    }

    public e(int i14, Typeface typeface, Typeface typeface2, int i15, String str, String str2) {
        this.f192458a = i14;
        this.f192459b = typeface;
        this.f192460c = typeface2;
        this.f192461d = i15;
        this.f192462e = str;
        this.f192463f = str2;
    }

    public e() {
        this(0, null, null, 0, null, null, 63, null);
    }
}
