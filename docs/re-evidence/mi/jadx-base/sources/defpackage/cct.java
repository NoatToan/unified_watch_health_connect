package defpackage;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.push.jm;

/* JADX INFO: loaded from: classes11.dex */
public class cct {
    public static <T extends jm<T, ?>> void a(Context context, lb4 lb4Var) {
        if (lb4Var == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_cr_config");
        intent.putExtra("action_cr_event_switch", lb4Var.g());
        intent.putExtra("action_cr_event_frequency", lb4Var.c());
        intent.putExtra("action_cr_perf_switch", lb4Var.h());
        intent.putExtra("action_cr_perf_frequency", lb4Var.e());
        intent.putExtra("action_cr_event_en", lb4Var.f());
        intent.putExtra("action_cr_max_file_size", lb4Var.d());
        d6s.c(context).s(intent);
    }
}
