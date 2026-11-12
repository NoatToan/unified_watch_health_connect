package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.detail.video.share.util.DownloadMusicUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class StorageFile<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<FileType>> type = Optional.a();
    private Optional<Slot<Miai.TimeInterval>> time_interval = Optional.a();
    private Optional<Slot<String>> size = Optional.a();
    private Optional<Slot<SizeComparator>> comparator = Optional.a();
    private Optional<Slot<String>> path = Optional.a();

    public enum FileType {
        All(0, "all"),
        Picture(1, "picture"),
        Video(2, "video"),
        Doc(3, "doc"),
        Archive(4, "archive"),
        Large_doc(5, "large_doc"),
        Zip(7, "zip"),
        Word(8, "word"),
        Ppt(9, "ppt"),
        Pdf(10, "pdf"),
        Music(11, DownloadMusicUtil.appUpgradeDirectory),
        Excel(12, "Excel");

        private int id;
        private String name;

        FileType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static FileType find(String str) {
            for (FileType fileType : values()) {
                if (fileType.name.equals(str)) {
                    return fileType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static FileType read(String str) {
            return find(str);
        }

        public static String write(FileType fileType) {
            return fileType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SizeComparator {
        Greater(1, "Greater"),
        Less(2, "Less"),
        Equal(3, "Equal");

        private int id;
        private String name;

        SizeComparator(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SizeComparator find(String str) {
            for (SizeComparator sizeComparator : values()) {
                if (sizeComparator.name.equals(str)) {
                    return sizeComparator;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SizeComparator read(String str) {
            return find(str);
        }

        public static String write(SizeComparator sizeComparator) {
            return sizeComparator.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static StorageFile read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        StorageFile storageFile = new StorageFile();
        if (zsdVar.z("name")) {
            storageFile.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("type")) {
            storageFile.setType(IntentUtils.readSlot(zsdVar.w("type"), FileType.class));
        }
        if (zsdVar.z("time_interval")) {
            storageFile.setTimeInterval(IntentUtils.readSlot(zsdVar.w("time_interval"), Miai.TimeInterval.class));
        }
        if (zsdVar.z(MediaStoreUtil.MediaInfo.SIZE)) {
            storageFile.setSize(IntentUtils.readSlot(zsdVar.w(MediaStoreUtil.MediaInfo.SIZE), String.class));
        }
        if (zsdVar.z("comparator")) {
            storageFile.setComparator(IntentUtils.readSlot(zsdVar.w("comparator"), SizeComparator.class));
        }
        if (zsdVar.z("path")) {
            storageFile.setPath(IntentUtils.readSlot(zsdVar.w("path"), String.class));
        }
        return storageFile;
    }

    public static zsd write(StorageFile storageFile) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (storageFile.name.c()) {
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(storageFile.name.b()));
        }
        if (storageFile.type.c()) {
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(storageFile.type.b()));
        }
        if (storageFile.time_interval.c()) {
            c4hVarCreateObjectNode.f0("time_interval", IntentUtils.writeSlot(storageFile.time_interval.b()));
        }
        if (storageFile.size.c()) {
            c4hVarCreateObjectNode.f0(MediaStoreUtil.MediaInfo.SIZE, IntentUtils.writeSlot(storageFile.size.b()));
        }
        if (storageFile.comparator.c()) {
            c4hVarCreateObjectNode.f0("comparator", IntentUtils.writeSlot(storageFile.comparator.b()));
        }
        if (storageFile.path.c()) {
            c4hVarCreateObjectNode.f0("path", IntentUtils.writeSlot(storageFile.path.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<SizeComparator>> getComparator() {
        return this.comparator;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getPath() {
        return this.path;
    }

    public Optional<Slot<String>> getSize() {
        return this.size;
    }

    public Optional<Slot<Miai.TimeInterval>> getTimeInterval() {
        return this.time_interval;
    }

    public Optional<Slot<FileType>> getType() {
        return this.type;
    }

    public StorageFile setComparator(Slot<SizeComparator> slot) {
        this.comparator = Optional.e(slot);
        return this;
    }

    public StorageFile setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public StorageFile setPath(Slot<String> slot) {
        this.path = Optional.e(slot);
        return this;
    }

    public StorageFile setSize(Slot<String> slot) {
        this.size = Optional.e(slot);
        return this;
    }

    public StorageFile setTimeInterval(Slot<Miai.TimeInterval> slot) {
        this.time_interval = Optional.e(slot);
        return this;
    }

    public StorageFile setType(Slot<FileType> slot) {
        this.type = Optional.e(slot);
        return this;
    }
}
