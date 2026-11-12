package z6;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Iterable<Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Intent> f202637a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f202638b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private h0(Context context) {
        this.f202638b = context;
    }

    public static h0 e(Context context) {
        return new h0(context);
    }

    public final void a(Intent intent) {
        this.f202637a.add(intent);
    }

    public final void b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f202638b.getPackageManager());
        }
        if (component != null) {
            c(component);
        }
        a(intent);
    }

    public final void c(ComponentName componentName) {
        Context context = this.f202638b;
        ArrayList<Intent> arrayList = this.f202637a;
        int size = arrayList.size();
        try {
            for (Intent intentA = i.a(context, componentName); intentA != null; intentA = i.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            l2.t(e4);
        }
    }

    public final void d(Class cls) {
        c(new ComponentName(this.f202638b, (Class<?>) cls));
    }

    public final PendingIntent f() {
        ArrayList<Intent> arrayList = this.f202637a;
        if (arrayList.isEmpty()) {
            vb.h.z("No intents added to TaskStackBuilder; cannot getPendingIntent");
            return null;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f202638b, 0, intentArr, 201326592, null);
    }

    public final void g() {
        ArrayList<Intent> arrayList = this.f202637a;
        if (arrayList.isEmpty()) {
            vb.h.z("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f202638b;
        if (a7.b.startActivities(context, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f202637a.iterator();
    }
}
