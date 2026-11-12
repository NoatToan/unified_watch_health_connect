package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes16.dex */
public class rft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MusicSong f47276a;
    private static final Uri d = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
    private static String[] e = {"_id", "title", "artist", "_display_name", MusicSong.SORT_TYPE_ALBUM, "artist_id", "album_id", "_size", "duration", "date_added", "date_modified", "_data", "is_music", "track"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f47275b = Collections.unmodifiableList(new ArrayList<String>() { // from class: rft.1
        {
            add("kgm");
            add("kgg");
            add("mgg");
            add("mflac");
            add("tkm");
            add("qmcflac");
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MusicSong> f47277c = new ArrayList(16);
    private ArrayList<String> h = new ArrayList<>(16);
    private HashMap<String, MusicSong> g = new HashMap<>(16);

    public List<MusicSong> a(Context context, ArrayList<String> arrayList) {
        LogUtil.a("LocalMusicHandler", "getLocalMusicList enter!");
        if (context == null || arrayList == null || arrayList.size() == 0) {
            LogUtil.a("LocalMusicHandler", "get device supportmusictypelist is null!");
            return this.f47277c;
        }
        this.h.clear();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            this.h.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            LogUtil.a("LocalMusicHandler", "getContentResolver is null!");
            return this.f47277c;
        }
        Cursor cursorE = e(contentResolver);
        if (cursorE == null) {
            LogUtil.j("LocalMusicHandler", "cursor == null.");
            return this.f47277c;
        }
        while (cursorE.moveToNext()) {
            this.f47276a = new MusicSong();
            String string = cursorE.getString(cursorE.getColumnIndexOrThrow("title"));
            this.f47276a.setSongName(string);
            this.f47276a.setSongFilePath(cursorE.getString(cursorE.getColumnIndexOrThrow("_data")));
            this.f47276a.setSourceId(cursorE.getLong(cursorE.getColumnIndex("_id")));
            this.f47276a.setSongSingerName(cursorE.getString(cursorE.getColumnIndexOrThrow("artist")));
            this.f47276a.setSongSize(cursorE.getLong(cursorE.getColumnIndexOrThrow("_size")));
            this.f47276a.setAlbumName(cursorE.getString(cursorE.getColumnIndexOrThrow(MusicSong.SORT_TYPE_ALBUM)));
            String string2 = cursorE.getString(cursorE.getColumnIndexOrThrow("_display_name"));
            this.f47276a.setFileName(string2);
            LogUtil.a("LocalMusicHandler", "set music songName = ", string, "; fileName = ", string2);
            c(this.f47276a);
        }
        cursorE.close();
        return this.f47277c;
    }

    private Cursor e(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        Uri uri = d;
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        try {
            return contentResolver.query(uri, e, "(is_music=? OR is_music is null)", (String[]) arrayList.toArray(new String[arrayList.size()]), "is_music");
        } catch (SQLiteException unused) {
            LogUtil.e("LocalMusicHandler", "getLocalMusicList SQLiteException");
            return null;
        }
    }

    private String e(MusicSong musicSong) {
        String fileName = musicSong.getFileName();
        LogUtil.a("LocalMusicHandler", "isSupportedMusic, filePath:", fileName);
        String strE = lzt.d().e(fileName, ".");
        return !TextUtils.isEmpty(strE) ? strE.toLowerCase(Locale.ENGLISH) : strE;
    }

    public boolean e(String str) {
        String strE = e(str, "\\.");
        if (!TextUtils.isEmpty(strE)) {
            strE = strE.toLowerCase(Locale.ENGLISH);
        }
        if (strE == null) {
            return false;
        }
        String strTrim = strE.replaceAll("\\(.*?\\)", "").replaceAll("\\d", "").trim();
        ReleaseLogUtil.d("DEVMGR_LocalMusicHandler", "isRightSong:", strTrim);
        return f47275b.contains(strTrim);
    }

    private String e(String str, String str2) {
        if (str == null || str2 == null) {
            ReleaseLogUtil.d("DEVMGR_LocalMusicHandler", "getFileSuffix filepath null!");
            return null;
        }
        String strA = lzt.d().a(FileUtils.getFile(str));
        if (strA == null) {
            return null;
        }
        strA.split(str2);
        String[] strArrSplit = strA.split(str2);
        if (strArrSplit.length < 2) {
            ReleaseLogUtil.d("DEVMGR_LocalMusicHandler", "canonicalPath is less 2");
            return null;
        }
        return strArrSplit[strArrSplit.length - 2];
    }

    private void c(MusicSong musicSong) {
        LogUtil.a("LocalMusicHandler", "filterLocalMusicToMyList enter.");
        if (musicSong == null || musicSong.getSongSize() <= 0) {
            return;
        }
        String fileName = musicSong.getFileName();
        if (e(fileName)) {
            ReleaseLogUtil.d("DEVMGR_LocalMusicHandler", "fileName is isDoubleSuffixInvalid");
            return;
        }
        if (lzt.d().b(musicSong) && this.g.get(fileName) == null && musicSong.getSongName() != null) {
            String strE = e(musicSong);
            if (!TextUtils.isEmpty(strE)) {
                musicSong.setSuffix(strE);
            }
            if (new File(musicSong.getSongFilePath()).exists()) {
                this.f47277c.add(musicSong);
                this.g.put(fileName, musicSong);
            } else {
                LogUtil.j("LocalMusicHandler", musicSong.getSongFilePath(), " is not exists");
            }
        } else {
            ReleaseLogUtil.d("DEVMGR_LocalMusicHandler", "UNSupported MusicType");
        }
        LogUtil.a("LocalMusicHandler", "filterLocalMusicToMyList size:", Integer.valueOf(this.f47277c.size()));
    }
}
