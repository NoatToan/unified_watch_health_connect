package bw2;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Map;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbw2/d;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21586a = new d();

    private d() {
    }

    public static final void a(i iVar, View view2, dx2.c cVar, Map<String, ? extends Object> map) {
        iVar.getClass();
        view2.getClass();
        cVar.getClass();
        map.getClass();
        SwitchCompat switchCompat = null;
        try {
            if (!(view2 instanceof SwitchCompat)) {
                view2 = null;
            }
            switchCompat = (SwitchCompat) view2;
        } catch (ClassCastException unused) {
        }
        if (switchCompat != null) {
            Boolean boolY4 = cVar.Y4(map);
            switchCompat.setChecked(boolY4 != null ? boolY4.booleanValue() : false);
        } else {
            cx2.h hVar = iVar.f21601b;
            Logger logger = cx2.h.f56678c;
            hVar.getClass();
        }
    }
}
