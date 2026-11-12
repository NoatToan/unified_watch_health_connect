package com.ximalaya.ting.android.player;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class PlayCacheByLRU {
    public static int PLAY_CACHE_NUM = 5;
    private static PlayCacheByLRU mInstance;
    private volatile LinkedHashMap<String, String> playUrlLruCache;

    private PlayCacheByLRU() {
    }

    public static synchronized PlayCacheByLRU getInstance() {
        if (mInstance == null) {
            mInstance = new PlayCacheByLRU();
        }
        return mInstance;
    }

    public static void release() {
        PlayCacheByLRU playCacheByLRU = mInstance;
        if (playCacheByLRU != null) {
            playCacheByLRU.removeAllNoAtLRU();
            mInstance = null;
        }
    }

    public synchronized void init() {
        if (this.playUrlLruCache == null) {
            this.playUrlLruCache = new LinkedHashMap<String, String>(PLAY_CACHE_NUM, 0.75f, true) { // from class: com.ximalaya.ting.android.player.PlayCacheByLRU.1
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<String, String> entry) {
                    if (size() <= PlayCacheByLRU.PLAY_CACHE_NUM) {
                        return false;
                    }
                    PlayerUtil.cleanCacheByMD5SoundPlay(entry.getKey());
                    return true;
                }
            };
            try {
                Iterator<String> itKeys = new JSONObject(PlayerUtil.readStrFromFile(XMediaPlayerConstants.INCOM_AUDIO_FILE_PLAY_CACHE_INFO)).keys();
                if (itKeys != null) {
                    while (itKeys.hasNext()) {
                        this.playUrlLruCache.put(itKeys.next(), "");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void putPlayUrl(String str) {
        if (str != null) {
            if (str.startsWith("http")) {
                this.playUrlLruCache.put(MD5.getFileNameMd5(str), "");
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, String> entry : this.playUrlLruCache.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    PlayerUtil.writeStr2File(jSONObject.toString(), XMediaPlayerConstants.INCOM_AUDIO_FILE_PLAY_CACHE_INFO);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void removeAllExcludeCurPlay(String str) {
        if (this.playUrlLruCache == null) {
            init();
        }
        this.playUrlLruCache.clear();
        putPlayUrl(str);
    }

    public synchronized void removeAllNoAtLRU() {
        File[] fileArrListFiles;
        try {
            File file = new File(XMediaPlayerConstants.INCOM_AUDIO_FILE_DIRECTORY);
            if (file.exists() && (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.ximalaya.ting.android.player.PlayCacheByLRU.2
                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    int iLastIndexOf;
                    if (XMediaPlayerConstants.FILE_PLAY_CACHE_INFO.equals(str)) {
                        return false;
                    }
                    if (PlayCacheByLRU.this.playUrlLruCache == null || TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) {
                        return true;
                    }
                    return !PlayCacheByLRU.this.playUrlLruCache.containsKey(str.substring(0, iLastIndexOf));
                }
            })) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2 != null) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
