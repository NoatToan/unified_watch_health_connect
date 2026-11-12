package bs2;

import com.mapbox.maps.extension.compose.style.standard.StandardStyleConfigurationState;

/* JADX INFO: loaded from: classes11.dex */
public class al extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19680e;

    static {
        bk bkVar = new bk("morning_report_settings", 373);
        f19680e = bkVar;
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("cards", 1, 0, 1.0d, 0.0d, "", false, zn.MORNING_REPORT_CARD_TYPE));
        bkVar.e(new rc(StandardStyleConfigurationState.CONFIG_THEME, 2, 0, 1.0d, 0.0d, "", false, zn.MORNING_REPORT_THEME));
        bkVar.e(new rc("custom_messages_enabled", 3, 0, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.STRING;
        bkVar.e(new rc("custom_message_one", 4, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("custom_message_two", 5, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("custom_message_three", 6, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("custom_message_four", 7, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("custom_message_five", 8, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public al() {
        super(wb.b(373));
    }

    public al(bk bkVar) {
        super(bkVar);
    }
}
