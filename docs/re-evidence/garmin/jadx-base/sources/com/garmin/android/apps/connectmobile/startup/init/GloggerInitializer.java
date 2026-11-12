package com.garmin.android.apps.connectmobile.startup.init;

import android.content.Context;
import ch.qos.logback.classic.Level;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import gt2.c;
import gt2.d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.w;
import zd.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/GloggerInitializer;", "Lzd/b;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GloggerInitializer implements b<Unit> {
    static {
        new a(null);
    }

    @Override // zd.b
    public final Unit create(Context context) {
        context.getClass();
        d.f79011k.getClass();
        d.b bVar = d.b.LOG_TYPE_LOGCAT_AND_FILE;
        Level level = Level.ALL;
        level.getClass();
        d dVar = new d(bVar, level, null, 4, null);
        dVar.f79018g = true;
        dVar.f79021j = "[%thread] | %msg";
        String string = GCMSettingManager.f41535a.getString(R.string.key_glogger_config_delete_existing_log_files);
        Boolean boolValueOf = GCMSettingManager.f41536b.contains(string) ? Boolean.valueOf(GCMSettingManager.f41536b.getBoolean(string, false)) : null;
        if (boolValueOf == null || boolValueOf.booleanValue()) {
            dVar.f79019h = true;
            com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_glogger_config_delete_existing_log_files, GCMSettingManager.f41536b.edit(), false);
        }
        c.c(context, dVar);
        c.a("PAY#");
        c.a(a2.CRASH.f28756a);
        pi1.b.f137854a.getClass();
        File file = new File(pi1.b.b(context), "logcat.log");
        ArrayList arrayList = new ArrayList();
        arrayList.add("logcat");
        arrayList.add("-f");
        arrayList.add(file.getAbsolutePath());
        arrayList.add("-r");
        arrayList.add("2048");
        arrayList.add("-n");
        arrayList.add("3");
        arrayList.add("-v");
        arrayList.add("time");
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            file.createNewFile();
            Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[0]));
        } catch (IOException e4) {
            String strN = fb1.c.n("failed to direct logcat output to file: ", e4.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "GloggerInitializer", strN);
        }
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return w.c(GCMSettingManager.class);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/GloggerInitializer$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
