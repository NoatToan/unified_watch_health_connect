package com.huami.treadmill.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.HMIntentHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/treadmill/data/StringGenderTuple;", "", "", "component1", "component2", "male", HMIntentHandler.NAME_FEMALE, "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getMale", "()Ljava/lang/String;", "setMale", "(Ljava/lang/String;)V", "getFemale", "setFemale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StringGenderTuple {

    @SerializedName(HMIntentHandler.NAME_FEMALE)
    @Nullable
    private String female;

    @SerializedName("male")
    @Nullable
    private String male;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public StringGenderTuple() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public StringGenderTuple(@Nullable String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public StringGenderTuple(@Nullable String str, @Nullable String str2) {
        this.male = str;
        this.female = str2;
    }

    public static /* synthetic */ StringGenderTuple copy$default(StringGenderTuple stringGenderTuple, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringGenderTuple.male;
        }
        if ((i & 2) != 0) {
            str2 = stringGenderTuple.female;
        }
        return stringGenderTuple.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMale() {
        return this.male;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFemale() {
        return this.female;
    }

    @NotNull
    public final StringGenderTuple copy(@Nullable String male, @Nullable String female) {
        return new StringGenderTuple(male, female);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StringGenderTuple)) {
            return false;
        }
        StringGenderTuple stringGenderTuple = (StringGenderTuple) other;
        return Intrinsics.areEqual(this.male, stringGenderTuple.male) && Intrinsics.areEqual(this.female, stringGenderTuple.female);
    }

    @Nullable
    public final String getFemale() {
        return this.female;
    }

    @Nullable
    public final String getMale() {
        return this.male;
    }

    public int hashCode() {
        String str = this.male;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.female;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setFemale(@Nullable String str) {
        this.female = str;
    }

    public final void setMale(@Nullable String str) {
        this.male = str;
    }

    @NotNull
    public String toString() {
        return "StringGenderTuple(male=" + ((Object) this.male) + ", female=" + ((Object) this.female) + ')';
    }

    public /* synthetic */ StringGenderTuple(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
