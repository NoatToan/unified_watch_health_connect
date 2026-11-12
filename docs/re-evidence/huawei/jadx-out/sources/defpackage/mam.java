package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicStruct;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mam {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<MusicStruct> f41262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41263c;
    private int d;

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.d))).intValue();
    }

    public void a(int i) {
        this.d = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int d() {
        return this.f41263c;
    }

    public void b(int i) {
        this.f41263c = i;
    }

    public List<MusicStruct> a() {
        return (List) lst.d(this.f41262b);
    }

    public void e(List<MusicStruct> list) {
        this.f41262b = (List) lst.d(list);
    }
}
