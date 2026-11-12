package mt0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/x1;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f120920a = new x1();

    private x1() {
    }

    public static void a(View view2, TextView textView, boolean z14) {
        textView.getClass();
        Context context = view2.getContext();
        if (z14) {
            view2.setBackgroundColor(a7.b.getColor(context, R.color.gcm_surface_3));
            textView.setTypeface(h22.a.a("font/roboto_regular.ttf", context));
        } else {
            view2.setBackgroundColor(a7.b.getColor(context, R.color.gcm_list_item_background));
            textView.setTypeface(h22.a.a("font/roboto_light.ttf", context));
        }
    }
}
