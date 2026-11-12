package com.xiaomi.fitness.training_plan_export.utils;

import android.annotation.SuppressLint;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.fki;
import defpackage.joi;
import defpackage.m1j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/UIDataUtils;", "", "<init>", "()V", "getTypeListRes", "Lcom/xiaomi/fitness/training_plan_export/utils/UIDataUtils$ListTypeRes;", "type", "", "getTypeEntryRes", "Lcom/xiaomi/fitness/training_plan_export/utils/UIDataUtils$EntryTypeRes;", "isIntFloat", "", RealNameWebViewActivity.NUMBER, "", "calcFloatNumber", "", "EntryTypeRes", "ListTypeRes", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UIDataUtils {

    @NotNull
    public static final UIDataUtils INSTANCE = new UIDataUtils();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/UIDataUtils$EntryTypeRes;", "", "nameRes", "", "tipRes", "bgRes", "color", "<init>", "(IIII)V", "getNameRes", "()I", "getTipRes", "getBgRes", "getColor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EntryTypeRes {
        private final int bgRes;
        private final int color;
        private final int nameRes;
        private final int tipRes;

        public EntryTypeRes(int i, int i2, int i3, int i4) {
            this.nameRes = i;
            this.tipRes = i2;
            this.bgRes = i3;
            this.color = i4;
        }

        public static /* synthetic */ EntryTypeRes copy$default(EntryTypeRes entryTypeRes, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = entryTypeRes.nameRes;
            }
            if ((i5 & 2) != 0) {
                i2 = entryTypeRes.tipRes;
            }
            if ((i5 & 4) != 0) {
                i3 = entryTypeRes.bgRes;
            }
            if ((i5 & 8) != 0) {
                i4 = entryTypeRes.color;
            }
            return entryTypeRes.copy(i, i2, i3, i4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getNameRes() {
            return this.nameRes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTipRes() {
            return this.tipRes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBgRes() {
            return this.bgRes;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final EntryTypeRes copy(int nameRes, int tipRes, int bgRes, int color) {
            return new EntryTypeRes(nameRes, tipRes, bgRes, color);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntryTypeRes)) {
                return false;
            }
            EntryTypeRes entryTypeRes = (EntryTypeRes) other;
            return this.nameRes == entryTypeRes.nameRes && this.tipRes == entryTypeRes.tipRes && this.bgRes == entryTypeRes.bgRes && this.color == entryTypeRes.color;
        }

        public final int getBgRes() {
            return this.bgRes;
        }

        public final int getColor() {
            return this.color;
        }

        public final int getNameRes() {
            return this.nameRes;
        }

        public final int getTipRes() {
            return this.tipRes;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.nameRes) * 31) + Integer.hashCode(this.tipRes)) * 31) + Integer.hashCode(this.bgRes)) * 31) + Integer.hashCode(this.color);
        }

        @NotNull
        public String toString() {
            return "EntryTypeRes(nameRes=" + this.nameRes + ", tipRes=" + this.tipRes + ", bgRes=" + this.bgRes + ", color=" + this.color + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/utils/UIDataUtils$ListTypeRes;", "", "nameRes", "", "tipRes", "bgRes", "userIconRes", "color", "<init>", "(IIIII)V", "getNameRes", "()I", "getTipRes", "getBgRes", "getUserIconRes", "getColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ListTypeRes {
        private final int bgRes;
        private final int color;
        private final int nameRes;
        private final int tipRes;
        private final int userIconRes;

        public ListTypeRes(int i, int i2, int i3, int i4, int i5) {
            this.nameRes = i;
            this.tipRes = i2;
            this.bgRes = i3;
            this.userIconRes = i4;
            this.color = i5;
        }

        public static /* synthetic */ ListTypeRes copy$default(ListTypeRes listTypeRes, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = listTypeRes.nameRes;
            }
            if ((i6 & 2) != 0) {
                i2 = listTypeRes.tipRes;
            }
            int i7 = i2;
            if ((i6 & 4) != 0) {
                i3 = listTypeRes.bgRes;
            }
            int i8 = i3;
            if ((i6 & 8) != 0) {
                i4 = listTypeRes.userIconRes;
            }
            int i9 = i4;
            if ((i6 & 16) != 0) {
                i5 = listTypeRes.color;
            }
            return listTypeRes.copy(i, i7, i8, i9, i5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getNameRes() {
            return this.nameRes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTipRes() {
            return this.tipRes;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBgRes() {
            return this.bgRes;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getUserIconRes() {
            return this.userIconRes;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final ListTypeRes copy(int nameRes, int tipRes, int bgRes, int userIconRes, int color) {
            return new ListTypeRes(nameRes, tipRes, bgRes, userIconRes, color);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListTypeRes)) {
                return false;
            }
            ListTypeRes listTypeRes = (ListTypeRes) other;
            return this.nameRes == listTypeRes.nameRes && this.tipRes == listTypeRes.tipRes && this.bgRes == listTypeRes.bgRes && this.userIconRes == listTypeRes.userIconRes && this.color == listTypeRes.color;
        }

        public final int getBgRes() {
            return this.bgRes;
        }

        public final int getColor() {
            return this.color;
        }

        public final int getNameRes() {
            return this.nameRes;
        }

        public final int getTipRes() {
            return this.tipRes;
        }

        public final int getUserIconRes() {
            return this.userIconRes;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.nameRes) * 31) + Integer.hashCode(this.tipRes)) * 31) + Integer.hashCode(this.bgRes)) * 31) + Integer.hashCode(this.userIconRes)) * 31) + Integer.hashCode(this.color);
        }

        @NotNull
        public String toString() {
            return "ListTypeRes(nameRes=" + this.nameRes + ", tipRes=" + this.tipRes + ", bgRes=" + this.bgRes + ", userIconRes=" + this.userIconRes + ", color=" + this.color + ")";
        }
    }

    private UIDataUtils() {
    }

    @SuppressLint({"DefaultLocale"})
    @NotNull
    public final String calcFloatNumber(float number) {
        if (isIntFloat(number)) {
            return String.valueOf((int) number);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(number)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Nullable
    public final EntryTypeRes getTypeEntryRes(int type) {
        if (type == 1) {
            return new EntryTypeRes(m1j.p, m1j.m, joi.f22980k, fki.f17877b);
        }
        if (type != 2) {
            return null;
        }
        return new EntryTypeRes(m1j.e, m1j.c, joi.f22979b, fki.c);
    }

    @Nullable
    public final ListTypeRes getTypeListRes(int type) {
        if (type == 1) {
            return new ListTypeRes(m1j.p, m1j.f25651r, joi.o, joi.p, fki.f17877b);
        }
        if (type != 2) {
            return null;
        }
        return new ListTypeRes(m1j.e, m1j.f25650k, joi.g, joi.h, fki.c);
    }

    public final boolean isIntFloat(float number) {
        return ((double) Math.abs(number - ((float) ((int) number)))) < 0.1d;
    }
}
