package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mys<T, V> extends kts<T, V> {
    public mys(Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.col.p0003sl.la
    public String getURL() {
        return wts.b() + "/weather/weatherInfo?";
    }

    public final T t() {
        return this.s;
    }
}
