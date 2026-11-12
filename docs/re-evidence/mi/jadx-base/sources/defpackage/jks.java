package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22901a;

    public jks(int i) {
        this.f22901a = i;
    }

    public int a() {
        return this.f22901a;
    }

    public abstract String b(Context context, String str, List<kbs> list);

    public boolean c(Context context, String str, List<kbs> list) {
        return true;
    }
}
