package y21;

import androidx.lifecycle.u1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Locale;
import m01.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly21/c;", "Landroidx/lifecycle/u1;", "", TtmlNode.TAG_REGION, "language", "Lm01/g;", "nutritionRepository", "Le01/a;", "nutritionPreferences", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lm01/g;Le01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f194234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e01.a f194235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f194237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f194238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f194239f;

    public c(String str, String str2, g gVar, e01.a aVar) {
        gVar.getClass();
        aVar.getClass();
        this.f194234a = gVar;
        this.f194235b = aVar;
        if (str == null) {
            str = Locale.US.getCountry();
            str.getClass();
        }
        this.f194236c = str;
        if (str2 == null) {
            str2 = Locale.ENGLISH.getLanguage();
            str2.getClass();
        }
        this.f194237d = str2;
        p2 p2VarA = q2.a(new a(false, null, false, false, false, null, aVar.w(), 63, null));
        this.f194238e = p2VarA;
        this.f194239f = s.d(p2VarA);
    }

    public /* synthetic */ c(String str, String str2, g gVar, e01.a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, gVar, aVar);
    }
}
