package jm;

import am.r1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljm/b;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context ctx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
        this.ctx = context;
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R.layout.chart_legend_racing_laptime, (ViewGroup) this, true).findViewById(R.id.lapTimeGradient).setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, r1.p(getContext())));
    }

    public final Context getCtx() {
        return this.ctx;
    }
}
