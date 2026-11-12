package com.mi.command.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/mi/command/data/SleepEvaluateReminder;", "Landroid/os/Parcelable;", "researchId", "", "remindTimes", "", "Lcom/mi/command/data/Time;", "<init>", "(ILjava/util/List;)V", "getResearchId", "()I", "getRemindTimes", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepEvaluateReminder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SleepEvaluateReminder> CREATOR = new Creator();

    @NotNull
    private final List<Time> remindTimes;
    private final int researchId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SleepEvaluateReminder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SleepEvaluateReminder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(Time.CREATOR.createFromParcel(parcel));
            }
            return new SleepEvaluateReminder(i, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SleepEvaluateReminder[] newArray(int i) {
            return new SleepEvaluateReminder[i];
        }
    }

    public SleepEvaluateReminder(int i, @NotNull List<Time> remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        this.researchId = i;
        this.remindTimes = remindTimes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepEvaluateReminder copy$default(SleepEvaluateReminder sleepEvaluateReminder, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sleepEvaluateReminder.researchId;
        }
        if ((i2 & 2) != 0) {
            list = sleepEvaluateReminder.remindTimes;
        }
        return sleepEvaluateReminder.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResearchId() {
        return this.researchId;
    }

    @NotNull
    public final List<Time> component2() {
        return this.remindTimes;
    }

    @NotNull
    public final SleepEvaluateReminder copy(int researchId, @NotNull List<Time> remindTimes) {
        Intrinsics.checkNotNullParameter(remindTimes, "remindTimes");
        return new SleepEvaluateReminder(researchId, remindTimes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepEvaluateReminder)) {
            return false;
        }
        SleepEvaluateReminder sleepEvaluateReminder = (SleepEvaluateReminder) other;
        return this.researchId == sleepEvaluateReminder.researchId && Intrinsics.areEqual(this.remindTimes, sleepEvaluateReminder.remindTimes);
    }

    @NotNull
    public final List<Time> getRemindTimes() {
        return this.remindTimes;
    }

    public final int getResearchId() {
        return this.researchId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.researchId) * 31) + this.remindTimes.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepEvaluateReminder(researchId=" + this.researchId + ", remindTimes=" + this.remindTimes + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.researchId);
        List<Time> list = this.remindTimes;
        dest.writeInt(list.size());
        Iterator<Time> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
