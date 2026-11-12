package com.ximalaya.ting.android.sdkdownloader.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.model.album.Announcer;
import com.ximalaya.ting.android.opensdk.model.album.SubordinatedAlbum;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.sdkdownloader.downloadutil.DownloadState;
import com.ximalaya.ting.android.sdkdownloader.exception.DbException;
import com.ximalaya.ting.android.sdkdownloader.util.XmUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.cybergarage.upnp.std.av.renderer.AVTransport;

/* JADX INFO: loaded from: classes22.dex */
public class XmDbManagerImpl implements IXmDbManager {
    private com.ximalaya.ting.android.sdkdownloader.db.a a;
    private SQLiteDatabase b;
    public static final String TABLE_NAME_TRACK = com.ximalaya.ting.android.sdkdownloader.db.a.a(AVTransport.TRACK);
    public static final String COLUMN_TRACK_ID = com.ximalaya.ting.android.sdkdownloader.db.a.a("dataId");
    public static final String COLUMN_ANNOUNCER_ID = com.ximalaya.ting.android.sdkdownloader.db.a.a("announcerId");
    public static final String COLUMN_ALBUM_ID = com.ximalaya.ting.android.sdkdownloader.db.a.a(DTransferConstants.ALBUMID);
    public static final int FINISH_VALUE = DownloadState.FINISHED.value();

    public class a extends ArrayList<Track> {
        public final /* synthetic */ Track a;

        public a(Track track) {
            this.a = track;
            add(track);
        }
    }

    public XmDbManagerImpl(Context context) {
        this.a = new com.ximalaya.ting.android.sdkdownloader.db.a(context);
    }

