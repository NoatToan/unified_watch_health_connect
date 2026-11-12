package com.huawei.ui.homehealth.functionsetcard.manager.constructor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.manager.constructor.BaseCardConstructor;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.fua;
import defpackage.njy;
import defpackage.sio;
import defpackage.skg;
import defpackage.tfi;
import health.compact.a.HiDateUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes43.dex */
public class PhysiologicalCycleCardConstructor extends BaseCardConstructor {
    private static final int BIRTH_DATE_FOR_AGE = 10000;
    private static final String HUAWEI_GENDER_FEMALE = "1";
    private static final int PHYSIOLOGICAL_CYCLE_AGE_MAX = 55;
    private static final int PHYSIOLOGICAL_CYCLE_AGE_MIN = 16;
    private static final String RELEASE_TAG = "R_PhysiologicalCycleCardConstructor";
    private static final String TAG = "PhysiologicalCycleCardConstructor";
    private boolean mIsCardShow;
    private boolean mIsRegister;
    private boolean mIsSupportPhysiologicalCycle;
    private LocalBroadcastManager mLocalBroadcastManager;
    private BroadcastReceiver mUserInfoBroadcastReceiver;

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public int getShowFlag(Object obj) {
        return 0;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public void subscribeDataChange() {
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public void unSubscribeDataChange() {
    }

    public PhysiologicalCycleCardConstructor(CardConfig cardConfig) {
        super(cardConfig);
        this.mIsRegister = false;
        this.mIsCardShow = false;
        this.mUserInfoBroadcastReceiver = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.functionsetcard.manager.constructor.PhysiologicalCycleCardConstructor.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    LogUtil.j(PhysiologicalCycleCardConstructor.TAG, "mUserInfoBroadcastReceiver onReceive intent is null");
                    return;
                }
                String action = intent.getAction();
                if ("com.huawei.plugin.account.login".equals(action) || "com.huawei.bone.action.FITNESS_USERINFO_UPDATED".equals(action)) {
                    PhysiologicalCycleCardConstructor.this.queryPhysiologicalCycleSwitch();
                }
            }
        };
        boolean z = !Utils.k();
        this.mIsSupportPhysiologicalCycle = z;
        ReleaseLogUtil.d(RELEASE_TAG, "mIsSupportPhysiologicalCycle: ", Boolean.valueOf(z));
        if (this.mIsRegister || this.mUserInfoBroadcastReceiver == null || !this.mIsSupportPhysiologicalCycle || cardConfig == null || cardConfig.getEditFlag() == 1) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.bone.action.FITNESS_USERINFO_UPDATED");
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        this.mLocalBroadcastManager = localBroadcastManager;
        localBroadcastManager.registerReceiver(this.mUserInfoBroadcastReceiver, intentFilter);
        this.mIsRegister = true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.BaseCardConstructor, com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public boolean isSupport(boolean z, int i) {
        super.isSupport(z, i);
        boolean z2 = !Utils.k();
        this.mIsSupportPhysiologicalCycle = z2;
        ReleaseLogUtil.d(RELEASE_TAG, "isSupport mIsSupportPhysiologicalCycle: ", Boolean.valueOf(z2));
        boolean z3 = this.mIsSupportPhysiologicalCycle;
        LogUtil.a(TAG, "isSupport: ", Boolean.valueOf(z3));
        return z3;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public FunctionSetSubCardData createCardReader(Context context) {
        return new skg(context, this.mCardConfig);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.manager.constructor.BaseCardConstructor, com.huawei.health.health.utils.functionsetcard.manager.constructor.CardConstructor
    public void release() {
        if (!this.mIsRegister || this.mLocalBroadcastManager == null || this.mUserInfoBroadcastReceiver == null) {
            return;
        }
        ReleaseLogUtil.d(TAG, "release mUserInfoBroadcastReceiver broadCast start");
        try {
            this.mLocalBroadcastManager.unregisterReceiver(this.mUserInfoBroadcastReceiver);
        } catch (IllegalArgumentException unused) {
            ReleaseLogUtil.d(TAG, "unregisterReceiver crash Illegal");
        }
        this.mIsRegister = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryPhysiologicalCycleSwitch() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcard.manager.constructor.PhysiologicalCycleCardConstructor.2
            @Override // java.lang.Runnable
            public void run() {
                String cardId;
                PhysiologicalCycleCardConstructor.this.mIsCardShow = false;
                if (PhysiologicalCycleCardConstructor.this.mCardConfig != null) {
                    cardId = PhysiologicalCycleCardConstructor.this.mCardConfig.getCardId();
                } else {
                    cardId = "";
                }
                LogUtil.a(PhysiologicalCycleCardConstructor.TAG, "queryPhysiologicalCycleSwitch cardId ", cardId);
                sio sioVarC = sio.c();
                if (sioVarC != null) {
                    PhysiologicalCycleCardConstructor.this.mCardConfig = sioVarC.e(PhysiologicalCycleCardConstructor.TAG, cardId);
                    if (PhysiologicalCycleCardConstructor.this.mCardConfig != null) {
                        if (PhysiologicalCycleCardConstructor.this.mCardConfig.getEditFlag() == 1) {
                            LogUtil.a(PhysiologicalCycleCardConstructor.TAG, "queryPhysiologicalCycleSwitch edit by user");
                            return;
                        }
                        String strJ = tfi.j(BaseApplication.getContext());
                        LogUtil.a(PhysiologicalCycleCardConstructor.TAG, "switchString: ", strJ);
                        if (strJ == null) {
                            PhysiologicalCycleCardConstructor.this.queryHuaweiAccountForPhysiologicalCycleCard();
                            return;
                        }
                        if (strJ.isEmpty()) {
                            PhysiologicalCycleCardConstructor.this.mIsCardShow = true;
                            PhysiologicalCycleCardConstructor physiologicalCycleCardConstructor = PhysiologicalCycleCardConstructor.this;
                            physiologicalCycleCardConstructor.refreshPhysiologicalCycleCard(physiologicalCycleCardConstructor.mIsCardShow);
                            return;
                        }
                        try {
                            int iOptInt = new JSONObject(strJ).optInt("masterSwitch");
                            LogUtil.a(PhysiologicalCycleCardConstructor.TAG, "queryPhysiologicalCycleSwitch masterSwitch ", Integer.valueOf(iOptInt));
                            if (iOptInt == 1) {
                                PhysiologicalCycleCardConstructor.this.mIsCardShow = true;
                                PhysiologicalCycleCardConstructor physiologicalCycleCardConstructor2 = PhysiologicalCycleCardConstructor.this;
                                physiologicalCycleCardConstructor2.refreshPhysiologicalCycleCard(physiologicalCycleCardConstructor2.mIsCardShow);
                                return;
                            }
                        } catch (JSONException unused) {
                            LogUtil.e(PhysiologicalCycleCardConstructor.TAG, "queryPhysiologicalCycleSwitch JSONException");
                        }
                        PhysiologicalCycleCardConstructor.this.queryHuaweiAccountForPhysiologicalCycleCard();
                        return;
                    }
                    LogUtil.j(PhysiologicalCycleCardConstructor.TAG, "queryPhysiologicalCycleSwitch cardConfig is null");
                    return;
                }
                LogUtil.j(PhysiologicalCycleCardConstructor.TAG, "cardManager is null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryHuaweiAccountForPhysiologicalCycleCard() {
        LogUtil.a(TAG, "queryHuaweiAccountForPhysiologicalCycleCard");
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit == null) {
            LogUtil.j(TAG, "logInit is null");
            queryPersonalInformationForPhysiologicalCycleCard();
            return;
        }
        String gender = loginInit.getGender();
        String birthDate = loginInit.getBirthDate();
        LogUtil.a(TAG, "gender: ", gender, ", birthDate: ", birthDate);
        if (fua.s()) {
            if (gender == null) {
                LogUtil.j(TAG, "queryHuaweiAccountForPhysiologicalCycleCard gender is null");
                queryPersonalInformationForPhysiologicalCycleCard();
                return;
            } else {
                refreshPhysiologicalCycleCard("1".equals(gender));
                return;
            }
        }
        if (gender == null || birthDate == null) {
            LogUtil.j(TAG, "queryHuaweiAccountForPhysiologicalCycleCard gender or birthDate is null");
            queryPersonalInformationForPhysiologicalCycleCard();
            return;
        }
        try {
            boolean zEquals = "1".equals(gender);
            int iD = (HiDateUtil.d(System.currentTimeMillis()) / 10000) - (Integer.parseInt(birthDate) / 10000);
            boolean z = false;
            boolean z2 = iD <= 55 && iD >= 16;
            LogUtil.a(TAG, "gender: ", gender, ", age: ", Integer.valueOf(iD), ", isShow: ", Boolean.valueOf(z2 && zEquals));
            if (z2 && zEquals) {
                z = true;
            }
            refreshPhysiologicalCycleCard(z);
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "queryHuaweiAccountForPhysiologicalCycleCard NumberFormatException");
            queryPersonalInformationForPhysiologicalCycleCard();
        }
    }

    private void queryPersonalInformationForPhysiologicalCycleCard() {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: com.huawei.ui.homehealth.functionsetcard.manager.constructor.PhysiologicalCycleCardConstructor.3
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (PhysiologicalCycleCardConstructor.this.mIsCardShow) {
                    LogUtil.j(PhysiologicalCycleCardConstructor.TAG, "queryPersonalInformationForPhysiologicalCycleCard onSuccess card has shown");
                    return;
                }
                if (!(obj instanceof List)) {
                    LogUtil.j(PhysiologicalCycleCardConstructor.TAG, "queryPersonalInformationForPhysiologicalCycleCard onSuccess data instanceof List is false");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.j(PhysiologicalCycleCardConstructor.TAG, "queryPersonalInformationForPhysiologicalCycleCard onSuccess userInfoList is empty");
                    return;
                }
                boolean z = false;
                HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                if (hiUserInfo == null) {
                    LogUtil.j(PhysiologicalCycleCardConstructor.TAG, "queryPersonalInformationForPhysiologicalCycleCard onSuccess hiUserInfo is null");
                    return;
                }
                int age = hiUserInfo.getAge();
                boolean z2 = age <= 55 && age >= 16;
                boolean z3 = hiUserInfo.getGender() == 0;
                if (fua.s()) {
                    PhysiologicalCycleCardConstructor.this.refreshPhysiologicalCycleCard(z3);
                    return;
                }
                PhysiologicalCycleCardConstructor physiologicalCycleCardConstructor = PhysiologicalCycleCardConstructor.this;
                if (z2 && z3) {
                    z = true;
                }
                physiologicalCycleCardConstructor.refreshPhysiologicalCycleCard(z);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j(PhysiologicalCycleCardConstructor.TAG, "queryPersonalInformationForPhysiologicalCycleCard onFailure errCode ", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshPhysiologicalCycleCard(boolean z) {
        String cardId;
        LogUtil.a(TAG, "refreshPhysiologicalCycleCard isShow：", Boolean.valueOf(z));
        if (this.mCardConfig != null && z != this.mCardConfig.isShow()) {
            cardId = this.mCardConfig.getCardId();
        } else {
            cardId = "";
        }
        if (TextUtils.isEmpty(cardId)) {
            LogUtil.j(TAG, "refreshPhysiologicalCycleCard cardId is empty");
        } else {
            LogUtil.a(TAG, "refreshPhysiologicalCycleCard isShow ", Boolean.valueOf(z), " cardId ", cardId);
            insertPhysiologicalCards(cardId, z);
        }
    }

    private void insertPhysiologicalCards(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        sio.c().d(5, arrayList, z);
    }
}
