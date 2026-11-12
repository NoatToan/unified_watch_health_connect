package bd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Preference {
    public final long K0;

    public b(Context context, List<Preference> list, long j8) {
        super(context);
        this.P = R.layout.expand_button;
        Drawable drawableA = j.a.a(this.f10147a, R.drawable.ic_arrow_down_24dp);
        if (this.f10157k != drawableA) {
            this.f10157k = drawableA;
            this.f10156j = 0;
            i();
        }
        this.f10156j = R.drawable.ic_arrow_down_24dp;
        z(this.f10147a.getString(R.string.expand_button_title));
        if (999 != this.f10153g) {
            this.f10153g = 999;
            androidx.preference.c cVar = this.X;
            if (cVar != null) {
                Handler handler = cVar.f10210e;
                androidx.preference.c.a aVar = cVar.f10211f;
                handler.removeCallbacks(aVar);
                handler.post(aVar);
            }
        }
        ArrayList arrayList = new ArrayList();
        CharSequence string = null;
        for (Preference preference : list) {
            CharSequence charSequence = preference.f10154h;
            boolean z14 = preference instanceof PreferenceGroup;
            if (z14 && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.Z)) {
                if (z14) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.f10147a.getString(R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        y(string);
        this.K0 = j8 + 1000000;
    }

    @Override // androidx.preference.Preference
    public final long d() {
        return this.K0;
    }

    @Override // androidx.preference.Preference
    public final void m(h hVar) {
        super.m(hVar);
        hVar.f17505d = false;
    }
}
