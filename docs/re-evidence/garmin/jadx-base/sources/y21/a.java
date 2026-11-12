package y21;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly21/a;", "", "", "isListening", "", "transcription", "isProcessing", "noResults", "showError", "", "Lb11/a$a;", "foods", "isMicPermissionDenied", "<init>", "(ZLjava/lang/String;ZZZLjava/util/List;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f194224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f194226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f194227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f194228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<b11.a.C0202a> f194229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f194230g;

    public /* synthetic */ a(boolean z14, String str, boolean z15, boolean z16, boolean z17, List list, boolean z18, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17, (i14 & 32) != 0 ? null : list, (i14 & 64) != 0 ? false : z18);
    }

    public static a a(a aVar, boolean z14, String str, boolean z15, boolean z16, boolean z17, ArrayList arrayList, boolean z18, int i14) {
        if ((i14 & 1) != 0) {
            z14 = aVar.f194224a;
        }
        boolean z19 = z14;
        if ((i14 & 2) != 0) {
            str = aVar.f194225b;
        }
        String str2 = str;
        if ((i14 & 4) != 0) {
            z15 = aVar.f194226c;
        }
        boolean z24 = z15;
        if ((i14 & 8) != 0) {
            z16 = aVar.f194227d;
        }
        boolean z25 = z16;
        if ((i14 & 16) != 0) {
            z17 = aVar.f194228e;
        }
        boolean z26 = z17;
        List<b11.a.C0202a> list = arrayList;
        if ((i14 & 32) != 0) {
            list = aVar.f194229f;
        }
        List<b11.a.C0202a> list2 = list;
        if ((i14 & 64) != 0) {
            z18 = aVar.f194230g;
        }
        aVar.getClass();
        str2.getClass();
        return new a(z19, str2, z24, z25, z26, list2, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f194224a == aVar.f194224a && s.g(this.f194225b, aVar.f194225b) && this.f194226c == aVar.f194226c && this.f194227d == aVar.f194227d && this.f194228e == aVar.f194228e && s.g(this.f194229f, aVar.f194229f) && this.f194230g == aVar.f194230g;
    }

    public final int hashCode() {
        int iG = f.g(f.g(f.g(g.j(Boolean.hashCode(this.f194224a) * 31, 31, this.f194225b), 31, this.f194226c), 31, this.f194227d), 31, this.f194228e);
        List<b11.a.C0202a> list = this.f194229f;
        return Boolean.hashCode(this.f194230g) + ((iG + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VoiceDictationUiState(isListening=");
        sb3.append(this.f194224a);
        sb3.append(", transcription=");
        sb3.append(this.f194225b);
        sb3.append(", isProcessing=");
        kg.f.q(", noResults=", ", showError=", sb3, this.f194226c, this.f194227d);
        sb3.append(this.f194228e);
        sb3.append(", foods=");
        sb3.append(this.f194229f);
        sb3.append(", isMicPermissionDenied=");
        return hb.a.k(sb3, this.f194230g, ")");
    }

    public a(boolean z14, String str, boolean z15, boolean z16, boolean z17, List<b11.a.C0202a> list, boolean z18) {
        str.getClass();
        this.f194224a = z14;
        this.f194225b = str;
        this.f194226c = z15;
        this.f194227d = z16;
        this.f194228e = z17;
        this.f194229f = list;
        this.f194230g = z18;
    }

    public a() {
        this(false, null, false, false, false, null, false, 127, null);
    }
}
