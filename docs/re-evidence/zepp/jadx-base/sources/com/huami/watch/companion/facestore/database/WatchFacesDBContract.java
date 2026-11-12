package com.huami.watch.companion.facestore.database;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFacesDBContract {

    public static class DownloadTaskColumns {
        public static final String DECICE_TYPE = "device_type";
        public static final String DOWNLOADS = "downloads";
        public static final String DOWNLOAD_ID = "download_id";
        public static final String FILE_PATH = "file_path";
        public static final String SKIN_BIN = "skin_bin";
        public static final String SKIN_NAME = "name";
        public static final String SKIN_SIZE = "skin_size";
        public static final String TABLE_NAME = "download_task_manager";
        public static final String THUMBNAIL = "thumbnails";
    }

    public static class FacesTrackColumns {
        public static final String DECICE_TYPE = "device_type";
        public static final String DOWNLOADS = "downloads";
        public static final String SKIN_BIN = "skin_bin";
        public static final String SKIN_NAME = "name";
        public static final String SKIN_SIZE = "skin_size";
        public static final String TABLE_NAME = "face_track";
    }
}
