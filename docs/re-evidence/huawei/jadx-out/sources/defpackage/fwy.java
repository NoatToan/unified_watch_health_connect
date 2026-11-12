package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.userprofile.GetCommentReq;
import com.huawei.hwcloudmodel.model.userprofile.GetCommentRsp;
import com.huawei.hwcloudmodel.model.userprofile.UpdateCommentReq;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class fwy {
    private static final Object d = new Object();
    private static volatile fwy e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f34660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f34661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lqs f34662c;

    private fwy(Context context) {
        this.f34662c = null;
        this.f34661b = context.getApplicationContext();
        if (this.f34662c == null) {
            this.f34662c = lqs.d();
        }
        if (this.f34660a == null) {
            this.f34660a = Executors.newSingleThreadExecutor();
        }
    }

    public static fwy e(Context context) {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new fwy(context);
                }
            }
        }
        return e;
    }

    public void b() {
        LogUtil.a("MarketCommentMgr", "MarketCommentCloud_download_enter ");
        if (!Utils.o()) {
            this.f34662c.e(new GetCommentReq(), new ICloudOperationResult<GetCommentRsp>() { // from class: fwy.2
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void operationResult(GetCommentRsp getCommentRsp, String str, boolean z) {
                    if (!z || getCommentRsp == null) {
                        return;
                    }
                    int remainder = getCommentRsp.getRemainder();
                    LogUtil.a("MarketCommentMgr", "MarketCommentCloud_download_remainder ", Integer.valueOf(remainder));
                    SharedPreferenceManager.e(fwy.this.f34661b, Integer.toString(10000), "market_comment_status", Integer.toString(remainder), new StorageParams());
                }
            });
        }
        ExecutorService executorService = this.f34660a;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: fwy.5
                @Override // java.lang.Runnable
                public void run() {
                    HiUserPreference userPreference = HiHealthManager.d(fwy.this.f34661b).getUserPreference("custom.market_comment_time");
                    if (userPreference != null) {
                        SharedPreferenceManager.e(fwy.this.f34661b, Integer.toString(10000), "market_comment_time", userPreference.getValue(), new StorageParams());
                        LogUtil.a("MarketCommentMgr", "MarketCommentCloud_comment time ", userPreference.getValue());
                    }
                }
            });
        }
    }

    public void a() {
        LogUtil.a("MarketCommentMgr", "MarketCommentCloud_upload_enter ");
        if (Utils.o()) {
            LogUtil.a("MarketCommentMgr", "uploadCommentStatus is oversea");
            return;
        }
        this.f34662c.a(new UpdateCommentReq(), new ICloudOperationResult<CloudCommonReponse>() { // from class: fwy.3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
                if (z) {
                    SharedPreferenceManager.e(fwy.this.f34661b, Integer.toString(10000), "market_comment_status", Integer.toString(0), new StorageParams());
                    LogUtil.a("MarketCommentMgr", "MarketCommentCloud_comment uploadCommentStatus success ");
                }
            }
        });
        final String strValueOf = String.valueOf(System.currentTimeMillis());
        SharedPreferenceManager.e(this.f34661b, Integer.toString(10000), "market_comment_time", strValueOf, new StorageParams());
        ExecutorService executorService = this.f34660a;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: fwy.1
                @Override // java.lang.Runnable
                public void run() {
                    HiUserPreference hiUserPreference = new HiUserPreference();
                    hiUserPreference.setKey("custom.market_comment_time");
                    hiUserPreference.setValue(strValueOf);
                    HiHealthManager.d(fwy.this.f34661b).setUserPreference(hiUserPreference);
                    HiSyncOption hiSyncOption = new HiSyncOption();
                    hiSyncOption.setSyncModel(2);
                    hiSyncOption.setSyncAction(0);
                    hiSyncOption.setSyncDataType(10026);
                    hiSyncOption.setSyncMethod(2);
                    HiHealthNativeApi.a(fwy.this.f34661b).synCloud(hiSyncOption, null);
                    LogUtil.a("MarketCommentMgr", "MarketCommentCloud_up_to_cloud time", strValueOf);
                }
            });
        }
    }

    public void c() {
        LogUtil.a("MarketCommentMgr", "Oversea_MarketCommentCloud_upload_enter ");
        final String strValueOf = String.valueOf(System.currentTimeMillis());
        SharedPreferenceManager.e(this.f34661b, Integer.toString(10000), "market_comment_time", strValueOf, new StorageParams());
        ExecutorService executorService = this.f34660a;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: fwy.4
                @Override // java.lang.Runnable
                public void run() {
                    HiUserPreference hiUserPreference = new HiUserPreference();
                    hiUserPreference.setKey("custom.market_comment_time");
                    hiUserPreference.setValue(strValueOf);
                    HiHealthManager.d(fwy.this.f34661b).setUserPreference(hiUserPreference);
                    LogUtil.a("MarketCommentMgr", "Oversea_MarketCommentCloud_up_to_cloud time", strValueOf);
                }
            });
        }
    }
}
