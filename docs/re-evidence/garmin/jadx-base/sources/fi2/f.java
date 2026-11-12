package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfi2/f;", "Lei2/h;", "", "requireAllBoolean", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(ZLandroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi2.d f71789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z14, Context context) {
        super(context);
        context.getClass();
        this.f71788c = z14;
        this.f71789d = new hi2.d("BooleanTransform", null, 2, null);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        List<Map<String, Object>> listC4 = bVar.C4(map);
        boolean z14 = this.f71788c;
        if (listC4 != null) {
            Iterator<T> it = listC4.iterator();
            while (it.hasNext()) {
                Map map2 = (Map) it.next();
                for (Map.Entry entry : map2.entrySet()) {
                    Object obj = map2.get(mh2.i.VALUE_ID.f118617a);
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    String str = (String) obj;
                    boolean z15 = str != null ? Boolean.parseBoolean(d(bVar, str)) : false;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Objects.toString(key);
                    Objects.toString(value);
                    this.f71789d.getClass();
                    if (z14 && !z15) {
                        return ei2.h.g(this, R.string.lbl_off);
                    }
                    if (!z14 && z15) {
                        return ei2.h.g(this, R.string.lbl_on);
                    }
                }
            }
        }
        return z14 ? ei2.h.g(this, R.string.lbl_on) : ei2.h.g(this, R.string.lbl_off);
    }
}
