package com.garmin.android.apps.connectmobile;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.AppUpgradeManager$Companion", f = "AppUpgradeManager.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "updateConnectionInfoOnGC", v = 2)
public final class C3888r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f41068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u.a f41069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3888r(u.a aVar, t13.d<? super C3888r> dVar) {
        super(dVar);
        this.f41069b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f41068a = obj;
        this.f41070c |= Integer.MIN_VALUE;
        return this.f41069b.e(null, null, null, this);
    }
}
