package com.xiaomi.infra.galaxy.fds.model;

import com.google.common.base.Strings;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes22.dex */
public class FDSObjectMultimediaData {
    public static final String DEFAULT_TYPE = "default";
    public static final MimeType[] SUPPORT_IMAGE_TYPES = {MimeType.IMAGE_PNG, MimeType.IMAGE_BMP, MimeType.IMAGE_JPEG, MimeType.IMAGE_WEBP};
    private static final String b = ":";
    private static final String c = "_";
    private Map<String, MediaInfo> a = new TreeMap();

    public static class MediaInfo {
        private String a;
        private String b;
        private MimeType c;
        private long d;
        private transient int e = 0;
        private transient int f = 0;
        private transient int g = 0;
        private transient InputStream h = null;

        public InputStream getContent() {
            return this.h;
        }

        public int getHeight() {
            return this.f;
        }

        public String getMd5() {
            return this.a;
        }

        public String getMediaKey() {
            return FDSObjectMultimediaData.getMediaKey(this.c, this.e, this.f, this.g);
        }

        public MimeType getMimeType() {
            return this.c;
        }

        public int getQuality() {
            return this.g;
        }

        public long getSize() {
            return this.d;
        }

        public String getUri() {
            return this.b;
        }

        public int getWidth() {
            return this.e;
        }

        public void setContent(InputStream inputStream) {
            this.h = inputStream;
        }

        public void setHeight(int i) {
            this.f = i;
        }

        public void setMd5(String str) {
            this.a = str;
        }

        public void setMimeType(String str) {
            this.c = MimeType.fromString(str);
        }

        public void setQuality(int i) {
            this.g = i;
        }

        public void setSize(long j) {
            this.d = j;
        }

        public void setUri(String str) {
            this.b = str;
        }

        public void setWidth(int i) {
            this.e = i;
        }

        public void setMimeType(MimeType mimeType) {
            this.c = mimeType;
        }
    }

    public static String getMediaKey(String str, int i, int i2, int i3) {
        return getMediaKey(MimeType.fromString(str), i, i2, i3);
    }

    public static boolean isSupportedType(MimeType mimeType) {
        for (MimeType mimeType2 : SUPPORT_IMAGE_TYPES) {
            if (mimeType2 == mimeType) {
                return true;
            }
        }
        return false;
    }

    public static void setMediaInfoByKey(MediaInfo mediaInfo, String str) {
        if (mediaInfo == null || Strings.isNullOrEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.trim().toLowerCase().split(":");
        int i = 0;
        if (mediaInfo.getMimeType() == null || mediaInfo.getMimeType() == MimeType.UNKNOWN) {
            mediaInfo.setMimeType(strArrSplit[0]);
        }
        for (int i2 = 1; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split("_");
            if (strArrSplit2.length >= 2) {
                if ("w".equals(strArrSplit2[0])) {
                    mediaInfo.e = Integer.parseInt(strArrSplit2[1]);
                } else if ("h".equals(strArrSplit2[0])) {
                    mediaInfo.f = Integer.parseInt(strArrSplit2[1]);
                } else if (DTransferConstants.SEARCH_KEY.equals(strArrSplit2[0])) {
                    mediaInfo.g = Integer.parseInt(strArrSplit2[1]);
                }
            }
        }
        mediaInfo.e = mediaInfo.e > 0 ? mediaInfo.e : 0;
        mediaInfo.f = mediaInfo.f > 0 ? mediaInfo.f : 0;
        if (mediaInfo.g > 0 && mediaInfo.g <= 100) {
            i = mediaInfo.g;
        }
        mediaInfo.g = i;
    }

    public MediaInfo getMediaInfo(String str, int i, int i2, int i3) {
        return this.a.get(getMediaKey(str, i, i2, i3));
    }

    public Map<String, MediaInfo> getMediaInfoMap() {
        return Collections.unmodifiableMap(this.a);
    }

    public Iterable<MediaInfo> getMediaInfos() {
        return this.a.values();
    }

    public void updateMediaInfo(MimeType mimeType, MediaInfo mediaInfo) {
        if (mediaInfo == null || mimeType == null) {
            return;
        }
        this.a.put(getMediaKey(mimeType, mediaInfo.e, mediaInfo.f, mediaInfo.g), mediaInfo);
    }

    public static String getMediaKey(MimeType mimeType, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        if (mimeType == null || mimeType == MimeType.UNKNOWN) {
            sb.append("default");
        } else {
            sb.append(mimeType.getVal());
        }
        if (i > 0) {
            sb.append(":");
            sb.append("w");
            sb.append("_");
            sb.append(i);
        }
        if (i2 > 0) {
            sb.append(":");
            sb.append("h");
            sb.append("_");
            sb.append(i2);
        }
        if (i3 > 0 && i3 <= 100) {
            sb.append(":");
            sb.append(DTransferConstants.SEARCH_KEY);
            sb.append("_");
            sb.append(i3);
        }
        return sb.toString();
    }

    public MediaInfo getMediaInfo(MimeType mimeType, int i, int i2, int i3) {
        return this.a.get(getMediaKey(mimeType, i, i2, i3));
    }
}
