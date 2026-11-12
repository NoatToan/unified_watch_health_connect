package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kj, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lkj;", "", "", "toString", "Ljj;", "imageCodec", "", "widthInPixel", "heightInPixel", "bitDepth", "<init>", "(Ljj;III)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ImageFormat {

    @NotNull
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final jj imageCodec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int widthInPixel;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int heightInPixel;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int bitDepth;

    /* JADX INFO: renamed from: kj$a */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lkj$a;", "", "", "data", "Lkj;", PluginDeviceInfo.FMODEL, "", "DATA_SIZE", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ImageFormat a(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new ImageFormat(jj.u.a(data[0] & 255), dl.a(data[1], data[2]), dl.a(data[3], data[4]), data[5] & 255);
        }
    }

    public ImageFormat(@NotNull jj imageCodec, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(imageCodec, "imageCodec");
        this.imageCodec = imageCodec;
        this.widthInPixel = i;
        this.heightInPixel = i2;
        this.bitDepth = i3;
    }

    @NotNull
    public String toString() {
        return "ImageFormat(imageCodec=" + this.imageCodec + ", widthInPixel=" + this.widthInPixel + ", heightInPixel=" + this.heightInPixel + ", bitDepth=" + this.bitDepth + ')';
    }
}
