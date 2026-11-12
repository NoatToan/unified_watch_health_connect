package com.xiaomi.hm.health.device.firmware;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\u001a-\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n\"\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u001c\u0010\u0013\u001a\u00020\u00018\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "", "paths", "resultPath", "", "isDeleteOriginFile", "mergeFiles", "([Ljava/lang/String;Ljava/lang/String;Z)Z", "path", "fileReadableSize", "", HTTP.CONTENT_RANGE_BYTES, "readableFileSize", "a", "Ljava/lang/String;", "TAG", "b", "getCHANGE_LOG_FILE_PREFIX", "()Ljava/lang/String;", "CHANGE_LOG_FILE_PREFIX", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class MidongFwFileUtilsKt {

    @NotNull
    private static final String a = "MidongFwFileUtils";

    @NotNull
    private static final String b = "change_log_";

    private static final long a(String str) {
        if (str.length() == 0) {
            return 0L;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    @NotNull
    public static final String fileReadableSize(@NotNull String str) {
        return readableFileSize(a(str));
    }

    @NotNull
    public static final String getCHANGE_LOG_FILE_PREFIX() {
        return b;
    }

    public static final boolean mergeFiles(@NotNull String[] strArr, @NotNull String str, boolean z) {
        int length;
        int i = 0;
        if (!(strArr.length == 0) && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : strArr) {
                if (str2.length() > 0) {
                    arrayList.add(str2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new File((String) it2.next()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                File file = (File) obj;
                if (file.exists() && file.isFile()) {
                    arrayList3.add(obj);
                }
            }
            try {
                FileChannel channel = new FileOutputStream(new File(str), true).getChannel();
                int length2 = strArr.length - 1;
                if (length2 >= 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        FileChannel channel2 = new FileInputStream((File) arrayList3.get(i2)).getChannel();
                        channel.transferFrom(channel2, channel.size(), channel2.size());
                        channel2.close();
                        if (i3 > length2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                channel.close();
                if (z && (length = strArr.length - 1) >= 0) {
                    while (true) {
                        int i4 = i + 1;
                        ((File) arrayList3.get(i)).delete();
                        if (i4 > length) {
                            break;
                        }
                        i = i4;
                    }
                }
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean mergeFiles$default(String[] strArr, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return mergeFiles(strArr, str, z);
    }

    @NotNull
    public static final String readableFileSize(long j) {
        long jAbs = j == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(j);
        if (jAbs < 1024) {
            return j + " B";
        }
        if (jAbs <= 1048524) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(j / Math.pow(2.0d, 10.0d))}, 1));
        }
        if (jAbs <= 1073689395) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(j / Math.pow(2.0d, 20.0d))}, 1));
        }
        if (jAbs <= 1099457940684L) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            return String.format("%.1f GB", Arrays.copyOf(new Object[]{Double.valueOf(j / Math.pow(2.0d, 30.0d))}, 1));
        }
        if (jAbs <= 1125844931261235L) {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            return String.format("%.1f TB", Arrays.copyOf(new Object[]{Double.valueOf(j / Math.pow(2.0d, 40.0d))}, 1));
        }
        if (jAbs <= 1152865209611504844L) {
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            return String.format("%.1f PB", Arrays.copyOf(new Object[]{Double.valueOf((j >> 10) / Math.pow(2.0d, 40.0d))}, 1));
        }
        StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
        return String.format("%.1f EB", Arrays.copyOf(new Object[]{Double.valueOf((j >> 20) / Math.pow(2.0d, 40.0d))}, 1));
    }
}
