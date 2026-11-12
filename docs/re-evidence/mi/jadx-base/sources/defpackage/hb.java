package defpackage;

import android.text.TextUtils;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u001a-\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000e\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001¨\u0006\n"}, d2 = {"", "", "paths", "resultPath", "", "isDeleteOriginFile", PluginDeviceInfo.FMODEL, "([Ljava/lang/String;Ljava/lang/String;Z)Z", "path", "", "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class hb {
    public static /* synthetic */ boolean a(String[] strArr, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return a(strArr, str, z);
    }

    public static final boolean a(@NotNull String[] paths, @NotNull String resultPath, boolean z) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        Intrinsics.checkNotNullParameter(resultPath, "resultPath");
        if (paths.length == 0 || TextUtils.isEmpty(resultPath)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : paths) {
            if (str.length() > 0) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new File((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            File file = (File) obj;
            if (file.exists() && file.isFile()) {
                arrayList3.add(obj);
            }
        }
        try {
            FileChannel channel = new FileOutputStream(new File(resultPath), true).getChannel();
            int length = paths.length;
            for (int i = 0; i < length; i++) {
                FileChannel channel2 = new FileInputStream((File) arrayList3.get(i)).getChannel();
                channel.transferFrom(channel2, channel.size(), channel2.size());
                channel2.close();
            }
            channel.close();
            if (z) {
                int length2 = paths.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    ((File) arrayList3.get(i2)).delete();
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static final long a(@NotNull String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(path)));
        int iAvailable = bufferedInputStream.available();
        bufferedInputStream.mark(iAvailable);
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        int i = 0;
        while (i + 4096 <= iAvailable) {
            int i2 = bufferedInputStream.read(bArr, 0, 4096);
            crc32.update(bArr, 0, i2);
            i += i2;
        }
        crc32.update(bArr, 0, bufferedInputStream.read(bArr, 0, iAvailable - i));
        bufferedInputStream.close();
        return crc32.getValue();
    }
}
