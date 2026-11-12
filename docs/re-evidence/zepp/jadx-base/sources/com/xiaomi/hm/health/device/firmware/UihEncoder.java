package com.xiaomi.hm.health.device.firmware;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0014\u0010\u000e\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/UihEncoder;", "Lcom/xiaomi/hm/health/device/firmware/IHeaderEncoder;", "", "path", "", "type", "pnpId", "id", "imageSize", "imageCrc", "", "a", "", "encoderList", "setChildEncoder", "encode", LogUtil.I, "b", "c", "", GoogleApiAvailabilityLight.a, "Z", "isDeleteTempFile", "", "e", "Ljava/util/List;", "childEncoder", "<init>", "(IIIZ)V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class UihEncoder implements IHeaderEncoder {

    @NotNull
    public static final String MAGIC_HEADER_PREFIX = "UIHH";
    public static final int UIH_VERSION = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pnpId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isDeleteTempFile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<IHeaderEncoder> childEncoder;

    public UihEncoder(int i, int i2, int i3, boolean z) {
        this.type = i;
        this.id = i2;
        this.pnpId = i3;
        this.isDeleteTempFile = z;
        this.childEncoder = new ArrayList();
    }

    private final void a(String path, int type, int pnpId, int id, int imageSize, int imageCrc) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write("UIHH".getBytes(Charsets.UTF_8));
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) type));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(GattUtils.intToBytes(imageCrc));
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) pnpId));
        byteArrayOutputStream.write(GattUtils.intToBytes(id));
        byteArrayOutputStream.write(GattUtils.intToBytes(imageSize));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        byteArrayOutputStream.close();
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHeaderEncoder
    @NotNull
    /* JADX INFO: renamed from: encode */
    public String getPath() throws Exception {
        List<IHeaderEncoder> list = this.childEncoder;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IHeaderEncoder) it2.next()).getPath());
        }
        if (arrayList.isEmpty()) {
            throw new Exception("no fw header wrapped file");
        }
        String strSubstringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default((String) CollectionsKt.first((List) arrayList), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, (String) null, 2, (Object) null);
        String str = strSubstringBeforeLast$default + "/content_file.bin";
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        if (!FwFileUtilsKt.mergeFiles((String[]) array, str, this.isDeleteTempFile)) {
            throw new Exception("merge fw header files exception");
        }
        String str2 = strSubstringBeforeLast$default + "/uih.bin";
        a(str2, this.type, this.pnpId, this.id, (int) new File(str).length(), (int) FwFileUtilsKt.getCrc32(str));
        if (FwFileUtilsKt.mergeFiles(new String[]{str}, str2, true)) {
            return str2;
        }
        throw new Exception("Save Uih file exception");
    }

    public final void setChildEncoder(@NotNull List<? extends IHeaderEncoder> encoderList) {
        if (encoderList.isEmpty()) {
            return;
        }
        this.childEncoder.addAll(encoderList);
    }

    public /* synthetic */ UihEncoder(int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? true : z);
    }
}
