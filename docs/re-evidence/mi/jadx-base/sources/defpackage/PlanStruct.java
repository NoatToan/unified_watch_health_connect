package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fp, reason: from toString */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\f\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lfp;", "", "", "toString", "", "hashCode", "other", "", "equals", "", PluginDeviceInfo.FMODEL, "()[B", "byteArray", "", "uiTime", "", "version", "itemCn", "", "Lep;", "sleepPlanItem", "allDaysInPlan", "<init>", "(JSSLjava/util/List;Ljava/lang/Short;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class PlanStruct {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final long uiTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final short version;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final short itemCn;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final List<PlanItem> sleepPlanItem;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public Short allDaysInPlan;

    public PlanStruct(long j, short s, short s2, @NotNull List<PlanItem> sleepPlanItem, @Nullable Short sh) {
        Intrinsics.checkNotNullParameter(sleepPlanItem, "sleepPlanItem");
        this.uiTime = j;
        this.version = s;
        this.itemCn = s2;
        this.sleepPlanItem = sleepPlanItem;
        this.allDaysInPlan = sh;
    }

    @NotNull
    public final byte[] a() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(c3.a(this.itemCn, 1));
        byteArrayOutputStream.write(tet.r(this.uiTime, 4));
        Iterator<T> it = this.sleepPlanItem.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(((PlanItem) it.next()).a());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanStruct)) {
            return false;
        }
        PlanStruct planStruct = (PlanStruct) other;
        return this.uiTime == planStruct.uiTime && this.version == planStruct.version && this.itemCn == planStruct.itemCn && Intrinsics.areEqual(this.sleepPlanItem, planStruct.sleepPlanItem) && Intrinsics.areEqual(this.allDaysInPlan, planStruct.allDaysInPlan);
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.uiTime) * 31) + Short.hashCode(this.version)) * 31) + Short.hashCode(this.itemCn)) * 31) + this.sleepPlanItem.hashCode()) * 31;
        Short sh = this.allDaysInPlan;
        return iHashCode + (sh == null ? 0 : sh.hashCode());
    }

    @NotNull
    public String toString() {
        return "PlanStruct(uiTime=" + this.uiTime + ", version=" + ((int) this.version) + ", itemCn=" + ((int) this.itemCn) + ", sleepPlanItem=" + this.sleepPlanItem + ", allDaysInPlan=" + this.allDaysInPlan + ')';
    }
}
