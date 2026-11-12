package defpackage;

import android.widget.SeekBar;

/* JADX INFO: loaded from: classes2.dex */
public interface w0i {
    void a();

    void b(boolean z);

    void c(long j, long j2, int i, int i2);

    void d();

    void e(boolean z, int i);

    void f(SeekBar seekBar, int i, boolean z);

    void onComplete();

    void onError();

    void onPause();

    void onResume();

    void onStart();

    void onStopTrackingTouch(SeekBar seekBar);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
