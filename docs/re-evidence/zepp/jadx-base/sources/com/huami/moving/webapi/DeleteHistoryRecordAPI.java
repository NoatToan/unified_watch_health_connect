package com.huami.moving.webapi;

import androidx.annotation.Nullable;
import com.huami.moving.hkwebapi.HttpKitCommonAPI;
import com.huami.network.hmnetwork.server.HMServerDef;

/* JADX INFO: loaded from: classes5.dex */
public class DeleteHistoryRecordAPI {
    public static final String TAG = "DeleteHistoryRecordAPI";
    private static final String a = "v1/sport/run/summary.json";

    public interface DeleteHistoryRecordNotifyListener {
        void fetchNetErrorListener(boolean z);

        void fetchTrackRecordSuccessListener(Boolean bool, long j, String str);
    }

    public class a implements HttpKitCommonAPI.DeleteHistoryRecordListener {
        public final /* synthetic */ DeleteHistoryRecordNotifyListener a;
        public final /* synthetic */ long b;

        public a(DeleteHistoryRecordNotifyListener deleteHistoryRecordNotifyListener, long j) {
            this.a = deleteHistoryRecordNotifyListener;
            this.b = j;
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.DeleteHistoryRecordListener
        public void fetchNetErrorListener(boolean z) {
            this.a.fetchNetErrorListener(true);
        }

        @Override // com.huami.moving.hkwebapi.HttpKitCommonAPI.DeleteHistoryRecordListener
        public void fetchTrackRecordSuccessListener(@Nullable Boolean bool, long j, @Nullable String str) {
            this.a.fetchTrackRecordSuccessListener(bool, this.b, str);
        }
    }

    public static void deleteHistoryRecord(long j, String str, DeleteHistoryRecordNotifyListener deleteHistoryRecordNotifyListener) {
        HttpKitCommonAPI.deleteHistoryRecordAPI(HMServerDef.getRunningUrl(a), j, str, new a(deleteHistoryRecordNotifyListener, j));
    }
}
