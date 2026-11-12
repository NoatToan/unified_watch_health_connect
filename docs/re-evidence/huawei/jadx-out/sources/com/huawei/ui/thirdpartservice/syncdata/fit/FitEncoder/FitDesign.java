package com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder;

import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import defpackage.xar;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public class FitDesign {

    public static class a extends BaseData {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29165b = 14;
        int e = 100;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29164a = 15;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f29166c = ".FIT";
        public int d = 0;

        @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
        public DataOutputStream write(DataOutputStream dataOutputStream) throws IOException {
            int i = this.d;
            byte[] bArr = {14, 32, -90, 82, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255), 46, 70, 73, 84};
            xar xarVar = new xar();
            dataOutputStream.write(bArr);
            long value = xarVar.getValue();
            dataOutputStream.write((byte) (value & 255));
            dataOutputStream.write((byte) ((value >> 8) & 255));
            return dataOutputStream;
        }

        @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
        public int getSize() {
            return this.f29165b;
        }
    }

    public static class e extends BaseData {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f29168b = 0;
        public short d = 0;

        @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
        public int getSize() {
            return 1;
        }

        @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
        public DataOutputStream write(DataOutputStream dataOutputStream) throws IOException {
            LogUtil.a("FitFile_BaseMessageHead", "write message mLocalMessageType is ", Short.valueOf(this.d));
            dataOutputStream.writeByte((byte) ((((this.f29168b & 1) << 6) | (this.d & 15)) & 255));
            return dataOutputStream;
        }
    }

    public static class d extends BaseData {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f29167c;
        public short d;
        public FieldType e;

        public d(short s, FieldType fieldType, Object obj, double d, double d2) {
            this.d = s;
            this.e = fieldType;
            this.f29167c = c(obj, d, d2);
            this.mSize = FitDesign.c(this.e);
        }

        @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
        public DataOutputStream write(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeByte(this.d);
            dataOutputStream.writeByte(this.mSize);
            dataOutputStream.writeByte(this.e.getTypeId());
            return dataOutputStream;
        }

        @Override // com.huawei.ui.thirdpartservice.syncdata.fit.FitEncoder.BaseData
        public int getSize() {
            return this.mSize;
        }

        public Object c(Object obj, double d, double d2) {
            if (obj instanceof Number) {
                return (d == 1.0d && d2 == 0.0d) ? obj : Long.valueOf(Math.round((((Number) obj).doubleValue() + d2) * d));
            }
            return obj;
        }
    }

    public static byte c(FieldType fieldType) {
        switch (fieldType) {
            case ENUM:
            case SINT8:
            case UINT8:
                return (byte) 1;
            case SINT16:
            case UINT16:
                return (byte) 2;
            case SINT32:
            case UINT32:
                return (byte) 4;
            case STRING:
                return (byte) 32;
            case FLOAT32:
                return (byte) 4;
            case FLOAT64:
                return (byte) 8;
            case BYTE:
                return (byte) 1;
            case SINT64:
            case UINT64:
                return (byte) 8;
            default:
                return (byte) 0;
        }
    }

    public enum FieldType {
        ENUM(0),
        SINT8(1),
        UINT8(2),
        SINT16(131),
        UINT16(UserInfomation.WEIGHT_DEFAULT_ENGLISH),
        SINT32(OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL),
        UINT32(134),
        STRING(7),
        FLOAT32(TsExtractor.TS_STREAM_TYPE_DTS_HD),
        FLOAT64(137),
        BYTE(13),
        SINT64(142),
        UINT64(143);

        private final int mTypeId;

        FieldType(int i) {
            this.mTypeId = i;
        }

        public int getTypeId() {
            return this.mTypeId;
        }
    }

    public enum MessageNum {
        NONE(-1),
        FILE_ID(0),
        ACTIVITY(34),
        SESSION(18),
        LAP(19),
        RECORD(20),
        EVENT(21),
        DEVICE_INFO(23);

        private final int mTypeId;

        MessageNum(int i) {
            this.mTypeId = i;
        }

        public int getTypeId() {
            return this.mTypeId;
        }
    }

    public enum ActivityType {
        GENERIC(0),
        RUNNING(1),
        CYCLING(2),
        FITNESS_EQUIPMENT(4),
        SWIMMING(5),
        TENNIS(8),
        TRAINING(10),
        WALKING(11),
        CROSS_COUNTRY_SKIING(12),
        ALPINE_SKIING(13),
        SNOWBOARDING(14),
        ROWING(15),
        ROCK_CLIMBING(31),
        SAILING(32),
        ICE_SKATING(33),
        STAND_UP_PADDLEBOARDING(37),
        SURFING(38),
        KAYAKING(41),
        HIIT(62);

        private final int typeId;

        ActivityType(int i) {
            this.typeId = i;
        }

        public int getTypeId() {
            return this.typeId;
        }
    }

    public enum SubActivityType {
        GENERIC(0),
        TREADMILL(1),
        STREET(2),
        TRAIL(3),
        TRACK(4),
        INDOOR_CYCLING(6),
        ROAD(7),
        ELLIPTICAL(15),
        STAIR_CLIMBING(16),
        LAP_SWIMMING(17),
        OPEN_WATER(18),
        STRENGTH_TRAINING(20),
        EXERCISE(23),
        INDOOR_WALKING(27),
        CASUAL_WALKING(30),
        BACKCOUNTRY(37),
        SKATE_SKIING(42),
        YOGA(43),
        PILATES(44),
        HIIT(70),
        INVALID(255);

        private final int typeId;

        SubActivityType(int i) {
            this.typeId = i;
        }

        public int getTypeId() {
            return this.typeId;
        }
    }
}
