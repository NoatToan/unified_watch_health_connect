package wm2;

import com.garmin.proto.generated.GDISmartProto;

/* JADX INFO: loaded from: classes11.dex */
public interface b {
    void onResponseFailed(int i14);

    void onResponseReceived(int i14, GDISmartProto.Smart smart);
}
