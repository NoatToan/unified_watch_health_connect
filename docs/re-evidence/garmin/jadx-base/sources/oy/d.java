package oy;

import com.garmin.android.apps.connectmobile.f0;
import f12.l;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import sy.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Loy/d;", "Lcom/garmin/android/apps/connectmobile/f0;", "Loy/a;", "Lmy/a;", "caloriesApiService", "Lf12/l;", "userSettings", "<init>", "(Lmy/a;Lf12/l;)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements f0, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my.a f134362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f134363b;

    public d(my.a aVar, l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f134362a = aVar;
        this.f134363b = lVar;
    }

    @Override // oy.a
    public final Object a(DateTime dateTime, DateTime dateTime2, v13.c cVar) {
        return C(new b(this, dateTime, dateTime2, null), cVar);
    }

    @Override // oy.a
    public final Object b(DateTime dateTime, k.c cVar) {
        return f0.J(this, new c(this, dateTime, 52, null), cVar);
    }
}
