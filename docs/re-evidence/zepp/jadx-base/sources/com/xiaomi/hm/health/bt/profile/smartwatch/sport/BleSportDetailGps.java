package com.xiaomi.hm.health.bt.profile.smartwatch.sport;

import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes18.dex */
public class BleSportDetailGps {
    public List<Item> items = new ArrayList();

    public static class DataPoint {
        public int altitude;
        public long offsetLatitude;
        public long offsetLongitude;
        public int offsetTime;
        public short speed;
        public short type;
    }

    public static class Item {
        public short altitude;
        public int latitude;
        public int longitude;
        public int offsetToStart;
        public List<Point> points = new ArrayList();

        public String toString() {
            return "<OffsetToStart: " + this.offsetToStart + ", Longitude: " + this.longitude + ", Latitude: " + this.latitude + ", Altitude: " + ((int) this.altitude) + ", Points: \n" + ArraysUtil.toString(this.points, "\n") + Typography.greater;
        }
    }

    public static class Point {
        public byte offsetAltitude;
        public short offsetLatitude;
        public short offsetLongitude;
        public byte offsetTime;
        public short speed;
        public short type;

        public String toString() {
            return "<OffsetTime: " + ((int) this.offsetTime) + ", OffsetAltitude: " + ((int) this.offsetAltitude) + ", OffsetLongitude: " + ((int) this.offsetLongitude) + ", OffsetLatitude: " + ((int) this.offsetLatitude) + ", Speed: " + ((int) this.speed) + ", Type: " + ((int) this.type) + Typography.greater;
        }
    }

    private void a(ByteBuffer data) {
        byte b = data.get();
        byte b2 = data.get();
        int i = b & 255;
        int i2 = (i << 8) | (b2 & 255);
        if (i2 == 61605) {
            byte[] bArr = {0, data.get(), data.get(), data.get()};
            data.get();
            Item item = new Item();
            item.offsetToStart = (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24);
            item.longitude = data.getInt();
            Point point = new Point();
            point.offsetTime = (byte) 0;
            point.offsetAltitude = (byte) 0;
            point.offsetLongitude = (short) 0;
            point.offsetLatitude = (short) 0;
            item.points.add(point);
            this.items.add(item);
            return;
        }
        Item item2 = null;
        if (this.items.size() > 0) {
            List<Item> list = this.items;
            item2 = list.get(list.size() - 1);
        }
        if (i2 == 61861) {
            if (item2 != null) {
                item2.latitude = data.getInt();
                item2.altitude = data.getShort();
                short s = data.getShort();
                if (item2.points.size() == 1) {
                    item2.points.get(0).speed = s;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 62117) {
            if (item2 != null) {
                short s2 = data.getShort();
                if (item2.points.size() == 1) {
                    item2.points.get(0).type = s2;
                    return;
                }
                return;
            }
            return;
        }
        if (i >= 128 || item2 == null) {
            return;
        }
        Point point2 = new Point();
        point2.offsetTime = b;
        point2.offsetAltitude = b2;
        point2.offsetLongitude = data.getShort();
        point2.offsetLatitude = data.getShort();
        point2.speed = data.getShort();
        point2.type = data.getShort();
        item2.points.add(point2);
    }

    public List<DataPoint> convert() {
        long j;
        int size = this.items.size();
        ArrayList arrayList = new ArrayList();
        if (size > 0) {
            long j2 = 0;
            long j3 = 0;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Item item = this.items.get(i3);
                int size2 = item.points.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Point point = item.points.get(i4);
                    DataPoint dataPoint = new DataPoint();
                    if (i4 == 0) {
                        dataPoint.offsetTime = item.offsetToStart - i;
                        j = j3;
                        dataPoint.offsetLatitude = ((long) item.latitude) - j2;
                        dataPoint.offsetLongitude = ((long) item.longitude) - j;
                        short s = item.altitude;
                        dataPoint.altitude = s;
                        dataPoint.speed = point.speed;
                        dataPoint.type = point.type;
                        i2 = s;
                    } else {
                        j = j3;
                        dataPoint.offsetTime = point.offsetTime & 255;
                        dataPoint.offsetLatitude = point.offsetLatitude;
                        dataPoint.offsetLongitude = point.offsetLongitude;
                        i2 += point.offsetAltitude;
                        dataPoint.altitude = i2;
                        dataPoint.speed = point.speed;
                        dataPoint.type = point.type;
                    }
                    j2 += dataPoint.offsetLatitude;
                    j3 = j + dataPoint.offsetLongitude;
                    i += dataPoint.offsetTime;
                    arrayList.add(dataPoint);
                }
            }
        }
        return arrayList;
    }

    public void parse(byte[] bytes) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < bytes.length / 10; i++) {
            if (i > 0) {
                byteBufferWrap.position(i * 10);
            }
            a(byteBufferWrap);
        }
    }

    public String toShortString() {
        return toString();
    }

    public String toString() {
        return "<Items: \n" + ArraysUtil.toString(this.items, "\n") + Typography.greater;
    }
}
