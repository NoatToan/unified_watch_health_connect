package defpackage;

import android.content.Context;
import com.huami.watchfacesstore.dial_process.DialProcess;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.ZipUtil;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lh8;", "Lph;", "Landroid/content/Context;", "context", "", "originPath", PluginDeviceInfo.FMODEL, "bgPath", "", "argb", "<init>", "(Ljava/lang/String;[B)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class h8 implements ph {

    @NotNull
    public static final a d = new a(null);

    @Nullable
    public static DialVersion e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f19789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final byte[] f19790b;

    @NotNull
    public final String c;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, d2 = {"Lh8$a;", "", "Lf8;", "dialVersion", "Lf8;", "getDialVersion", "()Lf8;", PluginDeviceInfo.FMODEL, "(Lf8;)V", "", "BG_PATH", "Ljava/lang/String;", "CONFIG_PATH", "KEY_COLOR", "KEY_FOREGROUND", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@Nullable DialVersion dialVersion) {
            h8.e = dialVersion;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "start png2tga";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.t = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "res: " + this.t;
        }
    }

    public h8(@Nullable String str, @Nullable byte[] bArr) {
        this.f19789a = str;
        this.f19790b = bArr;
        this.c = "DialJsProcessor";
    }

    @Override // defpackage.ph
    @NotNull
    public String a(@NotNull Context context, @NotNull String originPath) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        String str = FileUtils.getAppFileDir(context).getAbsolutePath() + "/custom_dial";
        String str2 = str + "/ret.zip";
        uw.f36202a.a(str);
        ZipUtil.unzipFile(originPath, str);
        String str3 = this.f19789a;
        if (str3 != null) {
            le.c(this.c, b.t);
            le.c(this.c, new c(DialProcess.a(DialProcess.f9903a, str3, str + "/assets/images/bg.png", 0, 4, null)));
        }
        byte[] bArr = this.f19790b;
        if (bArr != null) {
            try {
                String strB = tet.B(bArr);
                t5t.d(this.c, "color:" + strB);
                File file = new File(str + File.separator + "assets/config.json");
                if (file.exists()) {
                    JSONObject jSONObject = new JSONObject(FilesKt__FileReadWriteKt.readText$default(file, null, 1, null));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(itKeys, "rootObj.keys()");
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!Intrinsics.areEqual(next, "foreground")) {
                            linkedHashMap.put(next, jSONObject.get(next));
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("color", strB);
                    linkedHashMap.put("foreground", jSONObject2);
                    JSONObject jSONObject3 = new JSONObject(linkedHashMap);
                    t5t.d(this.c, "write config: " + jSONObject3);
                    String string = jSONObject3.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "newConfigObj.toString()");
                    FilesKt__FileReadWriteKt.writeText$default(file, string, null, 2, null);
                } else {
                    t5t.d(this.c, "no file config.json ");
                }
            } catch (Exception e2) {
                t5t.d(this.c, "exception: " + e2.getLocalizedMessage());
            }
        }
        File[] fileList = new File(str).listFiles();
        Intrinsics.checkNotNullExpressionValue(fileList, "fileList");
        ZipUtil.zipFiles(ArraysKt___ArraysKt.toList(fileList), new File(str2));
        return str2;
    }

    public /* synthetic */ h8(String str, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bArr);
    }
}
