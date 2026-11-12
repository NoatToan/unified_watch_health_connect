package com.huami.http.bean;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/huami/http/bean/Data;", "", "", "component1", "component2", "component3", "component4", "code", Configs.Params.MUTIME, "mutimeLong", "mutimelong", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "b", "getMutime", "c", "getMutimeLong", GoogleApiAvailabilityLight.a, "getMutimelong", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Data {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String mutime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(Configs.Params.MUTIME_LONG)
    @NotNull
    private final String mutimeLong;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String mutimelong;

    public Data(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.code = str;
        this.mutime = str2;
        this.mutimeLong = str3;
        this.mutimelong = str4;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = data.code;
        }
        if ((i & 2) != 0) {
            str2 = data.mutime;
        }
        if ((i & 4) != 0) {
            str3 = data.mutimeLong;
        }
        if ((i & 8) != 0) {
            str4 = data.mutimelong;
        }
        return data.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMutime() {
        return this.mutime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMutimeLong() {
        return this.mutimeLong;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMutimelong() {
        return this.mutimelong;
    }

    @NotNull
    public final Data copy(@NotNull String code, @NotNull String mutime, @NotNull String mutimeLong, @NotNull String mutimelong) {
        return new Data(code, mutime, mutimeLong, mutimelong);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.code, data.code) && Intrinsics.areEqual(this.mutime, data.mutime) && Intrinsics.areEqual(this.mutimeLong, data.mutimeLong) && Intrinsics.areEqual(this.mutimelong, data.mutimelong);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getMutime() {
        return this.mutime;
    }

    @NotNull
    public final String getMutimeLong() {
        return this.mutimeLong;
    }

    @NotNull
    public final String getMutimelong() {
        return this.mutimelong;
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + this.mutime.hashCode()) * 31) + this.mutimeLong.hashCode()) * 31) + this.mutimelong.hashCode();
    }

    @NotNull
    public String toString() {
        return "Data(code=" + this.code + ", mutime=" + this.mutime + ", mutimeLong=" + this.mutimeLong + ", mutimelong=" + this.mutimelong + ")";
    }
}
