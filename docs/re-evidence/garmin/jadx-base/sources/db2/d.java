package db2;

import android.text.format.DateUtils;
import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldb2/d;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f59098a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f59099b;

    static {
        a.C1255a c1255a = a.f59090a;
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        c1255a.getClass();
        lVar.getClass();
        a.f59091b = lVar;
        f59099b = new a();
    }

    private d() {
    }

    public static boolean a() {
        f59099b.getClass();
        l lVar = a.f59091b;
        if (lVar == null) {
            s.m("prefs");
            throw null;
        }
        if (lVar.W2("KeyEmergencyContactsShowDayOneDialog", true)) {
            return false;
        }
        l lVar2 = a.f59091b;
        if (lVar2 != null) {
            return !DateUtils.isToday(lVar2.D3(0L, "KeyEmergencyContactsCacheTimestamp"));
        }
        s.m("prefs");
        throw null;
    }
}
