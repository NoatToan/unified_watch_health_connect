package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m3<T, RT> extends a5<T, RT> {
    public m3(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch1.a5
    public final eh1.b q(View view2, i.c cVar, bd0.e eVar, Object obj) {
        return new eh1.b(view2, cVar, eVar, R.string.lbl_remove, y(), v(obj), w());
    }

    @Override // ch1.a5
    public final int r() {
        return 1;
    }

    public abstract RT y();
}
