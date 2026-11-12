package x11;

import b11.v;
import b21.o4;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lx11/b;", "", "Lb21/o4;", "mode", "Lx11/a;", "selectedTab", "", "isLoading", "showGenericError", "barcodeScanningNoResults", "imageRecognitionNoResults", "showCameraPreview", "isCameraFlashOn", "Lb11/e;", "barcodeScannerFoodResult", "", "Lb11/v;", "imageRecognitionFoodsResults", "<init>", "(Lb21/o4;Lx11/a;ZZZZZZLb11/e;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f188381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f188382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f188383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f188384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f188385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f188386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f188387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f188388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b11.e f188389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<v> f188390j;

    public /* synthetic */ b(o4 o4Var, a aVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, b11.e eVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(o4Var, (i14 & 2) != 0 ? a.FOOD : aVar, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? true : z18, (i14 & 128) == 0 ? z19 : false, (i14 & 256) != 0 ? null : eVar, (i14 & 512) != 0 ? null : list);
    }

    public static b a(b bVar, a aVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, b11.e eVar, ArrayList arrayList, int i14) {
        a aVar2 = aVar;
        o4 o4Var = bVar.f188381a;
        if ((i14 & 2) != 0) {
            aVar2 = bVar.f188382b;
        }
        if ((i14 & 4) != 0) {
            z14 = bVar.f188383c;
        }
        if ((i14 & 8) != 0) {
            z15 = bVar.f188384d;
        }
        if ((i14 & 16) != 0) {
            z16 = bVar.f188385e;
        }
        if ((i14 & 32) != 0) {
            z17 = bVar.f188386f;
        }
        if ((i14 & 64) != 0) {
            z18 = bVar.f188387g;
        }
        if ((i14 & 128) != 0) {
            z19 = bVar.f188388h;
        }
        if ((i14 & 256) != 0) {
            eVar = bVar.f188389i;
        }
        List<v> list = arrayList;
        if ((i14 & 512) != 0) {
            list = bVar.f188390j;
        }
        List<v> list2 = list;
        bVar.getClass();
        o4Var.getClass();
        aVar2.getClass();
        b11.e eVar2 = eVar;
        boolean z24 = z19;
        boolean z25 = z18;
        boolean z26 = z17;
        boolean z27 = z16;
        boolean z28 = z15;
        return new b(o4Var, aVar2, z14, z28, z27, z26, z25, z24, eVar2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f188381a == bVar.f188381a && this.f188382b == bVar.f188382b && this.f188383c == bVar.f188383c && this.f188384d == bVar.f188384d && this.f188385e == bVar.f188385e && this.f188386f == bVar.f188386f && this.f188387g == bVar.f188387g && this.f188388h == bVar.f188388h && s.g(this.f188389i, bVar.f188389i) && s.g(this.f188390j, bVar.f188390j);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((this.f188382b.hashCode() + (this.f188381a.hashCode() * 31)) * 31, 31, this.f188383c), 31, this.f188384d), 31, this.f188385e), 31, this.f188386f), 31, this.f188387g), 31, this.f188388h);
        b11.e eVar = this.f188389i;
        int iHashCode = (iG + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<v> list = this.f188390j;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageRecognitionAndBarcodeScannerUiState(mode=");
        sb3.append(this.f188381a);
        sb3.append(", selectedTab=");
        sb3.append(this.f188382b);
        sb3.append(", isLoading=");
        kg.f.q(", showGenericError=", ", barcodeScanningNoResults=", sb3, this.f188383c, this.f188384d);
        kg.f.q(", imageRecognitionNoResults=", ", showCameraPreview=", sb3, this.f188385e, this.f188386f);
        kg.f.q(", isCameraFlashOn=", ", barcodeScannerFoodResult=", sb3, this.f188387g, this.f188388h);
        sb3.append(this.f188389i);
        sb3.append(", imageRecognitionFoodsResults=");
        sb3.append(this.f188390j);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(o4 o4Var, a aVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, b11.e eVar, List<? extends v> list) {
        o4Var.getClass();
        aVar.getClass();
        this.f188381a = o4Var;
        this.f188382b = aVar;
        this.f188383c = z14;
        this.f188384d = z15;
        this.f188385e = z16;
        this.f188386f = z17;
        this.f188387g = z18;
        this.f188388h = z19;
        this.f188389i = eVar;
        this.f188390j = list;
    }
}
