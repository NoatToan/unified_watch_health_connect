package zh2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.garmin.androiddynamicsettings.app.presentationlayer.SettingsActivity;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzh2/e;", "", "<init>", "()V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static uc0.d f204809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static li2.f f204810d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f204813g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f204807a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hi2.d f204808b = new hi2.d("DynamicSettingsInitializer", null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final nh2.a f204811e = new nh2.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static f f204812f = new f(0, null, 0, null, null, false, false, null, null, 0, null, null, 4095, null);

    static {
        f204813g = Build.VERSION.SDK_INT >= 31;
    }

    private e() {
    }

    public static a a() {
        uc0.d dVar = f204809c;
        if (dVar != null) {
            return dVar;
        }
        s.m("appTunnel");
        throw null;
    }

    public static li2.f b() {
        li2.f fVar = f204810d;
        if (fVar != null) {
            return fVar;
        }
        s.m("networkTunnel");
        throw null;
    }

    public static void c(Context context, String str, uc0.d dVar, boolean z14, f fVar) {
        context.getClass();
        str.getClass();
        li2.a aVar = fVar.f204825l;
        f204808b.a("init: starting SettingsActivity with section type ".concat(str));
        f204812f = fVar;
        f204809c = dVar;
        f204813g = z14;
        li2.d dVar2 = fVar.f204824k;
        li2.f cVar = dVar;
        cVar = dVar;
        if (dVar2 != null && aVar != null) {
            new li2.e();
            cVar = new li2.c(dVar2, aVar);
        }
        f204810d = cVar;
        Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
        intent.putExtra("DynamicSettingInitializer_Section", str);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