    private SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || this.b.isReadOnly()) {
            this.b = this.a.getWritableDatabase();
        }
        return this.b;
    }

    private ContentValues b(Track track, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("downloadedsavefilepath", track.getDownloadedSaveFilePath());
        contentValues.put("downloadstatus", Integer.valueOf(track.getDownloadStatus()));
        contentValues.put("downloadsize", Long.valueOf(track.getDownloadSize()));
        contentValues.put("downloadedsize", Long.valueOf(track.getDownloadedSize()));
        if (track.getDownloadStatus() == FINISH_VALUE) {
            contentValues.put("finishdownloadtime", Long.valueOf(System.currentTimeMillis()));
        }
        if (z) {
            return contentValues;
        }
        contentValues.put("playsize32", Integer.valueOf(track.getPlaySize32()));
        contentValues.put("downloadurl", track.getDownloadUrl());
        contentValues.put("coverurllarge", track.getCoverUrlLarge());
        contentValues.put("coverurlmiddle", track.getCoverUrlSmall());
        contentValues.put("playurl32", track.getPlayUrl32());
        contentValues.put("trackintro", track.getTrackIntro());
        contentValues.put("playurl64", track.getPlayUrl64());
        contentValues.put("downloadcount", Integer.valueOf(track.getDownloadCount()));
        contentValues.put("playurl64m4a", track.getPlayUrl64M4a());
        contentValues.put("ordernum", Integer.valueOf(track.getOrderNum()));
        contentValues.put("playsize64", Integer.valueOf(track.getPlaySize64()));
        contentValues.put("lastplayedmills", Integer.valueOf(track.getLastPlayedMills()));
        contentValues.put("playcount", Integer.valueOf(track.getPlayCount()));
        contentValues.put("islike", Integer.valueOf(track.isLike() ? 1 : 0));
        contentValues.put("tracktitle", track.getTrackTitle());
        contentValues.put("coverurlsmall", track.getCoverUrlSmall());
        contentValues.put("tracktags", track.getTrackTags());
        contentValues.put(XimalayaConst.KIND, track.getKind());
        contentValues.put("createdat", Long.valueOf(track.getCreatedAt()));
        contentValues.put("downloadtime", Long.valueOf(track.getDownloadTime()));
        contentValues.put("playsize64m4a", track.getPlaySize64m4a());
        contentValues.put("dataid", Long.valueOf(track.getDataId()));
        contentValues.put("commentcount", Integer.valueOf(track.getCommentCount()));
        contentValues.put("updatedat", Long.valueOf(track.getUpdatedAt()));
        contentValues.put("duration", Integer.valueOf(track.getDuration()));
        contentValues.put("playurl24m4a", track.getPlayUrl24M4a());
        contentValues.put("source", Integer.valueOf(track.getSource()));
        contentValues.put("favoritecount", Integer.valueOf(track.getFavoriteCount()));
        contentValues.put("playsize24m4a", track.getPlaySize24M4a());
        contentValues.put("uid", Long.valueOf(track.getUid()));
        contentValues.put(FirebaseAnalytics.Param.PRICE, Double.valueOf(track.getPrice()));
        contentValues.put("discountedprice", Double.valueOf(track.getDiscountedPrice()));
        contentValues.put("free", Boolean.valueOf(track.isFree()));
        contentValues.put(StatEvent.EVENT_WEIBO_VIEW_NUM_AUTHORIZED, Boolean.valueOf(track.isAuthorized()));
        contentValues.put("ispaid", Boolean.valueOf(track.isPaid()));
        SubordinatedAlbum album = track.getAlbum();
        if (album != null) {
            contentValues.put("uptodatetime", Long.valueOf(album.getUptoDateTime()));
            contentValues.put("album_coverurllarge", album.getCoverUrlLarge());
            contentValues.put("album_coverurlmiddle", album.getCoverUrlMiddle());
            contentValues.put("album_coverurlsmall", album.getCoverUrlSmall());
            contentValues.put("albumtitle", album.getAlbumTitle());
            contentValues.put("albumid", Long.valueOf(album.getAlbumId()));
        }
        Announcer announcer = track.getAnnouncer();
        if (announcer != null) {
            contentValues.put("followingcount", Long.valueOf(announcer.getFollowingCount()));
            contentValues.put("vsignature", announcer.getVsignature());
            contentValues.put("releasedtrackcount", Long.valueOf(announcer.getReleasedTrackCount()));
            contentValues.put("vcategoryid", Long.valueOf(announcer.getvCategoryId()));
            contentValues.put("nickname", announcer.getNickname());
            contentValues.put("announcerposition", announcer.getAnnouncerPosition());
            contentValues.put("verified", Integer.valueOf(announcer.isVerified() ? 1 : 0));
            contentValues.put("vdesc", announcer.getVdesc());
            contentValues.put("releasedalbumcount", Long.valueOf(announcer.getReleasedAlbumCount()));
            contentValues.put("avatarurl", announcer.getAvatarUrl());
            contentValues.put("followercount", Long.valueOf(announcer.getFollowerCount()));
            contentValues.put("annoucer_kind", announcer.getKind());
            contentValues.put("announcerid", Long.valueOf(announcer.getAnnouncerId()));
        }
        return contentValues;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public boolean batchDelete(List<Long> list, boolean z) {
        int iDelete;
        try {
            try {
                String strConverToString = XmUtils.converToString(list);
                if (TextUtils.isEmpty(strConverToString)) {
                    return false;
                }
                a().beginTransaction();
                if (z) {
                    iDelete = a().delete(TABLE_NAME_TRACK, COLUMN_TRACK_ID + " in (" + strConverToString + ") and downloadstatus = ? ", new String[]{DownloadState.FINISHED.value() + ""});
                } else {
                    iDelete = a().delete(TABLE_NAME_TRACK, COLUMN_TRACK_ID + " in (" + strConverToString + ") and downloadstatus <> ? ", new String[]{DownloadState.FINISHED.value() + ""});
                }
                if (iDelete > 0) {
                    a().setTransactionSuccessful();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        } finally {
            a().endTransaction();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public boolean changeDownloadSavePath(Map<Long, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        try {
            a().beginTransaction();
            for (Map.Entry<Long, String> entry : map.entrySet()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("downloadedsavefilepath", entry.getValue());
                a().update(TABLE_NAME_TRACK, contentValues, COLUMN_TRACK_ID + " = ?", new String[]{entry.getKey() + ""});
            }
            a().setTransactionSuccessful();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            a().endTransaction();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public boolean delete(long j, boolean z) {
        int iDelete;
        try {
            if (z) {
                iDelete = a().delete(TABLE_NAME_TRACK, COLUMN_TRACK_ID + " = ? and downloadstatus = ? ", new String[]{j + "", DownloadState.FINISHED.value() + ""});
            } else {
                iDelete = a().delete(TABLE_NAME_TRACK, COLUMN_TRACK_ID + " = ? and downloadstatus <> ? ", new String[]{j + "", DownloadState.FINISHED.value() + ""});
            }
            return iDelete > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public List<Track> findAll() {
        try {
            try {
                return getTrackByCursor(a().query(TABLE_NAME_TRACK, null, null, null, null, null, null));
            } catch (Exception e) {
                e.printStackTrace();
                return XmUtils.emptyList();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public Track getTrack(long j) {
        Cursor cursorQuery;
        List<Track> trackByCursor;
        try {
            cursorQuery = a().query(TABLE_NAME_TRACK, null, COLUMN_TRACK_ID + " = ?", new String[]{j + ""}, null, null, null);
        } catch (Exception e) {
            e.printStackTrace();
            cursorQuery = null;
        }
        try {
            trackByCursor = getTrackByCursor(cursorQuery);
        } catch (DbException e2) {
            e2.printStackTrace();
            trackByCursor = null;
        }
        if (trackByCursor == null || trackByCursor.isEmpty()) {
            return null;
        }
        return trackByCursor.get(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0378, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0379, code lost:
    
        r10.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Track> getTrackByCursor(Cursor cursor) throws DbException {
        if (cursor == null || !cursor.moveToFirst() || cursor.getCount() == 0) {
            if (cursor == null) {
                return null;
            }
            try {
                cursor.close();
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        do {
            try {
                Track track = new Track();
                track.setPlaySize32(cursor.getInt(cursor.getColumnIndex("playsize32")));
                track.setDownloadSize(cursor.getLong(cursor.getColumnIndex("downloadsize")));
                track.setDownloadUrl(cursor.getString(cursor.getColumnIndex("downloadurl")));
                track.setCoverUrlLarge(cursor.getString(cursor.getColumnIndex("coverurllarge")));
                track.setCoverUrlMiddle(cursor.getString(cursor.getColumnIndex("coverurlmiddle")));
                track.setPlayUrl32(cursor.getString(cursor.getColumnIndex("playurl32")));
                track.setDownloadedSaveFilePath(cursor.getString(cursor.getColumnIndex("downloadedsavefilepath")));
                track.setDownloadStatus(cursor.getInt(cursor.getColumnIndex("downloadstatus")));
                track.setTrackIntro(cursor.getString(cursor.getColumnIndex("trackintro")));
                track.setPlayUrl64(cursor.getString(cursor.getColumnIndex("playurl64")));
                track.setDownloadCount(cursor.getInt(cursor.getColumnIndex("downloadcount")));
                track.setPlayUrl64M4a(cursor.getString(cursor.getColumnIndex("playurl64m4a")));
                track.setOrderNum(cursor.getInt(cursor.getColumnIndex("ordernum")));
                track.setPlaySize64(cursor.getInt(cursor.getColumnIndex("playsize64")));
                track.setLastPlayedMills(cursor.getInt(cursor.getColumnIndex("lastplayedmills")));
                track.setPlayCount(cursor.getInt(cursor.getColumnIndex("playcount")));
                track.setLike(cursor.getInt(cursor.getColumnIndex("islike")) == 1);
                track.setTrackTitle(cursor.getString(cursor.getColumnIndex("tracktitle")));
                track.setCoverUrlSmall(cursor.getString(cursor.getColumnIndex("coverurlsmall")));
                track.setTrackTags(cursor.getString(cursor.getColumnIndex("tracktags")));
                track.setKind(cursor.getString(cursor.getColumnIndex(XimalayaConst.KIND)));
                track.setCreatedAt(cursor.getLong(cursor.getColumnIndex("createdat")));
                track.setDownloadTime(cursor.getLong(cursor.getColumnIndex("downloadtime")));
                track.setPlaySize64m4a(cursor.getString(cursor.getColumnIndex("playsize64m4a")));
                track.setDownloadedSize(cursor.getInt(cursor.getColumnIndex("downloadedsize")));
                track.setDataId(cursor.getLong(cursor.getColumnIndex("dataid")));
                track.setCommentCount(cursor.getInt(cursor.getColumnIndex("commentcount")));
                track.setUpdatedAt(cursor.getLong(cursor.getColumnIndex("updatedat")));
                track.setDuration(cursor.getInt(cursor.getColumnIndex("duration")));
                track.setPlayUrl24M4a(cursor.getString(cursor.getColumnIndex("playurl24m4a")));
                track.setSource(cursor.getInt(cursor.getColumnIndex("source")));
                track.setFavoriteCount(cursor.getInt(cursor.getColumnIndex("favoritecount")));
                track.setPlaySize24M4a(cursor.getString(cursor.getColumnIndex("playsize24m4a")));
                if (cursor.getColumnIndex("playpathhq") >= 0) {
                    track.setPlayPathHq(cursor.getString(cursor.getColumnIndex("playpathhq")));
                }
                if (cursor.getColumnIndex("orderpositon") >= 0) {
                    track.setOrderPositon(cursor.getInt(cursor.getColumnIndex("orderpositon")));
                }
                track.setUid(cursor.getLong(cursor.getColumnIndex("uid")));
                track.setPrice(cursor.getDouble(cursor.getColumnIndex(FirebaseAnalytics.Param.PRICE)));
                track.setDiscountedPrice(cursor.getDouble(cursor.getColumnIndex("discountedprice")));
                track.setFree(cursor.getInt(cursor.getColumnIndex("free")) == 1);
                track.setAuthorized(cursor.getInt(cursor.getColumnIndex(StatEvent.EVENT_WEIBO_VIEW_NUM_AUTHORIZED)) == 1);
                track.setPaid(cursor.getInt(cursor.getColumnIndex("ispaid")) == 1);
                Announcer announcer = new Announcer();
                announcer.setFollowingCount(cursor.getInt(cursor.getColumnIndex("followingcount")));
                announcer.setVsignature(cursor.getString(cursor.getColumnIndex("vsignature")));
                announcer.setReleasedTrackCount(cursor.getInt(cursor.getColumnIndex("releasedtrackcount")));
                announcer.setvCategoryId(cursor.getLong(cursor.getColumnIndex("vcategoryid")));
                announcer.setNickname(cursor.getString(cursor.getColumnIndex("nickname")));
                announcer.setAnnouncerPosition(cursor.getString(cursor.getColumnIndex("announcerposition")));
                announcer.setVerified(cursor.getInt(cursor.getColumnIndex("verified")) == 1);
                announcer.setVdesc(cursor.getString(cursor.getColumnIndex("vdesc")));
                announcer.setReleasedAlbumCount(cursor.getLong(cursor.getColumnIndex("releasedalbumcount")));
                announcer.setAvatarUrl(cursor.getString(cursor.getColumnIndex("avatarurl")));
                announcer.setFollowerCount(cursor.getLong(cursor.getColumnIndex("followercount")));
                announcer.setKind(cursor.getString(cursor.getColumnIndex("annoucer_kind")));
                announcer.setAnnouncerId(cursor.getLong(cursor.getColumnIndex("announcerid")));
                track.setAnnouncer(announcer);
                SubordinatedAlbum subordinatedAlbum = new SubordinatedAlbum();
                subordinatedAlbum.setUptoDateTime(cursor.getLong(cursor.getColumnIndex("uptodatetime")));
                subordinatedAlbum.setCoverUrlLarge(cursor.getString(cursor.getColumnIndex("album_coverurllarge")));
                subordinatedAlbum.setCoverUrlMiddle(cursor.getString(cursor.getColumnIndex("album_coverurlmiddle")));
                subordinatedAlbum.setCoverUrlSmall(cursor.getString(cursor.getColumnIndex("album_coverurlsmall")));
                subordinatedAlbum.setAlbumTitle(cursor.getString(cursor.getColumnIndex("albumtitle")));
                subordinatedAlbum.setAlbumId(cursor.getLong(cursor.getColumnIndex("albumid")));
                track.setAlbum(subordinatedAlbum);
                track.setDownloadCreated(cursor.getLong(cursor.getColumnIndex("finishdownloadtime")));
                arrayList.add(track);
            } catch (Throwable th) {
                try {
                    cursor.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                throw th;
            }
        } while (cursor.moveToNext());
        cursor.close();
        return arrayList;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public List<Track> getTracksByIds(Set<Long> set) {
        Cursor cursorQuery;
        List<Track> trackByCursor = null;
        try {
            String strConverToString = XmUtils.converToString(set);
            cursorQuery = a().query(TABLE_NAME_TRACK, null, COLUMN_TRACK_ID + " in (" + strConverToString + ") ", null, null, null, null);
        } catch (Exception e) {
            e.printStackTrace();
            cursorQuery = null;
        }
        try {
            trackByCursor = getTrackByCursor(cursorQuery);
        } catch (DbException e2) {
            e2.printStackTrace();
        }
        return (trackByCursor == null || trackByCursor.isEmpty()) ? XmUtils.emptyList() : trackByCursor;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public void release() {
        try {
            this.b.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public boolean saveTrack(Track track) {
        return saveTrackList(new a(track));
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public boolean saveTrackList(Collection<Track> collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        a().beginTransaction();
        try {
            for (Track track : collection) {
                if (track != null) {
                    a().insert(TABLE_NAME_TRACK, null, b(track, false));
                }
            }
            a().setTransactionSuccessful();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            a().endTransaction();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public void setAllTrackStatue(DownloadState downloadState, DownloadState downloadState2) {
        if (downloadState.equals(downloadState2)) {
            return;
        }
        int iValue = downloadState.value();
        int iValue2 = downloadState2.value();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("downloadstatus", Integer.valueOf(iValue2));
            a().update(TABLE_NAME_TRACK, contentValues, "downloadstatus = ?", new String[]{iValue + ""});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public void setAllTrackStatueExcludeFinished(DownloadState downloadState) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("downloadstatus", Integer.valueOf(downloadState.value()));
            a().update(TABLE_NAME_TRACK, contentValues, "downloadstatus <> ?", new String[]{DownloadState.FINISHED.value() + ""});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public void update(Track track) {
        if (track == null) {
            return;
        }
        try {
            ContentValues contentValuesB = b(track, true);
            if (a().update(TABLE_NAME_TRACK, contentValuesB, COLUMN_TRACK_ID + " = ?", new String[]{track.getDataId() + ""}) <= 0) {
                saveTrack(track);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public void updateDownloadedTrackPosition(Map<Long, Integer> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            try {
                a().beginTransaction();
                for (Map.Entry<Long, Integer> entry : map.entrySet()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("orderpositon", entry.getValue());
                    a().update(TABLE_NAME_TRACK, contentValues, COLUMN_TRACK_ID + " = ? and downloadstatus = ? ", new String[]{entry.getKey() + "", DownloadState.FINISHED.value() + ""});
                }
                a().setTransactionSuccessful();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            a().endTransaction();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public void setAllTrackStatue(DownloadState downloadState, DownloadState downloadState2, List<Long> list) {
        if (downloadState.equals(downloadState2)) {
            return;
        }
        int iValue = downloadState.value();
        int iValue2 = downloadState2.value();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("downloadstatus", Integer.valueOf(iValue2));
            a().update(TABLE_NAME_TRACK, contentValues, COLUMN_TRACK_ID + " in (?) and downloadstatus = ?", new String[]{XmUtils.converToString(list), iValue + ""});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.db.IXmDbManager
    public boolean changeDownloadSavePath(long j, String str) {
        if (j != 0 && !TextUtils.isEmpty(str)) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("downloadedsavefilepath", str);
                a().update(TABLE_NAME_TRACK, contentValues, COLUMN_TRACK_ID + " = ?", new String[]{j + ""});
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
