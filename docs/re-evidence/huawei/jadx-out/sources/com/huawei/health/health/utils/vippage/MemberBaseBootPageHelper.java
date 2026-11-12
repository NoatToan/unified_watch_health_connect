package com.huawei.health.health.utils.vippage;

import android.content.Context;
import android.text.TextUtils;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.handler.HandlerExecutor;
import defpackage.fcd;
import defpackage.lsy;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MemberBaseBootPageHelper {
    protected fcd mBootPageDialog;
    protected Context mContext;

    protected abstract void configBootPage();

    protected abstract String getSharePreferenceString();

    public MemberBaseBootPageHelper(Context context) {
        this.mContext = context;
    }

    public void showBootPage() {
        lsy.a(new Runnable() { // from class: com.huawei.health.health.utils.vippage.MemberBaseBootPageHelper.5
            @Override // java.lang.Runnable
            public void run() {
                String sharePreferenceString = MemberBaseBootPageHelper.this.getSharePreferenceString();
                String strE = SharedPreferenceManager.e(MemberBaseBootPageHelper.this.mContext, String.valueOf(PrebakedEffectId.RT_AWARD), sharePreferenceString);
                if (strE == null || TextUtils.isEmpty(strE) || String.valueOf(true).equals(strE)) {
                    MemberBaseBootPageHelper.this.showBootPageInner();
                    SharedPreferenceManager.e(MemberBaseBootPageHelper.this.mContext, String.valueOf(PrebakedEffectId.RT_AWARD), sharePreferenceString, String.valueOf(false), new StorageParams());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBootPageInner() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.health.utils.vippage.MemberBaseBootPageHelper.4
                @Override // java.lang.Runnable
                public void run() {
                    MemberBaseBootPageHelper.this.showBootPageInner();
                }
            });
            return;
        }
        configBootPage();
        fcd fcdVar = this.mBootPageDialog;
        if (fcdVar != null) {
            fcdVar.show();
        }
    }
}
