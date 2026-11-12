package n63;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bµ\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ln63/g;", "", "", "encodeDefaults", "ignoreUnknownKeys", "isLenient", "allowStructuredMapKeys", "prettyPrint", "explicitNulls", "", "prettyPrintIndent", "coerceInputValues", "useArrayPolymorphism", "classDiscriminator", "allowSpecialFloatingPointValues", "useAlternativeNames", "Ln63/t;", "namingStrategy", "decodeEnumsCaseInsensitive", "allowTrailingComma", "allowComments", "Ln63/a;", "classDiscriminatorMode", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLn63/t;ZZZLn63/a;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f123922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f123923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f123924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f123925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f123926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f123927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f123928j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f123929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f123930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f123931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f123932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f123933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f123934p;

    public /* synthetic */ g(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str, boolean z24, boolean z25, String str2, boolean z26, boolean z27, t tVar, boolean z28, boolean z29, boolean z34, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? true : z19, (i14 & 64) != 0 ? "    " : str, (i14 & 128) != 0 ? false : z24, (i14 & 256) != 0 ? false : z25, (i14 & 512) != 0 ? NotificationConstants.KEY_DATA_MIME_TYPE : str2, (i14 & 1024) != 0 ? false : z26, (i14 & 2048) == 0 ? z27 : true, (i14 & 4096) != 0 ? null : tVar, (i14 & 8192) != 0 ? false : z28, (i14 & 16384) != 0 ? false : z29, (i14 & 32768) != 0 ? false : z34, (i14 & 65536) != 0 ? a.POLYMORPHIC : aVar);
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f123919a + ", ignoreUnknownKeys=" + this.f123920b + ", isLenient=" + this.f123921c + ", allowStructuredMapKeys=" + this.f123922d + ", prettyPrint=" + this.f123923e + ", explicitNulls=" + this.f123924f + ", prettyPrintIndent='" + this.f123925g + "', coerceInputValues=" + this.f123926h + ", useArrayPolymorphism=" + this.f123927i + ", classDiscriminator='" + this.f123928j + "', allowSpecialFloatingPointValues=" + this.f123929k + ", useAlternativeNames=" + this.f123930l + ", namingStrategy=null, decodeEnumsCaseInsensitive=" + this.f123931m + ", allowTrailingComma=" + this.f123932n + ", allowComments=" + this.f123933o + ", classDiscriminatorMode=" + this.f123934p + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public g(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str, boolean z24, boolean z25, String str2, boolean z26, boolean z27, t tVar, boolean z28, boolean z29, boolean z34, a aVar) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        this.f123919a = z14;
        this.f123920b = z15;
        this.f123921c = z16;
        this.f123922d = z17;
        this.f123923e = z18;
        this.f123924f = z19;
        this.f123925g = str;
        this.f123926h = z24;
        this.f123927i = z25;
        this.f123928j = str2;
        this.f123929k = z26;
        this.f123930l = z27;
        this.f123931m = z28;
        this.f123932n = z29;
        this.f123933o = z34;
        this.f123934p = aVar;
    }

    public g() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }
}
