package defpackage;

import com.huawei.ui.homehealth.runcard.trackfragments.SportStatisticProvider;

/* JADX INFO: loaded from: classes43.dex */
public final /* synthetic */ class sym implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SportStatisticProvider f48806b;

    public /* synthetic */ sym(SportStatisticProvider sportStatisticProvider) {
        this.f48806b = sportStatisticProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48806b.gotoStartSport();
    }
}
