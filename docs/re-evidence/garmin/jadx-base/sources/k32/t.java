package k32;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/t;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f102734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f102735b;

    public t(Context context) {
        context.getClass();
        this.f102734a = c22.b.a(context);
        this.f102735b = LayoutInflater.from(context);
    }

    public static View a(t tVar, ViewGroup viewGroup) {
        float f14 = tVar.f102734a;
        LayoutInflater layoutInflater = tVar.f102735b;
        if (f14 >= 1.5f) {
            View viewInflate = layoutInflater.inflate(R.layout.gcm3_summary_list_two_value_item_font_scaled, viewGroup, false);
            viewInflate.getClass();
            return viewInflate;
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.gcm3_summary_list_two_value_item, viewGroup, false);
        viewInflate2.getClass();
        return viewInflate2;
    }
}
