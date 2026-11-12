package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class nx extends jr<com.huawei.openalliance.ad.views.interfaces.k> implements om<com.huawei.openalliance.ad.views.interfaces.k> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19792c;
    private com.huawei.openalliance.ad.inter.data.i d;
    private int e;
    private int f;

    @Override // com.huawei.openalliance.ad.om
    public void a() {
    }

    @Override // com.huawei.openalliance.ad.om
    public boolean c() {
        if (!com.huawei.openalliance.ad.utils.dk.g() || this.f19383a == null) {
            return false;
        }
        return "3".equalsIgnoreCase(this.f19383a.af());
    }

    @Override // com.huawei.openalliance.ad.om
    public void c(com.huawei.openalliance.ad.inter.data.i iVar) {
        this.d = iVar;
        this.f19383a = pw.a(iVar);
        Context context = this.f19792c;
        this.f19384b = new pc(context, new tb(context), this.f19383a);
    }

    @Override // com.huawei.openalliance.ad.om
    public boolean b(com.huawei.openalliance.ad.inter.data.i iVar) {
        AppInfo appInfo = iVar.getAppInfo();
        return com.huawei.openalliance.ad.utils.bi.e(iVar.I()) && !com.huawei.openalliance.ad.utils.k.a(this.f19792c, appInfo == null ? "" : appInfo.getPackageName());
    }

    @Override // com.huawei.openalliance.ad.om
    public boolean b(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        return com.huawei.openalliance.ad.utils.bi.a(contentRecord.D());
    }

    @Override // com.huawei.openalliance.ad.om
    public void b(String str, com.huawei.openalliance.ad.inter.data.i iVar, final IRewardAdStatusListener iRewardAdStatusListener) {
        if (TextUtils.isEmpty(str) || iVar == null || iRewardAdStatusListener == null) {
            hw.c("RewardAdPresenter", "directReward, param invalid.");
            return;
        }
        if (iVar.ag()) {
            hw.b("RewardAdPresenter", "hasRewarded, skip reward.");
            return;
        }
        iVar.h(true);
        final ContentRecord contentRecordA = pw.a(iVar);
        d().setContentRecord(contentRecordA);
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nx.2
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(nx.this.f19792c).e(contentRecordA);
                iRewardAdStatusListener.onRewarded();
            }
        });
        a(str, contentRecordA, iVar);
    }

    @Override // com.huawei.openalliance.ad.om
    public void b(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.huawei.openalliance.ad.utils.o.a(new Runnable() { // from class: com.huawei.openalliance.ad.nx.3
            @Override // java.lang.Runnable
            public void run() {
                File file = new File(str);
                if (com.huawei.openalliance.ad.utils.ai.d(file)) {
                    VideoInfo videoInfoT = nx.this.f19383a == null ? null : nx.this.f19383a.T();
                    if (videoInfoT == null || !com.huawei.openalliance.ad.utils.ai.a(videoInfoT.g(), file)) {
                        hw.b("RewardAdPresenter", "delete invalid cacheFile.");
                        com.huawei.openalliance.ad.utils.ai.a(nx.this.f19792c, str, "normal");
                    }
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.om
    public void b() {
        this.f19384b.b();
    }

    @Override // com.huawei.openalliance.ad.om
    public boolean a(String str, int i) {
        if (TextUtils.isEmpty(str) || com.huawei.openalliance.ad.utils.dg.l(str)) {
            this.f = 0;
            return false;
        }
        if (this.e == i) {
            this.f++;
        } else {
            this.f = 0;
            this.e = i;
        }
        return this.f > 25;
    }

    @Override // com.huawei.openalliance.ad.om
    public boolean a(com.huawei.openalliance.ad.inter.data.i iVar) {
        if (iVar == null) {
            return false;
        }
        return com.huawei.openalliance.ad.utils.bi.d(iVar.I());
    }

    @Override // com.huawei.openalliance.ad.om
    public boolean a(int i, MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar == null) {
            return false;
        }
        iVar.e(true);
        hw.a("RewardAdPresenter", "begin to deal click, clickSource: %s", Integer.valueOf(i));
        HashMap map = new HashMap();
        map.put("appId", this.d.O());
        map.put("thirdId", this.d.N());
        map.put(AdShowExtras.DOWNLOAD_SOURCE, String.valueOf(5));
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.f19792c, this.f19383a, map);
        boolean zA = aVarA.a();
        if (zA) {
            a(aVarA, i, materialClickInfo);
        }
        return zA;
    }

    @Override // com.huawei.openalliance.ad.om
    public void a(boolean z) {
        if (this.f19384b == null) {
            return;
        }
        this.f19384b.b(z);
    }

    @Override // com.huawei.openalliance.ad.om
    public void a(String str, com.huawei.openalliance.ad.inter.data.i iVar, IRewardAdStatusListener iRewardAdStatusListener) {
        if (iVar == null || TextUtils.isEmpty(str)) {
            hw.c("RewardAdPresenter", "invalid status");
            return;
        }
        hw.b("RewardAdPresenter", "notifyReward, condition:%s", str);
        if (iVar.ag()) {
            return;
        }
        if ("1".equals(str) || str.equals(iVar.af()) || "-1".equals(str)) {
            hw.a("RewardAdPresenter", "onAdRewarded, condition: %s", str);
            b(str, iVar, iRewardAdStatusListener);
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.nx.1
                @Override // java.lang.Runnable
                public void run() {
                    nx.this.d().c();
                }
            });
        }
    }

    public void a(String str, ContentRecord contentRecord, com.huawei.openalliance.ad.inter.data.i iVar) {
        Context context = this.f19792c;
        pc pcVar = new pc(context, new tb(context), contentRecord);
        hw.a("RewardAdPresenter", "onAdRewarded, createEvent start:%s", str);
        pcVar.a(iVar.k(), iVar.l(), "");
    }

    @Override // com.huawei.openalliance.ad.om
    public void a(String str, ContentRecord contentRecord) {
        hw.b("RewardAdPresenter", "report Type is " + str);
        new com.huawei.openalliance.ad.analysis.i(this.f19792c).d(contentRecord, str);
    }

    @Override // com.huawei.openalliance.ad.om
    public void a(long j, int i, Integer num) {
        String strF = f();
        com.huawei.openalliance.ad.inter.data.i iVar = this.d;
        if (iVar != null) {
            hw.a("RewardAdPresenter", "slotId: %s, contentId: %s, slot pos: %s", iVar.W(), this.d.getContentId(), strF);
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(Long.valueOf(j)).a(Integer.valueOf(i)).d(strF).e(g()).b(num);
        this.f19384b.a(c0229a.a());
    }

    @Override // com.huawei.openalliance.ad.om
    public String a(int i, int i2, com.huawei.openalliance.ad.inter.data.i iVar) {
        Resources resources = this.f19792c.getResources();
        if (iVar.ag()) {
            return i > 0 ? String.format(Locale.ENGLISH, "%s | %s", resources.getQuantityString(R.plurals.hiad_reward_countdown, i, Integer.valueOf(i)), resources.getString(R.string.hiad_reward_awarded_success)) : resources.getString(R.string.hiad_reward_awarded_success);
        }
        return String.format(Locale.ENGLISH, "%s | %s", resources.getQuantityString(R.plurals.hiad_reward_countdown, i, Integer.valueOf(i)), resources.getQuantityString(R.plurals.hiad_reward_before_rw_time_countdown, i2, Integer.valueOf(i2)));
    }

    @Override // com.huawei.openalliance.ad.om
    public View a(IRemoteCreator iRemoteCreator, by byVar, ContentRecord contentRecord, com.huawei.openalliance.ad.inter.data.i iVar) {
        if (iRemoteCreator != null && contentRecord != null) {
            String strB = com.huawei.openalliance.ad.utils.bk.b(AdContentData.a(this.f19792c, contentRecord));
            Bundle bundle = new Bundle();
            bundle.putBinder(ParamConstants.Param.CONTEXT, (IBinder) ObjectWrapper.wrap(this.f19792c));
            bundle.putString("content", strB);
            bundle.putInt("sdkVersion", 30484300);
            bundle.putBoolean("isMute", iVar.ad());
            bundle.putBoolean(ParamConstants.RewardCfg.REWARDED, iVar.ag());
            bundle.putBoolean("alertSwitch", iVar.ak());
            bundle.putInt("audioFocusType", iVar.al());
            try {
                View view = (View) ObjectWrapper.unwrap(iRemoteCreator.newRewardTemplateView(bundle, byVar));
                if (view == null) {
                    hw.c("RewardAdPresenter", "remote view is null.");
                    return null;
                }
                iRemoteCreator.bindData(ObjectWrapper.wrap(view), strB);
                hw.b("RewardAdPresenter", "bind data end, contentId: %s", contentRecord.o());
                return view;
            } catch (Throwable th) {
                hw.c("RewardAdPresenter", "create template view ex: %s", th.getClass().getSimpleName());
            }
        }
        return null;
    }

    @Override // com.huawei.openalliance.ad.om
    public int a(ContentRecord contentRecord, int i) {
        boolean zB = b(contentRecord);
        int I = (contentRecord == null || contentRecord.j() == null) ? 2 : contentRecord.j().I();
        if (!zB || I < 1 || I > 5 || ((I == 1 || I == 5) && (contentRecord == null || contentRecord.ag() == null || TextUtils.isEmpty(contentRecord.ag().getIconUrl())))) {
            return 2;
        }
        hw.b("RewardAdPresenter", "request orientation %s", Integer.valueOf(i));
        if (com.huawei.openalliance.ad.utils.dk.a(i) || I == 1) {
            return I;
        }
        return 2;
    }

    public static boolean a(ContentRecord contentRecord) {
        return contentRecord != null && contentRecord.j() != null && "1".equals(contentRecord.af()) && "4".equals(contentRecord.j().J());
    }

    private void a(com.huawei.openalliance.ad.uriaction.interfaces.a aVar, int i, MaterialClickInfo materialClickInfo) {
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar2 = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar2.b(aVar.c()).a(Integer.valueOf(i)).a(materialClickInfo);
        this.f19384b.a(aVar2.a());
    }

    public static int a(Context context, int i) {
        int iCi = (fp.b(context).ci() * i) / 100000;
        if (iCi <= 0) {
            iCi = (i * 90) / 100000;
        }
        return Math.min(iCi, 27);
    }

    public nx(Context context, com.huawei.openalliance.ad.views.interfaces.k kVar) {
        this.f19792c = context;
        a(kVar);
        this.f19384b = new pc(context, new tb(context));
    }
}
