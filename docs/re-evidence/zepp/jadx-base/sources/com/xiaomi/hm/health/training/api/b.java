package com.xiaomi.hm.health.training.api;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import com.xiaomi.hm.health.training.api.bean.VideoPosts;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
class b {
    private static final String c = "Train-CacheManager";
    private static final String d = "TrainingCache";
    private static final String e = "VideoPost";
    private final Map<String, TrainingItem> a = new HashMap();
    private final Context b;

    public b(@NonNull Context context) {
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(TrainingItem trainingItem) {
        return String.format(Locale.CHINA, "缓存了训练详情, %s", trainingItem);
    }

    @Nullable
    public TrainingItem b(String str) {
        TrainingItem trainingItem;
        synchronized (this.a) {
            trainingItem = this.a.get(str);
        }
        return trainingItem;
    }

    @Nullable
    public VideoPosts c() {
        try {
            return (VideoPosts) m.b().fromJson(this.b.getSharedPreferences(d, 0).getString(e, ""), VideoPosts.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public void e(@NonNull final TrainingItem trainingItem) {
        synchronized (this.a) {
            this.a.put(String.valueOf(trainingItem.id), trainingItem);
            Loggers.getLogger().v(c, new Supplier() { // from class: com.xiaomi.hm.health.training.api.a
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return b.d(trainingItem);
                }
            });
        }
    }

    public void f(@NonNull VideoPosts videoPosts) {
        this.b.getSharedPreferences(d, 0).edit().putString(e, m.b().toJson(videoPosts)).apply();
    }
}
