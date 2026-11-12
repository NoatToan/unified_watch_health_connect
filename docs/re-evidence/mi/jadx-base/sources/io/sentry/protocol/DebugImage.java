package io.sentry.protocol;

import defpackage.cud;
import defpackage.f4h;
import defpackage.fsd;
import defpackage.h4h;
import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class DebugImage implements cud {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";

    @Nullable
    private String arch;

    @Nullable
    private String codeFile;

    @Nullable
    private String codeId;

    @Nullable
    private String debugFile;

    @Nullable
    private String debugId;

    @Nullable
    private String imageAddr;

    @Nullable
    private Long imageSize;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String uuid;

    public static final class a implements fsd<DebugImage> {
        @Override // defpackage.fsd
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage a(@NotNull f4h f4hVar, @NotNull ILogger iLogger) throws Exception {
            DebugImage debugImage = new DebugImage();
            f4hVar.beginObject();
            HashMap map = null;
            while (f4hVar.peek() == JsonToken.NAME) {
                String strNextName = f4hVar.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "debug_file":
                        debugImage.debugFile = f4hVar.B();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = f4hVar.B();
                        break;
                    case "image_size":
                        debugImage.imageSize = f4hVar.j0();
                        break;
                    case "code_file":
                        debugImage.codeFile = f4hVar.B();
                        break;
                    case "arch":
                        debugImage.arch = f4hVar.B();
                        break;
                    case "type":
                        debugImage.type = f4hVar.B();
                        break;
                    case "uuid":
                        debugImage.uuid = f4hVar.B();
                        break;
                    case "debug_id":
                        debugImage.debugId = f4hVar.B();
                        break;
                    case "code_id":
                        debugImage.codeId = f4hVar.B();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        f4hVar.l0(iLogger, map, strNextName);
                        break;
                }
            }
            f4hVar.endObject();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    @Nullable
    public String getArch() {
        return this.arch;
    }

    @Nullable
    public String getCodeFile() {
        return this.codeFile;
    }

    @Nullable
    public String getCodeId() {
        return this.codeId;
    }

    @Nullable
    public String getDebugFile() {
        return this.debugFile;
    }

    @Nullable
    public String getDebugId() {
        return this.debugId;
    }

    @Nullable
    public String getImageAddr() {
        return this.imageAddr;
    }

    @Nullable
    public Long getImageSize() {
        return this.imageSize;
    }

    @Nullable
    public String getType() {
        return this.type;
    }

    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUuid() {
        return this.uuid;
    }

    @Override // defpackage.cud
    public void serialize(@NotNull h4h h4hVar, @NotNull ILogger iLogger) throws IOException {
        h4hVar.beginObject();
        if (this.uuid != null) {
            h4hVar.g("uuid").c(this.uuid);
        }
        if (this.type != null) {
            h4hVar.g("type").c(this.type);
        }
        if (this.debugId != null) {
            h4hVar.g("debug_id").c(this.debugId);
        }
        if (this.debugFile != null) {
            h4hVar.g("debug_file").c(this.debugFile);
        }
        if (this.codeId != null) {
            h4hVar.g("code_id").c(this.codeId);
        }
        if (this.codeFile != null) {
            h4hVar.g("code_file").c(this.codeFile);
        }
        if (this.imageAddr != null) {
            h4hVar.g("image_addr").c(this.imageAddr);
        }
        if (this.imageSize != null) {
            h4hVar.g("image_size").i(this.imageSize);
        }
        if (this.arch != null) {
            h4hVar.g("arch").c(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                h4hVar.g(str).j(iLogger, this.unknown.get(str));
            }
        }
        h4hVar.endObject();
    }

    public void setArch(@Nullable String str) {
        this.arch = str;
    }

    public void setCodeFile(@Nullable String str) {
        this.codeFile = str;
    }

    public void setCodeId(@Nullable String str) {
        this.codeId = str;
    }

    public void setDebugFile(@Nullable String str) {
        this.debugFile = str;
    }

    public void setDebugId(@Nullable String str) {
        this.debugId = str;
    }

    public void setImageAddr(@Nullable String str) {
        this.imageAddr = str;
    }

    public void setImageSize(@Nullable Long l) {
        this.imageSize = l;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(@Nullable String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
