package defpackage;

import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;

/* JADX INFO: loaded from: classes10.dex */
public class mao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41269c;
    private MusicSong d;

    public mao(int i, int i2, String str, MusicSong musicSong) {
        this.f41269c = i;
        this.f41267a = i2;
        this.f41268b = str;
        this.d = musicSong;
    }

    public int a() {
        return this.f41267a;
    }

    public String d() {
        return this.f41268b;
    }

    public MusicSong e() {
        return this.d;
    }
}
