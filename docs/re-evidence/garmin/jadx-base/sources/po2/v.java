package po2;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailActivity;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f139394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SnowballCardDetailActivity f139395c;

    public /* synthetic */ v(String str, SnowballCardDetailActivity snowballCardDetailActivity, int i14) {
        this.f139393a = i14;
        this.f139394b = str;
        this.f139395c = snowballCardDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f139393a) {
            case 0:
                Logger logger = SnowballCardDetailActivity.f51258k;
                String str = this.f139394b;
                logger.trace("Call support center ".concat(str));
                this.f139395c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tel:".concat(str))));
                break;
            default:
                Logger logger2 = SnowballCardDetailActivity.f51258k;
                String str2 = this.f139394b;
                logger2.trace("View FAQ ".concat(str2));
                this.f139395c.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                break;
        }
    }
}
