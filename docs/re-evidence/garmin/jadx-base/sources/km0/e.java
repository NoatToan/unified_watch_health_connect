package km0;

import android.graphics.Rect;
import android.net.Uri;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface e {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkm0/e$a;", "Lkm0/e;", "", "resId", "", TtmlNode.ATTR_ID, "<init>", "(ILjava/lang/String;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f105317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105318b;

        public a(int i14, String str) {
            str.getClass();
            this.f105317a = i14;
            this.f105318b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f105317a == aVar.f105317a && this.f105318b.equals(aVar.f105318b);
        }

        public final int hashCode() {
            return this.f105318b.hashCode() + (Integer.hashCode(this.f105317a) * 31);
        }

        public final String toString() {
            return o2.c.e(this.f105317a, "StockPhoto(resId=", ", id=", this.f105318b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkm0/e$b;", "Lkm0/e;", "Landroid/net/Uri;", "originalUri", "croppedUri", "Landroid/graphics/Rect;", "cropRect", "", "rotateAngle", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/graphics/Rect;F)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f105319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f105320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f105321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f105322d;

        public b(Uri uri, Uri uri2, Rect rect, float f14) {
            uri.getClass();
            uri2.getClass();
            rect.getClass();
            this.f105319a = uri;
            this.f105320b = uri2;
            this.f105321c = rect;
            this.f105322d = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f105319a.equals(bVar.f105319a) && this.f105320b.equals(bVar.f105320b) && this.f105321c.equals(bVar.f105321c) && Float.compare(this.f105322d, bVar.f105322d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f105322d) + ((this.f105321c.hashCode() + ((this.f105320b.hashCode() + (this.f105319a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "UserPhoto(originalUri=" + this.f105319a + ", croppedUri=" + this.f105320b + ", cropRect=" + this.f105321c + ", rotateAngle=" + this.f105322d + ")";
        }
    }
}
