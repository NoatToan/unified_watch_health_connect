package defpackage;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jag implements b5i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b5i> f22591a;

    public jag(List<b5i> list) {
        this.f22591a = new LinkedList(list);
    }

    public static b5i d(List<b5i> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new jag(list) : list.get(0);
        }
        return null;
    }

    @Override // defpackage.b5i
    public w14<Bitmap> a(Bitmap bitmap, f0i f0iVar) {
        w14<Bitmap> w14VarA = null;
        try {
            Iterator<b5i> it = this.f22591a.iterator();
            w14<Bitmap> w14VarClone = null;
            while (it.hasNext()) {
                w14VarA = it.next().a(w14VarClone != null ? w14VarClone.n() : bitmap, f0iVar);
                w14.l(w14VarClone);
                w14VarClone = w14VarA.clone();
            }
            return w14VarA.clone();
        } finally {
            w14.l(w14VarA);
        }
    }

    @Override // defpackage.b5i
    public c93 b() {
        LinkedList linkedList = new LinkedList();
        Iterator<b5i> it = this.f22591a.iterator();
        while (it.hasNext()) {
            linkedList.push(it.next().b());
        }
        return new x9g(linkedList);
    }

    @Override // defpackage.b5i
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (b5i b5iVar : this.f22591a) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(b5iVar.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }
}
