package defpackage;

import com.google.gson.Gson;
import com.xiaomi.fitness.migration.exercise.entity.IntensityDuration;

/* JADX INFO: loaded from: classes9.dex */
public class vcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gson f36741a = new Gson();

    public static IntensityDuration a(String str) {
        return (IntensityDuration) f36741a.fromJson(str, IntensityDuration.class);
    }
}
