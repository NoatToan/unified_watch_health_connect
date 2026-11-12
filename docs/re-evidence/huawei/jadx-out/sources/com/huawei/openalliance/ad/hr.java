package com.huawei.openalliance.ad;

import android.text.TextUtils;
import android.widget.TextView;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class hr implements AppDownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f18904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f18905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PPSRewardView f18906c;
    private String d;
    private String e;
    private ContentRecord f;
    private boolean g;
    private boolean h;
    private int i = 2;

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onAppOpen(AppInfo appInfo) {
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onAppOpen(String str) {
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onDownloadProgress(AppInfo appInfo, int i) {
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onUserCancel(AppInfo appInfo) {
    }

    @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
    public void onStatusChanged(AppStatus appStatus, AppInfo appInfo) {
        a(appStatus, appInfo);
    }

    private void a(TextView[] textViewArr, ContentRecord contentRecord, boolean[] zArr, String str) {
        this.f = contentRecord;
        this.e = str;
        try {
            if (!com.huawei.openalliance.ad.utils.bm.a(textViewArr) && textViewArr.length >= this.i) {
                this.f18904a = textViewArr[0];
                this.f18905b = textViewArr[1];
            }
            if (zArr != null && zArr.length >= this.i) {
                this.g = zArr[0];
                this.h = zArr[1];
            }
        } catch (Throwable th) {
            hw.d("jumpTextListener", "view or jumpListenerFlag is not expected, %s", th.getClass().getSimpleName());
        }
        if (contentRecord == null || contentRecord.ag() == null) {
            return;
        }
        this.d = contentRecord.ag().getPackageName();
    }

    private void a(AppStatus appStatus, AppInfo appInfo) {
        TextView textView;
        if (appInfo == null || TextUtils.isEmpty(appInfo.getPackageName()) || !appInfo.getPackageName().equals(this.d)) {
            return;
        }
        PPSRewardView pPSRewardView = this.f18906c;
        if (pPSRewardView != null && pPSRewardView.getEndCardDisPlaying()) {
            this.f18906c.setBottomViewVisibility(8);
        } else {
            if (appStatus != AppStatus.INSTALLED || (textView = this.f18904a) == null || this.f18905b == null) {
                return;
            }
            final String strA = com.huawei.openalliance.ad.utils.c.a(this.f, textView.getContext(), this.g);
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.hr.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!hr.this.h || TextUtils.isEmpty(strA)) {
                        hr.this.f18904a.setVisibility(8);
                        hr hrVar = hr.this;
                        hrVar.a(hrVar.f18905b, hr.this.e);
                    } else {
                        hr.this.f18904a.setText(strA);
                        hr.this.f18905b.setVisibility(8);
                        hr.this.f18904a.setVisibility(0);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TextView textView, String str) {
        if (!this.h || TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    public hr(TextView[] textViewArr, ContentRecord contentRecord, boolean[] zArr, String str) {
        a(textViewArr, contentRecord, zArr, str);
    }

    public hr(TextView[] textViewArr, ContentRecord contentRecord, PPSRewardView pPSRewardView, boolean[] zArr, String str) {
        a(textViewArr, contentRecord, zArr, str);
        this.f18906c = pPSRewardView;
    }
}
