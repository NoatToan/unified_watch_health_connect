package com.huami.reddot.network;

import com.huami.reddot.entity.RedDotItem;
import com.huami.reddot.network.RedDotRequest;
import java.util.ArrayList;
import java.util.List;
import rx.Emitter;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
public class RedDotRequest {
    private RequestParamsProxy a;

    public RedDotRequest(IRequestParams iRequestParams) {
        this.a = new RequestParamsProxy(iRequestParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(String[] strArr, Emitter emitter) {
        Cloud.DiscoveryResult discoveryResultRequestIconRedDot = RedDotAPI.api().requestIconRedDot(strArr);
        if (discoveryResultRequestIconRedDot.success) {
            ArrayList<RedDotItem> arrayList = discoveryResultRequestIconRedDot.dotItems;
            ArrayList arrayList2 = new ArrayList();
            if (arrayList != null) {
                for (RedDotItem redDotItem : arrayList) {
                    if (redDotItem.isNeedUpdate()) {
                        arrayList2.add(redDotItem.getType());
                    }
                }
            }
            emitter.onNext(arrayList2);
        }
    }

    private Observable<ArrayList<String>> c(List<String> list) {
        final String[] strArr = (String[]) list.toArray(new String[list.size()]);
        return Observable.create(new Action1() { // from class: da6
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                RedDotRequest.b(strArr, (Emitter) obj);
            }
        }, Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<ArrayList<String>> requestMineRedDot() {
        return this.a.getMineParams().size() == 0 ? Observable.just(null) : c(this.a.getMineParams());
    }

    public Observable<ArrayList<String>> requestMsgBoxRedDot() {
        return this.a.getMsgBoxParams().size() == 0 ? Observable.just(null) : c(this.a.getMsgBoxParams());
    }

    public Observable<ArrayList<String>> requestWatchFaceRedDot() {
        return this.a.getWatchSkinParams().size() == 0 ? Observable.just(null) : c(this.a.getWatchSkinParams());
    }
}
