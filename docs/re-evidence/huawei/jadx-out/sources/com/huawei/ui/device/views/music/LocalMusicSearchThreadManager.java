package com.huawei.ui.device.views.music;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.views.music.LocalMusicSearchThreadManager;
import defpackage.aji;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class LocalMusicSearchThreadManager {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f25003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SearchCallback f25004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25005c = 0;
    private ExtendHandler d;

    public interface SearchCallback {
        void onSearchResult(List<MusicSong> list);
    }

    public enum SearchType {
        SONG,
        SINGER,
        ALBUM,
        FOLDER
    }

    public void c() {
        this.d = HandlerCenter.b(new Handler.Callback() { // from class: rfs
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return LocalMusicSearchThreadManager.b(message);
            }
        }, "searchLocalSong");
    }

    public static /* synthetic */ boolean b(Message message) {
        LogUtil.j("LocalMusicSearchThreadManager", "No handleMessage");
        return false;
    }

    public void d(SearchCallback searchCallback) {
        this.f25004b = searchCallback;
    }

    public void a(String str, List<MusicSong> list, SearchType searchType) {
        ExtendHandler extendHandler = this.d;
        if (extendHandler == null) {
            return;
        }
        e eVar = this.f25003a;
        if (eVar != null) {
            extendHandler.removeTasks(eVar);
        }
        int i = this.f25005c + 1;
        this.f25005c = i;
        e eVar2 = new e(this, str, list, searchType, i);
        this.f25003a = eVar2;
        this.d.postTask(eVar2);
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25006a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<LocalMusicSearchThreadManager> f25008c;
        private String d;
        private List<MusicSong> e;
        private SearchType f;

        e(LocalMusicSearchThreadManager localMusicSearchThreadManager, String str, List<MusicSong> list, SearchType searchType, int i) {
            this.d = str;
            synchronized (LocalMusicSearchThreadManager.e) {
                this.e = new ArrayList(list);
            }
            this.f25008c = new WeakReference<>(localMusicSearchThreadManager);
            this.f = searchType;
            this.f25006a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            LocalMusicSearchThreadManager localMusicSearchThreadManager;
            WeakReference<LocalMusicSearchThreadManager> weakReference = this.f25008c;
            if (weakReference == null || (localMusicSearchThreadManager = weakReference.get()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            List<MusicSong> list = this.e;
            if (list == null || list.size() < 1) {
                return;
            }
            synchronized (LocalMusicSearchThreadManager.e) {
                for (MusicSong musicSong : this.e) {
                    int iOrdinal = this.f.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    if (LocalMusicSearchThreadManager.this.d(LocalMusicSearchThreadManager.this.c(musicSong), this.d)) {
                                        arrayList.add(musicSong);
                                    }
                                }
                            } else if (LocalMusicSearchThreadManager.this.d(musicSong.getAlbumName(), this.d)) {
                                arrayList.add(musicSong);
                            }
                        } else if (LocalMusicSearchThreadManager.this.d(musicSong.getSongSingerName(), this.d)) {
                            arrayList.add(musicSong);
                        }
                    } else if (LocalMusicSearchThreadManager.this.d(musicSong.getSongName(), this.d)) {
                        arrayList.add(musicSong);
                    }
                }
            }
            if (this.f25006a != localMusicSearchThreadManager.f25005c) {
                LogUtil.a("LocalMusicSearchThreadManager", "searchResult mNumber :" + this.f25006a + ",mThreadNumber:" + LocalMusicSearchThreadManager.this.f25005c);
                return;
            }
            LogUtil.a("LocalMusicSearchThreadManager", "searchResult size:" + arrayList.size());
            if (localMusicSearchThreadManager.f25004b != null) {
                localMusicSearchThreadManager.f25004b.onSearchResult(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(MusicSong musicSong) {
        if (musicSong == null) {
            return "";
        }
        String songFilePath = musicSong.getSongFilePath();
        if (TextUtils.isEmpty(songFilePath)) {
            return "";
        }
        int iLastIndexOf = songFilePath.lastIndexOf("/");
        return iLastIndexOf > 0 ? songFilePath.substring(0, iLastIndexOf) : songFilePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str, String str2) {
        LogUtil.a("LocalMusicSearchThreadManager", "isMatch songName :" + str + ",songKey:" + str2);
        if (str == null || str2 == null) {
            return false;
        }
        boolean zContains = str.contains(str2);
        if (b(str).contains(str2.toUpperCase(Locale.ENGLISH))) {
            return true;
        }
        return zContains;
    }

    private String b(String str) {
        StringBuffer stringBuffer = new StringBuffer(16);
        for (int i = 0; i < str.length(); i++) {
            String strB = aji.b(Character.toString(str.charAt(i)), "");
            if (!TextUtils.isEmpty(strB)) {
                String upperCase = strB.substring(0, 1).toUpperCase(Locale.ENGLISH);
                if (upperCase.matches("[A-Z]")) {
                    stringBuffer.append(upperCase);
                } else {
                    stringBuffer.append("#");
                }
            }
        }
        return stringBuffer.toString();
    }
}
