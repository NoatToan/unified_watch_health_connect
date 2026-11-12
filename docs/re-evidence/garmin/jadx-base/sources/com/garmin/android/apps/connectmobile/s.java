package com.garmin.android.apps.connectmobile;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.AppUpgradeManager$Companion", f = "AppUpgradeManager.kt", l = {150, 157}, m = "upgradeConnectionInfo", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rd2.d f41172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f41173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sd2.f f41174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f41175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sd2.e f41176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f41178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u.a f41179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41180i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u.a aVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f41179h = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f41178g = obj;
        this.f41180i |= Integer.MIN_VALUE;
        return u.a.c(this.f41179h, this);
    }
}
