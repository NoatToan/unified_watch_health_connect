package com.huami.device.core.agps.impl.store;

import com.huami.bluetooth.device.function.uih.FwHeaderEncoder;
import com.huami.bluetooth.device.function.uih.IHeaderEncoder;
import com.huami.bluetooth.device.function.uih.UihEncoder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u001c\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0000\u001a\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f\u001a\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011\"\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "list", "Lcom/huami/bluetooth/device/function/uih/FwHeaderEncoder;", "sortFirmwaresEncoders", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "firmwares", "encoderFirmwares", "Lcom/huami/bluetooth/device/function/uih/IHeaderEncoder;", "encoders", "encoderFirmwaresToFirmwareInfo", "Ljava/io/File;", "file", "", "deleteFile", "zipFile", "", "unzipFilePath", "Ljava/util/ArrayList;", "unzip", "a", "Ljava/lang/String;", "TAG", "agps-impl_release"}, k = 2, mv = {1, 4, 0})
public final class AGPSFirmwareHelperKt {
    private static final String a = "AGPSFirmwareHelper";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, String str) {
            super(0);
            this.a = file;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "unzip file error " + this.a.getAbsolutePath() + " unzip path: " + this.b;
        }
    }

    public static final void deleteFile(@NotNull File file) {
        try {
            HMLog.i(a, "Delete file " + file.getName() + ":" + file.delete(), new Object[0]);
        } catch (Exception e) {
            HMLog.i(a, "Delete file exception:" + e, new Object[0]);
        }
    }

    @NotNull
    public static final HMFirmwareInfo encoderFirmwares(@NotNull HMFirmwareType hMFirmwareType, @NotNull List<? extends HMFirmwareInfo> list) {
        return encoderFirmwaresToFirmwareInfo(hMFirmwareType, sortFirmwaresEncoders(list));
    }

    @NotNull
    public static final HMFirmwareInfo encoderFirmwaresToFirmwareInfo(@NotNull HMFirmwareType hMFirmwareType, @NotNull List<? extends IHeaderEncoder> list) {
        UihEncoder uihEncoder = new UihEncoder(4, 0, 0, true);
        uihEncoder.setChildEncoder(list);
        return new HMFirmwareInfo(new File(uihEncoder.getPath()).getAbsolutePath(), hMFirmwareType);
    }

    @NotNull
    public static final List<FwHeaderEncoder> sortFirmwaresEncoders(@NotNull List<? extends HMFirmwareInfo> list) {
        List<HMFirmwareInfo> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator<T>() { // from class: com.huami.device.core.agps.impl.store.AGPSFirmwareHelperKt$sortFirmwaresEncoders$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((HMFirmwareInfo) t).getFwType().getValue() & 255), Integer.valueOf(((HMFirmwareInfo) t2).getFwType().getValue() & 255));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        for (HMFirmwareInfo hMFirmwareInfo : listSortedWith) {
            arrayList.add(new FwHeaderEncoder(hMFirmwareInfo.getFwPath(), hMFirmwareInfo.getFwType()));
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList<File> unzip(@NotNull File file, @NotNull String str) throws Throwable {
        Exception exc;
        String strSubstring;
        ArrayList<File> arrayList = new ArrayList<>();
        ZipFile zipFile = null;
        try {
            try {
                try {
                    File file2 = new File(str);
                    if (!file2.exists() || !file2.isDirectory()) {
                        file2.mkdirs();
                    }
                    Ref.IntRef intRef = new Ref.IntRef();
                    byte[] bArr = new byte[1024];
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                        if (enumerationEntries == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.util.Enumeration<java.util.zip.ZipEntry>");
                        }
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            String str2 = File.separator;
                            sb.append(str2);
                            sb.append(zipEntryNextElement.getName());
                            String string = sb.toString();
                            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) string, str2, 0, false, 6, (Object) null);
                            if (iLastIndexOf$default == -1) {
                                strSubstring = "";
                            } else {
                                if (string == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                                strSubstring = string.substring(0, iLastIndexOf$default);
                            }
                            File file3 = new File(strSubstring);
                            if (!file3.exists() || !file3.isDirectory()) {
                                file3.mkdirs();
                            }
                            File file4 = new File(string);
                            if (file4.exists()) {
                                new SecurityManager().checkDelete(string);
                                file4.delete();
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file4));
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile2.getInputStream(zipEntryNextElement));
                            while (true) {
                                int i = bufferedInputStream.read(bArr, 0, 1024);
                                intRef.element = i;
                                if (i != -1) {
                                    bufferedOutputStream.write(bArr, 0, i);
                                }
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            arrayList.add(file4);
                        }
                        zipFile2.close();
                        return arrayList;
                    } catch (Exception e) {
                        exc = e;
                        zipFile = zipFile2;
                        HMLog.error$default(null, null, exc, new a(file, str), 3, null);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
