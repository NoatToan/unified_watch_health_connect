package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.OneTrack;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hr, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\f\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lhr;", "", "other", "", "equals", "", "hashCode", "", "toString", "", PluginDeviceInfo.FMODEL, "()[B", "byteArray", "", OneTrack.Event.FAVORITE, "", "mode", "<init>", "(Ljava/lang/Short;[S)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class Scenes {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @Nullable
    public final Short favorite;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @Nullable
    public final short[] mode;

    /* JADX INFO: renamed from: hr$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lhr$a;", "", "Ljava/nio/ByteBuffer;", "byteBuffer", "Lhr;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Scenes a(@NotNull ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            byte b2 = byteBuffer.get();
            boolean z = (b2 & 1) != 0;
            boolean z2 = (b2 & 2) != 0;
            short[] sArr = null;
            Short shValueOf = z ? Short.valueOf((short) (byteBuffer.get() & 255)) : null;
            if (z2) {
                int i = byteBuffer.get();
                short[] sArr2 = new short[i];
                for (int i2 = 0; i2 < i; i2++) {
                    sArr2[i2] = (short) (byteBuffer.get() & 255);
                }
                sArr = sArr2;
            }
            return new Scenes(shValueOf, sArr);
        }
    }

    public Scenes(@Nullable Short sh, @Nullable short[] sArr) {
        this.favorite = sh;
        this.mode = sArr;
    }

    @NotNull
    public final byte[] a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf((byte) (((this.favorite != null ? 1 : 0) | (this.mode != null ? 2 : 0)) & 255)));
        Short sh = this.favorite;
        if (sh != null) {
            arrayList.add(Byte.valueOf((byte) (sh.shortValue() & 255)));
        }
        short[] sArr = this.mode;
        if (sArr != null) {
            arrayList.add(Byte.valueOf((byte) (sArr.length & 255)));
            ArrayList arrayList2 = new ArrayList(sArr.length);
            for (short s : sArr) {
                arrayList2.add(Byte.valueOf((byte) (s & 255)));
            }
            arrayList.addAll(CollectionsKt___CollectionsKt.toList(arrayList2));
        }
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Scenes.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.hearing.entity.v2.Scenes");
        Scenes scenes = (Scenes) other;
        Short sh = this.favorite;
        Integer numValueOf = sh != null ? Integer.valueOf(sh.shortValue()) : null;
        Short sh2 = scenes.favorite;
        if (!Intrinsics.areEqual(numValueOf, sh2 != null ? Integer.valueOf(sh2.shortValue()) : null)) {
            return false;
        }
        short[] sArr = this.mode;
        if (sArr != null) {
            short[] sArr2 = scenes.mode;
            if (sArr2 == null || !Arrays.equals(sArr, sArr2)) {
                return false;
            }
        } else if (scenes.mode != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Short sh = this.favorite;
        int iShortValue = (sh != null ? sh.shortValue() : (short) 0) * 31;
        short[] sArr = this.mode;
        return iShortValue + (sArr != null ? Arrays.hashCode(sArr) : 0);
    }

    @NotNull
    public String toString() {
        return "Scenes(favorite=" + this.favorite + ", mode=" + Arrays.toString(this.mode) + ')';
    }
}
