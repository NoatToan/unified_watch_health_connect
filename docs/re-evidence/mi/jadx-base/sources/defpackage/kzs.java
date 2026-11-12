package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.d;

/* JADX INFO: loaded from: classes11.dex */
public class kzs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f24464b;
    public final /* synthetic */ d c;

    public kzs(String str, Context context, d dVar) {
        this.f24463a = str;
        this.f24464b = context;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strSubstring;
        if (TextUtils.isEmpty(this.f24463a)) {
            return;
        }
        String[] strArrSplit = this.f24463a.split("~");
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                strSubstring = "";
                break;
            }
            String str = strArrSplit[i];
            if (!TextUtils.isEmpty(str) && str.startsWith("token:")) {
                strSubstring = str.substring(str.indexOf(":") + 1);
                break;
            }
            i++;
        }
        if (TextUtils.isEmpty(strSubstring)) {
            x9s.o("ASSEMBLE_PUSH : receive incorrect token");
            return;
        }
        x9s.o("ASSEMBLE_PUSH : receive correct token");
        gxs.p(this.f24464b, this.c, strSubstring);
        gxs.f(this.f24464b);
    }
}
