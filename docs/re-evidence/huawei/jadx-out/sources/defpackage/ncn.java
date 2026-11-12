package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ncn implements ContactsDatabaseUtils.ResultCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f42888b;

    public /* synthetic */ ncn(List list) {
        this.f42888b = list;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.ContactsDatabaseUtils.ResultCallback
    public final void onResult(Object obj) {
        this.f42888b.add((ndi) obj);
    }
}
