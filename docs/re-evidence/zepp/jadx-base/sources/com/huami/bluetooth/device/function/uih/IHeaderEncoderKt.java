package com.huami.bluetooth.device.function.uih;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "paths", "resultPath", "", "isDeleteOriginFile", "mergeFiles", "([Ljava/lang/String;Ljava/lang/String;Z)Z", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class IHeaderEncoderKt {
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
}
