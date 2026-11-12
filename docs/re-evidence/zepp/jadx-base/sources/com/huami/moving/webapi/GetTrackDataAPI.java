package com.huami.moving.webapi;

import com.huami.mifit.sportlib.webkit.ISportHttpRequester;
import com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler;
import com.huami.mifit.sportlib.webkit.SportHttpKit;
import com.huami.moving.webapi.GetTrackDataAPI;
import com.xiaomi.hm.health.databases.model.Trackdata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import rx.Emitter;
import rx.Observable;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes5.dex */
public class GetTrackDataAPI {
    public static final String TAG = "GetTrackDataAPI";
    private static final String a = "v1/sport/run/detail.json";

    public interface TrackdataNotifyListener {
        void fetchNetErrorListener();

        void fetchTrackRecordSuccessListener(Trackdata trackdata);
    }

    public class a implements ISportHttpResponseHandler {
        public final /* synthetic */ int a;
        public final /* synthetic */ TrackdataNotifyListener b;

        public a(int i, TrackdataNotifyListener trackdataNotifyListener) {
            this.a = i;
            this.b = trackdataNotifyListener;
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onCanceled(int i) {
            this.b.fetchNetErrorListener();
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onFailed(String str) {
            this.b.fetchNetErrorListener();
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onSuccessed(String str) {
            try {
                Trackdata trackdata = SportWebDataConverter.INSTANCE.parseTrackdata(new JSONObject(str));
                trackdata.setType(Integer.valueOf(this.a));
                this.b.fetchTrackRecordSuccessListener(trackdata);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.fetchNetErrorListener();
            }
        }
    }

    public class b implements ISportHttpResponseHandler {
        public final /* synthetic */ int a;
        public final /* synthetic */ Emitter b;

        public b(int i, Emitter emitter) {
            this.a = i;
            this.b = emitter;
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onCanceled(int i) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onFailed(String str) {
            this.b.onError(new IllegalStateException("get TrackData failed"));
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onSuccessed(String str) {
            try {
                Trackdata trackdata = SportWebDataConverter.INSTANCE.parseTrackdata(new JSONObject(str));
                trackdata.setType(Integer.valueOf(this.a));
                this.b.onNext(trackdata);
                this.b.onCompleted();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class c implements ISportHttpResponseHandler {
        public final /* synthetic */ int a;
        public final /* synthetic */ List b;

        public c(int i, List list) {
            this.a = i;
            this.b = list;
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onCanceled(int i) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onFailed(String str) {
        }

        @Override // com.huami.mifit.sportlib.webkit.ISportHttpResponseHandler
        public void onSuccessed(String str) {
            try {
                Trackdata trackdata = SportWebDataConverter.INSTANCE.parseTrackdata(new JSONObject(str));
                trackdata.setType(Integer.valueOf(this.a));
                this.b.add(trackdata);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static Observable<Trackdata> b(final long j, final String str, final int i) {
        return Observable.create(new Action1() { // from class: zf2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                GetTrackDataAPI.c(j, str, i, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(long j, String str, int i, Emitter emitter) {
        HashMap map = new HashMap();
        map.put("trackid", Long.valueOf(j));
        map.put("source", str);
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        if (requester == null) {
            emitter.onError(new IllegalStateException("Sport requester is null"));
        } else {
            requester.doHttpRequest(a, map, 27, new b(i, emitter));
        }
    }

    public static Trackdata getLineTrackData(long j, String str, int i) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        map.put("trackid", Long.valueOf(j));
        map.put("source", str);
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        if (requester == null || !requester.doHttpRequestSync(a, map, 27, new c(i, arrayList))) {
            return null;
        }
        return (Trackdata) arrayList.get(0);
    }

    public static void getRunningTrackData(long j, String str, TrackdataNotifyListener trackdataNotifyListener, int i) {
        HashMap map = new HashMap();
        map.put("trackid", Long.valueOf(j));
        map.put("source", str);
        ISportHttpRequester requester = SportHttpKit.getInstance().getRequester();
        if (requester == null) {
            trackdataNotifyListener.fetchNetErrorListener();
        } else {
            requester.doHttpRequest(a, map, 27, new a(i, trackdataNotifyListener));
        }
    }

    public static Observable<Trackdata> getSubSportsDetailData(long[] jArr, String str, long[] jArr2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jArr.length; i++) {
            arrayList.add(b(jArr[i], str, (int) jArr2[i]));
        }
        return Observable.merge(arrayList).subscribeOn(Schedulers.io());
    }
}
