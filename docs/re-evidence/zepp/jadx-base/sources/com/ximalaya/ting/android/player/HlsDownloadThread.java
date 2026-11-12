package com.ximalaya.ting.android.player;

import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.ximalaya.ting.android.opensdk.model.xdcs.CdnConfigModel;
import com.ximalaya.ting.android.player.cdn.CdnCollectDataForPlay;
import com.ximalaya.ting.android.player.cdn.CdnConstants;
import com.ximalaya.ting.android.player.cdn.CdnUtil;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.UUID;
import org.cybergarage.soap.SOAP;

/* JADX INFO: loaded from: classes22.dex */
public class HlsDownloadThread {
    private BufferItem mBufferItem;
    private String mCurrentDownloadUrl;
    public long mLimitConnectTime;
    public long mLimitDownloadSpeed;

    public HlsDownloadThread(String str, BufferItem bufferItem) {
        this.mCurrentDownloadUrl = str;
        this.mBufferItem = bufferItem;
    }

    /* JADX WARN: Code duplicated, block: B:1002:0x1b7a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:1008:0x1bae  */
    /* JADX WARN: Code duplicated, block: B:1011:0x1bcd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:1023:0x1c07  */
    /* JADX WARN: Code duplicated, block: B:1025:0x1c0b  */
    /* JADX WARN: Code duplicated, block: B:1034:0x1c38 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:1044:0x1c70 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:1047:0x1c7c  */
    /* JADX WARN: Code duplicated, block: B:1050:0x1c8a  */
    /* JADX WARN: Code duplicated, block: B:1053:0x1c9a  */
    /* JADX WARN: Code duplicated, block: B:1055:0x1ca4  */
    /* JADX WARN: Code duplicated, block: B:1057:0x1ca9  */
    /* JADX WARN: Code duplicated, block: B:1081:0x1c17 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1083:0x1c10 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1087:0x19b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1097:0x19ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1103:0x1b36 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1105:0x1b3d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1109:0x1916 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1111:0x190f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1113:0x1cb5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1115:0x1cae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1119:0x16ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1121:0x16c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1131:0x1840 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1133:0x1839 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1137:0x1a53 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1141:0x1a5a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x06ac A[Catch: MalformedURLException -> 0x06b1, all -> 0x06ce, IOException -> 0x06e1, FileNotFoundException -> 0x06f9, IllegalArgumentException -> 0x0713, UnknownHostException -> 0x072f, SocketTimeoutException -> 0x074b, TRY_LEAVE, TryCatch #73 {MalformedURLException -> 0x06b1, blocks: (B:256:0x069c, B:259:0x06a3, B:261:0x06ac), top: B:1099:0x069c }] */
    /* JADX WARN: Code duplicated, block: B:263:0x06af  */
    /* JADX WARN: Code duplicated, block: B:468:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:620:0x11ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x024b  */
    /* JADX WARN: Code duplicated, block: B:759:0x15cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:791:0x167b  */
    /* JADX WARN: Code duplicated, block: B:793:0x1681 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:807:0x16be  */
    /* JADX WARN: Code duplicated, block: B:809:0x16c2  */
    /* JADX WARN: Code duplicated, block: B:820:0x1710 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:841:0x17d4  */
    /* JADX WARN: Code duplicated, block: B:844:0x17f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:856:0x1831  */
    /* JADX WARN: Code duplicated, block: B:858:0x1834  */
    /* JADX WARN: Code duplicated, block: B:869:0x187f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:874:0x18b3  */
    /* JADX WARN: Code duplicated, block: B:877:0x18d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:880:0x18dd  */
    /* JADX WARN: Code duplicated, block: B:883:0x18eb  */
    /* JADX WARN: Code duplicated, block: B:886:0x18fb  */
    /* JADX WARN: Code duplicated, block: B:888:0x1905  */
    /* JADX WARN: Code duplicated, block: B:890:0x190a  */
    /* JADX WARN: Code duplicated, block: B:903:0x1942 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:906:0x194c A[Catch: all -> 0x1922, TryCatch #106 {all -> 0x1922, blocks: (B:821:0x1712, B:823:0x171c, B:825:0x172a, B:826:0x1738, B:828:0x177c, B:830:0x1784, B:832:0x1796, B:834:0x179c, B:836:0x17a8, B:838:0x17b4, B:840:0x17c9, B:842:0x17dc, B:839:0x17c2, B:870:0x1881, B:872:0x1889, B:873:0x1898, B:875:0x18b5, B:904:0x1944, B:906:0x194c, B:907:0x195b, B:934:0x19e4, B:936:0x19ec, B:937:0x19fb, B:965:0x1a97, B:967:0x1aa2, B:968:0x1ab1, B:970:0x1abb, B:972:0x1ae7, B:971:0x1adb), top: B:1107:0x1712 }] */
    /* JADX WARN: Code duplicated, block: B:909:0x1975 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:912:0x1981  */
    /* JADX WARN: Code duplicated, block: B:915:0x198f  */
    /* JADX WARN: Code duplicated, block: B:918:0x199f  */
    /* JADX WARN: Code duplicated, block: B:920:0x19a9  */
    /* JADX WARN: Code duplicated, block: B:922:0x19ae  */
    /* JADX WARN: Code duplicated, block: B:933:0x19e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:936:0x19ec A[Catch: all -> 0x1922, TryCatch #106 {all -> 0x1922, blocks: (B:821:0x1712, B:823:0x171c, B:825:0x172a, B:826:0x1738, B:828:0x177c, B:830:0x1784, B:832:0x1796, B:834:0x179c, B:836:0x17a8, B:838:0x17b4, B:840:0x17c9, B:842:0x17dc, B:839:0x17c2, B:870:0x1881, B:872:0x1889, B:873:0x1898, B:875:0x18b5, B:904:0x1944, B:906:0x194c, B:907:0x195b, B:934:0x19e4, B:936:0x19ec, B:937:0x19fb, B:965:0x1a97, B:967:0x1aa2, B:968:0x1ab1, B:970:0x1abb, B:972:0x1ae7, B:971:0x1adb), top: B:1107:0x1712 }] */
    /* JADX WARN: Code duplicated, block: B:939:0x1a15 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:942:0x1a21  */
    /* JADX WARN: Code duplicated, block: B:945:0x1a2f  */
    /* JADX WARN: Code duplicated, block: B:948:0x1a3f  */
    /* JADX WARN: Code duplicated, block: B:950:0x1a49  */
    /* JADX WARN: Code duplicated, block: B:952:0x1a4e  */
    /* JADX WARN: Code duplicated, block: B:964:0x1a95 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:974:0x1af5  */
    /* JADX WARN: Code duplicated, block: B:976:0x1af8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:979:0x1b04  */
    /* JADX WARN: Code duplicated, block: B:982:0x1b12  */
    /* JADX WARN: Code duplicated, block: B:985:0x1b22  */
    /* JADX WARN: Code duplicated, block: B:987:0x1b2c  */
    /* JADX WARN: Code duplicated, block: B:989:0x1b31  */
    public int download() throws Throwable {
        String str;
        long j;
        String str2;
        IOException iOException;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        UnknownHostException unknownHostException;
        SocketTimeoutException socketTimeoutException;
        MalformedURLException malformedURLException;
        IllegalArgumentException illegalArgumentException;
        FileNotFoundException fileNotFoundException;
        Throwable th;
        Throwable th2;
        String str3;
        int i;
        String str4;
        StringBuilder sb;
        long j2;
        String str5;
        HttpURLConnection httpURLConnection2;
        String str6;
        String str7;
        boolean z;
        String str8;
        float f;
        long j3;
        HttpURLConnection httpURLConnection3;
        long j4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        float f2;
        int i2;
        int netType;
        int i3;
        ByteArrayOutputStream byteArrayOutputStream2;
        int netType2;
        String str15;
        String str16;
        HlsDownloadThread hlsDownloadThread = this;
        String str17 = IdManager.DEFAULT_VERSION_NAME;
        String str18 = "0";
        String str19 = "DownloadThread hls readData end:";
        String str20 = "success";
        String str21 = "failed";
        String str22 = "";
        CdnConfigModel cdnConfigModel = CdnUtil.getCdnConfigModel();
        boolean z2 = cdnConfigModel == null;
        String string = UUID.randomUUID().toString();
        long jCurrentTimeMillis = 0;
        int i4 = 3;
        CdnCollectDataForPlay cdnCollectDataForPlay = null;
        boolean z3 = false;
        float f3 = 0.0f;
        long jCurrentTimeMillis2 = 0;
        int i5 = 0;
        while (true) {
            i4--;
            if (i4 <= 0) {
                return -1;
            }
            String str23 = string;
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String str24 = XMediaplayerJNI.Tag;
            StringBuilder sb2 = new StringBuilder();
            str17 = str17;
            sb2.append("DownloadThread hls readData start:");
            sb2.append(jCurrentTimeMillis3);
            Logger.log(str24, sb2.toString());
            Logger.log(XMediaplayerJNI.Tag, "DownloadThread hls readData mCurrentDownloadUrl:" + hlsDownloadThread.mCurrentDownloadUrl);
            if (!z2) {
                cdnCollectDataForPlay = new CdnCollectDataForPlay();
            }
            cdnCollectDataForPlay = cdnCollectDataForPlay;
            try {
                try {
                    String str25 = XMediaplayerJNI.Tag;
                    try {
                        StringBuilder sb3 = new StringBuilder();
                        str = str18;
                        try {
                            sb3.append("HlsDownloadThread mPlayUrl:");
                            sb3.append(hlsDownloadThread.mCurrentDownloadUrl);
                            Logger.log(str25, sb3.toString());
                            String str26 = hlsDownloadThread.mCurrentDownloadUrl;
                            String[] strArr = {str26};
                            String host = TextUtils.isEmpty(str26) ? str22 : Uri.parse(hlsDownloadThread.mCurrentDownloadUrl).getHost();
                            j = jCurrentTimeMillis3;
                            try {
                                HttpURLConnection connectionUseDnsCache = PlayerUtil.getConnectionUseDnsCache(strArr, null, 4, false, "GET");
                                try {
                                    hlsDownloadThread.mCurrentDownloadUrl = strArr[0];
                                    String str27 = str19;
                                    str5 = "s, connected_time_threshold=";
                                    if (connectionUseDnsCache == null) {
                                        if (z2 || cdnCollectDataForPlay == null) {
                                            httpURLConnection2 = connectionUseDnsCache;
                                            str6 = str20;
                                            str7 = str21;
                                            z = z2;
                                        } else {
                                            z = z2;
                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                cdnCollectDataForPlay.setViaInfo(null);
                                            }
                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                cdnCollectDataForPlay.setStatusCode(str22);
                                            }
                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                            if (cdnCollectDataForPlay.getDownloadResult() == null || !cdnCollectDataForPlay.getDownloadResult().contains(str20)) {
                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                            }
                                            if (z3) {
                                                str6 = str20;
                                                str7 = str21;
                                            } else {
                                                int netType3 = cdnConfigModel.getNetType();
                                                if (netType3 == -1) {
                                                    str6 = str20;
                                                    str7 = str21;
                                                    httpURLConnection2 = connectionUseDnsCache;
                                                    f = f3;
                                                    z2 = true;
                                                    str8 = str22;
                                                } else {
                                                    if (netType3 == 0) {
                                                        hlsDownloadThread.mLimitConnectTime = cdnConfigModel.getCdnNotWifiConnectTimeout();
                                                        long cdnNotWifiAlertRate = cdnConfigModel.getCdnNotWifiAlertRate();
                                                        hlsDownloadThread.mLimitDownloadSpeed = cdnNotWifiAlertRate;
                                                        str6 = str20;
                                                        str7 = str21;
                                                        if (jCurrentTimeMillis > hlsDownloadThread.mLimitConnectTime * 1000) {
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECTED_TOO_SLOW);
                                                            cdnCollectDataForPlay.setExceptionReason("connected_time=" + CdnUtil.oneDecimal(jCurrentTimeMillis, false) + "s, connected_time_threshold=" + hlsDownloadThread.mLimitConnectTime + SOAP.XMLNS);
                                                        } else {
                                                            float f4 = f3;
                                                            if (cdnNotWifiAlertRate > f4) {
                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_DOWNLOAD_TOO_SLOW);
                                                                cdnCollectDataForPlay.setExceptionReason("download_speed=" + CdnUtil.oneDecimal(f4, true) + "KB/s, download_speed_threshold=" + hlsDownloadThread.mLimitDownloadSpeed + "KB/s");
                                                            }
                                                            f = f4;
                                                            str8 = str22;
                                                            httpURLConnection2 = connectionUseDnsCache;
                                                        }
                                                    } else {
                                                        str6 = str20;
                                                        str7 = str21;
                                                        float f5 = f3;
                                                        str8 = str22;
                                                        httpURLConnection2 = connectionUseDnsCache;
                                                        if (netType3 == 1) {
                                                            hlsDownloadThread.mLimitConnectTime = cdnConfigModel.getCdnWifiConnectTimeout();
                                                            long cdnWifiAlertRate = cdnConfigModel.getCdnWifiAlertRate();
                                                            hlsDownloadThread.mLimitDownloadSpeed = cdnWifiAlertRate;
                                                            f = f5;
                                                            hlsDownloadThread.mLimitConnectTime = 0L;
                                                            if (jCurrentTimeMillis > 1000 * 0) {
                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECTED_TOO_SLOW);
                                                                cdnCollectDataForPlay.setExceptionReason("connected_time=" + CdnUtil.oneDecimal(jCurrentTimeMillis, false) + "s, connected_time_threshold=" + hlsDownloadThread.mLimitConnectTime + SOAP.XMLNS);
                                                            } else if (cdnWifiAlertRate > f) {
                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_DOWNLOAD_TOO_SLOW);
                                                                cdnCollectDataForPlay.setExceptionReason("download_speed=" + CdnUtil.oneDecimal(f, true) + "KB/s, download_speed_threshold=" + hlsDownloadThread.mLimitDownloadSpeed + "KB/s");
                                                            }
                                                        } else {
                                                            f = f5;
                                                        }
                                                    }
                                                    z2 = z;
                                                }
                                                if (httpURLConnection2 != null) {
                                                    httpURLConnection2.disconnect();
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, str27 + (System.currentTimeMillis() - j));
                                                str19 = str27;
                                                string = str23;
                                                str22 = str8;
                                                str20 = str6;
                                                str21 = str7;
                                                f3 = f;
                                            }
                                            httpURLConnection2 = connectionUseDnsCache;
                                        }
                                        f = f3;
                                        str8 = str22;
                                        z2 = z;
                                        if (httpURLConnection2 != null) {
                                            httpURLConnection2.disconnect();
                                        }
                                        Logger.log(XMediaplayerJNI.Tag, str27 + (System.currentTimeMillis() - j));
                                        str19 = str27;
                                        string = str23;
                                        str22 = str8;
                                        str20 = str6;
                                        str21 = str7;
                                        f3 = f;
                                    } else {
                                        str2 = str20;
                                        str21 = str21;
                                        z2 = z2;
                                        HttpURLConnection httpURLConnection4 = connectionUseDnsCache;
                                        float f6 = f3;
                                        str22 = str22;
                                        if (cdnCollectDataForPlay != null) {
                                            try {
                                                long jCurrentTimeMillis4 = System.currentTimeMillis() - j;
                                                f3 = f6;
                                                j3 = jCurrentTimeMillis4;
                                                try {
                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis4, false));
                                                    cdnCollectDataForPlay.setAudioUrl(hlsDownloadThread.mCurrentDownloadUrl);
                                                    cdnCollectDataForPlay.setCdnIP(CdnUtil.getUrlIp(hlsDownloadThread.mCurrentDownloadUrl));
                                                    cdnCollectDataForPlay.setCdnDomain(host);
                                                    cdnCollectDataForPlay.setType("play_hls");
                                                    httpURLConnection = httpURLConnection4;
                                                    try {
                                                        cdnCollectDataForPlay.setViaInfo(httpURLConnection.getHeaderField("via"));
                                                        try {
                                                            cdnCollectDataForPlay.setRequestUUID(str23);
                                                            str23 = str23;
                                                            httpURLConnection4 = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                        } catch (FileNotFoundException e) {
                                                            fileNotFoundException = e;
                                                            str23 = str23;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str22 = str22;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            str19 = str27;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (z2) {
                                                                str17 = str17;
                                                            } else {
                                                                str17 = str17;
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                            if (!z2) {
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                }
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                }
                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                } else {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (IOException unused) {
                                                                }
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                } catch (IOException unused2) {
                                                                }
                                                            }
                                                            str4 = XMediaplayerJNI.Tag;
                                                            sb = new StringBuilder();
                                                            sb.append(str19);
                                                            sb.append(System.currentTimeMillis() - j);
                                                            Logger.log(str4, sb.toString());
                                                            str = str;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str28 = str2;
                                                            str21 = str21;
                                                            str20 = str28;
                                                        } catch (IllegalArgumentException e2) {
                                                            illegalArgumentException = e2;
                                                            str23 = str23;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str22 = str22;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            str19 = str27;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (!z2) {
                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                }
                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                            if (!z2) {
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                }
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                }
                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                } else {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (IOException unused3) {
                                                                }
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                } catch (IOException unused4) {
                                                                }
                                                            }
                                                            str4 = XMediaplayerJNI.Tag;
                                                            sb = new StringBuilder();
                                                            sb.append(str19);
                                                            sb.append(System.currentTimeMillis() - j);
                                                            Logger.log(str4, sb.toString());
                                                            str = str;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str29 = str2;
                                                            str21 = str21;
                                                            str20 = str29;
                                                        } catch (MalformedURLException e3) {
                                                            malformedURLException = e3;
                                                            str23 = str23;
                                                            httpURLConnection = httpURLConnection;
                                                            f3 = f3;
                                                            jCurrentTimeMillis = j3;
                                                            str2 = str2;
                                                            str21 = str21;
                                                            byteArrayOutputStream = null;
                                                            inputStream = null;
                                                            str19 = str27;
                                                            str17 = str17;
                                                            if (z2) {
                                                            }
                                                            String str30 = XMediaplayerJNI.Tag;
                                                            StringBuilder sb4 = new StringBuilder();
                                                            str = str;
                                                            sb4.append("HlsDownloadThread MalformedURLException:");
                                                            sb4.append(malformedURLException.toString());
                                                            Logger.log(str30, sb4.toString());
                                                            if (z2) {
                                                                j2 = jCurrentTimeMillis;
                                                            } else {
                                                                j2 = jCurrentTimeMillis;
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (IOException unused5) {
                                                                }
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                } catch (IOException unused6) {
                                                                }
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            jCurrentTimeMillis = j2;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str210 = str2;
                                                            str21 = str21;
                                                            str20 = str210;
                                                        } catch (SocketTimeoutException e4) {
                                                            socketTimeoutException = e4;
                                                            str23 = str23;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str22 = str22;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            str19 = str27;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (z2) {
                                                            }
                                                            if (!z2) {
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                }
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                }
                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                } else {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (IOException unused7) {
                                                                }
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                } catch (IOException unused8) {
                                                                }
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            str = str;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str211 = str2;
                                                            str21 = str21;
                                                            str20 = str211;
                                                        } catch (UnknownHostException e5) {
                                                            unknownHostException = e5;
                                                            str23 = str23;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str22 = str22;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            str19 = str27;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (!z2) {
                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                }
                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                            if (!z2) {
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                }
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                }
                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                } else {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (IOException unused9) {
                                                                }
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                } catch (IOException unused10) {
                                                                }
                                                            }
                                                            str4 = XMediaplayerJNI.Tag;
                                                            sb = new StringBuilder();
                                                            sb.append(str19);
                                                            sb.append(System.currentTimeMillis() - j);
                                                            Logger.log(str4, sb.toString());
                                                            str = str;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str212 = str2;
                                                            str21 = str21;
                                                            str20 = str212;
                                                        } catch (IOException e6) {
                                                            iOException = e6;
                                                            str23 = str23;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str22 = str22;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            str19 = str27;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (z2) {
                                                                str3 = str;
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            } else {
                                                                str3 = str;
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                            if (z2) {
                                                                i = i5;
                                                            } else {
                                                                i = i5;
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (IOException unused11) {
                                                                }
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                } catch (IOException unused12) {
                                                                }
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            str = str3;
                                                            i5 = i;
                                                            str17 = str17;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str213 = str2;
                                                            str21 = str21;
                                                            str20 = str213;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            str23 = str23;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str22 = str22;
                                                            byteArrayOutputStream = null;
                                                            str19 = str27;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (z2) {
                                                                str22 = str22;
                                                                str21 = str21;
                                                            } else {
                                                                str22 = str22;
                                                                str21 = str21;
                                                            }
                                                            if (z2) {
                                                                str2 = str2;
                                                            } else {
                                                                str2 = str2;
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                try {
                                                                    inputStream.close();
                                                                } catch (IOException unused13) {
                                                                }
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                try {
                                                                    byteArrayOutputStream.close();
                                                                } catch (IOException unused14) {
                                                                }
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            i5 = i5;
                                                            str17 = str17;
                                                            f3 = f3;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str214 = str2;
                                                            str21 = str21;
                                                            str20 = str214;
                                                        }
                                                    } catch (FileNotFoundException e7) {
                                                        e = e7;
                                                        fileNotFoundException = e;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str22 = str22;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        str19 = str27;
                                                        httpURLConnection = httpURLConnection;
                                                        jCurrentTimeMillis = j3;
                                                        inputStream = null;
                                                        if (z2) {
                                                            str17 = str17;
                                                        } else {
                                                            str17 = str17;
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str215 = str2;
                                                        str21 = str21;
                                                        str20 = str215;
                                                    } catch (IllegalArgumentException e8) {
                                                        e = e8;
                                                        illegalArgumentException = e;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str22 = str22;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        str19 = str27;
                                                        httpURLConnection = httpURLConnection;
                                                        jCurrentTimeMillis = j3;
                                                        inputStream = null;
                                                        if (!z2) {
                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                            }
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str216 = str2;
                                                        str21 = str21;
                                                        str20 = str216;
                                                    } catch (MalformedURLException e9) {
                                                        e = e9;
                                                        malformedURLException = e;
                                                        httpURLConnection = httpURLConnection;
                                                        f3 = f3;
                                                        jCurrentTimeMillis = j3;
                                                        str2 = str2;
                                                        str21 = str21;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str19 = str27;
                                                        str17 = str17;
                                                        if (z2) {
                                                        }
                                                        String str31 = XMediaplayerJNI.Tag;
                                                        StringBuilder sb5 = new StringBuilder();
                                                        str = str;
                                                        sb5.append("HlsDownloadThread MalformedURLException:");
                                                        sb5.append(malformedURLException.toString());
                                                        Logger.log(str31, sb5.toString());
                                                        if (z2) {
                                                            j2 = jCurrentTimeMillis;
                                                        } else {
                                                            j2 = jCurrentTimeMillis;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        jCurrentTimeMillis = j2;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str217 = str2;
                                                        str21 = str21;
                                                        str20 = str217;
                                                    } catch (SocketTimeoutException e10) {
                                                        e = e10;
                                                        socketTimeoutException = e;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str22 = str22;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        str19 = str27;
                                                        httpURLConnection = httpURLConnection;
                                                        jCurrentTimeMillis = j3;
                                                        inputStream = null;
                                                        if (z2) {
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str218 = str2;
                                                        str21 = str21;
                                                        str20 = str218;
                                                    } catch (UnknownHostException e11) {
                                                        e = e11;
                                                        unknownHostException = e;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str22 = str22;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        str19 = str27;
                                                        httpURLConnection = httpURLConnection;
                                                        jCurrentTimeMillis = j3;
                                                        inputStream = null;
                                                        if (!z2) {
                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                            }
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str219 = str2;
                                                        str21 = str21;
                                                        str20 = str219;
                                                    } catch (IOException e12) {
                                                        e = e12;
                                                        iOException = e;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str22 = str22;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        str19 = str27;
                                                        httpURLConnection = httpURLConnection;
                                                        jCurrentTimeMillis = j3;
                                                        inputStream = null;
                                                        if (z2) {
                                                            str3 = str;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        } else {
                                                            str3 = str;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                        if (z2) {
                                                            i = i5;
                                                        } else {
                                                            i = i5;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        str = str3;
                                                        i5 = i;
                                                        str17 = str17;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2110 = str2;
                                                        str21 = str21;
                                                        str20 = str2110;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        th = th;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str22 = str22;
                                                        byteArrayOutputStream = null;
                                                        str19 = str27;
                                                        httpURLConnection = httpURLConnection;
                                                        jCurrentTimeMillis = j3;
                                                        inputStream = null;
                                                        if (z2) {
                                                            str22 = str22;
                                                            str21 = str21;
                                                        } else {
                                                            str22 = str22;
                                                            str21 = str21;
                                                        }
                                                        if (z2) {
                                                            str2 = str2;
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        i5 = i5;
                                                        str17 = str17;
                                                        f3 = f3;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111 = str2;
                                                        str21 = str21;
                                                        str20 = str2111;
                                                    }
                                                } catch (FileNotFoundException e13) {
                                                    e = e13;
                                                    httpURLConnection = httpURLConnection4;
                                                } catch (IllegalArgumentException e14) {
                                                    e = e14;
                                                    httpURLConnection = httpURLConnection4;
                                                } catch (MalformedURLException e15) {
                                                    e = e15;
                                                    httpURLConnection = httpURLConnection4;
                                                } catch (SocketTimeoutException e16) {
                                                    e = e16;
                                                    httpURLConnection = httpURLConnection4;
                                                } catch (UnknownHostException e17) {
                                                    e = e17;
                                                    httpURLConnection = httpURLConnection4;
                                                } catch (IOException e18) {
                                                    e = e18;
                                                    httpURLConnection = httpURLConnection4;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    httpURLConnection = httpURLConnection4;
                                                }
                                            } catch (FileNotFoundException e19) {
                                                cdnConfigModel = cdnConfigModel;
                                                str22 = str22;
                                                str = str;
                                                f3 = f6;
                                                str2 = str2;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                httpURLConnection = httpURLConnection4;
                                                str19 = str27;
                                                fileNotFoundException = e19;
                                                if (z2) {
                                                    str17 = str17;
                                                } else {
                                                    str17 = str17;
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                if (!z2) {
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                    }
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                    }
                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    } else {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                str4 = XMediaplayerJNI.Tag;
                                                sb = new StringBuilder();
                                                sb.append(str19);
                                                sb.append(System.currentTimeMillis() - j);
                                                Logger.log(str4, sb.toString());
                                                str = str;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2112 = str2;
                                                str21 = str21;
                                                str20 = str2112;
                                            } catch (IllegalArgumentException e20) {
                                                cdnConfigModel = cdnConfigModel;
                                                str22 = str22;
                                                str = str;
                                                f3 = f6;
                                                str2 = str2;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                httpURLConnection = httpURLConnection4;
                                                str19 = str27;
                                                str17 = str17;
                                                illegalArgumentException = e20;
                                                if (!z2) {
                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                    }
                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                }
                                                if (!z2) {
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                    }
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                    }
                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    } else {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                str4 = XMediaplayerJNI.Tag;
                                                sb = new StringBuilder();
                                                sb.append(str19);
                                                sb.append(System.currentTimeMillis() - j);
                                                Logger.log(str4, sb.toString());
                                                str = str;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2113 = str2;
                                                str21 = str21;
                                                str20 = str2113;
                                            } catch (MalformedURLException e21) {
                                                malformedURLException = e21;
                                                httpURLConnection = httpURLConnection4;
                                                f3 = f6;
                                            } catch (SocketTimeoutException e22) {
                                                cdnConfigModel = cdnConfigModel;
                                                str22 = str22;
                                                str = str;
                                                f3 = f6;
                                                str2 = str2;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                httpURLConnection = httpURLConnection4;
                                                str19 = str27;
                                                str17 = str17;
                                                socketTimeoutException = e22;
                                                if (z2) {
                                                }
                                                if (!z2) {
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                    }
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                    }
                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    } else {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                str = str;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2114 = str2;
                                                str21 = str21;
                                                str20 = str2114;
                                            } catch (UnknownHostException e23) {
                                                cdnConfigModel = cdnConfigModel;
                                                str22 = str22;
                                                str = str;
                                                f3 = f6;
                                                str2 = str2;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                httpURLConnection = httpURLConnection4;
                                                str19 = str27;
                                                str17 = str17;
                                                unknownHostException = e23;
                                                if (!z2) {
                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                    }
                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                }
                                                if (!z2) {
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                    }
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                    }
                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    } else {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                str4 = XMediaplayerJNI.Tag;
                                                sb = new StringBuilder();
                                                sb.append(str19);
                                                sb.append(System.currentTimeMillis() - j);
                                                Logger.log(str4, sb.toString());
                                                str = str;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2115 = str2;
                                                str21 = str21;
                                                str20 = str2115;
                                            } catch (IOException e24) {
                                                cdnConfigModel = cdnConfigModel;
                                                str22 = str22;
                                                i5 = i5;
                                                f3 = f6;
                                                str2 = str2;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                httpURLConnection = httpURLConnection4;
                                                str19 = str27;
                                                iOException = e24;
                                                if (z2) {
                                                    str3 = str;
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                } else {
                                                    str3 = str;
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                if (z2) {
                                                    i = i5;
                                                } else {
                                                    i = i5;
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                str = str3;
                                                i5 = i;
                                                str17 = str17;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2116 = str2;
                                                str21 = str21;
                                                str20 = str2116;
                                            } catch (Throwable th6) {
                                                f3 = f6;
                                                cdnConfigModel = cdnConfigModel;
                                                str22 = str22;
                                                i5 = i5;
                                                str2 = str2;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                httpURLConnection = httpURLConnection4;
                                                str19 = str27;
                                                th = th6;
                                                if (z2) {
                                                    str22 = str22;
                                                    str21 = str21;
                                                } else {
                                                    str22 = str22;
                                                    str21 = str21;
                                                }
                                                if (z2) {
                                                    str2 = str2;
                                                } else {
                                                    str2 = str2;
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                i5 = i5;
                                                str17 = str17;
                                                f3 = f3;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2117 = str2;
                                                str21 = str21;
                                                str20 = str2117;
                                            }
                                        } else {
                                            f3 = f6;
                                        }
                                        try {
                                            int responseCode = httpURLConnection4.getResponseCode();
                                            if (cdnCollectDataForPlay != null) {
                                                try {
                                                    long jCurrentTimeMillis5 = System.currentTimeMillis() - j;
                                                    str19 = str27;
                                                    j3 = jCurrentTimeMillis5;
                                                    try {
                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis5, false));
                                                        httpURLConnection = httpURLConnection4;
                                                        try {
                                                            cdnCollectDataForPlay.setViaInfo(httpURLConnection.getHeaderField("via"));
                                                            StringBuilder sb6 = new StringBuilder();
                                                            sb6.append(responseCode);
                                                            try {
                                                                sb6.append(str22);
                                                                cdnCollectDataForPlay.setStatusCode(sb6.toString());
                                                                str22 = str22;
                                                                j4 = j3;
                                                            } catch (FileNotFoundException e25) {
                                                                fileNotFoundException = e25;
                                                                str22 = str22;
                                                                str19 = str19;
                                                                f3 = f3;
                                                                byteArrayOutputStream = null;
                                                                httpURLConnection = httpURLConnection;
                                                                jCurrentTimeMillis = j3;
                                                                inputStream = null;
                                                                if (z2) {
                                                                    str17 = str17;
                                                                } else {
                                                                    str17 = str17;
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                                if (!z2) {
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                    }
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                    }
                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    } else {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                str4 = XMediaplayerJNI.Tag;
                                                                sb = new StringBuilder();
                                                                sb.append(str19);
                                                                sb.append(System.currentTimeMillis() - j);
                                                                Logger.log(str4, sb.toString());
                                                                str = str;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str2118 = str2;
                                                                str21 = str21;
                                                                str20 = str2118;
                                                            } catch (IllegalArgumentException e26) {
                                                                illegalArgumentException = e26;
                                                                str22 = str22;
                                                                str19 = str19;
                                                                f3 = f3;
                                                                byteArrayOutputStream = null;
                                                                httpURLConnection = httpURLConnection;
                                                                jCurrentTimeMillis = j3;
                                                                inputStream = null;
                                                                if (!z2) {
                                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                    }
                                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                                if (!z2) {
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                    }
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                    }
                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    } else {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                str4 = XMediaplayerJNI.Tag;
                                                                sb = new StringBuilder();
                                                                sb.append(str19);
                                                                sb.append(System.currentTimeMillis() - j);
                                                                Logger.log(str4, sb.toString());
                                                                str = str;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str2119 = str2;
                                                                str21 = str21;
                                                                str20 = str2119;
                                                            } catch (MalformedURLException e27) {
                                                                malformedURLException = e27;
                                                                httpURLConnection = httpURLConnection;
                                                                str22 = str22;
                                                                str19 = str19;
                                                                jCurrentTimeMillis = j3;
                                                                str2 = str2;
                                                                str21 = str21;
                                                                byteArrayOutputStream = null;
                                                                inputStream = null;
                                                                if (z2) {
                                                                }
                                                                String str32 = XMediaplayerJNI.Tag;
                                                                StringBuilder sb7 = new StringBuilder();
                                                                str = str;
                                                                sb7.append("HlsDownloadThread MalformedURLException:");
                                                                sb7.append(malformedURLException.toString());
                                                                Logger.log(str32, sb7.toString());
                                                                if (z2) {
                                                                    j2 = jCurrentTimeMillis;
                                                                } else {
                                                                    j2 = jCurrentTimeMillis;
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                jCurrentTimeMillis = j2;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str21110 = str2;
                                                                str21 = str21;
                                                                str20 = str21110;
                                                            } catch (SocketTimeoutException e28) {
                                                                socketTimeoutException = e28;
                                                                str22 = str22;
                                                                str19 = str19;
                                                                f3 = f3;
                                                                byteArrayOutputStream = null;
                                                                httpURLConnection = httpURLConnection;
                                                                jCurrentTimeMillis = j3;
                                                                inputStream = null;
                                                                if (z2) {
                                                                }
                                                                if (!z2) {
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                    }
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                    }
                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    } else {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                str = str;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str21111 = str2;
                                                                str21 = str21;
                                                                str20 = str21111;
                                                            } catch (UnknownHostException e29) {
                                                                unknownHostException = e29;
                                                                str22 = str22;
                                                                str19 = str19;
                                                                f3 = f3;
                                                                byteArrayOutputStream = null;
                                                                httpURLConnection = httpURLConnection;
                                                                jCurrentTimeMillis = j3;
                                                                inputStream = null;
                                                                if (!z2) {
                                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                    }
                                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                                if (!z2) {
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                    }
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                    }
                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    } else {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                str4 = XMediaplayerJNI.Tag;
                                                                sb = new StringBuilder();
                                                                sb.append(str19);
                                                                sb.append(System.currentTimeMillis() - j);
                                                                Logger.log(str4, sb.toString());
                                                                str = str;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str21112 = str2;
                                                                str21 = str21;
                                                                str20 = str21112;
                                                            } catch (IOException e30) {
                                                                iOException = e30;
                                                                str22 = str22;
                                                                str19 = str19;
                                                                f3 = f3;
                                                                byteArrayOutputStream = null;
                                                                httpURLConnection = httpURLConnection;
                                                                jCurrentTimeMillis = j3;
                                                                inputStream = null;
                                                                if (z2) {
                                                                    str3 = str;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                } else {
                                                                    str3 = str;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                                if (z2) {
                                                                    i = i5;
                                                                } else {
                                                                    i = i5;
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                str = str3;
                                                                i5 = i;
                                                                str17 = str17;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str21113 = str2;
                                                                str21 = str21;
                                                                str20 = str21113;
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                str22 = str22;
                                                                str19 = str19;
                                                                byteArrayOutputStream = null;
                                                                httpURLConnection = httpURLConnection;
                                                                jCurrentTimeMillis = j3;
                                                                inputStream = null;
                                                                if (z2) {
                                                                    str22 = str22;
                                                                    str21 = str21;
                                                                } else {
                                                                    str22 = str22;
                                                                    str21 = str21;
                                                                }
                                                                if (z2) {
                                                                    str2 = str2;
                                                                } else {
                                                                    str2 = str2;
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                i5 = i5;
                                                                str17 = str17;
                                                                f3 = f3;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str21114 = str2;
                                                                str21 = str21;
                                                                str20 = str21114;
                                                            }
                                                        } catch (FileNotFoundException e31) {
                                                            e = e31;
                                                            fileNotFoundException = e;
                                                            str22 = str22;
                                                            str19 = str19;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (z2) {
                                                                str17 = str17;
                                                            } else {
                                                                str17 = str17;
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                            if (!z2) {
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                }
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                }
                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                } else {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            str4 = XMediaplayerJNI.Tag;
                                                            sb = new StringBuilder();
                                                            sb.append(str19);
                                                            sb.append(System.currentTimeMillis() - j);
                                                            Logger.log(str4, sb.toString());
                                                            str = str;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str21115 = str2;
                                                            str21 = str21;
                                                            str20 = str21115;
                                                        } catch (IllegalArgumentException e32) {
                                                            e = e32;
                                                            illegalArgumentException = e;
                                                            str22 = str22;
                                                            str19 = str19;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (!z2) {
                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                }
                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                            if (!z2) {
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                }
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                }
                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                } else {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            str4 = XMediaplayerJNI.Tag;
                                                            sb = new StringBuilder();
                                                            sb.append(str19);
                                                            sb.append(System.currentTimeMillis() - j);
                                                            Logger.log(str4, sb.toString());
                                                            str = str;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str21116 = str2;
                                                            str21 = str21;
                                                            str20 = str21116;
                                                        } catch (MalformedURLException e33) {
                                                            e = e33;
                                                            malformedURLException = e;
                                                            httpURLConnection = httpURLConnection;
                                                            str22 = str22;
                                                            str19 = str19;
                                                            jCurrentTimeMillis = j3;
                                                            str2 = str2;
                                                            str21 = str21;
                                                            byteArrayOutputStream = null;
                                                            inputStream = null;
                                                            if (z2) {
                                                            }
                                                            String str33 = XMediaplayerJNI.Tag;
                                                            StringBuilder sb8 = new StringBuilder();
                                                            str = str;
                                                            sb8.append("HlsDownloadThread MalformedURLException:");
                                                            sb8.append(malformedURLException.toString());
                                                            Logger.log(str33, sb8.toString());
                                                            if (z2) {
                                                                j2 = jCurrentTimeMillis;
                                                            } else {
                                                                j2 = jCurrentTimeMillis;
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            jCurrentTimeMillis = j2;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str21117 = str2;
                                                            str21 = str21;
                                                            str20 = str21117;
                                                        } catch (SocketTimeoutException e34) {
                                                            e = e34;
                                                            socketTimeoutException = e;
                                                            str22 = str22;
                                                            str19 = str19;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (z2) {
                                                            }
                                                            if (!z2) {
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                }
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                }
                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                } else {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            str = str;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str21118 = str2;
                                                            str21 = str21;
                                                            str20 = str21118;
                                                        } catch (UnknownHostException e35) {
                                                            e = e35;
                                                            unknownHostException = e;
                                                            str22 = str22;
                                                            str19 = str19;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (!z2) {
                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                }
                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                            if (!z2) {
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                }
                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                }
                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                } else {
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            str4 = XMediaplayerJNI.Tag;
                                                            sb = new StringBuilder();
                                                            sb.append(str19);
                                                            sb.append(System.currentTimeMillis() - j);
                                                            Logger.log(str4, sb.toString());
                                                            str = str;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str21119 = str2;
                                                            str21 = str21;
                                                            str20 = str21119;
                                                        } catch (IOException e36) {
                                                            e = e36;
                                                            iOException = e;
                                                            str22 = str22;
                                                            str19 = str19;
                                                            f3 = f3;
                                                            byteArrayOutputStream = null;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (z2) {
                                                                str3 = str;
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            } else {
                                                                str3 = str;
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                            if (z2) {
                                                                i = i5;
                                                            } else {
                                                                i = i5;
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            str = str3;
                                                            i5 = i;
                                                            str17 = str17;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str211110 = str2;
                                                            str21 = str21;
                                                            str20 = str211110;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            th = th;
                                                            str22 = str22;
                                                            str19 = str19;
                                                            byteArrayOutputStream = null;
                                                            httpURLConnection = httpURLConnection;
                                                            jCurrentTimeMillis = j3;
                                                            inputStream = null;
                                                            if (z2) {
                                                                str22 = str22;
                                                                str21 = str21;
                                                            } else {
                                                                str22 = str22;
                                                                str21 = str21;
                                                            }
                                                            if (z2) {
                                                                str2 = str2;
                                                            } else {
                                                                str2 = str2;
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            i5 = i5;
                                                            str17 = str17;
                                                            f3 = f3;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str211111 = str2;
                                                            str21 = str21;
                                                            str20 = str211111;
                                                        }
                                                    } catch (FileNotFoundException e37) {
                                                        e = e37;
                                                        httpURLConnection = httpURLConnection4;
                                                    } catch (MalformedURLException e38) {
                                                        e = e38;
                                                        httpURLConnection = httpURLConnection4;
                                                    } catch (IOException e39) {
                                                        e = e39;
                                                        httpURLConnection = httpURLConnection4;
                                                    } catch (IllegalArgumentException e40) {
                                                        e = e40;
                                                        httpURLConnection = httpURLConnection4;
                                                    } catch (SocketTimeoutException e41) {
                                                        e = e41;
                                                        httpURLConnection = httpURLConnection4;
                                                    } catch (UnknownHostException e42) {
                                                        e = e42;
                                                        httpURLConnection = httpURLConnection4;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        httpURLConnection = httpURLConnection4;
                                                    }
                                                } catch (FileNotFoundException e43) {
                                                    fileNotFoundException = e43;
                                                    str22 = str22;
                                                    str = str;
                                                    f3 = f3;
                                                    str2 = str2;
                                                    str21 = str21;
                                                    byteArrayOutputStream = null;
                                                    inputStream = null;
                                                    httpURLConnection = httpURLConnection4;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str19 = str27;
                                                    if (z2) {
                                                        str17 = str17;
                                                    } else {
                                                        str17 = str17;
                                                    }
                                                    Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                    if (!z2) {
                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                        }
                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                        }
                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        } else {
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                    }
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                    if (inputStream != null) {
                                                        inputStream.close();
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    str4 = XMediaplayerJNI.Tag;
                                                    sb = new StringBuilder();
                                                    sb.append(str19);
                                                    sb.append(System.currentTimeMillis() - j);
                                                    Logger.log(str4, sb.toString());
                                                    str = str;
                                                    if (cdnCollectDataForPlay != null) {
                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                    }
                                                    hlsDownloadThread = this;
                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                    str17 = str17;
                                                    str19 = str19;
                                                    str22 = str22;
                                                    string = str23;
                                                    i4 = i4;
                                                    z2 = z2;
                                                    z3 = true;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str18 = str;
                                                    String str211112 = str2;
                                                    str21 = str21;
                                                    str20 = str211112;
                                                } catch (IllegalArgumentException e44) {
                                                    illegalArgumentException = e44;
                                                    str22 = str22;
                                                    str17 = str17;
                                                    str = str;
                                                    f3 = f3;
                                                    str2 = str2;
                                                    str21 = str21;
                                                    byteArrayOutputStream = null;
                                                    inputStream = null;
                                                    httpURLConnection = httpURLConnection4;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str19 = str27;
                                                    if (!z2) {
                                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                            jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                        }
                                                        cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                        cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                        cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                        cdnCollectDataForPlay.setDownloaded(str);
                                                        cdnCollectDataForPlay.setDownloadTime(str);
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                    if (!z2) {
                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                        }
                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                        }
                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        } else {
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                    }
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                    if (inputStream != null) {
                                                        inputStream.close();
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    str4 = XMediaplayerJNI.Tag;
                                                    sb = new StringBuilder();
                                                    sb.append(str19);
                                                    sb.append(System.currentTimeMillis() - j);
                                                    Logger.log(str4, sb.toString());
                                                    str = str;
                                                    if (cdnCollectDataForPlay != null) {
                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                    }
                                                    hlsDownloadThread = this;
                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                    str17 = str17;
                                                    str19 = str19;
                                                    str22 = str22;
                                                    string = str23;
                                                    i4 = i4;
                                                    z2 = z2;
                                                    z3 = true;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str18 = str;
                                                    String str211113 = str2;
                                                    str21 = str21;
                                                    str20 = str211113;
                                                } catch (MalformedURLException e45) {
                                                    malformedURLException = e45;
                                                    httpURLConnection = httpURLConnection4;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str22 = str22;
                                                    str19 = str27;
                                                } catch (SocketTimeoutException e46) {
                                                    socketTimeoutException = e46;
                                                    str22 = str22;
                                                    str17 = str17;
                                                    str = str;
                                                    f3 = f3;
                                                    str2 = str2;
                                                    str21 = str21;
                                                    byteArrayOutputStream = null;
                                                    inputStream = null;
                                                    httpURLConnection = httpURLConnection4;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str19 = str27;
                                                    if (z2) {
                                                    }
                                                    if (!z2) {
                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                        }
                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                        }
                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        } else {
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                    }
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                    if (inputStream != null) {
                                                        inputStream.close();
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                    str = str;
                                                    if (cdnCollectDataForPlay != null) {
                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                    }
                                                    hlsDownloadThread = this;
                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                    str17 = str17;
                                                    str19 = str19;
                                                    str22 = str22;
                                                    string = str23;
                                                    i4 = i4;
                                                    z2 = z2;
                                                    z3 = true;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str18 = str;
                                                    String str211114 = str2;
                                                    str21 = str21;
                                                    str20 = str211114;
                                                } catch (UnknownHostException e47) {
                                                    unknownHostException = e47;
                                                    str22 = str22;
                                                    str17 = str17;
                                                    str = str;
                                                    f3 = f3;
                                                    str2 = str2;
                                                    str21 = str21;
                                                    byteArrayOutputStream = null;
                                                    inputStream = null;
                                                    httpURLConnection = httpURLConnection4;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str19 = str27;
                                                    if (!z2) {
                                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                            jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                        }
                                                        cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                        cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                        cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                        cdnCollectDataForPlay.setDownloaded(str);
                                                        cdnCollectDataForPlay.setDownloadTime(str);
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                    if (!z2) {
                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                        }
                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                        }
                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        } else {
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                    }
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                    if (inputStream != null) {
                                                        inputStream.close();
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    str4 = XMediaplayerJNI.Tag;
                                                    sb = new StringBuilder();
                                                    sb.append(str19);
                                                    sb.append(System.currentTimeMillis() - j);
                                                    Logger.log(str4, sb.toString());
                                                    str = str;
                                                    if (cdnCollectDataForPlay != null) {
                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                    }
                                                    hlsDownloadThread = this;
                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                    str17 = str17;
                                                    str19 = str19;
                                                    str22 = str22;
                                                    string = str23;
                                                    i4 = i4;
                                                    z2 = z2;
                                                    z3 = true;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str18 = str;
                                                    String str211115 = str2;
                                                    str21 = str21;
                                                    str20 = str211115;
                                                } catch (IOException e48) {
                                                    iOException = e48;
                                                    str22 = str22;
                                                    i5 = i5;
                                                    f3 = f3;
                                                    str2 = str2;
                                                    str21 = str21;
                                                    byteArrayOutputStream = null;
                                                    inputStream = null;
                                                    httpURLConnection = httpURLConnection4;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str19 = str27;
                                                    if (z2) {
                                                        str3 = str;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                    } else {
                                                        str3 = str;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                    }
                                                    Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                    if (z2) {
                                                        i = i5;
                                                    } else {
                                                        i = i5;
                                                    }
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                    if (inputStream != null) {
                                                        inputStream.close();
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                    str = str3;
                                                    i5 = i;
                                                    str17 = str17;
                                                    if (cdnCollectDataForPlay != null) {
                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                    }
                                                    hlsDownloadThread = this;
                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                    str17 = str17;
                                                    str19 = str19;
                                                    str22 = str22;
                                                    string = str23;
                                                    i4 = i4;
                                                    z2 = z2;
                                                    z3 = true;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str18 = str;
                                                    String str211116 = str2;
                                                    str21 = str21;
                                                    str20 = str211116;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    str22 = str22;
                                                    i5 = i5;
                                                    str2 = str2;
                                                    byteArrayOutputStream = null;
                                                    inputStream = null;
                                                    httpURLConnection = httpURLConnection4;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str19 = str27;
                                                    if (z2) {
                                                        str22 = str22;
                                                        str21 = str21;
                                                    } else {
                                                        str22 = str22;
                                                        str21 = str21;
                                                    }
                                                    if (z2) {
                                                        str2 = str2;
                                                    } else {
                                                        str2 = str2;
                                                    }
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                    if (inputStream != null) {
                                                        inputStream.close();
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                    i5 = i5;
                                                    str17 = str17;
                                                    f3 = f3;
                                                    if (cdnCollectDataForPlay != null) {
                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                    }
                                                    hlsDownloadThread = this;
                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                    str17 = str17;
                                                    str19 = str19;
                                                    str22 = str22;
                                                    string = str23;
                                                    i4 = i4;
                                                    z2 = z2;
                                                    z3 = true;
                                                    cdnConfigModel = cdnConfigModel;
                                                    str18 = str;
                                                    String str211117 = str2;
                                                    str21 = str21;
                                                    str20 = str211117;
                                                }
                                            } else {
                                                str19 = str27;
                                                str22 = str22;
                                                j4 = jCurrentTimeMillis;
                                                httpURLConnection = httpURLConnection4;
                                            }
                                            jCurrentTimeMillis = j4;
                                            try {
                                                String headerField = httpURLConnection.getHeaderField("Content-Range");
                                                if (TextUtils.isEmpty(headerField)) {
                                                    str9 = SOAP.XMLNS;
                                                    str10 = "KB/s, download_speed_threshold=";
                                                    str11 = CdnConstants.CDN_DOWNLOAD_TOO_SLOW;
                                                } else {
                                                    str10 = "KB/s, download_speed_threshold=";
                                                    try {
                                                        try {
                                                            String[] strArrSplit = headerField.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                                                            int length = strArrSplit.length;
                                                            str11 = CdnConstants.CDN_DOWNLOAD_TOO_SLOW;
                                                            if (length >= 2) {
                                                                if (TextUtils.isEmpty(strArrSplit[0])) {
                                                                    str9 = SOAP.XMLNS;
                                                                } else {
                                                                    String[] strArrSplit2 = strArrSplit[0].split(" ");
                                                                    int length2 = strArrSplit2.length;
                                                                    str9 = SOAP.XMLNS;
                                                                    if (length2 >= 2) {
                                                                        try {
                                                                            str16 = strArrSplit2[1];
                                                                        } catch (MalformedURLException e49) {
                                                                            malformedURLException = e49;
                                                                            byteArrayOutputStream = null;
                                                                            inputStream = null;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (z2 && cdnCollectDataForPlay != null) {
                                                                                try {
                                                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                    }
                                                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECT_FAIL);
                                                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(malformedURLException));
                                                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } catch (Throwable th11) {
                                                                                    th2 = th11;
                                                                                    httpURLConnection = httpURLConnection;
                                                                                    if (!z2) {
                                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                                        }
                                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                                        }
                                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                        } else {
                                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                        }
                                                                                    }
                                                                                    if (httpURLConnection != null) {
                                                                                        httpURLConnection.disconnect();
                                                                                    }
                                                                                    if (inputStream != null) {
                                                                                        try {
                                                                                            inputStream.close();
                                                                                        } catch (IOException unused15) {
                                                                                        }
                                                                                    }
                                                                                    if (byteArrayOutputStream != null) {
                                                                                        try {
                                                                                            byteArrayOutputStream.close();
                                                                                        } catch (IOException unused16) {
                                                                                        }
                                                                                    }
                                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                                    throw th2;
                                                                                }
                                                                            }
                                                                            String str34 = XMediaplayerJNI.Tag;
                                                                            StringBuilder sb9 = new StringBuilder();
                                                                            str = str;
                                                                            sb9.append("HlsDownloadThread MalformedURLException:");
                                                                            sb9.append(malformedURLException.toString());
                                                                            Logger.log(str34, sb9.toString());
                                                                            if (z2 || cdnCollectDataForPlay == null) {
                                                                                j2 = jCurrentTimeMillis;
                                                                            } else {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                j2 = jCurrentTimeMillis;
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() == null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            jCurrentTimeMillis = j2;
                                                                            if (cdnCollectDataForPlay != null && !z2 && !TextUtils.isEmpty(cdnCollectDataForPlay.getErrorType()) && !TextUtils.isEmpty(cdnCollectDataForPlay.getExceptionReason())) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211118 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211118;
                                                                        }
                                                                    }
                                                                    if (TextUtils.isEmpty(strArrSplit[1])) {
                                                                        str15 = str22;
                                                                    } else {
                                                                        str15 = strArrSplit[1];
                                                                    }
                                                                }
                                                                str16 = str22;
                                                                if (TextUtils.isEmpty(strArrSplit[1])) {
                                                                    str15 = strArrSplit[1];
                                                                } else {
                                                                    str15 = str22;
                                                                }
                                                            } else {
                                                                str9 = SOAP.XMLNS;
                                                                str15 = str22;
                                                                str16 = str15;
                                                            }
                                                            if (cdnCollectDataForPlay != null) {
                                                                cdnCollectDataForPlay.setRange(str16);
                                                                cdnCollectDataForPlay.setFileSize(str15);
                                                            }
                                                        } catch (MalformedURLException e50) {
                                                            malformedURLException = e50;
                                                        }
                                                    } catch (FileNotFoundException e51) {
                                                        fileNotFoundException = e51;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str21;
                                                        if (z2) {
                                                            str17 = str17;
                                                        } else {
                                                            str17 = str17;
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str211119 = str2;
                                                        str21 = str21;
                                                        str20 = str211119;
                                                    } catch (IllegalArgumentException e52) {
                                                        illegalArgumentException = e52;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str17 = str17;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str21;
                                                        if (!z2) {
                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                            }
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111110 = str2;
                                                        str21 = str21;
                                                        str20 = str2111110;
                                                    } catch (SocketTimeoutException e53) {
                                                        socketTimeoutException = e53;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str17 = str17;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str21;
                                                        if (z2) {
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111111 = str2;
                                                        str21 = str21;
                                                        str20 = str2111111;
                                                    } catch (UnknownHostException e54) {
                                                        unknownHostException = e54;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str17 = str17;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str21;
                                                        if (!z2) {
                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                            }
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111112 = str2;
                                                        str21 = str21;
                                                        str20 = str2111112;
                                                    } catch (IOException e55) {
                                                        iOException = e55;
                                                        i5 = i5;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str21;
                                                        if (z2) {
                                                            str3 = str;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        } else {
                                                            str3 = str;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                        if (z2) {
                                                            i = i5;
                                                        } else {
                                                            i = i5;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        str = str3;
                                                        i5 = i;
                                                        str17 = str17;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111113 = str2;
                                                        str21 = str21;
                                                        str20 = str2111113;
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        i5 = i5;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        httpURLConnection = httpURLConnection;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        if (z2) {
                                                            str22 = str22;
                                                            str21 = str21;
                                                        } else {
                                                            str22 = str22;
                                                            str21 = str21;
                                                        }
                                                        if (z2) {
                                                            str2 = str2;
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        i5 = i5;
                                                        str17 = str17;
                                                        f3 = f3;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111114 = str2;
                                                        str21 = str21;
                                                        str20 = str2111114;
                                                    }
                                                }
                                                if (responseCode != 200 && responseCode != 206) {
                                                    Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread fail responseCode:" + responseCode);
                                                    throw new IOException("HlsDownloadThread fail responseCode:" + responseCode);
                                                }
                                                int contentLength = httpURLConnection.getContentLength();
                                                if (cdnCollectDataForPlay != null) {
                                                    cdnCollectDataForPlay.setAudioBytes(contentLength);
                                                }
                                                if (contentLength <= 0 || contentLength > 262144) {
                                                    String str35 = str10;
                                                    String str36 = str19;
                                                    String str37 = str11;
                                                    str2 = str2;
                                                    str12 = str21;
                                                    String str38 = str9;
                                                    httpURLConnection = httpURLConnection;
                                                    try {
                                                        Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread fail contentLength:" + contentLength);
                                                        if (z2 || cdnCollectDataForPlay == null) {
                                                            str13 = str2;
                                                            str14 = str12;
                                                            f2 = f3;
                                                            z2 = z2;
                                                        } else {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() == null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                cdnCollectDataForPlay.setDownloadResult(str12);
                                                            }
                                                            if (z3) {
                                                                str13 = str2;
                                                            } else {
                                                                int netType4 = cdnConfigModel.getNetType();
                                                                if (netType4 == -1) {
                                                                    str22 = str22;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str13 = str2;
                                                                    str14 = str12;
                                                                    f2 = f3;
                                                                    z2 = true;
                                                                } else {
                                                                    if (netType4 == 0) {
                                                                        hlsDownloadThread.mLimitConnectTime = cdnConfigModel.getCdnNotWifiConnectTimeout();
                                                                        long cdnNotWifiAlertRate2 = cdnConfigModel.getCdnNotWifiAlertRate();
                                                                        hlsDownloadThread.mLimitDownloadSpeed = cdnNotWifiAlertRate2;
                                                                        if (jCurrentTimeMillis > hlsDownloadThread.mLimitConnectTime * 1000) {
                                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECTED_TOO_SLOW);
                                                                            cdnCollectDataForPlay.setExceptionReason("connected_time=" + CdnUtil.oneDecimal(jCurrentTimeMillis, false) + "s, connected_time_threshold=" + hlsDownloadThread.mLimitConnectTime + str38);
                                                                        } else if (cdnNotWifiAlertRate2 > f3) {
                                                                            cdnCollectDataForPlay.setErrorType(str37);
                                                                            StringBuilder sb10 = new StringBuilder();
                                                                            sb10.append(r5);
                                                                            float f7 = f3;
                                                                            sb10.append(CdnUtil.oneDecimal(f7, true));
                                                                            sb10.append(str35);
                                                                            sb10.append(hlsDownloadThread.mLimitDownloadSpeed);
                                                                            sb10.append(r6);
                                                                            cdnCollectDataForPlay.setExceptionReason(sb10.toString());
                                                                            str22 = str22;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str13 = str2;
                                                                            str14 = str12;
                                                                            f2 = f7;
                                                                        }
                                                                        str13 = str2;
                                                                    } else {
                                                                        str22 = str22;
                                                                        str13 = str2;
                                                                        str14 = str12;
                                                                        f2 = f3;
                                                                        if (netType4 == 1) {
                                                                            hlsDownloadThread.mLimitConnectTime = cdnConfigModel.getCdnWifiConnectTimeout();
                                                                            long cdnWifiAlertRate2 = cdnConfigModel.getCdnWifiAlertRate();
                                                                            hlsDownloadThread.mLimitDownloadSpeed = cdnWifiAlertRate2;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            hlsDownloadThread.mLimitConnectTime = 0L;
                                                                            if (jCurrentTimeMillis > 1000 * 0) {
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECTED_TOO_SLOW);
                                                                                cdnCollectDataForPlay.setExceptionReason("connected_time=" + CdnUtil.oneDecimal(jCurrentTimeMillis, false) + "s, connected_time_threshold=" + hlsDownloadThread.mLimitConnectTime + str38);
                                                                            } else if (cdnWifiAlertRate2 > f2) {
                                                                                cdnCollectDataForPlay.setErrorType(str37);
                                                                                cdnCollectDataForPlay.setExceptionReason(r5 + CdnUtil.oneDecimal(f2, true) + str35 + hlsDownloadThread.mLimitDownloadSpeed + r6);
                                                                            }
                                                                        } else {
                                                                            cdnConfigModel = cdnConfigModel;
                                                                        }
                                                                    }
                                                                    z2 = z2;
                                                                }
                                                            }
                                                            str14 = str12;
                                                            f2 = f3;
                                                            z2 = z2;
                                                        }
                                                        httpURLConnection.disconnect();
                                                        Logger.log(XMediaplayerJNI.Tag, str36 + (System.currentTimeMillis() - j));
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        str19 = str36;
                                                        str20 = str13;
                                                        str22 = str22;
                                                        str21 = str14;
                                                        cdnConfigModel = cdnConfigModel;
                                                        f3 = f2;
                                                        string = str23;
                                                    } catch (FileNotFoundException e56) {
                                                        cdnConfigModel = cdnConfigModel;
                                                        str19 = str36;
                                                        fileNotFoundException = e56;
                                                        f3 = f3;
                                                        str = str;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str12;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        if (z2) {
                                                            str17 = str17;
                                                        } else {
                                                            str17 = str17;
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111115 = str2;
                                                        str21 = str21;
                                                        str20 = str2111115;
                                                    } catch (IllegalArgumentException e57) {
                                                        cdnConfigModel = cdnConfigModel;
                                                        str19 = str36;
                                                        illegalArgumentException = e57;
                                                        f3 = f3;
                                                        str = str;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str12;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        if (!z2) {
                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                            }
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111116 = str2;
                                                        str21 = str21;
                                                        str20 = str2111116;
                                                    } catch (MalformedURLException e58) {
                                                        e = e58;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str19 = str36;
                                                        f3 = f3;
                                                        str = str;
                                                        httpURLConnection = httpURLConnection;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        String str39 = str2;
                                                        malformedURLException = e;
                                                        str2 = str39;
                                                        str21 = str12;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        if (z2) {
                                                        }
                                                        String str310 = XMediaplayerJNI.Tag;
                                                        StringBuilder sb11 = new StringBuilder();
                                                        str = str;
                                                        sb11.append("HlsDownloadThread MalformedURLException:");
                                                        sb11.append(malformedURLException.toString());
                                                        Logger.log(str310, sb11.toString());
                                                        if (z2) {
                                                            j2 = jCurrentTimeMillis;
                                                        } else {
                                                            j2 = jCurrentTimeMillis;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        jCurrentTimeMillis = j2;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111117 = str2;
                                                        str21 = str21;
                                                        str20 = str2111117;
                                                    } catch (SocketTimeoutException e59) {
                                                        cdnConfigModel = cdnConfigModel;
                                                        str19 = str36;
                                                        socketTimeoutException = e59;
                                                        f3 = f3;
                                                        str = str;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str12;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        if (z2) {
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111118 = str2;
                                                        str21 = str21;
                                                        str20 = str2111118;
                                                    } catch (UnknownHostException e60) {
                                                        cdnConfigModel = cdnConfigModel;
                                                        str19 = str36;
                                                        unknownHostException = e60;
                                                        f3 = f3;
                                                        str = str;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str12;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        if (!z2) {
                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                            }
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111119 = str2;
                                                        str21 = str21;
                                                        str20 = str2111119;
                                                    } catch (IOException e61) {
                                                        cdnConfigModel = cdnConfigModel;
                                                        str19 = str36;
                                                        iOException = e61;
                                                        f3 = f3;
                                                        i5 = i5;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        str2 = str2;
                                                        str21 = str12;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        if (z2) {
                                                            str3 = str;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        } else {
                                                            str3 = str;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                        if (z2) {
                                                            i = i5;
                                                        } else {
                                                            i = i5;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        str = str3;
                                                        i5 = i;
                                                        str17 = str17;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str21111110 = str2;
                                                        str21 = str21;
                                                        str20 = str21111110;
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        str2 = str2;
                                                        str21 = str12;
                                                        str19 = str36;
                                                        th = th;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        if (z2) {
                                                            str22 = str22;
                                                            str21 = str21;
                                                        } else {
                                                            str22 = str22;
                                                            str21 = str21;
                                                        }
                                                        if (z2) {
                                                            str2 = str2;
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        i5 = i5;
                                                        str17 = str17;
                                                        f3 = f3;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str21111111 = str2;
                                                        str21 = str21;
                                                        str20 = str21111111;
                                                    }
                                                } else {
                                                    try {
                                                        jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        InputStream inputStream2 = httpURLConnection.getInputStream();
                                                        try {
                                                            Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread 0");
                                                            if (hlsDownloadThread.mBufferItem != null) {
                                                                try {
                                                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                                                } catch (FileNotFoundException e62) {
                                                                    fileNotFoundException = e62;
                                                                    inputStream = inputStream2;
                                                                    byteArrayOutputStream = null;
                                                                    str2 = str2;
                                                                    str21 = str21;
                                                                    if (z2) {
                                                                        str17 = str17;
                                                                    } else {
                                                                        str17 = str17;
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                                    if (!z2) {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        } else {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    str4 = XMediaplayerJNI.Tag;
                                                                    sb = new StringBuilder();
                                                                    sb.append(str19);
                                                                    sb.append(System.currentTimeMillis() - j);
                                                                    Logger.log(str4, sb.toString());
                                                                    str = str;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111112 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111112;
                                                                } catch (IllegalArgumentException e63) {
                                                                    illegalArgumentException = e63;
                                                                    inputStream = inputStream2;
                                                                    byteArrayOutputStream = null;
                                                                    str2 = str2;
                                                                    str21 = str21;
                                                                    if (!z2) {
                                                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                            jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                        }
                                                                        cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                        cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                        cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                        cdnCollectDataForPlay.setDownloaded(str);
                                                                        cdnCollectDataForPlay.setDownloadTime(str);
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                    if (!z2) {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        } else {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    str4 = XMediaplayerJNI.Tag;
                                                                    sb = new StringBuilder();
                                                                    sb.append(str19);
                                                                    sb.append(System.currentTimeMillis() - j);
                                                                    Logger.log(str4, sb.toString());
                                                                    str = str;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111113 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111113;
                                                                } catch (MalformedURLException e64) {
                                                                    malformedURLException = e64;
                                                                    inputStream = inputStream2;
                                                                    byteArrayOutputStream = null;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    str2 = str2;
                                                                    str21 = str21;
                                                                    if (z2) {
                                                                    }
                                                                    String str311 = XMediaplayerJNI.Tag;
                                                                    StringBuilder sb12 = new StringBuilder();
                                                                    str = str;
                                                                    sb12.append("HlsDownloadThread MalformedURLException:");
                                                                    sb12.append(malformedURLException.toString());
                                                                    Logger.log(str311, sb12.toString());
                                                                    if (z2) {
                                                                        j2 = jCurrentTimeMillis;
                                                                    } else {
                                                                        j2 = jCurrentTimeMillis;
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    jCurrentTimeMillis = j2;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111114 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111114;
                                                                } catch (SocketTimeoutException e65) {
                                                                    socketTimeoutException = e65;
                                                                    inputStream = inputStream2;
                                                                    byteArrayOutputStream = null;
                                                                    str2 = str2;
                                                                    str21 = str21;
                                                                    if (z2) {
                                                                    }
                                                                    if (!z2) {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        } else {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    str = str;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111115 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111115;
                                                                } catch (UnknownHostException e66) {
                                                                    unknownHostException = e66;
                                                                    inputStream = inputStream2;
                                                                    byteArrayOutputStream = null;
                                                                    str2 = str2;
                                                                    str21 = str21;
                                                                    if (!z2) {
                                                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                            jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                        }
                                                                        cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                        cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                        cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                        cdnCollectDataForPlay.setDownloaded(str);
                                                                        cdnCollectDataForPlay.setDownloadTime(str);
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                    if (!z2) {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        } else {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    str4 = XMediaplayerJNI.Tag;
                                                                    sb = new StringBuilder();
                                                                    sb.append(str19);
                                                                    sb.append(System.currentTimeMillis() - j);
                                                                    Logger.log(str4, sb.toString());
                                                                    str = str;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111116 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111116;
                                                                } catch (IOException e67) {
                                                                    iOException = e67;
                                                                    inputStream = inputStream2;
                                                                    i5 = i5;
                                                                    byteArrayOutputStream = null;
                                                                    str2 = str2;
                                                                    str21 = str21;
                                                                    if (z2) {
                                                                        str3 = str;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    } else {
                                                                        str3 = str;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                                    if (z2) {
                                                                        i = i5;
                                                                    } else {
                                                                        i = i5;
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    str = str3;
                                                                    i5 = i;
                                                                    str17 = str17;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111117 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111117;
                                                                } catch (Throwable th14) {
                                                                    th = th14;
                                                                    inputStream = inputStream2;
                                                                    i5 = i5;
                                                                    byteArrayOutputStream = null;
                                                                    httpURLConnection = httpURLConnection;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    if (z2) {
                                                                        str22 = str22;
                                                                        str21 = str21;
                                                                    } else {
                                                                        str22 = str22;
                                                                        str21 = str21;
                                                                    }
                                                                    if (z2) {
                                                                        str2 = str2;
                                                                    } else {
                                                                        str2 = str2;
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    i5 = i5;
                                                                    str17 = str17;
                                                                    f3 = f3;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111118 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111118;
                                                                }
                                                            } else {
                                                                byteArrayOutputStream = null;
                                                            }
                                                            try {
                                                                byte[] bArr = new byte[1024];
                                                                i5 = 0;
                                                                while (true) {
                                                                    i2 = inputStream2.read(bArr);
                                                                    inputStream = inputStream2;
                                                                    if (i2 == -1) {
                                                                        break;
                                                                    }
                                                                    i5 += i2;
                                                                    if (byteArrayOutputStream != null) {
                                                                        try {
                                                                            byteArrayOutputStream.write(bArr, 0, i2);
                                                                        } catch (FileNotFoundException e68) {
                                                                            fileNotFoundException = e68;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (z2) {
                                                                                str17 = str17;
                                                                            } else {
                                                                                str17 = str17;
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                                            if (!z2) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str21111119 = str2;
                                                                            str21 = str21;
                                                                            str20 = str21111119;
                                                                        } catch (IllegalArgumentException e69) {
                                                                            illegalArgumentException = e69;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (!z2) {
                                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                }
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                            if (!z2) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111110 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111110;
                                                                        } catch (MalformedURLException e70) {
                                                                            malformedURLException = e70;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (z2) {
                                                                            }
                                                                            String str312 = XMediaplayerJNI.Tag;
                                                                            StringBuilder sb13 = new StringBuilder();
                                                                            str = str;
                                                                            sb13.append("HlsDownloadThread MalformedURLException:");
                                                                            sb13.append(malformedURLException.toString());
                                                                            Logger.log(str312, sb13.toString());
                                                                            if (z2) {
                                                                                j2 = jCurrentTimeMillis;
                                                                            } else {
                                                                                j2 = jCurrentTimeMillis;
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            jCurrentTimeMillis = j2;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111111 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111111;
                                                                        } catch (SocketTimeoutException e71) {
                                                                            socketTimeoutException = e71;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (z2) {
                                                                            }
                                                                            if (!z2) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111112 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111112;
                                                                        } catch (UnknownHostException e72) {
                                                                            unknownHostException = e72;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (!z2) {
                                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                }
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                            if (!z2) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111113 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111113;
                                                                        } catch (IOException e73) {
                                                                            iOException = e73;
                                                                            i5 = i5;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (z2) {
                                                                                str3 = str;
                                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            } else {
                                                                                str3 = str;
                                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                                            if (z2) {
                                                                                i = i5;
                                                                            } else {
                                                                                i = i5;
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            str = str3;
                                                                            i5 = i;
                                                                            str17 = str17;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111114 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111114;
                                                                        } catch (Throwable th15) {
                                                                            th = th15;
                                                                            i5 = i5;
                                                                            httpURLConnection = httpURLConnection;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            if (z2) {
                                                                                str22 = str22;
                                                                                str21 = str21;
                                                                            } else {
                                                                                str22 = str22;
                                                                                str21 = str21;
                                                                            }
                                                                            if (z2) {
                                                                                str2 = str2;
                                                                            } else {
                                                                                str2 = str2;
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            i5 = i5;
                                                                            str17 = str17;
                                                                            f3 = f3;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111115 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111115;
                                                                        }
                                                                    }
                                                                    i5 = i5;
                                                                    inputStream2 = inputStream;
                                                                }
                                                                if (cdnCollectDataForPlay != null) {
                                                                    if (i5 <= 0 || i2 != -1) {
                                                                        str2 = str2;
                                                                        str12 = str21;
                                                                        cdnCollectDataForPlay.setDownloadResult(str12);
                                                                    } else {
                                                                        str2 = str2;
                                                                        try {
                                                                            cdnCollectDataForPlay.setDownloadResult(str2);
                                                                            str12 = str21;
                                                                        } catch (FileNotFoundException e74) {
                                                                            fileNotFoundException = e74;
                                                                            str22 = str22;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            i5 = i5;
                                                                            str = str;
                                                                            str19 = str19;
                                                                            f3 = f3;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (z2) {
                                                                                str17 = str17;
                                                                            } else {
                                                                                str17 = str17;
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                                            if (!z2) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111116 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111116;
                                                                        } catch (IllegalArgumentException e75) {
                                                                            illegalArgumentException = e75;
                                                                            str22 = str22;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            i5 = i5;
                                                                            str17 = str17;
                                                                            str = str;
                                                                            str19 = str19;
                                                                            f3 = f3;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (!z2) {
                                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                }
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                            if (!z2) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111117 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111117;
                                                                        } catch (MalformedURLException e76) {
                                                                            e = e76;
                                                                            str22 = str22;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            i5 = i5;
                                                                            httpURLConnection = httpURLConnection;
                                                                            str17 = str17;
                                                                            str = str;
                                                                            str19 = str19;
                                                                            f3 = f3;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            malformedURLException = e;
                                                                            if (z2) {
                                                                            }
                                                                            String str313 = XMediaplayerJNI.Tag;
                                                                            StringBuilder sb14 = new StringBuilder();
                                                                            str = str;
                                                                            sb14.append("HlsDownloadThread MalformedURLException:");
                                                                            sb14.append(malformedURLException.toString());
                                                                            Logger.log(str313, sb14.toString());
                                                                            if (z2) {
                                                                                j2 = jCurrentTimeMillis;
                                                                            } else {
                                                                                j2 = jCurrentTimeMillis;
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            jCurrentTimeMillis = j2;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111118 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111118;
                                                                        } catch (SocketTimeoutException e77) {
                                                                            socketTimeoutException = e77;
                                                                            str22 = str22;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            i5 = i5;
                                                                            str17 = str17;
                                                                            str = str;
                                                                            str19 = str19;
                                                                            f3 = f3;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (z2) {
                                                                            }
                                                                            if (!z2) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str211111119 = str2;
                                                                            str21 = str21;
                                                                            str20 = str211111119;
                                                                        } catch (UnknownHostException e78) {
                                                                            unknownHostException = e78;
                                                                            str22 = str22;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            i5 = i5;
                                                                            str17 = str17;
                                                                            str = str;
                                                                            str19 = str19;
                                                                            f3 = f3;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (!z2) {
                                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                }
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                            if (!z2) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111110 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111110;
                                                                        } catch (IOException e79) {
                                                                            iOException = e79;
                                                                            str22 = str22;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str19 = str19;
                                                                            f3 = f3;
                                                                            str2 = str2;
                                                                            str21 = str21;
                                                                            if (z2) {
                                                                                str3 = str;
                                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            } else {
                                                                                str3 = str;
                                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                                            if (z2) {
                                                                                i = i5;
                                                                            } else {
                                                                                i = i5;
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            str = str3;
                                                                            i5 = i;
                                                                            str17 = str17;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111111 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111111;
                                                                        } catch (Throwable th16) {
                                                                            th = th16;
                                                                            str22 = str22;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str2 = str2;
                                                                            httpURLConnection = httpURLConnection;
                                                                            str19 = str19;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            if (z2) {
                                                                                str22 = str22;
                                                                                str21 = str21;
                                                                            } else {
                                                                                str22 = str22;
                                                                                str21 = str21;
                                                                            }
                                                                            if (z2) {
                                                                                str2 = str2;
                                                                            } else {
                                                                                str2 = str2;
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            i5 = i5;
                                                                            str17 = str17;
                                                                            f3 = f3;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111112 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111112;
                                                                        }
                                                                    }
                                                                    try {
                                                                        long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis2;
                                                                        f3 = jCurrentTimeMillis6 != 0 ? ((i5 + 0.0f) / 1024.0f) / ((jCurrentTimeMillis6 + 0.0f) / 1000.0f) : f3;
                                                                        try {
                                                                            try {
                                                                                cdnCollectDataForPlay.setDownloaded(i5 + str22);
                                                                                cdnCollectDataForPlay.setDownloadTime(jCurrentTimeMillis6 + str22);
                                                                                StringBuilder sb15 = new StringBuilder();
                                                                                try {
                                                                                    sb15.append(CdnUtil.oneDecimal(f3, true));
                                                                                    sb15.append(str22);
                                                                                    cdnCollectDataForPlay.setDownloadSpeed(sb15.toString());
                                                                                    i5 = i5;
                                                                                } catch (MalformedURLException e80) {
                                                                                    e = e80;
                                                                                    String str314 = str2;
                                                                                    malformedURLException = e;
                                                                                    str2 = str314;
                                                                                    str21 = str12;
                                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                                    if (z2) {
                                                                                    }
                                                                                    String str315 = XMediaplayerJNI.Tag;
                                                                                    StringBuilder sb16 = new StringBuilder();
                                                                                    str = str;
                                                                                    sb16.append("HlsDownloadThread MalformedURLException:");
                                                                                    sb16.append(malformedURLException.toString());
                                                                                    Logger.log(str315, sb16.toString());
                                                                                    if (z2) {
                                                                                        j2 = jCurrentTimeMillis;
                                                                                    } else {
                                                                                        j2 = jCurrentTimeMillis;
                                                                                    }
                                                                                    if (httpURLConnection != null) {
                                                                                        httpURLConnection.disconnect();
                                                                                    }
                                                                                    if (inputStream != null) {
                                                                                        inputStream.close();
                                                                                    }
                                                                                    if (byteArrayOutputStream != null) {
                                                                                        byteArrayOutputStream.close();
                                                                                    }
                                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                                    jCurrentTimeMillis = j2;
                                                                                    if (cdnCollectDataForPlay != null) {
                                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                                    }
                                                                                    hlsDownloadThread = this;
                                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                                    str17 = str17;
                                                                                    str19 = str19;
                                                                                    str22 = str22;
                                                                                    string = str23;
                                                                                    i4 = i4;
                                                                                    z2 = z2;
                                                                                    z3 = true;
                                                                                    cdnConfigModel = cdnConfigModel;
                                                                                    str18 = str;
                                                                                    String str2111111113 = str2;
                                                                                    str21 = str21;
                                                                                    str20 = str2111111113;
                                                                                }
                                                                            } catch (MalformedURLException e81) {
                                                                                e = e81;
                                                                            }
                                                                        } catch (FileNotFoundException e82) {
                                                                            fileNotFoundException = e82;
                                                                            f3 = f3;
                                                                            i5 = i5;
                                                                            str2 = str2;
                                                                            str21 = str12;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            if (z2 || cdnCollectDataForPlay == null) {
                                                                                str17 = str17;
                                                                            } else {
                                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                }
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.SYSTEM_EXCEPTION);
                                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(fileNotFoundException));
                                                                                str17 = str17;
                                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                                            if (!z2 && cdnCollectDataForPlay != null) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111114 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111114;
                                                                        } catch (IOException e83) {
                                                                            iOException = e83;
                                                                            f3 = f3;
                                                                            str2 = str2;
                                                                            str21 = str12;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            if (z2 || cdnCollectDataForPlay == null) {
                                                                                str3 = str;
                                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            } else {
                                                                                try {
                                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getDownloadSpeed())) {
                                                                                        long jCurrentTimeMillis7 = System.currentTimeMillis() - jCurrentTimeMillis2;
                                                                                        if (jCurrentTimeMillis7 != 0) {
                                                                                            f3 = ((i5 + 0.0f) / 1024.0f) / ((jCurrentTimeMillis7 + 0.0f) / 1000.0f);
                                                                                        }
                                                                                        float f8 = f3;
                                                                                        cdnCollectDataForPlay.setDownloadSpeed(CdnUtil.oneDecimal(f8, true) + str22);
                                                                                        cdnCollectDataForPlay.setDownloaded(i5 + str22);
                                                                                        cdnCollectDataForPlay.setDownloadTime(jCurrentTimeMillis7 + str22);
                                                                                        f3 = f8;
                                                                                    }
                                                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                    } else {
                                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                                    }
                                                                                    if (iOException.getMessage() == null || !(iOException.getMessage().contains("ENOSPC") || iOException.getMessage().contains("EACCES"))) {
                                                                                        str3 = str;
                                                                                        cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_IO_EXCEPTION);
                                                                                    } else {
                                                                                        str3 = str;
                                                                                        cdnCollectDataForPlay.setDownloaded(str3);
                                                                                        cdnCollectDataForPlay.setDownloadTime(str3);
                                                                                        cdnCollectDataForPlay.setErrorType(CdnConstants.SYSTEM_EXCEPTION);
                                                                                    }
                                                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(iOException));
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                } catch (Throwable th17) {
                                                                                    th2 = th17;
                                                                                    if (!z2) {
                                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                                        }
                                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                                        }
                                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                        } else {
                                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                        }
                                                                                    }
                                                                                    if (httpURLConnection != null) {
                                                                                        httpURLConnection.disconnect();
                                                                                    }
                                                                                    if (inputStream != null) {
                                                                                        inputStream.close();
                                                                                    }
                                                                                    if (byteArrayOutputStream != null) {
                                                                                        byteArrayOutputStream.close();
                                                                                    }
                                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                                    throw th2;
                                                                                }
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                                            if (z2 || cdnCollectDataForPlay == null) {
                                                                                i = i5;
                                                                            } else {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                i = i5;
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() == null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            str = str3;
                                                                            i5 = i;
                                                                            str17 = str17;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111115 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111115;
                                                                        } catch (IllegalArgumentException e84) {
                                                                            illegalArgumentException = e84;
                                                                            f3 = f3;
                                                                            i5 = i5;
                                                                            str2 = str2;
                                                                            str21 = str12;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            if (!z2 && cdnCollectDataForPlay != null) {
                                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                }
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                            if (!z2 && cdnCollectDataForPlay != null) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111116 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111116;
                                                                        } catch (SocketTimeoutException e85) {
                                                                            socketTimeoutException = e85;
                                                                            f3 = f3;
                                                                            i5 = i5;
                                                                            str2 = str2;
                                                                            str21 = str12;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            if (z2 && cdnCollectDataForPlay != null) {
                                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                }
                                                                                if (TextUtils.isEmpty(socketTimeoutException.getMessage())) {
                                                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_SOCKET_TIMEOUT);
                                                                                    cdnCollectDataForPlay.setExceptionReason(String.valueOf(socketTimeoutException) + CdnUtil.exception2String(socketTimeoutException));
                                                                                } else {
                                                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECT_TIMEOUT);
                                                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(socketTimeoutException));
                                                                                }
                                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                cdnCollectDataForPlay.setTimeout(true);
                                                                            }
                                                                            if (!z2 && cdnCollectDataForPlay != null) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111117 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111117;
                                                                        } catch (UnknownHostException e86) {
                                                                            unknownHostException = e86;
                                                                            f3 = f3;
                                                                            i5 = i5;
                                                                            str2 = str2;
                                                                            str21 = str12;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            if (!z2 && cdnCollectDataForPlay != null) {
                                                                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                                }
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                                cdnCollectDataForPlay.setDownloaded(str);
                                                                                cdnCollectDataForPlay.setDownloadTime(str);
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                            if (!z2 && cdnCollectDataForPlay != null) {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                }
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            str4 = XMediaplayerJNI.Tag;
                                                                            sb = new StringBuilder();
                                                                            sb.append(str19);
                                                                            sb.append(System.currentTimeMillis() - j);
                                                                            Logger.log(str4, sb.toString());
                                                                            str = str;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111118 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111118;
                                                                        } catch (Throwable th18) {
                                                                            th = th18;
                                                                            f3 = f3;
                                                                            str21 = str12;
                                                                            str19 = str19;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                            if (z2 || cdnCollectDataForPlay == null) {
                                                                                str22 = str22;
                                                                                str21 = str21;
                                                                            } else {
                                                                                try {
                                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getDownloadSpeed())) {
                                                                                        try {
                                                                                            long jCurrentTimeMillis8 = System.currentTimeMillis() - jCurrentTimeMillis2;
                                                                                            if (jCurrentTimeMillis8 != 0) {
                                                                                                f3 = ((i5 + 0.0f) / 1024.0f) / ((jCurrentTimeMillis8 + 0.0f) / 1000.0f);
                                                                                            }
                                                                                            float f9 = f3;
                                                                                            StringBuilder sb17 = new StringBuilder();
                                                                                            sb17.append(CdnUtil.oneDecimal(f9, true));
                                                                                            str22 = str22;
                                                                                            try {
                                                                                                sb17.append(str22);
                                                                                                cdnCollectDataForPlay.setDownloadSpeed(sb17.toString());
                                                                                                cdnCollectDataForPlay.setDownloaded(i5 + str22);
                                                                                                cdnCollectDataForPlay.setDownloadTime(jCurrentTimeMillis8 + str22);
                                                                                                f3 = f9;
                                                                                            } catch (Throwable th19) {
                                                                                                th = th19;
                                                                                                th2 = th;
                                                                                                str2 = str2;
                                                                                                str21 = str21;
                                                                                                if (!z2 && cdnCollectDataForPlay != null) {
                                                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                                                    }
                                                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                                                    }
                                                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                                    }
                                                                                                }
                                                                                                if (httpURLConnection != null) {
                                                                                                    httpURLConnection.disconnect();
                                                                                                }
                                                                                                if (inputStream != null) {
                                                                                                    inputStream.close();
                                                                                                }
                                                                                                if (byteArrayOutputStream != null) {
                                                                                                    byteArrayOutputStream.close();
                                                                                                }
                                                                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                                                throw th2;
                                                                                            }
                                                                                        } catch (Throwable th20) {
                                                                                            th = th20;
                                                                                            str22 = str22;
                                                                                        }
                                                                                    } else {
                                                                                        str22 = str22;
                                                                                    }
                                                                                    try {
                                                                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                            long jCurrentTimeMillis9 = System.currentTimeMillis() - j;
                                                                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis9, false));
                                                                                            jCurrentTimeMillis = jCurrentTimeMillis9;
                                                                                        }
                                                                                        str21 = str21;
                                                                                        try {
                                                                                            cdnCollectDataForPlay.setDownloaded(str21);
                                                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_UNKNOWN_EXCEPTION);
                                                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(th));
                                                                                        } catch (Throwable th21) {
                                                                                            th = th21;
                                                                                            th2 = th;
                                                                                            str2 = str2;
                                                                                            if (!z2) {
                                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                                }
                                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                                }
                                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                                } else {
                                                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                                }
                                                                                            }
                                                                                            if (httpURLConnection != null) {
                                                                                                httpURLConnection.disconnect();
                                                                                            }
                                                                                            if (inputStream != null) {
                                                                                                inputStream.close();
                                                                                            }
                                                                                            if (byteArrayOutputStream != null) {
                                                                                                byteArrayOutputStream.close();
                                                                                            }
                                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                                            throw th2;
                                                                                        }
                                                                                    } catch (Throwable th22) {
                                                                                        th = th22;
                                                                                        str21 = str21;
                                                                                        th2 = th;
                                                                                        str2 = str2;
                                                                                        if (!z2) {
                                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                                                            }
                                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                                                            }
                                                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                            } else {
                                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                                            }
                                                                                        }
                                                                                        if (httpURLConnection != null) {
                                                                                            httpURLConnection.disconnect();
                                                                                        }
                                                                                        if (inputStream != null) {
                                                                                            inputStream.close();
                                                                                        }
                                                                                        if (byteArrayOutputStream != null) {
                                                                                            byteArrayOutputStream.close();
                                                                                        }
                                                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                                        throw th2;
                                                                                    }
                                                                                } catch (Throwable th23) {
                                                                                    th = th23;
                                                                                    str22 = str22;
                                                                                }
                                                                            }
                                                                            if (z2 || cdnCollectDataForPlay == null) {
                                                                                str2 = str2;
                                                                            } else {
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                    cdnCollectDataForPlay.setViaInfo(null);
                                                                                }
                                                                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                    cdnCollectDataForPlay.setStatusCode(str22);
                                                                                }
                                                                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                    str2 = str2;
                                                                                    if (!cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                                    }
                                                                                } else {
                                                                                    str2 = str2;
                                                                                }
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                            if (httpURLConnection != null) {
                                                                                httpURLConnection.disconnect();
                                                                            }
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            if (byteArrayOutputStream != null) {
                                                                                byteArrayOutputStream.close();
                                                                            }
                                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                            i5 = i5;
                                                                            str17 = str17;
                                                                            f3 = f3;
                                                                            if (cdnCollectDataForPlay != null) {
                                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                            }
                                                                            hlsDownloadThread = this;
                                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                            str17 = str17;
                                                                            str19 = str19;
                                                                            str22 = str22;
                                                                            string = str23;
                                                                            i4 = i4;
                                                                            z2 = z2;
                                                                            z3 = true;
                                                                            cdnConfigModel = cdnConfigModel;
                                                                            str18 = str;
                                                                            String str2111111119 = str2;
                                                                            str21 = str21;
                                                                            str20 = str2111111119;
                                                                        }
                                                                    } catch (FileNotFoundException e87) {
                                                                        httpURLConnection = httpURLConnection;
                                                                        fileNotFoundException = e87;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        i5 = i5;
                                                                        str = str;
                                                                        str19 = str19;
                                                                        f3 = f3;
                                                                        str2 = str2;
                                                                        str21 = str12;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                        if (z2) {
                                                                            str17 = str17;
                                                                        } else {
                                                                            str17 = str17;
                                                                        }
                                                                        Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                                        if (!z2) {
                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                                            }
                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                                            }
                                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            } else {
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                        }
                                                                        if (httpURLConnection != null) {
                                                                            httpURLConnection.disconnect();
                                                                        }
                                                                        if (inputStream != null) {
                                                                            inputStream.close();
                                                                        }
                                                                        if (byteArrayOutputStream != null) {
                                                                            byteArrayOutputStream.close();
                                                                        }
                                                                        str4 = XMediaplayerJNI.Tag;
                                                                        sb = new StringBuilder();
                                                                        sb.append(str19);
                                                                        sb.append(System.currentTimeMillis() - j);
                                                                        Logger.log(str4, sb.toString());
                                                                        str = str;
                                                                        if (cdnCollectDataForPlay != null) {
                                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                        }
                                                                        hlsDownloadThread = this;
                                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                        str17 = str17;
                                                                        str19 = str19;
                                                                        str22 = str22;
                                                                        string = str23;
                                                                        i4 = i4;
                                                                        z2 = z2;
                                                                        z3 = true;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        str18 = str;
                                                                        String str21111111110 = str2;
                                                                        str21 = str21;
                                                                        str20 = str21111111110;
                                                                    } catch (IllegalArgumentException e88) {
                                                                        httpURLConnection = httpURLConnection;
                                                                        illegalArgumentException = e88;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        i5 = i5;
                                                                        str = str;
                                                                        str19 = str19;
                                                                        f3 = f3;
                                                                        str2 = str2;
                                                                        str21 = str12;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                        if (!z2) {
                                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                            }
                                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                        if (!z2) {
                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                                            }
                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                                            }
                                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            } else {
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                        }
                                                                        if (httpURLConnection != null) {
                                                                            httpURLConnection.disconnect();
                                                                        }
                                                                        if (inputStream != null) {
                                                                            inputStream.close();
                                                                        }
                                                                        if (byteArrayOutputStream != null) {
                                                                            byteArrayOutputStream.close();
                                                                        }
                                                                        str4 = XMediaplayerJNI.Tag;
                                                                        sb = new StringBuilder();
                                                                        sb.append(str19);
                                                                        sb.append(System.currentTimeMillis() - j);
                                                                        Logger.log(str4, sb.toString());
                                                                        str = str;
                                                                        if (cdnCollectDataForPlay != null) {
                                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                        }
                                                                        hlsDownloadThread = this;
                                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                        str17 = str17;
                                                                        str19 = str19;
                                                                        str22 = str22;
                                                                        string = str23;
                                                                        i4 = i4;
                                                                        z2 = z2;
                                                                        z3 = true;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        str18 = str;
                                                                        String str21111111111 = str2;
                                                                        str21 = str21;
                                                                        str20 = str21111111111;
                                                                    } catch (MalformedURLException e89) {
                                                                        e = e89;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        i5 = i5;
                                                                        str = str;
                                                                        str19 = str19;
                                                                        f3 = f3;
                                                                        httpURLConnection = httpURLConnection;
                                                                        String str316 = str2;
                                                                        malformedURLException = e;
                                                                        str2 = str316;
                                                                        str21 = str12;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                        if (z2) {
                                                                        }
                                                                        String str317 = XMediaplayerJNI.Tag;
                                                                        StringBuilder sb18 = new StringBuilder();
                                                                        str = str;
                                                                        sb18.append("HlsDownloadThread MalformedURLException:");
                                                                        sb18.append(malformedURLException.toString());
                                                                        Logger.log(str317, sb18.toString());
                                                                        if (z2) {
                                                                            j2 = jCurrentTimeMillis;
                                                                        } else {
                                                                            j2 = jCurrentTimeMillis;
                                                                        }
                                                                        if (httpURLConnection != null) {
                                                                            httpURLConnection.disconnect();
                                                                        }
                                                                        if (inputStream != null) {
                                                                            inputStream.close();
                                                                        }
                                                                        if (byteArrayOutputStream != null) {
                                                                            byteArrayOutputStream.close();
                                                                        }
                                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                        jCurrentTimeMillis = j2;
                                                                        if (cdnCollectDataForPlay != null) {
                                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                        }
                                                                        hlsDownloadThread = this;
                                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                        str17 = str17;
                                                                        str19 = str19;
                                                                        str22 = str22;
                                                                        string = str23;
                                                                        i4 = i4;
                                                                        z2 = z2;
                                                                        z3 = true;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        str18 = str;
                                                                        String str21111111112 = str2;
                                                                        str21 = str21;
                                                                        str20 = str21111111112;
                                                                    } catch (SocketTimeoutException e90) {
                                                                        httpURLConnection = httpURLConnection;
                                                                        socketTimeoutException = e90;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        i5 = i5;
                                                                        str = str;
                                                                        str19 = str19;
                                                                        f3 = f3;
                                                                        str2 = str2;
                                                                        str21 = str12;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                        if (z2) {
                                                                        }
                                                                        if (!z2) {
                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                                            }
                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                                            }
                                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            } else {
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                        }
                                                                        if (httpURLConnection != null) {
                                                                            httpURLConnection.disconnect();
                                                                        }
                                                                        if (inputStream != null) {
                                                                            inputStream.close();
                                                                        }
                                                                        if (byteArrayOutputStream != null) {
                                                                            byteArrayOutputStream.close();
                                                                        }
                                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                        str = str;
                                                                        if (cdnCollectDataForPlay != null) {
                                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                        }
                                                                        hlsDownloadThread = this;
                                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                        str17 = str17;
                                                                        str19 = str19;
                                                                        str22 = str22;
                                                                        string = str23;
                                                                        i4 = i4;
                                                                        z2 = z2;
                                                                        z3 = true;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        str18 = str;
                                                                        String str21111111113 = str2;
                                                                        str21 = str21;
                                                                        str20 = str21111111113;
                                                                    } catch (UnknownHostException e91) {
                                                                        httpURLConnection = httpURLConnection;
                                                                        unknownHostException = e91;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        i5 = i5;
                                                                        str = str;
                                                                        str19 = str19;
                                                                        f3 = f3;
                                                                        str2 = str2;
                                                                        str21 = str12;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                        if (!z2) {
                                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                            }
                                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                        if (!z2) {
                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                                            }
                                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                                            }
                                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            } else {
                                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                                            }
                                                                        }
                                                                        if (httpURLConnection != null) {
                                                                            httpURLConnection.disconnect();
                                                                        }
                                                                        if (inputStream != null) {
                                                                            inputStream.close();
                                                                        }
                                                                        if (byteArrayOutputStream != null) {
                                                                            byteArrayOutputStream.close();
                                                                        }
                                                                        str4 = XMediaplayerJNI.Tag;
                                                                        sb = new StringBuilder();
                                                                        sb.append(str19);
                                                                        sb.append(System.currentTimeMillis() - j);
                                                                        Logger.log(str4, sb.toString());
                                                                        str = str;
                                                                        if (cdnCollectDataForPlay != null) {
                                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                        }
                                                                        hlsDownloadThread = this;
                                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                        str17 = str17;
                                                                        str19 = str19;
                                                                        str22 = str22;
                                                                        string = str23;
                                                                        i4 = i4;
                                                                        z2 = z2;
                                                                        z3 = true;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        str18 = str;
                                                                        String str21111111114 = str2;
                                                                        str21 = str21;
                                                                        str20 = str21111111114;
                                                                    } catch (IOException e92) {
                                                                        httpURLConnection = httpURLConnection;
                                                                        iOException = e92;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        str19 = str19;
                                                                        f3 = f3;
                                                                        str2 = str2;
                                                                        str21 = str12;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                        if (z2) {
                                                                            str3 = str;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                        } else {
                                                                            str3 = str;
                                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                                        }
                                                                        Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                                        if (z2) {
                                                                            i = i5;
                                                                        } else {
                                                                            i = i5;
                                                                        }
                                                                        if (httpURLConnection != null) {
                                                                            httpURLConnection.disconnect();
                                                                        }
                                                                        if (inputStream != null) {
                                                                            inputStream.close();
                                                                        }
                                                                        if (byteArrayOutputStream != null) {
                                                                            byteArrayOutputStream.close();
                                                                        }
                                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                        str = str3;
                                                                        i5 = i;
                                                                        str17 = str17;
                                                                        if (cdnCollectDataForPlay != null) {
                                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                        }
                                                                        hlsDownloadThread = this;
                                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                        str17 = str17;
                                                                        str19 = str19;
                                                                        str22 = str22;
                                                                        string = str23;
                                                                        i4 = i4;
                                                                        z2 = z2;
                                                                        z3 = true;
                                                                        cdnConfigModel = cdnConfigModel;
                                                                        str18 = str;
                                                                        String str21111111115 = str2;
                                                                        str21 = str21;
                                                                        str20 = str21111111115;
                                                                    } catch (Throwable th24) {
                                                                        httpURLConnection = httpURLConnection;
                                                                        th = th24;
                                                                    }
                                                                } else {
                                                                    str2 = str2;
                                                                    str12 = str21;
                                                                    str5 = str5;
                                                                    httpURLConnection = httpURLConnection;
                                                                    f3 = f3;
                                                                }
                                                                if (byteArrayOutputStream == null) {
                                                                    break;
                                                                }
                                                                try {
                                                                    BufferItem bufferItem = hlsDownloadThread.mBufferItem;
                                                                    if (bufferItem == null) {
                                                                        break;
                                                                    }
                                                                    bufferItem.setBuffer(byteArrayOutputStream.toByteArray());
                                                                    int dataSize = hlsDownloadThread.mBufferItem.getDataSize();
                                                                    if (z2 || cdnCollectDataForPlay == null) {
                                                                        i3 = dataSize;
                                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                                    } else {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() == null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str12);
                                                                        }
                                                                        if (z3 || (netType2 = cdnConfigModel.getNetType()) == -1) {
                                                                            i3 = dataSize;
                                                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                                                        } else if (netType2 == 0) {
                                                                            hlsDownloadThread.mLimitConnectTime = cdnConfigModel.getCdnNotWifiConnectTimeout();
                                                                            long cdnNotWifiAlertRate3 = cdnConfigModel.getCdnNotWifiAlertRate();
                                                                            hlsDownloadThread.mLimitDownloadSpeed = cdnNotWifiAlertRate3;
                                                                            if (jCurrentTimeMillis > hlsDownloadThread.mLimitConnectTime * 1000) {
                                                                                cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECTED_TOO_SLOW);
                                                                                cdnCollectDataForPlay.setExceptionReason("connected_time=" + CdnUtil.oneDecimal(jCurrentTimeMillis, false) + str5 + hlsDownloadThread.mLimitConnectTime + str9);
                                                                            } else if (cdnNotWifiAlertRate3 > f3) {
                                                                                cdnCollectDataForPlay.setErrorType(str11);
                                                                                cdnCollectDataForPlay.setExceptionReason("download_speed=" + CdnUtil.oneDecimal(f3, true) + str10 + hlsDownloadThread.mLimitDownloadSpeed + "KB/s");
                                                                            }
                                                                            i3 = dataSize;
                                                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                                                        } else {
                                                                            i3 = dataSize;
                                                                            String str40 = str11;
                                                                            String str41 = str5;
                                                                            String str42 = str9;
                                                                            String str43 = str10;
                                                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                                                            if (netType2 == 1) {
                                                                                hlsDownloadThread.mLimitConnectTime = cdnConfigModel.getCdnWifiConnectTimeout();
                                                                                long cdnWifiAlertRate3 = cdnConfigModel.getCdnWifiAlertRate();
                                                                                hlsDownloadThread.mLimitDownloadSpeed = cdnWifiAlertRate3;
                                                                                hlsDownloadThread.mLimitConnectTime = 0L;
                                                                                if (jCurrentTimeMillis > 0 * 1000) {
                                                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECTED_TOO_SLOW);
                                                                                    cdnCollectDataForPlay.setExceptionReason("connected_time=" + CdnUtil.oneDecimal(jCurrentTimeMillis, false) + str41 + hlsDownloadThread.mLimitConnectTime + str42);
                                                                                } else if (cdnWifiAlertRate3 > f3) {
                                                                                    cdnCollectDataForPlay.setErrorType(str40);
                                                                                    cdnCollectDataForPlay.setExceptionReason(r5 + CdnUtil.oneDecimal(f3, true) + str43 + hlsDownloadThread.mLimitDownloadSpeed + r6);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    httpURLConnection.disconnect();
                                                                    try {
                                                                        inputStream.close();
                                                                    } catch (IOException unused17) {
                                                                    }
                                                                    try {
                                                                        byteArrayOutputStream2.close();
                                                                    } catch (IOException unused18) {
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    return i3;
                                                                } catch (FileNotFoundException e93) {
                                                                    fileNotFoundException = e93;
                                                                    f3 = f3;
                                                                    str2 = str2;
                                                                    str21 = str12;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    if (z2) {
                                                                        str17 = str17;
                                                                    } else {
                                                                        str17 = str17;
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                                    if (!z2) {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        } else {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    str4 = XMediaplayerJNI.Tag;
                                                                    sb = new StringBuilder();
                                                                    sb.append(str19);
                                                                    sb.append(System.currentTimeMillis() - j);
                                                                    Logger.log(str4, sb.toString());
                                                                    str = str;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111111116 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111111116;
                                                                } catch (IllegalArgumentException e94) {
                                                                    illegalArgumentException = e94;
                                                                    f3 = f3;
                                                                    str2 = str2;
                                                                    str21 = str12;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    if (!z2) {
                                                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                            jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                        }
                                                                        cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                        cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                        cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                        cdnCollectDataForPlay.setDownloaded(str);
                                                                        cdnCollectDataForPlay.setDownloadTime(str);
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                    if (!z2) {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        } else {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    str4 = XMediaplayerJNI.Tag;
                                                                    sb = new StringBuilder();
                                                                    sb.append(str19);
                                                                    sb.append(System.currentTimeMillis() - j);
                                                                    Logger.log(str4, sb.toString());
                                                                    str = str;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111111117 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111111117;
                                                                } catch (MalformedURLException e95) {
                                                                    e = e95;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str = str;
                                                                    str19 = str19;
                                                                    httpURLConnection = httpURLConnection;
                                                                    f3 = f3;
                                                                    String str318 = str2;
                                                                    malformedURLException = e;
                                                                    str2 = str318;
                                                                    str21 = str12;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    if (z2) {
                                                                    }
                                                                    String str319 = XMediaplayerJNI.Tag;
                                                                    StringBuilder sb19 = new StringBuilder();
                                                                    str = str;
                                                                    sb19.append("HlsDownloadThread MalformedURLException:");
                                                                    sb19.append(malformedURLException.toString());
                                                                    Logger.log(str319, sb19.toString());
                                                                    if (z2) {
                                                                        j2 = jCurrentTimeMillis;
                                                                    } else {
                                                                        j2 = jCurrentTimeMillis;
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    jCurrentTimeMillis = j2;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111111118 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111111118;
                                                                } catch (SocketTimeoutException e96) {
                                                                    socketTimeoutException = e96;
                                                                    f3 = f3;
                                                                    str2 = str2;
                                                                    str21 = str12;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    if (z2) {
                                                                    }
                                                                    if (!z2) {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        } else {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    str = str;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str21111111119 = str2;
                                                                    str21 = str21;
                                                                    str20 = str21111111119;
                                                                } catch (UnknownHostException e97) {
                                                                    unknownHostException = e97;
                                                                    f3 = f3;
                                                                    str2 = str2;
                                                                    str21 = str12;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    if (!z2) {
                                                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                            jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                        }
                                                                        cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                        cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                        cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                        cdnCollectDataForPlay.setDownloaded(str);
                                                                        cdnCollectDataForPlay.setDownloadTime(str);
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                    if (!z2) {
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                            cdnCollectDataForPlay.setViaInfo(null);
                                                                        }
                                                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                            cdnCollectDataForPlay.setStatusCode(str22);
                                                                        }
                                                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        } else {
                                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                                        }
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    str4 = XMediaplayerJNI.Tag;
                                                                    sb = new StringBuilder();
                                                                    sb.append(str19);
                                                                    sb.append(System.currentTimeMillis() - j);
                                                                    Logger.log(str4, sb.toString());
                                                                    str = str;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str211111111110 = str2;
                                                                    str21 = str21;
                                                                    str20 = str211111111110;
                                                                } catch (IOException e98) {
                                                                    iOException = e98;
                                                                    i5 = i5;
                                                                    f3 = f3;
                                                                    str2 = str2;
                                                                    str21 = str12;
                                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    if (z2) {
                                                                        str3 = str;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    } else {
                                                                        str3 = str;
                                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                                    if (z2) {
                                                                        i = i5;
                                                                    } else {
                                                                        i = i5;
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    str = str3;
                                                                    i5 = i;
                                                                    str17 = str17;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str211111111111 = str2;
                                                                    str21 = str21;
                                                                    str20 = str211111111111;
                                                                } catch (Throwable th25) {
                                                                    th = th25;
                                                                    f3 = f3;
                                                                    str21 = str12;
                                                                    i5 = i5;
                                                                    str2 = str2;
                                                                    if (z2) {
                                                                        str22 = str22;
                                                                        str21 = str21;
                                                                    } else {
                                                                        str22 = str22;
                                                                        str21 = str21;
                                                                    }
                                                                    if (z2) {
                                                                        str2 = str2;
                                                                    } else {
                                                                        str2 = str2;
                                                                    }
                                                                    if (httpURLConnection != null) {
                                                                        httpURLConnection.disconnect();
                                                                    }
                                                                    if (inputStream != null) {
                                                                        inputStream.close();
                                                                    }
                                                                    if (byteArrayOutputStream != null) {
                                                                        byteArrayOutputStream.close();
                                                                    }
                                                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                    i5 = i5;
                                                                    str17 = str17;
                                                                    f3 = f3;
                                                                    if (cdnCollectDataForPlay != null) {
                                                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                    }
                                                                    hlsDownloadThread = this;
                                                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                    str17 = str17;
                                                                    str19 = str19;
                                                                    str22 = str22;
                                                                    string = str23;
                                                                    i4 = i4;
                                                                    z2 = z2;
                                                                    z3 = true;
                                                                    cdnConfigModel = cdnConfigModel;
                                                                    str18 = str;
                                                                    String str211111111112 = str2;
                                                                    str21 = str21;
                                                                    str20 = str211111111112;
                                                                }
                                                            } catch (FileNotFoundException e99) {
                                                                inputStream = inputStream2;
                                                                fileNotFoundException = e99;
                                                                str2 = str2;
                                                                if (z2) {
                                                                    str17 = str17;
                                                                } else {
                                                                    str17 = str17;
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                                if (!z2) {
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                    }
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                    }
                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    } else {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                str4 = XMediaplayerJNI.Tag;
                                                                sb = new StringBuilder();
                                                                sb.append(str19);
                                                                sb.append(System.currentTimeMillis() - j);
                                                                Logger.log(str4, sb.toString());
                                                                str = str;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str211111111113 = str2;
                                                                str21 = str21;
                                                                str20 = str211111111113;
                                                            } catch (IllegalArgumentException e100) {
                                                                inputStream = inputStream2;
                                                                illegalArgumentException = e100;
                                                                str2 = str2;
                                                                if (!z2) {
                                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                    }
                                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                                if (!z2) {
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                    }
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                    }
                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    } else {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                str4 = XMediaplayerJNI.Tag;
                                                                sb = new StringBuilder();
                                                                sb.append(str19);
                                                                sb.append(System.currentTimeMillis() - j);
                                                                Logger.log(str4, sb.toString());
                                                                str = str;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str211111111114 = str2;
                                                                str21 = str21;
                                                                str20 = str211111111114;
                                                            } catch (MalformedURLException e101) {
                                                                e = e101;
                                                                inputStream = inputStream2;
                                                                str2 = str2;
                                                                httpURLConnection = httpURLConnection;
                                                                malformedURLException = e;
                                                                if (z2) {
                                                                }
                                                                String str3110 = XMediaplayerJNI.Tag;
                                                                StringBuilder sb110 = new StringBuilder();
                                                                str = str;
                                                                sb110.append("HlsDownloadThread MalformedURLException:");
                                                                sb110.append(malformedURLException.toString());
                                                                Logger.log(str3110, sb110.toString());
                                                                if (z2) {
                                                                    j2 = jCurrentTimeMillis;
                                                                } else {
                                                                    j2 = jCurrentTimeMillis;
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                jCurrentTimeMillis = j2;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str211111111115 = str2;
                                                                str21 = str21;
                                                                str20 = str211111111115;
                                                            } catch (SocketTimeoutException e102) {
                                                                inputStream = inputStream2;
                                                                socketTimeoutException = e102;
                                                                str2 = str2;
                                                                if (z2) {
                                                                }
                                                                if (!z2) {
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                    }
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                    }
                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    } else {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                                str = str;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str211111111116 = str2;
                                                                str21 = str21;
                                                                str20 = str211111111116;
                                                            } catch (UnknownHostException e103) {
                                                                inputStream = inputStream2;
                                                                unknownHostException = e103;
                                                                str2 = str2;
                                                                if (!z2) {
                                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                                    }
                                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                                }
                                                                if (!z2) {
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                                    }
                                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                                    }
                                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    } else {
                                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                                    }
                                                                }
                                                                if (httpURLConnection != null) {
                                                                    httpURLConnection.disconnect();
                                                                }
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                                str4 = XMediaplayerJNI.Tag;
                                                                sb = new StringBuilder();
                                                                sb.append(str19);
                                                                sb.append(System.currentTimeMillis() - j);
                                                                Logger.log(str4, sb.toString());
                                                                str = str;
                                                                if (cdnCollectDataForPlay != null) {
                                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                                }
                                                                hlsDownloadThread = this;
                                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                                str17 = str17;
                                                                str19 = str19;
                                                                str22 = str22;
                                                                string = str23;
                                                                i4 = i4;
                                                                z2 = z2;
                                                                z3 = true;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str18 = str;
                                                                String str211111111117 = str2;
                                                                str21 = str21;
                                                                str20 = str211111111117;
                                                            } catch (IOException e104) {
                                                                inputStream = inputStream2;
                                                                iOException = e104;
                                                                str22 = str22;
                                                                cdnConfigModel = cdnConfigModel;
                                                                str2 = str2;
                                                                i5 = i5;
                                                                str19 = str19;
                                                                f3 = f3;
                                                            } catch (Throwable th26) {
                                                                inputStream = inputStream2;
                                                                str2 = str2;
                                                                httpURLConnection = httpURLConnection;
                                                                th = th26;
                                                                i5 = i5;
                                                            }
                                                        } catch (FileNotFoundException e105) {
                                                            inputStream = inputStream2;
                                                            fileNotFoundException = e105;
                                                            str2 = str2;
                                                            byteArrayOutputStream = null;
                                                        } catch (MalformedURLException e106) {
                                                            e = e106;
                                                            inputStream = inputStream2;
                                                            str2 = str2;
                                                            httpURLConnection = httpURLConnection;
                                                            byteArrayOutputStream = null;
                                                        } catch (IOException e107) {
                                                            inputStream = inputStream2;
                                                            httpURLConnection = httpURLConnection;
                                                            iOException = e107;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                            str22 = str22;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str2 = str2;
                                                            i5 = i5;
                                                            str19 = str19;
                                                            f3 = f3;
                                                            str21 = str21;
                                                            byteArrayOutputStream = null;
                                                            if (z2) {
                                                                str3 = str;
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            } else {
                                                                str3 = str;
                                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                            if (z2) {
                                                                i = i5;
                                                            } else {
                                                                i = i5;
                                                            }
                                                            if (httpURLConnection != null) {
                                                                httpURLConnection.disconnect();
                                                            }
                                                            if (inputStream != null) {
                                                                inputStream.close();
                                                            }
                                                            if (byteArrayOutputStream != null) {
                                                                byteArrayOutputStream.close();
                                                            }
                                                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                            str = str3;
                                                            i5 = i;
                                                            str17 = str17;
                                                            if (cdnCollectDataForPlay != null) {
                                                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                            }
                                                            hlsDownloadThread = this;
                                                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                            str17 = str17;
                                                            str19 = str19;
                                                            str22 = str22;
                                                            string = str23;
                                                            i4 = i4;
                                                            z2 = z2;
                                                            z3 = true;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str18 = str;
                                                            String str211111111118 = str2;
                                                            str21 = str21;
                                                            str20 = str211111111118;
                                                        } catch (IllegalArgumentException e108) {
                                                            inputStream = inputStream2;
                                                            illegalArgumentException = e108;
                                                            str2 = str2;
                                                            byteArrayOutputStream = null;
                                                        } catch (SocketTimeoutException e109) {
                                                            inputStream = inputStream2;
                                                            socketTimeoutException = e109;
                                                            str2 = str2;
                                                            byteArrayOutputStream = null;
                                                        } catch (UnknownHostException e110) {
                                                            inputStream = inputStream2;
                                                            unknownHostException = e110;
                                                            str2 = str2;
                                                            byteArrayOutputStream = null;
                                                        } catch (Throwable th27) {
                                                            inputStream = inputStream2;
                                                            httpURLConnection = httpURLConnection;
                                                            th = th27;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                            str22 = str22;
                                                            cdnConfigModel = cdnConfigModel;
                                                            str2 = str2;
                                                            i5 = i5;
                                                            str19 = str19;
                                                            byteArrayOutputStream = null;
                                                        }
                                                    } catch (FileNotFoundException e111) {
                                                        httpURLConnection = httpURLConnection;
                                                        fileNotFoundException = e111;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str2 = str2;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        str21 = str21;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        if (z2) {
                                                            str17 = str17;
                                                        } else {
                                                            str17 = str17;
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str211111111119 = str2;
                                                        str21 = str21;
                                                        str20 = str211111111119;
                                                    } catch (IllegalArgumentException e112) {
                                                        httpURLConnection = httpURLConnection;
                                                        illegalArgumentException = e112;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str2 = str2;
                                                        str17 = str17;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        str21 = str21;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        if (!z2) {
                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                            }
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111111111110 = str2;
                                                        str21 = str21;
                                                        str20 = str2111111111110;
                                                    } catch (MalformedURLException e113) {
                                                        e = e113;
                                                        HttpURLConnection httpURLConnection5 = httpURLConnection;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str2 = str2;
                                                        str17 = str17;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        httpURLConnection = httpURLConnection5;
                                                        str21 = str21;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                    } catch (SocketTimeoutException e114) {
                                                        httpURLConnection = httpURLConnection;
                                                        socketTimeoutException = e114;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str2 = str2;
                                                        str17 = str17;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        str21 = str21;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        if (z2) {
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111111111111 = str2;
                                                        str21 = str21;
                                                        str20 = str2111111111111;
                                                    } catch (UnknownHostException e115) {
                                                        httpURLConnection = httpURLConnection;
                                                        unknownHostException = e115;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str2 = str2;
                                                        str17 = str17;
                                                        str = str;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        str21 = str21;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        if (!z2) {
                                                            if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                                jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                                cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                            }
                                                            cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                            cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                            cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                            cdnCollectDataForPlay.setDownloaded(str);
                                                            cdnCollectDataForPlay.setDownloadTime(str);
                                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                                        }
                                                        if (!z2) {
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                                cdnCollectDataForPlay.setViaInfo(null);
                                                            }
                                                            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                                cdnCollectDataForPlay.setStatusCode(str22);
                                                            }
                                                            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                            if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            } else {
                                                                cdnCollectDataForPlay.setDownloadResult(str21);
                                                            }
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        str4 = XMediaplayerJNI.Tag;
                                                        sb = new StringBuilder();
                                                        sb.append(str19);
                                                        sb.append(System.currentTimeMillis() - j);
                                                        Logger.log(str4, sb.toString());
                                                        str = str;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111111111112 = str2;
                                                        str21 = str21;
                                                        str20 = str2111111111112;
                                                    } catch (IOException e116) {
                                                        httpURLConnection = httpURLConnection;
                                                        iOException = e116;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str2 = str2;
                                                        i5 = i5;
                                                        str19 = str19;
                                                        f3 = f3;
                                                        str21 = str21;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        if (z2) {
                                                            str3 = str;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        } else {
                                                            str3 = str;
                                                            jCurrentTimeMillis = jCurrentTimeMillis;
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                        if (z2) {
                                                            i = i5;
                                                        } else {
                                                            i = i5;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        str = str3;
                                                        i5 = i;
                                                        str17 = str17;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111111111113 = str2;
                                                        str21 = str21;
                                                        str20 = str2111111111113;
                                                    } catch (Throwable th28) {
                                                        httpURLConnection = httpURLConnection;
                                                        th = th28;
                                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                                        str22 = str22;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str2 = str2;
                                                        str19 = str19;
                                                        byteArrayOutputStream = null;
                                                        inputStream = null;
                                                        if (z2) {
                                                            str22 = str22;
                                                            str21 = str21;
                                                        } else {
                                                            str22 = str22;
                                                            str21 = str21;
                                                        }
                                                        if (z2) {
                                                            str2 = str2;
                                                        } else {
                                                            str2 = str2;
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                        i5 = i5;
                                                        str17 = str17;
                                                        f3 = f3;
                                                        if (cdnCollectDataForPlay != null) {
                                                            CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                        }
                                                        hlsDownloadThread = this;
                                                        cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                        str17 = str17;
                                                        str19 = str19;
                                                        str22 = str22;
                                                        string = str23;
                                                        i4 = i4;
                                                        z2 = z2;
                                                        z3 = true;
                                                        cdnConfigModel = cdnConfigModel;
                                                        str18 = str;
                                                        String str2111111111114 = str2;
                                                        str21 = str21;
                                                        str20 = str2111111111114;
                                                    }
                                                }
                                            } catch (FileNotFoundException e117) {
                                                str19 = str19;
                                                httpURLConnection = httpURLConnection;
                                                fileNotFoundException = e117;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                str22 = str22;
                                                str2 = str2;
                                                str = str;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                f3 = f3;
                                                if (z2) {
                                                    str17 = str17;
                                                } else {
                                                    str17 = str17;
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                                if (!z2) {
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                    }
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                    }
                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    } else {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                str4 = XMediaplayerJNI.Tag;
                                                sb = new StringBuilder();
                                                sb.append(str19);
                                                sb.append(System.currentTimeMillis() - j);
                                                Logger.log(str4, sb.toString());
                                                str = str;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2111111111115 = str2;
                                                str21 = str21;
                                                str20 = str2111111111115;
                                            } catch (MalformedURLException e118) {
                                                str19 = str19;
                                                httpURLConnection3 = httpURLConnection;
                                                malformedURLException = e118;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                str22 = str22;
                                                str2 = str2;
                                                str17 = str17;
                                                str = str;
                                                httpURLConnection = httpURLConnection3;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                f3 = f3;
                                                if (z2) {
                                                }
                                                String str3111 = XMediaplayerJNI.Tag;
                                                StringBuilder sb111 = new StringBuilder();
                                                str = str;
                                                sb111.append("HlsDownloadThread MalformedURLException:");
                                                sb111.append(malformedURLException.toString());
                                                Logger.log(str3111, sb111.toString());
                                                if (z2) {
                                                    j2 = jCurrentTimeMillis;
                                                } else {
                                                    j2 = jCurrentTimeMillis;
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                jCurrentTimeMillis = j2;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2111111111116 = str2;
                                                str21 = str21;
                                                str20 = str2111111111116;
                                            } catch (IOException e119) {
                                                str19 = str19;
                                                httpURLConnection = httpURLConnection;
                                                iOException = e119;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                str22 = str22;
                                                str2 = str2;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                f3 = f3;
                                                i5 = i5;
                                                if (z2) {
                                                    str3 = str;
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                } else {
                                                    str3 = str;
                                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                                if (z2) {
                                                    i = i5;
                                                } else {
                                                    i = i5;
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                str = str3;
                                                i5 = i;
                                                str17 = str17;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2111111111117 = str2;
                                                str21 = str21;
                                                str20 = str2111111111117;
                                            } catch (IllegalArgumentException e120) {
                                                str19 = str19;
                                                httpURLConnection = httpURLConnection;
                                                illegalArgumentException = e120;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                str22 = str22;
                                                str2 = str2;
                                                str17 = str17;
                                                str = str;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                f3 = f3;
                                                if (!z2) {
                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                    }
                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                }
                                                if (!z2) {
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                    }
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                    }
                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    } else {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                str4 = XMediaplayerJNI.Tag;
                                                sb = new StringBuilder();
                                                sb.append(str19);
                                                sb.append(System.currentTimeMillis() - j);
                                                Logger.log(str4, sb.toString());
                                                str = str;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2111111111118 = str2;
                                                str21 = str21;
                                                str20 = str2111111111118;
                                            } catch (SocketTimeoutException e121) {
                                                str19 = str19;
                                                httpURLConnection = httpURLConnection;
                                                socketTimeoutException = e121;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                str22 = str22;
                                                str2 = str2;
                                                str17 = str17;
                                                str = str;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                f3 = f3;
                                                if (z2) {
                                                }
                                                if (!z2) {
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                    }
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                    }
                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    } else {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                                str = str;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str2111111111119 = str2;
                                                str21 = str21;
                                                str20 = str2111111111119;
                                            } catch (UnknownHostException e122) {
                                                str19 = str19;
                                                httpURLConnection = httpURLConnection;
                                                unknownHostException = e122;
                                                jCurrentTimeMillis = jCurrentTimeMillis;
                                                str22 = str22;
                                                str2 = str2;
                                                str17 = str17;
                                                str = str;
                                                str21 = str21;
                                                byteArrayOutputStream = null;
                                                inputStream = null;
                                                f3 = f3;
                                                if (!z2) {
                                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                                    }
                                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                                    cdnCollectDataForPlay.setDownloaded(str);
                                                    cdnCollectDataForPlay.setDownloadTime(str);
                                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                                }
                                                if (!z2) {
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                                        cdnCollectDataForPlay.setViaInfo(null);
                                                    }
                                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                                        cdnCollectDataForPlay.setStatusCode(str22);
                                                    }
                                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    } else {
                                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                                    }
                                                }
                                                if (httpURLConnection != null) {
                                                    httpURLConnection.disconnect();
                                                }
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                str4 = XMediaplayerJNI.Tag;
                                                sb = new StringBuilder();
                                                sb.append(str19);
                                                sb.append(System.currentTimeMillis() - j);
                                                Logger.log(str4, sb.toString());
                                                str = str;
                                                if (cdnCollectDataForPlay != null) {
                                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                                }
                                                hlsDownloadThread = this;
                                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                                str17 = str17;
                                                str19 = str19;
                                                str22 = str22;
                                                string = str23;
                                                i4 = i4;
                                                z2 = z2;
                                                z3 = true;
                                                cdnConfigModel = cdnConfigModel;
                                                str18 = str;
                                                String str21111111111110 = str2;
                                                str21 = str21;
                                                str20 = str21111111111110;
                                            } catch (Throwable th29) {
                                                th = th29;
                                                str19 = str19;
                                                str2 = str2;
                                                httpURLConnection = httpURLConnection;
                                            }
                                        } catch (FileNotFoundException e123) {
                                            str19 = str27;
                                            httpURLConnection = httpURLConnection4;
                                            fileNotFoundException = e123;
                                            str2 = str2;
                                            str22 = str22;
                                        } catch (IllegalArgumentException e124) {
                                            str19 = str27;
                                            httpURLConnection = httpURLConnection4;
                                            illegalArgumentException = e124;
                                            str2 = str2;
                                            str22 = str22;
                                        } catch (MalformedURLException e125) {
                                            str19 = str27;
                                            httpURLConnection3 = httpURLConnection4;
                                            malformedURLException = e125;
                                            str2 = str2;
                                            str22 = str22;
                                        } catch (SocketTimeoutException e126) {
                                            str19 = str27;
                                            httpURLConnection = httpURLConnection4;
                                            socketTimeoutException = e126;
                                            str2 = str2;
                                            str22 = str22;
                                        } catch (UnknownHostException e127) {
                                            str19 = str27;
                                            httpURLConnection = httpURLConnection4;
                                            unknownHostException = e127;
                                            str2 = str2;
                                            str22 = str22;
                                        } catch (IOException e128) {
                                            str19 = str27;
                                            httpURLConnection = httpURLConnection4;
                                            iOException = e128;
                                            str2 = str2;
                                            str22 = str22;
                                        } catch (Throwable th30) {
                                            cdnConfigModel = cdnConfigModel;
                                            str22 = str22;
                                            str2 = str2;
                                            str19 = str27;
                                            httpURLConnection = httpURLConnection4;
                                            th = th30;
                                        }
                                    }
                                    str18 = str;
                                } catch (FileNotFoundException e129) {
                                    httpURLConnection = connectionUseDnsCache;
                                    cdnConfigModel = cdnConfigModel;
                                    z2 = z2;
                                    fileNotFoundException = e129;
                                    str = str;
                                    byteArrayOutputStream = null;
                                    inputStream = null;
                                    String str44 = str21;
                                    str2 = str20;
                                    str21 = str44;
                                    if (z2) {
                                        str17 = str17;
                                    } else {
                                        str17 = str17;
                                    }
                                    Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                    if (!z2) {
                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                            cdnCollectDataForPlay.setViaInfo(null);
                                        }
                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                            cdnCollectDataForPlay.setStatusCode(str22);
                                        }
                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                        } else {
                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    str4 = XMediaplayerJNI.Tag;
                                    sb = new StringBuilder();
                                    sb.append(str19);
                                    sb.append(System.currentTimeMillis() - j);
                                    Logger.log(str4, sb.toString());
                                    str = str;
                                    if (cdnCollectDataForPlay != null) {
                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                    }
                                    hlsDownloadThread = this;
                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                    str17 = str17;
                                    str19 = str19;
                                    str22 = str22;
                                    string = str23;
                                    i4 = i4;
                                    z2 = z2;
                                    z3 = true;
                                    cdnConfigModel = cdnConfigModel;
                                    str18 = str;
                                    String str21111111111111 = str2;
                                    str21 = str21;
                                    str20 = str21111111111111;
                                } catch (IllegalArgumentException e130) {
                                    httpURLConnection = connectionUseDnsCache;
                                    cdnConfigModel = cdnConfigModel;
                                    z2 = z2;
                                    illegalArgumentException = e130;
                                    str = str;
                                    byteArrayOutputStream = null;
                                    inputStream = null;
                                    String str45 = str21;
                                    str2 = str20;
                                    str21 = str45;
                                    if (!z2) {
                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                            jCurrentTimeMillis = System.currentTimeMillis() - j;
                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                        }
                                        cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                        cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                        cdnCollectDataForPlay.setDownloadSpeed(str17);
                                        cdnCollectDataForPlay.setDownloaded(str);
                                        cdnCollectDataForPlay.setDownloadTime(str);
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    }
                                    if (!z2) {
                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                            cdnCollectDataForPlay.setViaInfo(null);
                                        }
                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                            cdnCollectDataForPlay.setStatusCode(str22);
                                        }
                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                        } else {
                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    str4 = XMediaplayerJNI.Tag;
                                    sb = new StringBuilder();
                                    sb.append(str19);
                                    sb.append(System.currentTimeMillis() - j);
                                    Logger.log(str4, sb.toString());
                                    str = str;
                                    if (cdnCollectDataForPlay != null) {
                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                    }
                                    hlsDownloadThread = this;
                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                    str17 = str17;
                                    str19 = str19;
                                    str22 = str22;
                                    string = str23;
                                    i4 = i4;
                                    z2 = z2;
                                    z3 = true;
                                    cdnConfigModel = cdnConfigModel;
                                    str18 = str;
                                    String str21111111111112 = str2;
                                    str21 = str21;
                                    str20 = str21111111111112;
                                } catch (MalformedURLException e131) {
                                    cdnConfigModel = cdnConfigModel;
                                    z2 = z2;
                                    malformedURLException = e131;
                                    str = str;
                                    httpURLConnection = connectionUseDnsCache;
                                    byteArrayOutputStream = null;
                                    inputStream = null;
                                    String str46 = str21;
                                    str2 = str20;
                                    str21 = str46;
                                    if (z2) {
                                    }
                                    String str3112 = XMediaplayerJNI.Tag;
                                    StringBuilder sb112 = new StringBuilder();
                                    str = str;
                                    sb112.append("HlsDownloadThread MalformedURLException:");
                                    sb112.append(malformedURLException.toString());
                                    Logger.log(str3112, sb112.toString());
                                    if (z2) {
                                        j2 = jCurrentTimeMillis;
                                    } else {
                                        j2 = jCurrentTimeMillis;
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                    jCurrentTimeMillis = j2;
                                    if (cdnCollectDataForPlay != null) {
                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                    }
                                    hlsDownloadThread = this;
                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                    str17 = str17;
                                    str19 = str19;
                                    str22 = str22;
                                    string = str23;
                                    i4 = i4;
                                    z2 = z2;
                                    z3 = true;
                                    cdnConfigModel = cdnConfigModel;
                                    str18 = str;
                                    String str21111111111113 = str2;
                                    str21 = str21;
                                    str20 = str21111111111113;
                                } catch (SocketTimeoutException e132) {
                                    httpURLConnection = connectionUseDnsCache;
                                    cdnConfigModel = cdnConfigModel;
                                    z2 = z2;
                                    socketTimeoutException = e132;
                                    str = str;
                                    byteArrayOutputStream = null;
                                    inputStream = null;
                                    String str47 = str21;
                                    str2 = str20;
                                    str21 = str47;
                                    if (z2) {
                                    }
                                    if (!z2) {
                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                            cdnCollectDataForPlay.setViaInfo(null);
                                        }
                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                            cdnCollectDataForPlay.setStatusCode(str22);
                                        }
                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                        } else {
                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                    str = str;
                                    if (cdnCollectDataForPlay != null) {
                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                    }
                                    hlsDownloadThread = this;
                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                    str17 = str17;
                                    str19 = str19;
                                    str22 = str22;
                                    string = str23;
                                    i4 = i4;
                                    z2 = z2;
                                    z3 = true;
                                    cdnConfigModel = cdnConfigModel;
                                    str18 = str;
                                    String str21111111111114 = str2;
                                    str21 = str21;
                                    str20 = str21111111111114;
                                } catch (UnknownHostException e133) {
                                    httpURLConnection = connectionUseDnsCache;
                                    cdnConfigModel = cdnConfigModel;
                                    z2 = z2;
                                    unknownHostException = e133;
                                    str = str;
                                    byteArrayOutputStream = null;
                                    inputStream = null;
                                    String str48 = str21;
                                    str2 = str20;
                                    str21 = str48;
                                    if (!z2) {
                                        if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                            jCurrentTimeMillis = System.currentTimeMillis() - j;
                                            cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                        }
                                        cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                        cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                        cdnCollectDataForPlay.setDownloadSpeed(str17);
                                        cdnCollectDataForPlay.setDownloaded(str);
                                        cdnCollectDataForPlay.setDownloadTime(str);
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    }
                                    if (!z2) {
                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                            cdnCollectDataForPlay.setViaInfo(null);
                                        }
                                        if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                            cdnCollectDataForPlay.setStatusCode(str22);
                                        }
                                        cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                        if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                        } else {
                                            cdnCollectDataForPlay.setDownloadResult(str21);
                                        }
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    str4 = XMediaplayerJNI.Tag;
                                    sb = new StringBuilder();
                                    sb.append(str19);
                                    sb.append(System.currentTimeMillis() - j);
                                    Logger.log(str4, sb.toString());
                                    str = str;
                                    if (cdnCollectDataForPlay != null) {
                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                    }
                                    hlsDownloadThread = this;
                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                    str17 = str17;
                                    str19 = str19;
                                    str22 = str22;
                                    string = str23;
                                    i4 = i4;
                                    z2 = z2;
                                    z3 = true;
                                    cdnConfigModel = cdnConfigModel;
                                    str18 = str;
                                    String str21111111111115 = str2;
                                    str21 = str21;
                                    str20 = str21111111111115;
                                } catch (IOException e134) {
                                    httpURLConnection = connectionUseDnsCache;
                                    cdnConfigModel = cdnConfigModel;
                                    z2 = z2;
                                    iOException = e134;
                                    byteArrayOutputStream = null;
                                    inputStream = null;
                                    String str49 = str21;
                                    str2 = str20;
                                    str21 = str49;
                                    if (z2) {
                                        str3 = str;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                    } else {
                                        str3 = str;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                    }
                                    Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                    if (z2) {
                                        i = i5;
                                    } else {
                                        i = i5;
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                    str = str3;
                                    i5 = i;
                                    str17 = str17;
                                    if (cdnCollectDataForPlay != null) {
                                        CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                    }
                                    hlsDownloadThread = this;
                                    cdnCollectDataForPlay = cdnCollectDataForPlay;
                                    str17 = str17;
                                    str19 = str19;
                                    str22 = str22;
                                    string = str23;
                                    i4 = i4;
                                    z2 = z2;
                                    z3 = true;
                                    cdnConfigModel = cdnConfigModel;
                                    str18 = str;
                                    String str21111111111116 = str2;
                                    str21 = str21;
                                    str20 = str21111111111116;
                                } catch (Throwable th31) {
                                    httpURLConnection = connectionUseDnsCache;
                                    str21 = str21;
                                    str22 = str22;
                                    cdnConfigModel = cdnConfigModel;
                                    z2 = z2;
                                    float f10 = f3;
                                    str19 = str19;
                                    str2 = str20;
                                    th = th31;
                                    f3 = f10;
                                }
                            } catch (FileNotFoundException e135) {
                                e = e135;
                                fileNotFoundException = e;
                                str = str;
                                byteArrayOutputStream = null;
                                inputStream = null;
                                httpURLConnection = null;
                                String str410 = str21;
                                str2 = str20;
                                str21 = str410;
                                if (z2) {
                                    str17 = str17;
                                } else {
                                    str17 = str17;
                                }
                                Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                                if (!z2) {
                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                        cdnCollectDataForPlay.setViaInfo(null);
                                    }
                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                        cdnCollectDataForPlay.setStatusCode(str22);
                                    }
                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    } else {
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                str4 = XMediaplayerJNI.Tag;
                                sb = new StringBuilder();
                                sb.append(str19);
                                sb.append(System.currentTimeMillis() - j);
                                Logger.log(str4, sb.toString());
                                str = str;
                                if (cdnCollectDataForPlay != null) {
                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                }
                                hlsDownloadThread = this;
                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                str17 = str17;
                                str19 = str19;
                                str22 = str22;
                                string = str23;
                                i4 = i4;
                                z2 = z2;
                                z3 = true;
                                cdnConfigModel = cdnConfigModel;
                                str18 = str;
                                String str21111111111117 = str2;
                                str21 = str21;
                                str20 = str21111111111117;
                            } catch (IllegalArgumentException e136) {
                                e = e136;
                                illegalArgumentException = e;
                                str = str;
                                byteArrayOutputStream = null;
                                inputStream = null;
                                httpURLConnection = null;
                                String str411 = str21;
                                str2 = str20;
                                str21 = str411;
                                if (!z2) {
                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                    }
                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                    cdnCollectDataForPlay.setDownloaded(str);
                                    cdnCollectDataForPlay.setDownloadTime(str);
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                }
                                if (!z2) {
                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                        cdnCollectDataForPlay.setViaInfo(null);
                                    }
                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                        cdnCollectDataForPlay.setStatusCode(str22);
                                    }
                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    } else {
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                str4 = XMediaplayerJNI.Tag;
                                sb = new StringBuilder();
                                sb.append(str19);
                                sb.append(System.currentTimeMillis() - j);
                                Logger.log(str4, sb.toString());
                                str = str;
                                if (cdnCollectDataForPlay != null) {
                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                }
                                hlsDownloadThread = this;
                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                str17 = str17;
                                str19 = str19;
                                str22 = str22;
                                string = str23;
                                i4 = i4;
                                z2 = z2;
                                z3 = true;
                                cdnConfigModel = cdnConfigModel;
                                str18 = str;
                                String str21111111111118 = str2;
                                str21 = str21;
                                str20 = str21111111111118;
                            } catch (MalformedURLException e137) {
                                e = e137;
                                malformedURLException = e;
                                str = str;
                                byteArrayOutputStream = null;
                                httpURLConnection = null;
                                inputStream = null;
                                String str412 = str21;
                                str2 = str20;
                                str21 = str412;
                                if (z2) {
                                }
                                String str3113 = XMediaplayerJNI.Tag;
                                StringBuilder sb113 = new StringBuilder();
                                str = str;
                                sb113.append("HlsDownloadThread MalformedURLException:");
                                sb113.append(malformedURLException.toString());
                                Logger.log(str3113, sb113.toString());
                                if (z2) {
                                    j2 = jCurrentTimeMillis;
                                } else {
                                    j2 = jCurrentTimeMillis;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                jCurrentTimeMillis = j2;
                                if (cdnCollectDataForPlay != null) {
                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                }
                                hlsDownloadThread = this;
                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                str17 = str17;
                                str19 = str19;
                                str22 = str22;
                                string = str23;
                                i4 = i4;
                                z2 = z2;
                                z3 = true;
                                cdnConfigModel = cdnConfigModel;
                                str18 = str;
                                String str21111111111119 = str2;
                                str21 = str21;
                                str20 = str21111111111119;
                            } catch (SocketTimeoutException e138) {
                                e = e138;
                                socketTimeoutException = e;
                                str = str;
                                byteArrayOutputStream = null;
                                inputStream = null;
                                httpURLConnection = null;
                                String str413 = str21;
                                str2 = str20;
                                str21 = str413;
                                if (z2) {
                                }
                                if (!z2) {
                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                        cdnCollectDataForPlay.setViaInfo(null);
                                    }
                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                        cdnCollectDataForPlay.setStatusCode(str22);
                                    }
                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    } else {
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                str = str;
                                if (cdnCollectDataForPlay != null) {
                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                }
                                hlsDownloadThread = this;
                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                str17 = str17;
                                str19 = str19;
                                str22 = str22;
                                string = str23;
                                i4 = i4;
                                z2 = z2;
                                z3 = true;
                                cdnConfigModel = cdnConfigModel;
                                str18 = str;
                                String str211111111111110 = str2;
                                str21 = str21;
                                str20 = str211111111111110;
                            } catch (UnknownHostException e139) {
                                e = e139;
                                unknownHostException = e;
                                str = str;
                                byteArrayOutputStream = null;
                                inputStream = null;
                                httpURLConnection = null;
                                String str414 = str21;
                                str2 = str20;
                                str21 = str414;
                                if (!z2) {
                                    if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                        jCurrentTimeMillis = System.currentTimeMillis() - j;
                                        cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                    }
                                    cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                    cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                    cdnCollectDataForPlay.setDownloadSpeed(str17);
                                    cdnCollectDataForPlay.setDownloaded(str);
                                    cdnCollectDataForPlay.setDownloadTime(str);
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                }
                                if (!z2) {
                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                        cdnCollectDataForPlay.setViaInfo(null);
                                    }
                                    if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                        cdnCollectDataForPlay.setStatusCode(str22);
                                    }
                                    cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                    if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    } else {
                                        cdnCollectDataForPlay.setDownloadResult(str21);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                str4 = XMediaplayerJNI.Tag;
                                sb = new StringBuilder();
                                sb.append(str19);
                                sb.append(System.currentTimeMillis() - j);
                                Logger.log(str4, sb.toString());
                                str = str;
                                if (cdnCollectDataForPlay != null) {
                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                }
                                hlsDownloadThread = this;
                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                str17 = str17;
                                str19 = str19;
                                str22 = str22;
                                string = str23;
                                i4 = i4;
                                z2 = z2;
                                z3 = true;
                                cdnConfigModel = cdnConfigModel;
                                str18 = str;
                                String str211111111111111 = str2;
                                str21 = str21;
                                str20 = str211111111111111;
                            } catch (IOException e140) {
                                e = e140;
                                iOException = e;
                                byteArrayOutputStream = null;
                                inputStream = null;
                                httpURLConnection = null;
                                String str415 = str21;
                                str2 = str20;
                                str21 = str415;
                                if (z2) {
                                    str3 = str;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                } else {
                                    str3 = str;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                }
                                Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                                if (z2) {
                                    i = i5;
                                } else {
                                    i = i5;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                str = str3;
                                i5 = i;
                                str17 = str17;
                                if (cdnCollectDataForPlay != null) {
                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                }
                                hlsDownloadThread = this;
                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                str17 = str17;
                                str19 = str19;
                                str22 = str22;
                                string = str23;
                                i4 = i4;
                                z2 = z2;
                                z3 = true;
                                cdnConfigModel = cdnConfigModel;
                                str18 = str;
                                String str211111111111112 = str2;
                                str21 = str21;
                                str20 = str211111111111112;
                            } catch (Throwable th32) {
                                th = th32;
                                float f11 = f3;
                                str19 = str19;
                                str2 = str20;
                                th = th;
                                f3 = f11;
                                i5 = i5;
                                byteArrayOutputStream = null;
                                inputStream = null;
                                httpURLConnection = null;
                                if (z2) {
                                    str22 = str22;
                                    str21 = str21;
                                } else {
                                    str22 = str22;
                                    str21 = str21;
                                }
                                if (z2) {
                                    str2 = str2;
                                } else {
                                    str2 = str2;
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                                i5 = i5;
                                str17 = str17;
                                f3 = f3;
                                if (cdnCollectDataForPlay != null) {
                                    CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                                }
                                hlsDownloadThread = this;
                                cdnCollectDataForPlay = cdnCollectDataForPlay;
                                str17 = str17;
                                str19 = str19;
                                str22 = str22;
                                string = str23;
                                i4 = i4;
                                z2 = z2;
                                z3 = true;
                                cdnConfigModel = cdnConfigModel;
                                str18 = str;
                                String str211111111111113 = str2;
                                str21 = str21;
                                str20 = str211111111111113;
                            }
                        } catch (FileNotFoundException e141) {
                            e = e141;
                            j = jCurrentTimeMillis3;
                            fileNotFoundException = e;
                            str = str;
                            byteArrayOutputStream = null;
                            inputStream = null;
                            httpURLConnection = null;
                            String str416 = str21;
                            str2 = str20;
                            str21 = str416;
                            if (z2) {
                                str17 = str17;
                            } else {
                                str17 = str17;
                            }
                            Logger.log(XMediaplayerJNI.Tag, "DownloadThread IOException:" + fileNotFoundException.toString());
                            if (!z2) {
                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                    cdnCollectDataForPlay.setViaInfo(null);
                                }
                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                    cdnCollectDataForPlay.setStatusCode(str22);
                                }
                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                } else {
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            str4 = XMediaplayerJNI.Tag;
                            sb = new StringBuilder();
                            sb.append(str19);
                            sb.append(System.currentTimeMillis() - j);
                            Logger.log(str4, sb.toString());
                            str = str;
                            if (cdnCollectDataForPlay != null) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                            }
                            hlsDownloadThread = this;
                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                            str17 = str17;
                            str19 = str19;
                            str22 = str22;
                            string = str23;
                            i4 = i4;
                            z2 = z2;
                            z3 = true;
                            cdnConfigModel = cdnConfigModel;
                            str18 = str;
                            String str211111111111114 = str2;
                            str21 = str21;
                            str20 = str211111111111114;
                        } catch (IllegalArgumentException e142) {
                            e = e142;
                            j = jCurrentTimeMillis3;
                            illegalArgumentException = e;
                            str = str;
                            byteArrayOutputStream = null;
                            inputStream = null;
                            httpURLConnection = null;
                            String str417 = str21;
                            str2 = str20;
                            str21 = str417;
                            if (!z2) {
                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                }
                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(illegalArgumentException));
                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                cdnCollectDataForPlay.setDownloaded(str);
                                cdnCollectDataForPlay.setDownloadTime(str);
                                cdnCollectDataForPlay.setDownloadResult(str21);
                            }
                            if (!z2) {
                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                    cdnCollectDataForPlay.setViaInfo(null);
                                }
                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                    cdnCollectDataForPlay.setStatusCode(str22);
                                }
                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                } else {
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            str4 = XMediaplayerJNI.Tag;
                            sb = new StringBuilder();
                            sb.append(str19);
                            sb.append(System.currentTimeMillis() - j);
                            Logger.log(str4, sb.toString());
                            str = str;
                            if (cdnCollectDataForPlay != null) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                            }
                            hlsDownloadThread = this;
                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                            str17 = str17;
                            str19 = str19;
                            str22 = str22;
                            string = str23;
                            i4 = i4;
                            z2 = z2;
                            z3 = true;
                            cdnConfigModel = cdnConfigModel;
                            str18 = str;
                            String str211111111111115 = str2;
                            str21 = str21;
                            str20 = str211111111111115;
                        } catch (MalformedURLException e143) {
                            e = e143;
                            j = jCurrentTimeMillis3;
                            malformedURLException = e;
                            str = str;
                            byteArrayOutputStream = null;
                            httpURLConnection = null;
                            inputStream = null;
                            String str418 = str21;
                            str2 = str20;
                            str21 = str418;
                            if (z2) {
                            }
                            String str3114 = XMediaplayerJNI.Tag;
                            StringBuilder sb114 = new StringBuilder();
                            str = str;
                            sb114.append("HlsDownloadThread MalformedURLException:");
                            sb114.append(malformedURLException.toString());
                            Logger.log(str3114, sb114.toString());
                            if (z2) {
                                j2 = jCurrentTimeMillis;
                            } else {
                                j2 = jCurrentTimeMillis;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                            jCurrentTimeMillis = j2;
                            if (cdnCollectDataForPlay != null) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                            }
                            hlsDownloadThread = this;
                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                            str17 = str17;
                            str19 = str19;
                            str22 = str22;
                            string = str23;
                            i4 = i4;
                            z2 = z2;
                            z3 = true;
                            cdnConfigModel = cdnConfigModel;
                            str18 = str;
                            String str211111111111116 = str2;
                            str21 = str21;
                            str20 = str211111111111116;
                        } catch (SocketTimeoutException e144) {
                            e = e144;
                            j = jCurrentTimeMillis3;
                            socketTimeoutException = e;
                            str = str;
                            byteArrayOutputStream = null;
                            inputStream = null;
                            httpURLConnection = null;
                            String str419 = str21;
                            str2 = str20;
                            str21 = str419;
                            if (z2) {
                            }
                            if (!z2) {
                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                    cdnCollectDataForPlay.setViaInfo(null);
                                }
                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                    cdnCollectDataForPlay.setStatusCode(str22);
                                }
                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                } else {
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                            str = str;
                            if (cdnCollectDataForPlay != null) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                            }
                            hlsDownloadThread = this;
                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                            str17 = str17;
                            str19 = str19;
                            str22 = str22;
                            string = str23;
                            i4 = i4;
                            z2 = z2;
                            z3 = true;
                            cdnConfigModel = cdnConfigModel;
                            str18 = str;
                            String str211111111111117 = str2;
                            str21 = str21;
                            str20 = str211111111111117;
                        } catch (UnknownHostException e145) {
                            e = e145;
                            j = jCurrentTimeMillis3;
                            unknownHostException = e;
                            str = str;
                            byteArrayOutputStream = null;
                            inputStream = null;
                            httpURLConnection = null;
                            String str4110 = str21;
                            str2 = str20;
                            str21 = str4110;
                            if (!z2) {
                                if (cdnCollectDataForPlay.getConnectedTime() <= 0.0f) {
                                    jCurrentTimeMillis = System.currentTimeMillis() - j;
                                    cdnCollectDataForPlay.setConnectedTime(CdnUtil.oneDecimal(jCurrentTimeMillis, false));
                                }
                                cdnCollectDataForPlay.setErrorType(CdnConstants.DNS_FAIL);
                                cdnCollectDataForPlay.setExceptionReason(CdnUtil.exception2String(unknownHostException));
                                cdnCollectDataForPlay.setDownloadSpeed(str17);
                                cdnCollectDataForPlay.setDownloaded(str);
                                cdnCollectDataForPlay.setDownloadTime(str);
                                cdnCollectDataForPlay.setDownloadResult(str21);
                            }
                            if (!z2) {
                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                                    cdnCollectDataForPlay.setViaInfo(null);
                                }
                                if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                                    cdnCollectDataForPlay.setStatusCode(str22);
                                }
                                cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
                                if (cdnCollectDataForPlay.getDownloadResult() != null) {
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                } else {
                                    cdnCollectDataForPlay.setDownloadResult(str21);
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            str4 = XMediaplayerJNI.Tag;
                            sb = new StringBuilder();
                            sb.append(str19);
                            sb.append(System.currentTimeMillis() - j);
                            Logger.log(str4, sb.toString());
                            str = str;
                            if (cdnCollectDataForPlay != null) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                            }
                            hlsDownloadThread = this;
                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                            str17 = str17;
                            str19 = str19;
                            str22 = str22;
                            string = str23;
                            i4 = i4;
                            z2 = z2;
                            z3 = true;
                            cdnConfigModel = cdnConfigModel;
                            str18 = str;
                            String str211111111111118 = str2;
                            str21 = str21;
                            str20 = str211111111111118;
                        } catch (IOException e146) {
                            e = e146;
                            j = jCurrentTimeMillis3;
                            iOException = e;
                            byteArrayOutputStream = null;
                            inputStream = null;
                            httpURLConnection = null;
                            String str4111 = str21;
                            str2 = str20;
                            str21 = str4111;
                            if (z2) {
                                str3 = str;
                                jCurrentTimeMillis = jCurrentTimeMillis;
                            } else {
                                str3 = str;
                                jCurrentTimeMillis = jCurrentTimeMillis;
                            }
                            Logger.log(XMediaplayerJNI.Tag, "HlsDownloadThread IOException:" + iOException.toString());
                            if (z2) {
                                i = i5;
                            } else {
                                i = i5;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                            str = str3;
                            i5 = i;
                            str17 = str17;
                            if (cdnCollectDataForPlay != null) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                            }
                            hlsDownloadThread = this;
                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                            str17 = str17;
                            str19 = str19;
                            str22 = str22;
                            string = str23;
                            i4 = i4;
                            z2 = z2;
                            z3 = true;
                            cdnConfigModel = cdnConfigModel;
                            str18 = str;
                            String str211111111111119 = str2;
                            str21 = str21;
                            str20 = str211111111111119;
                        } catch (Throwable th33) {
                            th = th33;
                            j = jCurrentTimeMillis3;
                            float f12 = f3;
                            str19 = str19;
                            str2 = str20;
                            th = th;
                            f3 = f12;
                            i5 = i5;
                            byteArrayOutputStream = null;
                            inputStream = null;
                            httpURLConnection = null;
                            if (z2) {
                                str22 = str22;
                                str21 = str21;
                            } else {
                                str22 = str22;
                                str21 = str21;
                            }
                            if (z2) {
                                str2 = str2;
                            } else {
                                str2 = str2;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            Logger.log(XMediaplayerJNI.Tag, str19 + (System.currentTimeMillis() - j));
                            i5 = i5;
                            str17 = str17;
                            f3 = f3;
                            if (cdnCollectDataForPlay != null) {
                                CdnUtil.statDownLoadCDN(cdnCollectDataForPlay, cdnConfigModel);
                            }
                            hlsDownloadThread = this;
                            cdnCollectDataForPlay = cdnCollectDataForPlay;
                            str17 = str17;
                            str19 = str19;
                            str22 = str22;
                            string = str23;
                            i4 = i4;
                            z2 = z2;
                            z3 = true;
                            cdnConfigModel = cdnConfigModel;
                            str18 = str;
                            String str2111111111111110 = str2;
                            str21 = str21;
                            str20 = str2111111111111110;
                        }
                    } catch (FileNotFoundException e147) {
                        e = e147;
                        str = str18;
                    } catch (IOException e148) {
                        e = e148;
                        str = str18;
                    } catch (IllegalArgumentException e149) {
                        e = e149;
                        str = str18;
                    } catch (MalformedURLException e150) {
                        e = e150;
                        str = str18;
                    } catch (SocketTimeoutException e151) {
                        e = e151;
                        str = str18;
                    } catch (UnknownHostException e152) {
                        e = e152;
                        str = str18;
                    }
                } catch (Throwable th34) {
                    th = th34;
                    str = str18;
                }
            } catch (FileNotFoundException e153) {
                str = str18;
                cdnConfigModel = cdnConfigModel;
                z2 = z2;
                j = jCurrentTimeMillis3;
                str19 = str19;
                str22 = str22;
                String str50 = str21;
                str2 = str20;
                str21 = str50;
                fileNotFoundException = e153;
                byteArrayOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            } catch (IllegalArgumentException e154) {
                str = str18;
                cdnConfigModel = cdnConfigModel;
                z2 = z2;
                j = jCurrentTimeMillis3;
                str19 = str19;
                str22 = str22;
                str17 = str17;
                String str51 = str21;
                str2 = str20;
                str21 = str51;
                illegalArgumentException = e154;
                byteArrayOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            } catch (MalformedURLException e155) {
                str = str18;
                cdnConfigModel = cdnConfigModel;
                z2 = z2;
                j = jCurrentTimeMillis3;
                str19 = str19;
                str22 = str22;
                str17 = str17;
                String str52 = str21;
                str2 = str20;
                str21 = str52;
                malformedURLException = e155;
                byteArrayOutputStream = null;
                httpURLConnection = null;
            } catch (SocketTimeoutException e156) {
                str = str18;
                cdnConfigModel = cdnConfigModel;
                z2 = z2;
                j = jCurrentTimeMillis3;
                str19 = str19;
                str22 = str22;
                str17 = str17;
                String str53 = str21;
                str2 = str20;
                str21 = str53;
                socketTimeoutException = e156;
                byteArrayOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            } catch (UnknownHostException e157) {
                str = str18;
                cdnConfigModel = cdnConfigModel;
                z2 = z2;
                j = jCurrentTimeMillis3;
                str19 = str19;
                str22 = str22;
                str17 = str17;
                String str54 = str21;
                str2 = str20;
                str21 = str54;
                unknownHostException = e157;
                byteArrayOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            } catch (IOException e158) {
                str = str18;
                cdnConfigModel = cdnConfigModel;
                z2 = z2;
                j = jCurrentTimeMillis3;
                str19 = str19;
                str22 = str22;
                String str55 = str21;
                str2 = str20;
                str21 = str55;
                iOException = e158;
                i5 = i5;
                byteArrayOutputStream = null;
                inputStream = null;
                httpURLConnection = null;
            }
        }
        String str56 = str11;
        String str57 = str5;
        String str58 = str10;
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        String str59 = str9;
        String str60 = str19;
        int i6 = i5;
        if (!z2 && cdnCollectDataForPlay != null) {
            if (TextUtils.isEmpty(cdnCollectDataForPlay.getViaInfo())) {
                cdnCollectDataForPlay.setViaInfo(null);
            }
            if (TextUtils.isEmpty(cdnCollectDataForPlay.getStatusCode())) {
                cdnCollectDataForPlay.setStatusCode(str22);
            }
            cdnCollectDataForPlay.setTimestamp(System.currentTimeMillis());
            if (cdnCollectDataForPlay.getDownloadResult() == null || !cdnCollectDataForPlay.getDownloadResult().contains(str2)) {
                cdnCollectDataForPlay.setDownloadResult(str12);
            }
            if (!z3 && (netType = cdnConfigModel.getNetType()) != -1) {
                if (netType == 0) {
                    hlsDownloadThread.mLimitConnectTime = cdnConfigModel.getCdnNotWifiConnectTimeout();
                    long cdnNotWifiAlertRate4 = cdnConfigModel.getCdnNotWifiAlertRate();
                    hlsDownloadThread.mLimitDownloadSpeed = cdnNotWifiAlertRate4;
                    if (jCurrentTimeMillis > hlsDownloadThread.mLimitConnectTime * 1000) {
                        cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECTED_TOO_SLOW);
                        cdnCollectDataForPlay.setExceptionReason("connected_time=" + CdnUtil.oneDecimal(jCurrentTimeMillis, false) + str57 + hlsDownloadThread.mLimitConnectTime + str59);
                    } else if (cdnNotWifiAlertRate4 > f3) {
                        cdnCollectDataForPlay.setErrorType(str56);
                        cdnCollectDataForPlay.setExceptionReason(r5 + CdnUtil.oneDecimal(f3, true) + str58 + hlsDownloadThread.mLimitDownloadSpeed + r6);
                    }
                } else if (netType == 1) {
                    float f13 = f3;
                    hlsDownloadThread.mLimitConnectTime = cdnConfigModel.getCdnWifiConnectTimeout();
                    long cdnWifiAlertRate4 = cdnConfigModel.getCdnWifiAlertRate();
                    hlsDownloadThread.mLimitDownloadSpeed = cdnWifiAlertRate4;
                    hlsDownloadThread.mLimitConnectTime = 0L;
                    if (jCurrentTimeMillis > 0 * 1000) {
                        cdnCollectDataForPlay.setErrorType(CdnConstants.CDN_CONNECTED_TOO_SLOW);
                        cdnCollectDataForPlay.setExceptionReason("connected_time=" + CdnUtil.oneDecimal(jCurrentTimeMillis, false) + str57 + hlsDownloadThread.mLimitConnectTime + str59);
                    } else if (cdnWifiAlertRate4 > f13) {
                        cdnCollectDataForPlay.setErrorType(str56);
                        cdnCollectDataForPlay.setExceptionReason(r5 + CdnUtil.oneDecimal(f13, true) + str58 + hlsDownloadThread.mLimitDownloadSpeed + r6);
                    }
                }
            }
        }
        httpURLConnection.disconnect();
        try {
            inputStream.close();
        } catch (IOException unused19) {
        }
        if (byteArrayOutputStream3 != null) {
            try {
                byteArrayOutputStream3.close();
            } catch (IOException unused20) {
            }
        }
        Logger.log(XMediaplayerJNI.Tag, str60 + (System.currentTimeMillis() - j));
        return i6;
    }
}
