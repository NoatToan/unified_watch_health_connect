package defpackage;

import android.text.TextUtils;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class qge extends qgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f46158a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f46159c;
    private boolean d;

    public qge(oaw oawVar) {
        super(oawVar);
        this.d = false;
        this.f46158a = false;
    }

    @Override // defpackage.qgg
    public boolean b(oaw oawVar) {
        LogUtil.a("LightMedalTask", "onTaskStart");
        if (oawVar instanceof obb) {
            return j(oawVar);
        }
        return e(oawVar);
    }

    private boolean j(oaw oawVar) {
        if (!(oawVar instanceof obb)) {
            return false;
        }
        this.d = false;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        obb obbVarA = a(oawVar);
        if (obbVarA == null) {
            LogUtil.j("LightMedalTask", "SendStartSuccess sendMessage is null.");
            return false;
        }
        lkr.b().sendComand(e(obbVarA), new qgg.b(new ResponseCallback<Integer>() { // from class: qge.1
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResult(int i, Integer num) {
                if (i == 207) {
                    qge.this.d = true;
                }
                countDownLatch.countDown();
            }
        }));
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("LightMedalTask", "isSendStartSuccess catch InterruptedException");
        }
        return this.d;
    }

    private boolean e(oaw oawVar) {
        this.f46158a = false;
        this.f46159c = new CountDownLatch(1);
        i(oawVar);
        try {
            this.f46159c.await(30L, TimeUnit.MINUTES);
        } catch (InterruptedException unused) {
            LogUtil.e("LightMedalTask", "LightMedalSuccess catch InterruptedException");
        }
        return this.f46158a;
    }

    private void i(oaw oawVar) {
        if (!(oawVar instanceof oaz)) {
            this.f46159c.countDown();
            return;
        }
        final oaz oazVar = (oaz) oawVar;
        if (oazVar.c() == 2) {
            LogUtil.j("LightMedalTask", "ReceiveMessage is end");
            this.f46158a = true;
            if (oazVar.a() != 200) {
                LogUtil.e("LightMedalTask", "startLightMedal sync fail! code ", Integer.valueOf(oazVar.a()));
                this.f46158a = false;
            }
            this.f46159c.countDown();
            return;
        }
        axa.a().obtainCurrentMedalGainStatus(oazVar.i()).addOnSuccessListener(new OnSuccessListener<ArrayList<our>>() { // from class: qge.5
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ArrayList<our> arrayList) throws Throwable {
                if (!njy.e(arrayList)) {
                    qge.this.e(oazVar.b(), arrayList);
                } else {
                    LogUtil.j("LightMedalTask", "CurrentMedalGainList is empty.");
                    qge.this.e(201, false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, ArrayList<our> arrayList) throws Throwable {
        final String strC = xjh.c(xjh.e, i, arrayList, a());
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("LightMedalTask", "ZipPath isEmpty!");
            e(201, false);
        } else {
            lkr.b().sendComand(b(new File(strC)), new qgg.b(new ResponseCallback<Integer>() { // from class: qge.3
                @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResult(int i2, Integer num) {
                    if (i2 == 207) {
                        qge.this.e(200, true);
                    } else {
                        qge.this.e(201, false);
                    }
                    LogUtil.a("LightMedalTask", "lightMedalsEnd, isDeleteMedalFile == ", Boolean.valueOf(qge.this.e(strC)));
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, final boolean z) {
        obb obbVarD = d(2);
        obbVarD.e(i);
        obbVarD.e(this.f46168b);
        lkr.b().sendComand(e(obbVarD), new qgg.b(new ResponseCallback<Integer>() { // from class: qge.2
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(int i2, Integer num) {
                if (i2 == 207) {
                    qge.this.f46158a = z;
                }
                qge.this.f46159c.countDown();
            }
        }));
    }
}
