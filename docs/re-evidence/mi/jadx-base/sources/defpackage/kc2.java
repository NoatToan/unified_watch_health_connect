package defpackage;

import android.content.Context;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_manager.sensor.SportFuncRequest;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kc2 implements ISportStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23704a = AppUtil.getApp();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23705b;
    public yyc c;
    public SportFuncRequest d;

    public kc2(long j, yyc yycVar) {
        this.f23705b = j;
        this.c = yycVar;
    }

    public void a(SportFuncRequest sportFuncRequest) {
        this.d = sportFuncRequest;
    }
}
