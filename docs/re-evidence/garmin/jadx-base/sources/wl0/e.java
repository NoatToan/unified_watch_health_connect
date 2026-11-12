package wl0;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface e {

    public enum a {
        PROTOBUF_REQUEST_FAILED,
        RESPONSE_MISSING_DATA
    }

    void onClubListRequestFailed(long j8, a aVar);

    void onClubListRetrieved(long j8, List<com.garmin.android.apps.connectmobile.golf.truswing.model.a> list, long j14);
}
