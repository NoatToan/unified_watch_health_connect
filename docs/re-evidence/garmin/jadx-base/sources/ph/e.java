package ph;

import android.app.Activity;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f137653c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f137654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137655b;

    public e(Activity activity, String str) {
        super(activity);
        this.f137654a = activity;
        this.f137655b = str;
    }

    public final boolean a() {
        return "v1".equals(this.f137655b);
    }
}
