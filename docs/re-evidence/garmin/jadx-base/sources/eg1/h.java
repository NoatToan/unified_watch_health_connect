package eg1;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Leg1/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Leg1/d;", "leaderboardColumns", "<init>", "(Landroid/content/Context;[Leg1/d;)V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f64003b;

    public h(Context context, d[] dVarArr) {
        context.getClass();
        dVarArr.getClass();
        this.f64002a = context;
        this.f64003b = dVarArr;
    }

    public static void a(LinearLayout linearLayout) {
        View viewFindViewById = linearLayout.findViewById(R.id.segments_privacy_icon);
        linearLayout.removeView(viewFindViewById);
        linearLayout.addView(viewFindViewById, linearLayout.getChildCount());
    }

    public TextView b(float f14, int i14, String str) {
        View viewInflate = LayoutInflater.from(this.f64002a).inflate(R.layout.gcm3_segment_leaderboard_list_item, (ViewGroup) null);
        viewInflate.getClass();
        TextView textView = (TextView) viewInflate;
        textView.setId(i14);
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        }
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, f14));
        return textView;
    }
}
