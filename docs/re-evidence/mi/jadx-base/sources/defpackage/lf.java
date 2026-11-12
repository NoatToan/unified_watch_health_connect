package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Llf;", "", "", "version", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24993b;
    public final float c;
    public final float d;
    public final int e;

    @NotNull
    public final List<Float> f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f24994k;
    public final float l;
    public final float m;
    public final int n;
    public final int o;
    public final int p;

    @NotNull
    public final List<Float> q;

    @NotNull
    public final byte[] a(int version) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(tet.p(this.f24992a));
        byteArrayOutputStream.write(tet.p(this.f24993b));
        byteArrayOutputStream.write(tet.p(Float.floatToIntBits(this.c)));
        byteArrayOutputStream.write(tet.p(Float.floatToIntBits(this.d)));
        byteArrayOutputStream.write(this.e);
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            byteArrayOutputStream.write(tet.p(Float.floatToIntBits(this.f.get(i).floatValue())));
        }
        byteArrayOutputStream.write(this.g);
        byteArrayOutputStream.write(this.h);
        byteArrayOutputStream.write(tet.r(this.i, 2));
        byteArrayOutputStream.write(tet.r(this.j, 2));
        byteArrayOutputStream.write(tet.p(Float.floatToIntBits(this.f24994k)));
        byteArrayOutputStream.write(tet.p(Float.floatToIntBits(this.l)));
        byteArrayOutputStream.write(tet.p(Float.floatToIntBits(this.m)));
        if (version >= 2) {
            byteArrayOutputStream.write(tet.r(this.n, 2));
            byteArrayOutputStream.write(tet.r(this.o, 2));
            byteArrayOutputStream.write(tet.r(this.p, 2));
        }
        if (version >= 3) {
            int size2 = this.q.size();
            for (int i2 = 0; i2 < size2; i2++) {
                byteArrayOutputStream.write(tet.p(Float.floatToIntBits(this.q.get(i2).floatValue())));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }
}
