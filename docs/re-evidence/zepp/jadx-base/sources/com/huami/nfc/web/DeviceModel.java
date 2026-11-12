package com.huami.nfc.web;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:5\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>B\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u00015?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrs¨\u0006t"}, d2 = {"Lcom/huami/nfc/web/DeviceModel;", "", "", "a", "Ljava/lang/String;", "getModel", "()Ljava/lang/String;", "model", "<init>", "(Ljava/lang/String;)V", "Andes", "Bari", "Beats", "BeatsP", "Berlin", "Blanc", "BledPro", "Bonn", "ChongQing", "Cinco", "Como", "ComoLite", NfcDevice.DEVICE_MODEL_COMO_S, "Corsica", "DongtingLake", "EmptyModelDevice", "Everest2", "Falcon", "Florence", "Hamburg", "Hawk", "KESTREL", "KongMing", "KongMingPro", "L66", "Leiden", "Lille", "Lincs", "Lisbon", "London", "Madrid", "Ness", "Newton", "Onyx", "Osprey", "PanGu", "PoyangLake", "Prague", "Provence", "ProvenceW", "Qogir", "Sofia", "TLSCH", "TLSCL", "Teide", "Venice", "Verona", "Vienna", "Volga", "Wast", "Xihu", "XihuE", "Zurich", "Lcom/huami/nfc/web/DeviceModel$Verona;", "Lcom/huami/nfc/web/DeviceModel$Zurich;", "Lcom/huami/nfc/web/DeviceModel$Vienna;", "Lcom/huami/nfc/web/DeviceModel$Madrid;", "Lcom/huami/nfc/web/DeviceModel$Hamburg;", "Lcom/huami/nfc/web/DeviceModel$Bonn;", "Lcom/huami/nfc/web/DeviceModel$Volga;", "Lcom/huami/nfc/web/DeviceModel$London;", "Lcom/huami/nfc/web/DeviceModel$Prague;", "Lcom/huami/nfc/web/DeviceModel$Como;", "Lcom/huami/nfc/web/DeviceModel$ComoS;", "Lcom/huami/nfc/web/DeviceModel$ComoLite;", "Lcom/huami/nfc/web/DeviceModel$Blanc;", "Lcom/huami/nfc/web/DeviceModel$Lincs;", "Lcom/huami/nfc/web/DeviceModel$Ness;", "Lcom/huami/nfc/web/DeviceModel$Newton;", "Lcom/huami/nfc/web/DeviceModel$Osprey;", "Lcom/huami/nfc/web/DeviceModel$Lisbon;", "Lcom/huami/nfc/web/DeviceModel$Corsica;", "Lcom/huami/nfc/web/DeviceModel$PanGu;", "Lcom/huami/nfc/web/DeviceModel$KongMing;", "Lcom/huami/nfc/web/DeviceModel$KongMingPro;", "Lcom/huami/nfc/web/DeviceModel$L66;", "Lcom/huami/nfc/web/DeviceModel$Onyx;", "Lcom/huami/nfc/web/DeviceModel$ChongQing;", "Lcom/huami/nfc/web/DeviceModel$Cinco;", "Lcom/huami/nfc/web/DeviceModel$Beats;", "Lcom/huami/nfc/web/DeviceModel$BeatsP;", "Lcom/huami/nfc/web/DeviceModel$DongtingLake;", "Lcom/huami/nfc/web/DeviceModel$TLSCL;", "Lcom/huami/nfc/web/DeviceModel$TLSCH;", "Lcom/huami/nfc/web/DeviceModel$PoyangLake;", "Lcom/huami/nfc/web/DeviceModel$Falcon;", "Lcom/huami/nfc/web/DeviceModel$Hawk;", "Lcom/huami/nfc/web/DeviceModel$KESTREL;", "Lcom/huami/nfc/web/DeviceModel$Venice;", "Lcom/huami/nfc/web/DeviceModel$Qogir;", "Lcom/huami/nfc/web/DeviceModel$Xihu;", "Lcom/huami/nfc/web/DeviceModel$XihuE;", "Lcom/huami/nfc/web/DeviceModel$Everest2;", "Lcom/huami/nfc/web/DeviceModel$Sofia;", "Lcom/huami/nfc/web/DeviceModel$BledPro;", "Lcom/huami/nfc/web/DeviceModel$Andes;", "Lcom/huami/nfc/web/DeviceModel$Provence;", "Lcom/huami/nfc/web/DeviceModel$ProvenceW;", "Lcom/huami/nfc/web/DeviceModel$Teide;", "Lcom/huami/nfc/web/DeviceModel$Bari;", "Lcom/huami/nfc/web/DeviceModel$Leiden;", "Lcom/huami/nfc/web/DeviceModel$Lille;", "Lcom/huami/nfc/web/DeviceModel$Berlin;", "Lcom/huami/nfc/web/DeviceModel$Wast;", "Lcom/huami/nfc/web/DeviceModel$Florence;", "Lcom/huami/nfc/web/DeviceModel$EmptyModelDevice;", "web_release"}, k = 1, mv = {1, 5, 1})
public abstract class DeviceModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String model;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Andes;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Andes extends DeviceModel {

