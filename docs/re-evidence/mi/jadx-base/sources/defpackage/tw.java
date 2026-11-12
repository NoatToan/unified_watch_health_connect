package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000e\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\rj\b\u0012\u0004\u0012\u00020\u0004`\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Ltw;", "", "", "toString", "", "hashCode", "other", "", "equals", "frequencyListSize", "I", PluginDeviceInfo.FDESC, "()I", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "frequencyList", "Ljava/util/ArrayList;", PluginDeviceInfo.FMODEL, "()Ljava/util/ArrayList;", "wdrcValues", PluginDeviceInfo.FICONON, "position", "<init>", "(IILjava/util/ArrayList;Ljava/util/ArrayList;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class tw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final int frequencyListSize;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final ArrayList<Integer> frequencyList;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final ArrayList<Integer> valueList;

    public tw(int i, int i2, @NotNull ArrayList<Integer> frequencyList, @NotNull ArrayList<Integer> wdrcValues) {
        Intrinsics.checkNotNullParameter(frequencyList, "frequencyList");
        Intrinsics.checkNotNullParameter(wdrcValues, "wdrcValues");
        this.f35116a = i;
        this.frequencyListSize = i2;
        this.frequencyList = frequencyList;
        this.valueList = wdrcValues;
    }

    @NotNull
    public final ArrayList<Integer> a() {
        return this.frequencyList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFrequencyListSize() {
        return this.frequencyListSize;
    }

    @NotNull
    public final ArrayList<Integer> c() {
        return this.valueList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tw)) {
            return false;
        }
        tw twVar = (tw) other;
        return this.f35116a == twVar.f35116a && this.frequencyListSize == twVar.frequencyListSize && Intrinsics.areEqual(this.frequencyList, twVar.frequencyList) && Intrinsics.areEqual(this.valueList, twVar.valueList);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f35116a) * 31) + Integer.hashCode(this.frequencyListSize)) * 31) + this.frequencyList.hashCode()) * 31) + this.valueList.hashCode();
    }

    @NotNull
    public String toString() {
        return "WDRCParam{position=" + this.f35116a + ", frequencyListSize=" + this.frequencyListSize + ", frequencyList=" + this.frequencyList + ", valueList=" + this.valueList + AbstractJsonLexerKt.END_OBJ;
    }
}
