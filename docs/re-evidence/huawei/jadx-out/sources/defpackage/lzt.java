package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class lzt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f41227a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lzt f41228c;
    private static final Object d = new Object();
    private ParcelFileDescriptor h;
    private List<NegotiationData.TypeStruct> j = new ArrayList(16);
    private List<String> f = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41229b = false;
    private List<Integer> e = new ArrayList(16);

    static {
        HashMap map = new HashMap(16);
        f41227a = map;
        map.put("MP3", 0);
        map.put("WAV", 1);
        map.put("AAC", 2);
        map.put("SBC", 3);
        map.put("MSBC", 4);
        map.put("HWA", 5);
        map.put("CVSD", 6);
        map.put("PCM", 8);
        map.put("APE", 9);
        map.put("ALAC", 10);
        map.put("M4A", 10);
        map.put("FLAC", 11);
        map.put("OPUS", 12);
        map.put("OGG", 13);
        map.put("BUTT", 14);
        map.put("AMR", 16);
        map.put("IMY", 17);
        f41228c = null;
    }

    public static lzt d() {
        lzt lztVar;
        synchronized (d) {
            if (f41228c == null) {
                f41228c = new lzt();
            }
            lztVar = f41228c;
        }
        return lztVar;
    }

    public void a(List<Integer> list) {
        this.e = list;
    }

    public void d(List<NegotiationData.TypeStruct> list) {
        this.j = list;
    }

    public void c(List<String> list) {
        this.f = list;
    }

    public void a(boolean z) {
        this.f41229b = z;
    }

    public boolean e(MusicSong musicSong) throws Throwable {
        if (a()) {
            ReleaseLogUtil.d("DEVMGR_MusicMultiFormatManager", "Music supports 292 ");
            k(musicSong);
            if (!TextUtils.isEmpty(musicSong.getMimeType()) && musicSong.getMimeType().startsWith("video/")) {
                musicSong.setSyncFailedErrorCode(2);
                return false;
            }
            if (g(musicSong)) {
                boolean zI = i(musicSong);
                if (!zI) {
                    musicSong.setSyncFailedErrorCode(1);
                }
                return zI;
            }
            return o(musicSong);
        }
        return o(musicSong);
    }

    private boolean g(MusicSong musicSong) {
        return musicSong != null && musicSong.getChannelCount() > 0 && musicSong.getSampleRate() > 0;
    }

    private boolean o(MusicSong musicSong) {
        ReleaseLogUtil.d("DEVMGR_MusicMultiFormatManager", "Music not supports 292 ");
        LogUtil.a("MusicMultiFormatManager", "song.getSuffix()", musicSong.getSuffix());
        String suffix = musicSong.getSuffix();
        suffix.hashCode();
        if (suffix.equals("aac")) {
            return d(musicSong) || (f(musicSong) && h(musicSong));
        }
        if (suffix.equals("mp3")) {
            return c(musicSong) || (f(musicSong) && h(musicSong));
        }
        LogUtil.j("MusicMultiFormatManager", "other music format");
        return f(musicSong) && h(musicSong);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    private void k(MusicSong musicSong) throws Throwable {
        MediaExtractor mediaExtractor;
        String strJ = j(musicSong);
        if (!TextUtils.isEmpty(strJ)) {
            musicSong.setSuffix(strJ);
        }
        MediaExtractor mediaExtractor2 = null;
        try {
            try {
                mediaExtractor = new MediaExtractor();
                try {
                    e(mediaExtractor, musicSong);
                    for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                        String string = trackFormat.getString("mime");
                        LogUtil.a("MusicMultiFormatManager", "audioCodec: ", string);
                        if (!TextUtils.isEmpty(string) && string.startsWith("video/")) {
                            musicSong.setMimeType(string);
                            break;
                        }
                        if (!TextUtils.isEmpty(string) && string.startsWith("audio/")) {
                            mediaExtractor.selectTrack(i);
                            musicSong.setMimeType(string);
                            int integer = trackFormat.getInteger("channel-count");
                            if (integer > musicSong.getChannelCount()) {
                                musicSong.setChannelCount(integer);
                            }
                            int integer2 = trackFormat.getInteger("sample-rate");
                            if (integer2 > musicSong.getSampleRate()) {
                                musicSong.setSampleRate(integer2);
                            }
                            musicSong.setDuration(trackFormat.getLong("durationUs"));
                            e(musicSong, string, trackFormat);
                            LogUtil.a("MusicMultiFormatManager", "codecType:", musicSong.getCodecType());
                            LogUtil.a("MusicMultiFormatManager", "getAudioFileInfo mimeType: ", string, ",channelCount: ", Integer.valueOf(integer), ",sampleRate: ", Integer.valueOf(integer2));
                            break;
                        }
                    }
                    mediaExtractor.release();
                } catch (IOException e) {
                    e = e;
                    mediaExtractor2 = mediaExtractor;
                    ReleaseLogUtil.a("DEVMGR_MusicMultiFormatManager", "readAudioInfo e:", ExceptionUtils.c(e));
                    if (mediaExtractor2 != null) {
                        mediaExtractor2.release();
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    mediaExtractor2 = mediaExtractor;
                    ReleaseLogUtil.a("DEVMGR_MusicMultiFormatManager", "readAudioInfo e:", ExceptionUtils.c(e));
                    if (mediaExtractor2 != null) {
                        mediaExtractor2.release();
                    }
                } catch (NullPointerException e3) {
                    e = e3;
                    mediaExtractor2 = mediaExtractor;
                    ReleaseLogUtil.a("DEVMGR_MusicMultiFormatManager", "readAudioInfo e:", ExceptionUtils.c(e));
                    if (mediaExtractor2 != null) {
                        mediaExtractor2.release();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                mediaExtractor = mediaExtractor2;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (NullPointerException e6) {
            e = e6;
        }
    }

    private String j(MusicSong musicSong) {
        String fileName = musicSong.getFileName();
        LogUtil.a("MusicMultiFormatManager", "isSupportedMusic, filePath:", fileName);
        String strE = e(fileName, ".");
        return !TextUtils.isEmpty(strE) ? strE.toLowerCase(Locale.ENGLISH) : strE;
    }

    public String e(String str, String str2) {
        if (str == null || str2 == null) {
            LogUtil.a("MusicMultiFormatManager", "getFileSuffix filepath null!");
            return null;
        }
        String strA = a(FileUtils.getFile(str));
        if (strA != null) {
            int iLastIndexOf = strA.lastIndexOf(str2) + 1;
            if (iLastIndexOf < 0 || iLastIndexOf >= strA.length()) {
                LogUtil.a("MusicMultiFormatManager", "getFileSuffix suffix invalid!");
            } else {
                return strA.substring(iLastIndexOf);
            }
        }
        return null;
    }

    public String a(File file) {
        if (file == null) {
            LogUtil.a("MusicMultiFormatManager", "getCanonicalPath filepath null!");
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            LogUtil.a("MusicMultiFormatManager", "getCanonicalPath suffix invalid,error:", e.getMessage());
            return null;
        }
    }

    private void e(MusicSong musicSong, String str, MediaFormat mediaFormat) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        musicSong.setCodecType(strSubstring);
        String songFilePath = musicSong.getSongFilePath();
        if (!TextUtils.isEmpty(songFilePath)) {
            songFilePath = songFilePath.toLowerCase(Locale.getDefault());
        }
        LogUtil.a("MusicMultiFormatManager", "audioCodecType:", strSubstring);
        if (MimeTypes.AUDIO_MPEG.equals(str)) {
            musicSong.setCodecType("mp3");
        }
        if (MimeTypes.AUDIO_AAC.equals(str) || "audio/aac".equals(str)) {
            String strC = c(mediaFormat);
            LogUtil.a("MusicMultiFormatManager", "aac codecProfile:", strC);
            if (!TextUtils.isEmpty(strC)) {
                musicSong.setCodecType(c(mediaFormat));
            }
        }
        if (MimeTypes.AUDIO_ALAC.equals(str)) {
            musicSong.setCodecType("alac");
            String strC2 = c(mediaFormat);
            LogUtil.a("MusicMultiFormatManager", "alac codecProfile:", strC2);
            if (!TextUtils.isEmpty(strC2)) {
                musicSong.setCodecType(c(mediaFormat));
            }
        }
        if (MimeTypes.AUDIO_FLAC.equals(str) || (songFilePath.endsWith(".flac") && MimeTypes.AUDIO_RAW.equals(str))) {
            musicSong.setCodecType("flac");
        }
        if (songFilePath.endsWith(".wav")) {
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                musicSong.setCodecType("pcm");
            } else if ("audio/ms-adpcm".equals(str)) {
                musicSong.setCodecType("adpcm");
            }
        }
        if (MimeTypes.AUDIO_OPUS.equals(str) || (songFilePath.endsWith(".opus") && MimeTypes.AUDIO_OGG.equals(str))) {
            musicSong.setCodecType("opus");
        }
    }

    private void e(MediaExtractor mediaExtractor, MusicSong musicSong) throws IOException {
        File file = new File(musicSong.getSongFilePath());
        if (file.exists()) {
            LogUtil.a("MusicMultiFormatManager", "file  exist");
            mediaExtractor.setDataSource(file.getAbsolutePath());
            return;
        }
        LogUtil.a("MusicMultiFormatManager", "file not exist");
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = BaseApplication.b().getContentResolver().openFileDescriptor(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, musicSong.getSourceId()), "r");
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            mediaExtractor.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
        }
    }

    private String c(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("aac-profile")) {
            int integer = mediaFormat.getInteger("aac-profile");
            if (integer == 2) {
                return "aac lc";
            }
            if (integer == 5) {
                return "aac hev1";
            }
            if (integer == 29) {
                return "aac hev2";
            }
            ReleaseLogUtil.d("MusicMultiFormatManager", "Unknown AAC profile: " + integer);
            return "";
        }
        return "";
    }

    public boolean b(MusicSong musicSong) {
        String strJ = j(musicSong);
        if (TextUtils.isEmpty(strJ)) {
            return false;
        }
        String upperCase = strJ.toUpperCase(Locale.ENGLISH);
        LogUtil.a("MusicMultiFormatManager", "isSupportedMusic:", upperCase);
        return this.f.contains(upperCase);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9 A[SYNTHETIC] */
    private boolean i(MusicSong musicSong) {
        LogUtil.a("MusicMultiFormatManager", "enter isSupportedMusicSong");
        if (!b(musicSong)) {
            ReleaseLogUtil.d("DEVMGR_MusicMultiFormatManager", "isSupportedMusic musicType not support,sufixstr:", j(musicSong));
            return false;
        }
        List<NegotiationData.TypeStruct> listA = d().a(musicSong);
        if (listA == null || listA.isEmpty()) {
            ReleaseLogUtil.d("DEVMGR_MusicMultiFormatManager", "isSupportedMusic typeStructs is empty");
            return false;
        }
        for (NegotiationData.TypeStruct typeStruct : listA) {
            LogUtil.a("MusicMultiFormatManager", "isSupportedMusicSong musicType:", Integer.valueOf(typeStruct.getMusicType()));
            String codecType = musicSong.getCodecType();
            if (!lzq.b(typeStruct.getMusicEncodes(), codecType)) {
                LogUtil.a("MusicMultiFormatManager", "isSupportedMusicSong CodecType false:", musicSong.getCodecType());
            } else if ("aac lc".equalsIgnoreCase(codecType) || "aac hev1".equalsIgnoreCase(codecType) || "aac hev2".equalsIgnoreCase(codecType)) {
                if (!lzq.e(typeStruct.getSampleRate(), musicSong.getSampleRate()) && !lzq.e(typeStruct.getSampleRate(), musicSong.getSampleRate() * 2)) {
                    LogUtil.a("MusicMultiFormatManager", "isSupportedMusicSong sampleRate false:", Integer.valueOf(musicSong.getSampleRate()));
                } else {
                    if (lzq.d(typeStruct.getAudioChannelTypes(), musicSong.getChannelCount())) {
                        return true;
                    }
                    LogUtil.a("MusicMultiFormatManager", "isSupportedMusicSong channelCount false:", Integer.valueOf(musicSong.getChannelCount()));
                }
            } else if (!lzq.e(typeStruct.getSampleRate(), musicSong.getSampleRate())) {
                LogUtil.a("MusicMultiFormatManager", "isSupportedMusicSong sampleRate false:", Integer.valueOf(musicSong.getSampleRate()));
            } else {
                if (lzq.d(typeStruct.getAudioChannelTypes(), musicSong.getChannelCount())) {
                    return true;
                }
                LogUtil.a("MusicMultiFormatManager", "isSupportedMusicSong channelCount false:", Integer.valueOf(musicSong.getChannelCount()));
            }
        }
        return false;
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT < 28) {
            ReleaseLogUtil.d("DEVMGR_MusicMultiFormatManager", "checkSupportMusicFilter System not Support");
            return false;
        }
        DeviceInfo deviceInfoC = mgg.c("MusicMultiFormatManager");
        if (deviceInfoC == null) {
            ReleaseLogUtil.d("DEVMGR_MusicMultiFormatManager", "checkSupportMusicFilter deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoC, 292);
    }

    private boolean f(MusicSong musicSong) {
        Integer num = f41227a.get(musicSong.getSuffix().toUpperCase(Locale.ENGLISH));
        int iIntValue = num == null ? -1 : num.intValue();
        LogUtil.a("MusicMultiFormatManager", "checkMusicBitrate, musicType :", Integer.valueOf(iIntValue));
        if (this.j.isEmpty()) {
            LogUtil.j("MusicMultiFormatManager", "mTypeStructList mBitRateMap is empty.");
            return true;
        }
        m(musicSong);
        l(musicSong);
        LogUtil.a("MusicMultiFormatManager", "checkMusicBitrate, getSongSize :", Long.valueOf(musicSong.getSongSize()), ", getDuration :", musicSong.getDuration());
        long songSize = 0;
        try {
            if (musicSong.getDuration().longValue() != 0) {
                songSize = ((musicSong.getSongSize() * 8) / (musicSong.getDuration().longValue() / 1000000)) / 1024;
            }
        } catch (ArithmeticException unused) {
            LogUtil.e("MusicMultiFormatManager", "checkMusicBitrate, ArithmeticException");
        }
        NegotiationData.TypeStruct typeStructC = c(iIntValue);
        if (typeStructC == null) {
            LogUtil.j("MusicMultiFormatManager", "checkMusicBitrate, struct is null.");
            return true;
        }
        int musicBitrate = typeStructC.getMusicBitrate();
        LogUtil.a("MusicMultiFormatManager", "checkMusicBitrate, deviceBitrate :", Integer.valueOf(musicBitrate), ", bitrate :", Long.valueOf(songSize));
        if (musicBitrate >= songSize) {
            return true;
        }
        musicSong.setSyncFailedErrorCode(1);
        return false;
    }

    private boolean h(MusicSong musicSong) {
        Integer num = f41227a.get(musicSong.getSuffix().toUpperCase(Locale.ENGLISH));
        int iIntValue = num == null ? -1 : num.intValue();
        LogUtil.a("MusicMultiFormatManager", "checkMusicChannelCount, musicType :", Integer.valueOf(iIntValue));
        if (this.j.isEmpty()) {
            LogUtil.j("MusicMultiFormatManager", "checkMusicChannelCount mTypeStructList is empty.");
            return true;
        }
        m(musicSong);
        l(musicSong);
        NegotiationData.TypeStruct typeStructC = c(iIntValue);
        if (typeStructC == null) {
            LogUtil.j("MusicMultiFormatManager", "checkMusicChannelCount, struct is null.");
            return true;
        }
        int musicChannelCount = typeStructC.getMusicChannelCount();
        LogUtil.a("MusicMultiFormatManager", "checkMusicChannelCount, deviceChannelCount :", Integer.valueOf(musicChannelCount));
        if (musicChannelCount >= musicSong.getChannelCount()) {
            return true;
        }
        musicSong.setSyncFailedErrorCode(1);
        return false;
    }

    private NegotiationData.TypeStruct c(int i) {
        for (NegotiationData.TypeStruct typeStruct : this.j) {
            if (typeStruct.getMusicType() == i) {
                return typeStruct;
            }
        }
        return null;
    }

    public List<NegotiationData.TypeStruct> a(MusicSong musicSong) {
        ArrayList arrayList = new ArrayList();
        String upperCase = musicSong.getSuffix().toUpperCase(Locale.ENGLISH);
        musicSong.getMimeType();
        Integer num = f41227a.get(upperCase);
        int iIntValue = num == null ? -1 : num.intValue();
        LogUtil.a("MusicMultiFormatManager", "checkMusicBitrate, musicType :", Integer.valueOf(iIntValue));
        if (this.j.isEmpty()) {
            LogUtil.j("MusicMultiFormatManager", "mTypeStructList mBitRateMap is empty.");
            return arrayList;
        }
        for (NegotiationData.TypeStruct typeStruct : this.j) {
            if (typeStruct.getMusicType() == iIntValue) {
                arrayList.add(typeStruct);
            }
        }
        return arrayList;
    }

    private boolean c(MusicSong musicSong) {
        List<Integer> list = this.e;
        if (list != null && !list.isEmpty()) {
            m(musicSong);
            l(musicSong);
            if (this.e.contains(Integer.valueOf(musicSong.getSampleRate())) && !MimeTypes.AUDIO_AAC.equals(musicSong.getMimeType())) {
                return true;
            }
            musicSong.setSyncFailedErrorCode(1);
            return false;
        }
        LogUtil.j("MusicMultiFormatManager", "mMp3SampleRateList is empty");
        return true;
    }

    private boolean d(MusicSong musicSong) {
        if (!this.f41229b) {
            LogUtil.a("MusicMultiFormatManager", "not limit adts encode");
            return true;
        }
        String strM = m(musicSong);
        if (!TextUtils.isEmpty(strM)) {
            if ("FFF".equals(strM)) {
                LogUtil.a("MusicMultiFormatManager", "ADTS format:", strM);
                return true;
            }
            LogUtil.a("MusicMultiFormatManager", "not ADTS format:", strM);
            musicSong.setSyncFailedErrorCode(2);
            return false;
        }
        LogUtil.j("MusicMultiFormatManager", "stringHex is empty");
        return false;
    }

    private String m(MusicSong musicSong) {
        String strE = "";
        if (!new File(musicSong.getSongFilePath()).exists()) {
            LogUtil.j("MusicMultiFormatManager", "file not exists");
            return "";
        }
        LogUtil.a("MusicMultiFormatManager", "file.exists");
        FileInputStream fileInputStreamE = e(musicSong.getSongFilePath(), musicSong.getSourceId(), com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        if (fileInputStreamE == null) {
            LogUtil.j("MusicMultiFormatManager", "getFileByPath error.");
            IoUtils.c(this.h);
            return "";
        }
        try {
            byte[] bArr = new byte[2];
            if (fileInputStreamE.read(bArr) > 0) {
                strE = eeq.e(bArr);
                if (strE != null) {
                    strE = strE.substring(0, 3);
                }
                LogUtil.a("MusicMultiFormatManager", "stringHex :", strE);
            }
            return strE;
        } catch (IOException unused) {
            LogUtil.e("MusicMultiFormatManager", "requestUtl exception");
            return strE;
        } finally {
            IoUtils.c(fileInputStreamE);
        }
    }

    private FileInputStream e(String str, long j, Context context) {
        FileInputStream fileInputStream;
        LogUtil.a("MusicMultiFormatManager", "enter getFileInputStreamByUriId  uriId: ", Long.valueOf(j));
        FileInputStream fileInputStream2 = null;
        try {
            if (j == -1) {
                fileInputStream = new FileInputStream(CommonUtil.c(str));
            } else {
                Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriWithAppendedId);
                if (inputStreamOpenInputStream instanceof FileInputStream) {
                    LogUtil.a("MusicMultiFormatManager", "inputStream  is FileInputStream ");
                    fileInputStream = (FileInputStream) inputStreamOpenInputStream;
                } else {
                    LogUtil.a("MusicMultiFormatManager", "inputStream  not FileInputStream ");
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriWithAppendedId, "r");
                    this.h = parcelFileDescriptorOpenFileDescriptor;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        fileInputStream2 = new FileInputStream(this.h.getFileDescriptor());
                    }
                }
                return fileInputStream2;
            }
            fileInputStream2 = fileInputStream;
        } catch (FileNotFoundException unused) {
            LogUtil.e("MusicMultiFormatManager", "FileNotFoundException");
        } catch (IllegalStateException e) {
            xjt.e("IllegalStateException");
            LogUtil.e("MusicMultiFormatManager", "getFileInputStreamByUriId, IllegalStateException ", ExceptionUtils.c(e));
        } catch (SecurityException e2) {
            LogUtil.e("MusicMultiFormatManager", "getFileInputStreamByUriId, SecurityException", ExceptionUtils.c(e2));
        } finally {
            IoUtils.c(this.h);
        }
        return fileInputStream2;
    }

    private void l(MusicSong musicSong) {
        if (this.h != null) {
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                try {
                    try {
                        LogUtil.a("MusicMultiFormatManager", "MediaExtractor start");
                        mediaExtractor.setDataSource(this.h.getFileDescriptor());
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
                        musicSong.setSampleRate(trackFormat.getInteger("sample-rate"));
                        musicSong.setMimeType(trackFormat.getString("mime"));
                        musicSong.setChannelCount(trackFormat.getInteger("channel-count"));
                        musicSong.setDuration(trackFormat.getLong("durationUs"));
                        int sampleRate = musicSong.getSampleRate();
                        LogUtil.a("MusicMultiFormatManager", "sampleRate: ", Integer.valueOf(sampleRate), ", mimeType: ", musicSong.getMimeType(), ", channelCount:", Integer.valueOf(musicSong.getChannelCount()), ", duration:", musicSong.getDuration());
                    } catch (IOException unused) {
                        LogUtil.e("MusicMultiFormatManager", "MediaExtractor failed");
                    }
                } catch (IllegalArgumentException unused2) {
                    LogUtil.e("MusicMultiFormatManager", "MediaExtractor IllegalArgumentException.");
                } catch (NullPointerException unused3) {
                    LogUtil.e("MusicMultiFormatManager", "MediaExtractor NullPointerException.");
                }
                IoUtils.c(this.h);
                mediaExtractor.release();
            } catch (Throwable th) {
                IoUtils.c(this.h);
                throw th;
            }
        }
    }
}
