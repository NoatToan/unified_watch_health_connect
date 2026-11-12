package defpackage;

import android.text.TextUtils;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.utils.ResponseCallback;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class qgh extends qgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f46172a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f46173c;
    private boolean d;

    public qgh(oaw oawVar) {
        super(oawVar);
        this.d = false;
        this.f46173c = false;
    }

    @Override // defpackage.qgg
    public boolean b(oaw oawVar) {
        if (oawVar instanceof obb) {
            return h(oawVar);
        }
        return e(oawVar);
    }

    private boolean h(oaw oawVar) {
        if (!(oawVar instanceof obb)) {
            return false;
        }
        this.d = false;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        d(oawVar, countDownLatch);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("LightMedalMessageTask", "isSendStartSuccess catch InterruptedException");
        }
        return this.d;
    }

    private void d(final oaw oawVar, final CountDownLatch countDownLatch) {
        String strE = oawVar.e();
        LogUtil.a("LightMedalMessageTask", "isSendMedalSuccess medalId == ", strE);
        Task<ouq> taskObtainMedalInfo = axa.a().obtainMedalInfo(strE);
        if (taskObtainMedalInfo == null) {
            LogUtil.j("LightMedalMessageTask", "isSendMedalSuccess getMedalConfig is null");
            countDownLatch.countDown();
            this.d = false;
            return;
        }
        taskObtainMedalInfo.addOnSuccessListener(new OnSuccessListener<ouq>() { // from class: qgh.1
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ouq ouqVar) {
                if (ouqVar != null) {
                    qgh.this.b(oawVar, ouqVar, countDownLatch);
                } else {
                    LogUtil.j("LightMedalMessageTask", "isSendMedalSuccess medalConfigMap is null");
                    countDownLatch.countDown();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(oaw oawVar, ouq ouqVar, final CountDownLatch countDownLatch) {
        oba obaVarA = a(oawVar, ouqVar);
        LogUtil.a("LightMedalMessageTask", "isSendMedalSuccess medalConfig == ", obaVarA.toString());
        lku.a().sendComand(c(obaVarA), new qgg.b(new ResponseCallback<Integer>() { // from class: qgh.5
            @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onResult(int i, Integer num) {
                LogUtil.a("LightMedalMessageTask", "sendMessageToDevice errCode：", Integer.valueOf(i));
                if (i == 207) {
                    qgh.this.d = true;
                    LogUtil.a("LightMedalMessageTask", "sendMessageToDevice success.");
                }
                countDownLatch.countDown();
            }
        }));
    }

    private oba a(oaw oawVar, ouq ouqVar) {
        String strC;
        oba obaVar = new oba();
        obaVar.g(oawVar.d());
        obaVar.f(this.f46168b);
        obaVar.e(5);
        obaVar.c(1);
        String strA = ouqVar.a();
        if (!TextUtils.isEmpty(strA)) {
            strA = strA.replace("/n", System.lineSeparator());
        }
        obaVar.a(strA);
        obaVar.b(a(ouqVar.b()));
        obaVar.c(ouqVar.c());
        obaVar.b(ouqVar.e());
        obaVar.e(ouqVar.h());
        obaVar.d(1);
        obaVar.d("huaweischeme://healthapp/router/achievement?module=medal&pName=com.huawei.health&from=4&id=" + ouqVar.c());
        if (osz.e(osa.e(BaseApplication.getContext(), "_medalTextureDownload"), ouqVar.c(), ouqVar.d())) {
            strC = osz.c(ouqVar.c());
            LogUtil.a("LightMedalMessageTask", "Support path=", strC);
        } else {
            strC = "";
        }
        if ("".equals(strC) || !ouk.a(BaseApplication.getContext(), ouqVar.c())) {
            LogUtil.j("LightMedalMessageTask", "Support2D IMG");
            obaVar.b(0);
            return obaVar;
        }
        LogUtil.j("LightMedalMessageTask", "Support3D medal");
        obaVar.b(1);
        return obaVar;
    }

    private long a(String str) {
        LogUtil.a("LightMedalMessageTask", "getGainTime gainTime == ", str);
        try {
            long jCurrentTimeMillis = (TextUtils.isEmpty(str) ? System.currentTimeMillis() : Long.parseLong(str)) / 1000;
            LogUtil.a("LightMedalMessageTask", "getGainTime time == ", Long.valueOf(jCurrentTimeMillis));
            return jCurrentTimeMillis;
        } catch (NumberFormatException unused) {
            LogUtil.e("LightMedalMessageTask", "setGainTime NumberFormatException");
            return 0L;
        }
    }

    private boolean e(oaw oawVar) throws Throwable {
        this.f46173c = false;
        this.f46172a = new CountDownLatch(1);
        f(oawVar);
        try {
            this.f46172a.await(30L, TimeUnit.MINUTES);
        } catch (InterruptedException unused) {
            LogUtil.e("LightMedalMessageTask", "LightMedalSuccess catch InterruptedException");
        }
        return this.f46173c;
    }

    private void f(oaw oawVar) throws Throwable {
        if (!(oawVar instanceof obd)) {
            this.f46172a.countDown();
            return;
        }
        obd obdVar = (obd) oawVar;
        int iC = obdVar.c();
        int iA = obdVar.a();
        if (iC == 2) {
            LogUtil.j("LightMedalMessageTask", "SendMedalSource end! code == ", Integer.valueOf(iA));
            this.f46172a.countDown();
        } else {
            LogUtil.j("LightMedalMessageTask", "startSendMedalSource.");
            c(obdVar);
        }
    }

    private void c(obd obdVar) throws Throwable {
        String strA;
        String strI = obdVar.i();
        if (obdVar.b() == 3) {
            strA = xjh.b(obdVar.d(), strI);
        } else {
            strA = xjh.a(obdVar.d(), strI);
        }
        LogUtil.a("LightMedalMessageTask", "syncingToDevice: defaultImgPath: ", strA);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("LightMedalMessageTask", "sendSourceToDevice File unExists ,medalId ", strI);
            this.f46172a.countDown();
        } else {
            File file = new File(strA);
            LogUtil.a("LightMedalMessageTask", "syncingToDevice: defaultImgFileLength -> ", Long.valueOf(file.length()));
            final String strD = obdVar.d();
            lku.a().sendComand(b(file), new qgg.b(new ResponseCallback<Integer>() { // from class: qgh.4
                @Override // com.huawei.ui.commonui.linechart.utils.ResponseCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onResult(int i, Integer num) {
                    LogUtil.j("LightMedalMessageTask", "sendSourceToDevice errCode:", Integer.valueOf(i));
                    if (i == 207) {
                        LogUtil.j("LightMedalMessageTask", "sendSourceToDevice SEND_SUCCEED!session: ", strD);
                    }
                    LogUtil.a("LightMedalMessageTask", "sendSourceToDevice, isDeleteMedalFile == ", Boolean.valueOf(qgh.this.e(xjh.d)));
                    qgh.this.f46172a.countDown();
                }
            }));
        }
    }
}
