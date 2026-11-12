package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class rdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f47174a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static rdd f47175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<MusicSong> f47176c = new ArrayList<>(16);

    private rdd() {
    }

    public static rdd d() {
        rdd rddVar;
        synchronized (f47174a) {
            if (f47175b == null) {
                f47175b = new rdd();
            }
            rddVar = f47175b;
        }
        return rddVar;
    }

    public void a() {
        c();
    }

    private static void c() {
        synchronized (f47174a) {
            f47175b = null;
        }
    }

    public ArrayList<MusicSong> b() {
        return this.f47176c;
    }
}
