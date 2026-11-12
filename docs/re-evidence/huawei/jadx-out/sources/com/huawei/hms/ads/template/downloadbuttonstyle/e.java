package com.huawei.hms.ads.template.downloadbuttonstyle;

import android.content.Context;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dr;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.ExtandAppDownloadButtonStyleHm;

/* JADX INFO: loaded from: classes10.dex */
public class e extends com.huawei.hms.ads.template.downloadbuttonstyle.a {
    private RemoteButtonStyleAttr d;

    private boolean a(int i) {
        return (i & 48) == 32;
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    protected void b(Context context) {
        AppDownloadButton appDownloadButton = this.f12838c.get();
        if (appDownloadButton == null) {
            hw.b("RemoteButtonStyle", "btn is null");
            return;
        }
        if (this.d.t() != -111111) {
            appDownloadButton.setMinWidth(this.d.t());
        }
        if (this.d.s() != -111111) {
            appDownloadButton.setMaxWidth(this.d.s());
        }
        appDownloadButton.setPaddingRelative(this.d.w(), this.d.y(), this.d.x(), this.d.z());
        appDownloadButton.setResetWidth(this.d.r());
        appDownloadButton.setFixedWidth(this.d.q());
        appDownloadButton.setFontFamily(this.d.v());
        appDownloadButton.setTextSize(this.d.u());
        appDownloadButton.updateLayoutHeight();
        appDownloadButton.setVisibility(0);
        appDownloadButton.updateLayoutHeight();
        appDownloadButton.refreshStatusAsync(null);
        appDownloadButton.setVisibility(0);
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void a() {
        AppDownloadButton appDownloadButton = this.f12838c.get();
        if (appDownloadButton == null) {
            hw.b("RemoteButtonStyle", "btn is null");
            return;
        }
        boolean zA = a(this.f12836a.getResources().getConfiguration().uiMode);
        boolean zP = dk.p(this.f12836a);
        if (hw.a()) {
            hw.a("RemoteButtonStyle", "mediaUiMode %s, emui9DarkMode %s, isNight %s", Integer.valueOf(this.f12837b), Boolean.valueOf(zP), Boolean.valueOf(zA));
        }
        if (zA || 1 == this.f12837b || zP) {
            appDownloadButton.setAppDownloadButtonStyle(new a(this.f12836a, this.d));
        } else {
            appDownloadButton.setAppDownloadButtonStyle(new b(this.f12836a, this.d));
        }
    }

    protected static class a extends ExtandAppDownloadButtonStyleHm {
        public a(Context context, RemoteButtonStyleAttr remoteButtonStyleAttr) {
            super(context);
            this.normalStyle.setBackground(remoteButtonStyleAttr.h());
            this.normalStyle.setTextSize((int) remoteButtonStyleAttr.u());
            this.normalStyle.setTextColor(remoteButtonStyleAttr.k());
            this.processingStyle.setBackground(dr.a(remoteButtonStyleAttr.l()));
            this.processingStyle.setTextSize((int) remoteButtonStyleAttr.u());
            this.processingStyle.setTextColor(remoteButtonStyleAttr.m());
            this.installingStyle.setBackground(remoteButtonStyleAttr.n());
            this.installingStyle.setTextSize((int) remoteButtonStyleAttr.u());
            this.installingStyle.setTextColor(remoteButtonStyleAttr.o());
            this.cancelBtnStyle.setBackground(remoteButtonStyleAttr.j());
            this.cancelBtnDrawable = remoteButtonStyleAttr.p() == null ? context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn_dark) : remoteButtonStyleAttr.p();
        }
    }

    protected static class b extends ExtandAppDownloadButtonStyleHm {
        public b(Context context, RemoteButtonStyleAttr remoteButtonStyleAttr) {
            super(context);
            this.normalStyle.setBackground(remoteButtonStyleAttr.a());
            this.normalStyle.setTextSize((int) remoteButtonStyleAttr.u());
            this.normalStyle.setTextColor(remoteButtonStyleAttr.b());
            this.processingStyle.setBackground(dr.a(remoteButtonStyleAttr.c()));
            this.processingStyle.setTextSize((int) remoteButtonStyleAttr.u());
            this.processingStyle.setTextColor(remoteButtonStyleAttr.d());
            this.installingStyle.setBackground(remoteButtonStyleAttr.e());
            this.installingStyle.setTextSize((int) remoteButtonStyleAttr.u());
            this.installingStyle.setTextColor(remoteButtonStyleAttr.f());
            this.cancelBtnStyle.setBackground(remoteButtonStyleAttr.i());
            this.cancelBtnDrawable = remoteButtonStyleAttr.g() == null ? context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn) : remoteButtonStyleAttr.g();
        }
    }

    public e(Context context, AppDownloadButton appDownloadButton, RemoteButtonStyleAttr remoteButtonStyleAttr) {
        super(context, appDownloadButton);
        this.d = remoteButtonStyleAttr;
    }
}
