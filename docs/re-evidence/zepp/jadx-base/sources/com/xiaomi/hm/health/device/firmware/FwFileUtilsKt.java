package com.xiaomi.hm.health.device.firmware;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001\"\u0016\u0010\r\u001a\u00020\u00018\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"", "", "paths", "resultPath", "", "isDeleteOriginFile", "mergeFiles", "([Ljava/lang/String;Ljava/lang/String;Z)Z", "path", "", "getCrc32", "a", "Ljava/lang/String;", "TAG", "companion_release"}, k = 2, mv = {1, 5, 1})
public final class FwFileUtilsKt {

    @NotNull
    private static final String a = "FwFileUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "size:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "read size:" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            long j = this.a;
            return "crc:" + j + "," + Long.toHexString(j);
        }
    }

    public static final long getCrc32(@NotNull String str) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(str)));
        int iAvailable = bufferedInputStream.available();
        HMLog.debug(a, new a(iAvailable));
        bufferedInputStream.mark(iAvailable);
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        Ref.IntRef intRef = new Ref.IntRef();
        while (true) {
            int i = intRef.element;
            if (i + 4096 > iAvailable) {
                int i2 = bufferedInputStream.read(bArr, 0, iAvailable - i);
                crc32.update(bArr, 0, i2);
                intRef.element += i2;
                HMLog.debug(a, new b(intRef));
                bufferedInputStream.close();
                long value = crc32.getValue();
                HMLog.debug(a, new c(value));
                return value;
            }
            int i3 = bufferedInputStream.read(bArr, 0, 4096);
            crc32.update(bArr, 0, i3);
            intRef.element += i3;
        }
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
}
