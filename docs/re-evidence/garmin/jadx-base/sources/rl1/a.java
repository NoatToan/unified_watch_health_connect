package rl1;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrl1/a;", "", "Ljava/util/ArrayList;", "Lrl1/b;", "Lkotlin/collections/ArrayList;", "dataFields", "<init>", "(Ljava/util/ArrayList;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f153402a;

    public a(ArrayList<b> arrayList) {
        arrayList.getClass();
        this.f153402a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f153402a.equals(((a) obj).f153402a);
    }

    public final int hashCode() {
        return this.f153402a.hashCode();
    }

    public final String toString() {
        return "ChartHighlightData(dataFields=" + this.f153402a + ")";
    }
}
