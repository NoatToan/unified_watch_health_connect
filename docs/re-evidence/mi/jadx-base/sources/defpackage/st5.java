package defpackage;

import android.app.ActivityManager;
import com.xiaomi.fitness.sync.model.EventRecurrence;

/* JADX INFO: loaded from: classes4.dex */
public class st5 implements tpo<hpf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityManager f33964a;

    public st5(ActivityManager activityManager) {
        this.f33964a = activityManager;
    }

    @Override // defpackage.tpo
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public hpf get() {
        return new hpf(b(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final int b() {
        int iMin = Math.min(this.f33964a.getMemoryClass() * EventRecurrence.TH, Integer.MAX_VALUE);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }
}
