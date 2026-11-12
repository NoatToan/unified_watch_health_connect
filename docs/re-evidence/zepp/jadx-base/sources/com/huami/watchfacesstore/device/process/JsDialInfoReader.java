package com.huami.watchfacesstore.device.process;

import com.google.gson.JsonParseException;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.ZipUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/watchfacesstore/device/process/JsDialInfoReader;", "Lcom/huami/watchfacesstore/device/process/IDialInfoReader;", "", "path", "", "a", "", "", "readDialInfo", "(Ljava/lang/String;)[Ljava/lang/Long;", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class JsDialInfoReader implements IDialInfoReader {

    @NotNull
    private static final String a = "app.json";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start to unzip " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "readDialInfo error: " + this.a;
        }
    }

    private final int a(String path) {
        JSONObject jSONObjectOptJSONObject = new JSONObject(c.readText$default(new File(path), null, 1, null)).optJSONObject("app");
        Integer numValueOf = jSONObjectOptJSONObject != null ? Integer.valueOf(jSONObjectOptJSONObject.optInt("appId")) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        throw new JsonParseException("app.json parse error");
    }

    @Override // com.huami.watchfacesstore.device.process.IDialInfoReader
    @NotNull
    public Long[] readDialInfo(@NotNull String path) {
        Long[] lArr = new Long[2];
        try {
            String parent = new File(path).getParent();
            String str = parent + "/app.json";
            if (!new File(str).exists()) {
                HMLog.info("IDialInfoReader", new a(path));
                ZipUtil.upZipSelectedFile(new File(path), parent, a);
            }
            lArr[0] = Long.valueOf(a(str));
            lArr[1] = Long.valueOf(new File(path).length());
        } catch (Exception e) {
            HMLog.error$default("IDialInfoReader", null, null, new b(e), 6, null);
        }
        return lArr;
    }
}
