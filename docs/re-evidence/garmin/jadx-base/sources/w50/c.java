package w50;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mapsdkadapter.i;
import ie2.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw50/c;", "Lcom/garmin/android/library/mapsdkadapter/i$c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c implements i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f182191a;

    public c(Context context) {
        context.getClass();
        this.f182191a = context;
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.c
    public final void a(j jVar) {
    }

    @Override // com.garmin.android.library.mapsdkadapter.i.c
    public final View b(j jVar) {
        View viewInflate = LayoutInflater.from(this.f182191a).inflate(R.layout.gcm3_map_poi_info_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.map_info_text);
        if (jVar.mo329getTag() == null) {
            return null;
        }
        if (textView != null) {
            c(textView, jVar);
        }
        return viewInflate;
    }

    public abstract void c(TextView textView, j jVar);
}
