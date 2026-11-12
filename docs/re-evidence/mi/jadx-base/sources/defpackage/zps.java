package defpackage;

import android.content.Context;
import com.xiaomi.push.id;

/* JADX INFO: loaded from: classes11.dex */
public class zps extends yps {
    public zps(Context context, int i) {
        super(context, i);
    }

    @Override // k5s.a
    public String a() {
        return "23";
    }

    @Override // defpackage.yps
    public id b() {
        return id.Storage;
    }

    @Override // defpackage.yps
    public String f() {
        return "ram:" + lzs.e() + ",rom:" + lzs.o() + "|ramOriginal:" + lzs.s() + ",romOriginal:" + lzs.v();
    }
}
