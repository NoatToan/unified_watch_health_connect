package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class maj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f41255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41256c;
    private int d;

    public void c(int i) {
        this.f41256c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void e(int i) {
        this.d = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public List<Integer> a() {
        return (List) lst.d(this.f41255b);
    }

    public void e(List<Integer> list) {
        this.f41255b = (List) lst.d(list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("folderIndex: ");
        sb.append(this.f41256c);
        sb.append(" folderMusicAssociationFrameIndex: ");
        sb.append(this.d);
        sb.append(" musicIndexList: [");
        Iterator<Integer> it = this.f41255b.iterator();
        while (it.hasNext()) {
            sb.append(it.next().intValue());
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
