package com.huami.watch.companion.watchface.bean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.file.FileDownloadHelper;
import java.util.Objects;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "WatchFaceCloud")
public class WatchFaceCloud extends Model {

    @Column(name = "Description")
    private String description;

    @Column(name = "DeviceId")
    public String deviceId;

    @Column(name = "DownloadTime")
    private int download_times;

    @Column(name = FileDownloadHelper.KEY_URL)
    private String download_url;

    @Column(name = "DownloadUsers")
    private int download_users;

    @Column(name = "HelperLink")
    private String helper_link;

    @Column(name = "Image")
    private String image;
    private int localImage;
    private WatchMeta metas;

    @Column(name = MAPCookie.KEY_NAME)
    private String name;

    @Column(name = "WatchFaceSize")
    private int size;

    @Column(name = "WatchFaceVersion")
    private String version;

    @SerializedName("id")
    @Column(index = true, name = "WatchFaceId", notNull = true, onUniqueConflict = Column.ConflictAction.REPLACE, unique = true)
    private int watchFaceId;

    public class WatchMeta {
        private String badge;
        private String gif;
        private String minimum_firmware_version;
        private String transparent_background;

        public WatchMeta() {
        }

        public String getBadge() {
            return this.badge;
        }

        public String getGif() {
            return this.gif;
        }

        public String getMinimum_firmware_version() {
            return this.minimum_firmware_version;
        }

        public String getTransparent_background() {
            return this.transparent_background;
        }

        public void setBadge(String str) {
            this.badge = str;
        }

        public void setGif(String str) {
            this.gif = str;
        }

        public void setMinimum_firmware_version(String str) {
            this.minimum_firmware_version = str;
        }

        public void setTransparent_background(String str) {
            this.transparent_background = str;
        }

        public String toString() {
            return "<Minimum_firmware_version: '" + this.minimum_firmware_version + "', Badge: '" + this.badge + "', Transparent_background: '" + this.transparent_background + "', Gif: '" + this.gif + '\'' + Typography.greater;
        }
    }

    @Override // com.activeandroid.Model
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.watchFaceId == ((WatchFaceCloud) obj).watchFaceId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public int getDownload_times() {
        return this.download_times;
    }

    public String getDownload_url() {
        return this.download_url;
    }

    public int getDownload_users() {
        return this.download_users;
    }

    public String getHelper_link() {
        return this.helper_link;
    }

    public String getImage() {
        return this.image;
    }

    public int getLocalImage() {
        return this.localImage;
    }

    public WatchMeta getMetas() {
        return this.metas;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWatchFaceId() {
        return this.watchFaceId;
    }

    @Override // com.activeandroid.Model
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.watchFaceId));
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDownload_times(int i) {
        this.download_times = i;
    }

    public void setDownload_url(String str) {
        this.download_url = str;
    }

    public void setDownload_users(int i) {
        this.download_users = i;
    }

    public void setHelper_link(String str) {
        this.helper_link = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setLocalImage(int i) {
        this.localImage = i;
    }

    public void setMetas(WatchMeta watchMeta) {
        this.metas = watchMeta;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWatchFaceId(int i) {
        this.watchFaceId = i;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return "<watchFaceId: " + this.watchFaceId + ", DeviceId: '" + this.deviceId + "', Name: '" + this.name + "', Description: '" + this.description + "', Size: " + this.size + ", Version: '" + this.version + "', Image: '" + this.image + "', Download_url: '" + this.download_url + "', Download_times: " + this.download_times + ", Download_users: " + this.download_users + ", Helper_link: '" + this.helper_link + "', Metas: " + this.metas + Typography.greater;
    }
}
