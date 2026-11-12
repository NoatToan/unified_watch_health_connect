package defpackage;

import android.content.Context;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_eco_manager.sensor.SportFuncRequest;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lc2 implements ISportStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24888a = AppUtil.getApp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24889b;
    public SportFuncRequest c;

    public lc2(long j) {
        this.f24889b = j;
    }

    public void a(SportFuncRequest sportFuncRequest) {
        this.c = sportFuncRequest;
    }
}
