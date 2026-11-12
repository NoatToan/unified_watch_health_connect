package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mq, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lmq;", "", "", "toString", "", "sessionId", "Lbl;", "source", "Ljava/util/ArrayList;", "Lmq$b;", "Lkotlin/collections/ArrayList;", "imageParameters", "<init>", "(ILbl;Ljava/util/ArrayList;)V", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class RequestImage {

    @NotNull
    public static final a d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final bl source;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final ArrayList<ImageParameter> imageParameters;

    /* JADX INFO: renamed from: mq$a */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lmq$a;", "", "", "data", "Lmq;", PluginDeviceInfo.FMODEL, "", "REQUEST_IMAGE", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RequestImage a(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            byte b2 = data[0];
            int i = data[1] & 255;
            bl blVarA = bl.u.a(dl.a(data[2], data[3]));
            short s = data[4];
            ArrayList arrayList = new ArrayList();
            int i2 = 5;
            int i3 = 0;
            while (i3 < s) {
                int iA = dl.a(data, i2);
                String strA = dl.a(data, i2, iA);
                int i4 = iA + 1;
                int iA2 = dl.a(data, i4);
                arrayList.add(new ImageParameter(strA, dl.a(data, i4, iA2), ImageFormat.e.a(ArraysKt___ArraysJvmKt.copyInto(data, new byte[6], 0, iA2 + 1, iA2 + 7))));
                i3++;
                i2 = iA2 + 8;
            }
            return new RequestImage(i, blVarA, arrayList);
        }
    }

    /* JADX INFO: renamed from: mq$b, reason: from toString */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, d2 = {"Lmq$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "url", "destination", "Lkj;", "format", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkj;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ImageParameter {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        @NotNull
        public final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
        @NotNull
        public final String destination;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final ImageFormat format;

        public ImageParameter(@NotNull String url, @NotNull String destination, @NotNull ImageFormat format) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(format, "format");
            this.url = url;
            this.destination = destination;
            this.format = format;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageParameter)) {
                return false;
            }
            ImageParameter imageParameter = (ImageParameter) other;
            return Intrinsics.areEqual(this.url, imageParameter.url) && Intrinsics.areEqual(this.destination, imageParameter.destination) && Intrinsics.areEqual(this.format, imageParameter.format);
        }

        public int hashCode() {
            return (((this.url.hashCode() * 31) + this.destination.hashCode()) * 31) + this.format.hashCode();
        }

        @NotNull
        public String toString() {
            return "ImageParameter(url=" + this.url + ", destination=" + this.destination + ", format=" + this.format + ')';
        }
    }

    public RequestImage(int i, @NotNull bl source, @NotNull ArrayList<ImageParameter> imageParameters) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(imageParameters, "imageParameters");
        this.sessionId = i;
        this.source = source;
        this.imageParameters = imageParameters;
    }

    @NotNull
    public String toString() {
        return "RequestImage(sessionId=" + this.sessionId + ", source=" + this.source + ", imageParameters=" + this.imageParameters + ')';
    }
}
