package com.xiaomi.hm.health.bt.debug;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.io.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/debug/BleLoggerWriter;", "", "Ljava/io/File;", "file", "", "b", "", "a", "", "data", "write", "Ljava/lang/String;", "mLogDir", "", "J", "mMaxLogFile", "<init>", "(Ljava/lang/String;J)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BleLoggerWriter {

    @NotNull
    private static final String c = "hmble_log";

    @NotNull
    private static final String d = ".log";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mLogDir;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long mMaxLogFile;

    public BleLoggerWriter(@NotNull String str, long j) {
        this.mLogDir = str;
        this.mMaxLogFile = j;
        new File(str).mkdirs();
    }

    private final String a() {
        return this.mLogDir + ((Object) File.separator) + "hmble_log.log";
    }

    private final void b(File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", "clogan header");
        jSONObject.put("f", 1);
        jSONObject.put("l", System.currentTimeMillis());
        jSONObject.put(GoogleApiAvailabilityLight.b, "clogan");
        jSONObject.put("i", 1);
        jSONObject.put("m", true);
        c.writeBytes(file, BleLogEncrypt.INSTANCE.getInstance().encrypt(Intrinsics.stringPlus(jSONObject.toString(), "\n")));
    }

    public final void write(@Nullable byte[] data) throws JSONException, IOException {
        if (data != null) {
            if (data.length == 0) {
                return;
            }
            File file = new File(a());
            if (!file.exists()) {
                file.createNewFile();
                b(file);
            } else if (file.length() >= this.mMaxLogFile) {
                file.delete();
                file.createNewFile();
                b(file);
            }
            c.appendBytes(file, data);
        }
    }

    public /* synthetic */ BleLoggerWriter(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 104857600L : j);
    }
}
