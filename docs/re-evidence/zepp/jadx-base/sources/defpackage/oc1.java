package defpackage;

import com.google.android.exoplayer2.offline.DownloadCursor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oc1 {
    public static boolean a(DownloadCursor _this) {
        return _this.getCount() == 0 || _this.getPosition() == _this.getCount();
    }

    public static boolean b(DownloadCursor _this) {
        return _this.getCount() == 0 || _this.getPosition() == -1;
    }

    public static boolean c(DownloadCursor _this) {
        return _this.getPosition() == 0 && _this.getCount() != 0;
    }

    public static boolean d(DownloadCursor _this) {
        int count = _this.getCount();
        return _this.getPosition() == count + (-1) && count != 0;
    }

    public static boolean e(DownloadCursor _this) {
        return _this.moveToPosition(0);
    }

    public static boolean f(DownloadCursor _this) {
        return _this.moveToPosition(_this.getCount() - 1);
    }

    public static boolean g(DownloadCursor _this) {
        return _this.moveToPosition(_this.getPosition() + 1);
    }

    public static boolean h(DownloadCursor _this) {
        return _this.moveToPosition(_this.getPosition() - 1);
    }
}
