package lz1;

import android.content.Context;
import android.text.TextUtils;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import my1.g;
import org.apache.commons.lang3.time.TimeZones;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llz1/b;", "", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f115398a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f115399b;

    static {
        int i14 = gt2.c.f79010a;
        f115399b = gt2.b.f79005a.h("TimeZoneMappingUtil");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llz1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static String a(g gVar) {
            gVar.getClass();
            String str = gVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String();
            b.f115399b.info("getTimeZoneDisplayString");
            Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
            if (TextUtils.isEmpty(str)) {
                String string = contextC.getString(R.string.no_value);
                string.getClass();
                return string;
            }
            if (str == null) {
                String string2 = contextC.getString(R.string.no_value);
                string2.getClass();
                return string2;
            }
            switch (str.hashCode()) {
                case -2146291360:
                    if (str.equals("Antarctica/Mawson")) {
                        String string3 = contextC.getString(R.string.antarctica_mawson);
                        string3.getClass();
                        return string3;
                    }
                    break;
                case -2089950224:
                    if (str.equals("Pacific/Easter")) {
                        String string4 = contextC.getString(R.string.pacific_easter);
                        string4.getClass();
                        return string4;
                    }
                    break;
                case -2036796623:
                    if (str.equals("Atlantic/Azores")) {
                        String string5 = contextC.getString(R.string.atlantic_azores);
                        string5.getClass();
                        return string5;
                    }
                    break;
                case -1955171722:
                    if (str.equals("Pacific/Chatham")) {
                        String string6 = contextC.getString(R.string.pacific_chatham);
                        string6.getClass();
                        return string6;
                    }
                    break;
                case -1942139514:
                    if (str.equals("Asia/Kolkata")) {
                        String string7 = contextC.getString(R.string.asia_kolkata);
                        string7.getClass();
                        return string7;
                    }
                    break;
                case -1927172530:
                    if (str.equals("America/Phoenix")) {
                        String string8 = contextC.getString(R.string.america_phoenix);
                        string8.getClass();
                        return string8;
                    }
                    break;
                case -1762267155:
                    if (str.equals("Pacific/Ponape")) {
                        String string9 = contextC.getString(R.string.pacific_ponape);
                        string9.getClass();
                        return string9;
                    }
                    break;
                case -1745250846:
                    if (str.equals("Asia/Baghdad")) {
                        String string10 = contextC.getString(R.string.asia_baghdad);
                        string10.getClass();
                        return string10;
                    }
                    break;
                case -1738808822:
                    if (str.equals("Asia/Bangkok")) {
                        String string11 = contextC.getString(R.string.asia_bangkok);
                        string11.getClass();
                        return string11;
                    }
                    break;
                case -1675354028:
                    if (str.equals("Asia/Dubai")) {
                        String string12 = contextC.getString(R.string.asia_dubai);
                        string12.getClass();
                        return string12;
                    }
                    break;
                case -1669484578:
                    if (str.equals("Asia/Kabul")) {
                        String string13 = contextC.getString(R.string.asia_kabul);
                        string13.getClass();
                        return string13;
                    }
                    break;
                case -1665081950:
                    if (str.equals("Australia/Adelaide")) {
                        String string14 = contextC.getString(R.string.australia_adelaide);
                        string14.getClass();
                        return string14;
                    }
                    break;
                case -1661964753:
                    if (str.equals("Asia/Seoul")) {
                        String string15 = contextC.getString(R.string.asia_seoul);
                        string15.getClass();
                        return string15;
                    }
                    break;
                case -1660747039:
                    if (str.equals("Asia/Tokyo")) {
                        String string16 = contextC.getString(R.string.asia_tokyo);
                        string16.getClass();
                        return string16;
                    }
                    break;
                case -1609966193:
                    if (str.equals("Antarctica/Macquarie")) {
                        String string17 = contextC.getString(R.string.antarctica_macquarie);
                        string17.getClass();
                        return string17;
                    }
                    break;
                case -1585848154:
                    if (str.equals("Atlantic/Faroe")) {
                        String string18 = contextC.getString(R.string.atlantic_faroe);
                        string18.getClass();
                        return string18;
                    }
                    break;
                case -1536188513:
                    if (str.equals("America/Los_Angeles")) {
                        String string19 = contextC.getString(R.string.america_los_angeles);
                        string19.getClass();
                        return string19;
                    }
                    break;
                case -1524947876:
                    if (str.equals("Pacific/Enderbury")) {
                        String string20 = contextC.getString(R.string.pacific_enderbury);
                        string20.getClass();
                        return string20;
                    }
                    break;
                case -1523781592:
                    if (str.equals("America/Sao_Paulo")) {
                        String string21 = contextC.getString(R.string.america_sao_paulo);
                        string21.getClass();
                        return string21;
                    }
                    break;
                case -1439196453:
                    if (str.equals("Asia/Omsk")) {
                        String string22 = contextC.getString(R.string.asia_omsk);
                        string22.getClass();
                        return string22;
                    }
                    break;
                case -1416131494:
                    if (str.equals("Asia/Srednekolymsk")) {
                        String string23 = contextC.getString(R.string.asia_srednekolymsk);
                        string23.getClass();
                        return string23;
                    }
                    break;
                case -1397173141:
                    if (str.equals("America/St_Johns")) {
                        String string24 = contextC.getString(R.string.america_st_johns);
                        string24.getClass();
                        return string24;
                    }
                    break;
                case -1243098545:
                    if (str.equals("America/New_York")) {
                        String string25 = contextC.getString(R.string.america_new_york);
                        string25.getClass();
                        return string25;
                    }
                    break;
                case -1039536273:
                    if (str.equals("Africa/Djibouti")) {
                        String string26 = contextC.getString(R.string.africa_djibouti);
                        string26.getClass();
                        return string26;
                    }
                    break;
                case -977866396:
                    if (str.equals("Africa/Algiers")) {
                        String string27 = contextC.getString(R.string.africa_algiers);
                        string27.getClass();
                        return string27;
                    }
                    break;
                case -969722739:
                    if (str.equals("Pacific/Auckland")) {
                        String string28 = contextC.getString(R.string.pacific_auckland);
                        string28.getClass();
                        return string28;
                    }
                    break;
                case -808657565:
                    if (str.equals("Asia/Krasnoyarsk")) {
                        String string29 = contextC.getString(R.string.asia_krasnoyarsk);
                        string29.getClass();
                        return string29;
                    }
                    break;
                case -765987643:
                    if (str.equals("Atlantic/South_Georgia")) {
                        String string30 = contextC.getString(R.string.atlantic_south_georgia);
                        string30.getClass();
                        return string30;
                    }
                    break;
                case -691236908:
                    if (str.equals("America/Puerto_Rico")) {
                        String string31 = contextC.getString(R.string.america_puerto_rico);
                        string31.getClass();
                        return string31;
                    }
                    break;
                case -672549154:
                    if (str.equals("Europe/Paris")) {
                        String string32 = contextC.getString(R.string.europe_paris);
                        string32.getClass();
                        return string32;
                    }
                    break;
                case -611834443:
                    if (str.equals("America/Santiago")) {
                        String string33 = contextC.getString(R.string.america_santiago);
                        string33.getClass();
                        return string33;
                    }
                    break;
                case -596550328:
                    if (str.equals("Pacific/Fiji")) {
                        String string34 = contextC.getString(R.string.pacific_fiji);
                        string34.getClass();
                        return string34;
                    }
                    break;
                case -585431767:
                    if (str.equals("America/Chicago")) {
                        String string35 = contextC.getString(R.string.america_chicago);
                        string35.getClass();
                        return string35;
                    }
                    break;
                case -566871917:
                    if (str.equals("Pacific/Norfolk")) {
                        String string36 = contextC.getString(R.string.pacific_norfolk);
                        string36.getClass();
                        return string36;
                    }
                    break;
                case -488745714:
                    if (str.equals("Asia/Anadyr")) {
                        String string37 = contextC.getString(R.string.asia_anadyr);
                        string37.getClass();
                        return string37;
                    }
                    break;
                case -485399277:
                    if (str.equals("Asia/Aqtobe")) {
                        String string38 = contextC.getString(R.string.asia_aqtobe);
                        string38.getClass();
                        return string38;
                    }
                    break;
                case -423647967:
                    if (str.equals("Asia/Rangoon")) {
                        String string39 = contextC.getString(R.string.asia_rangoon);
                        string39.getClass();
                        return string39;
                    }
                    break;
                case -359165265:
                    if (str.equals("Europe/Istanbul")) {
                        String string40 = contextC.getString(R.string.europe_istanbul);
                        string40.getClass();
                        return string40;
                    }
                    break;
                case -355081471:
                    if (str.equals("America/Costa_Rica")) {
                        String string41 = contextC.getString(R.string.america_costa_rica);
                        string41.getClass();
                        return string41;
                    }
                    break;
                case -133690113:
                    if (str.equals("Atlantic/Cape_Verde")) {
                        String string42 = contextC.getString(R.string.atlantic_cape_verde);
                        string42.getClass();
                        return string42;
                    }
                    break;
                case -106542357:
                    if (str.equals("America/Campo_Grande")) {
                        String string43 = contextC.getString(R.string.america_campo_grande);
                        string43.getClass();
                        return string43;
                    }
                    break;
                case -99855332:
                    if (str.equals("Pacific/Marquesas")) {
                        String string44 = contextC.getString(R.string.pacific_marquesas);
                        string44.getClass();
                        return string44;
                    }
                    break;
                case 70702:
                    if (str.equals(TimeZones.GMT_ID)) {
                        String string45 = contextC.getString(R.string.gmt);
                        string45.getClass();
                        return string45;
                    }
                    break;
                case 102478:
                    if (str.equals("gmt")) {
                        String string46 = contextC.getString(R.string.gmt);
                        string46.getClass();
                        return string46;
                    }
                    break;
                case 44334398:
                    if (str.equals("Asia/Famagusta")) {
                        String string47 = contextC.getString(R.string.asia_famagusta);
                        string47.getClass();
                        return string47;
                    }
                    break;
                case 47117709:
                    if (str.equals("Asia/Tehran")) {
                        String string48 = contextC.getString(R.string.asia_tehran);
                        string48.getClass();
                        return string48;
                    }
                    break;
                case 213620546:
                    if (str.equals("Europe/Athens")) {
                        String string49 = contextC.getString(R.string.europe_athens);
                        string49.getClass();
                        return string49;
                    }
                    break;
                case 298249433:
                    if (str.equals("Australia/Eucla")) {
                        String string50 = contextC.getString(R.string.australia_eucla);
                        string50.getClass();
                        return string50;
                    }
                    break;
                case 307946178:
                    if (str.equals("Australia/Perth")) {
                        String string51 = contextC.getString(R.string.australia_perth);
                        string51.getClass();
                        return string51;
                    }
                    break;
                case 353994537:
                    if (str.equals("America/Anchorage")) {
                        String string52 = contextC.getString(R.string.america_anchorage);
                        string52.getClass();
                        return string52;
                    }
                    break;
                case 404568855:
                    if (str.equals("Asia/Hong_Kong")) {
                        String string53 = contextC.getString(R.string.asia_hong_kong);
                        string53.getClass();
                        return string53;
                    }
                    break;
                case 413002919:
                    if (str.equals("America/Miquelon")) {
                        String string54 = contextC.getString(R.string.america_miquelon);
                        string54.getClass();
                        return string54;
                    }
                    break;
                case 524101413:
                    if (str.equals("Europe/London")) {
                        String string55 = contextC.getString(R.string.europe_london);
                        string55.getClass();
                        return string55;
                    }
                    break;
                case 552878567:
                    if (str.equals("Europe/Moscow")) {
                        String string56 = contextC.getString(R.string.europe_moscow);
                        string56.getClass();
                        return string56;
                    }
                    break;
                case 609156054:
                    if (str.equals("Australia/Darwin")) {
                        String string57 = contextC.getString(R.string.australia_darwin);
                        string57.getClass();
                        return string57;
                    }
                    break;
                case 663100500:
                    if (str.equals("Asia/Irkutsk")) {
                        String string58 = contextC.getString(R.string.asia_irkutsk);
                        string58.getClass();
                        return string58;
                    }
                    break;
                case 711543582:
                    if (str.equals("Europe/Samara")) {
                        String string59 = contextC.getString(R.string.europe_samara);
                        string59.getClass();
                        return string59;
                    }
                    break;
                case 951624910:
                    if (str.equals("Asia/Novosibirsk")) {
                        String string60 = contextC.getString(R.string.asia_novosibirsk);
                        string60.getClass();
                        return string60;
                    }
                    break;
                case 1060331987:
                    if (str.equals("Australia/Sydney")) {
                        String string61 = contextC.getString(R.string.australia_sydney);
                        string61.getClass();
                        return string61;
                    }
                    break;
                case 1266363370:
                    if (str.equals("Africa/Windhoek")) {
                        String string62 = contextC.getString(R.string.africa_windhoek);
                        string62.getClass();
                        return string62;
                    }
                    break;
                case 1344376451:
                    if (str.equals("America/Bogota")) {
                        String string63 = contextC.getString(R.string.america_bogota);
                        string63.getClass();
                        return string63;
                    }
                    break;
                case 1392614359:
                    if (str.equals("America/Denver")) {
                        String string64 = contextC.getString(R.string.america_denver);
                        string64.getClass();
                        return string64;
                    }
                    break;
                case 1404986049:
                    if (str.equals("Pacific/Gambier")) {
                        String string65 = contextC.getString(R.string.pacific_gambier);
                        string65.getClass();
                        return string65;
                    }
                    break;
                case 1482536665:
                    if (str.equals("Pacific/Kiritimati")) {
                        String string66 = contextC.getString(R.string.pacific_kiritimati);
                        string66.getClass();
                        return string66;
                    }
                    break;
                case 1491561941:
                    if (str.equals("Asia/Yakutsk")) {
                        String string67 = contextC.getString(R.string.asia_yakutsk);
                        string67.getClass();
                        return string67;
                    }
                    break;
                case 1572742253:
                    if (str.equals("Atlantic/Bermuda")) {
                        String string68 = contextC.getString(R.string.atlantic_bermuda);
                        string68.getClass();
                        return string68;
                    }
                    break;
                case 1587535273:
                    if (str.equals("Africa/Johannesburg")) {
                        String string69 = contextC.getString(R.string.africa_johannesburg);
                        string69.getClass();
                        return string69;
                    }
                    break;
                case 1612067903:
                    if (str.equals("Asia/Yerevan")) {
                        String string70 = contextC.getString(R.string.asia_yerevan);
                        string70.getClass();
                        return string70;
                    }
                    break;
                case 1625237543:
                    if (str.equals("Asia/Yekaterinburg")) {
                        String string71 = contextC.getString(R.string.asia_yekaterinburg);
                        string71.getClass();
                        return string71;
                    }
                    break;
                case 1640682817:
                    if (str.equals("Europe/Kaliningrad")) {
                        String string72 = contextC.getString(R.string.europe_kaliningrad);
                        string72.getClass();
                        return string72;
                    }
                    break;
                case 1719899228:
                    if (str.equals("Asia/Kathmandu")) {
                        String string73 = contextC.getString(R.string.asia_kathmandu);
                        string73.getClass();
                        return string73;
                    }
                    break;
                case 1723007385:
                    if (str.equals("Etc/GMT+12")) {
                        String string74 = contextC.getString(R.string.etc_gmt_12);
                        string74.getClass();
                        return string74;
                    }
                    break;
                case 1755599521:
                    if (str.equals("Asia/Vladivostok")) {
                        String string75 = contextC.getString(R.string.asia_vladivostok);
                        string75.getClass();
                        return string75;
                    }
                    break;
                case 1816891481:
                    if (str.equals("Pacific/Pago_Pago")) {
                        String string76 = contextC.getString(R.string.pacific_pago_pago);
                        string76.getClass();
                        return string76;
                    }
                    break;
                case 1882983613:
                    if (str.equals("Pacific/Port_Moresby")) {
                        String string77 = contextC.getString(R.string.pacific_port_moresby);
                        string77.getClass();
                        return string77;
                    }
                    break;
                case 1926742832:
                    if (str.equals("Australia/Lord_Howe")) {
                        String string78 = contextC.getString(R.string.australia_lord_howe);
                        string78.getClass();
                        return string78;
                    }
                    break;
                case 1928594144:
                    if (str.equals("Pacific/Honolulu")) {
                        String string79 = contextC.getString(R.string.pacific_honolulu);
                        string79.getClass();
                        return string79;
                    }
                    break;
                case 2027385634:
                    if (str.equals("America/Argentina/Buenos_Aires")) {
                        String string80 = contextC.getString(R.string.america_argentina_buenos_aires);
                        string80.getClass();
                        return string80;
                    }
                    break;
                case 2039344942:
                    if (str.equals("America/Adak")) {
                        String string81 = contextC.getString(R.string.america_adak);
                        string81.getClass();
                        return string81;
                    }
                    break;
                case 2116473746:
                    if (str.equals("Pacific/Pitcairn")) {
                        String string82 = contextC.getString(R.string.pacific_pitcairn);
                        string82.getClass();
                        return string82;
                    }
                    break;
            }
            String string83 = contextC.getString(R.string.no_value);
            string83.getClass();
            return string83;
        }

        private a() {
        }
    }
}
