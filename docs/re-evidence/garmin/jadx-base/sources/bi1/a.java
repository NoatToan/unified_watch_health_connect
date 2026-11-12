package bi1;

import com.garmin.android.apps.connectmobile.devices.model.b0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbi1/a;", "", "Lbi1/v;", TtmlNode.TAG_STYLE, "", "Lcom/garmin/android/apps/connectmobile/devices/model/b0;", "dataType", "Lbi1/t;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Lbi1/v;Ljava/util/List;Lbi1/t;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f18012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b0> f18013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f18014c;

    public /* synthetic */ a(v vVar, List list, t tVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(vVar, (i14 & 2) != 0 ? x.k(b0.STEPS, b0.ALTERNATE_DATE) : list, (i14 & 4) != 0 ? t.VVM3_COLOR_1 : tVar);
    }

    public static a a(a aVar, ArrayList arrayList, t tVar, int i14) {
        v vVar = aVar.f18012a;
        List<b0> list = arrayList;
        if ((i14 & 2) != 0) {
            list = aVar.f18013b;
        }
        if ((i14 & 4) != 0) {
            tVar = aVar.f18014c;
        }
        vVar.getClass();
        list.getClass();
        tVar.getClass();
        return new a(vVar, list, tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18012a == aVar.f18012a && p005kotlin.jvm.internal.s.g(this.f18013b, aVar.f18013b) && this.f18014c == aVar.f18014c;
    }

    public final int hashCode() {
        return this.f18014c.hashCode() + u0.b(this.f18012a.hashCode() * 31, 31, this.f18013b);
    }

    public final String toString() {
        return "ClassicWatchFace(style=" + this.f18012a + ", dataType=" + this.f18013b + ", color=" + this.f18014c + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(v vVar, List<? extends b0> list, t tVar) {
        vVar.getClass();
        list.getClass();
        tVar.getClass();
        this.f18012a = vVar;
        this.f18013b = list;
        this.f18014c = tVar;
    }
}
