package fb2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes8.dex */
public abstract class v<T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f70381d;

    public v(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final View a() {
        if (this.f70381d == null) {
            View viewInflate = LayoutInflater.from(this.f70343a).inflate(R.layout.gcm_button_hint, (ViewGroup) null, false);
            this.f70381d = viewInflate;
            ((TextView) viewInflate.findViewById(R.id.label_hint)).setText(p());
        }
        return this.f70381d;
    }

    @Override // fb2.e
    public final boolean g(i.c cVar, T t7) {
        View viewFindViewById = cVar.findViewById(R.id.label_hint);
        if (viewFindViewById != null) {
            this.f70381d = viewFindViewById;
        } else {
            this.f70381d = a();
        }
        o(this.f70381d);
        return k(t7);
    }

    @Override // fb2.e
    public final boolean k(T t7) {
        f.a(t7, "Model is required");
        this.f70344b = t7;
        boolean zH = h(t7);
        if (zH) {
            View view2 = this.f70381d;
            if (view2 instanceof TextView) {
                ((TextView) view2).setText(p());
            }
        }
        return zH;
    }

    public abstract String p();
}
