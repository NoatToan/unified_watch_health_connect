package com.xiaomi.hm.health.device.firmware;

import android.content.Context;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"", "buildTime", "", "changeLog", "Landroid/content/Context;", "ctx", "dumpChangeLogImage", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class FwFileUtilsExtendKt {
    @Nullable
    public static final String dumpChangeLogImage(int i, @Nullable String str, @NotNull Context context) {
        String str2 = FileUtils.getAppCacheDir(context).getAbsolutePath() + File.separator + MidongFwFileUtilsKt.getCHANGE_LOG_FILE_PREFIX() + System.currentTimeMillis();
        try {
            boolean z = true;
            FileOutputStream fileOutputStream = new FileOutputStream(str2, true);
            fileOutputStream.write(GattUtils.intToBytes(i));
            if (str != null) {
                if (str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    fileOutputStream.write(str.getBytes(Charsets.UTF_8));
                }
            }
            fileOutputStream.close();
            return str2;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
