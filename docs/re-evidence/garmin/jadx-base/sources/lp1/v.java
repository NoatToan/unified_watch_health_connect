package lp1;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llp1/v;", "", "Landroid/view/View;", "view", "", "intervalType", "<init>", "(Landroid/view/View;I)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f114207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f114208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f114210d;

    public v(View view2, int i14) {
        view2.getClass();
        Context context = view2.getContext();
        this.f114207a = (ComposeView) view2.findViewById(R.id.gcm_stats_row_1);
        context.getClass();
        this.f114208b = new s(context);
        this.f114209c = "";
        this.f114210d = "";
        if (i14 == 4) {
            String string = context.getString(R.string.lbl_weekly_gain);
            string.getClass();
            this.f114209c = string;
            String string2 = context.getString(R.string.lbl_prior_week_gain);
            string2.getClass();
            this.f114210d = string2;
            return;
        }
        String string3 = context.getString(R.string.lbl_four_weeks_gain);
        string3.getClass();
        this.f114209c = string3;
        String string4 = context.getString(R.string.lbl_prior_four_week_gain);
        string4.getClass();
        this.f114210d = string4;
    }
}
