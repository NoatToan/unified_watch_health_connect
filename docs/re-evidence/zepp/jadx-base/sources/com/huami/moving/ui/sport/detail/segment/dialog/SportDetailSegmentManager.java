package com.huami.moving.ui.sport.detail.segment.dialog;

import com.huami.mifit.sportlib.dbkit.bulkparse.SportSegmentData;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.ui.event.EventSegmentSave;
import com.huami.moving.ui.utils.LapConvertUtilsKt;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import de.greenrobot.event.EventBus;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SportDetailSegmentManager {
    private static volatile SportDetailSegmentManager c;
    private String a;
    private List<SportSegmentData> b;

    public class a implements Observer<Boolean> {
        public a() {
        }

        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            EventBus.getDefault().post(new EventSegmentSave(bool.booleanValue()));
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    public class b implements ObservableOnSubscribe<Boolean> {
        public final /* synthetic */ Trackdata a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Trackrecord c;

        public b(Trackdata trackdata, boolean z, Trackrecord trackrecord) {
            this.a = trackdata;
            this.b = z;
            this.c = trackrecord;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Boolean> observableEmitter) throws Exception {
            boolean zPostSummarySync;
            if (PostRunningDataToServer.postDetailDataSync(this.a, this.b)) {
                zPostSummarySync = PostRunningDataToServer.postSummarySync(this.c, this.b);
                if (zPostSummarySync) {
                    TrackRecordManager.getInstance().insertOrReplaceDetailData(this.a);
                    TrackDataManager.getInstance().tryDeleteParsedDetailDataFile(this.a.getTrackid().longValue(), this.a.getSource().intValue(), this.a.getType().intValue());
                    TrackDataManager.getInstance().getTrackData(this.a.getTrackid().longValue(), this.a.getSource().intValue(), this.a.getType().intValue());
                }
            } else {
                zPostSummarySync = false;
            }
            observableEmitter.onNext(Boolean.valueOf(zPostSummarySync));
            observableEmitter.onComplete();
        }
    }

    private SportDetailSegmentManager() {
    }

    public static SportDetailSegmentManager getInstance() {
        if (c == null) {
            synchronized (SportDetailSegmentManager.class) {
                if (c == null) {
                    c = new SportDetailSegmentManager();
                }
            }
        }
        return c;
    }

    public List<SportSegmentData> getSegmentDataList() {
        return this.b;
    }

    public String getSource() {
        return this.a;
    }

    public void postDetailDataSync(Trackdata trackdata, Trackrecord trackrecord, boolean z) {
        Observable.create(new b(trackdata, z, trackrecord)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    public void renewLap(List<SportSegmentData> list, Trackdata trackdata) {
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<SportSegmentData> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(LapConvertUtilsKt.segmentData2NetFormat(it2.next()));
        }
        trackdata.setLap(sb.toString());
        getInstance().setSegmentDataList(list);
    }

    public void setSegmentDataList(List<SportSegmentData> list) {
        this.b = list;
    }

    public void setSource(String str) {
        this.a = str;
    }
}
