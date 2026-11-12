package com.xiaomi.hm.health.device.watch_skin;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes19.dex */
public class LocalWatchSkinEntity implements Comparable<LocalWatchSkinEntity> {
    public String binPath;
    public long createTime;
    public String customBgImagePath;
    public boolean customizable;
    public String folderPath;
    public int id;
    public String md5;
    public String name;
    public int selectColor;
    public String thumbnailPath;
    public String transBgPath;

    public LocalWatchSkinEntity() {
    }

    public static LocalWatchSkinEntity contains(List<LocalWatchSkinEntity> list, String str) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            for (LocalWatchSkinEntity localWatchSkinEntity : list) {
                if (TextUtils.equals(localWatchSkinEntity.md5, str)) {
                    return localWatchSkinEntity;
                }
            }
        }
        return null;
    }

    public String toString() {
        return "<FolderPath: '" + this.folderPath + "', BinPath: '" + this.binPath + "', ThumbnailPath: '" + this.thumbnailPath + "', Md5: '" + this.md5 + "', Name: '" + this.name + "', CreateTime: " + this.createTime + ", Id: " + this.id + ", SelectColor: " + this.selectColor + ", TransBgPath: '" + this.transBgPath + "', Customizable: " + this.customizable + Typography.greater;
    }

    public LocalWatchSkinEntity(int i, String str, int i2, boolean z) {
        this.id = i;
        this.name = str;
        this.selectColor = i2;
        this.customizable = z;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull LocalWatchSkinEntity localWatchSkinEntity) {
        long j = localWatchSkinEntity.createTime;
        long j2 = this.createTime;
        if (j > j2) {
            return 1;
        }
        return j == j2 ? 0 : -1;
    }

    public LocalWatchSkinEntity(String str, String str2, String str3) {
        this.name = str;
        this.binPath = str2;
        this.thumbnailPath = str3;
    }
}