        @NotNull
        public static final Andes INSTANCE = new Andes();

        private Andes() {
            super(NfcDevice.DEVICE_MODEL_ANDES, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Bari;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Bari extends DeviceModel {

        @NotNull
        public static final Bari INSTANCE = new Bari();

        private Bari() {
            super(NfcDevice.DEVICE_MODEL_BARI, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Beats;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Beats extends DeviceModel {

        @NotNull
        public static final Beats INSTANCE = new Beats();

        private Beats() {
            super(NfcDevice.DEVICE_MODEL_BEATS, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$BeatsP;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class BeatsP extends DeviceModel {

        @NotNull
        public static final BeatsP INSTANCE = new BeatsP();

        private BeatsP() {
            super(NfcDevice.DEVICE_MODEL_BEATS_P, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Berlin;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Berlin extends DeviceModel {

        @NotNull
        public static final Berlin INSTANCE = new Berlin();

        private Berlin() {
            super(NfcDevice.DEVICE_MODEL_BERLIN, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Blanc;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Blanc extends DeviceModel {

        @NotNull
        public static final Blanc INSTANCE = new Blanc();

        private Blanc() {
            super(NfcDevice.DEVICE_MODEL_BLANC, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$BledPro;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class BledPro extends DeviceModel {

        @NotNull
        public static final BledPro INSTANCE = new BledPro();

        private BledPro() {
            super(NfcDevice.DEVICE_MODEL_BLED_PRO, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Bonn;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Bonn extends DeviceModel {

        @NotNull
        public static final Bonn INSTANCE = new Bonn();

        private Bonn() {
            super(NfcDevice.DEVICE_MODEL_BONN, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$ChongQing;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class ChongQing extends DeviceModel {

        @NotNull
        public static final ChongQing INSTANCE = new ChongQing();

        private ChongQing() {
            super(NfcDevice.DEVICE_MODEL_CHONG_QING, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Cinco;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Cinco extends DeviceModel {

        @NotNull
        public static final Cinco INSTANCE = new Cinco();

        private Cinco() {
            super(NfcDevice.DEVICE_MODEL_CINCO, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Como;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Como extends DeviceModel {

        @NotNull
        public static final Como INSTANCE = new Como();

        private Como() {
            super(NfcDevice.DEVICE_MODEL_COMO, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$ComoLite;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class ComoLite extends DeviceModel {

        @NotNull
        public static final ComoLite INSTANCE = new ComoLite();

        private ComoLite() {
            super(NfcDevice.DEVICE_MODEL_COMO_LITE, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$ComoS;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class ComoS extends DeviceModel {

        @NotNull
        public static final ComoS INSTANCE = new ComoS();

        private ComoS() {
            super(NfcDevice.DEVICE_MODEL_COMO_S, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Corsica;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Corsica extends DeviceModel {

        @NotNull
        public static final Corsica INSTANCE = new Corsica();

        private Corsica() {
            super(NfcDevice.DEVICE_MODEL_CORSICA, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$DongtingLake;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class DongtingLake extends DeviceModel {

        @NotNull
        public static final DongtingLake INSTANCE = new DongtingLake();

        private DongtingLake() {
            super(NfcDevice.DEVICE_MODEL_DONGTINGHU, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$EmptyModelDevice;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class EmptyModelDevice extends DeviceModel {

        @NotNull
        public static final EmptyModelDevice INSTANCE = new EmptyModelDevice();

        private EmptyModelDevice() {
            super("", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Everest2;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Everest2 extends DeviceModel {

        @NotNull
        public static final Everest2 INSTANCE = new Everest2();

        private Everest2() {
            super(NfcDevice.DEVICE_MODEL_EVEREST2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Falcon;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Falcon extends DeviceModel {

        @NotNull
        public static final Falcon INSTANCE = new Falcon();

        private Falcon() {
            super(NfcDevice.DEVICE_MODEL_FALCON, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Florence;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Florence extends DeviceModel {

        @NotNull
        public static final Florence INSTANCE = new Florence();

        private Florence() {
            super(NfcDevice.DEVICE_MODEL_FLORENCE, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Hamburg;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hamburg extends DeviceModel {

        @NotNull
        public static final Hamburg INSTANCE = new Hamburg();

        private Hamburg() {
            super(NfcDevice.DEVICE_MODEL_HAMBURG, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Hawk;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hawk extends DeviceModel {

        @NotNull
        public static final Hawk INSTANCE = new Hawk();

        private Hawk() {
            super(NfcDevice.DEVICE_MODEL_HAWK, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$KESTREL;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class KESTREL extends DeviceModel {

        @NotNull
        public static final KESTREL INSTANCE = new KESTREL();

        private KESTREL() {
            super(NfcDevice.DEVICE_MODEL_KESTREL, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$KongMing;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class KongMing extends DeviceModel {

        @NotNull
        public static final KongMing INSTANCE = new KongMing();

        private KongMing() {
            super(NfcDevice.DEVICE_MODEL_KONG_MING, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$KongMingPro;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class KongMingPro extends DeviceModel {

        @NotNull
        public static final KongMingPro INSTANCE = new KongMingPro();

        private KongMingPro() {
            super(NfcDevice.DEVICE_MODEL_KONG_MING_PRO, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$L66;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class L66 extends DeviceModel {

        @NotNull
        public static final L66 INSTANCE = new L66();

        private L66() {
            super(NfcDevice.DEVICE_MODEL_L66, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Leiden;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Leiden extends DeviceModel {

        @NotNull
        public static final Leiden INSTANCE = new Leiden();

        private Leiden() {
            super(NfcDevice.DEVICE_MODEL_LEIDEN, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Lille;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Lille extends DeviceModel {

        @NotNull
        public static final Lille INSTANCE = new Lille();

        private Lille() {
            super(NfcDevice.DEVICE_MODEL_LILLE, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Lincs;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Lincs extends DeviceModel {

        @NotNull
        public static final Lincs INSTANCE = new Lincs();

        private Lincs() {
            super(NfcDevice.DEVICE_MODEL_LINCS, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Lisbon;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Lisbon extends DeviceModel {

        @NotNull
        public static final Lisbon INSTANCE = new Lisbon();

        private Lisbon() {
            super(NfcDevice.DEVICE_MODEL_LISBON, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$London;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class London extends DeviceModel {

        @NotNull
        public static final London INSTANCE = new London();

        private London() {
            super(NfcDevice.DEVICE_MODEL_LONDON, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Madrid;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Madrid extends DeviceModel {

        @NotNull
        public static final Madrid INSTANCE = new Madrid();

        private Madrid() {
            super(NfcDevice.DEVICE_MODEL_MADRID, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Ness;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Ness extends DeviceModel {

        @NotNull
        public static final Ness INSTANCE = new Ness();

        private Ness() {
            super(NfcDevice.DEVICE_MODEL_NESS, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Newton;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Newton extends DeviceModel {

        @NotNull
        public static final Newton INSTANCE = new Newton();

        private Newton() {
            super(NfcDevice.DEVICE_MODEL_NEWTON, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Onyx;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Onyx extends DeviceModel {

        @NotNull
        public static final Onyx INSTANCE = new Onyx();

        private Onyx() {
            super(NfcDevice.DEVICE_MODEL_ONYX, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Osprey;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Osprey extends DeviceModel {

        @NotNull
        public static final Osprey INSTANCE = new Osprey();

        private Osprey() {
            super(NfcDevice.DEVICE_MODEL_OSPREY, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$PanGu;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class PanGu extends DeviceModel {

        @NotNull
        public static final PanGu INSTANCE = new PanGu();

        private PanGu() {
            super(NfcDevice.DEVICE_MODEL_PANGU, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$PoyangLake;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class PoyangLake extends DeviceModel {

        @NotNull
        public static final PoyangLake INSTANCE = new PoyangLake();

        private PoyangLake() {
            super(NfcDevice.DEVICE_MODEL_POYANGHU, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Prague;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Prague extends DeviceModel {

        @NotNull
        public static final Prague INSTANCE = new Prague();

        private Prague() {
            super(NfcDevice.DEVICE_MODEL_PRAGUE, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Provence;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Provence extends DeviceModel {

        @NotNull
        public static final Provence INSTANCE = new Provence();

        private Provence() {
            super(NfcDevice.DEVICE_MODEL_PROVENCE, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$ProvenceW;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class ProvenceW extends DeviceModel {

        @NotNull
        public static final ProvenceW INSTANCE = new ProvenceW();

        private ProvenceW() {
            super(NfcDevice.DEVICE_MODEL_PROVENCE_W, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Qogir;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Qogir extends DeviceModel {

        @NotNull
        public static final Qogir INSTANCE = new Qogir();

        private Qogir() {
            super(NfcDevice.DEVICE_MODEL_QOGIR, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Sofia;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sofia extends DeviceModel {

        @NotNull
        public static final Sofia INSTANCE = new Sofia();

        private Sofia() {
            super(NfcDevice.DEVICE_MODEL_SOFIA, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$TLSCH;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class TLSCH extends DeviceModel {

        @NotNull
        public static final TLSCH INSTANCE = new TLSCH();

        private TLSCH() {
            super(NfcDevice.DEVICE_MODEL_TLSCH, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$TLSCL;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class TLSCL extends DeviceModel {

        @NotNull
        public static final TLSCL INSTANCE = new TLSCL();

        private TLSCL() {
            super(NfcDevice.DEVICE_MODEL_TLSCL, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Teide;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Teide extends DeviceModel {

        @NotNull
        public static final Teide INSTANCE = new Teide();

        private Teide() {
            super(NfcDevice.DEVICE_MODEL_TEIDE, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Venice;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Venice extends DeviceModel {

        @NotNull
        public static final Venice INSTANCE = new Venice();

        private Venice() {
            super(NfcDevice.DEVICE_MODEL_VENICE, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Verona;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Verona extends DeviceModel {

        @NotNull
        public static final Verona INSTANCE = new Verona();

        private Verona() {
            super(NfcDevice.DEVICE_MODEL_VERONA, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Vienna;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Vienna extends DeviceModel {

        @NotNull
        public static final Vienna INSTANCE = new Vienna();

        private Vienna() {
            super(NfcDevice.DEVICE_MODEL_VIENNA, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Volga;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Volga extends DeviceModel {

        @NotNull
        public static final Volga INSTANCE = new Volga();

        private Volga() {
            super(NfcDevice.DEVICE_MODEL_VOLGA, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Wast;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Wast extends DeviceModel {

        @NotNull
        public static final Wast INSTANCE = new Wast();

        private Wast() {
            super(NfcDevice.DEVICE_MODEL_WAST, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Xihu;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Xihu extends DeviceModel {

        @NotNull
        public static final Xihu INSTANCE = new Xihu();

        private Xihu() {
            super(NfcDevice.DEVICE_MODEL_XIHU, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$XihuE;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class XihuE extends DeviceModel {

        @NotNull
        public static final XihuE INSTANCE = new XihuE();

        private XihuE() {
            super(NfcDevice.DEVICE_MODEL_XIHU_E, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/nfc/web/DeviceModel$Zurich;", "Lcom/huami/nfc/web/DeviceModel;", "<init>", "()V", "web_release"}, k = 1, mv = {1, 5, 1})
    public static final class Zurich extends DeviceModel {

        @NotNull
        public static final Zurich INSTANCE = new Zurich();

        private Zurich() {
            super(NfcDevice.DEVICE_MODEL_ZURICH, null);
        }
    }

    private DeviceModel(String str) {
        this.model = str;
    }

    public /* synthetic */ DeviceModel(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }
}
