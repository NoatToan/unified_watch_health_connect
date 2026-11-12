package com.google.typography.font.sfntly.table.core;

import com.amap.api.services.core.AMapException;
import com.autonavi.base.amap.mapcore.tools.GLMapStaticValue;
import com.google.typography.font.sfntly.Font;
import com.mibi.sdk.common.MibiSdkConstants;
import com.miui.tsmclient.service.DKFRequestService;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.heartrate.finger.CustomizedFingerprintAcquiredInfo;
import defpackage.apr;
import defpackage.jgj;
import defpackage.ono;
import defpackage.ylb;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class NameTable extends ono implements Iterable<c> {

    public enum MacintoshLanguageId {
        Unknown(-1),
        English(0),
        French(1),
        German(2),
        Italian(3),
        Dutch(4),
        Swedish(5),
        Spanish(6),
        Danish(7),
        Portuguese(8),
        Norwegian(9),
        Hebrew(10),
        Japanese(11),
        Arabic(12),
        Finnish(13),
        Greek(14),
        Icelandic(15),
        Maltese(16),
        Turkish(17),
        Croatian(18),
        Chinese_Traditional(19),
        Urdu(20),
        Hindi(21),
        Thai(22),
        Korean(23),
        Lithuanian(24),
        Polish(25),
        Hungarian(26),
        Estonian(27),
        Latvian(28),
        Sami(29),
        Faroese(30),
        FarsiPersian(31),
        Russian(32),
        Chinese_Simplified(33),
        Flemish(34),
        IrishGaelic(35),
        Albanian(36),
        Romanian(37),
        Czech(38),
        Slovak(39),
        Slovenian(40),
        Yiddish(41),
        Serbian(42),
        Macedonian(43),
        Bulgarian(44),
        Ukrainian(45),
        Byelorussian(46),
        Uzbek(47),
        Kazakh(48),
        Azerbaijani_Cyrillic(49),
        Azerbaijani_Arabic(50),
        Armenian(51),
        Georgian(52),
        Moldavian(53),
        Kirghiz(54),
        Tajiki(55),
        Turkmen(56),
        Mongolian_Mongolian(57),
        Mongolian_Cyrillic(58),
        Pashto(59),
        Kurdish(60),
        Kashmiri(61),
        Sindhi(62),
        Tibetan(63),
        Nepali(64),
        Sanskrit(65),
        Marathi(66),
        Bengali(67),
        Assamese(68),
        Gujarati(69),
        Punjabi(70),
        Oriya(71),
        Malayalam(72),
        Kannada(73),
        Tamil(74),
        Telugu(75),
        Sinhalese(76),
        Burmese(77),
        Khmer(78),
        Lao(79),
        Vietnamese(80),
        Indonesian(81),
        Tagalong(82),
        Malay_Roman(83),
        Malay_Arabic(84),
        Amharic(85),
        Tigrinya(86),
        Galla(87),
        Somali(88),
        Swahili(89),
        KinyarwandaRuanda(90),
        Rundi(91),
        NyanjaChewa(92),
        Malagasy(93),
        Esperanto(94),
        Welsh(128),
        Basque(129),
        Catalan(130),
        Latin(131),
        Quenchua(132),
        Guarani(133),
        Aymara(134),
        Tatar(135),
        Uighur(136),
        Dzongkha(137),
        Javanese_Roman(138),
        Sundanese_Roman(139),
        Galician(140),
        Afrikaans(141),
        Breton(142),
        Inuktitut(143),
        ScottishGaelic(144),
        ManxGaelic(145),
        IrishGaelic_WithDotAbove(146),
        Tongan(147),
        Greek_Polytonic(148),
        Greenlandic(149),
        Azerbaijani_Roman(150);

        private final int value;

        MacintoshLanguageId(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static MacintoshLanguageId valueOf(int i) {
            for (MacintoshLanguageId macintoshLanguageId : values()) {
                if (macintoshLanguageId.equals(i)) {
                    return macintoshLanguageId;
                }
            }
            return Unknown;
        }
    }

    public enum NameId {
        Unknown(-1),
        CopyrightNotice(0),
        FontFamilyName(1),
        FontSubfamilyName(2),
        UniqueFontIdentifier(3),
        FullFontName(4),
        VersionString(5),
        PostscriptName(6),
        Trademark(7),
        ManufacturerName(8),
        Designer(9),
        Description(10),
        VendorURL(11),
        DesignerURL(12),
        LicenseDescription(13),
        LicenseInfoURL(14),
        Reserved15(15),
        PreferredFamily(16),
        PreferredSubfamily(17),
        CompatibleFullName(18),
        SampleText(19),
        PostscriptCID(20),
        WWSFamilyName(21),
        WWSSubfamilyName(22);

        private final int value;

        NameId(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static NameId valueOf(int i) {
            for (NameId nameId : values()) {
                if (nameId.equals(i)) {
                    return nameId;
                }
            }
            return Unknown;
        }
    }

    public enum Offset {
        format(0),
        count(2),
        stringOffset(4),
        nameRecordStart(6),
        langTagCount(0),
        langTagRecord(2),
        nameRecordSize(12),
        nameRecordPlatformId(0),
        nameRecordEncodingId(2),
        nameRecordLanguageId(4),
        nameRecordNameId(6),
        nameRecordStringLength(8),
        nameRecordStringOffset(10);

        private final int offset;

        Offset(int i) {
            this.offset = i;
        }
    }

    public enum UnicodeLanguageId {
        Unknown(-1),
        All(0);

        private final int value;

        UnicodeLanguageId(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static UnicodeLanguageId valueOf(int i) {
            for (UnicodeLanguageId unicodeLanguageId : values()) {
                if (unicodeLanguageId.equals(i)) {
                    return unicodeLanguageId;
                }
            }
            return Unknown;
        }
    }

    public enum WindowsLanguageId {
        Unknown(-1),
        Afrikaans_SouthAfrica(1078),
        Albanian_Albania(1052),
        Alsatian_France(1156),
        Amharic_Ethiopia(1118),
        Arabic_Algeria(5121),
        Arabic_Bahrain(15361),
        Arabic_Egypt(3073),
        Arabic_Iraq(2049),
        Arabic_Jordan(11265),
        Arabic_Kuwait(13313),
        Arabic_Lebanon(12289),
        Arabic_Libya(DKFRequestService.s0),
        Arabic_Morocco(6145),
        Arabic_Oman(8193),
        Arabic_Qatar(16385),
        Arabic_SaudiArabia(1025),
        Arabic_Syria(10241),
        Arabic_Tunisia(7169),
        Arabic_UAE(14337),
        Arabic_Yemen(9217),
        Armenian_Armenia(1067),
        Assamese_India(AMapException.CODE_AMAP_ENGINE_RESPONSE_DATA_ERROR),
        Azeri_Cyrillic_Azerbaijan(2092),
        Azeri_Latin_Azerbaijan(1068),
        Bashkir_Russia(com.miui.tsmclient.model.mitsm.h.J),
        Basque_Basque(1069),
        Belarusian_Belarus(1059),
        Bengali_Bangladesh(2117),
        Bengali_India(1093),
        Bosnian_Cyrillic_BosniaAndHerzegovina(8218),
        Bosnian_Latin_BosniaAndHerzegovina(5146),
        Breton_France(1150),
        Bulgarian_Bulgaria(1026),
        Catalan_Catalan(1027),
        Chinese_HongKongSAR(3076),
        Chinese_MacaoSAR(5124),
        Chinese_PeoplesRepublicOfChina(2052),
        Chinese_Singapore(4100),
        Chinese_Taiwan(1028),
        Corsican_France(1155),
        Croatian_Croatia(1050),
        Croatian_Latin_BosniaAndHerzegovina(DKFRequestService.O0),
        Czech_CzechRepublic(1029),
        Danish_Denmark(1030),
        Dari_Afghanistan(1164),
        Divehi_Maldives(1125),
        Dutch_Belgium(2067),
        Dutch_Netherlands(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_TOO_DIM),
        English_Australia(3081),
        English_Belize(10249),
        English_Canada(DKFRequestService.z0),
        English_Caribbean(9225),
        English_India(16393),
        English_Ireland(6153),
        English_Jamaica(8201),
        English_Malaysia(17417),
        English_NewZealand(5129),
        English_RepublicOfThePhilippines(13321),
        English_Singapore(18441),
        English_SouthAfrica(7177),
        English_TrinidadAndTobago(11273),
        English_UnitedKingdom(2057),
        English_UnitedStates(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOW_BRIGHTNESS),
        English_Zimbabwe(12297),
        Estonian_Estonia(1061),
        Faroese_FaroeIslands(Constants.FHD_WIDTH),
        Filipino_Philippines(1124),
        Finnish_Finland(1035),
        French_Belgium(2060),
        French_Canada(3084),
        French_France(1036),
        French_Luxembourg(5132),
        French_PrincipalityOfMonoco(6156),
        French_Switzerland(DKFRequestService.C0),
        Frisian_Netherlands(1122),
        Galician_Galician(1110),
        Georgian_Georgia(1079),
        German_Austria(3079),
        German_Germany(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_ANTI_SPOOF),
        German_Liechtenstein(5127),
        German_Luxembourg(DKFRequestService.x0),
        German_Switzerland(GLMapStaticValue.MAP_PARAMETERNAME_POLYGON_FILL_CONTROL),
        Greek_Greece(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_DRY_FINGER),
        Greenlandic_Greenland(com.miui.tsmclient.model.mitsm.h.L),
        Gujarati_India(1095),
        Hausa_Latin_Nigeria(1128),
        Hebrew_Israel(1037),
        Hindi_India(1081),
        Hungarian_Hungary(1038),
        Icelandic_Iceland(1039),
        Igbo_Nigeria(1136),
        Indonesian_Indonesia(1057),
        Inuktitut_Canada(1117),
        Inuktitut_Latin_Canada(2141),
        Irish_Ireland(2108),
        isiXhosa_SouthAfrica(1076),
        isiZulu_SouthAfrica(1077),
        Italian_Italy(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_HBM_TOO_SLOW),
        Italian_Switzerland(2064),
        Japanese_Japan(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_SPI_COMMUNICATION),
        Kannada_India(1099),
        Kazakh_Kazakhstan(1087),
        Khmer_Cambodia(1107),
        Kiche_Guatemala(1158),
        Kinyarwanda_Rwanda(1159),
        Kiswahili_Kenya(1089),
        Konkani_India(CustomizedFingerprintAcquiredInfo.GF_ERROR_INVALID_STATE),
        Korean_Korea(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_WET_FINGER),
        Kyrgyz_Kyrgyzstan(1088),
        Lao_LaoPDR(1108),
        Latvian_Latvia(1062),
        Lithuanian_Lithuania(1063),
        LowerSorbian_Germany(2094),
        Luxembourgish_Luxembourg(com.miui.tsmclient.model.mitsm.h.K),
        Macedonian_FYROM_FormerYugoslavRepublicOfMacedonia(1071),
        Malay_BruneiDarussalam(2110),
        Malay_Malaysia(1086),
        Malayalam_India(1100),
        Maltese_Malta(1082),
        Maori_NewZealand(1153),
        Mapudungun_Chile(1146),
        Marathi_India(AMapException.CODE_AMAP_ENGINE_CONNECT_TIMEOUT),
        Mohawk_Mohawk(1148),
        Mongolian_Cyrillic_Mongolia(MibiSdkConstants.RESULT_CHECK_RISK_ERROR),
        Mongolian_Traditional_PeoplesRepublicOfChina(2128),
        Nepali_Nepal(1121),
        Norwegian_Bokmal_Norway(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_NOT_MATCH),
        Norwegian_Nynorsk_Norway(2068),
        Occitan_France(1154),
        Oriya_India(1096),
        Pashto_Afghanistan(1123),
        Polish_Poland(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_UI_DISAPPEAR),
        Portuguese_Brazil(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_SHOW_CIRCLE),
        Portuguese_Portugal(2070),
        Punjabi_India(1094),
        Quechua_Bolivia(1131),
        Quechua_Ecuador(2155),
        Quechua_Peru(3179),
        Romanian_Romania(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_INVALID_DATA),
        Romansh_Switzerland(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_ENROLL_ERROR),
        Russian_Russia(1049),
        Sami_Inari_Finland(9275),
        Sami_Lule_Norway(4155),
        Sami_Lule_Sweden(5179),
        Sami_Northern_Finland(3131),
        Sami_Northern_Norway(1083),
        Sami_Northern_Sweden(2107),
        Sami_Skolt_Finland(8251),
        Sami_Southern_Norway(6203),
        Sami_Southern_Sweden(7227),
        Sanskrit_India(AMapException.CODE_AMAP_ENGINE_RETURN_TIMEOUT),
        Serbian_Cyrillic_BosniaAndHerzegovina(7194),
        Serbian_Cyrillic_Serbia(3098),
        Serbian_Latin_BosniaAndHerzegovina(6170),
        Serbian_Latin_Serbia(2074),
        SesothoSaLeboa_SouthAfrica(1132),
        Setswana_SouthAfrica(1074),
        Sinhala_SriLanka(1115),
        Slovak_Slovakia(1051),
        Slovenian_Slovenia(1060),
        Spanish_Argentina(11274),
        Spanish_Bolivia(16394),
        Spanish_Chile(13322),
        Spanish_Colombia(9226),
        Spanish_CostaRica(5130),
        Spanish_DominicanRepublic(7178),
        Spanish_Ecuador(12298),
        Spanish_ElSalvador(17418),
        Spanish_Guatemala(DKFRequestService.A0),
        Spanish_Honduras(18442),
        Spanish_Mexico(2058),
        Spanish_Nicaragua(19466),
        Spanish_Panama(6154),
        Spanish_Paraguay(15370),
        Spanish_Peru(10250),
        Spanish_PuertoRico(20490),
        Spanish_ModernSort_Spain(3082),
        Spanish_TraditionalSort_Spain(CustomizedFingerprintAcquiredInfo.CUSTOMIZED_FINGERPRINT_ACQUIRED_LOGO),
        Spanish_UnitedStates(21514),
        Spanish_Uruguay(14346),
        Spanish_Venezuela(8202),
        Sweden_Finland(2077),
        Swedish_Sweden(1053),
        Syriac_Syria(1114),
        Tajik_Cyrillic_Tajikistan(1064),
        Tamazight_Latin_Algeria(2143),
        Tamil_India(1097),
        Tatar_Russia(1092),
        Telugu_India(1098),
        Thai_Thailand(1054),
        Tibetan_PRC(1105),
        Turkish_Turkey(1055),
        Turkmen_Turkmenistan(1090),
        Uighur_PRC(1152),
        Ukrainian_Ukraine(1058),
        UpperSorbian_Germany(1070),
        Urdu_IslamicRepublicOfPakistan(1056),
        Uzbek_Cyrillic_Uzbekistan(2115),
        Uzbek_Latin_Uzbekistan(1091),
        Vietnamese_Vietnam(1066),
        Welsh_UnitedKingdom(1106),
        Wolof_Senegal(1096),
        Yakut_Russia(1157),
        Yi_PRC(1144),
        Yoruba_Nigeria(com.miui.tsmclient.model.mitsm.h.I);

        private final int value;

        WindowsLanguageId(int i) {
            this.value = i;
        }

        public boolean equals(int i) {
            return i == this.value;
        }

        public int value() {
            return this.value;
        }

        public static WindowsLanguageId valueOf(int i) {
            for (WindowsLanguageId windowsLanguageId : values()) {
                if (windowsLanguageId.equals(i)) {
                    return windowsLanguageId;
                }
            }
            return Unknown;
        }
    }

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9812b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public a(int i, int i2, int i3, int i4) {
            this.f9811a = i;
            this.f9812b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // com.google.typography.font.sfntly.table.core.NameTable.e
        public boolean a(int i, int i2, int i3, int i4) {
            return i == this.f9811a && i2 == this.f9812b && i3 == this.c && i4 == this.d;
        }
    }

    public static class b extends ono.a<NameTable> {
        public Map<f, d> g;

        public b(ylb ylbVar, apr aprVar) {
            super(ylbVar, aprVar);
        }

        public static b w(ylb ylbVar, apr aprVar) {
            return new b(ylbVar, aprVar);
        }

        @Override // xz9.a
        public void p() {
            this.g = null;
            super.n(false);
        }

        @Override // xz9.a
        public int q() {
            Map<f, d> map = this.g;
            if (map == null || map.size() == 0) {
                return 0;
            }
            int size = Offset.nameRecordStart.offset + (this.g.size() * Offset.nameRecordSize.offset);
            Iterator<Map.Entry<f, d>> it = this.g.entrySet().iterator();
            while (it.hasNext()) {
                size += it.next().getValue().a().length;
            }
            return size;
        }

        @Override // xz9.a
        public boolean r() {
            Map<f, d> map = this.g;
            return (map == null || map.size() == 0) ? false : true;
        }

        @Override // xz9.a
        public int s(apr aprVar) {
            Offset offset = Offset.nameRecordStart;
            int size = offset.offset + (this.g.size() * Offset.nameRecordSize.offset);
            int iH = 0;
            aprVar.Q(Offset.format.offset, 0);
            aprVar.Q(Offset.count.offset, this.g.size());
            aprVar.Q(Offset.stringOffset.offset, size);
            int i = offset.offset;
            for (Map.Entry<f, d> entry : this.g.entrySet()) {
                aprVar.Q(Offset.nameRecordPlatformId.offset + i, entry.getKey().e());
                aprVar.Q(Offset.nameRecordEncodingId.offset + i, entry.getKey().b());
                aprVar.Q(Offset.nameRecordLanguageId.offset + i, entry.getKey().c());
                aprVar.Q(Offset.nameRecordNameId.offset + i, entry.getKey().d());
                aprVar.Q(Offset.nameRecordStringLength.offset + i, entry.getValue().a().length);
                aprVar.Q(Offset.nameRecordStringOffset.offset + i, iH);
                i += Offset.nameRecordSize.offset;
                if (entry.getValue().a().length > 0) {
                    iH += aprVar.H(iH + size, entry.getValue().a());
                }
            }
            return iH + size;
        }

        @Override // xz9.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public NameTable o(jgj jgjVar) {
            return new NameTable(u(), jgjVar, null);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f9813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f9814b;

        public c() {
        }

        public byte[] a() {
            return this.f9814b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f9813a.equals(cVar.f9813a) || this.f9814b.length != cVar.f9814b.length) {
                return false;
            }
            int i = 0;
            while (true) {
                byte[] bArr = this.f9814b;
                if (i >= bArr.length) {
                    return true;
                }
                if (bArr[i] != cVar.f9814b[i]) {
                    return false;
                }
                i++;
            }
        }

        public int hashCode() {
            int iHashCode = this.f9813a.hashCode();
            for (int i = 0; i < this.f9814b.length; i += 4) {
                for (int i2 = 0; i2 < 4; i2++) {
                    int i3 = i2 + i;
                    byte[] bArr = this.f9814b;
                    if (i3 >= bArr.length) {
                        break;
                    }
                    iHashCode |= bArr[i2] << (i2 * 8);
                }
            }
            return iHashCode;
        }

        public String toString() {
            return "[" + this.f9813a + ", \"\"]";
        }

        public c(f fVar, byte[] bArr) {
            this.f9813a = fVar;
            this.f9814b = bArr;
        }

        public c(int i, int i2, int i3, int i4, byte[] bArr) {
            this(new f(i, i2, i3, i4), bArr);
        }
    }

    public static class d extends c {
    }

    public interface e {
        boolean a(int i, int i2, int i3, int i4);
    }

    public static class f implements Comparable<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9816b;
        public int c;
        public int d;

        public f(int i, int i2, int i3, int i4) {
            this.f9815a = i;
            this.f9816b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            int i = this.f9815a;
            int i2 = fVar.f9815a;
            if (i != i2) {
                return i - i2;
            }
            int i3 = this.f9816b;
            int i4 = fVar.f9816b;
            if (i3 != i4) {
                return i3 - i4;
            }
            int i5 = this.c;
            int i6 = fVar.c;
            return i5 != i6 ? i5 - i6 : this.d - fVar.d;
        }

        public int b() {
            return this.f9816b;
        }

        public int c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public int e() {
            return this.f9815a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f9816b == fVar.f9816b && this.c == fVar.c && this.f9815a == fVar.f9815a && this.d == fVar.d;
        }

        public int hashCode() {
            return ((this.f9816b & 63) << 26) | ((this.d & 63) << 16) | ((this.f9815a & 15) << 12) | (this.c & 255);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("P=");
            sb.append(Font.PlatformId.valueOf(this.f9815a));
            sb.append(", E=0x");
            sb.append(Integer.toHexString(this.f9816b));
            sb.append(", L=0x");
            sb.append(Integer.toHexString(this.c));
            sb.append(", N=");
            if (NameId.valueOf(this.d) != null) {
                sb.append(NameId.valueOf(this.d));
            } else {
                sb.append("0x");
                sb.append(Integer.toHexString(this.d));
            }
            return sb.toString();
        }
    }

    public class g implements Iterator<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f9818b;

        public /* synthetic */ g(NameTable nameTable, a aVar) {
            this();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            NameTable nameTable = NameTable.this;
            int i = this.f9817a;
            this.f9817a = i + 1;
            return nameTable.u(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9818b == null) {
                return this.f9817a < NameTable.this.t();
            }
            while (this.f9817a < NameTable.this.t()) {
                if (this.f9818b.a(NameTable.this.B(this.f9817a), NameTable.this.l(this.f9817a), NameTable.this.o(this.f9817a), NameTable.this.w(this.f9817a))) {
                    return true;
                }
                this.f9817a++;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove a CMap table from an existing font.");
        }

        public /* synthetic */ g(NameTable nameTable, e eVar, a aVar) {
            this(eVar);
        }

        public g() {
            this.f9817a = 0;
            this.f9818b = null;
        }

        public g(e eVar) {
            this.f9817a = 0;
            this.f9818b = eVar;
        }
    }

    public /* synthetic */ NameTable(ylb ylbVar, jgj jgjVar, a aVar) {
        this(ylbVar, jgjVar);
    }

    public final int A(int i) {
        return Offset.nameRecordStart.offset + (i * Offset.nameRecordSize.offset);
    }

    public int B(int i) {
        return this.f39611a.v(Offset.nameRecordPlatformId.offset + A(i));
    }

    public final int C() {
        return this.f39611a.v(Offset.stringOffset.offset);
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return new g(this, (a) null);
    }

    public int l(int i) {
        return this.f39611a.v(Offset.nameRecordEncodingId.offset + A(i));
    }

    public Iterator<c> m(e eVar) {
        return new g(this, eVar, null);
    }

    public int o(int i) {
        return this.f39611a.v(Offset.nameRecordLanguageId.offset + A(i));
    }

    public byte[] q(int i) {
        int iX = x(i);
        byte[] bArr = new byte[iX];
        this.f39611a.n(z(i), bArr, 0, iX);
        return bArr;
    }

    public byte[] r(int i, int i2, int i3, int i4) {
        c cVarV = v(i, i2, i3, i4);
        if (cVarV != null) {
            return cVarV.a();
        }
        return null;
    }

    public int t() {
        return this.f39611a.v(Offset.count.offset);
    }

    public c u(int i) {
        return new c(B(i), l(i), o(i), w(i), q(i));
    }

    public c v(int i, int i2, int i3, int i4) {
        Iterator<c> itM = m(new a(i, i2, i3, i4));
        if (itM.hasNext()) {
            return itM.next();
        }
        return null;
    }

    public int w(int i) {
        return this.f39611a.v(Offset.nameRecordNameId.offset + A(i));
    }

    public final int x(int i) {
        return this.f39611a.v(Offset.nameRecordStringLength.offset + A(i));
    }

    public final int z(int i) {
        return this.f39611a.v(Offset.nameRecordStringOffset.offset + A(i)) + C();
    }

    public NameTable(ylb ylbVar, jgj jgjVar) {
        super(ylbVar, jgjVar);
    }
}
