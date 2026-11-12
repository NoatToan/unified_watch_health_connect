package m51;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.library.mapsdkadapter.i;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm51/a;", "Lg/a;", "Lcom/garmin/android/library/mapsdkadapter/i$b;", "", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends g.a<i.b, Boolean> {
    @Override // g.a
    public final Intent a(Context context, i.b bVar) {
        i.b bVar2 = bVar;
        context.getClass();
        bVar2.getClass();
        return ((s41.a) KoinJavaComponent.get$default(s41.a.class, null, null, 6, null)).b(context, bVar2);
    }

    @Override // g.a
    public final Boolean c(int i14, Intent intent) {
        return Boolean.valueOf(i14 == -1);
    }
}
