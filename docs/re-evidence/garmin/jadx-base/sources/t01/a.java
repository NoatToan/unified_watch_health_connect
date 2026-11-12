package t01;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.nutrition.domain.reminders.NutritionAlarmReceiver;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pd1.b;
import pd1.c;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lt01/a;", "Lud1/a;", "", "reminderKey", "", "reminderId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ud1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f161672b;

    public /* synthetic */ a(String str, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num);
    }

    @Override // ud1.a
    public final Intent d(Context context) {
        return sn.a.d(context, context, NutritionAlarmReceiver.class);
    }

    @Override // ud1.a
    public final String e(Context context) {
        context.getClass();
        return k.g(context.getPackageName(), ".action.ACTION_NUTRITION_TRACKING_REMINDER");
    }

    @Override // ud1.a
    public final c g() {
        return ((e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, 6, null)).b();
    }

    @Override // ud1.a
    public final boolean i(b bVar) {
        Boolean enabled = bVar.getEnabled();
        if (enabled != null) {
            return enabled.booleanValue();
        }
        return false;
    }

    @Override // ud1.a
    public final void m(c cVar) {
        cVar.getClass();
        ((e01.a) KoinJavaComponent.get$default(e01.a.class, null, null, 6, null)).d(cVar);
    }

    public a(String str, Integer num) {
        this.f161671a = str;
        this.f161672b = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
