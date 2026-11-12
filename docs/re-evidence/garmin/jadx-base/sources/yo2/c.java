package yo2;

import android.net.Uri;
import android.text.TextUtils;
import aq2.i;
import i3.e5;
import java.util.HashMap;
import java.util.HashSet;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lyo2/c;", "", "", "width", "height", "", "embossedText", "foregroundColor", "fontScale", "", "textPositionXScale", "textPositionYScale", "fontName", "", "fontBold", "roundedCorners", "<init>", "(IILjava/lang/String;Ljava/lang/String;IFFLjava/lang/String;ZZ)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f198568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f198569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f198570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f198571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f198572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f198573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f198574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f198575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f198576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f198577j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyo2/c$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        WIDTH("w"),
        /* JADX INFO: Fake field, exist only in values array */
        HEIGHT("h"),
        EMBOSSED_TEXT("embossedText"),
        EMBOSSED_TEXT_FOREGROUND("embossedForegroundColor"),
        FONT_SCALE("fs"),
        TEXT_POSITION_X_SCALE("txs"),
        TEXT_POSITION_Y_SCALE("tys"),
        FONT_NAME("fn"),
        FONT_BOLD("fb"),
        /* JADX INFO: Fake field, exist only in values array */
        ROUNDED_CORNERS("rc");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f198586a;

        a(String str) {
            this.f198586a = str;
        }
    }

    public c(int i14, int i15, String str, String str2, int i16, float f14, float f15, String str3, boolean z14, boolean z15) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f198568a = i14;
        this.f198569b = i15;
        this.f198570c = str;
        this.f198571d = str2;
        this.f198572e = i16;
        this.f198573f = f14;
        this.f198574g = f15;
        this.f198575h = str3;
        this.f198576i = z14;
        this.f198577j = z15;
    }

    public final String a(String str) {
        Uri uri = Uri.parse(str);
        HashSet<String> hashSet = new HashSet(uri.getQueryParameterNames());
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        HashMap map = new HashMap();
        map.put(i.WIDTH.f12490a, String.valueOf(this.f198568a));
        map.put(i.HEIGHT.f12490a, String.valueOf(this.f198569b));
        String str2 = this.f198570c;
        if (str2.length() > 0) {
            map.put(i.EMBOSSED_TEXT.f12490a, str2);
        }
        map.put(i.EMBOSSED_TEXT_FOREGROUND.f12490a, this.f198571d);
        map.put(i.FONT_SCALE.f12490a, String.valueOf(this.f198572e));
        map.put(i.TEXT_POSITION_X_SCALE.f12490a, String.valueOf(this.f198573f));
        map.put(i.TEXT_POSITION_Y_SCALE.f12490a, String.valueOf(this.f198574g));
        map.put(i.FONT_NAME.f12490a, this.f198575h);
        map.put(i.FONT_BOLD.f12490a, String.valueOf(this.f198576i));
        map.put(i.ROUNDED_CORNERS.f12490a, String.valueOf(this.f198577j));
        for (a aVar : a.values()) {
            String str3 = aVar.f198586a;
            hashSet.remove(str3);
            if (map.get(str3) != null) {
                builderClearQuery.appendQueryParameter(str3, (String) map.get(str3));
            }
        }
        for (String str4 : hashSet) {
            builderClearQuery.appendQueryParameter(str4, uri.getQueryParameter(str4));
        }
        String string = builderClearQuery.build().toString();
        string.getClass();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f198568a == cVar.f198568a && this.f198569b == cVar.f198569b && this.f198570c.equals(cVar.f198570c) && this.f198571d.equals(cVar.f198571d) && this.f198572e == cVar.f198572e && Float.compare(this.f198573f, cVar.f198573f) == 0 && Float.compare(this.f198574g, cVar.f198574g) == 0 && this.f198575h.equals(cVar.f198575h) && this.f198576i == cVar.f198576i && this.f198577j == cVar.f198577j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198577j) + q6.f.g(wr.g.j(q6.f.d(this.f198574g, q6.f.d(this.f198573f, q2.d(this.f198572e, wr.g.j(wr.g.j(q2.d(this.f198569b, Integer.hashCode(this.f198568a) * 31, 31), 31, this.f198570c), 31, this.f198571d), 31), 31), 31), 31, this.f198575h), 31, this.f198576i);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f198568a, this.f198569b, "NewCreditCardImageAssetOptions(width=", ", height=", ", embossedText=");
        sn.a.t(sbJ, this.f198570c, ", foregroundColor=", this.f198571d, ", fontScale=");
        sbJ.append(this.f198572e);
        sbJ.append(", textPositionXScale=");
        sbJ.append(this.f198573f);
        sbJ.append(", textPositionYScale=");
        sbJ.append(this.f198574g);
        sbJ.append(", fontName=");
        sbJ.append(this.f198575h);
        sbJ.append(", fontBold=");
        return com.airbnb.lottie.animation.keyframe.a.f(", roundedCorners=", ")", sbJ, this.f198576i, this.f198577j);
    }
}
