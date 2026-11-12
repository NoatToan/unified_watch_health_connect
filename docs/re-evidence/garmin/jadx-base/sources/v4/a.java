package v4;

import android.content.res.TypedArray;
import b7.j;
import ch.qos.logback.core.CoreConstants;
import ds.e0;
import org.xmlpull.v1.XmlPullParser;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv4/a;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f175510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f175511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f175512c;

    public a(XmlPullParser xmlPullParser, int i14) {
        this.f175510a = xmlPullParser;
        this.f175511b = i14;
        this.f175512c = new h();
    }

    public final float a(TypedArray typedArray, String str, int i14, float f14) {
        if (j.e(this.f175510a, str)) {
            f14 = typedArray.getFloat(i14, f14);
        }
        b(typedArray.getChangingConfigurations());
        return f14;
    }

    public final void b(int i14) {
        this.f175511b = i14 | this.f175511b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f175510a, aVar.f175510a) && this.f175511b == aVar.f175511b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f175511b) + (this.f175510a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb3.append(this.f175510a);
        sb3.append(", config=");
        return e0.j(sb3, this.f175511b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(xmlPullParser, (i15 & 2) != 0 ? 0 : i14);
    }
}
