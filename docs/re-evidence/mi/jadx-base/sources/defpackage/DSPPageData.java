package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: u5, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\f\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lu5;", "", "other", "", "equals", "", "hashCode", "", "toString", "", PluginDeviceInfo.FMODEL, "()[B", "byteArray", "", "pageId", "pageData", "<init>", "(B[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class DSPPageData {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final byte pageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final byte[] pageData;

    /* JADX INFO: renamed from: u5$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lu5$a;", "", "", "pageDataByteStep", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DSPPageData(byte b2, @NotNull byte[] pageData) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        this.pageId = b2;
        this.pageData = pageData;
    }

    @NotNull
    public final byte[] a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Byte.valueOf(this.pageId));
        arrayList.addAll(ArraysKt___ArraysKt.toList(this.pageData));
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DSPPageData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.hearing.entity.v2.DSPPageData");
        DSPPageData dSPPageData = (DSPPageData) other;
        return this.pageId == dSPPageData.pageId && Arrays.equals(this.pageData, dSPPageData.pageData) && Arrays.equals(a(), dSPPageData.a());
    }

    public int hashCode() {
        return (this.pageId * 31) + Arrays.hashCode(this.pageData);
    }

    @NotNull
    public String toString() {
        return "DSPPageData(pageId=" + ((int) this.pageId) + ", pageData=" + Arrays.toString(this.pageData) + ')';
    }
}
