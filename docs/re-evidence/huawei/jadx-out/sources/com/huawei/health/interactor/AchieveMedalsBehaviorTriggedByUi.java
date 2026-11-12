package com.huawei.health.interactor;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.TrackData;
import defpackage.njy;
import defpackage.oru;
import defpackage.osa;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AchieveMedalsBehaviorTriggedByUi extends AchieveMedalsInteractors {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f7161c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f7162a;

    public AchieveMedalsBehaviorTriggedByUi(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override // com.huawei.health.interactor.AchieveMedalsInteractors
    public void behave() {
        LogUtil.a("TiggeredByWear_AchieveMedalsInteractors", "enter behave");
        HiHealthNativeApi.a(this.mContext).subscribeHiHealthData(4, new HiSubscribeListener() { // from class: com.huawei.health.interactor.AchieveMedalsBehaviorTriggedByUi.4
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                if (list == null || list.isEmpty()) {
                    return;
                }
                AchieveMedalsBehaviorTriggedByUi.this.f7162a = list;
                LogUtil.a("TiggeredByWear_AchieveMedalsInteractors", "register wear single run data success");
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                LogUtil.a("TiggeredByWear_AchieveMedalsInteractors", "wear single run data onChange");
                if (SystemClock.elapsedRealtime() - AchieveMedalsBehaviorTriggedByUi.f7161c < 5000) {
                    return;
                }
                long unused = AchieveMedalsBehaviorTriggedByUi.f7161c = SystemClock.elapsedRealtime();
                if (i != 4) {
                    return;
                }
                AchieveMedalsBehaviorTriggedByUi.this.b();
            }
        });
    }

    public void b() {
        readSingleTrackData(new IBaseResponseCallback() { // from class: com.huawei.health.interactor.AchieveMedalsBehaviorTriggedByUi.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("TiggeredByWear_AchieveMedalsInteractors", "register single track data to read finish and onResponse enter");
                if (njy.b(obj, HiHealthData.class)) {
                    List<HiHealthData> list = (List) obj;
                    LogUtil.a("TiggeredByWear_AchieveMedalsInteractors", "thie size of singleMovementRecords is ", Integer.valueOf(list.size()));
                    ArrayList<TrackData> arrayListSearchSingleRunLongest = AchieveMedalsBehaviorTriggedByUi.this.searchSingleRunLongest(list);
                    if (arrayListSearchSingleRunLongest.size() != 0) {
                        AchieveMedalsBehaviorTriggedByUi.this.c();
                        oru oruVarA = oru.a(AchieveMedalsBehaviorTriggedByUi.this.mContext);
                        if (oruVarA.getAdapter() == null) {
                            oru.a(AchieveMedalsBehaviorTriggedByUi.this.mContext).setAdapter(new PluginAchieveAdapterImpl());
                        }
                        LogUtil.a("TiggeredByWear_AchieveMedalsInteractors", "toReadSingleTrackData sendTrackData size= ", Integer.valueOf(arrayListSearchSingleRunLongest.size()));
                        oruVarA.getAdapter().sendTrackData(AchieveMedalsBehaviorTriggedByUi.this.mContext, arrayListSearchSingleRunLongest);
                        return;
                    }
                    LogUtil.a("TiggeredByWear_AchieveMedalsInteractors", "no single run track record!");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        osa.b(this.mContext, "_syncWearData", "CHANGE");
    }

    public boolean a() {
        return TextUtils.isEmpty(osa.e(this.mContext, "_syncWearData"));
    }

    @Override // com.huawei.health.interactor.AchieveMedalsInteractors
    public void unRegister() {
        if (njy.b(this.f7162a)) {
            HiHealthNativeApi.a(this.mContext).unSubscribeHiHealthData(this.f7162a, new HiUnSubscribeListener() { // from class: fnk
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("TiggeredByWear_AchieveMedalsInteractors", "isSuccess=", Boolean.valueOf(z));
                }
            });
        }
    }
}
