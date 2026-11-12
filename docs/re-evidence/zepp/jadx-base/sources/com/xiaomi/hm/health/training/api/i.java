package com.xiaomi.hm.health.training.api;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadTarget;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Logger;
import com.xiaomi.hm.health.training.api.util.Loggers;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
class i {
    private static final String a = "Train-ImageUtils";

    public class a extends HMLoadTarget {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object b(String str) {
            return "图片缓存成功，" + str;
        }

        @Override // com.xiaomi.hm.health.imageload.HMLoadTarget
        public void onLoadFinish(Object obj) {
            Logger logger = Loggers.getLogger();
            final String str = this.a;
            logger.v(i.a, new Supplier() { // from class: com.xiaomi.hm.health.training.api.h
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return i.a.b(str);
                }
            });
        }
    }

    @WorkerThread
    public static void a(@NonNull Context context, @Nullable String str) {
        if (str == null) {
            return;
        }
        HMImageLoader.with(context).load(str).downloadOnlyExecute(new a(str));
    }

    public static boolean b(@NonNull Context context, @Nullable String str) {
        File fileObtain;
        return (str == null || (fileObtain = HMImageLoader.with(context).load(str).obtain()) == null || !fileObtain.exists()) ? false : true;
    }
}
