package defpackage;

import android.content.res.Resources;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicMenu;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicPageStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationData;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class lzu {
    private static lzu d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41232c;
    private boolean f;
    private List<MusicSong> g;
    private int h;
    private boolean i;
    private int k;
    private boolean l;
    private List<MusicPageStruct> n;
    private List<MusicStruct> o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<MusicSong> f41230a = new ArrayList<>(16);
    private MusicMenu j = new MusicMenu();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MusicMenu f41231b = new MusicMenu();

    public static lzu c() {
        lzu lzuVar;
        synchronized (e) {
            if (d == null) {
                d = new lzu();
            }
            lzuVar = d;
        }
        return lzuVar;
    }

    public boolean e() {
        return this.i;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public boolean i() {
        return this.f;
    }

    public boolean h() {
        DeviceInfo deviceInfoD = mgg.d("MusicUiManager");
        if (deviceInfoD == null) {
            LogUtil.j("MusicUiManager", "isSupportMoreMusic, deviceInfo is null.");
            return false;
        }
        boolean zD = eey.d(deviceInfoD, 122);
        LogUtil.a("MusicUiManager", "isSupportMoreMusic: ", Boolean.valueOf(zD));
        return zD;
    }

    public int a(int i, int i2) {
        int i3 = i - i2;
        if (i3 > 1000) {
            return i3 / 10;
        }
        if (i3 > 100) {
            return i3 / 15;
        }
        return 3;
    }

    private Resources j() {
        return BaseApplication.getContext().getResources();
    }

    public void b(int i, int i2, final IBaseResponseCallback iBaseResponseCallback) {
        this.l = false;
        if (iBaseResponseCallback == null) {
            LogUtil.j("MusicUiManager", "loadAllMusic callback is null");
            return;
        }
        this.k = 0;
        final int i3 = i2 - i;
        e(new IBaseResponseCallback() { // from class: lzs
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i4, Object obj) {
                this.d.d(iBaseResponseCallback, i3, i4, obj);
            }
        });
    }

    /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, int i, int i2, Object obj) {
        LogUtil.a("MusicUiManager", "loadAllMusic errorCode : ", Integer.valueOf(i2));
        if (i2 == 1) {
            iBaseResponseCallback.a(i2, obj);
            return;
        }
        if (i2 != 0) {
            iBaseResponseCallback.a(i2, null);
            return;
        }
        if (obj instanceof MusicSong) {
            int i3 = this.k + 1;
            this.k = i3;
            iBaseResponseCallback.a(0, new mao(this.k, (int) ((i3 / i) * 100.0f), String.format(Locale.ROOT, j().getString(R.string.IDS_hwh_motiontrack_target_progress), Integer.valueOf(this.k), Integer.valueOf(i)), (MusicSong) obj));
        }
    }

    private void e(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("MusicUiManager", "getAllPageMusicInfo callback is null");
            return;
        }
        if (this.l) {
            iBaseResponseCallback.a(3, null);
        } else if (this.h < this.n.size()) {
            a(new IBaseResponseCallback() { // from class: lzr
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f41224c.d(iBaseResponseCallback, i, obj);
                }
            });
        } else {
            iBaseResponseCallback.a(1, null);
        }
    }

    /* synthetic */ void d(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("MusicUiManager", "getAllPageMusicInfo errorCode : ", Integer.valueOf(i));
        if (i == 0) {
            iBaseResponseCallback.a(0, obj);
        } else if (i == 1) {
            iBaseResponseCallback.a(1, obj);
            e(iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(3, null);
        }
    }

    public void d(boolean z) {
        this.l = z;
    }

    public String b(int i, int i2) {
        if (!h() || i == i2) {
            return String.format(Locale.ROOT, j().getString(R.string.IDS_settings_music_songs_number), Integer.valueOf(i));
        }
        return String.format(Locale.ROOT, j().getString(R.string.IDS_hw_health_music_loaded), j().getQuantityString(R.plurals.IDS_hw_health_music_number, i, Integer.valueOf(i)));
    }

    public String c(int i, int i2) {
        int i3 = !h() ? i : i2;
        if (i <= i2) {
            i = i3;
        }
        if (i <= 0) {
            return j().getString(R.string.IDS_hw_health_music_watch_all_music);
        }
        return String.format(Locale.ROOT, j().getString(R.string.IDS_settings_music_songs_number), Integer.valueOf(i));
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("MusicUiManager", "loadMoreMusic callback is null");
            return;
        }
        if (this.n.isEmpty()) {
            iBaseResponseCallback.a(2, null);
            LogUtil.j("MusicUiManager", "loadMoreMusic mMusicPageStructList is empty");
        } else if (this.h > this.n.size()) {
            iBaseResponseCallback.a(2, null);
            LogUtil.j("MusicUiManager", "loadMoreMusic mCurrentPageIndex is out of bound : ", Integer.valueOf(this.h));
        } else {
            this.f = true;
            a(iBaseResponseCallback);
        }
    }

    private void a(final IBaseResponseCallback iBaseResponseCallback) {
        final MusicPageStruct musicPageStruct = this.n.get(this.h);
        if (this.f41232c <= musicPageStruct.getMusicEndFrameIndex()) {
            lzl.a(BaseApplication.getContext()).b(this.f41232c, new IBaseResponseCallback() { // from class: lzv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f41233b.c(iBaseResponseCallback, musicPageStruct, i, obj);
                }
            });
            return;
        }
        this.h++;
        mai maiVar = new mai();
        maiVar.c(this.g);
        maiVar.a(this.o);
        iBaseResponseCallback.a(1, maiVar);
        this.f = false;
        this.g = null;
        if (this.h < this.n.size()) {
            this.f41232c = this.n.get(this.h).getMusicStartFrameIndex();
            b(true);
        } else {
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(int i, Object obj, IBaseResponseCallback iBaseResponseCallback, MusicPageStruct musicPageStruct) {
        if (this.l) {
            iBaseResponseCallback.a(3, null);
            return;
        }
        if (i == 1 && coq.e(obj, MusicStruct.class)) {
            List<MusicStruct> list = (List) obj;
            if (this.g == null) {
                this.g = new ArrayList(16);
            }
            if (this.o == null) {
                this.o = new ArrayList(16);
            }
            for (MusicStruct musicStruct : list) {
                MusicSong musicSong = new MusicSong();
                musicSong.setFileName(musicStruct.getFileName());
                musicSong.setSongName(musicStruct.getMusicName());
                musicSong.setSongSingerName(musicStruct.getMusicSinger());
                musicSong.setSongIndex(String.valueOf(musicStruct.getMusicIndex()));
                this.g.add(musicSong);
                this.o.add(musicStruct);
                iBaseResponseCallback.a(0, musicSong);
            }
            this.f41232c++;
            a(iBaseResponseCallback);
            return;
        }
        iBaseResponseCallback.a(2, null);
        this.g = null;
        this.f41232c = musicPageStruct.getMusicStartFrameIndex();
        this.f = false;
    }

    public void b(NegotiationData negotiationData) {
        this.n = negotiationData.getMusicPageStructList();
        this.h = 1;
        this.f41232c = 0;
        b(false);
        this.g = null;
        if (this.n.size() > 1) {
            this.f41232c = this.n.get(this.h).getMusicStartFrameIndex();
            b(true);
        }
    }

    public void f() {
        if (d != null) {
            d = null;
        }
    }

    public ArrayList<MusicSong> a() {
        return this.f41230a;
    }

    public void a(ArrayList<MusicSong> arrayList) {
        this.f41230a = arrayList;
    }

    public MusicMenu b() {
        return this.j;
    }

    public void e(MusicMenu musicMenu) {
        this.j = musicMenu;
    }

    public MusicMenu d() {
        return this.f41231b;
    }

    public void a(MusicMenu musicMenu) {
        this.f41231b = musicMenu;
    }
}
