package com.huami.device.core.agps.impl.store;

import com.huami.device.core.agps.comm.AGPSGroup;
import com.huami.device.core.agps.comm.FileDto;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bJ\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/device/core/agps/impl/store/ManifestDecode;", "", "", "Ljava/io/File;", "a", "Lcom/huami/device/core/agps/comm/FileDto;", "loadManifestFileMap", "file", "Lorg/json/JSONObject;", "getJson", "jsonElement", "Lorg/json/JSONArray;", "getMetaArray", "jsonArray", "", "Lcom/huami/device/core/agps/comm/AGPSGroup;", "getMetaData", "", "clearTempFiles", "Ljava/io/File;", "zipFile", "", "b", "Ljava/lang/String;", "tempPath", "c", "Ljava/lang/Iterable;", "types", "<init>", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/Iterable;)V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class ManifestDecode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final File zipFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String tempPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Iterable<AGPSGroup> types;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "删除文件失败";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ManifestDecode(@NotNull File file, @NotNull String str, @NotNull Iterable<? extends AGPSGroup> iterable) {
        this.zipFile = file;
        this.tempPath = str;
        this.types = iterable;
    }

    private final Iterable<File> a() throws Exception {
        ArrayList<File> arrayListUnzip = AGPSFirmwareHelperKt.unzip(this.zipFile, this.tempPath);
        if (arrayListUnzip.isEmpty()) {
            throw new Exception("zip file error.");
        }
        return arrayListUnzip;
    }

    public final void clearTempFiles() {
        try {
            this.zipFile.deleteOnExit();
        } catch (Exception e) {
            HMLog.warn("ManifestDecode", e, a.a);
        }
    }

    @NotNull
    public final JSONObject getJson(@NotNull File file) {
        return new JSONObject(new String(c.readBytes(file), Charset.forName("utf-8")));
    }

    @NotNull
    public final JSONArray getMetaArray(@NotNull JSONObject jsonElement) {
        return jsonElement.getJSONArray("metaData");
    }

    @NotNull
    public final Map<AGPSGroup, FileDto> getMetaData(@NotNull JSONArray jsonArray) throws Exception {
        HashMap map = new HashMap();
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            if (jsonArray.isNull(i)) {
                throw new Exception("数据错误  index [" + i + "]--> " + jsonArray);
            }
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            map.put(AGPSGroup.valueOf(jSONObject.getString("type")), new FileDto(jSONObject.getInt("value"), jSONObject.getString("metaFile"), null, 4, null));
        }
        return map;
    }

    @NotNull
    public final Iterable<FileDto> loadManifestFileMap() throws Exception {
        File next;
        Iterable<File> iterableA = a();
        File file = null;
        for (File file2 : iterableA) {
            if (Intrinsics.areEqual(file2.getName(), "MANIFEST.MF")) {
                file = file2;
            }
        }
        File file3 = file;
        if (file3 == null) {
            throw new Exception("找不到 MANIFEST.MF");
        }
        Map<AGPSGroup, FileDto> metaData = getMetaData(getMetaArray(getJson(file3)));
        Iterable<AGPSGroup> iterable = this.types;
        ArrayList<FileDto> arrayList = new ArrayList();
        Iterator<AGPSGroup> it2 = iterable.iterator();
        while (it2.hasNext()) {
            FileDto fileDto = metaData.get(it2.next());
            if (fileDto != null) {
                arrayList.add(fileDto);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (FileDto fileDto2 : arrayList) {
            Iterator<File> it3 = iterableA.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!Intrinsics.areEqual(next.getName(), fileDto2.getFileName()));
            arrayList2.add(FileDto.copy$default(fileDto2, 0, null, next, 3, null));
        }
        return arrayList2;
    }
}
