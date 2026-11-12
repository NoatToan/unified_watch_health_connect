package com.huami.pai.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.db.DayDateConverter;
import com.loc.z;
import com.xiaomi.hm.health.Constant;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@TypeConverters({DayDateConverter.class})
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0004¢\u0006\u0004\bU\u0010VJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J·\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u0004HÆ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001J\u0013\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0018\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0019\u0010\u0019\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u0019\u0010\u001a\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R\u0019\u0010\u001b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00104R\u0019\u0010\u001c\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u0019\u0010\u001d\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u00104R\u0019\u0010\u001e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u00104R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010 \u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u0010FR\u0019\u0010!\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u00104R\u0019\u0010\"\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bL\u00104R\u0019\u0010#\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bM\u00102\u001a\u0004\bN\u00104R\u0019\u0010$\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bO\u00102\u001a\u0004\bP\u00104R\u0019\u0010%\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bQ\u00102\u001a\u0004\bR\u00104R\u0019\u0010&\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bS\u00102\u001a\u0004\bT\u00104¨\u0006W"}, d2 = {"Lcom/huami/pai/db/po/Pai;", "", "Ljava/util/Date;", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "date", Constant.PAI_KEY_LOW_ZONE_PAI, Constant.PAI_KEY_MEDIUM_ZONE_PAI, Constant.PAI_KEY_HIGH_ZONE_PAI, Constant.PAI_KEY_LOW_ZONE_MINUTES, Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, Constant.PAI_KEY_HIGH_ZONE_MINUTES, Constant.PAI_KEY_DAILY_PAI, "tp", Constant.PAI_KEY_ACTIVITY_SCORES, "nas", Constant.PAI_KEY_MAX_HR, "rhr", "gender", "hrLowLimit", "hrMediumLimit", "hrHighLimit", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "b", LogUtil.I, "getLp", "()I", "c", "getMp", GoogleApiAvailabilityLight.a, "getHp", "e", "getLm", "f", "getMm", "g", "getHm", "h", "getDp", "i", "getTp", z.j, "Ljava/lang/String;", "getAs", "()Ljava/lang/String;", hl.k, "getNas", "l", "getMaxHr", "m", "getRhr", GoogleApiAvailabilityLight.b, "getGender", "o", "getHrLowLimit", b.r, "getHrMediumLimit", DTransferConstants.SEARCH_KEY, "getHrHighLimit", "<init>", "(Ljava/util/Date;IIIIIIIILjava/lang/String;Ljava/lang/String;IIIIII)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Pai {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private final Date date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int lp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int mp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int hp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int lm;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int mm;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int hm;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int dp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int tp;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String as;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String nas;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final int maxHr;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final int rhr;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private final int gender;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private final int hrLowLimit;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private final int hrMediumLimit;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    private final int hrHighLimit;

    public Pai(@NotNull Date date, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @Nullable String str, @Nullable String str2, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.date = date;
        this.lp = i;
        this.mp = i2;
        this.hp = i3;
        this.lm = i4;
        this.mm = i5;
        this.hm = i6;
        this.dp = i7;
        this.tp = i8;
        this.as = str;
        this.nas = str2;
        this.maxHr = i9;
        this.rhr = i10;
        this.gender = i11;
        this.hrLowLimit = i12;
        this.hrMediumLimit = i13;
        this.hrHighLimit = i14;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAs() {
        return this.as;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNas() {
        return this.nas;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMaxHr() {
        return this.maxHr;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getRhr() {
        return this.rhr;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getHrLowLimit() {
        return this.hrLowLimit;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getHrMediumLimit() {
        return this.hrMediumLimit;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getHrHighLimit() {
        return this.hrHighLimit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLp() {
        return this.lp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMp() {
        return this.mp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHp() {
        return this.hp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLm() {
        return this.lm;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMm() {
        return this.mm;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHm() {
        return this.hm;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDp() {
        return this.dp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getTp() {
        return this.tp;
    }

    @NotNull
    public final Pai copy(@NotNull Date date, int lp, int mp, int hp, int lm, int mm, int hm, int dp, int tp, @Nullable String as, @Nullable String nas, int maxHr, int rhr, int gender, int hrLowLimit, int hrMediumLimit, int hrHighLimit) {
        return new Pai(date, lp, mp, hp, lm, mm, hm, dp, tp, as, nas, maxHr, rhr, gender, hrLowLimit, hrMediumLimit, hrHighLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pai)) {
            return false;
        }
        Pai pai = (Pai) other;
        return Intrinsics.areEqual(this.date, pai.date) && this.lp == pai.lp && this.mp == pai.mp && this.hp == pai.hp && this.lm == pai.lm && this.mm == pai.mm && this.hm == pai.hm && this.dp == pai.dp && this.tp == pai.tp && Intrinsics.areEqual(this.as, pai.as) && Intrinsics.areEqual(this.nas, pai.nas) && this.maxHr == pai.maxHr && this.rhr == pai.rhr && this.gender == pai.gender && this.hrLowLimit == pai.hrLowLimit && this.hrMediumLimit == pai.hrMediumLimit && this.hrHighLimit == pai.hrHighLimit;
    }

    @Nullable
    public final String getAs() {
        return this.as;
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    public final int getDp() {
        return this.dp;
    }

    public final int getGender() {
        return this.gender;
    }

    public final int getHm() {
        return this.hm;
    }

    public final int getHp() {
        return this.hp;
    }

    public final int getHrHighLimit() {
        return this.hrHighLimit;
    }

    public final int getHrLowLimit() {
        return this.hrLowLimit;
    }

    public final int getHrMediumLimit() {
        return this.hrMediumLimit;
    }

    public final int getLm() {
        return this.lm;
    }

    public final int getLp() {
        return this.lp;
    }

    public final int getMaxHr() {
        return this.maxHr;
    }

    public final int getMm() {
        return this.mm;
    }

    public final int getMp() {
        return this.mp;
    }

    @Nullable
    public final String getNas() {
        return this.nas;
    }

    public final int getRhr() {
        return this.rhr;
    }

    public final int getTp() {
        return this.tp;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.date.hashCode() * 31) + this.lp) * 31) + this.mp) * 31) + this.hp) * 31) + this.lm) * 31) + this.mm) * 31) + this.hm) * 31) + this.dp) * 31) + this.tp) * 31;
        String str = this.as;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nas;
        return ((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.maxHr) * 31) + this.rhr) * 31) + this.gender) * 31) + this.hrLowLimit) * 31) + this.hrMediumLimit) * 31) + this.hrHighLimit;
    }

    @NotNull
    public String toString() {
        return "Pai(date=" + this.date + ", lp=" + this.lp + ", mp=" + this.mp + ", hp=" + this.hp + ", lm=" + this.lm + ", mm=" + this.mm + ", hm=" + this.hm + ", dp=" + this.dp + ", tp=" + this.tp + ", as=" + this.as + ", nas=" + this.nas + ", maxHr=" + this.maxHr + ", rhr=" + this.rhr + ", gender=" + this.gender + ", hrLowLimit=" + this.hrLowLimit + ", hrMediumLimit=" + this.hrMediumLimit + ", hrHighLimit=" + this.hrHighLimit + ")";
    }

    public /* synthetic */ Pai(Date date, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, int i9, int i10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, (i15 & 2) != 0 ? 0 : i, (i15 & 4) != 0 ? 0 : i2, (i15 & 8) != 0 ? 0 : i3, (i15 & 16) != 0 ? 0 : i4, (i15 & 32) != 0 ? 0 : i5, (i15 & 64) != 0 ? 0 : i6, (i15 & 128) != 0 ? 0 : i7, (i15 & 256) != 0 ? 0 : i8, (i15 & 512) != 0 ? null : str, (i15 & 1024) == 0 ? str2 : null, (i15 & 2048) != 0 ? 0 : i9, (i15 & 4096) != 0 ? 0 : i10, (i15 & 8192) != 0 ? 0 : i11, (i15 & 16384) != 0 ? 0 : i12, (i15 & 32768) != 0 ? 0 : i13, (i15 & 65536) == 0 ? i14 : 0);
    }
}
