package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gyh;
import defpackage.pnq;
import defpackage.qqf;
import health.compact.a.CommonUtil;
import java.io.File;

/* JADX INFO: loaded from: classes15.dex */
public class SportShareWatermarkOutline extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22676c;
    private HealthTextView e;
    private View f;
    private HealthTextView g;
    private int i;
    private String j;
    private HealthTextView m;
    private ImageView n;
    private boolean d = true;
    private boolean h = false;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
    }

    public SportShareWatermarkOutline(Context context) {
        b(context);
        c(context);
    }

    private void b(Context context) {
        View viewInflate = View.inflate(context, R.layout.sport_share_watermark_outline, null);
        this.f = viewInflate;
        this.n = (ImageView) viewInflate.findViewById(R.id.share_watermark_outline);
        this.m = (HealthTextView) this.f.findViewById(R.id.share_watermark_main_data_value);
        this.g = (HealthTextView) this.f.findViewById(R.id.share_watermark_main_data_unit);
        this.f22675b = (HealthTextView) this.f.findViewById(R.id.share_watermark_bottom_first_data_value);
        this.e = (HealthTextView) this.f.findViewById(R.id.share_watermark_bottom_second_data_value);
        this.f22676c = (HealthTextView) this.f.findViewById(R.id.share_watermark_bottom_third_data_value);
    }

    private void c(Context context) {
        this.m.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf"));
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.m.setTextColor(i);
        this.g.setTextColor(i);
        this.f22675b.setTextColor(i);
        this.e.setTextColor(i);
        this.f22676c.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.f;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22674a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22674a = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.j;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.j = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.d = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.d;
    }

    private void e(String str) {
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("Share_SportShareWatermarkOutline", "refreshOutLine path is empty");
            return;
        }
        File file = new File(strC);
        if (file.exists()) {
            qqf.a(file, this.n);
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            String strH = gyhVar.h();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM) || pnq.a(strH)) {
                this.h = true;
                return;
            }
            pnq.d(this.m, strA);
            pnq.d(this.g, gyhVar.b());
            pnq.d(this.f22675b, strJ);
            pnq.d(this.e, strM);
            pnq.d(this.f22676c, strH);
            e(gyhVar.o());
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.i = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.h;
    }
}
