package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class w10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20636e;

    static {
        bk bkVar = new bk("watchface_settings", 159);
        f20636e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("mode", 0, 0, 1.0d, 0.0d, "", false, zn.WATCHFACE_MODE));
        zn znVar = zn.BYTE;
        bkVar.e(new rc(TtmlNode.TAG_LAYOUT, 1, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20460i.add(new pw("digital_layout", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(2).f20460i.add(new pw("analog_layout", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(2).f20460i.get(1).b(0, 1L);
        bkVar.e(new rc("tick_style", 2, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(3).f20460i.add(new pw("digital_tick_style", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(3).f20460i.get(0).b(0, 0L);
        bkVar.e(new rc("data", 3, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(4).f20460i.add(new pw("digital_data", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(4).f20460i.add(new pw("analog_data", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(4).f20460i.get(1).b(0, 1L);
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("show_icons", 4, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("accent_color", 5, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("black_background", 6, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("background", 7, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(8).f20460i.add(new pw("analog_background", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(8).f20460i.get(0).b(0, 1L);
        bkVar.e(new rc("display_options", 8, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_OPTIONS));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("config_data", 9, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.f19753c.get(10).f20459h.add(new vc(10, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(11, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(10, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(11, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(10, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(11, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(10, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(11, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(10, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(10).f20459h.add(new vc(11, false, 8, 1.0d, 0.0d));
        zn znVar4 = zn.WATCHFACE_DATA_TYPE;
        bkVar.e(new rc("data_type", 10, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("data_layout", 11, 2, 1.0d, 0.0d, "", false, zn.WATCHFACE_DATA_LAYOUT));
        zn znVar5 = zn.UINT32;
        bkVar.e(new rc(TtmlNode.ATTR_ID, 12, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("accent_color16", 13, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("data_color16", 14, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("custom_data_color_configured", 15, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("data_field_data", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("nested_data_type", 17, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("lume_mode_color16", 18, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public w10() {
        super(wb.b(159));
    }

    public w10(bk bkVar) {
        super(bkVar);
    }
}
