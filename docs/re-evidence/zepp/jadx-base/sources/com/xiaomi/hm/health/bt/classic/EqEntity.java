package com.xiaomi.hm.health.bt.classic;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J-\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R2\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/classic/EqEntity;", "", "", "toString", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/classic/EqUnit;", "Lkotlin/collections/ArrayList;", "component1", "", "component2", "eqUnits", "type", "copy", "", "hashCode", "other", "", "equals", "a", "Ljava/util/ArrayList;", "getEqUnits", "()Ljava/util/ArrayList;", "setEqUnits", "(Ljava/util/ArrayList;)V", "b", "B", "getType", "()B", "setType", "(B)V", "<init>", "(Ljava/util/ArrayList;B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class EqEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private ArrayList<EqUnit> eqUnits;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private byte type;

    public EqEntity(@NotNull ArrayList<EqUnit> arrayList, byte b) {
        this.eqUnits = arrayList;
        this.type = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EqEntity copy$default(EqEntity eqEntity, ArrayList arrayList, byte b, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = eqEntity.eqUnits;
        }
        if ((i & 2) != 0) {
            b = eqEntity.type;
        }
        return eqEntity.copy(arrayList, b);
    }

    @NotNull
    public final ArrayList<EqUnit> component1() {
        return this.eqUnits;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getType() {
        return this.type;
    }

    @NotNull
    public final EqEntity copy(@NotNull ArrayList<EqUnit> eqUnits, byte type) {
        return new EqEntity(eqUnits, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EqEntity)) {
            return false;
        }
        EqEntity eqEntity = (EqEntity) other;
        return Intrinsics.areEqual(this.eqUnits, eqEntity.eqUnits) && this.type == eqEntity.type;
    }

    @NotNull
    public final ArrayList<EqUnit> getEqUnits() {
        return this.eqUnits;
    }

    public final byte getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.eqUnits.hashCode() * 31) + this.type;
    }

    public final void setEqUnits(@NotNull ArrayList<EqUnit> arrayList) {
        this.eqUnits = arrayList;
    }

    public final void setType(byte b) {
        this.type = b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("eqUnits: \n");
        Iterator<T> it2 = this.eqUnits.iterator();
        while (it2.hasNext()) {
            sb.append(((EqUnit) it2.next()).toString());
            sb.append(", \n");
        }
        sb.append(Intrinsics.stringPlus("type: ", Byte.valueOf(this.type)));
        return sb.toString();
    }
}
