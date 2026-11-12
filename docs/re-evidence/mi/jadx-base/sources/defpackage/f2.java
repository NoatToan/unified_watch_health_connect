package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0005B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\u0005\u001a\u00020\bH\u0002¨\u0006\u000e"}, d2 = {"Lf2;", "", "", "data", "", PluginDeviceInfo.FMODEL, "Ljava/io/File;", "file", "", "mLogDir", "", "mMaxLogFile", "<init>", "(Ljava/lang/String;J)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class f2 {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f17309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17310b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lf2$a;", "", "", "LOG_NAME", "Ljava/lang/String;", "LOG_SUFFIX", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f2(@NotNull String mLogDir, long j) {
        Intrinsics.checkNotNullParameter(mLogDir, "mLogDir");
        this.f17309a = mLogDir;
        this.f17310b = j;
        new File(mLogDir).mkdirs();
    }

    public final void a(File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PluginDeviceInfo.FICONON, "clogan header");
        jSONObject.put(PluginDeviceInfo.FBLUETOOTHPAIR, 1);
        jSONObject.put(e.f13808a, System.currentTimeMillis());
        jSONObject.put("n", "clogan");
        jSONObject.put("i", 1);
        jSONObject.put("m", true);
        FilesKt__FileReadWriteKt.writeBytes(file, c2.f4844b.a().a(jSONObject.toString() + '\n'));
    }

    public /* synthetic */ f2(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 31457280L : j);
    }

    public final void a(@Nullable byte[] data) throws JSONException, IOException {
        if (data == null || data.length == 0) {
            return;
        }
        File file = new File(a());
        if (!file.exists()) {
            file.createNewFile();
            a(file);
        } else if (file.length() >= this.f17310b) {
            file.delete();
            file.createNewFile();
            a(file);
        }
        FilesKt__FileReadWriteKt.appendBytes(file, data);
    }

    public final String a() {
        return this.f17309a + File.separator + "hmble_log.log";
    }
}
