package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class msj implements ContactsDatabaseUtils.ResultCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f42349b;

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
    public final void onResult(Object obj) {
        this.f42349b.add((String) obj);
    }
}
