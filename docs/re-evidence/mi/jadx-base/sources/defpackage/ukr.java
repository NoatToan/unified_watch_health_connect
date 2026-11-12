package defpackage;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(18)
public class ukr implements vkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f35894a;

    public ukr(View view) {
        this.f35894a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ukr) && ((ukr) obj).f35894a.equals(this.f35894a);
    }

    public int hashCode() {
        return this.f35894a.hashCode();
    }
}
