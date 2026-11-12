package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B)\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J8\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¨\u0006\u0012"}, d2 = {"Ljv;", "Lni;", "", "encoderList", "", PluginDeviceInfo.FMODEL, "", "path", "", "type", "pnpId", "id", "imageSize", "imageCrc", "", "isDeleteTempFile", "<init>", "(IIIZ)V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class jv implements ni {

    @NotNull
    public static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23162b;
    public final int c;
    public final boolean d;

    @NotNull
    public final List<ni> e = new ArrayList();

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ljv$a;", "", "", "MAGIC_HEADER_PREFIX", "Ljava/lang/String;", "", "UIH_VERSION", "I", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public jv(int i, int i2, int i3, boolean z) {
        this.f23161a = i;
        this.f23162b = i2;
        this.c = i3;
        this.d = z;
    }

    public final void a(@NotNull List<? extends ni> encoderList) {
        Intrinsics.checkNotNullParameter(encoderList, "encoderList");
        if (encoderList.isEmpty()) {
            return;
        }
        this.e.addAll(encoderList);
    }

    @Override // defpackage.ni
    @NotNull
    public String a() throws Exception {
        List<ni> list = this.e;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ni) it.next()).a());
        }
        if (!arrayList.isEmpty()) {
            String strSubstringBeforeLast$default = StringsKt__StringsKt.substringBeforeLast$default((String) CollectionsKt___CollectionsKt.first((List) arrayList), "/", (String) null, 2, (Object) null);
            String str = strSubstringBeforeLast$default + "/content_file.bin";
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            if (hb.a((String[]) array, str, this.d)) {
                String str2 = strSubstringBeforeLast$default + "/uih.bin";
                a(str2, this.f23161a, this.c, this.f23162b, (int) new File(str).length(), (int) hb.a(str));
                if (hb.a(new String[]{str}, str2, true)) {
                    return str2;
                }
                throw new Exception("Save Uih file exception");
            }
            throw new Exception("merge fw header files exception");
        }
        throw new Exception("no fw header wrapped file");
    }

    public final void a(String path, int type, int pnpId, int id, int imageSize, int imageCrc) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes = "UIHH".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(tet.s((short) type));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(tet.p(imageCrc));
        byteArrayOutputStream.write(tet.s((short) pnpId));
        byteArrayOutputStream.write(tet.p(id));
        byteArrayOutputStream.write(tet.p(imageSize));
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
}
