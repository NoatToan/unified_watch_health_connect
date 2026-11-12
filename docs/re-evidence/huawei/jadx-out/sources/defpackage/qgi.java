package defpackage;

import android.text.TextUtils;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class qgi extends qgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46178a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f46179c;
    private boolean e;

    public qgi(oaw oawVar) {
        super(oawVar);
        this.e = false;
        this.f46178a = false;
    }

    @Override // defpackage.qgg
    public boolean b(oaw oawVar) {
        LogUtil.a("SyncMedalTask", "onTaskStart");
        if (oawVar instanceof obb) {
            return e(oawVar);
        }
        return f(oawVar);
    }

    private boolean e(oaw oawVar) {
        if (!(oawVar instanceof obb)) {
            return false;
        }
        this.e = false;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        obb obbVarA = a(oawVar);
        if (obbVarA == null) {
            LogUtil.j("SyncMedalTask", "SendStartSuccess sendMessage is null.");
            countDownLatch.countDown();
            return false;
        }
        lkr.b().sendComand(e(obbVarA), new qgg.b(new ResponseCallback<Integer>() { // from class: qgi.5
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResult(int i, Integer num) {
                if (i == 207) {
                    qgi.this.e = true;
                }
                countDownLatch.countDown();
            }
        }));
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("SyncMedalTask", "isSendStartSuccess catch interruptedException");
        }
        return this.e;
    }

    private boolean f(oaw oawVar) {
        this.f46179c = new CountDownLatch(1);
        this.f46178a = false;
        g(oawVar);
        try {
            this.f46179c.await(30L, TimeUnit.MINUTES);
        } catch (InterruptedException unused) {
            LogUtil.e("SyncMedalTask", "SyncMedalsSuccess catch InterruptedException");
        }
        return this.f46178a;
    }

    private void g(oaw oawVar) {
        if (!(oawVar instanceof oaz)) {
            this.f46179c.countDown();
            return;
        }
        oaz oazVar = (oaz) oawVar;
        if (oazVar.c() == 2) {
            LogUtil.j("SyncMedalTask", "ReceiveMessage is end");
            this.f46178a = true;
            if (oazVar.a() != 200) {
                LogUtil.e("SyncMedalTask", "startSyncMedals sync fail! code ", Integer.valueOf(oazVar.a()));
                this.f46178a = false;
            }
            this.f46179c.countDown();
            return;
        }
        Task<ouq> taskObtainMedalInfo = axa.a().obtainMedalInfo(oazVar.j());
        LogUtil.a("SyncMedalTask", "startSyncMedals lastTime Timestamp == ", Long.valueOf(oazVar.g()));
        if (taskObtainMedalInfo == null) {
            LogUtil.j("SyncMedalTask", "startSyncMedals getMedalConfig is null");
            this.f46179c.countDown();
        } else {
            taskObtainMedalInfo.addOnSuccessListener(new OnSuccessListener<ouq>() { // from class: qgi.3
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ouq ouqVar) throws Throwable {
                    if (ouqVar == null) {
                        LogUtil.j("SyncMedalTask", "startSyncMedals medalConfigMap is null");
                        qgi.this.c(201, false);
                    } else {
                        LogUtil.a("SyncMedalTask", "startSyncMedals medalConfig == ", ouqVar.toString());
                        qgi.this.a(ouqVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ouq ouqVar) throws Throwable {
        if (ouqVar == null) {
            this.f46179c.countDown();
            return;
        }
        String strA = a();
        LogUtil.a("SyncMedalTask", "syncingToDevice session == ", strA);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("SyncMedalTask", "syncingToDevice receiveFromDevice sync fail!");
            this.f46179c.countDown();
            return;
        }
        final String strB = xjh.b(ouqVar, strA);
        if (TextUtils.isEmpty(strB)) {
            LogUtil.j("SyncMedalTask", "syncingToDevice zipPath isEmpty, medalid = ", ouqVar.c());
            c(201, false);
            return;
        }
        LogUtil.a("SyncMedalTask", "syncingToDevice zipPath == ", strB);
        File file = new File(strB);
        LogUtil.a("SyncMedalTask", "syncingToDevice zipLength == ", Long.valueOf(file.length()));
        prd.a().a(1);
        lkr.b().sendComand(b(file), new SendCallback() { // from class: qgi.4
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                prd.a().a(0);
                if (i == 500000) {
                    return;
                }
                LogUtil.a("SyncMedalTask", "SendMessageCallback code ", Integer.valueOf(i));
                if (i != 207) {
                    qgi.this.c(201, false);
                } else {
                    qgi.this.c(200, true);
                    LogUtil.a("SyncMedalTask", "lightMedalsEnd, isDeleteMedalFile == ", Boolean.valueOf(qgi.this.e(strB)));
                }
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
                if (j % 10 == 0) {
                    LogUtil.a("SyncMedalTask", "SendFileCallback count ", Long.valueOf(j));
                }
                prd.a().a(1);
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("SyncMedalTask", "onFileTransferReport transferWay: ", str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, final boolean z) {
        obb obbVarD = d(3);
        obbVarD.e(i);
        obbVarD.e(this.f46168b);
        lkr.b().sendComand(e(obbVarD), new qgg.b(new ResponseCallback<Integer>() { // from class: qgi.2
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onResult(int i2, Integer num) {
                if (i2 == 207) {
                    qgi.this.f46178a = z;
                }
                qgi.this.f46179c.countDown();
            }
        }));
    }
}
