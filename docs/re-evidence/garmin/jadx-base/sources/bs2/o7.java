package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class o7 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20372e;

    static {
        bk bkVar = new bk("device_info", 23);
        f20372e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("device_index", 0, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("device_type", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20460i.add(new pw("ble_device_type", 2, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(0).b(25, 3L);
        bkVar.f19753c.get(2).f20460i.add(new pw("antplus_device_type", 2, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(1).b(25, 1L);
        bkVar.f19753c.get(2).f20460i.add(new pw("ant_device_type", 2, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(2).b(25, 0L);
        bkVar.f19753c.get(2).f20460i.add(new pw("local_device_type", 2, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(3).b(25, 5L);
        bkVar.f19753c.get(2).f20460i.add(new pw("wifi_device_type", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(4).b(25, 4L);
        bkVar.e(new rc("manufacturer", 2, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        bkVar.e(new rc("serial_number", 3, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("product", 4, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(5).f20460i.add(new pw("favero_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(5).f20460i.get(0).b(2, 263L);
        bkVar.f19753c.get(5).f20460i.add(new pw("garmin_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(5).f20460i.get(1).b(2, 1L);
        bkVar.f19753c.get(5).f20460i.get(1).b(2, 15L);
        bkVar.f19753c.get(5).f20460i.get(1).b(2, 13L);
        bkVar.f19753c.get(5).f20460i.get(1).b(2, 89L);
        bkVar.e(new rc("software_version", 5, 132, 100.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hardware_version", 6, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("cum_operating_time", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("cum_training_time", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("reception", 9, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("battery_voltage", 10, 132, 256.0d, 0.0d, "V", false, znVar2));
        bkVar.e(new rc("battery_status", 11, 2, 1.0d, 0.0d, "", false, zn.BATTERY_STATUS));
        bkVar.e(new rc("x_uint8_search_count", 12, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(13).f20459h.add(new vc(13, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("search_count", 13, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("connect_count", 14, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("rx_pass_count", 15, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "messages", false, znVar3));
        bkVar.e(new rc("rx_fail_count", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "messages", false, znVar3));
        zn znVar4 = zn.STRING;
        bkVar.e(new rc("software_version_string", 17, 7, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("sensor_position", 18, 0, 1.0d, 0.0d, "", false, zn.BODY_LOCATION));
        bkVar.e(new rc("descriptor", 19, 7, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("ant_transmission_type", 20, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        bkVar.e(new rc("ant_device_number", 21, 139, 1.0d, 0.0d, "", false, zn.UINT16Z));
        bkVar.e(new rc("ant_network", 22, 0, 1.0d, 0.0d, "", false, zn.ANT_NETWORK));
        bkVar.e(new rc("ant_channel_type", 23, 2, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_TYPE));
        bkVar.e(new rc("ant_channel_id", 24, 140, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_ID));
        bkVar.e(new rc("source_type", 25, 0, 1.0d, 0.0d, "", false, zn.SOURCE_TYPE));
        bkVar.e(new rc("device_condition", 26, 10, 1.0d, 0.0d, "", false, zn.DEVICE_CONDITION_BITS_0));
        bkVar.e(new rc("product_name", 27, 7, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("calibration_status", 28, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INFO_CALIBRATION_STATE));
        bkVar.e(new rc("ble_address", 29, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("ble_addr_type", 30, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("collision_count", 31, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("battery_level", 32, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("wifi_mac_address", 33, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public o7() {
        super(wb.b(23));
    }

    public o7(bk bkVar) {
        super(bkVar);
    }
}
