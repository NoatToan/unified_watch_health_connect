package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
public class rfv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47280a;
    private ArrayList<MusicSong> d;

    public void c(String str) {
        this.f47280a = str;
    }

    public String e() {
        return this.f47280a;
    }

    public void c(ArrayList<MusicSong> arrayList) {
        this.d = arrayList;
    }

    public ArrayList<MusicSong> d() {
        return this.d;
    }

    public static final e a() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class e implements Comparator, Serializable {
        private static final long serialVersionUID = -3362383176034179661L;

        e() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return rga.a(obj instanceof rfv ? ((rfv) obj).c() : "", obj2 instanceof rfv ? ((rfv) obj2).c() : "");
        }
    }

    public String c() {
        return rga.c(this.f47280a);
    }
}
