package com.xiaomi.hm.health.running;

import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.running.SportDetailPageNavigator$batchRequestChildDetail$1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/running/SportDetailPageNavigator$batchRequestChildDetail$1", "Lrx/Subscriber;", "Lcom/xiaomi/hm/health/databases/model/Trackdata;", "", "onCompleted", "", "e", "onError", "trackdata", "onNext", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportDetailPageNavigator$batchRequestChildDetail$1 extends Subscriber<Trackdata> {
    public final /* synthetic */ SportDetailPageNavigator f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long[][] h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    public SportDetailPageNavigator$batchRequestChildDetail$1(SportDetailPageNavigator sportDetailPageNavigator, long j, long[][] jArr, int i, int i2, String str) {
        this.f = sportDetailPageNavigator;
        this.g = j;
        this.h = jArr;
        this.i = i;
        this.j = i2;
        this.k = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SportDetailPageNavigator sportDetailPageNavigator, Integer num) {
        sportDetailPageNavigator.r();
        IconToast.showError(sportDetailPageNavigator.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String(), sportDetailPageNavigator.getCom.huami.tools.analytics.DbUtils.Const.Table.CONTEXT java.lang.String().getString(R.string.network_request_fail));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Throwable th) {
        HMLog.warn$default(null, th, a.a, 1, null);
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.f.l(this.g, this.h, this.i, this.j, this.k);
    }

    @Override // rx.Observer
    public void onError(@NotNull Throwable e) {
        e.printStackTrace();
        Observable observableObserveOn = Observable.just(1).observeOn(AndroidSchedulers.mainThread());
        final SportDetailPageNavigator sportDetailPageNavigator = this.f;
        observableObserveOn.subscribe(new Action1() { // from class: n97
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportDetailPageNavigator$batchRequestChildDetail$1.d(sportDetailPageNavigator, (Integer) obj);
            }
        }, new Action1() { // from class: o97
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                SportDetailPageNavigator$batchRequestChildDetail$1.e((Throwable) obj);
            }
        });
    }

    @Override // rx.Observer
    public void onNext(@NotNull Trackdata trackdata) {
        TrackRecordManager.getInstance().insertDetailIfNotExist(trackdata);
        TrackDataManager.getInstance().genChildTrackData(trackdata.getTrackid().longValue(), this.i, trackdata.getType().intValue());
    }
}
