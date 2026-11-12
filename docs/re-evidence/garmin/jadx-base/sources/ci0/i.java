package ci0;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f27655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CustomLineChart f27656c;

    public /* synthetic */ i(l lVar, CustomLineChart customLineChart, int i14) {
        this.f27654a = i14;
        this.f27655b = lVar;
        this.f27656c = customLineChart;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f27654a) {
            case 0:
                this.f27655b.invoke(Boolean.valueOf(!this.f27656c.isFullyZoomedOut()));
                break;
            case 1:
                this.f27655b.invoke(Boolean.valueOf(!this.f27656c.isFullyZoomedOut()));
                break;
            case 2:
                this.f27655b.invoke(Boolean.valueOf(!this.f27656c.isFullyZoomedOut()));
                break;
            default:
                this.f27655b.invoke(Boolean.valueOf(this.f27656c.isFullyZoomedOut()));
                break;
        }
        return Unit.INSTANCE;
    }
}
