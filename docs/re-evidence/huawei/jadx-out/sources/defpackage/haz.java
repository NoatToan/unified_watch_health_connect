package defpackage;

import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes8.dex */
public class haz {
    public void e(String str, String str2) {
        SharedPreferenceManager.c(String.valueOf(101010), "key_audio_res_path" + str, str2);
    }

    public int d(String str) {
        return SharedPreferenceManager.c(String.valueOf(101010), "key_base_res_version" + str, 0);
    }

    public void a(String str, int i) {
        SharedPreferenceManager.d(String.valueOf(101010), "key_base_res_version" + str, i);
    }

    public int c(String str) {
        return SharedPreferenceManager.c(String.valueOf(101010), "key_base_service_version" + str, 0);
    }

    public void b(String str, int i) {
        SharedPreferenceManager.d(String.valueOf(101010), "key_base_service_version" + str, i);
    }

    public void d(String str, String str2) {
        SharedPreferenceManager.c(String.valueOf(101010), "key_audio_config_json" + str, str2);
    }
}
