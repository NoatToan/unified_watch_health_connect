package zp2;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceActivity;
import lc.u0;
import o53.c2;
import org.joda.time.Duration;
import p005kotlin.jvm.internal.s;
import yo2.h;
import yt.f;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewFitPayUpdateDeviceActivity f206599b;

    public /* synthetic */ a(NewFitPayUpdateDeviceActivity newFitPayUpdateDeviceActivity, int i14) {
        this.f206598a = i14;
        this.f206599b = newFitPayUpdateDeviceActivity;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f206598a;
        NewFitPayUpdateDeviceActivity newFitPayUpdateDeviceActivity = this.f206599b;
        switch (i14) {
            case 0:
                h hVar = (h) obj;
                NewFitPayUpdateDeviceActivity.a aVar = NewFitPayUpdateDeviceActivity.f51718o;
                int i15 = hVar != null ? NewFitPayUpdateDeviceActivity.b.f51728a[hVar.ordinal()] : -1;
                if (i15 != 1) {
                    if (i15 == 2) {
                        newFitPayUpdateDeviceActivity.startActivity(FitPayIssuerBankTermsConditionActivity.a.c(FitPayIssuerBankTermsConditionActivity.f51592t, newFitPayUpdateDeviceActivity.f51720g, newFitPayUpdateDeviceActivity.f51722i, newFitPayUpdateDeviceActivity.f51723j, newFitPayUpdateDeviceActivity.f51724k, 112));
                        newFitPayUpdateDeviceActivity.finish();
                        return;
                    } else if (i15 != 3) {
                        u0.r();
                        return;
                    } else {
                        newFitPayUpdateDeviceActivity.ca();
                        hn2.c.U9(newFitPayUpdateDeviceActivity, newFitPayUpdateDeviceActivity, null, 10);
                        return;
                    }
                }
                return;
            case 1:
                NewFitPayUpdateDeviceActivity.a aVar2 = NewFitPayUpdateDeviceActivity.f51718o;
                if (!((Boolean) obj).booleanValue()) {
                    newFitPayUpdateDeviceActivity.ca();
                    hn2.c.U9(newFitPayUpdateDeviceActivity, newFitPayUpdateDeviceActivity, null, 10);
                    return;
                }
                hn2.c.ba(newFitPayUpdateDeviceActivity, Boolean.FALSE, null, null, 14);
                View viewFindViewById = newFitPayUpdateDeviceActivity.findViewById(R.id.download_card_progress);
                viewFindViewById.getClass();
                newFitPayUpdateDeviceActivity.f51726m = (ProgressBar) viewFindViewById;
                View viewFindViewById2 = newFitPayUpdateDeviceActivity.findViewById(R.id.download_primary_message);
                viewFindViewById2.getClass();
                ((TextView) viewFindViewById2).setText(newFitPayUpdateDeviceActivity.getString(R.string.device_updating_title));
                View viewFindViewById3 = newFitPayUpdateDeviceActivity.findViewById(R.id.download_secondary_message);
                viewFindViewById3.getClass();
                ((TextView) viewFindViewById3).setText(newFitPayUpdateDeviceActivity.getString(R.string.device_updating_message));
                View viewFindViewById4 = newFitPayUpdateDeviceActivity.findViewById(R.id.sync_symbol);
                viewFindViewById4.getClass();
                newFitPayUpdateDeviceActivity.f51727n = (ImageView) viewFindViewById4;
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(Duration.standardSeconds(1L).getMillis());
                rotateAnimation.setRepeatMode(1);
                rotateAnimation.setRepeatCount(-1);
                rotateAnimation.setInterpolator(new q9.b());
                ImageView imageView = newFitPayUpdateDeviceActivity.f51727n;
                if (imageView == null) {
                    s.m("updateSymbol");
                    throw null;
                }
                imageView.startAnimation(rotateAnimation);
                b bVar = newFitPayUpdateDeviceActivity.f51725l;
                if (bVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                c2 c2VarT = ge1.b.T(v1.a(bVar), null, null, new e(bVar, null), 3);
                bVar.f206601a.add(c2VarT);
                c2VarT.J(new f(18, bVar, c2VarT));
                return;
            default:
                Double d14 = (Double) obj;
                ProgressBar progressBar = newFitPayUpdateDeviceActivity.f51726m;
                if (progressBar != null) {
                    progressBar.setProgress((int) d14.doubleValue());
                    return;
                } else {
                    s.m("progressBar");
                    throw null;
                }
        }
    }
}
