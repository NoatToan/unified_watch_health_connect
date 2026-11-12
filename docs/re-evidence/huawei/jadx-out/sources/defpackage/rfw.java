package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
public class rfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<MusicSong> f47281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47282b;

    public void a(String str) {
        this.f47282b = str;
    }

    public String d() {
        return this.f47282b;
    }

    public void d(ArrayList<MusicSong> arrayList) {
        this.f47281a = arrayList;
    }

    public ArrayList<MusicSong> b() {
        return this.f47281a;
    }

    public static final d a() {
        return new d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class d implements Comparator, Serializable {
        private static final long serialVersionUID = -3362383176034179661L;

        d() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if ((obj instanceof rfw) && (obj2 instanceof rfw)) {
                return rga.a(((rfw) obj).c(), ((rfw) obj2).c());
            }
            return 0;
        }
    }

    public String c() {
        return rga.c(this.f47282b);
    }
}
