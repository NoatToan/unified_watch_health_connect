package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public class cl8 {
    public static int a(ContentResolver contentResolver, String str) throws Settings.SettingNotFoundException {
        return Settings.Secure.getInt(contentResolver, str);
    }
}
