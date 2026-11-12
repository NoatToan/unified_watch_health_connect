package qm;

import android.content.Context;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqm/s;", "Lgz/e;", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "g", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends gz.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Context ctx;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f145446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f145447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f145448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f145449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f145450l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context, R.layout.lap_time_hover_marker, null, 4, null);
        context.getClass();
        this.ctx = context;
        String string = context.getString(R.string.activity_details_max_speed);
        string.getClass();
        this.f145446h = string;
        this.f145447i = (TextView) findViewById(R.id.lapNumberLabel);
        this.f145448j = (TextView) findViewById(R.id.lapTimeLabel);
        this.f145449k = (TextView) findViewById(R.id.maxLapSpeedLabel);
        this.f145450l = (TextView) findViewById(R.id.avgLapSpeedLabel);
    }

    public final Context getCtx() {
        return this.ctx;
    }
}
