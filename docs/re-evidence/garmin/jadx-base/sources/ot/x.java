package ot;

import android.widget.ImageView;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lot/x;", "", "Lo13/p;", "", "screenSize", "contentAreaSize", "contentAreaPositionY", "Landroid/widget/ImageView;", "garminLogo", "<init>", "(Lo13/p;Lo13/p;ILandroid/widget/ImageView;)V", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.p<Integer, Integer> f133698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.p<Integer, Integer> f133699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f133700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f133701d;

    public x(o13.p<Integer, Integer> pVar, o13.p<Integer, Integer> pVar2, int i14, ImageView imageView) {
        pVar.getClass();
        pVar2.getClass();
        imageView.getClass();
        this.f133698a = pVar;
        this.f133699b = pVar2;
        this.f133700c = i14;
        this.f133701d = imageView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f133698a.equals(xVar.f133698a) && this.f133699b.equals(xVar.f133699b) && this.f133700c == xVar.f133700c && this.f133701d.equals(xVar.f133701d);
    }

    public final int hashCode() {
        return this.f133701d.hashCode() + q2.d(this.f133700c, (this.f133699b.hashCode() + (this.f133698a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ResponsiveScreenInfo(screenSize=" + this.f133698a + ", contentAreaSize=" + this.f133699b + ", contentAreaPositionY=" + this.f133700c + ", garminLogo=" + this.f133701d + ")";
    }
}
