package com.ximalaya.ting.android.sdkdownloader.downloadutil;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class ComparatorUtil {
    public static final int AlbumSort = 3;
    public static final int DownloadOverTime = 1;
    public static final int UserSort = 2;

    public static class a implements Comparator<Track> {
        public final /* synthetic */ LinkedHashMap a;

        public a(LinkedHashMap linkedHashMap) {
            this.a = linkedHashMap;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Track track, Track track2) {
            int orderNum;
            int orderNum2;
            int orderPositon;
            int orderPositon2;
            long downloadCreated;
            long downloadCreated2;
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                if (i != 0) {
                    return i;
                }
                if (((Integer) entry.getKey()).intValue() == 1) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        downloadCreated = track.getDownloadCreated();
                        downloadCreated2 = track2.getDownloadCreated();
                    } else {
                        downloadCreated = track2.getDownloadCreated();
                        downloadCreated2 = track.getDownloadCreated();
                    }
                    long j = downloadCreated - downloadCreated2;
                    i = j >= ParserMinimalBase.MAX_INT_L ? 1 : j <= ParserMinimalBase.MIN_INT_L ? -1 : (int) j;
                }
                if (i != 0) {
                    return i;
                }
                if (((Integer) entry.getKey()).intValue() == 2) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        orderPositon = track.getOrderPositon();
                        orderPositon2 = track2.getOrderPositon();
                    } else {
                        orderPositon = track2.getOrderPositon();
                        orderPositon2 = track.getOrderPositon();
                    }
                    i = orderPositon - orderPositon2;
                }
                if (i != 0) {
                    return i;
                }
                if (((Integer) entry.getKey()).intValue() == 3) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        orderNum = track.getOrderNum();
                        orderNum2 = track2.getOrderNum();
                    } else {
                        orderNum = track2.getOrderNum();
                        orderNum2 = track.getOrderNum();
                    }
                    i = orderNum - orderNum2;
                }
                if (i != 0) {
                    break;
                }
            }
            return i;
        }
    }

    public static class b implements Comparator<Track> {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Track track, Track track2) {
            long downloadCreated;
            long downloadCreated2;
            if (this.a) {
                downloadCreated = track.getDownloadCreated();
                downloadCreated2 = track2.getDownloadCreated();
            } else {
                downloadCreated = track2.getDownloadCreated();
                downloadCreated2 = track.getDownloadCreated();
            }
            long j = downloadCreated - downloadCreated2;
            if (j >= ParserMinimalBase.MAX_INT_L) {
                return 1;
            }
            if (j <= ParserMinimalBase.MIN_INT_L) {
                return -1;
            }
            return (int) j;
        }
    }

    public static class c implements Comparator<Track> {
        public final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Track track, Track track2) {
            return this.a ? track.getOrderPositon() - track2.getOrderPositon() : track2.getOrderPositon() - track.getOrderPositon();
        }
    }

    public static class d implements Comparator<Track> {
        public final /* synthetic */ boolean a;

        public d(boolean z) {
            this.a = z;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Track track, Track track2) {
            return this.a ? track.getOrderNum() - track2.getOrderNum() : track2.getOrderNum() - track.getOrderNum();
        }
    }

    public static Comparator<Track> comparatorByAlbumSort(boolean z) {
        return new d(z);
    }

    public static Comparator<Track> comparatorByDownloadOverTime(boolean z) {
        return new b(z);
    }

    public static Comparator<Track> comparatorByTypeMap(LinkedHashMap<Integer, Boolean> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            throw new IllegalArgumentException("sortType 不能为空");
        }
        return new a(linkedHashMap);
    }

    public static Comparator<Track> comparatorByUserSort(boolean z) {
        return new c(z);
    }
}
