package com.xiaomi.fitness.migration.exercise.transformation;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/migration/exercise/transformation/PressureSegmentCoder;", "", "<init>", "()V", "toWire", "", "destFile", "Ljava/io/File;", "segment", "Lcom/xiaomi/fitness/migration/exercise/transformation/PressureSegment;", "toWireVersion1", "", "out", "Ljava/io/DataOutputStream;", "fromWire", "srcFile", "inputStream", "Ljava/io/InputStream;", "fromWireVersion1", "in", "Ljava/io/DataInputStream;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PressureSegmentCoder {
    private static final byte CODER_VERSION = 1;
    private static final short MAGIC = Short.MAX_VALUE;

    @NotNull
    private static final String TAG = "PressureSegmentCoder";

    private final PressureSegment fromWireVersion1(DataInputStream in) throws IOException {
        PressureSegment pressureSegment = new PressureSegment();
        pressureSegment.setAltitudeDiff(in.readFloat());
        pressureSegment.setTotalUpAltitude(in.readFloat());
        pressureSegment.setTotalDownAltitude(in.readFloat());
        pressureSegment.setPressureStart(in.readFloat());
        pressureSegment.setPressureEnd(in.readFloat());
        pressureSegment.setPressureDiff(in.readFloat());
        int i = in.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            AirPressure airPressure = new AirPressure();
            airPressure.setTime(in.readLong());
            airPressure.setPressure(in.readFloat());
            airPressure.setAltitude(in.readFloat());
            arrayList.add(airPressure);
        }
        pressureSegment.setPressures(arrayList);
        return pressureSegment;
    }

    private final void toWireVersion1(DataOutputStream out, PressureSegment segment) throws IOException {
        out.writeFloat(segment.getAltitudeDiff());
        out.writeFloat(segment.getTotalUpAltitude());
        out.writeFloat(segment.getTotalDownAltitude());
        out.writeFloat(segment.getPressureStart());
        out.writeFloat(segment.getPressureEnd());
        out.writeFloat(segment.getPressureDiff());
        List<AirPressure> pressures = segment.getPressures();
        Intrinsics.checkNotNull(pressures);
        int size = pressures.size();
        out.writeInt(size);
        for (int i = 0; i < size; i++) {
            AirPressure airPressure = pressures.get(i);
            out.writeLong(airPressure.getTime());
            out.writeFloat(airPressure.getPressure());
            out.writeFloat(airPressure.getAltitude());
        }
    }

    @Nullable
    public final PressureSegment fromWire(@Nullable File srcFile) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(srcFile);
        } catch (FileNotFoundException e) {
            FitnessLogUtils.e(TAG, "fromWire exception " + e);
            fileInputStream = null;
        }
        return fromWire(fileInputStream);
    }

    public final boolean toWire(@Nullable File destFile, @NotNull PressureSegment segment) throws Throwable {
        Intrinsics.checkNotNullParameter(segment, "segment");
        DataOutputStream dataOutputStream = null;
        try {
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(destFile, true));
                try {
                    dataOutputStream2.writeShort(32767);
                    dataOutputStream2.writeByte(1);
                    toWireVersion1(dataOutputStream2, segment);
                    dataOutputStream2.flush();
                    IOExtKt.closeSilently(this, dataOutputStream2);
                } catch (IOException e) {
                    e = e;
                    dataOutputStream = dataOutputStream2;
                    FitnessLogUtils.e(TAG, "toWire exception " + e);
                    IOExtKt.closeSilently(this, dataOutputStream);
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    IOExtKt.closeSilently(this, dataOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public final PressureSegment fromWire(@Nullable InputStream inputStream) throws Throwable {
        PressureSegment pressureSegment;
        DataInputStream dataInputStream = null;
        PressureSegment pressureSegmentFromWireVersion1 = null;
        dataInputStream = null;
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                DataInputStream dataInputStream2 = new DataInputStream(inputStream);
                while (dataInputStream2.available() != 0) {
                    try {
                        if (dataInputStream2.readShort() != Short.MAX_VALUE) {
                            FitnessLogUtils.e(TAG, "Parsing error , magic string not found ");
                            IOExtKt.closeSilently(this, dataInputStream2);
                            return pressureSegmentFromWireVersion1;
                        }
                        byte b2 = dataInputStream2.readByte();
                        if (b2 == 1) {
                            pressureSegmentFromWireVersion1 = fromWireVersion1(dataInputStream2);
                        } else {
                            FitnessLogUtils.e(TAG, "Wrong version number : " + ((int) b2));
                            IOExtKt.closeSilently(this, dataInputStream2);
                            return pressureSegmentFromWireVersion1;
                        }
                    } catch (IOException e) {
                        e = e;
                        pressureSegment = pressureSegmentFromWireVersion1;
                        dataInputStream = dataInputStream2;
                        FitnessLogUtils.e(TAG, "fromWire exception " + e);
                        IOExtKt.closeSilently(this, dataInputStream);
                        return pressureSegment;
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        IOExtKt.closeSilently(this, dataInputStream);
                        throw th;
                    }
                }
                IOExtKt.closeSilently(this, dataInputStream2);
                return pressureSegmentFromWireVersion1;
            } catch (IOException e2) {
                e = e2;
                pressureSegment = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
