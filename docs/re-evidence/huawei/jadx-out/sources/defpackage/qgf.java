package defpackage;

import android.text.TextUtils;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class qgf extends qgg {
    private CountDownLatch d;
    private boolean e;

    public qgf(oaw oawVar) {
        super(oawVar);
        this.e = false;
    }

    @Override // defpackage.qgg
    public boolean b(oaw oawVar) {
        LogUtil.a("LightMedalListTask", "onTaskStart");
        return e(oawVar);
    }

    private boolean e(oaw oawVar) {
        this.e = false;
        this.d = new CountDownLatch(1);
        f(oawVar);
        try {
            this.d.await(30L, TimeUnit.MINUTES);
        } catch (InterruptedException unused) {
            LogUtil.e("LightMedalListTask", "LightMedalListSuccess catch InterruptedException");
        }
        return this.e;
    }

    private void f(oaw oawVar) {
        if (!(oawVar instanceof oaz)) {
            this.d.countDown();
            return;
        }
        final oaz oazVar = (oaz) oawVar;
        if (oazVar.c() == 2) {
            LogUtil.j("LightMedalListTask", "ReceiveMessage is end");
            this.e = true;
            if (oazVar.a() != 200) {
                LogUtil.e("LightMedalListTask", "startLightMedalList sync fail! code ", Integer.valueOf(oazVar.a()));
                this.e = false;
            }
            this.d.countDown();
            return;
        }
        if (oazVar.a() == 401) {
            LogUtil.j("LightMedalListTask", "startLightMedalList request too fast!");
            a(401, false);
        } else {
            LogUtil.a("LightMedalListTask", "LightTask obtainMedalGainStatus start");
            axa.a().obtainMedalGainStatus(oazVar.i()).addOnSuccessListener(new OnSuccessListener<ArrayList<our>>() { // from class: qgf.2
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ArrayList<our> arrayList) throws Throwable {
                    if (!njy.e(arrayList)) {
                        qgf.this.a(oazVar.b(), (ArrayList<our>) qgf.this.b(arrayList));
                    } else {
                        LogUtil.j("LightMedalListTask", "CurrentMedalGainList is empty.");
                        qgf.this.a(201, false);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<our> b(ArrayList<our> arrayList) {
        ArrayList<our> arrayList2 = new ArrayList<>();
        for (our ourVar : arrayList) {
            if (!"".equals(osz.e(osa.e(BaseApplication.getContext(), "_medalTextureDownload"), ourVar.b(), ourVar.a()) ? osz.c(ourVar.b()) : "") && ouk.a(BaseApplication.getContext(), ourVar.b())) {
                arrayList2.add(ourVar);
            }
        }
        LogUtil.a("LightMedalListTask", "check3DList currentMedalGainList=", arrayList2.toString());
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, ArrayList<our> arrayList) throws Throwable {
        final String strC = xjh.c(xjh.e, i, arrayList, a());
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("LightMedalListTask", "ZipPath isEmpty!");
            a(201, false);
        } else {
            prd.a().a(1);
            lkr.b().sendComand(b(new File(strC)), new qgg.b(new ResponseCallback<Integer>() { // from class: qgf.5
                @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onResult(int i2, Integer num) {
                    prd.a().a(0);
                    if (i2 == 207) {
                        qgf.this.a(200, true);
                    } else {
                        qgf.this.a(201, false);
                    }
                    LogUtil.a("LightMedalListTask", "lightMedalsEnd, isDeleteMedalFile == ", Boolean.valueOf(qgf.this.e(strC)));
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, final boolean z) {
        obb obbVarD = d(1);
        obbVarD.e(i);
        obbVarD.e(this.f46168b);
        lkr.b().sendComand(e(obbVarD), new qgg.b(new ResponseCallback<Integer>() { // from class: qgf.1
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(int i2, Integer num) {
                if (i2 == 207) {
                    qgf.this.e = z;
                }
                qgf.this.d.countDown();
            }
        }));
    }
}
