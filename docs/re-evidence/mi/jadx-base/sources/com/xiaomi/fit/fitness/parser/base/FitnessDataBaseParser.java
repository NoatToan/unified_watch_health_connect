package com.xiaomi.fit.fitness.parser.base;

import androidx.health.connect.client.records.OvulationTestRecord;
import com.google.gson.Gson;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.fitness.parser.base.FitnessDataBaseParser;
import com.xiaomi.fit.fitness.parser.data.FitnessBinaryData;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001:\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser;", "", "<init>", "()V", "TAG", "", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "binaryData", "Lcom/xiaomi/fit/fitness/parser/data/FitnessBinaryData;", "OneDimenDataType", "DataValueItem", "DependDataType", "RecordDataValue", "FourDimenDataValid", "FourDimenDataInfo", "DynamicValidDataType", "DataItemLen", "FourDimenType", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FitnessDataBaseParser {

    @NotNull
    private final String TAG = "FitnessDataBaseParser";

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: op9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessDataBaseParser.mGson_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;", "", "byteSize", "", "startBitIndex", "bitSize", "<init>", "(III)V", "(II)V", "(I)V", "getByteSize", "()I", "getStartBitIndex", "getBitSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DataItemLen {
        private final int bitSize;
        private final int byteSize;
        private final int startBitIndex;

        public DataItemLen(int i, int i2, int i3) {
            this.byteSize = i;
            this.startBitIndex = i2;
            this.bitSize = i3;
        }

        public static /* synthetic */ DataItemLen copy$default(DataItemLen dataItemLen, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = dataItemLen.byteSize;
            }
            if ((i4 & 2) != 0) {
                i2 = dataItemLen.startBitIndex;
            }
            if ((i4 & 4) != 0) {
                i3 = dataItemLen.bitSize;
            }
            return dataItemLen.copy(i, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getByteSize() {
            return this.byteSize;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStartBitIndex() {
            return this.startBitIndex;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBitSize() {
            return this.bitSize;
        }

        @NotNull
        public final DataItemLen copy(int byteSize, int startBitIndex, int bitSize) {
            return new DataItemLen(byteSize, startBitIndex, bitSize);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataItemLen)) {
                return false;
            }
            DataItemLen dataItemLen = (DataItemLen) other;
            return this.byteSize == dataItemLen.byteSize && this.startBitIndex == dataItemLen.startBitIndex && this.bitSize == dataItemLen.bitSize;
        }

        public final int getBitSize() {
            return this.bitSize;
        }

        public final int getByteSize() {
            return this.byteSize;
        }

        public final int getStartBitIndex() {
            return this.startBitIndex;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.byteSize) * 31) + Integer.hashCode(this.startBitIndex)) * 31) + Integer.hashCode(this.bitSize);
        }

        @NotNull
        public String toString() {
            return "DataItemLen(byteSize=" + this.byteSize + ", startBitIndex=" + this.startBitIndex + ", bitSize=" + this.bitSize + ")";
        }

        public DataItemLen(int i, int i2) {
            this(0, i, i2);
        }

        public DataItemLen(int i) {
            this(i, 0, 0);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;", "", "type", "", Constants.KEY_RECHARGE_VALUES, "", "<init>", "(I[Ljava/lang/Integer;)V", "getType", "()I", "getValues", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "component1", "component2", "copy", "(I[Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;", "equals", "", "other", "hashCode", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DependDataType {
        private final int type;

        @NotNull
        private final Integer[] values;

        public DependDataType(int i, @NotNull Integer[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.type = i;
            this.values = values;
        }

        public static /* synthetic */ DependDataType copy$default(DependDataType dependDataType, int i, Integer[] numArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dependDataType.type;
            }
            if ((i2 & 2) != 0) {
                numArr = dependDataType.values;
            }
            return dependDataType.copy(i, numArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer[] getValues() {
            return this.values;
        }

        @NotNull
        public final DependDataType copy(int type, @NotNull Integer[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            return new DependDataType(type, values);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DependDataType)) {
                return false;
            }
            DependDataType dependDataType = (DependDataType) other;
            return this.type == dependDataType.type && Intrinsics.areEqual(this.values, dependDataType.values);
        }

        public final int getType() {
            return this.type;
        }

        @NotNull
        public final Integer[] getValues() {
            return this.values;
        }

        public int hashCode() {
            return (Integer.hashCode(this.type) * 31) + Arrays.hashCode(this.values);
        }

        @NotNull
        public String toString() {
            return "DependDataType(type=" + this.type + ", values=" + Arrays.toString(this.values) + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DynamicValidDataType;", "", "dataType", "", "dependType", "existValue", "<init>", "(III)V", "getDataType", "()I", "getDependType", "getExistValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DynamicValidDataType {
        private final int dataType;
        private final int dependType;
        private final int existValue;

        public DynamicValidDataType(int i, int i2, int i3) {
            this.dataType = i;
            this.dependType = i2;
            this.existValue = i3;
        }

        public static /* synthetic */ DynamicValidDataType copy$default(DynamicValidDataType dynamicValidDataType, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = dynamicValidDataType.dataType;
            }
            if ((i4 & 2) != 0) {
                i2 = dynamicValidDataType.dependType;
            }
            if ((i4 & 4) != 0) {
                i3 = dynamicValidDataType.existValue;
            }
            return dynamicValidDataType.copy(i, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDataType() {
            return this.dataType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDependType() {
            return this.dependType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getExistValue() {
            return this.existValue;
        }

        @NotNull
        public final DynamicValidDataType copy(int dataType, int dependType, int existValue) {
            return new DynamicValidDataType(dataType, dependType, existValue);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DynamicValidDataType)) {
                return false;
            }
            DynamicValidDataType dynamicValidDataType = (DynamicValidDataType) other;
            return this.dataType == dynamicValidDataType.dataType && this.dependType == dynamicValidDataType.dependType && this.existValue == dynamicValidDataType.existValue;
        }

        public final int getDataType() {
            return this.dataType;
        }

        public final int getDependType() {
            return this.dependType;
        }

        public final int getExistValue() {
            return this.existValue;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.dataType) * 31) + Integer.hashCode(this.dependType)) * 31) + Integer.hashCode(this.existValue);
        }

        @NotNull
        public String toString() {
            return "DynamicValidDataType(dataType=" + this.dataType + ", dependType=" + this.dependType + ", existValue=" + this.existValue + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataValid;", "", TSMAuthContants.PARAM_EXIST, "", OvulationTestRecord.Result.HIGH, "middle", "low", "<init>", "(ZZZZ)V", "getExist", "()Z", "getHigh", "getMiddle", "getLow", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FourDimenDataValid {
        private final boolean exist;
        private final boolean high;
        private final boolean low;
        private final boolean middle;

        public FourDimenDataValid(boolean z, boolean z2, boolean z3, boolean z4) {
            this.exist = z;
            this.high = z2;
            this.middle = z3;
            this.low = z4;
        }

        public static /* synthetic */ FourDimenDataValid copy$default(FourDimenDataValid fourDimenDataValid, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = fourDimenDataValid.exist;
            }
            if ((i & 2) != 0) {
                z2 = fourDimenDataValid.high;
            }
            if ((i & 4) != 0) {
                z3 = fourDimenDataValid.middle;
            }
            if ((i & 8) != 0) {
                z4 = fourDimenDataValid.low;
            }
            return fourDimenDataValid.copy(z, z2, z3, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getExist() {
            return this.exist;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getHigh() {
            return this.high;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getMiddle() {
            return this.middle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getLow() {
            return this.low;
        }

        @NotNull
        public final FourDimenDataValid copy(boolean exist, boolean high, boolean middle, boolean low) {
            return new FourDimenDataValid(exist, high, middle, low);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FourDimenDataValid)) {
                return false;
            }
            FourDimenDataValid fourDimenDataValid = (FourDimenDataValid) other;
            return this.exist == fourDimenDataValid.exist && this.high == fourDimenDataValid.high && this.middle == fourDimenDataValid.middle && this.low == fourDimenDataValid.low;
        }

        public final boolean getExist() {
            return this.exist;
        }

        public final boolean getHigh() {
            return this.high;
        }

        public final boolean getLow() {
            return this.low;
        }

        public final boolean getMiddle() {
            return this.middle;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.exist) * 31) + Boolean.hashCode(this.high)) * 31) + Boolean.hashCode(this.middle)) * 31) + Boolean.hashCode(this.low);
        }

        @NotNull
        public String toString() {
            return "FourDimenDataValid(exist=" + this.exist + ", high=" + this.high + ", middle=" + this.middle + ", low=" + this.low + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "", OvulationTestRecord.Result.HIGH, "", "middle", "low", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "getHigh", "()I", "getMiddle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLow", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "equals", "", "other", "hashCode", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FourDimenType {
        private final int high;

        @Nullable
        private final Integer low;

        @Nullable
        private final Integer middle;

        public FourDimenType(int i, @Nullable Integer num, @Nullable Integer num2) {
            this.high = i;
            this.middle = num;
            this.low = num2;
        }

        public static /* synthetic */ FourDimenType copy$default(FourDimenType fourDimenType, int i, Integer num, Integer num2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fourDimenType.high;
            }
            if ((i2 & 2) != 0) {
                num = fourDimenType.middle;
            }
            if ((i2 & 4) != 0) {
                num2 = fourDimenType.low;
            }
            return fourDimenType.copy(i, num, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getHigh() {
            return this.high;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getMiddle() {
            return this.middle;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getLow() {
            return this.low;
        }

        @NotNull
        public final FourDimenType copy(int high, @Nullable Integer middle, @Nullable Integer low) {
            return new FourDimenType(high, middle, low);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FourDimenType)) {
                return false;
            }
            FourDimenType fourDimenType = (FourDimenType) other;
            return this.high == fourDimenType.high && Intrinsics.areEqual(this.middle, fourDimenType.middle) && Intrinsics.areEqual(this.low, fourDimenType.low);
        }

        public final int getHigh() {
            return this.high;
        }

        @Nullable
        public final Integer getLow() {
            return this.low;
        }

        @Nullable
        public final Integer getMiddle() {
            return this.middle;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.high) * 31;
            Integer num = this.middle;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.low;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FourDimenType(high=" + this.high + ", middle=" + this.middle + ", low=" + this.low + ")";
        }

        public /* synthetic */ FourDimenType(int i, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001b\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00030\u0007HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00030\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR#\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$RecordDataValue;", "", "dataValid", "", "", "", "recordList", "", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getDataValid", "()Ljava/util/Map;", "getRecordList", "()Ljava/util/List;", "gpsFeatureType", "getGpsFeatureType", "()Ljava/lang/Integer;", "setGpsFeatureType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "tgcData", "", "getTgcData", "()[B", "setTgcData", "([B)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecordDataValue {

        @NotNull
        private final Map<Integer, Boolean> dataValid;

        @Nullable
        private Integer gpsFeatureType;

        @NotNull
        private final List<Map<Integer, DataValueItem>> recordList;

        @Nullable
        private byte[] tgcData;

        /* JADX WARN: Multi-variable type inference failed */
        public RecordDataValue(@NotNull Map<Integer, Boolean> dataValid, @NotNull List<? extends Map<Integer, DataValueItem>> recordList) {
            Intrinsics.checkNotNullParameter(dataValid, "dataValid");
            Intrinsics.checkNotNullParameter(recordList, "recordList");
            this.dataValid = dataValid;
            this.recordList = recordList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RecordDataValue copy$default(RecordDataValue recordDataValue, Map map, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                map = recordDataValue.dataValid;
            }
            if ((i & 2) != 0) {
                list = recordDataValue.recordList;
            }
            return recordDataValue.copy(map, list);
        }

        @NotNull
        public final Map<Integer, Boolean> component1() {
            return this.dataValid;
        }

        @NotNull
        public final List<Map<Integer, DataValueItem>> component2() {
            return this.recordList;
        }

        @NotNull
        public final RecordDataValue copy(@NotNull Map<Integer, Boolean> dataValid, @NotNull List<? extends Map<Integer, DataValueItem>> recordList) {
            Intrinsics.checkNotNullParameter(dataValid, "dataValid");
            Intrinsics.checkNotNullParameter(recordList, "recordList");
            return new RecordDataValue(dataValid, recordList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecordDataValue)) {
                return false;
            }
            RecordDataValue recordDataValue = (RecordDataValue) other;
            return Intrinsics.areEqual(this.dataValid, recordDataValue.dataValid) && Intrinsics.areEqual(this.recordList, recordDataValue.recordList);
        }

        @NotNull
        public final Map<Integer, Boolean> getDataValid() {
            return this.dataValid;
        }

        @Nullable
        public final Integer getGpsFeatureType() {
            return this.gpsFeatureType;
        }

        @NotNull
        public final List<Map<Integer, DataValueItem>> getRecordList() {
            return this.recordList;
        }

        @Nullable
        public final byte[] getTgcData() {
            return this.tgcData;
        }

        public int hashCode() {
            return (this.dataValid.hashCode() * 31) + this.recordList.hashCode();
        }

        public final void setGpsFeatureType(@Nullable Integer num) {
            this.gpsFeatureType = num;
        }

        public final void setTgcData(@Nullable byte[] bArr) {
            this.tgcData = bArr;
        }

        @NotNull
        public String toString() {
            return "RecordDataValue(dataValid=" + this.dataValid + ", recordList=" + this.recordList + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new Gson();
    }

    @NotNull
    public final Gson getMGson() {
        return (Gson) this.mGson.getValue();
    }

    @Nullable
    public abstract FitnessParseResult parse(@NotNull FitnessBinaryData binaryData);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataValueItem;", "", "type", "", TSMAuthContants.PARAM_VALID, "", "value", "", "isFloat", "bytes", "", "<init>", "(IZLjava/lang/Number;Z[B)V", "getType", "()I", "getValid", "()Z", "getValue", "()Ljava/lang/Number;", "getBytes", "()[B", "toString", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DataValueItem {

        @Nullable
        private final byte[] bytes;
        private final boolean isFloat;
        private final int type;
        private final boolean valid;

        @NotNull
        private final Number value;

        public DataValueItem(int i, boolean z, @NotNull Number value, boolean z2, @Nullable byte[] bArr) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.type = i;
            this.valid = z;
            this.value = value;
            this.isFloat = z2;
            this.bytes = bArr;
        }

        public static /* synthetic */ DataValueItem copy$default(DataValueItem dataValueItem, int i, boolean z, Number number, boolean z2, byte[] bArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dataValueItem.type;
            }
            if ((i2 & 2) != 0) {
                z = dataValueItem.valid;
            }
            boolean z3 = z;
            if ((i2 & 4) != 0) {
                number = dataValueItem.value;
            }
            Number number2 = number;
            if ((i2 & 8) != 0) {
                z2 = dataValueItem.isFloat;
            }
            boolean z4 = z2;
            if ((i2 & 16) != 0) {
                bArr = dataValueItem.bytes;
            }
            return dataValueItem.copy(i, z3, number2, z4, bArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getValid() {
            return this.valid;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Number getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsFloat() {
            return this.isFloat;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final byte[] getBytes() {
            return this.bytes;
        }

        @NotNull
        public final DataValueItem copy(int type, boolean valid, @NotNull Number value, boolean isFloat, @Nullable byte[] bytes) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new DataValueItem(type, valid, value, isFloat, bytes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataValueItem)) {
                return false;
            }
            DataValueItem dataValueItem = (DataValueItem) other;
            return this.type == dataValueItem.type && this.valid == dataValueItem.valid && Intrinsics.areEqual(this.value, dataValueItem.value) && this.isFloat == dataValueItem.isFloat && Intrinsics.areEqual(this.bytes, dataValueItem.bytes);
        }

        @Nullable
        public final byte[] getBytes() {
            return this.bytes;
        }

        public final int getType() {
            return this.type;
        }

        public final boolean getValid() {
            return this.valid;
        }

        @NotNull
        public final Number getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.type) * 31) + Boolean.hashCode(this.valid)) * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isFloat)) * 31;
            byte[] bArr = this.bytes;
            return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
        }

        public final boolean isFloat() {
            return this.isFloat;
        }

        @NotNull
        public String toString() {
            return "type = " + this.type + ", valid = " + this.valid + ", value = " + this.value + ", isFloat = " + this.isFloat;
        }

        public /* synthetic */ DataValueItem(int i, boolean z, Number number, boolean z2, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z, number, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : bArr);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017JX\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "", "type", "", "byteCount", "supportVersion", "isFloat", "", "dependData", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;", "isUnsigned", "countsType", "<init>", "(IIIZLcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;ZLjava/lang/Integer;)V", "(IIILcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;)V", "getType", "()I", "getByteCount", "getSupportVersion", "()Z", "getDependData", "()Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;", "getCountsType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(IIIZLcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DependDataType;ZLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$OneDimenDataType;", "equals", "other", "hashCode", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OneDimenDataType {
        private final int byteCount;

        @Nullable
        private final Integer countsType;

        @Nullable
        private final DependDataType dependData;
        private final boolean isFloat;
        private final boolean isUnsigned;
        private final int supportVersion;
        private final int type;

        public OneDimenDataType(int i, int i2, int i3, boolean z, @Nullable DependDataType dependDataType, boolean z2, @Nullable Integer num) {
            this.type = i;
            this.byteCount = i2;
            this.supportVersion = i3;
            this.isFloat = z;
            this.dependData = dependDataType;
            this.isUnsigned = z2;
            this.countsType = num;
        }

        public static /* synthetic */ OneDimenDataType copy$default(OneDimenDataType oneDimenDataType, int i, int i2, int i3, boolean z, DependDataType dependDataType, boolean z2, Integer num, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = oneDimenDataType.type;
            }
            if ((i4 & 2) != 0) {
                i2 = oneDimenDataType.byteCount;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                i3 = oneDimenDataType.supportVersion;
            }
            int i6 = i3;
            if ((i4 & 8) != 0) {
                z = oneDimenDataType.isFloat;
            }
            boolean z3 = z;
            if ((i4 & 16) != 0) {
                dependDataType = oneDimenDataType.dependData;
            }
            DependDataType dependDataType2 = dependDataType;
            if ((i4 & 32) != 0) {
                z2 = oneDimenDataType.isUnsigned;
            }
            boolean z4 = z2;
            if ((i4 & 64) != 0) {
                num = oneDimenDataType.countsType;
            }
            return oneDimenDataType.copy(i, i5, i6, z3, dependDataType2, z4, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getByteCount() {
            return this.byteCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getSupportVersion() {
            return this.supportVersion;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsFloat() {
            return this.isFloat;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final DependDataType getDependData() {
            return this.dependData;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsUnsigned() {
            return this.isUnsigned;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getCountsType() {
            return this.countsType;
        }

        @NotNull
        public final OneDimenDataType copy(int type, int byteCount, int supportVersion, boolean isFloat, @Nullable DependDataType dependData, boolean isUnsigned, @Nullable Integer countsType) {
            return new OneDimenDataType(type, byteCount, supportVersion, isFloat, dependData, isUnsigned, countsType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OneDimenDataType)) {
                return false;
            }
            OneDimenDataType oneDimenDataType = (OneDimenDataType) other;
            return this.type == oneDimenDataType.type && this.byteCount == oneDimenDataType.byteCount && this.supportVersion == oneDimenDataType.supportVersion && this.isFloat == oneDimenDataType.isFloat && Intrinsics.areEqual(this.dependData, oneDimenDataType.dependData) && this.isUnsigned == oneDimenDataType.isUnsigned && Intrinsics.areEqual(this.countsType, oneDimenDataType.countsType);
        }

        public final int getByteCount() {
            return this.byteCount;
        }

        @Nullable
        public final Integer getCountsType() {
            return this.countsType;
        }

        @Nullable
        public final DependDataType getDependData() {
            return this.dependData;
        }

        public final int getSupportVersion() {
            return this.supportVersion;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.byteCount)) * 31) + Integer.hashCode(this.supportVersion)) * 31) + Boolean.hashCode(this.isFloat)) * 31;
            DependDataType dependDataType = this.dependData;
            int iHashCode2 = (((iHashCode + (dependDataType == null ? 0 : dependDataType.hashCode())) * 31) + Boolean.hashCode(this.isUnsigned)) * 31;
            Integer num = this.countsType;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final boolean isFloat() {
            return this.isFloat;
        }

        public final boolean isUnsigned() {
            return this.isUnsigned;
        }

        @NotNull
        public String toString() {
            return "type = " + this.type + ", byteCount = " + this.byteCount + ", supportVersion = " + this.supportVersion + ", isFloat = " + this.isFloat;
        }

        public /* synthetic */ OneDimenDataType(int i, int i2, int i3, boolean z, DependDataType dependDataType, boolean z2, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? null : dependDataType, (i4 & 32) != 0 ? true : z2, (i4 & 64) != 0 ? null : num);
        }

        public OneDimenDataType(int i, int i2, int i3, @Nullable DependDataType dependDataType) {
            this(i, i2, i3, false, dependDataType, false, null, 96, null);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJt\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "", "dataType", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "byteSize", "", OvulationTestRecord.Result.HIGH, "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;", "middle", "low", "supportVersion", "dynamicDataType", "Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DynamicValidDataType;", "isUnsigned", "", "maxSupportVersion", "<init>", "(Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;ILcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;ILcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DynamicValidDataType;ZLjava/lang/Integer;)V", "getDataType", "()Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;", "getByteSize", "()I", "getHigh", "()Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;", "getMiddle", "getLow", "getSupportVersion", "getDynamicDataType", "()Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DynamicValidDataType;", "()Z", "getMaxSupportVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenType;ILcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DataItemLen;ILcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$DynamicValidDataType;ZLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/parser/base/FitnessDataBaseParser$FourDimenDataInfo;", "equals", "other", "hashCode", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FourDimenDataInfo {
        private final int byteSize;

        @Nullable
        private final FourDimenType dataType;

        @Nullable
        private final DynamicValidDataType dynamicDataType;

        @Nullable
        private final DataItemLen high;
        private final boolean isUnsigned;

        @Nullable
        private final DataItemLen low;

        @Nullable
        private final Integer maxSupportVersion;

        @Nullable
        private final DataItemLen middle;
        private final int supportVersion;

        public FourDimenDataInfo(@Nullable FourDimenType fourDimenType, int i, @Nullable DataItemLen dataItemLen, @Nullable DataItemLen dataItemLen2, @Nullable DataItemLen dataItemLen3, int i2, @Nullable DynamicValidDataType dynamicValidDataType, boolean z, @Nullable Integer num) {
            this.dataType = fourDimenType;
            this.byteSize = i;
            this.high = dataItemLen;
            this.middle = dataItemLen2;
            this.low = dataItemLen3;
            this.supportVersion = i2;
            this.dynamicDataType = dynamicValidDataType;
            this.isUnsigned = z;
            this.maxSupportVersion = num;
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final FourDimenType getDataType() {
            return this.dataType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getByteSize() {
            return this.byteSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DataItemLen getHigh() {
            return this.high;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final DataItemLen getMiddle() {
            return this.middle;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final DataItemLen getLow() {
            return this.low;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getSupportVersion() {
            return this.supportVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final DynamicValidDataType getDynamicDataType() {
            return this.dynamicDataType;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getIsUnsigned() {
            return this.isUnsigned;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getMaxSupportVersion() {
            return this.maxSupportVersion;
        }

        @NotNull
        public final FourDimenDataInfo copy(@Nullable FourDimenType dataType, int byteSize, @Nullable DataItemLen high, @Nullable DataItemLen middle, @Nullable DataItemLen low, int supportVersion, @Nullable DynamicValidDataType dynamicDataType, boolean isUnsigned, @Nullable Integer maxSupportVersion) {
            return new FourDimenDataInfo(dataType, byteSize, high, middle, low, supportVersion, dynamicDataType, isUnsigned, maxSupportVersion);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FourDimenDataInfo)) {
                return false;
            }
            FourDimenDataInfo fourDimenDataInfo = (FourDimenDataInfo) other;
            return Intrinsics.areEqual(this.dataType, fourDimenDataInfo.dataType) && this.byteSize == fourDimenDataInfo.byteSize && Intrinsics.areEqual(this.high, fourDimenDataInfo.high) && Intrinsics.areEqual(this.middle, fourDimenDataInfo.middle) && Intrinsics.areEqual(this.low, fourDimenDataInfo.low) && this.supportVersion == fourDimenDataInfo.supportVersion && Intrinsics.areEqual(this.dynamicDataType, fourDimenDataInfo.dynamicDataType) && this.isUnsigned == fourDimenDataInfo.isUnsigned && Intrinsics.areEqual(this.maxSupportVersion, fourDimenDataInfo.maxSupportVersion);
        }

        public final int getByteSize() {
            return this.byteSize;
        }

        @Nullable
        public final FourDimenType getDataType() {
            return this.dataType;
        }

        @Nullable
        public final DynamicValidDataType getDynamicDataType() {
            return this.dynamicDataType;
        }

        @Nullable
        public final DataItemLen getHigh() {
            return this.high;
        }

        @Nullable
        public final DataItemLen getLow() {
            return this.low;
        }

        @Nullable
        public final Integer getMaxSupportVersion() {
            return this.maxSupportVersion;
        }

        @Nullable
        public final DataItemLen getMiddle() {
            return this.middle;
        }

        public final int getSupportVersion() {
            return this.supportVersion;
        }

        public int hashCode() {
            FourDimenType fourDimenType = this.dataType;
            int iHashCode = (((fourDimenType == null ? 0 : fourDimenType.hashCode()) * 31) + Integer.hashCode(this.byteSize)) * 31;
            DataItemLen dataItemLen = this.high;
            int iHashCode2 = (iHashCode + (dataItemLen == null ? 0 : dataItemLen.hashCode())) * 31;
            DataItemLen dataItemLen2 = this.middle;
            int iHashCode3 = (iHashCode2 + (dataItemLen2 == null ? 0 : dataItemLen2.hashCode())) * 31;
            DataItemLen dataItemLen3 = this.low;
            int iHashCode4 = (((iHashCode3 + (dataItemLen3 == null ? 0 : dataItemLen3.hashCode())) * 31) + Integer.hashCode(this.supportVersion)) * 31;
            DynamicValidDataType dynamicValidDataType = this.dynamicDataType;
            int iHashCode5 = (((iHashCode4 + (dynamicValidDataType == null ? 0 : dynamicValidDataType.hashCode())) * 31) + Boolean.hashCode(this.isUnsigned)) * 31;
            Integer num = this.maxSupportVersion;
            return iHashCode5 + (num != null ? num.hashCode() : 0);
        }

        public final boolean isUnsigned() {
            return this.isUnsigned;
        }

        @NotNull
        public String toString() {
            return "FourDimenDataInfo(dataType=" + this.dataType + ", byteSize=" + this.byteSize + ", high=" + this.high + ", middle=" + this.middle + ", low=" + this.low + ", supportVersion=" + this.supportVersion + ", dynamicDataType=" + this.dynamicDataType + ", isUnsigned=" + this.isUnsigned + ", maxSupportVersion=" + this.maxSupportVersion + ")";
        }

        public /* synthetic */ FourDimenDataInfo(FourDimenType fourDimenType, int i, DataItemLen dataItemLen, DataItemLen dataItemLen2, DataItemLen dataItemLen3, int i2, DynamicValidDataType dynamicValidDataType, boolean z, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(fourDimenType, i, dataItemLen, dataItemLen2, dataItemLen3, i2, (i3 & 64) != 0 ? null : dynamicValidDataType, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? null : num);
        }
    }
}
