package defpackage;

import android.content.Context;
import com.huami.watchfacesstore.dial_process.DialProcess;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.ZipUtil;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\r"}, d2 = {"Lg8;", "", "Landroid/content/Context;", "context", "", "originDialPath", "", "bgPathList", "", "argb", PluginDeviceInfo.FMODEL, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g8 f18702a = new g8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f18703b = "DialJsProcessor";

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.t = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "bg dir path: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.t = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "origin bg path: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c t = new c();

        public c() {
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
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
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

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.t = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "tga path: " + this.t;
        }
    }

    @NotNull
    public final String a(@NotNull Context context, @NotNull String originDialPath, @Nullable List<String> bgPathList, @Nullable byte[] argb) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(originDialPath, "originDialPath");
        String str = FileUtils.getAppFileDir(context).getAbsolutePath() + "/custom_dial";
        String str2 = str + "/ret.zip";
        uw.f36202a.a(str);
        ZipUtil.unzipFile(originDialPath, str);
        String str3 = str + File.separator + "assets/images/bg";
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        le.c(f18703b, new a(str3));
        if (bgPathList != null) {
            int i = 0;
            for (Object obj : bgPathList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str4 = (String) obj;
                String str5 = f18703b;
                le.c(str5, new b(str4));
                le.c(str5, c.t);
                String str6 = str3 + File.separator + ('0' + i + ".png");
                le.c(str5, new d(DialProcess.a(DialProcess.f9903a, str4, str6, 0, 4, null)));
                le.c(str5, new e(str6));
                i = i2;
            }
        }
        if (argb != null) {
            try {
                String strB = tet.B(argb);
                String str7 = f18703b;
                t5t.d(str7, "color:" + strB);
                File file2 = new File(str + File.separator + "assets/config.json");
                if (file2.exists()) {
                    JSONObject jSONObject = new JSONObject(FilesKt__FileReadWriteKt.readText$default(file2, null, 1, null));
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
                    t5t.d(f18703b, "write config: " + jSONObject3);
                    String string = jSONObject3.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "newConfigObj.toString()");
                    FilesKt__FileReadWriteKt.writeText$default(file2, string, null, 2, null);
                } else {
                    t5t.d(str7, "no file config.json ");
                }
            } catch (Exception e2) {
                t5t.d(f18703b, "exception: " + e2.getLocalizedMessage());
            }
        }
        File[] fileList = new File(str).listFiles();
        Intrinsics.checkNotNullExpressionValue(fileList, "fileList");
        ZipUtil.zipFiles(ArraysKt___ArraysKt.toList(fileList), new File(str2));
        return str2;
    }
}
