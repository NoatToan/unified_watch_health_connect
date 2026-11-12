package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yj, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u000e\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u000e\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0013\u0010\u0015¨\u0006\u001a"}, d2 = {"Lyj;", "", "", PluginDeviceInfo.FICONOFF, "", "toString", "", "hashCode", "other", "equals", "", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "languageList", "Ljava/util/List;", PluginDeviceInfo.FMODEL, "()Ljava/util/List;", "(Ljava/util/List;)V", "isContainLanguageFeature", "Z", PluginDeviceInfo.FDESC, "()Z", "(Z)V", "isContainLanguageGroup", PluginDeviceInfo.FICONON, "<init>", "(Ljava/util/List;ZZ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class LanguageComBination {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public List<HMLanguage> languageList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public boolean isContainLanguageFeature;

    /* JADX INFO: renamed from: c, reason: from toString */
    public boolean isContainLanguageGroup;

    public LanguageComBination() {
        this(null, false, false, 7, null);
    }

    @NotNull
    public final List<HMLanguage> a() {
        return this.languageList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsContainLanguageFeature() {
        return this.isContainLanguageFeature;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsContainLanguageGroup() {
        return this.isContainLanguageGroup;
    }

    public final boolean d() {
        return this.isContainLanguageFeature || this.isContainLanguageGroup;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageComBination)) {
            return false;
        }
        LanguageComBination languageComBination = (LanguageComBination) other;
        return Intrinsics.areEqual(this.languageList, languageComBination.languageList) && this.isContainLanguageFeature == languageComBination.isContainLanguageFeature && this.isContainLanguageGroup == languageComBination.isContainLanguageGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.languageList.hashCode() * 31;
        boolean z = this.isContainLanguageFeature;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isContainLanguageGroup;
        return i + (z2 ? 1 : z2);
    }

    @NotNull
    public String toString() {
        return "LanguageComBination(languageList=" + this.languageList + ", isContainLanguageFeature=" + this.isContainLanguageFeature + ", isContainLanguageGroup=" + this.isContainLanguageGroup + ')';
    }

    public LanguageComBination(@NotNull List<HMLanguage> languageList, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(languageList, "languageList");
        this.languageList = languageList;
        this.isContainLanguageFeature = z;
        this.isContainLanguageGroup = z2;
    }

    public final void a(@NotNull List<HMLanguage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.languageList = list;
    }

    public final void b(boolean z) {
        this.isContainLanguageGroup = z;
    }

    public final void a(boolean z) {
        this.isContainLanguageFeature = z;
    }

    public /* synthetic */ LanguageComBination(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
