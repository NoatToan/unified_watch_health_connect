package defpackage;

import android.widget.SeekBar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class x0i implements w0i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x0i f38545b = new x0i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<w0i> f38546a = new CopyOnWriteArrayList<>();

    public static x0i g() {
        return f38545b;
    }

    @Override // defpackage.w0i
    public void a() {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // defpackage.w0i
    public void b(boolean z) {
        for (w0i w0iVar : this.f38546a) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCoverViewVisibilityChanged: ");
            sb.append(z);
            w0iVar.b(z);
        }
    }

    @Override // defpackage.w0i
    public void c(long j, long j2, int i, int i2) {
        for (w0i w0iVar : this.f38546a) {
            StringBuilder sb = new StringBuilder();
            sb.append("onProgress: currentPos= ");
            sb.append(Math.max(0L, j));
            sb.append(" duration= ");
            sb.append(Math.max(0L, j2));
            sb.append(" progress= ");
            sb.append(Math.max(0, i));
            sb.append(" bufferedPercentage= ");
            sb.append(Math.max(0, i2));
            w0iVar.c(Math.max(0L, j), Math.max(0L, j2), Math.max(0, i), Math.max(0, i2));
        }
    }

    @Override // defpackage.w0i
    public void d() {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // defpackage.w0i
    public void e(boolean z, int i) {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().e(z, i);
        }
    }

    @Override // defpackage.w0i
    public void f(SeekBar seekBar, int i, boolean z) {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().f(seekBar, i, z);
        }
    }

    public void h(w0i w0iVar) {
        if (w0iVar != null) {
            this.f38546a.add(w0iVar);
        }
    }

    public void i(w0i w0iVar) {
        if (this.f38546a.contains(w0iVar)) {
            this.f38546a.remove(w0iVar);
            StringBuilder sb = new StringBuilder();
            sb.append("unRegister: ");
            sb.append(w0iVar);
        }
    }

    @Override // defpackage.w0i
    public void onComplete() {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
    }

    @Override // defpackage.w0i
    public void onError() {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().onError();
        }
    }

    @Override // defpackage.w0i
    public void onPause() {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    @Override // defpackage.w0i
    public void onResume() {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    @Override // defpackage.w0i
    public void onStart() {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    @Override // defpackage.w0i
    public void onStopTrackingTouch(SeekBar seekBar) {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().onStopTrackingTouch(seekBar);
        }
    }

    @Override // defpackage.w0i
    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        Iterator<w0i> it = this.f38546a.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(i, i2, i3, f);
        }
    }
}
