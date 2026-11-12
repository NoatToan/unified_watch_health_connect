package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
public class rfx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47283a;
    private ArrayList<MusicSong> d;

    public void e(String str) {
        this.f47283a = str;
    }

    public String c() {
        return this.f47283a;
    }

    public void b(ArrayList<MusicSong> arrayList) {
        this.d = arrayList;
    }

    public ArrayList<MusicSong> d() {
        return this.d;
    }

    public static final b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class b implements Comparator, Serializable {
        private static final long serialVersionUID = -3362383176034179661L;

        b() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return rga.a(obj instanceof rfx ? ((rfx) obj).e() : "", obj2 instanceof rfx ? ((rfx) obj2).e() : "");
        }
    }

    public String e() {
        return rga.c(this.f47283a);
    }
}
